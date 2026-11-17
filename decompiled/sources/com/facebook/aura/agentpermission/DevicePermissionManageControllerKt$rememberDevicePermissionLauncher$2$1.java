package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.C7384Etj;
import X.C7OU;
import X.CFK;
import X.G0U;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import androidx.activity.result.ActivityResult;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.commands.core.PhotoAccessUtils;
import com.facebook.aura.navigation.key.PermissionDestination;
import com.facebook.aura.toast.api.ToastApi;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class DevicePermissionManageControllerKt$rememberDevicePermissionLauncher$2$1 extends AbstractC7559F3s implements G0U<PermissionDestination, Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ Function0<Unit> $healthConnectConnect;
    public final /* synthetic */ Function0<Unit> $onPermissionFlowFinished;
    public final /* synthetic */ MutableState<PermissionDestination> $pendingRuntimeDestination$delegate;
    public final /* synthetic */ C7OU<String[], Map<String, Boolean>> $runtimePermissionLauncher;
    public final /* synthetic */ C7OU<Intent, ActivityResult> $settingsLauncher;
    public final /* synthetic */ C7OU<String, Boolean> $singlePermissionLauncher;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PermissionDestination.values().length];
            try {
                AnonymousClass002.A13(PermissionDestination.CALENDAR, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(PermissionDestination.CONTACTS, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(PermissionDestination.MESSAGES, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(PermissionDestination.PHOTOS, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(PermissionDestination.PHONE_NOTIFICATIONS, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(PermissionDestination.CALL_LOG, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass006.A1G(PermissionDestination.PHONE, iArr);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass006.A1H(PermissionDestination.MICROPHONE, iArr);
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AnonymousClass006.A1I(PermissionDestination.BLUETOOTH, iArr);
            } catch (NoSuchFieldError unused9) {
            }
            try {
                AnonymousClass006.A1J(PermissionDestination.LOCATION, iArr);
            } catch (NoSuchFieldError unused10) {
            }
            try {
                AnonymousClass006.A1K(PermissionDestination.HEALTH, iArr);
            } catch (NoSuchFieldError unused11) {
            }
            try {
                AnonymousClass006.A1L(PermissionDestination.RUN_IN_BACKGROUND, iArr);
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DevicePermissionManageControllerKt$rememberDevicePermissionLauncher$2$1(Context context, Function0<Unit> function0, C7OU<String[], Map<String, Boolean>> c7ou, C7OU<String, Boolean> c7ou2, C7OU<Intent, ActivityResult> c7ou3, Function0<Unit> function02, MutableState<PermissionDestination> mutableState) {
        super(1);
        this.$context = context;
        this.$onPermissionFlowFinished = function0;
        this.$runtimePermissionLauncher = c7ou;
        this.$singlePermissionLauncher = c7ou2;
        this.$settingsLauncher = c7ou3;
        this.$healthConnectConnect = function02;
        this.$pendingRuntimeDestination$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PermissionDestination permissionDestination) {
        C7OU<String[], Map<String, Boolean>> c7ou;
        String[] strArr;
        C7384Etj.A0Y(permissionDestination, 0);
        try {
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            switch (permissionDestination.ordinal()) {
                case 0:
                    if (!DevicePermissionStateKt.isDevicePermissionGranted(this.$context, permissionDestination)) {
                        this.$pendingRuntimeDestination$delegate.Af8(permissionDestination);
                        c7ou = this.$runtimePermissionLauncher;
                        strArr = new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};
                        break;
                    } else {
                        AnonymousClass007.A17(this);
                        return;
                    }
                case 1:
                    if (!DevicePermissionStateKt.isDevicePermissionGranted(this.$context, permissionDestination)) {
                        this.$pendingRuntimeDestination$delegate.Af8(permissionDestination);
                        c7ou = this.$runtimePermissionLauncher;
                        strArr = new String[]{"android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS"};
                        break;
                    } else {
                        AnonymousClass007.A17(this);
                        return;
                    }
                case 2:
                    if (!DevicePermissionStateKt.isDevicePermissionGranted(this.$context, permissionDestination)) {
                        this.$pendingRuntimeDestination$delegate.Af8(permissionDestination);
                        c7ou = this.$runtimePermissionLauncher;
                        strArr = new String[]{"android.permission.READ_CALENDAR", "android.permission.WRITE_CALENDAR"};
                        break;
                    } else {
                        AnonymousClass007.A17(this);
                        return;
                    }
                case 3:
                    this.$healthConnectConnect.invoke();
                    return;
                case 4:
                    if (DevicePermissionStateKt.isDevicePermissionGranted(this.$context, permissionDestination)) {
                        AnonymousClass007.A17(this);
                        return;
                    } else {
                        this.$pendingRuntimeDestination$delegate.Af8(permissionDestination);
                        A02("android.permission.READ_SMS");
                        return;
                    }
                case 5:
                    if (DevicePermissionStateKt.isDevicePermissionGranted(this.$context, permissionDestination)) {
                        AnonymousClass007.A17(this);
                        return;
                    } else {
                        this.$pendingRuntimeDestination$delegate.Af8(permissionDestination);
                        A02("android.permission.READ_CALL_LOG");
                        return;
                    }
                case 6:
                    if (DevicePermissionStateKt.isDevicePermissionGranted(this.$context, permissionDestination)) {
                        AnonymousClass007.A17(this);
                        return;
                    } else {
                        this.$pendingRuntimeDestination$delegate.Af8(permissionDestination);
                        A02("android.permission.CALL_PHONE");
                        return;
                    }
                case 7:
                    PhotoAccessUtils photoAccessUtils = PhotoAccessUtils.INSTANCE;
                    if (photoAccessUtils.isFullLibraryGranted(this.$context)) {
                        AnonymousClass007.A17(this);
                        return;
                    } else {
                        this.$pendingRuntimeDestination$delegate.Af8(permissionDestination);
                        A02(photoAccessUtils.requestPermissions());
                        return;
                    }
                case 8:
                    A02(new Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS"));
                    return;
                case 9:
                    if (DevicePermissionStateKt.isDevicePermissionGranted(this.$context, permissionDestination)) {
                        AnonymousClass007.A17(this);
                        return;
                    } else {
                        this.$pendingRuntimeDestination$delegate.Af8(permissionDestination);
                        A02("android.permission.RECORD_AUDIO");
                        return;
                    }
                case 10:
                    if (!DevicePermissionStateKt.isDevicePermissionGranted(this.$context, permissionDestination)) {
                        this.$pendingRuntimeDestination$delegate.Af8(permissionDestination);
                        c7ou = this.$runtimePermissionLauncher;
                        strArr = new String[]{"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_SCAN"};
                        break;
                    } else {
                        AnonymousClass007.A17(this);
                        return;
                    }
                case 11:
                    return;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            c7ou.A02(strArr);
        } catch (IllegalStateException e) {
            StringBuilder sb = new StringBuilder("permission launcher unregistered for ");
            sb.append(permissionDestination);
            CFK.A0A(DevicePermissionManageControllerKt.TAG, AnonymousClass001.A0v("; opening app settings", sb), e);
            this.$pendingRuntimeDestination$delegate.Af8(null);
            AnonymousClass007.A17(this);
        } catch (NullPointerException e2) {
            if (!(e2.getCause() instanceof RemoteException)) {
                throw e2;
            }
            CFK.A0A(DevicePermissionManageControllerKt.TAG, AnonymousClass007.A0a("system failed to launch permission flow for ", permissionDestination), e2);
            this.$pendingRuntimeDestination$delegate.Af8(null);
            ToastApi.INSTANCE.showToast(R.string._name_removed__res_0x7f120b19);
            this.$onPermissionFlowFinished.invoke();
        }
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(PermissionDestination permissionDestination) {
        invoke2(permissionDestination);
        return Unit.INSTANCE;
    }
}
