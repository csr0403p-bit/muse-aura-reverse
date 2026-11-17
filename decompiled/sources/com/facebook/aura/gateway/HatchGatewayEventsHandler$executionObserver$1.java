package com.facebook.aura.gateway;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C1BN;
import X.C20Z;
import X.C3UX;
import X.C3cG;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.gateway.HatchGatewayEventsHandler$executionObserver$1", f = "HatchGatewayEventsHandler.kt", l = {313}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class HatchGatewayEventsHandler$executionObserver$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ HatchGatewayEventsHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchGatewayEventsHandler$executionObserver$1(HatchGatewayEventsHandler hatchGatewayEventsHandler, HtJ<? super HatchGatewayEventsHandler$executionObserver$1> htJ) {
        super(2, htJ);
        this.this$0 = hatchGatewayEventsHandler;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchGatewayEventsHandler$executionObserver$1(this.this$0, htJ);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return new HatchGatewayEventsHandler$executionObserver$1(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C1BN<Set<String>> c1bn = HatchAgentExecution.Companion.getInstance(this.this$0.userSession).activeConversations;
            final HatchGatewayEventsHandler hatchGatewayEventsHandler = this.this$0;
            C20Z<? super Set<String>> c20z = new C20Z() { // from class: com.facebook.aura.gateway.HatchGatewayEventsHandler$executionObserver$1.1
                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    hatchGatewayEventsHandler.resubscribeLiveSessions();
                    return Unit.INSTANCE;
                }

                public final Object emit(Set<String> set, HtJ<? super Unit> htJ) {
                    hatchGatewayEventsHandler.resubscribeLiveSessions();
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (c1bn.collect(c20z, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        throw C3cG.A0p();
    }
}
