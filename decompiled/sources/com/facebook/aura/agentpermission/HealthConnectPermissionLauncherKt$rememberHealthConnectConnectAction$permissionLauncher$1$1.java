package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.G0U;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HealthConnectPermissionLauncherKt$rememberHealthConnectConnectAction$permissionLauncher$1$1 extends AbstractC7559F3s implements G0U<Set<? extends String>, Unit> {
    public final /* synthetic */ MutableState<String> $attemptId$delegate;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ Function0<Unit> $onPermissionFlowFinished;
    public final /* synthetic */ MutableState<ArrayList<String>> $requiredSpecialPermissions$delegate;
    public final /* synthetic */ MutableState<Long> $startedAtMs$delegate;

    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke2(java.util.Set<java.lang.String> r9) {
        /*
            r8 = this;
            r0 = 0
            X.C7384Etj.A0Y(r9, r0)
            androidx.compose.runtime.MutableState<java.util.ArrayList<java.lang.String>> r0 = r8.$requiredSpecialPermissions$delegate
            java.lang.Object r0 = r0.getValue()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r6 = 0
            if (r0 == 0) goto L1c
            java.util.Set r0 = X.AbstractC0878AGe.A0g(r0)
            if (r0 == 0) goto L1c
            boolean r0 = com.meta.health.healthconnect.HealthConnectPlugin.A0E(r9, r0)
            r5 = 1
            if (r0 != 0) goto L1d
        L1c:
            r5 = 0
        L1d:
            com.facebook.aura.health.HealthConnectPermissionUtils r4 = com.facebook.aura.health.HealthConnectPermissionUtils.INSTANCE
            r4.setGranted(r5)
            androidx.compose.runtime.MutableState<java.lang.String> r0 = r8.$attemptId$delegate
            java.lang.String r7 = androidx.compose.runtime.MutableState.A05(r0)
            androidx.compose.runtime.MutableState<java.lang.Long> r0 = r8.$startedAtMs$delegate
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            if (r7 == 0) goto L45
            if (r0 == 0) goto L45
            com.facebook.aura.health.HealthConnectorTelemetry r3 = com.facebook.aura.health.HealthConnectorTelemetry.INSTANCE
            java.lang.String r2 = "google_health_connect"
            long r0 = r0.longValue()
            long r0 = r3.millisSince(r0)
            if (r5 == 0) goto L66
            r3.consentGranted(r2, r0, r7)
        L45:
            androidx.compose.runtime.MutableState<java.lang.String> r0 = r8.$attemptId$delegate
            r0.Af8(r6)
            androidx.compose.runtime.MutableState<java.lang.Long> r0 = r8.$startedAtMs$delegate
            r0.Af8(r6)
            androidx.compose.runtime.MutableState<java.util.ArrayList<java.lang.String>> r0 = r8.$requiredSpecialPermissions$delegate
            r0.Af8(r6)
            com.facebook.aura.commands.core.PermissionChangeNotifier r0 = com.facebook.aura.commands.core.PermissionChangeNotifier.INSTANCE
            r0.notifyChanged()
            if (r5 != 0) goto L60
            android.content.Context r0 = r8.$context
            r4.openPermissionSettings(r0)
        L60:
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r8.$onPermissionFlowFinished
            r0.invoke()
            return
        L66:
            r3.consentDenied(r2, r0, r7)
            goto L45
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.HealthConnectPermissionLauncherKt$rememberHealthConnectConnectAction$permissionLauncher$1$1.invoke2(java.util.Set):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HealthConnectPermissionLauncherKt$rememberHealthConnectConnectAction$permissionLauncher$1$1(Context context, Function0<Unit> function0, MutableState<ArrayList<String>> mutableState, MutableState<String> mutableState2, MutableState<Long> mutableState3) {
        super(1);
        this.$context = context;
        this.$onPermissionFlowFinished = function0;
        this.$requiredSpecialPermissions$delegate = mutableState;
        this.$attemptId$delegate = mutableState2;
        this.$startedAtMs$delegate = mutableState3;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Set<? extends String> set) {
        invoke2((Set<String>) set);
        return Unit.INSTANCE;
    }
}
