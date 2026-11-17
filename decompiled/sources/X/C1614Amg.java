package X;

/* renamed from: X.Amg, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1614Amg implements InterfaceC1601AmT {
    public final AmE A00;
    public final AmE A01;
    public final C1589AmG A02;
    public final C1589AmG A03;
    public final InterfaceC1601AmT[] A04;

    @Override // X.InterfaceC1601AmT
    public final AmE ACz() {
        return this.A00;
    }

    @Override // X.InterfaceC1601AmT
    public final C1589AmG AH2() {
        return this.A02;
    }

    @Override // X.InterfaceC1601AmT
    public final C1589AmG AJp() {
        return this.A03;
    }

    @Override // X.InterfaceC1601AmT
    public final AmE ALo() {
        return this.A01;
    }

    public final String toString() {
        return BFI.A0B(", ", "innermostOf(", ")", null, this.A04);
    }

    public C1614Amg(InterfaceC1601AmT[] interfaceC1601AmTArr) {
        this.A04 = interfaceC1601AmTArr;
        int length = interfaceC1601AmTArr.length;
        C1589AmG[] c1589AmGArr = new C1589AmG[length];
        for (int i = 0; i < length; i++) {
            c1589AmGArr[i] = interfaceC1601AmTArr[i].AH2();
        }
        this.A02 = new C1589AmG(new BUZ(c1589AmGArr, 8));
        AmE[] amEArr = new AmE[length];
        for (int i2 = 0; i2 < length; i2++) {
            amEArr[i2] = interfaceC1601AmTArr[i2].ALo();
        }
        this.A01 = new AmE(new BUZ(amEArr, 3));
        C1589AmG[] c1589AmGArr2 = new C1589AmG[length];
        for (int i3 = 0; i3 < length; i3++) {
            c1589AmGArr2[i3] = interfaceC1601AmTArr[i3].AJp();
        }
        this.A03 = new C1589AmG(new BUZ(c1589AmGArr2, 9));
        AmE[] amEArr2 = new AmE[length];
        for (int i4 = 0; i4 < length; i4++) {
            amEArr2[i4] = interfaceC1601AmTArr[i4].ACz();
        }
        this.A00 = new AmE(new BUZ(amEArr2, 4));
    }
}
