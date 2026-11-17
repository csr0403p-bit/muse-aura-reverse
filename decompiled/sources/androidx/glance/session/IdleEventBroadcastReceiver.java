package androidx.glance.session;

import X.AbstractC0878AGe;
import X.AnonymousClass005;
import X.BV3;
import X.C7384Etj;
import X.C78C;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class IdleEventBroadcastReceiver extends BroadcastReceiver {
    public static final IntentFilter A01;
    public static final List<String> A02;
    public final Function0<Unit> A00;

    static {
        List<String> listAsList = Arrays.asList("android.os.action.DEVICE_IDLE_MODE_CHANGED", "android.os.action.LIGHT_DEVICE_IDLE_MODE_CHANGED", "android.os.action.LOW_POWER_STANDBY_ENABLED_CHANGED");
        A02 = listAsList;
        IntentFilter intentFilter = new IntentFilter();
        Iterator<String> it = listAsList.iterator();
        while (it.hasNext()) {
            intentFilter.addAction(AnonymousClass005.A0j(it));
        }
        A01 = intentFilter;
    }

    public final void A00(Context context) {
        Object systemService = context.getSystemService("power");
        C7384Etj.A0Z(systemService, BV3.A00(73));
        PowerManager powerManager = (PowerManager) systemService;
        boolean zIsDeviceIdleMode = powerManager.isDeviceIdleMode();
        if (Build.VERSION.SDK_INT >= 33) {
            if (!zIsDeviceIdleMode && !C78C.A00(powerManager)) {
                return;
            }
        } else if (!zIsDeviceIdleMode) {
            return;
        }
        this.A00.invoke();
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (AbstractC0878AGe.A0k(A02, intent.getAction())) {
            A00(context);
        }
    }

    public IdleEventBroadcastReceiver(Function0<Unit> function0) {
        this.A00 = function0;
    }
}
