package androidx.navigation3.ui;

import X.AMP;
import X.AbstractC07127nr;
import X.C3UX;
import X.C8j3;
import X.G0V;
import X.HtJ;
import androidx.compose.animation.core.SeekableTransitionState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$NavDisplay$12$1$1$1", f = "NavDisplay.kt", l = {802, 806}, m = "invokeSuspend", v = 1)
/* loaded from: classes4.dex */
public final class NavDisplayKt__NavDisplayKt$NavDisplay$12$1$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ float $finalFraction;
    public final /* synthetic */ AMP<T> $scene;
    public final /* synthetic */ SeekableTransitionState<AMP<T>> $transitionState;
    public final /* synthetic */ float $value;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (FFLandroidx/compose/animation/core/SeekableTransitionState<LX/AMP<TT;>;>;LX/AMP<TT;>;LX/HtJ<-Landroidx/navigation3/ui/NavDisplayKt__NavDisplayKt$NavDisplay$12$1$1$1;>;)V */
    public NavDisplayKt__NavDisplayKt$NavDisplay$12$1$1$1(SeekableTransitionState seekableTransitionState, AMP amp, HtJ htJ, float f, float f2) {
        super(2, htJ);
        this.$value = f;
        this.$finalFraction = f2;
        this.$transitionState = seekableTransitionState;
        this.$scene = amp;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new NavDisplayKt__NavDisplayKt$NavDisplay$12$1$1$1(this.$transitionState, this.$scene, htJ, this.$value, this.$finalFraction);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005d A[RETURN] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r11.label
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L12
            if (r0 == r4) goto L2c
            if (r0 != r5) goto L75
            X.Hwg.A00(r12)
        Lf:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
        L12:
            X.Hwg.A00(r12)
            float r2 = r11.$value
            float r0 = r11.$finalFraction
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L2f
            androidx.compose.animation.core.SeekableTransitionState<X.AMP<T>> r1 = r11.$transitionState
            r11.label = r4
            java.lang.Object r0 = r1.A0A()
            java.lang.Object r0 = r1.A0C(r0, r11, r2)
            if (r0 != r3) goto L2f
            return r3
        L2c:
            X.Hwg.A00(r12)
        L2f:
            float r1 = r11.$value
            float r0 = r11.$finalFraction
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto Lf
            androidx.compose.animation.core.SeekableTransitionState<X.AMP<T>> r6 = r11.$transitionState
            X.AMP<T> r8 = r11.$scene
            r11.label = r5
            X.AOP<S> r7 = r6.A04
            if (r7 == 0) goto L59
            androidx.compose.runtime.MutableState r0 = r6.A0B
            java.lang.Object r0 = r0.getValue()
            boolean r0 = X.C7384Etj.areEqual(r0, r8)
            if (r0 == 0) goto L5e
            androidx.compose.runtime.MutableState r0 = r6.A0C
            java.lang.Object r0 = r0.getValue()
            boolean r0 = X.C7384Etj.areEqual(r0, r8)
            if (r0 == 0) goto L5e
        L59:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        L5b:
            if (r0 != r3) goto Lf
            return r3
        L5e:
            X.AOZ r2 = r6.A09
            r9 = 0
            r10 = 0
            X.BUB r5 = new X.BUB
            r5.<init>(r6, r7, r8, r9, r10)
            X.3UZ r1 = X.C3UZ.A02
            X.BUK r0 = new X.BUK
            r0.<init>(r1, r2, r9, r5)
            java.lang.Object r0 = X.Hxb.A00(r0, r11)
            if (r0 != r3) goto L59
            goto L5b
        L75:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$NavDisplay$12$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((NavDisplayKt__NavDisplayKt$NavDisplay$12$1$1$1) C8j3.A1E(htJ, c3ux, this)).invokeSuspend(Unit.INSTANCE);
    }
}
