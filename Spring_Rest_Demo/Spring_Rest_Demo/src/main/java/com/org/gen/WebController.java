package com.org.gen;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
	
	//RequestMapping maps the /sample endpoint to Sample function
	@RequestMapping("/sample")
	public SampleResponse Sample(@RequestParam(value="name",defaultValue="Robot")  String name) {
		//@RequestParam indicates that the endpoint /sample will have one query parameter called name.
		//The default value of name is "Robot"
		SampleResponse res=new SampleResponse();
		res.setId(100);
		res.setMessage("Your name is:"+name);
		return res;
	}
	
	//the code creates a new endpoint called as /test and maps it to Test function
	@RequestMapping(value="/test",method=RequestMethod.POST)
	public PostResponse Test(@RequestBody PostRequest input) {
//		@RequestBody PostRequest inputPayload indicates that the post 
//		request will have an input post body of type PostRequest. The input post body is stored in inputPayload Object.
		PostResponse res=new PostResponse();
		res.setId(input.getId());
		res.setMessage("Hello"+input.getName());
		res.setExtraInfo("Here we can post current news");
		return res;
	}

}
