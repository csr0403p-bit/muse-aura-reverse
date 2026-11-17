package com.facebook.aura.conversation.viewmodel;

import X.C3cG;
import X.C7384Etj;
import com.facebook.aura.R;
import com.facebook.aura.uicontrol.UiAction;
import com.facebook.aura.uicontrol.UiSuggestionLabel;

/* loaded from: classes6.dex */
public final class HatchSuggestionLabels {
    public static final int $stable = 0;
    public static final HatchSuggestionLabels INSTANCE = new HatchSuggestionLabels();

    /* loaded from: classes.dex */
    public final class LabelResources {
        public static final int $stable = 0;
        public final int label;
        public final int verb;

        public final int getLabel() {
            return this.label;
        }

        public final int getVerb() {
            return this.verb;
        }

        public LabelResources(int i, int i2) {
            this.label = i;
            this.verb = i2;
        }
    }

    public final LabelResources resources(UiAction uiAction) {
        int i;
        int i2;
        C7384Etj.A0Y(uiAction, 0);
        if (uiAction.equals(UiAction.NavigateThreadCreate.INSTANCE)) {
            i = R.string._name_removed__res_0x7f120bd2;
        } else if (uiAction instanceof UiAction.NavigateChatSession) {
            i = R.string._name_removed__res_0x7f120bd6;
        } else if (uiAction instanceof UiAction.NavigateChat) {
            i = R.string._name_removed__res_0x7f120bd8;
        } else if (uiAction instanceof UiAction.NavigateThreadSearch) {
            i = R.string._name_removed__res_0x7f120bd7;
        } else if (uiAction instanceof UiAction.NavigateLibrary) {
            i = R.string._name_removed__res_0x7f120be0;
        } else if (uiAction instanceof UiAction.NavigateArtifacts) {
            i = R.string._name_removed__res_0x7f120bea;
        } else if (uiAction instanceof UiAction.NavigateMedia) {
            i = R.string._name_removed__res_0x7f120be2;
        } else if (uiAction instanceof UiAction.NavigateExplore) {
            i = R.string._name_removed__res_0x7f120bd9;
        } else if (uiAction instanceof UiAction.NavigateFeed) {
            i = R.string._name_removed__res_0x7f120bda;
        } else if (uiAction instanceof UiAction.NavigateFeedUnit) {
            i = R.string._name_removed__res_0x7f120bdb;
        } else if (uiAction instanceof UiAction.NavigateGoals) {
            i = R.string._name_removed__res_0x7f120bdd;
        } else if (uiAction instanceof UiAction.NavigateInviteFriends) {
            i = R.string._name_removed__res_0x7f120bd1;
        } else if (uiAction instanceof UiAction.NavigateHomeLinkOrder) {
            i = R.string._name_removed__res_0x7f120bcf;
        } else if (uiAction instanceof UiAction.NavigateSettings) {
            i = R.string._name_removed__res_0x7f120be8;
        } else if (uiAction instanceof UiAction.NavigateProfile) {
            i = R.string._name_removed__res_0x7f120be5;
        } else if (uiAction instanceof UiAction.NavigateActivityLog) {
            i = R.string._name_removed__res_0x7f120bd4;
        } else if (uiAction instanceof UiAction.NavigateScheduledTasks) {
            i = R.string._name_removed__res_0x7f120be7;
        } else if (uiAction instanceof UiAction.NavigateSettingsIdentity) {
            i = R.string._name_removed__res_0x7f120bdf;
        } else if (uiAction instanceof UiAction.NavigateActivityItem) {
            i = R.string._name_removed__res_0x7f120bd3;
        } else if (uiAction instanceof UiAction.NavigateScheduledTask) {
            i = R.string._name_removed__res_0x7f120be6;
        } else if ((uiAction instanceof UiAction.NavigateSpace) || (uiAction instanceof UiAction.NavigateSpaceTab)) {
            i = R.string._name_removed__res_0x7f120beb;
        } else if (uiAction instanceof UiAction.NavigateMemory) {
            i = R.string._name_removed__res_0x7f120be3;
        } else if (uiAction instanceof UiAction.NavigateMemoryItem) {
            i = R.string._name_removed__res_0x7f120be4;
        } else {
            if (!(uiAction instanceof UiAction.NavigateLibraryItem)) {
                if (uiAction.equals(UiAction.NavigateBack.INSTANCE)) {
                    return null;
                }
                if (uiAction instanceof UiAction.SetChatTheme) {
                    i = R.string._name_removed__res_0x7f120bce;
                    i2 = R.string._name_removed__res_0x7f120bec;
                } else {
                    if (!(uiAction instanceof UiAction.Contributed)) {
                        throw C3cG.A0q();
                    }
                    UiSuggestionLabel suggestionLabel = ((UiAction.Contributed) uiAction).action.getSuggestionLabel();
                    if (suggestionLabel == null) {
                        return null;
                    }
                    i = suggestionLabel.label;
                    i2 = suggestionLabel.verb;
                }
                return new LabelResources(i, i2);
            }
            i = R.string._name_removed__res_0x7f120be1;
        }
        i2 = R.string._name_removed__res_0x7f120bee;
        return new LabelResources(i, i2);
    }

    private final LabelResources open(int i) {
        return new LabelResources(i, R.string._name_removed__res_0x7f120bee);
    }
}
