package com.facebook.aura.file.view;

import X.AGH;
import X.AbstractC7559F3s;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C00r;
import X.C0Yr;
import X.C78g;
import X.CFK;
import X.FGI;
import X.G0U;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.net.Uri;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.network.api.HatchUrlSegments;
import java.io.IOException;

/* loaded from: classes.dex */
public final class MediaViewerContentKt$ContentAudioPlayer$5$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ String $accessToken;
    public final /* synthetic */ ContentAudioFocus $audioFocus;
    public final /* synthetic */ String $audioUrl;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C00r $currentPositionMs$delegate;
    public final /* synthetic */ C00r $durationMs$delegate;
    public final /* synthetic */ MutableState<Boolean> $isPlaying$delegate;
    public final /* synthetic */ MutableState<Boolean> $isPrepared$delegate;
    public final /* synthetic */ MutableState<MediaPlayer> $mediaPlayer$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaViewerContentKt$ContentAudioPlayer$5$1(String str, Context context, String str2, MutableState<MediaPlayer> mutableState, C00r c00r, MutableState<Boolean> mutableState2, ContentAudioFocus contentAudioFocus, MutableState<Boolean> mutableState3, C00r c00r2) {
        super(1);
        this.$audioUrl = str;
        this.$context = context;
        this.$accessToken = str2;
        this.$mediaPlayer$delegate = mutableState;
        this.$durationMs$delegate = c00r;
        this.$isPrepared$delegate = mutableState2;
        this.$audioFocus = contentAudioFocus;
        this.$isPlaying$delegate = mutableState3;
        this.$currentPositionMs$delegate = c00r2;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        final MediaPlayer mediaPlayer = new MediaPlayer();
        MutableState<MediaPlayer> mutableState = this.$mediaPlayer$delegate;
        float f = MediaViewerContentKt.CONTROLS_SCRIM_ALPHA;
        mutableState.Af8(mediaPlayer);
        mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(1).build());
        final C00r c00r = this.$durationMs$delegate;
        final MutableState<Boolean> mutableState2 = this.$isPrepared$delegate;
        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.facebook.aura.file.view.MediaViewerContentKt$ContentAudioPlayer$5$1.1
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer2) {
                C00r c00r2 = c00r;
                int duration = mediaPlayer2.getDuration();
                float f2 = MediaViewerContentKt.CONTROLS_SCRIM_ALPHA;
                c00r2.AdX(duration);
                MutableState.A09(true, mutableState2);
            }
        });
        final ContentAudioFocus contentAudioFocus = this.$audioFocus;
        final MutableState<Boolean> mutableState3 = this.$isPlaying$delegate;
        final C00r c00r2 = this.$currentPositionMs$delegate;
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.facebook.aura.file.view.MediaViewerContentKt$ContentAudioPlayer$5$1.2
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer2) {
                HatchInteractionLogger.INSTANCE.logPlayEnd(HatchSurface.MEDIA_VIEWER, HatchSubsurface.MEDIA_CONTROLS, HatchScreen.MEDIA_FULLSCREEN, HatchComponent.AUDIO_PLAYER, null, AnonymousClass006.A10("media_type", "audio"));
                MutableState<Boolean> mutableState4 = mutableState3;
                float f2 = MediaViewerContentKt.CONTROLS_SCRIM_ALPHA;
                MutableState.A09(false, mutableState4);
                c00r2.AdX(0);
                contentAudioFocus.release();
            }
        });
        final ContentAudioFocus contentAudioFocus2 = this.$audioFocus;
        final MutableState<Boolean> mutableState4 = this.$isPrepared$delegate;
        final MutableState<Boolean> mutableState5 = this.$isPlaying$delegate;
        mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.facebook.aura.file.view.MediaViewerContentKt$ContentAudioPlayer$5$1.3
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer2, int i, int i2) {
                MutableState<Boolean> mutableState6 = mutableState4;
                float f2 = MediaViewerContentKt.CONTROLS_SCRIM_ALPHA;
                MutableState.A09(false, mutableState6);
                MutableState.A09(false, mutableState5);
                contentAudioFocus2.release();
                return true;
            }
        });
        try {
            if (AnonymousClass005.A1a(this.$audioUrl, "content://")) {
                mediaPlayer.setDataSource(this.$context, Uri.parse(this.$audioUrl));
            } else {
                Uri uri = Uri.parse(this.$audioUrl);
                String path = uri.getPath();
                String str = this.$accessToken;
                mediaPlayer.setDataSource(this.$context, uri, (str == null || path == null || !(path.startsWith(HatchUrlSegments.FS_RAW_SEGMENT) || path.startsWith(HatchUrlSegments.FS_THUMBNAIL_SEGMENT))) ? AGH.A0E() : AnonymousClass006.A10("Authorization", FGI.A0M("Bearer ", str)));
            }
            mediaPlayer.prepareAsync();
        } catch (Exception e) {
            CFK.A08(MediaViewerContentKt.TAG, FGI.A0M("ContentAudioPlayer: failed to prepare audio: ", e.getMessage()), e);
        }
        final ContentAudioFocus contentAudioFocus3 = this.$audioFocus;
        final MutableState<MediaPlayer> mutableState6 = this.$mediaPlayer$delegate;
        return new C78g() { // from class: com.facebook.aura.file.view.MediaViewerContentKt$ContentAudioPlayer$5$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                MutableState mutableState7 = mutableState6;
                float f2 = MediaViewerContentKt.CONTROLS_SCRIM_ALPHA;
                mutableState7.Af8(null);
                mediaPlayer.release();
                contentAudioFocus3.release();
            }
        };
    }
}
