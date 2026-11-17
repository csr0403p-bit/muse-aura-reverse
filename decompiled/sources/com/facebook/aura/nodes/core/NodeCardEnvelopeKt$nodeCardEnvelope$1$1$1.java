package com.facebook.aura.nodes.core;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.C7pd;
import X.G0U;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class NodeCardEnvelopeKt$nodeCardEnvelope$1$1$1 extends AbstractC7559F3s implements G0U<C7pd, Unit> {
    public final /* synthetic */ List<String> $clients;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C7pd c7pd) {
        C7384Etj.A0Y(c7pd, 0);
        Iterator<String> it = this.$clients.iterator();
        while (it.hasNext()) {
            C7pd.A03(it, c7pd);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NodeCardEnvelopeKt$nodeCardEnvelope$1$1$1(List<String> list) {
        super(1);
        this.$clients = list;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C7pd c7pd) {
        invoke2(c7pd);
        return Unit.INSTANCE;
    }
}
