package com.facebook.aura.spaces.share;

import X.C7438Evz;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class HatchPublishSpaceSheetKt$HatchPublishSpaceSheet$3$2$1 extends C7438Evz implements Function0<Unit> {
    public HatchPublishSpaceSheetKt$HatchPublishSpaceSheet$3$2$1(Object obj) {
        super(0, obj, HatchPublishSpaceViewModel.class, "publishSpace", "publishSpace()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((HatchPublishSpaceViewModel) this.receiver).publishSpace();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
