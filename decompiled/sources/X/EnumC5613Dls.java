package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Dls, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC5613Dls {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ EnumC5613Dls[] A01;
    public static final EnumC5613Dls A02;
    public static final EnumC5613Dls A03;
    public static final EnumC5613Dls A04;
    public static final EnumC5613Dls A05;
    public static final EnumC5613Dls A06;
    public static final EnumC5613Dls A07;
    public static final EnumC5613Dls A08;
    public static final EnumC5613Dls A09;
    public static final EnumC5613Dls A0A;
    public static final EnumC5613Dls A0B;
    public static final EnumC5613Dls A0C;
    public static final EnumC5613Dls A0D;
    public final String shortName;

    static {
        EnumC5613Dls enumC5613Dls = new EnumC5613Dls("BYPASS", 0, "bypass");
        A04 = enumC5613Dls;
        EnumC5613Dls enumC5613Dls2 = new EnumC5613Dls("CURRENT", 1, "current");
        EnumC5613Dls enumC5613Dls3 = new EnumC5613Dls("CELL", 2, "cell");
        A05 = enumC5613Dls3;
        EnumC5613Dls enumC5613Dls4 = new EnumC5613Dls("WIFI_AS_CELL", 3, "wifiascell");
        EnumC5613Dls enumC5613Dls5 = new EnumC5613Dls("AVOID_ON_CELL", 4, "avoidoncell");
        A03 = enumC5613Dls5;
        EnumC5613Dls enumC5613Dls6 = new EnumC5613Dls("AVOID_ON_CELL_DATASAVER", 5, "avoidoncelldatasaver");
        EnumC5613Dls enumC5613Dls7 = new EnumC5613Dls("EGRESS_PENALTY_CELL", 6, "egresspenaltycell");
        EnumC5613Dls enumC5613Dls8 = new EnumC5613Dls("EGRESS_PENALTY", 7, "egresspenalty");
        EnumC5613Dls enumC5613Dls9 = new EnumC5613Dls("INLINE", 8, "inline");
        A0A = enumC5613Dls9;
        EnumC5613Dls enumC5613Dls10 = new EnumC5613Dls("SCREEN_WIDTH", 9, "screen");
        A0D = enumC5613Dls10;
        EnumC5613Dls enumC5613Dls11 = new EnumC5613Dls("MAX_FORMAT_WIDTH", 10, "maxformat");
        A0B = enumC5613Dls11;
        EnumC5613Dls enumC5613Dls12 = new EnumC5613Dls("MAX_PREFETCH_WIDTH", 11, "maxprefetch");
        A0C = enumC5613Dls12;
        EnumC5613Dls enumC5613Dls13 = new EnumC5613Dls("FORCE_CURRENT_DROP_FRAME", 12, "dfcurr");
        A09 = enumC5613Dls13;
        EnumC5613Dls enumC5613Dls14 = new EnumC5613Dls("DROP_FRAME_MIN_WATCHABLE", 13, "dfminmos");
        A06 = enumC5613Dls14;
        EnumC5613Dls enumC5613Dls15 = new EnumC5613Dls("FLOOR_RAISED", 14, "floorraised");
        A08 = enumC5613Dls15;
        EnumC5613Dls enumC5613Dls16 = new EnumC5613Dls("DROP_FRAME_MIN_WIDTH_MUTLIPLIER", 15, "dfmul");
        A07 = enumC5613Dls16;
        EnumC5613Dls enumC5613Dls17 = new EnumC5613Dls("AVOID_ON_ABR", 16, "avoidonabr");
        A02 = enumC5613Dls17;
        EnumC5613Dls[] enumC5613DlsArr = {enumC5613Dls, enumC5613Dls2, enumC5613Dls3, enumC5613Dls4, enumC5613Dls5, enumC5613Dls6, enumC5613Dls7, enumC5613Dls8, enumC5613Dls9, enumC5613Dls10, enumC5613Dls11, enumC5613Dls12, enumC5613Dls13, enumC5613Dls14, enumC5613Dls15, enumC5613Dls16, enumC5613Dls17, new EnumC5613Dls("PASSTHROUGH", 17, "pst")};
        A01 = enumC5613DlsArr;
        A00 = C3cG.A0w(enumC5613DlsArr);
    }

    public static EnumC5613Dls valueOf(String str) {
        return (EnumC5613Dls) Enum.valueOf(EnumC5613Dls.class, str);
    }

    public static EnumC5613Dls[] values() {
        return (EnumC5613Dls[]) A01.clone();
    }

    public EnumC5613Dls(String str, int i, String str2) {
        this.shortName = str2;
    }
}
