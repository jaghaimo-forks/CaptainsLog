package CaptainsLog.campaign.intel.button;

import com.fs.starfarer.api.ui.IntelUIAPI;
import com.fs.starfarer.api.ui.TooltipMakerAPI;

import CaptainsLog.campaign.intel.CustomMessageIntel;

public class ToggleCustom implements IntelButton {

    private final boolean showOnMap;
    private final CustomMessageIntel intel;

    public ToggleCustom(boolean showOnMap, CustomMessageIntel intel) {
        this.showOnMap = showOnMap;
        this.intel = intel;
    }

    @Override
    public void buttonPressCancelled(IntelUIAPI ui) {
    }

    @Override
    public void buttonPressConfirmed(IntelUIAPI ui) {
        intel.toggleShow();
        ui.recreateIntelUI();
    }

    @Override
    public void createConfirmationPrompt(TooltipMakerAPI tooltip) {
    }

    @Override
    public boolean doesButtonHaveConfirmDialog() {
        return false;
    }

    @Override
    public String getName() {
        return showOnMap ? "Hide On Map" : "Show On Map";
    }
}
