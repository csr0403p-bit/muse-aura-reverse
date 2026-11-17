package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.BUr, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2343BUr extends AbstractC7559F3s implements G0V {
    public final int $t;
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2343BUr(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2, int i3) {
        super(2);
        this.$t = i3;
        this.A05 = obj3;
        this.A04 = obj4;
        this.A03 = obj;
        this.A02 = obj2;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.$t;
        BFM bfmA0P = AnonymousClass005.A0P(obj, obj2);
        switch (i) {
            case 0:
                AYW.A01(bfmA0P, (AeE) this.A04, (C11N) this.A05, (Function0) this.A03, (G0V) this.A02, AnonymousClass011.A00(this.A00), this.A01);
                break;
            case 1:
                AnonymousClass963.A01(bfmA0P, (BRg) this.A03, (AnonymousClass965) this.A02, (C8ni) this.A05, (C9Tm) this.A04, AnonymousClass011.A00(this.A00), this.A01);
                break;
            case 2:
            case 3:
                AbstractC07499Wh.A01(bfmA0P, (BRg) this.A04, (InterfaceC07569Wo) this.A02, (C07399Vr) this.A03, (C07509Wi) this.A05, AnonymousClass011.A00(this.A00), this.A01);
                break;
            case 4:
            case 5:
                C9WX.A00(bfmA0P, (BRg) this.A04, (C9ZS) this.A02, (C07459Wa) this.A03, (C9WY) this.A05, AnonymousClass011.A00(this.A00), this.A01);
                break;
            case 6:
                C9VR.A00(bfmA0P, (BRg) this.A04, (C9VZ) this.A02, (C9VS) this.A03, (C9G2) this.A05, AnonymousClass011.A00(this.A00), this.A01);
                break;
            default:
                C8sN.A00(bfmA0P, (BRg) this.A04, (C8sR) this.A02, (C8sP) this.A03, (C8sO) this.A05, AnonymousClass011.A00(this.A00), this.A01);
                break;
        }
        return Unit.INSTANCE;
    }
}
