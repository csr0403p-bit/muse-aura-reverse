package X;

import android.util.Range;

/* renamed from: X.BbQ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2437BbQ implements InterfaceC2436BbP {
    public final InterfaceC2436BbP A00;

    @Override // X.InterfaceC2436BbP
    public final boolean A5v() {
        return this.A00.A5v();
    }

    @Override // X.InterfaceC2436BbP
    public final int AGE() {
        return this.A00.AMl();
    }

    @Override // X.InterfaceC2436BbP
    public final Range<Integer> ALK() {
        return this.A00.ALK();
    }

    @Override // X.InterfaceC2436BbP
    public final Range<Integer> ALM() {
        return this.A00.ALR();
    }

    @Override // X.InterfaceC2436BbP
    public final Range<Integer> ALN(int i) {
        return this.A00.ALS(i);
    }

    @Override // X.InterfaceC2436BbP
    public final Range<Integer> ALR() {
        return this.A00.ALM();
    }

    @Override // X.InterfaceC2436BbP
    public final Range<Integer> ALS(int i) {
        return this.A00.ALN(i);
    }

    @Override // X.InterfaceC2436BbP
    public final int AMl() {
        return this.A00.AGE();
    }

    @Override // X.InterfaceC2436BbP
    public final boolean AP3(int i, int i2) {
        return this.A00.AP3(i2, i);
    }

    public C2437BbQ(InterfaceC2436BbP interfaceC2436BbP) {
        BeS.A05(interfaceC2436BbP.A5v());
        this.A00 = interfaceC2436BbP;
    }
}
