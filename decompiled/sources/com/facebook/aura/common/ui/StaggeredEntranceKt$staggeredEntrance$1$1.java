package com.facebook.aura.common.ui;

import X.AOW;
import X.ASj;
import X.AT5;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C2HU;
import X.C3UX;
import X.C7Bq;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

@DebugMetadata(c = "com.facebook.aura.common.ui.StaggeredEntranceKt$staggeredEntrance$1$1", f = "StaggeredEntrance.kt", l = {34, R.styleable.maplibre_MapView_maplibre_uiCompassMarginRight}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class StaggeredEntranceKt$staggeredEntrance$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ MutableState<Boolean> $hasAnimated$delegate;
    public final /* synthetic */ AT5<Float, AOW> $progress;
    public final /* synthetic */ long $startDelayMs;
    public final /* synthetic */ int $stepIndex;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StaggeredEntranceKt$staggeredEntrance$1$1(long j, int i, AT5<Float, AOW> at5, MutableState<Boolean> mutableState, HtJ<? super StaggeredEntranceKt$staggeredEntrance$1$1> htJ) {
        super(2, htJ);
        this.$startDelayMs = j;
        this.$stepIndex = i;
        this.$progress = at5;
        this.$hasAnimated$delegate = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new StaggeredEntranceKt$staggeredEntrance$1$1(this.$startDelayMs, this.$stepIndex, this.$progress, this.$hasAnimated$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            if (!MutableState.A0A((MutableState) this.$hasAnimated$delegate)) {
                long j = this.$startDelayMs;
                int i2 = this.$stepIndex;
                if (i2 > 10) {
                    i2 = 10;
                }
                this.label = 1;
                if (C7Bq.A01(j + (i2 * 80), this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            MutableState.A09(true, this.$hasAnimated$delegate);
            return Unit.INSTANCE;
        }
        Hwg.A00(obj);
        AT5<Float, AOW> at5 = this.$progress;
        Float fA0m = AnonymousClass001.A0m();
        ASj aSjA0J = AnonymousClass002.A0J(C2HU.A01, StaggeredEntranceKt.StaggeredEntranceDurationMs);
        this.label = 2;
        if (AnonymousClass002.A0i(at5, aSjA0J, fA0m, this, null) == enumC10460Hji) {
            return enumC10460Hji;
        }
        MutableState.A09(true, this.$hasAnimated$delegate);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((StaggeredEntranceKt$staggeredEntrance$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
