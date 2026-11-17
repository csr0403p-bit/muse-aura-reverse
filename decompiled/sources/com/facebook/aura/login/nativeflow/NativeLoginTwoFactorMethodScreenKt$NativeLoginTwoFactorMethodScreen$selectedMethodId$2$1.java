package com.facebook.aura.login.nativeflow;

import X.AHD;
import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class NativeLoginTwoFactorMethodScreenKt$NativeLoginTwoFactorMethodScreen$selectedMethodId$2$1 extends AbstractC7559F3s implements Function0<MutableState<String>> {
    public final /* synthetic */ AHD<HatchTwoFactorMethod> $methods;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginTwoFactorMethodScreenKt$NativeLoginTwoFactorMethodScreen$selectedMethodId$2$1(AHD<HatchTwoFactorMethod> ahd) {
        super(0);
        this.$methods = ahd;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final MutableState<String> invoke() {
        HatchTwoFactorMethod hatchTwoFactorMethod = (HatchTwoFactorMethod) AbstractC0878AGe.A0G(this.$methods);
        return AnonymousClass002.A0P(hatchTwoFactorMethod != null ? hatchTwoFactorMethod.id : null);
    }
}
