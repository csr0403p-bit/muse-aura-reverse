package com.facebook.aura.localbrowser;

import X.AbstractC07127nr;
import X.AbstractC0882AGj;
import X.AbstractC3358CGz;
import X.AbstractC9245GAx;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.C06H;
import X.C3UX;
import X.C3cG;
import X.C60N;
import X.C60P;
import X.C6ys;
import X.C7384Etj;
import X.C78W;
import X.C9258GBl;
import X.C9oY;
import X.C9sU;
import X.DCl;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.GAt;
import X.HoC;
import X.HtJ;
import X.Hxb;
import X.HzP;
import X.HzS;
import X.InterfaceC10560Hsz;
import X.InterfaceC2261BLa;
import X.InterfaceC7549F2g;
import android.content.Context;
import android.webkit.WebResourceResponse;
import com.facebook.aura.common.coroutines.OnDuplicateCall;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.common.coroutines.SingleFlightKt;
import com.facebook.aura.feed.view.FeedEditHapticsKt;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.localbrowser.LocalBrowserBlocklistCache;
import com.facebook.aura.localbrowser.core.BrowserEngine;
import com.facebook.aura.network.api.StefiHatchPath;
import com.facebook.aura.network.sandbox.AuraSandbox;
import com.facebook.aura.network.transport.HatchAuthScheme;
import com.facebook.aura.network.transport.HatchHttpClient;
import com.facebook.aura.network.transport.HatchTransport;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import com.facebook.aura.permissions.defaults.ConfidentialVmSettingsJsonKt;
import com.hatch.browser.core.BrowserBlocklistFilter;
import com.hatch.browser.core.BrowserHostBlocklist;
import java.io.ByteArrayInputStream;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes4.dex */
public final class LocalBrowserBlocklist implements InterfaceC7549F2g {
    public static final long CHECK_TIMEOUT_MS = 5000;
    public static final int HTTP_OK = 200;
    public static final long INITIAL_FILTER_WAIT_MS = 2000;
    public static final long INITIAL_RETRY_MS = 60000;
    public static final String JSON_CONTENT_TYPE = "application/json; charset=utf-8";
    public static final long MAX_RETRY_MS = 3600000;
    public static final long SCREEN_TIMEOUT_MS = 6000;
    public final BrowserHostBlocklist check;
    public final HatchHttpClient client;
    public final Set<BrowserEngine> engines;
    public InterfaceC10560Hsz<Unit> initialRefresh;
    public LocalBrowserBlocklistCache.Loaded loaded;
    public HoC refreshJob;
    public final SingleFlight refreshes;
    public final C3UX scope;
    public static final Companion Companion = new Companion();
    public static final int $stable = 8;
    public static final InterfaceC2261BLa CACHE_LOCK = new C9258GBl();
    public static final Map<String, String> HEADERS = AnonymousClass007.A0d("X-API-Version", "1.0.0", C3cG.A0r("Accept", "application/json"));
    public static final JsonObject UNFILTERED_ECHO = C9oY.A05(HatchJsonKt.HatchJson.A03(new LocalBrowserBlocklistEchoJson("unfiltered", null, null), LocalBrowserBlocklistEchoJson$$serializer.INSTANCE));

    /* loaded from: classes3.dex */
    public final class Companion {
        private final /* synthetic */ <T> T decode(byte[] bArr) {
            try {
                C7384Etj.A0Y(bArr, 0);
                new String(bArr, DCl.A05);
                C7384Etj.A0Q();
                throw F60.createAndThrow();
            } catch (SerializationException | IllegalArgumentException unused) {
                return null;
            }
        }

        public final LocalBrowserBlocklist getInstance(final AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (LocalBrowserBlocklist) abstractC3358CGz.A03(LocalBrowserBlocklist.class, new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserBlocklist$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return new LocalBrowserBlocklist(abstractC3358CGz);
                }
            });
        }

        public static final LocalBrowserBlocklist getInstance$lambda$0(AbstractC3358CGz abstractC3358CGz) {
            return new LocalBrowserBlocklist(abstractC3358CGz);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String url(StefiHatchPath stefiHatchPath) {
            AuraSandbox auraSandbox = AuraSandbox.INSTANCE;
            return auraSandbox.rewriteUrl(FGI.A0M("https://hatch-api.meta.ai", stefiHatchPath.getValue()), auraSandbox.getHttpHost());
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserBlocklist", f = "LocalBrowserBlocklist.kt", l = {131}, m = "awaitInitialFilter", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserBlocklist$awaitInitialFilter$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public long J$0;
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
            return LocalBrowserBlocklist.this.awaitInitialFilter(null, 0L, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserBlocklist$awaitInitialFilter$2", f = "LocalBrowserBlocklist.kt", l = {140}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserBlocklist$awaitInitialFilter$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ BrowserEngine $engine;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BrowserEngine browserEngine, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$engine = browserEngine;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return LocalBrowserBlocklist.this.new AnonymousClass2(this.$engine, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0024 A[Catch: all -> 0x005b, TRY_ENTER, TryCatch #0 {, blocks: (B:8:0x0015, B:12:0x0024, B:14:0x002c, B:16:0x0034, B:18:0x003a), top: B:35:0x0015 }] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0015 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0049 -> B:6:0x000e). Please report as a decompilation issue!!! */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                X.Hji r5 = X.EnumC10460Hji.A02
                int r0 = r6.label
                r4 = 1
                if (r0 == 0) goto L18
                if (r0 != r4) goto L56
                java.lang.Object r1 = r6.L$0
                X.Hwg.A00(r7)
            Le:
                com.facebook.aura.localbrowser.LocalBrowserBlocklist r2 = com.facebook.aura.localbrowser.LocalBrowserBlocklist.this
                int r0 = com.facebook.aura.localbrowser.LocalBrowserBlocklist.$stable
                java.util.Set<com.facebook.aura.localbrowser.core.BrowserEngine> r3 = r2.engines
                monitor-enter(r3)
                X.Hsz<kotlin.Unit> r0 = r2.initialRefresh     // Catch: java.lang.Throwable -> L5b
                goto L4c
            L18:
                X.Hwg.A00(r7)
            L1b:
                com.facebook.aura.localbrowser.LocalBrowserBlocklist r2 = com.facebook.aura.localbrowser.LocalBrowserBlocklist.this
                int r0 = com.facebook.aura.localbrowser.LocalBrowserBlocklist.$stable
                java.util.Set<com.facebook.aura.localbrowser.core.BrowserEngine> r3 = r2.engines
                com.facebook.aura.localbrowser.core.BrowserEngine r1 = r6.$engine
                monitor-enter(r3)
                X.3UX r0 = r2.scope     // Catch: java.lang.Throwable -> L5b
                boolean r0 = X.Hxb.A04(r0)     // Catch: java.lang.Throwable -> L5b
                if (r0 == 0) goto L3d
                java.util.Set<com.facebook.aura.localbrowser.core.BrowserEngine> r0 = r2.engines     // Catch: java.lang.Throwable -> L5b
                boolean r0 = r0.contains(r1)     // Catch: java.lang.Throwable -> L5b
                if (r0 == 0) goto L3d
                kotlinx.serialization.json.JsonObject r0 = com.facebook.aura.localbrowser.LocalBrowserBlocklist.access$echo(r2, r1)     // Catch: java.lang.Throwable -> L5b
                if (r0 != 0) goto L3d
                X.Hsz<kotlin.Unit> r1 = r2.initialRefresh     // Catch: java.lang.Throwable -> L5b
                goto L3e
            L3d:
                r1 = 0
            L3e:
                monitor-exit(r3)
                if (r1 == 0) goto L53
                r6.L$0 = r1
                r6.label = r4
                java.lang.Object r0 = X.C3cG.A0W(r1, r6)
                if (r0 != r5) goto Le
                return r5
            L4c:
                boolean r0 = X.AnonymousClass002.A1Z(r0, r1)
                monitor-exit(r3)
                if (r0 == 0) goto L1b
            L53:
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                return r5
            L56:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            L5b:
                r0 = move-exception
                monitor-exit(r3)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserBlocklist.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserBlocklist", f = "LocalBrowserBlocklist.kt", l = {314, FeedEditHapticsKt.ZIP_PULSE_AMPLITUDE, 180, 188, 201, 201, 332, 217, 217, 229}, m = "maintain", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserBlocklist$maintain$1, reason: invalid class name and case insensitive filesystem */
    public final class C124061 extends HzP {
        public int I$0;
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public int label;
        public /* synthetic */ Object result;

        public C124061(HtJ<? super C124061> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocalBrowserBlocklist.this.maintain(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object installLoaded(final LocalBrowserBlocklistCache.Loaded loaded, HtJ<? super Unit> htJ) {
        Unit unit;
        BrowserBlocklistFilter browserBlocklistFilter;
        try {
            HzS.A05(htJ.getContext());
            synchronized (this.engines) {
                if (!Hxb.A04(this.scope) || this.engines.isEmpty()) {
                    unit = Unit.INSTANCE;
                } else {
                    LocalBrowserBlocklistCache.Loaded loaded2 = this.loaded;
                    AbstractC0882AGj.A0t(this.engines, new G0U() { // from class: com.facebook.aura.localbrowser.LocalBrowserBlocklist$$ExternalSyntheticLambda0
                        @Override // X.G0U
                        public final Object invoke(Object obj) {
                            return Boolean.valueOf(LocalBrowserBlocklist.installLoaded$lambda$0$0(loaded, (BrowserEngine) obj));
                        }
                    });
                    if (!this.engines.isEmpty()) {
                        this.loaded = loaded;
                        if (loaded2 != loaded && loaded2 != null && (browserBlocklistFilter = loaded2.filter) != null) {
                            browserBlocklistFilter.destroy();
                        }
                        return Unit.INSTANCE;
                    }
                    releaseIfIdle();
                    unit = Unit.INSTANCE;
                }
                loaded.filter.destroy();
                return unit;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                loaded.filter.destroy();
            }
            throw th;
        }
    }

    public static final boolean installLoaded$lambda$0$0(LocalBrowserBlocklistCache.Loaded loaded, BrowserEngine browserEngine) {
        C7384Etj.A0Y(browserEngine, 1);
        try {
            browserEngine.useBlocklistFilter(loaded.filter);
            return false;
        } catch (IllegalStateException unused) {
            return true;
        }
    }

    public final JsonObject registration(BrowserEngine browserEngine) {
        C7384Etj.A0Y(browserEngine, 0);
        JsonObject jsonObjectEcho = echo(browserEngine);
        return jsonObjectEcho == null ? UNFILTERED_ECHO : jsonObjectEcho;
    }

    public final void release(BrowserEngine browserEngine) {
        C7384Etj.A0Y(browserEngine, 0);
        synchronized (this.engines) {
            this.engines.remove(browserEngine);
            releaseIfIdle();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01bc, code lost:
    
        if (X.C7Bq.A01(r10, r8) == r7) goto L58;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02b8 A[Catch: all -> 0x032a, TryCatch #4 {all -> 0x032a, blocks: (B:72:0x0207, B:74:0x020d, B:78:0x022c, B:80:0x0230, B:81:0x0242, B:82:0x024a, B:84:0x0250, B:85:0x0252, B:87:0x0255, B:91:0x025b, B:93:0x025f, B:94:0x0261, B:98:0x02b0, B:100:0x02b8, B:102:0x02be, B:104:0x02cf, B:106:0x02d3, B:110:0x02f3, B:118:0x0322, B:119:0x0329, B:114:0x0317, B:116:0x0320, B:21:0x0093, B:109:0x02f0, B:97:0x02ad, B:25:0x00e2, B:77:0x0229, B:86:0x0253), top: B:137:0x0020, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0317 A[Catch: all -> 0x032a, TRY_ENTER, TryCatch #4 {all -> 0x032a, blocks: (B:72:0x0207, B:74:0x020d, B:78:0x022c, B:80:0x0230, B:81:0x0242, B:82:0x024a, B:84:0x0250, B:85:0x0252, B:87:0x0255, B:91:0x025b, B:93:0x025f, B:94:0x0261, B:98:0x02b0, B:100:0x02b8, B:102:0x02be, B:104:0x02cf, B:106:0x02d3, B:110:0x02f3, B:118:0x0322, B:119:0x0329, B:114:0x0317, B:116:0x0320, B:21:0x0093, B:109:0x02f0, B:97:0x02ad, B:25:0x00e2, B:77:0x0229, B:86:0x0253), top: B:137:0x0020, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01f4 A[Catch: Exception -> 0x0116, CancellationException -> 0x033a, TRY_ENTER, TryCatch #5 {Exception -> 0x0116, blocks: (B:69:0x01f4, B:112:0x030e, B:122:0x032c, B:123:0x032f, B:28:0x0111), top: B:141:0x0111 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x020d A[Catch: all -> 0x032a, TryCatch #4 {all -> 0x032a, blocks: (B:72:0x0207, B:74:0x020d, B:78:0x022c, B:80:0x0230, B:81:0x0242, B:82:0x024a, B:84:0x0250, B:85:0x0252, B:87:0x0255, B:91:0x025b, B:93:0x025f, B:94:0x0261, B:98:0x02b0, B:100:0x02b8, B:102:0x02be, B:104:0x02cf, B:106:0x02d3, B:110:0x02f3, B:118:0x0322, B:119:0x0329, B:114:0x0317, B:116:0x0320, B:21:0x0093, B:109:0x02f0, B:97:0x02ad, B:25:0x00e2, B:77:0x0229, B:86:0x0253), top: B:137:0x0020, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0230 A[Catch: all -> 0x032a, TryCatch #4 {all -> 0x032a, blocks: (B:72:0x0207, B:74:0x020d, B:78:0x022c, B:80:0x0230, B:81:0x0242, B:82:0x024a, B:84:0x0250, B:85:0x0252, B:87:0x0255, B:91:0x025b, B:93:0x025f, B:94:0x0261, B:98:0x02b0, B:100:0x02b8, B:102:0x02be, B:104:0x02cf, B:106:0x02d3, B:110:0x02f3, B:118:0x0322, B:119:0x0329, B:114:0x0317, B:116:0x0320, B:21:0x0093, B:109:0x02f0, B:97:0x02ad, B:25:0x00e2, B:77:0x0229, B:86:0x0253), top: B:137:0x0020, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0250 A[Catch: all -> 0x032a, TryCatch #4 {all -> 0x032a, blocks: (B:72:0x0207, B:74:0x020d, B:78:0x022c, B:80:0x0230, B:81:0x0242, B:82:0x024a, B:84:0x0250, B:85:0x0252, B:87:0x0255, B:91:0x025b, B:93:0x025f, B:94:0x0261, B:98:0x02b0, B:100:0x02b8, B:102:0x02be, B:104:0x02cf, B:106:0x02d3, B:110:0x02f3, B:118:0x0322, B:119:0x0329, B:114:0x0317, B:116:0x0320, B:21:0x0093, B:109:0x02f0, B:97:0x02ad, B:25:0x00e2, B:77:0x0229, B:86:0x0253), top: B:137:0x0020, inners: #8 }] */
    /* JADX WARN: Type inference failed for: r2v38, types: [int] */
    /* JADX WARN: Type inference failed for: r2v39, types: [int] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.HtJ] */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.BLa] */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r3v50 */
    /* JADX WARN: Type inference failed for: r3v51 */
    /* JADX WARN: Type inference failed for: r3v52 */
    /* JADX WARN: Type inference failed for: r3v53 */
    /* JADX WARN: Type inference failed for: r6v16, types: [T, com.facebook.aura.localbrowser.LocalBrowserBlocklistCache, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:112:0x030e -> B:53:0x0191). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0129 -> B:53:0x0191). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0150 -> B:45:0x017e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object maintain(android.content.Context r24, X.InterfaceC10560Hsz<kotlin.Unit> r25, X.HtJ<? super kotlin.Unit> r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 854
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserBlocklist.maintain(android.content.Context, X.Hsz, X.HtJ):java.lang.Object");
    }

    private final void releaseIfIdle() {
        BrowserBlocklistFilter browserBlocklistFilter;
        if (this.engines.isEmpty()) {
            HoC hoC = this.refreshJob;
            if (hoC != null) {
                hoC.A5w(null);
            }
            LocalBrowserBlocklistCache.Loaded loaded = this.loaded;
            if (loaded != null && (browserBlocklistFilter = loaded.filter) != null) {
                browserBlocklistFilter.destroy();
            }
            this.loaded = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object awaitInitialFilter(com.facebook.aura.localbrowser.core.BrowserEngine r13, long r14, X.HtJ<? super kotlin.Unit> r16) {
        /*
            r12 = this;
            r3 = r16
            boolean r0 = r3 instanceof com.facebook.aura.localbrowser.LocalBrowserBlocklist.AnonymousClass1
            if (r0 == 0) goto L4f
            r5 = r3
            com.facebook.aura.localbrowser.LocalBrowserBlocklist$awaitInitialFilter$1 r5 = (com.facebook.aura.localbrowser.LocalBrowserBlocklist.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4f
            int r2 = r2 - r1
            r5.label = r2
        L14:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L25
            if (r0 != r3) goto L55
            X.Hwg.A00(r1)
        L22:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L25:
            X.Hwg.A00(r1)
            kotlinx.serialization.json.JsonObject r0 = r12.echo(r13)
            if (r0 != 0) goto L22
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r6 = r14 - r0
            r8 = 0
            r10 = 2000(0x7d0, double:9.88E-321)
            long r1 = X.ATD.A07(r6, r8, r10)
            r6 = 0
            com.facebook.aura.localbrowser.LocalBrowserBlocklist$awaitInitialFilter$2 r0 = new com.facebook.aura.localbrowser.LocalBrowserBlocklist$awaitInitialFilter$2
            r0.<init>(r13, r6)
            r5.L$0 = r6
            r5.J$0 = r14
            r5.label = r3
            java.lang.Object r0 = X.GAX.A01(r5, r0, r1)
            if (r0 != r4) goto L22
            return r4
        L4f:
            com.facebook.aura.localbrowser.LocalBrowserBlocklist$awaitInitialFilter$1 r5 = new com.facebook.aura.localbrowser.LocalBrowserBlocklist$awaitInitialFilter$1
            r5.<init>(r3)
            goto L14
        L55:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserBlocklist.awaitInitialFilter(com.facebook.aura.localbrowser.core.BrowserEngine, long, X.HtJ):java.lang.Object");
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        BrowserBlocklistFilter browserBlocklistFilter;
        Hxb.A03(null, this.scope);
        synchronized (this.engines) {
            this.engines.clear();
            LocalBrowserBlocklistCache.Loaded loaded = this.loaded;
            if (loaded != null && (browserBlocklistFilter = loaded.filter) != null) {
                browserBlocklistFilter.destroy();
            }
            this.loaded = null;
        }
    }

    public final BrowserHostBlocklist getCheck() {
        return this.check;
    }

    public LocalBrowserBlocklist(AbstractC3358CGz abstractC3358CGz) {
        this.refreshes = SingleFlightKt.SingleFlight(abstractC3358CGz, OnDuplicateCall.Join.INSTANCE, false);
        this.scope = C78W.A03();
        this.client = HatchTransport.INSTANCE.httpClient(HatchAuthScheme.META_BEARER);
        this.engines = C3cG.A0k();
        this.initialRefresh = new GAt(null);
        this.check = new LocalBrowserBlocklist$check$1(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonObject echo(BrowserEngine browserEngine) {
        Object objA00;
        byte[] bArrBlocklistInfo = browserEngine.blocklistInfo();
        try {
            C9sU c9sU = HatchJsonKt.HatchJson;
            C7384Etj.A0Y(bArrBlocklistInfo, 0);
            objA00 = c9sU.A00(new String(bArrBlocklistInfo, DCl.A05), LocalBrowserBlocklistInfoJson$$serializer.INSTANCE);
        } catch (SerializationException | IllegalArgumentException unused) {
            objA00 = null;
        }
        LocalBrowserBlocklistInfoJson localBrowserBlocklistInfoJson = (LocalBrowserBlocklistInfoJson) objA00;
        if (localBrowserBlocklistInfoJson == null) {
            return null;
        }
        String str = localBrowserBlocklistInfoJson.version;
        String str2 = localBrowserBlocklistInfoJson.source_ds;
        if (!localBrowserBlocklistInfoJson.loaded || str == null || str2 == null) {
            return null;
        }
        return C9oY.A05(HatchJsonKt.HatchJson.A03(new LocalBrowserBlocklistEchoJson("enforced", str, str2), LocalBrowserBlocklistEchoJson$$serializer.INSTANCE));
    }

    public final void install(Context context, BrowserEngine browserEngine) {
        boolean zA1Y = C60P.A1Y(context, browserEngine);
        synchronized (this.engines) {
            if (Hxb.A04(this.scope)) {
                LocalBrowserBlocklistCache.Loaded loaded = this.loaded;
                if (loaded != null) {
                    browserEngine.useBlocklistFilter(loaded.filter);
                }
                this.engines.add(browserEngine);
                HoC hoC = this.refreshJob;
                if (hoC == null || hoC.isActive() != zA1Y) {
                    HoC hoC2 = this.refreshJob;
                    GAt gAt = new GAt(null);
                    this.initialRefresh = gAt;
                    Context applicationContext = context.getApplicationContext();
                    this.refreshJob = AnonymousClass001.A11(new LocalBrowserBlocklist$install$1$2(hoC2, this, gAt, applicationContext, null), this.scope);
                }
            }
        }
    }

    public final WebResourceResponse screenPopup(BrowserEngine browserEngine, String str) {
        LocalBrowserBlocklistDecisionJson localBrowserBlocklistDecisionJson;
        byte[] bArr;
        Object objA00;
        int iA1b = AnonymousClass004.A1b(browserEngine, str);
        String str2 = null;
        try {
            bArr = (byte[]) AbstractC9245GAx.A00(C6ys.A00, new LocalBrowserBlocklist$screenPopup$decision$1(browserEngine, str, null));
        } catch (Exception unused) {
        }
        if (bArr != null) {
            try {
                objA00 = HatchJsonKt.HatchJson.A00(new String(bArr, DCl.A05), LocalBrowserBlocklistDecisionJson$$serializer.INSTANCE);
            } catch (SerializationException | IllegalArgumentException unused2) {
                objA00 = null;
            }
            localBrowserBlocklistDecisionJson = (LocalBrowserBlocklistDecisionJson) objA00;
        } else {
            localBrowserBlocklistDecisionJson = null;
        }
        if (ConfidentialVmSettingsJsonKt.MODE_ALLOW.equals(localBrowserBlocklistDecisionJson != null ? localBrowserBlocklistDecisionJson.decision : null)) {
            return null;
        }
        if (localBrowserBlocklistDecisionJson != null) {
            if (!"site_policy_blocked".equals(localBrowserBlocklistDecisionJson.reason)) {
                localBrowserBlocklistDecisionJson = null;
            }
            if (localBrowserBlocklistDecisionJson != null) {
                str2 = localBrowserBlocklistDecisionJson.html;
            }
        }
        return new WebResourceResponse(str2 != null ? "text/html" : "text/plain", HatchWebPageParserKt.UTF_8, 403, "Forbidden", AnonymousClass006.A10(C60N.A00(4), C60N.A00(25)), new ByteArrayInputStream(str2 != null ? C3cG.A1S(str2) : new byte[iA1b]));
    }

    public /* synthetic */ LocalBrowserBlocklist(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
