package com.facebook.aura.user.repo;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass002;
import X.BLG;
import X.C06H;
import X.C1BN;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C9286GCn;
import X.G0V;
import X.HtJ;
import X.Hxb;
import X.HzC;
import X.HzP;
import X.InterfaceC7549F2g;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer;
import com.facebook.aura.user.provider.AuraUserData;
import com.facebook.aura.user.repo.RememberedAccountProfileRefresh;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class AuraUserRepository implements InterfaceC7549F2g {
    public static final Companion Companion = new Companion();
    public final BLG<Boolean> _hasFinishedFetch;
    public final C3UX backgroundScope;
    public final SingleFlight fetchUserSingleFlight;
    public final C1BN<Boolean> hasFinishedFetch;
    public final RememberedAccountProfileRefresh rememberedAccountProfileRefresh;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.user.repo.AuraUserRepository$fetchFromStefi$2", f = "AuraUserRepository.kt", l = {128, 135, 136}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.user.repo.AuraUserRepository$fetchFromStefi$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super AuraUserData>, Object> {
        public final /* synthetic */ String $resolutionMode;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$resolutionMode = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass2 anonymousClass2 = AuraUserRepository.this.new AnonymousClass2(this.$resolutionMode, htJ);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x003a A[PHI: r7
  0x003a: PHI (r7v6 java.lang.String) = (r7v1 java.lang.String), (r7v7 java.lang.String) binds: [B:39:0x012c, B:16:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0044 A[PHI: r6 r7
  0x0044: PHI (r6v4 java.lang.String) = (r6v1 java.lang.String), (r6v5 java.lang.String) binds: [B:42:0x0131, B:20:0x0042] A[DONT_GENERATE, DONT_INLINE]
  0x0044: PHI (r7v5 java.lang.String) = (r7v2 java.lang.String), (r7v6 java.lang.String) binds: [B:42:0x0131, B:20:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00c3  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00f5  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0129  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x012b  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0130 A[PHI: r7
  0x0130: PHI (r7v2 java.lang.String) = (r7v1 java.lang.String), (r7v6 java.lang.String), (r7v6 java.lang.String) binds: [B:39:0x012c, B:18:0x003c, B:20:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:57:0x01ca A[RETURN] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r26) {
            /*
                Method dump skipped, instructions count: 464
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.user.repo.AuraUserRepository.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super AuraUserData> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.user.repo.AuraUserRepository", f = "AuraUserRepository.kt", l = {LinkEncryptedPairingKt.LINK_PUBLIC_KEY_SIZE}, m = "fetchUser", v = 2)
    /* renamed from: com.facebook.aura.user.repo.AuraUserRepository$fetchUser$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraUserRepository.this.fetchUser(false, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.user.repo.AuraUserRepository", f = "AuraUserRepository.kt", l = {HatchIdeaShareImageRenderer.TEXT_LEFT}, m = "fetchUserOnce", v = 2)
    /* renamed from: com.facebook.aura.user.repo.AuraUserRepository$fetchUserOnce$1, reason: invalid class name and case insensitive filesystem */
    public final class C142631 extends HzP {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C142631(HtJ<? super C142631> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraUserRepository.this.fetchUserOnce(false, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fetchFromStefi(String str, HtJ<? super AuraUserData> htJ) {
        return Hxb.A00(new AnonymousClass2(str, null), htJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchUserOnce(boolean r15, X.HtJ<? super com.facebook.aura.user.provider.AuraUserData> r16) {
        /*
            r14 = this;
            r3 = r16
            boolean r0 = r3 instanceof com.facebook.aura.user.repo.AuraUserRepository.C142631
            if (r0 == 0) goto L28
            r7 = r3
            com.facebook.aura.user.repo.AuraUserRepository$fetchUserOnce$1 r7 = (com.facebook.aura.user.repo.AuraUserRepository.C142631) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L28
            int r2 = r2 - r1
            r7.label = r2
        L14:
            java.lang.Object r2 = r7.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r7.label
            r3 = 1
            if (r0 == 0) goto L33
            if (r0 != r3) goto L2e
            long r0 = r7.J$0
            java.lang.Object r5 = r7.L$1
            com.facebook.aura.user.provider.AuraViewerDataProvider r5 = (com.facebook.aura.user.provider.AuraViewerDataProvider) r5
            java.lang.Object r4 = r7.L$0
            goto L5a
        L28:
            com.facebook.aura.user.repo.AuraUserRepository$fetchUserOnce$1 r7 = new com.facebook.aura.user.repo.AuraUserRepository$fetchUserOnce$1
            r7.<init>(r3)
            goto L14
        L2e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L33:
            X.Hwg.A00(r2)
            if (r15 == 0) goto L3b
            java.lang.String r4 = "blocking"
            goto L3d
        L3b:
            java.lang.String r4 = "non_blocking"
        L3d:
            com.facebook.aura.user.provider.AuraViewerDataProvider$Companion r1 = com.facebook.aura.user.provider.AuraViewerDataProvider.Companion     // Catch: java.lang.Exception -> L72 java.util.concurrent.CancellationException -> Lae
            X.CGz r0 = r14.userSession     // Catch: java.lang.Exception -> L72 java.util.concurrent.CancellationException -> Lae
            com.facebook.aura.user.provider.AuraViewerDataProvider r5 = r1.getInstance(r0)     // Catch: java.lang.Exception -> L72 java.util.concurrent.CancellationException -> Lae
            long r0 = r5.snapshotOptimisticVersion()     // Catch: java.lang.Exception -> L72 java.util.concurrent.CancellationException -> Lae
            r7.L$0 = r4     // Catch: java.lang.Exception -> L72 java.util.concurrent.CancellationException -> Lae
            r7.L$1 = r5     // Catch: java.lang.Exception -> L72 java.util.concurrent.CancellationException -> Lae
            r7.Z$0 = r15     // Catch: java.lang.Exception -> L72 java.util.concurrent.CancellationException -> Lae
            r7.J$0 = r0     // Catch: java.lang.Exception -> L72 java.util.concurrent.CancellationException -> Lae
            r7.label = r3     // Catch: java.lang.Exception -> L72 java.util.concurrent.CancellationException -> Lae
            java.lang.Object r2 = r14.fetchFromStefi(r4, r7)     // Catch: java.lang.Exception -> L72 java.util.concurrent.CancellationException -> Lae
            if (r2 != r6) goto L5d
            return r6
        L5a:
            X.Hwg.A00(r2)     // Catch: java.lang.Exception -> L70 java.util.concurrent.CancellationException -> Lae
        L5d:
            com.facebook.aura.user.provider.AuraUserData r2 = (com.facebook.aura.user.provider.AuraUserData) r2     // Catch: java.lang.Exception -> L70 java.util.concurrent.CancellationException -> Lae
            r5.updateFromServer(r2, r0)     // Catch: java.lang.Exception -> L70 java.util.concurrent.CancellationException -> Lae
            X.BLG<java.lang.Boolean> r0 = r14._hasFinishedFetch     // Catch: java.lang.Exception -> L70 java.util.concurrent.CancellationException -> Lae
            X.AnonymousClass004.A1D(r3, r0)     // Catch: java.lang.Exception -> L70 java.util.concurrent.CancellationException -> Lae
            X.1BN<com.facebook.aura.user.provider.AuraUserData> r0 = r5.userData     // Catch: java.lang.Exception -> L70 java.util.concurrent.CancellationException -> Lae
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L70 java.util.concurrent.CancellationException -> Lae
            com.facebook.aura.user.provider.AuraUserData r0 = (com.facebook.aura.user.provider.AuraUserData) r0     // Catch: java.lang.Exception -> L70 java.util.concurrent.CancellationException -> Lae
            return r0
        L70:
            r5 = move-exception
            goto L73
        L72:
            r5 = move-exception
        L73:
            java.lang.String r1 = r5.getMessage()
            java.lang.String r0 = "AuraUser fetch failed: "
            java.lang.String r1 = X.FGI.A0M(r0, r1)
            java.lang.String r0 = "AuraUserRepository"
            X.CFK.A08(r0, r1, r5)
            com.facebook.aura.analytics.hatch.HatchAppEventLogger r6 = com.facebook.aura.analytics.hatch.HatchAppEventLogger.INSTANCE
            java.lang.String r8 = com.facebook.aura.user.repo.AuraUserRepositoryKt.SURFACE_ONBOARDING
            java.lang.String r10 = com.facebook.aura.user.repo.AuraUserRepositoryKt.EVENT_TYPE_STATUS_CHECK
            java.lang.String r1 = "result"
            java.lang.String r0 = "error"
            X.HxE r2 = X.C3cG.A0r(r1, r0)
            java.lang.String r1 = "error_type"
            java.lang.String r0 = com.facebook.aura.user.repo.AuraUserRepositoryKt.errorTypeFor(r5)
            X.HxE r1 = X.C3cG.A0r(r1, r0)
            java.lang.String r0 = "resolution_mode"
            java.util.Map r12 = X.C3cH.A0m(r0, r4, r2, r1)
            r9 = 0
            java.lang.String r7 = "activation_status_check"
            r11 = r7
            r13 = r9
            r6.logEvent(r7, r8, r9, r10, r11, r12, r13)
            X.BLG<java.lang.Boolean> r0 = r14._hasFinishedFetch
            X.AnonymousClass003.A14(r0, r3)
            return r9
        Lae:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.user.repo.AuraUserRepository.fetchUserOnce(boolean, X.HtJ):java.lang.Object");
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        this.fetchUserSingleFlight.clearAndCancelAll();
        Hxb.A03(null, this.backgroundScope);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchUser(boolean r7, X.HtJ<? super com.facebook.aura.user.provider.AuraUserData> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.user.repo.AuraUserRepository.AnonymousClass1
            if (r0 == 0) goto L50
            r5 = r8
            com.facebook.aura.user.repo.AuraUserRepository$fetchUser$1 r5 = (com.facebook.aura.user.repo.AuraUserRepository.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L50
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r2 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r1 = r5.label
            r3 = 0
            r0 = 1
            if (r1 == 0) goto L39
            if (r1 != r0) goto L56
            X.Hwg.A00(r2)
        L21:
            com.facebook.aura.common.coroutines.SingleFlightResult r2 = (com.facebook.aura.common.coroutines.SingleFlightResult) r2
            boolean r0 = r2 instanceof com.facebook.aura.common.coroutines.SingleFlightResult.Result
            if (r0 == 0) goto L2c
            com.facebook.aura.common.coroutines.SingleFlightResult$Result r2 = (com.facebook.aura.common.coroutines.SingleFlightResult.Result) r2
            T r3 = r2.value
        L2b:
            return r3
        L2c:
            com.facebook.aura.common.coroutines.SingleFlightResult$Skipped r0 = com.facebook.aura.common.coroutines.SingleFlightResult.Skipped.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r2, r0)
            if (r0 != 0) goto L2b
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        L39:
            X.Hwg.A00(r2)
            com.facebook.aura.common.coroutines.SingleFlight r2 = r6.fetchUserSingleFlight
            com.facebook.aura.user.repo.AuraUserRepository$fetchUser$result$1 r1 = new com.facebook.aura.user.repo.AuraUserRepository$fetchUser$result$1
            r1.<init>(r6, r7, r3)
            r5.Z$0 = r7
            r5.label = r0
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            java.lang.Object r2 = r2.invoke(r0, r1, r5)
            if (r2 != r4) goto L21
            return r4
        L50:
            com.facebook.aura.user.repo.AuraUserRepository$fetchUser$1 r5 = new com.facebook.aura.user.repo.AuraUserRepository$fetchUser$1
            r5.<init>(r8)
            goto L12
        L56:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.user.repo.AuraUserRepository.fetchUser(boolean, X.HtJ):java.lang.Object");
    }

    public final C1BN<Boolean> getHasFinishedFetch() {
        return this.hasFinishedFetch;
    }

    public final class Companion {
        public final AuraUserRepository getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (AuraUserRepository) abstractC3358CGz.A03(AuraUserRepository.class, new AuraUserRepository$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public AuraUserRepository(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        this.fetchUserSingleFlight = C3cH.A0M();
        HzC hzCA0w = C3cH.A0w();
        this.backgroundScope = hzCA0w;
        this.rememberedAccountProfileRefresh = new RememberedAccountProfileRefresh(hzCA0w, RememberedAccountProfileRefresh.AnonymousClass1.INSTANCE);
        C9286GCn c9286GCnA0v = AnonymousClass002.A0v(false);
        this._hasFinishedFetch = c9286GCnA0v;
        this.hasFinishedFetch = C3cG.A11(c9286GCnA0v);
    }

    public /* synthetic */ AuraUserRepository(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
