package X;

import java.util.List;

/* loaded from: classes4.dex */
public final class AdE implements Ae7 {
    public float A00;
    public int A01;
    public int A02;
    public boolean A03;
    public final C0910AHm<Ac3> A04;

    public static final int A00(Ae5 ae5, boolean z) {
        Ad2 ad2 = (Ad2) ae5;
        List<Ad0> list = ad2.A0D;
        if (z) {
            Ad0 ad0 = (Ad0) ((Ae6) AbstractC0878AGe.A0H(list));
            return (ad2.A09 == EnumC1108AYu.A03 ? ad0.A03 : ad0.A00) + 1;
        }
        Ad0 ad02 = (Ad0) ((Ae6) AbstractC0878AGe.A0F(list));
        return (ad2.A09 == EnumC1108AYu.A03 ? ad02.A03 : ad02.A00) - 1;
    }

    public AdE(int i) {
        this.A01 = -1;
        this.A04 = C0910AHm.A01(new Ac3[16]);
        this.A02 = -1;
    }

    public AdE() {
        this(2);
    }
}
