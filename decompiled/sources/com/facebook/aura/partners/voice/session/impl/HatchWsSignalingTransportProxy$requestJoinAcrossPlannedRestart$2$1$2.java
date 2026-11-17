package com.facebook.aura.partners.voice.session.impl;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C27k;
import X.CFK;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.json.JsonElement;

@DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.HatchWsSignalingTransportProxy$requestJoinAcrossPlannedRestart$2$1$2", f = "HatchWsSignalingTransportProxy.kt", l = {212, 212}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class HatchWsSignalingTransportProxy$requestJoinAcrossPlannedRestart$2$1$2 extends AbstractC07127nr implements G0V<Boolean, HtJ<? super JsonElement>, Object> {
    public final /* synthetic */ Function0<CallJoinParamsJson> $buildParams;
    public final /* synthetic */ C27k<JsonElement> $response;
    public final /* synthetic */ HatchCallJoinContext.JoinSendContext $sendContext;
    public int label;
    public final /* synthetic */ HatchWsSignalingTransportProxy this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchWsSignalingTransportProxy$requestJoinAcrossPlannedRestart$2$1$2(C27k<? extends JsonElement> c27k, HatchWsSignalingTransportProxy hatchWsSignalingTransportProxy, HatchCallJoinContext.JoinSendContext joinSendContext, Function0<CallJoinParamsJson> function0, HtJ<? super HatchWsSignalingTransportProxy$requestJoinAcrossPlannedRestart$2$1$2> htJ) {
        super(2, htJ);
        this.$response = c27k;
        this.this$0 = hatchWsSignalingTransportProxy;
        this.$sendContext = joinSendContext;
        this.$buildParams = function0;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchWsSignalingTransportProxy$requestJoinAcrossPlannedRestart$2$1$2(this.$response, this.this$0, this.$sendContext, this.$buildParams, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            this.$response.A5w(null);
            CFK.A06(HatchWsSignalingTransportProxy.TAG, "media-to-Cosmos voice.calls.join lost to a planned restart; resending");
            HatchWsSignalingTransportProxy hatchWsSignalingTransportProxy = this.this$0;
            HatchCallJoinContext.JoinSendContext joinSendContext = this.$sendContext;
            this.label = 1;
            obj = hatchWsSignalingTransportProxy.isCurrentAfterPlannedRestart(joinSendContext, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    Hwg.A00(obj);
                }
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        if (!AnonymousClass001.A1X(obj)) {
            return null;
        }
        HatchWsSignalingTransportProxy hatchWsSignalingTransportProxy2 = this.this$0;
        CallJoinParamsJson callJoinParamsJsonInvoke = this.$buildParams.invoke();
        this.label = 2;
        obj = hatchWsSignalingTransportProxy2.requestJoinOrNull(callJoinParamsJsonInvoke, this);
        return obj == enumC10460Hji ? enumC10460Hji : obj;
    }

    public final Object invoke(boolean z, HtJ<? super JsonElement> htJ) {
        return ((HatchWsSignalingTransportProxy$requestJoinAcrossPlannedRestart$2$1$2) create(Boolean.valueOf(z), htJ)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, HtJ<? super JsonElement> htJ) {
        return invoke(AnonymousClass001.A1X(bool), htJ);
    }
}
