package com.facebook.aura.skills.connect;

import X.C7438Evz;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class CustomConnectorAuthScreenKt$CustomConnectorAuthScreen$3$5$1 extends C7438Evz implements Function0<Unit> {
    public CustomConnectorAuthScreenKt$CustomConnectorAuthScreen$3$5$1(Object obj) {
        super(0, obj, CustomConnectorAuthViewModel.class, "onCancelClick", "onCancelClick()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((CustomConnectorAuthViewModel) this.receiver).onCancelClick();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
