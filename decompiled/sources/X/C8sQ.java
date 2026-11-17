package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.8sQ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8sQ extends AbstractC7559F3s implements G0V {
    public final int $t;
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8sQ(C8sO c8sO, String str, Function0 function0, int i) {
        super(2);
        this.$t = 1;
        this.A01 = null;
        this.A04 = str;
        this.A03 = c8sO;
        this.A02 = function0;
        this.A00 = i;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.$t != 0) {
            C8sN.A01(AnonymousClass005.A0P(obj, obj2), (C8sO) this.A03, this.A04, (Function0) this.A02, AnonymousClass011.A00(this.A00));
        } else {
            AbstractC07499Wh.A05(AnonymousClass005.A0P(obj, obj2), (C07509Wi) this.A03, this.A04, (G0V) this.A02, (G0W) this.A01, AnonymousClass011.A00(this.A00));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8sQ(C07509Wi c07509Wi, String str, G0V<? super BFM, ? super Integer, Unit> g0v, G0W<? super BRg, ? super BFM, ? super Integer, Boolean> g0w, int i) {
        super(2);
        this.$t = 0;
        this.A03 = c07509Wi;
        this.A04 = str;
        this.A02 = g0v;
        this.A01 = g0w;
        this.A00 = i;
    }
}
