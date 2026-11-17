package com.facebook.aura.partners.voice.session.impl;

import X.AbstractC7559F3s;
import X.GR9;
import X.GTH;
import X.GTS;
import X.GTU;
import X.HtJ;
import com.facebook.rp.platform.calling.CallControllerImpl;
import com.facebook.rsys.transport.gen.SignalingProtocolParams;
import com.facebook.rsys.transport.gen.UllcParams;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class HatchRealTimeSessionController$rsysDelegate$2 extends AbstractC7559F3s implements Function0<AnonymousClass1> {
    public final /* synthetic */ HatchRealTimeSessionController this$0;

    /* renamed from: com.facebook.aura.partners.voice.session.impl.HatchRealTimeSessionController$rsysDelegate$2$1, reason: invalid class name */
    public final class AnonymousClass1 implements GTS {
        public final /* synthetic */ CallControllerImpl $$delegate_0;
        public final /* synthetic */ HatchRealTimeSessionController this$0;

        public AnonymousClass1(HatchRealTimeSessionController hatchRealTimeSessionController) {
            this.this$0 = hatchRealTimeSessionController;
            this.$$delegate_0 = hatchRealTimeSessionController.getCallController();
        }

        @Override // X.GTS
        public GTU getAppConfig() {
            return new GTU();
        }

        @Override // X.GTS
        public Object startSession(GTH gth, HtJ<? super GR9> htJ) {
            UllcParams ullcParams;
            SignalingProtocolParams signalingProtocolParams = gth.A03;
            if (signalingProtocolParams != null && (ullcParams = signalingProtocolParams.ullc) != null && ullcParams.videoTrackType == 1) {
                HatchCallControllerConfigKt.applyHatchVoiceH265Config(gth.A04);
            }
            return this.this$0.getCallController().startSession(gth, htJ);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchRealTimeSessionController$rsysDelegate$2(HatchRealTimeSessionController hatchRealTimeSessionController) {
        super(0);
        this.this$0 = hatchRealTimeSessionController;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final AnonymousClass1 invoke() {
        return new AnonymousClass1(this.this$0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ AnonymousClass1 invoke() {
        return new AnonymousClass1(this.this$0);
    }
}
