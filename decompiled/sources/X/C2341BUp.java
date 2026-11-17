package X;

import androidx.compose.ui.unit.Constraints;
import kotlin.Unit;

/* renamed from: X.BUp, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2341BUp extends AbstractC7559F3s implements G0V {
    public final int $t;
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2341BUp(Object obj, C1361Ahm c1361Ahm, BRg bRg, G0V<? super C3Su, ? super Constraints, ? extends InterfaceC1134Abi> g0v, int i, int i2) {
        super(2);
        this.$t = i2;
        this.A04 = c1361Ahm;
        this.A03 = obj;
        this.A02 = bRg;
        this.A00 = g0v;
        this.A01 = i;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.$t;
        BFM bfmA0P = AnonymousClass005.A0P(obj, obj2);
        switch (i) {
            case 0:
                AbstractC1360Ahl.A00(bfmA0P, (BRg) this.A03, (C1361Ahm) this.A04, (G0V) this.A02, AnonymousClass011.A00(this.A00), this.A01);
                break;
            case 1:
            case 2:
                C9WG.A01(bfmA0P, (BRg) this.A03, (C9Va) this.A02, (C9WH) this.A04, AnonymousClass011.A00(this.A00), this.A01);
                break;
            case 3:
            case 4:
                C9WG.A02(bfmA0P, (BRg) this.A03, (C9Va) this.A02, (C9WH) this.A04, AnonymousClass011.A00(this.A00), this.A01);
                break;
            case 5:
                C9W6.A00(bfmA0P, (BRg) this.A03, (C9VT) this.A02, (C9W7) this.A04, AnonymousClass011.A00(this.A00), this.A01);
                break;
            case 6:
            case 7:
                C9WM.A02(bfmA0P, (BRg) this.A03, (C9WF) this.A02, (C9WN) this.A04, AnonymousClass011.A00(this.A00), this.A01);
                break;
            default:
                C9WM.A03(bfmA0P, (BRg) this.A03, (C9WF) this.A02, (C9WN) this.A04, AnonymousClass011.A00(this.A00), this.A01);
                break;
        }
        return Unit.INSTANCE;
    }
}
