package X;

import java.io.IOException;

/* loaded from: classes5.dex */
public final /* synthetic */ class Du5 implements InterfaceC5344Dgn {
    public final /* synthetic */ C5072DTn A00;
    public final /* synthetic */ C5893Dra A01;
    public final /* synthetic */ C6013Dtw A02;
    public final /* synthetic */ IOException A03;
    public final /* synthetic */ boolean A04;

    @Override // X.InterfaceC5344Dgn
    public final void accept(Object obj) {
        C6013Dtw c6013Dtw = this.A02;
        ((Du7) obj).onLoadError(c6013Dtw.A00, c6013Dtw.A01, this.A00, this.A01, this.A03, this.A04);
    }

    public /* synthetic */ Du5(C5072DTn c5072DTn, C5893Dra c5893Dra, C6013Dtw c6013Dtw, IOException iOException, boolean z) {
        this.A02 = c6013Dtw;
        this.A00 = c5072DTn;
        this.A01 = c5893Dra;
        this.A03 = iOException;
        this.A04 = z;
    }
}
