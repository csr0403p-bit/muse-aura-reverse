package com.facebook.aura.nodes;

import X.AbstractC07127nr;
import X.AbstractC9777Gfy;
import X.AnonymousClass001;
import X.C1BN;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.nodes.transport.NodeConnectionState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.nodes.HatchNodeClient$proactiveConnectionGate$1$awaitConnected$2", f = "HatchNodeClient.kt", l = {270}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchNodeClient$proactiveConnectionGate$1$awaitConnected$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
    public final /* synthetic */ C1BN<NodeConnectionState> $states;
    public int label;

    @DebugMetadata(c = "com.facebook.aura.nodes.HatchNodeClient$proactiveConnectionGate$1$awaitConnected$2$1", f = "HatchNodeClient.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.nodes.HatchNodeClient$proactiveConnectionGate$1$awaitConnected$2$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<NodeConnectionState, HtJ<? super Boolean>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(htJ);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object obj2 = this.L$0;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return Boolean.valueOf(obj2 instanceof NodeConnectionState.Connected);
        }

        @Override // X.G0V
        public final Object invoke(NodeConnectionState nodeConnectionState, HtJ<? super Boolean> htJ) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(htJ);
            anonymousClass1.L$0 = nodeConnectionState;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchNodeClient$proactiveConnectionGate$1$awaitConnected$2(C1BN<? extends NodeConnectionState> c1bn, HtJ<? super HatchNodeClient$proactiveConnectionGate$1$awaitConnected$2> htJ) {
        super(2, htJ);
        this.$states = c1bn;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchNodeClient$proactiveConnectionGate$1$awaitConnected$2(this.$states, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C1BN<NodeConnectionState> c1bn = this.$states;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
            this.label = 1;
            if (AbstractC9777Gfy.A00(this, anonymousClass1, c1bn) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return true;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
        return new HatchNodeClient$proactiveConnectionGate$1$awaitConnected$2(this.$states, htJ).invokeSuspend(Unit.INSTANCE);
    }
}
