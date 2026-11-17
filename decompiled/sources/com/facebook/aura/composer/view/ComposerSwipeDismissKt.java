package com.facebook.aura.composer.view;

import X.AaM;
import X.AbstractC07117nq;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BRg;
import X.BRr;
import X.C1110AYw;
import X.G0V;
import X.HtJ;
import X.InterfaceC1074AXb;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class ComposerSwipeDismissKt {
    public static final BRg dismissKeyboardOnSwipeDown(BRg bRg, final C1110AYw c1110AYw, final Function0<Unit> function0) {
        AnonymousClass005.A0x(bRg, c1110AYw, function0);
        return AaM.A00(bRg, new PointerInputEventHandler() { // from class: com.facebook.aura.composer.view.ComposerSwipeDismissKt.dismissKeyboardOnSwipeDown.1

            @DebugMetadata(c = "com.facebook.aura.composer.view.ComposerSwipeDismissKt$dismissKeyboardOnSwipeDown$1$1", f = "ComposerSwipeDismiss.kt", l = {21, 25, 42}, m = "invokeSuspend", v = 2)
            /* renamed from: com.facebook.aura.composer.view.ComposerSwipeDismissKt$dismissKeyboardOnSwipeDown$1$1, reason: invalid class name and collision with other inner class name */
            public final class C00731 extends AbstractC07117nq implements G0V<InterfaceC1074AXb, HtJ<? super Unit>, Object> {
                public final /* synthetic */ Function0<Unit> $onSwipeDown;
                public final /* synthetic */ C1110AYw $scrollState;
                public float F$0;
                public int I$0;
                public /* synthetic */ Object L$0;
                public Object L$1;
                public int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00731(C1110AYw c1110AYw, Function0<Unit> function0, HtJ<? super C00731> htJ) {
                    super(2, htJ);
                    this.$scrollState = c1110AYw;
                    this.$onSwipeDown = function0;
                }

                @Override // X.AbstractC8884Fsp
                public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                    C00731 c00731 = new C00731(this.$scrollState, this.$onSwipeDown, htJ);
                    c00731.L$0 = obj;
                    return c00731;
                }

                /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
                
                    if (r13.A0F == true) goto L17;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
                
                    if (r4 != r10) goto L8;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x005a -> B:8:0x0022). Please report as a decompilation issue!!! */
                @Override // X.AbstractC8884Fsp
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r16) {
                    /*
                        r15 = this;
                        r4 = r16
                        java.lang.Object r11 = r15.L$0
                        X.AXb r11 = (X.InterfaceC1074AXb) r11
                        X.Hji r10 = X.EnumC10460Hji.A02
                        int r0 = r15.label
                        r9 = 0
                        r1 = 0
                        r8 = 3
                        r5 = 2
                        r7 = 1
                        if (r0 == 0) goto L69
                        if (r0 == r7) goto L79
                        if (r0 == r5) goto L5f
                        if (r0 != r8) goto Lc4
                        int r1 = r15.I$0
                        float r2 = r15.F$0
                        java.lang.Object r12 = r15.L$1
                        X.Agk r12 = (X.C1299Agk) r12
                        X.Hwg.A00(r4)
                    L22:
                        X.Afe r4 = (X.C1247Afe) r4
                        java.util.List<X.Agk> r0 = r4.A05
                        java.util.Iterator r14 = r0.iterator()
                    L2a:
                        boolean r0 = r14.hasNext()
                        if (r0 == 0) goto L5d
                        java.lang.Object r13 = r14.next()
                        r0 = r13
                        X.Agk r0 = (X.C1299Agk) r0
                        long r5 = r0.A08
                        long r3 = r12.A08
                        int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                        if (r0 != 0) goto L2a
                    L3f:
                        X.Agk r13 = (X.C1299Agk) r13
                        if (r13 == 0) goto Lc9
                        r13.A02()
                        boolean r0 = r13.A0F
                        if (r0 != r7) goto Lc9
                    L4a:
                        X.AXj r0 = X.EnumC1080AXj.A03
                        r15.L$0 = r11
                        r15.L$1 = r12
                        r15.F$0 = r2
                        r15.I$0 = r1
                        r15.label = r8
                        java.lang.Object r4 = r11.A4z(r0, r15)
                        if (r4 != r10) goto L22
                    L5c:
                        return r10
                    L5d:
                        r13 = r9
                        goto L3f
                    L5f:
                        float r2 = r15.F$0
                        java.lang.Object r12 = r15.L$1
                        X.Agk r12 = (X.C1299Agk) r12
                        X.Hwg.A00(r4)
                        goto Lb4
                    L69:
                        X.Hwg.A00(r4)
                        X.AXj r0 = X.EnumC1080AXj.A03
                        r15.L$0 = r11
                        r15.label = r7
                        java.lang.Object r4 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A04(r11, r0, r15, r1)
                        if (r4 != r10) goto L7c
                        return r10
                    L79:
                        X.Hwg.A00(r4)
                    L7c:
                        X.Agk r4 = (X.C1299Agk) r4
                        int r0 = r4.A07
                        if (r0 != r7) goto Lc9
                        X.AYw r0 = r15.$scrollState
                        X.00r r0 = r0.A01
                        int r0 = r0.AGd()
                        if (r0 > 0) goto Lc9
                        r0 = r11
                        androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine r0 = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine) r0
                        X.AaN r0 = r0.A04
                        float r2 = X.AnonymousClass006.A01(r0)
                        X.AjM r0 = X.AbstractC1414Aij.A04(r0)
                        X.AXi r0 = r0.A0E
                        long r0 = r0.AHG()
                        com.facebook.aura.composer.view.ComposerSwipeDismissKt$dismissKeyboardOnSwipeDown$1$1$swipedDown$1 r3 = new com.facebook.aura.composer.view.ComposerSwipeDismissKt$dismissKeyboardOnSwipeDown$1$1$swipedDown$1
                        r3.<init>(r2, r4, r9)
                        r15.L$0 = r11
                        r15.L$1 = r4
                        r15.F$0 = r2
                        r15.label = r5
                        java.lang.Object r0 = r11.AiU(r15, r3, r0)
                        if (r0 == r10) goto L5c
                        r12 = r4
                        r4 = r0
                    Lb4:
                        java.lang.Boolean r4 = (java.lang.Boolean) r4
                        if (r4 == 0) goto Lc9
                        boolean r1 = r4.booleanValue()
                        if (r1 == 0) goto Lc9
                        kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r15.$onSwipeDown
                        r0.invoke()
                        goto L4a
                    Lc4:
                        java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                        throw r0
                    Lc9:
                        kotlin.Unit r10 = kotlin.Unit.INSTANCE
                        return r10
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.composer.view.ComposerSwipeDismissKt.AnonymousClass1.C00731.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // X.G0V
                public final Object invoke(InterfaceC1074AXb interfaceC1074AXb, HtJ<? super Unit> htJ) {
                    return ((C00731) create(interfaceC1074AXb, htJ)).invokeSuspend(Unit.INSTANCE);
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(BRr bRr, HtJ<? super Unit> htJ) {
                return AnonymousClass006.A0l(bRr, htJ, new C00731(c1110AYw, function0, null));
            }
        }, c1110AYw);
    }
}
