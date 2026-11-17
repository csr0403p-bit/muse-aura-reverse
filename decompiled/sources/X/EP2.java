package X;

import java.util.Map;

/* loaded from: classes5.dex */
public abstract class EP2 {
    public static final Map<EP1, String> A00;
    public static final Map<EP1, String> A01;

    static {
        EP1 ep1 = EP1.A03;
        HxE hxEA0r = C3cG.A0r(ep1, "current_user");
        EP1 ep12 = EP1.A05;
        A00 = C3cH.A0m(EP1.A04, "multiple_logged_in_user", hxEA0r, C3cG.A0r(ep12, "saved_user"));
        A01 = AnonymousClass007.A0d(ep12, "account_switcher_data", C3cG.A0r(ep1, "sso_data"));
    }
}
