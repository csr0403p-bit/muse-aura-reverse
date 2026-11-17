package com.facebook.aura.ageverification.intf;

import X.AHD;
import X.BFM;
import X.BRg;
import X.G0V;
import com.facebook.aura.user.provider.AgeCheckMethod;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public interface AgeVerificationIntegration {
    void ActivationAgeStep(boolean z, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, int i, Function0<Unit> function04, BRg bRg, BFM bfm, int i2);

    void AgeMethodList(AHD<? extends AgeCheckMethod> ahd, AHD<? extends AgeCheckMethod> ahd2, AgeCheckMethod ageCheckMethod, G0V<? super AgeCheckMethod, ? super Integer, Unit> g0v, G0V<? super AgeCheckMethod, ? super Integer, Unit> g0v2, boolean z, Function0<Unit> function0, BRg bRg, BFM bfm, int i);

    void clearCaptureFiles(String str);
}
