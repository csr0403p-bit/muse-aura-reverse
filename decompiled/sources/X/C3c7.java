package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.3c7, reason: invalid class name */
/* loaded from: classes.dex */
public final class C3c7 extends AbstractC7559F3s implements G0V {
    public final int $t;
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C3c7(Object obj, G0U<? super Context, ? extends T> g0u, BRg bRg, G0U<? super T, Unit> g0u2, int i, int i2) {
        super(2);
        this.$t = i2;
        this.A02 = g0u;
        this.A03 = obj;
        this.A04 = bRg;
        this.A00 = g0u2;
        this.A01 = i;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.$t;
        BFM bfmA0P = AnonymousClass005.A0P(obj, obj2);
        if (i != 0) {
            C0n6.A00(bfmA0P, (BA2) this.A04, (Function0) this.A03, (G0V) this.A02, AnonymousClass011.A00(this.A00), this.A01);
        } else {
            AbstractC1532Ako.A02(bfmA0P, (BRg) this.A03, (G0U) this.A02, (G0U) this.A04, AnonymousClass011.A00(this.A00), this.A01);
        }
        return Unit.INSTANCE;
    }
}
