package com.facebook.aura.pairs;

import X.C7438Evz;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class SpaceCollaboratorsSheetKt$SpaceCollaboratorsSheet$2$1$1$1 extends C7438Evz implements Function0<Unit> {
    public SpaceCollaboratorsSheetKt$SpaceCollaboratorsSheet$2$1$1$1(Object obj) {
        super(0, obj, SpaceCollaboratorsViewModel.class, "retry", "retry()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((SpaceCollaboratorsViewModel) this.receiver).retry();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
