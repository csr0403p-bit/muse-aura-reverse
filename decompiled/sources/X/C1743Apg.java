package X;

import android.graphics.Path;
import android.view.View;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.aura.R;
import java.util.WeakHashMap;

/* renamed from: X.Apg, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1743Apg {
    public static final WeakHashMap<View, C1743Apg> A0O = new WeakHashMap<>();
    public int A00;
    public final C1741Ape A01;
    public final C1741Ape A02;
    public final C1741Ape A03;
    public final C1741Ape A04;
    public final C1741Ape A05;
    public final C1741Ape A06;
    public final C1741Ape A07;
    public final RunnableC1744Aph A08;
    public final C1751Apo A09;
    public final C1751Apo A0A;
    public final C1751Apo A0B;
    public final C1751Apo A0C;
    public final C1751Apo A0D;
    public final C1Ny A0E;
    public final MutableState A0F;
    public final boolean A0G;
    public final C1741Ape A0H;
    public final C1741Ape A0I;
    public final C1751Apo A0J;
    public final C1751Apo A0K;
    public final C1751Apo A0L;
    public final C1Ny A0M;
    public final C1Ny A0N;

    public static C1751Apo A00(String str) {
        return new C1751Apo(new C1753Apq(0, 0, 0, 0), str);
    }

    public static final C1743Apg A01(BFM bfm) {
        C1743Apg c1743Apg;
        View view = (View) AKO.A08(AndroidCompositionLocals_androidKt.A05, BBI.A04((BBI) bfm));
        WeakHashMap<View, C1743Apg> weakHashMap = A0O;
        synchronized (weakHashMap) {
            C1743Apg c1743Apg2 = weakHashMap.get(view);
            if (c1743Apg2 == null) {
                c1743Apg2 = new C1743Apg(view);
                weakHashMap.put(view, c1743Apg2);
            }
            c1743Apg = c1743Apg2;
        }
        boolean zA67 = bfm.A67(c1743Apg) | bfm.A67(view);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new BTA(27, view, c1743Apg);
            bfm.Ai0(objAaT);
        }
        C78e.A05(bfm, c1743Apg, (G0U) objAaT);
        return c1743Apg;
    }

    public static final void A02(C1743Apg c1743Apg, C8497Ff4 c8497Ff4) {
        C8345FcJ c8345FcJA01;
        Path pathA00;
        c1743Apg.A0H.A01(c8497Ff4);
        c1743Apg.A02.A01(c8497Ff4);
        c1743Apg.A01.A01(c8497Ff4);
        c1743Apg.A04.A01(c8497Ff4);
        c1743Apg.A05.A01(c8497Ff4);
        c1743Apg.A06.A01(c8497Ff4);
        c1743Apg.A0I.A01(c8497Ff4);
        c1743Apg.A07.A01(c8497Ff4);
        c1743Apg.A03.A01(c8497Ff4);
        C1751Apo c1751Apo = c1743Apg.A0J;
        C8496Ff3 c8496Ff3 = c8497Ff4.A00;
        AbstractC1742Apf.A00(c1751Apo, c8496Ff3.A05(4));
        AbstractC1742Apf.A00(c1743Apg.A0B, c8496Ff3.A05(2));
        AbstractC1742Apf.A00(c1743Apg.A0C, c8496Ff3.A05(1));
        AbstractC1742Apf.A00(c1743Apg.A0D, c8496Ff3.A05(519));
        AbstractC1742Apf.A00(c1743Apg.A0K, c8496Ff3.A05(64));
        C8500Ff7 c8500Ff7A06 = c8496Ff3.A06();
        C1751Apo c1751Apo2 = c1743Apg.A0L;
        if (c8500Ff7A06 == null || (c8345FcJA01 = c8500Ff7A06.A01()) == null) {
            c8345FcJA01 = C8345FcJ.A04;
        }
        AbstractC1742Apf.A00(c1751Apo2, c8345FcJA01);
        c1743Apg.A0F.Af8((c8500Ff7A06 == null || (pathA00 = c8500Ff7A06.A00()) == null) ? null : new C1710Aot(pathA00));
        Snapshot.A05();
    }

    public final void A03(View view) {
        if (this.A00 == 0) {
            RunnableC1744Aph runnableC1744Aph = this.A08;
            AbstractC8082FSn.A00(view, runnableC1744Aph);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(runnableC1744Aph);
            C8490Fex.A01(view, runnableC1744Aph);
        }
        this.A00++;
    }

    public C1743Apg(View view) {
        Boolean bool;
        View view2;
        C1741Ape c1741Ape = new C1741Ape(4, "captionBar");
        this.A0H = c1741Ape;
        C1741Ape c1741Ape2 = new C1741Ape(128, "displayCutout");
        this.A01 = c1741Ape2;
        C1741Ape c1741Ape3 = new C1741Ape(8, "ime");
        this.A02 = c1741Ape3;
        C1741Ape c1741Ape4 = new C1741Ape(32, "mandatorySystemGestures");
        this.A03 = c1741Ape4;
        C1741Ape c1741Ape5 = new C1741Ape(2, "navigationBars");
        this.A04 = c1741Ape5;
        C1741Ape c1741Ape6 = new C1741Ape(1, "statusBars");
        this.A05 = c1741Ape6;
        C1741Ape c1741Ape7 = new C1741Ape(519, "systemBars");
        this.A06 = c1741Ape7;
        C1741Ape c1741Ape8 = new C1741Ape(16, "systemGestures");
        this.A0I = c1741Ape8;
        C1741Ape c1741Ape9 = new C1741Ape(64, "tappableElement");
        this.A07 = c1741Ape9;
        C1751Apo c1751ApoA00 = A00("waterfall");
        this.A0L = c1751ApoA00;
        this.A0F = AbstractC1798ArH.A03();
        C1OP c1op = new C1OP(new C1OP(c1741Ape7, c1741Ape3), c1741Ape2);
        this.A0E = c1op;
        C1OP c1op2 = new C1OP(new C1OP(new C1OP(c1741Ape9, c1741Ape4), c1741Ape8), c1751ApoA00);
        this.A0N = c1op2;
        this.A0M = new C1OP(c1op, c1op2);
        this.A0J = A00("captionBarIgnoringVisibility");
        this.A0B = A00("navigationBarsIgnoringVisibility");
        this.A0C = A00("statusBarsIgnoringVisibility");
        this.A0D = A00("systemBarsIgnoringVisibility");
        this.A0K = A00("tappableElementIgnoringVisibility");
        this.A0A = A00("imeAnimationTarget");
        this.A09 = A00("imeAnimationSource");
        Object parent = view.getParent();
        Object tag = (!(parent instanceof View) || (view2 = (View) parent) == null) ? null : view2.getTag(R.id.consume_window_insets_tag);
        this.A0G = (!(tag instanceof Boolean) || (bool = (Boolean) tag) == null) ? false : bool.booleanValue();
        this.A08 = new RunnableC1744Aph(this);
        C8497Ff4 c8497Ff4A00 = AbstractC8508FfF.A00(view);
        if (c8497Ff4A00 != null) {
            C8496Ff3 c8496Ff3 = c8497Ff4A00.A00;
            C1741Ape.A00(c1741Ape, c8496Ff3, 4);
            C1741Ape.A00(c1741Ape2, c8496Ff3, 128);
            C1741Ape.A00(c1741Ape3, c8496Ff3, 8);
            C1741Ape.A00(c1741Ape4, c8496Ff3, 32);
            C1741Ape.A00(c1741Ape5, c8496Ff3, 2);
            C1741Ape.A00(c1741Ape6, c8496Ff3, 1);
            C1741Ape.A00(c1741Ape7, c8496Ff3, 519);
            C1741Ape.A00(c1741Ape8, c8496Ff3, 16);
            C1741Ape.A00(c1741Ape9, c8496Ff3, 64);
        }
    }
}
