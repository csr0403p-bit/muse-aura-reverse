package com.facebook.aura.network.transport.tigon;

import X.AbstractC2159Azp;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BV4;
import X.BV5;
import X.BV6;
import X.C10571Hud;
import X.C31u;
import X.C3cG;
import X.C60O;
import X.C7462Ewq;
import X.C7BY;
import X.DCl;
import X.ET9;
import X.FGI;
import X.InterfaceC7359EnW;
import com.facebook.aura.confidentialvm.HatchVmAccessControllerKt;
import com.facebook.aura.gateway.HatchCvmReplacementFailure;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.network.transport.HatchNoiseHandshakeOutcome;
import com.facebook.aura.network.transport.HatchWebSocketConfig;
import com.facebook.aura.network.transport.tigon.MC;
import java.net.URLDecoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public abstract class NoiseGatewayHatchWebSocketKt {
    public static final String AUTHORIZATION_HEADER = "Authorization";
    public static final String AUTH_TOKEN_QUERY_PARAM = "auth_token";
    public static final String BEARER_AUTH_PREFIX = "Bearer ";
    public static final String GENERIC_GATEWAY_FAILURE_DETAIL = "noise.gateway_failure";
    public static final String HTTP2_PING_TIMEOUT_DIAGNOSTIC = "mns_stage=http2_ping_timeout";
    public static final long NANOS_PER_MILLISECOND = 1000000;
    public static final String NOISE_DETAIL_PREFIX = "noise.";
    public static final String NOISE_HANDSHAKE_TIMEOUT_DETAIL = "noise.handshake.timeout";
    public static final String TAG = "NoiseGatewayHatchWebSocket";
    public static final String WS_UPGRADE_TIMEOUT_DIAGNOSTIC = "mns_error_code=upgrade_timeout";
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = {new C7462Ewq(NoiseGatewayHatchWebSocketKt.class, "noiseZstdPaths", "getNoiseZstdPaths()Ljava/lang/String;", 1), new C7462Ewq(NoiseGatewayHatchWebSocketKt.class, "noiseZstdUploadsEnabled", "getNoiseZstdUploadsEnabled()Z", 1), new C7462Ewq(NoiseGatewayHatchWebSocketKt.class, "gatewayWebSocketConnectTimeoutMs", "getGatewayWebSocketConnectTimeoutMs()I", 1), new C7462Ewq(NoiseGatewayHatchWebSocketKt.class, "gatewayWebSocketHttp2Enabled", "getGatewayWebSocketHttp2Enabled()Z", 1), new C7462Ewq(NoiseGatewayHatchWebSocketKt.class, "noiseSharedIngressHostRaw", "getNoiseSharedIngressHostRaw()Ljava/lang/String;", 1), new C7462Ewq(NoiseGatewayHatchWebSocketKt.class, "gatewayWebSocketUpgradeTimeoutMs", "getGatewayWebSocketUpgradeTimeoutMs()J", 1), new C7462Ewq(NoiseGatewayHatchWebSocketKt.class, "gatewayNoiseHandshakeTimeoutMs", "getGatewayNoiseHandshakeTimeoutMs()J", 1)};
    public static final C31u noiseZstdPaths$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigString(MC.hatch_android_networking.noise_zstd_paths);
    public static final C31u noiseZstdUploadsEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android_networking.noise_zstd_uploads_enabled);
    public static final C31u gatewayWebSocketConnectTimeoutMs$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigInt(MC.hatch_android_networking.gateway_websocket_connect_timeout_ms);
    public static final C31u gatewayWebSocketHttp2Enabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android_networking.enable_gateway_websocket_http2);
    public static final C31u noiseSharedIngressHostRaw$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigString(MC.hatch_android_sessionless.noise_shared_ingress_host);
    public static final C31u gatewayWebSocketUpgradeTimeoutMs$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigLong(MC.hatch_android_networking.gateway_websocket_upgrade_timeout_ms);
    public static final C31u gatewayNoiseHandshakeTimeoutMs$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigLong(MC.hatch_android_networking.gateway_noise_handshake_timeout_ms);
    public static final VmNoiseCarrierFactory DefaultNoiseGatewayCarrierFactory = new VmNoiseCarrierFactory(NoiseGatewayHatchWebSocketKt$DefaultNoiseGatewayCarrierFactory$1.INSTANCE, NoiseGatewayHatchWebSocketKt$DefaultNoiseGatewayCarrierFactory$2.INSTANCE);
    public static final Set<String> CHIP_BINDING_FAILURE_DETAILS = C60O.A1A("noise.handshake.chip_binding_rejected", "noise.handshake.chip_binding_missing", "noise.handshake.chip_pin_rejected");

    public static final String encodedQueryFromUrl(String str) {
        int iA08 = C7BY.A08(str, '#', 0);
        if (iA08 < 0) {
            iA08 = str.length();
        }
        int iA082 = C7BY.A08(str, '?', 0);
        if (iA082 < 0 || iA082 > iA08) {
            return null;
        }
        return str.substring(iA082 + 1, iA08);
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ET9.values().length];
            try {
                BV6.A1T(iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String decodeQueryComponent(String str) {
        Object objA0s;
        try {
            objA0s = URLDecoder.decode(AbstractC2159Azp.A0z(str, "+", "%2B"), DCl.A05.name());
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = str;
        }
        return (String) objA0s;
    }

    public static final byte[] extractAuthToken(HatchWebSocketConfig hatchWebSocketConfig) {
        byte[] bArrExtractAuthTokenFromUrl = extractAuthTokenFromUrl(hatchWebSocketConfig.url);
        return bArrExtractAuthTokenFromUrl.length == 0 ? extractBearerAuthToken(hatchWebSocketConfig.headers) : bArrExtractAuthTokenFromUrl;
    }

    public static final long getGatewayNoiseHandshakeTimeoutMs() {
        return C3cG.A05(gatewayNoiseHandshakeTimeoutMs$delegate.getValue(null, $$delegatedProperties[6]));
    }

    public static final int getGatewayWebSocketConnectTimeoutMs() {
        return AnonymousClass001.A0F(gatewayWebSocketConnectTimeoutMs$delegate.getValue(null, $$delegatedProperties[2]));
    }

    public static final boolean getGatewayWebSocketHttp2Enabled() {
        return BV5.A1W(gatewayWebSocketHttp2Enabled$delegate, $$delegatedProperties, 3);
    }

    public static final long getGatewayWebSocketUpgradeTimeoutMs() {
        return C3cG.A05(gatewayWebSocketUpgradeTimeoutMs$delegate.getValue(null, $$delegatedProperties[5]));
    }

    public static final String getNoiseSharedIngressHostRaw() {
        return (String) noiseSharedIngressHostRaw$delegate.getValue(null, $$delegatedProperties[4]);
    }

    public static final String getNoiseZstdPaths() {
        return (String) C31u.A00(noiseZstdPaths$delegate, $$delegatedProperties);
    }

    public static final boolean getNoiseZstdUploadsEnabled() {
        return BV5.A1W(noiseZstdUploadsEnabled$delegate, $$delegatedProperties, 1);
    }

    public static final boolean isSafeNoiseDescription(String str) {
        char c;
        if (!AnonymousClass005.A1a(str, NOISE_DETAIL_PREFIX)) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if ('a' > cCharAt) {
                if ('0' > cCharAt) {
                    c = '.';
                } else if (cCharAt >= ':') {
                    c = '_';
                } else {
                    continue;
                }
                if (cCharAt != c && cCharAt != '-') {
                    return false;
                }
            } else if (cCharAt >= '{') {
                return false;
            }
        }
        return true;
    }

    public static final String sanitizedFailureDescription(String str, Integer num) {
        return (HatchCvmReplacementFailure.ATTESTATION_FAILED.equals(str) || isSafeNoiseDescription(str)) ? str : num != null ? FGI.A0H("noise.gateway_failure.http_", num.intValue()) : GENERIC_GATEWAY_FAILURE_DETAIL;
    }

    public static final String canonicalFailureDescription(ET9 et9, String str) {
        int iOrdinal = et9.ordinal();
        return iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal == 4 ? HatchVmAccessControllerKt.NOISE_ATTESTATION_FAILED : str : "noise.handshake.private_auth.key_required" : "noise.handshake.private_auth.enrollment_required";
    }

    public static final byte[] extractAuthTokenFromUrl(String str) {
        String strEncodedQueryFromUrl = encodedQueryFromUrl(str);
        if (strEncodedQueryFromUrl != null) {
            for (String str2 : C7BY.A0e(strEncodedQueryFromUrl, "&")) {
                int iA08 = C7BY.A08(str2, '=', 0);
                String strDecodeQueryComponent = decodeQueryComponent(iA08 == -1 ? str2 : str2.substring(0, iA08));
                if (strDecodeQueryComponent != null && strDecodeQueryComponent.equalsIgnoreCase("auth_token")) {
                    return C3cG.A1S(decodeQueryComponent(iA08 == -1 ? "" : BV4.A0g(iA08, str2)));
                }
            }
        }
        return new byte[0];
    }

    public static final byte[] extractBearerAuthToken(Map<String, String> map) {
        Object next;
        String str;
        String strA0l;
        Iterator itA0n = AnonymousClass002.A0n(map);
        while (true) {
            if (!itA0n.hasNext()) {
                next = null;
                break;
            }
            next = itA0n.next();
            String strA0t = C60O.A0t((Map.Entry) next);
            if (strA0t != null && strA0t.equalsIgnoreCase("Authorization")) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null && (str = (String) entry.getValue()) != null && (strA0l = AnonymousClass002.A0l(str)) != null && AnonymousClass006.A1b("Bearer ", strA0l)) {
            String strA0l2 = AnonymousClass002.A0l(strA0l.substring(7));
            if (strA0l2.length() != 0) {
                return C3cG.A1S(strA0l2);
            }
        }
        return new byte[0];
    }

    public static final HatchNoiseHandshakeOutcome toTransportOutcome(ET9 et9) {
        int iOrdinal = et9.ordinal();
        if (iOrdinal == 0) {
            return HatchNoiseHandshakeOutcome.LEGACY_PEER_VERIFIED;
        }
        if (iOrdinal == 1) {
            return HatchNoiseHandshakeOutcome.PRIVATE_AUTH_PEER_VERIFIED;
        }
        if (iOrdinal == 2) {
            return HatchNoiseHandshakeOutcome.ENROLLMENT_REQUIRED;
        }
        if (iOrdinal == 3) {
            return HatchNoiseHandshakeOutcome.KEY_REQUIRED;
        }
        if (iOrdinal == 4) {
            return HatchNoiseHandshakeOutcome.VERIFICATION_FAILED;
        }
        throw C3cG.A0q();
    }
}
