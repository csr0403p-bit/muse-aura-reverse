package com.facebook.aura.common.video;

import X.AbstractC7559F3s;
import X.C8j3;
import X.G0U;
import android.content.Context;
import androidx.compose.runtime.MutableState;

/* loaded from: classes4.dex */
public final class HatchVideoPlayerComposableKt$HatchVideoPlayerComposable$22$4$1 extends AbstractC7559F3s implements G0U<Context, AspectRatioFrameLayout> {
    public final /* synthetic */ AspectRatioFrameLayout $layout;
    public final /* synthetic */ Integer $resizeModeInt;
    public final /* synthetic */ MutableState<Float> $videoAspectRatio$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchVideoPlayerComposableKt$HatchVideoPlayerComposable$22$4$1(AspectRatioFrameLayout aspectRatioFrameLayout, Integer num, MutableState<Float> mutableState) {
        super(1);
        this.$layout = aspectRatioFrameLayout;
        this.$resizeModeInt = num;
        this.$videoAspectRatio$delegate = mutableState;
    }

    @Override // X.G0U
    public final AspectRatioFrameLayout invoke(Context context) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.$layout;
        Integer num = this.$resizeModeInt;
        MutableState<Float> mutableState = this.$videoAspectRatio$delegate;
        if (num != null) {
            aspectRatioFrameLayout.setResizeMode(num.intValue());
        }
        aspectRatioFrameLayout.setAspectRatio(C8j3.A06(mutableState));
        return aspectRatioFrameLayout;
    }
}
