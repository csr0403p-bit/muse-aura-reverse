package X;

import java.util.Map;

/* renamed from: X.7l2, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7l2 {
    public static final Map<Character, String> A00 = C3cH.A0n('>', "&gt;", C3cG.A0r('\"', "&quot;"), C3cG.A0r('&', "&amp;"), C3cG.A0r('<', "&lt;"));
    public static final C06827l3 A01;
    public static final C06827l3 A02;

    public static final String A00(CharSequence charSequence, boolean z, boolean z2) {
        C7384Etj.A0Y(charSequence, 0);
        return (z2 ? A02 : A01).A04(charSequence, new C7lA(z));
    }

    static {
        C06827l3 c06827l3A02 = C06827l3.A02("&(?:([a-zA-Z0-9]+)|#([0-9]{1,8})|#[xX]([a-fA-F0-9]{1,8}));|([\"&<>])");
        A01 = c06827l3A02;
        String strPattern = c06827l3A02.nativePattern.pattern();
        C7384Etj.A0U(strPattern);
        A02 = C06827l3.A02(FGI.A0M(strPattern, "|\\\\([!\"#\\$%&'\\(\\)\\*\\+,\\-.\\/:;<=>\\?@\\[\\\\\\]\\^_`{\\|}~])"));
    }
}
