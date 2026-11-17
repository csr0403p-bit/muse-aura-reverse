package com.facebook.aura.file.view;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.common.video.HatchVideoPlayer;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.file.view.MediaViewerContentKt$MediaViewerVideo$2$1", f = "MediaViewerContent.kt", l = {820}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class MediaViewerContentKt$MediaViewerVideo$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ MutableState<Boolean> $hasRendered$delegate;
    public final /* synthetic */ MutableState<Boolean> $isPlayerReady$delegate;
    public final /* synthetic */ boolean $isPlaying;
    public final /* synthetic */ HatchVideoPlayer $player;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaViewerContentKt$MediaViewerVideo$2$1(boolean z, HatchVideoPlayer hatchVideoPlayer, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, HtJ<? super MediaViewerContentKt$MediaViewerVideo$2$1> htJ) {
        super(2, htJ);
        this.$isPlaying = z;
        this.$player = hatchVideoPlayer;
        this.$hasRendered$delegate = mutableState;
        this.$isPlayerReady$delegate = mutableState2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new MediaViewerContentKt$MediaViewerVideo$2$1(this.$isPlaying, this.$player, this.$hasRendered$delegate, this.$isPlayerReady$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            MutableState<Boolean> mutableState = this.$hasRendered$delegate;
            float f = MediaViewerContentKt.CONTROLS_SCRIM_ALPHA;
            if (!MutableState.A0A((MutableState) mutableState) || this.$isPlaying) {
                if (MutableState.A0A((MutableState) this.$hasRendered$delegate)) {
                }
                return Unit.INSTANCE;
            }
            this.$player.pause();
            HatchVideoPlayer hatchVideoPlayer = this.$player;
            this.label = 1;
            if (MediaViewerContentKt.awaitReady(hatchVideoPlayer, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        MutableState<Boolean> mutableState2 = this.$isPlayerReady$delegate;
        float f2 = MediaViewerContentKt.CONTROLS_SCRIM_ALPHA;
        MutableState.A09(true, mutableState2);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((MediaViewerContentKt$MediaViewerVideo$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
