@RestController
public class CountryController {

    CountryService service = new CountryService();

    @GetMapping("/country")
    public Country getCountry() {
        return service.getCountry("IN");
    }

    @GetMapping("/countries/{code}")
    public Country getCountry(@PathVariable String code) {
        return service.getCountry(code);
    }
}