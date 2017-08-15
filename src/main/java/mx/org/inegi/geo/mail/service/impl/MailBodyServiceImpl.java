package mx.org.inegi.geo.mail.service.impl;

import org.springframework.stereotype.Service;

import mx.org.inegi.geo.mail.model.MailRequest;
import mx.org.inegi.geo.mail.service.MailBodyService;

@Service
public class MailBodyServiceImpl implements MailBodyService {

	public String createBody(MailRequest mailRequest) {
		String body = "";
		body = body + "<html>";
		body = body + "<head>";
		body = body + "<style>";
		body = body + "th {";
		body = body + "     font-size: 30px;";
		body = body + "     color:#1E467F;";
		body = body + "     font-family: Arial,Helvetica, sans-serif;";
		body = body + "}";
		body = body + "td {";
		body = body + "    padding: 1px;";
		body = body + "    text-align: left;";
		body = body + "    color:#1E467F;";
		body = body + "    font-size: 15px;";
		body = body + "    font-family: Arial,Helvetica, sans-serif;";
		body = body + "}";
		body = body + ".subtitle{";
		body = body + "    font-size: 17px;";
		body = body + "    text-align: left;";
		body = body + "    color:#1E467F;";
		body = body + "    font-weight: bold;";
		body = body + "    font-family: Arial,Helvetica, sans-serif;";
		body = body + "}";
		body = body + "p{";
		body = body + "    font-size: 14.5px;";
		body = body + "    font-family: Arial,Helvetica, sans-serif;";
		body = body + "}";
		body = body + "</style>";
		body = body + "</head>";
		body = body + "<body>";
		body = body + "<p>";
		body = body + "El INEGI te informa que " // + mailRequest.getName()
				+ " realizó una consulta en el Mapa Digital de México en línea en nuestro portal y desea compartirla contigo. ";
		body = body + "</p><br>";
		body = body + "<p>";
		body = body + " Puedes ver esta consulta en la siguiente url:<br>" // + mailRequest.getUrl();
		;
		body = body + "</p>";
		body = body + "<br><p>Para dudas o mayor información sobre Mapa Digital de México contáctanos.</p><br><br><br>";
		body = body + "<table style=\"width:100%\" border=0>";
		body = body + "  <tr>";
		body = body + "    <th colspan=\"3\" align=\"center\" >Conociendo México</th>";
		body = body + "  </tr>";
		body = body + "  <tr>";
		body = body + "<td colspan=\"2\" CLASS=\"subtitle\">Centro de Atención de Llamadas de INEGI</th>";
		body = body + "<td rowspan=\"6\">";
		body = body
				+ "  <img  src=\"http://imipmexicali.org.mx/images/enlaces/icono-inegi.png\" width=\"150\" height=\"100\"/>";
		body = body + "    </td>";
		body = body + "  </tr>";
		body = body + "  <tr>";
		body = body + "    <td colspan=\"2\">Nacional sin costo 01 800 111 4634</td>";
		body = body + "  </tr>";
		body = body + "  <tr>";
		body = body + "    <td colspan=\"2\">Internacional(código internacional)+(52)+(449) 910 53 00 Ext. 5301</td>";
		body = body + "  </tr>";
		body = body + "  <tr>";
		body = body + "    <td colspan=\"2\">";
		body = body + "       <a href=\"http://www.inegi.org.mx/default.aspx\">www.inegi.org.mx</a>";
		body = body + "    </td>";
		body = body + "  </tr> ";
		body = body + "  <tr>";
		body = body + "    <td colspan=\"2\">";
		body = body + "     <a href=\"mailto:atencion.usuarios@inegi.org.mx\">";
		body = body + "     Atención a Usuarios</a> ";
		body = body + "   </td>";
		body = body + "  </tr> ";
		body = body + "  <tr>";
		body = body + "    <td colspan=\"2\"> Síguenos en ";
		body = body + "      <a href=\"http://www.inegi.org.mx/inegi/contenidos/espanol/rss/rss.asp\">";
		body = body + "<img  src=\"http://gaia.inegi.org.mx/correo/rss.png\" width=\"20\" height=\"20\"/> </a>";
		body = body + "      <a href=\"http://twitter.com/inegi_informa\">";
		body = body + "<img  src=\"http://gaia.inegi.org.mx/correo/twitter.png\" width=\"20\" height=\"20\"/> </a>";
		body = body + "          <a href=\"http://www.facebook.com/pages/inegi-informa/180299958681029\">";
		body = body + "<img  src=\"http://www.rekola.cz/img/facebook_logo.png\"  width=\"20\" height=\"20\"/> </a>";
		body = body + "       <a href=\"http://www.inegi.org.mx/inegi/chat\">";
		body = body + "<img  src=\"http://gaia.inegi.org.mx/correo/contacto.png\" width=\"20\" height=\"20\"/>  </a>";
		body = body + "    </td>";
		body = body + "  </tr>";
		body = body + "</table>";
		body = body + "</body>";
		body = body + "</html>";
		return body;
	}

}
