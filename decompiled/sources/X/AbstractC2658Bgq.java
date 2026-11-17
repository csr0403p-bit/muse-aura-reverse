package X;

import android.hardware.camera2.CameraCaptureSession;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Bgq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2658Bgq {
    public static void A00(BeX beX, List<CameraCaptureSession.CaptureCallback> list) {
        if (!(beX instanceof BeY)) {
            list.add(beX instanceof C2657Bgp ? ((C2657Bgp) beX).A00 : new C2705Bib(beX));
            return;
        }
        Iterator<BeX> it = ((BeY) beX).A00.iterator();
        while (it.hasNext()) {
            A00(it.next(), list);
        }
    }
}
