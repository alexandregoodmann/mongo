package goodmann.mongo.book;

import java.net.UnknownHostException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@Autowired
	private Service ser;

	@GetMapping
	public String books() throws UnknownHostException {
		System.out.println("-------------------->>>>>>>>>>>>> entrou");
		ser.connect();
		System.out.println("-------------------->>>>>>>>>>>>> connectou");
		return "books";
	}

}
