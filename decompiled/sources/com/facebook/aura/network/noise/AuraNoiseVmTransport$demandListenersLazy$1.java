package com.facebook.aura.network.noise;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C3cG;
import X.C7384Etj;
import X.CFK;
import X.F0C;
import X.G0U;
import com.crossapp.tigonhttp.noise.NoiseChannelManagerHolder;
import com.crossapp.tigonhttp.noise.NoiseConnectionDemandListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class AuraNoiseVmTransport$demandListenersLazy$1 extends AbstractC7559F3s implements Function0<NoiseDemandListenerRegistry<NoiseConnectionDemandListener, Long>> {
    public static final AuraNoiseVmTransport$demandListenersLazy$1 INSTANCE = new AuraNoiseVmTransport$demandListenersLazy$1();

    /* renamed from: com.facebook.aura.network.noise.AuraNoiseVmTransport$demandListenersLazy$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<NoiseConnectionDemandListener, Long> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // X.G0U
        public final Long invoke(NoiseConnectionDemandListener noiseConnectionDemandListener) {
            long jTryRegisterConnectionDemandListener$fbandroid_java_com_crossapp_tigonhttp_noise_tigon_noise_context;
            C7384Etj.A0Y(noiseConnectionDemandListener, 0);
            NoiseChannelManagerHolder noiseChannelManagerHolderA03 = F0C.A03();
            synchronized (noiseChannelManagerHolderA03) {
                jTryRegisterConnectionDemandListener$fbandroid_java_com_crossapp_tigonhttp_noise_tigon_noise_context = noiseChannelManagerHolderA03.tryRegisterConnectionDemandListener$fbandroid_java_com_crossapp_tigonhttp_noise_tigon_noise_context(noiseConnectionDemandListener);
                if (jTryRegisterConnectionDemandListener$fbandroid_java_com_crossapp_tigonhttp_noise_tigon_noise_context <= 0) {
                    throw C3cG.A0Q("Native Noise connection-demand registration failed");
                }
            }
            return Long.valueOf(jTryRegisterConnectionDemandListener$fbandroid_java_com_crossapp_tigonhttp_noise_tigon_noise_context);
        }
    }

    public AuraNoiseVmTransport$demandListenersLazy$1() {
        super(0);
    }

    /* renamed from: com.facebook.aura.network.noise.AuraNoiseVmTransport$demandListenersLazy$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<Long, Unit> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            invoke(C3cG.A05(l));
            return Unit.INSTANCE;
        }

        public final void invoke(long j) {
            F0C.A03().unregisterConnectionDemandListener(j);
        }
    }

    /* renamed from: com.facebook.aura.network.noise.AuraNoiseVmTransport$demandListenersLazy$1$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            AuraNoiseVmTransport.INSTANCE.setHttpRoutingGate(AnonymousClass001.A1X(bool));
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            AuraNoiseVmTransport.INSTANCE.setHttpRoutingGate(z);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final NoiseDemandListenerRegistry<NoiseConnectionDemandListener, Long> invoke() {
        return new NoiseDemandListenerRegistry<>(AnonymousClass1.INSTANCE, AnonymousClass2.INSTANCE, AnonymousClass3.INSTANCE, AnonymousClass4.INSTANCE);
    }

    /* renamed from: com.facebook.aura.network.noise.AuraNoiseVmTransport$demandListenersLazy$1$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0U<Throwable, Unit> {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        public AnonymousClass4() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C7384Etj.A0Y(th, 0);
            CFK.A08(AuraNoiseVmTransportKt.TAG, "Failed to unregister stale Noise demand listener", th);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }
    }
}
