package X;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.os.Looper;
import android.util.Range;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class BjF {
    public boolean A00 = false;
    public BlF A01 = new C7605F5s(this, 1);
    public final Bj5 A02;
    public final InterfaceC2741Bji A03;
    public final C2750Bjr A04;
    public final C2934BpC<InterfaceC2779Bkw> A05;
    public final Executor A06;

    public static Range<Float> A00(C2476Bc3 c2476Bc3) {
        try {
            return (Range) c2476Bc3.A02(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
        } catch (AssertionError e) {
            AbstractC2875Bni.A06("ZoomControl", "AssertionError, fail to get camera characteristic.", e);
            return null;
        }
    }

    public static C2773Bkp A01(C2476Bc3 c2476Bc3) {
        InterfaceC2741Bji bjI = (Build.VERSION.SDK_INT < 30 || A00(c2476Bc3) == null) ? new BjI(c2476Bc3) : new BjG(c2476Bc3);
        C2750Bjr c2750Bjr = new C2750Bjr(bjI.AHU(), bjI.AHk());
        c2750Bjr.A00(1.0f);
        return AbstractC2772Bko.A00(c2750Bjr);
    }

    public BjF(Bj5 bj5, C2476Bc3 c2476Bc3, Executor executor) {
        this.A02 = bj5;
        this.A06 = executor;
        InterfaceC2741Bji bjI = (Build.VERSION.SDK_INT < 30 || A00(c2476Bc3) == null) ? new BjI(c2476Bc3) : new BjG(c2476Bc3);
        this.A03 = bjI;
        C2750Bjr c2750Bjr = new C2750Bjr(bjI.AHU(), bjI.AHk());
        this.A04 = c2750Bjr;
        c2750Bjr.A00(1.0f);
        this.A05 = new C2934BpC<>(AbstractC2772Bko.A00(c2750Bjr));
        bj5.A06.A00.add(this.A01);
    }

    public static void A02(BjF bjF, InterfaceC2779Bkw interfaceC2779Bkw) {
        Looper looperMyLooper = Looper.myLooper();
        Looper mainLooper = Looper.getMainLooper();
        C2934BpC<InterfaceC2779Bkw> c2934BpC = bjF.A05;
        if (looperMyLooper == mainLooper) {
            c2934BpC.A0A(interfaceC2779Bkw);
        } else {
            c2934BpC.A09(interfaceC2779Bkw);
        }
    }
}
