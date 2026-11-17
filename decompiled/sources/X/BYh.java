package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class BYh {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ BYh[] A01;
    public static final BYh A02;
    public static final BYh A03;
    public static final BYh A04;
    public static final BYh A05;
    public static final BYh A06;
    public static final BYh A07;
    public static final BYh A08;
    public static final BYh A09;
    public static final BYh A0A;
    public static final BYh A0B;
    public static final BYh A0C;
    public static final BYh A0D;
    public static final BYh A0E;
    public static final BYh A0F;

    static {
        BYh bYh = new BYh("MEMORY_NORMAL", 0);
        A08 = bYh;
        BYh bYh2 = new BYh("MEMORY_RED", 1);
        A09 = bYh2;
        BYh bYh3 = new BYh("MEMORY_YELLOW", 2);
        A0A = bYh3;
        BYh bYh4 = new BYh("THERMAL_NORMAL", 3);
        A0E = bYh4;
        BYh bYh5 = new BYh("SEVERE_THERMAL", 4);
        A0D = bYh5;
        BYh bYh6 = new BYh("BATTERY_THRESHOLD", 5);
        A03 = bYh6;
        BYh bYh7 = new BYh("LOW_BATTERY", 6);
        A07 = bYh7;
        BYh bYh8 = new BYh("BATTERY_NORMAL", 7);
        A02 = bYh8;
        BYh bYh9 = new BYh("STORAGE_GREEN", 8);
        BYh bYh10 = new BYh("STORAGE_YELLOW", 9);
        BYh bYh11 = new BYh("STORAGE_RED", 10);
        BYh bYh12 = new BYh("FAST_SCROLL", 11);
        A05 = bYh12;
        BYh bYh13 = new BYh("SCROLL_SPEED_THRESHOLD", 12);
        A0C = bYh13;
        BYh bYh14 = new BYh("SMART_AUTOPLAY_ACTIONS", 13);
        BYh bYh15 = new BYh("CELL", 14);
        A04 = bYh15;
        BYh bYh16 = new BYh("WIFI", 15);
        A0F = bYh16;
        BYh bYh17 = new BYh("SCROLL_SPEED_AVG_WT_THRESHOLD", 16);
        A0B = bYh17;
        BYh bYh18 = new BYh("IS_APP_STARTUP", 17);
        A06 = bYh18;
        BYh[] bYhArr = {bYh, bYh2, bYh3, bYh4, bYh5, bYh6, bYh7, bYh8, bYh9, bYh10, bYh11, bYh12, bYh13, bYh14, bYh15, bYh16, bYh17, bYh18};
        A01 = bYhArr;
        A00 = C3cG.A0w(bYhArr);
    }

    public static BYh valueOf(String str) {
        return (BYh) Enum.valueOf(BYh.class, str);
    }

    public static BYh[] values() {
        return (BYh[]) A01.clone();
    }

    public BYh(String str, int i) {
    }
}
