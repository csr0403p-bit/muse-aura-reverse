package X;

import androidx.compose.ui.Alignment;

/* loaded from: classes4.dex */
public final class ATo extends Ab8<ATn> {
    public final Integer A00;
    public final G0V<BL4, EnumC1820Arj, C2ae> A01;
    public final boolean A02;
    public final Object A03;
    public final String A04;

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                ATo aTo = (ATo) obj;
                if (this.A00 != aTo.A00 || this.A02 != aTo.A02 || !C7384Etj.areEqual(this.A03, aTo.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public static final ATo A00(C3TH c3th, boolean z) {
        return new ATo(C79.A01, c3th, "wrapContentWidth", new C2296BSw(c3th, 1), z);
    }

    public static final ATo A01(C1AC c1ac, boolean z) {
        return new ATo(C79.A00, c1ac, "wrapContentHeight", new C2296BSw(c1ac, 2), z);
    }

    public static final ATo A02(Alignment alignment, boolean z) {
        return new ATo(C79.A0C, alignment, "wrapContentSize", new C2296BSw(alignment, 3), z);
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        Integer num = this.A00;
        boolean z = this.A02;
        G0V<BL4, EnumC1820Arj, C2ae> g0v = this.A01;
        ATn aTn = new ATn();
        aTn.A00 = num;
        aTn.A02 = z;
        aTn.A01 = g0v;
        return aTn;
    }

    @Override // X.Ab8
    public final int hashCode() {
        return AnonymousClass005.A0G(this.A03, C0KA.A01(ATp.A00(this.A00) * 31, this.A02));
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        asf.A01 = this.A04;
        BHD bhd = asf.A02;
        bhd.A01("align", this.A03);
        bhd.A01("unbounded", Boolean.valueOf(this.A02));
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        ATn aTn = (ATn) abstractC1439Aj8;
        aTn.A00 = this.A00;
        aTn.A02 = this.A02;
        aTn.A01 = this.A01;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/ATp;ZLX/G0V<-LX/BL4;-LX/Arj;LX/2ae;>;Ljava/lang/Object;Ljava/lang/String;)V */
    public ATo(Integer num, Object obj, String str, G0V g0v, boolean z) {
        this.A00 = num;
        this.A02 = z;
        this.A01 = g0v;
        this.A03 = obj;
        this.A04 = str;
    }
}
