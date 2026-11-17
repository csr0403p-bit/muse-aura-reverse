package X;

import java.util.Iterator;

/* loaded from: classes5.dex */
public final /* synthetic */ class BfQ implements InterfaceC2641BgM {
    public final /* synthetic */ AbstractC2481Bc8 A00;
    public final /* synthetic */ AbstractC2481Bc8 A01;
    public final /* synthetic */ BfN A02;
    public final /* synthetic */ BfE A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    @Override // X.InterfaceC2641BgM
    public final void AT5(C2643Bga c2643Bga, Integer num) {
        BfE bfE = this.A03;
        String str = this.A04;
        String str2 = this.A05;
        BfN bfN = this.A02;
        AbstractC2481Bc8 abstractC2481Bc8 = this.A00;
        AbstractC2481Bc8 abstractC2481Bc82 = this.A01;
        if (bfE.A0B() != null) {
            BfE.A05(bfE);
            bfE.A0U(BfE.A03(abstractC2481Bc8, abstractC2481Bc82, bfN, bfE, str, str2));
            bfE.A0N();
            BfG bfG = bfE.A0A;
            BoT.A00();
            Iterator<BfD> it = bfG.A07.iterator();
            while (it.hasNext()) {
                bfG.AX0(BV6.A0S(it));
            }
        }
    }

    public /* synthetic */ BfQ(AbstractC2481Bc8 abstractC2481Bc8, AbstractC2481Bc8 abstractC2481Bc82, BfN bfN, BfE bfE, String str, String str2) {
        this.A03 = bfE;
        this.A04 = str;
        this.A05 = str2;
        this.A02 = bfN;
        this.A00 = abstractC2481Bc8;
        this.A01 = abstractC2481Bc82;
    }
}
