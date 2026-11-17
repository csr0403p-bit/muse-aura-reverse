package X;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: X.Bis, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2722Bis {
    public final Executor A05;
    public final Object A01 = C3cG.A0T();
    public final Set<BlJ> A02 = C3cG.A0k();
    public final Set<BlJ> A03 = C3cG.A0k();
    public final Set<BlJ> A04 = C3cG.A0k();
    public final CameraDevice.StateCallback A00 = new C2723Bit(this);

    public final List<BlJ> A00() {
        ArrayList arrayListA0t;
        synchronized (this.A01) {
            arrayListA0t = BV4.A0t(this.A02);
        }
        return arrayListA0t;
    }

    public final List<BlJ> A01() {
        ArrayList arrayListA0h;
        synchronized (this.A01) {
            arrayListA0h = C3cG.A0h();
            arrayListA0h.addAll(A00());
            arrayListA0h.addAll(BV4.A0t(this.A04));
        }
        return arrayListA0h;
    }

    public C2722Bis(Executor executor) {
        this.A05 = executor;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public final void A02(BlJ blJ) {
        BlJ blJ2;
        Iterator it = A01().iterator();
        while (it.hasNext() && (blJ2 = (BlJ) it.next()) != blJ) {
            C2715Bil c2715Bil = (C2715Bil) blJ2;
            C2715Bil.A01(c2715Bil);
            c2715Bil.A0F.A02();
        }
        synchronized (this.A01) {
            this.A04.remove(blJ);
        }
    }
}
