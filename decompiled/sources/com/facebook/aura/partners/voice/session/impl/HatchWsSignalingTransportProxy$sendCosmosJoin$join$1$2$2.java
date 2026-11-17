package com.facebook.aura.partners.voice.session.impl;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.partners.voice.api.CallMediaType;
import com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext;
import com.facebook.rsys.transport.gen.SignalingMessage;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.json.JsonElement;

@DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.HatchWsSignalingTransportProxy$sendCosmosJoin$join$1$2$2", f = "HatchWsSignalingTransportProxy.kt", l = {122}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class HatchWsSignalingTransportProxy$sendCosmosJoin$join$1$2$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super JsonElement>, Object> {
    public final /* synthetic */ CallMediaType $callMediaType;
    public final /* synthetic */ SignalingMessage $message;
    public final /* synthetic */ HatchCallJoinContext.JoinSendContext $sendContext;
    public final /* synthetic */ HatchWsSignalingTransportProxy $this_run;
    public int label;

    /* renamed from: com.facebook.aura.partners.voice.session.impl.HatchWsSignalingTransportProxy$sendCosmosJoin$join$1$2$2$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<CallJoinParamsJson> {
        public final /* synthetic */ CallMediaType $callMediaType;
        public final /* synthetic */ SignalingMessage $message;
        public final /* synthetic */ HatchCallJoinContext.JoinSendContext $sendContext;
        public final /* synthetic */ HatchWsSignalingTransportProxy $this_run;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchWsSignalingTransportProxy hatchWsSignalingTransportProxy, SignalingMessage signalingMessage, HatchCallJoinContext.JoinSendContext joinSendContext, CallMediaType callMediaType) {
            super(0);
            this.$this_run = hatchWsSignalingTransportProxy;
            this.$message = signalingMessage;
            this.$sendContext = joinSendContext;
            this.$callMediaType = callMediaType;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CallJoinParamsJson invoke() {
            return this.$this_run.buildJoinParams(this.$message, this.$sendContext, this.$callMediaType);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchWsSignalingTransportProxy$sendCosmosJoin$join$1$2$2(HatchWsSignalingTransportProxy hatchWsSignalingTransportProxy, HatchCallJoinContext.JoinSendContext joinSendContext, SignalingMessage signalingMessage, CallMediaType callMediaType, HtJ<? super HatchWsSignalingTransportProxy$sendCosmosJoin$join$1$2$2> htJ) {
        super(2, htJ);
        this.$this_run = hatchWsSignalingTransportProxy;
        this.$sendContext = joinSendContext;
        this.$message = signalingMessage;
        this.$callMediaType = callMediaType;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchWsSignalingTransportProxy$sendCosmosJoin$join$1$2$2(this.$this_run, this.$sendContext, this.$message, this.$callMediaType, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchWsSignalingTransportProxy hatchWsSignalingTransportProxy = this.$this_run;
            HatchCallJoinContext.JoinSendContext joinSendContext = this.$sendContext;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(hatchWsSignalingTransportProxy, this.$message, joinSendContext, this.$callMediaType);
            this.label = 1;
            obj = hatchWsSignalingTransportProxy.requestJoinAcrossPlannedRestart(joinSendContext, anonymousClass1, this);
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
        return ((HatchWsSignalingTransportProxy$sendCosmosJoin$join$1$2$2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
