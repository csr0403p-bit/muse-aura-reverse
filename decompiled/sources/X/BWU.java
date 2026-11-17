package X;

import com.facebook.aura.conversation.offline.HatchPersistedMessageJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class BWU {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ BWU[] A01;
    public static final BWU A02;
    public static final BWU A03;
    public static final BWU A04;
    public static final BWU A05;
    public static final BWU A06;
    public static final BWU A07;
    public static final BWU A08;
    public static final BWU A09;
    public static final BWU A0A;
    public static final BWU A0B;
    public static final BWU A0C;
    public static final BWU A0D;
    public static final BWU A0E;
    public static final BWU A0F;
    public static final BWU A0G;
    public static final BWU A0H;
    public static final BWU A0I;
    public static final BWU A0J;

    static {
        BWU bwu = new BWU("MAX_WATERMARK", 0);
        A0D = bwu;
        BWU bwu2 = new BWU("RENDER_INTERVAL", 1);
        A0I = bwu2;
        BWU bwu3 = new BWU("AVOID_PRE_LOAD", 2);
        BWU bwu4 = new BWU("COVER_IMAGE_MULTIPLIER", 3);
        BWU bwu5 = new BWU("DISK_SPACE_THRESHOLD_BYTES", 4);
        A0A = bwu5;
        BWU bwu6 = new BWU("CACHE_SIZE_IN_BYTES", 5);
        A04 = bwu6;
        BWU bwu7 = new BWU("DAV1D_THREADS", 6);
        A07 = bwu7;
        BWU bwu8 = new BWU("DAV1D_LATENCY_MODE", 7);
        A06 = bwu8;
        BWU bwu9 = new BWU("DAV1D_INITIAL_BUFFER_SIZE", 8);
        A05 = bwu9;
        BWU bwu10 = new BWU("PLAYER_POOL_SIZE", 9);
        A0F = bwu10;
        BWU bwu11 = new BWU("AUTO_PLAY_DURATION", 10);
        BWU bwu12 = new BWU("HERO_THREAD_PRIORITY", 11);
        A0C = bwu12;
        BWU bwu13 = new BWU("PREFETCH_THREAD_PRIORITY", 12);
        A0G = bwu13;
        BWU bwu14 = new BWU("SCROLL_AWARE_AUTOPLAY", 13);
        BWU bwu15 = new BWU("AUDIO_SINK_MIN_DURATION_US", 14);
        A02 = bwu15;
        BWU bwu16 = new BWU("AUDIO_SINK_PCM_FACTOR", 15);
        A03 = bwu16;
        BWU bwu17 = new BWU("BG_HERO_CLEAN_UP", 16);
        BWU bwu18 = new BWU("EXO_THREAD_PRIORITY", 17);
        A0B = bwu18;
        BWU bwu19 = new BWU("SCROLL_AWARE_PREFETCH", 18);
        BWU bwu20 = new BWU("SCROLL_AWARE_PRELOAD", 19);
        BWU bwu21 = new BWU("QUALITY_CAP", 20);
        A0H = bwu21;
        BWU bwu22 = new BWU("WARMUP_WATERMARK", 21);
        A0J = bwu22;
        BWU bwu23 = new BWU("DISABLE_PRELOAD", 22);
        A08 = bwu23;
        BWU bwu24 = new BWU("DISABLE_WARMUP", 23);
        A09 = bwu24;
        BWU bwu25 = new BWU("DISABLE_PREFETCH", 24);
        BWU bwu26 = new BWU(HatchPersistedMessageJson.UNSEND_STATUS_NONE, 25);
        A0E = bwu26;
        BWU[] bwuArr = {bwu, bwu2, bwu3, bwu4, bwu5, bwu6, bwu7, bwu8, bwu9, bwu10, bwu11, bwu12, bwu13, bwu14, bwu15, bwu16, bwu17, bwu18, bwu19, bwu20, bwu21, bwu22, bwu23, bwu24, bwu25, bwu26};
        A01 = bwuArr;
        A00 = C3cG.A0w(bwuArr);
    }

    public static BWU valueOf(String str) {
        return (BWU) Enum.valueOf(BWU.class, str);
    }

    public static BWU[] values() {
        return (BWU[]) A01.clone();
    }

    public BWU(String str, int i) {
    }
}
