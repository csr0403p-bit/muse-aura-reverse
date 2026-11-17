package com.facebook.aura.widgets;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C6O2;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.widgets.AgentWidgetStore$editAll$2$1", f = "AgentWidgetStore.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class AgentWidgetStore$editAll$2$1 extends AbstractC07127nr implements G0V<C6O2, HtJ<? super Unit>, Object> {
    public final /* synthetic */ G0U<C6O2, Unit> $block;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AgentWidgetStore$editAll$2$1(G0U<? super C6O2, Unit> g0u, HtJ<? super AgentWidgetStore$editAll$2$1> htJ) {
        super(2, htJ);
        this.$block = g0u;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        AgentWidgetStore$editAll$2$1 agentWidgetStore$editAll$2$1 = new AgentWidgetStore$editAll$2$1(this.$block, htJ);
        agentWidgetStore$editAll$2$1.L$0 = obj;
        return agentWidgetStore$editAll$2$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object obj2 = this.L$0;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        this.$block.invoke(obj2);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C6O2 c6o2, HtJ<? super Unit> htJ) {
        return ((AgentWidgetStore$editAll$2$1) create(c6o2, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
