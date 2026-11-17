package com.facebook.aura.ccv.nativeflow.ui;

import X.C7438Evz;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final /* synthetic */ class HatchCcvCardEntryHostKt$HatchCcvCardEntryHost$16$1 extends C7438Evz implements Function0<Unit> {
    public HatchCcvCardEntryHostKt$HatchCcvCardEntryHost$16$1(Object obj) {
        super(0, obj, HatchAgeLinkingViewModel.class, "onErrorDismissed", "onErrorDismissed()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((HatchAgeLinkingViewModel) this.receiver).onErrorDismissed();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
