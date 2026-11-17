package com.facebook.aura.login.nativeflow;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.G0V;
import kotlin.Unit;

/* renamed from: com.facebook.aura.login.nativeflow.ComposableSingletons$NativeLoginTwoFactorMethodScreenKt$lambda$-797993990$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$NativeLoginTwoFactorMethodScreenKt$lambda$797993990$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public static final ComposableSingletons$NativeLoginTwoFactorMethodScreenKt$lambda$797993990$1 INSTANCE = new ComposableSingletons$NativeLoginTwoFactorMethodScreenKt$lambda$797993990$1();

    public ComposableSingletons$NativeLoginTwoFactorMethodScreenKt$lambda$797993990$1() {
        super(2);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            NativeLoginCommonKt.m1279NativeLoginHeaderLogorAjV9yQ(null, 0.0f, bfm, 0, 3);
        } else {
            bfm.Afo();
        }
    }
}
