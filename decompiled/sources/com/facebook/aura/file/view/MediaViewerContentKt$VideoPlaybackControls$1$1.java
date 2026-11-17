package com.facebook.aura.file.view;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C00s;
import X.C3UX;
import X.C7Bq;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.common.video.HatchVideoPlayer;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.file.view.MediaViewerContentKt$VideoPlaybackControls$1$1", f = "MediaViewerContent.kt", l = {1558}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class MediaViewerContentKt$VideoPlaybackControls$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C00s $currentPositionMs$delegate;
    public final /* synthetic */ C00s $durationMs$delegate;
    public final /* synthetic */ MutableState<Boolean> $isSeekable$delegate;
    public final /* synthetic */ MutableState<Boolean> $isSeeking$delegate;
    public final /* synthetic */ HatchVideoPlayer $player;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaViewerContentKt$VideoPlaybackControls$1$1(HatchVideoPlayer hatchVideoPlayer, MutableState<Boolean> mutableState, C00s c00s, C00s c00s2, MutableState<Boolean> mutableState2, HtJ<? super MediaViewerContentKt$VideoPlaybackControls$1$1> htJ) {
        super(2, htJ);
        this.$player = hatchVideoPlayer;
        this.$isSeeking$delegate = mutableState;
        this.$currentPositionMs$delegate = c00s;
        this.$durationMs$delegate = c00s2;
        this.$isSeekable$delegate = mutableState2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new MediaViewerContentKt$VideoPlaybackControls$1$1(this.$player, this.$isSeeking$delegate, this.$currentPositionMs$delegate, this.$durationMs$delegate, this.$isSeekable$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i != 0 && i != 1) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        do {
            MutableState<Boolean> mutableState = this.$isSeeking$delegate;
            float f = MediaViewerContentKt.CONTROLS_SCRIM_ALPHA;
            if (!MutableState.A0A((MutableState) mutableState)) {
                this.$currentPositionMs$delegate.Adh(this.$player.getCurrentPosition());
                long jLongValue = new Long(this.$player.getDuration()).longValue();
                if (jLongValue > 0) {
                    this.$durationMs$delegate.Adh(jLongValue);
                }
            }
            MutableState.A09(this.$player.isSeekable(), this.$isSeekable$delegate);
            this.label = 1;
        } while (C7Bq.A01(250L, this) != enumC10460Hji);
        return enumC10460Hji;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((MediaViewerContentKt$VideoPlaybackControls$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
