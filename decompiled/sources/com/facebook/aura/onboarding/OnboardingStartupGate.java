package com.facebook.aura.onboarding;

import X.AbstractC3358CGz;
import X.AnonymousClass005;
import X.BzK;
import X.C06H;
import X.C3cH;
import X.C4oT;
import X.C7384Etj;
import X.InterfaceC7549F2g;
import com.facebook.aura.common.prefs.AuraDevicePrefStore;
import com.facebook.aura.common.prefs.AuraPrefsKt;
import com.facebook.aura.common.prefs.AuraVMPrefStore;
import com.facebook.aura.common.prefs.AuraVMPrefs;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public final class OnboardingStartupGate implements InterfaceC7549F2g {
    public static final Companion Companion = new Companion();
    public final AbstractC3358CGz userSession;

    private final C4oT getCurrentVmPrefs() {
        return AuraVMPrefs.INSTANCE.get(C3cH.A0a(HatchGatewayPrefsStore.Companion, this.userSession), AuraVMPrefStore.ONBOARDING_STARTUP);
    }

    private final boolean isCompletedForVm(String str) {
        return AuraVMPrefs.INSTANCE.get(str, AuraVMPrefStore.ONBOARDING_STARTUP).getBoolean("completed", false);
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
    }

    public final OnboardingGateDecision gateDecision(String str) {
        if (str == null || str.length() == 0) {
            return OnboardingGateDecision.SHOWN_NO_VM_ID;
        }
        if (isCompletedForVm(str)) {
            return OnboardingGateDecision.SKIPPED;
        }
        Set<String> scopedIds = AuraPrefsKt.getScopedIds(AuraDevicePrefStore.VM_IDS);
        if (!(scopedIds instanceof Collection) || !scopedIds.isEmpty()) {
            Iterator<String> it = scopedIds.iterator();
            while (it.hasNext()) {
                String strA0j = AnonymousClass005.A0j(it);
                if (!str.equals(strA0j) && isCompletedForVm(strA0j)) {
                    return OnboardingGateDecision.SHOWN_COMPLETED_OTHER_VM;
                }
            }
        }
        return OnboardingGateDecision.SHOWN_NOT_COMPLETED;
    }

    public final class Companion {
        public final OnboardingStartupGate getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (OnboardingStartupGate) abstractC3358CGz.A03(OnboardingStartupGate.class, new OnboardingStartupGate$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public OnboardingStartupGate(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
    }

    public final boolean hasCompletedOnboarding() {
        return getCurrentVmPrefs().getBoolean("completed", false);
    }

    public final void setCompleted(boolean z) {
        BzK bzKA9q = getCurrentVmPrefs().A9q();
        bzKA9q.A0A("completed", z);
        bzKA9q.commit();
    }

    public /* synthetic */ OnboardingStartupGate(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
