package com.facebook.aura.ui.pulltorefresh;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C0dx;
import X.C1BO;
import X.C20Z;
import X.C3UX;
import X.C6v3;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.ui.pulltorefresh.PullRefreshStateKt$rememberPullRefreshState$3$1", f = "PullRefreshState.kt", l = {78}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class PullRefreshStateKt$rememberPullRefreshState$3$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C1BO<C0dx> $haptic;
    public final /* synthetic */ C1BO<Boolean> $hasPulledToThreshold;
    public int label;

    /* renamed from: com.facebook.aura.ui.pulltorefresh.PullRefreshStateKt$rememberPullRefreshState$3$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Boolean> {
        public final /* synthetic */ C1BO<Boolean> $hasPulledToThreshold;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C1BO<Boolean> c1bo) {
            super(0);
            this.$hasPulledToThreshold = c1bo;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return this.$hasPulledToThreshold.getValue();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PullRefreshStateKt$rememberPullRefreshState$3$1(C1BO<Boolean> c1bo, C1BO<? extends C0dx> c1bo2, HtJ<? super PullRefreshStateKt$rememberPullRefreshState$3$1> htJ) {
        super(2, htJ);
        this.$hasPulledToThreshold = c1bo;
        this.$haptic = c1bo2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new PullRefreshStateKt$rememberPullRefreshState$3$1(this.$hasPulledToThreshold, this.$haptic, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            PullRefreshStateKt$rememberPullRefreshState$3$1$invokeSuspend$$inlined$filter$1 pullRefreshStateKt$rememberPullRefreshState$3$1$invokeSuspend$$inlined$filter$1 = new PullRefreshStateKt$rememberPullRefreshState$3$1$invokeSuspend$$inlined$filter$1(C6v3.A01(new AnonymousClass1(this.$hasPulledToThreshold)));
            final C1BO<C0dx> c1bo = this.$haptic;
            C20Z<? super Boolean> c20z = new C20Z() { // from class: com.facebook.aura.ui.pulltorefresh.PullRefreshStateKt$rememberPullRefreshState$3$1.3
                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit(AnonymousClass001.A1X(obj2), (HtJ<? super Unit>) htJ);
                }

                public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                    c1bo.getValue().AXr(0);
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (pullRefreshStateKt$rememberPullRefreshState$3$1$invokeSuspend$$inlined$filter$1.collect(c20z, this) == enumC10460Hji) {
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
        return ((PullRefreshStateKt$rememberPullRefreshState$3$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
