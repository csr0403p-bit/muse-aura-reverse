package androidx.compose.foundation.gestures;

import X.ARY;
import X.AT5;
import X.AWo;
import X.AWx;
import X.AbstractC1078AXh;
import X.BRr;
import X.BUJ;
import X.C05393bl;
import X.C10533Hqc;
import X.C1247Afe;
import X.C1299Agk;
import X.C1BO;
import X.C2325BTz;
import X.C3UX;
import X.C3cG;
import X.C6ys;
import X.C8916FtY;
import X.C8j3;
import X.G0U;
import X.G0V;
import X.G0W;
import X.GAo;
import X.HoC;
import X.HtJ;
import X.Hxb;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes4.dex */
public abstract class TapGestureDetectorKt {
    public static final G0W<AWo, AWx, HtJ<? super Unit>, Object> A00 = new C2325BTz(0, null);

    /* JADX WARN: Incorrect types in method signature: (LX/AXb;LX/3UX;Landroidx/compose/foundation/gestures/PressGestureScopeImpl;LX/G0U<-LX/AWx;Lkotlin/Unit;>;LX/G0U<-LX/AWx;Lkotlin/Unit;>;LX/G0W<-LX/AWo;-LX/AWx;-LX/HtJ<-Lkotlin/Unit;>;+Ljava/lang/Object;>;LX/G0U<-LX/AWx;Lkotlin/Unit;>;LX/HtJ<-Lkotlin/Unit;>;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0297  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(androidx.compose.foundation.gestures.PressGestureScopeImpl r9, X.InterfaceC1074AXb r10, X.HtJ r11, X.G0U r12, X.G0U r13, X.G0U r14, X.G0W r15, X.C3UX r16) {
        /*
            Method dump skipped, instructions count: 762
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.A00(androidx.compose.foundation.gestures.PressGestureScopeImpl, X.AXb, X.HtJ, X.G0U, X.G0U, X.G0U, X.G0W, X.3UX):java.lang.Object");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x004c -> B:13:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(X.InterfaceC1074AXb r6, X.EnumC1080AXj r7, X.HtJ r8) {
        /*
            r1 = 0
            r5 = 1
            boolean r0 = r8 instanceof X.C2313BTn
            if (r0 == 0) goto L4f
            r4 = r8
            X.BTn r4 = (X.C2313BTn) r4
            int r0 = r4.$t
            if (r0 != r5) goto L4f
            int r3 = r4.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto L4f
            int r3 = r3 - r2
            r4.A00 = r3
        L18:
            java.lang.Object r3 = r4.A03
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.A00
            if (r0 == 0) goto L3d
            if (r0 != r5) goto L55
            boolean r1 = r4.A04
            java.lang.Object r7 = r4.A02
            X.AXj r7 = (X.EnumC1080AXj) r7
            java.lang.Object r0 = r4.A01
            X.AXb r6 = X.C8j3.A0g(r0, r3)
        L2e:
            X.Afe r3 = (X.C1247Afe) r3
            boolean r0 = A09(r3, r1, r5)
            if (r0 == 0) goto L40
            java.util.List<X.Agk> r0 = r3.A05
            java.lang.Object r2 = X.C8j4.A0p(r0)
            return r2
        L3d:
            X.Hwg.A00(r3)
        L40:
            r4.A01 = r6
            r4.A02 = r7
            r4.A04 = r1
            r4.A00 = r5
            java.lang.Object r3 = r6.A4z(r7, r4)
            if (r3 != r2) goto L2e
            return r2
        L4f:
            X.BTn r4 = new X.BTn
            r4.<init>(r5, r8)
            goto L18
        L55:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.A01(X.AXb, X.AXj, X.HtJ):java.lang.Object");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Incorrect types in method signature: (LX/AXb;ZLX/AXj;LX/HtJ<-LX/Agk;>;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x004c -> B:13:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A04(X.InterfaceC1074AXb r6, X.EnumC1080AXj r7, X.HtJ r8, boolean r9) {
        /*
            r4 = 0
            boolean r0 = r8 instanceof X.C2313BTn
            if (r0 == 0) goto L4f
            r5 = r8
            X.BTn r5 = (X.C2313BTn) r5
            int r0 = r5.$t
            if (r0 != r4) goto L4f
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4f
            int r2 = r2 - r1
            r5.A00 = r2
        L17:
            java.lang.Object r3 = r5.A03
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r5.A00
            r1 = 1
            if (r0 == 0) goto L3d
            if (r0 != r1) goto L55
            boolean r9 = r5.A04
            java.lang.Object r7 = r5.A02
            X.AXj r7 = (X.EnumC1080AXj) r7
            java.lang.Object r0 = r5.A01
            X.AXb r6 = X.C8j3.A0g(r0, r3)
        L2e:
            X.Afe r3 = (X.C1247Afe) r3
            boolean r0 = A09(r3, r9, r4)
            if (r0 == 0) goto L40
            java.util.List<X.Agk> r0 = r3.A05
            java.lang.Object r2 = r0.get(r4)
            return r2
        L3d:
            X.Hwg.A00(r3)
        L40:
            r5.A01 = r6
            r5.A02 = r7
            r5.A04 = r9
            r5.A00 = r1
            java.lang.Object r3 = r6.A4z(r7, r5)
            if (r3 != r2) goto L2e
            return r2
        L4f:
            X.BTn r5 = new X.BTn
            r5.<init>(r4, r8)
            goto L17
        L55:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.A04(X.AXb, X.AXj, X.HtJ, boolean):java.lang.Object");
    }

    /* JADX WARN: Incorrect types in method signature: (LX/BRr;LX/G0U<-LX/AWx;Lkotlin/Unit;>;LX/G0U<-LX/AWx;Lkotlin/Unit;>;LX/G0W<-LX/AWo;-LX/AWx;-LX/HtJ<-Lkotlin/Unit;>;+Ljava/lang/Object;>;LX/G0U<-LX/AWx;Lkotlin/Unit;>;LX/HtJ<-Lkotlin/Unit;>;)Ljava/lang/Object; */
    public static final Object A06(BRr bRr, HtJ htJ, G0U g0u, G0U g0u2, G0U g0u3, G0W g0w) {
        return C3cG.A0U(Hxb.A00(new BUJ(bRr, null, g0u, g0u2, g0u3, g0w), htJ));
    }

    public static final C10533Hqc A07(Integer num, G0V g0v, C3UX c3ux, HoC hoC) {
        return GAo.A02(num, C6ys.A00, new C05393bl(g0v, (C1BO<AWx>) hoC, (AT5<AWx, ARY>) null, (HtJ<? super C05393bl>) 4), c3ux);
    }

    public static final boolean A09(C1247Afe c1247Afe, boolean z, boolean z2) {
        if (z2) {
            List<C1299Agk> list = c1247Afe.A05;
            int size = list.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    if (C8j3.A0h(list, i).A07 != 2) {
                        break;
                    }
                    i++;
                } else if ((c1247Afe.A01 & 33) == 0) {
                    return false;
                }
            }
        }
        List<C1299Agk> list2 = c1247Afe.A05;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C1299Agk c1299AgkA0h = C8j3.A0h(list2, i2);
            if (z) {
                if (c1299AgkA0h.A03() || c1299AgkA0h.A0G || !c1299AgkA0h.A0F) {
                    return false;
                }
            } else if (!AbstractC1078AXh.A01(c1299AgkA0h)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000e  */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, X.AXd] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A02(X.InterfaceC1074AXb r9, X.EnumC1080AXj r10, X.HtJ<? super X.AbstractC1077AXf> r11) {
        /*
            r3 = 10
            boolean r0 = r11 instanceof X.C2310BTk
            if (r0 == 0) goto Le
            r0 = r11
            X.BTk r0 = (X.C2310BTk) r0
            int r1 = r0.$t
            r0 = 1
            if (r1 == r3) goto Lf
        Le:
            r0 = 0
        Lf:
            if (r0 == 0) goto L2f
            r8 = r11
            X.BTk r8 = (X.C2310BTk) r8
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2f
            int r2 = r2 - r1
            r8.A00 = r2
        L1f:
            java.lang.Object r1 = r8.A02
            X.Hji r7 = X.EnumC10460Hji.A02
            int r0 = r8.A00
            r6 = 1
            if (r0 == 0) goto L3e
            if (r0 != r6) goto L39
            java.lang.Object r5 = r8.A01
            X.Hqv r5 = (X.C10543Hqv) r5
            goto L35
        L2f:
            X.BTk r8 = new X.BTk
            r8.<init>(r3, r11)
            goto L1f
        L35:
            X.Hwg.A00(r1)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L5f
            goto L5c
        L39:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L3e:
            X.Hqv r5 = X.C3cG.A10(r1)
            X.AXd r0 = X.C1076AXd.A00
            r5.element = r0
            long r2 = X.AnonymousClass007.A0D(r9)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L5f
            r4 = 0
            r1 = 2
            X.BTw r0 = new X.BTw     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L5f
            r0.<init>(r10, r5, r4, r1)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L5f
            r8.A01 = r5     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L5f
            r8.A00 = r6     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L5f
            java.lang.Object r0 = r9.AiT(r8, r0, r2)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L5f
            if (r0 != r7) goto L5c
            return r7
        L5c:
            T r7 = r5.element
            return r7
        L5f:
            X.AXe r0 = X.AXe.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.A02(X.AXb, X.AXj, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ba, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ae  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00ab -> B:14:0x0034). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A03(X.InterfaceC1074AXb r14, X.EnumC1080AXj r15, X.HtJ<? super X.C1299Agk> r16) {
        /*
            r3 = 10
            r4 = r16
            boolean r0 = r4 instanceof X.C2312BTm
            if (r0 == 0) goto Lae
            r10 = r4
            X.BTm r10 = (X.C2312BTm) r10
            int r0 = r10.$t
            if (r0 != r3) goto Lae
            int r2 = r10.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lae
            int r2 = r2 - r1
            r10.A00 = r2
        L1a:
            java.lang.Object r1 = r10.A03
            X.Hji r9 = X.EnumC10460Hji.A02
            int r0 = r10.A00
            r13 = 0
            r8 = 2
            r7 = 0
            r6 = 1
            if (r0 == 0) goto L48
            if (r0 == r6) goto L58
            if (r0 != r8) goto Lb5
            java.lang.Object r15 = r10.A02
            X.AXj r15 = (X.EnumC1080AXj) r15
            java.lang.Object r0 = r10.A01
            X.AXb r14 = X.C8j3.A0g(r0, r1)
        L34:
            X.Afe r1 = (X.C1247Afe) r1
            java.util.List<X.Agk> r3 = r1.A05
            int r2 = r3.size()
            r1 = 0
        L3d:
            if (r1 >= r2) goto L4b
            boolean r0 = X.C1299Agk.A01(r3, r1)
            if (r0 != 0) goto Lba
            int r1 = r1 + 1
            goto L3d
        L48:
            X.Hwg.A00(r1)
        L4b:
            r10.A01 = r14
            r10.A02 = r15
            r10.A00 = r6
            java.lang.Object r1 = r14.A4z(r15, r10)
            if (r1 != r9) goto L62
            return r9
        L58:
            java.lang.Object r15 = r10.A02
            X.AXj r15 = (X.EnumC1080AXj) r15
            java.lang.Object r0 = r10.A01
            X.AXb r14 = X.C8j3.A0g(r0, r1)
        L62:
            X.Afe r1 = (X.C1247Afe) r1
            java.util.List<X.Agk> r11 = r1.A05
            int r2 = r11.size()
            r1 = 0
        L6b:
            if (r1 >= r2) goto Lbb
            X.Agk r0 = X.C8j3.A0h(r11, r1)
            boolean r0 = X.AbstractC1078AXh.A02(r0)
            if (r0 != 0) goto L9c
            int r5 = r11.size()
            r4 = 0
        L7c:
            if (r4 >= r5) goto L9f
            X.Agk r12 = X.C8j3.A0h(r11, r4)
            boolean r0 = r12.A03()
            if (r0 != 0) goto Lba
            r0 = r14
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine r0 = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine) r0
            X.AaN r0 = r0.A04
            long r2 = r0.A00
            long r0 = r14.AFT()
            boolean r0 = X.AbstractC1078AXh.A04(r12, r2, r0)
            if (r0 != 0) goto Lba
            int r4 = r4 + 1
            goto L7c
        L9c:
            int r1 = r1 + 1
            goto L6b
        L9f:
            X.AXj r0 = X.EnumC1080AXj.A02
            r10.A01 = r14
            r10.A02 = r15
            r10.A00 = r8
            java.lang.Object r1 = r14.A4z(r0, r10)
            if (r1 != r9) goto L34
            return r9
        Lae:
            X.BTm r10 = new X.BTm
            r10.<init>(r3, r4)
            goto L1a
        Lb5:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        Lba:
            return r13
        Lbb:
            java.lang.Object r9 = r11.get(r7)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.A03(X.AXb, X.AXj, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035 A[LOOP:0: B:14:0x0033->B:15:0x0035, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0057 -> B:13:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A05(X.InterfaceC1074AXb r7, X.HtJ<? super kotlin.Unit> r8) {
        /*
            r3 = 9
            boolean r0 = r8 instanceof X.C2310BTk
            if (r0 == 0) goto L5a
            r6 = r8
            X.BTk r6 = (X.C2310BTk) r6
            int r0 = r6.$t
            if (r0 != r3) goto L5a
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5a
            int r2 = r2 - r1
            r6.A00 = r2
        L18:
            java.lang.Object r1 = r6.A02
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.A00
            r4 = 1
            if (r0 == 0) goto L4c
            if (r0 != r4) goto L63
            java.lang.Object r0 = r6.A01
            X.AXb r7 = X.C8j3.A0g(r0, r1)
        L29:
            X.Afe r1 = (X.C1247Afe) r1
            java.util.List<X.Agk> r3 = r1.A05
            int r1 = r3.size()
            r2 = 0
            r0 = 0
        L33:
            if (r0 >= r1) goto L3b
            X.C1299Agk.A00(r3, r0)
            int r0 = r0 + 1
            goto L33
        L3b:
            int r1 = r3.size()
        L3f:
            if (r2 >= r1) goto L60
            X.Agk r0 = X.C8j3.A0h(r3, r2)
            boolean r0 = r0.A0F
            if (r0 != 0) goto L4f
            int r2 = r2 + 1
            goto L3f
        L4c:
            X.Hwg.A00(r1)
        L4f:
            r6.A01 = r7
            r6.A00 = r4
            java.lang.Object r1 = X.InterfaceC1074AXb.A00(r7, r6)
            if (r1 != r5) goto L29
            return r5
        L5a:
            X.BTk r6 = new X.BTk
            r6.<init>(r3, r8)
            goto L18
        L60:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L63:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.A05(X.AXb, X.HtJ):java.lang.Object");
    }

    public static void A08(Object obj, Object obj2, Object obj3, Object obj4, C8916FtY c8916FtY) {
        c8916FtY.A01 = obj;
        c8916FtY.A02 = obj2;
        c8916FtY.A03 = obj3;
        c8916FtY.A04 = obj4;
    }
}
