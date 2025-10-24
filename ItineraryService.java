@Service
public class ItineraryService {
    @Autowired
    private ItineraryRepository itineraryRepository;

    public Itinerary saveItinerary(Itinerary itinerary) {
        return itineraryRepository.save(itinerary);
    }

    public List<Itinerary> getItinerariesByUserId(Long userId) {
        return itineraryRepository.findByUserId(userId);
    }
}
