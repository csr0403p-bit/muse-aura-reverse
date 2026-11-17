package X;

/* loaded from: classes6.dex */
public final class HCJ extends AbstractC10582Hwn {
    public int A00;
    public final Object A01;
    public final /* synthetic */ HCD A02;

    public HCJ(HCD hcd, int i) {
        this.A02 = hcd;
        Object[] objArr = hcd.A04;
        objArr.getClass();
        this.A01 = objArr[i];
        this.A00 = i;
    }

    public static final void A00(HCJ hcj) {
        int i = hcj.A00;
        if (i != -1) {
            HCD hcd = hcj.A02;
            if (i < hcd.size()) {
                Object obj = hcj.A01;
                int i2 = hcj.A00;
                Object[] objArr = hcd.A04;
                objArr.getClass();
                if (AbstractC10555Hsi.A00(obj, objArr[i2])) {
                    return;
                }
            }
        }
        hcj.A00 = HCD.A00(hcj.A02, hcj.A01);
    }
}
