package X;

import android.content.Intent;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import java.lang.ref.WeakReference;

@Deprecated
/* renamed from: X.FrC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8851FrC {
    public HandlerC8854FrJ mCallbackHandler;
    public boolean mMediaPlayPausePendingOnHandler;
    public final Object mLock = C3cG.A0T();
    public final MediaSession.Callback mCallbackFwk = new C8850FrB(this);
    public WeakReference<InterfaceC8858FrW> mSessionImpl = BV4.A0q(null);

    public void handleMediaPlayPauseIfPendingOnHandler(InterfaceC8858FrW interfaceC8858FrW, Handler handler) {
        if (this.mMediaPlayPausePendingOnHandler) {
            this.mMediaPlayPausePendingOnHandler = false;
            handler.removeMessages(1);
            PlaybackStateCompat playbackStateCompat = ((C8853FrI) interfaceC8858FrW).A02;
            if (playbackStateCompat != null) {
                long j = playbackStateCompat.A05;
                boolean zA1Q = AnonymousClass002.A1Q(playbackStateCompat.A04, 3);
                boolean zA1L = AnonymousClass002.A1L(((516 & j) > 0L ? 1 : ((516 & j) == 0L ? 0 : -1)));
                boolean z = (j & 514) != 0;
                if (zA1Q) {
                    if (z) {
                        onPause();
                    }
                } else if (zA1L) {
                    onPlay();
                }
            }
        }
    }

    public void onAddQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
    }

    public void onFastForward() {
    }

    public boolean onMediaButtonEvent(Intent intent) {
        return false;
    }

    public void onPause() {
    }

    public void onPlay() {
    }

    public void onPrepare() {
    }

    public void onRemoveQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
    }

    @Deprecated
    public void onRemoveQueueItemAt(int i) {
    }

    public void onRewind() {
    }

    public void onSeekTo(long j) {
    }

    public void onSetCaptioningEnabled(boolean z) {
    }

    public void onSetPlaybackSpeed(float f) {
    }

    public void onSetRating(RatingCompat ratingCompat) {
    }

    public void onSetRepeatMode(int i) {
    }

    public void onSetShuffleMode(int i) {
    }

    public void onSkipToNext() {
    }

    public void onSkipToPrevious() {
    }

    public void onSkipToQueueItem(long j) {
    }

    public void onStop() {
    }

    public void setSessionImpl(InterfaceC8858FrW interfaceC8858FrW, Handler handler) {
        synchronized (this.mLock) {
            this.mSessionImpl = BV4.A0q(interfaceC8858FrW);
            HandlerC8854FrJ handlerC8854FrJ = this.mCallbackHandler;
            HandlerC8854FrJ handlerC8854FrJ2 = null;
            if (handlerC8854FrJ != null) {
                handlerC8854FrJ.removeCallbacksAndMessages(null);
            }
            if (interfaceC8858FrW != null && handler != null) {
                handlerC8854FrJ2 = new HandlerC8854FrJ(handler.getLooper(), this);
            }
            this.mCallbackHandler = handlerC8854FrJ2;
        }
    }

    public void onCustomAction(String str, Bundle bundle) {
    }

    public void onPlayFromMediaId(String str, Bundle bundle) {
    }

    public void onPlayFromSearch(String str, Bundle bundle) {
    }

    public void onPlayFromUri(Uri uri, Bundle bundle) {
    }

    public void onPrepareFromMediaId(String str, Bundle bundle) {
    }

    public void onPrepareFromSearch(String str, Bundle bundle) {
    }

    public void onPrepareFromUri(Uri uri, Bundle bundle) {
    }

    public void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
    }

    public void onAddQueueItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
    }

    public void onSetRating(RatingCompat ratingCompat, Bundle bundle) {
    }
}
