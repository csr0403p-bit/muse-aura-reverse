package androidx.compose.animation.core;

import X.AOg;
import X.AOl;
import X.AOu;
import X.AT5;
import X.AT7;
import X.ATV;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.BTX;
import X.C79;
import X.EnumC10460Hji;
import X.F1F;
import X.G0U;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: Add missing generic type declarations: [T, V] */
@DebugMetadata(c = "androidx.compose.animation.core.Animatable$runAnimation$2", f = "Animatable.kt", l = {308}, m = "invokeSuspend", v = 1)
/* loaded from: classes4.dex */
public final class Animatable$runAnimation$2<T, V> extends AbstractC07127nr implements G0U<HtJ<? super AOu<T, V>>, Object> {
    public final /* synthetic */ ATV<T, V> $animation;
    public final /* synthetic */ G0U<AT5<T, V>, Unit> $block;
    public final /* synthetic */ T $initialVelocity;
    public final /* synthetic */ long $startTime;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ AT5<T, V> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/AT5<TT;TV;>;TT;LX/ATV<TT;TV;>;JLX/G0U<-LX/AT5<TT;TV;>;Lkotlin/Unit;>;LX/HtJ<-Landroidx/compose/animation/core/Animatable$runAnimation$2;>;)V */
    /* JADX WARN: Multi-variable type inference failed */
    public Animatable$runAnimation$2(AT5 at5, ATV atv, Object obj, HtJ htJ, G0U g0u, long j) {
        super(1, htJ);
        this.this$0 = at5;
        this.$initialVelocity = obj;
        this.$animation = atv;
        this.$startTime = j;
        this.$block = g0u;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        AT5<T, V> at5 = this.this$0;
        T t = this.$initialVelocity;
        return new Animatable$runAnimation$2(at5, this.$animation, t, htJ, this.$block, this.$startTime);
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((Animatable$runAnimation$2) create((HtJ) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        AT7 at7;
        F1F f1f;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        try {
            if (i == 0) {
                Hwg.A00(obj);
                AT5<T, V> at5 = this.this$0;
                at5.A04.A02 = (V) ((AOl) at5.A09).A01.invoke(this.$initialVelocity);
                this.this$0.A0B.Af8(this.$animation.ALY());
                MutableState.A09(true, this.this$0.A0A);
                AT7<T, V> at72 = this.this$0.A04;
                at7 = new AT7(AOg.A00(at72.A02), at72.A04, at72.A05.getValue(), at72.A01, Long.MIN_VALUE, at72.A03);
                f1f = new F1F();
                ATV<T, V> atv = this.$animation;
                long j = this.$startTime;
                BTX btx = new BTX(this.this$0, at7, this.$block, f1f, 0);
                this.L$0 = at7;
                this.L$1 = f1f;
                this.label = 1;
                if (SuspendAnimationKt.A01(atv, at7, this, btx, j) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                f1f = (F1F) this.L$1;
                at7 = (AT7) this.L$0;
                Hwg.A00(obj);
            }
            Integer num = f1f.element ? C79.A00 : C79.A01;
            AT5.A02(this.this$0);
            return new AOu(at7, num);
        } catch (CancellationException e) {
            AT5.A02(this.this$0);
            throw e;
        }
    }
}
