package com.facebook.aura.skills.connect;

import X.AnonymousClass006;
import X.C7438Evz;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes.dex */
public final /* synthetic */ class CustomConnectorAuthScreenKt$CustomConnectorAuthScreen$3$3$1 extends C7438Evz implements G0U<String, Unit> {
    public CustomConnectorAuthScreenKt$CustomConnectorAuthScreen$3$3$1(Object obj) {
        super(1, obj, CustomConnectorAuthViewModel.class, "onClientSecretChanged", "onClientSecretChanged(Ljava/lang/String;)V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        ((CustomConnectorAuthViewModel) AnonymousClass006.A0o(str, this)).onClientSecretChanged(str);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
