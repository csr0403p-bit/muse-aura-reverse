package X;

import java.util.List;

/* renamed from: X.GmN, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9955GmN {
    public static final C10009Gnh[] A06 = new C10009Gnh[0];
    public EnumC8882Fsl A00;
    public List<AbstractC9958GmS> A01;
    public C10009Gnh[] A02;
    public C10009Gnh[] A03;
    public final AbstractC10024Gnx A04;
    public final boolean A05;

    /* JADX WARN: Incorrect return type in method signature: (LX/Gkh<*>;)LX/GmN; */
    public final void A00(AbstractC9901Gkh abstractC9901Gkh) {
        if (this.A03 == null) {
            AbstractC10024Gnx abstractC10024Gnx = this.A04;
            int iA0G = abstractC10024Gnx.A0G();
            if (iA0G == 0) {
                C10009Gnh[] c10009GnhArr = A06;
                this.A02 = c10009GnhArr;
                this.A03 = c10009GnhArr;
                return;
            }
            this.A02 = new C10009Gnh[iA0G];
            this.A03 = new C10009Gnh[iA0G];
            AbstractC9910Gks abstractC9910GksA02 = abstractC9901Gkh.A02();
            for (int i = 0; i < iA0G; i++) {
                C10009Gnh c10009GnhA0I = abstractC9910GksA02.A0I(abstractC10024Gnx.A0I(i));
                if (c10009GnhA0I != null && !c10009GnhA0I.A02()) {
                    this.A02[i] = c10009GnhA0I;
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("(mode=");
        sbA0x.append(this.A00);
        sbA0x.append(")");
        return C8j3.A14(this.A04, sbA0x);
    }

    public C9955GmN(EnumC8882Fsl enumC8882Fsl, AbstractC10024Gnx abstractC10024Gnx) {
        this.A04 = abstractC10024Gnx;
        this.A05 = AnonymousClass002.A1X(enumC8882Fsl);
        this.A00 = enumC8882Fsl == null ? EnumC8882Fsl.DEFAULT : enumC8882Fsl;
    }

    public final boolean A01(AbstractC9901Gkh<?> abstractC9901Gkh) {
        AbstractC9910Gks abstractC9910GksA02 = abstractC9901Gkh.A02();
        int length = this.A03.length;
        for (int i = 0; i < length; i++) {
            if (this.A02[i] == null && this.A03[i] == null && (abstractC9910GksA02 == null || abstractC9910GksA02.A06(this.A04.A0I(i)) == null)) {
                return false;
            }
        }
        return true;
    }
}
