package X;

/* renamed from: X.Bev, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2597Bev implements BgN<BfE, Bep, C2597Bev> {
    public final C2582Bee A00;

    @Override // X.BgG
    public final C2582Bee AHr() {
        return this.A00;
    }

    @Override // X.BgN
    public final /* bridge */ /* synthetic */ BfN AMK() {
        return new Bep(C2584Beg.A02(this.A00));
    }

    public C2597Bev(C2582Bee c2582Bee) {
        this.A00 = c2582Bee;
        AbstractC2531BdI<Class<?>> abstractC2531BdI = BdG.A00;
        try {
            Object objAbk = c2582Bee.Abk(abstractC2531BdI);
            if (objAbk != null && !objAbk.equals(BfE.class)) {
                throw BV5.A0P(objAbk, ": ", C3cG.A0f(this, "Invalid target class configuration for "));
            }
        } catch (IllegalArgumentException unused) {
        }
        this.A00.ANl(BfN.A01, EnumC2489BcG.STREAM_SHARING);
        C2582Bee c2582Bee2 = this.A00;
        c2582Bee2.ANl(abstractC2531BdI, BfE.class);
        AbstractC2531BdI<String> abstractC2531BdI2 = BdG.A01;
        try {
            if (c2582Bee2.Abk(abstractC2531BdI2) != null) {
                return;
            }
        } catch (IllegalArgumentException unused2) {
        }
        BV8.A1F(abstractC2531BdI2, c2582Bee2, BfE.class);
    }

    public C2597Bev() {
        this(C2582Bee.A00());
    }
}
