package com.facebook.aura.nodes.datasource;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C60N;
import X.CFK;
import X.EnumC10460Hji;
import X.FGI;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.graphql.AuraGraphQLQueryExecutor;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.nodes.datasource.BroadcastReceiverHost$start$rcv$1$onReceive$1", f = "HatchProactiveTriggerManager.kt", l = {AuraGraphQLQueryExecutor.API_EC_PARAM_ACCESS_TOKEN}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class BroadcastReceiverHost$start$rcv$1$onReceive$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ BroadcastReceiverHost this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastReceiverHost$start$rcv$1$onReceive$1(BroadcastReceiverHost broadcastReceiverHost, HtJ<? super BroadcastReceiverHost$start$rcv$1$onReceive$1> htJ) {
        super(2, htJ);
        this.this$0 = broadcastReceiverHost;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new BroadcastReceiverHost$start$rcv$1$onReceive$1(this.this$0, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        try {
            if (i == 0) {
                Hwg.A00(obj);
                G0U<HtJ<? super Unit>, Object> g0u = this.this$0.onReceive;
                this.label = 1;
                if (g0u.invoke(this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
        } catch (Exception e) {
            CFK.A0A(C60N.A00(49), FGI.A0M("BroadcastReceiver onReceive handler failed: ", e.getMessage()), e);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return new BroadcastReceiverHost$start$rcv$1$onReceive$1(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
    }
}
