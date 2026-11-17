package com.facebook.aura.audio;

import X.ATD;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC5797Dph;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.BLG;
import X.BV4;
import X.BV5;
import X.BYW;
import X.BzK;
import X.C06H;
import X.C10388Har;
import X.C1BN;
import X.C3Pi;
import X.C3UX;
import X.C3cG;
import X.C4oT;
import X.C5402Dhv;
import X.C5704Dnm;
import X.C5735DoU;
import X.C6141Dwj;
import X.C6232Dya;
import X.C6233Dyb;
import X.C6438E5q;
import X.C7384Etj;
import X.C7438Evz;
import X.C78W;
import X.C7BY;
import X.C7Bq;
import X.C9286GCn;
import X.CH0;
import X.DXD;
import X.Dn6;
import X.DrN;
import X.E1B;
import X.E76;
import X.E7N;
import X.E7U;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HnJ;
import X.HoC;
import X.HtJ;
import X.Hwg;
import X.Hxb;
import X.InterfaceC5661Dmq;
import X.InterfaceC7549F2g;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.net.Uri;
import android.support.v4.media.session.MediaSessionCompat$Token;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Timeline;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.audio.HatchAudioForegroundService;
import com.facebook.aura.common.image.AuraBitmapLoader;
import com.facebook.aura.common.prefs.AuraUserPrefStore;
import com.facebook.aura.common.prefs.AuraUserPrefs;
import com.facebook.aura.executors.AuraDispatchers;
import com.facebook.aura.gateway.JarvisUtils;
import com.facebook.aura.lifecycle.AuraAppLifecycleManager;
import com.facebook.aura.livesession.api.LiveSession;
import com.facebook.aura.livesession.api.LiveSessions;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class HatchAudioPlayerRepository implements InterfaceC7549F2g {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public static final float DEFAULT_PLAYBACK_RATE = 1.0f;
    public static final String KEY_PLAYBACK_RATE = "playback_rate";
    public static final long POSITION_POLL_INTERVAL_MS = 100;
    public static final int SKIP_DURATION_MS = 15000;
    public static volatile HatchAudioPlayerRepository activeInstance;
    public final BLG<Float> _defaultPlaybackRate;
    public final BLG<String> _dismissedMiniPlayerSourceId;
    public final BLG<HatchAudioPlaybackState> _playbackState;
    public final BLG<Integer> _positionMs;
    public volatile Bitmap artworkBitmap;
    public final HatchAudioCache cache;
    public final Context context;
    public volatile float currentVolume;
    public final C1BN<Float> defaultPlaybackRate;
    public final C1BN<String> dismissedMiniPlayerSourceId;
    public volatile InterfaceC5661Dmq exoPlayer;
    public final AtomicLong generation;
    public volatile boolean isDucking;
    public HoC liveSessionTakeoverJob;
    public volatile HatchMediaSessionManager mediaSessionManager;
    public final C1BN<HatchAudioPlaybackState> playbackState;
    public final HatchAudioPlayerRepository$playerListener$1 playerListener;
    public final C1BN<Integer> positionMs;
    public volatile HoC positionPollJob;
    public volatile HoC prepareJob;
    public volatile E76 readyListener;
    public volatile C3UX scope;
    public final AbstractC3358CGz userSession;

    /* loaded from: classes.dex */
    public final class Companion {
        public final HatchAudioPlayerRepository getActiveInstance() {
            return HatchAudioPlayerRepository.activeInstance;
        }

        public final HatchAudioPlayerRepository getInstance(AbstractC3358CGz abstractC3358CGz, Context context) {
            AnonymousClass003.A0u(abstractC3358CGz, context);
            return (HatchAudioPlayerRepository) abstractC3358CGz.A03(HatchAudioPlayerRepository.class, new HatchAudioPlayerRepository$Companion$getInstance$1(context, abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    @DebugMetadata(c = "com.facebook.aura.audio.HatchAudioPlayerRepository$endLiveSessionThenPlay$1", f = "HatchAudioPlayerRepository.kt", l = {117}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.audio.HatchAudioPlayerRepository$endLiveSessionThenPlay$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ LiveSession $liveSession;
        public final /* synthetic */ Function0<Unit> $play;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LiveSession liveSession, Function0<Unit> function0, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$liveSession = liveSession;
            this.$play = function0;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$liveSession, this.$play, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                LiveSession liveSession = this.$liveSession;
                this.label = 1;
                obj = liveSession.endForAudioPlayback(this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            if (AnonymousClass001.A1X(obj)) {
                this.$play.invoke();
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: com.facebook.aura.audio.HatchAudioPlayerRepository$initMediaSession$1, reason: invalid class name and case insensitive filesystem */
    public final /* synthetic */ class C109701 extends C7438Evz implements Function0<Unit> {
        public C109701(Object obj) {
            super(0, obj, HatchAudioPlayerRepository.class, "resume", "resume()V", 0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((HatchAudioPlayerRepository) this.receiver).resume();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.audio.HatchAudioPlayerRepository$initMediaSession$10, reason: invalid class name */
    public final class AnonymousClass10 extends AbstractC7559F3s implements Function0<Boolean> {
        public AnonymousClass10() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            InterfaceC5661Dmq interfaceC5661Dmq = HatchAudioPlayerRepository.this.exoPlayer;
            boolean z = false;
            if (interfaceC5661Dmq != null && interfaceC5661Dmq.isPlaying()) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.facebook.aura.audio.HatchAudioPlayerRepository$initMediaSession$2, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass2 extends C7438Evz implements Function0<Unit> {
        public AnonymousClass2(Object obj) {
            super(0, obj, HatchAudioPlayerRepository.class, "pause", "pause()V", 0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((HatchAudioPlayerRepository) this.receiver).pause();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.audio.HatchAudioPlayerRepository$initMediaSession$3, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass3 extends C7438Evz implements Function0<Unit> {
        public AnonymousClass3(Object obj) {
            super(0, obj, HatchAudioPlayerRepository.class, "stop", "stop()V", 0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((HatchAudioPlayerRepository) this.receiver).stop();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.audio.HatchAudioPlayerRepository$initMediaSession$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0U<Long, Unit> {
        public AnonymousClass4() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            invoke(C3cG.A05(l));
            return Unit.INSTANCE;
        }

        public final void invoke(long j) {
            HatchAudioPlayerRepository.this.seekTo((int) j);
        }
    }

    /* renamed from: com.facebook.aura.audio.HatchAudioPlayerRepository$initMediaSession$5, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass5 extends C7438Evz implements Function0<Unit> {
        public AnonymousClass5(Object obj) {
            super(0, obj, HatchAudioPlayerRepository.class, "skipForward", "skipForward()V", 0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((HatchAudioPlayerRepository) this.receiver).skipForward();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.audio.HatchAudioPlayerRepository$initMediaSession$6, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass6 extends C7438Evz implements Function0<Unit> {
        public AnonymousClass6(Object obj) {
            super(0, obj, HatchAudioPlayerRepository.class, "skipBackward", "skipBackward()V", 0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((HatchAudioPlayerRepository) this.receiver).skipBackward();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.audio.HatchAudioPlayerRepository$initMediaSession$7, reason: invalid class name */
    /* loaded from: classes.dex */
    public final /* synthetic */ class AnonymousClass7 extends C7438Evz implements G0U<Float, Unit> {
        public AnonymousClass7(Object obj) {
            super(1, obj, HatchAudioPlayerRepository.class, "setPlaybackRate", "setPlaybackRate(F)V", 0);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(Float f) {
            invoke(AnonymousClass001.A02(f));
            return Unit.INSTANCE;
        }

        public final void invoke(float f) {
            ((HatchAudioPlayerRepository) this.receiver).setPlaybackRate(f);
        }
    }

    /* renamed from: com.facebook.aura.audio.HatchAudioPlayerRepository$initMediaSession$8, reason: invalid class name */
    public final class AnonymousClass8 extends AbstractC7559F3s implements Function0<Unit> {
        public AnonymousClass8() {
            super(0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            HatchAudioPlayerRepository.this.isDucking = true;
            InterfaceC5661Dmq interfaceC5661Dmq = HatchAudioPlayerRepository.this.exoPlayer;
            if (interfaceC5661Dmq != null) {
                interfaceC5661Dmq.AfF(HatchAudioPlayerRepository.this.currentVolume * 0.2f);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.audio.HatchAudioPlayerRepository$initMediaSession$9, reason: invalid class name */
    public final class AnonymousClass9 extends AbstractC7559F3s implements Function0<Unit> {
        public AnonymousClass9() {
            super(0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (HatchAudioPlayerRepository.this.isDucking) {
                HatchAudioPlayerRepository.this.isDucking = false;
                InterfaceC5661Dmq interfaceC5661Dmq = HatchAudioPlayerRepository.this.exoPlayer;
                if (interfaceC5661Dmq != null) {
                    interfaceC5661Dmq.AfF(HatchAudioPlayerRepository.this.currentVolume);
                }
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.audio.HatchAudioPlayerRepository$loadArtwork$1", f = "HatchAudioPlayerRepository.kt", l = {477}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.audio.HatchAudioPlayerRepository$loadArtwork$1, reason: invalid class name and case insensitive filesystem */
    public final class C109711 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ long $forGeneration;
        public final /* synthetic */ String $url;
        public int label;
        public final /* synthetic */ HatchAudioPlayerRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C109711(String str, HatchAudioPlayerRepository hatchAudioPlayerRepository, long j, HtJ<? super C109711> htJ) {
            super(2, htJ);
            this.$url = str;
            this.this$0 = hatchAudioPlayerRepository;
            this.$forGeneration = j;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C109711(this.$url, this.this$0, this.$forGeneration, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws Exception {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    AuraBitmapLoader auraBitmapLoader = AuraBitmapLoader.INSTANCE;
                    Uri uri = Uri.parse(this.$url);
                    C7384Etj.A0U(uri);
                    this.label = 1;
                    obj = auraBitmapLoader.load(uri, "HatchAudioArtwork", null, null, this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap != null && this.this$0.generation.get() == this.$forGeneration) {
                    this.this$0.artworkBitmap = bitmap;
                    HatchMediaSessionManager hatchMediaSessionManager = this.this$0.mediaSessionManager;
                    if (hatchMediaSessionManager != null) {
                        hatchMediaSessionManager.updateArtwork(bitmap);
                    }
                    this.this$0.syncMediaSession();
                }
            } catch (Exception e) {
                if (e instanceof CancellationException) {
                    throw e;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C109711) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.audio.HatchAudioPlayerRepository$play$1", f = "HatchAudioPlayerRepository.kt", l = {205}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.audio.HatchAudioPlayerRepository$play$1, reason: invalid class name and case insensitive filesystem */
    public final class C109721 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ long $currentGeneration;
        public final /* synthetic */ HatchAudioItem $item;
        public int I$0;
        public Object L$0;
        public boolean Z$0;
        public int label;
        public final /* synthetic */ HatchAudioPlayerRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C109721(HatchAudioItem hatchAudioItem, HatchAudioPlayerRepository hatchAudioPlayerRepository, long j, HtJ<? super C109721> htJ) {
            super(2, htJ);
            this.$item = hatchAudioItem;
            this.this$0 = hatchAudioPlayerRepository;
            this.$currentGeneration = j;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C109721(this.$item, this.this$0, this.$currentGeneration, htJ);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x009e A[Catch: Exception -> 0x0196, TRY_ENTER, TryCatch #0 {Exception -> 0x0196, blocks: (B:19:0x005e, B:20:0x0061, B:27:0x009e, B:29:0x00d4, B:30:0x00d8, B:31:0x012f, B:33:0x0135, B:34:0x0147, B:16:0x0047), top: B:49:0x000a }] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r38) throws java.lang.Exception {
            /*
                Method dump skipped, instructions count: 440
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.audio.HatchAudioPlayerRepository.C109721.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C109721) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.audio.HatchAudioPlayerRepository$startPositionPolling$1", f = "HatchAudioPlayerRepository.kt", l = {426}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.audio.HatchAudioPlayerRepository$startPositionPolling$1, reason: invalid class name and case insensitive filesystem */
    public final class C109731 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ long $forGeneration;
        public Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C109731(long j, HtJ<? super C109731> htJ) {
            super(2, htJ);
            this.$forGeneration = j;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchAudioPlayerRepository.this.new C109731(this.$forGeneration, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            InterfaceC5661Dmq interfaceC5661Dmq;
            HatchAudioPlaybackState value;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i != 0 && i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            while (HatchAudioPlayerRepository.this.generation.get() == this.$forGeneration && (interfaceC5661Dmq = HatchAudioPlayerRepository.this.exoPlayer) != null && (value = HatchAudioPlayerRepository.this._playbackState.getValue()) != null && value.status == AudioStatus.PLAYING) {
                HatchAudioPlayerRepository.this._positionMs.Af8(C3cG.A0R((int) interfaceC5661Dmq.getCurrentPosition()));
                HatchMediaSessionManager hatchMediaSessionManager = HatchAudioPlayerRepository.this.mediaSessionManager;
                if (hatchMediaSessionManager != null) {
                    hatchMediaSessionManager.updatePlaybackState(value, AnonymousClass001.A0F(HatchAudioPlayerRepository.this._positionMs.getValue()));
                }
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                if (C7Bq.A01(100L, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C109731) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final void endLiveSessionThenPlay(Function0<Unit> function0) {
        C7384Etj.A0Y(function0, 0);
        cancelLiveSessionTakeover();
        LiveSession liveSessionForSession = LiveSessions.INSTANCE.forSession(this.userSession);
        if (liveSessionForSession == null) {
            function0.invoke();
            return;
        }
        HatchMediaSessionManager hatchMediaSessionManager = this.mediaSessionManager;
        if (hatchMediaSessionManager != null) {
            hatchMediaSessionManager.cancelResumeOnFocusGain();
        }
        this.liveSessionTakeoverJob = AnonymousClass001.A11(new AnonymousClass1(liveSessionForSession, function0, null), this.scope);
    }

    public final void setPlaybackRate(float f) {
        HatchAudioPlaybackState value;
        persistPlaybackRate(f);
        this._defaultPlaybackRate.Af8(Float.valueOf(f));
        InterfaceC5661Dmq interfaceC5661Dmq = this.exoPlayer;
        if (interfaceC5661Dmq == null || (value = this._playbackState.getValue()) == null) {
            return;
        }
        interfaceC5661Dmq.Ae1(new C6233Dyb(f, 1.0f));
        this._playbackState.Af8(value.copy(value.item, value.status, value.durationMs, f, value.volume));
        syncMediaSession();
    }

    public final void setVolume(float f) {
        float fA03 = ATD.A03(f, 0.0f, 1.0f);
        this.currentVolume = fA03;
        HatchAudioPlaybackState value = this._playbackState.getValue();
        if (value != null) {
            InterfaceC5661Dmq interfaceC5661Dmq = this.exoPlayer;
            if (interfaceC5661Dmq != null) {
                interfaceC5661Dmq.AfF(fA03);
            }
            this._playbackState.Af8(value.copy(value.item, value.status, value.durationMs, value.playbackRate, fA03));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean canStartWhenReady() {
        return AuraAppLifecycleManager.INSTANCE.isAppInForeground() && !isLiveSessionActive() && ((AudioManager) this.context.getSystemService(AudioManager.class)).getMode() == 0;
    }

    private final C4oT getPrefs() {
        return AuraUserPrefs.INSTANCE.get(((CH0) this.userSession).A01, AuraUserPrefStore.AUDIO_PLAYER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initMediaSession(HatchAudioItem hatchAudioItem, int i) {
        HatchMediaSessionManager hatchMediaSessionManager = this.mediaSessionManager;
        if (hatchMediaSessionManager != null) {
            hatchMediaSessionManager.release();
        }
        HatchMediaSessionManager hatchMediaSessionManager2 = new HatchMediaSessionManager(this.context, new C109701(this), new AnonymousClass2(this), new AnonymousClass3(this), new AnonymousClass4(), new AnonymousClass5(this), new AnonymousClass6(this), new AnonymousClass7(this), new AnonymousClass8(), new AnonymousClass9(), new AnonymousClass10());
        hatchMediaSessionManager2.activate(hatchAudioItem, i);
        this.mediaSessionManager = hatchMediaSessionManager2;
    }

    private final void loadArtwork(HatchAudioItem hatchAudioItem, int i, long j) {
        String str = hatchAudioItem.artworkUrl;
        if (str != null) {
            AnonymousClass001.A1J(new C109711(str, this, j, null), this.scope);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logPlaybackCompleted() {
        HatchAudioItem hatchAudioItem;
        HatchAudioPlaybackState value = this._playbackState.getValue();
        if (value == null || (hatchAudioItem = value.item) == null) {
            return;
        }
        HatchInteractionLogger hatchInteractionLogger = HatchInteractionLogger.INSTANCE;
        HatchSurface hatchSurface = HatchSurface.CHAT;
        HatchSubsurface hatchSubsurface = HatchSubsurface.MESSAGE_LIST;
        HatchScreen hatchScreen = HatchScreen.MAIN_CHAT;
        HatchComponent hatchComponent = HatchComponent.AUDIO_PLAYER;
        String str = hatchAudioItem.audioType;
        hatchInteractionLogger.logPlayEnd(hatchSurface, hatchSubsurface, hatchScreen, hatchComponent, null, str != null ? AnonymousClass006.A10(HatchMetadataKey.AUDIO_TYPE.getValue(), str) : null);
    }

    private final void releasePlayer() {
        InterfaceC5661Dmq interfaceC5661Dmq = this.exoPlayer;
        if (interfaceC5661Dmq != null) {
            E76 e76 = this.readyListener;
            if (e76 != null) {
                interfaceC5661Dmq.Aar(e76);
            }
            interfaceC5661Dmq.Aar(this.playerListener);
            interfaceC5661Dmq.release();
        }
        this.readyListener = null;
        this.exoPlayer = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startForegroundPlayback(HatchAudioItem hatchAudioItem, int i, long j) {
        activeInstance = this;
        HatchAudioForegroundService.Companion.start(this.context, hatchAudioItem.title, hatchAudioItem.artist);
        loadArtwork(hatchAudioItem, i, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startPositionPolling(long j) {
        HtJ htJA13 = AnonymousClass006.A13(this.positionPollJob);
        this.positionPollJob = AnonymousClass001.A11(new C109731(j, htJA13), this.scope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopInternal() {
        this.generation.incrementAndGet();
        HoC hoC = this.prepareJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        this.prepareJob = null;
        HoC hoC2 = this.positionPollJob;
        if (hoC2 != null) {
            hoC2.A5w(null);
        }
        this.positionPollJob = null;
        HatchMediaSessionManager hatchMediaSessionManager = this.mediaSessionManager;
        if (hatchMediaSessionManager != null) {
            hatchMediaSessionManager.release();
        }
        this.mediaSessionManager = null;
        releasePlayer();
        this._playbackState.Af8(null);
        this._positionMs.Af8(BV4.A0V());
        activeInstance = null;
        HatchAudioForegroundService.Companion.stop(this.context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void syncMediaSession() {
        MediaSessionCompat$Token sessionToken;
        HatchAudioPlaybackState value = this._playbackState.getValue();
        if (value != null) {
            HatchMediaSessionManager hatchMediaSessionManager = this.mediaSessionManager;
            if (hatchMediaSessionManager != null) {
                hatchMediaSessionManager.updatePlaybackState(value, AnonymousClass001.A0F(this._positionMs.getValue()));
            }
            HatchMediaSessionManager hatchMediaSessionManager2 = this.mediaSessionManager;
            if (hatchMediaSessionManager2 == null || (sessionToken = hatchMediaSessionManager2.getSessionToken()) == null) {
                return;
            }
            HatchAudioForegroundService.Companion companion = HatchAudioForegroundService.Companion;
            Context context = this.context;
            HatchAudioItem hatchAudioItem = value.item;
            companion.updateNotification(context, hatchAudioItem.title, hatchAudioItem.artist, AnonymousClass002.A1Z(value.status, AudioStatus.PLAYING), sessionToken, this.artworkBitmap);
        }
    }

    private final void updateStatus(AudioStatus audioStatus) {
        HatchAudioPlaybackState value = this._playbackState.getValue();
        if (value != null) {
            this._playbackState.Af8(value.copy(value.item, audioStatus, value.durationMs, value.playbackRate, value.volume));
            syncMediaSession();
        }
    }

    public final void cancelLiveSessionTakeover() {
        HoC hoC = this.liveSessionTakeoverJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        this.liveSessionTakeoverJob = null;
    }

    public final void dismissMiniPlayer() {
        HatchAudioItem hatchAudioItem;
        BLG<String> blg = this._dismissedMiniPlayerSourceId;
        HatchAudioPlaybackState value = this._playbackState.getValue();
        blg.Af8((value == null || (hatchAudioItem = value.item) == null) ? null : hatchAudioItem.sourceMessageId);
    }

    public final C1BN<Float> getDefaultPlaybackRate() {
        return this.defaultPlaybackRate;
    }

    public final C1BN<String> getDismissedMiniPlayerSourceId() {
        return this.dismissedMiniPlayerSourceId;
    }

    public final C1BN<HatchAudioPlaybackState> getPlaybackState() {
        return this.playbackState;
    }

    public final C1BN<Integer> getPositionMs() {
        return this.positionMs;
    }

    public final MediaSessionCompat$Token getSessionToken() {
        HatchMediaSessionManager hatchMediaSessionManager = this.mediaSessionManager;
        if (hatchMediaSessionManager != null) {
            return hatchMediaSessionManager.getSessionToken();
        }
        return null;
    }

    public final boolean isLiveSessionActive() {
        return AnonymousClass001.A1X(LiveSessions.INSTANCE.isActive(this.userSession).getValue());
    }

    public final void pause() {
        InterfaceC5661Dmq interfaceC5661Dmq = this.exoPlayer;
        if (interfaceC5661Dmq == null || !interfaceC5661Dmq.isPlaying()) {
            return;
        }
        C6438E5q c6438E5q = (C6438E5q) interfaceC5661Dmq;
        C6438E5q.A0J(c6438E5q);
        C6438E5q.A0L(c6438E5q, 1, false);
        updateStatus(AudioStatus.PAUSED);
    }

    public final void play(HatchAudioItem hatchAudioItem) {
        HatchAudioItem hatchAudioItemCopy$default = hatchAudioItem;
        C7384Etj.A0Y(hatchAudioItemCopy$default, 0);
        if (C7BY.A0j(hatchAudioItemCopy$default.artist)) {
            hatchAudioItemCopy$default = HatchAudioItem.copy$default(hatchAudioItemCopy$default, null, null, null, null, JarvisUtils.INSTANCE.getSelectedAssistantName(this.userSession), null, null, null, null, null, 1007, null);
        }
        long jIncrementAndGet = this.generation.incrementAndGet();
        HoC hoC = this.prepareJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        HoC hoC2 = this.positionPollJob;
        if (hoC2 != null) {
            hoC2.A5w(null);
        }
        this.positionPollJob = null;
        HatchMediaSessionManager hatchMediaSessionManager = this.mediaSessionManager;
        if (hatchMediaSessionManager != null) {
            hatchMediaSessionManager.release();
        }
        this.mediaSessionManager = null;
        releasePlayer();
        activeInstance = null;
        HatchAudioForegroundService.Companion.stop(this.context);
        this.artworkBitmap = null;
        this._positionMs.Af8(0);
        this._dismissedMiniPlayerSourceId.Af8(null);
        this._playbackState.Af8(new HatchAudioPlaybackState(hatchAudioItemCopy$default, AudioStatus.LOADING, 0, getPersistedPlaybackRate(), this.currentVolume));
        this.prepareJob = AnonymousClass001.A11(new C109721(hatchAudioItemCopy$default, this, jIncrementAndGet, null), this.scope);
    }

    public final void resume() {
        HatchAudioPlaybackState value;
        InterfaceC5661Dmq interfaceC5661Dmq = this.exoPlayer;
        if (interfaceC5661Dmq == null || (value = this._playbackState.getValue()) == null || value.status != AudioStatus.PAUSED) {
            return;
        }
        if (this.mediaSessionManager == null) {
            initMediaSession(value.item, value.durationMs);
        }
        HatchMediaSessionManager hatchMediaSessionManager = this.mediaSessionManager;
        if (hatchMediaSessionManager == null || !hatchMediaSessionManager.requestAudioFocus()) {
            return;
        }
        C6438E5q c6438E5q = (C6438E5q) interfaceC5661Dmq;
        C6438E5q.A0J(c6438E5q);
        C6438E5q.A0L(c6438E5q, 1, true);
        updateStatus(AudioStatus.PLAYING);
        if (activeInstance != this) {
            startForegroundPlayback(value.item, value.durationMs, this.generation.get());
        }
        startPositionPolling(this.generation.get());
    }

    public final void seekTo(int i) {
        HatchAudioPlaybackState value;
        Dn6 dn6 = this.exoPlayer;
        if (dn6 == null || (value = this._playbackState.getValue()) == null) {
            return;
        }
        int iA04 = ATD.A04(i, 0, value.durationMs);
        AbstractC5797Dph abstractC5797Dph = (AbstractC5797Dph) dn6;
        abstractC5797Dph.A0Q(iA04, abstractC5797Dph.AEU());
        this._positionMs.Af8(Integer.valueOf(iA04));
        syncMediaSession();
    }

    public final void skipBackward() {
        seekTo(AnonymousClass001.A0F(this._positionMs.getValue()) - 15000);
    }

    public final void skipForward() {
        seekTo(AnonymousClass001.A0F(this._positionMs.getValue()) + 15000);
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.facebook.aura.audio.HatchAudioPlayerRepository$playerListener$1] */
    public HatchAudioPlayerRepository(Context context, AbstractC3358CGz abstractC3358CGz) {
        this.context = context;
        this.userSession = abstractC3358CGz;
        this.scope = C78W.A04(AuraDispatchers.main);
        this.cache = new HatchAudioCache(context, abstractC3358CGz);
        C9286GCn c9286GCnA01 = HnJ.A01(null);
        this._playbackState = c9286GCnA01;
        this.playbackState = new C3Pi(null, c9286GCnA01);
        C9286GCn c9286GCn = new C9286GCn(BV4.A0V());
        this._positionMs = c9286GCn;
        this.positionMs = new C3Pi(null, c9286GCn);
        C9286GCn c9286GCn2 = new C9286GCn(Float.valueOf(getPersistedPlaybackRate()));
        this._defaultPlaybackRate = c9286GCn2;
        this.defaultPlaybackRate = new C3Pi(null, c9286GCn2);
        C9286GCn c9286GCnA012 = HnJ.A01(null);
        this._dismissedMiniPlayerSourceId = c9286GCnA012;
        this.dismissedMiniPlayerSourceId = new C3Pi(null, c9286GCnA012);
        this.generation = BV5.A19();
        this.currentVolume = 1.0f;
        this.playerListener = new E76() { // from class: com.facebook.aura.audio.HatchAudioPlayerRepository$playerListener$1
            @Override // X.E76
            public void onPlaybackStateChanged(int i) {
                if (i == 4) {
                    this.this$0.logPlaybackCompleted();
                    this.this$0.stopInternal();
                }
            }

            public /* synthetic */ void onRenderedFirstFrame() {
            }

            @Override // X.E76
            public void onPlayerError(PlaybackException playbackException) {
                this.this$0.stopInternal();
            }

            public /* synthetic */ void onAudioAttributesChanged(DrN drN) {
            }

            @Override // X.E76
            public /* synthetic */ void onAudioSessionIdChanged(int i) {
            }

            @Override // X.E76
            public /* synthetic */ void onAvailableCommandsChanged(E1B e1b) {
            }

            @Override // X.E76
            public /* synthetic */ void onCues(DXD dxd) {
            }

            public /* synthetic */ void onDeviceInfoChanged(E7U e7u) {
            }

            @Override // X.E76
            public /* synthetic */ void onIsLoadingChanged(boolean z) {
            }

            @Override // X.E76
            public /* synthetic */ void onIsPlayingChanged(boolean z) {
            }

            public /* synthetic */ void onLoadingChanged(boolean z) {
            }

            public /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j) {
            }

            @Override // X.E76
            public /* synthetic */ void onMediaMetadataChanged(C10388Har c10388Har) {
            }

            @Override // X.E76
            public /* synthetic */ void onMetadata(C5402Dhv c5402Dhv) {
            }

            @Override // X.E76
            public /* synthetic */ void onPlaybackParametersChanged(C6233Dyb c6233Dyb) {
            }

            @Override // X.E76
            public /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
            }

            @Override // X.E76
            public /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
            }

            public /* synthetic */ void onPlaylistMetadataChanged(C10388Har c10388Har) {
            }

            @Override // X.E76
            public /* synthetic */ void onPositionDiscontinuity(int i) {
            }

            @Override // X.E76
            public /* synthetic */ void onRepeatModeChanged(int i) {
            }

            public /* synthetic */ void onSeekBackIncrementChanged(long j) {
            }

            public /* synthetic */ void onSeekForwardIncrementChanged(long j) {
            }

            public /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
            }

            @Override // X.E76
            public /* synthetic */ void onSkipSilenceEnabledChanged(boolean z) {
            }

            public /* synthetic */ void onTrackSelectionParametersChanged(C6141Dwj c6141Dwj) {
            }

            @Override // X.E76
            public /* synthetic */ void onTracksChanged(C5735DoU c5735DoU) {
            }

            @Override // X.E76
            public /* synthetic */ void onVideoSizeChanged(C6232Dya c6232Dya) {
            }

            @Override // X.E76
            public /* synthetic */ void onVolumeChanged(float f) {
            }

            public /* synthetic */ void onDeviceVolumeChanged(int i, boolean z) {
            }

            @Override // X.E76
            public /* synthetic */ void onEvents(Dn6 dn6, E7N e7n) {
            }

            @Override // X.E76
            public /* synthetic */ void onMediaItemTransition(C5704Dnm c5704Dnm, int i) {
            }

            @Override // X.E76
            public /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i) {
            }

            @Override // X.E76
            public /* synthetic */ void onPlayerStateChanged(boolean z, int i) {
            }

            @Override // X.E76
            public /* synthetic */ void onSurfaceSizeChanged(int i, int i2) {
            }

            @Override // X.E76
            public /* synthetic */ void onTimelineChanged(Timeline timeline, int i) {
            }

            @Override // X.E76
            public /* synthetic */ void onCues(List list) {
            }

            @Override // X.E76
            public /* synthetic */ void onPositionDiscontinuity(BYW byw, BYW byw2, int i) {
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getPersistedPlaybackRate() {
        return getPrefs().getFloat(KEY_PLAYBACK_RATE, 1.0f);
    }

    private final void persistPlaybackRate(float f) {
        BzK bzKA02 = BzK.A02(getPrefs());
        BzK.A05(bzKA02);
        bzKA02.A00.put(KEY_PLAYBACK_RATE, Float.valueOf(f));
        bzKA02.apply();
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        stopInternal();
        this.cache.clear();
        Hxb.A03(null, this.scope);
        this.scope = C78W.A04(AuraDispatchers.main);
    }

    public final void stop() {
        stopInternal();
    }

    public /* synthetic */ HatchAudioPlayerRepository(Context context, AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(context, abstractC3358CGz);
    }
}
