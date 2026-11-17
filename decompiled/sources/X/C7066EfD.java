package X;

import android.graphics.Bitmap;

/* renamed from: X.EfD, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7066EfD extends AbstractC7067EfE {
    public final void finalize() {
        if (isClosed()) {
            return;
        }
        AbstractC3422CMk.A06("DefaultCloseableStaticBitmap", "finalize: %s %x still open.", BV5.A1a(C3cI.A0Y(this), System.identityHashCode(this)));
        close();
    }

    public C7066EfD(EfF<Bitmap> efF, InterfaceC7034Eeg interfaceC7034Eeg, int i, int i2) {
        super(efF, interfaceC7034Eeg, i, i2);
    }

    public C7066EfD(Bitmap bitmap, InterfaceC3587CVm interfaceC3587CVm, InterfaceC7034Eeg interfaceC7034Eeg) {
        super(bitmap, interfaceC3587CVm, interfaceC7034Eeg);
    }
}
