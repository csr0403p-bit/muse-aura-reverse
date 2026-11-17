package X;

import com.facebook.aura.pairs.PairsDiscretionDocument;

/* renamed from: X.9sc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC07969sc {
    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(LX/9sU;LX/9t6;LX/9hv<-TT;>;TT;)V */
    public static final void A00(Object obj, C9hv c9hv, final C9sU c9sU, final C9t6 c9t6) {
        new C9sQ(c9sU, c9sU.A00.A0D ? new C08029sl(c9sU, c9t6) { // from class: X.9sp
            public int A00;
            public final C9sU A01;

            @Override // X.C08029sl
            public final void A00() {
                super.A00 = true;
                this.A00++;
            }

            @Override // X.C08029sl
            public final void A01() {
                super.A00 = false;
                C9t6 c9t62 = super.A01;
                c9t62.Aia(PairsDiscretionDocument.TERMINATOR);
                int i = this.A00;
                for (int i2 = 0; i2 < i; i2++) {
                    String str = this.A01.A00.A02;
                    C7384Etj.A0Y(str, 0);
                    c9t62.Aia(str);
                }
            }

            @Override // X.C08029sl
            public final void A02() {
                if (super.A00) {
                    super.A00 = false;
                } else {
                    A01();
                }
            }

            @Override // X.C08029sl
            public final void A03() {
                super.A01.Aig(' ');
            }

            @Override // X.C08029sl
            public final void A04() {
                this.A00--;
            }

            {
                super(c9t6);
                this.A01 = c9sU;
            }
        } : new C08029sl(c9t6), C9sh.A04, new C9i4[C9sh.A00.size()]).AAR(obj, c9hv);
    }
}
