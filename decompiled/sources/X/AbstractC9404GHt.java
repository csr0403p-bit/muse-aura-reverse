package X;

import java.security.AccessController;
import java.util.logging.Level;
import sun.misc.Unsafe;

/* renamed from: X.GHt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9404GHt {
    public static final AbstractC9408GHx A00;
    public static final Class A01;
    public static final Unsafe A02;
    public static final boolean A03;
    public static final boolean A04;

    public static Unsafe A01() {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new HpM());
        } catch (Throwable unused) {
            unsafe = null;
        }
        if (unsafe == null) {
            return null;
        }
        try {
            unsafe.arrayBaseOffset(byte[].class);
            return unsafe;
        } catch (Exception unused2) {
            BV5.A1B(AbstractC9404GHt.class).log(Level.WARNING, "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
            return null;
        }
    }

    public static Object A00(Class cls) {
        try {
            return A02.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    public static void A02(Class cls) {
        if (A03) {
            A00.A05(cls);
        }
    }

    public static void A03(Class cls) {
        if (A03) {
            A00.A06(cls);
        }
    }

    public static void A04(Throwable th) {
        BV5.A1B(AbstractC9404GHt.class).log(Level.WARNING, FGI.A0M("platform method missing - proto runtime falling back to safer methods: ", String.valueOf(th)));
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A05(java.lang.Class r8) {
        /*
            java.lang.Class<byte[]> r4 = byte[].class
            java.lang.Class<?> r0 = X.GEG.A00
            if (r0 == 0) goto Lb
            boolean r1 = X.GEG.A01
            r0 = 1
            if (r1 == 0) goto Lc
        Lb:
            r0 = 0
        Lc:
            r7 = 0
            if (r0 != 0) goto L10
            return r7
        L10:
            java.lang.Class r3 = X.AbstractC9404GHt.A01     // Catch: java.lang.Throwable -> L64
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
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC9404GHt.A05(java.lang.Class):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
    static {
        /*
            sun.misc.Unsafe r4 = A01()
            X.AbstractC9404GHt.A02 = r4
            java.lang.Class<?> r5 = X.GEG.A00
            X.AbstractC9404GHt.A01 = r5
            java.lang.Class r0 = java.lang.Long.TYPE
            boolean r2 = A05(r0)
            java.lang.Class r0 = java.lang.Integer.TYPE
            boolean r1 = A05(r0)
            r3 = 0
            if (r4 == 0) goto L26
            if (r5 == 0) goto L80
            boolean r0 = X.GEG.A01
            if (r0 != 0) goto L80
            if (r2 == 0) goto L78
            X.GII r3 = new X.GII
            r3.<init>(r4)
        L26:
            X.AbstractC9404GHt.A00 = r3
            if (r3 == 0) goto L2d
            r3.A0F()
        L2d:
            r4 = 0
            if (r3 != 0) goto L73
            r0 = 0
        L31:
            X.AbstractC9404GHt.A03 = r0
            java.lang.Class<byte[]> r0 = byte[].class
            A02(r0)
            java.lang.Class<boolean[]> r0 = boolean[].class
            A02(r0)
            A03(r0)
            java.lang.Class<int[]> r0 = int[].class
            A02(r0)
            A03(r0)
            java.lang.Class<long[]> r0 = long[].class
            A02(r0)
            A03(r0)
            java.lang.Class<float[]> r0 = float[].class
            A02(r0)
            A03(r0)
            java.lang.Class<double[]> r0 = double[].class
            A02(r0)
            A03(r0)
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            A02(r0)
            A03(r0)
            if (r5 == 0) goto L8d
            boolean r0 = X.GEG.A01
            if (r0 != 0) goto L8d
            java.lang.String r1 = "effectiveDirectAddress"
            java.lang.Class<java.nio.Buffer> r0 = java.nio.Buffer.class
            goto L86
        L73:
            boolean r0 = r3.A0E()
            goto L31
        L78:
            if (r1 == 0) goto L26
            X.GIH r3 = new X.GIH
            r3.<init>(r4)
            goto L26
        L80:
            X.GI1 r3 = new X.GI1
            r3.<init>(r4)
            goto L26
        L86:
            java.lang.reflect.Field r2 = r0.getDeclaredField(r1)     // Catch: java.lang.Throwable -> L8d
            if (r2 == 0) goto L8d
            goto L9f
        L8d:
            java.lang.String r1 = "address"
            java.lang.Class<java.nio.Buffer> r0 = java.nio.Buffer.class
            java.lang.reflect.Field r2 = r0.getDeclaredField(r1)     // Catch: java.lang.Throwable -> La4
            if (r2 == 0) goto La4
            java.lang.Class r1 = r2.getType()
            java.lang.Class r0 = java.lang.Long.TYPE
            if (r1 != r0) goto La4
        L9f:
            if (r3 == 0) goto La4
            r3.A0D(r2)
        La4:
            java.nio.ByteOrder r1 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            if (r1 != r0) goto Lad
            r4 = 1
        Lad:
            X.AbstractC9404GHt.A04 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC9404GHt.<clinit>():void");
    }
}
