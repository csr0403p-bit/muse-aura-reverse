package com.facebook.aura.login.nativeflow;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import X.InterfaceC1497Ak4;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class NativeLoginCommonKt$imeLiftedPage$3$1 extends AbstractC7559F3s implements G0U<InterfaceC1497Ak4, Unit> {
    public final /* synthetic */ NativeLoginImeLift $lift;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC1497Ak4 interfaceC1497Ak4) {
        C7384Etj.A0Y(interfaceC1497Ak4, 0);
        this.$lift.contentCoordinates = interfaceC1497Ak4;
        this.$lift.measureAnchor$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_nativeflow();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginCommonKt$imeLiftedPage$3$1(NativeLoginImeLift nativeLoginImeLift) {
        super(1);
        this.$lift = nativeLoginImeLift;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC1497Ak4 interfaceC1497Ak4) {
        invoke2(interfaceC1497Ak4);
        return Unit.INSTANCE;
    }
}
