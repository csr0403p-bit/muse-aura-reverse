package androidx.compose.foundation.gestures;

import X.AWo;
import X.AWx;
import X.AbstractC07117nq;
import X.C3UX;
import X.C8j3;
import X.G0U;
import X.G0V;
import X.G0W;
import X.HtJ;
import X.InterfaceC1074AXb;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1", f = "TapGestureDetector.kt", l = {277, 283}, m = "invokeSuspend", v = 1)
/* loaded from: classes4.dex */
public final class TapGestureDetectorKt$detectTapAndPress$2$1 extends AbstractC07117nq implements G0V<InterfaceC1074AXb, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C3UX $$this$coroutineScope;
    public final /* synthetic */ G0W<AWo, AWx, HtJ<? super Unit>, Object> $onPress;
    public final /* synthetic */ G0U<AWx, Unit> $onTap;
    public final /* synthetic */ PressGestureScopeImpl $pressScope;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            r8 = r13
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r12.label
            r5 = 2
            r7 = 1
            r9 = 0
            if (r0 == 0) goto L47
            if (r0 == r7) goto L6f
            if (r0 != r5) goto La3
            java.lang.Object r2 = r12.L$0
            X.HoC r2 = (X.HoC) r2
            X.Hwg.A00(r13)
        L15:
            X.Agk r8 = (X.C1299Agk) r8
            if (r8 != 0) goto L2b
            X.3UX r3 = r12.$$this$coroutineScope
            androidx.compose.foundation.gestures.PressGestureScopeImpl r1 = r12.$pressScope
            r0 = 14
            X.BU2 r1 = X.BU2.A0O(r1, r9, r0)
            java.lang.Integer r0 = X.C79.A0K
            androidx.compose.foundation.gestures.TapGestureDetectorKt.A07(r0, r1, r3, r2)
        L28:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L2b:
            r8.A02()
            X.3UX r3 = r12.$$this$coroutineScope
            androidx.compose.foundation.gestures.PressGestureScopeImpl r1 = r12.$pressScope
            r0 = 15
            X.BU2 r1 = X.BU2.A0O(r1, r9, r0)
            java.lang.Integer r0 = X.C79.A0K
            androidx.compose.foundation.gestures.TapGestureDetectorKt.A07(r0, r1, r3, r2)
            X.G0U<X.AWx, kotlin.Unit> r2 = r12.$onTap
            if (r2 == 0) goto L28
            long r0 = r8.A0A
            X.AnonymousClass006.A1T(r2, r0)
            goto L28
        L47:
            X.Hwg.A00(r13)
            java.lang.Object r3 = r12.L$0
            X.AXb r3 = (X.InterfaceC1074AXb) r3
            X.3UX r6 = r12.$$this$coroutineScope
            java.lang.Integer r2 = X.C79.A0K
            androidx.compose.foundation.gestures.PressGestureScopeImpl r1 = r12.$pressScope
            r0 = 16
            X.BU2 r1 = X.BU2.A0O(r1, r9, r0)
            X.6ys r0 = X.C6ys.A00
            X.Hqc r2 = X.GAo.A02(r2, r0, r1, r6)
            r12.L$0 = r3
            r12.L$1 = r2
            r12.label = r7
            X.AXj r0 = X.EnumC1080AXj.A04
            java.lang.Object r8 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A04(r3, r0, r12, r7)
            if (r8 != r4) goto L79
            return r4
        L6f:
            java.lang.Object r2 = r12.L$1
            X.HoC r2 = (X.HoC) r2
            java.lang.Object r0 = r12.L$0
            X.AXb r3 = X.C8j3.A0g(r0, r13)
        L79:
            X.Agk r8 = (X.C1299Agk) r8
            r8.A02()
            X.G0W<X.AWo, X.AWx, X.HtJ<? super kotlin.Unit>, java.lang.Object> r10 = r12.$onPress
            X.G0W<X.AWo, X.AWx, X.HtJ<? super kotlin.Unit>, java.lang.Object> r0 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A00
            if (r10 == r0) goto L94
            X.3UX r1 = r12.$$this$coroutineScope
            androidx.compose.foundation.gestures.PressGestureScopeImpl r7 = r12.$pressScope
            r11 = 11
            X.BUC r6 = new X.BUC
            r6.<init>(r7, r8, r9, r10, r11)
            java.lang.Integer r0 = X.C79.A0K
            androidx.compose.foundation.gestures.TapGestureDetectorKt.A07(r0, r6, r1, r2)
        L94:
            r12.L$0 = r2
            r12.L$1 = r9
            r12.label = r5
            X.AXj r0 = X.EnumC1080AXj.A04
            java.lang.Object r8 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A03(r3, r0, r12)
            if (r8 != r4) goto L15
            return r4
        La3:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/3UX;LX/G0W<-LX/AWo;-LX/AWx;-LX/HtJ<-Lkotlin/Unit;>;+Ljava/lang/Object;>;LX/G0U<-LX/AWx;Lkotlin/Unit;>;Landroidx/compose/foundation/gestures/PressGestureScopeImpl;LX/HtJ<-Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapAndPress$2$1;>;)V */
    public TapGestureDetectorKt$detectTapAndPress$2$1(PressGestureScopeImpl pressGestureScopeImpl, HtJ htJ, G0U g0u, G0W g0w, C3UX c3ux) {
        super(2, htJ);
        this.$$this$coroutineScope = c3ux;
        this.$onPress = g0w;
        this.$onTap = g0u;
        this.$pressScope = pressGestureScopeImpl;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        C3UX c3ux = this.$$this$coroutineScope;
        G0W<AWo, AWx, HtJ<? super Unit>, Object> g0w = this.$onPress;
        TapGestureDetectorKt$detectTapAndPress$2$1 tapGestureDetectorKt$detectTapAndPress$2$1 = new TapGestureDetectorKt$detectTapAndPress$2$1(this.$pressScope, htJ, this.$onTap, g0w, c3ux);
        tapGestureDetectorKt$detectTapAndPress$2$1.L$0 = obj;
        return tapGestureDetectorKt$detectTapAndPress$2$1;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(InterfaceC1074AXb interfaceC1074AXb, HtJ<? super Unit> htJ) {
        return ((TapGestureDetectorKt$detectTapAndPress$2$1) C8j3.A1E(htJ, interfaceC1074AXb, this)).invokeSuspend(Unit.INSTANCE);
    }
}
