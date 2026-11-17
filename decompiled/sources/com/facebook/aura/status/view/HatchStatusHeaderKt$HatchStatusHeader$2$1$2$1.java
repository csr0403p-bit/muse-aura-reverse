package com.facebook.aura.status.view;

import X.AbstractC7559F3s;
import X.C98f;
import com.facebook.aura.analytics.waterfall.HatchNMEEntrypointLogger;
import com.facebook.aura.status.viewmodel.OutOfCreditsCta;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchStatusHeaderKt$HatchStatusHeader$2$1$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ OutOfCreditsCta $cta;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        new HatchNMEEntrypointLogger(null, 1, null).logImpression(C98f.A03, HatchStatusHeaderKt.entrypointViewerData(this.$cta));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchStatusHeaderKt$HatchStatusHeader$2$1$2$1(OutOfCreditsCta outOfCreditsCta) {
        super(0);
        this.$cta = outOfCreditsCta;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
