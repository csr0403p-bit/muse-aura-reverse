package com.facebook.aura.ui;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C0dx;
import X.C20Z;
import X.C3UX;
import X.C6v3;
import X.EnumC10460Hji;
import X.G0V;
import X.GDB;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.ui.pulltorefresh.PullRefreshState;
import com.facebook.aura.vds.compose.accessibility.AuraHaptics;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.ui.HatchPullToRefreshKt$HatchPullToRefresh$1$1", f = "HatchPullToRefresh.kt", l = {103}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchPullToRefreshKt$HatchPullToRefresh$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C0dx $haptic;
    public final /* synthetic */ PullRefreshState $pullRefreshState;
    public int label;

    /* renamed from: com.facebook.aura.ui.HatchPullToRefreshKt$HatchPullToRefresh$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Boolean> {
        public final /* synthetic */ PullRefreshState $pullRefreshState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PullRefreshState pullRefreshState) {
            super(0);
            this.$pullRefreshState = pullRefreshState;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(this.$pullRefreshState.getProgress() >= 1.0f);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchPullToRefreshKt$HatchPullToRefresh$1$1(PullRefreshState pullRefreshState, C0dx c0dx, HtJ<? super HatchPullToRefreshKt$HatchPullToRefresh$1$1> htJ) {
        super(2, htJ);
        this.$pullRefreshState = pullRefreshState;
        this.$haptic = c0dx;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchPullToRefreshKt$HatchPullToRefresh$1$1(this.$pullRefreshState, this.$haptic, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchPullToRefreshKt$HatchPullToRefresh$1$1$invokeSuspend$$inlined$filter$1 hatchPullToRefreshKt$HatchPullToRefresh$1$1$invokeSuspend$$inlined$filter$1 = new HatchPullToRefreshKt$HatchPullToRefresh$1$1$invokeSuspend$$inlined$filter$1(GDB.A01(C6v3.A01(new AnonymousClass1(this.$pullRefreshState))));
            final C0dx c0dx = this.$haptic;
            C20Z<? super Boolean> c20z = new C20Z() { // from class: com.facebook.aura.ui.HatchPullToRefreshKt$HatchPullToRefresh$1$1.3
                public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                    c0dx.AXr(AuraHaptics.GESTURE_THRESHOLD);
                    return Unit.INSTANCE;
                }

                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    c0dx.AXr(AuraHaptics.GESTURE_THRESHOLD);
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (hatchPullToRefreshKt$HatchPullToRefresh$1$1$invokeSuspend$$inlined$filter$1.collect(c20z, this) == enumC10460Hji) {
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
        return ((HatchPullToRefreshKt$HatchPullToRefresh$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
