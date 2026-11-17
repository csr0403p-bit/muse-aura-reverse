package com.facebook.aura.login.nativeflow;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.BL4;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class NativeLoginCommonKt$imePinnedAbove$1$1 extends AbstractC7559F3s implements G0U<BL4, Unit> {
    public final /* synthetic */ NativeLoginImeLift $lift;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginCommonKt$imePinnedAbove$1$1(NativeLoginImeLift nativeLoginImeLift) {
        super(1);
        this.$lift = nativeLoginImeLift;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(BL4 bl4) {
        m1289invokeozmzZPI(bl4.A00);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-ozmzZPI, reason: not valid java name */
    public final void m1289invokeozmzZPI(long j) {
        this.$lift.setPinnedAboveImeHeight$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_nativeflow(AnonymousClass002.A09(j));
    }
}
