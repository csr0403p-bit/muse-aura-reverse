package X;

import java.util.List;

/* renamed from: X.Af6, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1228Af6 implements Ac4 {
    public final int A00;
    public final List<AfH> A01 = C3cG.A0h();
    public final /* synthetic */ C1229Af7 A02;

    public C1228Af6(C1229Af7 c1229Af7, int i) {
        this.A02 = c1229Af7;
        this.A00 = i;
    }

    @Override // X.Ac4
    public final void AcA(int i) {
        C1229Af7 c1229Af7 = this.A02;
        C1227Af5 c1227Af5 = c1229Af7.A03;
        if (c1227Af5 != null) {
            List<AfH> list = this.A01;
            AfB afB = c1229Af7.A05;
            AfG afG = c1227Af5.A02;
            list.add(new C1230Af8(c1227Af5, afB, afG instanceof InterfaceC1234AfO ? (InterfaceC1234AfO) afG : null, null, i));
        }
    }
}
