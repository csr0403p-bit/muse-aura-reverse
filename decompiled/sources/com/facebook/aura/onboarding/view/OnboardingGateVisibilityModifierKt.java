package com.facebook.aura.onboarding.view;

import X.AHD;
import X.AbstractC3358CGz;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass007;
import X.BFM;
import X.BPc;
import X.BRg;
import X.C1BO;
import X.C3cG;
import X.C78N;
import X.EnumC10573Huf;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchAppEventLogger;
import com.facebook.aura.analytics.hatch.HatchAppEventLoggingContext;
import com.facebook.aura.analytics.hatch.HatchEventType;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavKeyKt;
import com.facebook.aura.onboarding.OnboardingGateUiState;
import com.facebook.aura.overlay.api.OverlayApi;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class OnboardingGateVisibilityModifierKt {
    public static final BRg onboardingGateErrorVisibility(BRg bRg, OnboardingGateUiState onboardingGateUiState, BFM bfm, int i) {
        AnonymousClass004.A1b(bRg, onboardingGateUiState);
        bfm.AgE(-1651772344);
        AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
        boolean zA65 = bfm.A65(abstractC3358CGzA0h);
        Object objAaT = bfm.AaT();
        if (zA65 || objAaT == C78N.A00) {
            objAaT = OverlayApi.Companion.getInstance(abstractC3358CGzA0h);
            bfm.Ai0(objAaT);
        }
        List list = (List) C1BO.A07(bfm, ((OverlayApi) objAaT).activeOverlays);
        boolean z = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (AuraNavKeyKt.isBlockingOverlay((AuraNavKey) it.next())) {
                    z = true;
                    break;
                }
            }
        }
        boolean zA63 = bfm.A63(onboardingGateUiState.attemptNumber);
        Object objAaT2 = bfm.AaT();
        if (zA63 || objAaT2 == C78N.A00) {
            objAaT2 = HatchAppEventLogger.INSTANCE.captureContext();
            bfm.Ai0(objAaT2);
        }
        HatchAppEventLoggingContext hatchAppEventLoggingContext = (HatchAppEventLoggingContext) objAaT2;
        if (!onboardingGateUiState.isError || z) {
            AnonymousClass001.A1D(bfm);
            return bRg;
        }
        boolean zA1M = AnonymousClass003.A1M(bfm, onboardingGateUiState, hatchAppEventLoggingContext);
        Object objAaT3 = bfm.AaT();
        if (zA1M || objAaT3 == C78N.A00) {
            objAaT3 = new OnboardingGateVisibilityModifierKt$onboardingGateErrorVisibility$1$1(onboardingGateUiState, hatchAppEventLoggingContext);
            bfm.Ai0(objAaT3);
        }
        BRg bRgA00 = BPc.A00(bRg, EnumC10573Huf.A06, (G0U) objAaT3, 0.0f, 0L);
        AnonymousClass001.A1D(bfm);
        return bRgA00;
    }

    public static final void onboardingGateErrorVisibility$log(OnboardingGateUiState onboardingGateUiState, HatchAppEventLoggingContext hatchAppEventLoggingContext, boolean z) {
        HatchAppEventLogger.INSTANCE.logEvent("onboarding_gate_error_visibility", HatchSurface.ONBOARDING.getValue(), HatchSubsurface.ONBOARDING_POST_AUTH.getValue(), HatchEventType.STATUS_CHECK.getValue(), AnonymousClass000.A00(51), AnonymousClass007.A0d(HatchMetadataKey.IS_SHOWING.getValue(), String.valueOf(z), C3cG.A0r(HatchMetadataKey.ATTEMPT_NUMBER.getValue(), String.valueOf(onboardingGateUiState.attemptNumber))), hatchAppEventLoggingContext);
    }

    public static final AHD<AuraNavKey> onboardingGateErrorVisibility$lambda$1(C1BO<? extends AHD<? extends AuraNavKey>> c1bo) {
        return (AHD) c1bo.getValue();
    }
}
