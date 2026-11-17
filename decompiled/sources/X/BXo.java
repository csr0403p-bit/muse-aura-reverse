package X;

/* loaded from: classes5.dex */
public abstract class BXo extends Enum<BXo> {
    public final String value;

    public static Integer A00(String str) {
        if (str.equals("FXAccountItemEligibilityEligible")) {
            return C79.A00;
        }
        if (str.equals("FXAccountItemEligibilityIneligible")) {
            return C79.A01;
        }
        if (str.equals("FXAccountItemEligibilityNoData")) {
            return C79.A0C;
        }
        throw C60O.A0i(str);
    }
}
