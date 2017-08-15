package mx.org.inegi.geo.mail.service;

import org.springframework.stereotype.Service;

import mx.org.inegi.geo.mail.model.MailRequest;

@Service
public interface MailBodyService {
	public String createBody(MailRequest mailRequest);
}
