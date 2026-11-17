package com.facebook.aura.spaces.preload;

import X.ADq;
import X.AGH;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.BFI;
import X.C06H;
import X.C2nw;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C60O;
import X.C60Q;
import X.C6t6;
import X.C7384Etj;
import X.C78W;
import X.C7BY;
import X.C7qW;
import X.C9oY;
import X.C9sR;
import X.C9sU;
import X.CFK;
import X.EnumC10460Hji;
import X.FGI;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HxE;
import X.Hxb;
import android.net.Uri;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import com.facebook.aura.dancingavatars.gating.MC;
import com.facebook.aura.main.AuraDeeplinkHandlerActivity;
import com.facebook.aura.network.transport.HatchHttpClient;
import com.facebook.aura.network.transport.HatchHttpRequest;
import com.facebook.aura.network.transport.HatchHttpResponse;
import com.facebook.aura.spaces.repo.HtmlSpacesWebViewSession;
import com.facebook.aura.spaces.repo.SpacesWebViewSessionKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public final class SpacesActionResponseBridge {
    public static final long ACTION_TIMEOUT_MS = 120000;
    public static final String DEFAULT_CONTENT_TYPE = "application/json";
    public static final String TAG = "SpacesActionResponseBridge";
    public static final String VM_DOMAIN = "metaaivm.com";
    public volatile C6t6 secureWebView;
    public static final Companion Companion = new Companion();
    public static final ADq VALID_STATUS_RANGE = new ADq(200, MC.hatch_android_dancing_avatars.__CONFIG__);
    public static final C9sU JSON = C9sR.A00(SpacesActionResponseBridge$Companion$JSON$1.INSTANCE, C9sU.A03);
    public static final Set<String> STRIPPED_HEADERS = BFI.A0H(new String[]{"authorization", "host", "content-length", "connection", "accept-encoding", "cookie", "content-type"});
    public static final Set<String> RESPONSE_STRIPPED_HEADERS = C60O.A1B("content-length", "content-encoding", "transfer-encoding", "connection");
    public final C3UX scope = C78W.A03();
    public final ConcurrentHashMap.KeySetView<String, Boolean> outstandingRequestIds = ConcurrentHashMap.newKeySet();

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isSpacesVmUrl(String str) {
        try {
            Uri uri = Uri.parse(str);
            String scheme = uri.getScheme();
            String strA0g = scheme != null ? C60Q.A0g(scheme) : null;
            String host = uri.getHost();
            String strA0g2 = host != null ? C60Q.A0g(host) : null;
            String path = uri.getPath();
            if (path == null) {
                path = "";
            }
            if ("https".equals(strA0g) || AuraDeeplinkHandlerActivity.HTTP.equals(strA0g)) {
                if (strA0g2 != null && (strA0g2.equals("metaaivm.com") || strA0g2.endsWith(".metaaivm.com"))) {
                    if (path.startsWith(SpacesWebViewSessionKt.SPACES_ROUTE_PREFIX)) {
                        return true;
                    }
                    if (path.startsWith(SpacesWebViewSessionKt.PEER_SPACES_ROUTE_PREFIX)) {
                        return true;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean validateToken(String str) {
        try {
            C6t6 c6t6 = this.secureWebView;
            if (c6t6 == null || !c6t6.validateJsInterfaceToken(str)) {
                return false;
            }
            return SpacesWebViewSessionKt.isOnGrantedSpaceOrigin(c6t6);
        } catch (RuntimeException e) {
            CFK.A08(TAG, "Exception validating JS bridge token", e);
            return false;
        }
    }

    @JavascriptInterface
    public final void sendRequest(final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final boolean z) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        C7384Etj.A0Y(str6, 5);
        final C6t6 c6t6 = this.secureWebView;
        if (c6t6 != null) {
            c6t6.post(new Runnable() { // from class: com.facebook.aura.spaces.preload.SpacesActionResponseBridge.sendRequest.1

                @DebugMetadata(c = "com.facebook.aura.spaces.preload.SpacesActionResponseBridge$sendRequest$1$1", f = "SpacesActionResponseBridge.kt", l = {110}, m = "invokeSuspend", v = 2)
                /* renamed from: com.facebook.aura.spaces.preload.SpacesActionResponseBridge$sendRequest$1$1, reason: invalid class name and collision with other inner class name */
                public final class C03791 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
                    public final /* synthetic */ String $body;
                    public final /* synthetic */ String $headersJson;
                    public final /* synthetic */ boolean $isBase64;
                    public final /* synthetic */ String $method;
                    public final /* synthetic */ String $requestId;
                    public final /* synthetic */ HtmlSpacesWebViewSession $session;
                    public final /* synthetic */ String $targetUrl;
                    public final /* synthetic */ String $url;
                    public int label;
                    public final /* synthetic */ SpacesActionResponseBridge this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C03791(SpacesActionResponseBridge spacesActionResponseBridge, String str, String str2, String str3, String str4, boolean z, String str5, HtmlSpacesWebViewSession htmlSpacesWebViewSession, String str6, HtJ<? super C03791> htJ) {
                        super(2, htJ);
                        this.this$0 = spacesActionResponseBridge;
                        this.$targetUrl = str;
                        this.$method = str2;
                        this.$headersJson = str3;
                        this.$body = str4;
                        this.$isBase64 = z;
                        this.$url = str5;
                        this.$session = htmlSpacesWebViewSession;
                        this.$requestId = str6;
                    }

                    @Override // X.AbstractC8884Fsp
                    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                        return new C03791(this.this$0, this.$targetUrl, this.$method, this.$headersJson, this.$body, this.$isBase64, this.$url, this.$session, this.$requestId, htJ);
                    }

                    @Override // X.AbstractC8884Fsp
                    public final Object invokeSuspend(Object obj) {
                        String strLoggableSpaceUrl;
                        StringBuilder sbA0x;
                        HatchHttpResponse hatchHttpResponse;
                        int i;
                        int i2;
                        int i3;
                        Function0<Unit> function0;
                        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                        int i4 = this.label;
                        try {
                            if (i4 == 0) {
                                Hwg.A00(obj);
                                HatchHttpClient hatchHttpClientA08 = C60O.A08();
                                HatchHttpRequest hatchHttpRequestBuildRequest = this.this$0.buildRequest(this.$targetUrl, this.$method, this.$headersJson, this.$body, this.$isBase64);
                                this.label = 1;
                                obj = hatchHttpClientA08.execute(hatchHttpRequestBuildRequest, this);
                                if (obj == enumC10460Hji) {
                                    return enumC10460Hji;
                                }
                            } else {
                                if (i4 != 1) {
                                    throw AnonymousClass001.A0n();
                                }
                                Hwg.A00(obj);
                            }
                            hatchHttpResponse = (HatchHttpResponse) obj;
                            if (SpacesWebViewSessionKt.isPeerSpaceOrigin(C60Q.A0h(this.$url)) && SpacesWebViewSessionKt.isPeerSpaceAccessEnded(hatchHttpResponse.statusCode, true) && (function0 = this.$session.onPeerAccessEnded) != null) {
                                function0.invoke();
                            }
                            ADq aDq = SpacesActionResponseBridge.VALID_STATUS_RANGE;
                            i = aDq.A00;
                            i2 = aDq.A01;
                            i3 = hatchHttpResponse.statusCode;
                        } catch (CancellationException e) {
                            throw e;
                        } catch (Exception e2) {
                            e = e2;
                            String strLoggableSpaceUrl2 = SpacesWebViewSessionKt.loggableSpaceUrl(this.$url);
                            strLoggableSpaceUrl = e.getMessage();
                            sbA0x = C3cI.A0x("sendRequest: request failed for ", strLoggableSpaceUrl2);
                            sbA0x.append(": ");
                            CFK.A0A(SpacesActionResponseBridge.TAG, AnonymousClass001.A0v(strLoggableSpaceUrl, sbA0x), e);
                            this.this$0.resolveError(this.$requestId);
                            return Unit.INSTANCE;
                        } catch (OutOfMemoryError e3) {
                            e = e3;
                            strLoggableSpaceUrl = SpacesWebViewSessionKt.loggableSpaceUrl(this.$url);
                            sbA0x = C60O.A0x("sendRequest: ran out of memory for ");
                            CFK.A0A(SpacesActionResponseBridge.TAG, AnonymousClass001.A0v(strLoggableSpaceUrl, sbA0x), e);
                            this.this$0.resolveError(this.$requestId);
                            return Unit.INSTANCE;
                        }
                        if (i > i3 || i3 > i2) {
                            this.this$0.resolveError(this.$requestId);
                            return Unit.INSTANCE;
                        }
                        byte[] bArrBodyBytes = hatchHttpResponse.bodyBytes();
                        if (bArrBodyBytes == null) {
                            bArrBodyBytes = new byte[0];
                        }
                        SpacesActionResponseBridge spacesActionResponseBridge = this.this$0;
                        String str = this.$requestId;
                        int i5 = hatchHttpResponse.statusCode;
                        String str2 = hatchHttpResponse.statusMessage;
                        String strBuildResponseHeadersJson = spacesActionResponseBridge.buildResponseHeadersJson(hatchHttpResponse.headers);
                        String strEncodeToString = Base64.encodeToString(bArrBodyBytes, 2);
                        C7384Etj.A0U(strEncodeToString);
                        spacesActionResponseBridge.resolveSuccess(str, i5, str2, strBuildResponseHeadersJson, strEncodeToString, hatchHttpResponse.isSuccessful);
                        return Unit.INSTANCE;
                    }

                    @Override // X.G0V
                    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                        return ((C03791) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    String str7;
                    String gatewaySpaceUrl;
                    if (C7BY.A0j(str2)) {
                        return;
                    }
                    if (this.validateToken(str)) {
                        HtmlSpacesWebViewSession htmlSpacesWebViewSessionSpacesSession = SpacesWebViewSessionKt.spacesSession(c6t6);
                        String str8 = str3;
                        SpacesActionResponseBridge spacesActionResponseBridge = this;
                        if (!C7BY.A0j(str8) && spacesActionResponseBridge.isAllowedSpacesUrl(str8, htmlSpacesWebViewSessionSpacesSession.sourceUrl) && str8 != null && (gatewaySpaceUrl = SpacesWebViewSessionKt.toGatewaySpaceUrl(str8, htmlSpacesWebViewSessionSpacesSession.gatewayBaseUrl)) != null && this.isSpacesVmUrl(gatewaySpaceUrl)) {
                            this.outstandingRequestIds.add(str2);
                            SpacesActionResponseBridge spacesActionResponseBridge2 = this;
                            AnonymousClass001.A1J(new C03791(spacesActionResponseBridge2, gatewaySpaceUrl, str4, str5, str6, z, str3, htmlSpacesWebViewSessionSpacesSession, str2, null), spacesActionResponseBridge2.scope);
                            return;
                        }
                        str7 = "sendRequest: rejecting invalid or non-Spaces-VM url";
                    } else {
                        str7 = "sendRequest: token validation failed";
                    }
                    CFK.A06(SpacesActionResponseBridge.TAG, str7);
                    this.resolveError(str2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.network.transport.HatchHttpRequest buildRequest(java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, boolean r20) {
        /*
            r15 = this;
            r0 = r18
            java.util.Map r5 = r15.parseHeaders(r0)
            java.util.Iterator r3 = X.AnonymousClass002.A0n(r5)
        La:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L59
            java.lang.Object r2 = r3.next()
            r0 = r2
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.String r1 = X.C60O.A0t(r0)
            java.lang.String r0 = "content-type"
            if (r1 == 0) goto La
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto La
        L25:
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            if (r2 == 0) goto L31
            java.lang.Object r4 = r2.getValue()
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L33
        L31:
            java.lang.String r4 = "application/json"
        L33:
            java.util.LinkedHashMap r6 = X.C3cG.A0j()
            java.util.Iterator r3 = X.AnonymousClass002.A0n(r5)
        L3b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L5b
            java.util.Map$Entry r2 = X.C3cH.A0l(r3)
            java.lang.String r0 = X.C60O.A0t(r2)
            java.util.Set<java.lang.String> r1 = com.facebook.aura.spaces.preload.SpacesActionResponseBridge.STRIPPED_HEADERS
            java.lang.String r0 = X.C60Q.A0g(r0)
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L3b
            X.AnonymousClass006.A1R(r6, r2)
            goto L3b
        L59:
            r2 = 0
            goto L25
        L5b:
            r1 = r19
            if (r20 == 0) goto Ld7
            r0 = 2
            byte[] r1 = android.util.Base64.decode(r1, r0)
        L64:
            X.C7384Etj.A0X(r1)
            int r0 = r1.length
            if (r0 != 0) goto Ld1
            com.facebook.aura.network.transport.HatchRequestBody$Empty r7 = com.facebook.aura.network.transport.HatchRequestBody.Empty.INSTANCE
        L6c:
            com.facebook.aura.network.transport.HatchRequestBody r7 = (com.facebook.aura.network.transport.HatchRequestBody) r7
            java.util.Locale r0 = java.util.Locale.US
            X.C7384Etj.A0V(r0)
            r1 = r17
            java.lang.String r2 = r1.toUpperCase(r0)
            int r1 = r2.hashCode()
            r0 = 79599(0x136ef, float:1.11542E-40)
            if (r1 == r0) goto Lc3
            r0 = 75900968(0x4862828, float:3.1540126E-36)
            if (r1 == r0) goto Lb8
            r0 = 2012838315(0x77f979ab, float:1.0119919E34)
            if (r1 != r0) goto Lce
            java.lang.String r0 = "DELETE"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lce
            com.facebook.aura.network.transport.HatchHttpMethod r5 = com.facebook.aura.network.transport.HatchHttpMethod.DELETE
        L96:
            r0 = 120000(0x1d4c0, double:5.9288E-319)
            java.lang.Long r9 = java.lang.Long.valueOf(r0)
            r8 = 0
            com.facebook.aura.network.transport.HatchRequestCategory r11 = com.facebook.aura.network.transport.HatchRequestCategory.API
            com.facebook.aura.network.transport.HatchRequestPurpose r12 = com.facebook.aura.network.transport.HatchRequestPurpose.FETCH
            r14 = 0
            com.facebook.aura.network.transport.HatchResponseBodyPolicy r17 = com.facebook.aura.network.transport.HatchResponseBodyPolicy.DEFAULT
            r20 = 1
            com.facebook.aura.network.transport.HatchHttpRequest r3 = new com.facebook.aura.network.transport.HatchHttpRequest
            r4 = r16
            r10 = r8
            r13 = r8
            r15 = r14
            r16 = r14
            r18 = r8
            r19 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r3
        Lb8:
            java.lang.String r0 = "PATCH"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lce
            com.facebook.aura.network.transport.HatchHttpMethod r5 = com.facebook.aura.network.transport.HatchHttpMethod.PATCH
            goto L96
        Lc3:
            java.lang.String r0 = "PUT"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lce
            com.facebook.aura.network.transport.HatchHttpMethod r5 = com.facebook.aura.network.transport.HatchHttpMethod.PUT
            goto L96
        Lce:
            com.facebook.aura.network.transport.HatchHttpMethod r5 = com.facebook.aura.network.transport.HatchHttpMethod.POST
            goto L96
        Ld1:
            com.facebook.aura.network.transport.HatchRequestBody$Bytes r7 = new com.facebook.aura.network.transport.HatchRequestBody$Bytes
            r7.<init>(r1, r4)
            goto L6c
        Ld7:
            byte[] r1 = X.C3cG.A1S(r1)
            goto L64
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.preload.SpacesActionResponseBridge.buildRequest(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):com.facebook.aura.network.transport.HatchHttpRequest");
    }

    private final void evaluate(final String str) {
        final C6t6 c6t6 = this.secureWebView;
        if (c6t6 != null) {
            c6t6.post(new Runnable() { // from class: com.facebook.aura.spaces.preload.SpacesActionResponseBridge.evaluate.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        c6t6.evaluateJavascript(str, null);
                    } catch (Throwable th) {
                        C3cG.A0s(th);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resolveError(String str) {
        this.outstandingRequestIds.remove(str);
        evaluate(FGI.A0U("window.__fwaSpacesResolveAction(", SpacesWebViewFactoryKt.toJsStringLiteral(str), ",0,\"\",\"{}\",\"\",false,true)"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resolveSuccess(String str, int i, String str2, String str3, String str4, boolean z) {
        this.outstandingRequestIds.remove(str);
        String jsStringLiteral = SpacesWebViewFactoryKt.toJsStringLiteral(str);
        String jsStringLiteral2 = SpacesWebViewFactoryKt.toJsStringLiteral(str2);
        String jsStringLiteral3 = SpacesWebViewFactoryKt.toJsStringLiteral(str3);
        String jsStringLiteral4 = SpacesWebViewFactoryKt.toJsStringLiteral(str4);
        StringBuilder sbA0x = C3cI.A0x("window.__fwaSpacesResolveAction(", jsStringLiteral);
        sbA0x.append(",");
        sbA0x.append(i);
        C60O.A1R(",", jsStringLiteral2, sbA0x);
        sbA0x.append(jsStringLiteral3);
        C60O.A1R(",", jsStringLiteral4, sbA0x);
        sbA0x.append(z);
        evaluate(AnonymousClass001.A0v(",false)", sbA0x));
    }

    public final void close() {
        ConcurrentHashMap.KeySetView<String, Boolean> keySetView = this.outstandingRequestIds;
        C7384Etj.A0T(keySetView);
        List listA0X = AbstractC0878AGe.A0X(keySetView);
        this.outstandingRequestIds.clear();
        Iterator it = listA0X.iterator();
        while (it.hasNext()) {
            String strA0j = AnonymousClass005.A0j(it);
            C7384Etj.A0X(strA0j);
            resolveError(strA0j);
        }
        Hxb.A03(null, this.scope);
        this.secureWebView = null;
    }

    public final boolean getHasOutstandingRequests() {
        C7384Etj.A0T(this.outstandingRequestIds);
        return !r0.isEmpty();
    }

    public final C6t6 getSecureWebView() {
        return this.secureWebView;
    }

    public final void setSecureWebView(C6t6 c6t6) {
        this.secureWebView = c6t6;
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String buildResponseHeadersJson(Map<String, String> map) {
        C2nw c2nwA1K = C60O.A1K();
        Iterator itA0n = AnonymousClass002.A0n(map);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            String strA0t = C60O.A0t(entryA0l);
            String str = (String) entryA0l.getValue();
            if (!RESPONSE_STRIPPED_HEADERS.contains(C60Q.A0g(strA0t))) {
                C7qW.A06(strA0t, str, c2nwA1K);
            }
        }
        return C60O.A0v(c2nwA1K);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isAllowedSpacesUrl(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch: java.lang.Throwable -> L5
            goto La
        L5:
            r0 = move-exception
            X.Hud r5 = X.C3cG.A0s(r0)
        La:
            boolean r0 = r5 instanceof X.C10571Hud
            r4 = 0
            if (r0 == 0) goto L10
            r5 = r4
        L10:
            android.net.Uri r5 = (android.net.Uri) r5
            r3 = 0
            if (r5 == 0) goto L74
            if (r6 == 0) goto L1c
            android.net.Uri r1 = android.net.Uri.parse(r6)     // Catch: java.lang.Throwable -> L1f
            goto L24
        L1c:
            r1 = r4
        L1d:
            r0 = r4
            goto L31
        L1f:
            r0 = move-exception
            X.Hud r1 = X.C3cG.A0s(r0)
        L24:
            boolean r0 = r1 instanceof X.C10571Hud
            if (r0 == 0) goto L29
            r1 = r4
        L29:
            android.net.Uri r1 = (android.net.Uri) r1
            if (r1 == 0) goto L1d
            java.lang.String r0 = r1.getHost()
        L31:
            boolean r0 = com.facebook.aura.spaces.repo.SpacesWebViewSessionKt.isPeerSpaceOrigin(r0)
            java.lang.String r2 = ""
            if (r0 != 0) goto L58
            java.lang.String r0 = r5.getHost()
            boolean r0 = com.facebook.aura.spaces.repo.SpacesWebViewSessionKt.isPeerSpaceOrigin(r0)
            if (r0 != 0) goto L74
            java.lang.String r0 = r5.getPath()
            if (r0 == 0) goto L4a
            r2 = r0
        L4a:
            java.lang.String r1 = "/spaces/v2/"
        L4c:
            r0 = 1
            X.C7384Etj.A0Y(r1, r0)
            boolean r0 = r2.startsWith(r1)
            if (r0 == 0) goto L74
            r3 = 1
            return r3
        L58:
            java.lang.String r0 = r5.getHost()
            if (r1 == 0) goto L62
            java.lang.String r4 = r1.getHost()
        L62:
            boolean r0 = X.C7384Etj.areEqual(r0, r4)
            if (r0 == 0) goto L74
            java.lang.String r0 = r5.getPath()
            if (r0 == 0) goto L6f
            r2 = r0
        L6f:
            java.lang.String r1 = com.facebook.aura.spaces.repo.SpacesWebViewSessionKt.spacesRoutePrefixFor(r6)
            goto L4c
        L74:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.preload.SpacesActionResponseBridge.isAllowedSpacesUrl(java.lang.String, java.lang.String):boolean");
    }

    private final Map<String, String> parseHeaders(String str) {
        if (C7BY.A0j(str)) {
            return AGH.A0E();
        }
        try {
            JsonElement jsonElementA04 = JSON.A04(str);
            JsonObject jsonObject = jsonElementA04 instanceof JsonObject ? (JsonObject) jsonElementA04 : null;
            if (jsonObject == null) {
                return AGH.A0E();
            }
            Set<Map.Entry<String, JsonElement>> setEntrySet = jsonObject.entrySet();
            ArrayList arrayListA0h = C3cG.A0h();
            Iterator<Map.Entry<String, JsonElement>> it = setEntrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(it);
                String strA0t = C60O.A0t(entryA0l);
                String strA04 = C9oY.A04(C9oY.A08((JsonElement) entryA0l.getValue()));
                HxE hxEA0r = strA04 != null ? C3cG.A0r(strA0t, strA04) : null;
                if (hxEA0r != null) {
                    arrayListA0h.add(hxEA0r);
                }
            }
            return AGH.A06(arrayListA0h);
        } catch (Exception e) {
            CFK.A06(TAG, FGI.A0M("parseHeaders failed: ", e.getMessage()));
            return AGH.A0E();
        }
    }
}
