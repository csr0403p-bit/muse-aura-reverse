package com.facebook.aura.network.acs;

import X.AbstractC7559F3s;
import X.C06H;
import X.C7384Etj;
import X.HtJ;
import X.HzP;
import com.facebook.aura.network.transport.HatchAuthScheme;
import com.facebook.aura.network.transport.HatchHttpClient;
import com.facebook.aura.network.transport.HatchTransport;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class OhaiAcsConfigFetcher {
    public static final String CONFIG_URL = "https://meta-ohttp-config-prod.fastly-edge.com/ohai_acs_config.json";
    public static final Companion Companion = new Companion();
    public static final String TAG = "OhaiAcsConfigFetcher";
    public final Function0<HatchHttpClient> httpClientProvider;

    /* renamed from: com.facebook.aura.network.acs.OhaiAcsConfigFetcher$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<HatchHttpClient> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final HatchHttpClient invoke() {
            return HatchTransport.INSTANCE.httpClient(HatchAuthScheme.META_UNAUTH);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ HatchHttpClient invoke() {
            return HatchTransport.INSTANCE.httpClient(HatchAuthScheme.META_UNAUTH);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.network.acs.OhaiAcsConfigFetcher", f = "OhaiAcsConfigFetcher.kt", l = {19}, m = "fetch", v = 2)
    /* renamed from: com.facebook.aura.network.acs.OhaiAcsConfigFetcher$fetch$1, reason: invalid class name and case insensitive filesystem */
    public final class C127121 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public C127121(HtJ<? super C127121> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OhaiAcsConfigFetcher.this.fetch(this);
        }
    }

    public /* synthetic */ OhaiAcsConfigFetcher(Function0 function0, int i, C06H c06h) {
        this((i & 1) != 0 ? AnonymousClass1.INSTANCE : function0);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetch(X.HtJ<? super com.facebook.aura.network.acs.FetchedOhaiAcsConfig> r16) throws java.io.IOException {
        /*
            r15 = this;
            r3 = r16
            boolean r0 = r3 instanceof com.facebook.aura.network.acs.OhaiAcsConfigFetcher.C127121
            if (r0 == 0) goto L7f
            r4 = r3
            com.facebook.aura.network.acs.OhaiAcsConfigFetcher$fetch$1 r4 = (com.facebook.aura.network.acs.OhaiAcsConfigFetcher.C127121) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7f
            int r2 = r2 - r1
            r4.label = r2
        L14:
            java.lang.Object r1 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L55
            if (r0 != r2) goto L8b
            X.Hwg.A00(r1)
        L22:
            com.facebook.aura.network.transport.HatchHttpResponse r1 = (com.facebook.aura.network.transport.HatchHttpResponse) r1
            boolean r0 = r1.isSuccessful
            java.lang.String r3 = "OhaiAcsConfigFetcher"
            r2 = 0
            if (r0 != 0) goto L3b
            int r0 = r1.statusCode
            java.lang.Integer r0 = X.C3cG.A0R(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "Failed to fetch ACS/OHAI config: code=%d"
            X.CFK.A0F(r3, r0, r1)
        L3a:
            return r2
        L3b:
            java.lang.String r1 = r1.bodyString()
            if (r1 == 0) goto L85
            int r0 = r1.length()
            if (r0 == 0) goto L85
            com.facebook.aura.network.acs.OhaiAcsConfigVerifier r0 = com.facebook.aura.network.acs.OhaiAcsConfigVerifier.INSTANCE
            com.facebook.aura.network.acs.OhaiAcsConfig r0 = r0.verifyAndParse(r1)
            if (r0 == 0) goto L3a
            com.facebook.aura.network.acs.FetchedOhaiAcsConfig r3 = new com.facebook.aura.network.acs.FetchedOhaiAcsConfig
            r3.<init>(r1, r0)
            return r3
        L55:
            X.Hwg.A00(r1)
            kotlin.jvm.functions.Function0<com.facebook.aura.network.transport.HatchHttpClient> r0 = r15.httpClientProvider
            java.lang.Object r1 = r0.invoke()
            com.facebook.aura.network.transport.HatchHttpClient r1 = (com.facebook.aura.network.transport.HatchHttpClient) r1
            com.facebook.aura.network.transport.HatchHttpRequest$Companion r5 = com.facebook.aura.network.transport.HatchHttpRequest.Companion
            r8 = 0
            java.lang.String r6 = "https://meta-ohttp-config-prod.fastly-edge.com/ohai_acs_config.json"
            X.9jH r7 = X.C9jH.A00
            com.facebook.aura.network.transport.HatchRequestCategory r11 = com.facebook.aura.network.transport.HatchRequestCategory.API
            com.facebook.aura.network.transport.HatchRequestPurpose r12 = com.facebook.aura.network.transport.HatchRequestPurpose.FETCH
            r14 = 0
            com.facebook.aura.network.transport.HatchResponseBodyPolicy r16 = com.facebook.aura.network.transport.HatchResponseBodyPolicy.DEFAULT
            r9 = r8
            r10 = r8
            r13 = r8
            r15 = r14
            com.facebook.aura.network.transport.HatchHttpRequest r0 = r5.get(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r4.label = r2
            java.lang.Object r1 = r1.execute(r0, r4)
            if (r1 != r3) goto L22
            return r3
        L7f:
            com.facebook.aura.network.acs.OhaiAcsConfigFetcher$fetch$1 r4 = new com.facebook.aura.network.acs.OhaiAcsConfigFetcher$fetch$1
            r4.<init>(r3)
            goto L14
        L85:
            java.lang.String r0 = "Empty ACS/OHAI config body"
            X.CFK.A04(r3, r0)
            return r2
        L8b:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.network.acs.OhaiAcsConfigFetcher.fetch(X.HtJ):java.lang.Object");
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OhaiAcsConfigFetcher(Function0<? extends HatchHttpClient> function0) {
        C7384Etj.A0Y(function0, 0);
        this.httpClientProvider = function0;
    }

    public OhaiAcsConfigFetcher() {
        this(AnonymousClass1.INSTANCE);
    }
}
