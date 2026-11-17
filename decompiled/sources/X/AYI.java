package X;

import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class AYI extends AYK {
    public static final AYI A00 = new AYI();

    public AYI() {
        super("Undefined intrinsics block and it is required");
    }

    @Override // X.InterfaceC1380AiA
    /* renamed from: measure-3p2s80s */
    public final InterfaceC1134Abi mo7measure3p2s80s(AXY axy, List<? extends C3TG> list, long j) {
        int iA03;
        int iA02;
        G0U g0uA00;
        int size = list.size();
        if (size != 0) {
            if (size != 1) {
                ArrayList arrayListA0t = C60Q.A0t(list);
                int size2 = list.size();
                int iMax = 0;
                int iMax2 = 0;
                for (int i = 0; i < size2; i++) {
                    AZE azeAQW = list.get(i).AQW(j);
                    iMax = Math.max(azeAQW.A01, iMax);
                    iMax2 = Math.max(azeAQW.A00, iMax2);
                    arrayListA0t.add(azeAQW);
                }
                return AXY.A01(axy, BUX.A00(arrayListA0t, 33), AYL.A02(j, iMax), AYL.A01(j, iMax2));
            }
            AZE azeAQW2 = list.get(0).AQW(j);
            iA03 = AYL.A02(j, azeAQW2.A01);
            iA02 = AYL.A01(j, azeAQW2.A00);
            g0uA00 = BUX.A00(azeAQW2, 32);
        } else {
            iA03 = Constraints.A03(j);
            iA02 = Constraints.A02(j);
            g0uA00 = BUT.A00(23);
        }
        return AXY.A01(axy, g0uA00, iA03, iA02);
    }
}
