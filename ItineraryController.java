@Controller
public class ItineraryController {
    @Autowired
    private ItineraryService itineraryService;

    @GetMapping("/itinerary")
    public String showItineraryForm() {
        return "itinerary";
    }

    @PostMapping("/itinerary")
    public String submitItinerary(@ModelAttribute Itinerary itinerary) {
        itineraryService.saveItinerary(itinerary);
        return "redirect:/itinerary";
    }
}
