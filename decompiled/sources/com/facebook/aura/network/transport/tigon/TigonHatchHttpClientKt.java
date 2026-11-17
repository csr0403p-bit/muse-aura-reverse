package com.facebook.aura.network.transport.tigon;

import X.AGH;
import X.AbstractC0878AGe;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C60Q;
import X.C7384Etj;
import X.C7BY;
import X.C9jH;
import X.C9tI;
import X.DCl;
import X.F0C;
import X.G0U;
import X.InterfaceC10560Hsz;
import com.facebook.aura.executors.AuraExecutors;
import com.facebook.aura.network.transport.HatchAuthScheme;
import com.facebook.aura.network.transport.HatchDuplexResponseHandler;
import com.facebook.aura.network.transport.HatchHttpCacheStatus;
import com.facebook.aura.network.transport.HatchHttpRequestAttemptObserver;
import com.facebook.aura.network.transport.HatchHttpResponse;
import com.facebook.aura.network.transport.HatchHttpsUrlKt;
import com.facebook.aura.network.transport.HatchRequestBody;
import com.facebook.aura.network.transport.tigon.internal.ReplayableBytesBodyProvider;
import com.facebook.aura.network.transport.tigon.internal.TigonMultipartBody;
import com.facebook.tigon.TigonBodyProvider;
import com.facebook.tigon.TigonXplatBodyProvider;
import com.facebook.tigon.iface.TigonErrorCode;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;

/* loaded from: classes5.dex */
public abstract class TigonHatchHttpClientKt {
    public static final String ANALYTICS_TAGS_HEADER = "X-FB-Request-Analytics-Tags";
    public static final String AURA_ANALYTICS_TAGS_VALUE = "{\"network_tags\":{\"product\":\"4331325740476680\"}}";
    public static final String AUTHORIZATION_HEADER = "Authorization";
    public static final String BEARER_PREFIX = "Bearer ";
    public static final String CONTENT_LENGTH_HEADER = "Content-Length";
    public static final String CONTENT_TYPE_HEADER = "Content-Type";
    public static final long DEFAULT_TIMEOUT_MS = 20000;
    public static final String E2E_PROXY_HEADER = "x-fb-e2e-proxy-to";
    public static final String FACEBOOK_HATCH_HOST = "hatch-api.facebook.com";
    public static final String FACEBOOK_HATCH_SANDBOX_PREFIX = "hatch-api.";
    public static final String FACEBOOK_HOST_SUFFIX = ".facebook.com";
    public static final String HTTPS_SCHEME = "https";
    public static final String JSON_CONTENT_TYPE = "application/json; charset=utf-8";
    public static final int MAX_DUPLEX_ERROR_BODY_BYTES = 65536;
    public static final String OD_HOST_LABEL = "od";

    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.network.transport.HatchHttpResponse toHatchHttpResponse(X.C4086Clj r15, long r16) {
        /*
            r2 = r15
            com.facebook.tigon.TigonError r1 = r15.A00
            if (r1 == 0) goto L38
            java.lang.String r8 = r1.A01
            int r0 = r8.length()
            if (r0 != 0) goto L11
            java.lang.String r8 = r1.A00()
        L11:
            com.facebook.tigon.iface.TigonErrorCode r0 = r1.category
            throwIfCancel(r0, r8)
            com.facebook.aura.network.transport.HatchHttpResponse$Companion r3 = com.facebook.aura.network.transport.HatchHttpResponse.Companion
            X.CYF r0 = r15.A01
            if (r0 == 0) goto L36
            int r4 = r0.A00
            java.util.Map<java.lang.String, java.lang.String> r6 = r0.A01
            if (r6 != 0) goto L26
        L22:
            X.9jH r6 = X.AGH.A0E()
        L26:
            com.facebook.aura.network.transport.tigon.TigonTransportException r11 = new com.facebook.aura.network.transport.tigon.TigonTransportException
            r11.<init>(r8, r1)
        L2b:
            r7 = 0
            java.lang.String r5 = ""
            r9 = 0
            com.facebook.aura.network.transport.HatchHttpCacheStatus r10 = com.facebook.aura.network.transport.HatchHttpCacheStatus.NETWORK
        L31:
            com.facebook.aura.network.transport.HatchHttpResponse r0 = r3.of(r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
        L36:
            r4 = -1
            goto L22
        L38:
            X.CYF r0 = r15.A01
            if (r0 == 0) goto L5e
            int r4 = r0.A00
            java.util.Map<java.lang.String, java.lang.String> r6 = r0.A01
            if (r6 != 0) goto L46
        L42:
            X.9jH r6 = X.AGH.A0E()
        L46:
            long r14 = advertisedContentLength(r6)
            r12 = r16
            int r0 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r0 <= 0) goto L60
            r16 = 1
            com.facebook.aura.network.api.ByteLimitExceededException r11 = new com.facebook.aura.network.api.ByteLimitExceededException
            r11.<init>(r12, r14, r16)
            com.facebook.aura.network.transport.HatchHttpResponse$Companion r3 = com.facebook.aura.network.transport.HatchHttpResponse.Companion
            java.lang.String r8 = r11.getMessage()
            goto L2b
        L5e:
            r4 = -1
            goto L42
        L60:
            com.facebook.aura.network.transport.HatchHttpResponse$Companion r3 = com.facebook.aura.network.transport.HatchHttpResponse.Companion
            java.io.InputStream r2 = r2.A03
            if (r2 == 0) goto L7d
            r0 = -1
            java.io.InputStream r7 = com.facebook.aura.network.api.HttpResponseBytesKt.withByteLimit(r2, r12, r0)
        L6c:
            r0 = 200(0xc8, float:2.8E-43)
            if (r0 > r4) goto L75
            r0 = 300(0x12c, float:4.2E-43)
            r9 = 1
            if (r4 < r0) goto L76
        L75:
            r9 = 0
        L76:
            r8 = 0
            java.lang.String r5 = ""
            com.facebook.aura.network.transport.HatchHttpCacheStatus r10 = com.facebook.aura.network.transport.HatchHttpCacheStatus.NETWORK
            r11 = r8
            goto L31
        L7d:
            r7 = 0
            goto L6c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.network.transport.tigon.TigonHatchHttpClientKt.toHatchHttpResponse(X.Clj, long):com.facebook.aura.network.transport.HatchHttpResponse");
    }

    public static final HatchHttpResponse transportFailureResponse(Throwable th) {
        C7384Etj.A0Y(th, 0);
        HatchHttpResponse.Companion companion = HatchHttpResponse.Companion;
        C9jH c9jHA0E = AGH.A0E();
        String message = th.getMessage();
        if (message == null) {
            message = C3cI.A0Y(th);
        }
        return companion.of(-1, "", c9jHA0E, null, message, false, HatchHttpCacheStatus.NETWORK, th);
    }

    /* loaded from: classes3.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HatchAuthScheme.values().length];
            try {
                AnonymousClass002.A13(HatchAuthScheme.META_BEARER, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(HatchAuthScheme.META_UNAUTH, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(HatchAuthScheme.VM_JWT, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final TigonBodyProvider chunkedProvider(byte[] bArr) {
        TigonXplatBodyProvider tigonXplatBodyProvider = TigonXplatBodyProvider.$redex_init_class;
        return new ReplayableBytesBodyProvider(bArr, F0C.A06(AuraExecutors.fileUploadStreamingExecutor$delegate));
    }

    public static /* synthetic */ void completeDuplexFailure$default(InterfaceC10560Hsz interfaceC10560Hsz, HatchDuplexResponseHandler hatchDuplexResponseHandler, Throwable th, int i, Map map, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            i = -1;
        }
        completeDuplexFailure(interfaceC10560Hsz, hatchDuplexResponseHandler, th, i, C3cH.A0o(map, i2 & 16));
    }

    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [com.facebook.aura.network.transport.HatchRequestBody$Multipart, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v12 */
    public static final EncodedBody encodeBody(HatchRequestBody hatchRequestBody) {
        byte[] bytes;
        String str;
        ?? r0;
        if (hatchRequestBody instanceof HatchRequestBody.Empty) {
            return new EncodedBody(null, null, null, null);
        }
        if (hatchRequestBody instanceof HatchRequestBody.Bytes) {
            HatchRequestBody.Bytes bytes2 = (HatchRequestBody.Bytes) hatchRequestBody;
            bytes = bytes2.bytes;
            str = bytes2.contentType;
        } else {
            if (hatchRequestBody instanceof HatchRequestBody.Json) {
                bytes = ((HatchRequestBody.Json) hatchRequestBody).value.getBytes(DCl.A05);
                r0 = 0;
                str = "application/json; charset=utf-8";
                return new EncodedBody(bytes, str, r0, r0);
            }
            if (!(hatchRequestBody instanceof HatchRequestBody.Multipart)) {
                throw new NoWhenBranchMatchedException();
            }
            HatchRequestBody.Multipart multipart = (HatchRequestBody.Multipart) hatchRequestBody;
            boolean zIsEmpty = multipart.fileParts.isEmpty();
            TigonMultipartBody tigonMultipartBody = TigonMultipartBody.INSTANCE;
            if (!zIsEmpty) {
                String strGenerateBoundary = tigonMultipartBody.generateBoundary();
                return new EncodedBody(null, tigonMultipartBody.contentTypeFor(strGenerateBoundary), multipart, strGenerateBoundary);
            }
            TigonMultipartBody.Encoded encodedEncode = tigonMultipartBody.encode(multipart);
            bytes = encodedEncode.bytes;
            str = encodedEncode.contentType;
        }
        r0 = 0;
        return new EncodedBody(bytes, str, r0, r0);
    }

    public static final void safeNotify(HatchHttpRequestAttemptObserver hatchHttpRequestAttemptObserver, G0U<? super HatchHttpRequestAttemptObserver, Unit> g0u) {
        if (hatchHttpRequestAttemptObserver != null) {
            try {
                g0u.invoke(hatchHttpRequestAttemptObserver);
            } catch (Throwable th) {
                C3cG.A0s(th);
            }
        }
    }

    public static final long advertisedContentLength(Map<String, String> map) {
        Map.Entry<String, String> next;
        String value;
        Long lA0s;
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            String key = next.getKey();
            if (key != null && key.equalsIgnoreCase("Content-Length")) {
                break;
            }
        }
        Map.Entry<String, String> entry = next;
        if (entry == null || (value = entry.getValue()) == null || (lA0s = C9tI.A0s(value)) == null) {
            return -1L;
        }
        return lA0s.longValue();
    }

    public static final boolean allowsExplicitBearerFor(HatchAuthScheme hatchAuthScheme, String str) {
        int iOrdinal = hatchAuthScheme.ordinal();
        if (iOrdinal == 1) {
            return true;
        }
        if (iOrdinal == 2) {
            return isFacebookHatchHost(str);
        }
        if (iOrdinal != 0) {
            throw C3cG.A0q();
        }
        return false;
    }

    public static final void completeDuplexFailure(InterfaceC10560Hsz<HatchHttpResponse> interfaceC10560Hsz, HatchDuplexResponseHandler hatchDuplexResponseHandler, Throwable th, int i, Map<String, String> map) {
        if (interfaceC10560Hsz.AOG()) {
            return;
        }
        HatchHttpResponse.Companion companion = HatchHttpResponse.Companion;
        String message = th.getMessage();
        if (message == null) {
            message = C3cI.A0Y(th);
        }
        HatchHttpResponse hatchHttpResponseOf = companion.of(i, "", map, null, message, false, HatchHttpCacheStatus.NETWORK, th);
        hatchDuplexResponseHandler.onComplete(hatchHttpResponseOf);
        C3cG.A1F(interfaceC10560Hsz, hatchHttpResponseOf);
    }

    public static final boolean hasExpectedHttpsHost(String str, String str2) {
        String strHttpsHostOrNull;
        return (C7BY.A0j(str2) || (strHttpsHostOrNull = HatchHttpsUrlKt.httpsHostOrNull(str)) == null || !strHttpsHostOrNull.equalsIgnoreCase(str2)) ? false : true;
    }

    public static final boolean isFacebookHatchHost(String str) {
        String strA0g = C60Q.A0g(str);
        if (!strA0g.equals(FACEBOOK_HATCH_HOST)) {
            if (strA0g.startsWith(FACEBOOK_HATCH_SANDBOX_PREFIX) && strA0g.endsWith(".facebook.com")) {
                List listA0h = C7BY.A0h(strA0g.substring(10, strA0g.length() - 13), new char[1], '.');
                if (listA0h.size() != 1 || ((CharSequence) AbstractC0878AGe.A0J(listA0h)).length() <= 0) {
                    if (listA0h.size() == 2 && ((CharSequence) AbstractC0878AGe.A0F(listA0h)).length() > 0 && C7384Etj.areEqual(AbstractC0878AGe.A0H(listA0h), OD_HOST_LABEL)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static final void throwIfCancel(TigonErrorCode tigonErrorCode, String str) {
        AnonymousClass003.A0u(tigonErrorCode, str);
        if (tigonErrorCode == TigonErrorCode.A04) {
            throw new CancellationException(str);
        }
    }
}
