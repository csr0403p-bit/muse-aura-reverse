package com.facebook.aura.skills.view;

import X.C7438Evz;
import com.facebook.aura.skills.viewmodel.HatchConnectorCategoryViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class HatchConnectorCategoryScreenKt$RemoteConnectorCatalogScreen$2$1$1 extends C7438Evz implements Function0<Unit> {
    public HatchConnectorCategoryScreenKt$RemoteConnectorCatalogScreen$2$1$1(Object obj) {
        super(0, obj, HatchConnectorCategoryViewModel.class, "refreshFromPull", "refreshFromPull()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((HatchConnectorCategoryViewModel) this.receiver).refreshFromPull();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
