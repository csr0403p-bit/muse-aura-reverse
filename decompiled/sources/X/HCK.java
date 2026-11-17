package X;

/* loaded from: classes6.dex */
public final class HCK extends Hwm {
    public int A00;
    public final Object A01;
    public final /* synthetic */ HCE A02;

    public HCK(HCE hce, int i) {
        this.A02 = hce;
        Object[] objArr = hce.A04;
        objArr.getClass();
        this.A01 = objArr[i];
        this.A00 = i;
    }

    public static final void A00(HCK hck) {
        int i = hck.A00;
        if (i != -1) {
            HCE hce = hck.A02;
            if (i < hce.size()) {
                Object obj = hck.A01;
                int i2 = hck.A00;
                Object[] objArr = hce.A04;
                objArr.getClass();
                if (AbstractC10554Hsh.A00(obj, objArr[i2])) {
                    return;
                }
            }
        }
        hck.A00 = HCE.A00(hck.A02, hck.A01);
    }
}
