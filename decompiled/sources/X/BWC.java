package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class BWC {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ BWC[] A01;
    public static final BWC A02;
    public static final BWC A03;
    public static final BWC A04;

    static {
        BWC bwc = new BWC("NO_OP_PROVIDER", 0);
        BWC bwc2 = new BWC("IG_FEED_PROVIDER", 1);
        BWC bwc3 = new BWC("IG_STORY_PROVIDER", 2);
        BWC bwc4 = new BWC("IG_STORY_DPA_SHOWCASE_PROVIDER", 3);
        BWC bwc5 = new BWC("IG_REELS_CLIP_PROVIDER", 4);
        BWC bwc6 = new BWC("IG_BROADCAST_PROVIDER", 5);
        BWC bwc7 = new BWC("IG_IGTV_PROVIDER", 6);
        BWC bwc8 = new BWC("IG_BK_PROVIDER", 7);
        BWC bwc9 = new BWC("IG_DISCOVERY_PROVIDER", 8);
        BWC bwc10 = new BWC("IG_CLIPS_MIDCARD_PROVIDER", 9);
        BWC bwc11 = new BWC("IG_CLIPS_MULTIADS_PROVIDER", 10);
        BWC bwc12 = new BWC("LITE_PROVIDER", 11);
        BWC bwc13 = new BWC("FB_PROVIDER", 12);
        A02 = bwc13;
        BWC bwc14 = new BWC("FB_AI_WIDGET_PROVIDER", 13);
        BWC bwc15 = new BWC("IG_DIRECT_PRIVACY_AWARE_PROVIDER", 14);
        A03 = bwc15;
        BWC bwc16 = new BWC("IG_MEDIA_METADATA_PROVIDER", 15);
        BWC bwc17 = new BWC("IG_MUSIC_PROVIDER", 16);
        BWC bwc18 = new BWC("IG_COWATCH", 17);
        BWC bwc19 = new BWC("VIDEO_PRIMITIVE_COMPONENT", 18);
        BWC bwc20 = new BWC("OC_HERO_PROVIDER", 19);
        A04 = bwc20;
        BWC[] bwcArr = {bwc, bwc2, bwc3, bwc4, bwc5, bwc6, bwc7, bwc8, bwc9, bwc10, bwc11, bwc12, bwc13, bwc14, bwc15, bwc16, bwc17, bwc18, bwc19, bwc20, new BWC("IG_WEARABLES_PROVIDER", 20), new BWC("IG_HIGHLIGHT_IN_FEED_DATA_PROVIDER", 21), new BWC("POCKET_APP_PROVIDER", 22)};
        A01 = bwcArr;
        A00 = C3cG.A0w(bwcArr);
    }

    public static BWC valueOf(String str) {
        return (BWC) Enum.valueOf(BWC.class, str);
    }

    public static BWC[] values() {
        return (BWC[]) A01.clone();
    }

    public BWC(String str, int i) {
    }
}
