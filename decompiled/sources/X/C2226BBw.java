package X;

import java.util.List;

/* renamed from: X.BBw, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2226BBw implements BCT {
    public final /* synthetic */ BBJ A00;
    public final /* synthetic */ BCT A01;

    public C2226BBw(BBJ bbj, BCT bct) {
        this.A01 = bct;
        this.A00 = bbj;
    }

    @Override // X.BCT
    public final List A5W() {
        List listA5W = this.A01.A5W();
        BBJ bbj = this.A00;
        int i = bbj.A08;
        return i < 0 ? listA5W : AbstractC0878AGe.A0P(listA5W, BBZ.A01(bbj, Integer.valueOf(BBJ.A04(bbj, bbj.A0G, i)), i));
    }

    @Override // X.BCT
    public final boolean AKo() {
        return this.A01.AKo();
    }
}
