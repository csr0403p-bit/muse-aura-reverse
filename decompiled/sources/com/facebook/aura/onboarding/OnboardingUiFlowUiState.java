package com.facebook.aura.onboarding;

import X.AHD;
import X.AHI;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BQI;
import X.C06G;
import X.C06H;
import X.C0943AIw;
import X.C0KA;
import X.C3cG;
import X.C60Q;
import X.C7384Etj;
import X.C7BY;
import com.facebook.aura.utils.HatchUtils;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class OnboardingUiFlowUiState extends C06G {
    public final String agentName;
    public final OnboardingAvatarOption avatar;
    public final BQI<String> connectedConnectorIds;
    public final BQI<String> connectingConnectorIds;
    public final BQI<String> connectorPresentedIdeaIds;
    public final AHD<OnboardingTask> ideas;
    public final boolean isCompleted;
    public final boolean isIdentityResolved;
    public final boolean isLoadingIdeas;
    public final boolean isSubmitting;
    public final AHD<String> nameSuggestions;
    public final String selectedIdeaId;
    public final String sentMessageId;
    public final OnboardingUiFlowStep step;
    public final String userFirstName;

    public final OnboardingUiFlowUiState copy(OnboardingUiFlowStep onboardingUiFlowStep, String str, OnboardingAvatarOption onboardingAvatarOption, boolean z, String str2, AHD<String> ahd, AHD<OnboardingTask> ahd2, String str3, boolean z2, boolean z3, boolean z4, String str4, BQI<String> bqi, BQI<String> bqi2, BQI<String> bqi3) {
        AnonymousClass002.A1C(onboardingUiFlowStep, 0, str2);
        AnonymousClass003.A0z(ahd, ahd2);
        AnonymousClass003.A11(bqi, bqi2);
        C7384Etj.A0Y(bqi3, 14);
        return new OnboardingUiFlowUiState(onboardingUiFlowStep, str, onboardingAvatarOption, z, str2, ahd, ahd2, str3, z2, z3, z4, str4, bqi, bqi2, bqi3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OnboardingUiFlowUiState) {
                OnboardingUiFlowUiState onboardingUiFlowUiState = (OnboardingUiFlowUiState) obj;
                if (this.step != onboardingUiFlowUiState.step || !C7384Etj.areEqual(this.userFirstName, onboardingUiFlowUiState.userFirstName) || !C7384Etj.areEqual(this.avatar, onboardingUiFlowUiState.avatar) || this.isIdentityResolved != onboardingUiFlowUiState.isIdentityResolved || !C7384Etj.areEqual(this.agentName, onboardingUiFlowUiState.agentName) || !C7384Etj.areEqual(this.nameSuggestions, onboardingUiFlowUiState.nameSuggestions) || !C7384Etj.areEqual(this.ideas, onboardingUiFlowUiState.ideas) || !C7384Etj.areEqual(this.selectedIdeaId, onboardingUiFlowUiState.selectedIdeaId) || this.isLoadingIdeas != onboardingUiFlowUiState.isLoadingIdeas || this.isSubmitting != onboardingUiFlowUiState.isSubmitting || this.isCompleted != onboardingUiFlowUiState.isCompleted || !C7384Etj.areEqual(this.sentMessageId, onboardingUiFlowUiState.sentMessageId) || !C7384Etj.areEqual(this.connectedConnectorIds, onboardingUiFlowUiState.connectedConnectorIds) || !C7384Etj.areEqual(this.connectingConnectorIds, onboardingUiFlowUiState.connectingConnectorIds) || !C7384Etj.areEqual(this.connectorPresentedIdeaIds, onboardingUiFlowUiState.connectorPresentedIdeaIds)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ OnboardingUiFlowUiState(OnboardingUiFlowStep onboardingUiFlowStep, String str, OnboardingAvatarOption onboardingAvatarOption, boolean z, String str2, AHD ahd, AHD ahd2, String str3, boolean z2, boolean z3, boolean z4, String str4, BQI bqi, BQI bqi2, BQI bqi3, int i, C06H c06h) {
        this((i & 1) != 0 ? OnboardingUiFlowStep.NAME : onboardingUiFlowStep, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : onboardingAvatarOption, C3cG.A1K(i & 8, z), (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? AHI.A01 : ahd, (i & 64) != 0 ? AHI.A01 : ahd2, (i & 128) != 0 ? null : str3, C60Q.A1Q(i & 256, z2), C3cG.A1K(i & 512, z3), (i & 1024) == 0 ? z4 : false, (i & 2048) == 0 ? str4 : null, (i & 4096) != 0 ? C0943AIw.A03 : bqi, (i & 8192) != 0 ? C0943AIw.A03 : bqi2, (i & 16384) != 0 ? C0943AIw.A03 : bqi3);
    }

    public static /* synthetic */ OnboardingUiFlowUiState copy$default(OnboardingUiFlowUiState onboardingUiFlowUiState, OnboardingUiFlowStep onboardingUiFlowStep, String str, OnboardingAvatarOption onboardingAvatarOption, boolean z, String str2, AHD ahd, AHD ahd2, String str3, boolean z2, boolean z3, boolean z4, String str4, BQI bqi, BQI bqi2, BQI bqi3, int i, Object obj) {
        OnboardingAvatarOption onboardingAvatarOption2 = onboardingAvatarOption;
        boolean z5 = z;
        String str5 = str2;
        AHD ahd3 = ahd;
        AHD ahd4 = ahd2;
        String str6 = str3;
        boolean z6 = z2;
        boolean z7 = z3;
        boolean z8 = z4;
        String str7 = str4;
        BQI bqi4 = bqi;
        BQI bqi5 = bqi2;
        BQI bqi6 = bqi3;
        if ((i & 1) != 0) {
            onboardingUiFlowStep = onboardingUiFlowUiState.step;
        }
        if ((i & 2) != 0) {
            str = onboardingUiFlowUiState.userFirstName;
        }
        if ((i & 4) != 0) {
            onboardingAvatarOption2 = onboardingUiFlowUiState.avatar;
        }
        if ((i & 8) != 0) {
            z5 = onboardingUiFlowUiState.isIdentityResolved;
        }
        if ((i & 16) != 0) {
            str5 = onboardingUiFlowUiState.agentName;
        }
        if ((i & 32) != 0) {
            ahd3 = onboardingUiFlowUiState.nameSuggestions;
        }
        if ((i & 64) != 0) {
            ahd4 = onboardingUiFlowUiState.ideas;
        }
        if ((i & 128) != 0) {
            str6 = onboardingUiFlowUiState.selectedIdeaId;
        }
        if ((i & 256) != 0) {
            z6 = onboardingUiFlowUiState.isLoadingIdeas;
        }
        if ((i & 512) != 0) {
            z7 = onboardingUiFlowUiState.isSubmitting;
        }
        if ((i & 1024) != 0) {
            z8 = onboardingUiFlowUiState.isCompleted;
        }
        if ((i & 2048) != 0) {
            str7 = onboardingUiFlowUiState.sentMessageId;
        }
        if ((i & 4096) != 0) {
            bqi4 = onboardingUiFlowUiState.connectedConnectorIds;
        }
        if ((i & 8192) != 0) {
            bqi5 = onboardingUiFlowUiState.connectingConnectorIds;
        }
        if ((i & 16384) != 0) {
            bqi6 = onboardingUiFlowUiState.connectorPresentedIdeaIds;
        }
        return onboardingUiFlowUiState.copy(onboardingUiFlowStep, str, onboardingAvatarOption2, z5, str5, ahd3, ahd4, str6, z6, z7, z8, str7, bqi4, bqi5, bqi6);
    }

    public final OnboardingUiFlowStep component1() {
        return this.step;
    }

    public final boolean component10() {
        return this.isSubmitting;
    }

    public final boolean component11() {
        return this.isCompleted;
    }

    public final String component12() {
        return this.sentMessageId;
    }

    public final BQI<String> component13() {
        return this.connectedConnectorIds;
    }

    public final BQI<String> component14() {
        return this.connectingConnectorIds;
    }

    public final BQI<String> component15() {
        return this.connectorPresentedIdeaIds;
    }

    public final String component2() {
        return this.userFirstName;
    }

    public final OnboardingAvatarOption component3() {
        return this.avatar;
    }

    public final boolean component4() {
        return this.isIdentityResolved;
    }

    public final String component5() {
        return this.agentName;
    }

    public final AHD<String> component6() {
        return this.nameSuggestions;
    }

    public final AHD<OnboardingTask> component7() {
        return this.ideas;
    }

    public final String component8() {
        return this.selectedIdeaId;
    }

    public final boolean component9() {
        return this.isLoadingIdeas;
    }

    public final String getAgentName() {
        return this.agentName;
    }

    public final OnboardingAvatarOption getAvatar() {
        return this.avatar;
    }

    public final boolean getCanContinueFromName() {
        return !C7BY.A0j(this.agentName);
    }

    public final boolean getCanFinish() {
        return (this.selectedIdeaId == null || this.isSubmitting || this.isCompleted) ? false : true;
    }

    public final BQI<String> getConnectedConnectorIds() {
        return this.connectedConnectorIds;
    }

    public final BQI<String> getConnectingConnectorIds() {
        return this.connectingConnectorIds;
    }

    public final BQI<String> getConnectorPresentedIdeaIds() {
        return this.connectorPresentedIdeaIds;
    }

    public final AHD<OnboardingTask> getIdeas() {
        return this.ideas;
    }

    public final AHD<String> getNameSuggestions() {
        return this.nameSuggestions;
    }

    public final OnboardingTask getSelectedIdea() {
        Object next;
        Iterator it = this.ideas.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (C7384Etj.areEqual(((OnboardingTask) next).id, this.selectedIdeaId)) {
                break;
            }
        }
        return (OnboardingTask) next;
    }

    public final String getSelectedIdeaId() {
        return this.selectedIdeaId;
    }

    public final String getSentMessageId() {
        return this.sentMessageId;
    }

    public final OnboardingUiFlowStep getStep() {
        return this.step;
    }

    public final String getUserFirstName() {
        return this.userFirstName;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.connectorPresentedIdeaIds, AnonymousClass005.A0F(this.connectingConnectorIds, AnonymousClass005.A0F(this.connectedConnectorIds, (C0KA.A01(C0KA.A01(C0KA.A01((AnonymousClass005.A0F(this.ideas, AnonymousClass005.A0F(this.nameSuggestions, AnonymousClass005.A0I(this.agentName, C0KA.A01((((AnonymousClass005.A0E(this.step) + AnonymousClass006.A0G(this.userFirstName)) * 31) + AnonymousClass006.A0D(this.avatar)) * 31, this.isIdentityResolved)))) + AnonymousClass006.A0G(this.selectedIdeaId)) * 31, this.isLoadingIdeas), this.isSubmitting), this.isCompleted) + AnonymousClass005.A0H(this.sentMessageId)) * 31)));
    }

    public final boolean isCompleted() {
        return this.isCompleted;
    }

    public final boolean isIdentityResolved() {
        return this.isIdentityResolved;
    }

    public final boolean isLoadingIdeas() {
        return this.isLoadingIdeas;
    }

    public final boolean isSubmitting() {
        return this.isSubmitting;
    }

    public final String getPendingConnectorId() {
        String str;
        OnboardingTask selectedIdea = getSelectedIdea();
        if (selectedIdea == null || this.connectorPresentedIdeaIds.contains(selectedIdea.id) || (str = selectedIdea.connectorId) == null || this.connectedConnectorIds.contains(str) || !HatchUtils.INSTANCE.isAgentOnboardingConnectorStepEnabled()) {
            return null;
        }
        return str;
    }

    public final boolean isConnectingSelectedConnector() {
        String str;
        OnboardingTask selectedIdea = getSelectedIdea();
        return (selectedIdea == null || (str = selectedIdea.connectorId) == null || !this.connectingConnectorIds.contains(str)) ? false : true;
    }

    public String toString() {
        return super.toString();
    }

    public OnboardingUiFlowUiState(OnboardingUiFlowStep onboardingUiFlowStep, String str, OnboardingAvatarOption onboardingAvatarOption, boolean z, String str2, AHD<String> ahd, AHD<OnboardingTask> ahd2, String str3, boolean z2, boolean z3, boolean z4, String str4, BQI<String> bqi, BQI<String> bqi2, BQI<String> bqi3) {
        AnonymousClass002.A1C(onboardingUiFlowStep, 0, str2);
        AnonymousClass003.A0z(ahd, ahd2);
        AnonymousClass003.A11(bqi, bqi2);
        C7384Etj.A0Y(bqi3, 14);
        this.step = onboardingUiFlowStep;
        this.userFirstName = str;
        this.avatar = onboardingAvatarOption;
        this.isIdentityResolved = z;
        this.agentName = str2;
        this.nameSuggestions = ahd;
        this.ideas = ahd2;
        this.selectedIdeaId = str3;
        this.isLoadingIdeas = z2;
        this.isSubmitting = z3;
        this.isCompleted = z4;
        this.sentMessageId = str4;
        this.connectedConnectorIds = bqi;
        this.connectingConnectorIds = bqi2;
        this.connectorPresentedIdeaIds = bqi3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public OnboardingUiFlowUiState() {
        OnboardingUiFlowStep onboardingUiFlowStep = OnboardingUiFlowStep.NAME;
        AHI ahi = AHI.A01;
        C0943AIw c0943AIw = C0943AIw.A03;
        this(onboardingUiFlowStep, null, null, false, "", ahi, ahi, null, true, false, false, null, c0943AIw, c0943AIw, c0943AIw);
    }
}
