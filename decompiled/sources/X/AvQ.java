package X;

import android.view.View;
import android.widget.Magnifier;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AvQ extends AbstractC1439Aj8 implements InterfaceC1476Ajj, InterfaceC1332AhJ, InterfaceC1487Aju, InterfaceC1451AjK {
    public float A00;
    public float A01;
    public float A02;
    public long A03;
    public View A05;
    public AzX A06;
    public AVi A07;
    public C1BO<AWx> A08;
    public AXN A09;
    public G0U<? super C73O, Unit> A0A;
    public G0U<? super AXN, AWx> A0B;
    public HzR<Unit> A0C;
    public boolean A0D;
    public boolean A0E;
    public BL4 A0F;
    public final MutableState A0G = C3cG.A08(AGG.A00, null);
    public long A04 = 9205357640488583168L;

    private final void A00() {
        AXN axn;
        AzX azX = this.A06;
        if (azX == null || (axn = this.A09) == null) {
            return;
        }
        Magnifier magnifier = ((C2111Ayb) azX).A00;
        long jA0T = C8j3.A0T(magnifier.getWidth(), magnifier.getHeight());
        BL4 bl4 = this.A0F;
        if (bl4 == null || jA0T != bl4.A00) {
            G0U<? super C73O, Unit> g0u = this.A0A;
            if (g0u != null) {
                Magnifier magnifier2 = ((C2111Ayb) azX).A00;
                g0u.invoke(new C73O(axn.Agz(AQY.A01(C8j3.A0T(magnifier2.getWidth(), magnifier2.getHeight())))));
            }
            Magnifier magnifier3 = ((C2111Ayb) azX).A00;
            this.A0F = BL4.A00(C8j3.A0T(magnifier3.getWidth(), magnifier3.getHeight()));
        }
    }

    public static final void A01(AvQ avQ) {
        Magnifier magnifierBuild;
        AzX azX = avQ.A06;
        if (azX != null) {
            ((C2111Ayb) azX).A00.dismiss();
        }
        View viewA00 = avQ.A05;
        if (viewA00 == null) {
            viewA00 = AbstractC1329AhG.A00(avQ);
        }
        avQ.A05 = viewA00;
        AXN axnA08 = avQ.A09;
        if (axnA08 == null) {
            axnA08 = AbstractC1414Aij.A08(avQ);
        }
        avQ.A09 = axnA08;
        boolean z = avQ.A0E;
        long j = avQ.A03;
        float f = avQ.A00;
        float f2 = avQ.A01;
        boolean z2 = avQ.A0D;
        float f3 = avQ.A02;
        if (z) {
            magnifierBuild = new Magnifier(viewA00);
        } else {
            long jAh6 = axnA08.Ah6(j);
            float fAh4 = axnA08.Ah4(f);
            float fAh42 = axnA08.Ah4(f2);
            Magnifier.Builder builder = new Magnifier.Builder(viewA00);
            if (jAh6 != 9205357640488583168L) {
                builder.setSize(Ab3.A01(AnonymousClass003.A03(jAh6)), Ab3.A01(AnonymousClass004.A00(jAh6)));
            }
            if (!Float.isNaN(fAh4)) {
                builder.setCornerRadius(fAh4);
            }
            if (!Float.isNaN(fAh42)) {
                builder.setElevation(fAh42);
            }
            if (!Float.isNaN(f3)) {
                builder.setInitialZoom(f3);
            }
            builder.setClippingEnabled(z2);
            magnifierBuild = builder.build();
        }
        avQ.A06 = new C2111Ayb(magnifierBuild);
        avQ.A00();
    }

    public static final void A02(AvQ avQ) {
        AXN axnA08 = avQ.A09;
        if (axnA08 == null) {
            axnA08 = AbstractC1414Aij.A08(avQ);
            avQ.A09 = axnA08;
        }
        long j = avQ.A0B.invoke(axnA08).A00;
        if ((j & 9223372034707292159L) != 9205357640488583168L) {
            C1BO c1boA0A = avQ.A08;
            if (c1boA0A == null) {
                c1boA0A = BBP.A0A(C2292BSs.A00(avQ, 12));
                avQ.A08 = c1boA0A;
            }
            if ((((AWx) c1boA0A.getValue()).A00 & 9223372034707292159L) != 9205357640488583168L) {
                C1BO c1boA0A2 = avQ.A08;
                if (c1boA0A2 == null) {
                    c1boA0A2 = BBP.A0A(C2292BSs.A00(avQ, 12));
                    avQ.A08 = c1boA0A2;
                }
                avQ.A04 = AWx.A05(((AWx) c1boA0A2.getValue()).A00, j);
                if (avQ.A06 == null) {
                    A01(avQ);
                }
                AzX azX = avQ.A06;
                if (azX != null) {
                    long j2 = avQ.A04;
                    float f = avQ.A02;
                    C2111Ayb c2111Ayb = (C2111Ayb) azX;
                    if (!Float.isNaN(f)) {
                        c2111Ayb.A00.setZoom(f);
                    }
                    c2111Ayb.A00.show(AnonymousClass001.A00(j2), AnonymousClass001.A01(j2, 4294967295L));
                }
                avQ.A00();
                return;
            }
        }
        avQ.A04 = 9205357640488583168L;
        AzX azX2 = avQ.A06;
        if (azX2 != null) {
            ((C2111Ayb) azX2).A00.dismiss();
        }
    }

    @Override // X.InterfaceC1476Ajj
    public final void A4Y(InterfaceC0857A6e interfaceC0857A6e) {
        interfaceC0857A6e.Aca(AP2.A00, C2292BSs.A00(this, 11));
    }

    @Override // X.InterfaceC1476Ajj
    public final /* synthetic */ boolean AKZ() {
        return false;
    }

    @Override // X.InterfaceC1476Ajj
    public final /* synthetic */ boolean AKa() {
        return false;
    }

    @Override // X.InterfaceC1476Ajj
    public final /* synthetic */ boolean AOU() {
        return true;
    }

    @Override // X.InterfaceC1487Aju
    public final void ATW(InterfaceC1497Ak4 interfaceC1497Ak4) {
        this.A0G.Af8(interfaceC1497Ak4);
    }

    @Override // X.InterfaceC1451AjK
    public final void AUO() {
        AbstractC1441AjA.A00(this, C2292BSs.A00(this, 10));
    }

    @Override // X.AbstractC1439Aj8
    public final void onDetach() {
        AzX azX = this.A06;
        if (azX != null) {
            ((C2111Ayb) azX).A00.dismiss();
        }
        this.A06 = null;
    }

    @Override // X.InterfaceC1332AhJ
    public final /* synthetic */ void onMeasureResultChanged() {
    }

    public AvQ(AVi aVi, G0U g0u, G0U g0u2, float f, float f2, float f3, long j, boolean z, boolean z2) {
        this.A0B = g0u;
        this.A0A = g0u2;
        this.A02 = f;
        this.A0E = z;
        this.A03 = j;
        this.A00 = f2;
        this.A01 = f3;
        this.A0D = z2;
        this.A07 = aVi;
    }

    @Override // X.InterfaceC1332AhJ
    public final void draw(C16Z c16z) {
        c16z.A9O();
        HzR<Unit> hzR = this.A0C;
        if (hzR != null) {
            hzR.AhZ(Unit.INSTANCE);
        }
    }

    @Override // X.AbstractC1439Aj8
    public final void onAttach() {
        AUO();
        this.A0C = new GCV(0, null);
        C8j3.A1I(C79.A0K, BU2.A0O(this, null, 11), getCoroutineScope());
    }
}
