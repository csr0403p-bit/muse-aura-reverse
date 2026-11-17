package X;

/* loaded from: classes5.dex */
public final /* synthetic */ class Du6 implements InterfaceC5344Dgn {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C5072DTn A01;
    public final /* synthetic */ C5893Dra A02;
    public final /* synthetic */ C6013Dtw A03;

    @Override // X.InterfaceC5344Dgn
    public final void accept(Object obj) {
        C6013Dtw c6013Dtw = this.A03;
        ((Du7) obj).onLoadStarted(c6013Dtw.A00, c6013Dtw.A01, this.A01, this.A02, this.A00);
    }

    public /* synthetic */ Du6(C5072DTn c5072DTn, C5893Dra c5893Dra, C6013Dtw c6013Dtw, int i) {
        this.A03 = c6013Dtw;
        this.A01 = c5072DTn;
        this.A02 = c5893Dra;
        this.A00 = i;
    }
}
