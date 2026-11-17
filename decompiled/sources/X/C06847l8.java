package X;

import java.util.List;
import java.util.regex.Matcher;

/* renamed from: X.7l8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C06847l8 implements C1Lu {
    public List<String> A00;
    public final Matcher A01;
    public final C06857lE A02 = new C06857lE(this);
    public final CharSequence A03;

    public static String A00(C06847l8 c06847l8) {
        String strGroup = c06847l8.A01.group();
        C7384Etj.A0U(strGroup);
        return strGroup;
    }

    @Override // X.C1Lu
    public final List<String> AG1() {
        List<String> list = this.A00;
        if (list != null) {
            return list;
        }
        BZR bzr = new BZR(this);
        this.A00 = bzr;
        return bzr;
    }

    @Override // X.C1Lu
    public final ADq AJM() {
        Matcher matcher = this.A01;
        return ATD.A0C(matcher.start(), matcher.end());
    }

    @Override // X.C1Lu
    public final C06847l8 ARG() {
        Matcher matcher = this.A01;
        int iEnd = matcher.end() + (AnonymousClass002.A1Q(matcher.end(), matcher.start()) ? 1 : 0);
        CharSequence charSequence = this.A03;
        if (iEnd > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        C7384Etj.A0U(matcher2);
        if (matcher2.find(iEnd)) {
            return new C06847l8(charSequence, matcher2);
        }
        return null;
    }

    public C06847l8(CharSequence charSequence, Matcher matcher) {
        this.A01 = matcher;
        this.A03 = charSequence;
    }
}
