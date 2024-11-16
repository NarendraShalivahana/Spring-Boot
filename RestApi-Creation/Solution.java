create a REST API in Spring Boot and map it to an endpoint.
@RestController
@RequestMapping("/api")
public class userController(){
    @GetMapping("/users")
    public List<String> getAllusers(){
        return Arrays.asList("Naren","Heman");
    }
}

handle query parameters and path variables
@GetMapping("/users/{id}")
public String getByUserId(@PathVariable("id") int id){
    return "user"+id;
}
