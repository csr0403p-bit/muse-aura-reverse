package X;

import kotlin.Unit;

/* loaded from: classes4.dex */
public final class BTT implements Ht9, G0U {
    public final int $t;
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public BTT(Object obj, Object obj2, Object obj3, int i, int i2, int i3) {
        this.$t = i3;
        this.A02 = obj3;
        this.A03 = obj;
        this.A00 = i;
        this.A01 = i2;
        this.A04 = obj2;
    }

    @Override // X.G0U
    public final Object invoke(Object obj) {
        C1983Avo c1983Avo;
        AbstractC2062AxZ abstractC2062AxZ;
        if (this.$t != 0) {
            ATn aTn = (ATn) this.A02;
            int i = this.A00;
            AZE aze = (AZE) this.A03;
            ((AYU) obj).A0B(aze, 0.0f, aTn.A01.invoke(BL4.A00(AnonymousClass007.A0C(i - aze.A01, this.A01 - aze.A00)), ((C3TF) this.A04).getLayoutDirection()).A00);
        } else {
            AZE[] azeArr = (AZE[]) this.A02;
            C1977Avi c1977Avi = (C1977Avi) this.A03;
            int i2 = this.A00;
            int i3 = this.A01;
            int[] iArr = (int[]) this.A04;
            AYU ayu = (AYU) obj;
            int length = azeArr.length;
            int i4 = 0;
            int i5 = 0;
            while (i4 < length) {
                AZE aze2 = azeArr[i4];
                int i6 = i5 + 1;
                C7384Etj.A0X(aze2);
                Object objAIX = aze2.AIX();
                ayu.A0A(aze2, 0.0f, iArr[i5], (!(objAIX instanceof C1983Avo) || (c1983Avo = (C1983Avo) objAIX) == null || (abstractC2062AxZ = c1983Avo.A01) == null) ? c1977Avi.A00.A4A(aze2.A00, i2) : abstractC2062AxZ.A00(aze2, EnumC1820Arj.A02, i2, aze2.A00, i3));
                i4++;
                i5 = i6;
            }
        }
        return Unit.INSTANCE;
    }
}
