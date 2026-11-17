package X;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* loaded from: classes5.dex */
public final class CRA extends CRF {
    public static final long A00;
    public static final long A01;
    public static final long A02;
    public static final long A03;
    public static final long A04;
    public static final Unsafe A05;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                PrivilegedExceptionAction privilegedExceptionAction = new PrivilegedExceptionAction() { // from class: X.CRK
                    @Override // java.security.PrivilegedExceptionAction
                    public final Object run() {
                        return CRA.A00();
                    }
                };
                try {
                    unsafe = (Unsafe) Class.forName("java.security.AccessController").getMethod("doPrivileged", PrivilegedExceptionAction.class).invoke(null, privilegedExceptionAction);
                } catch (Exception unused2) {
                    unsafe = (Unsafe) privilegedExceptionAction.run();
                }
            }
            try {
                A01 = unsafe.objectFieldOffset(CR9.class.getDeclaredField("c"));
                A00 = unsafe.objectFieldOffset(CR9.class.getDeclaredField(CRD.__redex_internal_original_name));
                A02 = unsafe.objectFieldOffset(CR9.class.getDeclaredField("a"));
                A03 = unsafe.objectFieldOffset(CRG.class.getDeclaredField("a"));
                A04 = unsafe.objectFieldOffset(CRG.class.getDeclaredField(CRD.__redex_internal_original_name));
                A05 = unsafe;
            } catch (NoSuchFieldException e) {
                throw BV4.A0e(e);
            }
        } catch (Exception e2) {
            throw BV4.A0d("Could not initialize intrinsics", e2);
        }
    }

    public static /* synthetic */ Unsafe A00() throws IllegalAccessException, SecurityException, IllegalArgumentException {
        for (Field field : Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (obj instanceof Unsafe) {
                return (Unsafe) obj;
            }
        }
        throw new NoSuchFieldError("the Unsafe");
    }

    @Override // X.CRF
    public final void A01(CRG crg, CRG crg2) {
        A05.putObject(crg, A04, crg2);
    }

    @Override // X.CRF
    public final void A02(CRG crg, Thread thread) {
        A05.putObject(crg, A03, thread);
    }

    @Override // X.CRF
    public final boolean A03(CRJ crj, CRJ crj2, CR8 cr8) {
        return AbstractC3494CQr.A00(cr8, crj, crj2, A05, A00);
    }

    @Override // X.CRF
    public final boolean A04(CRG crg, CRG crg2, CR9 cr9) {
        return AbstractC3494CQr.A00(cr9, crg, crg2, A05, A01);
    }

    @Override // X.CRF
    public final boolean A05(CR9 cr9, Object obj, Object obj2) {
        return AbstractC3494CQr.A00(cr9, obj, obj2, A05, A02);
    }
}
