package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.1Xm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C04831Xm extends AbstractC7559F3s implements G0V {
    public final int $t;
    public final float A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final Object A09;
    public final String A0A;
    public final String A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C04831Xm(AOe aOe, String str, String str2, BRg bRg, float f, Function0<Float> function0, AOe<Float> aOe2, AOe<AWx> aOe3, AOe<Float> aOe4, Function0<Boolean> function02, G0W<? super Boolean, ? super BFM, ? super Integer, Unit> g0w, int i, int i2) {
        super(2);
        this.$t = i2;
        this.A0A = f;
        this.A0B = function0;
        this.A06 = bRg;
        this.A00 = function02;
        this.A08 = aOe2;
        this.A09 = aOe;
        this.A07 = str;
        this.A03 = str2;
        this.A05 = aOe3;
        this.A04 = aOe4;
        this.A02 = g0w;
        this.A01 = i;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        BFM bfmA0P = AnonymousClass005.A0P(obj, obj2);
        String str = this.A0A;
        String str2 = this.A0B;
        BRg bRg = (BRg) this.A06;
        float f = this.A00;
        C0sT.A00((AOe) this.A09, (AOe) this.A07, (AOe) this.A03, bfmA0P, bRg, str, str2, (Function0) this.A08, (Function0) this.A05, (G0W) this.A04, f, AnonymousClass011.A00(this.A02), this.A01);
        return Unit.INSTANCE;
    }
}
