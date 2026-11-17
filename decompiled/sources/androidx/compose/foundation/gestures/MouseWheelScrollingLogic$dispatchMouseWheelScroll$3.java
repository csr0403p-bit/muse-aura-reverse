package androidx.compose.foundation.gestures;

import X.AOW;
import X.AT7;
import X.AbstractC07127nr;
import X.C1051ASv;
import X.C10543Hqv;
import X.C1269AgE;
import X.C8j3;
import X.G0V;
import X.HtJ;
import X.InterfaceC1258Afu;
import com.facebook.aura.accountcenter.MC;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$3", f = "MouseWheelScrollingLogic.kt", l = {228, 241, MC.mwa_accounts_center_settings.__CONFIG__}, m = "invokeSuspend", v = 1)
/* loaded from: classes4.dex */
public final class MouseWheelScrollingLogic$dispatchMouseWheelScroll$3 extends AbstractC07127nr implements G0V<InterfaceC1258Afu, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C10543Hqv<AT7<Float, AOW>> $animationState;
    public final /* synthetic */ float $speed;
    public final /* synthetic */ C10543Hqv<C1269AgE> $targetScrollDelta;
    public final /* synthetic */ C1051ASv $targetValue;
    public final /* synthetic */ ScrollingLogic $this_dispatchMouseWheelScroll;
    public final /* synthetic */ float $threshold;
    public int I$0;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ MouseWheelScrollingLogic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/ASv;LX/Hqv<LX/AT7<Ljava/lang/Float;LX/AOW;>;>;LX/Hqv<LX/AgE;>;FLandroidx/compose/foundation/gestures/MouseWheelScrollingLogic;FLandroidx/compose/foundation/gestures/ScrollingLogic;LX/HtJ<-Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;>;)V */
    public MouseWheelScrollingLogic$dispatchMouseWheelScroll$3(MouseWheelScrollingLogic mouseWheelScrollingLogic, ScrollingLogic scrollingLogic, HtJ htJ, C1051ASv c1051ASv, C10543Hqv c10543Hqv, C10543Hqv c10543Hqv2, float f, float f2) {
        super(2, htJ);
        this.$targetValue = c1051ASv;
        this.$animationState = c10543Hqv;
        this.$targetScrollDelta = c10543Hqv2;
        this.$threshold = f;
        this.this$0 = mouseWheelScrollingLogic;
        this.$speed = f2;
        this.$this_dispatchMouseWheelScroll = scrollingLogic;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        C1051ASv c1051ASv = this.$targetValue;
        C10543Hqv<AT7<Float, AOW>> c10543Hqv = this.$animationState;
        C10543Hqv<C1269AgE> c10543Hqv2 = this.$targetScrollDelta;
        float f = this.$threshold;
        MouseWheelScrollingLogic$dispatchMouseWheelScroll$3 mouseWheelScrollingLogic$dispatchMouseWheelScroll$3 = new MouseWheelScrollingLogic$dispatchMouseWheelScroll$3(this.this$0, this.$this_dispatchMouseWheelScroll, htJ, c1051ASv, c10543Hqv, c10543Hqv2, f, this.$speed);
        mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.L$0 = obj;
        return mouseWheelScrollingLogic$dispatchMouseWheelScroll$3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00f5, code lost:
    
        if (androidx.compose.animation.core.SuspendAnimationKt.A02(new X.ASj(X.C2HU.A02, r0, 0), r9, X.C8j3.A0u(r11), r25, new X.BTX(r8, r14, r2, r16, 4), true) == r7) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x015f  */
    /* JADX WARN: Type inference failed for: r0v19, types: [T, X.AT7] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0107 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0146 -> B:32:0x0157). Please report as a decompilation issue!!! */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(InterfaceC1258Afu interfaceC1258Afu, HtJ<? super Unit> htJ) {
        return ((MouseWheelScrollingLogic$dispatchMouseWheelScroll$3) C8j3.A1E(htJ, interfaceC1258Afu, this)).invokeSuspend(Unit.INSTANCE);
    }
}
