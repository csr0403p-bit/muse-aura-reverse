package X;

import kotlin.Unit;

/* renamed from: X.60C, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C60C extends AbstractC07127nr implements G0V {
    public final int $t;
    public int A00;
    public Object A01;
    public Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/20Q<+TT;>;LX/3uf<TT;>;LX/HtJ<-LX/60C;>;)V */
    public C60C(HtJ htJ, C20Q c20q, C05613uf c05613uf) {
        super(2, htJ);
        this.$t = 5;
        this.A02 = c20q;
        this.A01 = c05613uf;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        Object obj2;
        int i;
        Object obj3;
        int i2;
        switch (this.$t) {
            case 0:
                obj3 = this.A01;
                i2 = 0;
                C60C c60c = new C60C(obj3, htJ, i2, 42);
                c60c.A02 = obj;
                return c60c;
            case 1:
                obj2 = this.A02;
                i = 1;
                C60C c60c2 = new C60C(obj2, (C1531Akn) htJ, (HtJ<? super C60C>) i);
                c60c2.A01 = obj;
                return c60c2;
            case 2:
                obj3 = this.A01;
                i2 = 2;
                C60C c60c3 = new C60C(obj3, htJ, i2, 42);
                c60c3.A02 = obj;
                return c60c3;
            case 3:
                obj2 = this.A02;
                i = 3;
                C60C c60c22 = new C60C(obj2, (C1531Akn) htJ, (HtJ<? super C60C>) i);
                c60c22.A01 = obj;
                return c60c22;
            case 4:
                obj2 = this.A02;
                i = 4;
                C60C c60c222 = new C60C(obj2, (C1531Akn) htJ, (HtJ<? super C60C>) i);
                c60c222.A01 = obj;
                return c60c222;
            default:
                return new C60C(htJ, (C20Q) this.A02, (C05613uf) this.A01);
        }
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C60C) create(obj, (HtJ) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001f A[RETURN] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60C.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C60C(Object obj, HtJ htJ, int i, int i2) {
        super(2, htJ);
        this.$t = i;
        this.A01 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C60C(Object obj, C1531Akn c1531Akn, HtJ<? super C60C> htJ) {
        super(2, c1531Akn);
        this.$t = htJ;
        this.A02 = obj;
    }
}
