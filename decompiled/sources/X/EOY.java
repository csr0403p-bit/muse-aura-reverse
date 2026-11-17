package X;

/* loaded from: classes5.dex */
public abstract class EOY extends Enum<EOY> {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "CONTENT_PROVIDER";
            case 2:
                return "CONTENT_PROVIDER_LEGACY_LITE";
            case 3:
                return "CONTENT_PROVIDER_LEGACY_APP_INFRA";
            default:
                return "ACCOUNT_MANAGER";
        }
    }
}
