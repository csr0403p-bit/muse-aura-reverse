package X;

import java.util.Random;

/* renamed from: X.DFj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4933DFj implements DGI {
    public static C4934DFk A02;
    public static C4934DFk A03;
    public final C4oT A00;
    public final Random A01;

    public C4933DFj(C4oT c4oT) {
        C7384Etj.A0Y(c4oT, 0);
        this.A00 = c4oT;
        this.A01 = new Random();
    }

    @Override // X.DGI
    public final C4934DFk shouldLog(String str) {
        DGH dgh;
        C4934DFk c4934DFk;
        C7384Etj.A0Y(str, 0);
        C4oT c4oT = this.A00;
        int i = c4oT.getInt(str, -2);
        if (i != -2) {
            if (i == -1) {
                c4934DFk = A03;
                if (c4934DFk == null) {
                    DGH dgh2 = new DGH();
                    dgh2.A00 = 0;
                    dgh2.A01 = true;
                    dgh2.A02 = true;
                    c4934DFk = new C4934DFk(dgh2);
                    A03 = c4934DFk;
                }
            } else if (i <= 0) {
                CFK.A0H("DefaultSamplingPolicy", "Invalid probability %d for event %s.", Integer.valueOf(i), str);
                c4934DFk = A02;
                if (c4934DFk == null) {
                    DGH dgh3 = new DGH();
                    dgh3.A00 = 1;
                    dgh3.A01 = true;
                    dgh3.A02 = true;
                    c4934DFk = new C4934DFk(dgh3);
                    A02 = c4934DFk;
                }
            } else {
                dgh = new DGH();
                dgh.A01 = true;
                dgh.A02 = true;
                dgh.A00 = i;
            }
            C7384Etj.A0X(c4934DFk);
            return c4934DFk;
        }
        dgh = new DGH();
        dgh.A00 = 1;
        dgh.A02 = false;
        if (c4oT.contains("_checksum")) {
            dgh.A01 = true;
        } else {
            dgh.A01 = false;
        }
        return new C4934DFk(dgh);
    }
}
