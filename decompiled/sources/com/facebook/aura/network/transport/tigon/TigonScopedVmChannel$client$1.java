package com.facebook.aura.network.transport.tigon;

import X.AbstractC7559F3s;
import X.DCW;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class TigonScopedVmChannel$client$1 extends AbstractC7559F3s implements Function0<DCW> {
    public final /* synthetic */ TigonScopedVmChannel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TigonScopedVmChannel$client$1(TigonScopedVmChannel tigonScopedVmChannel) {
        super(0);
        this.this$0 = tigonScopedVmChannel;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final DCW invoke() {
        return this.this$0.resources.tigonHttpClient;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ DCW invoke() {
        return this.this$0.resources.tigonHttpClient;
    }
}
