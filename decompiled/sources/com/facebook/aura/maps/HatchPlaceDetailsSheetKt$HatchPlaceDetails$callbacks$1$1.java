package com.facebook.aura.maps;

import X.AbstractC7559F3s;
import X.C1BO;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchPlaceDetailsSheetKt$HatchPlaceDetails$callbacks$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C1BO<Function0<Unit>> $currentOnDismiss$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchPlaceDetailsSheetKt$HatchPlaceDetails$callbacks$1$1(C1BO<? extends Function0<Unit>> c1bo) {
        super(0);
        this.$currentOnDismiss$delegate = c1bo;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        C1BO.A0D(this.$currentOnDismiss$delegate);
    }
}
