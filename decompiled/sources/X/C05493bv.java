package X;

import kotlin.Unit;

/* renamed from: X.3bv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C05493bv extends AbstractC7559F3s implements G0V {
    public final int $t;
    public final float A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05493bv(int i, float f, long j, BRg bRg, int i2, int i3) {
        super(2);
        this.$t = i3;
        this.A04 = bRg;
        if (i3 != 0) {
            this.A03 = j;
            this.A00 = f;
        } else {
            this.A00 = f;
            this.A03 = j;
        }
        this.A01 = i;
        this.A02 = i2;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.$t;
        BFM bfmA0P = AnonymousClass005.A0P(obj, obj2);
        BRg bRg = (BRg) this.A04;
        if (i != 0) {
            AbstractC1045ASp.A00(this.A00, this.A03, bRg, bfmA0P, AnonymousClass011.A00(this.A01), this.A02);
        } else {
            C0xs.A00(this.A00, this.A03, bRg, bfmA0P, AnonymousClass011.A00(this.A01), this.A02);
        }
        return Unit.INSTANCE;
    }
}
