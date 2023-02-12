package models;

import java.util.Map;

public class Estimation {
    private String id;
    private String grade;
    private Map<Task,Double> taskCosts;
    private boolean isAccepted;
}
