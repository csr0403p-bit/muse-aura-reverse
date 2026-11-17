package com.facebook.aura.devices.pairing;

import X.AII;
import X.AIM;
import X.AbstractC4103Cmd;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass793;
import X.BFM;
import X.C1er;
import X.C60Q;
import X.C7384Etj;
import X.C78N;
import X.C7OQ;
import X.C7OU;
import X.C7bA;
import X.G0U;
import android.content.Context;
import android.os.Build;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.devices.pairing.logging.HatchDevicePairingAnalytics;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class HatchDeviceBlePermissionEffectKt {
    public static final Function0<Unit> HatchDeviceBlePermissionEffect(boolean z, G0U<? super Boolean, Unit> g0u, BFM bfm, int i, int i2) {
        C7384Etj.A0Y(g0u, 1);
        boolean z2 = true;
        boolean zA1Q = C60Q.A1Q(i2 & 1, z);
        Context contextA0O = AnonymousClass003.A0O(bfm);
        Object objAaT = bfm.AaT();
        Object obj = C78N.A00;
        MutableState mutableState = (MutableState) AnonymousClass005.A0g(bfm, objAaT, obj, false);
        MutableState mutableStateA00 = C1er.A00(bfm, g0u);
        Object objAaT2 = bfm.AaT();
        if (objAaT2 == obj) {
            objAaT2 = Build.VERSION.SDK_INT >= 31 ? new String[]{"android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_CONNECT", "android.permission.ACCESS_FINE_LOCATION"} : new String[]{"android.permission.ACCESS_FINE_LOCATION"};
            bfm.Ai0(objAaT2);
        }
        String[] strArr = (String[]) objAaT2;
        AnonymousClass793 anonymousClass793 = new AnonymousClass793();
        boolean zA1J = AnonymousClass003.A1J(bfm, mutableStateA00, strArr);
        Object objAaT3 = bfm.AaT();
        if (zA1J || objAaT3 == obj) {
            objAaT3 = new HatchDeviceBlePermissionEffectKt$HatchDeviceBlePermissionEffect$blePermissionLauncher$1$1(strArr, mutableStateA00);
            bfm.Ai0(objAaT3);
        }
        C7OU c7ouA00 = C7OQ.A00(anonymousClass793, bfm, (G0U) objAaT3);
        Unit unit = Unit.INSTANCE;
        boolean zA1N = AnonymousClass003.A1N(bfm, contextA0O, mutableStateA00);
        if ((((i & 14) ^ 6) <= 4 || !bfm.A66(zA1Q)) && (i & 6) != 4) {
            z2 = false;
        }
        boolean zA1Y = AnonymousClass005.A1Y(bfm, c7ouA00, strArr, zA1N, z2);
        Object objAaT4 = bfm.AaT();
        if (zA1Y || objAaT4 == obj) {
            objAaT4 = new HatchDeviceBlePermissionEffectKt$HatchDeviceBlePermissionEffect$1$1(contextA0O, zA1Q, c7ouA00, strArr, mutableStateA00, mutableState);
            bfm.Ai0(objAaT4);
        }
        C7bA.A05(bfm, null, unit, (G0U) objAaT4, 6, 2);
        boolean zA1M = AnonymousClass003.A1M(bfm, c7ouA00, strArr);
        Object objAaT5 = bfm.AaT();
        if (zA1M || objAaT5 == obj) {
            objAaT5 = new HatchDeviceBlePermissionEffectKt$HatchDeviceBlePermissionEffect$2$1(c7ouA00, strArr);
            bfm.Ai0(objAaT5);
        }
        return (Function0) objAaT5;
    }

    public static final boolean hasHatchDeviceBlePermissions(Context context) {
        C7384Etj.A0Y(context, 0);
        if (AbstractC4103Cmd.A02(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            return Build.VERSION.SDK_INT < 31 || (AbstractC4103Cmd.A02(context, "android.permission.BLUETOOTH_SCAN") == 0 && AbstractC4103Cmd.A02(context, "android.permission.BLUETOOTH_CONNECT") == 0);
        }
        return false;
    }

    public static final List<String> missingHatchDeviceBlePermissions(Context context) {
        C7384Etj.A0Y(context, 0);
        AII aiiA17 = AIM.A17();
        if (AbstractC4103Cmd.A02(context, "android.permission.ACCESS_FINE_LOCATION") != 0) {
            aiiA17.add("fine_location");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            if (AbstractC4103Cmd.A02(context, "android.permission.BLUETOOTH_SCAN") != 0) {
                aiiA17.add("bluetooth_scan");
            }
            if (AbstractC4103Cmd.A02(context, "android.permission.BLUETOOTH_CONNECT") != 0) {
                aiiA17.add("bluetooth_connect");
            }
        }
        return AIM.A18(aiiA17);
    }

    public static final HatchDevicePairingAnalytics.FailureReason hatchDeviceBlePermissionFailureReason(Context context, List<String> list) {
        AnonymousClass003.A0u(context, list);
        AII aiiA17 = AIM.A17();
        if (Build.VERSION.SDK_INT >= 31) {
            if (list.contains("bluetooth_scan")) {
                aiiA17.add("android.permission.BLUETOOTH_SCAN");
            }
            if (list.contains("bluetooth_connect")) {
                aiiA17.add("android.permission.BLUETOOTH_CONNECT");
            }
        }
        AII aiiA18 = AIM.A18(aiiA17);
        List listSingletonList = aiiA18.isEmpty() ? Collections.singletonList("android.permission.ACCESS_FINE_LOCATION") : aiiA18;
        boolean z = false;
        if (!(listSingletonList instanceof Collection) || !listSingletonList.isEmpty()) {
            Iterator it = listSingletonList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (context.getPackageManager().isPermissionRevokedByPolicy(AnonymousClass005.A0j(it), context.getPackageName())) {
                    z = true;
                    break;
                }
            }
        }
        return !aiiA18.isEmpty() ? z ? HatchDevicePairingAnalytics.FailureReason.BLUETOOTH_RESTRICTED : HatchDevicePairingAnalytics.FailureReason.BLUETOOTH_DENIED : z ? HatchDevicePairingAnalytics.FailureReason.LOCATION_RESTRICTED : HatchDevicePairingAnalytics.FailureReason.LOCATION_DENIED;
    }
}
