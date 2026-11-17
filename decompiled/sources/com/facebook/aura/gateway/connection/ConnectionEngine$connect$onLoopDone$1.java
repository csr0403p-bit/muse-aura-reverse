package com.facebook.aura.gateway.connection;

import X.AbstractC7559F3s;
import X.C3cG;
import X.G0U;
import X.InterfaceC10560Hsz;
import com.facebook.aura.gateway.connection.ConnectRequestResult;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final class ConnectionEngine$connect$onLoopDone$1 extends AbstractC7559F3s implements G0U<Throwable, Unit> {
    public final /* synthetic */ InterfaceC10560Hsz<ConnectRequestResult> $ack;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionEngine$connect$onLoopDone$1(InterfaceC10560Hsz<ConnectRequestResult> interfaceC10560Hsz) {
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
        C3cG.A1F(this.$ack, ConnectRequestResult.Rejected.INSTANCE);
    }
}
