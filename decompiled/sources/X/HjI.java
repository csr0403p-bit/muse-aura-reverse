package X;

import java.util.List;

/* loaded from: classes6.dex */
public final class HjI extends C06G {
    public boolean A00 = false;
    public final List<C10629Hzy> A01;
    public final List<String> A02;
    public final List<AbstractC10579HwA> A03;

    public HjI(List list, List list2, List list3) {
        this.A02 = list;
        this.A01 = list2;
        this.A03 = list3;
    }

    public final String toString() {
        List<String> list = this.A02;
        List<C10629Hzy> list2 = this.A01;
        List<AbstractC10579HwA> list3 = this.A03;
        boolean z = this.A00;
        StringBuilder sbA0f = C3cG.A0f(list, "DcpTransactionHistories(purchasedSkuHistory=");
        sbA0f.append(", purchaseHistory=");
        sbA0f.append(list2);
        sbA0f.append(", purchases=");
        sbA0f.append(list3);
        return C8j5.A0W(", quoteInputCacheHit=", sbA0f, z);
    }
}
