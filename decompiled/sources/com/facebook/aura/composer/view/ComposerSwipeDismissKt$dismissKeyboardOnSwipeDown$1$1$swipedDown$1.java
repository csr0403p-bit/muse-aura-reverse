package com.facebook.aura.composer.view;

import X.AbstractC07117nq;
import X.C1299Agk;
import X.G0V;
import X.HtJ;
import X.InterfaceC1074AXb;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.composer.view.ComposerSwipeDismissKt$dismissKeyboardOnSwipeDown$1$1$swipedDown$1", f = "ComposerSwipeDismiss.kt", l = {29}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class ComposerSwipeDismissKt$dismissKeyboardOnSwipeDown$1$1$swipedDown$1 extends AbstractC07117nq implements G0V<InterfaceC1074AXb, HtJ<? super Boolean>, Object> {
    public final /* synthetic */ C1299Agk $down;
    public final /* synthetic */ float $touchSlop;
    public float F$0;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposerSwipeDismissKt$dismissKeyboardOnSwipeDown$1$1$swipedDown$1(float f, C1299Agk c1299Agk, HtJ<? super ComposerSwipeDismissKt$dismissKeyboardOnSwipeDown$1$1$swipedDown$1> htJ) {
        super(2, htJ);
        this.$touchSlop = f;
        this.$down = c1299Agk;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        ComposerSwipeDismissKt$dismissKeyboardOnSwipeDown$1$1$swipedDown$1 composerSwipeDismissKt$dismissKeyboardOnSwipeDown$1$1$swipedDown$1 = new ComposerSwipeDismissKt$dismissKeyboardOnSwipeDown$1$1$swipedDown$1(this.$touchSlop, this.$down, htJ);
        composerSwipeDismissKt$dismissKeyboardOnSwipeDown$1$1$swipedDown$1.L$0 = obj;
        return composerSwipeDismissKt$dismissKeyboardOnSwipeDown$1$1$swipedDown$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0063 -> B:6:0x0014). Please report as a decompilation issue!!! */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r7 = r14.L$0
            X.AXb r7 = (X.InterfaceC1074AXb) r7
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r14.label
            r13 = 0
            r12 = 0
            r5 = 1
            if (r0 == 0) goto L68
            if (r0 != r5) goto L77
            float r4 = r14.F$0
            X.Hwg.A00(r15)
        L14:
            X.Afe r15 = (X.C1247Afe) r15
            java.util.List<X.Agk> r0 = r15.A05
            X.Agk r11 = r14.$down
            java.util.Iterator r10 = r0.iterator()
        L1e:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L66
            java.lang.Object r8 = r10.next()
            r0 = r8
            X.Agk r0 = (X.C1299Agk) r0
            long r2 = r0.A08
            long r0 = r11.A08
            int r9 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r9 != 0) goto L1e
        L33:
            X.Agk r8 = (X.C1299Agk) r8
            if (r8 == 0) goto L72
            boolean r0 = r8.A0F
            if (r0 == 0) goto L72
            long r0 = X.AbstractC1078AXh.A00(r8)
            float r0 = X.AnonymousClass004.A00(r0)
            float r4 = r4 + r0
            float r0 = r14.$touchSlop
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 <= 0) goto L4d
            r8.A02()
        L4d:
            float r1 = java.lang.Math.abs(r4)
            float r0 = r14.$touchSlop
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L6d
            X.AXj r0 = X.EnumC1080AXj.A03
            r14.L$0 = r7
            r14.F$0 = r4
            r14.label = r5
            java.lang.Object r15 = r7.A4z(r0, r14)
            if (r15 != r6) goto L14
            return r6
        L66:
            r8 = 0
            goto L33
        L68:
            X.Hwg.A00(r15)
            r4 = 0
            goto L4d
        L6d:
            int r0 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r0 <= 0) goto L72
            r13 = 1
        L72:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r13)
            return r0
        L77:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.composer.view.ComposerSwipeDismissKt$dismissKeyboardOnSwipeDown$1$1$swipedDown$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final Object invoke(InterfaceC1074AXb interfaceC1074AXb, HtJ<? super Boolean> htJ) {
        return ((ComposerSwipeDismissKt$dismissKeyboardOnSwipeDown$1$1$swipedDown$1) create(interfaceC1074AXb, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
