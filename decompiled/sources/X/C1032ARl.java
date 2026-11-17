package X;

import androidx.compose.ui.unit.Constraints;
import java.util.List;

/* renamed from: X.ARl, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1032ARl implements InterfaceC1380AiA {
    public final /* synthetic */ AEG A00;
    public final /* synthetic */ C9W7 A01;
    public final /* synthetic */ boolean A02;

    public C1032ARl(AEG aeg, C9W7 c9w7, boolean z) {
        this.A02 = z;
        this.A01 = c9w7;
        this.A00 = aeg;
    }

    @Override // X.InterfaceC1380AiA
    public final /* synthetic */ int maxIntrinsicHeight(C3TF c3tf, List list, int i) {
        return AXQ.A00(c3tf, this, list, i);
    }

    @Override // X.InterfaceC1380AiA
    public final /* synthetic */ int maxIntrinsicWidth(C3TF c3tf, List list, int i) {
        return AXQ.A01(c3tf, this, list, i);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [boolean] */
    @Override // X.InterfaceC1380AiA
    /* renamed from: measure-3p2s80s */
    public final InterfaceC1134Abi mo7measure3p2s80s(AXY axy, List<? extends C3TG> list, long j) {
        int iA01;
        int iA012;
        ?? A1b = AnonymousClass004.A1b(axy, list);
        AZE azeAQW = this.A02 ? ((C3TG) AbstractC0878AGe.A0F(list)).AQW(AYL.A06(A1b == true ? 1 : 0, Integer.MAX_VALUE, A1b == true ? 1 : 0, Integer.MAX_VALUE)) : null;
        int iAbr = azeAQW == null ? 0 : azeAQW.A01 + axy.Abr(this.A01.A04);
        if (Constraints.A0A(j)) {
            iA01 = Constraints.A01(j) - iAbr;
            if (iA01 < A1b) {
                iA01 = 0;
            }
        } else {
            iA01 = Integer.MAX_VALUE;
        }
        AZE azeAQW2 = ((C3TG) AbstractC0878AGe.A0H(list)).AQW(AYL.A06(A1b == true ? 1 : 0, iA01, A1b == true ? 1 : 0, Integer.MAX_VALUE));
        if (azeAQW == null) {
            iA012 = 0;
        } else {
            AEG aeg = this.A00;
            iA012 = Ab3.A01(C8j3.A00(aeg.A01 + aeg.A00, azeAQW.A00));
        }
        int iMin = Math.min(A1b == true ? 1 : 0, iA012);
        return AXY.A01(axy, new ARm(azeAQW, azeAQW2, iA012, iMin, iAbr), azeAQW2.A01 + iAbr, Math.max(azeAQW2.A00, (azeAQW != null ? azeAQW.A00 : 0) + iA012) - iMin);
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
