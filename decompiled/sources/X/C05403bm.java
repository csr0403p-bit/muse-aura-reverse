package X;

import kotlin.Unit;

/* renamed from: X.3bm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C05403bm extends AbstractC07127nr implements G0V {
    public final int $t;
    public int A00;
    public Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/20Q<+TT;>;LX/3Em<TT;>;TT;LX/HtJ<-LX/3bm;>;)V */
    public C05403bm(Object obj, HtJ htJ, C20Q c20q, C3Em c3Em) {
        super(2, htJ);
        this.$t = 2;
        this.A04 = c20q;
        this.A03 = c3Em;
        this.A02 = obj;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        int i;
        switch (this.$t) {
            case 0:
                obj5 = this.A01;
                obj2 = this.A03;
                obj4 = this.A02;
                obj3 = this.A04;
                i = 0;
                break;
            case 1:
                obj2 = this.A03;
                obj3 = this.A04;
                obj4 = this.A02;
                obj5 = this.A01;
                i = 1;
                break;
            case 2:
                C05403bm c05403bm = new C05403bm(this.A02, htJ, (C20Q) this.A04, (C3Em) this.A03);
                c05403bm.A01 = obj;
                return c05403bm;
            default:
                obj3 = this.A04;
                obj5 = this.A01;
                obj2 = this.A03;
                obj4 = this.A02;
                i = 3;
                break;
        }
        return new C05403bm(obj2, obj4, obj3, obj5, htJ, i);
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C05403bm) create(obj, (HtJ) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026 A[RETURN] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05403bm.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C05403bm(Object obj, T t, AT5<T, V> at5, C1BO<? extends AOc<T>> c1bo, C1BO<? extends G0U<? super T, Unit>> c1bo2, HtJ<? super C05403bm> htJ) {
        super(2, c1bo2);
        this.$t = htJ;
        this.A01 = c1bo;
        this.A03 = obj;
        this.A02 = t;
        this.A04 = at5;
    }
}
