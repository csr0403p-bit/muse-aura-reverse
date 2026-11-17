package androidx.compose.foundation.gestures;

import X.AWo;
import X.AWx;
import X.AbstractC07117nq;
import X.AnonymousClass001;
import X.C3UX;
import X.C8j3;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.G0W;
import X.HtJ;
import X.Hwg;
import X.InterfaceC1074AXb;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1", f = "TapGestureDetector.kt", l = {105}, m = "invokeSuspend", v = 1)
/* loaded from: classes4.dex */
public final class TapGestureDetectorKt$detectTapGestures$2$1 extends AbstractC07117nq implements G0V<InterfaceC1074AXb, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C3UX $$this$coroutineScope;
    public final /* synthetic */ G0U<AWx, Unit> $onDoubleTap;
    public final /* synthetic */ G0U<AWx, Unit> $onLongPress;
    public final /* synthetic */ G0W<AWo, AWx, HtJ<? super Unit>, Object> $onPress;
    public final /* synthetic */ G0U<AWx, Unit> $onTap;
    public final /* synthetic */ PressGestureScopeImpl $pressScope;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/3UX;Landroidx/compose/foundation/gestures/PressGestureScopeImpl;LX/G0U<-LX/AWx;Lkotlin/Unit;>;LX/G0U<-LX/AWx;Lkotlin/Unit;>;LX/G0W<-LX/AWo;-LX/AWx;-LX/HtJ<-Lkotlin/Unit;>;+Ljava/lang/Object;>;LX/G0U<-LX/AWx;Lkotlin/Unit;>;LX/HtJ<-Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;>;)V */
    public TapGestureDetectorKt$detectTapGestures$2$1(PressGestureScopeImpl pressGestureScopeImpl, HtJ htJ, G0U g0u, G0U g0u2, G0U g0u3, G0W g0w, C3UX c3ux) {
        super(2, htJ);
        this.$$this$coroutineScope = c3ux;
        this.$pressScope = pressGestureScopeImpl;
        this.$onDoubleTap = g0u;
        this.$onLongPress = g0u2;
        this.$onPress = g0w;
        this.$onTap = g0u3;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        C3UX c3ux = this.$$this$coroutineScope;
        TapGestureDetectorKt$detectTapGestures$2$1 tapGestureDetectorKt$detectTapGestures$2$1 = new TapGestureDetectorKt$detectTapGestures$2$1(this.$pressScope, htJ, this.$onDoubleTap, this.$onLongPress, this.$onTap, this.$onPress, c3ux);
        tapGestureDetectorKt$detectTapGestures$2$1.L$0 = obj;
        return tapGestureDetectorKt$detectTapGestures$2$1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            InterfaceC1074AXb interfaceC1074AXb = (InterfaceC1074AXb) this.L$0;
            C3UX c3ux = this.$$this$coroutineScope;
            PressGestureScopeImpl pressGestureScopeImpl = this.$pressScope;
            G0U<AWx, Unit> g0u = this.$onDoubleTap;
            G0U<AWx, Unit> g0u2 = this.$onLongPress;
            G0W<AWo, AWx, HtJ<? super Unit>, Object> g0w = this.$onPress;
            G0U<AWx, Unit> g0u3 = this.$onTap;
            this.label = 1;
            if (TapGestureDetectorKt.A00(pressGestureScopeImpl, interfaceC1074AXb, this, g0u, g0u2, g0u3, g0w, c3ux) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(InterfaceC1074AXb interfaceC1074AXb, HtJ<? super Unit> htJ) {
        return ((TapGestureDetectorKt$detectTapGestures$2$1) C8j3.A1E(htJ, interfaceC1074AXb, this)).invokeSuspend(Unit.INSTANCE);
    }
}
