package X;

import androidx.fragment.app.Fragment;
import kotlin.Unit;

/* renamed from: X.Fgc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C8578Fgc extends AbstractC8601Fh5 implements InterfaceC8627Fhb {
    public String A00;
    public boolean A01;
    public final int A02;
    public final Fragment A03;
    public final AbstractC8571FgQ A04;
    public final G0U<EnumC8596Fgy, Unit> A05;

    @Override // X.AbstractC8601Fh5
    public void A01(Fragment fragment, AbstractC8571FgQ abstractC8571FgQ) {
        C7384Etj.A0Y(fragment, 1);
        String strA0x = BV7.A0x(fragment);
        C7384Etj.A0U(strA0x);
        if (strA0x.equals(this.A00)) {
            this.A00 = null;
            if (this.A03.isAdded()) {
                this.A05.invoke(EnumC8596Fgy.A02);
            }
        }
    }

    public final void A02() {
        if (this.A01) {
            return;
        }
        this.A01 = true;
        AbstractC8571FgQ abstractC8571FgQ = this.A04;
        abstractC8571FgQ.A0T.A00.add(new FRB(this));
        abstractC8571FgQ.A0E.add(this);
    }

    /* JADX WARN: Incorrect types in method signature: (Landroidx/fragment/app/Fragment;LX/FgQ;ILX/G0U<-LX/Fgy;Lkotlin/Unit;>;)V */
    public C8578Fgc(Fragment fragment, AbstractC8571FgQ abstractC8571FgQ, G0U g0u, int i) {
        this.A03 = fragment;
        this.A04 = abstractC8571FgQ;
        this.A02 = i;
        this.A05 = g0u;
    }
}
