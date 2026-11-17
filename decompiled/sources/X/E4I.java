package X;

import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;

/* loaded from: classes5.dex */
public final class E4I {
    public int A00;
    public String A01;
    public final int A02;
    public final int A03;
    public final String A04;

    public static void A02(E4I e4i) {
        if (e4i.A00 == Integer.MIN_VALUE) {
            throw C3cG.A0Q("generateNewId() must be called before retrieving ids.");
        }
    }

    public final void A03() {
        int i = this.A00;
        int i2 = i == Integer.MIN_VALUE ? this.A02 : i + this.A03;
        this.A00 = i2;
        this.A01 = FGI.A0H(this.A04, i2);
    }

    public E4I(int i, int i2, int i3) {
        this.A04 = i != Integer.MIN_VALUE ? FGI.A08(i, CustomConnectorRegisterRepositoryKt.ROOT_PATH) : "";
        this.A02 = i2;
        this.A03 = i3;
        this.A00 = Integer.MIN_VALUE;
        this.A01 = "";
    }

    public static InterfaceC5563Dkg A00(InterfaceC6413E4p interfaceC6413E4p, E4I e4i) {
        A02(e4i);
        return interfaceC6413E4p.AhC(e4i.A00, 1);
    }

    public static String A01(E4I e4i) {
        e4i.A03();
        A02(e4i);
        return e4i.A01;
    }
}
