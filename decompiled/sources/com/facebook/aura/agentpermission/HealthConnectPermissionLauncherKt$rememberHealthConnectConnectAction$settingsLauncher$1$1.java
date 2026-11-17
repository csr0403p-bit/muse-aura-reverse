package com.facebook.aura.agentpermission;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import androidx.activity.result.ActivityResult;
import com.facebook.aura.commands.core.PermissionChangeNotifier;
import com.facebook.aura.health.HealthConnectPermissionUtils;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HealthConnectPermissionLauncherKt$rememberHealthConnectConnectAction$settingsLauncher$1$1 extends AbstractC7559F3s implements G0U<ActivityResult, Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C3UX $coroutineScope;
    public final /* synthetic */ Function0<Unit> $onPermissionFlowFinished;

    @DebugMetadata(c = "com.facebook.aura.agentpermission.HealthConnectPermissionLauncherKt$rememberHealthConnectConnectAction$settingsLauncher$1$1$1", f = "HealthConnectPermissionLauncher.kt", l = {35}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.agentpermission.HealthConnectPermissionLauncherKt$rememberHealthConnectConnectAction$settingsLauncher$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ Function0<Unit> $onPermissionFlowFinished;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, Function0<Unit> function0, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$context = context;
            this.$onPermissionFlowFinished = function0;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$context, this.$onPermissionFlowFinished, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws Exception {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    HealthConnectPermissionUtils healthConnectPermissionUtils = HealthConnectPermissionUtils.INSTANCE;
                    Context context = this.$context;
                    this.label = 1;
                    if (healthConnectPermissionUtils.refreshGrantedState(context, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
            } catch (Exception e) {
                if (e instanceof CancellationException) {
                    throw e;
                }
            }
            PermissionChangeNotifier.INSTANCE.notifyChanged();
            this.$onPermissionFlowFinished.invoke();
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HealthConnectPermissionLauncherKt$rememberHealthConnectConnectAction$settingsLauncher$1$1(C3UX c3ux, Context context, Function0<Unit> function0) {
        super(1);
        this.$coroutineScope = c3ux;
        this.$context = context;
        this.$onPermissionFlowFinished = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ActivityResult activityResult) {
        AnonymousClass001.A1J(new AnonymousClass1(this.$context, this.$onPermissionFlowFinished, null), this.$coroutineScope);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(ActivityResult activityResult) {
        invoke2(activityResult);
        return Unit.INSTANCE;
    }
}
