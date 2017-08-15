package mx.org.inegi.geo.mail.service;

import org.springframework.stereotype.Service;

import mx.org.inegi.geo.mail.model.MailRequest;
import mx.org.inegi.geo.mail.model.MailResponse;

@Service
public interface MailService {
	public MailResponse sendMail(MailRequest mailRequest);
}