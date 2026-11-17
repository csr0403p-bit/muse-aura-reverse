package com.facebook.aura.spaces.preload;

import X.AGH;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BHL;
import X.BLG;
import X.C0893AGu;
import X.C3UX;
import X.C3cG;
import X.C60P;
import X.C6t6;
import X.C7384Etj;
import X.CFK;
import X.FGI;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HzP;
import android.content.Context;
import com.facebook.aura.network.http.HatchHttpApi;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.spaces.cache.SpacesDiskCache;
import com.facebook.aura.spaces.repo.CardMetadata;
import com.facebook.aura.spaces.repo.HtmlSpacesWebViewSession;
import com.facebook.aura.spaces.repo.SpaceCard;
import com.facebook.aura.spaces.repo.SpacesWebViewSessionKt;
import com.facebook.aura.spaces.view.cards.HtmlSpacesWebViewKt;
import com.facebook.aura.webview.HtmlWebViewPool;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public abstract class SpaceTabWebViewPreloaderKt {
    public static final int MAX_WARM_SPACE_TABS = 2;
    public static final String TAG = "SpaceTabWebViewPreloader";

    /* renamed from: com.facebook.aura.spaces.preload.SpaceTabWebViewPreloaderKt$loadPeerSpaceDocument$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<C6t6, Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(C6t6 c6t6) {
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(C6t6 c6t6) {
        }
    }

    /* renamed from: com.facebook.aura.spaces.preload.SpaceTabWebViewPreloaderKt$loadSpaceDocument$1, reason: invalid class name and case insensitive filesystem */
    public final class C139021 extends AbstractC7559F3s implements G0U<C6t6, Unit> {
        public static final C139021 INSTANCE = new C139021();

        public C139021() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(C6t6 c6t6) {
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(C6t6 c6t6) {
        }
    }

    @DebugMetadata(c = "com.facebook.aura.spaces.preload.SpaceTabWebViewPreloaderKt", f = "SpaceTabWebViewPreloader.kt", l = {56, HatchMessageShareDocumentRenderer.TABLE_MIN_ROW_HEIGHT_PX}, m = "preloadSpaceTabWebViews", v = 2)
    /* renamed from: com.facebook.aura.spaces.preload.SpaceTabWebViewPreloaderKt$preloadSpaceTabWebViews$1, reason: invalid class name and case insensitive filesystem */
    public final class C139031 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SpaceTabWebViewPreloaderKt.preloadSpaceTabWebViews(null, null, null, this);
        }

        public C139031(HtJ<? super C139031> htJ) {
            super(htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.spaces.preload.SpaceTabWebViewPreloaderKt$preloadSpaceTabWebViews$2", f = "SpaceTabWebViewPreloader.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.spaces.preload.SpaceTabWebViewPreloaderKt$preloadSpaceTabWebViews$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $authToken;
        public final /* synthetic */ Map<String, SpaceCard> $cardsBySlug;
        public final /* synthetic */ Context $context;
        public final /* synthetic */ SpacesDiskCache $diskCache;
        public final /* synthetic */ HtmlWebViewPool $pool;
        public final /* synthetic */ List<String> $slugs;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(List<String> list, Map<String, SpaceCard> map, HtmlWebViewPool htmlWebViewPool, Context context, AbstractC3358CGz abstractC3358CGz, String str, SpacesDiskCache spacesDiskCache, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$slugs = list;
            this.$cardsBySlug = map;
            this.$pool = htmlWebViewPool;
            this.$context = context;
            this.$userSession = abstractC3358CGz;
            this.$authToken = str;
            this.$diskCache = spacesDiskCache;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$slugs, this.$cardsBySlug, this.$pool, this.$context, this.$userSession, this.$authToken, this.$diskCache, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            CardMetadata cardMetadata;
            String str;
            HtmlSpacesWebViewSession htmlSpacesWebViewSessionSpacesSession;
            BLG<Boolean> blg;
            Long l;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            C0893AGu c0893AGuA1B = BHL.A1B(AbstractC0878AGe.A0a(AbstractC0878AGe.A0T(this.$slugs), 2));
            Map<String, SpaceCard> map = this.$cardsBySlug;
            HtmlWebViewPool htmlWebViewPool = this.$pool;
            Context context = this.$context;
            AbstractC3358CGz abstractC3358CGz = this.$userSession;
            String str2 = this.$authToken;
            SpacesDiskCache spacesDiskCache = this.$diskCache;
            Iterator<T> it = c0893AGuA1B.iterator();
            while (it.hasNext()) {
                String str3 = (String) it.next();
                SpaceCard spaceCard = map.get(str3);
                if (spaceCard != null && !spaceCard.isBlockingSpaceSurface() && (cardMetadata = spaceCard.metadata) != null && (str = cardMetadata.sourceUrl) != null) {
                    String canonicalSpaceDocumentUrl = SpacesWebViewSessionKt.toCanonicalSpaceDocumentUrl(str);
                    CardMetadata cardMetadata2 = spaceCard.metadata;
                    long jLongValue = (cardMetadata2 == null || (l = cardMetadata2.updatedAtMs) == null) ? 0L : l.longValue();
                    String strA0K = FGI.A0K(canonicalSpaceDocumentUrl, jLongValue, ":");
                    String strA0M = FGI.A0M(HtmlSpacesWebViewKt.SPACE_CACHE_KEY_PREFIX, str3);
                    try {
                        C6t6 c6t6Peek = htmlWebViewPool.peek(strA0M);
                        if (c6t6Peek == null) {
                            if (htmlWebViewPool.hasFreeSlot()) {
                                C6t6 c6t6Acquire = htmlWebViewPool.acquire(strA0M, AnonymousClass001.A0I(context), false);
                                htmlSpacesWebViewSessionSpacesSession = SpacesWebViewSessionKt.spacesSession(c6t6Acquire);
                                if (strA0K.equals(htmlSpacesWebViewSessionSpacesSession.loadedContent) || AnonymousClass003.A1Z(htmlSpacesWebViewSessionSpacesSession.rendererGone)) {
                                    SpaceTabWebViewPreloaderKt.loadSpaceDocument(c6t6Acquire, abstractC3358CGz, canonicalSpaceDocumentUrl, jLongValue, str2, spacesDiskCache, C139021.INSTANCE);
                                }
                            }
                        } else if (!htmlWebViewPool.isCurrentlyBound(strA0M)) {
                            HtmlSpacesWebViewSession htmlSpacesWebViewSessionSpacesSession2 = SpacesWebViewSessionKt.spacesSession(c6t6Peek);
                            if (htmlSpacesWebViewSessionSpacesSession2 != null && (blg = htmlSpacesWebViewSessionSpacesSession2.rendererGone) != null && AnonymousClass003.A1Z(blg)) {
                                htmlWebViewPool.invalidate(strA0M, null);
                            }
                            C6t6 c6t6Acquire2 = htmlWebViewPool.acquire(strA0M, AnonymousClass001.A0I(context), false);
                            htmlSpacesWebViewSessionSpacesSession = SpacesWebViewSessionKt.spacesSession(c6t6Acquire2);
                            if (strA0K.equals(htmlSpacesWebViewSessionSpacesSession.loadedContent)) {
                            }
                            SpaceTabWebViewPreloaderKt.loadSpaceDocument(c6t6Acquire2, abstractC3358CGz, canonicalSpaceDocumentUrl, jLongValue, str2, spacesDiskCache, C139021.INSTANCE);
                        }
                    } catch (CancellationException e) {
                        throw e;
                    } catch (RuntimeException e2) {
                        CFK.A0A(SpaceTabWebViewPreloaderKt.TAG, FGI.A0M("Space tab WebView preload failed for ", str3), e2);
                    }
                }
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final void loadPeerSpaceDocument(C6t6 c6t6, AbstractC3358CGz abstractC3358CGz, String str, String str2, G0U<? super C6t6, Unit> g0u) {
        boolean zA1Z = AnonymousClass005.A1Z(c6t6, abstractC3358CGz, str);
        C7384Etj.A0Y(g0u, 4);
        HtmlSpacesWebViewSession htmlSpacesWebViewSessionSpacesSession = SpacesWebViewSessionKt.spacesSession(c6t6);
        htmlSpacesWebViewSessionSpacesSession.loadedContent = str;
        htmlSpacesWebViewSessionSpacesSession.loadedUpdatedAtMs = 0L;
        htmlSpacesWebViewSessionSpacesSession.sourceUrl = str;
        htmlSpacesWebViewSessionSpacesSession.authToken = str2;
        htmlSpacesWebViewSessionSpacesSession.gatewayBaseUrl = HatchHttpApi.INSTANCE.jarvisHttpBaseUrl(C60P.A1K(abstractC3358CGz));
        htmlSpacesWebViewSessionSpacesSession.diskCache = null;
        if (str2 != null) {
            g0u.invoke(c6t6);
        }
        AnonymousClass003.A14(htmlSpacesWebViewSessionSpacesSession.showError, false);
        AnonymousClass003.A14(htmlSpacesWebViewSessionSpacesSession.isLoading, zA1Z);
        htmlSpacesWebViewSessionSpacesSession.beginRender(str);
        c6t6.loadUrl(str);
    }

    public static final void loadSpaceDocument(C6t6 c6t6, AbstractC3358CGz abstractC3358CGz, String str, long j, String str2, SpacesDiskCache spacesDiskCache, G0U<? super C6t6, Unit> g0u) {
        Map<String, String> mapA0E;
        boolean zA1Z = AnonymousClass005.A1Z(c6t6, abstractC3358CGz, str);
        AnonymousClass003.A0z(spacesDiskCache, g0u);
        HtmlSpacesWebViewSession htmlSpacesWebViewSessionSpacesSession = SpacesWebViewSessionKt.spacesSession(c6t6);
        htmlSpacesWebViewSessionSpacesSession.loadedContent = FGI.A0K(str, j, ":");
        htmlSpacesWebViewSessionSpacesSession.loadedUpdatedAtMs = Long.valueOf(j);
        htmlSpacesWebViewSessionSpacesSession.sourceUrl = str;
        if (!isOnGatewayOrigin(str, abstractC3358CGz)) {
            str2 = null;
        }
        htmlSpacesWebViewSessionSpacesSession.authToken = str2;
        if (htmlSpacesWebViewSessionSpacesSession.authToken != null) {
            g0u.invoke(c6t6);
        }
        htmlSpacesWebViewSessionSpacesSession.diskCache = spacesDiskCache;
        AnonymousClass003.A14(htmlSpacesWebViewSessionSpacesSession.showError, false);
        AnonymousClass003.A14(htmlSpacesWebViewSessionSpacesSession.isLoading, zA1Z);
        htmlSpacesWebViewSessionSpacesSession.beginRender(str);
        String str3 = htmlSpacesWebViewSessionSpacesSession.authToken;
        if (str3 == null || (mapA0E = AnonymousClass006.A10("Authorization", FGI.A0M("Bearer ", str3))) == null) {
            mapA0E = AGH.A0E();
        }
        c6t6.loadUrl(str, mapA0E);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0078 A[LOOP:0: B:21:0x0072->B:23:0x0078, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object preloadSpaceTabWebViews(X.AbstractC3358CGz r11, android.content.Context r12, java.util.List<java.lang.String> r13, X.HtJ<? super kotlin.Unit> r14) {
        /*
            r4 = r14
            r7 = r13
            r10 = r12
            boolean r0 = r14 instanceof com.facebook.aura.spaces.preload.SpaceTabWebViewPreloaderKt.C139031
            if (r0 == 0) goto Lb4
            r3 = r4
            com.facebook.aura.spaces.preload.SpaceTabWebViewPreloaderKt$preloadSpaceTabWebViews$1 r3 = (com.facebook.aura.spaces.preload.SpaceTabWebViewPreloaderKt.C139031) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb4
            int r2 = r2 - r1
            r3.label = r2
        L15:
            java.lang.Object r6 = r3.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r3.label
            r1 = 2
            r5 = 1
            if (r0 == 0) goto L29
            if (r0 == r5) goto L4a
            if (r0 != r1) goto Lbb
            X.Hwg.A00(r6)
        L26:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        L29:
            X.Hwg.A00(r6)
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L26
            com.facebook.aura.spaces.repo.HatchSpacesDataSource$Companion r0 = com.facebook.aura.spaces.repo.HatchSpacesDataSource.Companion
            com.facebook.aura.spaces.repo.HatchSpacesDataSource r4 = r0.getInstance(r11)
            r3.L$0 = r11
            r3.L$1 = r12
            r3.L$2 = r13
            r3.L$3 = r4
            r3.label = r5
            r0 = 0
            java.lang.Object r0 = r4.loadSpacesData(r0, r3)
            if (r0 != r2) goto L5c
            return r2
        L4a:
            java.lang.Object r4 = r3.L$3
            com.facebook.aura.spaces.repo.HatchSpacesDataSource r4 = (com.facebook.aura.spaces.repo.HatchSpacesDataSource) r4
            java.lang.Object r7 = r3.L$2
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r10 = r3.L$1
            android.content.Context r10 = (android.content.Context) r10
            java.lang.Object r0 = r3.L$0
            X.CGz r11 = X.C60O.A0D(r0, r6)
        L5c:
            X.1BN<com.facebook.aura.spaces.repo.HatchSpacesData> r0 = r4.data
            java.lang.Object r0 = r0.getValue()
            com.facebook.aura.spaces.repo.HatchSpacesData r0 = (com.facebook.aura.spaces.repo.HatchSpacesData) r0
            X.AHD<com.facebook.aura.spaces.repo.SpaceCard> r4 = r0.spaceCards
            int r0 = X.AnonymousClass005.A0C(r4)
            java.util.LinkedHashMap r8 = X.C60O.A15(r0)
            java.util.Iterator r5 = r4.iterator()
        L72:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L85
            java.lang.Object r4 = r5.next()
            r0 = r4
            com.facebook.aura.spaces.repo.SpaceCard r0 = (com.facebook.aura.spaces.repo.SpaceCard) r0
            java.lang.String r0 = r0.id
            r8.put(r0, r4)
            goto L72
        L85:
            com.facebook.aura.webview.HtmlWebViewPool r9 = com.facebook.aura.spaces.preload.SpacesWebViewFactoryKt.getSpacesWebViewPool(r11)
            com.facebook.aura.spaces.cache.SpacesDiskCache$Companion r0 = com.facebook.aura.spaces.cache.SpacesDiskCache.Companion
            com.facebook.aura.spaces.cache.SpacesDiskCache r13 = r0.getInstance(r11)
            java.lang.String r12 = com.facebook.aura.gateway.VmAuthTokenKt.vmBoundAuthToken(r11)
            X.GB9 r0 = com.facebook.aura.executors.AuraDispatchers.main
            r14 = 0
            com.facebook.aura.spaces.preload.SpaceTabWebViewPreloaderKt$preloadSpaceTabWebViews$2 r6 = new com.facebook.aura.spaces.preload.SpaceTabWebViewPreloaderKt$preloadSpaceTabWebViews$2
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            r3.L$0 = r14
            r3.L$1 = r14
            r3.L$2 = r14
            r3.L$3 = r14
            r3.L$4 = r14
            r3.L$5 = r14
            r3.L$6 = r14
            r3.L$7 = r14
            r3.label = r1
            java.lang.Object r0 = X.GAo.A00(r3, r0, r6)
            if (r0 != r2) goto L26
            return r2
        Lb4:
            com.facebook.aura.spaces.preload.SpaceTabWebViewPreloaderKt$preloadSpaceTabWebViews$1 r3 = new com.facebook.aura.spaces.preload.SpaceTabWebViewPreloaderKt$preloadSpaceTabWebViews$1
            r3.<init>(r14)
            goto L15
        Lbb:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.preload.SpaceTabWebViewPreloaderKt.preloadSpaceTabWebViews(X.CGz, android.content.Context, java.util.List, X.HtJ):java.lang.Object");
    }

    public static final Set<String> selectWarmSpaceTabSlugs(List<String> list) {
        C7384Etj.A0Y(list, 0);
        return AbstractC0878AGe.A0g(AbstractC0878AGe.A0a(C3cG.A0m(list), 2));
    }

    public static /* synthetic */ void loadPeerSpaceDocument$default(C6t6 c6t6, AbstractC3358CGz abstractC3358CGz, String str, String str2, G0U g0u, int i, Object obj) {
        if ((i & 8) != 0) {
            g0u = AnonymousClass1.INSTANCE;
        }
        loadPeerSpaceDocument(c6t6, abstractC3358CGz, str, str2, g0u);
    }

    public static /* synthetic */ void loadSpaceDocument$default(C6t6 c6t6, AbstractC3358CGz abstractC3358CGz, String str, long j, String str2, SpacesDiskCache spacesDiskCache, G0U g0u, int i, Object obj) {
        if ((i & 32) != 0) {
            g0u = C139021.INSTANCE;
        }
        loadSpaceDocument(c6t6, abstractC3358CGz, str, j, str2, spacesDiskCache, g0u);
    }

    public static final void evictRemovedSpaceTabWebViews(AbstractC3358CGz abstractC3358CGz, Collection<String> collection) {
        HtmlSpacesWebViewSession htmlSpacesWebViewSessionSpacesSession;
        boolean zA1b = AnonymousClass004.A1b(abstractC3358CGz, collection);
        HtmlWebViewPool spacesWebViewPool = SpacesWebViewFactoryKt.getSpacesWebViewPool(abstractC3358CGz);
        Iterator it = C3cG.A0m(collection).iterator();
        while (it.hasNext()) {
            String strA0M = FGI.A0M(HtmlSpacesWebViewKt.SPACE_CACHE_KEY_PREFIX, (String) it.next());
            C6t6 c6t6Peek = spacesWebViewPool.peek(strA0M);
            if (c6t6Peek != null && (htmlSpacesWebViewSessionSpacesSession = SpacesWebViewSessionKt.spacesSession(c6t6Peek)) != null) {
                if (htmlSpacesWebViewSessionSpacesSession.fileChooserHost == null) {
                    try {
                        htmlSpacesWebViewSessionSpacesSession.cancelPendingFileRequest();
                    } finally {
                        spacesWebViewPool.setEvictionGuard(strA0M, zA1b);
                    }
                } else {
                    continue;
                }
            }
            spacesWebViewPool.evictRemovedTabWhenUnbound(strA0M);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean isOnGatewayOrigin(java.lang.String r3, X.AbstractC3358CGz r4) {
        /*
            java.lang.String r1 = X.C60P.A1K(r4)
            boolean r0 = X.C7BY.A0j(r1)
            r4 = 0
            if (r0 != 0) goto L49
            com.facebook.aura.network.http.HatchHttpApi r0 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            java.lang.String r0 = r0.jarvisHttpBaseUrl(r1)
            if (r0 == 0) goto L49
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L36
            android.net.Uri r2 = android.net.Uri.parse(r0)     // Catch: java.lang.Throwable -> L36
            java.lang.String r1 = r3.getScheme()     // Catch: java.lang.Throwable -> L36
            java.lang.String r0 = r2.getScheme()     // Catch: java.lang.Throwable -> L36
            boolean r0 = X.C7384Etj.areEqual(r1, r0)     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L30
            boolean r1 = X.C60R.A1S(r3, r2)     // Catch: java.lang.Throwable -> L36
            r0 = 1
            if (r1 != 0) goto L31
        L30:
            r0 = 0
        L31:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L36
            goto L3b
        L36:
            r0 = move-exception
            X.Hud r2 = X.C3cG.A0s(r0)
        L3b:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            boolean r0 = r2 instanceof X.C10571Hud
            if (r0 == 0) goto L44
            r2 = r1
        L44:
            boolean r0 = X.AnonymousClass001.A1X(r2)
            return r0
        L49:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.preload.SpaceTabWebViewPreloaderKt.isOnGatewayOrigin(java.lang.String, X.CGz):boolean");
    }

    public static final void retainSpaceTabWebViews(AbstractC3358CGz abstractC3358CGz, Collection<String> collection) {
        AnonymousClass003.A0u(abstractC3358CGz, collection);
        HtmlWebViewPool spacesWebViewPool = SpacesWebViewFactoryKt.getSpacesWebViewPool(abstractC3358CGz);
        Iterator it = C3cG.A0m(collection).iterator();
        while (it.hasNext()) {
            spacesWebViewPool.retain(FGI.A0M(HtmlSpacesWebViewKt.SPACE_CACHE_KEY_PREFIX, (String) it.next()));
        }
    }
}
