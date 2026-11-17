package X;

import java.util.List;

/* renamed from: X.ARz, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1036ARz implements InterfaceC1380AiA {
    public static final C1036ARz A00 = new C1036ARz();

    @Override // X.InterfaceC1380AiA
    public final /* synthetic */ int maxIntrinsicHeight(C3TF c3tf, List list, int i) {
        return AXQ.A00(c3tf, this, list, i);
    }

    @Override // X.InterfaceC1380AiA
    public final /* synthetic */ int maxIntrinsicWidth(C3TF c3tf, List list, int i) {
        return AXQ.A01(c3tf, this, list, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    @Override // X.InterfaceC1380AiA
    /* renamed from: measure-3p2s80s */
    public final InterfaceC1134Abi mo7measure3p2s80s(AXY axy, List<? extends C3TG> list, long j) {
        int iMax;
        int iMax2;
        int i;
        AZE aze;
        int size = list.size();
        if (size == 0) {
            return axy.APV(C9jH.A00, new BUU(18), 0, 0);
        }
        if (size != 1) {
            ?? A0t = C60Q.A0t(list);
            int size2 = list.size();
            iMax = 0;
            iMax2 = 0;
            for (int i2 = 0; i2 < size2; i2++) {
                AZE azeAQW = list.get(i2).AQW(j);
                iMax = Math.max(iMax, azeAQW.A01);
                iMax2 = Math.max(iMax2, azeAQW.A00);
                A0t.add(azeAQW);
            }
            i = 13;
            aze = A0t;
        } else {
            AZE azeAQW2 = list.get(0).AQW(j);
            iMax = azeAQW2.A01;
            iMax2 = azeAQW2.A00;
            i = 12;
            aze = azeAQW2;
        }
        return AXY.A01(axy, new C2326BUa(aze, i), iMax, iMax2);
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
