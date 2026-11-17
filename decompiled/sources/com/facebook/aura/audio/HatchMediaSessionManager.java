package com.facebook.aura.audio;

import X.AbstractC7609F5w;
import X.AbstractC8851FrC;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BV6;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C60Q;
import X.C7384Etj;
import X.C8849Fr9;
import X.C8852FrD;
import X.C8853FrI;
import X.DQd;
import X.G0U;
import X.InterfaceC8858FrW;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.MediaMetadata;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.IMediaControllerCallback;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.PlaybackStateCompat;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class HatchMediaSessionManager {
    public static final int $stable = 8;
    public boolean audioFocusGranted;
    public AudioFocusRequest audioFocusRequest;
    public final AudioManager audioManager;
    public final Context context;
    public final AudioManager.OnAudioFocusChangeListener focusChangeListener;
    public final Function0<Boolean> isPlaying;
    public final Handler mainHandler;
    public C8852FrD mediaSession;
    public final Function0<Unit> onDuck;
    public final Function0<Unit> onPause;
    public final Function0<Unit> onPlay;
    public final G0U<Long, Unit> onSeekTo;
    public final G0U<Float, Unit> onSetPlaybackSpeed;
    public final Function0<Unit> onSkipBackward;
    public final Function0<Unit> onSkipForward;
    public final Function0<Unit> onStop;
    public final Function0<Unit> onUnduck;
    public boolean wasPlayingBeforeFocusLoss;

    private final synchronized void abandonAudioFocus() {
        AudioFocusRequest audioFocusRequest = this.audioFocusRequest;
        if (audioFocusRequest != null) {
            this.audioManager.abandonAudioFocusRequest(audioFocusRequest);
        }
        this.audioFocusRequest = null;
        this.audioFocusGranted = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void markAudioFocusGranted() {
        this.audioFocusGranted = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void markAudioFocusRevoked() {
        this.audioFocusGranted = false;
    }

    public final void activate(HatchAudioItem hatchAudioItem, int i) {
        C7384Etj.A0Y(hatchAudioItem, 0);
        release();
        C8852FrD c8852FrD = new C8852FrD(this.context);
        AbstractC8851FrC abstractC8851FrC = new AbstractC8851FrC() { // from class: com.facebook.aura.audio.HatchMediaSessionManager$activate$session$1$1
            @Override // X.AbstractC8851FrC
            public void onFastForward() {
                this.this$0.onSkipForward.invoke();
            }

            @Override // X.AbstractC8851FrC
            public void onPause() {
                this.this$0.onPause.invoke();
            }

            @Override // X.AbstractC8851FrC
            public void onPlay() {
                this.this$0.onPlay.invoke();
            }

            @Override // X.AbstractC8851FrC
            public void onRewind() {
                this.this$0.onSkipBackward.invoke();
            }

            @Override // X.AbstractC8851FrC
            public void onSeekTo(long j) {
                this.this$0.onSeekTo.invoke(Long.valueOf(j));
            }

            @Override // X.AbstractC8851FrC
            public void onSetPlaybackSpeed(float f) {
                this.this$0.onSetPlaybackSpeed.invoke(Float.valueOf(f));
            }

            @Override // X.AbstractC8851FrC
            public void onStop() {
                this.this$0.onStop.invoke();
            }
        };
        InterfaceC8858FrW interfaceC8858FrW = c8852FrD.A01;
        Handler handler = new Handler();
        C8853FrI c8853FrI = (C8853FrI) interfaceC8858FrW;
        synchronized (c8853FrI.A08) {
            c8853FrI.A01 = abstractC8851FrC;
            c8853FrI.A04.setCallback(abstractC8851FrC.mCallbackFwk, handler);
            abstractC8851FrC.setSessionImpl(c8853FrI, handler);
        }
        Bundle bundleA0N = BV6.A0N();
        String str = hatchAudioItem.title;
        DQd<String, Integer> dQd = MediaMetadataCompat.A02;
        if (dQd.containsKey("android.media.metadata.TITLE") && AnonymousClass001.A0F(dQd.get("android.media.metadata.TITLE")) != 1) {
            throw C60Q.A0V("The ", "android.media.metadata.TITLE", " key cannot be used to put a String");
        }
        bundleA0N.putCharSequence("android.media.metadata.TITLE", str);
        String str2 = hatchAudioItem.artist;
        if (dQd.containsKey("android.media.metadata.ARTIST") && AnonymousClass001.A0F(dQd.get("android.media.metadata.ARTIST")) != 1) {
            throw C60Q.A0V("The ", "android.media.metadata.ARTIST", " key cannot be used to put a String");
        }
        bundleA0N.putCharSequence("android.media.metadata.ARTIST", str2);
        long j = i;
        if (dQd.containsKey("android.media.metadata.DURATION") && AnonymousClass001.A0F(dQd.get("android.media.metadata.DURATION")) != 0) {
            throw C60Q.A0V("The ", "android.media.metadata.DURATION", " key cannot be used to put a long");
        }
        bundleA0N.putLong("android.media.metadata.DURATION", j);
        c8852FrD.A01(new MediaMetadataCompat(bundleA0N));
        c8852FrD.A02(true);
        this.mediaSession = c8852FrD;
    }

    public final void cancelResumeOnFocusGain() {
        this.wasPlayingBeforeFocusLoss = false;
    }

    public final synchronized boolean requestAudioFocus() {
        boolean z;
        if (!this.audioFocusGranted) {
            z = this.audioManager.requestAudioFocus(orCreateAudioFocusRequest()) == 1;
            this.audioFocusGranted = z;
        }
        return z;
    }

    public final void updateArtwork(Bitmap bitmap) {
        MediaMetadata metadata;
        C7384Etj.A0Y(bitmap, 0);
        C8852FrD c8852FrD = this.mediaSession;
        if (c8852FrD == null || (metadata = ((C8849Fr9) c8852FrD.A00.A00).A01.getMetadata()) == null) {
            return;
        }
        Parcelable.Creator<MediaMetadataCompat> creator = MediaMetadataCompat.CREATOR;
        Parcel parcelObtain = Parcel.obtain();
        metadata.writeToParcel(parcelObtain, 0);
        parcelObtain.setDataPosition(0);
        MediaMetadataCompat mediaMetadataCompatCreateFromParcel = creator.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        mediaMetadataCompatCreateFromParcel.A00 = metadata;
        Bundle bundle = new Bundle(mediaMetadataCompatCreateFromParcel.A01);
        C8852FrD.A00(bundle);
        DQd<String, Integer> dQd = MediaMetadataCompat.A02;
        if (dQd.containsKey("android.media.metadata.ALBUM_ART") && AnonymousClass001.A0F(dQd.get("android.media.metadata.ALBUM_ART")) != 2) {
            throw C60Q.A0V("The ", "android.media.metadata.ALBUM_ART", " key cannot be used to put a Bitmap");
        }
        bundle.putParcelable("android.media.metadata.ALBUM_ART", bitmap);
        c8852FrD.A01(new MediaMetadataCompat(bundle));
    }

    public final void updatePlaybackState(HatchAudioPlaybackState hatchAudioPlaybackState, int i) {
        C7384Etj.A0Y(hatchAudioPlaybackState, 0);
        C8852FrD c8852FrD = this.mediaSession;
        if (c8852FrD != null) {
            int iOrdinal = hatchAudioPlaybackState.status.ordinal();
            int i2 = 3;
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    i2 = 2;
                } else {
                    if (iOrdinal != 0) {
                        throw C3cG.A0q();
                    }
                    i2 = 6;
                }
            }
            PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(null, null, C3cG.A0h(), hatchAudioPlaybackState.playbackRate, i2, 0, i, 0L, 4194639L, SystemClock.elapsedRealtime(), -1L);
            C8853FrI c8853FrI = (C8853FrI) c8852FrD.A01;
            c8853FrI.A02 = playbackStateCompat;
            synchronized (c8853FrI.A08) {
                RemoteCallbackList<IMediaControllerCallback> remoteCallbackList = c8853FrI.A05;
                for (int iBeginBroadcast = remoteCallbackList.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                    try {
                        ((IMediaControllerCallback) remoteCallbackList.getBroadcastItem(iBeginBroadcast)).AUh(playbackStateCompat);
                    } catch (RemoteException unused) {
                    }
                }
                remoteCallbackList.finishBroadcast();
            }
            MediaSession mediaSession = c8853FrI.A04;
            PlaybackState playbackStateBuild = playbackStateCompat.A00;
            if (playbackStateBuild == null) {
                PlaybackState.Builder builder = new PlaybackState.Builder();
                builder.setState(playbackStateCompat.A04, playbackStateCompat.A08, playbackStateCompat.A02, playbackStateCompat.A09);
                builder.setBufferedPosition(0L);
                builder.setActions(4194639L);
                builder.setErrorMessage(playbackStateCompat.A0B);
                for (PlaybackStateCompat.CustomAction customAction : playbackStateCompat.A01) {
                    PlaybackState.CustomAction.Builder builder2 = new PlaybackState.CustomAction.Builder(customAction.A03, customAction.A02, customAction.A00);
                    builder2.setExtras(customAction.A01);
                    builder.addCustomAction(builder2.build());
                }
                builder.setActiveQueueItemId(-1L);
                builder.setExtras(playbackStateCompat.A0A);
                playbackStateBuild = builder.build();
                playbackStateCompat.A00 = playbackStateBuild;
            }
            mediaSession.setPlaybackState(playbackStateBuild);
        }
    }

    /* loaded from: classes5.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AudioStatus.values().length];
            try {
                AnonymousClass002.A13(AudioStatus.PLAYING, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(AudioStatus.PAUSED, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(AudioStatus.LOADING, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final AudioFocusRequest orCreateAudioFocusRequest() {
        AudioFocusRequest audioFocusRequest = this.audioFocusRequest;
        if (audioFocusRequest != null) {
            return audioFocusRequest;
        }
        AudioFocusRequest audioFocusRequestBuild = new AudioFocusRequest.Builder(1).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(1).build()).setOnAudioFocusChangeListener(this.focusChangeListener).build();
        this.audioFocusRequest = audioFocusRequestBuild;
        C7384Etj.A0U(audioFocusRequestBuild);
        return audioFocusRequestBuild;
    }

    public final MediaSessionCompat$Token getSessionToken() {
        C8852FrD c8852FrD = this.mediaSession;
        if (c8852FrD != null) {
            return ((C8853FrI) c8852FrD.A01).A07;
        }
        return null;
    }

    public final void release() {
        C8852FrD c8852FrD = this.mediaSession;
        if (c8852FrD != null) {
            c8852FrD.A02(false);
            C8853FrI c8853FrI = (C8853FrI) c8852FrD.A01;
            c8853FrI.A05.kill();
            MediaSession mediaSession = c8853FrI.A04;
            mediaSession.setCallback(null);
            c8853FrI.A06.A00.set(null);
            mediaSession.release();
        }
        this.mediaSession = null;
        abandonAudioFocus();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HatchMediaSessionManager(Context context, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, G0U<? super Long, Unit> g0u, Function0<Unit> function04, Function0<Unit> function05, G0U<? super Float, Unit> g0u2, Function0<Unit> function06, Function0<Unit> function07, Function0<Boolean> function08) {
        AnonymousClass005.A17(context, function0, function02, function03, g0u);
        C7384Etj.A0Y(function04, 5);
        AnonymousClass005.A13(function05, g0u2, function06, 6);
        C3cH.A18(function07, function08);
        this.context = context;
        this.onPlay = function0;
        this.onPause = function02;
        this.onStop = function03;
        this.onSeekTo = g0u;
        this.onSkipForward = function04;
        this.onSkipBackward = function05;
        this.onSetPlaybackSpeed = g0u2;
        this.onDuck = function06;
        this.onUnduck = function07;
        this.isPlaying = function08;
        this.audioManager = (AudioManager) AbstractC7609F5w.A0o(context);
        this.mainHandler = C60O.A02();
        this.focusChangeListener = new AudioManager.OnAudioFocusChangeListener() { // from class: com.facebook.aura.audio.HatchMediaSessionManager$focusChangeListener$1
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public final void onAudioFocusChange(int i) {
                Handler handler;
                Runnable runnable;
                Runnable runnable2;
                if (i == -3) {
                    final HatchMediaSessionManager hatchMediaSessionManager = this.this$0;
                    handler = hatchMediaSessionManager.mainHandler;
                    runnable = new Runnable() { // from class: com.facebook.aura.audio.HatchMediaSessionManager$focusChangeListener$1.3
                        @Override // java.lang.Runnable
                        public final void run() {
                            hatchMediaSessionManager.onDuck.invoke();
                        }
                    };
                } else if (i == -2) {
                    this.this$0.markAudioFocusRevoked();
                    HatchMediaSessionManager hatchMediaSessionManager2 = this.this$0;
                    hatchMediaSessionManager2.wasPlayingBeforeFocusLoss = AnonymousClass003.A1Y(hatchMediaSessionManager2.isPlaying);
                    final HatchMediaSessionManager hatchMediaSessionManager3 = this.this$0;
                    handler = hatchMediaSessionManager3.mainHandler;
                    runnable = new Runnable() { // from class: com.facebook.aura.audio.HatchMediaSessionManager$focusChangeListener$1.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            hatchMediaSessionManager3.onPause.invoke();
                        }
                    };
                } else {
                    if (i != -1) {
                        if (i == 1) {
                            this.this$0.markAudioFocusGranted();
                            final HatchMediaSessionManager hatchMediaSessionManager4 = this.this$0;
                            final boolean z = hatchMediaSessionManager4.wasPlayingBeforeFocusLoss;
                            hatchMediaSessionManager4.wasPlayingBeforeFocusLoss = false;
                            handler = hatchMediaSessionManager4.mainHandler;
                            runnable2 = new Runnable() { // from class: com.facebook.aura.audio.HatchMediaSessionManager$focusChangeListener$1.4
                                @Override // java.lang.Runnable
                                public final void run() {
                                    hatchMediaSessionManager4.onUnduck.invoke();
                                    if (z) {
                                        hatchMediaSessionManager4.onPlay.invoke();
                                    }
                                }
                            };
                            handler.post(runnable2);
                        }
                        return;
                    }
                    this.this$0.markAudioFocusRevoked();
                    final HatchMediaSessionManager hatchMediaSessionManager5 = this.this$0;
                    hatchMediaSessionManager5.wasPlayingBeforeFocusLoss = false;
                    handler = hatchMediaSessionManager5.mainHandler;
                    runnable = new Runnable() { // from class: com.facebook.aura.audio.HatchMediaSessionManager$focusChangeListener$1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            hatchMediaSessionManager5.onStop.invoke();
                        }
                    };
                }
                runnable2 = runnable;
                handler.post(runnable2);
            }
        };
    }
}
