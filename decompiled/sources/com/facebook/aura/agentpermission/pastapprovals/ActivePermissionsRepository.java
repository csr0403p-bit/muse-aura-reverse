package com.facebook.aura.agentpermission.pastapprovals;

import X.AbstractC3358CGz;
import X.C06H;
import X.C7384Etj;
import X.HtJ;
import X.InterfaceC7549F2g;

/* loaded from: classes3.dex */
public final class ActivePermissionsRepository implements InterfaceC7549F2g {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final AbstractC3358CGz userSession;

    /* renamed from: getActivePermissions-0E7RQCE$default, reason: not valid java name */
    public static /* synthetic */ Object m194getActivePermissions0E7RQCE$default(ActivePermissionsRepository activePermissionsRepository, String str, int i, HtJ htJ, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 50;
        }
        return activePermissionsRepository.m196getActivePermissions0E7RQCE(str, i, htJ);
    }

    /* renamed from: getGroupedActivePermissions-0E7RQCE$default, reason: not valid java name */
    public static /* synthetic */ Object m195getGroupedActivePermissions0E7RQCE$default(ActivePermissionsRepository activePermissionsRepository, String str, int i, HtJ htJ, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 20;
        }
        return activePermissionsRepository.m197getGroupedActivePermissions0E7RQCE(str, i, htJ);
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* renamed from: getActivePermissions-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m196getActivePermissions0E7RQCE(java.lang.String r7, int r8, X.HtJ<? super X.HsJ<com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsPage>> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsRepository$getActivePermissions$1
            if (r0 == 0) goto L3c
            r5 = r9
            com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsRepository$getActivePermissions$1 r5 = (com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsRepository$getActivePermissions$1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3c
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L25
            if (r0 != r3) goto L42
            X.Hwg.A00(r1)
        L20:
            X.HsJ r1 = (X.HsJ) r1
            java.lang.Object r0 = r1.value
            return r0
        L25:
            X.78T r2 = X.AnonymousClass002.A0s(r1)
            r1 = 0
            com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsRepository$getActivePermissions$2 r0 = new com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsRepository$getActivePermissions$2
            r0.<init>(r6, r8, r7, r1)
            r5.L$0 = r1
            r5.I$0 = r8
            r5.label = r3
            java.lang.Object r1 = X.GAo.A00(r5, r2, r0)
            if (r1 != r4) goto L20
            return r4
        L3c:
            com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsRepository$getActivePermissions$1 r5 = new com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsRepository$getActivePermissions$1
            r5.<init>(r6, r9)
            goto L12
        L42:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsRepository.m196getActivePermissions0E7RQCE(java.lang.String, int, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* renamed from: getGroupedActivePermissions-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m197getGroupedActivePermissions0E7RQCE(java.lang.String r7, int r8, X.HtJ<? super X.HsJ<com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsGroupedPage>> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsRepository$getGroupedActivePermissions$1
            if (r0 == 0) goto L3c
            r5 = r9
            com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsRepository$getGroupedActivePermissions$1 r5 = (com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsRepository$getGroupedActivePermissions$1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3c
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L25
            if (r0 != r3) goto L42
            X.Hwg.A00(r1)
        L20:
            X.HsJ r1 = (X.HsJ) r1
            java.lang.Object r0 = r1.value
            return r0
        L25:
            X.78T r2 = X.AnonymousClass002.A0s(r1)
            r1 = 0
            com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsRepository$getGroupedActivePermissions$2 r0 = new com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsRepository$getGroupedActivePermissions$2
            r0.<init>(r6, r8, r7, r1)
            r5.L$0 = r1
            r5.I$0 = r8
            r5.label = r3
            java.lang.Object r1 = X.GAo.A00(r5, r2, r0)
            if (r1 != r4) goto L20
            return r4
        L3c:
            com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsRepository$getGroupedActivePermissions$1 r5 = new com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsRepository$getGroupedActivePermissions$1
            r5.<init>(r6, r9)
            goto L12
        L42:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsRepository.m197getGroupedActivePermissions0E7RQCE(java.lang.String, int, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* renamed from: resetPermissions-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m198resetPermissionsIoAF18A(X.HtJ<? super X.HsJ<com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsPage>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsRepository$resetPermissions$1
            if (r0 == 0) goto L38
            r5 = r7
            com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsRepository$resetPermissions$1 r5 = (com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsRepository$resetPermissions$1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L38
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L25
            if (r0 != r3) goto L3e
            X.Hwg.A00(r1)
        L20:
            X.HsJ r1 = (X.HsJ) r1
            java.lang.Object r0 = r1.value
            return r0
        L25:
            X.78T r2 = X.AnonymousClass002.A0s(r1)
            r1 = 0
            com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsRepository$resetPermissions$2 r0 = new com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsRepository$resetPermissions$2
            r0.<init>(r6, r1)
            r5.label = r3
            java.lang.Object r1 = X.GAo.A00(r5, r2, r0)
            if (r1 != r4) goto L20
            return r4
        L38:
            com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsRepository$resetPermissions$1 r5 = new com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsRepository$resetPermissions$1
            r5.<init>(r6, r7)
            goto L12
        L3e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsRepository.m198resetPermissionsIoAF18A(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* renamed from: revokePermission-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m199revokePermissiongIAlus(com.facebook.aura.agentpermission.pastapprovals.ActivePermission r7, X.HtJ<? super X.HsJ<com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsPage>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsRepository$revokePermission$1
            if (r0 == 0) goto L3a
            r5 = r8
            com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsRepository$revokePermission$1 r5 = (com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsRepository$revokePermission$1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3a
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L25
            if (r0 != r3) goto L40
            X.Hwg.A00(r1)
        L20:
            X.HsJ r1 = (X.HsJ) r1
            java.lang.Object r0 = r1.value
            return r0
        L25:
            X.78T r2 = X.AnonymousClass002.A0s(r1)
            r1 = 0
            com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsRepository$revokePermission$2 r0 = new com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsRepository$revokePermission$2
            r0.<init>(r7, r6, r1)
            r5.L$0 = r1
            r5.label = r3
            java.lang.Object r1 = X.GAo.A00(r5, r2, r0)
            if (r1 != r4) goto L20
            return r4
        L3a:
            com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsRepository$revokePermission$1 r5 = new com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsRepository$revokePermission$1
            r5.<init>(r6, r8)
            goto L12
        L40:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsRepository.m199revokePermissiongIAlus(com.facebook.aura.agentpermission.pastapprovals.ActivePermission, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* renamed from: setPermissionMode-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m200setPermissionMode0E7RQCE(com.facebook.aura.agentpermission.pastapprovals.ActivePermission r7, com.facebook.aura.agentpermission.ConnectorPermissionMode r8, X.HtJ<? super X.HsJ<kotlin.Unit>> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsRepository$setPermissionMode$1
            if (r0 == 0) goto L3c
            r5 = r9
            com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsRepository$setPermissionMode$1 r5 = (com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsRepository$setPermissionMode$1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3c
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L25
            if (r0 != r3) goto L42
            X.Hwg.A00(r1)
        L20:
            X.HsJ r1 = (X.HsJ) r1
            java.lang.Object r0 = r1.value
            return r0
        L25:
            X.78T r2 = X.AnonymousClass002.A0s(r1)
            r1 = 0
            com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsRepository$setPermissionMode$2 r0 = new com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsRepository$setPermissionMode$2
            r0.<init>(r7, r8, r6, r1)
            r5.L$0 = r1
            r5.L$1 = r1
            r5.label = r3
            java.lang.Object r1 = X.GAo.A00(r5, r2, r0)
            if (r1 != r4) goto L20
            return r4
        L3c:
            com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsRepository$setPermissionMode$1 r5 = new com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsRepository$setPermissionMode$1
            r5.<init>(r6, r9)
            goto L12
        L42:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsRepository.m200setPermissionMode0E7RQCE(com.facebook.aura.agentpermission.pastapprovals.ActivePermission, com.facebook.aura.agentpermission.ConnectorPermissionMode, X.HtJ):java.lang.Object");
    }

    public final class Companion {
        public final ActivePermissionsRepository getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (ActivePermissionsRepository) abstractC3358CGz.A03(ActivePermissionsRepository.class, new ActivePermissionsRepository$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public ActivePermissionsRepository(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
    }

    public /* synthetic */ ActivePermissionsRepository(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
