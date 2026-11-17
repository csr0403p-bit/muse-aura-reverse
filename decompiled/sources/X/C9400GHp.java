package X;

import java.security.AccessController;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: X.GHp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9400GHp {
    public static final long A00;
    public static final AbstractC9365GGb A01;
    public static final Logger A02 = BV5.A1B(C9400GHp.class);
    public static final Unsafe A03 = A04();
    public static final boolean A04;
    public static final boolean A05;
    public static final boolean A06;
    public static final boolean A07;
    public static final boolean A08;
    public static final Class<?> A09;

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b7  */
    static {
        /*
            Method dump skipped, instructions count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9400GHp.<clinit>():void");
    }

    public static byte A00(byte[] bArr, long j) {
        return A01.A01(bArr, A00 + j);
    }

    public static int A01(Class<?> cls) {
        if (A04) {
            return A01.A04(cls);
        }
        return -1;
    }

    public static <T> T A02(Class<T> cls) {
        try {
            return (T) A03.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0009  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.reflect.Field A03() {
        /*
            java.lang.Class<?> r0 = X.AbstractC9316GDs.A00
            if (r0 == 0) goto L9
            boolean r1 = X.AbstractC9316GDs.A01
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
        throw new UnsupportedOperationException("Method not decompiled: X.C9400GHp.A03():java.lang.reflect.Field");
    }

    public static Unsafe A04() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C10494Hmi());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void A05(Object obj, long j, int i) {
        A01.A0C(obj, j, i);
    }

    public static void A06(Object obj, long j, Object obj2) {
        A01.A0E(obj, j, obj2);
    }

    public static void A07(byte[] bArr, byte b, long j) {
        A01.A09(bArr, A00 + j, b);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A08(java.lang.Class<?> r8) {
        /*
            java.lang.Class<byte[]> r4 = byte[].class
            java.lang.Class<?> r0 = X.AbstractC9316GDs.A00
            if (r0 == 0) goto Lb
            boolean r1 = X.AbstractC9316GDs.A01
            r0 = 1
            if (r1 == 0) goto Lc
        Lb:
            r0 = 0
        Lc:
            r7 = 0
            if (r0 != 0) goto L10
            return r7
        L10:
            java.lang.Class<?> r3 = X.C9400GHp.A09     // Catch: java.lang.Throwable -> L64
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
        throw new UnsupportedOperationException("Method not decompiled: X.C9400GHp.A08(java.lang.Class):boolean");
    }
}
