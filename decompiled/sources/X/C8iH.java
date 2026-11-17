package X;

import kotlin.Unit;

/* renamed from: X.8iH, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C8iH implements Ht9, G0V {
    public final int $t;
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C8iH(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.$t = i2;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A00 = i;
    }

    @Override // X.G0V
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$t;
        C1HY c1hy = (C1HY) this.A01;
        Object obj3 = this.A02;
        if (i != 0) {
            C7bA.A02((BFM) obj, c1hy, (C06797bC) obj3, (G0U) this.A03, AnonymousClass011.A00(this.A00));
        } else {
            C7bA.A01((BFM) obj, c1hy, (C06787bB) obj3, (G0U) this.A03, AnonymousClass011.A00(this.A00));
        }
        return Unit.INSTANCE;
    }
}
