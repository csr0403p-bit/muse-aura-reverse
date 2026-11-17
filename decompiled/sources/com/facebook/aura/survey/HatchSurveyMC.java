package com.facebook.aura.survey;

import X.AnonymousClass003;
import X.C31u;
import X.InterfaceC7359EnW;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.survey.MC;

/* loaded from: classes4.dex */
public final class HatchSurveyMC {
    public static final int $stable = 0;
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = AnonymousClass003.A1b(HatchSurveyMC.class, "isSurveyEnabled", "isSurveyEnabled()Z");
    public static final HatchSurveyMC INSTANCE = new HatchSurveyMC();
    public static final C31u isSurveyEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android.enable_surveys);

    public final boolean isSurveyEnabled() {
        return C31u.A01(this, isSurveyEnabled$delegate, $$delegatedProperties, 0);
    }
}
