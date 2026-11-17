package X;

/* renamed from: X.DkR, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5548DkR implements InterfaceC5509Djl {
    public final InterfaceC5509Djl A00;
    public final /* synthetic */ InterfaceC5509Djl A01;
    public final /* synthetic */ C5549DkS A02;

    public C5548DkR(InterfaceC5509Djl interfaceC5509Djl, InterfaceC5509Djl interfaceC5509Djl2, C5549DkS c5549DkS) {
        this.A01 = interfaceC5509Djl2;
        this.A02 = c5549DkS;
        this.A00 = interfaceC5509Djl;
    }

    @Override // X.InterfaceC5509Djl
    public final long AEy() {
        return this.A00.AEy();
    }

    @Override // X.InterfaceC5509Djl
    public final DkQ AK7(long j) {
        DkQ dkQAK7 = this.A01.AK7(j);
        E29 e29 = dkQAK7.A00;
        long j2 = e29.A01;
        long j3 = e29.A00;
        long j4 = this.A02.A00;
        E29 e292 = new E29(j2, j3 + j4);
        E29 e293 = dkQAK7.A01;
        return DkQ.A00(e292, e293.A01, e293.A00 + j4);
    }

    @Override // X.InterfaceC5509Djl
    public final boolean isSeekable() {
        return this.A00.isSeekable();
    }
}
