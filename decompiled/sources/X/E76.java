package X;

import androidx.media3.common.PlaybackException;
import androidx.media3.common.Timeline;
import java.util.List;

/* loaded from: classes5.dex */
public interface E76 {
    void onAudioSessionIdChanged(int i);

    void onAvailableCommandsChanged(E1B e1b);

    void onCues(DXD dxd);

    @Deprecated
    void onCues(List<E0J> list);

    void onEvents(Dn6 dn6, E7N e7n);

    void onIsLoadingChanged(boolean z);

    void onIsPlayingChanged(boolean z);

    void onMediaItemTransition(C5704Dnm c5704Dnm, int i);

    void onMediaMetadataChanged(C10388Har c10388Har);

    void onMetadata(C5402Dhv c5402Dhv);

    void onPlayWhenReadyChanged(boolean z, int i);

    void onPlaybackParametersChanged(C6233Dyb c6233Dyb);

    void onPlaybackStateChanged(int i);

    void onPlaybackSuppressionReasonChanged(int i);

    void onPlayerError(PlaybackException playbackException);

    void onPlayerErrorChanged(PlaybackException playbackException);

    @Deprecated
    void onPlayerStateChanged(boolean z, int i);

    @Deprecated
    void onPositionDiscontinuity(int i);

    void onPositionDiscontinuity(BYW byw, BYW byw2, int i);

    void onRepeatModeChanged(int i);

    void onSkipSilenceEnabledChanged(boolean z);

    void onSurfaceSizeChanged(int i, int i2);

    void onTimelineChanged(Timeline timeline, int i);

    void onTracksChanged(C5735DoU c5735DoU);

    void onVideoSizeChanged(C6232Dya c6232Dya);

    void onVolumeChanged(float f);
}
