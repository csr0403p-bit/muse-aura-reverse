package X;

import android.os.Trace;
import android.util.Pair;
import androidx.media3.common.PlaybackException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class DlZ implements E76 {
    public long A01;
    public long A02;
    public C5580Dky A03;
    public boolean A04;
    public final /* synthetic */ C5615Dlu A08;
    public int A00 = 0;
    public volatile long A07 = -9223372036854775807L;
    public List<Pair<Long, Long>> A05 = null;
    public final C5998Dth A06 = new C5998Dth();

    /* JADX WARN: Removed duplicated region for block: B:75:0x0180  */
    @Override // X.E76
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPlayerStateChanged(boolean r53, int r54) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DlZ.onPlayerStateChanged(boolean, int):void");
    }

    public DlZ(C5615Dlu c5615Dlu) {
        this.A08 = c5615Dlu;
    }

    @Override // X.E76
    public final void onIsPlayingChanged(boolean z) {
        this.A08.A13 = z;
    }

    @Override // X.E76
    public final void onPlayWhenReadyChanged(boolean z, int i) {
        C5615Dlu c5615Dlu;
        boolean z2;
        if (z) {
            c5615Dlu = this.A08;
            z2 = false;
        } else {
            if (i != 3) {
                return;
            }
            c5615Dlu = this.A08;
            z2 = true;
        }
        c5615Dlu.A14 = z2;
    }

    @Override // X.E76
    public final void onPlaybackParametersChanged(C6233Dyb c6233Dyb) {
        C5615Dlu c5615Dlu = this.A08;
        float f = c5615Dlu.A0y;
        float f2 = c6233Dyb.A01;
        if (f != f2) {
            c5615Dlu.A0y = f2;
            c5615Dlu.A0e.A2A.AUf(c5615Dlu.A0y);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0146  */
    @Override // X.E76
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPlayerError(androidx.media3.common.PlaybackException r5) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DlZ.onPlayerError(androidx.media3.common.PlaybackException):void");
    }

    @Override // X.E76
    public final void onPositionDiscontinuity(int i) {
        C5615Dlu c5615Dlu = this.A08;
        DmR dmR = c5615Dlu.A0C;
        if (dmR != null && dmR.A03 != null) {
            C5615Dlu.A0I(c5615Dlu);
        }
        InterfaceC5661Dmq interfaceC5661Dmq = c5615Dlu.A04;
        if (!c5615Dlu.A0k.improveLooping) {
            if (interfaceC5661Dmq == null) {
                return;
            }
            C6438E5q c6438E5q = (C6438E5q) interfaceC5661Dmq;
            C6438E5q.A0J(c6438E5q);
            if (c6438E5q.A03 == 0) {
                return;
            }
        }
        for (C5621Dm4 c5621Dm4 : c5615Dlu.A0l) {
            Trace.beginSection("HeroServicePlayer.exolistener.onPositionDiscontinuity");
            try {
                Dlw dlw = c5621Dm4.A00;
                if (Dlw.A1I(dlw) && (i == 0 || i == 5)) {
                    Dlw.A0U(dlw.A0f, dlw, new Object[]{Integer.valueOf(i), Long.valueOf(Dlw.A01(dlw))}, 38);
                }
            } finally {
                Trace.endSection();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:212:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c0  */
    @Override // X.E76
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onTimelineChanged(androidx.media3.common.Timeline r56, int r57) {
        /*
            Method dump skipped, instructions count: 1902
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DlZ.onTimelineChanged(androidx.media3.common.Timeline, int):void");
    }

    @Override // X.E76
    public final void onTracksChanged(C5735DoU c5735DoU) {
        DoW doW;
        C5742Dod c5742Dod;
        C5615Dlu c5615Dlu = this.A08;
        if (c5615Dlu.A0k.enableTrackUnsupportedWarnings && (doW = c5615Dlu.A08) != null && (c5742Dod = ((AbstractC5736DoV) doW).A00) != null) {
            if (c5742Dod.A00(2) == 1) {
                Iterator it = c5615Dlu.A0l.iterator();
                while (it.hasNext()) {
                    ((C5621Dm4) it.next()).A00.A2A.AXQ("ERROR_VIDEO_TRACK", "UNKNOWN", "");
                }
            }
            if (c5742Dod.A00(1) == 1) {
                Iterator it2 = c5615Dlu.A0l.iterator();
                while (it2.hasNext()) {
                    ((C5621Dm4) it2.next()).A00.A2A.AXQ("ERROR_AUDIO_TRACK", "UNKNOWN", "");
                }
            }
        }
        Iterator it3 = c5615Dlu.A0l.iterator();
        while (it3.hasNext()) {
            Dlw dlw = ((C5621Dm4) it3.next()).A00;
            DmR dmR = dlw.A2f;
            boolean z = false;
            if (c5735DoU != null && dmR != null && dmR.A02()) {
                AbstractC7489Ext<C5734DoT> it4 = c5735DoU.A00.iterator();
                int i = 0;
                while (it4.hasNext()) {
                    C5734DoT next = it4.next();
                    if (next.A01.A02 == 2) {
                        for (int i2 = 0; i2 < next.A00; i2++) {
                            if (next.A02[i2] == 4) {
                                i++;
                            }
                        }
                    }
                }
                dlw.A0D = i;
            }
            if (dlw.A2C.gen.assign_media_track_availabilities && c5735DoU != null) {
                AbstractC7489Ext<C5734DoT> it5 = c5735DoU.A00.iterator();
                boolean z2 = false;
                while (it5.hasNext()) {
                    int i3 = it5.next().A01.A02;
                    if (i3 == 2) {
                        z = true;
                    } else {
                        if (i3 == 1) {
                            z2 = true;
                        }
                        if (!z) {
                            continue;
                        }
                    }
                    if (z2) {
                        break;
                    }
                }
                dlw.A2a = BV4.A0A(Boolean.valueOf(z), Boolean.valueOf(z2));
            }
        }
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
    public final /* synthetic */ void onPlaybackStateChanged(int i) {
    }

    @Override // X.E76
    public final /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
    }

    @Override // X.E76
    public final /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
    }

    @Override // X.E76
    public final void onRepeatModeChanged(int i) {
    }

    @Override // X.E76
    public final /* synthetic */ void onSkipSilenceEnabledChanged(boolean z) {
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
    public final /* synthetic */ void onMediaItemTransition(C5704Dnm c5704Dnm, int i) {
    }

    @Override // X.E76
    public final /* synthetic */ void onSurfaceSizeChanged(int i, int i2) {
    }

    @Override // X.E76
    public final void onPositionDiscontinuity(BYW byw, BYW byw2, int i) {
        C5615Dlu c5615Dlu = this.A08;
        if (c5615Dlu.A0k.gen.propagate_seek_processed_callback) {
            for (C5621Dm4 c5621Dm4 : c5615Dlu.A0l) {
                Trace.beginSection("HeroServicePlayer.exolistener.onPositionDiscontinuityWithPosition");
                try {
                    Dlw dlw = c5621Dm4.A00;
                    Dlw.A0U(dlw.A0f, dlw, new Object[]{byw, byw2, Integer.valueOf(i), Long.valueOf(Dlw.A01(dlw))}, 67);
                } finally {
                    Trace.endSection();
                }
            }
        }
    }

    @Override // X.E76
    public final /* synthetic */ void onCues(List list) {
    }
}
