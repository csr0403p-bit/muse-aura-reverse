package X;

/* renamed from: X.Bew, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2598Bew {
    public final C2582Bee A00;

    public C2598Bew() {
        C2582Bee c2582BeeA00 = C2582Bee.A00();
        this.A00 = c2582BeeA00;
        AbstractC2531BdI<Class<?>> abstractC2531BdI = BdG.A00;
        try {
            Object objAbk = c2582BeeA00.Abk(abstractC2531BdI);
            if (objAbk != null && !objAbk.equals(C2679Bhc.class)) {
                throw BV5.A0P(objAbk, ": ", C3cG.A0f(this, "Invalid target class configuration for "));
            }
        } catch (IllegalArgumentException unused) {
        }
        C2582Bee c2582Bee = this.A00;
        c2582Bee.ANl(abstractC2531BdI, C2679Bhc.class);
        AbstractC2531BdI<String> abstractC2531BdI2 = BdG.A01;
        try {
            if (c2582Bee.Abk(abstractC2531BdI2) != null) {
                return;
            }
        } catch (IllegalArgumentException unused2) {
        }
        BV8.A1F(abstractC2531BdI2, c2582Bee, C2679Bhc.class);
    }
}
