package com.facebook.aura.feed.repo;

import X.AbstractC05623ug;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C05663ul;
import X.C06H;
import X.C20Q;
import X.C20Z;
import X.C3UX;
import X.C7384Etj;
import X.G0V;
import X.HtJ;
import X.HxE;
import X.HzP;
import X.InterfaceC7549F2g;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes6.dex */
public final class FeedRepository implements InterfaceC7549F2g {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public volatile FeedPageJson prefetchedPage;
    public volatile FeedPrompt prefetchedPrompt;
    public volatile FeedStatus prefetchedStatus;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.feed.repo.FeedRepository", f = "FeedRepository.kt", l = {286, 287}, m = "prefetchInitialFeed", v = 2)
    /* renamed from: com.facebook.aura.feed.repo.FeedRepository$prefetchInitialFeed$1, reason: invalid class name */
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
            return FeedRepository.this.prefetchInitialFeed(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.feed.repo.FeedRepository$prefetchInitialFeed$2", f = "FeedRepository.kt", l = {291, 292}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.feed.repo.FeedRepository$prefetchInitialFeed$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ FeedPrompt $prompt;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(FeedPrompt feedPrompt, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$prompt = feedPrompt;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass2 anonymousClass2 = FeedRepository.this.new AnonymousClass2(this.$prompt, htJ);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0083 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r10 = r11.L$0
                X.3UX r10 = (X.C3UX) r10
                X.Hji r7 = X.EnumC10460Hji.A02
                int r0 = r11.label
                r6 = 2
                r9 = 1
                r5 = 0
                if (r0 == 0) goto L28
                if (r0 == r9) goto L5b
                if (r0 != r6) goto L84
                X.Hwg.A00(r12)
            L14:
                X.HsJ r12 = (X.HsJ) r12
                java.lang.Object r1 = r12.value
                boolean r0 = r1 instanceof X.C10571Hud
                if (r0 == 0) goto L1d
                r1 = r5
            L1d:
                com.facebook.aura.feed.repo.FeedStatus r1 = (com.facebook.aura.feed.repo.FeedStatus) r1
                if (r1 == 0) goto L83
                com.facebook.aura.feed.repo.FeedRepository r0 = com.facebook.aura.feed.repo.FeedRepository.this
                r0.prefetchedStatus = r1
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L28:
                X.Hwg.A00(r12)
                com.facebook.aura.feed.repo.FeedRepository r1 = com.facebook.aura.feed.repo.FeedRepository.this
                com.facebook.aura.feed.repo.FeedRepository$prefetchInitialFeed$2$page$1 r0 = new com.facebook.aura.feed.repo.FeedRepository$prefetchInitialFeed$2$page$1
                r0.<init>(r1, r5)
                r8 = 0
                X.6ys r4 = X.C6ys.A00
                java.lang.Integer r3 = X.C79.A00
                X.Hrx r2 = X.GAo.A01(r3, r4, r0, r10)
                com.facebook.aura.feed.repo.FeedRepository r1 = com.facebook.aura.feed.repo.FeedRepository.this
                com.facebook.aura.feed.repo.FeedRepository$prefetchInitialFeed$2$status$1 r0 = new com.facebook.aura.feed.repo.FeedRepository$prefetchInitialFeed$2$status$1
                r0.<init>(r1, r5)
                X.Hrx r3 = X.GAo.A01(r3, r4, r0, r10)
                com.facebook.aura.feed.repo.FeedRepository r1 = com.facebook.aura.feed.repo.FeedRepository.this
                com.facebook.aura.feed.repo.FeedPrompt r0 = r11.$prompt
                r1.prefetchedPrompt = r0
                r11.L$0 = r8
                r11.L$1 = r8
                r11.L$2 = r3
                r11.label = r9
                java.lang.Object r12 = r2.A0E(r11)
                if (r12 != r7) goto L62
                return r7
            L5b:
                java.lang.Object r3 = r11.L$2
                X.27k r3 = (X.C27k) r3
                X.Hwg.A00(r12)
            L62:
                X.HsJ r12 = (X.HsJ) r12
                java.lang.Object r1 = r12.value
                boolean r0 = r1 instanceof X.C10571Hud
                if (r0 == 0) goto L6b
                r1 = r5
            L6b:
                com.facebook.aura.feed.repo.FeedPageJson r1 = (com.facebook.aura.feed.repo.FeedPageJson) r1
                if (r1 == 0) goto L73
                com.facebook.aura.feed.repo.FeedRepository r0 = com.facebook.aura.feed.repo.FeedRepository.this
                r0.prefetchedPage = r1
            L73:
                r0 = 0
                r11.L$0 = r0
                r11.L$1 = r0
                r11.L$2 = r0
                r11.label = r6
                java.lang.Object r12 = X.C3cG.A0W(r3, r11)
                if (r12 != r7) goto L14
                return r7
            L83:
                return r5
            L84:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.feed.repo.FeedRepository.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.feed.repo.FeedRepository$streamInfiniteFeed$1", f = "FeedRepository.kt", l = {98, 130}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.feed.repo.FeedRepository$streamInfiniteFeed$1, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes3.dex */
    public final class C118821 extends AbstractC07127nr implements G0V<C20Z<? super FeedInfiniteEvent>, HtJ<? super Unit>, Object> {
        public /* synthetic */ Object L$0;
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

        public C118821(HtJ<? super C118821> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C118821 c118821 = FeedRepository.this.new C118821(htJ);
            c118821.L$0 = obj;
            return c118821;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x005f, code lost:
        
            if (r8 == r3) goto L12;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00af A[Catch: all -> 0x00fb, TRY_LEAVE, TryCatch #1 {all -> 0x00fb, blocks: (B:7:0x0028, B:31:0x00a9, B:33:0x00af, B:37:0x00c5, B:40:0x00ca, B:42:0x00ce, B:44:0x00d4, B:46:0x00d8, B:47:0x00de, B:36:0x00c1, B:29:0x009a, B:34:0x00b5), top: B:73:0x0012, outer: #2, inners: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0104 A[Catch: all -> 0x011c, TryCatch #2 {all -> 0x011c, blocks: (B:55:0x0104, B:56:0x0107, B:53:0x00fe, B:25:0x008a, B:19:0x0073, B:21:0x0077, B:23:0x007d, B:24:0x007f, B:26:0x008b, B:28:0x0094, B:7:0x0028, B:31:0x00a9, B:33:0x00af, B:37:0x00c5, B:40:0x00ca, B:42:0x00ce, B:44:0x00d4, B:46:0x00d8, B:47:0x00de, B:36:0x00c1, B:29:0x009a, B:34:0x00b5, B:51:0x00fc), top: B:73:0x0012, inners: #1, #3 }] */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0116  */
        /* JADX WARN: Type inference failed for: r10v5, types: [java.io.Closeable] */
        /* JADX WARN: Type inference failed for: r6v0, types: [int] */
        /* JADX WARN: Type inference failed for: r6v1, types: [java.io.Closeable] */
        /* JADX WARN: Type inference failed for: r6v10 */
        /* JADX WARN: Type inference failed for: r6v11 */
        /* JADX WARN: Type inference failed for: r6v2 */
        /* JADX WARN: Type inference failed for: r6v5, types: [com.facebook.aura.network.transport.HatchHttpResponseStream] */
        /* JADX WARN: Type inference failed for: r6v6, types: [java.io.Closeable] */
        /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.io.IOException, com.facebook.aura.feed.repo.FeedInfiniteException {
            /*
                Method dump skipped, instructions count: 318
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.feed.repo.FeedRepository.C118821.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C20Z<? super FeedInfiniteEvent> c20z, HtJ<? super Unit> htJ) {
            return ((C118821) create(c20z, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        this.prefetchedPrompt = null;
        this.prefetchedPage = null;
        this.prefetchedStatus = null;
    }

    public final C20Q<FeedInfiniteEvent> streamInfiniteFeed() {
        return AbstractC05623ug.A00(AnonymousClass001.A0y(), new C05663ul(new C118821(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008f  */
    /* renamed from: fetchFeedPage-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m801fetchFeedPagegIAlus(X.HxE<java.lang.String, java.lang.Object>[] r21, X.HtJ<? super X.HsJ<com.facebook.aura.feed.repo.FeedPageJson>> r22) {
        /*
            r20 = this;
            r3 = r22
            boolean r0 = r3 instanceof com.facebook.aura.feed.repo.FeedRepository$fetchFeedPage$1
            r5 = r20
            if (r0 == 0) goto L8f
            r4 = r3
            com.facebook.aura.feed.repo.FeedRepository$fetchFeedPage$1 r4 = (com.facebook.aura.feed.repo.FeedRepository$fetchFeedPage$1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8f
            int r2 = r2 - r1
            r4.label = r2
        L16:
            java.lang.Object r1 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r3 = 1
            if (r0 == 0) goto L26
            if (r0 != r3) goto L95
            java.lang.Object r2 = X.AnonymousClass001.A0q(r1)
        L25:
            return r2
        L26:
            X.Hwg.A00(r1)
            com.facebook.aura.network.http.HatchHttpApi r7 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            com.facebook.aura.feed.repo.FeedJarvisPath$Feed r10 = com.facebook.aura.feed.repo.FeedJarvisPath.Feed.INSTANCE
            com.facebook.aura.network.http.RequestType r11 = com.facebook.aura.network.http.RequestType.GET
            X.CGz r12 = r5.userSession
            java.lang.Long r13 = X.AbstractC7609F5w.A0l()
            java.util.TimeZone r0 = java.util.TimeZone.getDefault()
            java.lang.String r1 = r0.getID()
            java.lang.String r0 = "timezone"
            X.HxE r6 = X.C3cG.A0r(r0, r1)
            r9 = 0
            r1 = r21
            X.C7384Etj.A0Y(r1, r9)
            int r5 = r1.length
            int r0 = r5 + 1
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            r1[r5] = r6
            X.HxE[] r1 = (X.HxE[]) r1
            int r0 = r1.length
            java.lang.Object[] r14 = java.util.Arrays.copyOf(r1, r0)
            X.HxE[] r14 = (X.HxE[]) r14
            java.util.Set r16 = X.AnonymousClass004.A18()
            X.9jH r18 = X.C9jH.A00
            com.facebook.aura.feed.repo.FeedRepository$fetchFeedPage-gIAlu-s$$inlined$executeJarvisRequest-1iavgos$default$1 r8 = com.facebook.aura.feed.repo.FeedRepository$fetchFeedPagegIAlus$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE
            r15 = 0
            r4.L$0 = r15
            r4.L$1 = r15
            r4.L$2 = r15
            r4.L$3 = r15
            r4.L$4 = r15
            r4.L$5 = r15
            r4.L$6 = r15
            r4.L$7 = r15
            r4.L$8 = r15
            r4.I$0 = r3
            r4.I$1 = r3
            r4.I$2 = r9
            r4.label = r3
            r19 = r3
            r20 = r15
            r21 = r9
            r22 = r4
            r17 = r3
            java.lang.Object r0 = r7.m1595executeBodylessJarvisRequestWithp3iPjrY(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            if (r0 == r2) goto L25
            return r0
        L8f:
            com.facebook.aura.feed.repo.FeedRepository$fetchFeedPage$1 r4 = new com.facebook.aura.feed.repo.FeedRepository$fetchFeedPage$1
            r4.<init>(r5, r3)
            goto L16
        L95:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.feed.repo.FeedRepository.m801fetchFeedPagegIAlus(X.HxE[], X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: fetchFeedPage-gIAlu-s$default, reason: not valid java name */
    public static /* synthetic */ Object m802fetchFeedPagegIAlus$default(FeedRepository feedRepository, HxE[] hxEArr, HtJ htJ, int i, Object obj) {
        if ((i & 1) != 0) {
            hxEArr = new HxE[0];
        }
        return feedRepository.m801fetchFeedPagegIAlus(hxEArr, htJ);
    }

    /* renamed from: getCursorFeed-0E7RQCE$default, reason: not valid java name */
    public static /* synthetic */ Object m803getCursorFeed0E7RQCE$default(FeedRepository feedRepository, String str, String str2, HtJ htJ, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return feedRepository.m807getCursorFeed0E7RQCE(str, str2, htJ);
    }

    /* renamed from: search-0E7RQCE$default, reason: not valid java name */
    public static /* synthetic */ Object m804search0E7RQCE$default(FeedRepository feedRepository, String str, String str2, HtJ htJ, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return feedRepository.m815search0E7RQCE(str, str2, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0070  */
    /* renamed from: deleteUnit-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m805deleteUnitgIAlus(java.lang.String r18, X.HtJ<? super X.HsJ<kotlin.Unit>> r19) {
        /*
            r17 = this;
            r4 = r19
            boolean r0 = r4 instanceof com.facebook.aura.feed.repo.FeedRepository$deleteUnit$1
            r5 = r17
            if (r0 == 0) goto L70
            r3 = r4
            com.facebook.aura.feed.repo.FeedRepository$deleteUnit$1 r3 = (com.facebook.aura.feed.repo.FeedRepository$deleteUnit$1) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L70
            int r2 = r2 - r1
            r3.label = r2
        L16:
            java.lang.Object r2 = r3.result
            X.Hji r1 = X.EnumC10460Hji.A02
            int r0 = r3.label
            r6 = 1
            if (r0 == 0) goto L26
            if (r0 != r6) goto L76
            java.lang.Object r1 = X.AnonymousClass001.A0q(r2)
        L25:
            return r1
        L26:
            X.Hwg.A00(r2)
            com.facebook.aura.network.http.HatchHttpApi r4 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            com.facebook.aura.feed.repo.FeedJarvisPath$FeedUnit r7 = new com.facebook.aura.feed.repo.FeedJarvisPath$FeedUnit
            r0 = r18
            r7.<init>(r0)
            com.facebook.aura.network.http.RequestType r8 = com.facebook.aura.network.http.RequestType.DELETE
            X.CGz r9 = r5.userSession
            java.lang.Long r10 = X.AbstractC7609F5w.A0l()
            r0 = 0
            X.HxE[] r11 = new X.HxE[r0]
            java.util.Set r13 = X.AnonymousClass004.A18()
            X.9jH r15 = X.C9jH.A00
            com.facebook.aura.feed.repo.FeedRepository$deleteUnit-gIAlu-s$$inlined$executeJarvisRequest-1iavgos$default$1 r5 = com.facebook.aura.feed.repo.FeedRepository$deleteUnitgIAlus$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE
            r12 = 0
            r3.L$0 = r12
            r3.L$1 = r12
            r3.L$2 = r12
            r3.L$3 = r12
            r3.L$4 = r12
            r3.L$5 = r12
            r3.L$6 = r12
            r3.L$7 = r12
            r3.L$8 = r12
            r3.I$0 = r6
            r3.I$1 = r6
            r3.I$2 = r0
            r3.label = r6
            r14 = r6
            r16 = r6
            r17 = r12
            r19 = r3
            r18 = r0
            java.lang.Object r0 = r4.m1595executeBodylessJarvisRequestWithp3iPjrY(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            if (r0 == r1) goto L25
            return r0
        L70:
            com.facebook.aura.feed.repo.FeedRepository$deleteUnit$1 r3 = new com.facebook.aura.feed.repo.FeedRepository$deleteUnit$1
            r3.<init>(r5, r4)
            goto L16
        L76:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.feed.repo.FeedRepository.m805deleteUnitgIAlus(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* renamed from: fetchLatestFeed-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m806fetchLatestFeedIoAF18A(X.HtJ<? super X.HsJ<com.facebook.aura.feed.repo.FeedPage>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.facebook.aura.feed.repo.FeedRepository$fetchLatestFeed$1
            if (r0 == 0) goto L3d
            r4 = r6
            com.facebook.aura.feed.repo.FeedRepository$fetchLatestFeed$1 r4 = (com.facebook.aura.feed.repo.FeedRepository$fetchLatestFeed$1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3d
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r1 = r4.label
            r0 = 1
            if (r1 == 0) goto L2e
            if (r1 != r0) goto L43
            java.lang.Object r1 = X.AnonymousClass001.A0q(r3)
        L21:
            boolean r0 = r1 instanceof X.C10571Hud
            r0 = r0 ^ 1
            if (r0 == 0) goto L2d
            com.facebook.aura.feed.repo.FeedPageJson r1 = (com.facebook.aura.feed.repo.FeedPageJson) r1
            com.facebook.aura.feed.repo.FeedPage r1 = r1.toDomain()
        L2d:
            return r1
        L2e:
            X.Hwg.A00(r3)
            r4.label = r0
            r0 = 0
            X.HxE[] r0 = new X.HxE[r0]
            java.lang.Object r1 = r5.m801fetchFeedPagegIAlus(r0, r4)
            if (r1 != r2) goto L21
            return r2
        L3d:
            com.facebook.aura.feed.repo.FeedRepository$fetchLatestFeed$1 r4 = new com.facebook.aura.feed.repo.FeedRepository$fetchLatestFeed$1
            r4.<init>(r5, r6)
            goto L12
        L43:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.feed.repo.FeedRepository.m806fetchLatestFeedIoAF18A(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /* renamed from: getCursorFeed-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m807getCursorFeed0E7RQCE(java.lang.String r6, java.lang.String r7, X.HtJ<? super X.HsJ<com.facebook.aura.feed.repo.FeedCursorPage>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.facebook.aura.feed.repo.FeedRepository$getCursorFeed$1
            if (r0 == 0) goto L4f
            r4 = r8
            com.facebook.aura.feed.repo.FeedRepository$getCursorFeed$1 r4 = (com.facebook.aura.feed.repo.FeedRepository$getCursorFeed$1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4f
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L2e
            if (r0 != r2) goto L55
            java.lang.Object r1 = X.AnonymousClass001.A0q(r1)
        L21:
            boolean r0 = r1 instanceof X.C10571Hud
            r0 = r0 ^ 1
            if (r0 == 0) goto L2d
            com.facebook.aura.feed.repo.FeedPageJson r1 = (com.facebook.aura.feed.repo.FeedPageJson) r1
        L29:
            com.facebook.aura.feed.repo.FeedCursorPage r1 = r1.toCursorDomain()
        L2d:
            return r1
        L2e:
            X.Hwg.A00(r1)
            if (r6 != 0) goto L3d
            if (r7 != 0) goto L3d
            com.facebook.aura.feed.repo.FeedPageJson r1 = r5.prefetchedPage
            if (r1 == 0) goto L3d
            r0 = 0
            r5.prefetchedPage = r0
            goto L29
        L3d:
            X.HxE[] r1 = com.facebook.aura.feed.repo.FeedRepositoryKt.feedCursorQueryParams(r6, r7)
            r0 = 0
            r4.L$0 = r0
            r4.L$1 = r0
            r4.label = r2
            java.lang.Object r1 = r5.m801fetchFeedPagegIAlus(r1, r4)
            if (r1 != r3) goto L21
            return r3
        L4f:
            com.facebook.aura.feed.repo.FeedRepository$getCursorFeed$1 r4 = new com.facebook.aura.feed.repo.FeedRepository$getCursorFeed$1
            r4.<init>(r5, r8)
            goto L12
        L55:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.feed.repo.FeedRepository.m807getCursorFeed0E7RQCE(java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    /* renamed from: getFeed-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m808getFeedIoAF18A(X.HtJ<? super X.HsJ<com.facebook.aura.feed.repo.FeedPage>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.facebook.aura.feed.repo.FeedRepository$getFeed$1
            if (r0 == 0) goto L45
            r4 = r6
            com.facebook.aura.feed.repo.FeedRepository$getFeed$1 r4 = (com.facebook.aura.feed.repo.FeedRepository$getFeed$1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L45
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L2e
            if (r0 != r2) goto L4b
            java.lang.Object r1 = X.AnonymousClass001.A0q(r1)
        L21:
            boolean r0 = r1 instanceof X.C10571Hud
            r0 = r0 ^ 1
            if (r0 == 0) goto L2d
            com.facebook.aura.feed.repo.FeedPageJson r1 = (com.facebook.aura.feed.repo.FeedPageJson) r1
        L29:
            com.facebook.aura.feed.repo.FeedPage r1 = r1.toDomain()
        L2d:
            return r1
        L2e:
            X.Hwg.A00(r1)
            com.facebook.aura.feed.repo.FeedPageJson r1 = r5.prefetchedPage
            r0 = 0
            if (r1 == 0) goto L39
            r5.prefetchedPage = r0
            goto L29
        L39:
            r4.label = r2
            r0 = 0
            X.HxE[] r0 = new X.HxE[r0]
            java.lang.Object r1 = r5.m801fetchFeedPagegIAlus(r0, r4)
            if (r1 != r3) goto L21
            return r3
        L45:
            com.facebook.aura.feed.repo.FeedRepository$getFeed$1 r4 = new com.facebook.aura.feed.repo.FeedRepository$getFeed$1
            r4.<init>(r5, r6)
            goto L12
        L4b:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.feed.repo.FeedRepository.m808getFeedIoAF18A(X.HtJ):java.lang.Object");
    }

    public final C20Q<FeedUpdatedEvent> getFeedUpdatedEvents() {
        return FeedGatewayEvents.Companion.getInstance(this.userSession).updates;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007e  */
    /* renamed from: getPrompt-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m809getPromptIoAF18A(X.HtJ<? super X.HsJ<com.facebook.aura.feed.repo.FeedPrompt>> r19) {
        /*
            r18 = this;
            r4 = r19
            boolean r0 = r4 instanceof com.facebook.aura.feed.repo.FeedRepository$getPrompt$1
            r5 = r18
            if (r0 == 0) goto L7e
            r3 = r4
            com.facebook.aura.feed.repo.FeedRepository$getPrompt$1 r3 = (com.facebook.aura.feed.repo.FeedRepository$getPrompt$1) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7e
            int r2 = r2 - r1
            r3.label = r2
        L16:
            java.lang.Object r1 = r3.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r3.label
            r14 = 1
            if (r0 == 0) goto L32
            if (r0 != r14) goto L84
            java.lang.Object r1 = X.AnonymousClass001.A0q(r1)
        L25:
            boolean r0 = r1 instanceof X.C10571Hud
            r0 = r0 ^ 1
            if (r0 == 0) goto L31
            com.facebook.aura.feed.repo.FeedPromptResultJson r1 = (com.facebook.aura.feed.repo.FeedPromptResultJson) r1
            com.facebook.aura.feed.repo.FeedPrompt r1 = r1.toDomain()
        L31:
            return r1
        L32:
            X.Hwg.A00(r1)
            com.facebook.aura.feed.repo.FeedPrompt r1 = r5.prefetchedPrompt
            if (r1 == 0) goto L3d
            r0 = 0
            r5.prefetchedPrompt = r0
            return r1
        L3d:
            r1 = r2
            com.facebook.aura.network.http.HatchHttpApi r4 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            com.facebook.aura.feed.repo.FeedJarvisPath$FeedPrompt r7 = com.facebook.aura.feed.repo.FeedJarvisPath.FeedPrompt.INSTANCE
            com.facebook.aura.network.http.RequestType r8 = com.facebook.aura.network.http.RequestType.GET
            X.CGz r9 = r5.userSession
            java.lang.Long r10 = X.AbstractC7609F5w.A0l()
            r6 = 0
            X.HxE[] r11 = new X.HxE[r6]
            java.util.Set r13 = X.AnonymousClass004.A18()
            X.9jH r15 = X.C9jH.A00
            com.facebook.aura.feed.repo.FeedRepository$getPrompt-IoAF18A$$inlined$executeJarvisRequest-1iavgos$default$1 r5 = com.facebook.aura.feed.repo.FeedRepository$getPromptIoAF18A$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE
            r12 = 0
            r3.L$0 = r12
            r3.L$1 = r12
            r3.L$2 = r12
            r3.L$3 = r12
            r3.L$4 = r12
            r3.L$5 = r12
            r3.L$6 = r12
            r3.L$7 = r12
            r3.I$0 = r14
            r3.I$1 = r14
            r3.I$2 = r6
            r3.label = r14
            r16 = r14
            r17 = r12
            r18 = r6
            r19 = r3
            java.lang.Object r0 = r4.m1595executeBodylessJarvisRequestWithp3iPjrY(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            if (r0 == r2) goto L31
            r1 = r0
            goto L25
        L7e:
            com.facebook.aura.feed.repo.FeedRepository$getPrompt$1 r3 = new com.facebook.aura.feed.repo.FeedRepository$getPrompt$1
            r3.<init>(r5, r4)
            goto L16
        L84:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.feed.repo.FeedRepository.m809getPromptIoAF18A(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007e  */
    /* renamed from: getStatus-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m810getStatusIoAF18A(X.HtJ<? super X.HsJ<com.facebook.aura.feed.repo.FeedStatus>> r19) {
        /*
            r18 = this;
            r4 = r19
            boolean r0 = r4 instanceof com.facebook.aura.feed.repo.FeedRepository$getStatus$1
            r5 = r18
            if (r0 == 0) goto L7e
            r3 = r4
            com.facebook.aura.feed.repo.FeedRepository$getStatus$1 r3 = (com.facebook.aura.feed.repo.FeedRepository$getStatus$1) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7e
            int r2 = r2 - r1
            r3.label = r2
        L16:
            java.lang.Object r1 = r3.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r3.label
            r14 = 1
            if (r0 == 0) goto L32
            if (r0 != r14) goto L84
            java.lang.Object r1 = X.AnonymousClass001.A0q(r1)
        L25:
            boolean r0 = r1 instanceof X.C10571Hud
            r0 = r0 ^ 1
            if (r0 == 0) goto L31
            com.facebook.aura.feed.repo.FeedStatusJson r1 = (com.facebook.aura.feed.repo.FeedStatusJson) r1
            com.facebook.aura.feed.repo.FeedStatus r1 = r1.toDomain()
        L31:
            return r1
        L32:
            X.Hwg.A00(r1)
            com.facebook.aura.feed.repo.FeedStatus r1 = r5.prefetchedStatus
            if (r1 == 0) goto L3d
            r0 = 0
            r5.prefetchedStatus = r0
            return r1
        L3d:
            r1 = r2
            com.facebook.aura.network.http.HatchHttpApi r4 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            com.facebook.aura.feed.repo.FeedJarvisPath$FeedStatus r7 = com.facebook.aura.feed.repo.FeedJarvisPath.FeedStatus.INSTANCE
            com.facebook.aura.network.http.RequestType r8 = com.facebook.aura.network.http.RequestType.GET
            X.CGz r9 = r5.userSession
            java.lang.Long r10 = X.AbstractC7609F5w.A0l()
            r6 = 0
            X.HxE[] r11 = new X.HxE[r6]
            java.util.Set r13 = X.AnonymousClass004.A18()
            X.9jH r15 = X.C9jH.A00
            com.facebook.aura.feed.repo.FeedRepository$getStatus-IoAF18A$$inlined$executeJarvisRequest-1iavgos$default$1 r5 = com.facebook.aura.feed.repo.FeedRepository$getStatusIoAF18A$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE
            r12 = 0
            r3.L$0 = r12
            r3.L$1 = r12
            r3.L$2 = r12
            r3.L$3 = r12
            r3.L$4 = r12
            r3.L$5 = r12
            r3.L$6 = r12
            r3.L$7 = r12
            r3.I$0 = r14
            r3.I$1 = r14
            r3.I$2 = r6
            r3.label = r14
            r16 = r14
            r17 = r12
            r18 = r6
            r19 = r3
            java.lang.Object r0 = r4.m1595executeBodylessJarvisRequestWithp3iPjrY(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            if (r0 == r2) goto L31
            r1 = r0
            goto L25
        L7e:
            com.facebook.aura.feed.repo.FeedRepository$getStatus$1 r3 = new com.facebook.aura.feed.repo.FeedRepository$getStatus$1
            r3.<init>(r5, r4)
            goto L16
        L84:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.feed.repo.FeedRepository.m810getStatusIoAF18A(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0076  */
    /* renamed from: getUnit-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m811getUnitgIAlus(java.lang.String r18, X.HtJ<? super X.HsJ<? extends com.facebook.aura.feed.repo.FeedUnit>> r19) {
        /*
            r17 = this;
            r4 = r19
            boolean r0 = r4 instanceof com.facebook.aura.feed.repo.FeedRepository$getUnit$1
            r5 = r17
            if (r0 == 0) goto L76
            r3 = r4
            com.facebook.aura.feed.repo.FeedRepository$getUnit$1 r3 = (com.facebook.aura.feed.repo.FeedRepository$getUnit$1) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L76
            int r2 = r2 - r1
            r3.label = r2
        L16:
            java.lang.Object r2 = r3.result
            X.Hji r1 = X.EnumC10460Hji.A02
            int r0 = r3.label
            r14 = 1
            if (r0 == 0) goto L2c
            if (r0 != r14) goto L8b
            java.lang.Object r1 = X.AnonymousClass001.A0q(r2)
        L25:
            boolean r0 = r1 instanceof X.C10571Hud
            r0 = r0 ^ 1
            if (r0 == 0) goto L95
            goto L7c
        L2c:
            X.Hwg.A00(r2)
            com.facebook.aura.network.http.HatchHttpApi r4 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            com.facebook.aura.feed.repo.FeedJarvisPath$FeedUnit r7 = new com.facebook.aura.feed.repo.FeedJarvisPath$FeedUnit
            r0 = r18
            r7.<init>(r0)
            com.facebook.aura.network.http.RequestType r8 = com.facebook.aura.network.http.RequestType.GET
            X.CGz r9 = r5.userSession
            java.lang.Long r10 = X.AbstractC7609F5w.A0l()
            r6 = 0
            X.HxE[] r11 = new X.HxE[r6]
            java.util.Set r13 = X.AnonymousClass004.A18()
            X.9jH r15 = X.C9jH.A00
            com.facebook.aura.feed.repo.FeedRepository$getUnit-gIAlu-s$$inlined$executeJarvisRequest-1iavgos$default$1 r5 = com.facebook.aura.feed.repo.FeedRepository$getUnitgIAlus$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE
            r12 = 0
            r3.L$0 = r12
            r3.L$1 = r12
            r3.L$2 = r12
            r3.L$3 = r12
            r3.L$4 = r12
            r3.L$5 = r12
            r3.L$6 = r12
            r3.L$7 = r12
            r3.L$8 = r12
            r3.I$0 = r14
            r3.I$1 = r14
            r3.I$2 = r6
            r3.label = r14
            r16 = r14
            r17 = r12
            r18 = r6
            r19 = r3
            java.lang.Object r0 = r4.m1595executeBodylessJarvisRequestWithp3iPjrY(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            if (r0 == r1) goto L95
            r1 = r0
            goto L25
        L76:
            com.facebook.aura.feed.repo.FeedRepository$getUnit$1 r3 = new com.facebook.aura.feed.repo.FeedRepository$getUnit$1
            r3.<init>(r5, r4)
            goto L16
        L7c:
            com.facebook.aura.feed.repo.FeedUnitResultJson r1 = (com.facebook.aura.feed.repo.FeedUnitResultJson) r1     // Catch: java.lang.Throwable -> L90
            com.facebook.aura.feed.repo.FeedUnit r1 = r1.toDomain()     // Catch: java.lang.Throwable -> L90
            if (r1 != 0) goto L95
            java.lang.String r0 = "Missing unit in feed unit response"
            java.lang.IllegalStateException r0 = X.C3cG.A0Q(r0)     // Catch: java.lang.Throwable -> L90
            throw r0     // Catch: java.lang.Throwable -> L90
        L8b:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L90:
            r0 = move-exception
            X.Hud r1 = X.C3cG.A0s(r0)
        L95:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.feed.repo.FeedRepository.m811getUnitgIAlus(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00ac  */
    /* renamed from: markUnitsSeen-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m812markUnitsSeengIAlus(java.util.List<com.facebook.aura.feed.repo.FeedUnitView> r27, X.HtJ<? super X.HsJ<kotlin.Unit>> r28) {
        /*
            r26 = this;
            r5 = r28
            boolean r0 = r5 instanceof com.facebook.aura.feed.repo.FeedRepository$markUnitsSeen$1
            r3 = r26
            if (r0 == 0) goto Lac
            r0 = r5
            com.facebook.aura.feed.repo.FeedRepository$markUnitsSeen$1 r0 = (com.facebook.aura.feed.repo.FeedRepository$markUnitsSeen$1) r0
            int r4 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4 & r2
            if (r1 == 0) goto Lac
            int r4 = r4 - r2
            r0.label = r4
        L16:
            java.lang.Object r4 = r0.result
            X.Hji r1 = X.EnumC10460Hji.A02
            int r2 = r0.label
            r9 = 1
            if (r2 == 0) goto L26
            if (r2 != r9) goto Lb3
            java.lang.Object r1 = X.AnonymousClass001.A0q(r4)
        L25:
            return r1
        L26:
            X.Hwg.A00(r4)
            com.facebook.aura.network.http.HatchHttpApi r6 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            com.facebook.aura.feed.repo.FeedJarvisPath$FeedUnitsSeen r10 = com.facebook.aura.feed.repo.FeedJarvisPath.FeedUnitsSeen.INSTANCE
            java.util.ArrayList r4 = X.AnonymousClass003.A0i(r27)
            java.util.Iterator r5 = r27.iterator()
        L35:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L50
            java.lang.Object r2 = r5.next()
            com.facebook.aura.feed.repo.FeedUnitView r2 = (com.facebook.aura.feed.repo.FeedUnitView) r2
            java.lang.String r12 = r2.unitId
            long r13 = r2.timespentMs
            long r15 = r2.seenAtMs
            com.facebook.aura.feed.repo.FeedUnitViewJson r11 = new com.facebook.aura.feed.repo.FeedUnitViewJson
            r11.<init>(r12, r13, r15)
            r4.add(r11)
            goto L35
        L50:
            r15 = 0
            com.facebook.aura.feed.repo.FeedUnitsSeenRequestJson r11 = new com.facebook.aura.feed.repo.FeedUnitsSeenRequestJson
            r11.<init>(r15, r4)
            com.facebook.aura.network.http.RequestType r12 = com.facebook.aura.network.http.RequestType.POST
            X.CGz r13 = r3.userSession
            java.lang.Long r14 = X.AbstractC7609F5w.A0l()
            r3 = 0
            X.HxE[] r2 = new X.HxE[r3]
            java.util.Set r17 = X.AnonymousClass004.A18()
            X.9jH r20 = X.C9jH.A00
            com.facebook.aura.feed.repo.FeedRepository$markUnitsSeen-gIAlu-s$$inlined$executeJarvisRequest-Z6QaZII$default$1 r7 = com.facebook.aura.feed.repo.FeedRepository$markUnitsSeengIAlus$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE
            com.facebook.aura.feed.repo.FeedRepository$markUnitsSeen-gIAlu-s$$inlined$executeJarvisRequest-Z6QaZII$default$2 r8 = com.facebook.aura.feed.repo.FeedRepository$markUnitsSeengIAlus$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE
            r0.L$0 = r15
            r0.L$1 = r15
            r0.L$2 = r15
            r0.L$3 = r15
            r0.L$4 = r15
            r0.L$5 = r15
            r0.L$6 = r15
            r0.L$7 = r15
            r0.L$8 = r15
            r0.L$9 = r15
            r0.I$0 = r9
            r0.I$1 = r9
            r0.I$2 = r3
            r0.I$3 = r9
            r0.I$4 = r3
            r0.I$5 = r3
            r0.I$6 = r3
            r0.label = r9
            r18 = r9
            r19 = r9
            r21 = r15
            r22 = r3
            r23 = r9
            r24 = r3
            r25 = r3
            r26 = r15
            r27 = r3
            r28 = r0
            r16 = r2
            java.lang.Object r0 = r6.m1599executeJarvisRequestWithFof5HsY(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            if (r0 == r1) goto L25
            return r0
        Lac:
            com.facebook.aura.feed.repo.FeedRepository$markUnitsSeen$1 r0 = new com.facebook.aura.feed.repo.FeedRepository$markUnitsSeen$1
            r0.<init>(r3, r5)
            goto L16
        Lb3:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.feed.repo.FeedRepository.m812markUnitsSeengIAlus(java.util.List, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object prefetchInitialFeed(X.HtJ<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.facebook.aura.feed.repo.FeedRepository.AnonymousClass1
            if (r0 == 0) goto L51
            r5 = r7
            com.facebook.aura.feed.repo.FeedRepository$prefetchInitialFeed$1 r5 = (com.facebook.aura.feed.repo.FeedRepository.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L51
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r2 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r1 = r5.label
            r3 = 2
            r0 = 1
            if (r1 == 0) goto L26
            if (r1 == r0) goto L32
            if (r1 != r3) goto L57
            X.Hwg.A00(r2)
        L23:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L26:
            X.Hwg.A00(r2)
            r5.label = r0
            java.lang.Object r2 = r6.m809getPromptIoAF18A(r5)
            if (r2 != r4) goto L36
            return r4
        L32:
            java.lang.Object r2 = X.AnonymousClass001.A0q(r2)
        L36:
            boolean r1 = r2 instanceof X.C10571Hud
            r0 = 0
            if (r1 == 0) goto L3c
            r2 = r0
        L3c:
            com.facebook.aura.feed.repo.FeedPrompt r2 = (com.facebook.aura.feed.repo.FeedPrompt) r2
            if (r2 == 0) goto L23
            com.facebook.aura.feed.repo.FeedRepository$prefetchInitialFeed$2 r1 = new com.facebook.aura.feed.repo.FeedRepository$prefetchInitialFeed$2
            r1.<init>(r2, r0)
            r0 = 0
            r5.L$0 = r0
            r5.label = r3
            java.lang.Object r0 = X.Hxb.A00(r1, r5)
            if (r0 != r4) goto L23
            return r4
        L51:
            com.facebook.aura.feed.repo.FeedRepository$prefetchInitialFeed$1 r5 = new com.facebook.aura.feed.repo.FeedRepository$prefetchInitialFeed$1
            r5.<init>(r7)
            goto L12
        L57:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.feed.repo.FeedRepository.prefetchInitialFeed(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0091  */
    /* renamed from: recordTap-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m813recordTap0E7RQCE(java.lang.String r23, com.facebook.aura.feed.repo.FeedTapKind r24, X.HtJ<? super X.HsJ<kotlin.Unit>> r25) {
        /*
            r22 = this;
            r4 = r25
            boolean r0 = r4 instanceof com.facebook.aura.feed.repo.FeedRepository$recordTap$1
            r5 = r22
            if (r0 == 0) goto L91
            r2 = r4
            com.facebook.aura.feed.repo.FeedRepository$recordTap$1 r2 = (com.facebook.aura.feed.repo.FeedRepository$recordTap$1) r2
            int r3 = r2.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L91
            int r3 = r3 - r1
            r2.label = r3
        L16:
            java.lang.Object r3 = r2.result
            X.Hji r1 = X.EnumC10460Hji.A02
            int r0 = r2.label
            r6 = 1
            if (r0 == 0) goto L26
            if (r0 != r6) goto L97
            java.lang.Object r1 = X.AnonymousClass001.A0q(r3)
        L25:
            return r1
        L26:
            X.Hwg.A00(r3)
            com.facebook.aura.network.http.HatchHttpApi r3 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            com.facebook.aura.feed.repo.FeedJarvisPath$FeedUnitTap r7 = new com.facebook.aura.feed.repo.FeedJarvisPath$FeedUnitTap
            r0 = r23
            r7.<init>(r0)
            java.lang.String r0 = r24.getWireValue()
            com.facebook.aura.feed.repo.FeedTapRequestJson r8 = new com.facebook.aura.feed.repo.FeedTapRequestJson
            r8.<init>(r0)
            com.facebook.aura.network.http.RequestType r9 = com.facebook.aura.network.http.RequestType.POST
            X.CGz r10 = r5.userSession
            java.lang.Long r11 = X.AbstractC7609F5w.A0l()
            r0 = 0
            X.HxE[] r13 = new X.HxE[r0]
            java.util.Set r14 = X.AnonymousClass004.A18()
            X.9jH r17 = X.C9jH.A00
            com.facebook.aura.feed.repo.FeedRepository$recordTap-0E7RQCE$$inlined$executeJarvisRequest-Z6QaZII$default$1 r4 = com.facebook.aura.feed.repo.FeedRepository$recordTap0E7RQCE$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE
            com.facebook.aura.feed.repo.FeedRepository$recordTap-0E7RQCE$$inlined$executeJarvisRequest-Z6QaZII$default$2 r5 = com.facebook.aura.feed.repo.FeedRepository$recordTap0E7RQCE$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE
            r12 = 0
            r2.L$0 = r12
            r2.L$1 = r12
            r2.L$2 = r12
            r2.L$3 = r12
            r2.L$4 = r12
            r2.L$5 = r12
            r2.L$6 = r12
            r2.L$7 = r12
            r2.L$8 = r12
            r2.L$9 = r12
            r2.L$10 = r12
            r2.I$0 = r6
            r2.I$1 = r6
            r2.I$2 = r0
            r2.I$3 = r6
            r2.I$4 = r0
            r2.I$5 = r0
            r2.I$6 = r0
            r2.label = r6
            r15 = r6
            r16 = r6
            r18 = r12
            r19 = r0
            r20 = r6
            r21 = r0
            r22 = r0
            r23 = r12
            r24 = r0
            r25 = r2
            java.lang.Object r0 = r3.m1599executeJarvisRequestWithFof5HsY(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            if (r0 == r1) goto L25
            return r0
        L91:
            com.facebook.aura.feed.repo.FeedRepository$recordTap$1 r2 = new com.facebook.aura.feed.repo.FeedRepository$recordTap$1
            r2.<init>(r5, r4)
            goto L16
        L97:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.feed.repo.FeedRepository.m813recordTap0E7RQCE(java.lang.String, com.facebook.aura.feed.repo.FeedTapKind, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0075  */
    /* renamed from: regenerate-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m814regenerateIoAF18A(X.HtJ<? super X.HsJ<com.facebook.aura.feed.repo.FeedRegenerateResult>> r19) {
        /*
            r18 = this;
            r4 = r19
            boolean r0 = r4 instanceof com.facebook.aura.feed.repo.FeedRepository$regenerate$1
            r5 = r18
            if (r0 == 0) goto L75
            r3 = r4
            com.facebook.aura.feed.repo.FeedRepository$regenerate$1 r3 = (com.facebook.aura.feed.repo.FeedRepository$regenerate$1) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L75
            int r2 = r2 - r1
            r3.label = r2
        L16:
            java.lang.Object r2 = r3.result
            X.Hji r1 = X.EnumC10460Hji.A02
            int r0 = r3.label
            r14 = 1
            if (r0 == 0) goto L32
            if (r0 != r14) goto L7b
            java.lang.Object r1 = X.AnonymousClass001.A0q(r2)
        L25:
            boolean r0 = r1 instanceof X.C10571Hud
            r0 = r0 ^ 1
            if (r0 == 0) goto L31
            com.facebook.aura.feed.repo.FeedRegenerateResultJson r1 = (com.facebook.aura.feed.repo.FeedRegenerateResultJson) r1
            com.facebook.aura.feed.repo.FeedRegenerateResult r1 = r1.toDomain()
        L31:
            return r1
        L32:
            X.Hwg.A00(r2)
            com.facebook.aura.network.http.HatchHttpApi r4 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            com.facebook.aura.feed.repo.FeedJarvisPath$FeedRegenerate r7 = com.facebook.aura.feed.repo.FeedJarvisPath.FeedRegenerate.INSTANCE
            com.facebook.aura.network.http.RequestType r8 = com.facebook.aura.network.http.RequestType.POST
            X.CGz r9 = r5.userSession
            java.lang.Long r10 = X.AbstractC7609F5w.A0l()
            r6 = 0
            X.HxE[] r11 = new X.HxE[r6]
            java.util.Set r13 = X.AnonymousClass004.A18()
            X.9jH r15 = X.C9jH.A00
            com.facebook.aura.feed.repo.FeedRepository$regenerate-IoAF18A$$inlined$executeJarvisRequest-1iavgos$default$1 r5 = com.facebook.aura.feed.repo.FeedRepository$regenerateIoAF18A$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE
            r12 = 0
            r3.L$0 = r12
            r3.L$1 = r12
            r3.L$2 = r12
            r3.L$3 = r12
            r3.L$4 = r12
            r3.L$5 = r12
            r3.L$6 = r12
            r3.L$7 = r12
            r3.I$0 = r14
            r3.I$1 = r14
            r3.I$2 = r6
            r3.label = r14
            r16 = r14
            r17 = r12
            r18 = r6
            r19 = r3
            java.lang.Object r0 = r4.m1595executeBodylessJarvisRequestWithp3iPjrY(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            if (r0 == r1) goto L31
            r1 = r0
            goto L25
        L75:
            com.facebook.aura.feed.repo.FeedRepository$regenerate$1 r3 = new com.facebook.aura.feed.repo.FeedRepository$regenerate$1
            r3.<init>(r5, r4)
            goto L16
        L7b:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.feed.repo.FeedRepository.m814regenerateIoAF18A(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a6  */
    /* renamed from: search-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m815search0E7RQCE(java.lang.String r19, java.lang.String r20, X.HtJ<? super X.HsJ<com.facebook.aura.feed.repo.FeedPage>> r21) {
        /*
            r18 = this;
            r3 = r21
            boolean r0 = r3 instanceof com.facebook.aura.feed.repo.FeedRepository$search$1
            r5 = r18
            if (r0 == 0) goto La6
            r4 = r3
            com.facebook.aura.feed.repo.FeedRepository$search$1 r4 = (com.facebook.aura.feed.repo.FeedRepository$search$1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La6
            int r2 = r2 - r1
            r4.label = r2
        L16:
            java.lang.Object r1 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r3 = 1
            if (r0 == 0) goto L32
            if (r0 != r3) goto Lad
            java.lang.Object r2 = X.AnonymousClass001.A0q(r1)
        L25:
            boolean r0 = r2 instanceof X.C10571Hud
            r0 = r0 ^ 1
            if (r0 == 0) goto L31
            com.facebook.aura.feed.repo.FeedSearchResultJson r2 = (com.facebook.aura.feed.repo.FeedSearchResultJson) r2
            com.facebook.aura.feed.repo.FeedPage r2 = r2.toDomain()
        L31:
            return r2
        L32:
            X.Hwg.A00(r1)
            com.facebook.aura.network.http.HatchHttpApi r6 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            com.facebook.aura.feed.repo.FeedJarvisPath$FeedSearch r9 = com.facebook.aura.feed.repo.FeedJarvisPath.FeedSearch.INSTANCE
            com.facebook.aura.network.http.RequestType r10 = com.facebook.aura.network.http.RequestType.GET
            X.CGz r11 = r5.userSession
            java.lang.Long r12 = X.AbstractC7609F5w.A0l()
            X.AII r1 = X.AIM.A17()
            java.lang.String r0 = "q"
            r5 = r19
            X.AnonymousClass002.A1J(r0, r5, r1)
            r5 = r20
            if (r20 == 0) goto L5b
            int r0 = r5.length()
            if (r0 <= 0) goto L5b
            java.lang.String r0 = "category"
            X.AnonymousClass002.A1J(r0, r5, r1)
        L5b:
            X.AII r1 = X.AIM.A18(r1)
            r8 = 0
            X.HxE[] r0 = new X.HxE[r8]
            java.lang.Object[] r1 = r1.toArray(r0)
            X.HxE[] r1 = (X.HxE[]) r1
            int r0 = r1.length
            java.lang.Object[] r13 = java.util.Arrays.copyOf(r1, r0)
            X.HxE[] r13 = (X.HxE[]) r13
            java.util.Set r15 = X.AnonymousClass004.A18()
            X.9jH r17 = X.C9jH.A00
            com.facebook.aura.feed.repo.FeedRepository$search-0E7RQCE$$inlined$executeJarvisRequest-1iavgos$default$1 r7 = com.facebook.aura.feed.repo.FeedRepository$search0E7RQCE$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE
            r14 = 0
            r4.L$0 = r14
            r4.L$1 = r14
            r4.L$2 = r14
            r4.L$3 = r14
            r4.L$4 = r14
            r4.L$5 = r14
            r4.L$6 = r14
            r4.L$7 = r14
            r4.L$8 = r14
            r4.L$9 = r14
            r4.I$0 = r3
            r4.I$1 = r3
            r4.I$2 = r8
            r4.label = r3
            r18 = r3
            r19 = r14
            r20 = r8
            r21 = r4
            r16 = r3
            java.lang.Object r0 = r6.m1595executeBodylessJarvisRequestWithp3iPjrY(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            if (r0 == r2) goto L31
            r2 = r0
            goto L25
        La6:
            com.facebook.aura.feed.repo.FeedRepository$search$1 r4 = new com.facebook.aura.feed.repo.FeedRepository$search$1
            r4.<init>(r5, r3)
            goto L16
        Lad:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.feed.repo.FeedRepository.m815search0E7RQCE(java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x008e  */
    /* renamed from: setPromptText-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m816setPromptTextgIAlus(java.lang.String r24, X.HtJ<? super X.HsJ<com.facebook.aura.feed.repo.FeedPrompt>> r25) {
        /*
            r23 = this;
            r4 = r25
            boolean r0 = r4 instanceof com.facebook.aura.feed.repo.FeedRepository$setPromptText$1
            r5 = r23
            if (r0 == 0) goto L8e
            r0 = r4
            com.facebook.aura.feed.repo.FeedRepository$setPromptText$1 r0 = (com.facebook.aura.feed.repo.FeedRepository$setPromptText$1) r0
            int r3 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L8e
            int r3 = r3 - r2
            r0.label = r3
        L16:
            java.lang.Object r3 = r0.result
            X.Hji r1 = X.EnumC10460Hji.A02
            int r2 = r0.label
            r15 = 1
            if (r2 == 0) goto L2c
            if (r2 != r15) goto La3
            java.lang.Object r1 = X.AnonymousClass001.A0q(r3)
        L25:
            boolean r0 = r1 instanceof X.C10571Hud
            r0 = r0 ^ 1
            if (r0 == 0) goto Lad
            goto L94
        L2c:
            X.Hwg.A00(r3)
            com.facebook.aura.network.http.HatchHttpApi r3 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            com.facebook.aura.feed.repo.FeedJarvisPath$FeedPrompt r7 = com.facebook.aura.feed.repo.FeedJarvisPath.FeedPrompt.INSTANCE
            com.facebook.aura.feed.repo.FeedPromptTextRequestJson r8 = new com.facebook.aura.feed.repo.FeedPromptTextRequestJson
            r2 = r24
            r8.<init>(r2)
            com.facebook.aura.network.http.RequestType r9 = com.facebook.aura.network.http.RequestType.PATCH
            X.CGz r10 = r5.userSession
            java.lang.Long r11 = X.AbstractC7609F5w.A0l()
            r6 = 0
            X.HxE[] r13 = new X.HxE[r6]
            java.util.Set r14 = X.AnonymousClass004.A18()
            X.9jH r17 = X.C9jH.A00
            com.facebook.aura.feed.repo.FeedRepository$setPromptText-gIAlu-s$$inlined$executeJarvisRequest-Z6QaZII$default$1 r4 = com.facebook.aura.feed.repo.FeedRepository$setPromptTextgIAlus$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE
            com.facebook.aura.feed.repo.FeedRepository$setPromptText-gIAlu-s$$inlined$executeJarvisRequest-Z6QaZII$default$2 r5 = com.facebook.aura.feed.repo.FeedRepository$setPromptTextgIAlus$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE
            r12 = 0
            r0.L$0 = r12
            r0.L$1 = r12
            r0.L$2 = r12
            r0.L$3 = r12
            r0.L$4 = r12
            r0.L$5 = r12
            r0.L$6 = r12
            r0.L$7 = r12
            r0.L$8 = r12
            r0.L$9 = r12
            r0.I$0 = r15
            r0.I$1 = r15
            r0.I$2 = r6
            r0.I$3 = r15
            r0.I$4 = r6
            r0.I$5 = r6
            r0.I$6 = r6
            r0.label = r15
            r16 = r15
            r18 = r12
            r19 = r6
            r20 = r15
            r21 = r6
            r22 = r6
            r23 = r12
            r24 = r6
            r25 = r0
            java.lang.Object r0 = r3.m1599executeJarvisRequestWithFof5HsY(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            if (r0 == r1) goto Lad
            r1 = r0
            goto L25
        L8e:
            com.facebook.aura.feed.repo.FeedRepository$setPromptText$1 r0 = new com.facebook.aura.feed.repo.FeedRepository$setPromptText$1
            r0.<init>(r5, r4)
            goto L16
        L94:
            com.facebook.aura.feed.repo.FeedPromptResultJson r1 = (com.facebook.aura.feed.repo.FeedPromptResultJson) r1     // Catch: java.lang.Throwable -> La8
            com.facebook.aura.feed.repo.FeedPrompt r1 = r1.toDomain()     // Catch: java.lang.Throwable -> La8
            if (r1 != 0) goto Lad
            java.lang.String r0 = "Missing prompt in prompt-update response"
            java.lang.IllegalStateException r0 = X.C3cG.A0Q(r0)     // Catch: java.lang.Throwable -> La8
            throw r0     // Catch: java.lang.Throwable -> La8
        La3:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        La8:
            r0 = move-exception
            X.Hud r1 = X.C3cG.A0s(r0)
        Lad:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.feed.repo.FeedRepository.m816setPromptTextgIAlus(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x009d  */
    /* renamed from: setReaction-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m817setReaction0E7RQCE(java.lang.String r23, com.facebook.aura.feed.repo.FeedReaction r24, X.HtJ<? super X.HsJ<? extends com.facebook.aura.feed.repo.FeedUnit>> r25) {
        /*
            r22 = this;
            r4 = r25
            boolean r0 = r4 instanceof com.facebook.aura.feed.repo.FeedRepository$setReaction$1
            r5 = r22
            if (r0 == 0) goto L9d
            r0 = r4
            com.facebook.aura.feed.repo.FeedRepository$setReaction$1 r0 = (com.facebook.aura.feed.repo.FeedRepository$setReaction$1) r0
            int r3 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L9d
            int r3 = r3 - r2
            r0.label = r3
        L16:
            java.lang.Object r3 = r0.result
            X.Hji r1 = X.EnumC10460Hji.A02
            int r2 = r0.label
            r15 = 1
            if (r2 == 0) goto L32
            if (r2 != r15) goto La4
            java.lang.Object r1 = X.AnonymousClass001.A0q(r3)
        L25:
            boolean r0 = r1 instanceof X.C10571Hud
            r0 = r0 ^ 1
            if (r0 == 0) goto L31
            com.facebook.aura.feed.repo.FeedUnitResultJson r1 = (com.facebook.aura.feed.repo.FeedUnitResultJson) r1
            com.facebook.aura.feed.repo.FeedUnit r1 = r1.toDomain()
        L31:
            return r1
        L32:
            X.Hwg.A00(r3)
            com.facebook.aura.network.http.HatchHttpApi r3 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            com.facebook.aura.feed.repo.FeedJarvisPath$FeedUnitReaction r7 = new com.facebook.aura.feed.repo.FeedJarvisPath$FeedUnitReaction
            r2 = r23
            r7.<init>(r2)
            java.lang.String r2 = com.facebook.aura.feed.repo.FeedRepositoryKt.toWireValue(r24)
            com.facebook.aura.feed.repo.FeedReactionRequestJson r8 = new com.facebook.aura.feed.repo.FeedReactionRequestJson
            r8.<init>(r2)
            com.facebook.aura.network.http.RequestType r9 = com.facebook.aura.network.http.RequestType.POST
            X.CGz r10 = r5.userSession
            java.lang.Long r11 = X.AbstractC7609F5w.A0l()
            r6 = 0
            X.HxE[] r13 = new X.HxE[r6]
            java.util.Set r14 = X.AnonymousClass004.A18()
            X.9jH r17 = X.C9jH.A00
            com.facebook.aura.feed.repo.FeedRepository$setReaction-0E7RQCE$$inlined$executeJarvisRequest-Z6QaZII$default$1 r4 = com.facebook.aura.feed.repo.FeedRepository$setReaction0E7RQCE$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE
            com.facebook.aura.feed.repo.FeedRepository$setReaction-0E7RQCE$$inlined$executeJarvisRequest-Z6QaZII$default$2 r5 = com.facebook.aura.feed.repo.FeedRepository$setReaction0E7RQCE$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE
            r12 = 0
            r0.L$0 = r12
            r0.L$1 = r12
            r0.L$2 = r12
            r0.L$3 = r12
            r0.L$4 = r12
            r0.L$5 = r12
            r0.L$6 = r12
            r0.L$7 = r12
            r0.L$8 = r12
            r0.L$9 = r12
            r0.L$10 = r12
            r0.I$0 = r15
            r0.I$1 = r15
            r0.I$2 = r6
            r0.I$3 = r15
            r0.I$4 = r6
            r0.I$5 = r6
            r0.I$6 = r6
            r0.label = r15
            r16 = r15
            r18 = r12
            r19 = r6
            r20 = r15
            r21 = r6
            r22 = r6
            r23 = r12
            r24 = r6
            r25 = r0
            java.lang.Object r0 = r3.m1599executeJarvisRequestWithFof5HsY(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            if (r0 == r1) goto L31
            r1 = r0
            goto L25
        L9d:
            com.facebook.aura.feed.repo.FeedRepository$setReaction$1 r0 = new com.facebook.aura.feed.repo.FeedRepository$setReaction$1
            r0.<init>(r5, r4)
            goto L16
        La4:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.feed.repo.FeedRepository.m817setReaction0E7RQCE(java.lang.String, com.facebook.aura.feed.repo.FeedReaction, X.HtJ):java.lang.Object");
    }

    /* loaded from: classes3.dex */
    public final class Companion {
        public final FeedRepository getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (FeedRepository) abstractC3358CGz.A03(FeedRepository.class, new FeedRepository$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public FeedRepository(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
    }

    public /* synthetic */ FeedRepository(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
