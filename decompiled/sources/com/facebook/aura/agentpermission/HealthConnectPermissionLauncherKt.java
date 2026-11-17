package com.facebook.aura.agentpermission;

import androidx.compose.runtime.MutableState;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public abstract class HealthConnectPermissionLauncherKt {
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.jvm.functions.Function0<kotlin.Unit> rememberHealthConnectConnectAction(kotlin.jvm.functions.Function0<kotlin.Unit> r19, X.BFM r20, int r21) {
        /*
            r2 = 0
            r15 = r19
            X.C7384Etj.A0Y(r15, r2)
            r6 = r20
            android.content.Context r13 = X.AnonymousClass003.A0O(r6)
            java.lang.Object r0 = r6.AaT()
            java.lang.Object r5 = X.C78N.A00
            java.lang.Object r10 = X.AnonymousClass004.A15(r6, r0, r5)
            X.3UX r10 = (X.C3UX) r10
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.Object r0 = r6.AaT()
            if (r0 != r5) goto L25
            com.facebook.aura.agentpermission.HealthConnectPermissionLauncherKt$rememberHealthConnectConnectAction$attemptId$2$1 r0 = com.facebook.aura.agentpermission.HealthConnectPermissionLauncherKt$rememberHealthConnectConnectAction$attemptId$2$1.INSTANCE
            r6.Ai0(r0)
        L25:
            androidx.compose.runtime.MutableState r4 = X.AnonymousClass006.A0K(r6, r0, r1)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.Object r0 = r6.AaT()
            if (r0 != r5) goto L36
            com.facebook.aura.agentpermission.HealthConnectPermissionLauncherKt$rememberHealthConnectConnectAction$startedAtMs$2$1 r0 = com.facebook.aura.agentpermission.HealthConnectPermissionLauncherKt$rememberHealthConnectConnectAction$startedAtMs$2$1.INSTANCE
            r6.Ai0(r0)
        L36:
            androidx.compose.runtime.MutableState r3 = X.AnonymousClass006.A0K(r6, r0, r1)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.Object r0 = r6.AaT()
            if (r0 != r5) goto L47
            com.facebook.aura.agentpermission.HealthConnectPermissionLauncherKt$rememberHealthConnectConnectAction$requiredSpecialPermissions$2$1 r0 = com.facebook.aura.agentpermission.HealthConnectPermissionLauncherKt$rememberHealthConnectConnectAction$requiredSpecialPermissions$2$1.INSTANCE
            r6.Ai0(r0)
        L47:
            androidx.compose.runtime.MutableState r2 = X.AnonymousClass006.A0K(r6, r0, r1)
            X.HpR r7 = new X.HpR
            r7.<init>()
            boolean r12 = X.AnonymousClass003.A1M(r6, r10, r13)
            r0 = r21 & 14
            r9 = r0 ^ 6
            r11 = 1
            r8 = 4
            if (r9 <= r8) goto L62
            boolean r0 = r6.A65(r15)
            if (r0 != 0) goto L67
        L62:
            r1 = r21 & 6
            r0 = 0
            if (r1 != r8) goto L68
        L67:
            r0 = 1
        L68:
            r12 = r12 | r0
            java.lang.Object r0 = r6.AaT()
            if (r12 != 0) goto L71
            if (r0 != r5) goto L79
        L71:
            com.facebook.aura.agentpermission.HealthConnectPermissionLauncherKt$rememberHealthConnectConnectAction$settingsLauncher$1$1 r0 = new com.facebook.aura.agentpermission.HealthConnectPermissionLauncherKt$rememberHealthConnectConnectAction$settingsLauncher$1$1
            r0.<init>(r10, r13, r15)
            r6.Ai0(r0)
        L79:
            X.G0U r0 = (X.G0U) r0
            X.7OU r14 = X.C7OQ.A00(r7, r6, r0)
            java.lang.String r0 = "com.google.android.apps.healthdata"
            X.78z r7 = new X.78z
            r7.<init>(r0)
            boolean r0 = X.AnonymousClass005.A1R(r6, r2, r4, r3)
            boolean r1 = X.AnonymousClass001.A1T(r6, r13, r0)
            if (r9 <= r8) goto L96
            boolean r0 = r6.A65(r15)
            if (r0 != 0) goto L9b
        L96:
            r0 = r21 & 6
            if (r0 == r8) goto L9b
            r11 = 0
        L9b:
            r1 = r1 | r11
            java.lang.Object r0 = r6.AaT()
            if (r1 != 0) goto La4
            if (r0 != r5) goto Lb8
        La4:
            com.facebook.aura.agentpermission.HealthConnectPermissionLauncherKt$rememberHealthConnectConnectAction$permissionLauncher$1$1 r0 = new com.facebook.aura.agentpermission.HealthConnectPermissionLauncherKt$rememberHealthConnectConnectAction$permissionLauncher$1$1
            r16 = r0
            r17 = r13
            r18 = r15
            r19 = r2
            r20 = r4
            r21 = r3
            r16.<init>(r17, r18, r19, r20, r21)
            r6.Ai0(r0)
        Lb8:
            X.G0U r0 = (X.G0U) r0
            X.7OU r1 = X.C7OQ.A00(r7, r6, r0)
            boolean r0 = X.AnonymousClass005.A1R(r6, r13, r14, r1)
            java.lang.Object r12 = r6.AaT()
            if (r0 != 0) goto Lca
            if (r12 != r5) goto Lda
        Lca:
            com.facebook.aura.agentpermission.HealthConnectPermissionLauncherKt$rememberHealthConnectConnectAction$1$1 r12 = new com.facebook.aura.agentpermission.HealthConnectPermissionLauncherKt$rememberHealthConnectConnectAction$1$1
            r19 = r2
            r18 = r3
            r17 = r4
            r16 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r6.Ai0(r12)
        Lda:
            kotlin.jvm.functions.Function0 r12 = (kotlin.jvm.functions.Function0) r12
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.HealthConnectPermissionLauncherKt.rememberHealthConnectConnectAction(kotlin.jvm.functions.Function0, X.BFM, int):kotlin.jvm.functions.Function0");
    }

    public static final /* synthetic */ Long access$rememberHealthConnectConnectAction$lambda$4(MutableState mutableState) {
        return (Long) mutableState.getValue();
    }

    public static final /* synthetic */ ArrayList access$rememberHealthConnectConnectAction$lambda$7(MutableState mutableState) {
        return (ArrayList) mutableState.getValue();
    }
}
