package X;

/* loaded from: classes5.dex */
public abstract class DSB {
    public static String A00(int i) {
        switch (i) {
            case 0:
                return "NULL_VALUE";
            case 1:
                return "SESSIONLESS";
            case 2:
                return "SESSIONBASED";
            case 3:
                return "PAGEID";
            case 4:
                return "ADMINID";
            case 5:
            default:
                throw BV5.A0T("%d is not a MobileConfigUnitType", BV5.A1Y(i));
            case 6:
                return "GROUP";
            case 7:
                return "FAMILY_DEVICE_ID";
            case 8:
                return "FRLID";
            case 9:
                return "AD_ACCOUNT_ID";
            case 10:
                return "WEARABLE_DEVICE_OWNER_ID";
        }
    }
}
