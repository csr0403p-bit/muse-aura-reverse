package com.facebook.aura.agentpermission.pastapprovals;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.G0U;
import X.G0V;
import com.facebook.aura.agentpermission.ConnectorPermissionMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ActivePermissionsScreenKt$activePermissionSection$4$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ String $menuPermissionId;
    public final /* synthetic */ Function0<Unit> $onDismissMenu;
    public final /* synthetic */ G0U<String, Unit> $onMenuRequested;
    public final /* synthetic */ G0V<ActivePermission, ConnectorPermissionMode, Unit> $onModeSelected;
    public final /* synthetic */ G0U<ActivePermission, Unit> $onRevoke;
    public final /* synthetic */ ActivePermission $permission;
    public final /* synthetic */ ActivePermissionsUiState $uiState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ActivePermissionsScreenKt$activePermissionSection$4$1(ActivePermissionsUiState activePermissionsUiState, ActivePermission activePermission, String str, G0U<? super ActivePermission, Unit> g0u, G0U<? super String, Unit> g0u2, Function0<Unit> function0, G0V<? super ActivePermission, ? super ConnectorPermissionMode, Unit> g0v) {
        super(2);
        this.$uiState = activePermissionsUiState;
        this.$permission = activePermission;
        this.$menuPermissionId = str;
        this.$onRevoke = g0u;
        this.$onMenuRequested = g0u2;
        this.$onDismissMenu = function0;
        this.$onModeSelected = g0v;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke(X.BFM r17, int r18) {
        /*
            r16 = this;
            r1 = r18
            boolean r0 = X.AnonymousClass004.A1E(r1)
            r15 = r17
            boolean r0 = X.AnonymousClass001.A1b(r0, r15, r1)
            if (r0 == 0) goto Lca
            r3 = r16
            com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsUiState r2 = r3.$uiState
            java.lang.String r0 = r2.revokingPermissionId
            if (r0 != 0) goto L1f
            java.lang.String r0 = r2.updatingPermissionId
            if (r0 != 0) goto L1f
            boolean r0 = r2.isResetting
            r6 = 1
            if (r0 == 0) goto L20
        L1f:
            r6 = 0
        L20:
            com.facebook.aura.agentpermission.pastapprovals.ActivePermission r4 = r3.$permission
            java.lang.String r1 = r4.connectorKey
            if (r1 == 0) goto Lc7
            X.BO6<java.lang.String, java.lang.String> r0 = r2.connectorIconUrls
            java.lang.String r5 = X.C60O.A0p(r1, r0)
        L2c:
            com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsUiState r0 = r3.$uiState
            java.lang.String r1 = r0.revokingPermissionId
            com.facebook.aura.agentpermission.pastapprovals.ActivePermission r0 = r3.$permission
            java.lang.String r0 = r0.permissionId
            boolean r7 = X.C7384Etj.areEqual(r1, r0)
            com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsUiState r0 = r3.$uiState
            java.lang.String r1 = r0.updatingPermissionId
            com.facebook.aura.agentpermission.pastapprovals.ActivePermission r0 = r3.$permission
            java.lang.String r0 = r0.permissionId
            boolean r8 = X.C7384Etj.areEqual(r1, r0)
            java.lang.String r1 = r3.$menuPermissionId
            com.facebook.aura.agentpermission.pastapprovals.ActivePermission r0 = r3.$permission
            java.lang.String r0 = r0.permissionId
            boolean r9 = X.C7384Etj.areEqual(r1, r0)
            X.G0U<com.facebook.aura.agentpermission.pastapprovals.ActivePermission, kotlin.Unit> r0 = r3.$onRevoke
            boolean r1 = r15.A65(r0)
            com.facebook.aura.agentpermission.pastapprovals.ActivePermission r0 = r3.$permission
            boolean r0 = X.AnonymousClass001.A1T(r15, r0, r1)
            X.G0U<com.facebook.aura.agentpermission.pastapprovals.ActivePermission, kotlin.Unit> r2 = r3.$onRevoke
            com.facebook.aura.agentpermission.pastapprovals.ActivePermission r1 = r3.$permission
            java.lang.Object r10 = r15.AaT()
            if (r0 != 0) goto L68
            java.lang.Object r0 = X.C78N.A00
            if (r10 != r0) goto L70
        L68:
            com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsScreenKt$activePermissionSection$4$1$2$1 r10 = new com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsScreenKt$activePermissionSection$4$1$2$1
            r10.<init>(r2, r1)
            r15.Ai0(r10)
        L70:
            kotlin.jvm.functions.Function0 r10 = (kotlin.jvm.functions.Function0) r10
            X.G0U<java.lang.String, kotlin.Unit> r0 = r3.$onMenuRequested
            boolean r1 = r15.A65(r0)
            com.facebook.aura.agentpermission.pastapprovals.ActivePermission r0 = r3.$permission
            boolean r0 = X.AnonymousClass001.A1T(r15, r0, r1)
            X.G0U<java.lang.String, kotlin.Unit> r2 = r3.$onMenuRequested
            com.facebook.aura.agentpermission.pastapprovals.ActivePermission r1 = r3.$permission
            java.lang.Object r11 = r15.AaT()
            if (r0 != 0) goto L8c
            java.lang.Object r0 = X.C78N.A00
            if (r11 != r0) goto L94
        L8c:
            com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsScreenKt$activePermissionSection$4$1$3$1 r11 = new com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsScreenKt$activePermissionSection$4$1$3$1
            r11.<init>(r2, r1)
            r15.Ai0(r11)
        L94:
            kotlin.jvm.functions.Function0 r11 = (kotlin.jvm.functions.Function0) r11
            kotlin.jvm.functions.Function0<kotlin.Unit> r12 = r3.$onDismissMenu
            X.G0V<com.facebook.aura.agentpermission.pastapprovals.ActivePermission, com.facebook.aura.agentpermission.ConnectorPermissionMode, kotlin.Unit> r0 = r3.$onModeSelected
            boolean r1 = r15.A65(r0)
            com.facebook.aura.agentpermission.pastapprovals.ActivePermission r0 = r3.$permission
            boolean r0 = X.AnonymousClass001.A1T(r15, r0, r1)
            X.G0V<com.facebook.aura.agentpermission.pastapprovals.ActivePermission, com.facebook.aura.agentpermission.ConnectorPermissionMode, kotlin.Unit> r2 = r3.$onModeSelected
            com.facebook.aura.agentpermission.pastapprovals.ActivePermission r1 = r3.$permission
            java.lang.Object r13 = r15.AaT()
            if (r0 != 0) goto Lb2
            java.lang.Object r0 = X.C78N.A00
            if (r13 != r0) goto Lba
        Lb2:
            com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsScreenKt$activePermissionSection$4$1$4$1 r13 = new com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsScreenKt$activePermissionSection$4$1$4$1
            r13.<init>(r2, r1)
            r15.Ai0(r13)
        Lba:
            X.G0U r13 = (X.G0U) r13
            int r16 = com.facebook.aura.agentpermission.pastapprovals.ActivePermission.$stable
            r17 = 0
            r18 = 1024(0x400, float:1.435E-42)
            r14 = 0
            com.facebook.aura.agentpermission.pastapprovals.ActivePermissionRowKt.ActivePermissionRow(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        Lc7:
            r5 = 0
            goto L2c
        Lca:
            r15.Afo()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsScreenKt$activePermissionSection$4$1.invoke(X.BFM, int):void");
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
