package com.facebook.aura.common.video;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C1BO;
import X.C3UX;
import X.C7Bq;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.common.video.HatchVideoPlayerComposableKt$HatchVideoPlayerComposable$9$1", f = "HatchVideoPlayerComposable.kt", l = {168}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class HatchVideoPlayerComposableKt$HatchVideoPlayerComposable$9$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C1BO<Boolean> $currentPlayWhenReady$delegate;
    public final /* synthetic */ MutableState<Boolean> $renderedFirstFrame;
    public final /* synthetic */ MutableState<Boolean> $showLoadingSpinner$delegate;
    public final /* synthetic */ HatchVideoPlayer $videoPlayer;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchVideoPlayerComposableKt$HatchVideoPlayerComposable$9$1(MutableState<Boolean> mutableState, HatchVideoPlayer hatchVideoPlayer, MutableState<Boolean> mutableState2, C1BO<Boolean> c1bo, HtJ<? super HatchVideoPlayerComposableKt$HatchVideoPlayerComposable$9$1> htJ) {
        super(2, htJ);
        this.$renderedFirstFrame = mutableState;
        this.$videoPlayer = hatchVideoPlayer;
        this.$showLoadingSpinner$delegate = mutableState2;
        this.$currentPlayWhenReady$delegate = c1bo;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchVideoPlayerComposableKt$HatchVideoPlayerComposable$9$1(this.$renderedFirstFrame, this.$videoPlayer, this.$showLoadingSpinner$delegate, this.$currentPlayWhenReady$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            this.label = 1;
            if (C7Bq.A01(1000L, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        if (!MutableState.A0A((MutableState) this.$showLoadingSpinner$delegate)) {
            MutableState.A09((MutableState.A0A((MutableState) this.$renderedFirstFrame) || this.$videoPlayer.isPlaying() || !C1BO.A0F(this.$currentPlayWhenReady$delegate)) ? false : true, this.$showLoadingSpinner$delegate);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchVideoPlayerComposableKt$HatchVideoPlayerComposable$9$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
