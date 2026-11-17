package X;

import kotlin.Unit;

/* renamed from: X.1j6, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1j6 extends AbstractC7559F3s implements G0V {
    public final int $t;
    public final int A00;
    public final int A01;
    public final long A02;
    public final Object A03;
    public final Object A04;
    public final String A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1j6(Object obj, Object obj2, String str, int i, int i2, int i3, long j) {
        super(2);
        this.$t = i3;
        this.A04 = obj2;
        this.A05 = str;
        this.A03 = obj;
        this.A02 = j;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.$t;
        BFM bfmA0P = AnonymousClass005.A0P(obj, obj2);
        if (i != 0) {
            AVy aVy = (AVy) this.A04;
            String str = this.A05;
            C10F.A00(bfmA0P, (BRg) this.A03, aVy, str, AnonymousClass011.A00(this.A00), this.A01, this.A02);
        } else {
            B0q b0q = (B0q) this.A03;
            String str2 = this.A05;
            C10F.A01(bfmA0P, (BRg) this.A04, b0q, str2, AnonymousClass011.A00(this.A00), this.A01, this.A02);
        }
        return Unit.INSTANCE;
    }
}
