package com.facebook.aura.explore.view.cards;

import X.A6B;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AnonymousClass007;
import X.BTQ;
import X.C06H;
import X.C3UX;
import X.C7384Etj;
import X.HtJ;
import X.Hxb;
import X.HzP;
import X.InterfaceC7549F2g;
import com.facebook.aura.common.coroutines.OnDuplicateCall;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.common.coroutines.SingleFlightKt;
import com.facebook.aura.explore.repo.IdeaCard;
import com.facebook.aura.explore.repo.IdeaCardsDataSource;
import com.facebook.aura.gateway.HatchThumbnailDisplaySize;
import com.facebook.aura.memory.AuraByteLruCache;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public final class IdeaIconCache implements InterfaceC7549F2g {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public static final long ENTRY_OVERHEAD_BYTES = 128;
    public static final long FAILURE_TTL_MS = 600000;
    public static final long LOW_RAM_MAX_WEIGHT_BYTES = 262144;
    public static final int MAX_ENTRIES = 256;
    public static final long MAX_WEIGHT_BYTES = 524288;
    public static final long SUCCESS_TTL_MS = 86400000;
    public final AuraByteLruCache<String, CacheEntry> cache;
    public final C3UX scope;
    public final SingleFlight singleFlight;
    public final AbstractC3358CGz userSession;

    public final class CacheEntry {
        public final long expiresAtMs;
        public final IdeaIcon icon;

        public final long getExpiresAtMs() {
            return this.expiresAtMs;
        }

        public final IdeaIcon getIcon() {
            return this.icon;
        }

        public CacheEntry(IdeaIcon ideaIcon, long j) {
            this.icon = ideaIcon;
            this.expiresAtMs = j;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.explore.view.cards.IdeaIconCache", f = "IdeaPreviewImageUrls.kt", l = {137}, m = "fetchAndCache", v = 2)
    /* renamed from: com.facebook.aura.explore.view.cards.IdeaIconCache$fetchAndCache$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return IdeaIconCache.this.fetchAndCache(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.explore.view.cards.IdeaIconCache", f = "IdeaPreviewImageUrls.kt", l = {166}, m = "fromDetail", v = 2)
    /* renamed from: com.facebook.aura.explore.view.cards.IdeaIconCache$fromDetail$1, reason: invalid class name and case insensitive filesystem */
    public final class C118621 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C118621(HtJ<? super C118621> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return IdeaIconCache.this.fromDetail(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.explore.view.cards.IdeaIconCache", f = "IdeaPreviewImageUrls.kt", l = {120}, m = "icon", v = 2)
    /* renamed from: com.facebook.aura.explore.view.cards.IdeaIconCache$icon$1, reason: invalid class name and case insensitive filesystem */
    public final class C118631 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C118631(HtJ<? super C118631> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return IdeaIconCache.this.icon(null, null, this);
        }
    }

    private final CacheEntry cached(String str) {
        CacheEntry cacheEntry = this.cache.get(str);
        if (cacheEntry == null || System.currentTimeMillis() >= cacheEntry.expiresAtMs) {
            return null;
        }
        return cacheEntry;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchAndCache(java.lang.String r8, java.lang.String r9, com.facebook.aura.gateway.HatchThumbnailDisplaySize r10, X.HtJ<? super com.facebook.aura.explore.view.cards.IdeaIcon> r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof com.facebook.aura.explore.view.cards.IdeaIconCache.AnonymousClass1
            if (r0 == 0) goto L69
            r4 = r11
            com.facebook.aura.explore.view.cards.IdeaIconCache$fetchAndCache$1 r4 = (com.facebook.aura.explore.view.cards.IdeaIconCache.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L69
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r6 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L39
            if (r0 != r2) goto L6f
            java.lang.Object r8 = r4.L$0
            X.Hwg.A00(r6)
        L22:
            com.facebook.aura.explore.view.cards.IdeaIcon r6 = (com.facebook.aura.explore.view.cards.IdeaIcon) r6
            if (r6 != 0) goto L65
            r4 = 600000(0x927c0, double:2.964394E-318)
        L29:
            com.facebook.aura.memory.AuraByteLruCache<java.lang.String, com.facebook.aura.explore.view.cards.IdeaIconCache$CacheEntry> r3 = r7.cache
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 + r4
            com.facebook.aura.explore.view.cards.IdeaIconCache$CacheEntry r0 = new com.facebook.aura.explore.view.cards.IdeaIconCache$CacheEntry
            r0.<init>(r6, r1)
            r3.put(r8, r0)
            return r6
        L39:
            X.Hwg.A00(r6)
            com.facebook.aura.explore.view.cards.IdeaIconCache$CacheEntry r0 = r7.cached(r8)
            if (r0 == 0) goto L45
            com.facebook.aura.explore.view.cards.IdeaIcon r3 = r0.icon
            return r3
        L45:
            com.facebook.aura.explore.repo.IdeaCardsDataSource$Companion r1 = com.facebook.aura.explore.repo.IdeaCardsDataSource.Companion
            X.CGz r0 = r7.userSession
            com.facebook.aura.explore.repo.IdeaCardsDataSource r1 = r1.getInstance(r0)
            com.facebook.aura.explore.view.cards.IdeaIcon r6 = r7.fromFeed(r1, r9, r10)
            if (r6 != 0) goto L65
            r4.L$0 = r8
            r0 = 0
            r4.L$1 = r0
            r4.L$2 = r0
            r4.L$3 = r0
            r4.label = r2
            java.lang.Object r6 = r7.fromDetail(r1, r9, r10, r4)
            if (r6 != r3) goto L22
            return r3
        L65:
            r4 = 86400000(0x5265c00, double:4.2687272E-316)
            goto L29
        L69:
            com.facebook.aura.explore.view.cards.IdeaIconCache$fetchAndCache$1 r4 = new com.facebook.aura.explore.view.cards.IdeaIconCache$fetchAndCache$1
            r4.<init>(r11)
            goto L12
        L6f:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.explore.view.cards.IdeaIconCache.fetchAndCache(java.lang.String, java.lang.String, com.facebook.aura.gateway.HatchThumbnailDisplaySize, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fromDetail(com.facebook.aura.explore.repo.IdeaCardsDataSource r6, java.lang.String r7, com.facebook.aura.gateway.HatchThumbnailDisplaySize r8, X.HtJ<? super com.facebook.aura.explore.view.cards.IdeaIcon> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.facebook.aura.explore.view.cards.IdeaIconCache.C118621
            if (r0 == 0) goto L3d
            r4 = r9
            com.facebook.aura.explore.view.cards.IdeaIconCache$fromDetail$1 r4 = (com.facebook.aura.explore.view.cards.IdeaIconCache.C118621) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3d
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L2a
            if (r0 != r1) goto L4e
            java.lang.Object r8 = r4.L$2
            com.facebook.aura.gateway.HatchThumbnailDisplaySize r8 = (com.facebook.aura.gateway.HatchThumbnailDisplaySize) r8
            X.Hwg.A00(r3)
        L24:
            com.facebook.aura.explore.repo.IdeaCardDetail r3 = (com.facebook.aura.explore.repo.IdeaCardDetail) r3
            if (r3 != 0) goto L43
            r2 = 0
            return r2
        L2a:
            X.Hwg.A00(r3)
            r0 = 0
            r4.L$0 = r0
            r4.L$1 = r0
            r4.L$2 = r8
            r4.label = r1
            java.lang.Object r3 = r6.fetchCardDetail(r7, r4)
            if (r3 != r2) goto L24
            return r2
        L3d:
            com.facebook.aura.explore.view.cards.IdeaIconCache$fromDetail$1 r4 = new com.facebook.aura.explore.view.cards.IdeaIconCache$fromDetail$1
            r4.<init>(r9)
            goto L12
        L43:
            java.lang.String r2 = r3.iconUrl
            java.lang.String r1 = r3.iconMimeType
            X.CGz r0 = r5.userSession
            com.facebook.aura.explore.view.cards.IdeaIcon r2 = com.facebook.aura.explore.view.cards.IdeaPreviewImageUrlsKt.toIdeaIcon(r2, r1, r0, r8)
            return r2
        L4e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.explore.view.cards.IdeaIconCache.fromDetail(com.facebook.aura.explore.repo.IdeaCardsDataSource, java.lang.String, com.facebook.aura.gateway.HatchThumbnailDisplaySize, X.HtJ):java.lang.Object");
    }

    private final IdeaIcon fromFeed(IdeaCardsDataSource ideaCardsDataSource, String str, HatchThumbnailDisplaySize hatchThumbnailDisplaySize) {
        Object next;
        BTQ btq = new BTQ(A6B.A05(IdeaIconCache$fromFeed$card$1.INSTANCE, AbstractC0878AGe.A06(ideaCardsDataSource.feedState.getValue().sections)));
        while (true) {
            if (!btq.hasNext()) {
                next = null;
                break;
            }
            next = btq.next();
            if (C7384Etj.areEqual(((IdeaCard) next).ideaCardId, str)) {
                break;
            }
        }
        IdeaCard ideaCard = (IdeaCard) next;
        if (ideaCard == null) {
            return null;
        }
        return IdeaPreviewImageUrlsKt.toIdeaIcon(ideaCard.iconUrl, ideaCard.iconMimeType, this.userSession, hatchThumbnailDisplaySize);
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        this.cache.clear();
        this.singleFlight.clearAndCancelAll();
        Hxb.A03(null, this.scope);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object icon(java.lang.String r8, com.facebook.aura.gateway.HatchThumbnailDisplaySize r9, X.HtJ<? super com.facebook.aura.explore.view.cards.IdeaIcon> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.facebook.aura.explore.view.cards.IdeaIconCache.C118631
            r6 = r7
            if (r0 == 0) goto L74
            r4 = r10
            com.facebook.aura.explore.view.cards.IdeaIconCache$icon$1 r4 = (com.facebook.aura.explore.view.cards.IdeaIconCache.C118631) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L74
            int r2 = r2 - r1
            r4.label = r2
        L13:
            java.lang.Object r1 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r10 = 0
            r2 = 1
            if (r0 == 0) goto L31
            if (r0 != r2) goto L7a
            java.lang.Object r7 = r4.L$2
            java.lang.String r7 = (java.lang.String) r7
            X.Hwg.A00(r1)
        L26:
            com.facebook.aura.common.coroutines.SingleFlightResult r1 = (com.facebook.aura.common.coroutines.SingleFlightResult) r1
            boolean r0 = r1 instanceof com.facebook.aura.common.coroutines.SingleFlightResult.Result
            if (r0 == 0) goto L63
            com.facebook.aura.common.coroutines.SingleFlightResult$Result r1 = (com.facebook.aura.common.coroutines.SingleFlightResult.Result) r1
            T r10 = r1.value
        L30:
            return r10
        L31:
            X.Hwg.A00(r1)
            if (r9 == 0) goto L60
            java.lang.String r1 = r9.name()
        L3a:
            java.lang.String r0 = ":"
            java.lang.String r7 = X.FGI.A0U(r1, r0, r8)
            com.facebook.aura.explore.view.cards.IdeaIconCache$CacheEntry r0 = r6.cached(r7)
            if (r0 != 0) goto L71
            X.3UX r0 = r6.scope
            com.facebook.aura.explore.view.cards.IdeaIconCache$icon$result$1 r5 = new com.facebook.aura.explore.view.cards.IdeaIconCache$icon$result$1
            r5.<init>(r6, r7, r8, r9, r10)
            X.Hrx r0 = X.AnonymousClass001.A10(r5, r0)
            r4.L$0 = r10
            r4.L$1 = r10
            r4.L$2 = r7
            r4.label = r2
            java.lang.Object r1 = r0.A0E(r4)
            if (r1 != r3) goto L26
            return r3
        L60:
            java.lang.String r1 = ""
            goto L3a
        L63:
            com.facebook.aura.common.coroutines.SingleFlightResult$Skipped r0 = com.facebook.aura.common.coroutines.SingleFlightResult.Skipped.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 == 0) goto L7f
            com.facebook.aura.explore.view.cards.IdeaIconCache$CacheEntry r0 = r6.cached(r7)
            if (r0 == 0) goto L30
        L71:
            com.facebook.aura.explore.view.cards.IdeaIcon r10 = r0.icon
            return r10
        L74:
            com.facebook.aura.explore.view.cards.IdeaIconCache$icon$1 r4 = new com.facebook.aura.explore.view.cards.IdeaIconCache$icon$1
            r4.<init>(r10)
            goto L13
        L7a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L7f:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.explore.view.cards.IdeaIconCache.icon(java.lang.String, com.facebook.aura.gateway.HatchThumbnailDisplaySize, X.HtJ):java.lang.Object");
    }

    public final class Companion {
        public final IdeaIconCache getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (IdeaIconCache) abstractC3358CGz.A03(IdeaIconCache.class, new IdeaIconCache$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public /* synthetic */ IdeaIconCache(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }

    public IdeaIconCache(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        this.singleFlight = SingleFlightKt.SingleFlight(abstractC3358CGz, OnDuplicateCall.Join.INSTANCE, false);
        this.scope = AnonymousClass007.A0k();
        int i = 256;
        long j = 524288;
        long j2 = 262144;
        boolean z = true;
        long j3 = 0;
        this.cache = new AuraByteLruCache<>(i, j, j2, z, j3, IdeaIconCache$cache$1.INSTANCE, 16, null);
    }
}
