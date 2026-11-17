package X;

import android.graphics.Bitmap;

/* renamed from: X.EhL, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7150EhL extends AbstractC7065EfC {
    public EhK A00;
    public boolean A01;

    @Override // X.InterfaceC7064EfB, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            EhK ehK = this.A00;
            if (ehK == null) {
                return;
            }
            this.A00 = null;
            synchronized (ehK) {
                EfF<Bitmap> efF = ehK.A00;
                if (efF != null) {
                    efF.close();
                }
                ehK.A00 = null;
            }
        }
    }

    @Override // X.InterfaceC7064EfB, X.C2eL
    public final synchronized int getHeight() {
        EhK ehK;
        ehK = this.A00;
        return ehK == null ? 0 : ehK.A02.getHeight();
    }

    @Override // X.InterfaceC7064EfB
    public final synchronized int getSizeInBytes() {
        EhK ehK;
        ehK = this.A00;
        return ehK == null ? 0 : ehK.A02.getSizeInBytes();
    }

    @Override // X.InterfaceC7064EfB, X.C2eL
    public final synchronized int getWidth() {
        EhK ehK;
        ehK = this.A00;
        return ehK == null ? 0 : ehK.A02.getWidth();
    }

    @Override // X.InterfaceC7064EfB
    public final synchronized boolean isClosed() {
        return AnonymousClass002.A1Y(this.A00);
    }

    @Override // X.AbstractC7046Ees, X.InterfaceC7064EfB
    public final boolean isStateful() {
        return this.A01;
    }

    public C7150EhL(EhK ehK, boolean z) {
        this.A00 = ehK;
        this.A01 = z;
    }
}
