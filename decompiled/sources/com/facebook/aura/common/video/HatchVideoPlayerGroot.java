package com.facebook.aura.common.video;

import X.A3q;
import X.AbstractC3426CMt;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass006;
import X.BV4;
import X.BV5;
import X.BV6;
import X.BV7;
import X.BV8;
import X.BV9;
import X.BXX;
import X.C06H;
import X.C0881AGi;
import X.C3cH;
import X.C4904DDx;
import X.C5623Dm6;
import X.C5625Dm8;
import X.C5627DmA;
import X.C5630DmE;
import X.C5635DmJ;
import X.C5643DmX;
import X.C5645DmZ;
import X.C5646Dma;
import X.C5699Dng;
import X.C5720DoF;
import X.C5732DoR;
import X.C5806Dpq;
import X.C5812Dpw;
import X.C5847Dqg;
import X.C5875DrB;
import X.C5981DtO;
import X.C6050Dul;
import X.C6077DvH;
import X.C6079DvJ;
import X.C60O;
import X.C60P;
import X.C6125DwR;
import X.C6129DwV;
import X.C6130DwX;
import X.C7384Etj;
import X.C8ee;
import X.CFK;
import X.CXU;
import X.CXV;
import X.CXW;
import X.CXY;
import X.CXZ;
import X.DmR;
import X.DnE;
import X.Dw0;
import X.Dw4;
import X.DwW;
import X.Eu6;
import X.InterfaceC5724DoJ;
import X.InterfaceC5843DqZ;
import X.InterfaceC6052Dun;
import X.InterfaceC6119Dvy;
import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.view.TextureView;
import com.facebook.aura.common.video.HatchVideoPlayer;
import com.facebook.debug.tracer.Tracer;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class HatchVideoPlayerGroot implements HatchVideoPlayer {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public static final String TAG = "HatchVideoPlayerGroot";
    public final InterfaceC5724DoJ grootPlayer;
    public C5635DmJ loggerSDK;
    public final HatchLoggerSDKMetadataProvider loggerSDKMetadataProvider;
    public final Dw4 loggerValidationTokenProvider;
    public boolean playWhenReadyFlag;
    public final HatchVideoPlayerGrootListener playerListener;
    public HatchVideoPlayer.PlayerState playerState;
    public HatchVideoPlayer.RepeatMode repeatMode;
    public C5630DmE snaplPlayerListener;

    public final class HatchLoggerSDKMetadataProvider {
        public final String offlineVideoId;
        public C4904DDx videoSource;

        public HatchLoggerSDKMetadataProvider() {
        }

        public C5699Dng getLoggerSDKConfig() {
            return null;
        }

        public String getOfflineVideoId() {
            return this.offlineVideoId;
        }

        public /* bridge */ Eu6 getOriginalTriggerType() {
            return null;
        }

        public /* bridge */ Eu6 getPlayEventTriggerType() {
            return null;
        }

        public float getPlaybackSpeed() {
            return ((C5627DmA) HatchVideoPlayerGroot.this.grootPlayer).A07.A0Y;
        }

        public /* bridge */ C4904DDx getPlayerVideoSource() {
            return null;
        }

        public String getVideoId() {
            C4904DDx c4904DDx = this.videoSource;
            if (c4904DDx != null) {
                return c4904DDx.A0Q;
            }
            return null;
        }

        public final C4904DDx getVideoSource() {
            return this.videoSource;
        }

        public BXX getVideoType() {
            C4904DDx c4904DDx = this.videoSource;
            if (c4904DDx != null) {
                return c4904DDx.A0A;
            }
            return null;
        }

        public Integer getViewHeight() {
            return null;
        }

        public Integer getViewWidth() {
            return null;
        }

        public boolean isPlayerPrepared() {
            return AnonymousClass002.A1Z(HatchVideoPlayerGroot.this.playerState, HatchVideoPlayer.PlayerState.READY);
        }

        public /* bridge */ Boolean isSurfaceView() {
            return null;
        }

        public final void setVideoSource(C4904DDx c4904DDx) {
            this.videoSource = c4904DDx;
        }
    }

    public HatchVideoPlayerGroot(Context context) {
        C7384Etj.A0Y(context, 0);
        this.loggerSDKMetadataProvider = new HatchLoggerSDKMetadataProvider();
        this.loggerValidationTokenProvider = new Dw4();
        this.playerListener = new HatchVideoPlayerGrootListener(hashCode());
        this.grootPlayer = createGrootPlayer(context);
        this.repeatMode = HatchVideoPlayer.RepeatMode.ONE;
        this.playerState = HatchVideoPlayer.PlayerState.IDLE;
        int iHashCode = hashCode();
        BV7.A17(iHashCode, " created");
        addListener(new HatchVideoPlayer.Listener(iHashCode, this) { // from class: com.facebook.aura.common.video.HatchVideoPlayerGroot.1
            public final int innerPlayerId;
            public final /* synthetic */ HatchVideoPlayerGroot this$0;

            @Override // com.facebook.aura.common.video.HatchVideoPlayer.Listener
            public /* bridge */ void onInitialTextureUpdate() {
            }

            @Override // com.facebook.aura.common.video.HatchVideoPlayer.Listener
            public void onPlaybackStateChanged(HatchVideoPlayer.PlayerState playerState) {
                C7384Etj.A0Y(playerState, 0);
                int i = this.innerPlayerId;
                StringBuilder sbA0w = C60O.A0w();
                sbA0w.append(i);
                CFK.A05(HatchVideoPlayerGroot.TAG, AnonymousClass006.A0y(playerState, " onPlaybackStateChanged: ", sbA0w));
                HatchVideoPlayerGroot hatchVideoPlayerGroot = this.this$0;
                hatchVideoPlayerGroot.playerState = playerState;
                if (playerState == HatchVideoPlayer.PlayerState.READY && hatchVideoPlayerGroot.getPlayWhenReadyFlag() && !hatchVideoPlayerGroot.isPlaying()) {
                    C5627DmA.A02((C5627DmA) this.this$0.grootPlayer);
                }
            }

            @Override // com.facebook.aura.common.video.HatchVideoPlayer.Listener
            public /* bridge */ void onRenderedFirstFrame() {
            }

            {
                this.this$0 = this;
                this.innerPlayerId = iHashCode;
            }

            public final int getInnerPlayerId() {
                return this.innerPlayerId;
            }

            @Override // com.facebook.aura.common.video.HatchVideoPlayer.Listener
            public void onVideoSizeChanged(int i, int i2) {
                int i3 = this.innerPlayerId;
                StringBuilder sbA0w = C60O.A0w();
                sbA0w.append(i3);
                sbA0w.append(" onVideoSizeChanged: ");
                sbA0w.append(i);
                CFK.A05(HatchVideoPlayerGroot.TAG, C60P.A1O(" x ", sbA0w, i2));
            }

            @Override // com.facebook.aura.common.video.HatchVideoPlayer.Listener
            public /* bridge */ void onIsPlayingChanged(boolean z) {
            }

            @Override // com.facebook.aura.common.video.HatchVideoPlayer.Listener
            public /* bridge */ void onPlayerError(Exception exc) {
            }
        });
    }

    @Override // com.facebook.aura.common.video.HatchVideoPlayer
    public void addListener(HatchVideoPlayer.Listener listener) {
        C7384Etj.A0Y(listener, 0);
        BV7.A17(hashCode(), " addListener");
        this.playerListener.addListener(listener);
    }

    @Override // com.facebook.aura.common.video.HatchVideoPlayer
    public void doWhenIdleOrEnded(final Function0<Unit> function0) {
        C7384Etj.A0Y(function0, 0);
        HatchVideoPlayer.PlayerState playbackState = getPlaybackState();
        if (playbackState == HatchVideoPlayer.PlayerState.IDLE || playbackState == HatchVideoPlayer.PlayerState.ENDED) {
            function0.invoke();
        } else {
            addListener(new HatchVideoPlayer.Listener() { // from class: com.facebook.aura.common.video.HatchVideoPlayerGroot.doWhenIdleOrEnded.1
                @Override // com.facebook.aura.common.video.HatchVideoPlayer.Listener
                public /* bridge */ void onInitialTextureUpdate() {
                }

                @Override // com.facebook.aura.common.video.HatchVideoPlayer.Listener
                public void onPlaybackStateChanged(HatchVideoPlayer.PlayerState playerState) {
                    C7384Etj.A0Y(playerState, 0);
                    if (playerState == HatchVideoPlayer.PlayerState.IDLE || playerState == HatchVideoPlayer.PlayerState.ENDED) {
                        HatchVideoPlayerGroot.this.removeListener(this);
                        function0.invoke();
                    }
                }

                @Override // com.facebook.aura.common.video.HatchVideoPlayer.Listener
                public /* bridge */ void onRenderedFirstFrame() {
                }

                @Override // com.facebook.aura.common.video.HatchVideoPlayer.Listener
                public /* bridge */ void onIsPlayingChanged(boolean z) {
                }

                @Override // com.facebook.aura.common.video.HatchVideoPlayer.Listener
                public /* bridge */ void onPlayerError(Exception exc) {
                }

                @Override // com.facebook.aura.common.video.HatchVideoPlayer.Listener
                public /* bridge */ void onVideoSizeChanged(int i, int i2) {
                }
            });
        }
    }

    @Override // com.facebook.aura.common.video.HatchVideoPlayer
    public void doWhenReady(final Function0<Unit> function0) {
        C7384Etj.A0Y(function0, 0);
        if (getPlaybackState() == HatchVideoPlayer.PlayerState.READY) {
            function0.invoke();
        } else {
            addListener(new HatchVideoPlayer.Listener() { // from class: com.facebook.aura.common.video.HatchVideoPlayerGroot.doWhenReady.1
                @Override // com.facebook.aura.common.video.HatchVideoPlayer.Listener
                public /* bridge */ void onInitialTextureUpdate() {
                }

                @Override // com.facebook.aura.common.video.HatchVideoPlayer.Listener
                public void onPlaybackStateChanged(HatchVideoPlayer.PlayerState playerState) {
                    C7384Etj.A0Y(playerState, 0);
                    if (playerState == HatchVideoPlayer.PlayerState.READY) {
                        HatchVideoPlayerGroot.this.removeListener(this);
                        function0.invoke();
                    }
                }

                @Override // com.facebook.aura.common.video.HatchVideoPlayer.Listener
                public /* bridge */ void onRenderedFirstFrame() {
                }

                @Override // com.facebook.aura.common.video.HatchVideoPlayer.Listener
                public /* bridge */ void onIsPlayingChanged(boolean z) {
                }

                @Override // com.facebook.aura.common.video.HatchVideoPlayer.Listener
                public /* bridge */ void onPlayerError(Exception exc) {
                }

                @Override // com.facebook.aura.common.video.HatchVideoPlayer.Listener
                public /* bridge */ void onVideoSizeChanged(int i, int i2) {
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x004b  */
    @Override // com.facebook.aura.common.video.HatchVideoPlayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void prepareCached(android.net.Uri r22, java.lang.String r23, java.lang.String r24, android.view.ViewGroup r25, java.lang.String r26, X.EnumC2374BWi r27, long r28, long r30, java.lang.String r32, java.lang.String r33) {
        /*
            Method dump skipped, instructions count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.common.video.HatchVideoPlayerGroot.prepareCached(android.net.Uri, java.lang.String, java.lang.String, android.view.ViewGroup, java.lang.String, X.BWi, long, long, java.lang.String, java.lang.String):void");
    }

    @Override // com.facebook.aura.common.video.HatchVideoPlayer
    public void removeListener(HatchVideoPlayer.Listener listener) {
        C7384Etj.A0Y(listener, 0);
        BV7.A17(hashCode(), " removeListener");
        this.playerListener.removeListener(listener);
    }

    @Override // com.facebook.aura.common.video.HatchVideoPlayer
    public void setRepeatMode(HatchVideoPlayer.RepeatMode repeatMode) {
        C7384Etj.A0Y(repeatMode, 0);
        CFK.A05(TAG, AnonymousClass006.A0y(repeatMode, " setRepeatMode: ", BV8.A12(this)));
        this.repeatMode = repeatMode;
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    private final InterfaceC5724DoJ createGrootPlayer(Context context) {
        boolean z;
        HatchVideoPrefetcher companion = HatchVideoPrefetcher.Companion.getInstance();
        C5847Dqg c5847Dqg = new C5847Dqg();
        c5847Dqg.A00 = C0881AGi.A00;
        c5847Dqg.A01 = A3q.A00;
        c5847Dqg.A02 = true;
        HatchVideoPlayerGrootListener hatchVideoPlayerGrootListener = this.playerListener;
        C7384Etj.A0Y(hatchVideoPlayerGrootListener, 0);
        C5806Dpq c5806Dpq = new C5806Dpq(c5847Dqg, new C5812Dpw((InterfaceC5843DqZ[]) Arrays.copyOf(new InterfaceC5843DqZ[]{new C5732DoR(hatchVideoPlayerGrootListener), null}, 2)));
        companion.ensureConfigured(context);
        HeroPlayerSetting heroPlayerSetting = HatchVideoPlayerGrootHelper.INSTANCE.getHeroPlayerSetting();
        C7384Etj.A0Y(context, 0);
        HatchVideoPlayerGrootListener hatchVideoPlayerGrootListener2 = this.playerListener;
        C7384Etj.A0Y(hatchVideoPlayerGrootListener2, 0);
        Looper looper = BV5.A0C("HeroPlayerInternalThread", -2).getLooper();
        if (looper == null) {
            throw BV4.A0U();
        }
        C6079DvJ c6079DvJ = new C6079DvJ();
        C6125DwR c6125DwR = new C6125DwR();
        C6129DwV c6129DwV = new C6129DwV();
        DwW dwW = new DwW();
        Handler handlerA02 = C60O.A02();
        C6077DvH c6077DvH = new C6077DvH();
        Object systemService = context.getSystemService("audio");
        C7384Etj.A0Z(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        C5981DtO c5981DtO = new C5981DtO((AudioManager) systemService);
        InterfaceC6119Dvy interfaceC6119Dvy = InterfaceC6119Dvy.A00;
        Dw0 dw0 = Dw0.A00;
        C6130DwX c6130DwX = new C6130DwX();
        InterfaceC6052Dun interfaceC6052Dun = C6050Dul.A00;
        CXU cxu = CXV.A04;
        synchronized (cxu) {
            z = CXV.A03;
        }
        if (!z) {
            cxu.A01(context, new CXW(null, HeroPlayerSetting.A01, new CXY(), BV4.A0u(), true));
        }
        C5627DmA c5627DmA = new C5627DmA(context, handlerA02, looper, hatchVideoPlayerGrootListener2, c5981DtO, interfaceC6119Dvy, dw0, interfaceC6052Dun, dwW, c6077DvH, c6079DvJ, new C5875DrB(new CXZ(cxu.A00())), cxu.A00().A00.A01, c6125DwR, c6129DwV, c6130DwX, c5806Dpq);
        C5699Dng c5699Dng = heroPlayerSetting.loggerSDKConfig;
        C8ee c8eeA0I = C3cH.A0I();
        HatchVideoPlayerBackgroundEventProcessor hatchVideoPlayerBackgroundEventProcessor = new HatchVideoPlayerBackgroundEventProcessor();
        C7384Etj.A0X(c5699Dng);
        C5630DmE c5630DmE = new C5630DmE(c8eeA0I, hatchVideoPlayerBackgroundEventProcessor, c5627DmA, new C5646Dma(hatchVideoPlayerBackgroundEventProcessor, c5699Dng), c5699Dng);
        this.snaplPlayerListener = c5630DmE;
        c5627DmA.A17 = c5630DmE;
        C5625Dm8 c5625Dm8 = c5627DmA.A07;
        synchronized (c5625Dm8.A0M) {
            c5625Dm8.A0e = c5630DmE;
        }
        C5630DmE c5630DmE2 = this.snaplPlayerListener;
        if (c5630DmE2 != null) {
            c5627DmA.A07.A0I.A00.add(c5630DmE2);
        }
        return c5627DmA;
    }

    @Override // com.facebook.aura.common.video.HatchVideoPlayer
    public long getCurrentPosition() {
        return BV7.A0U((C5627DmA) this.grootPlayer);
    }

    @Override // com.facebook.aura.common.video.HatchVideoPlayer
    public long getDuration() {
        return this.grootPlayer.AEt();
    }

    @Override // com.facebook.aura.common.video.HatchVideoPlayer
    public boolean getPlayWhenReadyFlag() {
        return this.playWhenReadyFlag;
    }

    @Override // com.facebook.aura.common.video.HatchVideoPlayer
    public HatchVideoPlayer.PlayerState getPlaybackState() {
        return this.playerState;
    }

    @Override // com.facebook.aura.common.video.HatchVideoPlayer
    public HatchVideoPlayer.RepeatMode getRepeatMode() {
        return this.repeatMode;
    }

    @Override // com.facebook.aura.common.video.HatchVideoPlayer
    public boolean isEnded() {
        return AnonymousClass002.A1Q((int) ((C5627DmA) this.grootPlayer).A07.A0D(), this.grootPlayer.AEt());
    }

    @Override // com.facebook.aura.common.video.HatchVideoPlayer
    public boolean isPlaying() {
        return this.grootPlayer.isPlaying();
    }

    @Override // com.facebook.aura.common.video.HatchVideoPlayer
    public boolean isReady() {
        return AnonymousClass002.A1Z(this.playerState, HatchVideoPlayer.PlayerState.READY);
    }

    @Override // com.facebook.aura.common.video.HatchVideoPlayer
    public boolean isSeekable() {
        C5623Dm6 c5623Dm6A0i = BV7.A0i(((C5627DmA) this.grootPlayer).A07);
        return c5623Dm6A0i != null && c5623Dm6A0i.A0p;
    }

    private final int getLogId() {
        return hashCode();
    }

    @Override // com.facebook.aura.common.video.HatchVideoPlayer
    public void cleanUp() {
        C5645DmZ c5645DmZ;
        C4904DDx c4904DDx;
        String str;
        BV7.A17(hashCode(), " cleanUp");
        C5630DmE c5630DmE = this.snaplPlayerListener;
        if (c5630DmE != null) {
            ((C5627DmA) this.grootPlayer).A07.A0I.A00.remove(c5630DmE);
        }
        C5635DmJ c5635DmJ = this.loggerSDK;
        if (c5635DmJ != null) {
            c5635DmJ.A00();
        }
        C5627DmA c5627DmA = (C5627DmA) this.grootPlayer;
        BV9.A06(c5627DmA);
        C5627DmA.A01(c5627DmA);
        C5720DoF c5720DoF = c5627DmA.A04;
        if (c5720DoF != null) {
            c5720DoF.A00();
        }
        C5643DmX c5643DmX = c5627DmA.A15;
        if (c5643DmX != null) {
            AbstractC3426CMt.A03("GrootPlayerLogger", "PlayerId %d disableHeartbeat for vid %s ", Long.valueOf(((C5627DmA) c5643DmX.A01).A07.A0a), c5643DmX.A03);
            c5643DmX.A04.set(true);
        }
        HeroPlayerSetting heroPlayerSetting = c5627DmA.A0Q;
        if (heroPlayerSetting.cancelPrefetchOnPlayerRelease) {
            C5625Dm8 c5625Dm8 = c5627DmA.A07;
            DmR dmR = c5625Dm8.A0H.A07;
            if (dmR != null && (c4904DDx = dmR.A03) != null && (str = c4904DDx.A0Q) != null) {
                c5625Dm8.A04.A00().A07(str, "CANCELED_ON_PLAYER_RELEASE", true);
            }
        }
        if (c5627DmA.isPlaying() || c5627DmA.A0Y.get()) {
            AbstractC3426CMt.A02("GrootPlayer", "Calling release while state is playing");
        }
        C5625Dm8 c5625Dm82 = c5627DmA.A07;
        C5625Dm8.A0A(c5625Dm82, "release", new Object[0]);
        BV6.A0z(c5625Dm82.A0F, c5625Dm82, true, 8);
        C5627DmA.A07(c5627DmA, true);
        c5627DmA.A0c.set(false);
        c5627DmA.A0r.set(Float.valueOf(0.0f));
        if (c5627DmA.A0Z.get() && (c5645DmZ = c5627DmA.A16) != null) {
            c5645DmZ.A08.set(1);
            DnE dnE = c5645DmZ.A03;
            if (dnE != null) {
                dnE.A00();
            }
            C5645DmZ.A00(c5645DmZ);
        }
        c5627DmA.A0V.clear();
        c5627DmA.A0U.clear();
        if (heroPlayerSetting.gen.should_clear_player_view_on_release) {
            c5627DmA.A02 = null;
        }
        C5625Dm8 c5625Dm83 = c5627DmA.A07;
        BV6.A0z(c5625Dm83.A0F, c5625Dm83, null, 60);
        C5806Dpq c5806Dpq = c5627DmA.A18;
        Tracer.A01("GrootBaseTextureViewControllerImpl.onReleaseRequest");
        try {
            if (c5806Dpq.A02.A02) {
                TextureView textureView = c5806Dpq.A00;
                if (textureView != null) {
                    textureView.setSurfaceTextureListener(null);
                }
                c5806Dpq.A01 = null;
            }
            Tracer.A00();
            ((C5627DmA) this.grootPlayer).A02 = null;
        } catch (Throwable th) {
            Tracer.A00();
            throw th;
        }
    }

    @Override // com.facebook.aura.common.video.HatchVideoPlayer
    public void clearMediaItems() {
        BV7.A17(hashCode(), " clearMediaItems");
        C5627DmA c5627DmA = (C5627DmA) this.grootPlayer;
        c5627DmA.A0f.incrementAndGet();
        c5627DmA.A0F.removeCallbacks(c5627DmA.A0T);
        BV9.A06(c5627DmA);
        C5627DmA.A01(c5627DmA);
        C5625Dm8 c5625Dm8 = c5627DmA.A07;
        C5625Dm8.A0A(c5625Dm8, "reset", new Object[0]);
        C5625Dm8.A0B(c5625Dm8.A0F.obtainMessage(14), c5625Dm8);
        HatchVideoPlayer.PlayerState playerState = HatchVideoPlayer.PlayerState.IDLE;
        this.playerState = playerState;
        this.playerListener.notifyPlaybackStateChanged(playerState);
        this.playerListener.notifyIsPlayingChanged(false);
    }

    @Override // com.facebook.aura.common.video.HatchVideoPlayer
    public void disableAudio() {
        C5645DmZ c5645DmZ;
        BV7.A17(hashCode(), " disableAudio");
        C5627DmA c5627DmA = (C5627DmA) this.grootPlayer;
        if (c5627DmA.A0Z.get() && (c5645DmZ = c5627DmA.A16) != null) {
            C5645DmZ.A00(c5645DmZ);
        }
        c5627DmA.A0r.set(Float.valueOf(0.0f));
        c5627DmA.A07.A0G("HatchVideoPlayerGroot.disableAudio", "unknown", "unknown", 0.0f);
    }

    @Override // com.facebook.aura.common.video.HatchVideoPlayer
    public void enableAudio() {
        BV7.A17(hashCode(), " enableAudio");
        C5627DmA c5627DmA = (C5627DmA) this.grootPlayer;
        float fA00 = 1.0f;
        if (c5627DmA.A0Y.get() && c5627DmA.A0Z.get()) {
            fA00 = C5627DmA.A00(c5627DmA, 1.0f);
        }
        c5627DmA.A0r.set(Float.valueOf(fA00));
        c5627DmA.A07.A0G("HatchVideoPlayerGroot.enableAudio", "unknown", "unknown", fA00);
    }

    @Override // com.facebook.aura.common.video.HatchVideoPlayer
    public void pause() {
        BV7.A17(hashCode(), " pause");
        if (isPlaying()) {
            this.grootPlayer.AXg(null);
        }
        setPlayWhenReadyFlag(false);
    }

    @Override // com.facebook.aura.common.video.HatchVideoPlayer
    public void play() {
        BV7.A17(hashCode(), " play");
        if (isPlaying()) {
            return;
        }
        C5627DmA.A02((C5627DmA) this.grootPlayer);
    }

    @Override // com.facebook.aura.common.video.HatchVideoPlayer
    public void prepare() {
        BV7.A17(hashCode(), " prepare no args. Not supported by Groot implementation");
    }

    @Override // com.facebook.aura.common.video.HatchVideoPlayer
    public void resume() {
        BV7.A17(hashCode(), " resume");
        if (isPlaying()) {
            return;
        }
        C5627DmA.A02((C5627DmA) this.grootPlayer);
    }

    @Override // com.facebook.aura.common.video.HatchVideoPlayer
    public void seekTo(long j) {
        CFK.A05(TAG, BV7.A0z(" seekTo ", BV8.A12(this), j));
        this.grootPlayer.AcN((int) j, "");
    }

    @Override // com.facebook.aura.common.video.HatchVideoPlayer
    public void setPlayWhenReady(boolean z) {
        CFK.A05(TAG, C60P.A1P(" setPlayWhenReady: ", BV8.A12(this), z));
        setPlayWhenReadyFlag(z);
    }

    @Override // com.facebook.aura.common.video.HatchVideoPlayer
    public void setPlayWhenReadyFlag(boolean z) {
        CFK.A00(BV5.A0X(this), Boolean.valueOf(z), Boolean.valueOf(isPlaying()), this.playerState, TAG, "%s playWhenReady: %s isPlaying: %s playerState: %s");
        if (z) {
            if (this.playerState == HatchVideoPlayer.PlayerState.READY && !isPlaying()) {
                StringBuilder sbA12 = BV8.A12(this);
                sbA12.append(" playWhenReady: ");
                sbA12.append(z);
                CFK.A05(TAG, AnonymousClass001.A0v(", play()", sbA12));
                C5627DmA.A02((C5627DmA) this.grootPlayer);
            }
        } else if (isPlaying()) {
            StringBuilder sbA122 = BV8.A12(this);
            sbA122.append(" playWhenReady: ");
            sbA122.append(z);
            CFK.A05(TAG, AnonymousClass001.A0v(", pause()", sbA122));
            this.grootPlayer.AXg(null);
        }
        this.playWhenReadyFlag = z;
    }

    @Override // com.facebook.aura.common.video.HatchVideoPlayer
    public void setVideoScalingMode(HatchVideoPlayer.VideoScalingMode videoScalingMode) {
    }

    @Override // com.facebook.aura.common.video.HatchVideoPlayer
    public void stop() {
        BV7.A17(hashCode(), " stop");
        if (isPlaying()) {
            this.grootPlayer.AXg(null);
        }
        setPlayWhenReadyFlag(false);
        this.grootPlayer.AcN(0, "");
    }
}
