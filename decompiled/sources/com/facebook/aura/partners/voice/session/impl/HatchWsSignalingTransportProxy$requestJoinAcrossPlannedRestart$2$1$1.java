package com.facebook.aura.partners.voice.session.impl;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C27k;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.json.JsonElement;

@DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.HatchWsSignalingTransportProxy$requestJoinAcrossPlannedRestart$2$1$1", f = "HatchWsSignalingTransportProxy.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class HatchWsSignalingTransportProxy$requestJoinAcrossPlannedRestart$2$1$1 extends AbstractC07127nr implements G0V<JsonElement, HtJ<? super JsonElement>, Object> {
    public final /* synthetic */ C27k<Boolean> $outage;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchWsSignalingTransportProxy$requestJoinAcrossPlannedRestart$2$1$1(C27k<Boolean> c27k, HtJ<? super HatchWsSignalingTransportProxy$requestJoinAcrossPlannedRestart$2$1$1> htJ) {
        super(2, htJ);
        this.$outage = c27k;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        HatchWsSignalingTransportProxy$requestJoinAcrossPlannedRestart$2$1$1 hatchWsSignalingTransportProxy$requestJoinAcrossPlannedRestart$2$1$1 = new HatchWsSignalingTransportProxy$requestJoinAcrossPlannedRestart$2$1$1(this.$outage, htJ);
        hatchWsSignalingTransportProxy$requestJoinAcrossPlannedRestart$2$1$1.L$0 = obj;
        return hatchWsSignalingTransportProxy$requestJoinAcrossPlannedRestart$2$1$1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object obj2 = this.L$0;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        this.$outage.A5w(null);
        return obj2;
    }

    @Override // X.G0V
    public final Object invoke(JsonElement jsonElement, HtJ<? super JsonElement> htJ) {
        return ((HatchWsSignalingTransportProxy$requestJoinAcrossPlannedRestart$2$1$1) create(jsonElement, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
