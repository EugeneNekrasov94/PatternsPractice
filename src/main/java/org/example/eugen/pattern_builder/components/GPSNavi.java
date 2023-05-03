package org.example.eugen.pattern_builder.components;

public class GPSNavi {
    private String route;
    public GPSNavi() {
        this.route = "221b, Baker Street, London  to Scotland Yard, 8-10 Broadway, London";
    }

    public GPSNavi(String manualRoute) {
        this.route = manualRoute;
    }

    public String getRoute() {
        return route;
    }
}
