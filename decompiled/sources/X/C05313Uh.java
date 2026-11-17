package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import kotlin.Unit;

/* renamed from: X.3Uh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C05313Uh implements InterfaceC1380AiA {
    public final Alignment A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C05313Uh) {
                C05313Uh c05313Uh = (C05313Uh) obj;
                if (!C7384Etj.areEqual(this.A00, c05313Uh.A00) || this.A01 != c05313Uh.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C0KA.A00(AnonymousClass005.A0E(this.A00), this.A01);
    }

    @Override // X.InterfaceC1380AiA
    /* renamed from: measure-3p2s80s */
    public final InterfaceC1134Abi mo7measure3p2s80s(final AXY axy, final List<? extends C3TG> list, long j) {
        C2Yh c2Yh;
        C2Yh c2Yh2;
        AZE azeAQW;
        int iMax;
        int iMax2;
        G0U c3bM;
        C2Yh c2Yh3;
        if (list.isEmpty()) {
            iMax = Constraints.A03(j);
            iMax2 = Constraints.A02(j);
            c3bM = new C3bM(5);
        } else {
            long j2 = this.A01 ? j : j & (-8589934589L);
            if (list.size() != 1) {
                final AZE[] azeArr = new AZE[list.size()];
                final F1E f1e = new F1E();
                f1e.element = Constraints.A03(j);
                final F1E f1e2 = new F1E();
                f1e2.element = Constraints.A02(j);
                int size = list.size();
                boolean z = false;
                for (int i = 0; i < size; i++) {
                    C3TG c3tg = list.get(i);
                    C0918AHu<Alignment, InterfaceC1380AiA> c0918AHu = C3Ue.A00;
                    Object objAIX = c3tg.AIX();
                    if ((objAIX instanceof C2Yh) && (c2Yh2 = (C2Yh) objAIX) != null && c2Yh2.A01) {
                        z = true;
                    } else {
                        AZE azeAQW2 = c3tg.AQW(j2);
                        azeArr[i] = azeAQW2;
                        f1e.element = Math.max(f1e.element, azeAQW2.A01);
                        f1e2.element = Math.max(f1e2.element, azeAQW2.A00);
                    }
                }
                if (z) {
                    int i2 = f1e.element;
                    if (i2 == Integer.MAX_VALUE) {
                        i2 = 0;
                    }
                    int i3 = f1e2.element;
                    long jA05 = AYL.A05(i2, i2, i3 != Integer.MAX_VALUE ? i3 : 0, i3);
                    int size2 = list.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        C3TG c3tg2 = list.get(i4);
                        C0918AHu<Alignment, InterfaceC1380AiA> c0918AHu2 = C3Ue.A00;
                        Object objAIX2 = c3tg2.AIX();
                        if ((objAIX2 instanceof C2Yh) && (c2Yh = (C2Yh) objAIX2) != null && c2Yh.A01) {
                            azeArr[i4] = c3tg2.AQW(jA05);
                        }
                    }
                }
                return axy.APV(AGH.A0E(), new G0U(this) { // from class: X.3Ui
                    public final /* synthetic */ C05313Uh A00;

                    @Override // X.G0U
                    public final Object invoke(Object obj) {
                        AZE[] azeArr2 = azeArr;
                        List list2 = list;
                        AXY axy2 = axy;
                        F1E f1e3 = f1e;
                        F1E f1e4 = f1e2;
                        C05313Uh c05313Uh = this.A00;
                        AYU ayu = (AYU) obj;
                        int length = azeArr2.length;
                        int i5 = 0;
                        int i6 = 0;
                        while (i5 < length) {
                            AZE aze = azeArr2[i5];
                            C7384Etj.A0Z(aze, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
                            C3Ue.A03(c05313Uh.A00, (C3TG) list2.get(i6), ayu, aze, axy2.getLayoutDirection(), f1e3.element, f1e4.element);
                            i5++;
                            i6++;
                        }
                        return Unit.INSTANCE;
                    }

                    {
                        this.A00 = this;
                    }
                }, f1e.element, f1e2.element);
            }
            final C3TG c3tg3 = list.get(0);
            C0918AHu<Alignment, InterfaceC1380AiA> c0918AHu3 = C3Ue.A00;
            Object objAIX3 = c3tg3.AIX();
            if ((objAIX3 instanceof C2Yh) && (c2Yh3 = (C2Yh) objAIX3) != null && c2Yh3.A01) {
                iMax = Constraints.A03(j);
                iMax2 = Constraints.A02(j);
                azeAQW = c3tg3.AQW(Constraints.A04(iMax, iMax2));
            } else {
                azeAQW = c3tg3.AQW(j2);
                iMax = Math.max(Constraints.A03(j), azeAQW.A01);
                iMax2 = Math.max(Constraints.A02(j), azeAQW.A00);
            }
            final AZE aze = azeAQW;
            final int i5 = iMax;
            final int i6 = iMax2;
            c3bM = new G0U(this) { // from class: X.3Uj
                public final /* synthetic */ C05313Uh A02;

                @Override // X.G0U
                public final Object invoke(Object obj) {
                    AZE aze2 = aze;
                    C3TG c3tg4 = c3tg3;
                    AXY axy2 = axy;
                    int i7 = i5;
                    int i8 = i6;
                    C05313Uh c05313Uh = this.A02;
                    EnumC1820Arj layoutDirection = axy2.getLayoutDirection();
                    C3Ue.A03(c05313Uh.A00, c3tg4, (AYU) obj, aze2, layoutDirection, i7, i8);
                    return Unit.INSTANCE;
                }

                {
                    this.A02 = this;
                }
            };
        }
        return axy.APV(AGH.A0E(), c3bM, iMax, iMax2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BoxMeasurePolicy(alignment=");
        sb.append(this.A00);
        sb.append(", propagateMinConstraints=");
        sb.append(this.A01);
        return AnonymousClass006.A0z(sb);
    }

    public C05313Uh(Alignment alignment, boolean z) {
        this.A00 = alignment;
        this.A01 = z;
    }

    @Override // X.InterfaceC1380AiA
    public final /* synthetic */ int maxIntrinsicHeight(C3TF c3tf, List list, int i) {
        return AXQ.A00(c3tf, this, list, i);
    }

    @Override // X.InterfaceC1380AiA
    public final /* synthetic */ int maxIntrinsicWidth(C3TF c3tf, List list, int i) {
        return AXQ.A01(c3tf, this, list, i);
    }

    @Override // X.InterfaceC1380AiA
    public final /* synthetic */ int minIntrinsicHeight(C3TF c3tf, List list, int i) {
        return AXQ.A02(c3tf, this, list, i);
    }

    @Override // X.InterfaceC1380AiA
    public final /* synthetic */ int minIntrinsicWidth(C3TF c3tf, List list, int i) {
        return AXQ.A03(c3tf, this, list, i);
    }
}
