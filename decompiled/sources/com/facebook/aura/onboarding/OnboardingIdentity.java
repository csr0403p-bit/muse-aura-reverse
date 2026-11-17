package com.facebook.aura.onboarding;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes3.dex */
public final class OnboardingIdentity extends C06G {
    public final String agentName;
    public final List<String> assistantNames;
    public final List<OnboardingAvatarOption> avatars;
    public final List<OnboardingPersonality> personalities;
    public final String selectedPersonalityId;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OnboardingIdentity) {
                OnboardingIdentity onboardingIdentity = (OnboardingIdentity) obj;
                if (!C7384Etj.areEqual(this.agentName, onboardingIdentity.agentName) || !C7384Etj.areEqual(this.assistantNames, onboardingIdentity.assistantNames) || !C7384Etj.areEqual(this.personalities, onboardingIdentity.personalities) || !C7384Etj.areEqual(this.selectedPersonalityId, onboardingIdentity.selectedPersonalityId) || !C7384Etj.areEqual(this.avatars, onboardingIdentity.avatars)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OnboardingIdentity copy$default(OnboardingIdentity onboardingIdentity, String str, List list, List list2, String str2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onboardingIdentity.agentName;
        }
        if ((i & 2) != 0) {
            list = onboardingIdentity.assistantNames;
        }
        if ((i & 4) != 0) {
            list2 = onboardingIdentity.personalities;
        }
        if ((i & 8) != 0) {
            str2 = onboardingIdentity.selectedPersonalityId;
        }
        if ((i & 16) != 0) {
            list3 = onboardingIdentity.avatars;
        }
        return onboardingIdentity.copy(str, list, list2, str2, list3);
    }

    public final String component1() {
        return this.agentName;
    }

    public final List<String> component2() {
        return this.assistantNames;
    }

    public final List<OnboardingPersonality> component3() {
        return this.personalities;
    }

    public final String component4() {
        return this.selectedPersonalityId;
    }

    public final List<OnboardingAvatarOption> component5() {
        return this.avatars;
    }

    public final String getAgentName() {
        return this.agentName;
    }

    public final List<String> getAssistantNames() {
        return this.assistantNames;
    }

    public final List<OnboardingAvatarOption> getAvatars() {
        return this.avatars;
    }

    public final List<OnboardingPersonality> getPersonalities() {
        return this.personalities;
    }

    public final String getSelectedPersonalityId() {
        return this.selectedPersonalityId;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.avatars, AnonymousClass005.A0I(this.selectedPersonalityId, AnonymousClass005.A0F(this.personalities, AnonymousClass005.A0F(this.assistantNames, AnonymousClass001.A0G(this.agentName)))));
    }

    public OnboardingIdentity(String str, List<String> list, List<OnboardingPersonality> list2, String str2, List<OnboardingAvatarOption> list3) {
        AnonymousClass005.A17(str, list, list2, str2, list3);
        this.agentName = str;
        this.assistantNames = list;
        this.personalities = list2;
        this.selectedPersonalityId = str2;
        this.avatars = list3;
    }

    public final OnboardingIdentity copy(String str, List<String> list, List<OnboardingPersonality> list2, String str2, List<OnboardingAvatarOption> list3) {
        AnonymousClass005.A17(str, list, list2, str2, list3);
        return new OnboardingIdentity(str, list, list2, str2, list3);
    }

    public String toString() {
        return super.toString();
    }
}
