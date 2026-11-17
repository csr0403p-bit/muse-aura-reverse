package com.facebook.aura.common.video;

import X.C3cG;
import X.C7384Etj;
import X.C8j3;
import X.EnumC2374BWi;
import X.Ey9;
import android.net.Uri;
import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public interface HatchVideoPlayer {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final long POSITION_NOT_SET = -1;

    /* renamed from: com.facebook.aura.common.video.HatchVideoPlayer$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        public static /* synthetic */ void prepareCached$default(HatchVideoPlayer hatchVideoPlayer, Uri uri, String str, String str2, ViewGroup viewGroup, String str3, EnumC2374BWi enumC2374BWi, long j, long j2, String str4, String str5, int i, Object obj) {
            if (obj != null) {
                throw C8j3.A18("Super calls with default arguments not supported in this target, function: prepareCached");
            }
            if ((i & 64) != 0) {
                j = -1;
            }
            if ((i & 128) != 0) {
                j2 = -1;
            }
            hatchVideoPlayer.prepareCached(uri, str, str2, viewGroup, str3, enumC2374BWi, j, j2, str4, str5);
        }
    }

    public final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final long POSITION_NOT_SET = -1;
    }

    /* loaded from: classes5.dex */
    public interface Listener {
        void onInitialTextureUpdate();

        void onIsPlayingChanged(boolean z);

        void onPlaybackStateChanged(PlayerState playerState);

        void onPlayerError(Exception exc);

        void onRenderedFirstFrame();

        void onVideoSizeChanged(int i, int i2);

        /* renamed from: com.facebook.aura.common.video.HatchVideoPlayer$Listener$-CC, reason: invalid class name */
        /* loaded from: classes.dex */
        public abstract /* synthetic */ class CC {
            public static void $default$onIsPlayingChanged(Listener listener, boolean z) {
            }

            public static void $default$onPlaybackStateChanged(Listener listener, PlayerState playerState) {
            }

            public static void $default$onPlayerError(Listener listener, Exception exc) {
            }

            public static /* synthetic */ void access$onIsPlayingChanged$jd(Listener listener, boolean z) {
            }

            public static /* synthetic */ void access$onPlaybackStateChanged$jd(Listener listener, PlayerState playerState) {
            }

            public static /* synthetic */ void access$onPlayerError$jd(Listener listener, Exception exc) {
            }

            public static void $default$onInitialTextureUpdate(Listener listener) {
            }

            public static void $default$onRenderedFirstFrame(Listener listener) {
            }

            public static void $default$onVideoSizeChanged(Listener listener, int i, int i2) {
            }

            public static /* synthetic */ void access$onInitialTextureUpdate$jd(Listener listener) {
            }

            public static /* synthetic */ void access$onRenderedFirstFrame$jd(Listener listener) {
            }

            public static /* synthetic */ void access$onVideoSizeChanged$jd(Listener listener, int i, int i2) {
            }
        }

        /* loaded from: classes.dex */
        public abstract class DefaultImpls {
            @Deprecated
            public static void onPlaybackStateChanged(Listener listener, PlayerState playerState) {
                C7384Etj.A0Y(playerState, 1);
            }

            @Deprecated
            public static void onPlayerError(Listener listener, Exception exc) {
                C7384Etj.A0Y(exc, 1);
            }

            @Deprecated
            public static void onIsPlayingChanged(Listener listener, boolean z) {
            }

            @Deprecated
            public static void onInitialTextureUpdate(Listener listener) {
            }

            @Deprecated
            public static void onRenderedFirstFrame(Listener listener) {
            }

            @Deprecated
            public static void onVideoSizeChanged(Listener listener, int i, int i2) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes5.dex */
    public final class PlayerState {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ PlayerState[] $VALUES;
        public static final PlayerState BUFFERING;
        public static final PlayerState ENDED;
        public static final PlayerState IDLE;
        public static final PlayerState READY;

        static {
            PlayerState playerState = new PlayerState("IDLE", 0);
            IDLE = playerState;
            PlayerState playerState2 = new PlayerState("BUFFERING", 1);
            BUFFERING = playerState2;
            PlayerState playerState3 = new PlayerState("READY", 2);
            READY = playerState3;
            PlayerState playerState4 = new PlayerState("ENDED", 3);
            ENDED = playerState4;
            PlayerState[] playerStateArr = {playerState, playerState2, playerState3, playerState4};
            $VALUES = playerStateArr;
            $ENTRIES = C3cG.A0w(playerStateArr);
        }

        public static Ey9<PlayerState> getEntries() {
            return $ENTRIES;
        }

        public static PlayerState valueOf(String str) {
            return (PlayerState) Enum.valueOf(PlayerState.class, str);
        }

        public static PlayerState[] values() {
            return (PlayerState[]) $VALUES.clone();
        }

        public PlayerState(String str, int i) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes5.dex */
    public final class RepeatMode {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ RepeatMode[] $VALUES;
        public static final RepeatMode ALL;
        public static final RepeatMode OFF;
        public static final RepeatMode ONE;

        static {
            RepeatMode repeatMode = new RepeatMode("OFF", 0);
            OFF = repeatMode;
            RepeatMode repeatMode2 = new RepeatMode("ONE", 1);
            ONE = repeatMode2;
            RepeatMode repeatMode3 = new RepeatMode("ALL", 2);
            ALL = repeatMode3;
            RepeatMode[] repeatModeArr = {repeatMode, repeatMode2, repeatMode3};
            $VALUES = repeatModeArr;
            $ENTRIES = C3cG.A0w(repeatModeArr);
        }

        public static Ey9<RepeatMode> getEntries() {
            return $ENTRIES;
        }

        public static RepeatMode valueOf(String str) {
            return (RepeatMode) Enum.valueOf(RepeatMode.class, str);
        }

        public static RepeatMode[] values() {
            return (RepeatMode[]) $VALUES.clone();
        }

        public RepeatMode(String str, int i) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public final class ResizeMode {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ ResizeMode[] $VALUES;
        public static final ResizeMode FILL;
        public static final ResizeMode FIT;
        public static final ResizeMode FIXED_HEIGHT;
        public static final ResizeMode FIXED_WIDTH;
        public static final ResizeMode ZOOM;

        static {
            ResizeMode resizeMode = new ResizeMode("ZOOM", 0);
            ZOOM = resizeMode;
            ResizeMode resizeMode2 = new ResizeMode("FILL", 1);
            FILL = resizeMode2;
            ResizeMode resizeMode3 = new ResizeMode("FIT", 2);
            FIT = resizeMode3;
            ResizeMode resizeMode4 = new ResizeMode("FIXED_WIDTH", 3);
            FIXED_WIDTH = resizeMode4;
            ResizeMode resizeMode5 = new ResizeMode("FIXED_HEIGHT", 4);
            FIXED_HEIGHT = resizeMode5;
            ResizeMode[] resizeModeArr = {resizeMode, resizeMode2, resizeMode3, resizeMode4, resizeMode5};
            $VALUES = resizeModeArr;
            $ENTRIES = C3cG.A0w(resizeModeArr);
        }

        public static Ey9<ResizeMode> getEntries() {
            return $ENTRIES;
        }

        public static ResizeMode valueOf(String str) {
            return (ResizeMode) Enum.valueOf(ResizeMode.class, str);
        }

        public static ResizeMode[] values() {
            return (ResizeMode[]) $VALUES.clone();
        }

        public ResizeMode(String str, int i) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class VideoScalingMode {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ VideoScalingMode[] $VALUES;
        public static final VideoScalingMode SCALE_TO_FIT;
        public static final VideoScalingMode SCALE_TO_FIT_WITH_CROPPING;

        static {
            VideoScalingMode videoScalingMode = new VideoScalingMode("SCALE_TO_FIT", 0);
            SCALE_TO_FIT = videoScalingMode;
            VideoScalingMode videoScalingMode2 = new VideoScalingMode("SCALE_TO_FIT_WITH_CROPPING", 1);
            SCALE_TO_FIT_WITH_CROPPING = videoScalingMode2;
            VideoScalingMode[] videoScalingModeArr = {videoScalingMode, videoScalingMode2};
            $VALUES = videoScalingModeArr;
            $ENTRIES = C3cG.A0w(videoScalingModeArr);
        }

        public static Ey9<VideoScalingMode> getEntries() {
            return $ENTRIES;
        }

        public static VideoScalingMode valueOf(String str) {
            return (VideoScalingMode) Enum.valueOf(VideoScalingMode.class, str);
        }

        public static VideoScalingMode[] values() {
            return (VideoScalingMode[]) $VALUES.clone();
        }

        public VideoScalingMode(String str, int i) {
        }
    }

    void addListener(Listener listener);

    void cleanUp();

    void clearMediaItems();

    void disableAudio();

    void doWhenIdleOrEnded(Function0<Unit> function0);

    void doWhenReady(Function0<Unit> function0);

    void enableAudio();

    long getCurrentPosition();

    long getDuration();

    boolean getPlayWhenReadyFlag();

    PlayerState getPlaybackState();

    RepeatMode getRepeatMode();

    boolean isEnded();

    boolean isPlaying();

    boolean isReady();

    boolean isSeekable();

    void pause();

    void play();

    void prepare();

    void prepareCached(Uri uri, String str, String str2, ViewGroup viewGroup, String str3, EnumC2374BWi enumC2374BWi, long j, long j2, String str4, String str5);

    void removeListener(Listener listener);

    void resume();

    void seekTo(long j);

    void setPlayWhenReady(boolean z);

    void setPlayWhenReadyFlag(boolean z);

    void setRepeatMode(RepeatMode repeatMode);

    void setVideoScalingMode(VideoScalingMode videoScalingMode);

    void stop();

    public abstract class DefaultImpls {
    }
}
