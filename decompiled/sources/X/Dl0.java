package X;

import java.util.List;

/* loaded from: classes5.dex */
public final class Dl0 extends Dl3 {
    public final DlL A00;
    public final C7408Eum A01;
    public final C7408Eum A02;
    public final boolean A03;

    /* JADX WARN: Illegal instructions before constructor call */
    public Dl0(DlL dlL, C5325DgJ c5325DgJ, DlJ dlJ, C7408Eum c7408Eum, C7408Eum c7408Eum2, long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2) {
        List<DlF> list;
        int i;
        long j8;
        if (dlJ != null) {
            list = dlJ.A02;
            i = dlJ.A00;
            j8 = dlJ.A01;
        } else {
            list = null;
            i = 0;
            j8 = 0;
        }
        super(c5325DgJ, list, i, j, j2, j3, j4, j5, j6, j7, j8);
        this.A01 = c7408Eum;
        this.A02 = c7408Eum2;
        this.A00 = dlL;
        if (dlL != null && z) {
            this.A06.getClass();
        }
        this.A03 = z2;
    }
}
