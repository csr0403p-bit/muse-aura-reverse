package com.facebook.aura.notifications.push;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.CFK;
import X.EnumC10460Hji;
import X.FGI;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.gateway.HatchGatewayConnection;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.notifications.push.NotificationReplyService$sendReply$connected$1", f = "NotificationReplyService.kt", l = {104, 106}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class NotificationReplyService$sendReply$connected$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
    public final /* synthetic */ HatchGatewayConnection $gateway;
    public boolean Z$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationReplyService$sendReply$connected$1(HatchGatewayConnection hatchGatewayConnection, HtJ<? super NotificationReplyService$sendReply$connected$1> htJ) {
        super(2, htJ);
        this.$gateway = hatchGatewayConnection;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new NotificationReplyService$sendReply$connected$1(this.$gateway, htJ);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
        return new NotificationReplyService$sendReply$connected$1(this.$gateway, htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        boolean zIsConnected;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            CFK.A04(NotificationReplyService.TAG, FGI.A0M("Reconnection failed: ", e2.getMessage()));
            zIsConnected = false;
        }
        if (i == 0) {
            Hwg.A00(obj);
            HatchGatewayConnection hatchGatewayConnection = this.$gateway;
            this.label = 1;
            obj = hatchGatewayConnection.fetchAndConnect(true, false, null, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                zIsConnected = this.$gateway.isConnected();
                return Boolean.valueOf(zIsConnected);
            }
            Hwg.A00(obj);
        }
        boolean zA1X = AnonymousClass001.A1X(obj);
        if (zA1X || this.$gateway.isConnected()) {
            HatchGatewayConnection hatchGatewayConnection2 = this.$gateway;
            this.Z$0 = zA1X;
            this.label = 2;
            if (hatchGatewayConnection2.awaitConnected(this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        }
        zIsConnected = this.$gateway.isConnected();
        return Boolean.valueOf(zIsConnected);
    }
}
