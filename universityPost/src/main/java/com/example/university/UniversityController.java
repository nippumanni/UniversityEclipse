package com.example.university;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.university.domain.Person;
import com.example.university.domain.Staff;
import com.example.university.domain.Student;
import com.example.university.repo.CourseRepository;
import com.example.university.repo.DepartmentRepository;
import com.example.university.repo.StaffRepository;
import com.example.university.repo.StudentRepository;






@RestController
public class UniversityController {

	@Autowired
	StudentRepository studentRepository;

	@Autowired
	StaffRepository staffRepository;

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	DepartmentRepository departmentRepository;
		
	@Autowired
	UniversityService universityService;
	
	
	    @GetMapping("/mmm")
	    public List<Student> kk()
	    {
	    	List<Student> xxxList = new ArrayList<Student>();
	    	boolean fullTime = true;
	    	xxxList.add(new Student(new Person("jane", "doe"), fullTime, 20));
	    	xxxList.add(new Student(new Person("john", "doe"), fullTime, 22));
	    	xxxList.add(new Student(new Person("mike", "smith"), fullTime, 18));
	    	xxxList.add(new Student(new Person("ally", "kim"), !fullTime, 19));
	    	
	    	
	    		return xxxList;
	    }
	    
	    @PostMapping("/saveFirst")
	    String saveEntry(  @RequestBody Name name )
	    {
	    	String ff ="";
	    	String returnName = "";
	    
	    	
	    	    		returnName = "bad";

	    			
	    	universityService.saveStaffForPostOne();
	    	return returnName;
	    }
	    
	    @GetMapping("/findFirst")
	    Staff retrieveEntry()
	    {
	    return 	universityService.findOne();
	    }
	    
	    @GetMapping("/findFirst/{a}")
	    Staff retrieveEntryA(@PathVariable int a, HttpServletResponse response)
	    {
	        response.addHeader("Baeldung-Example-Header", "Value-HttpServletResponse");
	    	int k = a;
	      //  return "Response with header using HttpServletResponse";
	    return 	universityService.findOne();
	    }
	    
	    @GetMapping("/double")
	    public ResponseEntity<String> doubleNumber(@RequestHeader("my-number") int myNumber) {
	        return new ResponseEntity<String>(String.format("%d * 2 = %d", 
	          myNumber, (myNumber * 2)), HttpStatus.OK);
	    }
	    @GetMapping("/response-entity-builder-with-http-headers")
	    public ResponseEntity<String> usingResponseEntityBuilderAndHttpHeaders() {
	        HttpHeaders responseHeaders = new HttpHeaders();
	        responseHeaders.set("Baeldung-Example-Header", 
	          "Value-ResponseEntityBuilderWithHttpHeaders");
	     
	        return ResponseEntity.ok()
	          .headers(responseHeaders)
	          .body("Response with header using ResponseEntity");
	    }
	    
	    
	    
	    @GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
		public void convertCurrency(@PathVariable String from, @PathVariable String to,
				@PathVariable BigDecimal quantity) {
	    
	    
	    }}
	    
	    /*
	    @GetMapping("/findAll")
	    Iterable<Staff> retrieveEntryAll()
	    {
	    return 	universityService.findAll();
	    }
	    
	    
	    	
	@Autowired
	private CurrencyExchangeServiceProxy proxy;

	@GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean convertCurrency(@PathVariable String from, @PathVariable String to,
			@PathVariable BigDecimal quantity) {

		// Feign - Problem 1
		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("from", from);
		uriVariables.put("to", to);

		ResponseEntity<CurrencyConversionBean> responseEntity = new RestTemplate().getForEntity(
				"http://localhost:8000/currency-exchange/from/{from}/to/{to}", CurrencyConversionBean.class,
				uriVariables);

		CurrencyConversionBean response = responseEntity.getBody();

		return new CurrencyConversionBean(response.getId(), from, to, response.getConversionMultiple(), quantity,
				quantity.multiply(response.getConversionMultiple()), response.getPort());
	}

	@GetMapping("/currency-converter-feign/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean convertCurrencyFeign(@PathVariable String from, @PathVariable String to,
			@PathVariable BigDecimal quantity) {

		CurrencyConversionBean response = proxy.retrieveExchangeValue(from, to);

		logger.info("{}", response);
		
		return new CurrencyConversionBean(response.getId(), from, to, response.getConversionMultiple(), quantity,
				quantity.multiply(response.getConversionMultiple()), response.getPort());
	}

}

	    */
	    
	

