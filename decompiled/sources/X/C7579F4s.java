package X;

/* renamed from: X.F4s, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7579F4s implements InterfaceC5344Dgn {
    public final int $t;
    public final Object A00;
    public final Object A01;
    public final Object A02;

    public C7579F4s(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.A00 = obj3;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // X.InterfaceC5344Dgn
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                C6013Dtw c6013Dtw = (C6013Dtw) this.A00;
                ((Du7) obj).onLoadCompleted(c6013Dtw.A00, c6013Dtw.A01, (C5072DTn) this.A01, (C5893Dra) this.A02);
                break;
            case 1:
                C6013Dtw c6013Dtw2 = (C6013Dtw) this.A00;
                ((Du7) obj).onLoadCanceled(c6013Dtw2.A00, c6013Dtw2.A01, (C5072DTn) this.A01, (C5893Dra) this.A02);
                break;
            case 2:
                C6013Dtw c6013Dtw3 = (C6013Dtw) this.A00;
                ((Du7) obj).onUpstreamDiscarded(c6013Dtw3.A00, (Dy6) this.A01, (C5893Dra) this.A02);
                break;
            default:
                C5893Dra c5893Dra = (C5893Dra) this.A00;
                Object obj2 = this.A01;
                Object obj3 = this.A02;
                C5358Dh3 c5358Dh3 = C5358Dh3.$redex_init_class;
                ((InterfaceC5369DhL) obj).onManifestLoadCompleted(c5893Dra, obj2, obj3);
                break;
        }
    }
}
