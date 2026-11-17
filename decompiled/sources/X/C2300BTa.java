package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.BTa, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2300BTa implements Ht9, G0V {
    public final int $t;
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    @Override // X.G0V
    public final Object invoke(Object obj, Object obj2) {
        if (this.$t != 0) {
            BRg bRg = (BRg) this.A02;
            C1940Aud c1940Aud = (C1940Aud) this.A03;
            G0U g0u = (G0U) this.A04;
            G0V g0v = (G0V) this.A05;
            int i = this.A00;
            AbstractC1913AtY.A00(c1940Aud, (BFM) obj, bRg, g0u, g0v, AnonymousClass011.A00(i), this.A01);
        } else {
            Function0 function0 = (Function0) this.A02;
            BRg bRg2 = (BRg) this.A03;
            C1229Af7 c1229Af7 = (C1229Af7) this.A04;
            InterfaceC1118Aai interfaceC1118Aai = (InterfaceC1118Aai) this.A05;
            int i2 = this.A00;
            AbS.A00(interfaceC1118Aai, c1229Af7, (BFM) obj, bRg2, function0, AnonymousClass011.A00(i2), this.A01);
        }
        return Unit.INSTANCE;
    }

    public C2300BTa(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2, int i3) {
        this.$t = i3;
        this.A02 = obj4;
        this.A03 = obj3;
        this.A04 = obj2;
        this.A05 = obj;
        this.A00 = i;
        this.A01 = i2;
    }
}
