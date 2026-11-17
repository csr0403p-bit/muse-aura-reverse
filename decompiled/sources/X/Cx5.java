package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class Cx5 {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ Cx5[] A01;
    public static final Cx5 A02;
    public static final Cx5 A03;
    public static final Cx5 A04;
    public static final Cx5 A05;
    public static final Cx5 A06;
    public static final Cx5 A07;
    public static final Cx5 A08;
    public static final Cx5 A09;
    public static final Cx5 A0A;
    public static final Cx5 A0B;
    public static final Cx5 A0C;
    public static final Cx5 A0D;
    public static final Cx5 A0E;

    static {
        Cx5 cx5 = new Cx5("ALLOW", 0);
        A02 = cx5;
        Cx5 cx52 = new Cx5("DEFAULT_PURPOSES_OPERATIONAL", 1);
        A03 = cx52;
        Cx5 cx53 = new Cx5("INFRASTRUCTURE_ANALYTICS", 2);
        A04 = cx53;
        Cx5 cx54 = new Cx5("MESSAGE_CONTENT_DATA_TYPE", 3);
        A05 = cx54;
        Cx5 cx55 = new Cx5("MESSAGING_ARMADILLO_METADATA", 4);
        A06 = cx55;
        Cx5 cx56 = new Cx5("MESSAGING_CONTENT", 5);
        A07 = cx56;
        Cx5 cx57 = new Cx5("MESSAGING_TRAFFIC_METADATA", 6);
        A08 = cx57;
        Cx5 cx58 = new Cx5("MOBILE_ACCESS_TOKEN", 7);
        A09 = cx58;
        Cx5 cx59 = new Cx5("MOBILE_FAMILY_ACCOUNTING", 8);
        A0A = cx59;
        Cx5 cx510 = new Cx5("MOBILE_LOCATION", 9);
        Cx5 cx511 = new Cx5("MOBILE_MESSAGING_CONTENT_DEBUGGING", 10);
        A0B = cx511;
        Cx5 cx512 = new Cx5("MOBILE_MESSAGING_CONTENT_E2EE", 11);
        A0C = cx512;
        Cx5 cx513 = new Cx5("MOBILE_MESSAGING_CONTENT_OPEN", 12);
        A0D = cx513;
        Cx5 cx514 = new Cx5("SENSITIVE_DATA_NO_ADS", 13);
        A0E = cx514;
        Cx5[] cx5Arr = {cx5, cx52, cx53, cx54, cx55, cx56, cx57, cx58, cx59, cx510, cx511, cx512, cx513, cx514};
        A01 = cx5Arr;
        A00 = C3cG.A0w(cx5Arr);
    }

    public static Cx5 valueOf(String str) {
        return (Cx5) Enum.valueOf(Cx5.class, str);
    }

    public static Cx5[] values() {
        return (Cx5[]) A01.clone();
    }

    public Cx5(String str, int i) {
    }
}
