package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class AvR extends AbstractC1439Aj8 implements InterfaceC1403AiY, InterfaceC1332AhJ, C1Z2 {
    public float A00;
    public ATQ A02;
    public boolean A03;
    public final C0dy A05;
    public final C1DN A06;
    public final Function0<C1YV> A07;
    public final boolean A08;
    public final float A09;
    public long A01 = 0;
    public final C0912AHo<AWm> A04 = C0912AHo.A00();

    public static final void A00(AWm aWm, AvR avR) {
        B1Q b1q;
        if (!(aWm instanceof AWp)) {
            if (((aWm instanceof AWk) || (aWm instanceof AWl)) && (b1q = ((C2018AwW) avR).A01) != null) {
                b1q.A01();
                return;
            }
            return;
        }
        AWp aWp = (AWp) aWm;
        long j = avR.A01;
        float f = avR.A00;
        C2018AwW c2018AwW = (C2018AwW) avR;
        AvV avV = c2018AwW.A00;
        if (avV == null) {
            ViewGroup viewGroupA00 = AvU.A00((View) ARZ.A01(AndroidCompositionLocals_androidKt.A05, c2018AwW));
            int childCount = viewGroupA00.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    avV = new AvV(viewGroupA00.getContext());
                    viewGroupA00.addView(avV);
                    break;
                } else {
                    View childAt = viewGroupA00.getChildAt(i);
                    if (childAt instanceof AvV) {
                        avV = (AvV) childAt;
                        break;
                    }
                    i++;
                }
            }
            c2018AwW.A00 = avV;
            C7384Etj.A0X(avV);
        }
        B1Q b1qA00 = avV.A00(c2018AwW);
        boolean z = c2018AwW.A08;
        b1qA00.A03(aWp, C2293BSt.A00(c2018AwW, 20), c2018AwW.A07.invoke().A03, Ab3.A01(f), j, c2018AwW.A06.AO0(), z);
        c2018AwW.A01 = b1qA00;
        AaD.A00(c2018AwW);
    }

    @Override // X.InterfaceC1403AiY
    public final /* synthetic */ void AUZ(InterfaceC1497Ak4 interfaceC1497Ak4) {
    }

    @Override // X.InterfaceC1403AiY, X.InterfaceC1407Aic
    public final void AVH(long j) {
        this.A03 = true;
        AXN axnA08 = AbstractC1414Aij.A08(this);
        long jA01 = AQY.A01(j);
        this.A01 = jA01;
        float f = this.A09;
        this.A00 = Float.isNaN(f) ? AbstractC05171y7.A00(axnA08, jA01, this.A08) : axnA08.Ah4(f);
        C0912AHo<AWm> c0912AHo = this.A04;
        Object[] objArr = c0912AHo.A01;
        int i = ((AbstractC0913AHp) c0912AHo).A00;
        for (int i2 = 0; i2 < i; i2++) {
            A00((AWm) objArr[i2], this);
        }
        c0912AHo.A06();
    }

    @Override // X.AbstractC1439Aj8
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // X.InterfaceC1332AhJ
    public final /* synthetic */ void onMeasureResultChanged() {
    }

    /* JADX WARN: Incorrect types in method signature: (LX/0dy;ZFLX/1DN;Lkotlin/jvm/functions/Function0<LX/1YV;>;)V */
    public AvR(C0dy c0dy, C1DN c1dn, Function0 function0, float f, boolean z) {
        this.A05 = c0dy;
        this.A08 = z;
        this.A09 = f;
        this.A06 = c1dn;
        this.A07 = function0;
    }

    @Override // X.InterfaceC1332AhJ
    public final void draw(C16Z c16z) {
        c16z.A9O();
        ATQ atq = this.A02;
        if (atq != null) {
            atq.A00(c16z, this.A00, this.A06.AO0());
        }
        C2018AwW c2018AwW = (C2018AwW) this;
        InterfaceC1327AhE interfaceC1327AhEA01 = AW9.A01(c16z);
        B1Q b1q = c2018AwW.A01;
        if (b1q != null) {
            long j = ((AvR) c2018AwW).A01;
            b1q.A02(c2018AwW.A07.invoke().A03, Ab3.A01(((AvR) c2018AwW).A00), j, c2018AwW.A06.AO0());
            b1q.draw(AbstractC1290Aga.A00(interfaceC1327AhEA01));
        }
    }

    @Override // X.AbstractC1439Aj8
    public final void onAttach() {
        AnonymousClass001.A1J(new C05383bk(this, null), getCoroutineScope());
    }
}
