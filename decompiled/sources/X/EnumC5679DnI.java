package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.DnI, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC5679DnI {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ EnumC5679DnI[] A01;
    public static final EnumC5679DnI A02;
    public static final EnumC5679DnI A03;
    public static final EnumC5679DnI A04;
    public static final EnumC5679DnI A05;
    public static final EnumC5679DnI A06;
    public static final EnumC5679DnI A07;
    public static final EnumC5679DnI A08;
    public static final EnumC5679DnI A09;
    public static final EnumC5679DnI A0A;
    public static final EnumC5679DnI A0B;
    public static final EnumC5679DnI A0C;

    static {
        EnumC5679DnI enumC5679DnI = new EnumC5679DnI("VIDEO_FRAME_PROCESSOR_RELEASE_FRAME_UPPER_THRESHOLD", 0);
        A0B = enumC5679DnI;
        EnumC5679DnI enumC5679DnI2 = new EnumC5679DnI("VIDEO_FRAME_PROCESSOR_RELEASE_FRAME_LOWER_THRESHOLD", 1);
        A0A = enumC5679DnI2;
        EnumC5679DnI enumC5679DnI3 = new EnumC5679DnI("EXOPLAYER_THREAD_POLLING_INTERVAL_MS", 2);
        A04 = enumC5679DnI3;
        EnumC5679DnI enumC5679DnI4 = new EnumC5679DnI("VIDEO_WIDTH_TO_ENABLE_SR_EFFECTS", 3);
        A0C = enumC5679DnI4;
        EnumC5679DnI enumC5679DnI5 = new EnumC5679DnI("THREAD_SLEEP_TIME_MS_FOR_DECODER_INIT_FAILURE", 4);
        A09 = enumC5679DnI5;
        EnumC5679DnI enumC5679DnI6 = new EnumC5679DnI("MAXIMUM_BUFFER_AHEAD_PERIODS", 5);
        A06 = enumC5679DnI6;
        EnumC5679DnI enumC5679DnI7 = new EnumC5679DnI("BUFFER_VERY_LATE_THRESHOLD_US", 6);
        A03 = enumC5679DnI7;
        EnumC5679DnI enumC5679DnI8 = new EnumC5679DnI("AUDIO_TRACK_POOL_SIZE_PER_CONFIG", 7);
        A02 = enumC5679DnI8;
        EnumC5679DnI enumC5679DnI9 = new EnumC5679DnI("MAX_AUDIO_TRACK_POOL_SIZE", 8);
        A07 = enumC5679DnI9;
        EnumC5679DnI enumC5679DnI10 = new EnumC5679DnI("INPUT_BUFFER_GUARD_DROP_BUDGET", 9);
        A05 = enumC5679DnI10;
        EnumC5679DnI enumC5679DnI11 = new EnumC5679DnI("PROACTIVE_AV1_INPUT_DROP_SPEED_THRESHOLD_X100", 10);
        A08 = enumC5679DnI11;
        EnumC5679DnI[] enumC5679DnIArr = {enumC5679DnI, enumC5679DnI2, enumC5679DnI3, enumC5679DnI4, enumC5679DnI5, enumC5679DnI6, enumC5679DnI7, enumC5679DnI8, enumC5679DnI9, enumC5679DnI10, enumC5679DnI11};
        A01 = enumC5679DnIArr;
        A00 = C3cG.A0w(enumC5679DnIArr);
    }

    public static EnumC5679DnI valueOf(String str) {
        return (EnumC5679DnI) Enum.valueOf(EnumC5679DnI.class, str);
    }

    public static EnumC5679DnI[] values() {
        return (EnumC5679DnI[]) A01.clone();
    }

    public EnumC5679DnI(String str, int i) {
    }
}
