package com.facebook.aura.agentpermission;

import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BFM;
import X.C7384Etj;
import X.C78N;
import X.C7VR;
import X.G0U;
import X.G0V;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.commands.core.PhotoAccessUtils;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.PermissionDestination;
import com.facebook.aura.utils.HatchPermissionUtils;
import java.util.Collection;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class DevicePermissionManageControllerKt {
    public static final String TAG = "DevicePermissionManageController";

    public static final G0U<PermissionDestination, Unit> rememberDevicePermissionManageController(Function0<Unit> function0, G0V<? super PermissionDestination, ? super Boolean, Unit> g0v, BFM bfm, int i, int i2) {
        C7384Etj.A0Y(function0, 0);
        if ((i2 & 2) != 0) {
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = DevicePermissionManageControllerKt$rememberDevicePermissionManageController$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            g0v = (G0V) objAaT;
        }
        Context contextA0H = AnonymousClass002.A0H(bfm);
        AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
        G0U<PermissionDestination, Unit> g0uRememberDevicePermissionLauncher = rememberDevicePermissionLauncher(function0, g0v, bfm, i & 126, 0);
        boolean zA1R = AnonymousClass005.A1R(bfm, contextA0H, auraNavigatorA0b, g0uRememberDevicePermissionLauncher);
        Object objAaT2 = bfm.AaT();
        if (zA1R || objAaT2 == C78N.A00) {
            objAaT2 = new DevicePermissionManageControllerKt$rememberDevicePermissionManageController$2$1(contextA0H, auraNavigatorA0b, g0uRememberDevicePermissionLauncher);
            bfm.Ai0(objAaT2);
        }
        return (G0U) objAaT2;
    }

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
                AnonymousClass002.A17(PermissionDestination.CALL_LOG, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(PermissionDestination.PHONE, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass006.A1G(PermissionDestination.MICROPHONE, iArr);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass006.A1H(PermissionDestination.BLUETOOTH, iArr);
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AnonymousClass006.A1I(PermissionDestination.LOCATION, iArr);
            } catch (NoSuchFieldError unused9) {
            }
            try {
                AnonymousClass006.A1J(PermissionDestination.PHONE_NOTIFICATIONS, iArr);
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

    public static final Activity findActivity(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        C7384Etj.A0U(baseContext);
        return findActivity(baseContext);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.G0U<com.facebook.aura.navigation.key.PermissionDestination, kotlin.Unit> rememberDevicePermissionLauncher(kotlin.jvm.functions.Function0<kotlin.Unit> r16, X.G0V<? super com.facebook.aura.navigation.key.PermissionDestination, ? super java.lang.Boolean, kotlin.Unit> r17, X.BFM r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.DevicePermissionManageControllerKt.rememberDevicePermissionLauncher(kotlin.jvm.functions.Function0, X.G0V, X.BFM, int, int):X.G0U");
    }

    public static final String[] runtimePermissionsFor(PermissionDestination permissionDestination) {
        String[] strArr;
        String str;
        String[] strArr2;
        String str2;
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        switch (permissionDestination.ordinal()) {
            case 0:
                strArr = new String[2];
                strArr[0] = "android.permission.ACCESS_FINE_LOCATION";
                str = "android.permission.ACCESS_COARSE_LOCATION";
                strArr[1] = str;
                return strArr;
            case 1:
                strArr = new String[2];
                strArr[0] = "android.permission.READ_CONTACTS";
                str = "android.permission.WRITE_CONTACTS";
                strArr[1] = str;
                return strArr;
            case 2:
                strArr = new String[2];
                strArr[0] = "android.permission.READ_CALENDAR";
                str = "android.permission.WRITE_CALENDAR";
                strArr[1] = str;
                return strArr;
            case 3:
            case 8:
            case 11:
                return null;
            case 4:
                strArr2 = new String[1];
                str2 = "android.permission.READ_SMS";
                strArr2[0] = str2;
                return strArr2;
            case 5:
                strArr2 = new String[1];
                str2 = "android.permission.READ_CALL_LOG";
                strArr2[0] = str2;
                return strArr2;
            case 6:
                strArr2 = new String[1];
                str2 = "android.permission.CALL_PHONE";
                strArr2[0] = str2;
                return strArr2;
            case 7:
                return PhotoAccessUtils.INSTANCE.requestPermissions();
            case 9:
                strArr2 = new String[1];
                str2 = "android.permission.RECORD_AUDIO";
                strArr2[0] = str2;
                return strArr2;
            case 10:
                strArr = new String[2];
                strArr[0] = "android.permission.BLUETOOTH_CONNECT";
                str = "android.permission.BLUETOOTH_SCAN";
                strArr[1] = str;
                return strArr;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final /* synthetic */ PermissionDestination access$rememberDevicePermissionLauncher$lambda$2(MutableState mutableState) {
        return (PermissionDestination) mutableState.getValue();
    }

    public static final void maybeOpenSettingsIfPermanentlyDenied(Context context, Collection<String> collection) {
        Activity activityFindActivity;
        if (collection.isEmpty() || (activityFindActivity = findActivity(context)) == null || collection.isEmpty()) {
            return;
        }
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            if (!C7VR.A01(activityFindActivity, AnonymousClass005.A0j(it))) {
                HatchPermissionUtils.INSTANCE.openAppSettings(context);
                return;
            }
        }
    }
}
