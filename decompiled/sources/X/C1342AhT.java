package X;

/* renamed from: X.AhT, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1342AhT {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final AXI<C0912AHo<C1340AhR>> A04;
    public final C0912AHo<AbstractC1439Aj8> A05 = C0912AHo.A00();
    public final C1343AhU A06 = new C1343AhU();
    public final InterfaceC1497Ak4 A07;

    public static final void A00(AbstractC1439Aj8 abstractC1439Aj8, C1342AhT c1342AhT) {
        if (c1342AhT.A02) {
            c1342AhT.A03 = true;
            c1342AhT.A05.A09(abstractC1439Aj8);
            return;
        }
        C1343AhU c1343AhU = c1342AhT.A06;
        C0912AHo<C1343AhU> c0912AHo = c1343AhU.A00;
        c0912AHo.A06();
        c0912AHo.A09(c1343AhU);
        while (true) {
            int i = ((AbstractC0913AHp) c0912AHo).A00;
            if (i == 0) {
                return;
            }
            C1343AhU c1343AhUA05 = c0912AHo.A05(i - 1);
            int i2 = 0;
            while (true) {
                C0910AHm<C1340AhR> c0910AHm = c1343AhUA05.A01;
                if (i2 < c0910AHm.A00) {
                    C1340AhR c1340AhR = c0910AHm.A01[i2];
                    if (c1340AhR.A06.equals(abstractC1439Aj8)) {
                        c0910AHm.A0I(c1340AhR);
                        c1340AhR.A00();
                    } else {
                        c0912AHo.A09(c1340AhR);
                        i2++;
                    }
                }
            }
        }
    }

    public final void A01() {
        if (this.A00) {
            this.A00 = true;
        } else {
            this.A06.A01.A09();
        }
    }

    public C1342AhT(InterfaceC1497Ak4 interfaceC1497Ak4) {
        this.A07 = interfaceC1497Ak4;
        AXI<C0912AHo<C1340AhR>> axi = new AXI<>();
        C0918AHu c0918AHu = AbstractC0977AKq.A00;
        AXI.A04(axi, 11);
        this.A04 = axi;
    }
}
