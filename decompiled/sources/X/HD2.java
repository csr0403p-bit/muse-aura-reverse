package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class HD2 {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ HD2[] A01;
    public static final HD2 A02;
    public static final HD2 A03;
    public static final HD2 A04;
    public static final HD2 A05;
    public static final HD2 A06;
    public static final HD2 A07;
    public static final HD2 A08;
    public static final HD2 A09;

    static {
        HD2 hd2 = new HD2("ALREADY_REGISTERED", 0);
        HD2 hd22 = new HD2("BACKUP_KEY_PAIR_SERIALIZATION_ERROR", 1);
        HD2 hd23 = new HD2("CLIENT_PARAMS_ERROR", 2);
        HD2 hd24 = new HD2("E2EE_CRYPTO_LIB_ERROR", 3);
        HD2 hd25 = new HD2("INVALID_USER_PASSWORD", 4);
        A02 = hd25;
        HD2 hd26 = new HD2("ISLAND_PUB_RSA_KEY_INVALID", 5);
        A05 = hd26;
        HD2 hd27 = new HD2("ISLAND_PUB_ED25519_KEY_INVALID", 6);
        A04 = hd27;
        HD2 hd28 = new HD2("ISLAND_OPAQUE_PUB_KEY_INVALID", 7);
        A03 = hd28;
        HD2 hd29 = new HD2("NETWORK_PROVIDER_ERROR", 8);
        A06 = hd29;
        HD2 hd210 = new HD2("NOT_REGISTERED", 9);
        HD2 hd211 = new HD2("RESTORE_HISTORY_SIGNATURE_VERIFICATION_ERROR", 10);
        HD2 hd212 = new HD2("VESTA_CLIENT_ERROR", 11);
        A08 = hd212;
        HD2 hd213 = new HD2("VESTA_SERVER_ERROR", 12);
        A09 = hd213;
        HD2 hd214 = new HD2("USER_PASSWORD_ATTEMPTS_EXHAUSTED", 13);
        A07 = hd214;
        HD2[] hd2Arr = {hd2, hd22, hd23, hd24, hd25, hd26, hd27, hd28, hd29, hd210, hd211, hd212, hd213, hd214, new HD2("NO_OTA_BUNDLE_AVAILABLE", 14), new HD2("EMPTY_OTA_BUNDLE_FIELD", 15)};
        A01 = hd2Arr;
        A00 = C3cG.A0w(hd2Arr);
    }

    public static HD2 valueOf(String str) {
        return (HD2) Enum.valueOf(HD2.class, str);
    }

    public static HD2[] values() {
        return (HD2[]) A01.clone();
    }

    public HD2(String str, int i) {
    }
}
