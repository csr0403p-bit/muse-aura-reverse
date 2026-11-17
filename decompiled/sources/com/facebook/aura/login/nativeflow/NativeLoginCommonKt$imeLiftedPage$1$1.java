package com.facebook.aura.login.nativeflow;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.C2LD;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class NativeLoginCommonKt$imeLiftedPage$1$1 extends AbstractC7559F3s implements G0U<C2LD, Unit> {
    public final /* synthetic */ NativeLoginImeLift $lift;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2LD c2ld) {
        C7384Etj.A0Y(c2ld, 0);
        this.$lift.setPageTopInWindow$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_nativeflow(AnonymousClass002.A09(c2ld.A01()));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginCommonKt$imeLiftedPage$1$1(NativeLoginImeLift nativeLoginImeLift) {
        super(1);
        this.$lift = nativeLoginImeLift;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2LD c2ld) {
        invoke2(c2ld);
        return Unit.INSTANCE;
    }
}
