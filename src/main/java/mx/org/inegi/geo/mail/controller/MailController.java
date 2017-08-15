package mx.org.inegi.geo.mail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mx.org.inegi.geo.mail.model.MailRequest;
import mx.org.inegi.geo.mail.model.MailResponse;
import mx.org.inegi.geo.mail.service.MailBodyService;
import mx.org.inegi.geo.mail.service.MailService;

@RestController
public class MailController {
	@Autowired
	private MailService serviceMail;
	@Autowired
	private MailBodyService serviceBody;

	@RequestMapping(value = "/sending", method = RequestMethod.POST)
	public Object sendingMail(@RequestBody MailRequest mailRequest) {
		mailRequest.setBody(serviceBody.createBody(mailRequest));
		MailResponse mailResponse = serviceMail.sendMail(mailRequest);
		return mailResponse;
	}
}