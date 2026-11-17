package androidx.compose.animation.core;

import X.AOW;
import X.AOc;
import X.AOd;
import X.AOl;
import X.AT7;
import X.ATK;
import X.ATT;
import X.ATV;
import X.ATY;
import X.AVd;
import X.BTA;
import X.C0997AOa;
import X.C1YC;
import X.C31w;
import X.C3cG;
import X.C78T;
import X.C8j3;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import kotlin.Unit;

/* loaded from: classes4.dex */
public abstract class SuspendAnimationKt {
    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;V:LX/AOd;>(LX/AT7<TT;TV;>;TT;LX/AOc<TT;>;ZLX/G0U<-LX/ATT<TT;TV;>;Lkotlin/Unit;>;LX/HtJ<-Lkotlin/Unit;>;)Ljava/lang/Object; */
    public static final Object A02(AOc aOc, AT7 at7, Object obj, HtJ htJ, G0U g0u, boolean z) {
        return C3cG.A0U(A01(new C0997AOa(aOc, at7.A02, at7.A04, at7.A05.getValue(), obj), at7, htJ, g0u, z ? at7.A01 : Long.MIN_VALUE));
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;V:LX/AOd;>(LX/AT7<TT;TV;>;LX/1YC<TT;>;ZLX/G0U<-LX/ATT<TT;TV;>;Lkotlin/Unit;>;LX/HtJ<-Lkotlin/Unit;>;)Ljava/lang/Object; */
    public static final Object A04(AT7 at7, C1YC c1yc, HtJ htJ, G0U g0u, boolean z) {
        return C3cG.A0U(A01(new ATY(at7.A02, c1yc, at7.A04, at7.A05.getValue()), at7, htJ, g0u, z ? at7.A01 : Long.MIN_VALUE));
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;V:LX/AOd;>(LX/ATT<TT;TV;>;JFLX/ATV<TT;TV;>;LX/AT7<TT;TV;>;LX/G0U<-LX/ATT<TT;TV;>;Lkotlin/Unit;>;)V */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void A05(ATV atv, ATT att, AT7 at7, G0U g0u, float f, long j) {
        long jAEu = f == 0.0f ? atv.AEu() : (long) ((j - att.A03) / f);
        att.A01 = j;
        att.A06.Af8(atv.AMR(jAEu));
        att.A02 = (V) atv.AMb(jAEu);
        if (atv.AOR(jAEu)) {
            att.A00 = att.A01;
            att.A05.Af8(false);
        }
        A06(att, at7);
        g0u.invoke(att);
    }

    public static final float A00(C78T c78t) {
        ATK atk = (ATK) c78t.get(ATK.A00);
        if (atk == null) {
            return 1.0f;
        }
        float fAJx = atk.AJx();
        if (fAJx < 0.0f) {
            throw new IllegalStateException("negative scale factor");
        }
        return fAJx;
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;V:LX/AOd;>(LX/AT7<TT;TV;>;LX/ATV<TT;TV;>;JLX/G0U<-LX/ATT<TT;TV;>;Lkotlin/Unit;>;LX/HtJ<-Lkotlin/Unit;>;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00de A[Catch: CancellationException -> 0x011e, TryCatch #0 {CancellationException -> 0x011e, blocks: (B:16:0x0045, B:24:0x00c9, B:26:0x00de, B:28:0x0104, B:29:0x0112, B:19:0x0064, B:21:0x0081, B:22:0x0090, B:23:0x009b), top: B:45:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x011d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0146  */
    /* JADX WARN: Type inference failed for: r15v0, types: [T, X.ATT] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x011b -> B:24:0x00c9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(X.ATV r24, X.AT7 r25, X.HtJ r26, X.G0U r27, long r28) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SuspendAnimationKt.A01(X.ATV, X.AT7, X.HtJ, X.G0U, long):java.lang.Object");
    }

    /* JADX WARN: Incorrect types in method signature: (FFFLX/AOc<Ljava/lang/Float;>;LX/G0V<-Ljava/lang/Float;-Ljava/lang/Float;Lkotlin/Unit;>;LX/HtJ<-Lkotlin/Unit;>;)Ljava/lang/Object; */
    public static final Object A03(AOc aOc, HtJ htJ, G0V g0v, float f, float f2, float f3) {
        C31w<Float, AOW> c31w = AVd.A02;
        Float fA0u = C8j3.A0u(f);
        Float fA0u2 = C8j3.A0u(f2);
        Float fA0u3 = C8j3.A0u(f3);
        G0U<T, V> g0u = ((AOl) c31w).A01;
        AOd aOdA03 = (AOd) g0u.invoke(fA0u3);
        if (aOdA03 == null) {
            aOdA03 = ((AOd) g0u.invoke(fA0u)).A03();
        }
        Object objA01 = A01(new C0997AOa(aOc, aOdA03, c31w, fA0u, fA0u2), new AT7(aOdA03, c31w, fA0u, Long.MIN_VALUE, Long.MIN_VALUE, false), htJ, BTA.A01(c31w, g0v, 3), Long.MIN_VALUE);
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        if (objA01 != enumC10460Hji) {
            objA01 = Unit.INSTANCE;
        }
        return objA01 != enumC10460Hji ? Unit.INSTANCE : objA01;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, V extends AOd> void A06(ATT<T, V> att, AT7<T, V> at7) {
        at7.A05.Af8(att.A06.getValue());
        V v = at7.A02;
        V v2 = att.A02;
        int iA02 = v.A02();
        for (int i = 0; i < iA02; i++) {
            v.A05(i, v2.A01(i));
        }
        at7.A00 = att.A00;
        at7.A01 = att.A01;
        at7.A03 = ((Boolean) att.A05.getValue()).booleanValue();
    }
}
