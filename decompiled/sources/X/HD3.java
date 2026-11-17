package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class HD3 {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ HD3[] A01;
    public static final HD3 A02;
    public static final HD3 A03;
    public static final HD3 A04;
    public static final HD3 A05;
    public static final HD3 A06;
    public static final HD3 A07;
    public static final HD3 A08;
    public static final HD3 A09;

    static {
        HD3 hd3 = new HD3("ALREADY_REGISTERED", 0);
        HD3 hd32 = new HD3("ISLAND_PUB_RSA_KEY_INVALID", 1);
        A05 = hd32;
        HD3 hd33 = new HD3("ISLAND_PUB_ED25519_KEY_INVALID", 2);
        A04 = hd33;
        HD3 hd34 = new HD3("ISLAND_OPAQUE_PUB_KEY_INVALID", 3);
        A03 = hd34;
        HD3 hd35 = new HD3("NETWORK_PROVIDER_ERROR", 4);
        A06 = hd35;
        HD3 hd36 = new HD3("VESTA_CLIENT_ERROR", 5);
        A08 = hd36;
        HD3 hd37 = new HD3("VESTA_SERVER_ERROR", 6);
        A09 = hd37;
        HD3 hd38 = new HD3("NO_OTA_BUNDLE_AVAILABLE", 7);
        A07 = hd38;
        HD3 hd39 = new HD3("EMPTY_OTA_BUNDLE_FIELD", 8);
        A02 = hd39;
        HD3[] hd3Arr = {hd3, hd32, hd33, hd34, hd35, hd36, hd37, hd38, hd39};
        A01 = hd3Arr;
        A00 = C3cG.A0w(hd3Arr);
    }

    public static HD3 valueOf(String str) {
        return (HD3) Enum.valueOf(HD3.class, str);
    }

    public static HD3[] values() {
        return (HD3[]) A01.clone();
    }

    public HD3(String str, int i) {
    }
}
