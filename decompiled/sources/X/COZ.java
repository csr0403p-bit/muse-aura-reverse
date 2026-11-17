package X;

import android.os.Build;
import com.facebook.aura.commands.sms.DeviceSmsReaderKt;
import com.facebook.systrace.TraceDirect;
import java.lang.reflect.Method;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class COZ {
    public static final String A00 = "TraceConfig";
    public static C3454COa A01 = new C3454COa();
    public static volatile long A02;

    static {
        A01(false);
        if (Build.VERSION.SDK_INT < 30) {
            CFK.A05(A00, "Registering systrace sysprop listener");
            RunnableC3456COc runnableC3456COc = new RunnableC3456COc();
            if (AbstractC3459COf.A06) {
                AbstractC3459COf.A01(AbstractC3459COf.A00, runnableC3456COc);
            }
        }
    }

    public static void A00(InterfaceC3458COe interfaceC3458COe) {
        C3454COa c3454COa = A01;
        synchronized (c3454COa.A01) {
            c3454COa.A02.add(interfaceC3458COe);
            if (c3454COa.A00) {
                interfaceC3458COe.AWa();
            }
        }
    }

    public static void A01(boolean z) {
        long j = A02;
        boolean zA00 = Build.VERSION.SDK_INT >= 30 ? AbstractC3457COd.A00() : A02();
        long jA00 = AbstractC3459COf.A00("debug.fbsystrace.tags");
        long j2 = (!zA00 || jA00 == 0) ? 0L : jA00 | 1;
        boolean z2 = (A02 == 0 && j2 != 0) || (j2 == 0 && A02 != 0);
        A02 = j2;
        CFK.A05(A00, String.format("Systrace trace config update - source:%s changed:%b enabledTags:0x%x->0x%x", z ? "sysprop" : DeviceSmsReaderKt.ATTACHMENT_OTHER, Boolean.valueOf(z2), Long.valueOf(j), Long.valueOf(A02)));
        if (z2) {
            if (TraceDirect.checkNative()) {
                TraceDirect.nativeSetEnabledTags(j2);
            }
            boolean z3 = z;
            C3454COa c3454COa = A01;
            if (j2 <= 0) {
                synchronized (c3454COa.A01) {
                    c3454COa.A00 = false;
                    int i = 0;
                    while (true) {
                        List<InterfaceC3458COe> list = c3454COa.A02;
                        if (i < list.size()) {
                            list.get(i).AWb();
                            i++;
                        }
                    }
                }
                return;
            }
            if (!z3) {
                c3454COa.A00();
                return;
            }
            synchronized (c3454COa.A01) {
                C3454COa.A03.lastModified();
                Thread thread = new Thread(new RunnableC3455COb(c3454COa), "fbsystrace notification thread");
                thread.setPriority(10);
                thread.start();
            }
        }
    }

    public static boolean A02() {
        long j = AbstractC3190C2o.A00;
        if (!AbstractC3190C2o.A03) {
            return false;
        }
        Method method = AbstractC3190C2o.A01;
        C1H.A00(method);
        Boolean bool = (Boolean) AbstractC3190C2o.A00(method, BV4.A1X(j));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
