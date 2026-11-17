package X;

/* renamed from: X.Diz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5464Diz extends AbstractC5562Dkf {
    public final /* synthetic */ C5426DiN A00;
    public final /* synthetic */ C5490DjS A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5464Diz(C5426DiN c5426DiN, InterfaceC5563Dkg interfaceC5563Dkg, C5490DjS c5490DjS) {
        super(interfaceC5563Dkg);
        this.A00 = c5426DiN;
        this.A01 = c5490DjS;
    }

    @Override // X.AbstractC5562Dkf, X.InterfaceC5563Dkg
    public final void Abz(DjB djB, int i, int i2, int i3, long j) {
        int i4;
        int i5;
        C5426DiN c5426DiN = this.A00;
        synchronized (c5426DiN) {
            i4 = c5426DiN.A00 + c5426DiN.A02;
        }
        super.Abz(djB, i, i2, i3, j);
        synchronized (c5426DiN) {
            i5 = c5426DiN.A00 + c5426DiN.A02;
        }
        if (i5 > i4) {
            C5490DjS c5490DjS = this.A01;
            long j2 = j + c5490DjS.A01;
            int i6 = c5490DjS.A03;
            if ((i & 1) != 0) {
                long[] jArr = c5490DjS.A02;
                if (i6 < jArr.length) {
                    jArr[i6] = j2;
                    c5490DjS.A03 = i6 + 1;
                }
            }
            if (c5490DjS.A05 == -9223372036854775807L) {
                c5490DjS.A04 = j2;
            } else {
                if (j2 < c5490DjS.A04) {
                    c5490DjS.A04 = j2;
                }
                if (j2 <= c5490DjS.A05) {
                    return;
                }
            }
            c5490DjS.A05 = j2;
        }
    }
}
