package com.facebook.aura.utils;

import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C31u;
import X.C7354EnR;
import X.C7384Etj;
import X.InterfaceC7359EnW;
import com.facebook.aura.confidentialvm.session.ConfidentialSessionGate;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.utils.MC;

/* loaded from: classes.dex */
public final class HatchUtils {
    public static final int $stable = 0;
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = {new C7354EnR(HatchUtils.class, "inviteButtonTooltipSecs", "getInviteButtonTooltipSecs()I", 0), new C7354EnR(HatchUtils.class, "emailDeleteEnabled", "getEmailDeleteEnabled()Z", 0), new C7354EnR(HatchUtils.class, "ideaColorIconEnabled", "getIdeaColorIconEnabled()Z", 0), new C7354EnR(HatchUtils.class, "freshningStateEnabled", "getFreshningStateEnabled()Z", 0), new C7354EnR(HatchUtils.class, "tabSortingEnabled", "getTabSortingEnabled()Z", 0), new C7354EnR(HatchUtils.class, "sidePanelSpacesEnabled", "getSidePanelSpacesEnabled()Z", 0), new C7354EnR(HatchUtils.class, "agentOnboardingConnectorStepEnabled", "getAgentOnboardingConnectorStepEnabled()Z", 0), new C7354EnR(HatchUtils.class, "cardTokenAutoSendEnabled", "getCardTokenAutoSendEnabled()Z", 0)};
    public static final HatchUtils INSTANCE = new HatchUtils();
    public static final C31u inviteButtonTooltipSecs$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigInt(MC.hatch_gtm.invite_button_tooltip_secs);
    public static final C31u emailDeleteEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_activity_screen.delete_email_enabled);
    public static final C31u ideaColorIconEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android.color_idea_icons_enabled);
    public static final C31u freshningStateEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android.freshning_state_enabled);
    public static final C31u tabSortingEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_side_panel.tab_sorting_enabled);
    public static final C31u sidePanelSpacesEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_side_panel.spaces_enabled);
    public static final C31u agentOnboardingConnectorStepEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android_onboarding_abra.agent_onboarding_connector_step_enabled);
    public static final C31u cardTokenAutoSendEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_gtm.card_token_auto_send_enabled);

    public final boolean hidesSpaceSharingWithPeople(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        return ConfidentialSessionGate.Companion.getInstance(abstractC3358CGz).getShouldHideUnsupportedCvmFeatures();
    }

    public final boolean isEmailEnabled(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        return ConfidentialSessionGate.Companion.getInstance(abstractC3358CGz).isStandardVm() && MuseMailAvailability.Companion.getInstance(abstractC3358CGz).isEnabled();
    }

    private final boolean getAgentOnboardingConnectorStepEnabled() {
        return C31u.A01(this, agentOnboardingConnectorStepEnabled$delegate, $$delegatedProperties, 6);
    }

    private final boolean getCardTokenAutoSendEnabled() {
        return C31u.A01(this, cardTokenAutoSendEnabled$delegate, $$delegatedProperties, 7);
    }

    private final boolean getEmailDeleteEnabled() {
        return C31u.A01(this, emailDeleteEnabled$delegate, $$delegatedProperties, 1);
    }

    private final boolean getFreshningStateEnabled() {
        return C31u.A01(this, freshningStateEnabled$delegate, $$delegatedProperties, 3);
    }

    private final boolean getIdeaColorIconEnabled() {
        return C31u.A01(this, ideaColorIconEnabled$delegate, $$delegatedProperties, 2);
    }

    private final int getInviteButtonTooltipSecs() {
        return AnonymousClass001.A0F(inviteButtonTooltipSecs$delegate.getValue(this, $$delegatedProperties[0]));
    }

    private final boolean getSidePanelSpacesEnabled() {
        return C31u.A01(this, sidePanelSpacesEnabled$delegate, $$delegatedProperties, 5);
    }

    private final boolean getTabSortingEnabled() {
        return C31u.A01(this, tabSortingEnabled$delegate, $$delegatedProperties, 4);
    }

    public final boolean isSpacesMultiplayerEnabled() {
        return HatchUtil.INSTANCE.isConnectionsTabEnabled();
    }

    public final int getInviteButtonToolTipSecs() {
        return getInviteButtonTooltipSecs();
    }

    public final boolean isAgentOnboardingConnectorStepEnabled() {
        return getAgentOnboardingConnectorStepEnabled();
    }

    public final boolean isCardTokenAutoSendEnabled() {
        return getCardTokenAutoSendEnabled();
    }

    public final boolean isEmailDeleteEnabled() {
        return getEmailDeleteEnabled();
    }

    public final boolean isFreshningStateEnabled() {
        return getFreshningStateEnabled();
    }

    public final boolean isIdeaColorIconEnabled() {
        return getIdeaColorIconEnabled();
    }

    public final boolean isSidePanelSpacesEnabled() {
        return getSidePanelSpacesEnabled();
    }

    public final boolean isTabSortingEnabled() {
        return getSidePanelSpacesEnabled() || getTabSortingEnabled();
    }
}
