package com.facebook.aura.common.ui;

import X.AOW;
import X.AT5;
import X.AbstractC7559F3s;
import X.C2av;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class StaggeredEntranceKt$staggeredEntrance$2$1 extends AbstractC7559F3s implements G0U<C2av, Unit> {
    public final /* synthetic */ AT5<Float, AOW> $progress;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2av c2av) {
        C7384Etj.A0Y(c2av, 0);
        c2av.Acj(MutableState.A00(this.$progress));
        c2av.Af6(c2av.Ah4(StaggeredEntranceKt.StaggeredEntranceSlideOffset) * (1.0f - MutableState.A00(this.$progress)));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StaggeredEntranceKt$staggeredEntrance$2$1(AT5<Float, AOW> at5) {
        super(1);
        this.$progress = at5;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2av c2av) {
        invoke2(c2av);
        return Unit.INSTANCE;
    }
}
