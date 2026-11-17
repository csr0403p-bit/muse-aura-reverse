package X;

import java.util.List;
import kotlin.Deprecated;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class CDH {
    public static CDH A03;
    public static final CDO A04 = new CDO();
    public final CDI A00;
    public final CD1 A01;
    public final List<CDP> A02;

    @Deprecated(message = "")
    public final boolean A03(String str) {
        if (str == null) {
            return true;
        }
        return AnonymousClass001.A1X(A00(str, C6724EXi.A00(45), C6724EXi.A00(46), new EQe(this, 17), new EZ5(4)));
    }

    private final <T> T A00(String str, Function0<? extends T> function0, Function0<? extends T> function02, G0U<? super Integer, ? extends T> g0u, G0V<? super T, ? super T, ? extends T> g0v) {
        int iA00;
        boolean z;
        if (str == null) {
            iA00 = -1;
        } else {
            iA00 = CCn.A00(str);
            if (iA00 < 0) {
                iA00 = -3;
            }
        }
        if (C8j3.A1Q(iA00)) {
            CDI cdi = this.A00;
            synchronized (cdi) {
                z = cdi.A00;
            }
            if (!z) {
                return function02.invoke();
            }
            if (str == null) {
                throw BV4.A0U();
            }
            String strA02 = CDI.A02(cdi, C79.A00, str);
            if (strA02 != null) {
                int iA002 = CD0.A00(strA02);
                if (CD0.A02(iA002)) {
                    String strA022 = CDI.A02(cdi, C79.A01, str);
                    if (strA022 == null) {
                        return g0u.invoke(Integer.valueOf(iA002));
                    }
                    int iA003 = CD0.A00(strA022);
                    if (CD0.A02(iA003)) {
                        return g0v.invoke(g0u.invoke(Integer.valueOf(iA002)), g0u.invoke(Integer.valueOf(iA003)));
                    }
                }
            }
        }
        return function0.invoke();
    }

    public final CD2 A01(String str) {
        return (CD2) A00(str, C6724EXi.A00(41), C6724EXi.A00(42), new EZ8(this.A01, 7), new CD9(this));
    }

    public final boolean A02(String str) {
        return AnonymousClass001.A1X(A00(str, C6724EXi.A00(43), C6724EXi.A00(44), new EZ8(this.A01, 8), new EZ5(3)));
    }

    public CDH() {
        CDI cdi;
        CD1 cd1A00 = CD1.A06.A00();
        this.A01 = cd1A00;
        synchronized (CDI.A07) {
            cdi = CDI.A06;
            if (cdi == null) {
                cdi = new CDI();
                CDI.A06 = cdi;
            }
        }
        this.A00 = cdi;
        this.A02 = C3cG.A0h();
        CDK cdk = new CDK(this);
        synchronized (cd1A00) {
            cd1A00.A02.add(new CDG(cdk));
        }
    }
}
