package X;

import java.io.IOException;

/* renamed from: X.Dgt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5350Dgt implements InterfaceC5229Ddn<DF3<Long>> {
    public final /* synthetic */ C5358Dh3 A00;

    @Override // X.InterfaceC5229Ddn
    public final /* bridge */ /* synthetic */ void ATu(InterfaceC5231Ddp interfaceC5231Ddp, long j, long j2) {
        DF3 df3 = (DF3) interfaceC5231Ddp;
        C5358Dh3 c5358Dh3 = this.A00;
        C5072DTn c5072DTnA00 = DF3.A00(df3, j);
        int i = df3.A00;
        C5893Dra c5893Dra = new C5893Dra(i);
        T t = df3.A05;
        C5358Dh3 c5358Dh32 = C5358Dh3.$redex_init_class;
        C6013Dtw c6013Dtw = c5358Dh3.A0P;
        C6013Dtw.A00(c6013Dtw, t, null, c5893Dra);
        c6013Dtw.A04(null, c5072DTnA00, null, i, -1, 0, -9223372036854775807L, -9223372036854775807L);
        C5358Dh3.A04(c5358Dh3, C3cG.A05(df3.A05) - j);
    }

    public C5350Dgt(C5358Dh3 c5358Dh3) {
        this.A00 = c5358Dh3;
    }

    @Override // X.InterfaceC5229Ddn
    public final /* bridge */ /* synthetic */ void ATt(InterfaceC5231Ddp interfaceC5231Ddp, long j, boolean z) {
        this.A00.A0D((DF3) interfaceC5231Ddp, j);
    }

    @Override // X.InterfaceC5229Ddn
    public final /* bridge */ /* synthetic */ C5230Ddo ATv(InterfaceC5231Ddp interfaceC5231Ddp, IOException iOException, int i, long j, long j2) {
        DF3 df3 = (DF3) interfaceC5231Ddp;
        C5358Dh3 c5358Dh3 = this.A00;
        c5358Dh3.A0P.A01(null, DF3.A00(df3, j), iOException, null, df3.A00, -1, 0, -9223372036854775807L, -9223372036854775807L, true);
        C5358Dh3.A05(c5358Dh3, iOException);
        return C5342Dgl.A03;
    }

    @Override // X.InterfaceC5229Ddn
    public final /* synthetic */ void ATx(InterfaceC5231Ddp interfaceC5231Ddp, int i, long j) {
    }
}
