package X;

import kotlin.Unit;

/* renamed from: X.3pU, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class C3pU {
    /* JADX WARN: Incorrect return type in method signature: <T:Ljava/lang/Object;>(LX/20Q<+TT;>;LX/3UX;)LX/HoC; */
    public static final void A02(C3UX c3ux, C20Q c20q) {
        AnonymousClass001.A1J(new C60B(c20q, null, 2), c3ux);
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(LX/20Q<+TT;>;LX/G0V<-TT;-LX/HtJ<-Lkotlin/Unit;>;+Ljava/lang/Object;>;LX/HtJ<-Lkotlin/Unit;>;)Ljava/lang/Object; */
    public static final Object A00(HtJ htJ, G0V g0v, C20Q c20q) {
        AbstractC05633ui abstractC05633ui = AbstractC05633ui.$redex_init_class;
        C3pS c3pSA00 = AbstractC05633ui.A00(new C60E(g0v, null, 0), c20q);
        Integer num = C79.A00;
        Object objCollect = (c3pSA00 instanceof C3pV ? c3pSA00.ABr(num, C6ys.A00, 0) : new C3pT(num, C6ys.A00, c3pSA00, 0)).collect(C3no.A00, htJ);
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        if (objCollect != enumC10460Hji) {
            objCollect = Unit.INSTANCE;
        }
        return objCollect != enumC10460Hji ? Unit.INSTANCE : objCollect;
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(LX/20Z<-TT;>;LX/20Q<+TT;>;LX/HtJ<-Lkotlin/Unit;>;)Ljava/lang/Object; */
    public static final Object A01(HtJ htJ, C20Q c20q, C20Z c20z) {
        if (c20z instanceof C10594Hxk) {
            throw ((C10594Hxk) c20z).A00;
        }
        Object objCollect = c20q.collect(c20z, htJ);
        return objCollect != EnumC10460Hji.A02 ? Unit.INSTANCE : objCollect;
    }
}
