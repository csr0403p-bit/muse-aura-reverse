package X;

import androidx.compose.ui.unit.Constraints;

/* renamed from: X.Ahg, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1355Ahg extends AbstractC1383AiD {
    public final /* synthetic */ C1354Ahf A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1355Ahg(C1354Ahf c1354Ahf) {
        super(c1354Ahf);
        this.A00 = c1354Ahf;
    }

    @Override // X.C3TG
    public final AZE AQW(long j) {
        C1354Ahf c1354Ahf = this.A00;
        A0X(j);
        c1354Ahf.A03 = new Constraints(j);
        InterfaceC1356Ahh interfaceC1356Ahh = c1354Ahf.A01;
        AbstractC1387AiH abstractC1387AiH = ((AbstractC1387AiH) c1354Ahf).A08;
        C7384Etj.A0X(abstractC1387AiH);
        AbstractC1383AiD abstractC1383AiDA0l = abstractC1387AiH.A0l();
        C7384Etj.A0X(abstractC1383AiDA0l);
        AbstractC1383AiD.A02(interfaceC1356Ahh.AQV(this, abstractC1383AiDA0l, j), this);
        return this;
    }
}
