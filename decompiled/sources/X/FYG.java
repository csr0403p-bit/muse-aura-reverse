package X;

import java.util.Map;

/* loaded from: classes6.dex */
public final class FYG extends AbstractC7559F3s implements G0U {
    public final int $t;
    public final Object A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FYG(C9749Gf2 c9749Gf2, C9699Ge6 c9699Ge6, String str, C9749Gf2 c9749Gf22, Map<String, String> map) {
        super(1);
        this.$t = map;
        this.A02 = c9699Ge6;
        this.A03 = str;
        this.A01 = c9749Gf2;
        this.A00 = c9749Gf22;
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        EVS evs = (EVS) obj;
        AbstractC7607F5u.A1L(evs, ((C9699Ge6) this.A02).A0B);
        HVr.A01(evs, this.A03);
        AbstractC7607F5u.A1K(evs, this.A01);
        evs.A04((Map) this.A00);
        return evs;
    }
}
