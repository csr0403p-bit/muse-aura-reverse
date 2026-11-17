package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFI;
import X.C0881AGi;
import X.G0U;
import X.G0V;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.commands.core.PermissionChangeNotifier;
import com.facebook.aura.navigation.key.PermissionDestination;
import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class DevicePermissionManageControllerKt$rememberDevicePermissionLauncher$singlePermissionLauncher$1$1 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ Function0<Unit> $onPermissionFlowFinished;
    public final /* synthetic */ G0V<PermissionDestination, Boolean, Unit> $onRuntimePermissionResult;
    public final /* synthetic */ MutableState<PermissionDestination> $pendingRuntimeDestination$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DevicePermissionManageControllerKt$rememberDevicePermissionLauncher$singlePermissionLauncher$1$1(Function0<Unit> function0, MutableState<PermissionDestination> mutableState, Context context, G0V<? super PermissionDestination, ? super Boolean, Unit> g0v) {
        super(1);
        this.$onPermissionFlowFinished = function0;
        this.$pendingRuntimeDestination$delegate = mutableState;
        this.$context = context;
        this.$onRuntimePermissionResult = g0v;
    }

    public final void invoke(boolean z) {
        Collection collectionA0G;
        String[] strArrRuntimePermissionsFor;
        PermissionDestination value = this.$pendingRuntimeDestination$delegate.getValue();
        if (value != null) {
            Context context = this.$context;
            G0V<PermissionDestination, Boolean, Unit> g0v = this.$onRuntimePermissionResult;
            if (z || (strArrRuntimePermissionsFor = DevicePermissionManageControllerKt.runtimePermissionsFor(value)) == null || (collectionA0G = BFI.A0G(strArrRuntimePermissionsFor)) == null) {
                collectionA0G = C0881AGi.A00;
            }
            DevicePermissionManageControllerKt.maybeOpenSettingsIfPermanentlyDenied(context, collectionA0G);
            g0v.invoke(value, Boolean.valueOf(z));
        }
        this.$pendingRuntimeDestination$delegate.Af8(null);
        PermissionChangeNotifier.INSTANCE.notifyChanged();
        this.$onPermissionFlowFinished.invoke();
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }
}
