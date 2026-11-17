package com.facebook.aura.file.view;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.CFK;
import X.FGI;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.media.MediaPlayer;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.file.view.MediaViewerContentKt$ContentAudioPlayer$4$1", f = "MediaViewerContent.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class MediaViewerContentKt$ContentAudioPlayer$4$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ ContentAudioFocus $audioFocus;
    public final /* synthetic */ boolean $isCurrentPage;
    public final /* synthetic */ MutableState<Boolean> $isPlaying$delegate;
    public final /* synthetic */ MutableState<MediaPlayer> $mediaPlayer$delegate;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaViewerContentKt$ContentAudioPlayer$4$1(boolean z, MutableState<Boolean> mutableState, MutableState<MediaPlayer> mutableState2, ContentAudioFocus contentAudioFocus, HtJ<? super MediaViewerContentKt$ContentAudioPlayer$4$1> htJ) {
        super(2, htJ);
        this.$isCurrentPage = z;
        this.$isPlaying$delegate = mutableState;
        this.$mediaPlayer$delegate = mutableState2;
        this.$audioFocus = contentAudioFocus;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new MediaViewerContentKt$ContentAudioPlayer$4$1(this.$isCurrentPage, this.$isPlaying$delegate, this.$mediaPlayer$delegate, this.$audioFocus, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) throws IllegalStateException {
        MediaPlayer value;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        if (!this.$isCurrentPage) {
            MutableState<Boolean> mutableState = this.$isPlaying$delegate;
            float f = MediaViewerContentKt.CONTROLS_SCRIM_ALPHA;
            if (MutableState.A0A((MutableState) mutableState) && (value = this.$mediaPlayer$delegate.getValue()) != null) {
                ContentAudioFocus contentAudioFocus = this.$audioFocus;
                MutableState<Boolean> mutableState2 = this.$isPlaying$delegate;
                try {
                    value.pause();
                } catch (IllegalStateException e) {
                    CFK.A08(MediaViewerContentKt.TAG, FGI.A0M("ContentAudioPlayer: error pausing on page change: ", e.getMessage()), e);
                }
                MutableState.A09(false, mutableState2);
                contentAudioFocus.release();
            }
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((MediaViewerContentKt$ContentAudioPlayer$4$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
