package com.facebook.aura.network.transport.tigon;

import X.AGH;
import X.AbstractC0878AGe;
import X.AbstractC2159Azp;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C0881AGi;
import X.C10571Hud;
import X.C3cG;
import X.C3cH;
import X.C6tn;
import X.C7384Etj;
import X.C7BY;
import X.DCl;
import X.FGI;
import X.HtJ;
import X.HzP;
import com.facebook.aura.network.AuraUserAgent;
import com.facebook.aura.network.transport.HatchHttpMethod;
import com.facebook.aura.network.transport.HatchHttpRequest;
import com.facebook.aura.network.transport.HatchHttpResponse;
import com.facebook.aura.network.transport.HatchVmProbeResponseObserver;
import com.facebook.aura.opengraph.HatchOpenGraphRepository;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.io.ByteArrayInputStream;
import java.net.URI;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public abstract class ScopedNoiseIdentityProbeKt {
    public static final String AUTHORIZATION_HEADER = "Authorization";
    public static final String AUTH_TOKEN_QUERY_PARAM = "auth_token";
    public static final String BEARER_AUTH_PREFIX = "Bearer ";
    public static final String GATEWAY_CONNECT_ATTEMPT_ID_HEADER = "X-Gateway-Connect-Attempt-Id";
    public static final long NOISE_READY_TIMEOUT_MS = 12000;
    public static final String REQUEST_ID_HEADER = "x-request-id";
    public static final String TAG = "ScopedNoiseIdentityProbe";
    public static final String USER_AGENT_HEADER = "User-Agent";

    @DebugMetadata(c = "com.facebook.aura.network.transport.tigon.ScopedNoiseIdentityProbeKt", f = "ScopedNoiseIdentityProbe.kt", l = {243}, m = "awaitNoiseTerminalEvent", v = 2)
    /* renamed from: com.facebook.aura.network.transport.tigon.ScopedNoiseIdentityProbeKt$awaitNoiseTerminalEvent$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ScopedNoiseIdentityProbeKt.awaitNoiseTerminalEvent(null, null, this);
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }
    }

    public static final Map<String, String> noiseConnectHeaders(String str) {
        C7384Etj.A0Y(str, 0);
        return C3cH.A0m("User-Agent", AuraUserAgent.INSTANCE.getInstance(), C3cG.A0r("x-request-id", AnonymousClass002.A0k()), C3cG.A0r("X-Gateway-Connect-Attempt-Id", AnonymousClass006.A0y(UUID.randomUUID(), "-", C3cG.A0g(str))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v3, types: [X.AGi] */
    public static final String urlWithQueryParameter(String str, String str2, String str3) {
        ?? A0h;
        AnonymousClass005.A10(str, str2, str3);
        int iA08 = C7BY.A08(str, '#', 0);
        if (iA08 < 0) {
            iA08 = str.length();
        }
        String strSubstring = str.substring(iA08);
        String strSubstring2 = str.substring(0, iA08);
        int iA082 = C7BY.A08(strSubstring2, '?', 0);
        String strSubstring3 = iA082 == -1 ? strSubstring2 : strSubstring2.substring(0, iA082);
        if (iA082 == -1) {
            A0h = C0881AGi.A00;
        } else {
            List<String> listA0e = C7BY.A0e(strSubstring2.substring(iA082 + 1), "&");
            A0h = C3cG.A0h();
            for (String str4 : listA0e) {
                if (str4.length() != 0) {
                    int iA083 = C7BY.A08(str4, '=', 0);
                    String strDecodeQueryComponent = decodeQueryComponent(iA083 == -1 ? str4 : str4.substring(0, iA083));
                    if (strDecodeQueryComponent == null || !strDecodeQueryComponent.equalsIgnoreCase(str2)) {
                        A0h.add(FGI.A0U(encodeQueryComponent(strDecodeQueryComponent), InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR, encodeQueryComponent(decodeQueryComponent(iA083 == -1 ? "" : str4.substring(iA083 + 1)))));
                    }
                }
            }
        }
        ArrayList arrayListA0Q = AbstractC0878AGe.A0Q(FGI.A0U(encodeQueryComponent(str2), InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR, encodeQueryComponent(str3)), A0h);
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator it = arrayListA0Q.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((String) next).length() > 0) {
                arrayListA0h.add(next);
            }
        }
        return FGI.A0d(strSubstring3, HatchOpenGraphRepository.UNKNOWN_HOST, C3cH.A0e("&", arrayListA0h), strSubstring);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object awaitNoiseTerminalEvent(com.facebook.aura.network.transport.HatchWebSocketSession r6, java.lang.String r7, X.HtJ<? super com.facebook.aura.network.transport.HatchWsEvent> r8) {
        /*
            boolean r0 = r8 instanceof com.facebook.aura.network.transport.tigon.ScopedNoiseIdentityProbeKt.AnonymousClass1
            if (r0 == 0) goto L5f
            r5 = r8
            com.facebook.aura.network.transport.tigon.ScopedNoiseIdentityProbeKt$awaitNoiseTerminalEvent$1 r5 = (com.facebook.aura.network.transport.tigon.ScopedNoiseIdentityProbeKt.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5f
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r0 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r2 = r5.label
            r1 = 1
            if (r2 == 0) goto L41
            if (r2 != r1) goto L8b
            java.lang.Object r1 = r5.L$2
            java.lang.String r3 = X.C3cG.A0d(r1, r0)
        L23:
            r4 = r0
            com.facebook.aura.network.transport.HatchWsEvent r4 = (com.facebook.aura.network.transport.HatchWsEvent) r4
            boolean r0 = r4 instanceof com.facebook.aura.network.transport.HatchWsEvent.Open
            if (r0 != 0) goto L40
            boolean r0 = r4 instanceof com.facebook.aura.network.transport.HatchWsEvent.Failed
            java.lang.String r5 = "ScopedNoiseIdentityProbe"
            if (r0 == 0) goto L65
            java.lang.String r0 = "Scoped Noise VM probe failed to connect for "
            java.lang.String r1 = X.FGI.A0M(r0, r3)
            r0 = r4
            com.facebook.aura.network.transport.HatchWsEvent$Failed r0 = (com.facebook.aura.network.transport.HatchWsEvent.Failed) r0
            com.facebook.aura.network.transport.HatchWsFailure r0 = r0.failure
            java.lang.Throwable r0 = r0.cause
            X.CFK.A0A(r5, r1, r0)
        L40:
            return r4
        L41:
            X.Hwg.A00(r0)
            java.lang.String r3 = com.facebook.aura.gateway.HatcheryVMIdUtilsKt.redactedGatewayUrlForLog(r7)
            r0 = 0
            com.facebook.aura.network.transport.tigon.ScopedNoiseIdentityProbeKt$awaitNoiseTerminalEvent$event$1 r2 = new com.facebook.aura.network.transport.tigon.ScopedNoiseIdentityProbeKt$awaitNoiseTerminalEvent$event$1
            r2.<init>(r6, r0)
            r5.L$0 = r0
            r5.L$1 = r0
            r5.L$2 = r3
            r5.label = r1
            r0 = 12000(0x2ee0, double:5.929E-320)
            java.lang.Object r0 = X.GAX.A01(r5, r2, r0)
            if (r0 != r4) goto L23
            return r4
        L5f:
            com.facebook.aura.network.transport.tigon.ScopedNoiseIdentityProbeKt$awaitNoiseTerminalEvent$1 r5 = new com.facebook.aura.network.transport.tigon.ScopedNoiseIdentityProbeKt$awaitNoiseTerminalEvent$1
            r5.<init>(r8)
            goto L12
        L65:
            boolean r0 = r4 instanceof com.facebook.aura.network.transport.HatchWsEvent.Closed
            if (r0 == 0) goto L84
            r0 = r4
            com.facebook.aura.network.transport.HatchWsEvent$Closed r0 = (com.facebook.aura.network.transport.HatchWsEvent.Closed) r0
            java.lang.String r2 = r0.reason
            java.lang.String r0 = "Scoped Noise VM probe closed before ready for "
            java.lang.StringBuilder r1 = X.C3cI.A0x(r0, r3)
            java.lang.String r0 = ": "
            r1.append(r0)
            r1.append(r2)
        L7c:
            java.lang.String r0 = r1.toString()
            X.CFK.A06(r5, r0)
            return r4
        L84:
            java.lang.String r0 = "Timed out waiting for scoped Noise VM probe channel for "
            java.lang.StringBuilder r1 = X.C3cI.A0x(r0, r3)
            goto L7c
        L8b:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.network.transport.tigon.ScopedNoiseIdentityProbeKt.awaitNoiseTerminalEvent(com.facebook.aura.network.transport.HatchWebSocketSession, java.lang.String, X.HtJ):java.lang.Object");
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

    public static final String encodeQueryComponent(String str) {
        return C6tn.A06(str, DCl.A05.name());
    }

    public static final boolean isSupportedVmProbe(HatchHttpRequest hatchHttpRequest) {
        if (hatchHttpRequest.method == HatchHttpMethod.GET) {
            try {
                String path = new URI(hatchHttpRequest.url).getPath();
                if (path == null) {
                    path = "";
                }
                String strA0Z = C7BY.A0Z(path, '/');
                C7384Etj.A0Y(strA0Z, 0);
                if (strA0Z.endsWith("/identity") || strA0Z.endsWith("/health")) {
                    return true;
                }
            } catch (Exception unused) {
                return false;
            }
        }
        return false;
    }

    public static final Map<String, String> noiseHandshakeHeaders(String str) {
        return AGH.A02(AnonymousClass006.A10("Authorization", FGI.A0M("Bearer ", str)), noiseConnectHeaders("identity-probe"));
    }

    public static final HatchHttpResponse withBody(HatchHttpResponse hatchHttpResponse, ByteArrayInputStream byteArrayInputStream) {
        return HatchHttpResponse.Companion.of(hatchHttpResponse.statusCode, hatchHttpResponse.statusMessage, hatchHttpResponse.headers, byteArrayInputStream, hatchHttpResponse.errorMessage, hatchHttpResponse.isSuccessful, hatchHttpResponse.cacheStatus, hatchHttpResponse.cause);
    }

    public static final HatchHttpResponse notifyObserver(HatchHttpResponse hatchHttpResponse, int i, HatchVmProbeResponseObserver hatchVmProbeResponseObserver) {
        byte[] bArrBodyBytes = hatchHttpResponse.bodyBytes();
        if (bArrBodyBytes == null) {
            hatchVmProbeResponseObserver.onResponse(i, hatchHttpResponse);
            return hatchHttpResponse;
        }
        hatchVmProbeResponseObserver.onResponse(i, withBody(hatchHttpResponse, new ByteArrayInputStream(bArrBodyBytes)));
        return withBody(hatchHttpResponse, new ByteArrayInputStream(bArrBodyBytes));
    }

    public static final String vmUrlWithAuthToken(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        String strA0l = AnonymousClass002.A0l(str);
        String strA0l2 = AnonymousClass002.A0l(str2);
        return strA0l2.length() != 0 ? urlWithQueryParameter(strA0l, "auth_token", strA0l2) : strA0l;
    }
}
