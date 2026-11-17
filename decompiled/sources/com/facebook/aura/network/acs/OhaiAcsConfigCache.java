package com.facebook.aura.network.acs;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C3UX;
import X.C8j4;
import X.C9258GBl;
import X.G0U;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.HzP;
import X.InterfaceC2261BLa;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import org.maplibre.android.R;

/* loaded from: classes4.dex */
public final class OhaiAcsConfigCache {
    public volatile OhaiAcsConfig cached;
    public final Function0<Long> clock;
    public final G0U<HtJ<? super FetchedOhaiAcsConfig>, Object> fetch;
    public final Function0<StoredOhaiAcsConfig> load;
    public final InterfaceC2261BLa mutex;
    public final G0V<String, Long, Unit> save;

    @DebugMetadata(c = "com.facebook.aura.network.acs.OhaiAcsConfigCache", f = "OhaiAcsConfigRepository.kt", l = {R.styleable.maplibre_MapView_maplibre_uiLogoMarginRight}, m = "getAcsServerConfig", v = 2)
    /* renamed from: com.facebook.aura.network.acs.OhaiAcsConfigCache$getAcsServerConfig$1, reason: invalid class name */
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
            return OhaiAcsConfigCache.this.getAcsServerConfig(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.network.acs.OhaiAcsConfigCache$getConfig$3", f = "OhaiAcsConfigRepository.kt", l = {72, R.styleable.maplibre_MapView_maplibre_uiCompassMarginLeft}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.network.acs.OhaiAcsConfigCache$getConfig$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super OhaiAcsConfig>, Object> {
        public final /* synthetic */ boolean $forceRefresh;
        public final /* synthetic */ String $projectName;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public boolean Z$0;
        public int label;

        /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00a5 A[Catch: all -> 0x00bc, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00bc, blocks: (B:30:0x009a, B:31:0x009d, B:35:0x00a5), top: B:43:0x009a }] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
            /*
                r12 = this;
                r6 = r13
                X.Hji r3 = X.EnumC10460Hji.A02
                r4 = r12
                int r0 = r12.label
                r5 = 2
                r8 = 1
                r2 = 0
                if (r0 == 0) goto L1e
                if (r0 == r8) goto L3a
                if (r0 != r5) goto L19
                java.lang.Object r1 = r12.L$1
                com.facebook.aura.network.acs.OhaiAcsConfigCache r1 = (com.facebook.aura.network.acs.OhaiAcsConfigCache) r1
                java.lang.Object r0 = r12.L$0
                X.BLa r0 = (X.InterfaceC2261BLa) r0
                goto L9a
            L19:
                java.lang.IllegalStateException r1 = X.AnonymousClass001.A0n()
                throw r1
            L1e:
                X.Hwg.A00(r13)
                com.facebook.aura.network.acs.OhaiAcsConfigCache r1 = com.facebook.aura.network.acs.OhaiAcsConfigCache.this
                X.BLa r0 = r1.mutex
                boolean r7 = r12.$forceRefresh
                java.lang.String r9 = r12.$projectName
                r12.L$0 = r0
                r12.L$1 = r1
                r12.L$2 = r9
                r12.Z$0 = r7
                r12.label = r8
                java.lang.Object r6 = r0.APs(r2, r12)
                if (r6 != r3) goto L4b
                return r3
            L3a:
                boolean r7 = r12.Z$0
                java.lang.Object r9 = r12.L$2
                java.lang.String r9 = (java.lang.String) r9
                java.lang.Object r1 = r12.L$1
                com.facebook.aura.network.acs.OhaiAcsConfigCache r1 = (com.facebook.aura.network.acs.OhaiAcsConfigCache) r1
                java.lang.Object r0 = r12.L$0
                X.BLa r0 = (X.InterfaceC2261BLa) r0
                X.Hwg.A00(r13)
            L4b:
                if (r7 != 0) goto L89
                com.facebook.aura.network.acs.OhaiAcsConfig r8 = r1.cached     // Catch: java.lang.Throwable -> Lbe
                if (r8 == 0) goto L64
                kotlin.jvm.functions.Function0<java.lang.Long> r6 = r1.clock     // Catch: java.lang.Throwable -> Lbe
                long r10 = X.C8j4.A0Q(r6)     // Catch: java.lang.Throwable -> Lbe
                r12 = 3600000(0x36ee80, double:1.7786363E-317)
                boolean r6 = r8.isExpired(r9, r10, r12)     // Catch: java.lang.Throwable -> Lbe
                if (r6 != 0) goto L64
                r0.Ahe(r2)
                return r8
            L64:
                kotlin.jvm.functions.Function0<com.facebook.aura.network.acs.StoredOhaiAcsConfig> r6 = r1.load     // Catch: java.lang.Throwable -> Lbe
                java.lang.Object r7 = r6.invoke()     // Catch: java.lang.Throwable -> Lbe
                com.facebook.aura.network.acs.StoredOhaiAcsConfig r7 = (com.facebook.aura.network.acs.StoredOhaiAcsConfig) r7     // Catch: java.lang.Throwable -> Lbe
                if (r7 == 0) goto L89
                com.facebook.aura.network.acs.OhaiAcsConfig r8 = r7.config     // Catch: java.lang.Throwable -> Lbe
                kotlin.jvm.functions.Function0<java.lang.Long> r6 = r1.clock     // Catch: java.lang.Throwable -> Lbe
                long r10 = X.C8j4.A0Q(r6)     // Catch: java.lang.Throwable -> Lbe
                r12 = 3600000(0x36ee80, double:1.7786363E-317)
                boolean r6 = r8.isExpired(r9, r10, r12)     // Catch: java.lang.Throwable -> Lbe
                if (r6 != 0) goto L89
                com.facebook.aura.network.acs.OhaiAcsConfig r3 = r7.config     // Catch: java.lang.Throwable -> Lbe
                r1.cached = r3     // Catch: java.lang.Throwable -> Lbe
                com.facebook.aura.network.acs.OhaiAcsConfig r3 = r7.config     // Catch: java.lang.Throwable -> Lbe
                r0.Ahe(r2)
                return r3
            L89:
                X.G0U<X.HtJ<? super com.facebook.aura.network.acs.FetchedOhaiAcsConfig>, java.lang.Object> r6 = r1.fetch     // Catch: java.lang.Throwable -> Lbe
                r4.L$0 = r0     // Catch: java.lang.Throwable -> Lbe
                r4.L$1 = r1     // Catch: java.lang.Throwable -> Lbe
                r4.L$2 = r2     // Catch: java.lang.Throwable -> Lbe
                r4.label = r5     // Catch: java.lang.Throwable -> Lbe
                java.lang.Object r6 = r6.invoke(r4)     // Catch: java.lang.Throwable -> Lbe
                if (r6 != r3) goto L9d
                return r3
            L9a:
                X.Hwg.A00(r13)     // Catch: java.lang.Throwable -> Lbc
            L9d:
                com.facebook.aura.network.acs.FetchedOhaiAcsConfig r6 = (com.facebook.aura.network.acs.FetchedOhaiAcsConfig) r6     // Catch: java.lang.Throwable -> Lbc
                if (r6 != 0) goto La5
                r0.Ahe(r2)
                return r2
            La5:
                X.G0V<java.lang.String, java.lang.Long, kotlin.Unit> r5 = r1.save     // Catch: java.lang.Throwable -> Lbc
                java.lang.String r4 = r6.rawEnvelope     // Catch: java.lang.Throwable -> Lbc
                kotlin.jvm.functions.Function0<java.lang.Long> r3 = r1.clock     // Catch: java.lang.Throwable -> Lbc
                java.lang.Object r3 = r3.invoke()     // Catch: java.lang.Throwable -> Lbc
                r5.invoke(r4, r3)     // Catch: java.lang.Throwable -> Lbc
                com.facebook.aura.network.acs.OhaiAcsConfig r3 = r6.config     // Catch: java.lang.Throwable -> Lbc
                r1.cached = r3     // Catch: java.lang.Throwable -> Lbc
                com.facebook.aura.network.acs.OhaiAcsConfig r8 = r6.config     // Catch: java.lang.Throwable -> Lbc
                r0.Ahe(r2)
                return r8
            Lbc:
                r1 = move-exception
                goto Lbf
            Lbe:
                r1 = move-exception
            Lbf:
                r0.Ahe(r2)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.network.acs.OhaiAcsConfigCache.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(boolean z, String str, HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
            this.$forceRefresh = z;
            this.$projectName = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return OhaiAcsConfigCache.this.new AnonymousClass3(this.$forceRefresh, this.$projectName, htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super OhaiAcsConfig> htJ) {
            return ((AnonymousClass3) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final Object getConfig(String str, boolean z, HtJ<? super OhaiAcsConfig> htJ) {
        OhaiAcsConfig ohaiAcsConfig;
        return (z || (ohaiAcsConfig = this.cached) == null || ohaiAcsConfig.isExpired(str, C8j4.A0Q(this.clock), 3600000L)) ? GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass3(z, str, null)) : ohaiAcsConfig;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getAcsServerConfig(java.lang.String r6, X.HtJ<? super X.A7u> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.facebook.aura.network.acs.OhaiAcsConfigCache.AnonymousClass1
            if (r0 == 0) goto L47
            r4 = r7
            com.facebook.aura.network.acs.OhaiAcsConfigCache$getAcsServerConfig$1 r4 = (com.facebook.aura.network.acs.OhaiAcsConfigCache.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L47
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r1 = r4.label
            r0 = 1
            if (r1 == 0) goto L38
            if (r1 != r0) goto L4f
            java.lang.Object r0 = r4.L$0
            java.lang.String r6 = X.C3cG.A0d(r0, r3)
        L23:
            com.facebook.aura.network.acs.OhaiAcsConfig r3 = (com.facebook.aura.network.acs.OhaiAcsConfig) r3
            if (r3 == 0) goto L4d
            com.facebook.aura.network.acs.AcsServiceConfig r0 = r3.serviceConfig(r6)
            if (r0 == 0) goto L4d
            com.facebook.aura.network.acs.AcsKeyConfig r0 = r0.latestKeyConfig()
            if (r0 == 0) goto L4d
            X.A7u r2 = r0.toServerConfig()
            return r2
        L38:
            X.Hwg.A00(r3)
            r4.L$0 = r6
            r4.label = r0
            r0 = 0
            java.lang.Object r3 = r5.getConfig(r6, r0, r4)
            if (r3 != r2) goto L23
            return r2
        L47:
            com.facebook.aura.network.acs.OhaiAcsConfigCache$getAcsServerConfig$1 r4 = new com.facebook.aura.network.acs.OhaiAcsConfigCache$getAcsServerConfig$1
            r4.<init>(r7)
            goto L12
        L4d:
            r2 = 0
            return r2
        L4f:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.network.acs.OhaiAcsConfigCache.getAcsServerConfig(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OhaiAcsConfigCache(G0U<? super HtJ<? super FetchedOhaiAcsConfig>, ? extends Object> g0u, Function0<StoredOhaiAcsConfig> function0, G0V<? super String, ? super Long, Unit> g0v, Function0<Long> function02) {
        AnonymousClass005.A14(g0u, function0, g0v, function02);
        this.fetch = g0u;
        this.load = function0;
        this.save = g0v;
        this.clock = function02;
        this.mutex = new C9258GBl();
    }
}
