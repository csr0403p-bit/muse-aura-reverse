package X;

import com.facebook.systrace.Systrace;
import com.facebook.systrace.SystraceMessage;

/* loaded from: classes6.dex */
public abstract class HHf {
    public static void A00(String str, String str2, String str3, Boolean bool) {
        HHi hHi;
        HHg hHg;
        boolean zBooleanValue = bool.booleanValue();
        HHk hHk = SystraceMessage.A00;
        if (!Systrace.A09(4L) || (hHg = SystraceMessage.A02.get()) == null) {
            hHi = SystraceMessage.A01;
        } else {
            hHg.A00 = 4L;
            hHg.A02 = hHk;
            hHg.A03 = str;
            HHh hHh = hHg.A01;
            for (int i = 0; i < hHh.A00; i++) {
                hHh.A01[i] = null;
            }
            hHh.A00 = 0;
            hHi = hHg;
        }
        if (!zBooleanValue) {
            hHi.A01(str3, str2);
        } else {
            hHi.A01(str3, str2);
            hHi.A00();
        }
    }
}
