package com.facebook.aura.nodes.core;

import X.AbstractC7559F3s;
import X.C2nw;
import X.C7384Etj;
import X.C7qW;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class NodeCardEnvelopeKt$nodeCardEnvelope$1$3 extends AbstractC7559F3s implements G0U<C2nw, Unit> {
    public final /* synthetic */ G0U<C2nw, Unit> $data;
    public final /* synthetic */ String $sourceClientId;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2nw c2nw) {
        C7384Etj.A0Y(c2nw, 0);
        this.$data.invoke(c2nw);
        String str = this.$sourceClientId;
        if (str != null) {
            C7qW.A06("source_client_id", str, c2nw);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NodeCardEnvelopeKt$nodeCardEnvelope$1$3(G0U<? super C2nw, Unit> g0u, String str) {
        super(1);
        this.$data = g0u;
        this.$sourceClientId = str;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2nw c2nw) {
        invoke2(c2nw);
        return Unit.INSTANCE;
    }
}
