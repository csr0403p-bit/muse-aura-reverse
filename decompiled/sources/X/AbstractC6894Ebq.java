package X;

import java.io.IOException;

/* renamed from: X.Ebq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6894Ebq implements InterfaceC6834Eam {
    public boolean A00;
    public final Eb2 A01;
    public final /* synthetic */ C6863EbL A02;

    @Override // X.InterfaceC6834Eam
    public long AZ7(C6818EaW c6818EaW, long j) throws IOException {
        C7384Etj.A0Y(c6818EaW, 0);
        try {
            return this.A02.A06.AZ7(c6818EaW, j);
        } catch (IOException e) {
            this.A02.A03.A01();
            A00();
            throw e;
        }
    }

    public AbstractC6894Ebq(C6863EbL c6863EbL) {
        this.A02 = c6863EbL;
        C6848Eb1 c6848Eb1 = C6848Eb1.A03;
        C6848Eb1 c6848Eb1Ags = c6863EbL.A06.Ags();
        C7384Etj.A0Y(c6848Eb1Ags, 0);
        Eb2 eb2 = new Eb2();
        eb2.A00 = c6848Eb1Ags;
        this.A01 = eb2;
    }

    public final void A00() {
        C6863EbL c6863EbL = this.A02;
        int i = c6863EbL.A00;
        if (i != 6) {
            if (i != 5) {
                throw C3cG.A0Q(AnonymousClass006.A0y(Integer.valueOf(i), "state: ", C60O.A0w()));
            }
            Eb2 eb2 = this.A01;
            C6848Eb1 c6848Eb1 = eb2.A00;
            eb2.A00 = C6848Eb1.A03;
            c6848Eb1.A01();
            c6848Eb1.A02();
            c6863EbL.A00 = 6;
        }
    }

    @Override // X.InterfaceC6834Eam
    public final C6848Eb1 Ags() {
        return this.A01;
    }
}
