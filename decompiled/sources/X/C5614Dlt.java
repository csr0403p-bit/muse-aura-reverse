package X;

import androidx.media3.common.PlaybackException;
import androidx.media3.common.Timeline;
import java.util.List;

/* renamed from: X.Dlt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5614Dlt implements E76 {
    public final C5982DtP A00;

    @Override // X.E76
    public final void onMediaItemTransition(C5704Dnm c5704Dnm, int i) {
        C4908DEb c4908DEbAC8;
        if ((i == 1 || i == 0) && (c4908DEbAC8 = this.A00.A00.A0H.AC8()) != null) {
            c4908DEbAC8.A01();
        }
    }

    public C5614Dlt(C5982DtP c5982DtP) {
        this.A00 = c5982DtP;
    }

    @Override // X.E76
    public final /* synthetic */ void onAudioSessionIdChanged(int i) {
    }

    @Override // X.E76
    public final /* synthetic */ void onAvailableCommandsChanged(E1B e1b) {
    }

    @Override // X.E76
    public final /* synthetic */ void onCues(DXD dxd) {
    }

    @Override // X.E76
    public final /* synthetic */ void onIsLoadingChanged(boolean z) {
    }

    @Override // X.E76
    public final /* synthetic */ void onIsPlayingChanged(boolean z) {
    }

    @Override // X.E76
    public final /* synthetic */ void onMediaMetadataChanged(C10388Har c10388Har) {
    }

    @Override // X.E76
    public final /* synthetic */ void onMetadata(C5402Dhv c5402Dhv) {
    }

    @Override // X.E76
    public final /* synthetic */ void onPlaybackParametersChanged(C6233Dyb c6233Dyb) {
    }

    @Override // X.E76
    public final /* synthetic */ void onPlaybackStateChanged(int i) {
    }

    @Override // X.E76
    public final /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
    }

    @Override // X.E76
    public final /* synthetic */ void onPlayerError(PlaybackException playbackException) {
    }

    @Override // X.E76
    public final /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
    }

    @Override // X.E76
    public final /* synthetic */ void onPositionDiscontinuity(int i) {
    }

    @Override // X.E76
    public final /* synthetic */ void onRepeatModeChanged(int i) {
    }

    @Override // X.E76
    public final /* synthetic */ void onSkipSilenceEnabledChanged(boolean z) {
    }

    @Override // X.E76
    public final /* synthetic */ void onTracksChanged(C5735DoU c5735DoU) {
    }

    @Override // X.E76
    public final /* synthetic */ void onVideoSizeChanged(C6232Dya c6232Dya) {
    }

    @Override // X.E76
    public final /* synthetic */ void onVolumeChanged(float f) {
    }

    @Override // X.E76
    public final /* synthetic */ void onEvents(Dn6 dn6, E7N e7n) {
    }

    @Override // X.E76
    public final /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i) {
    }

    @Override // X.E76
    public final /* synthetic */ void onPlayerStateChanged(boolean z, int i) {
    }

    @Override // X.E76
    public final /* synthetic */ void onSurfaceSizeChanged(int i, int i2) {
    }

    @Override // X.E76
    public final /* synthetic */ void onTimelineChanged(Timeline timeline, int i) {
    }

    @Override // X.E76
    public final void onPositionDiscontinuity(BYW byw, BYW byw2, int i) {
        C4908DEb c4908DEbAC8;
        if (i == 1 && (c4908DEbAC8 = this.A00.A00.A0H.AC8()) != null) {
            synchronized (c4908DEbAC8) {
                if (c4908DEbAC8.A03) {
                    C4907DEa.A00(c4908DEbAC8.A01);
                    C4907DEa.A00(c4908DEbAC8.A00);
                }
            }
        }
    }

    @Override // X.E76
    public final /* synthetic */ void onCues(List list) {
    }
}
