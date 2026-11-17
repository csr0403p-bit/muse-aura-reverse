package X;

import java.util.Map;

/* loaded from: classes6.dex */
public final class FYF extends AbstractC7559F3s implements G0U {
    public final int $t;
    public final Object A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FYF(Object obj, String str, HVq hVq, C9743Gew c9743Gew, Map<String, String> map, C9699Ge6 c9699Ge6) {
        super(1);
        this.$t = c9699Ge6;
        this.A04 = map;
        this.A02 = obj;
        this.A01 = str;
        this.A00 = c9743Gew;
        this.A03 = hVq;
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (2 - this.$t != 0) {
            EVS evs = (EVS) obj;
            AbstractC7607F5u.A1L(evs, this.A04);
            evs.A00((HVq) this.A02, "product_type");
            AbstractC7607F5u.A1K(evs, this.A01);
            C9699Ge6.A0B(evs, (C9699Ge6) this.A03, (Map) this.A00);
            return evs;
        }
        EVS evs2 = (EVS) obj;
        AbstractC7607F5u.A1L(evs2, this.A04);
        evs2.A00((HVq) this.A02, "product_type");
        AbstractC7607F5u.A1K(evs2, this.A01);
        C9699Ge6.A0B(evs2, (C9699Ge6) this.A03, (Map) this.A00);
        return evs2;
    }
}
