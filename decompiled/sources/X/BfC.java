package X;

import java.util.Iterator;
import java.util.Set;

/* loaded from: classes5.dex */
public final class BfC implements InterfaceC2655Bgn<BfR> {
    public final /* synthetic */ Bf9 A00;

    public BfC(Bf9 bf9) {
        this.A00 = bf9;
    }

    @Override // X.InterfaceC2655Bgn
    public final /* bridge */ /* synthetic */ void AUJ(BfR bfR) {
        BfR bfR2 = bfR;
        if (bfR2 == null) {
            throw C60O.A0i("StreamInfo can't be null");
        }
        Bf9 bf9 = this.A00;
        if (bf9.A06 != C79.A0C) {
            StringBuilder sbA0x = C60O.A0x("Stream info update: old: ");
            sbA0x.append(bf9.A03);
            AbstractC2875Bni.A01("VideoCapture", AnonymousClass006.A0y(bfR2, " new: ", sbA0x));
            BfR bfR3 = bf9.A03;
            bf9.A03 = bfR2;
            AbstractC2481Bc8 abstractC2481Bc8 = ((BfD) bf9).A04;
            abstractC2481Bc8.getClass();
            C2611Bfc c2611Bfc = (C2611Bfc) bfR3;
            int i = c2611Bfc.A00;
            C2611Bfc c2611Bfc2 = (C2611Bfc) bfR2;
            int i2 = c2611Bfc2.A00;
            Set<Integer> set = BfR.A02;
            if ((!C60Q.A1W(set, i) && !C60Q.A1W(set, i2) && i != i2) || (bf9.A07 && c2611Bfc.A01 != null && c2611Bfc2.A01 == null)) {
                bf9.A0Y();
                return;
            }
            if (i == -1 ? i2 != -1 : i2 == -1) {
                bf9.A0Z(bf9.A02, abstractC2481Bc8, bfR2);
                AbstractC2390BYs.A01(bf9, bf9.A02);
                bf9.A0N();
            } else if (c2611Bfc.A02 != c2611Bfc2.A02) {
                bf9.A0Z(bf9.A02, abstractC2481Bc8, bfR2);
                AbstractC2390BYs.A01(bf9, bf9.A02);
                Iterator<InterfaceC2630Bfx> it = ((BfD) bf9).A0B.iterator();
                while (it.hasNext()) {
                    it.next().AX1(bf9);
                }
            }
        }
    }

    @Override // X.InterfaceC2655Bgn
    public final void onError(Throwable th) {
        AbstractC2875Bni.A06("VideoCapture", "Receive onError from StreamState observer", th);
    }
}
