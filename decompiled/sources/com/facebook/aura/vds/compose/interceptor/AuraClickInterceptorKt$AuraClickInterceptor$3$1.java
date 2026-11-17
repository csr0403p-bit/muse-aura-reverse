package com.facebook.aura.vds.compose.interceptor;

import X.AbstractC7559F3s;
import X.AkZ;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AuraClickInterceptorKt$AuraClickInterceptor$3$1 extends AbstractC7559F3s implements G0U<AkZ, Unit> {
    public final /* synthetic */ boolean $interceptOnClick;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AkZ akZ) {
        C7384Etj.A0Y(akZ, 0);
        akZ.Ad0(!this.$interceptOnClick);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraClickInterceptorKt$AuraClickInterceptor$3$1(boolean z) {
        super(1);
        this.$interceptOnClick = z;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AkZ akZ) {
        invoke2(akZ);
        return Unit.INSTANCE;
    }
}
