package com.facebook.aura.ui.pulltorefresh;

import X.AGE;
import X.AGF;
import X.ASj;
import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BBP;
import X.BLG;
import X.C1BN;
import X.C1BO;
import X.C3Pi;
import X.C3UX;
import X.C7384Etj;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0V;
import X.HoC;
import X.HtJ;
import X.Hwg;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class PullRefreshState {
    public static final int $stable = 8;
    public final BLG<Boolean> _hasPulledToThreshold;
    public final MutableState _position$delegate;
    public final MutableState _refreshing$delegate;
    public final C1BO adjustedDistancePulled$delegate;
    public HoC animationJob;
    public final C3UX animationScope;
    public final MutableState distancePulled$delegate;
    public final C1BN<Boolean> hasPulledToThreshold;
    public final C1BO<Function0<Unit>> onRefreshState;
    public final float refreshingOffset;
    public final ASj<Float> releaseAnimationSpec;
    public final float threshold;

    @DebugMetadata(c = "com.facebook.aura.ui.pulltorefresh.PullRefreshState$animateIndicatorTo$1", f = "PullRefreshState.kt", l = {153}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.ui.pulltorefresh.PullRefreshState$animateIndicatorTo$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ float $offset;
        public int label;

        /* renamed from: com.facebook.aura.ui.pulltorefresh.PullRefreshState$animateIndicatorTo$1$1, reason: invalid class name and collision with other inner class name */
        public final class C04181 extends AbstractC7559F3s implements G0V<Float, Float, Unit> {
            public final /* synthetic */ PullRefreshState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04181(PullRefreshState pullRefreshState) {
                super(2);
                this.this$0 = pullRefreshState;
            }

            public final void invoke(float f, float f2) {
                this.this$0.set_position(f);
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Unit invoke(Float f, Float f2) {
                float fA02 = AnonymousClass001.A02(f);
                f2.floatValue();
                this.this$0.set_position(fA02);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(float f, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$offset = f;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return PullRefreshState.this.new AnonymousClass1(this.$offset, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                float f = PullRefreshState.this.get_position();
                float f2 = this.$offset;
                PullRefreshState pullRefreshState = PullRefreshState.this;
                ASj<Float> aSj = pullRefreshState.releaseAnimationSpec;
                C04181 c04181 = new C04181(pullRefreshState);
                this.label = 1;
                if (SuspendAnimationKt.A03(aSj, this, c04181, f, f2, 0.0f) == enumC10460Hji) {
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
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final void animateIndicatorTo(float f) {
        HtJ htJA13 = AnonymousClass006.A13(this.animationJob);
        this.animationJob = AnonymousClass001.A11(new AnonymousClass1(f, htJA13), this.animationScope);
    }

    private final float calculateIndicatorPosition() {
        float fA01 = C1BO.A01(this.adjustedDistancePulled$delegate);
        float f = this.threshold;
        return fA01 <= f ? C1BO.A01(this.adjustedDistancePulled$delegate) : f;
    }

    private final float getAdjustedDistancePulled() {
        return C1BO.A01(this.adjustedDistancePulled$delegate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getDistancePulled() {
        return AnonymousClass001.A02(this.distancePulled$delegate.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float get_position() {
        return AnonymousClass001.A02(this._position$delegate.getValue());
    }

    private final boolean get_refreshing() {
        return MutableState.A0A(this._refreshing$delegate);
    }

    private final void setDistancePulled(float f) {
        this.distancePulled$delegate.Af8(Float.valueOf(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void set_position(float f) {
        this._position$delegate.Af8(Float.valueOf(f));
    }

    private final void set_refreshing(boolean z) {
        MutableState.A09(z, this._refreshing$delegate);
    }

    public final C1BN<Boolean> getHasPulledToThreshold() {
        return this.hasPulledToThreshold;
    }

    public final float getProgress() {
        return C1BO.A01(this.adjustedDistancePulled$delegate) / this.threshold;
    }

    public final boolean getRefreshing$fbandroid_express_aura_java_com_facebook_aura_ui_pulltorefresh_pulltorefresh() {
        return MutableState.A0A(this._refreshing$delegate);
    }

    public final float getThreshold$fbandroid_express_aura_java_com_facebook_aura_ui_pulltorefresh_pulltorefresh() {
        return this.threshold;
    }

    public final float onPull$fbandroid_express_aura_java_com_facebook_aura_ui_pulltorefresh_pulltorefresh(float f) {
        if (MutableState.A0A(this._refreshing$delegate)) {
            return 0.0f;
        }
        float distancePulled = getDistancePulled() + f;
        if (distancePulled < 0.0f) {
            distancePulled = 0.0f;
        }
        float distancePulled2 = distancePulled - getDistancePulled();
        setDistancePulled(distancePulled);
        set_position(calculateIndicatorPosition());
        AnonymousClass004.A1D(C1BO.A01(this.adjustedDistancePulled$delegate) / this.threshold >= 1.0f, this._hasPulledToThreshold);
        return distancePulled2;
    }

    public final void onRelease$fbandroid_express_aura_java_com_facebook_aura_ui_pulltorefresh_pulltorefresh() {
        if (!MutableState.A0A(this._refreshing$delegate)) {
            if (C1BO.A01(this.adjustedDistancePulled$delegate) > this.threshold) {
                C1BO.A0D(this.onRefreshState);
            } else {
                animateIndicatorTo(0.0f);
            }
        }
        setDistancePulled(0.0f);
        AnonymousClass004.A1D(false, this._hasPulledToThreshold);
    }

    public final void setRefreshing$fbandroid_express_aura_java_com_facebook_aura_ui_pulltorefresh_pulltorefresh(boolean z) {
        if (MutableState.A0A(this._refreshing$delegate) != z) {
            set_refreshing(z);
            setDistancePulled(0.0f);
            animateIndicatorTo(z ? this.refreshingOffset : 0.0f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PullRefreshState(C3UX c3ux, C1BO<? extends Function0<Unit>> c1bo, float f, float f2, ASj<Float> aSj) {
        boolean zA1b = AnonymousClass004.A1b(c3ux, c1bo);
        C7384Etj.A0Y(aSj, 4);
        this.animationScope = c3ux;
        this.onRefreshState = c1bo;
        this.refreshingOffset = f;
        this.threshold = f2;
        this.releaseAnimationSpec = aSj;
        this.adjustedDistancePulled$delegate = new BBP(null, new PullRefreshState$adjustedDistancePulled$2(this));
        Boolean boolValueOf = Boolean.valueOf(zA1b);
        AGE ageA01 = AGF.A01();
        this._refreshing$delegate = new ParcelableSnapshotMutableState(ageA01, boolValueOf);
        Float fA0a = AnonymousClass005.A0a();
        this._position$delegate = new ParcelableSnapshotMutableState(ageA01, fA0a);
        this.distancePulled$delegate = new ParcelableSnapshotMutableState(ageA01, fA0a);
        C9286GCn c9286GCn = new C9286GCn(boolValueOf);
        this._hasPulledToThreshold = c9286GCn;
        this.hasPulledToThreshold = new C3Pi(null, c9286GCn);
    }

    public final float getDisplayProgress() {
        return get_position() / this.threshold;
    }

    public final float getPosition() {
        return get_position();
    }
}
