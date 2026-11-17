package com.facebook.aura.status.view;

import X.AbstractC7559F3s;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.status.viewmodel.OutOfCreditsCta;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchStatusHeaderKt$HatchStatusHeader$2$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ OutOfCreditsCta $cta;
    public final /* synthetic */ AuraNavigator $navigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchStatusHeaderKt$HatchStatusHeader$2$1$1$1(AuraNavigator auraNavigator, OutOfCreditsCta outOfCreditsCta) {
        super(0);
        this.$navigator = auraNavigator;
        this.$cta = outOfCreditsCta;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchStatusHeaderKt.launchOutOfCreditsUpgrade(this.$navigator, this.$cta);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
