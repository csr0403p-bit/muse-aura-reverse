package X;

import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.Unit;

/* renamed from: X.BUo, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2340BUo extends AbstractC7559F3s implements G0V {
    public final int $t;
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2340BUo(Object obj, InterfaceC1464AjX interfaceC1464AjX, C0jP c0jP, G0V<? super BFM, ? super Integer, Unit> g0v, int i) {
        super(2);
        this.$t = i;
        this.A02 = obj;
        this.A03 = interfaceC1464AjX;
        this.A01 = c0jP;
        this.A00 = g0v;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.$t;
        BFM bfmA0P = AnonymousClass005.A0P(obj, obj2);
        switch (i) {
            case 0:
                ((C1575Alq) this.A03).A03(bfmA0P, (AndroidComposeView) this.A02, (G0V) this.A01, AnonymousClass011.A00(this.A00));
                break;
            case 1:
                Am0.A00(bfmA0P, (InterfaceC1464AjX) this.A02, (C0jP) this.A03, (G0V) this.A01, AnonymousClass011.A00(this.A00));
                break;
            default:
                C9Vw.A01(bfmA0P, (C9W5) this.A01, (C07409Vs) this.A02, (C07429Vx) this.A03, AnonymousClass011.A00(this.A00));
                break;
        }
        return Unit.INSTANCE;
    }
}
