package com.facebook.aura.confidentialvm.view;

import X.C7438Evz;
import com.facebook.aura.confidentialvm.model.ConfidentialVmMigrationDoneViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final /* synthetic */ class ConfidentialVmMigrationDoneScreenKt$ConfidentialVmMigrationDoneScreen$3$1$1 extends C7438Evz implements Function0<Unit> {
    public ConfidentialVmMigrationDoneScreenKt$ConfidentialVmMigrationDoneScreen$3$1$1(Object obj) {
        super(0, obj, ConfidentialVmMigrationDoneViewModel.class, "onMenuClick", "onMenuClick()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((ConfidentialVmMigrationDoneViewModel) this.receiver).onMenuClick();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
