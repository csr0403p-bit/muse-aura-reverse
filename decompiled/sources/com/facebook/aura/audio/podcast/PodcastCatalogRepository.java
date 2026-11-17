package com.facebook.aura.audio.podcast;

import X.AbstractC3358CGz;
import X.C06H;
import X.C7384Etj;
import X.C9258GBl;
import X.HtJ;
import X.HzP;
import X.InterfaceC2261BLa;
import X.InterfaceC7549F2g;
import com.facebook.acra.util.minidump.MinidumpReader;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes3.dex */
public final class PodcastCatalogRepository implements InterfaceC7549F2g {
    public static final long CATALOG_TTL_MS = 30000;
    public static final Companion Companion = new Companion();
    public static final String TAG = "PodcastCatalogRepository";
    public volatile CachedCatalog cached;
    public final InterfaceC2261BLa fetchMutex;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.audio.podcast.PodcastCatalogRepository", f = "PodcastCatalogRepository.kt", l = {R.styleable.maplibre_MapView_maplibre_uiRotateGestures}, m = "fetchAndCache", v = 2)
    /* renamed from: com.facebook.aura.audio.podcast.PodcastCatalogRepository$fetchAndCache$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PodcastCatalogRepository.this.fetchAndCache(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.audio.podcast.PodcastCatalogRepository", f = "PodcastCatalogRepository.kt", l = {MinidumpReader.MODULE_FULL_SIZE, R.styleable.maplibre_MapView_maplibre_uiLogoGravity}, m = "getCatalog", v = 2)
    /* renamed from: com.facebook.aura.audio.podcast.PodcastCatalogRepository$getCatalog$1, reason: invalid class name and case insensitive filesystem */
    public final class C109741 extends HzP {
        public Object L$0;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C109741(HtJ<? super C109741> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PodcastCatalogRepository.this.getCatalog(false, this);
        }
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        this.cached = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchAndCache(X.HtJ<? super com.facebook.aura.audio.podcast.PodcastCatalog> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.facebook.aura.audio.podcast.PodcastCatalogRepository.AnonymousClass1
            if (r0 == 0) goto L1f
            r5 = r7
            com.facebook.aura.audio.podcast.PodcastCatalogRepository$fetchAndCache$1 r5 = (com.facebook.aura.audio.podcast.PodcastCatalogRepository.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1f
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r4 = r5.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r1 = r5.label
            r0 = 0
            r2 = 1
            if (r1 == 0) goto L2a
            if (r1 != r2) goto L25
            goto L3b
        L1f:
            com.facebook.aura.audio.podcast.PodcastCatalogRepository$fetchAndCache$1 r5 = new com.facebook.aura.audio.podcast.PodcastCatalogRepository$fetchAndCache$1
            r5.<init>(r7)
            goto L12
        L25:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2a:
            X.Hwg.A00(r4)
            com.facebook.aura.audio.podcast.PodcastCatalogRepository$fetchAndCache$catalog$1 r1 = new com.facebook.aura.audio.podcast.PodcastCatalogRepository$fetchAndCache$catalog$1     // Catch: java.lang.Exception -> L4c java.util.concurrent.CancellationException -> L5b
            r1.<init>(r6, r0)     // Catch: java.lang.Exception -> L4c java.util.concurrent.CancellationException -> L5b
            r5.label = r2     // Catch: java.lang.Exception -> L4c java.util.concurrent.CancellationException -> L5b
            java.lang.Object r4 = X.Hxb.A00(r1, r5)     // Catch: java.lang.Exception -> L4c java.util.concurrent.CancellationException -> L5b
            if (r4 != r3) goto L3e
            return r3
        L3b:
            X.Hwg.A00(r4)     // Catch: java.lang.Exception -> L4c java.util.concurrent.CancellationException -> L5b
        L3e:
            com.facebook.aura.audio.podcast.PodcastCatalog r4 = (com.facebook.aura.audio.podcast.PodcastCatalog) r4     // Catch: java.lang.Exception -> L4c java.util.concurrent.CancellationException -> L5b
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L4c java.util.concurrent.CancellationException -> L5b
            com.facebook.aura.audio.podcast.CachedCatalog r1 = new com.facebook.aura.audio.podcast.CachedCatalog     // Catch: java.lang.Exception -> L4c java.util.concurrent.CancellationException -> L5b
            r1.<init>(r4, r2)     // Catch: java.lang.Exception -> L4c java.util.concurrent.CancellationException -> L5b
            r6.cached = r1     // Catch: java.lang.Exception -> L4c java.util.concurrent.CancellationException -> L5b
            return r4
        L4c:
            r3 = move-exception
            java.lang.String r2 = "Failed to fetch podcast catalog"
            java.lang.String r1 = "PodcastCatalogRepository"
            X.CFK.A0A(r1, r2, r3)
            com.facebook.aura.audio.podcast.CachedCatalog r1 = r6.cached
            if (r1 == 0) goto L5a
            com.facebook.aura.audio.podcast.PodcastCatalog r0 = r1.catalog
        L5a:
            return r0
        L5b:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.audio.podcast.PodcastCatalogRepository.fetchAndCache(X.HtJ):java.lang.Object");
    }

    private final PodcastCatalog freshCatalog() {
        CachedCatalog cachedCatalog = this.cached;
        if (cachedCatalog == null || System.currentTimeMillis() - cachedCatalog.fetchedAtMs >= 30000) {
            return null;
        }
        return cachedCatalog.catalog;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getCatalog(boolean r8, X.HtJ<? super com.facebook.aura.audio.podcast.PodcastCatalog> r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.audio.podcast.PodcastCatalogRepository.C109741
            if (r0 == 0) goto L26
            r6 = r9
            com.facebook.aura.audio.podcast.PodcastCatalogRepository$getCatalog$1 r6 = (com.facebook.aura.audio.podcast.PodcastCatalogRepository.C109741) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r0 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r1 = r6.label
            r4 = 2
            r3 = 1
            r2 = 0
            if (r1 == 0) goto L31
            if (r1 == r3) goto L4c
            if (r1 != r4) goto L2c
            java.lang.Object r1 = r6.L$0
            X.BLa r1 = (X.InterfaceC2261BLa) r1
            goto L6b
        L26:
            com.facebook.aura.audio.podcast.PodcastCatalogRepository$getCatalog$1 r6 = new com.facebook.aura.audio.podcast.PodcastCatalogRepository$getCatalog$1
            r6.<init>(r9)
            goto L12
        L2c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L31:
            X.Hwg.A00(r0)
            if (r8 != 0) goto L3d
            com.facebook.aura.audio.podcast.PodcastCatalog r0 = r7.freshCatalog()
            if (r0 == 0) goto L3d
            return r0
        L3d:
            X.BLa r1 = r7.fetchMutex
            r6.L$0 = r1
            r6.Z$0 = r8
            r6.label = r3
            java.lang.Object r0 = r1.APs(r2, r6)
            if (r0 != r5) goto L55
            return r5
        L4c:
            boolean r8 = r6.Z$0
            java.lang.Object r1 = r6.L$0
            X.BLa r1 = (X.InterfaceC2261BLa) r1
            X.Hwg.A00(r0)
        L55:
            if (r8 != 0) goto L5e
            com.facebook.aura.audio.podcast.PodcastCatalog r0 = r7.freshCatalog()     // Catch: java.lang.Throwable -> L74
            if (r0 == 0) goto L5e
            goto L70
        L5e:
            r6.L$0 = r1     // Catch: java.lang.Throwable -> L74
            r6.Z$0 = r8     // Catch: java.lang.Throwable -> L74
            r6.label = r4     // Catch: java.lang.Throwable -> L74
            java.lang.Object r0 = r7.fetchAndCache(r6)     // Catch: java.lang.Throwable -> L74
            if (r0 != r5) goto L6e
            return r5
        L6b:
            X.Hwg.A00(r0)     // Catch: java.lang.Throwable -> L76
        L6e:
            com.facebook.aura.audio.podcast.PodcastCatalog r0 = (com.facebook.aura.audio.podcast.PodcastCatalog) r0     // Catch: java.lang.Throwable -> L76
        L70:
            r1.Ahe(r2)
            return r0
        L74:
            r0 = move-exception
            goto L77
        L76:
            r0 = move-exception
        L77:
            r1.Ahe(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.audio.podcast.PodcastCatalogRepository.getCatalog(boolean, X.HtJ):java.lang.Object");
    }

    /* loaded from: classes.dex */
    public final class Companion {
        public final PodcastCatalogRepository getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (PodcastCatalogRepository) abstractC3358CGz.A03(PodcastCatalogRepository.class, new PodcastCatalogRepository$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public PodcastCatalogRepository(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        this.fetchMutex = new C9258GBl();
    }

    public /* synthetic */ PodcastCatalogRepository(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
