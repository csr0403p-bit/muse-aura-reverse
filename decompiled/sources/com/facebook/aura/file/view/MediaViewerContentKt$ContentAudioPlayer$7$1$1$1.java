package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.AnonymousClass006;
import X.CFK;
import X.FGI;
import android.media.MediaPlayer;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class MediaViewerContentKt$ContentAudioPlayer$7$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ ContentAudioFocus $audioFocus;
    public final /* synthetic */ MutableState<Boolean> $isPlaying$delegate;
    public final /* synthetic */ MutableState<MediaPlayer> $mediaPlayer$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaViewerContentKt$ContentAudioPlayer$7$1$1$1(MutableState<MediaPlayer> mutableState, ContentAudioFocus contentAudioFocus, MutableState<Boolean> mutableState2) {
        super(0);
        this.$mediaPlayer$delegate = mutableState;
        this.$audioFocus = contentAudioFocus;
        this.$isPlaying$delegate = mutableState2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() throws IllegalStateException {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.MEDIA_VIEWER, HatchSubsurface.MEDIA_CONTROLS, HatchScreen.MEDIA_FULLSCREEN, HatchComponent.AUDIO_PLAY_BUTTON, null, AnonymousClass006.A10("media_type", "audio"), null);
        MutableState<MediaPlayer> mutableState = this.$mediaPlayer$delegate;
        float f = MediaViewerContentKt.CONTROLS_SCRIM_ALPHA;
        MediaPlayer value = mutableState.getValue();
        if (value != null) {
            ContentAudioFocus contentAudioFocus = this.$audioFocus;
            MutableState<Boolean> mutableState2 = this.$isPlaying$delegate;
            if (MutableState.A0A((MutableState) mutableState2)) {
                try {
                    value.pause();
                } catch (IllegalStateException e) {
                    CFK.A08(MediaViewerContentKt.TAG, FGI.A0M("ContentAudioPlayer: error pausing playback: ", e.getMessage()), e);
                }
                MutableState.A09(false, mutableState2);
                contentAudioFocus.release();
                return;
            }
            contentAudioFocus.acquire();
            try {
                value.start();
                MutableState.A09(true, mutableState2);
            } catch (IllegalStateException e2) {
                CFK.A08(MediaViewerContentKt.TAG, FGI.A0M("ContentAudioPlayer: error starting playback: ", e2.getMessage()), e2);
                contentAudioFocus.release();
            }
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() throws IllegalStateException {
        invoke2();
        return Unit.INSTANCE;
    }
}
