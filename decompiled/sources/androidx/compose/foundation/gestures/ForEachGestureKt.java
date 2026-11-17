package androidx.compose.foundation.gestures;

import X.BRr;
import X.C2322BTw;
import X.C3cG;
import X.G0V;
import X.HtJ;

/* loaded from: classes4.dex */
public abstract class ForEachGestureKt {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x006a -> B:13:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(X.InterfaceC1074AXb r7, X.EnumC1080AXj r8, X.HtJ<? super kotlin.Unit> r9) {
        /*
            r3 = 7
            boolean r0 = r9 instanceof X.C2312BTm
            if (r0 == 0) goto L6d
            r5 = r9
            X.BTm r5 = (X.C2312BTm) r5
            int r0 = r5.$t
            if (r0 != r3) goto L6d
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6d
            int r2 = r2 - r1
            r5.A00 = r2
        L17:
            java.lang.Object r1 = r5.A03
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r5.A00
            r4 = 1
            if (r0 == 0) goto L42
            if (r0 != r4) goto L73
            java.lang.Object r8 = r5.A02
            X.AXj r8 = (X.EnumC1080AXj) r8
            java.lang.Object r0 = r5.A01
            X.AXb r7 = X.C8j3.A0g(r0, r1)
        L2c:
            X.Afe r1 = (X.C1247Afe) r1
            java.util.List<X.Agk> r3 = r1.A05
            int r2 = r3.size()
            r1 = 0
        L35:
            if (r1 >= r2) goto L78
            X.Agk r0 = X.C8j3.A0h(r3, r1)
            boolean r0 = r0.A0F
            if (r0 != 0) goto L60
            int r1 = r1 + 1
            goto L35
        L42:
            X.Hwg.A00(r1)
            r0 = r7
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine r0 = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine) r0
            X.AaN r0 = r0.A04
            X.Afe r0 = r0.A01
            java.util.List<X.Agk> r3 = r0.A05
            int r2 = r3.size()
            r1 = 0
        L53:
            if (r1 >= r2) goto L78
            X.Agk r0 = X.C8j3.A0h(r3, r1)
            boolean r0 = r0.A0F
            if (r0 != 0) goto L60
            int r1 = r1 + 1
            goto L53
        L60:
            r5.A01 = r7
            r5.A02 = r8
            r5.A00 = r4
            java.lang.Object r1 = r7.A4z(r8, r5)
            if (r1 != r6) goto L2c
            return r6
        L6d:
            X.BTm r5 = new X.BTm
            r5.<init>(r3, r9)
            goto L17
        L73:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L78:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ForEachGestureKt.A00(X.AXb, X.AXj, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0036, code lost:
    
        if (r8.A50(new androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$2(null), r5) == r7) goto L30;
     */
    /* JADX WARN: Incorrect types in method signature: (LX/BRr;LX/G0V<-LX/BRr;-LX/HtJ<-Lkotlin/Unit;>;+Ljava/lang/Object;>;LX/HtJ<-Lkotlin/Unit;>;)Ljava/lang/Object; */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c A[Catch: CancellationException -> 0x007d, TRY_ENTER, TryCatch #0 {CancellationException -> 0x007d, blocks: (B:17:0x003c, B:24:0x006a, B:21:0x0057, B:23:0x0067), top: B:38:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a9  */
    @kotlin.Deprecated(message = "Use awaitEachGesture instead. forEachGesture() can drop events between gestures.", replaceWith = @kotlin.ReplaceWith(expression = "awaitEachGesture(block)", imports = {}))
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A02(X.BRr r8, X.HtJ r9, X.G0V r10) {
        /*
            r6 = 2
            boolean r0 = r9 instanceof X.C2314BTo
            if (r0 == 0) goto La1
            r5 = r9
            X.BTo r5 = (X.C2314BTo) r5
            int r0 = r5.$t
            if (r0 != r6) goto La1
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La1
            int r2 = r2 - r1
            r5.A00 = r2
        L17:
            java.lang.Object r1 = r5.A04
            X.Hji r7 = X.EnumC10460Hji.A02
            int r0 = r5.A00
            r4 = 3
            r3 = 1
            if (r0 == 0) goto L99
            if (r0 == r3) goto L5b
            if (r0 == r6) goto L4b
            if (r0 != r4) goto Lac
            java.lang.Object r2 = r5.A03
            X.78T r2 = (X.C78T) r2
            java.lang.Object r10 = r5.A02
            X.G0V r10 = (X.G0V) r10
            java.lang.Object r8 = r5.A01
            X.BRr r8 = (X.BRr) r8
            X.Hwg.A00(r1)
        L36:
            boolean r0 = X.HzS.A06(r2)
            if (r0 == 0) goto La9
            r5.A01 = r8     // Catch: java.util.concurrent.CancellationException -> L7d
            r5.A02 = r10     // Catch: java.util.concurrent.CancellationException -> L7d
            r5.A03 = r2     // Catch: java.util.concurrent.CancellationException -> L7d
            r5.A00 = r3     // Catch: java.util.concurrent.CancellationException -> L7d
            java.lang.Object r0 = r10.invoke(r8, r5)     // Catch: java.util.concurrent.CancellationException -> L7d
            if (r0 != r7) goto L6a
            goto La8
        L4b:
            java.lang.Object r2 = r5.A03
            X.78T r2 = (X.C78T) r2
            java.lang.Object r10 = r5.A02
            X.G0V r10 = (X.G0V) r10
            java.lang.Object r8 = r5.A01
            X.BRr r8 = (X.BRr) r8
            X.Hwg.A00(r1)     // Catch: java.util.concurrent.CancellationException -> L7d
            goto L36
        L5b:
            java.lang.Object r2 = r5.A03
            X.78T r2 = (X.C78T) r2
            java.lang.Object r10 = r5.A02
            X.G0V r10 = (X.G0V) r10
            java.lang.Object r8 = r5.A01
            X.BRr r8 = (X.BRr) r8
            X.Hwg.A00(r1)     // Catch: java.util.concurrent.CancellationException -> L7d
        L6a:
            r5.A01 = r8     // Catch: java.util.concurrent.CancellationException -> L7d
            r5.A02 = r10     // Catch: java.util.concurrent.CancellationException -> L7d
            r5.A03 = r2     // Catch: java.util.concurrent.CancellationException -> L7d
            r5.A00 = r6     // Catch: java.util.concurrent.CancellationException -> L7d
            r1 = 0
            androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$2 r0 = new androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$2     // Catch: java.util.concurrent.CancellationException -> L7d
            r0.<init>(r1)     // Catch: java.util.concurrent.CancellationException -> L7d
            java.lang.Object r0 = r8.A50(r0, r5)     // Catch: java.util.concurrent.CancellationException -> L7d
            goto L96
        L7d:
            r1 = move-exception
            boolean r0 = X.HzS.A06(r2)
            if (r0 == 0) goto Lb0
            r5.A01 = r8
            r5.A02 = r10
            r5.A03 = r2
            r5.A00 = r4
            r1 = 0
            androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$2 r0 = new androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$2
            r0.<init>(r1)
            java.lang.Object r0 = r8.A50(r0, r5)
        L96:
            if (r0 != r7) goto L36
            return r7
        L99:
            X.Hwg.A00(r1)
            X.78T r2 = r5.getContext()
            goto L36
        La1:
            X.BTo r5 = new X.BTo
            r5.<init>(r6, r9)
            goto L17
        La8:
            return r7
        La9:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        Lac:
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A0n()
        Lb0:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ForEachGestureKt.A02(X.BRr, X.HtJ, X.G0V):java.lang.Object");
    }

    /* JADX WARN: Incorrect types in method signature: (LX/BRr;LX/G0V<-LX/AXb;-LX/HtJ<-Lkotlin/Unit;>;+Ljava/lang/Object;>;LX/HtJ<-Lkotlin/Unit;>;)Ljava/lang/Object; */
    public static final Object A01(BRr bRr, HtJ htJ, G0V g0v) {
        return C3cG.A0U(bRr.A50(new C2322BTw(g0v, htJ.getContext(), null, 0), htJ));
    }
}
