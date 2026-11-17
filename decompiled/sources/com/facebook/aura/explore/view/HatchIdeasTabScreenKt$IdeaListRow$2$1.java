package com.facebook.aura.explore.view;

import X.AOI;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C1BO;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.explore.view.HatchIdeasTabScreenKt$IdeaListRow$2$1", f = "HatchIdeasTabScreen.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchIdeasTabScreenKt$IdeaListRow$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C1BO<Function0<Unit>> $currentOnDismissed$delegate;
    public final /* synthetic */ AOI<Boolean> $visibleState;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchIdeasTabScreenKt$IdeaListRow$2$1(AOI<Boolean> aoi, C1BO<? extends Function0<Unit>> c1bo, HtJ<? super HatchIdeasTabScreenKt$IdeaListRow$2$1> htJ) {
        super(2, htJ);
        this.$visibleState = aoi;
        this.$currentOnDismissed$delegate = c1bo;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchIdeasTabScreenKt$IdeaListRow$2$1(this.$visibleState, this.$currentOnDismissed$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        if (this.$visibleState.A0D() && !AnonymousClass001.A1X(this.$visibleState.A09())) {
            C1BO.A0D(this.$currentOnDismissed$delegate);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchIdeasTabScreenKt$IdeaListRow$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
