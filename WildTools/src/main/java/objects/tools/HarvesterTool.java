package xyz.wildseries.wildtools.api.objects.tools;

public interface HarvesterTool extends Tool {

    int getRadius();

    int getFarmlandRadius();

    void setFarmlandRadius(int farmlandRadius);

    String getActivationAction();

    void setActivationAction(String activateAction);

}
