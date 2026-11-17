package androidx.compose.animation.core;

import X.AOP;
import X.AOe;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.BUJ;
import X.EnumC10460Hji;
import X.G0U;
import X.HtJ;
import X.Hwg;
import X.Hxb;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.animation.core.SeekableTransitionState$animateTo$2", f = "Transition.kt", l = {607}, m = "invokeSuspend", v = 1)
/* loaded from: classes4.dex */
public final class SeekableTransitionState$animateTo$2 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
    public final /* synthetic */ AOe<Float> $animationSpec;
    public final /* synthetic */ S $targetState;
    public final /* synthetic */ AOP<S> $transition;
    public int label;
    public final /* synthetic */ SeekableTransitionState<S> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/AOP<TS;>;Landroidx/compose/animation/core/SeekableTransitionState<TS;>;TS;LX/AOe<Ljava/lang/Float;>;LX/HtJ<-Landroidx/compose/animation/core/SeekableTransitionState$animateTo$2;>;)V */
    /* JADX WARN: Multi-variable type inference failed */
    public SeekableTransitionState$animateTo$2(AOe aOe, SeekableTransitionState seekableTransitionState, AOP aop, Object obj, HtJ htJ) {
        super(1, htJ);
        this.$transition = aop;
        this.this$0 = seekableTransitionState;
        this.$targetState = obj;
        this.$animationSpec = aOe;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        AOP<S> aop = this.$transition;
        return new SeekableTransitionState$animateTo$2(this.$animationSpec, this.this$0, aop, this.$targetState, htJ);
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Object invoke(HtJ<? super Unit> htJ) {
        return ((SeekableTransitionState$animateTo$2) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            SeekableTransitionState<S> seekableTransitionState = this.this$0;
            S s = this.$targetState;
            BUJ buj = new BUJ(this.$animationSpec, seekableTransitionState, this.$transition, s, null);
            this.label = 1;
            if (Hxb.A00(buj, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        this.$transition.A05();
        return Unit.INSTANCE;
    }
}
