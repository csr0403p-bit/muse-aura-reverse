package com.facebook.aura.network.transport.tigon;

import X.AbstractC7559F3s;
import X.AnonymousClass004;
import X.C7438Evz;
import com.facebook.aura.network.noise.AuraNoiseVmTransport;
import com.facebook.aura.network.transport.HatchWebSocket;
import com.facebook.aura.network.transport.tigon.NoiseGatewayHatchWebSocket;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class NoiseGatewayHatchWebSocketFactory {
    public static final NoiseGatewayHatchWebSocketFactory INSTANCE = new NoiseGatewayHatchWebSocketFactory();

    /* renamed from: com.facebook.aura.network.transport.tigon.NoiseGatewayHatchWebSocketFactory$create$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements Function0<Unit> {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        public AnonymousClass4() {
            super(0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            AuraNoiseVmTransport auraNoiseVmTransport = AuraNoiseVmTransport.INSTANCE;
            auraNoiseVmTransport.setHttpZstdPaths(NoiseGatewayHatchWebSocketKt.getNoiseZstdPaths());
            auraNoiseVmTransport.setHttpZstdUploadsEnabled(NoiseGatewayHatchWebSocketKt.getNoiseZstdUploadsEnabled());
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.network.transport.tigon.NoiseGatewayHatchWebSocketFactory$create$5, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass5 extends C7438Evz implements Function0<Boolean> {
        public AnonymousClass5(Object obj) {
            super(0, obj, NoiseGatewayHatchWebSocketFactory.class, "http2ExtendedConnectEnabled", "http2ExtendedConnectEnabled$fbandroid_express_aura_java_com_facebook_aura_network_transport_tigon_tigon()Z", 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(NoiseGatewayHatchWebSocketKt.getGatewayWebSocketHttp2Enabled());
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(NoiseGatewayHatchWebSocketKt.getGatewayWebSocketHttp2Enabled());
        }
    }

    public final NoiseGatewayHatchWebSocket createScoped$fbandroid_express_aura_java_com_facebook_aura_network_transport_tigon_tigon(NoiseGatewayCarrierFactory noiseGatewayCarrierFactory, String str) {
        boolean zA1b = AnonymousClass004.A1b(noiseGatewayCarrierFactory, str);
        return new NoiseGatewayHatchWebSocket(noiseGatewayCarrierFactory, NoiseGatewayHatchWebSocketFactory$createScoped$1.INSTANCE, new NoiseGatewayHatchWebSocketFactory$createScoped$2(str), NoiseGatewayHatchWebSocketFactory$createScoped$3.INSTANCE, NoiseGatewayHatchWebSocket.AnonymousClass4.INSTANCE, NoiseGatewayHatchWebSocketFactory$createScoped$4.INSTANCE, NoiseGatewayHatchWebSocketFactory$createScoped$5.INSTANCE, NoiseGatewayHatchWebSocketFactory$createScoped$6.INSTANCE, NoiseGatewayHatchWebSocket.AnonymousClass8.INSTANCE, NoiseGatewayHatchWebSocket.AnonymousClass9.INSTANCE, zA1b);
    }

    /* renamed from: com.facebook.aura.network.transport.tigon.NoiseGatewayHatchWebSocketFactory$create$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Integer> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return Integer.valueOf(NoiseGatewayHatchWebSocketKt.getGatewayWebSocketConnectTimeoutMs());
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Integer invoke() {
            return Integer.valueOf(NoiseGatewayHatchWebSocketKt.getGatewayWebSocketConnectTimeoutMs());
        }
    }

    /* renamed from: com.facebook.aura.network.transport.tigon.NoiseGatewayHatchWebSocketFactory$create$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements Function0<Long> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            return Long.valueOf(NoiseGatewayHatchWebSocketKt.getGatewayWebSocketUpgradeTimeoutMs());
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Long invoke() {
            return Long.valueOf(NoiseGatewayHatchWebSocketKt.getGatewayWebSocketUpgradeTimeoutMs());
        }
    }

    /* renamed from: com.facebook.aura.network.transport.tigon.NoiseGatewayHatchWebSocketFactory$create$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements Function0<Long> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            return Long.valueOf(NoiseGatewayHatchWebSocketKt.getGatewayNoiseHandshakeTimeoutMs());
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Long invoke() {
            return Long.valueOf(NoiseGatewayHatchWebSocketKt.getGatewayNoiseHandshakeTimeoutMs());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final HatchWebSocket create() {
        boolean z = false;
        return new NoiseGatewayHatchWebSocket(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, AnonymousClass1.INSTANCE, 0 == true ? 1 : 0, AnonymousClass2.INSTANCE, AnonymousClass3.INSTANCE, 0 == true ? 1 : 0, AnonymousClass4.INSTANCE, new AnonymousClass5(this), z, 1175, 0 == true ? 1 : 0);
    }

    public final boolean http2ExtendedConnectEnabled$fbandroid_express_aura_java_com_facebook_aura_network_transport_tigon_tigon() {
        return NoiseGatewayHatchWebSocketKt.getGatewayWebSocketHttp2Enabled();
    }
}
