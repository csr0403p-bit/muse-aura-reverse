package com.facebook.aura.gateway.service;

import X.AbstractC7559F3s;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class NodeCommandFallbackWorker$run$cancelledByApp$1 extends AbstractC7559F3s implements Function0<Boolean> {
    public final /* synthetic */ NodeCommandFallbackWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NodeCommandFallbackWorker$run$cancelledByApp$1(NodeCommandFallbackWorker nodeCommandFallbackWorker) {
        super(0);
        this.this$0 = nodeCommandFallbackWorker;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(this.this$0.getStopReason() == 1);
    }
}
