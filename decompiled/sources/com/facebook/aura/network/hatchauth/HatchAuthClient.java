package com.facebook.aura.network.hatchauth;

import X.AIW;
import X.C0924AIa;
import X.C3cG;
import X.C60O;
import X.C7BY;
import X.FGI;
import X.HtJ;
import X.HzP;
import com.facebook.aura.network.AuraHttpResponse;
import com.facebook.aura.network.api.StefiHatchPath;
import com.facebook.aura.network.sandbox.AuraSandbox;
import com.facebook.aura.network.transport.HatchHttpClient;
import com.facebook.aura.network.transport.HatchHttpRequest;
import com.facebook.aura.network.transport.HatchRequestBody;
import com.facebook.aura.network.transport.HatchRequestPriorityPolicyKt;
import com.facebook.aura.network.transport.HatchRequestPurpose;
import com.facebook.aura.network.transport.HatchResponseBodyPolicy;
import com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class HatchAuthClient {
    public static final String ACCEPT_HEADER = "Accept";
    public static final String ACCEPT_JSON = "application/json";
    public static final String API_VERSION = "1.0.0";
    public static final String API_VERSION_HEADER = "X-API-Version";
    public static final String AUTHORIZATION_HEADER = "Authorization";
    public static final String CONTENT_TYPE = "application/json; charset=utf-8";
    public static final HatchAuthClient INSTANCE = new HatchAuthClient();
    public static final HatchHttpClient httpClient = C60O.A07();

    @DebugMetadata(c = "com.facebook.aura.network.hatchauth.HatchAuthClient", f = "HatchAuthClient.kt", l = {HatchIdeaShareImageRenderer.TEXT_LEFT}, m = "execute", v = 2)
    /* renamed from: com.facebook.aura.network.hatchauth.HatchAuthClient$execute$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchAuthClient.this.execute(null, this);
        }
    }

    private final String buildUrl(StefiHatchPath stefiHatchPath) {
        AuraSandbox auraSandbox = AuraSandbox.INSTANCE;
        return auraSandbox.rewriteUrl(FGI.A0M("https://hatch-api.meta.ai", stefiHatchPath.getValue()), auraSandbox.getHttpHost());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object execute(com.facebook.aura.network.transport.HatchHttpRequest r10, X.HtJ<? super com.facebook.aura.network.AuraHttpResponse> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.facebook.aura.network.hatchauth.HatchAuthClient.AnonymousClass1
            if (r0 == 0) goto L34
            r3 = r11
            com.facebook.aura.network.hatchauth.HatchAuthClient$execute$1 r3 = (com.facebook.aura.network.hatchauth.HatchAuthClient.AnonymousClass1) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L34
            int r2 = r2 - r1
            r3.label = r2
        L12:
            java.lang.Object r1 = r3.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r3.label
            r2 = 1
            if (r0 == 0) goto L23
            if (r0 != r2) goto L6c
            X.Hwg.A00(r1)
        L20:
            com.facebook.aura.network.transport.HatchHttpResponse r1 = (com.facebook.aura.network.transport.HatchHttpResponse) r1
            goto L3a
        L23:
            X.Hwg.A00(r1)
            com.facebook.aura.network.transport.HatchHttpClient r1 = com.facebook.aura.network.hatchauth.HatchAuthClient.httpClient
            r0 = 0
            r3.L$0 = r0
            r3.label = r2
            java.lang.Object r1 = r1.execute(r10, r3)
            if (r1 != r4) goto L20
            return r4
        L34:
            com.facebook.aura.network.hatchauth.HatchAuthClient$execute$1 r3 = new com.facebook.aura.network.hatchauth.HatchAuthClient$execute$1
            r3.<init>(r11)
            goto L12
        L3a:
            byte[] r0 = r1.bodyBytes()     // Catch: java.io.IOException -> L59
            int r5 = r1.statusCode
            java.util.Map<java.lang.String, java.lang.String> r6 = r1.headers
            if (r0 == 0) goto L57
            java.io.ByteArrayInputStream r7 = new java.io.ByteArrayInputStream
            r7.<init>(r0)
        L49:
            java.lang.String r8 = r1.errorMessage
            boolean r9 = r1.isSuccessful
            java.lang.String r10 = r1.statusMessage
            java.lang.Throwable r11 = r1.cause
            com.facebook.aura.network.AuraHttpResponse r4 = new com.facebook.aura.network.AuraHttpResponse
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            return r4
        L57:
            r7 = 0
            goto L49
        L59:
            r8 = move-exception
            int r2 = r1.statusCode
            java.util.Map<java.lang.String, java.lang.String> r3 = r1.headers
            java.lang.String r5 = r8.getMessage()
            java.lang.String r7 = r1.statusMessage
            r4 = 0
            r6 = 0
            com.facebook.aura.network.AuraHttpResponse r1 = new com.facebook.aura.network.AuraHttpResponse
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r1
        L6c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.network.hatchauth.HatchAuthClient.execute(com.facebook.aura.network.transport.HatchHttpRequest, X.HtJ):java.lang.Object");
    }

    public final Object post(StefiHatchPath stefiHatchPath, byte[] bArr, String str, HtJ<? super AuraHttpResponse> htJ) {
        return execute(HatchHttpRequest.Companion.post(buildUrl(stefiHatchPath), new HatchRequestBody.Bytes(bArr, "application/json; charset=utf-8"), headers(str), null, null, null, HatchRequestPriorityPolicyKt.categoryFor(stefiHatchPath), HatchRequestPurpose.FETCH, null, false, false, true, HatchResponseBodyPolicy.DEFAULT, null, false, true), htJ);
    }

    private final Map<String, String> headers(String str) {
        C0924AIa c0924AIaA0u = C3cG.A0u();
        c0924AIaA0u.put("Accept", "application/json");
        c0924AIaA0u.put("X-API-Version", "1.0.0");
        if (str != null && !C7BY.A0j(str)) {
            c0924AIaA0u.put("Authorization", FGI.A0M("Bearer ", str));
        }
        return AIW.A0K(c0924AIaA0u);
    }
}
