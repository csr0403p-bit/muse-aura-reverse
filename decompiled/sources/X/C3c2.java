package X;

import androidx.compose.ui.unit.Constraints;
import kotlin.Unit;

/* renamed from: X.3c2, reason: invalid class name */
/* loaded from: classes.dex */
public final class C3c2 extends AbstractC7559F3s implements G0V {
    public final int $t;
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C3c2(Object obj, BRg bRg, G0V<? super C3Su, ? super Constraints, ? extends InterfaceC1134Abi> g0v, int i, int i2) {
        super(2);
        this.$t = i2;
        this.A03 = obj;
        this.A02 = g0v;
        this.A00 = bRg;
        this.A01 = i;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.$t;
        BFM bfmA0P = AnonymousClass005.A0P(obj, obj2);
        switch (i) {
            case 0:
                C1XA.A0D((G0U) this.A03, (BRg) this.A02, bfmA0P, this.A01, AnonymousClass011.A00(this.A00));
                break;
            case 1:
                AbstractC1360Ahl.A01((BRg) this.A03, (G0V) this.A02, bfmA0P, AnonymousClass011.A00(this.A00), this.A01);
                break;
            default:
                C0n6.A01((BRg) this.A03, (G0V) this.A02, bfmA0P, AnonymousClass011.A00(this.A00), this.A01);
                break;
        }
        return Unit.INSTANCE;
    }
}
