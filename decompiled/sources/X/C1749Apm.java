package X;

import kotlin.Unit;

/* renamed from: X.Apm, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1749Apm extends Ab8<C1750Apn> {
    public final C1Ny A00;
    public final C15X A01;
    public final G0U<ASF, Unit> A02;

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1749Apm) {
                C1749Apm c1749Apm = (C1749Apm) obj;
                if (!C7384Etj.areEqual(this.A00, c1749Apm.A00) || this.A01 != c1749Apm.A01) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        C1Ny c1Ny = this.A00;
        C15X c15x = this.A01;
        C1750Apn c1750Apn = new C1750Apn();
        c1750Apn.A01 = c1Ny;
        c1750Apn.A02 = c15x;
        c1750Apn.A00 = C8lv.A00;
        return c1750Apn;
    }

    @Override // X.Ab8
    public final int hashCode() {
        return AnonymousClass005.A0G(this.A01, AnonymousClass005.A0E(this.A00));
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        this.A02.invoke(asf);
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        C1750Apn c1750Apn = (C1750Apn) abstractC1439Aj8;
        C1Ny c1Ny = this.A00;
        C15X c15x = this.A01;
        if (C7384Etj.areEqual(c1750Apn.A01, c1Ny) && c15x == c1750Apn.A02) {
            return;
        }
        c1750Apn.A01 = c1Ny;
        c1750Apn.A02 = c15x;
        c1750Apn.A00 = new C1CH(c1Ny, ((AbstractC1748Apl) c1750Apn).A00);
        AbstractC1339AhQ.A00(c1750Apn);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/1Ny;LX/G0U<-LX/ASF;Lkotlin/Unit;>;LX/15X;)V */
    public C1749Apm(C1Ny c1Ny, C15X c15x, G0U g0u) {
        this.A00 = c1Ny;
        this.A02 = g0u;
        this.A01 = c15x;
    }
}
