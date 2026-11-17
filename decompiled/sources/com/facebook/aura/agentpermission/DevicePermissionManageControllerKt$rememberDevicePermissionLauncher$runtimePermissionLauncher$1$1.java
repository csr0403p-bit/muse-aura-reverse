package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass006;
import X.C7384Etj;
import X.G0U;
import X.G0V;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.commands.core.PermissionChangeNotifier;
import com.facebook.aura.navigation.key.PermissionDestination;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class DevicePermissionManageControllerKt$rememberDevicePermissionLauncher$runtimePermissionLauncher$1$1 extends AbstractC7559F3s implements G0U<Map<String, Boolean>, Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ Function0<Unit> $onPermissionFlowFinished;
    public final /* synthetic */ G0V<PermissionDestination, Boolean, Unit> $onRuntimePermissionResult;
    public final /* synthetic */ MutableState<PermissionDestination> $pendingRuntimeDestination$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Map<String, Boolean> map) {
        C7384Etj.A0Y(map, 0);
        PermissionDestination value = this.$pendingRuntimeDestination$delegate.getValue();
        if (value != null) {
            Context context = this.$context;
            G0V<PermissionDestination, Boolean, Unit> g0v = this.$onRuntimePermissionResult;
            boolean zIsDevicePermissionGranted = DevicePermissionStateKt.isDevicePermissionGranted(context, value);
            if (!zIsDevicePermissionGranted) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator itA0n = AnonymousClass002.A0n(map);
                while (itA0n.hasNext()) {
                    Map.Entry entry = (Map.Entry) itA0n.next();
                    if (!AnonymousClass001.A1X(entry.getValue())) {
                        AnonymousClass006.A1R(linkedHashMap, entry);
                    }
                }
                DevicePermissionManageControllerKt.maybeOpenSettingsIfPermanentlyDenied(context, linkedHashMap.keySet());
            }
            g0v.invoke(value, Boolean.valueOf(zIsDevicePermissionGranted));
        }
        this.$pendingRuntimeDestination$delegate.Af8(null);
        PermissionChangeNotifier.INSTANCE.notifyChanged();
        this.$onPermissionFlowFinished.invoke();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DevicePermissionManageControllerKt$rememberDevicePermissionLauncher$runtimePermissionLauncher$1$1(Function0<Unit> function0, MutableState<PermissionDestination> mutableState, Context context, G0V<? super PermissionDestination, ? super Boolean, Unit> g0v) {
        super(1);
        this.$onPermissionFlowFinished = function0;
        this.$pendingRuntimeDestination$delegate = mutableState;
        this.$context = context;
        this.$onRuntimePermissionResult = g0v;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Map<String, Boolean> map) {
        invoke2(map);
        return Unit.INSTANCE;
    }
}
