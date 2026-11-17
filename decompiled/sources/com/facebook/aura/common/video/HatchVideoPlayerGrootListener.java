package com.facebook.aura.common.video;

import X.AnonymousClass002;
import X.BV4;
import X.BWp;
import X.C06H;
import X.C5623Dm6;
import X.C5723DoI;
import X.C5790DpZ;
import X.C5919Ds4;
import X.C6060Duv;
import X.C7384Etj;
import X.DXC;
import X.Dq8;
import X.DwN;
import X.EnumC2375BWj;
import X.FGI;
import android.view.ViewGroup;
import com.facebook.aura.common.video.HatchVideoPlayer;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class HatchVideoPlayerGrootListener {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public static final String TAG = "HatchVideoPlayerGrootListener";
    public final Set<HatchVideoPlayer.Listener> listeners;
    public final int playerId;

    public final void addListener(HatchVideoPlayer.Listener listener) {
        C7384Etj.A0Y(listener, 0);
        this.listeners.add(listener);
    }

    public final void notifyPlaybackStateChanged(HatchVideoPlayer.PlayerState playerState) {
        C7384Etj.A0Y(playerState, 0);
        Iterator<HatchVideoPlayer.Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onPlaybackStateChanged(playerState);
        }
    }

    public void onAudioFocusLoss(int i, BWp bWp) {
        C7384Etj.A0Y(bWp, 1);
    }

    public void onCues(List<DXC> list) {
        C7384Etj.A0Y(list, 0);
    }

    public void onDecoderInitialized(String str, boolean z, long j) {
        C7384Etj.A0Y(str, 0);
    }

    public void onDecoderPerfReport(int i, int i2, int i3, int i4) {
    }

    public void onDownstreamFormatChanged(C5723DoI c5723DoI, long j, String str, List<String> list, boolean z) {
        C7384Etj.A0Y(str, 2);
    }

    public void onErrorRecoveryAttempt(long j, String str, C5790DpZ c5790DpZ, String str2) {
        AnonymousClass002.A1B(str, 1, str2);
    }

    public /* bridge */ void onForcedReleased() {
    }

    public void onFrameMetadata(String str, long j) {
        C7384Etj.A0Y(str, 0);
    }

    public void onImfEventEmsgReceived(byte[] bArr, String str, long j) {
        C7384Etj.A0Y(str, 1);
    }

    public void onLiveEmsg(byte[] bArr, String str, long j, long j2) {
        C7384Etj.A0Y(str, 1);
    }

    public void onMetadataMsg(Object obj) {
        C7384Etj.A0Y(obj, 0);
    }

    public void onPlaybackAboutToFinish() {
    }

    public void onPlaybackError(C5623Dm6 c5623Dm6, Dq8 dq8, C6060Duv c6060Duv, C5790DpZ c5790DpZ, String str) {
        C7384Etj.A0Y(c5790DpZ, 3);
        RuntimeException runtimeExceptionA0c = BV4.A0c(FGI.A0S(c5790DpZ.A04, " code: ", c5790DpZ.A02.errorCode));
        Iterator<HatchVideoPlayer.Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onPlayerError(runtimeExceptionA0c);
        }
    }

    public void onPlaybackPositionReached(EnumC2375BWj enumC2375BWj) {
        C7384Etj.A0Y(enumC2375BWj, 0);
    }

    public void onPrepared(long j, String str) {
        C7384Etj.A0Y(str, 1);
        Iterator<HatchVideoPlayer.Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onPlaybackStateChanged(HatchVideoPlayer.PlayerState.READY);
        }
    }

    public void onPreparing() {
    }

    public void onReusedSurfaceSet(String str) {
        C7384Etj.A0Y(str, 0);
    }

    public void onSurfaceAvailable(String str) {
        C7384Etj.A0Y(str, 0);
    }

    public /* bridge */ void onSurfaceDestroyed(Function0<Boolean> function0) {
        C7384Etj.A0Y(function0, 1);
        function0.invoke();
    }

    public /* bridge */ void onSurfaceReused() {
    }

    public void onSurfaceUpdated() {
    }

    public void onTimestampGapsChanged(List<? extends DwN> list) {
        C7384Etj.A0Y(list, 0);
    }

    public void onTrackSelectionFallback(C5723DoI c5723DoI, C5723DoI c5723DoI2, long j, String str, List<String> list, String str2) {
        AnonymousClass002.A1D(str, 3, str2);
    }

    public void onVideoCancelled() {
    }

    public void onVideoPlayedForThreeSeconds() {
    }

    public void onVideoRequestedPlaying() {
    }

    public void onWarn(C5790DpZ c5790DpZ) {
        C7384Etj.A0Y(c5790DpZ, 0);
    }

    public final void removeListener(HatchVideoPlayer.Listener listener) {
        C7384Etj.A0Y(listener, 0);
        this.listeners.remove(listener);
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final void notifyIsPlayingChanged(boolean z) {
        Iterator<HatchVideoPlayer.Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onIsPlayingChanged(z);
        }
    }

    public void onInitialTextureUpdate() {
        Iterator<HatchVideoPlayer.Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onInitialTextureUpdate();
        }
    }

    public void onStartBuffering(boolean z) {
        for (HatchVideoPlayer.Listener listener : this.listeners) {
            listener.onPlaybackStateChanged(HatchVideoPlayer.PlayerState.BUFFERING);
            listener.onIsPlayingChanged(false);
        }
    }

    public void onStopBuffering(int i) {
        for (HatchVideoPlayer.Listener listener : this.listeners) {
            listener.onPlaybackStateChanged(HatchVideoPlayer.PlayerState.READY);
            listener.onIsPlayingChanged(true);
        }
    }

    public void onVideoComplete(long j, C6060Duv c6060Duv) {
        for (HatchVideoPlayer.Listener listener : this.listeners) {
            listener.onPlaybackStateChanged(HatchVideoPlayer.PlayerState.ENDED);
            listener.onIsPlayingChanged(false);
        }
    }

    public void onVideoPaused(long j, boolean z, long j2, C6060Duv c6060Duv, String str) {
        Iterator<HatchVideoPlayer.Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onIsPlayingChanged(false);
        }
    }

    public void onVideoSizeUpdated(int i, int i2, float f) {
        Iterator<HatchVideoPlayer.Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onVideoSizeChanged(i, i2);
        }
    }

    public void onVideoStartedPlaying(boolean z, C5623Dm6 c5623Dm6, String str, String str2, long j, String str3, String str4, String str5) {
        Iterator<HatchVideoPlayer.Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onIsPlayingChanged(true);
        }
    }

    public HatchVideoPlayerGrootListener(int i) {
        this.playerId = i;
        ConcurrentHashMap.KeySetView keySetViewNewKeySet = ConcurrentHashMap.newKeySet();
        C7384Etj.A0U(keySetViewNewKeySet);
        this.listeners = keySetViewNewKeySet;
    }

    public /* bridge */ void onAudioFocusGain(int i) {
    }

    public void onAudioInputFormatChanged(C5723DoI c5723DoI) {
    }

    public /* bridge */ void onDrawnToSurface(C5919Ds4 c5919Ds4) {
        onDrawnToSurface();
    }

    public void onIsLoadingChanged(boolean z) {
    }

    public void onLiveBroadcastInterruptStatusChanged(boolean z) {
    }

    public void onNewPCMBuffer(byte[] bArr) {
    }

    public /* bridge */ void onPlayerViewAttached(ViewGroup viewGroup) {
    }

    public /* bridge */ void onPlayerViewDetached(ViewGroup viewGroup) {
    }

    public void onSeeking(long j) {
    }

    public /* bridge */ void onStopped(C6060Duv c6060Duv) {
    }

    public void onStreamDryoutStatusChanged(boolean z) {
    }

    public /* bridge */ void onSurfaceCreated(String str) {
    }

    public /* bridge */ void onVideoIssueDetected(C5790DpZ c5790DpZ) {
    }

    public /* bridge */ void onVideoStartedPlayingRealtime(C5623Dm6 c5623Dm6) {
    }

    public void onVisualPlayStateChanged(boolean z) {
    }

    public /* bridge */ void onVolumeChanged(float f) {
    }

    public /* bridge */ void onBlackScreenConfirmed(String str, long j) {
    }

    public /* bridge */ void onCodecReleased(String str, boolean z) {
    }

    public void onNewAudioData(byte[] bArr, long j) {
    }

    public /* bridge */ void onSeekProcessed(long j, long j2) {
    }

    public /* bridge */ void onSurfaceChanged(int i, int i2) {
    }

    public /* bridge */ void onSurfaceControlEvent(String str, Map<String, String> map) {
    }

    public void onDrawnToSurface() {
        for (HatchVideoPlayer.Listener listener : this.listeners) {
            listener.onRenderedFirstFrame();
            listener.onPlaybackStateChanged(HatchVideoPlayer.PlayerState.READY);
        }
    }

    public void onSurfaceDestroyed() {
    }

    public /* bridge */ void onVideoPaused(long j, boolean z, long j2, C6060Duv c6060Duv, boolean z2, String str) {
    }
}
