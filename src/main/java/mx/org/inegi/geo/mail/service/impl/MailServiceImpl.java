package mx.org.inegi.geo.mail.service.impl;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.stereotype.Service;

import mx.org.inegi.geo.mail.constants.CONSTANS;
import mx.org.inegi.geo.mail.model.MailRequest;
import mx.org.inegi.geo.mail.model.MailResponse;
import mx.org.inegi.geo.mail.service.MailService;

@Service
public class MailServiceImpl implements MailService {

	private static Properties mailServerProperties;
	private static Session getMailSession;
	private static MimeMessage generateMailMessage;

	public MailResponse sendMail(MailRequest mailRequest) {
		MailResponse mailResponse = new MailResponse();
		mailServerProperties = System.getProperties();
		mailServerProperties.put("mail.smtp.port", "587");
		mailServerProperties.put("mail.smtp.auth", "true");
		mailServerProperties.put("mail.smtp.starttls.enable", "true");
		getMailSession = Session.getDefaultInstance(mailServerProperties, null);
		generateMailMessage = new MimeMessage(getMailSession);
		try {
			for (String email : mailRequest.geteMails()) {
				generateMailMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(email));
			}
			// generateMailMessage.addRecipient(Message.RecipientType.CC, new
			// InternetAddress("elfervargas@hotmail.com"));
			generateMailMessage.setSubject(mailRequest.getSubject() + ": " + mailRequest.getProject());
			generateMailMessage.setContent(mailRequest.getBody(), "text/html; charset=utf-8");
			Transport transport = getMailSession.getTransport("smtp");
			transport.connect(CONSTANS.server, CONSTANS.email, CONSTANS.password);
			transport.sendMessage(generateMailMessage, generateMailMessage.getAllRecipients());

			transport.close();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			mailResponse.setStatus(false);
			mailResponse.setMessage("Error trying to send email");
		}
		return mailResponse;
	}
}