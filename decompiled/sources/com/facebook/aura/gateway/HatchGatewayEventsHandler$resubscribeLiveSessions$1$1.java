package com.facebook.aura.gateway;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.settings.MC;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.gateway.HatchGatewayEventsHandler$resubscribeLiveSessions$1$1", f = "HatchGatewayEventsHandler.kt", l = {MC.mwa_help_and_support.__CONFIG__}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class HatchGatewayEventsHandler$resubscribeLiveSessions$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ String $sessionId;
    public int label;
    public final /* synthetic */ HatchGatewayEventsHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchGatewayEventsHandler$resubscribeLiveSessions$1$1(HatchGatewayEventsHandler hatchGatewayEventsHandler, String str, HtJ<? super HatchGatewayEventsHandler$resubscribeLiveSessions$1$1> htJ) {
        super(2, htJ);
        this.this$0 = hatchGatewayEventsHandler;
        this.$sessionId = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchGatewayEventsHandler$resubscribeLiveSessions$1$1(this.this$0, this.$sessionId, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchGatewayEventsHandler hatchGatewayEventsHandler = this.this$0;
            String str = this.$sessionId;
            C7384Etj.A0X(str);
            this.label = 1;
            if (hatchGatewayEventsHandler.sendSessionSubscribe(str, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchGatewayEventsHandler$resubscribeLiveSessions$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
