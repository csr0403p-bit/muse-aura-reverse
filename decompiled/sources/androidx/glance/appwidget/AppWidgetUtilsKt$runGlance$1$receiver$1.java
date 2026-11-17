package androidx.glance.appwidget;

import X.BFM;
import X.C7384Etj;
import X.C77W;
import X.C78I;
import X.C78T;
import X.C78W;
import X.C78X;
import X.G0V;
import X.Hm1;
import X.HyO;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class AppWidgetUtilsKt$runGlance$1$receiver$1 implements C77W {
    public final /* synthetic */ AtomicReference<Hm1<?>> A00;
    public final /* synthetic */ HyO<G0V<? super BFM, ? super Integer, Unit>> A01;

    /* JADX WARN: Incorrect types in method signature: (LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/HtJ<*>;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0026  */
    @Override // X.C77W
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.EnumC10460Hji AYe(X.HtJ r9, X.G0V r10) {
        /*
            r8 = this;
            r7 = 1
            boolean r0 = r9 instanceof X.C8iU
            if (r0 == 0) goto L26
            r6 = r9
            X.8iU r6 = (X.C8iU) r6
            int r0 = r6.$t
            if (r0 != r7) goto L26
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r6.A00 = r2
        L17:
            java.lang.Object r1 = r6.A04
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.A00
            if (r0 == 0) goto L2c
            if (r0 == r7) goto L5e
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L26:
            X.8iU r6 = new X.8iU
            r6.<init>(r8, r9, r7)
            goto L17
        L2c:
            X.Hwg.A00(r1)
            java.util.concurrent.atomic.AtomicReference<X.Hm1<?>> r4 = r8.A00
            X.HyO<X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit>> r3 = r8.A01
            r6.A01 = r10
            r6.A02 = r4
            r6.A03 = r3
            r6.A00 = r7
            X.GBL r2 = X.C7Bm.A04(r6)
            r1 = 0
            X.8i5 r0 = new X.8i5
            r0.<init>(r3, r1)
            r2.AO2(r0)
            java.lang.Object r1 = r4.getAndSet(r2)
            X.Hm1 r1 = (X.Hm1) r1
            if (r1 == 0) goto L54
            r0 = 0
            r1.A5x(r0)
        L54:
            r3.AhZ(r10)
            java.lang.Object r0 = r2.A0F()
            if (r0 != r5) goto L61
            return r5
        L5e:
            X.Hwg.A00(r1)
        L61:
            kotlin.KotlinNothingValueException r0 = X.C3cG.A0p()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.appwidget.AppWidgetUtilsKt$runGlance$1$receiver$1.AYe(X.HtJ, X.G0V):X.Hji");
    }

    @Override // X.C78T
    public final /* bridge */ <R> R fold(R r, G0V<? super R, ? super C78X, ? extends R> g0v) {
        C7384Etj.A0Y(g0v, 2);
        return g0v.invoke(r, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AppWidgetUtilsKt$runGlance$1$receiver$1(AtomicReference<Hm1<?>> atomicReference, HyO<? super G0V<? super BFM, ? super Integer, Unit>> hyO) {
        this.A00 = atomicReference;
        this.A01 = hyO;
    }

    @Override // X.C78X
    public final /* synthetic */ C78I getKey() {
        return C77W.A00;
    }

    @Override // X.C78X, X.C78T
    public final /* bridge */ <E extends C78X> E get(C78I<E> c78i) {
        return (E) C78W.A00(this, c78i);
    }

    @Override // X.C78T
    public final /* bridge */ C78T minusKey(C78I<?> c78i) {
        return C78W.A01(this, c78i);
    }

    @Override // X.C78T
    public final /* bridge */ C78T plus(C78T c78t) {
        return C78W.A02(this, c78t);
    }
}
