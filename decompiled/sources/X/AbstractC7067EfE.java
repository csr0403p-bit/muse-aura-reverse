package X;

import android.graphics.Bitmap;

/* renamed from: X.EfE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7067EfE extends AbstractC7046Ees implements InterfaceC7064EfB {
    public EfF<Bitmap> A00;
    public final int A01;
    public final int A02;
    public final InterfaceC7034Eeg A03;
    public volatile Bitmap A04;

    @Override // X.InterfaceC7064EfB, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        EfF<Bitmap> efF;
        synchronized (this) {
            efF = this.A00;
            this.A00 = null;
            this.A04 = null;
        }
        if (efF != null) {
            efF.close();
        }
    }

    @Override // X.InterfaceC7064EfB
    public final synchronized boolean isClosed() {
        return AnonymousClass002.A1Y(this.A00);
    }

    @Override // X.InterfaceC7064EfB, X.C2eL
    public final int getHeight() {
        int i;
        if (this.A02 % 180 != 0 || (i = this.A01) == 5 || i == 7) {
            Bitmap bitmap = this.A04;
            if (bitmap != null) {
                return bitmap.getWidth();
            }
            return 0;
        }
        Bitmap bitmap2 = this.A04;
        if (bitmap2 != null) {
            return bitmap2.getHeight();
        }
        return 0;
    }

    @Override // X.AbstractC7046Ees, X.InterfaceC7064EfB
    public final InterfaceC7034Eeg getQualityInfo() {
        return this.A03;
    }

    @Override // X.InterfaceC7064EfB
    public final int getSizeInBytes() {
        Bitmap bitmap = this.A04;
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getAllocationByteCount();
    }

    @Override // X.InterfaceC7064EfB, X.C2eL
    public final int getWidth() {
        int i;
        if (this.A02 % 180 != 0 || (i = this.A01) == 5 || i == 7) {
            Bitmap bitmap = this.A04;
            if (bitmap != null) {
                return bitmap.getHeight();
            }
            return 0;
        }
        Bitmap bitmap2 = this.A04;
        if (bitmap2 != null) {
            return bitmap2.getWidth();
        }
        return 0;
    }

    public AbstractC7067EfE(EfF<Bitmap> efF, InterfaceC7034Eeg interfaceC7034Eeg, int i, int i2) {
        EfF<Bitmap> efFA03 = efF.A03();
        efFA03.getClass();
        this.A00 = efFA03;
        this.A04 = BV6.A0M(efFA03);
        this.A03 = interfaceC7034Eeg;
        this.A02 = i;
        this.A01 = i2;
    }

    public AbstractC7067EfE(Bitmap bitmap, InterfaceC3587CVm interfaceC3587CVm, InterfaceC7034Eeg interfaceC7034Eeg) {
        bitmap.getClass();
        this.A04 = bitmap;
        Bitmap bitmap2 = this.A04;
        this.A00 = bitmap2 != null ? new EfF<>(EfF.A04, interfaceC3587CVm, bitmap2) : null;
        this.A03 = interfaceC7034Eeg;
        this.A02 = 0;
        this.A01 = 0;
    }
}
