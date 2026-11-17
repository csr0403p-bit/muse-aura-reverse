package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public final class EGT {
    public static final byte[] A05 = {-1, -39};
    public final HsC<ByteBuffer> A00;
    public final InterfaceC6522EBw A01;
    public final Eh2 A02;
    public final EGV A03 = new EGV();
    public final G0W<Integer, Integer, BitmapFactory.Options, Integer> A04;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031 A[Catch: Error | RuntimeException -> 0x004d, IllegalArgumentException -> 0x0095, TRY_LEAVE, TryCatch #1 {Error | RuntimeException -> 0x004d, blocks: (B:10:0x0027, B:12:0x0031, B:14:0x0041, B:14:0x0041, B:16:0x0046, B:16:0x0046, B:17:0x004c, B:17:0x004c), top: B:52:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.graphics.Bitmap A00(android.graphics.BitmapFactory.Options r7, android.graphics.ColorSpace r8, X.EGT r9, java.io.InputStream r10) throws java.io.IOException {
        /*
            r3 = 0
            r2 = 1
            int r6 = r7.outWidth
            int r4 = r7.outHeight
            r5 = 0
            X.EGV r1 = r9.A03
            android.graphics.Bitmap$Config r0 = r7.inPreferredConfig
            boolean r0 = r1.A00(r0)
            boolean r0 = X.AnonymousClass002.A1Q(r0, r2)
            if (r0 == 0) goto L58
            r7.inMutable = r3
        L17:
            r4 = r5
        L18:
            r7.inBitmap = r4
            if (r8 != 0) goto L25
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.SRGB
            android.graphics.ColorSpace r8 = android.graphics.ColorSpace.get(r0)
            X.C7384Etj.A0U(r8)
        L25:
            r7.inPreferredColorSpace = r8
            X.HsC<java.nio.ByteBuffer> r3 = r9.A00     // Catch: java.lang.Throwable -> L4d java.lang.IllegalArgumentException -> L95
            java.lang.Object r2 = r3.A2t()     // Catch: java.lang.Throwable -> L4d java.lang.IllegalArgumentException -> L95
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2     // Catch: java.lang.Throwable -> L4d java.lang.IllegalArgumentException -> L95
            if (r2 != 0) goto L37
            r0 = 16384(0x4000, float:2.2959E-41)
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r0)     // Catch: java.lang.Throwable -> L4d java.lang.IllegalArgumentException -> L95
        L37:
            byte[] r0 = r2.array()     // Catch: java.lang.Throwable -> L45
            r7.inTempStorage = r0     // Catch: java.lang.Throwable -> L45
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeStream(r10, r5, r7)     // Catch: java.lang.Throwable -> L45
            r3.AaC(r2)     // Catch: java.lang.Throwable -> L4d java.lang.Throwable -> L4d java.lang.IllegalArgumentException -> L95
            goto L7f
        L45:
            r0 = move-exception
            X.C7384Etj.A0X(r2)     // Catch: java.lang.Throwable -> L4d java.lang.Throwable -> L4d java.lang.IllegalArgumentException -> L95
            r3.AaC(r2)     // Catch: java.lang.Throwable -> L4d java.lang.Throwable -> L4d java.lang.IllegalArgumentException -> L95
            throw r0     // Catch: java.lang.Throwable -> L4d java.lang.Throwable -> L4d java.lang.IllegalArgumentException -> L95
        L4d:
            r1 = move-exception
            if (r4 == 0) goto L7e
            X.EBw r0 = r9.A01
            if (r0 == 0) goto L7e
            r0.Aa9(r4)
            throw r1
        L58:
            X.EBw r3 = r9.A01
            if (r3 == 0) goto L17
            X.G0W<java.lang.Integer, java.lang.Integer, android.graphics.BitmapFactory$Options, java.lang.Integer> r2 = r9.A04
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            X.EGU r2 = (X.EGU) r2
            java.lang.Object r0 = r2.invoke(r1, r0, r7)
            int r0 = X.AnonymousClass001.A0F(r0)
            java.lang.Object r4 = r3.get(r0)
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            if (r4 != 0) goto L18
            java.lang.String r0 = "BitmapPool.get returned null"
            java.lang.NullPointerException r1 = X.BV4.A0a(r0)
        L7e:
            throw r1
        L7f:
            if (r4 == 0) goto L94
            if (r4 == r1) goto L94
            X.EBw r0 = r9.A01
            if (r0 == 0) goto L8a
            r0.Aa9(r4)
        L8a:
            if (r1 == 0) goto L8f
            r1.recycle()
        L8f:
            java.lang.IllegalStateException r1 = X.BV4.A0T()
            throw r1
        L94:
            return r1
        L95:
            r1 = move-exception
            if (r4 == 0) goto L9f
            X.EBw r0 = r9.A01
            if (r0 == 0) goto L9f
            r0.Aa9(r4)
        L9f:
            r10.reset()     // Catch: java.io.IOException -> Laa
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r10)     // Catch: java.io.IOException -> Laa
            if (r0 == 0) goto La9
            return r0
        La9:
            throw r1     // Catch: java.io.IOException -> Laa
        Laa:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EGT.A00(android.graphics.BitmapFactory$Options, android.graphics.ColorSpace, X.EGT, java.io.InputStream):android.graphics.Bitmap");
    }

    public static final BitmapFactory.Options A01(Bitmap.Config config, InputStream inputStream, int i) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = i;
        options.inJustDecodeBounds = true;
        options.inDither = true;
        boolean z = true;
        if (config != Bitmap.Config.HARDWARE) {
            z = false;
            options.inPreferredConfig = config;
        }
        options.inMutable = true;
        if (z) {
            options.inMutable = false;
        }
        if (inputStream != null) {
            BitmapFactory.decodeStream(inputStream, null, options);
            if (options.outWidth == -1 || options.outHeight == -1) {
                throw BV4.A0P();
            }
        }
        if (z) {
            options.inPreferredConfig = config;
        }
        options.inJustDecodeBounds = false;
        return options;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/HsC<Ljava/nio/ByteBuffer;>;LX/Eh2;LX/EBw;LX/G0W<-Ljava/lang/Integer;-Ljava/lang/Integer;-Landroid/graphics/BitmapFactory$Options;Ljava/lang/Integer;>;)V */
    public EGT(HsC hsC, InterfaceC6522EBw interfaceC6522EBw, Eh2 eh2, G0W g0w) {
        this.A00 = hsC;
        this.A02 = eh2;
        this.A01 = interfaceC6522EBw;
        this.A04 = g0w;
    }
}
