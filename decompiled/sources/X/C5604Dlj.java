package X;

import android.os.SystemClock;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Timeline;
import java.util.List;

/* renamed from: X.Dlj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5604Dlj implements E76 {
    public final C5986DtT A00;
    public final C5985DtS A01;
    public final C5984DtR A02;
    public final C5983DtQ A03;

    private void A00(C5431DiS c5431DiS, long j) {
        C5985DtS c5985DtS = this.A01;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C5615Dlu c5615Dlu = c5985DtS.A00;
        long jA02 = C5615Dlu.A02(c5615Dlu);
        long jA01 = C5615Dlu.A01(c5615Dlu);
        long duration = c5615Dlu.A04.getDuration();
        long jA00 = C5615Dlu.A00(C5615Dlu.A03(c5615Dlu, 0), jA02, jA01, duration);
        long jA002 = C5615Dlu.A00(C5615Dlu.A03(c5615Dlu, 1), jA02, jA01, duration);
        synchronized (c5431DiS) {
            c5431DiS.A02(jA00, jA002);
            if (c5431DiS.A04()) {
                c5431DiS.A02 = jCurrentTimeMillis;
                c5431DiS.A01 = BV5.A07(j);
                C5536DkD c5536DkD = c5431DiS.A07;
                c5431DiS.A03 = c5536DkD.A01 ? c5536DkD.A00 : -1L;
                C5536DkD c5536DkD2 = c5431DiS.A06;
                c5431DiS.A00 = c5536DkD2.A01 ? c5536DkD2.A00 : -1L;
                if (!c5431DiS.A05) {
                    c5431DiS.A05 = true;
                    for (C5440Dib c5440Dib : c5431DiS.A08) {
                        C5440Dib.A00(c5440Dib);
                        c5440Dib.A00 = SystemClock.elapsedRealtime();
                    }
                }
            }
        }
    }

    @Override // X.E76
    public final void onIsPlayingChanged(boolean z) {
        if (z) {
            long currentPosition = this.A03.A00.A04.getCurrentPosition();
            C5431DiS c5431DiSAC6 = this.A00.A00.A0H.AC6();
            if (c5431DiSAC6 != null) {
                A00(c5431DiSAC6, currentPosition);
            }
        }
    }

    @Override // X.E76
    public final void onMediaItemTransition(C5704Dnm c5704Dnm, int i) {
        C5431DiS c5431DiSAC6 = this.A00.A00.A0H.AC6();
        if (c5431DiSAC6 != null) {
            if (i == 1 || i == 0) {
                synchronized (c5431DiSAC6) {
                    C5431DiS.A00(c5431DiSAC6, false, true);
                }
                InterfaceC5661Dmq interfaceC5661Dmq = this.A02.A00.A04;
                if (interfaceC5661Dmq == null || !interfaceC5661Dmq.isPlaying()) {
                    return;
                }
                A00(c5431DiSAC6, this.A03.A00.A04.getCurrentPosition());
            }
        }
    }

    public C5604Dlj(C5986DtT c5986DtT, C5985DtS c5985DtS, C5984DtR c5984DtR, C5983DtQ c5983DtQ) {
        this.A00 = c5986DtT;
        this.A01 = c5985DtS;
        this.A02 = c5984DtR;
        this.A03 = c5983DtQ;
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
        C5431DiS c5431DiSAC6;
        if (i == 1 && (c5431DiSAC6 = this.A00.A00.A0H.AC6()) != null) {
            synchronized (c5431DiSAC6) {
                C5431DiS.A00(c5431DiSAC6, true, false);
            }
            InterfaceC5661Dmq interfaceC5661Dmq = this.A02.A00.A04;
            if (interfaceC5661Dmq != null && interfaceC5661Dmq.isPlaying()) {
                A00(c5431DiSAC6, byw2.A05);
            }
        }
    }

    @Override // X.E76
    public final /* synthetic */ void onCues(List list) {
    }
}
