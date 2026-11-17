package androidx.compose.material3.internal;

import X.C3UY;
import X.EnumC10460Hji;
import X.HtJ;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class AnchoredDraggableKt {
    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(Landroidx/compose/material3/internal/AnchoredDraggableState<TT;>;TT;FLX/HtJ<-Lkotlin/Unit;>;)Ljava/lang/Object; */
    public static final Object A00(AnchoredDraggableState anchoredDraggableState, Object obj, HtJ htJ, float f) {
        Object objA04 = anchoredDraggableState.A04(C3UY.A02, obj, htJ, new AnchoredDraggableKt$animateTo$2(anchoredDraggableState, null, f));
        return objA04 != EnumC10460Hji.A02 ? Unit.INSTANCE : objA04;
    }

    /* JADX WARN: Incorrect types in method signature: <I:Ljava/lang/Object;>(Lkotlin/jvm/functions/Function0<+TI;>;LX/G0V<-TI;-LX/HtJ<-Lkotlin/Unit;>;+Ljava/lang/Object;>;LX/HtJ<-Lkotlin/Unit;>;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(X.HtJ r6, kotlin.jvm.functions.Function0 r7, X.G0V r8) {
        /*
            boolean r0 = r6 instanceof X.C3TL
            if (r0 == 0) goto L1e
            r5 = r6
            X.3TL r5 = (X.C3TL) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1e
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L2d
            if (r0 != r3) goto L28
            goto L24
        L1e:
            X.3TL r5 = new X.3TL
            r5.<init>(r6)
            goto L12
        L24:
            X.Hwg.A00(r1)     // Catch: androidx.compose.material3.internal.AnchoredDragFinishedSignal -> L40
            goto L40
        L28:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2d:
            X.Hwg.A00(r1)
            r2 = 0
            r1 = 7
            X.3bl r0 = new X.3bl     // Catch: androidx.compose.material3.internal.AnchoredDragFinishedSignal -> L40
            r0.<init>(r8, r7, r2, r1)     // Catch: androidx.compose.material3.internal.AnchoredDragFinishedSignal -> L40
            r5.label = r3     // Catch: androidx.compose.material3.internal.AnchoredDragFinishedSignal -> L40
            java.lang.Object r0 = X.Hxb.A00(r0, r5)     // Catch: androidx.compose.material3.internal.AnchoredDragFinishedSignal -> L40
            if (r0 != r4) goto L40
            return r4
        L40:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.AnchoredDraggableKt.A01(X.HtJ, kotlin.jvm.functions.Function0, X.G0V):java.lang.Object");
    }
}
