package com.facebook.aura.markdown.render.inline;

import X.AbstractC07117nq;
import X.C1299Agk;
import X.F1F;
import X.G0V;
import X.HtJ;
import X.InterfaceC1074AXb;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.markdown.render.inline.InlineEntityGesturesKt$inlineEntityGestures$2$1$1$released$1", f = "InlineEntityGestures.kt", l = {139}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class InlineEntityGesturesKt$inlineEntityGestures$2$1$1$released$1 extends AbstractC07117nq implements G0V<InterfaceC1074AXb, HtJ<? super Boolean>, Object> {
    public final /* synthetic */ F1F $cancelled;
    public final /* synthetic */ C1299Agk $down;
    public final /* synthetic */ F1F $tapped;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InlineEntityGesturesKt$inlineEntityGestures$2$1$1$released$1(C1299Agk c1299Agk, F1F f1f, F1F f1f2, HtJ<? super InlineEntityGesturesKt$inlineEntityGestures$2$1$1$released$1> htJ) {
        super(2, htJ);
        this.$down = c1299Agk;
        this.$cancelled = f1f;
        this.$tapped = f1f2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        InlineEntityGesturesKt$inlineEntityGestures$2$1$1$released$1 inlineEntityGesturesKt$inlineEntityGestures$2$1$1$released$1 = new InlineEntityGesturesKt$inlineEntityGestures$2$1$1$released$1(this.$down, this.$cancelled, this.$tapped, htJ);
        inlineEntityGesturesKt$inlineEntityGestures$2$1$1$released$1.L$0 = obj;
        return inlineEntityGesturesKt$inlineEntityGestures$2$1$1$released$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0070 -> B:6:0x0010). Please report as a decompilation issue!!! */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r6 = r11.L$0
            X.AXb r6 = (X.InterfaceC1074AXb) r6
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r11.label
            r4 = 1
            if (r0 == 0) goto L63
            if (r0 != r4) goto L73
            X.Hwg.A00(r12)
        L10:
            X.Afe r12 = (X.C1247Afe) r12
            java.util.List<X.Agk> r0 = r12.A05
            X.Agk r10 = r11.$down
            java.util.Iterator r9 = r0.iterator()
        L1a:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L61
            java.lang.Object r7 = r9.next()
            r0 = r7
            X.Agk r0 = (X.C1299Agk) r0
            long r2 = r0.A08
            long r0 = r10.A08
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 != 0) goto L1a
        L2f:
            X.Agk r7 = (X.C1299Agk) r7
            if (r7 == 0) goto L5e
            long r2 = r7.A0A
            X.Agk r0 = r11.$down
            long r0 = r0.A0A
            long r0 = X.AWx.A04(r2, r0)
            float r1 = X.AWx.A00(r0)
            r0 = r6
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine r0 = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine) r0
            X.AaN r0 = r0.A04
            float r0 = X.AnonymousClass006.A01(r0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L5e
            boolean r0 = r7.A0F
            if (r0 != 0) goto L66
            r7.A02()
            X.F1F r0 = r11.$tapped
        L57:
            r0.element = r4
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        L5e:
            X.F1F r0 = r11.$cancelled
            goto L57
        L61:
            r7 = 0
            goto L2f
        L63:
            X.Hwg.A00(r12)
        L66:
            X.AXj r0 = X.EnumC1080AXj.A03
            r11.L$0 = r6
            r11.label = r4
            java.lang.Object r12 = r6.A4z(r0, r11)
            if (r12 != r5) goto L10
            return r5
        L73:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.markdown.render.inline.InlineEntityGesturesKt$inlineEntityGestures$2$1$1$released$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final Object invoke(InterfaceC1074AXb interfaceC1074AXb, HtJ<? super Boolean> htJ) {
        return ((InlineEntityGesturesKt$inlineEntityGestures$2$1$1$released$1) create(interfaceC1074AXb, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
