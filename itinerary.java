@Entity
public class Itinerary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String destination;
    private String date;
    private String activities;
    private Long userId;
}
