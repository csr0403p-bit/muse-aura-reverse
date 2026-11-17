package X;

import kotlin.Unit;

/* renamed from: X.60D, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C60D extends AbstractC07127nr implements G0V {
    public final int $t;
    public int A00;
    public Object A01;
    public Object A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/G0W<-LX/3UX;-LX/20Z<-TR;>;-LX/HtJ<-Lkotlin/Unit;>;+Ljava/lang/Object;>;LX/20Z<-TR;>;LX/HtJ<-LX/60D;>;)V */
    public C60D(HtJ htJ, G0W g0w, C20Z c20z) {
        super(2, htJ);
        this.$t = 6;
        this.A03 = g0w;
        this.A01 = c20z;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        Object obj2;
        Object obj3;
        Object obj4;
        int i;
        C60D c60d;
        switch (this.$t) {
            case 0:
                obj4 = this.A01;
                obj2 = this.A02;
                obj3 = this.A03;
                i = 0;
                return new C60D(obj4, obj2, obj3, htJ, i);
            case 1:
                obj2 = this.A02;
                obj4 = this.A01;
                obj3 = this.A03;
                i = 1;
                return new C60D(obj4, obj2, obj3, htJ, i);
            case 2:
                c60d = new C60D(this.A02, this.A03, htJ, 2);
                c60d.A01 = obj;
                return c60d;
            case 3:
                obj2 = this.A02;
                obj4 = this.A01;
                obj3 = this.A03;
                i = 3;
                return new C60D(obj4, obj2, obj3, htJ, i);
            case 4:
                c60d = new C60D(this.A02, this.A03, htJ, 4);
                c60d.A01 = obj;
                return c60d;
            case 5:
                obj2 = this.A02;
                obj3 = this.A03;
                obj4 = this.A01;
                i = 5;
                return new C60D(obj4, obj2, obj3, htJ, i);
            default:
                C60D c60d2 = new C60D(htJ, (G0W) this.A03, (C20Z) this.A01);
                c60d2.A02 = obj;
                return c60d2;
        }
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C60D) create(obj, (HtJ) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0022 A[RETURN] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60D.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C60D(Object obj, C5Wa c5Wa, C3UY c3uy, G0V<? super C5Wc, ? super HtJ<? super Unit>, ? extends Object> g0v, HtJ<? super C60D> htJ) {
        super(2, g0v);
        this.$t = htJ;
        this.A02 = c5Wa;
        this.A01 = obj;
        this.A03 = c3uy;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C60D(Object obj, C5WT c5wt, G0V<? super C5WV, ? super HtJ<? super Unit>, ? extends Object> g0v, HtJ<? super C60D> htJ) {
        super(2, g0v);
        this.$t = htJ;
        this.A02 = obj;
        this.A03 = c5wt;
    }
}
