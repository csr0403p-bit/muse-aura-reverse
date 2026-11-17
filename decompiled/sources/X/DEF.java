package X;

/* loaded from: classes5.dex */
public enum DEF {
    UNKNOWN(-1, "UNKNOWN"),
    DASH_VIDEO(2, "DASH_VIDEO"),
    DASH_AUDIO(1, "DASH_AUDIO"),
    DASH_TEXT(3, "DASH_TEXT"),
    DASH_UNKNOWN(0, "DASH_UNKNOWN"),
    PROGRESSIVE(10, "PROGRESSIVE"),
    LIVE_VIDEO(11, "LIVE_VIDEO"),
    LIVE_AUDIO(12, "LIVE_AUDIO"),
    LIVE_MANIFEST(13, "LIVE_MANIFEST"),
    LIVE_TEXT(14, "LIVE_TEXT"),
    LIVE_IMAGE(15, "LIVE_IMAGE");

    public final String name;
    public final int value;

    DEF(int i, String str) {
        this.value = i;
        this.name = str;
    }

    public static boolean A00(int i) {
        DEF def;
        DEF[] defArrValues = values();
        int length = defArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                def = UNKNOWN;
                break;
            }
            def = defArrValues[i2];
            if (def.value == i) {
                break;
            }
            i2++;
        }
        return def == DASH_VIDEO || def == PROGRESSIVE || def == LIVE_VIDEO;
    }
}
