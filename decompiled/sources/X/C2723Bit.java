package X;

import android.hardware.camera2.CameraDevice;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: X.Bit, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2723Bit extends CameraDevice.StateCallback {
    public final /* synthetic */ C2722Bis A00;

    public C2723Bit(C2722Bis c2722Bis) {
        this.A00 = c2722Bis;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.AbstractCollection, java.util.ArrayList] */
    private void A00() {
        ?? A01;
        C2722Bis c2722Bis = this.A00;
        synchronized (c2722Bis.A01) {
            A01 = c2722Bis.A01();
            c2722Bis.A04.clear();
            c2722Bis.A02.clear();
            c2722Bis.A03.clear();
        }
        Iterator it = A01.iterator();
        while (it.hasNext()) {
            C2715Bil c2715Bil = (C2715Bil) ((BlJ) it.next());
            C2715Bil.A01(c2715Bil);
            c2715Bil.A0F.A02();
        }
    }

    private void A01() {
        final LinkedHashSet linkedHashSetA0k = C3cG.A0k();
        C2722Bis c2722Bis = this.A00;
        synchronized (c2722Bis.A01) {
            linkedHashSetA0k.addAll(c2722Bis.A04);
            linkedHashSetA0k.addAll(c2722Bis.A02);
        }
        c2722Bis.A05.execute(new Runnable() { // from class: X.Bjm
            public static final String __redex_internal_original_name = "CaptureSessionRepository$1$$ExternalSyntheticLambda0";

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = linkedHashSetA0k.iterator();
                while (it.hasNext()) {
                    BlJ blJ = (BlJ) it.next();
                    ((AbstractC2756Bjx) blJ).A06(blJ);
                }
            }
        });
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        A01();
        A00();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        A01();
        A00();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, final int i) {
        A01();
        final LinkedHashSet linkedHashSetA0k = C3cG.A0k();
        C2722Bis c2722Bis = this.A00;
        synchronized (c2722Bis.A01) {
            linkedHashSetA0k.addAll(c2722Bis.A04);
            linkedHashSetA0k.addAll(c2722Bis.A02);
        }
        c2722Bis.A05.execute(new Runnable() { // from class: X.Biz
            public static final String __redex_internal_original_name = "CaptureSessionRepository$1$$ExternalSyntheticLambda1";

            @Override // java.lang.Runnable
            public final void run() {
                LinkedHashSet linkedHashSet = linkedHashSetA0k;
                int i2 = i;
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    C2715Bil c2715Bil = (C2715Bil) ((BlJ) it.next());
                    if (i2 == 5) {
                        synchronized (c2715Bil.A0I) {
                            if (c2715Bil.A0C() && c2715Bil.A06 != null) {
                                C2715Bil.A02(c2715Bil, "Close DeferrableSurfaces for CameraDevice error.");
                                Iterator<BjC> it2 = c2715Bil.A06.iterator();
                                while (it2.hasNext()) {
                                    it2.next().A02();
                                }
                            }
                        }
                    }
                }
            }
        });
        A00();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
    }
}
