package X;

/* renamed from: X.DgS, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5331DgS extends C5330DgR {
    public final int A00;
    public final DgQ A01;

    public C5331DgS(int i, int i2, int i3, int i4, int i5, boolean z) {
        super(i);
        this.A00 = i2;
        this.A01 = z ? new DgQ(i, i2, i3, i4, i5) : null;
    }

    @Override // X.C5330DgR, X.InterfaceC5334DgV
    public final C5333DgU AFY(C5332DgT c5332DgT, C5335DgW c5335DgW) {
        DgQ dgQ = this.A01;
        return dgQ != null ? dgQ.AFY(c5332DgT, c5335DgW) : super.AFY(c5332DgT, c5335DgW);
    }

    @Override // X.C5330DgR, X.InterfaceC5334DgV
    public final int AHm(int i) {
        DgQ dgQ = this.A01;
        return dgQ != null ? dgQ.AHm(i) : super.AHm(i);
    }
}
