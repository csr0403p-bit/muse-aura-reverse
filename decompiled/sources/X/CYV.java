package X;

import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class CYV {
    public static final Map<Integer, CYV> A00;
    public static final /* synthetic */ Ey9 A01;
    public static final /* synthetic */ CYV[] A02;
    public static final CYV A03;
    public static final CYV A04;
    public static final CYV A05;
    public static final CYV A06;
    public static final CYV A07;
    public static final CYV A08;
    public final int value;

    static {
        CYV cyv = new CYV("RESERVED", 0, 0);
        A07 = cyv;
        CYV cyv2 = new CYV("IMAGE", 1, 1);
        A05 = cyv2;
        CYV cyv3 = new CYV("VIDEO", 2, 2);
        A08 = cyv3;
        CYV cyv4 = new CYV("GRAPHQL", 3, 3);
        CYV cyv5 = new CYV("API", 4, 4);
        A03 = cyv5;
        CYV cyv6 = new CYV("ANALYTICS", 5, 5);
        CYV cyv7 = new CYV("DO_NOT_USE", 6, 6);
        CYV cyv8 = new CYV("CRITICAL_API", 7, 7);
        A04 = cyv8;
        CYV cyv9 = new CYV("MEDIA_UPLOAD", 8, 8);
        CYV cyv10 = new CYV("VIDEO_CALL", 9, 9);
        CYV cyv11 = new CYV("IMAGE_THUMBNAIL", 10, 10);
        CYV cyv12 = new CYV("VIDEO_COVER_IMAGE", 11, 11);
        CYV cyv13 = new CYV("AUDIO", 12, 12);
        CYV cyv14 = new CYV("DOCUMENT", 13, 13);
        CYV cyv15 = new CYV("OHAI", 14, 14);
        CYV cyv16 = new CYV("OTHER", 15, 255);
        A06 = cyv16;
        CYV[] cyvArr = {cyv, cyv2, cyv3, cyv4, cyv5, cyv6, cyv7, cyv8, cyv9, cyv10, cyv11, cyv12, cyv13, cyv14, cyv15, cyv16};
        A02 = cyvArr;
        A01 = C3cG.A0w(cyvArr);
        A00 = BV4.A0u();
        for (CYV cyv17 : values()) {
            A00.put(Integer.valueOf(cyv17.value), cyv17);
        }
    }

    public static CYV valueOf(String str) {
        return (CYV) Enum.valueOf(CYV.class, str);
    }

    public static CYV[] values() {
        return (CYV[]) A02.clone();
    }

    public CYV(String str, int i, int i2) {
        this.value = i2;
    }
}
