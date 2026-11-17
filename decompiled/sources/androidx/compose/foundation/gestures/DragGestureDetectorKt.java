package androidx.compose.foundation.gestures;

import X.AnonymousClass002;
import X.BRr;
import X.BT0;
import X.C1247Afe;
import X.C1299Agk;
import X.C2283BSj;
import X.C2295BSv;
import X.C2320BTu;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.InterfaceC1079AXi;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class DragGestureDetectorKt {
    public static final float A00 = 0.125f / 18.0f;

    public static final float A00(InterfaceC1079AXi interfaceC1079AXi, int i) {
        boolean zA1Q = AnonymousClass002.A1Q(i, 2);
        float fALr = interfaceC1079AXi.ALr();
        return zA1Q ? fALr * A00 : fALr;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/AXb;LX/Agk;LX/AXj;LX/HtJ<-Ljava/lang/Boolean;>;)Ljava/lang/Object; */
    /* JADX WARN: Path cross not found for [B:19:0x005e, B:24:0x007d], limit reached: 64 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00de A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0058 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e2 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x010a -> B:11:0x003a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A02(X.InterfaceC1074AXb r15, X.EnumC1080AXj r16, X.C1299Agk r17, X.HtJ r18) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.A02(X.AXb, X.AXj, X.Agk, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0096, code lost:
    
        if (X.AWx.A08(r11) == 0) goto L38;
     */
    /* JADX WARN: Incorrect types in method signature: (LX/AXb;JLX/HtJ<-LX/Agk;>;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x004d A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00a2 -> B:13:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A03(X.InterfaceC1074AXb r15, X.HtJ r16, long r17) {
        /*
            r3 = 4
            r4 = r16
            boolean r0 = r4 instanceof X.C2312BTm
            if (r0 == 0) goto La5
            r5 = r4
            X.BTm r5 = (X.C2312BTm) r5
            int r0 = r5.$t
            if (r0 != r3) goto La5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La5
            int r2 = r2 - r1
            r5.A00 = r2
        L19:
            java.lang.Object r1 = r5.A03
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.A00
            r3 = 1
            r14 = 0
            if (r0 == 0) goto L76
            if (r0 != r3) goto Lac
            java.lang.Object r8 = r5.A02
            X.BO7 r8 = (X.BO7) r8
            java.lang.Object r0 = r5.A01
            X.AXb r15 = X.C8j3.A0g(r0, r1)
        L2f:
            X.Afe r1 = (X.C1247Afe) r1
            java.util.List<X.Agk> r10 = r1.A05
            int r13 = r10.size()
            r9 = 0
            r12 = 0
        L39:
            if (r12 >= r13) goto L4d
            java.lang.Object r11 = r10.get(r12)
            r0 = r11
            X.Agk r0 = (X.C1299Agk) r0
            long r6 = r0.A08
            long r0 = r8.element
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 == 0) goto L4e
            int r12 = r12 + 1
            goto L39
        L4d:
            r11 = r14
        L4e:
            X.Agk r11 = (X.C1299Agk) r11
            if (r11 == 0) goto Lb8
            boolean r0 = X.AbstractC1078AXh.A03(r11)
            if (r0 == 0) goto L8e
            int r2 = r10.size()
        L5c:
            if (r9 >= r2) goto L6c
            java.lang.Object r1 = r10.get(r9)
            r0 = r1
            X.Agk r0 = (X.C1299Agk) r0
            boolean r0 = r0.A0F
            if (r0 != 0) goto L6d
            int r9 = r9 + 1
            goto L5c
        L6c:
            r1 = r14
        L6d:
            X.Agk r1 = (X.C1299Agk) r1
            if (r1 == 0) goto Lb1
            long r0 = r1.A08
            r8.element = r0
            goto L98
        L76:
            X.Hwg.A00(r1)
            r0 = r15
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine r0 = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine) r0
            X.AaN r0 = r0.A04
            X.Afe r0 = r0.A01
            r1 = r17
            boolean r0 = A0E(r0, r1)
            if (r0 == 0) goto L89
            return r14
        L89:
            X.BO7 r8 = X.BO7.A00(r1)
            goto L98
        L8e:
            long r6 = X.AWx.A08(r11)
            r1 = 0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto Lb1
        L98:
            r5.A01 = r15
            r5.A02 = r8
            r5.A00 = r3
            java.lang.Object r1 = X.InterfaceC1074AXb.A00(r15, r5)
            if (r1 != r4) goto L2f
            return r4
        La5:
            X.BTm r5 = new X.BTm
            r5.<init>(r3, r4)
            goto L19
        Lac:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        Lb1:
            boolean r0 = r11.A03()
            if (r0 != 0) goto Lb8
            return r11
        Lb8:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.A03(X.AXb, X.HtJ, long):java.lang.Object");
    }

    /* JADX WARN: Incorrect types in method signature: (LX/AXb;JLX/HtJ<-LX/Agk;>;)Ljava/lang/Object; */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000d  */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A04(X.InterfaceC1074AXb r12, X.HtJ r13, long r14) {
        /*
            r3 = 0
            boolean r0 = r13 instanceof X.C2314BTo
            if (r0 == 0) goto Ld
            r0 = r13
            X.BTo r0 = (X.C2314BTo) r0
            int r1 = r0.$t
            r0 = 1
            if (r1 == r3) goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 == 0) goto L35
            r7 = r13
            X.BTo r7 = (X.C2314BTo) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L35
            int r2 = r2 - r1
            r7.A00 = r2
        L1e:
            java.lang.Object r1 = r7.A04
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r7.A00
            r8 = 1
            r5 = 0
            if (r0 == 0) goto L40
            if (r0 != r8) goto L3b
            java.lang.Object r10 = r7.A03
            X.F1F r10 = (X.F1F) r10
            java.lang.Object r9 = r7.A02
            X.Hqv r9 = (X.C10543Hqv) r9
            java.lang.Object r4 = r7.A01
            goto La0
        L35:
            X.BTo r7 = new X.BTo
            r7.<init>(r3, r13)
            goto L1e
        L3b:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L40:
            X.Hwg.A00(r1)
            r0 = r12
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine r0 = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine) r0
            X.AaN r10 = r0.A04
            X.Afe r0 = r10.A01
            boolean r0 = A0E(r0, r14)
            if (r0 == 0) goto L51
            return r5
        L51:
            X.Afe r0 = r10.A01
            java.util.List<X.Agk> r11 = r0.A05
            int r9 = r11.size()
        L59:
            if (r3 >= r9) goto L6f
            java.lang.Object r4 = r11.get(r3)
            r0 = r4
            X.Agk r0 = (X.C1299Agk) r0
            long r0 = r0.A08
            int r2 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            boolean r0 = X.AnonymousClass002.A1M(r2)
            if (r0 != 0) goto L70
            int r3 = r3 + 1
            goto L59
        L6f:
            r4 = r5
        L70:
            if (r4 != 0) goto L73
            return r5
        L73:
            X.Hqv r9 = X.C3cG.A0z()
            X.Hqv r3 = X.C3cG.A0z()
            r3.element = r4
            X.AjM r0 = X.AbstractC1414Aij.A04(r10)
            X.AXi r0 = r0.A0E
            long r1 = r0.AHG()
            X.F1F r10 = new X.F1F     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lad
            r10.<init>()     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lad
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2 r0 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lad
            r0.<init>(r5, r10, r3, r9)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lad
            r7.A01 = r4     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lad
            r7.A02 = r9     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lad
            r7.A03 = r10     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lad
            r7.A00 = r8     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lad
            java.lang.Object r0 = r12.AiT(r7, r0, r1)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lad
            if (r0 != r6) goto La3
            return r6
        La0:
            X.Hwg.A00(r1)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lad
        La3:
            boolean r0 = r10.element     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lad
            if (r0 == 0) goto Lac
            T r0 = r9.element     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lad
            if (r0 == 0) goto Lb2
            return r0
        Lac:
            return r5
        Lad:
            T r0 = r9.element
            if (r0 == 0) goto Lb2
            return r0
        Lb2:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.A04(X.AXb, X.HtJ, long):java.lang.Object");
    }

    /* JADX WARN: Incorrect types in method signature: (LX/AXb;JLX/G0U<-LX/Agk;Lkotlin/Unit;>;LX/HtJ<-Ljava/lang/Boolean;>;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x004f -> B:13:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A05(X.InterfaceC1074AXb r5, X.HtJ r6, X.G0U r7, long r8) {
        /*
            r3 = 5
            boolean r0 = r6 instanceof X.C2312BTm
            if (r0 == 0) goto L52
            r4 = r6
            X.BTm r4 = (X.C2312BTm) r4
            int r0 = r4.$t
            if (r0 != r3) goto L52
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L52
            int r2 = r2 - r1
            r4.A00 = r2
        L17:
            java.lang.Object r3 = r4.A03
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L36
            if (r0 != r1) goto L58
            java.lang.Object r7 = r4.A02
            X.G0U r7 = (X.G0U) r7
            java.lang.Object r0 = r4.A01
            X.AXb r5 = X.C8j3.A0g(r0, r3)
        L2c:
            X.Agk r3 = (X.C1299Agk) r3
            if (r3 != 0) goto L3a
            r1 = 0
        L31:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            return r2
        L36:
            X.Hwg.A00(r3)
            goto L45
        L3a:
            boolean r0 = X.AbstractC1078AXh.A03(r3)
            if (r0 != 0) goto L31
            r7.invoke(r3)
            long r8 = r3.A08
        L45:
            r4.A01 = r5
            r4.A02 = r7
            r4.A00 = r1
            java.lang.Object r3 = A03(r5, r4, r8)
            if (r3 != r2) goto L2c
            return r2
        L52:
            X.BTm r4 = new X.BTm
            r4.<init>(r3, r6)
            goto L17
        L58:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.A05(X.AXb, X.HtJ, X.G0U, long):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0092, code lost:
    
        if (A0E(((androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine) r9).A04.A01, r0) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b2, code lost:
    
        if ((r5 == null ? X.AWx.A00(r0) : X.C8j3.A05(X.C8j5.A0F(r0, r5, X.EnumC1108AYu.A03))) == 0.0f) goto L44;
     */
    /* JADX WARN: Incorrect types in method signature: (LX/AXb;JLX/G0U<-LX/Agk;Lkotlin/Unit;>;LX/HtJ<-Ljava/lang/Boolean;>;)Ljava/lang/Object; */
    /* JADX WARN: Path cross not found for [B:23:0x0063, B:39:0x00a5], limit reached: 59 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0058 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00c4 -> B:13:0x003b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A06(X.InterfaceC1074AXb r12, X.HtJ r13, X.G0U r14, long r15) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.A06(X.AXb, X.HtJ, X.G0U, long):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0091, code lost:
    
        if (A0E(((androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine) r9).A04.A01, r0) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b1, code lost:
    
        if ((r5 == null ? X.AWx.A00(r0) : X.C8j3.A05(X.C8j5.A0F(r0, r5, X.EnumC1108AYu.A03))) == 0.0f) goto L44;
     */
    /* JADX WARN: Incorrect types in method signature: (LX/AXb;JLX/G0U<-LX/Agk;Lkotlin/Unit;>;LX/HtJ<-Ljava/lang/Boolean;>;)Ljava/lang/Object; */
    /* JADX WARN: Path cross not found for [B:23:0x0062, B:39:0x00a4], limit reached: 59 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00c3 -> B:13:0x003a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A07(X.InterfaceC1074AXb r12, X.HtJ r13, X.G0U r14, long r15) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.A07(X.AXb, X.HtJ, X.G0U, long):java.lang.Object");
    }

    /* JADX WARN: Incorrect types in method signature: (LX/AXb;JILX/G0V<-LX/Agk;-Ljava/lang/Float;Lkotlin/Unit;>;LX/HtJ<-LX/Agk;>;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bd A[ADDED_TO_REGION, REMOVE, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b8 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x012a -> B:14:0x0042). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A08(X.InterfaceC1074AXb r13, X.HtJ r14, X.G0V r15, int r16, long r17) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.A08(X.AXb, X.HtJ, X.G0V, int, long):java.lang.Object");
    }

    /* JADX WARN: Incorrect types in method signature: (LX/AXb;JILX/G0V<-LX/Agk;-Ljava/lang/Float;Lkotlin/Unit;>;LX/HtJ<-LX/Agk;>;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bd A[ADDED_TO_REGION, REMOVE, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b8 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x012a -> B:14:0x0042). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A09(X.InterfaceC1074AXb r13, X.HtJ r14, X.G0V r15, int r16, long r17) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.A09(X.AXb, X.HtJ, X.G0V, int, long):java.lang.Object");
    }

    /* JADX WARN: Incorrect types in method signature: (LX/BRr;LX/G0U<-LX/AWx;Lkotlin/Unit;>;Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;LX/G0V<-LX/Agk;-LX/AWx;Lkotlin/Unit;>;LX/HtJ<-Lkotlin/Unit;>;)Ljava/lang/Object; */
    public static final Object A0C(BRr bRr, HtJ htJ, Function0 function0, Function0 function02, G0U g0u, G0V g0v) {
        Object objA01 = ForEachGestureKt.A01(bRr, htJ, new DragGestureDetectorKt$detectDragGestures$13(null, null, new C2283BSj(4), function02, C2295BSv.A00(function0, 11), g0v, new BT0(g0u, 0)));
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        if (objA01 != enumC10460Hji) {
            objA01 = Unit.INSTANCE;
        }
        return objA01 != enumC10460Hji ? Unit.INSTANCE : objA01;
    }

    /* JADX WARN: Code restructure failed: missing block: B:173:0x021d, code lost:
    
        r3 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x02dd, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0218, code lost:
    
        if (r11.A03() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x02d9, code lost:
    
        if (X.AWx.A00(X.AWx.A08(r12)) == 0.0f) goto L68;
     */
    /* JADX WARN: Incorrect types in method signature: (LX/AXb;LX/Agk;Lkotlin/jvm/functions/Function0<Ljava/lang/Boolean;>;LX/AYu;LX/G0W<-LX/Agk;-LX/Agk;-LX/AWx;Lkotlin/Unit;>;LX/G0V<-LX/Agk;-LX/AWx;Lkotlin/Unit;>;Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;LX/G0U<-LX/Agk;Lkotlin/Unit;>;LX/HtJ<-Lkotlin/Unit;>;)Ljava/lang/Object; */
    /* JADX WARN: Path cross not found for [B:91:0x02ce, B:82:0x02ae], limit reached: 194 */
    /* JADX WARN: Removed duplicated region for block: B:105:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03e6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0159 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02a3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0375 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0446 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0269 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02ed  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:110:0x036d -> B:99:0x02f8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:114:0x037a -> B:63:0x021d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:135:0x0449 -> B:61:0x021a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:137:0x044f -> B:61:0x021a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:147:0x0471 -> B:61:0x021a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:148:0x0473 -> B:123:0x03be). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:153:0x0497 -> B:123:0x03be). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:159:0x0509 -> B:123:0x03be). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:172:0x052e -> B:67:0x0241). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0186 -> B:24:0x00d1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x01a6 -> B:24:0x00d1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0218 -> B:24:0x00d1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:90:0x02c8 -> B:68:0x0246). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:92:0x02d9 -> B:68:0x0246). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(X.EnumC1108AYu r18, X.InterfaceC1074AXb r19, X.C1299Agk r20, X.HtJ r21, kotlin.jvm.functions.Function0 r22, kotlin.jvm.functions.Function0 r23, X.G0U r24, X.G0V r25, X.G0W r26) {
        /*
            Method dump skipped, instructions count: 1366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.A01(X.AYu, X.AXb, X.Agk, X.HtJ, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.G0U, X.G0V, X.G0W):java.lang.Object");
    }

    /* JADX WARN: Incorrect types in method signature: (LX/AXb;JLX/G0V<-LX/Agk;-Ljava/lang/Float;Lkotlin/Unit;>;LX/HtJ<-LX/Agk;>;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b5 A[ADDED_TO_REGION, REMOVE, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0122 -> B:14:0x0042). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A0A(X.InterfaceC1074AXb r14, X.HtJ r15, X.G0V r16, long r17) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.A0A(X.AXb, X.HtJ, X.G0V, long):java.lang.Object");
    }

    /* JADX WARN: Incorrect types in method signature: (LX/AXb;JLX/G0V<-LX/Agk;-LX/AWx;Lkotlin/Unit;>;LX/HtJ<-LX/Agk;>;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b1 A[ADDED_TO_REGION, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00da -> B:21:0x0068). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0105 -> B:21:0x0068). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x011a -> B:14:0x0042). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A0B(X.InterfaceC1074AXb r14, X.HtJ r15, X.G0V r16, long r17) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.A0B(X.AXb, X.HtJ, X.G0V, long):java.lang.Object");
    }

    public static void A0D(Object obj, Object obj2, Object obj3, C2320BTu c2320BTu, float f) {
        c2320BTu.A04 = obj;
        c2320BTu.A05 = obj2;
        c2320BTu.A06 = obj3;
        c2320BTu.A00 = f;
    }

    public static final boolean A0E(C1247Afe c1247Afe, long j) {
        C1299Agk c1299Agk;
        List<C1299Agk> list = c1247Afe.A05;
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                c1299Agk = null;
                break;
            }
            c1299Agk = list.get(i);
            if (c1299Agk.A08 == j) {
                break;
            }
            i++;
        }
        C1299Agk c1299Agk2 = c1299Agk;
        if (c1299Agk2 != null && c1299Agk2.A0F) {
            z = true;
        }
        return !z;
    }
}
