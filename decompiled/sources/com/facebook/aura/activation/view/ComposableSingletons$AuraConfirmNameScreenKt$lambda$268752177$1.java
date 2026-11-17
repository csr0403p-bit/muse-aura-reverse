package com.facebook.aura.activation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.G0V;
import com.facebook.aura.login.nativeflow.NativeLoginCommonKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ComposableSingletons$AuraConfirmNameScreenKt$lambda$268752177$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public static final ComposableSingletons$AuraConfirmNameScreenKt$lambda$268752177$1 INSTANCE = new ComposableSingletons$AuraConfirmNameScreenKt$lambda$268752177$1();

    public ComposableSingletons$AuraConfirmNameScreenKt$lambda$268752177$1() {
        super(2);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            NativeLoginCommonKt.m1279NativeLoginHeaderLogorAjV9yQ(null, NativeLoginCommonKt.NATIVE_LOGIN_LOGO_SIZE, bfm, 0, 1);
        } else {
            bfm.Afo();
        }
    }
}
