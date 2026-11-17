package com.facebook.aura.network.notary;

import X.AbstractC3358CGz;
import X.AnonymousClass003;
import X.C06H;
import X.C3cG;
import X.C3cI;
import X.C7384Etj;
import X.InterfaceC7549F2g;
import com.facebook.aura.common.coroutines.OnDuplicateCall;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.common.coroutines.SingleFlightKt;
import java.util.Map;

/* loaded from: classes4.dex */
public final class HatchNotaryTokenCache implements InterfaceC7549F2g {
    public static final Companion Companion = new Companion();
    public final Map<CacheKey, MintedNotaryTokens> cache;
    public final Object cacheLock;
    public long generation;
    public final SingleFlight singleFlight;
    public final AbstractC3358CGz userSession;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0077  */
    /* renamed from: mintAndCache-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1607mintAndCache0E7RQCE(com.facebook.aura.network.notary.CacheKey r11, X.G0V<? super java.lang.String, ? super X.HtJ<? super X.HsJ<com.facebook.aura.network.notary.MintedNotaryTokens>>, ? extends java.lang.Object> r12, X.HtJ<? super X.HsJ<com.facebook.aura.network.notary.MintedNotaryTokens>> r13) {
        /*
            r10 = this;
            r7 = r11
            boolean r0 = r13 instanceof com.facebook.aura.network.notary.HatchNotaryTokenCache$mintAndCache$1
            r8 = r10
            if (r0 == 0) goto L77
            r4 = r13
            com.facebook.aura.network.notary.HatchNotaryTokenCache$mintAndCache$1 r4 = (com.facebook.aura.network.notary.HatchNotaryTokenCache$mintAndCache$1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L77
            int r2 = r2 - r1
            r4.label = r2
        L14:
            java.lang.Object r1 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L56
            if (r0 != r2) goto L82
            java.lang.Object r7 = r4.L$0
            com.facebook.aura.network.notary.CacheKey r7 = (com.facebook.aura.network.notary.CacheKey) r7
            X.Hwg.A00(r1)
        L26:
            com.facebook.aura.common.coroutines.SingleFlightResult r1 = (com.facebook.aura.common.coroutines.SingleFlightResult) r1
            boolean r0 = r1 instanceof com.facebook.aura.common.coroutines.SingleFlightResult.Result
            if (r0 == 0) goto L35
            com.facebook.aura.common.coroutines.SingleFlightResult$Result r1 = (com.facebook.aura.common.coroutines.SingleFlightResult.Result) r1
            T r0 = r1.value
            X.HsJ r0 = (X.HsJ) r0
            java.lang.Object r3 = r0.value
        L34:
            return r3
        L35:
            com.facebook.aura.common.coroutines.SingleFlightResult$Skipped r0 = com.facebook.aura.common.coroutines.SingleFlightResult.Skipped.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 == 0) goto L7d
            com.facebook.aura.network.notary.MintedNotaryTokens r3 = r8.cachedTokens(r7)
            if (r3 != 0) goto L34
            java.lang.String r1 = r7.mintEndpoint
            java.lang.String r0 = " mint was skipped"
            java.lang.String r1 = X.FGI.A0M(r1, r0)
            java.lang.String r0 = "notary_mint_skipped"
            com.facebook.aura.json.NetworkException r0 = com.facebook.aura.network.notary.HatchNotaryTokenCacheKt.notaryException(r1, r0)
            X.Hud r3 = X.C3cG.A0s(r0)
            return r3
        L56:
            X.Hwg.A00(r1)
            java.lang.Object r1 = r10.cacheLock
            monitor-enter(r1)
            long r9 = r10.generation     // Catch: java.lang.Throwable -> L87
            monitor-exit(r1)
            com.facebook.aura.common.coroutines.SingleFlight r0 = r8.singleFlight
            r11 = 0
            com.facebook.aura.network.notary.HatchNotaryTokenCache$mintAndCache$result$1 r5 = new com.facebook.aura.network.notary.HatchNotaryTokenCache$mintAndCache$result$1
            r6 = r12
            r5.<init>(r6, r7, r8, r9, r11)
            r4.L$0 = r7
            r4.L$1 = r11
            r4.J$0 = r9
            r4.label = r2
            java.lang.Object r1 = r0.invoke(r7, r5, r4)
            if (r1 != r3) goto L26
            return r3
        L77:
            com.facebook.aura.network.notary.HatchNotaryTokenCache$mintAndCache$1 r4 = new com.facebook.aura.network.notary.HatchNotaryTokenCache$mintAndCache$1
            r4.<init>(r10, r13)
            goto L14
        L7d:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        L82:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L87:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.network.notary.HatchNotaryTokenCache.m1607mintAndCache0E7RQCE(com.facebook.aura.network.notary.CacheKey, X.G0V, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.aura.network.notary.MintedNotaryTokens cachedTokens(com.facebook.aura.network.notary.CacheKey r6) {
        /*
            r5 = this;
            java.lang.Object r4 = r5.cacheLock
            monitor-enter(r4)
            java.util.Map<com.facebook.aura.network.notary.CacheKey, com.facebook.aura.network.notary.MintedNotaryTokens> r0 = r5.cache     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r3 = r0.get(r6)     // Catch: java.lang.Throwable -> L1c
            com.facebook.aura.network.notary.MintedNotaryTokens r3 = (com.facebook.aura.network.notary.MintedNotaryTokens) r3     // Catch: java.lang.Throwable -> L1c
            r2 = 0
            if (r3 == 0) goto L19
            long r0 = X.C3cI.A02()     // Catch: java.lang.Throwable -> L1c
            boolean r0 = com.facebook.aura.network.notary.HatchNotaryTokenCacheKt.isExpired(r3, r0)     // Catch: java.lang.Throwable -> L1c
            if (r0 != 0) goto L19
            goto L1a
        L19:
            r3 = r2
        L1a:
            monitor-exit(r4)
            return r3
        L1c:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.network.notary.HatchNotaryTokenCache.cachedTokens(com.facebook.aura.network.notary.CacheKey):com.facebook.aura.network.notary.MintedNotaryTokens");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0093  */
    /* renamed from: authorizationHeader-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1608authorizationHeaderBWLJW6A(java.lang.String r9, com.facebook.aura.network.api.JarvisPath r10, X.G0V<? super java.lang.String, ? super X.HtJ<? super X.HsJ<com.facebook.aura.network.notary.MintedNotaryTokens>>, ? extends java.lang.Object> r11, X.HtJ<? super X.HsJ<com.facebook.aura.network.notary.NotaryAuthorization>> r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof com.facebook.aura.network.notary.HatchNotaryTokenCache$authorizationHeader$1
            if (r0 == 0) goto L93
            r6 = r12
            com.facebook.aura.network.notary.HatchNotaryTokenCache$authorizationHeader$1 r6 = (com.facebook.aura.network.notary.HatchNotaryTokenCache$authorizationHeader$1) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L93
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r1 = r6.result
            X.Hji r7 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r5 = 1
            if (r0 == 0) goto L55
            if (r0 != r5) goto L9f
            java.lang.Object r3 = r6.L$4
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r6.L$3
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r9 = r6.L$0
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r4 = X.AnonymousClass001.A0q(r1)
        L2d:
            java.lang.Throwable r0 = X.HsJ.A00(r4)
            if (r0 != 0) goto L9a
            com.facebook.aura.network.notary.MintedNotaryTokens r4 = (com.facebook.aura.network.notary.MintedNotaryTokens) r4
        L35:
            java.util.Map<java.lang.String, java.lang.String> r0 = r4.tokens
            java.lang.String r0 = X.C60O.A0p(r2, r0)
            if (r0 == 0) goto Lad
            java.lang.String r1 = X.AnonymousClass002.A0l(r0)
            if (r1 == 0) goto Lad
            int r0 = r1.length()
            if (r0 == 0) goto Lad
            java.lang.String r0 = "X-Hatch-Notary-Authorization"
            java.util.Map r0 = X.AnonymousClass006.A10(r0, r1)
            com.facebook.aura.network.notary.NotaryAuthorization r1 = new com.facebook.aura.network.notary.NotaryAuthorization
            r1.<init>(r3, r0)
            return r1
        L55:
            X.Hwg.A00(r1)
            java.lang.String r1 = r10.getValue()
            java.lang.String r0 = "/"
            java.lang.String r2 = X.FGI.A0M(r0, r1)
            com.facebook.aura.gateway.store.HatchGatewayPrefsStore$Companion r1 = com.facebook.aura.gateway.store.HatchGatewayPrefsStore.Companion
            X.CGz r0 = r8.userSession
            java.lang.String r3 = X.C3cH.A0a(r1, r0)
            if (r3 == 0) goto La4
            int r0 = r3.length()
            if (r0 == 0) goto La4
            com.facebook.aura.network.notary.CacheKey r1 = new com.facebook.aura.network.notary.CacheKey
            r1.<init>(r9, r3)
            com.facebook.aura.network.notary.MintedNotaryTokens r4 = r8.cachedTokens(r1)
            if (r4 != 0) goto L35
            r6.L$0 = r9
            r0 = 0
            r6.L$1 = r0
            r6.L$2 = r0
            r6.L$3 = r2
            r6.L$4 = r3
            r6.L$5 = r0
            r6.label = r5
            java.lang.Object r4 = r8.m1607mintAndCache0E7RQCE(r1, r11, r6)
            if (r4 != r7) goto L2d
            return r7
        L93:
            com.facebook.aura.network.notary.HatchNotaryTokenCache$authorizationHeader$1 r6 = new com.facebook.aura.network.notary.HatchNotaryTokenCache$authorizationHeader$1
            r6.<init>(r8, r12)
            goto L12
        L9a:
            X.Hud r1 = X.C3cG.A0s(r0)
            return r1
        L9f:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        La4:
            java.lang.String r0 = "No VM id in the gateway URL, cannot authorize "
            java.lang.String r1 = X.FGI.A0M(r0, r2)
            java.lang.String r0 = "notary_no_vm_id"
            goto Lb8
        Lad:
            r8.invalidate(r9, r3)
            java.lang.String r0 = " minted no token for "
            java.lang.String r1 = X.FGI.A0U(r9, r0, r2)
            java.lang.String r0 = "notary_no_token_for_route"
        Lb8:
            com.facebook.aura.json.NetworkException r0 = com.facebook.aura.network.notary.HatchNotaryTokenCacheKt.notaryException(r1, r0)
            X.Hud r1 = X.C3cG.A0s(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.network.notary.HatchNotaryTokenCache.m1608authorizationHeaderBWLJW6A(java.lang.String, com.facebook.aura.network.api.JarvisPath, X.G0V, X.HtJ):java.lang.Object");
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        synchronized (this.cacheLock) {
            this.generation++;
            this.cache.clear();
        }
        this.singleFlight.clearAndCancelAll();
    }

    public final class Companion {
        public final HatchNotaryTokenCache getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchNotaryTokenCache) abstractC3358CGz.A03(HatchNotaryTokenCache.class, new HatchNotaryTokenCache$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchNotaryTokenCache(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        this.cache = C3cG.A0j();
        this.cacheLock = C3cG.A0T();
        this.singleFlight = SingleFlightKt.SingleFlight(abstractC3358CGz, OnDuplicateCall.Join.INSTANCE, false);
    }

    private final long nowSeconds() {
        return C3cI.A02();
    }

    public final void invalidate(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        synchronized (this.cacheLock) {
            this.cache.remove(new CacheKey(str, str2));
        }
    }

    public /* synthetic */ HatchNotaryTokenCache(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
