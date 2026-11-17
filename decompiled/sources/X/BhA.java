package X;

/* loaded from: classes5.dex */
public final class BhA implements InterfaceC2670BhE {
    public final long A00;
    public final InterfaceC2670BhE A01;

    @Override // X.InterfaceC2670BhE
    public final long ALi() {
        return this.A00;
    }

    @Override // X.InterfaceC2670BhE
    public final BhF AVa(InterfaceC2676BhQ interfaceC2676BhQ) {
        BhF bhFAVa = this.A01.AVa(interfaceC2676BhQ);
        long j = this.A00;
        return (j <= 0 || ((Bh8) interfaceC2676BhQ).A01 < j - bhFAVa.A00) ? bhFAVa : BhF.A05;
    }

    public BhA(InterfaceC2670BhE interfaceC2670BhE, long j) {
        BeS.A06(C8j3.A1Q((j > 0L ? 1 : (j == 0L ? 0 : -1))), "Timeout must be non-negative.");
        this.A00 = j;
        this.A01 = interfaceC2670BhE;
    }
}
