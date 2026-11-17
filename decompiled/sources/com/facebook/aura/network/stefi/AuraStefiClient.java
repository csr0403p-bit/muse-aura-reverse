package com.facebook.aura.network.stefi;

import X.AGH;
import X.AIW;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C0881AGi;
import X.C0924AIa;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C60Q;
import X.DCl;
import X.FGI;
import X.HtJ;
import X.HzP;
import com.facebook.aura.checkpoint.HatchCheckpointRepository;
import com.facebook.aura.json.HatchProblemJson;
import com.facebook.aura.json.HatchProblemJsonKt;
import com.facebook.aura.main.AuraDeeplinkHandlerActivity;
import com.facebook.aura.network.AuraAcceptLanguage;
import com.facebook.aura.network.AuraHttpResponse;
import com.facebook.aura.network.api.StefiHatchPath;
import com.facebook.aura.network.api.StefiMusePath;
import com.facebook.aura.network.api.StefiPath;
import com.facebook.aura.network.sandbox.AuraSandbox;
import com.facebook.aura.network.transport.HatchAuthScheme;
import com.facebook.aura.network.transport.HatchHttpCachePolicy;
import com.facebook.aura.network.transport.HatchHttpClient;
import com.facebook.aura.network.transport.HatchHttpRequest;
import com.facebook.aura.network.transport.HatchHttpRequestAttemptObserverFactory;
import com.facebook.aura.network.transport.HatchMultipartFilePart;
import com.facebook.aura.network.transport.HatchMultipartPart;
import com.facebook.aura.network.transport.HatchRequestBody;
import com.facebook.aura.network.transport.HatchRequestCategory;
import com.facebook.aura.network.transport.HatchRequestPriorityPolicyKt;
import com.facebook.aura.network.transport.HatchRequestPurpose;
import com.facebook.aura.network.transport.HatchResponseBodyPolicy;
import com.facebook.aura.network.transport.HatchTransport;
import com.facebook.aura.opengraph.HatchOpenGraphRepository;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class AuraStefiClient {
    public static final String ACCEPT_HEADER = "Accept";
    public static final String ACCEPT_JSON = "application/json";
    public static final String API_VERSION = "1.0.0";
    public static final String API_VERSION_HEADER = "X-API-Version";
    public static final String AUTH_PATH_PREFIX = "/hatch/auth";
    public static final String CHECKPOINT_REQUIRED_TYPE = "checkpointRequired";
    public static final String DEFAULT_CONTENT_TYPE = "application/json; charset=utf-8";
    public static final int HTTP_FORBIDDEN = 403;
    public static final int HTTP_UNAUTHORIZED = 401;
    public static final String SESSION_INVALID_PROBLEM_TYPE = "session_invalid";
    public static final AuraStefiClient INSTANCE = new AuraStefiClient();
    public static final HatchHttpClient httpClient = HatchTransport.INSTANCE.httpClient(HatchAuthScheme.META_BEARER);

    @DebugMetadata(c = "com.facebook.aura.network.stefi.AuraStefiClient", f = "AuraStefiClient.kt", l = {232, 239, 249, 257, 268}, m = "execute", v = 2)
    /* renamed from: com.facebook.aura.network.stefi.AuraStefiClient$execute$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraStefiClient.this.execute(null, null, false, null, this);
        }
    }

    /* renamed from: com.facebook.aura.network.stefi.AuraStefiClient$execute$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements Function0<Boolean> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return AnonymousClass001.A0i();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return AnonymousClass001.A0i();
        }
    }

    /* renamed from: com.facebook.aura.network.stefi.AuraStefiClient$postMultipart$2, reason: invalid class name and case insensitive filesystem */
    public final class C127242 extends AbstractC7559F3s implements Function0<Boolean> {
        public static final C127242 INSTANCE = new C127242();

        public C127242() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return AnonymousClass001.A0i();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return AnonymousClass001.A0i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0192, code lost:
    
        if (r0 == r8) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0071 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object execute(com.facebook.aura.network.transport.HatchHttpRequest r11, com.facebook.aura.network.api.StefiPath r12, boolean r13, kotlin.jvm.functions.Function0<java.lang.Boolean> r14, X.HtJ<? super com.facebook.aura.network.AuraHttpResponse> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.network.stefi.AuraStefiClient.execute(com.facebook.aura.network.transport.HatchHttpRequest, com.facebook.aura.network.api.StefiPath, boolean, kotlin.jvm.functions.Function0, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object execute$default(AuraStefiClient auraStefiClient, HatchHttpRequest hatchHttpRequest, StefiPath stefiPath, boolean z, Function0 function0, HtJ htJ, int i, Object obj) {
        boolean zA1Q = C60Q.A1Q(i & 4, z);
        if ((i & 8) != 0) {
            function0 = AnonymousClass2.INSTANCE;
        }
        return auraStefiClient.execute(hatchHttpRequest, stefiPath, zA1Q, function0, htJ);
    }

    public static /* synthetic */ Object get$default(AuraStefiClient auraStefiClient, StefiPath stefiPath, String str, Map map, Long l, Long l2, Map map2, HtJ htJ, int i, Object obj) {
        Map<String, String> mapA0o = C3cH.A0o(map, i & 4);
        if ((i & 8) != 0) {
            l = null;
        }
        if ((i & 16) != 0) {
            l2 = null;
        }
        return auraStefiClient.get(stefiPath, str, mapA0o, l, l2, C3cH.A0o(map2, i & 32), htJ);
    }

    public static /* synthetic */ Object patch$default(AuraStefiClient auraStefiClient, StefiPath stefiPath, byte[] bArr, Map map, boolean z, HatchHttpRequestAttemptObserverFactory hatchHttpRequestAttemptObserverFactory, HtJ htJ, int i, Object obj) {
        Map<String, String> mapA0o = C3cH.A0o(map, i & 4);
        boolean zA1Q = C60Q.A1Q(i & 8, z);
        if ((i & 16) != 0) {
            hatchHttpRequestAttemptObserverFactory = null;
        }
        return auraStefiClient.patch(stefiPath, bArr, mapA0o, zA1Q, hatchHttpRequestAttemptObserverFactory, htJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object post$default(AuraStefiClient auraStefiClient, StefiPath stefiPath, String str, byte[] bArr, Map map, String str2, Long l, boolean z, HatchHttpRequestAttemptObserverFactory hatchHttpRequestAttemptObserverFactory, boolean z2, HtJ htJ, int i, Object obj) {
        if ((i & 8) != 0) {
            map = AGH.A0E();
        }
        if ((i & 16) != 0) {
            str2 = "application/json; charset=utf-8";
        }
        if ((i & 32) != 0) {
            l = null;
        }
        boolean zA1Q = C60Q.A1Q(i & 64, z);
        if ((i & 128) != 0) {
            hatchHttpRequestAttemptObserverFactory = null;
        }
        return auraStefiClient.post(stefiPath, str, bArr, map, str2, l, zA1Q, hatchHttpRequestAttemptObserverFactory, C3cG.A1K(i & 256, z2), htJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object postMultipart$default(AuraStefiClient auraStefiClient, StefiPath stefiPath, String str, List list, List list2, Map map, boolean z, boolean z2, boolean z3, Function0 function0, HtJ htJ, int i, Object obj) {
        if ((i & 8) != 0) {
            list2 = C0881AGi.A00;
        }
        if ((i & 16) != 0) {
            map = AGH.A0E();
        }
        boolean zA1Q = C60Q.A1Q(i & 32, z);
        boolean zA1Q2 = C60Q.A1Q(i & 64, z2);
        boolean zA1Q3 = C60Q.A1Q(i & 128, z3);
        if ((i & 256) != 0) {
            function0 = C127242.INSTANCE;
        }
        return auraStefiClient.postMultipart(stefiPath, str, list, list2, map, zA1Q, zA1Q2, zA1Q3, function0, htJ);
    }

    public final Object delete(StefiPath stefiPath, String str, Map<String, String> map, HtJ<? super AuraHttpResponse> htJ) {
        return execute(HatchHttpRequest.Companion.delete(buildUrl(stefiPath, AGH.A0E()), HatchRequestBody.Empty.INSTANCE, baseHeaders(map), null, null, null, HatchRequestPriorityPolicyKt.categoryFor(stefiPath), HatchRequestPurpose.FETCH, HatchResponseBodyPolicy.DEFAULT), stefiPath, true, AnonymousClass2.INSTANCE, htJ);
    }

    public final Object get(StefiPath stefiPath, String str, Map<String, String> map, Long l, Long l2, Map<String, String> map2, HtJ<? super AuraHttpResponse> htJ) {
        HatchHttpCachePolicy hatchHttpCachePolicy;
        HatchHttpRequest.Companion companion = HatchHttpRequest.Companion;
        String strBuildUrl = buildUrl(stefiPath, map2);
        Map<String, String> mapBaseHeaders = baseHeaders(map);
        HatchRequestCategory hatchRequestCategoryCategoryFor = HatchRequestPriorityPolicyKt.categoryFor(stefiPath);
        if (l != null) {
            long jLongValue = l.longValue();
            hatchHttpCachePolicy = new HatchHttpCachePolicy(jLongValue, jLongValue, null, 1048576L, false);
        } else {
            hatchHttpCachePolicy = null;
        }
        return execute(companion.get(strBuildUrl, mapBaseHeaders, l2, l2, l2, hatchRequestCategoryCategoryFor, HatchRequestPurpose.FETCH, hatchHttpCachePolicy, false, false, HatchResponseBodyPolicy.DEFAULT), stefiPath, true, AnonymousClass2.INSTANCE, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean hasAuth() {
        /*
            r1 = this;
            com.facebook.aura.auth.AuraSessionManager r0 = com.facebook.aura.auth.AuraSessionManager.INSTANCE
            X.CGz r0 = r0.getCurrentSession()
            if (r0 == 0) goto L19
            X.CH0 r0 = (X.CH0) r0
            X.CGy r0 = X.CH0.A01(r0)
            java.lang.String r0 = r0.A04
            if (r0 == 0) goto L19
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L1a
        L19:
            r0 = 1
        L1a:
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.network.stefi.AuraStefiClient.hasAuth():boolean");
    }

    public final Object patch(StefiPath stefiPath, byte[] bArr, Map<String, String> map, boolean z, HatchHttpRequestAttemptObserverFactory hatchHttpRequestAttemptObserverFactory, HtJ<? super AuraHttpResponse> htJ) {
        return execute(HatchHttpRequest.Companion.patch(buildUrl(stefiPath, AGH.A0E()), new HatchRequestBody.Bytes(bArr, "application/json; charset=utf-8"), baseHeaders(map), null, null, null, HatchRequestPriorityPolicyKt.categoryFor(stefiPath), HatchRequestPurpose.FETCH, HatchResponseBodyPolicy.DEFAULT, z, hatchHttpRequestAttemptObserverFactory), stefiPath, true, AnonymousClass2.INSTANCE, htJ);
    }

    public final Object post(StefiPath stefiPath, String str, byte[] bArr, Map<String, String> map, String str2, Long l, boolean z, HatchHttpRequestAttemptObserverFactory hatchHttpRequestAttemptObserverFactory, boolean z2, HtJ<? super AuraHttpResponse> htJ) {
        return execute(HatchHttpRequest.Companion.post(buildUrl(stefiPath, AGH.A0E()), new HatchRequestBody.Bytes(bArr, str2), baseHeaders(map), l, l, l, HatchRequestPriorityPolicyKt.categoryFor(stefiPath), HatchRequestPurpose.FETCH, null, false, false, z, HatchResponseBodyPolicy.DEFAULT, hatchHttpRequestAttemptObserverFactory, z2, true), stefiPath, true, AnonymousClass2.INSTANCE, htJ);
    }

    public final Object postMultipart(StefiPath stefiPath, String str, List<HatchMultipartPart> list, List<HatchMultipartFilePart> list2, Map<String, String> map, boolean z, boolean z2, boolean z3, Function0<Boolean> function0, HtJ<? super AuraHttpResponse> htJ) {
        return execute(HatchHttpRequest.Companion.post(buildUrl(stefiPath, AGH.A0E()), new HatchRequestBody.Multipart(list, list2), baseHeaders(map), null, null, null, HatchRequestPriorityPolicyKt.categoryFor(stefiPath), HatchRequestPurpose.FETCH, null, false, false, z2, HatchResponseBodyPolicy.DEFAULT, null, false, z3), stefiPath, z, function0, htJ);
    }

    private final Map<String, String> baseHeaders(Map<String, String> map) {
        C0924AIa c0924AIaA0u = C3cG.A0u();
        c0924AIaA0u.put("Accept", "application/json");
        c0924AIaA0u.put("X-API-Version", "1.0.0");
        c0924AIaA0u.put(AuraAcceptLanguage.HEADER, AuraAcceptLanguage.INSTANCE.headerValue());
        c0924AIaA0u.putAll(map);
        return AIW.A0K(c0924AIaA0u);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String buildUrl(StefiPath stefiPath, Map<String, String> map) {
        String str;
        String value = stefiPath.getValue();
        if (stefiPath instanceof StefiHatchPath) {
            str = "https://hatch-api.meta.ai";
        } else {
            if (!(stefiPath instanceof StefiMusePath)) {
                throw C3cG.A0q();
            }
            str = "https://api.muse.ai";
        }
        if (!C60O.A1X(value, AuraDeeplinkHandlerActivity.HTTP)) {
            value = FGI.A0M(str, value);
        }
        String strA0L = AbstractC0878AGe.A0L("&", map.isEmpty() ? "" : HatchOpenGraphRepository.UNKNOWN_HOST, "", map.entrySet(), AuraStefiClient$buildUrl$query$1.INSTANCE);
        AuraSandbox auraSandbox = AuraSandbox.INSTANCE;
        return auraSandbox.rewriteUrl(FGI.A0M(value, strA0L), auraSandbox.getHttpHost());
    }

    private final void reportCheckpointIfBlocked(StefiPath stefiPath, byte[] bArr, AbstractC3358CGz abstractC3358CGz) {
        HatchProblemJson hatchProblemJsonHatchProblemOf;
        if (C60O.A1X(stefiPath.getValue(), AUTH_PATH_PREFIX) || (hatchProblemJsonHatchProblemOf = HatchProblemJsonKt.hatchProblemOf(new String(bArr, DCl.A05))) == null || !"checkpointRequired".equals(hatchProblemJsonHatchProblemOf.type)) {
            return;
        }
        HatchCheckpointRepository.Companion.getInstance(abstractC3358CGz).onBlocked(hatchProblemJsonHatchProblemOf.checkpoint_url);
    }
}
