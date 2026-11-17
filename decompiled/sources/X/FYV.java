package X;

/* loaded from: classes6.dex */
public final class FYV extends AbstractC7559F3s implements G0U {
    public final int $t;
    public final String A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FYV(String str, int i) {
        super(1);
        this.$t = i;
        this.A00 = str;
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                C9048FxW c9048FxW = (C9048FxW) obj;
                C7384Etj.A0Y(c9048FxW, 0);
                return Boolean.valueOf(c9048FxW.A02.A05.equals(this.A00));
            case 1:
                G65 g65 = (G65) obj;
                C7384Etj.A0Y(g65, 0);
                return G66.A00(this.A00, g65);
            default:
                G65 g652 = (G65) obj;
                C7384Etj.A0Y(g652, 0);
                return G6H.A01(this.A00, g652, false);
        }
    }
}
