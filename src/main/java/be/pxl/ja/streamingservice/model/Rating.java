package be.pxl.ja.streamingservice.model;

public enum Rating {
    LITTLE_KIDS,
    OLDER_KIDS(7),
    TEENS(12),
    MATURE(16);

    private int minimumAge;

    Rating(int minimumAge){
        this.minimumAge = minimumAge;
    }

    Rating(){}

    public int getLeeftijd() {
        return minimumAge;
    }
}
