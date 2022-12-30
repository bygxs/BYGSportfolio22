package com.biniyam.bygsportfolio22;

public class Item {

    String projectName;
    String ProjectDate;
    int image;

    public Item(String projectName, String projectDate, int image) {
        this.projectName = projectName;
        ProjectDate = projectDate;
        this.image = image;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectDate() {
        return ProjectDate;
    }

    public void setProjectDate(String projectDate) {
        ProjectDate = projectDate;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
