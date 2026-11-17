package X;

/* loaded from: classes4.dex */
public abstract class B6B {
    public static final Ab2<HDj> A00;

    static {
        C10376HDg c10376HDg = HDi.A0I;
        int i = ((Hw7) c10376HDg).A00;
        int i2 = i << 6;
        int i3 = i | i2;
        B6C b6c = new B6C(c10376HDg);
        Hw7 hw7 = HDi.A02;
        HDj hDj = new HDj(c10376HDg, hw7);
        int i4 = i2 | 19;
        HDj hDj2 = new HDj(hw7, c10376HDg);
        Ab2 ab2 = AbstractC1489Ajw.A00;
        Ab2<HDj> ab2A01 = Ab2.A01();
        ab2A01.A0B(i3, b6c);
        ab2A01.A0B(i | 1216, hDj);
        ab2A01.A0B(i4, hDj2);
        A00 = ab2A01;
    }
}
