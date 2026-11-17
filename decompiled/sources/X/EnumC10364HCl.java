package X;

import com.facebook.aura.conversation.offline.HatchPersistedMessageJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.HCl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC10364HCl {
    public static final EnumC10364HCl[] A00;
    public static final /* synthetic */ Ey9 A01;
    public static final /* synthetic */ EnumC10364HCl[] A02;
    public static final EnumC10364HCl A03;
    public static final EnumC10364HCl A04;
    public static final EnumC10364HCl A05;
    public static final EnumC10364HCl A06;
    public static final EnumC10364HCl A07;
    public static final EnumC10364HCl A08;
    public static final EnumC10364HCl A09;
    public final String loggingName;
    public final Number value;

    static {
        EnumC10364HCl enumC10364HCl = new EnumC10364HCl(0, HatchPersistedMessageJson.UNSEND_STATUS_NONE, "SAP_VESTA_ERROR_CODE_NONE", 0);
        EnumC10364HCl enumC10364HCl2 = new EnumC10364HCl(1, "INTERNAL", "SAP_VESTA_ERROR_CODE_INTERNAL", 1);
        A06 = enumC10364HCl2;
        EnumC10364HCl enumC10364HCl3 = new EnumC10364HCl(2, "ITEM_NOT_FOUND", "SAP_VESTA_ERROR_CODE_ITEM_NOT_FOUND", 2);
        A07 = enumC10364HCl3;
        EnumC10364HCl enumC10364HCl4 = new EnumC10364HCl(3, "LOGIN_REQUEST_RATE_LIMIT", "SAP_VESTA_ERROR_CODE_LOGIN_REQUEST_RATE_LIMIT", 3);
        A08 = enumC10364HCl4;
        EnumC10364HCl enumC10364HCl5 = new EnumC10364HCl(4, "NOT_AUTHORIZED", "SAP_VESTA_ERROR_CODE_NOT_AUTHORIZED", 4);
        A09 = enumC10364HCl5;
        EnumC10364HCl enumC10364HCl6 = new EnumC10364HCl(5, "INCORRECT_PASSWORD", "SAP_VESTA_ERROR_CODE_WRONG_PASSWORD", 5);
        A05 = enumC10364HCl6;
        EnumC10364HCl enumC10364HCl7 = new EnumC10364HCl(6, "FORBIDDEN", "SAP_VESTA_ERROR_CODE_FORBIDDEN", 6);
        A03 = enumC10364HCl7;
        EnumC10364HCl enumC10364HCl8 = new EnumC10364HCl(7, "GRAPH_QL_NETWORK_ERROR", "SAP_VESTA_ERROR_CODE_GRAPH_QL_NETWORK_ERROR", 7);
        A04 = enumC10364HCl8;
        EnumC10364HCl[] enumC10364HClArr = {enumC10364HCl, enumC10364HCl2, enumC10364HCl3, enumC10364HCl4, enumC10364HCl5, enumC10364HCl6, enumC10364HCl7, enumC10364HCl8, new EnumC10364HCl(20, "UNKNOWN", "UNKNOWN", 8)};
        A02 = enumC10364HClArr;
        A01 = C3cG.A0w(enumC10364HClArr);
        A00 = values();
    }

    public static EnumC10364HCl valueOf(String str) {
        return (EnumC10364HCl) Enum.valueOf(EnumC10364HCl.class, str);
    }

    public static EnumC10364HCl[] values() {
        return (EnumC10364HCl[]) A02.clone();
    }

    public EnumC10364HCl(Number number, String str, String str2, int i) {
        this.value = number;
        this.loggingName = str2;
    }
}
