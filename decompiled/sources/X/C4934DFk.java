package X;

import java.util.Random;

/* renamed from: X.DFk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4934DFk {
    public static C4934DFk A05;
    public int A00;
    public final long A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public static final String A07 = C4934DFk.class.getName();
    public static final Random A06 = new Random();

    public C4934DFk(int i, long j, boolean z, boolean z2, boolean z3) {
        this.A00 = i;
        this.A02 = z;
        this.A03 = z2;
        this.A01 = j;
        this.A04 = z3;
    }

    public static final C4934DFk A00() {
        C4934DFk c4934DFk = A05;
        if (c4934DFk == null) {
            DGH dgh = new DGH();
            dgh.A01 = true;
            dgh.A00 = 1;
            c4934DFk = new C4934DFk(dgh);
            A05 = c4934DFk;
        }
        C7384Etj.A0X(c4934DFk);
        return c4934DFk;
    }

    public final String toString() {
        String str = A07;
        int i = this.A00;
        String strA00 = C8j2.A00(23);
        return FGI.A0l(str, C6tn.A05(FGI.A0I("\n            \n            SamplingRate: ", i, strA00)), FGI.A0r("\nHasUserConfig: ", this.A02), C6tn.A05(FGI.A0q("\n            \n            InUserConfig: ", strA00, this.A03)), C6tn.A05(FGI.A0q("\n            \n            InSessionlessConfig: ", strA00, false)), FGI.A0B(this.A01, "\nCollectionControlChecksum: "), FGI.A0r("\nRequiresCollectionControlCheck: ", this.A04), FGI.A0r("\nPlatformSamplingEnabled: ", false));
    }

    public C4934DFk(DGH dgh) {
        this.A00 = dgh.A00;
        this.A02 = dgh.A01;
        this.A03 = dgh.A02;
        this.A01 = 0L;
        this.A04 = false;
    }
}
