package X;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class BgX extends BgZ {
    /* JADX WARN: Incorrect types in method signature: (LX/BfN<*>;Landroid/util/Size;)LX/BgX; */
    public static BgX A00(Size size, BfN bfN) {
        if (bfN.Abl(BfN.A06, null) == null) {
            throw BV5.A0U("Implementation is missing option unpacker for ", (String) bfN.Abl(BdG.A01, bfN.toString()));
        }
        BgX bgX = new BgX();
        C2643Bga c2643Bga = (C2643Bga) bfN.Abl(BfN.A03, null);
        InterfaceC2585Beh interfaceC2585Beh = C2584Beg.A01;
        int i = C2643Bga.A00().A02.A00;
        if (c2643Bga != null) {
            C2646Bgd c2646Bgd = c2643Bga.A02;
            i = c2646Bgd.A00;
            Iterator<CameraDevice.StateCallback> it = c2643Bga.A05.iterator();
            while (it.hasNext()) {
                BV7.A1E(it.next(), bgX.A05);
            }
            Iterator<CameraCaptureSession.StateCallback> it2 = c2643Bga.A07.iterator();
            while (it2.hasNext()) {
                BV7.A1E(it2.next(), bgX.A06);
            }
            bgX.A04.A03(c2646Bgd.A04);
            interfaceC2585Beh = c2646Bgd.A02;
        }
        C2645Bgc c2645Bgc = bgX.A04;
        c2645Bgc.A02 = C2582Bee.A01(interfaceC2585Beh);
        if (bfN instanceof C2593Beq) {
            Rational rational = AbstractC2660Bgt.A00;
            if (AbstractC2398BaB.A00.A01(PreviewPixelHDRnetQuirk.class) != null && !AbstractC2660Bgt.A00.equals(BV8.A0Y(size))) {
                BgU bgU = new BgU();
                bgU.A01(CaptureRequest.TONEMAP_MODE, BV4.A0X());
                C2592Beo.A00(bgU, c2645Bgc);
            }
        }
        InterfaceC2585Beh interfaceC2585Beh2 = new BgY(bfN).A00;
        c2645Bgc.A00 = AnonymousClass001.A0F(interfaceC2585Beh2.Abl(BgY.A06, Integer.valueOf(i)));
        BV7.A1E(interfaceC2585Beh2.Abl(BgY.A01, new C2659Bgr()), bgX.A05);
        BV7.A1E(interfaceC2585Beh2.Abl(BgY.A04, new C2710Big()), bgX.A06);
        C2657Bgp c2657Bgp = new C2657Bgp((CameraCaptureSession.CaptureCallback) interfaceC2585Beh2.Abl(BgY.A02, new C2706Bic()));
        BV7.A1E(c2657Bgp, c2645Bgc.A04);
        List<BeX> list = bgX.A07;
        if (!list.contains(c2657Bgp)) {
            list.add(c2657Bgp);
        }
        AbstractC2531BdI<Integer> abstractC2531BdI = BfN.A09;
        int iA00 = InterfaceC2586Bei.A00(abstractC2531BdI, bfN, 0);
        if (iA00 != 0) {
            InterfaceC2583Bef.A00(c2645Bgc, abstractC2531BdI, iA00);
        }
        AbstractC2531BdI<Integer> abstractC2531BdI2 = BfN.A05;
        int iA002 = InterfaceC2586Bei.A00(abstractC2531BdI2, bfN, 0);
        if (iA002 != 0) {
            InterfaceC2583Bef.A00(c2645Bgc, abstractC2531BdI2, iA002);
        }
        C2582Bee c2582BeeA00 = C2582Bee.A00();
        AbstractC2531BdI<String> abstractC2531BdI3 = BgY.A03;
        c2582BeeA00.ANl(abstractC2531BdI3, interfaceC2585Beh2.Abl(abstractC2531BdI3, null));
        AbstractC2531BdI<Long> abstractC2531BdI4 = BgY.A05;
        c2582BeeA00.ANl(abstractC2531BdI4, interfaceC2585Beh2.Abl(abstractC2531BdI4, -1L));
        c2645Bgc.A02(c2582BeeA00);
        c2645Bgc.A02(new C2592Beo(InterfaceC2585Beh.A00(interfaceC2585Beh2)));
        return bgX;
    }

    public final C2643Bga A01() {
        ArrayList arrayListA0t = BV4.A0t(this.A08);
        ArrayList arrayListA0t2 = BV4.A0t(this.A05);
        ArrayList arrayListA0t3 = BV4.A0t(this.A06);
        ArrayList arrayListA0t4 = BV4.A0t(this.A07);
        C2646Bgd c2646BgdA01 = this.A04.A01();
        InterfaceC2641BgM interfaceC2641BgM = this.A02;
        return new C2643Bga(this.A01, c2646BgdA01, interfaceC2641BgM, this.A03, arrayListA0t, arrayListA0t2, arrayListA0t3, arrayListA0t4, this.A00);
    }

    public final void A02(C2507Bcd c2507Bcd, BjC bjC) {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            throw BV4.A0a("Null sharedSurfaces");
        }
        if (c2507Bcd == null) {
            throw BV4.A0a("Null dynamicRange");
        }
        if (!"".isEmpty()) {
            throw BV8.A0l("");
        }
        this.A08.add(new C2649Bgg(c2507Bcd, bjC, list, -1));
    }

    public final void A03(C2507Bcd c2507Bcd, BjC bjC, int i) {
        if (bjC == null) {
            throw BV4.A0a("Null surface");
        }
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            throw BV4.A0a("Null sharedSurfaces");
        }
        if (c2507Bcd == null) {
            throw BV4.A0a("Null dynamicRange");
        }
        Integer numValueOf = Integer.valueOf(i);
        if (!"".isEmpty()) {
            throw BV8.A0l("");
        }
        this.A08.add(new C2649Bgg(c2507Bcd, bjC, list, numValueOf.intValue()));
        this.A04.A07.add(bjC);
    }
}
