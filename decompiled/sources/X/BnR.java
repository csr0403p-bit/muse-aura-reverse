package X;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.ImageWriter;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public abstract class BnR implements InterfaceC2888Bnw {
    public ImageWriter A04;
    public InterfaceC2692Bhr A05;
    public C2863BnN A06;
    public ByteBuffer A07;
    public ByteBuffer A08;
    public ByteBuffer A09;
    public ByteBuffer A0A;
    public Executor A0B;
    public volatile int A0F;
    public volatile boolean A0G;
    public volatile boolean A0H;
    public volatile int A0I;
    public volatile int A0E = 1;
    public Rect A02 = new Rect();
    public Rect A03 = new Rect();
    public Matrix A00 = BV4.A08();
    public Matrix A01 = BV4.A08();
    public final Object A0D = C3cG.A0T();
    public boolean A0C = true;

    /* JADX WARN: Removed duplicated region for block: B:106:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x014f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.google.common.util.concurrent.ListenableFuture<java.lang.Void> A00(final X.InterfaceC2873Bng r39) {
        /*
            Method dump skipped, instructions count: 758
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BnR.A00(X.Bng):com.google.common.util.concurrent.ListenableFuture");
    }

    public final void A01() {
        if (this instanceof C2870Bnd) {
            C2870Bnd c2870Bnd = (C2870Bnd) this;
            synchronized (c2870Bnd.A02) {
                InterfaceC2873Bng interfaceC2873Bng = c2870Bnd.A01;
                if (interfaceC2873Bng != null) {
                    interfaceC2873Bng.close();
                    c2870Bnd.A01 = null;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0042 A[Catch: all -> 0x0047, TryCatch #0 {, blocks: (B:6:0x0009, B:8:0x000d, B:10:0x0011, B:12:0x0027, B:14:0x002b, B:15:0x002e, B:16:0x0030, B:18:0x0032, B:19:0x0042), top: B:26:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(X.InterfaceC2873Bng r7) {
        /*
            r6 = this;
            boolean r0 = r6 instanceof X.C2870Bnd
            if (r0 == 0) goto L4a
            X.Bnd r6 = (X.C2870Bnd) r6
            java.lang.Object r5 = r6.A02
            monitor-enter(r5)
            boolean r0 = r6.A0C     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L42
            X.Bnl r0 = r6.A00     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L32
            X.Bnt r0 = r7.AGK()     // Catch: java.lang.Throwable -> L47
            long r3 = r0.getTimestamp()     // Catch: java.lang.Throwable -> L47
            X.Bnl r0 = r6.A00     // Catch: java.lang.Throwable -> L47
            X.Bnt r0 = r0.AGK()     // Catch: java.lang.Throwable -> L47
            long r1 = r0.getTimestamp()     // Catch: java.lang.Throwable -> L47
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L42
            X.Bng r0 = r6.A01     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L2e
            r0.close()     // Catch: java.lang.Throwable -> L47
        L2e:
            r6.A01 = r7     // Catch: java.lang.Throwable -> L47
        L30:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L47
            goto L46
        L32:
            X.Bnl r2 = new X.Bnl     // Catch: java.lang.Throwable -> L47
            r2.<init>(r6, r7)     // Catch: java.lang.Throwable -> L47
            r6.A00 = r2     // Catch: java.lang.Throwable -> L47
            com.google.common.util.concurrent.ListenableFuture r1 = r6.A00(r2)     // Catch: java.lang.Throwable -> L47
            r0 = 3
            X.ExecutorC2446BbZ.A02(r1, r2, r6, r0)     // Catch: java.lang.Throwable -> L47
            goto L30
        L42:
            r7.close()     // Catch: java.lang.Throwable -> L47
            goto L30
        L46:
            return
        L47:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L47
            throw r0
        L4a:
            com.google.common.util.concurrent.ListenableFuture r1 = r6.A00(r7)
            r0 = 2
            X.ExecutorC2446BbZ.A02(r1, r7, r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BnR.A02(X.Bng):void");
    }

    @Override // X.InterfaceC2888Bnw
    public final void ATX(InterfaceC2864BnO interfaceC2864BnO) {
        try {
            InterfaceC2873Bng interfaceC2873BngA30 = this instanceof C2870Bnd ? interfaceC2864BnO.A30() : interfaceC2864BnO.A31();
            if (interfaceC2873BngA30 != null) {
                A02(interfaceC2873BngA30);
            }
        } catch (IllegalStateException e) {
            AbstractC2875Bni.A05("ImageAnalysisAnalyzer", "Failed to acquire image.", e);
        }
    }
}
