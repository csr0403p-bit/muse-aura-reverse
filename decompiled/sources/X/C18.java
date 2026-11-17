package X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import com.facebook.aura.conversation.offline.HatchPersistedMessageJson;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
public final class C18 extends CAH<C19> {
    public PowerManager A00;
    public C17 A01;
    public C1A A02;
    public final Context A03;

    @Override // X.DHp
    public final boolean isEnabled(InterfaceC3173C1c interfaceC3173C1c) {
        C7384Etj.A0Y(interfaceC3173C1c, 0);
        return interfaceC3173C1c.isThermalStatsEnabled();
    }

    public static final String A00(int i) {
        switch (i) {
            case 0:
                return HatchPersistedMessageJson.UNSEND_STATUS_NONE;
            case 1:
                return "LIGHT";
            case 2:
                return "MODERATE";
            case 3:
                return "SEVERE";
            case 4:
                return "CRITICAL";
            case 5:
                return "EMERGENCY";
            case 6:
                return "SHUTDOWN";
            default:
                return "UNKNOWN";
        }
    }

    @Override // X.DHp
    public final /* bridge */ /* synthetic */ ListenableFuture decorateEvent(COt cOt, Object obj, Object obj2) {
        C19 c19 = (C19) obj;
        C19 c192 = (C19) obj2;
        C7384Etj.A0Y(cOt, 0);
        if (c19 != null && c192 != null) {
            C1A c1a = this.A02;
            if (c1a == null) {
                c1a = new C1A();
                this.A02 = c1a;
            }
            EtT etTAHg = cOt.AHg();
            C7384Etj.A0X(c1a);
            EtT.A01(etTAHg, c1a.A01, "cpu_vendor");
            EtT etTAHg2 = cOt.AHg();
            C1A c1a2 = this.A02;
            C7384Etj.A0X(c1a2);
            EtT.A01(etTAHg2, c1a2.A00, "cpu_name");
            int i = c19.A00;
            if (i != Integer.MIN_VALUE) {
                EtT.A01(CAH.A01(cOt.AHg(), cOt, "battery_temp", i), Integer.valueOf(c192.A00 - i), "battery_temp_inc");
            }
            int i2 = c19.A01;
            if (i2 != Integer.MIN_VALUE) {
                EtT.A01(CAH.A01(cOt.AHg(), cOt, "cpu_temp", i2), Integer.valueOf(c192.A01 - i2), "cpu_temp_inc");
            }
            int i3 = c19.A02;
            if (i3 != Integer.MIN_VALUE) {
                EtT.A01(CAH.A01(cOt.AHg(), cOt, "gpu_temp", i3), Integer.valueOf(c192.A02 - i3), "gpu_temp_inc");
            }
            EtT.A01(cOt.AHg(), A00(c19.A03), "thermal_status_start");
            EtT.A01(cOt.AHg(), A00(c192.A03), "thermal_status_stop");
        }
        return CPZ.A01;
    }

    @Override // X.DHp
    public final int getProviderTypeId() {
        return 21;
    }

    @Override // X.DHp
    public final Class<C19> getSnapshotType() {
        return C19.class;
    }

    @Override // X.CAH
    public final /* bridge */ /* synthetic */ C19 snapshot() {
        Map<String, Integer> map;
        int iA0H;
        Map<String, Integer> map2;
        int iA0H2;
        Map<String, Integer> map3;
        int iA01;
        Number numberA0b;
        Intent intentRegisterReceiver;
        C19 c19 = new C19();
        if (this.A01 == null) {
            this.A01 = new C17();
        }
        if (this.A00 == null) {
            this.A00 = (PowerManager) this.A03.getSystemService("power");
        }
        C17 c17 = this.A01;
        C7384Etj.A0X(c17);
        Context context = this.A03;
        synchronized (c17) {
            C17.A03(c17);
            map = c17.A00;
        }
        String[] strArr = C17.A02;
        int i = 0;
        while (true) {
            String str = strArr[i];
            if (map.containsKey(str)) {
                iA0H = BV7.A0H(str, map);
                break;
            }
            i++;
            if (i >= 3) {
                iA0H = Integer.MIN_VALUE;
                break;
            }
        }
        if (iA0H == Integer.MIN_VALUE && context != null && (intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"))) != null) {
            iA0H = intentRegisterReceiver.getIntExtra("temperature", Integer.MIN_VALUE);
        }
        c19.A00 = iA0H;
        C17 c172 = this.A01;
        C7384Etj.A0X(c172);
        synchronized (c172) {
            C17.A03(c172);
            map2 = c172.A00;
        }
        String[] strArr2 = C17.A07;
        int i2 = 0;
        while (true) {
            String str2 = strArr2[i2];
            if (!map2.containsKey(str2)) {
                i2++;
                if (i2 >= 3) {
                    break;
                }
            } else {
                iA0H2 = BV7.A0H(str2, map2);
                if (iA0H2 == Integer.MIN_VALUE) {
                    break;
                }
            }
        }
        Iterator itA11 = BV5.A11(map2);
        int i3 = 0;
        int iIntValue = 0;
        while (itA11.hasNext()) {
            String strA0j = AnonymousClass005.A0j(itA11);
            if (strA0j.startsWith("tsens_tz_sensor") && (numberA0b = BV4.A0b(strA0j, map2)) != null) {
                iIntValue += numberA0b.intValue();
                i3++;
            }
        }
        if ((i3 == 0 || (iA0H2 = iIntValue / i3) == Integer.MIN_VALUE) && (iA0H2 = C17.A01(map2, C17.A06)) == Integer.MIN_VALUE && (iA0H2 = C17.A01(map2, C17.A09)) == Integer.MIN_VALUE && (iA0H2 = C17.A01(map2, C17.A05)) == Integer.MIN_VALUE && (iA0H2 = C17.A01(map2, C17.A03)) == Integer.MIN_VALUE && (iA0H2 = C17.A01(map2, C17.A08)) == Integer.MIN_VALUE) {
            iA0H2 = C17.A01(map2, C17.A04);
        }
        c19.A01 = iA0H2;
        C17 c173 = this.A01;
        C7384Etj.A0X(c173);
        synchronized (c173) {
            C17.A03(c173);
            map3 = c173.A00;
        }
        if ((!map3.containsKey("gpu") || (iA01 = BV7.A0H("gpu", map3)) == Integer.MIN_VALUE) && (iA01 = C17.A01(map3, C17.A0B)) == Integer.MIN_VALUE) {
            iA01 = C17.A01(map3, C17.A0A);
        }
        c19.A02 = iA01;
        PowerManager powerManager = this.A00;
        if (powerManager != null) {
            c19.A03 = powerManager.getCurrentThermalStatus();
        }
        return c19;
    }

    public C18(Context context) {
        this.A03 = context;
    }

    @Override // X.DHp
    public final String getProviderName() {
        return "thermal_stats";
    }
}
