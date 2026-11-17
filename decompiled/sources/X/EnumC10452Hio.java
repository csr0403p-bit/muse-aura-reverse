package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Hio, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC10452Hio {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ EnumC10452Hio[] A01;
    public static final EnumC10452Hio A02;
    public static final EnumC10452Hio A03;
    public static final EnumC10452Hio A04;

    static {
        EnumC10452Hio enumC10452Hio = new EnumC10452Hio("NO_VIDEO", 0);
        A04 = enumC10452Hio;
        EnumC10452Hio enumC10452Hio2 = new EnumC10452Hio("H264", 1);
        A02 = enumC10452Hio2;
        EnumC10452Hio enumC10452Hio3 = new EnumC10452Hio("LIVE_AI_H265_FLEX_FEC", 2);
        A03 = enumC10452Hio3;
        EnumC10452Hio[] enumC10452HioArr = {enumC10452Hio, enumC10452Hio2, enumC10452Hio3};
        A01 = enumC10452HioArr;
        A00 = C3cG.A0w(enumC10452HioArr);
    }

    public static EnumC10452Hio valueOf(String str) {
        return (EnumC10452Hio) Enum.valueOf(EnumC10452Hio.class, str);
    }

    public static EnumC10452Hio[] values() {
        return (EnumC10452Hio[]) A01.clone();
    }

    public EnumC10452Hio(String str, int i) {
    }
}
