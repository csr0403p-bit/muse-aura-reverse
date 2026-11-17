package X;

/* renamed from: X.EXo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6730EXo extends Enum<AbstractC6730EXo> {
    public final String value;

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "iac_get_products_fallback";
            case 2:
                return "iac_bottom_sheet";
            case 3:
                return "iac_bottom_sheet_skipped";
            case 4:
                return "iac_create_sandbox_session";
            case 5:
                return "iac_create_sandbox_session_skipped";
            default:
                return "iac_get_products";
        }
    }
}
