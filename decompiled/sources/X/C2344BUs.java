package X;

import androidx.compose.foundation.lazy.LazyListState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.BUs, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2344BUs extends AbstractC7559F3s implements G0V {
    public final int $t;
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2344BUs(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2, int i3) {
        super(2);
        this.$t = i3;
        this.A03 = obj4;
        this.A04 = obj2;
        this.A02 = obj3;
        this.A06 = obj5;
        this.A05 = obj;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                BFM bfmA0P = AnonymousClass005.A0P(obj, obj2);
                AFR afr = (AFR) this.A06;
                C9V8.A00(bfmA0P, (BRg) this.A03, (ALE) this.A02, afr, (G0U) this.A04, (G0U) this.A05, AnonymousClass011.A00(this.A00), this.A01);
                break;
            case 1:
                BFM bfmA0P2 = AnonymousClass005.A0P(obj, obj2);
                Function0 function0 = (Function0) this.A05;
                AbstractC07499Wh.A00(bfmA0P2, (BRg) this.A04, (C1EQ) this.A03, (C07509Wi) this.A06, function0, (G0W) this.A02, AnonymousClass011.A00(this.A00), this.A01);
                break;
            default:
                BFM bfmA0P3 = AnonymousClass005.A0P(obj, obj2);
                C07389Vo c07389Vo = (C07389Vo) this.A03;
                C9Vw.A00((LazyListState) this.A05, bfmA0P3, (BRg) this.A04, (InterfaceC07449Vz) this.A02, c07389Vo, (C07429Vx) this.A06, AnonymousClass011.A00(this.A00), this.A01);
                break;
        }
        return Unit.INSTANCE;
    }
}
