package com.vuforia.samples.UCRApplication.helpers.listener;

import com.vuforia.samples.UCRApplication.entities.Edificio;

/**
 * <h1> OnLookAtBuildingListener </h1>
 * <p>
 * Interface used to create a callback when the user points to a building
 * </p?>
 */
public interface OnLookAtBuildingListener {

    /**
     * Method called when the user starts looking to a building
     *
     * @param edificio
     */
    public void onStartLookingAtBuilding(Edificio edificio);

    /**
     * Method called when the user stops looking to a building
     *
     * @param edificio
     */
    public void onStopLookingAtBuilding(Edificio edificio);
}
