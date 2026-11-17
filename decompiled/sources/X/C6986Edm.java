package X;

import java.io.Closeable;

/* renamed from: X.Edm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6986Edm implements Closeable {
    public EfF<EC0> A00;
    public final int A01;

    /* JADX WARN: In static synchronized method top region not synchronized by class const: (r1v0 X.Edm) */
    public static final synchronized void A01(C6986Edm c6986Edm) {
        synchronized (c6986Edm) {
            try {
                if (!EfF.A01(c6986Edm.A00)) {
                    throw new RuntimeException() { // from class: com.facebook.common.memory.PooledByteBuffer$ClosedException
                    };
                }
            } catch (Throwable th) {
            }
        }
    }

    public final synchronized byte A02(int i) {
        A01(this);
        CVn.A02(C8j3.A1Q(i));
        CVn.A02(i < this.A01);
        return A00(this).read(i);
    }

    public final synchronized int A03() {
        A01(this);
        return this.A01;
    }

    public final synchronized void A04(int i, byte[] bArr, int i2, int i3) {
        A01(this);
        CVn.A02(BV7.A1S(i + i3, this.A01));
        A00(this).read(i, bArr, i2, i3);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        EfF<EC0> efF = this.A00;
        if (efF != null) {
            efF.close();
        }
        this.A00 = null;
    }

    public static EC0 A00(C6986Edm c6986Edm) {
        c6986Edm.A00.getClass();
        EfF<EC0> efF = c6986Edm.A00;
        C7384Etj.A0X(efF);
        return efF.A04();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C6986Edm(X.EfF<X.EC0> r3, int r4) {
        /*
            r2 = this;
            r2.<init>()
            if (r4 < 0) goto L12
            java.lang.Object r0 = r3.A04()
            X.EC0 r0 = (X.EC0) r0
            int r1 = r0.getSize()
            r0 = 1
            if (r4 <= r1) goto L13
        L12:
            r0 = 0
        L13:
            X.CVn.A02(r0)
            X.EfF r0 = r3.clone()
            r2.A00 = r0
            r2.A01 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6986Edm.<init>(X.EfF, int):void");
    }
}
