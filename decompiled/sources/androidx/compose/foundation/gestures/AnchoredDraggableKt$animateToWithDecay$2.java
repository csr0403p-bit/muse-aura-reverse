package androidx.compose.foundation.gestures;

import X.AOc;
import X.AT7;
import X.ATB;
import X.AbstractC07127nr;
import X.AbstractC1053ATa;
import X.AcX;
import X.AnonymousClass001;
import X.BTO;
import X.C1051ASv;
import X.C1YC;
import X.EnumC10460Hji;
import X.G2j;
import X.HtJ;
import X.Hwg;
import X.InterfaceC1153Acj;
import androidx.compose.animation.core.SuspendAnimationKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: Add missing generic type declarations: [T] */
@DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$2", f = "AnchoredDraggable.kt", l = {1425, 1443, 1467}, m = "invokeSuspend", v = 1)
/* loaded from: classes4.dex */
public final class AnchoredDraggableKt$animateToWithDecay$2<T> extends AbstractC07127nr implements G2j<AcX, InterfaceC1153Acj<T>, T, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C1YC<Float> $decayAnimationSpec;
    public final /* synthetic */ C1051ASv $remainingVelocity;
    public final /* synthetic */ AOc<Float> $snapAnimationSpec;
    public final /* synthetic */ AnchoredDraggableState<T> $this_animateToWithDecay;
    public final /* synthetic */ float $velocity;
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public /* synthetic */ Object L$2;
    public int label;

    @Override // X.G2j
    public final /* bridge */ /* synthetic */ Object invoke(AcX acX, Object obj, Object obj2, HtJ<? super Unit> htJ) {
        AnchoredDraggableState<T> anchoredDraggableState = this.$this_animateToWithDecay;
        float f = this.$velocity;
        AOc<Float> aOc = this.$snapAnimationSpec;
        C1051ASv c1051ASv = this.$remainingVelocity;
        AnchoredDraggableKt$animateToWithDecay$2 anchoredDraggableKt$animateToWithDecay$2 = new AnchoredDraggableKt$animateToWithDecay$2(aOc, this.$decayAnimationSpec, anchoredDraggableState, htJ, c1051ASv, f);
        anchoredDraggableKt$animateToWithDecay$2.L$0 = acX;
        anchoredDraggableKt$animateToWithDecay$2.L$1 = obj;
        anchoredDraggableKt$animateToWithDecay$2.L$2 = obj2;
        return anchoredDraggableKt$animateToWithDecay$2.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Landroidx/compose/foundation/gestures/AnchoredDraggableState<TT;>;FLX/AOc<Ljava/lang/Float;>;LX/ASv;LX/1YC<Ljava/lang/Float;>;LX/HtJ<-Landroidx/compose/foundation/gestures/AnchoredDraggableKt$animateToWithDecay$2;>;)V */
    public AnchoredDraggableKt$animateToWithDecay$2(AOc aOc, C1YC c1yc, AnchoredDraggableState anchoredDraggableState, HtJ htJ, C1051ASv c1051ASv, float f) {
        super(4, htJ);
        this.$this_animateToWithDecay = anchoredDraggableState;
        this.$velocity = f;
        this.$snapAnimationSpec = aOc;
        this.$remainingVelocity = c1051ASv;
        this.$decayAnimationSpec = c1yc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        AnchoredDraggableState<T> anchoredDraggableState;
        AOc<Float> aOc;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    Hwg.A00(obj);
                } else if (i != 3) {
                    throw AnonymousClass001.A0n();
                }
            }
            Hwg.A00(obj);
            this.$remainingVelocity.element = 0.0f;
        } else {
            Hwg.A00(obj);
            AcX acX = (AcX) this.L$0;
            InterfaceC1153Acj interfaceC1153Acj = (InterfaceC1153Acj) this.L$1;
            Object obj2 = this.L$2;
            float fAYD = interfaceC1153Acj.AYD(obj2);
            if (!Float.isNaN(fAYD)) {
                C1051ASv c1051ASv = new C1051ASv();
                float fAFn = Float.isNaN(this.$this_animateToWithDecay.A08.AFn()) ? 0.0f : this.$this_animateToWithDecay.A08.AFn();
                c1051ASv.element = fAFn;
                if (fAFn != fAYD) {
                    float f = this.$velocity;
                    if ((fAYD - fAFn) * f < 0.0f || f == 0.0f) {
                        anchoredDraggableState = this.$this_animateToWithDecay;
                        aOc = this.$snapAnimationSpec;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 1;
                    } else {
                        float fA00 = AbstractC1053ATa.A00(this.$decayAnimationSpec, fAFn, f);
                        f = this.$velocity;
                        if (f <= 0.0f ? fA00 > fAYD : fA00 < fAYD) {
                            anchoredDraggableState = this.$this_animateToWithDecay;
                            aOc = this.$snapAnimationSpec;
                            this.L$0 = null;
                            this.L$1 = null;
                            this.label = 3;
                        } else {
                            AT7 at7A00 = ATB.A00(c1051ASv.element, f);
                            C1YC<Float> c1yc = this.$decayAnimationSpec;
                            BTO bto = new BTO(acX, c1051ASv, this.$remainingVelocity, fAYD, 0);
                            this.L$0 = null;
                            this.L$1 = null;
                            this.label = 2;
                            if (SuspendAnimationKt.A04(at7A00, c1yc, this, bto, false) == enumC10460Hji) {
                                return enumC10460Hji;
                            }
                        }
                    }
                    if (AnchoredDraggableKt.A01(aOc, acX, anchoredDraggableState, interfaceC1153Acj, obj2, this, f) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                    this.$remainingVelocity.element = 0.0f;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
