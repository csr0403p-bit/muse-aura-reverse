package androidx.compose.foundation.gestures;

import X.C10543Hqv;
import X.C20Z;
import X.C3UX;
import X.G0V;
import X.HoC;
import X.HtJ;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class AnchoredDraggableKt$restartable$2$1<T> implements C20Z {
    public final /* synthetic */ G0V<I, HtJ<? super Unit>, Object> A00;
    public final /* synthetic */ C10543Hqv<HoC> A01;
    public final /* synthetic */ C3UX A02;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    @Override // X.C20Z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(I r8, X.HtJ<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            r5 = r8
            r8 = 0
            boolean r0 = r9 instanceof X.C60A
            if (r0 == 0) goto L61
            r4 = r9
            X.60A r4 = (X.C60A) r4
            int r0 = r4.$t
            if (r0 != r8) goto L61
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L61
            int r2 = r2 - r1
            r4.A00 = r2
        L18:
            java.lang.Object r1 = r4.A03
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L41
            if (r0 != r2) goto L67
            java.lang.Object r5 = r4.A01
            X.Hwg.A00(r1)
        L28:
            X.Hqv<X.HoC> r2 = r7.A01
            X.3UX r6 = r7.A02
            java.lang.Integer r1 = X.C79.A0K
            X.G0V<I, X.HtJ<? super kotlin.Unit>, java.lang.Object> r4 = r7.A00
            r7 = 0
            X.60D r3 = new X.60D
            r3.<init>(r4, r5, r6, r7, r8)
            X.6ys r0 = X.C6ys.A00
            X.Hqc r0 = X.GAo.A02(r1, r0, r3, r6)
            r2.element = r0
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L41:
            X.Hwg.A00(r1)
            X.Hqv<X.HoC> r0 = r7.A01
            T r1 = r0.element
            X.HoC r1 = (X.HoC) r1
            if (r1 == 0) goto L28
            androidx.compose.foundation.gestures.AnchoredDragFinishedSignal r0 = new androidx.compose.foundation.gestures.AnchoredDragFinishedSignal
            r0.<init>()
            r1.A5w(r0)
            r4.A01 = r5
            r4.A02 = r1
            r4.A00 = r2
            java.lang.Object r0 = r1.APQ(r4)
            if (r0 != r3) goto L28
            return r3
        L61:
            X.60A r4 = new X.60A
            r4.<init>(r7, r9, r8)
            goto L18
        L67:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1.emit(java.lang.Object, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Hqv<LX/HoC;>;LX/3UX;LX/G0V<-TI;-LX/HtJ<-Lkotlin/Unit;>;+Ljava/lang/Object;>;)V */
    public AnchoredDraggableKt$restartable$2$1(G0V g0v, C10543Hqv c10543Hqv, C3UX c3ux) {
        this.A01 = c10543Hqv;
        this.A02 = c3ux;
        this.A00 = g0v;
    }
}
