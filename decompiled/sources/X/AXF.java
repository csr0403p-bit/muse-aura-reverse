package X;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import java.util.List;

/* loaded from: classes4.dex */
public class AXF extends AX2 {
    public C1298Agj A00;
    public C1299Agk A01;

    @Override // X.InterfaceC1447AjG
    public final void AS5() {
        this.A00 = null;
        A0P(true);
    }

    @Override // X.AX2, X.InterfaceC1447AjG
    public final void ATZ(AX8 ax8, EnumC1080AXj enumC1080AXj) {
        super.ATZ(ax8, enumC1080AXj);
        if (enumC1080AXj != EnumC1080AXj.A04) {
            if (enumC1080AXj != EnumC1080AXj.A02 || this.A00 == null) {
                return;
            }
            List<C1298Agj> list = ((C1303Ago) ax8).A02;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C1298Agj c1298AgjA0Z = C8j4.A0Z(list, i);
                if (!c1298AgjA0Z.A00 || c1298AgjA0Z.equals(this.A00)) {
                }
            }
            return;
        }
        C1298Agj c1298Agj = this.A00;
        List<C1298Agj> list2 = ((C1303Ago) ax8).A02;
        int size2 = list2.size();
        int i2 = 0;
        if (c1298Agj == null) {
            while (i2 < size2) {
                C1298Agj c1298AgjA0Z2 = C8j4.A0Z(list2, i2);
                if (!c1298AgjA0Z2.A06 && c1298AgjA0Z2.A05) {
                    C1298Agj c1298AgjA0Z3 = C8j4.A0Z(list2, 0);
                    c1298AgjA0Z3.A00 = true;
                    this.A00 = c1298AgjA0Z3;
                    if (this.A09) {
                        A0M(c1298AgjA0Z3);
                        return;
                    }
                    return;
                }
                i2++;
            }
            return;
        }
        while (i2 < size2) {
            C1298Agj c1298AgjA0Z4 = C8j4.A0Z(list2, i2);
            if (c1298AgjA0Z4.A00 || !c1298AgjA0Z4.A06 || c1298AgjA0Z4.A05) {
                float fALr = ARZ.A00(this).ALr();
                int size3 = list2.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    C1298Agj c1298AgjA0Z5 = C8j4.A0Z(list2, i3);
                    long j = c1298AgjA0Z5.A02;
                    C1298Agj c1298Agj2 = this.A00;
                    C7384Etj.A0X(c1298Agj2);
                    boolean zA1N = AnonymousClass002.A1N((Math.abs(AWx.A00(AWx.A04(j, c1298Agj2.A02))) > fALr ? 1 : (Math.abs(AWx.A00(AWx.A04(j, c1298Agj2.A02))) == fALr ? 0 : -1)));
                    if (!c1298AgjA0Z5.A00 && !zA1N) {
                    }
                }
                return;
            }
            i2++;
        }
        C8j4.A0Z(list2, 0).A00 = true;
        if (this.A09) {
            C1298Agj c1298Agj3 = this.A00;
            C7384Etj.A0X(c1298Agj3);
            A0K(c1298Agj3.A02, true);
            this.A08.invoke();
        }
        this.A00 = null;
        return;
        this.A00 = null;
        A0P(true);
    }

    @Override // X.AX2, X.InterfaceC1348AhZ
    /* renamed from: onCancelPointerInput */
    public final void onViewConfigurationChange() {
        super.onViewConfigurationChange();
        this.A01 = null;
        A0P(false);
    }

    @Override // X.AX2, X.InterfaceC1348AhZ
    /* renamed from: onPointerEvent-H0pRuoY */
    public final void mo13onPointerEventH0pRuoY(C1247Afe c1247Afe, EnumC1080AXj enumC1080AXj, long j) {
        super.mo13onPointerEventH0pRuoY(c1247Afe, enumC1080AXj, j);
        if (enumC1080AXj != EnumC1080AXj.A04) {
            if (enumC1080AXj != EnumC1080AXj.A02 || this.A01 == null) {
                return;
            }
            List<C1299Agk> list = c1247Afe.A05;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C1299Agk c1299AgkA0h = C8j3.A0h(list, i);
                if (c1299AgkA0h.A03() && !c1299AgkA0h.equals(this.A01)) {
                    this.A01 = null;
                    A0P(false);
                    return;
                }
            }
            return;
        }
        if (this.A01 == null) {
            if (TapGestureDetectorKt.A09(c1247Afe, true, false)) {
                C1299Agk c1299AgkA0h2 = C8j3.A0h(c1247Afe.A05, 0);
                c1299AgkA0h2.A02();
                this.A01 = c1299AgkA0h2;
                if (this.A09) {
                    A0N(c1299AgkA0h2);
                    return;
                }
                return;
            }
            return;
        }
        List<C1299Agk> list2 = c1247Afe.A05;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (!AbstractC1078AXh.A02(C8j3.A0h(list2, i2))) {
                long jA0I = A0I(j);
                int size3 = list2.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    C1299Agk c1299AgkA0h3 = C8j3.A0h(list2, i3);
                    if (c1299AgkA0h3.A03() || AbstractC1078AXh.A04(c1299AgkA0h3, j, jA0I)) {
                        this.A01 = null;
                        A0P(false);
                        return;
                    }
                }
                return;
            }
        }
        C1299Agk.A00(list2, 0);
        if (this.A09) {
            C1299Agk c1299Agk = this.A01;
            C7384Etj.A0X(c1299Agk);
            A0K(c1299Agk.A0A, false);
            this.A08.invoke();
        }
        this.A01 = null;
    }
}
