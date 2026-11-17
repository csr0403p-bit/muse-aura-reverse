package X;

import java.util.List;
import java.util.Set;

/* renamed from: X.DeA, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5245DeA {
    public static final ThreadLocal<C5247DeC> A00 = new C5262DeR();

    /* JADX WARN: Multi-variable type inference failed */
    public static Object A02(InterfaceC5265DeU interfaceC5265DeU, int i) throws Throwable {
        C5247DeC c5247DeCAAl;
        InterfaceC5265DeU interfaceC5265DeUA00 = A00(interfaceC5265DeU);
        A05(interfaceC5265DeUA00);
        try {
            c5247DeCAAl = interfaceC5265DeUA00.AAl();
        } catch (Throwable th) {
            th = th;
            c5247DeCAAl = null;
        }
        try {
            Object objA00 = C3bH.A00(i, ((AbstractC5252DeH) interfaceC5265DeUA00).A00.AK2(), null);
            A04();
            interfaceC5265DeUA00.ABA(c5247DeCAAl);
            return objA00;
        } catch (Throwable th2) {
            th = th2;
            A04();
            interfaceC5265DeUA00.ABA(c5247DeCAAl);
            throw th;
        }
    }

    public static InterfaceC5265DeU A00(InterfaceC5265DeU interfaceC5265DeU) {
        InterfaceC5265DeU interfaceC5265DeU2;
        if (interfaceC5265DeU != null) {
            return interfaceC5265DeU;
        }
        C5247DeC c5247DeC = A00.get();
        if (c5247DeC != null) {
            List<InterfaceC5259DeO> list = c5247DeC.A00;
            if (!list.isEmpty() && (interfaceC5265DeU2 = (InterfaceC5265DeU) BV5.A0e(list)) != null) {
                return interfaceC5265DeU2;
            }
        }
        return C5249DeE.A00();
    }

    public static void A04() {
        try {
            C5247DeC c5247DeC = A00.get();
            if (c5247DeC != null) {
                c5247DeC.A00();
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public static void A05(InterfaceC5259DeO interfaceC5259DeO) {
        C5247DeC c5247DeC = A00.get();
        if (c5247DeC != null) {
            c5247DeC.A00.add(interfaceC5259DeO.AK0());
        }
    }

    public static <T> T A01(int i) {
        return (T) A02(C5249DeE.A00(), i);
    }

    public static <T> Set<T> A03(int i) {
        return (Set) A02(C5249DeE.A00(), i);
    }
}
