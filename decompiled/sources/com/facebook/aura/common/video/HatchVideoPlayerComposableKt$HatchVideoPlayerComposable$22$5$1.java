package com.facebook.aura.common.video;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.C8j3;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchVideoPlayerComposableKt$HatchVideoPlayerComposable$22$5$1 extends AbstractC7559F3s implements G0U<AspectRatioFrameLayout, Unit> {
    public final /* synthetic */ Integer $resizeModeInt;
    public final /* synthetic */ MutableState<Float> $videoAspectRatio$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AspectRatioFrameLayout aspectRatioFrameLayout) {
        C7384Etj.A0Y(aspectRatioFrameLayout, 0);
        Integer num = this.$resizeModeInt;
        if (num != null) {
            aspectRatioFrameLayout.setResizeMode(num.intValue());
        }
        aspectRatioFrameLayout.setAspectRatio(C8j3.A06(this.$videoAspectRatio$delegate));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchVideoPlayerComposableKt$HatchVideoPlayerComposable$22$5$1(Integer num, MutableState<Float> mutableState) {
        super(1);
        this.$resizeModeInt = num;
        this.$videoAspectRatio$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AspectRatioFrameLayout aspectRatioFrameLayout) {
        invoke2(aspectRatioFrameLayout);
        return Unit.INSTANCE;
    }
}
