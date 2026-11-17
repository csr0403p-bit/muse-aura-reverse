package com.facebook.aura.auth.postconsolidation;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06H;
import X.C7384Etj;
import X.C78T;
import X.G0U;
import X.G0W;
import X.G2j;
import X.HsJ;
import X.HtJ;
import X.HzP;
import com.facebook.aura.auth.AuraSessionManager;
import com.facebook.aura.auth.postconsolidation.HatchPostConsolidationCredentialRefresher;
import com.facebook.aura.login.nativeflow.HatchAuthApi;
import com.facebook.aura.login.nativeflow.HatchAuthCredentials;
import com.facebook.aura.login.nativeflow.HatchSsoSourceApp;
import com.facebook.aura.login.nativeflow.HatchTempTokenProvider;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class HatchPostConsolidationCredentialRefresher {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final G0U<PostConsolidationSessionCapture, Boolean> beginRefreshWindow;
    public final Function0<PostConsolidationSessionCapture> captureSession;
    public final G0W<PostConsolidationSessionCapture, HatchAuthCredentials, HtJ<? super AuraSessionManager.PostConsolidationCredentialReplacementResult>, Object> commitCredentials;
    public final C78T dispatcher;
    public final G0U<PostConsolidationSessionCapture, Unit> endRefreshWindow;
    public final G2j<String, HatchSsoSourceApp, String, HtJ<? super HsJ<HatchAuthCredentials>>, Object> exchange;
    public final G0U<HtJ<? super HsJ<String>>, Object> getTempToken;
    public final G0U<String, Unit> invalidateTempToken;
    public final G0U<PostConsolidationCredentialRefreshResult, Unit> logResult;

    public final class Companion {
        public static final boolean create$lambda$1(PostConsolidationSessionCapture postConsolidationSessionCapture) {
            C7384Etj.A0Y(postConsolidationSessionCapture, 0);
            return AuraSessionManager.INSTANCE.beginPostConsolidationCredentialRefresh(postConsolidationSessionCapture.session);
        }

        public static final Unit create$lambda$2(PostConsolidationSessionCapture postConsolidationSessionCapture) {
            C7384Etj.A0Y(postConsolidationSessionCapture, 0);
            AuraSessionManager.INSTANCE.endPostConsolidationCredentialRefresh(postConsolidationSessionCapture.session);
            return Unit.INSTANCE;
        }

        public static final PostConsolidationSessionCapture create$lambda$0() {
            AuraSessionManager.SessionSnapshot currentSessionSnapshot = AuraSessionManager.INSTANCE.getCurrentSessionSnapshot();
            if (currentSessionSnapshot != null) {
                return new PostConsolidationSessionCapture(currentSessionSnapshot.session, currentSessionSnapshot.accessToken);
            }
            return null;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public final HatchPostConsolidationCredentialRefresher create() {
            C78T c78tA0y = AnonymousClass001.A0y();
            Function0 function0 = new Function0() { // from class: com.facebook.aura.auth.postconsolidation.HatchPostConsolidationCredentialRefresher$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HatchPostConsolidationCredentialRefresher.Companion.create$lambda$0();
                }
            };
            HatchTempTokenProvider hatchTempTokenProvider = HatchTempTokenProvider.INSTANCE;
            return new HatchPostConsolidationCredentialRefresher(c78tA0y, function0, new HatchPostConsolidationCredentialRefresher$Companion$create$2(hatchTempTokenProvider), new HatchPostConsolidationCredentialRefresher$Companion$create$3(hatchTempTokenProvider), new HatchPostConsolidationCredentialRefresher$Companion$create$4(HatchAuthApi.INSTANCE), new HatchPostConsolidationCredentialRefresher$Companion$create$5(null), new G0U() { // from class: com.facebook.aura.auth.postconsolidation.HatchPostConsolidationCredentialRefresher$Companion$$ExternalSyntheticLambda1
                @Override // X.G0U
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(HatchPostConsolidationCredentialRefresher.Companion.create$lambda$1((PostConsolidationSessionCapture) obj));
                }
            }, new G0U() { // from class: com.facebook.aura.auth.postconsolidation.HatchPostConsolidationCredentialRefresher$Companion$$ExternalSyntheticLambda2
                @Override // X.G0U
                public final Object invoke(Object obj) {
                    return HatchPostConsolidationCredentialRefresher.Companion.create$lambda$2((PostConsolidationSessionCapture) obj);
                }
            }, HatchPostConsolidationCredentialRefresher$Companion$create$8.INSTANCE);
        }

        public Companion() {
        }
    }

    @DebugMetadata(c = "com.facebook.aura.auth.postconsolidation.HatchPostConsolidationCredentialRefresher", f = "HatchPostConsolidationCredentialRefresher.kt", l = {127, 152}, m = "exchangeAndCommit", v = 2)
    /* renamed from: com.facebook.aura.auth.postconsolidation.HatchPostConsolidationCredentialRefresher$exchangeAndCommit$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchPostConsolidationCredentialRefresher.this.exchangeAndCommit(null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object exchangeAndCommit(com.facebook.aura.auth.postconsolidation.PostConsolidationSessionCapture r9, com.facebook.aura.auth.postconsolidation.PostConsolidationSurvivorFrlCredential r10, java.lang.String r11, X.HtJ<? super com.facebook.aura.auth.postconsolidation.PostConsolidationCredentialRefreshResult> r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.auth.postconsolidation.HatchPostConsolidationCredentialRefresher.exchangeAndCommit(com.facebook.aura.auth.postconsolidation.PostConsolidationSessionCapture, com.facebook.aura.auth.postconsolidation.PostConsolidationSurvivorFrlCredential, java.lang.String, X.HtJ):java.lang.Object");
    }

    private final PostConsolidationCredentialRefreshResult report(PostConsolidationCredentialRefreshResult postConsolidationCredentialRefreshResult) {
        this.logResult.invoke(postConsolidationCredentialRefreshResult);
        return postConsolidationCredentialRefreshResult;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object refresh$fbandroid_express_aura_java_com_facebook_aura_auth_postconsolidation_postconsolidation(com.facebook.aura.auth.postconsolidation.PostConsolidationSurvivorFrlCredential r8, X.HtJ<? super com.facebook.aura.auth.postconsolidation.PostConsolidationCredentialRefreshResult> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.auth.postconsolidation.HatchPostConsolidationCredentialRefresher$refresh$1
            if (r0 == 0) goto L20
            r5 = r9
            com.facebook.aura.auth.postconsolidation.HatchPostConsolidationCredentialRefresher$refresh$1 r5 = (com.facebook.aura.auth.postconsolidation.HatchPostConsolidationCredentialRefresher$refresh$1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r4 = 1
            if (r0 == 0) goto L2b
            if (r0 != r4) goto L26
            java.lang.Object r3 = r5.L$1
            goto L6f
        L20:
            com.facebook.aura.auth.postconsolidation.HatchPostConsolidationCredentialRefresher$refresh$1 r5 = new com.facebook.aura.auth.postconsolidation.HatchPostConsolidationCredentialRefresher$refresh$1
            r5.<init>(r7, r9)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A0n()
            throw r1
        L2b:
            X.Hwg.A00(r1)
            java.lang.String r0 = r8.accountId
            boolean r0 = X.C7BY.A0j(r0)
            if (r0 != 0) goto L84
            java.lang.String r0 = r8.accessToken
            boolean r0 = X.C7BY.A0j(r0)
            if (r0 != 0) goto L84
            kotlin.jvm.functions.Function0<com.facebook.aura.auth.postconsolidation.PostConsolidationSessionCapture> r0 = r7.captureSession
            java.lang.Object r3 = r0.invoke()
            com.facebook.aura.auth.postconsolidation.PostConsolidationSessionCapture r3 = (com.facebook.aura.auth.postconsolidation.PostConsolidationSessionCapture) r3
            if (r3 == 0) goto L81
            java.lang.String r0 = r3.accessToken
            if (r0 == 0) goto L81
            boolean r0 = X.C7BY.A0j(r0)
            if (r0 != 0) goto L81
            X.G0U<com.facebook.aura.auth.postconsolidation.PostConsolidationSessionCapture, java.lang.Boolean> r0 = r7.beginRefreshWindow
            boolean r0 = X.AnonymousClass003.A1X(r3, r0)
            if (r0 == 0) goto L81
            X.78T r2 = r7.dispatcher     // Catch: java.lang.Throwable -> L7a
            r1 = 0
            com.facebook.aura.auth.postconsolidation.HatchPostConsolidationCredentialRefresher$refresh$2 r0 = new com.facebook.aura.auth.postconsolidation.HatchPostConsolidationCredentialRefresher$refresh$2     // Catch: java.lang.Throwable -> L7a
            r0.<init>(r7, r3, r8, r1)     // Catch: java.lang.Throwable -> L7a
            r5.L$0 = r1     // Catch: java.lang.Throwable -> L7a
            r5.L$1 = r3     // Catch: java.lang.Throwable -> L7a
            r5.label = r4     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r1 = X.GAo.A00(r5, r2, r0)     // Catch: java.lang.Throwable -> L7a
            if (r1 != r6) goto L72
            return r6
        L6f:
            X.Hwg.A00(r1)     // Catch: java.lang.Throwable -> L7a
        L72:
            com.facebook.aura.auth.postconsolidation.PostConsolidationCredentialRefreshResult r1 = (com.facebook.aura.auth.postconsolidation.PostConsolidationCredentialRefreshResult) r1     // Catch: java.lang.Throwable -> L7a
            X.G0U<com.facebook.aura.auth.postconsolidation.PostConsolidationSessionCapture, kotlin.Unit> r0 = r7.endRefreshWindow
            r0.invoke(r3)
            return r1
        L7a:
            r1 = move-exception
            X.G0U<com.facebook.aura.auth.postconsolidation.PostConsolidationSessionCapture, kotlin.Unit> r0 = r7.endRefreshWindow
            r0.invoke(r3)
            throw r1
        L81:
            com.facebook.aura.auth.postconsolidation.PostConsolidationCredentialRefreshResult r0 = com.facebook.aura.auth.postconsolidation.PostConsolidationCredentialRefreshResult.SESSION_CHANGED
            goto L86
        L84:
            com.facebook.aura.auth.postconsolidation.PostConsolidationCredentialRefreshResult r0 = com.facebook.aura.auth.postconsolidation.PostConsolidationCredentialRefreshResult.MISSING_SURVIVOR_CREDENTIAL
        L86:
            r7.report(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.auth.postconsolidation.HatchPostConsolidationCredentialRefresher.refresh$fbandroid_express_aura_java_com_facebook_aura_auth_postconsolidation_postconsolidation(com.facebook.aura.auth.postconsolidation.PostConsolidationSurvivorFrlCredential, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HatchPostConsolidationCredentialRefresher(C78T c78t, Function0<PostConsolidationSessionCapture> function0, G0U<? super HtJ<? super HsJ<String>>, ? extends Object> g0u, G0U<? super String, Unit> g0u2, G2j<? super String, ? super HatchSsoSourceApp, ? super String, ? super HtJ<? super HsJ<HatchAuthCredentials>>, ? extends Object> g2j, G0W<? super PostConsolidationSessionCapture, ? super HatchAuthCredentials, ? super HtJ<? super AuraSessionManager.PostConsolidationCredentialReplacementResult>, ? extends Object> g0w, G0U<? super PostConsolidationSessionCapture, Boolean> g0u3, G0U<? super PostConsolidationSessionCapture, Unit> g0u4, G0U<? super PostConsolidationCredentialRefreshResult, Unit> g0u5) {
        AnonymousClass005.A17(c78t, function0, g0u, g0u2, g2j);
        AnonymousClass005.A0z(g0w, g0u3, g0u4);
        C7384Etj.A0Y(g0u5, 8);
        this.dispatcher = c78t;
        this.captureSession = function0;
        this.getTempToken = g0u;
        this.invalidateTempToken = g0u2;
        this.exchange = g2j;
        this.commitCredentials = g0w;
        this.beginRefreshWindow = g0u3;
        this.endRefreshWindow = g0u4;
        this.logResult = g0u5;
    }

    public static final /* synthetic */ PostConsolidationCredentialRefreshResult access$report(HatchPostConsolidationCredentialRefresher hatchPostConsolidationCredentialRefresher, PostConsolidationCredentialRefreshResult postConsolidationCredentialRefreshResult) {
        hatchPostConsolidationCredentialRefresher.report(postConsolidationCredentialRefreshResult);
        return postConsolidationCredentialRefreshResult;
    }
}
