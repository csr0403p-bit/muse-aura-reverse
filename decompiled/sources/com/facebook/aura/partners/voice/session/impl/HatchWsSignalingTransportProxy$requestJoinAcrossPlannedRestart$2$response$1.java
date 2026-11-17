package com.facebook.aura.partners.voice.session.impl;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.json.JsonElement;

@DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.HatchWsSignalingTransportProxy$requestJoinAcrossPlannedRestart$2$response$1", f = "HatchWsSignalingTransportProxy.kt", l = {202}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class HatchWsSignalingTransportProxy$requestJoinAcrossPlannedRestart$2$response$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super JsonElement>, Object> {
    public final /* synthetic */ Function0<CallJoinParamsJson> $buildParams;
    public int label;
    public final /* synthetic */ HatchWsSignalingTransportProxy this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchWsSignalingTransportProxy$requestJoinAcrossPlannedRestart$2$response$1(HatchWsSignalingTransportProxy hatchWsSignalingTransportProxy, Function0<CallJoinParamsJson> function0, HtJ<? super HatchWsSignalingTransportProxy$requestJoinAcrossPlannedRestart$2$response$1> htJ) {
        super(2, htJ);
        this.this$0 = hatchWsSignalingTransportProxy;
        this.$buildParams = function0;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchWsSignalingTransportProxy$requestJoinAcrossPlannedRestart$2$response$1(this.this$0, this.$buildParams, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchWsSignalingTransportProxy hatchWsSignalingTransportProxy = this.this$0;
            CallJoinParamsJson callJoinParamsJsonInvoke = this.$buildParams.invoke();
            this.label = 1;
            obj = hatchWsSignalingTransportProxy.requestJoinOrNull(callJoinParamsJsonInvoke, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return obj;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super JsonElement> htJ) {
        return ((HatchWsSignalingTransportProxy$requestJoinAcrossPlannedRestart$2$response$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
