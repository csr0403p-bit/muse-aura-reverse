package X;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Pair;
import android.util.Size;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: X.BdJ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2532BdJ implements InterfaceC2544BdV {
    public Bj5 A00;
    public final C2955Bpt<Bm1> A03;
    public final C2476Bc3 A04;
    public final C2533BdK A05;
    public final C2511Bch A06;
    public final String A08;
    public final C2538BdP A09;
    public final InterfaceC2420Baw A0A;
    public final Object A07 = C3cG.A0T();
    public C2955Bpt<InterfaceC2779Bkw> A01 = null;
    public List<Pair<BeX, Executor>> A02 = null;

    @Override // X.InterfaceC2544BdV
    public final /* synthetic */ InterfaceC2544BdV AGM() {
        return this;
    }

    @Override // X.InterfaceC2546BdX
    public final int AKN() {
        return AKO(0);
    }

    @Override // X.InterfaceC2544BdV
    public final void A3w(BeX beX, Executor executor) {
        synchronized (this.A07) {
            Bj5 bj5 = this.A00;
            if (bj5 == null) {
                List listA0h = this.A02;
                if (listA0h == null) {
                    listA0h = C3cG.A0h();
                    this.A02 = listA0h;
                }
                listA0h.add(BV4.A0A(beX, executor));
            } else {
                bj5.A0I.execute(new RunnableC2554Bdf(bj5, beX, executor));
            }
        }
    }

    @Override // X.InterfaceC2544BdV
    public final String ADH() {
        return this.A08;
    }

    @Override // X.InterfaceC2544BdV
    public final C2511Bch ADK() {
        return this.A06;
    }

    @Override // X.InterfaceC2544BdV
    public final InterfaceC2420Baw AF7() {
        return this.A0A;
    }

    @Override // X.InterfaceC2546BdX
    public final String AGN() {
        return BV7.A0C(this.A04.A02(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)) == 2 ? "androidx.camera.camera2.legacy" : "androidx.camera.camera2";
    }

    @Override // X.InterfaceC2546BdX
    public final int AH3() {
        Number number = (Number) this.A04.A02(CameraCharacteristics.LENS_FACING);
        BeS.A06(AnonymousClass002.A1X(number), "Unable to get the lens facing of the camera.");
        int iIntValue = number.intValue();
        int i = 0;
        if (iIntValue != 0) {
            i = 1;
            if (iIntValue != 1) {
                i = 2;
                if (iIntValue != 2) {
                    throw BV5.A0S("The given lens facing integer: ", " can not be recognized.", iIntValue);
                }
            }
        }
        return i;
    }

    @Override // X.InterfaceC2546BdX
    public final int AKO(int i) {
        return AbstractC2467Bbu.A01(AbstractC2467Bbu.A00(i), BV7.A0C(this.A04.A02(CameraCharacteristics.SENSOR_ORIENTATION)), 1 == AH3());
    }

    @Override // X.InterfaceC2544BdV
    public final Set<C2507Bcd> ALL() {
        return C2503BcZ.A01(this.A04).A00.ALL();
    }

    @Override // X.InterfaceC2544BdV
    public final List<Size> ALO(int i) throws CloneNotSupportedException {
        Size[] sizeArrA01 = this.A04.A01().A01(i);
        return sizeArrA01 != null ? Arrays.asList(sizeArrA01) : Collections.EMPTY_LIST;
    }

    @Override // X.InterfaceC2544BdV
    public final List<Size> ALQ(int i) throws CloneNotSupportedException {
        Size[] sizeArrA02 = this.A04.A01().A02(i);
        return sizeArrA02 != null ? Arrays.asList(sizeArrA02) : Collections.EMPTY_LIST;
    }

    @Override // X.InterfaceC2544BdV
    public final BWz ALg() {
        return BV7.A0C(this.A04.A02(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE)) != 1 ? BWz.UPTIME : BWz.REALTIME;
    }

    @Override // X.InterfaceC2546BdX
    public final AbstractC5306Dfp<InterfaceC2779Bkw> AMz() {
        AbstractC5306Dfp abstractC5306Dfp;
        synchronized (this.A07) {
            Bj5 bj5 = this.A00;
            AbstractC5306Dfp abstractC5306Dfp2 = this.A01;
            abstractC5306Dfp = abstractC5306Dfp2;
            abstractC5306Dfp = abstractC5306Dfp2;
            if (bj5 == null) {
                if (abstractC5306Dfp2 == null) {
                    C2955Bpt<InterfaceC2779Bkw> c2955Bpt = new C2955Bpt<>(BjF.A01(this.A04));
                    this.A01 = c2955Bpt;
                    abstractC5306Dfp = c2955Bpt;
                }
            } else if (abstractC5306Dfp2 == null) {
                abstractC5306Dfp = bj5.A0C.A05;
            }
        }
        return abstractC5306Dfp;
    }

    @Override // X.InterfaceC2544BdV
    public final boolean APH() {
        int[] iArr = (int[]) this.A04.A02(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
        if (iArr != null) {
            for (int i : iArr) {
                if (i == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X.InterfaceC2544BdV
    public final void Aaw(final BeX beX) {
        synchronized (this.A07) {
            final Bj5 bj5 = this.A00;
            if (bj5 == null) {
                List<Pair<BeX, Executor>> list = this.A02;
                if (list != null) {
                    Iterator<Pair<BeX, Executor>> it = list.iterator();
                    while (it.hasNext()) {
                        if (BV6.A0O(it).first == beX) {
                            it.remove();
                        }
                    }
                }
            } else {
                bj5.A0I.execute(new Runnable() { // from class: X.Bdg
                    public static final String __redex_internal_original_name = "Camera2CameraControlImpl$$ExternalSyntheticLambda7";

                    @Override // java.lang.Runnable
                    public final void run() {
                        Bj5 bj52 = bj5;
                        BeX beX2 = beX;
                        BeT beT = bj52.A05;
                        beT.A01.remove(beX2);
                        beT.A00.remove(beX2);
                    }
                });
            }
        }
    }

    public C2532BdJ(C2538BdP c2538BdP, String str) throws ExecutionException, InterruptedException {
        str.getClass();
        this.A08 = str;
        this.A09 = c2538BdP;
        C2476Bc3 c2476Bc3A00 = c2538BdP.A00(str);
        this.A04 = c2476Bc3A00;
        C2533BdK c2533BdK = new C2533BdK();
        c2533BdK.A00 = this;
        this.A05 = c2533BdK;
        C2511Bch c2511BchA00 = BZv.A00(c2476Bc3A00);
        this.A06 = c2511BchA00;
        this.A0A = new C2512Bcj(c2511BchA00, str);
        this.A03 = new C2955Bpt<>(new C2821Bly(null, C79.A0P));
    }
}
