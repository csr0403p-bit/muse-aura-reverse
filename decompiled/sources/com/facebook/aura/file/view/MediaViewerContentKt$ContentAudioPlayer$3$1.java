package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.CFK;
import X.FGI;
import android.media.MediaPlayer;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class MediaViewerContentKt$ContentAudioPlayer$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ ContentAudioFocus $audioFocus;
    public final /* synthetic */ MutableState<Boolean> $isPlaying$delegate;
    public final /* synthetic */ MutableState<MediaPlayer> $mediaPlayer$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaViewerContentKt$ContentAudioPlayer$3$1(ContentAudioFocus contentAudioFocus, MutableState<MediaPlayer> mutableState, MutableState<Boolean> mutableState2) {
        super(0);
        this.$audioFocus = contentAudioFocus;
        this.$mediaPlayer$delegate = mutableState;
        this.$isPlaying$delegate = mutableState2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() throws IllegalStateException {
        try {
            MutableState<MediaPlayer> mutableState = this.$mediaPlayer$delegate;
            float f = MediaViewerContentKt.CONTROLS_SCRIM_ALPHA;
            MediaPlayer value = mutableState.getValue();
            if (value != null) {
                value.start();
            }
            MutableState.A09(true, this.$isPlaying$delegate);
        } catch (IllegalStateException e) {
            CFK.A08(MediaViewerContentKt.TAG, FGI.A0M("ContentAudioPlayer: error resuming on focus gain: ", e.getMessage()), e);
            this.$audioFocus.release();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() throws IllegalStateException {
        invoke2();
        return Unit.INSTANCE;
    }
}
