package X;

/* loaded from: classes4.dex */
public final class Ai9 extends AbstractC1383AiD {
    public final /* synthetic */ Ai8 A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ai9(Ai8 ai8) {
        super(ai8);
        this.A00 = ai8;
    }

    @Override // X.AbstractC1383AiD
    public final void A0j() {
        C1455AjO c1455AjO = ((AbstractC1383AiD) this).A05.A0P.A0d.A04;
        C7384Etj.A0X(c1455AjO);
        c1455AjO.A0d();
    }

    @Override // X.C3TG
    public final AZE AQW(long j) {
        A0X(j);
        C1453AjM c1453AjM = ((AbstractC1383AiD) this).A05.A0P;
        C0910AHm<C1453AjM> c0910AHmA0D = c1453AjM.A0D();
        C1453AjM[] c1453AjMArr = c0910AHmA0D.A01;
        int i = c0910AHmA0D.A00;
        for (int i2 = 0; i2 < i; i2++) {
            C1455AjO c1455AjO = c1453AjMArr[i2].A0d.A04;
            C7384Etj.A0X(c1455AjO);
            c1455AjO.A07 = C79.A0C;
        }
        AbstractC1383AiD.A02(c1453AjM.A09.mo7measure3p2s80s(this, c1453AjM.A0G(), j), this);
        return this;
    }
}
