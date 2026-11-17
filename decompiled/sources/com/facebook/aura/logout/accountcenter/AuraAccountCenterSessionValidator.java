package com.facebook.aura.logout.accountcenter;

import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class AuraAccountCenterSessionValidator {
    public static final AuraAccountCenterSessionValidator INSTANCE = new AuraAccountCenterSessionValidator();

    @DebugMetadata(c = "com.facebook.aura.logout.accountcenter.AuraAccountCenterSessionValidator", f = "AuraAccountCenterSessionValidator.kt", l = {23, 50}, m = "validateSession", v = 2)
    /* renamed from: com.facebook.aura.logout.accountcenter.AuraAccountCenterSessionValidator$validateSession$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraAccountCenterSessionValidator.this.validateSession(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object validateSession(X.HtJ<? super kotlin.Unit> r14) throws java.lang.Throwable {
        /*
            r13 = this;
            r3 = r14
            boolean r0 = r14 instanceof com.facebook.aura.logout.accountcenter.AuraAccountCenterSessionValidator.AnonymousClass1
            if (r0 == 0) goto L99
            r14 = r3
            com.facebook.aura.logout.accountcenter.AuraAccountCenterSessionValidator$validateSession$1 r14 = (com.facebook.aura.logout.accountcenter.AuraAccountCenterSessionValidator.AnonymousClass1) r14
            int r2 = r14.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L99
            int r2 = r2 - r1
            r14.label = r2
        L13:
            java.lang.Object r5 = r14.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r14.label
            r4 = 2
            r7 = 1
            if (r0 == 0) goto L27
            if (r0 == r7) goto L44
            if (r0 != r4) goto La0
            X.Hwg.A00(r5)
        L24:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
        L27:
            X.Hwg.A00(r5)
            com.facebook.aura.auth.AuraSessionManager r5 = com.facebook.aura.auth.AuraSessionManager.INSTANCE
            com.facebook.aura.auth.AuraSessionManager$SessionSnapshot r0 = r5.getCurrentSessionSnapshot()
            if (r0 == 0) goto L24
            X.CGz r2 = r0.session
            java.lang.String r1 = r0.accessToken
            r0 = 0
            r14.L$0 = r0
            r14.L$1 = r2
            r14.label = r7
            java.lang.Object r5 = r5.refreshAbraToken(r2, r1, r14)
            if (r5 != r3) goto L4a
            return r3
        L44:
            java.lang.Object r0 = r14.L$1
            X.CGz r2 = X.C60O.A0D(r0, r5)
        L4a:
            com.facebook.aura.auth.AuraSessionManager$AbraTokenRefreshResult r5 = (com.facebook.aura.auth.AuraSessionManager.AbraTokenRefreshResult) r5
            boolean r0 = r5 instanceof com.facebook.aura.auth.AuraSessionManager.AbraTokenRefreshResult.Retry
            if (r0 != 0) goto L73
            boolean r0 = r5 instanceof com.facebook.aura.auth.AuraSessionManager.AbraTokenRefreshResult.Failed
            if (r0 == 0) goto L5e
            com.facebook.aura.logout.AuraLogoutHelper r1 = com.facebook.aura.logout.AuraLogoutHelper.INSTANCE
            com.facebook.aura.auth.AuraSessionManager$AbraTokenRefreshResult$Failed r5 = (com.facebook.aura.auth.AuraSessionManager.AbraTokenRefreshResult.Failed) r5
            java.lang.String r0 = r5.accessToken
            r1.performLogoutIfCurrent(r2, r0)
            goto L24
        L5e:
            com.facebook.aura.auth.AuraSessionManager$AbraTokenRefreshResult$Unavailable r0 = com.facebook.aura.auth.AuraSessionManager.AbraTokenRefreshResult.Unavailable.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r5, r0)
            if (r0 != 0) goto L24
            com.facebook.aura.auth.AuraSessionManager$AbraTokenRefreshResult$SessionChanged r0 = com.facebook.aura.auth.AuraSessionManager.AbraTokenRefreshResult.SessionChanged.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r5, r0)
            if (r0 != 0) goto L24
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        L73:
            com.facebook.aura.network.http.HatchHttpApi r5 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            com.facebook.aura.network.api.StefiHatchPath$TosStatus r8 = com.facebook.aura.network.api.StefiHatchPath.TosStatus.INSTANCE
            com.facebook.aura.network.http.RequestType r9 = com.facebook.aura.network.http.RequestType.GET
            X.9jH r12 = X.AGH.A0E()
            com.facebook.aura.logout.accountcenter.AuraAccountCenterSessionValidator$validateSession$$inlined$executeStefiRequest-bMdYcbs$default$1 r6 = com.facebook.aura.logout.accountcenter.AuraAccountCenterSessionValidator$validateSession$$inlined$executeStefiRequestbMdYcbs$default$1.INSTANCE
            r10 = 0
            r14.L$0 = r10
            r14.L$1 = r10
            r14.L$2 = r10
            r14.L$3 = r10
            r14.L$4 = r10
            r14.L$5 = r10
            r14.L$6 = r10
            r14.label = r4
            r11 = r10
            r13 = r12
            java.lang.Object r0 = r5.m1596executeBodylessStefiRequestWithtZkwj4A(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            if (r0 != r3) goto L24
            return r3
        L99:
            com.facebook.aura.logout.accountcenter.AuraAccountCenterSessionValidator$validateSession$1 r14 = new com.facebook.aura.logout.accountcenter.AuraAccountCenterSessionValidator$validateSession$1
            r14.<init>(r3)
            goto L13
        La0:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.logout.accountcenter.AuraAccountCenterSessionValidator.validateSession(X.HtJ):java.lang.Object");
    }
}
