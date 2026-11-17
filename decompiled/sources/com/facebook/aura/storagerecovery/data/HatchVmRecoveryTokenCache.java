package com.facebook.aura.storagerecovery.data;

import X.AbstractC3358CGz;
import X.C06H;
import X.C3cI;
import X.C60O;
import X.C7384Etj;
import X.HtJ;
import X.HzP;
import X.InterfaceC7549F2g;
import com.facebook.aura.common.coroutines.OnDuplicateCall;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.common.coroutines.SingleFlightKt;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes4.dex */
public final class HatchVmRecoveryTokenCache implements InterfaceC7549F2g {
    public static final Companion Companion = new Companion();
    public final ConcurrentHashMap<String, CachedTokens> cache;
    public final SingleFlight singleFlight;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.storagerecovery.data.HatchVmRecoveryTokenCache", f = "HatchVmRecoveryTokenCache.kt", l = {50}, m = "mint", v = 2)
    /* renamed from: com.facebook.aura.storagerecovery.data.HatchVmRecoveryTokenCache$mint$1, reason: invalid class name */
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
            return HatchVmRecoveryTokenCache.this.mint(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.storagerecovery.data.HatchVmRecoveryTokenCache", f = "HatchVmRecoveryTokenCache.kt", l = {R.styleable.maplibre_MapView_maplibre_uiCompassMarginTop}, m = "token", v = 2)
    /* renamed from: com.facebook.aura.storagerecovery.data.HatchVmRecoveryTokenCache$token$1, reason: invalid class name and case insensitive filesystem */
    public final class C141321 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C141321(HtJ<? super C141321> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchVmRecoveryTokenCache.this.token(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mint(java.lang.String r7, X.HtJ<? super com.facebook.aura.storagerecovery.data.CachedTokens> r8) throws com.facebook.aura.storagerecovery.data.HatchStorageRecoveryError.Unavailable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.storagerecovery.data.HatchVmRecoveryTokenCache.AnonymousClass1
            if (r0 == 0) goto L56
            r5 = r8
            com.facebook.aura.storagerecovery.data.HatchVmRecoveryTokenCache$mint$1 r5 = (com.facebook.aura.storagerecovery.data.HatchVmRecoveryTokenCache.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L56
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r4 = 1
            if (r0 == 0) goto L40
            if (r0 != r4) goto L61
            java.lang.Object r7 = r5.L$0
            X.Hwg.A00(r1)
        L22:
            com.facebook.aura.common.coroutines.SingleFlightResult r1 = (com.facebook.aura.common.coroutines.SingleFlightResult) r1
            boolean r0 = r1 instanceof com.facebook.aura.common.coroutines.SingleFlightResult.Result
            if (r0 == 0) goto L2d
            com.facebook.aura.common.coroutines.SingleFlightResult$Result r1 = (com.facebook.aura.common.coroutines.SingleFlightResult.Result) r1
            T r3 = r1.value
        L2c:
            return r3
        L2d:
            com.facebook.aura.common.coroutines.SingleFlightResult$Skipped r0 = com.facebook.aura.common.coroutines.SingleFlightResult.Skipped.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 == 0) goto L5c
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.facebook.aura.storagerecovery.data.CachedTokens> r0 = r6.cache
            java.lang.Object r3 = r0.get(r7)
            if (r3 != 0) goto L2c
            com.facebook.aura.storagerecovery.data.HatchStorageRecoveryError$Unavailable r0 = com.facebook.aura.storagerecovery.data.HatchStorageRecoveryError.Unavailable.INSTANCE
            throw r0
        L40:
            X.Hwg.A00(r1)
            com.facebook.aura.common.coroutines.SingleFlight r2 = r6.singleFlight
            r1 = 0
            com.facebook.aura.storagerecovery.data.HatchVmRecoveryTokenCache$mint$result$1 r0 = new com.facebook.aura.storagerecovery.data.HatchVmRecoveryTokenCache$mint$result$1
            r0.<init>(r7, r6, r1)
            r5.L$0 = r7
            r5.label = r4
            java.lang.Object r1 = r2.invoke(r7, r0, r5)
            if (r1 != r3) goto L22
            return r3
        L56:
            com.facebook.aura.storagerecovery.data.HatchVmRecoveryTokenCache$mint$1 r5 = new com.facebook.aura.storagerecovery.data.HatchVmRecoveryTokenCache$mint$1
            r5.<init>(r8)
            goto L12
        L5c:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        L61:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.storagerecovery.data.HatchVmRecoveryTokenCache.mint(java.lang.String, X.HtJ):java.lang.Object");
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        this.cache.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
    
        if (r4.isExpired(X.C3cI.A02()) == false) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object token(java.lang.String r7, java.lang.String r8, X.HtJ<? super java.lang.String> r9) throws com.facebook.aura.storagerecovery.data.HatchStorageRecoveryError.Unavailable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.facebook.aura.storagerecovery.data.HatchVmRecoveryTokenCache.C141321
            if (r0 == 0) goto L60
            r5 = r9
            com.facebook.aura.storagerecovery.data.HatchVmRecoveryTokenCache$token$1 r5 = (com.facebook.aura.storagerecovery.data.HatchVmRecoveryTokenCache.C141321) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L60
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r4 = r5.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r2 = 1
            if (r0 == 0) goto L3b
            if (r0 != r2) goto L6e
            java.lang.Object r8 = r5.L$1
            java.lang.Object r7 = r5.L$0
            X.Hwg.A00(r4)
        L24:
            com.facebook.aura.storagerecovery.data.CachedTokens r4 = (com.facebook.aura.storagerecovery.data.CachedTokens) r4
        L26:
            java.util.Map<java.lang.String, java.lang.String> r0 = r4.tokens
            java.lang.String r0 = X.C60O.A0p(r8, r0)
            if (r0 == 0) goto L66
            java.lang.String r3 = X.AnonymousClass002.A0l(r0)
            if (r3 == 0) goto L66
            int r0 = r3.length()
            if (r0 == 0) goto L66
            return r3
        L3b:
            X.Hwg.A00(r4)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.facebook.aura.storagerecovery.data.CachedTokens> r0 = r6.cache
            java.lang.Object r4 = r0.get(r7)
            com.facebook.aura.storagerecovery.data.CachedTokens r4 = (com.facebook.aura.storagerecovery.data.CachedTokens) r4
            if (r4 == 0) goto L53
            long r0 = X.C3cI.A02()
            boolean r0 = r4.isExpired(r0)
            if (r0 != 0) goto L53
            goto L26
        L53:
            r5.L$0 = r7
            r5.L$1 = r8
            r5.label = r2
            java.lang.Object r4 = r6.mint(r7, r5)
            if (r4 != r3) goto L24
            return r3
        L60:
            com.facebook.aura.storagerecovery.data.HatchVmRecoveryTokenCache$token$1 r5 = new com.facebook.aura.storagerecovery.data.HatchVmRecoveryTokenCache$token$1
            r5.<init>(r9)
            goto L12
        L66:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.facebook.aura.storagerecovery.data.CachedTokens> r0 = r6.cache
            r0.remove(r7)
            com.facebook.aura.storagerecovery.data.HatchStorageRecoveryError$Unavailable r0 = com.facebook.aura.storagerecovery.data.HatchStorageRecoveryError.Unavailable.INSTANCE
            throw r0
        L6e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.storagerecovery.data.HatchVmRecoveryTokenCache.token(java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    public final class Companion {
        public final HatchVmRecoveryTokenCache getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchVmRecoveryTokenCache) abstractC3358CGz.A03(HatchVmRecoveryTokenCache.class, new HatchVmRecoveryTokenCache$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchVmRecoveryTokenCache(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        this.cache = C60O.A1C();
        this.singleFlight = SingleFlightKt.SingleFlight(abstractC3358CGz, OnDuplicateCall.Join.INSTANCE, false);
    }

    private final long nowSeconds() {
        return C3cI.A02();
    }

    public /* synthetic */ HatchVmRecoveryTokenCache(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
