package com.facebook.aura.partners.voice.session.impl;

import X.AbstractC07127nr;
import X.AbstractC9777Gfy;
import X.AnonymousClass001;
import X.C20Q;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.HatchWsSignalingTransportProxy$requestJoinAcrossPlannedRestart$2$outage$1", f = "HatchWsSignalingTransportProxy.kt", l = {203}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class HatchWsSignalingTransportProxy$requestJoinAcrossPlannedRestart$2$outage$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
    public int label;
    public final /* synthetic */ HatchWsSignalingTransportProxy this$0;

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.HatchWsSignalingTransportProxy$requestJoinAcrossPlannedRestart$2$outage$1$1", f = "HatchWsSignalingTransportProxy.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.HatchWsSignalingTransportProxy$requestJoinAcrossPlannedRestart$2$outage$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<Boolean, HtJ<? super Boolean>, Object> {
        public /* synthetic */ boolean Z$0;
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(htJ);
            anonymousClass1.Z$0 = AnonymousClass001.A1X(obj);
            return anonymousClass1;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            boolean z = this.Z$0;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return Boolean.valueOf(z);
        }

        public final Object invoke(boolean z, HtJ<? super Boolean> htJ) {
            return ((AnonymousClass1) create(Boolean.valueOf(z), htJ)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, HtJ<? super Boolean> htJ) {
            return invoke(AnonymousClass001.A1X(bool), htJ);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchWsSignalingTransportProxy$requestJoinAcrossPlannedRestart$2$outage$1(HatchWsSignalingTransportProxy hatchWsSignalingTransportProxy, HtJ<? super HatchWsSignalingTransportProxy$requestJoinAcrossPlannedRestart$2$outage$1> htJ) {
        super(2, htJ);
        this.this$0 = hatchWsSignalingTransportProxy;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchWsSignalingTransportProxy$requestJoinAcrossPlannedRestart$2$outage$1(this.this$0, htJ);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
        return new HatchWsSignalingTransportProxy$requestJoinAcrossPlannedRestart$2$outage$1(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C20Q<Boolean> c20q = this.this$0.plannedRestartOutage;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
            this.label = 1;
            obj = AbstractC9777Gfy.A00(this, anonymousClass1, c20q);
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
}
