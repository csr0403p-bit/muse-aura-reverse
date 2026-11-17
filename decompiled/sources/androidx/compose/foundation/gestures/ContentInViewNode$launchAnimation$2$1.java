package androidx.compose.foundation.gestures;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.BTN;
import X.BTX;
import X.C1265AgA;
import X.C3MW;
import X.C8j3;
import X.EnumC10460Hji;
import X.G0V;
import X.HoC;
import X.HtJ;
import X.Hwg;
import X.InterfaceC1258Afu;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1", f = "ContentInViewNode.kt", l = {219}, m = "invokeSuspend", v = 1)
/* loaded from: classes4.dex */
public final class ContentInViewNode$launchAnimation$2$1 extends AbstractC07127nr implements G0V<InterfaceC1258Afu, HtJ<? super Unit>, Object> {
    public final /* synthetic */ HoC $animationJob;
    public final /* synthetic */ UpdatableAnimationState $animationState;
    public final /* synthetic */ C3MW $bringIntoViewSpec;
    public final /* synthetic */ long $viewportAdjustmentForReverseScroll;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C1265AgA this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Landroidx/compose/foundation/gestures/UpdatableAnimationState;LX/AgA;LX/3MW;JLX/HoC;LX/HtJ<-Landroidx/compose/foundation/gestures/ContentInViewNode$launchAnimation$2$1;>;)V */
    public ContentInViewNode$launchAnimation$2$1(C3MW c3mw, C1265AgA c1265AgA, UpdatableAnimationState updatableAnimationState, HtJ htJ, HoC hoC, long j) {
        super(2, htJ);
        this.$animationState = updatableAnimationState;
        this.this$0 = c1265AgA;
        this.$bringIntoViewSpec = c3mw;
        this.$viewportAdjustmentForReverseScroll = j;
        this.$animationJob = hoC;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        UpdatableAnimationState updatableAnimationState = this.$animationState;
        C1265AgA c1265AgA = this.this$0;
        ContentInViewNode$launchAnimation$2$1 contentInViewNode$launchAnimation$2$1 = new ContentInViewNode$launchAnimation$2$1(this.$bringIntoViewSpec, c1265AgA, updatableAnimationState, htJ, this.$animationJob, this.$viewportAdjustmentForReverseScroll);
        contentInViewNode$launchAnimation$2$1.L$0 = obj;
        return contentInViewNode$launchAnimation$2$1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            Object obj2 = this.L$0;
            this.$animationState.A00 = C1265AgA.A00(this.$bringIntoViewSpec, this.this$0, this.$viewportAdjustmentForReverseScroll);
            UpdatableAnimationState updatableAnimationState = this.$animationState;
            C1265AgA c1265AgA = this.this$0;
            BTX btx = new BTX(c1265AgA, updatableAnimationState, this.$animationJob, obj2, 2);
            BTN btn = new BTN(this.$bringIntoViewSpec, c1265AgA, updatableAnimationState, 0);
            this.label = 1;
            if (updatableAnimationState.A00(btn, btx, this) == enumC10460Hji) {
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
    public final /* bridge */ /* synthetic */ Object invoke(InterfaceC1258Afu interfaceC1258Afu, HtJ<? super Unit> htJ) {
        return ((ContentInViewNode$launchAnimation$2$1) C8j3.A1E(htJ, interfaceC1258Afu, this)).invokeSuspend(Unit.INSTANCE);
    }
}
