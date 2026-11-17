package X;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Bga, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2643Bga {
    public static final List<Integer> A09 = Arrays.asList(BV4.A0W(), 5, BV4.A0Y());
    public InputConfiguration A00;
    public final int A01;
    public final C2646Bgd A02;
    public final InterfaceC2641BgM A03;
    public final BhS A04;
    public final List<CameraDevice.StateCallback> A05;
    public final List<BhS> A06;
    public final List<CameraCaptureSession.StateCallback> A07;
    public final List<BeX> A08;

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/List<LX/BhS;>;Ljava/util/List<Landroid/hardware/camera2/CameraDevice$StateCallback;>;Ljava/util/List<Landroid/hardware/camera2/CameraCaptureSession$StateCallback;>;Ljava/util/List<LX/BeX;>;LX/Bgd;LX/BgM;Landroid/hardware/camera2/params/InputConfiguration;ILX/BhS;)V */
    public C2643Bga(InputConfiguration inputConfiguration, C2646Bgd c2646Bgd, InterfaceC2641BgM interfaceC2641BgM, BhS bhS, List list, List list2, List list3, List list4, int i) {
        this.A06 = list;
        this.A05 = Collections.unmodifiableList(list2);
        this.A07 = Collections.unmodifiableList(list3);
        this.A08 = Collections.unmodifiableList(list4);
        this.A03 = interfaceC2641BgM;
        this.A02 = c2646Bgd;
        this.A00 = inputConfiguration;
        this.A01 = i;
        this.A04 = bhS;
    }

    public static C2643Bga A00() {
        return new C2643Bga(null, new C2645Bgc().A01(), null, null, C3cG.A0h(), C60O.A11(0), C60O.A11(0), C60O.A11(0), 0);
    }

    public final List<BjC> A01() {
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<BhS> it = this.A06.iterator();
        while (it.hasNext()) {
            C2649Bgg c2649Bgg = (C2649Bgg) it.next();
            arrayListA0h.add(c2649Bgg.A03);
            Iterator<BjC> it2 = c2649Bgg.A04.iterator();
            while (it2.hasNext()) {
                BV6.A1S(arrayListA0h, it2);
            }
        }
        return Collections.unmodifiableList(arrayListA0h);
    }
}
