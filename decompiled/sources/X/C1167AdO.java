package X;

import kotlin.Unit;

/* renamed from: X.AdO, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1167AdO extends AdZ<C1173Adc> implements C1Cj {
    public static final G0V<C1V6, Integer, C1VW> A03 = C2282BSi.A00(2);
    public boolean A00;
    public final AdM A01 = new AdM(this);
    public final C1170AdV<C1173Adc> A02 = new C1170AdV<>();

    @Override // X.C1Cj
    public final void APK(Object obj, G0U<? super C1V6, C1VW> g0u, Object obj2, G0W<? super C03X, ? super BFM, ? super Integer, Unit> g0w) {
        this.A02.A00(1, new C1173Adc(obj != null ? C2295BSv.A00(obj, 31) : null, C2295BSv.A00((Object) g0u, 32), obj2 != null ? new C2296BSw(obj2, 4) : A03, B1U.A03(new C2299BSz(g0w, 1), -291643851, true)));
        if (obj2 != null) {
            this.A00 = true;
        }
    }

    /* JADX WARN: Incorrect types in method signature: (ILX/G0U<-Ljava/lang/Integer;+Ljava/lang/Object;>;LX/G0V<-LX/1V6;-Ljava/lang/Integer;LX/1VW;>;LX/G0U<-Ljava/lang/Integer;+Ljava/lang/Object;>;LX/G2j<-LX/03X;-Ljava/lang/Integer;-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;)V */
    @Override // X.C1Cj
    public final void APM(G0U g0u, G0U g0u2, G0V g0v, G2j g2j, int i) {
        this.A02.A00(i, new C1173Adc(g0u, g0u2, g0v == null ? A03 : g0v, g2j));
        if (g0v != null) {
            this.A00 = true;
        }
    }

    public C1167AdO(G0U<? super C1Cj, Unit> g0u) {
        g0u.invoke(this);
    }
}
