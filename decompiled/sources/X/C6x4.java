package X;

import kotlin.Unit;

/* renamed from: X.6x4, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6x4 extends AbstractC7559F3s implements G0V {
    public final int $t;
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        AnonymousClass005.A0w(obj2);
        C7cQ.A00((BFM) obj, (BRg) this.A03, (BNO) this.A02, (C7cR) this.A04, AnonymousClass011.A00(this.A00), this.A01);
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6x4(BRg bRg, BNO bno, C7cR c7cR, int i, int i2, int i3) {
        super(2);
        this.$t = i3;
        this.A02 = bno;
        this.A03 = bRg;
        this.A04 = c7cR;
        this.A00 = i;
        this.A01 = i2;
    }
}
