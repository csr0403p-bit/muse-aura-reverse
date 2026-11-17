package androidx.compose.animation;

import X.AOc;
import X.ARY;
import X.ARj;
import X.AT5;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BL4;
import X.C1030ARg;
import X.C3UX;
import X.C8j3;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.animation.SizeAnimationModifierNode$animateTo$data$1$1", f = "AnimationModifier.kt", l = {242}, m = "invokeSuspend", v = 1)
/* loaded from: classes4.dex */
public final class SizeAnimationModifierNode$animateTo$data$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ long $targetSize;
    public final /* synthetic */ ARj $this_apply;
    public int label;
    public final /* synthetic */ C1030ARg this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/ARj;JLX/ARg;LX/HtJ<-Landroidx/compose/animation/SizeAnimationModifierNode$animateTo$data$1$1;>;)V */
    public SizeAnimationModifierNode$animateTo$data$1$1(ARj aRj, C1030ARg c1030ARg, HtJ htJ, long j) {
        super(2, htJ);
        this.$this_apply = aRj;
        this.$targetSize = j;
        this.this$0 = c1030ARg;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new SizeAnimationModifierNode$animateTo$data$1$1(this.$this_apply, this.this$0, htJ, this.$targetSize);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            AT5<BL4, ARY> at5 = this.$this_apply.A01;
            BL4 bl4A00 = BL4.A00(this.$targetSize);
            AOc<BL4> aOc = this.this$0.A01;
            this.label = 1;
            if (AnonymousClass002.A0i(at5, aOc, bl4A00, this, null) == enumC10460Hji) {
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
    public final /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((SizeAnimationModifierNode$animateTo$data$1$1) C8j3.A1E(htJ, c3ux, this)).invokeSuspend(Unit.INSTANCE);
    }
}
