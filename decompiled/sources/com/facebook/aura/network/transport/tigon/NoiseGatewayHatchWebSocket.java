package com.facebook.aura.network.transport.tigon;

import X.AbstractC2159Azp;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.BQG;
import X.BV4;
import X.BV7;
import X.C06H;
import X.C10571Hud;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.C7438Evz;
import X.C7BY;
import X.FGI;
import X.G0U;
import X.G0V;
import X.HxE;
import com.facebook.aura.gateway.HatchGatewayPreconnect;
import com.facebook.aura.gateway.HatcheryVMIdUtilsKt;
import com.facebook.aura.gateway.VmNotaryTokenKt;
import com.facebook.aura.network.noise.AuraNoiseVmTransport;
import com.facebook.aura.network.tigon.HatchGatewayIngressHostsKt;
import com.facebook.aura.network.transport.HatchWebSocket;
import com.facebook.aura.network.transport.HatchWebSocketConfig;
import com.facebook.aura.network.transport.HatchWebSocketSession;
import com.facebook.aura.network.transport.cache.CachingHatchHttpClientKt;
import com.facebook.aura.opengraph.HatchOpenGraphRepository;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class NoiseGatewayHatchWebSocket implements HatchWebSocket {
    public static final String FEATHER_NOISE_HOST = "hatch.metaaivm.com";
    public static final String GATEWAY_CONNECT_ATTEMPT_ID_HEADER = "X-Gateway-Connect-Attempt-Id";
    public static final String NOTARY_TOKEN_QUERY_PARAM = "notary_token";
    public final NoiseGatewayCarrierFactory carrierFactory;
    public final Function0<Integer> connectTimeoutMs;
    public final Function0<Boolean> http2ExtendedConnectEnabled;
    public final Function0<Long> noiseHandshakeTimeoutMs;
    public final G0V<String, String, String> notaryTokenFor;
    public final Function0<Boolean> parkedClaimEnabled;
    public final Function0<Unit> publishHttpZstdSettings;
    public final boolean reportsToFlipper;
    public final G0U<Boolean, Unit> setHttpRoutingGate;
    public final Function0<String> sharedIngressHost;
    public final Function0<Long> upgradeTimeoutMs;
    public static final Companion Companion = new Companion();
    public static final Set<String> CREDENTIAL_HEADERS = C60O.A1A("Authorization", "Proxy-Authorization", CachingHatchHttpClientKt.COOKIE_HEADER);
    public static final Set<String> SHARED_INGRESS_HOSTS = HatchGatewayIngressHostsKt.HATCH_GATEWAY_INGRESS_HOSTS;

    /* renamed from: com.facebook.aura.network.transport.tigon.NoiseGatewayHatchWebSocket$2, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass2 extends C7438Evz implements G0V<String, String, String> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(2, VmNotaryTokenKt.class, "getVmNotaryToken", "getVmNotaryToken(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", 1);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ String invoke(String str, String str2) {
            String str3 = str2;
            C7384Etj.A0Y(str3, 1);
            return VmNotaryTokenKt.getVmNotaryToken(str, str3);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String invoke2(String str, String str2) {
            C7384Etj.A0Y(str2, 1);
            return VmNotaryTokenKt.getVmNotaryToken(str, str2);
        }
    }

    /* renamed from: com.facebook.aura.network.transport.tigon.NoiseGatewayHatchWebSocket$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements Function0<String> {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        public AnonymousClass4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            Object objA0s;
            Companion companion = NoiseGatewayHatchWebSocket.Companion;
            try {
                objA0s = NoiseGatewayHatchWebSocketKt.getNoiseSharedIngressHostRaw();
            } catch (Throwable th) {
                objA0s = C3cG.A0s(th);
            }
            if (objA0s instanceof C10571Hud) {
                objA0s = null;
            }
            return companion.resolveSharedIngressHost$fbandroid_express_aura_java_com_facebook_aura_network_transport_tigon_tigon((String) objA0s);
        }
    }

    /* renamed from: com.facebook.aura.network.transport.tigon.NoiseGatewayHatchWebSocket$7, reason: invalid class name */
    public final class AnonymousClass7 extends AbstractC7559F3s implements Function0<Boolean> {
        public static final AnonymousClass7 INSTANCE = new AnonymousClass7();

        public AnonymousClass7() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(HatchGatewayPreconnect.INSTANCE.shouldRunNow());
        }
    }

    /* renamed from: com.facebook.aura.network.transport.tigon.NoiseGatewayHatchWebSocket$8, reason: invalid class name */
    public final class AnonymousClass8 extends AbstractC7559F3s implements Function0<Unit> {
        public static final AnonymousClass8 INSTANCE = new AnonymousClass8();

        public AnonymousClass8() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    public final class Companion {
        private final String noiseIngressPath(String str) {
            int i;
            String strA0Z = C7BY.A0Z(str, '/');
            C7384Etj.A0Y(strA0Z, 0);
            if (strA0Z.endsWith(VmNotaryTokenKt.NOISE_INGRESS_PATH)) {
                return strA0Z;
            }
            if (!strA0Z.endsWith("/gateway")) {
                i = strA0Z.endsWith("/ws") ? 3 : 8;
                return FGI.A0M(strA0Z, VmNotaryTokenKt.NOISE_INGRESS_PATH);
            }
            int length = strA0Z.length() - i;
            if (length < 0) {
                length = 0;
            }
            strA0Z = BQG.A17(strA0Z, length);
            return FGI.A0M(strA0Z, VmNotaryTokenKt.NOISE_INGRESS_PATH);
        }

        private final boolean isCredentialHeader(String str) {
            Set<String> set = NoiseGatewayHatchWebSocket.CREDENTIAL_HEADERS;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    if (AbstractC2159Azp.A12(str, it.next(), true)) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String noiseIngressUrl(String str) {
            String rawAuthority;
            try {
                URI uri = new URI(str);
                String scheme = uri.getScheme();
                if (scheme == null || (rawAuthority = uri.getRawAuthority()) == null) {
                    return str;
                }
                String rawPath = uri.getRawPath();
                if (rawPath == null) {
                    rawPath = "";
                }
                String strNoiseIngressPath = noiseIngressPath(rawPath);
                String rawQuery = uri.getRawQuery();
                String strA0M = rawQuery != null ? FGI.A0M(HatchOpenGraphRepository.UNKNOWN_HOST, rawQuery) : null;
                if (strA0M == null) {
                    strA0M = "";
                }
                String rawFragment = uri.getRawFragment();
                String strA0M2 = rawFragment != null ? FGI.A0M("#", rawFragment) : null;
                return FGI.A0j(scheme, "://", rawAuthority, strNoiseIngressPath, strA0M, strA0M2 != null ? strA0M2 : "");
            } catch (Exception unused) {
                return str;
            }
        }

        public final String resolveSharedIngressHost$fbandroid_express_aura_java_com_facebook_aura_network_transport_tigon_tigon(String str) {
            return (str == null || !NoiseGatewayHatchWebSocket.SHARED_INGRESS_HOSTS.contains(str)) ? "hatch.metaaivm.com" : str;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isStrippedCredentialHeader(String str, boolean z) {
            if (isCredentialHeader(str)) {
                return str == null || !str.equalsIgnoreCase("Authorization") || z;
            }
            return false;
        }

        public final String preconnectHost$fbandroid_express_aura_java_com_facebook_aura_network_transport_tigon_tigon(String str) {
            Object objA0s;
            Object objA0s2;
            String host;
            try {
                objA0s = NoiseGatewayHatchWebSocketKt.getNoiseSharedIngressHostRaw();
            } catch (Throwable th) {
                objA0s = C3cG.A0s(th);
            }
            if (objA0s instanceof C10571Hud) {
                objA0s = null;
            }
            String strResolveSharedIngressHost$fbandroid_express_aura_java_com_facebook_aura_network_transport_tigon_tigon = resolveSharedIngressHost$fbandroid_express_aura_java_com_facebook_aura_network_transport_tigon_tigon((String) objA0s);
            if (str != null) {
                try {
                    objA0s2 = new URI(noiseIngressUrl(str));
                } catch (Throwable th2) {
                    objA0s2 = C3cG.A0s(th2);
                }
                if (objA0s2 instanceof C10571Hud) {
                    objA0s2 = null;
                }
                URI uri = (URI) objA0s2;
                if (uri == null) {
                    return null;
                }
                String scheme = uri.getScheme();
                if ((scheme == null ? false : scheme.equalsIgnoreCase("wss")) && ((uri.getPort() == -1 || uri.getPort() == 443) && (host = uri.getHost()) != null)) {
                    if (host.length() <= 0) {
                        host = null;
                    }
                    if (host != null) {
                        if (HatcheryVMIdUtilsKt.extractDevVmIdFromHost(host) == null) {
                            return host;
                        }
                    }
                }
                return null;
            }
            return strResolveSharedIngressHost$fbandroid_express_aura_java_com_facebook_aura_network_transport_tigon_tigon;
        }

        public Companion() {
        }
    }

    /* renamed from: com.facebook.aura.network.transport.tigon.NoiseGatewayHatchWebSocket$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
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

    /* renamed from: com.facebook.aura.network.transport.tigon.NoiseGatewayHatchWebSocket$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements Function0<Integer> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return BV4.A0V();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Integer invoke() {
            return BV4.A0V();
        }
    }

    /* renamed from: com.facebook.aura.network.transport.tigon.NoiseGatewayHatchWebSocket$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements Function0<Long> {
        public static final AnonymousClass5 INSTANCE = new AnonymousClass5();

        public AnonymousClass5() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            return BV7.A0o();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Long invoke() {
            return BV7.A0o();
        }
    }

    /* renamed from: com.facebook.aura.network.transport.tigon.NoiseGatewayHatchWebSocket$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements Function0<Long> {
        public static final AnonymousClass6 INSTANCE = new AnonymousClass6();

        public AnonymousClass6() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            return BV7.A0o();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Long invoke() {
            return BV7.A0o();
        }
    }

    /* renamed from: com.facebook.aura.network.transport.tigon.NoiseGatewayHatchWebSocket$9, reason: invalid class name */
    public final class AnonymousClass9 extends AbstractC7559F3s implements Function0<Boolean> {
        public static final AnonymousClass9 INSTANCE = new AnonymousClass9();

        public AnonymousClass9() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return AnonymousClass001.A0h();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return AnonymousClass001.A0h();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public NoiseGatewayHatchWebSocket() {
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        Object[] objArr7 = 0 == true ? 1 : 0;
        Object[] objArr8 = 0 == true ? 1 : 0;
        Object[] objArr9 = 0 == true ? 1 : 0;
        this(null, objArr, objArr2, objArr3, objArr4, objArr5, objArr6, objArr7, objArr8, objArr9, false, 2047, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<HxE<String, String>> carrierHeaders(HatchWebSocketConfig hatchWebSocketConfig) {
        boolean z = !AnonymousClass002.A1M(NoiseGatewayHatchWebSocketKt.extractAuthTokenFromUrl(hatchWebSocketConfig.url).length);
        Map<String, String> map = hatchWebSocketConfig.headers;
        ArrayList arrayListA11 = C60O.A11(map.size());
        Iterator itA0n = AnonymousClass002.A0n(map);
        while (itA0n.hasNext()) {
            Map.Entry entry = (Map.Entry) itA0n.next();
            arrayListA11.add(new HxE(entry.getKey(), entry.getValue()));
        }
        ArrayList arrayListA0h = C3cG.A0h();
        for (Object obj : arrayListA11) {
            if (!Companion.isStrippedCredentialHeader((String) ((HxE) obj).first, z)) {
                arrayListA0h.add(obj);
            }
        }
        return arrayListA0h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final HatchWebSocketSession failedSession(String str) {
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        NoiseGatewayHatchWebSocketSession noiseGatewayHatchWebSocketSession = new NoiseGatewayHatchWebSocketSession(FailedNoiseGatewayCarrierHandle.INSTANCE, null, false, objArr, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 126, objArr2);
        noiseGatewayHatchWebSocketSession.fail(str, null, null, null);
        return noiseGatewayHatchWebSocketSession;
    }

    private final boolean hasGatewayConnectAttemptId(HatchWebSocketConfig hatchWebSocketConfig) {
        Set<String> setKeySet = hatchWebSocketConfig.headers.keySet();
        if (!(setKeySet instanceof Collection) || !setKeySet.isEmpty()) {
            for (String str : setKeySet) {
                if (str != null && str.equalsIgnoreCase("X-Gateway-Connect-Attempt-Id")) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0132 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0155 A[Catch: all -> 0x01af, PHI: r29
  0x0155: PHI (r29v1 boolean) = (r29v0 boolean), (r29v3 boolean) binds: [B:73:0x014c, B:75:0x0150] A[DONT_GENERATE, DONT_INLINE], TryCatch #6 {all -> 0x01af, blocks: (B:58:0x0110, B:61:0x011a, B:64:0x012a, B:69:0x0140, B:72:0x0146, B:77:0x0155, B:78:0x0157, B:76:0x0152, B:68:0x013c, B:66:0x0132), top: B:115:0x0110, inners: #5 }] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23, types: [com.facebook.aura.network.transport.HatchNoiseHandshakeOutcome, java.lang.Integer, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v32 */
    @Override // com.facebook.aura.network.transport.HatchWebSocket
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.facebook.aura.network.transport.HatchWebSocketSession connect(com.facebook.aura.network.transport.HatchWebSocketConfig r33) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.network.transport.tigon.NoiseGatewayHatchWebSocket.connect(com.facebook.aura.network.transport.HatchWebSocketConfig):com.facebook.aura.network.transport.HatchWebSocketSession");
    }

    public final String appendNotaryToken$fbandroid_express_aura_java_com_facebook_aura_network_transport_tigon_tigon(String str, String str2, byte[] bArr) {
        AnonymousClass005.A0x(str, str2, bArr);
        if (bArr.length == 0) {
            return str;
        }
        String strInvoke = this.notaryTokenFor.invoke(HatcheryVMIdUtilsKt.extractHatcheryVMId(str2), VmNotaryTokenKt.NOISE_INGRESS_PATH);
        return strInvoke.length() != 0 ? ScopedNoiseIdentityProbeKt.urlWithQueryParameter(str, NOTARY_TOKEN_QUERY_PARAM, strInvoke) : str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NoiseGatewayHatchWebSocket(NoiseGatewayCarrierFactory noiseGatewayCarrierFactory, G0U<? super Boolean, Unit> g0u, G0V<? super String, ? super String, String> g0v, Function0<Integer> function0, Function0<String> function02, Function0<Long> function03, Function0<Long> function04, Function0<Boolean> function05, Function0<Unit> function06, Function0<Boolean> function07, boolean z) {
        AnonymousClass005.A17(noiseGatewayCarrierFactory, g0u, g0v, function0, function02);
        AnonymousClass005.A0z(function03, function04, function05);
        AnonymousClass002.A1F(function06, 8, function07);
        this.carrierFactory = noiseGatewayCarrierFactory;
        this.setHttpRoutingGate = g0u;
        this.notaryTokenFor = g0v;
        this.connectTimeoutMs = function0;
        this.sharedIngressHost = function02;
        this.upgradeTimeoutMs = function03;
        this.noiseHandshakeTimeoutMs = function04;
        this.parkedClaimEnabled = function05;
        this.publishHttpZstdSettings = function06;
        this.http2ExtendedConnectEnabled = function07;
        this.reportsToFlipper = z;
    }

    public /* synthetic */ NoiseGatewayHatchWebSocket(NoiseGatewayCarrierFactory noiseGatewayCarrierFactory, G0U g0u, G0V g0v, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function0 function06, Function0 function07, boolean z, int i, C06H c06h) {
        this((i & 1) != 0 ? NoiseGatewayHatchWebSocketKt.DefaultNoiseGatewayCarrierFactory : noiseGatewayCarrierFactory, (i & 2) != 0 ? AnonymousClass1.INSTANCE : g0u, (i & 4) != 0 ? AnonymousClass2.INSTANCE : g0v, (i & 8) != 0 ? AnonymousClass3.INSTANCE : function0, (i & 16) != 0 ? AnonymousClass4.INSTANCE : function02, (i & 32) != 0 ? AnonymousClass5.INSTANCE : function03, (i & 64) != 0 ? AnonymousClass6.INSTANCE : function04, (i & 128) != 0 ? AnonymousClass7.INSTANCE : function05, (i & 256) != 0 ? AnonymousClass8.INSTANCE : function06, (i & 512) != 0 ? AnonymousClass9.INSTANCE : function07, (i & 1024) != 0 ? true : z);
    }
}
