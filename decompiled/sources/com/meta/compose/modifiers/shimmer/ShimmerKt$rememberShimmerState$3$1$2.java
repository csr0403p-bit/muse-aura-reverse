package com.meta.compose.modifiers.shimmer;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C10543Hqv;
import X.C8919Ftb;
import X.C8j3;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.meta.compose.modifiers.shimmer.ShimmerKt$rememberShimmerState$3$1$2", f = "Shimmer.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class ShimmerKt$rememberShimmerState$3$1$2 extends AbstractC07127nr implements G0V<Boolean, HtJ<? super Unit>, Object> {
    public final /* synthetic */ long $durationMillis;
    public final /* synthetic */ MutableState<Float> $shimmerProgress$delegate;
    public final /* synthetic */ C10543Hqv<ValueAnimator> $valueAnimator;
    public /* synthetic */ boolean Z$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/Hqv<Landroid/animation/ValueAnimator;>;JLandroidx/compose/runtime/MutableState<Ljava/lang/Float;>;LX/HtJ<-Lcom/meta/compose/modifiers/shimmer/ShimmerKt$rememberShimmerState$3$1$2;>;)V */
    public ShimmerKt$rememberShimmerState$3$1$2(MutableState mutableState, HtJ htJ, C10543Hqv c10543Hqv, long j) {
        super(2, htJ);
        this.$valueAnimator = c10543Hqv;
        this.$durationMillis = j;
        this.$shimmerProgress$delegate = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        ShimmerKt$rememberShimmerState$3$1$2 shimmerKt$rememberShimmerState$3$1$2 = new ShimmerKt$rememberShimmerState$3$1$2(this.$shimmerProgress$delegate, htJ, this.$valueAnimator, this.$durationMillis);
        shimmerKt$rememberShimmerState$3$1$2.Z$0 = AnonymousClass001.A1X(obj);
        return shimmerKt$rememberShimmerState$3$1$2;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [T, android.animation.ValueAnimator] */
    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        C10543Hqv<ValueAnimator> c10543Hqv = this.$valueAnimator;
        ValueAnimator valueAnimator = c10543Hqv.element;
        if (!z) {
            ValueAnimator valueAnimator2 = valueAnimator;
            if (valueAnimator2 != null) {
                valueAnimator2.end();
            }
            this.$valueAnimator.element = null;
            this.$shimmerProgress$delegate.Af8(AnonymousClass005.A0a());
        } else if (valueAnimator == null) {
            c10543Hqv.element = ValueAnimator.ofFloat(0.0f, 1.0f);
            ValueAnimator valueAnimator3 = this.$valueAnimator.element;
            if (valueAnimator3 != null) {
                valueAnimator3.setRepeatCount(-1);
            }
            ValueAnimator valueAnimator4 = this.$valueAnimator.element;
            if (valueAnimator4 != null) {
                valueAnimator4.setInterpolator(new LinearInterpolator());
            }
            ValueAnimator valueAnimator5 = this.$valueAnimator.element;
            if (valueAnimator5 != null) {
                valueAnimator5.setDuration(this.$durationMillis);
            }
            ValueAnimator valueAnimator6 = this.$valueAnimator.element;
            if (valueAnimator6 != null) {
                C8919Ftb.A01(valueAnimator6, this.$shimmerProgress$delegate, 15);
            }
            ValueAnimator valueAnimator7 = this.$valueAnimator.element;
            if (valueAnimator7 != null) {
                valueAnimator7.start();
            }
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Boolean bool, HtJ<? super Unit> htJ) {
        return ((ShimmerKt$rememberShimmerState$3$1$2) C8j3.A1E(htJ, bool, this)).invokeSuspend(Unit.INSTANCE);
    }
}
