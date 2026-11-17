package X;

import java.lang.reflect.Field;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import sun.misc.Unsafe;

/* renamed from: X.GHr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9402GHr {
    public static final long A00;
    public static final AbstractC9403GHs A01;
    public static final Unsafe A02 = A03();
    public static final boolean A03;
    public static final boolean A04;
    public static final boolean A05;
    public static final boolean A06;
    public static final Class<?> A07;

    public static int A00(Class<?> clazz) {
        if (A03) {
            return A01.A04(clazz);
        }
        return -1;
    }

    public static <T> T A01(Class<T> cls) {
        try {
            return (T) A02.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0009  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.reflect.Field A02() {
        /*
            java.lang.Class<?> r0 = X.GEB.A00
            if (r0 == 0) goto L9
            boolean r1 = X.GEB.A01
            r0 = 1
            if (r1 == 0) goto La
        L9:
            r0 = 0
        La:
            if (r0 == 0) goto L19
            java.lang.Class<java.nio.Buffer> r1 = java.nio.Buffer.class
            java.lang.String r0 = "effectiveDirectAddress"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r0)     // Catch: java.lang.Throwable -> L15
            goto L16
        L15:
            r2 = 0
        L16:
            if (r2 == 0) goto L19
            return r2
        L19:
            java.lang.Class<java.nio.Buffer> r1 = java.nio.Buffer.class
            java.lang.String r0 = "address"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r0)     // Catch: java.lang.Throwable -> L22
            goto L23
        L22:
            r2 = 0
        L23:
            if (r2 == 0) goto L2e
            java.lang.Class r1 = r2.getType()
            java.lang.Class r0 = java.lang.Long.TYPE
            if (r1 != r0) goto L2e
            return r2
        L2e:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9402GHr.A02():java.lang.reflect.Field");
    }

    public static Unsafe A03() {
        try {
            return (Unsafe) AccessController.doPrivileged(new Hmf());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void A04(Object target, long offset, int value) {
        A01.A0C(target, offset, value);
    }

    public static void A05(Object target, long offset, Object value) {
        A01.A0E(target, offset, value);
    }

    public static void A06(Throwable e) {
        BV5.A1B(C9402GHr.class).log(Level.WARNING, AnonymousClass007.A0a("platform method missing - proto runtime falling back to safer methods: ", e));
    }

    public static void A07(byte[] target, byte index, long value) {
        A01.A09(target, A00 + value, index);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A08(java.lang.Class<?> r8) {
        /*
            java.lang.Class<byte[]> r4 = byte[].class
            java.lang.Class<?> r0 = X.GEB.A00
            if (r0 == 0) goto Lb
            boolean r1 = X.GEB.A01
            r0 = 1
            if (r1 == 0) goto Lc
        Lb:
            r0 = 0
        Lc:
            r7 = 0
            if (r0 != 0) goto L10
            return r7
        L10:
            java.lang.Class<?> r3 = X.C9402GHr.A07     // Catch: java.lang.Throwable -> L64
            java.lang.String r1 = "peekLong"
            java.lang.Class r6 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L64
            r5 = 1
            java.lang.Class[] r0 = new java.lang.Class[]{r8, r6}     // Catch: java.lang.Throwable -> L64
            r3.getMethod(r1, r0)     // Catch: java.lang.Throwable -> L64
            java.lang.String r1 = "pokeLong"
            java.lang.Class r0 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L64
            java.lang.Class[] r0 = new java.lang.Class[]{r8, r0, r6}     // Catch: java.lang.Throwable -> L64
            r3.getMethod(r1, r0)     // Catch: java.lang.Throwable -> L64
            java.lang.String r1 = "pokeInt"
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L64
            java.lang.Class[] r0 = new java.lang.Class[]{r8, r2, r6}     // Catch: java.lang.Throwable -> L64
            r3.getMethod(r1, r0)     // Catch: java.lang.Throwable -> L64
            java.lang.String r1 = "peekInt"
            java.lang.Class[] r0 = new java.lang.Class[]{r8, r6}     // Catch: java.lang.Throwable -> L64
            r3.getMethod(r1, r0)     // Catch: java.lang.Throwable -> L64
            java.lang.String r1 = "pokeByte"
            java.lang.Class r0 = java.lang.Byte.TYPE     // Catch: java.lang.Throwable -> L64
            java.lang.Class[] r0 = new java.lang.Class[]{r8, r0}     // Catch: java.lang.Throwable -> L64
            r3.getMethod(r1, r0)     // Catch: java.lang.Throwable -> L64
            java.lang.String r1 = "peekByte"
            java.lang.Class[] r0 = new java.lang.Class[]{r8}     // Catch: java.lang.Throwable -> L64
            r3.getMethod(r1, r0)     // Catch: java.lang.Throwable -> L64
            java.lang.String r1 = "pokeByteArray"
            java.lang.Class[] r0 = new java.lang.Class[]{r8, r4, r2, r2}     // Catch: java.lang.Throwable -> L64
            r3.getMethod(r1, r0)     // Catch: java.lang.Throwable -> L64
            java.lang.String r1 = "peekByteArray"
            java.lang.Class[] r0 = new java.lang.Class[]{r8, r4, r2, r2}     // Catch: java.lang.Throwable -> L64
            r3.getMethod(r1, r0)     // Catch: java.lang.Throwable -> L64
            return r5
        L64:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9402GHr.A08(java.lang.Class):boolean");
    }

    static {
        Class<?> cls = GEB.A00;
        A07 = cls;
        A05 = A08(Long.TYPE);
        boolean zA08 = A08(Integer.TYPE);
        Unsafe unsafe = A02;
        AbstractC9403GHs c9407GHw = null;
        if (unsafe != null) {
            if (cls == null || GEB.A01) {
                c9407GHw = new C9407GHw(unsafe);
            } else if (A05) {
                c9407GHw = new GIC(unsafe);
            } else if (zA08) {
                c9407GHw = new GIB(unsafe);
            }
        }
        A01 = c9407GHw;
        A04 = c9407GHw == null ? false : c9407GHw.A0I();
        AbstractC9403GHs abstractC9403GHs = A01;
        A03 = abstractC9403GHs == null ? false : abstractC9403GHs.A0H();
        A00 = A00(byte[].class);
        A00(boolean[].class);
        boolean z = A03;
        if (z) {
            abstractC9403GHs.A08(boolean[].class);
        }
        A00(int[].class);
        if (z) {
            abstractC9403GHs.A08(int[].class);
        }
        A00(long[].class);
        if (z) {
            abstractC9403GHs.A08(long[].class);
        }
        A00(float[].class);
        if (z) {
            abstractC9403GHs.A08(float[].class);
        }
        A00(double[].class);
        if (z) {
            abstractC9403GHs.A08(double[].class);
        }
        A00(Object[].class);
        if (z) {
            abstractC9403GHs.A08(Object[].class);
        }
        Field fieldA02 = A02();
        if (fieldA02 != null && abstractC9403GHs != null) {
            abstractC9403GHs.A0G(fieldA02);
        }
        A06 = AnonymousClass002.A1Z(ByteOrder.nativeOrder(), ByteOrder.BIG_ENDIAN);
    }
}
