package com.facebook.aura.common.video;

import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.C2av;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchVideoPlayerComposableKt$HatchVideoPlayerComposable$22$1$1$1 extends AbstractC7559F3s implements G0U<C2av, Unit> {
    public final /* synthetic */ MutableState<Boolean> $renderedFirstFrame;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2av c2av) {
        C7384Etj.A0Y(c2av, 0);
        c2av.Acj(AnonymousClass003.A02(MutableState.A0A((MutableState) this.$renderedFirstFrame) ? 1 : 0));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchVideoPlayerComposableKt$HatchVideoPlayerComposable$22$1$1$1(MutableState<Boolean> mutableState) {
        super(1);
        this.$renderedFirstFrame = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2av c2av) {
        invoke2(c2av);
        return Unit.INSTANCE;
    }
}
