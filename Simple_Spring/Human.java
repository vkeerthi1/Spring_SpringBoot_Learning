package Spring;

public class Human {
    //add default constru ans xml context-annotationConfig
    @Autowired
    public Human(Heart heart) {
        this.heart = heart;
    }

    public Human() {
    }

    private Heart heart;

    public void setHeart(Heart heart) {
        this.heart = heart;
    }

    public void StartPumping() {
        if (heart != null) {
            heart.pump();
        } else {
            System.out.println("Dead");
        }
    }
}

