package X;

import kotlin.Unit;

/* renamed from: X.BUe, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2330BUe extends AbstractC7559F3s implements G0V {
    public final int $t;
    public final int A00;
    public final Object A01;

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        BFM bfmA0P;
        AbstractC1718Ap2 abstractC1718Ap2;
        switch (this.$t) {
            case 0:
                AP9.A00(AnonymousClass005.A0P(obj, obj2), (G2j) this.A01, AnonymousClass011.A00(this.A00));
                break;
            case 1:
                bfmA0P = AnonymousClass005.A0P(obj, obj2);
                abstractC1718Ap2 = (AbstractC1718Ap2) this.A01;
                abstractC1718Ap2.A0E(bfmA0P, AnonymousClass011.A00(this.A00));
                break;
            case 2:
                bfmA0P = AnonymousClass005.A0P(obj, obj2);
                abstractC1718Ap2 = (AbstractC1718Ap2) this.A01;
                abstractC1718Ap2.A0E(bfmA0P, AnonymousClass011.A00(this.A00));
                break;
            case 3:
                bfmA0P = AnonymousClass005.A0P(obj, obj2);
                abstractC1718Ap2 = (AbstractC1718Ap2) this.A01;
                abstractC1718Ap2.A0E(bfmA0P, AnonymousClass011.A00(this.A00));
                break;
            case 4:
                bfmA0P = AnonymousClass005.A0P(obj, obj2);
                abstractC1718Ap2 = (AbstractC1718Ap2) this.A01;
                abstractC1718Ap2.A0E(bfmA0P, AnonymousClass011.A00(this.A00));
                break;
            case 5:
                AbstractC07499Wh.A03(AnonymousClass005.A0P(obj, obj2), (C07509Wi) this.A01, AnonymousClass011.A00(this.A00));
                break;
            case 6:
                BFM bfm = (BFM) obj;
                int iA0F = AnonymousClass001.A0F(obj2);
                if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA0F & 3, 2), bfm, iA0F)) {
                    bfm.Afo();
                    break;
                } else {
                    String strA01 = AbstractC2271BQs.A01(bfm, this.A00);
                    C07509Wi c07509Wi = (C07509Wi) this.A01;
                    AbstractC07499Wh.A02(bfm, AbstractC07539Wl.A00(BRg.A00, "place_actions_call_glyph_fallback"), c07509Wi, strA01, 3072, 0, c07509Wi.A07);
                    break;
                }
            case 7:
                C9W6.A02(AnonymousClass005.A0P(obj, obj2), (C9W7) this.A01, AnonymousClass011.A00(this.A00));
                break;
            case 8:
                C9W6.A03(AnonymousClass005.A0P(obj, obj2), (C9W7) this.A01, AnonymousClass011.A00(this.A00));
                break;
            default:
                BPD.A00((G0V) this.A01, AnonymousClass005.A0P(obj, obj2), AnonymousClass011.A00(this.A00));
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2330BUe(C07509Wi c07509Wi, int i, int i2) {
        super(2);
        this.$t = i2;
        if (5 - i2 != 0) {
            this.A00 = i;
            this.A01 = c07509Wi;
        } else {
            this.A01 = c07509Wi;
            this.A00 = i;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2330BUe(Object obj, int i, int i2) {
        super(2);
        this.$t = i2;
        this.A01 = obj;
        this.A00 = i;
    }
}
