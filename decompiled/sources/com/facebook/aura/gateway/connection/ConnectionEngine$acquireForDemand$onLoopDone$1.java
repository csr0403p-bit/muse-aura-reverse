package com.facebook.aura.gateway.connection;

import X.AbstractC7559F3s;
import X.C3cG;
import X.G0U;
import X.InterfaceC10560Hsz;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final class ConnectionEngine$acquireForDemand$onLoopDone$1 extends AbstractC7559F3s implements G0U<Throwable, Unit> {
    public final /* synthetic */ InterfaceC10560Hsz<ConnectionDemandOutcome> $ack;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionEngine$acquireForDemand$onLoopDone$1(InterfaceC10560Hsz<ConnectionDemandOutcome> interfaceC10560Hsz) {
        super(1);
        this.$ack = interfaceC10560Hsz;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        C3cG.A1F(this.$ack, ConnectionDemandOutcome.UNAVAILABLE);
    }
}
