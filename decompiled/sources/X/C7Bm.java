package X;

/* renamed from: X.7Bm, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7Bm {
    /* JADX WARN: Incorrect types in method signature: <R:Ljava/lang/Object;T:Ljava/lang/Object;>(LX/G0V<-TR;-LX/HtJ<-TT;>;+Ljava/lang/Object;>;TR;LX/HtJ<-TT;>;)Ljava/lang/Object; */
    public static final Object A00(Object obj, HtJ htJ, G0V g0v) {
        C7384Etj.A0Y(g0v, 0);
        C78T context = htJ.getContext();
        AbstractC8884Fsp c7Bo = context == C6ys.A00 ? new C7Bo(htJ) : new C7Bh(htJ, context);
        C0862A6j.A02(g0v, 2);
        return g0v.invoke(obj, c7Bo);
    }

    /* JADX WARN: Incorrect types in method signature: <R:Ljava/lang/Object;T:Ljava/lang/Object;>(LX/G0V<-TR;-LX/HtJ<-TT;>;+Ljava/lang/Object;>;TR;LX/HtJ<-TT;>;)LX/HtJ<Lkotlin/Unit;>; */
    /* JADX WARN: Multi-variable type inference failed */
    public static final HtJ A01(final Object obj, final HtJ htJ, final G0V g0v) {
        C7384Etj.A0Y(g0v, 0);
        if (g0v instanceof AbstractC8884Fsp) {
            return ((AbstractC8884Fsp) g0v).create(obj, htJ);
        }
        C78T context = htJ.getContext();
        return context == C6ys.A00 ? new C7Bn(htJ) { // from class: X.7Bl
            public int label;

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj2) {
                int i = this.label;
                if (i != 0) {
                    if (i != 1) {
                        throw C3cG.A0Q("This coroutine had already completed");
                    }
                    this.label = 2;
                    Hwg.A00(obj2);
                    return obj2;
                }
                this.label = 1;
                Hwg.A00(obj2);
                C7384Etj.A0Z(g0v, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                G0V g0v2 = g0v;
                C0862A6j.A02(g0v2, 2);
                return g0v2.invoke(obj, this);
            }
        } : new C8iO(obj, htJ, context, g0v);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> HtJ<T> A02(HtJ<? super T> htJ) {
        HzP hzP;
        HtJ<T> htJ2;
        C7384Etj.A0Y(htJ, 0);
        return (!(htJ instanceof HzP) || (hzP = (HzP) htJ) == null || (htJ2 = (HtJ<T>) hzP.intercepted()) == null) ? htJ : htJ2;
    }

    public static GBL A04(HtJ htJ) {
        String str = GBL.__redex_internal_original_name;
        GBL gbl = new GBL(1, A02(htJ));
        gbl.A0I();
        return gbl;
    }

    public static GBL A03(HtJ htJ) {
        String str = GBL.__redex_internal_original_name;
        GBL gbl = new GBL(1, A02(htJ));
        gbl.A0I();
        return gbl;
    }
}
