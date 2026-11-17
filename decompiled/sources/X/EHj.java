package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes5.dex */
public abstract class EHj {
    public static final C7381Etf A00;
    public static final C7381Etf A01;
    public static final C06977mk A02;
    public static final C06977mk A03;

    public static boolean A00(Context context, String str) throws PackageManager.NameNotFoundException {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 0);
            if (!A01.A02(C06967mj.A00(context, applicationInfo.uid), AbstractC06987ml.A02(context))) {
                if (!A00.A02(C06967mj.A00(context, applicationInfo.uid), AbstractC06987ml.A02(context))) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    static {
        new C7mC("-sYXRdwJA3hvue3mKpYrOZ9zSPC7b4mbgzJmdZEDO5w");
        HashSet hashSetA13 = C60O.A13();
        hashSetA13.add(AbstractC10403HbK.A0l);
        hashSetA13.add(AbstractC10403HbK.A1C);
        hashSetA13.add(AbstractC10403HbK.A1r);
        hashSetA13.add(AbstractC10403HbK.A1U);
        hashSetA13.add(AbstractC10403HbK.A1V);
        hashSetA13.add(AbstractC10403HbK.A2S);
        hashSetA13.add(AbstractC10403HbK.A2p);
        hashSetA13.add(AbstractC10403HbK.A1D);
        hashSetA13.add(AbstractC10403HbK.A22);
        hashSetA13.add(AbstractC10403HbK.A26);
        hashSetA13.add(AbstractC10403HbK.A11);
        hashSetA13.add(AbstractC10403HbK.A1H);
        C7381Etf c7381EtfA02 = C7mB.A02(Collections.unmodifiableSet(hashSetA13));
        A01 = c7381EtfA02;
        HashMap mapA0u = BV4.A0u();
        mapA0u.put(AbstractC10403HbK.A0u, "com.facebook.study");
        mapA0u.put(AbstractC10403HbK.A0B, "com.facebook.viewpoints");
        C7381Etf c7381EtfA01 = C7mB.A01(Collections.unmodifiableMap(mapA0u));
        A00 = c7381EtfA01;
        C7mA c7mA = new C7mA();
        c7mA.A01 = c7381EtfA02;
        A03 = c7mA.A00();
        C7mA c7mA2 = new C7mA();
        c7mA2.A01 = c7381EtfA01;
        A02 = c7mA2.A00();
    }
}
