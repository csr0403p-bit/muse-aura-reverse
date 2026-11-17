package com.facebook.aura.skills.repo;

import X.AbstractC3358CGz;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class RecipientPermissionsRepository {
    public final AbstractC3358CGz userSession;

    public RecipientPermissionsRepository(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.userSession = abstractC3358CGz;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* renamed from: fetchPermissions-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m2123fetchPermissions0E7RQCE(java.lang.String r7, java.lang.String r8, X.HtJ<? super X.HsJ<com.facebook.aura.skills.repo.RecipientPermissionsPage>> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.facebook.aura.skills.repo.RecipientPermissionsRepository$fetchPermissions$1
            if (r0 == 0) goto L3c
            r5 = r9
            com.facebook.aura.skills.repo.RecipientPermissionsRepository$fetchPermissions$1 r5 = (com.facebook.aura.skills.repo.RecipientPermissionsRepository$fetchPermissions$1) r5
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
            com.facebook.aura.skills.repo.RecipientPermissionsRepository$fetchPermissions$2 r0 = new com.facebook.aura.skills.repo.RecipientPermissionsRepository$fetchPermissions$2
            r0.<init>(r7, r6, r8, r1)
            r5.L$0 = r1
            r5.L$1 = r1
            r5.label = r3
            java.lang.Object r1 = X.GAo.A00(r5, r2, r0)
            if (r1 != r4) goto L20
            return r4
        L3c:
            com.facebook.aura.skills.repo.RecipientPermissionsRepository$fetchPermissions$1 r5 = new com.facebook.aura.skills.repo.RecipientPermissionsRepository$fetchPermissions$1
            r5.<init>(r6, r9)
            goto L12
        L42:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.repo.RecipientPermissionsRepository.m2123fetchPermissions0E7RQCE(java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0063 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /* renamed from: hasPermissions-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m2124hasPermissionsgIAlus(java.lang.String r7, X.HtJ<? super X.HsJ<java.lang.Boolean>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.skills.repo.RecipientPermissionsRepository$hasPermissions$1
            if (r0 == 0) goto L66
            r5 = r8
            com.facebook.aura.skills.repo.RecipientPermissionsRepository$hasPermissions$1 r5 = (com.facebook.aura.skills.repo.RecipientPermissionsRepository$hasPermissions$1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L66
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L4e
            if (r0 != r3) goto L72
            java.lang.Object r2 = r5.L$1
            java.util.Set r2 = (java.util.Set) r2
            java.lang.Object r7 = r5.L$0
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r1 = X.AnonymousClass001.A0q(r1)
        L29:
            java.lang.Throwable r0 = X.HsJ.A00(r1)
            if (r0 != 0) goto L49
            com.facebook.aura.skills.repo.RecipientPermissionsPage r1 = (com.facebook.aura.skills.repo.RecipientPermissionsPage) r1
            X.AHD<com.facebook.aura.skills.repo.RecipientPermission> r0 = r1.items
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L6d
            java.lang.String r1 = r1.nextCursor
            if (r1 == 0) goto L6c
            boolean r0 = r2.add(r1)
            if (r0 != 0) goto L56
            java.lang.String r0 = "Repeated recipient permissions cursor"
            java.lang.IllegalStateException r0 = X.C3cG.A0Q(r0)
        L49:
            X.Hud r0 = X.C3cG.A0s(r0)
            return r0
        L4e:
            X.Hwg.A00(r1)
            java.util.LinkedHashSet r2 = X.C3cG.A0k()
            r1 = 0
        L56:
            r5.L$0 = r7
            r5.L$1 = r2
            r0 = 0
            r5.L$2 = r0
            r5.label = r3
            java.lang.Object r1 = r6.m2123fetchPermissions0E7RQCE(r7, r1, r5)
            if (r1 != r4) goto L29
            return r4
        L66:
            com.facebook.aura.skills.repo.RecipientPermissionsRepository$hasPermissions$1 r5 = new com.facebook.aura.skills.repo.RecipientPermissionsRepository$hasPermissions$1
            r5.<init>(r6, r8)
            goto L12
        L6c:
            r3 = 0
        L6d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L72:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.repo.RecipientPermissionsRepository.m2124hasPermissionsgIAlus(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* renamed from: revokePermission-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m2125revokePermissiongIAlus(com.facebook.aura.skills.repo.RecipientPermission r7, X.HtJ<? super X.HsJ<kotlin.Unit>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.skills.repo.RecipientPermissionsRepository$revokePermission$1
            if (r0 == 0) goto L3a
            r5 = r8
            com.facebook.aura.skills.repo.RecipientPermissionsRepository$revokePermission$1 r5 = (com.facebook.aura.skills.repo.RecipientPermissionsRepository$revokePermission$1) r5
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
            com.facebook.aura.skills.repo.RecipientPermissionsRepository$revokePermission$2 r0 = new com.facebook.aura.skills.repo.RecipientPermissionsRepository$revokePermission$2
            r0.<init>(r7, r6, r1)
            r5.L$0 = r1
            r5.label = r3
            java.lang.Object r1 = X.GAo.A00(r5, r2, r0)
            if (r1 != r4) goto L20
            return r4
        L3a:
            com.facebook.aura.skills.repo.RecipientPermissionsRepository$revokePermission$1 r5 = new com.facebook.aura.skills.repo.RecipientPermissionsRepository$revokePermission$1
            r5.<init>(r6, r8)
            goto L12
        L40:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.repo.RecipientPermissionsRepository.m2125revokePermissiongIAlus(com.facebook.aura.skills.repo.RecipientPermission, X.HtJ):java.lang.Object");
    }
}
