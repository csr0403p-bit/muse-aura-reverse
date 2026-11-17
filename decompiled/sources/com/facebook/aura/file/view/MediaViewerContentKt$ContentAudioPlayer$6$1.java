package com.facebook.aura.file.view;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C00r;
import X.C3UX;
import X.C7Bq;
import X.CFK;
import X.EnumC10460Hji;
import X.FGI;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.media.MediaPlayer;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.file.view.MediaViewerContentKt$ContentAudioPlayer$6$1", f = "MediaViewerContent.kt", l = {2106}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class MediaViewerContentKt$ContentAudioPlayer$6$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C00r $currentPositionMs$delegate;
    public final /* synthetic */ MutableState<Boolean> $isPlaying$delegate;
    public final /* synthetic */ MutableState<MediaPlayer> $mediaPlayer$delegate;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaViewerContentKt$ContentAudioPlayer$6$1(MutableState<Boolean> mutableState, MutableState<MediaPlayer> mutableState2, C00r c00r, HtJ<? super MediaViewerContentKt$ContentAudioPlayer$6$1> htJ) {
        super(2, htJ);
        this.$isPlaying$delegate = mutableState;
        this.$mediaPlayer$delegate = mutableState2;
        this.$currentPositionMs$delegate = c00r;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new MediaViewerContentKt$ContentAudioPlayer$6$1(this.$isPlaying$delegate, this.$mediaPlayer$delegate, this.$currentPositionMs$delegate, htJ);
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
            MutableState<Boolean> mutableState = this.$isPlaying$delegate;
            float f = MediaViewerContentKt.CONTROLS_SCRIM_ALPHA;
            if (!MutableState.A0A((MutableState) mutableState)) {
                return Unit.INSTANCE;
            }
            MediaPlayer value = this.$mediaPlayer$delegate.getValue();
            if (value != null) {
                try {
                    this.$currentPositionMs$delegate.AdX(value.getCurrentPosition());
                } catch (IllegalStateException e) {
                    CFK.A08(MediaViewerContentKt.TAG, FGI.A0M("ContentAudioPlayer: error reading position: ", e.getMessage()), e);
                }
            }
            this.label = 1;
        } while (C7Bq.A01(100L, this) != enumC10460Hji);
        return enumC10460Hji;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((MediaViewerContentKt$ContentAudioPlayer$6$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
