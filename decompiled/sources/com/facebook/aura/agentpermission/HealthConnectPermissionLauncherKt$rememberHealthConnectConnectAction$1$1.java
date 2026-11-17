package com.facebook.aura.agentpermission;

import X.AbstractC7535F0i;
import X.AbstractC7559F3s;
import X.C3cG;
import X.C3cI;
import X.C7384Etj;
import X.C7OU;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.health.HealthConnectConnectAction;
import com.facebook.aura.health.HealthConnectPermissionUtils;
import com.facebook.aura.health.HealthConnectorTelemetry;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HealthConnectPermissionLauncherKt$rememberHealthConnectConnectAction$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<String> $attemptId$delegate;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ Function0<Unit> $onPermissionFlowFinished;
    public final /* synthetic */ C7OU<Set<String>, Set<String>> $permissionLauncher;
    public final /* synthetic */ MutableState<ArrayList<String>> $requiredSpecialPermissions$delegate;
    public final /* synthetic */ C7OU<Intent, ActivityResult> $settingsLauncher;
    public final /* synthetic */ MutableState<Long> $startedAtMs$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HealthConnectPermissionLauncherKt$rememberHealthConnectConnectAction$1$1(Context context, C7OU<Intent, ActivityResult> c7ou, Function0<Unit> function0, C7OU<Set<String>, Set<String>> c7ou2, MutableState<String> mutableState, MutableState<Long> mutableState2, MutableState<ArrayList<String>> mutableState3) {
        super(0);
        this.$context = context;
        this.$settingsLauncher = c7ou;
        this.$onPermissionFlowFinished = function0;
        this.$permissionLauncher = c7ou2;
        this.$attemptId$delegate = mutableState;
        this.$startedAtMs$delegate = mutableState2;
        this.$requiredSpecialPermissions$delegate = mutableState3;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HealthConnectPermissionUtils healthConnectPermissionUtils = HealthConnectPermissionUtils.INSTANCE;
        HealthConnectConnectAction healthConnectConnectActionConnectAction = healthConnectPermissionUtils.connectAction(this.$context, HealthConnectPermissionUtils.granted.get());
        if (C7384Etj.areEqual(healthConnectConnectActionConnectAction, HealthConnectConnectAction.OpenSettings.INSTANCE)) {
            try {
                A01(null, healthConnectPermissionUtils.settingsIntent());
                return;
            } catch (ActivityNotFoundException unused) {
                this.$onPermissionFlowFinished.invoke();
                return;
            }
        }
        if (healthConnectConnectActionConnectAction instanceof HealthConnectConnectAction.RequestPermissions) {
            String string = AbstractC7535F0i.A00().toString();
            this.$attemptId$delegate.Af8(string);
            MutableState<Long> mutableState = this.$startedAtMs$delegate;
            HealthConnectorTelemetry healthConnectorTelemetry = HealthConnectorTelemetry.INSTANCE;
            mutableState.Af8(C3cI.A0O());
            this.$requiredSpecialPermissions$delegate.Af8(new ArrayList<>(((HealthConnectConnectAction.RequestPermissions) healthConnectConnectActionConnectAction).requiredSpecialPermissions));
            healthConnectorTelemetry.connectionInitiated("google_health_connect", "settings", true, string);
            healthConnectorTelemetry.consentShown("google_health_connect", string);
            try {
                A01(null, healthConnectPermissionUtils.requiredPermissions());
                return;
            } catch (Exception unused2) {
                this.$attemptId$delegate.Af8(null);
                this.$startedAtMs$delegate.Af8(null);
                this.$requiredSpecialPermissions$delegate.Af8(null);
            }
        } else {
            if (!C7384Etj.areEqual(healthConnectConnectActionConnectAction, HealthConnectConnectAction.InstallProvider.INSTANCE)) {
                throw C3cG.A0q();
            }
            healthConnectPermissionUtils.openProviderInstall(this.$context);
        }
        this.$onPermissionFlowFinished.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
