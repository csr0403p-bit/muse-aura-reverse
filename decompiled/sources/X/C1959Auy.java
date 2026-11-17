package X;

import java.lang.Character;
import java.text.BreakIterator;
import java.util.Locale;

/* renamed from: X.Auy, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1959Auy {
    public final int A00;
    public final int A01;
    public final CharSequence A02;
    public final BreakIterator A03;

    public C1959Auy(CharSequence charSequence, Locale locale, int i) {
        String str;
        this.A02 = charSequence;
        if (0 > charSequence.length()) {
            str = "input start index is outside the CharSequence";
        } else {
            if (i >= 0 && i <= charSequence.length()) {
                BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
                this.A03 = wordInstance;
                this.A01 = Math.max(0, -50);
                this.A00 = Math.min(charSequence.length(), i + 50);
                wordInstance.setText(new As1(charSequence, i));
                return;
            }
            str = "input end index is outside the CharSequence";
        }
        throw C60O.A0i(str);
    }

    public static final void A00(C1959Auy c1959Auy, int i) {
        int i2 = c1959Auy.A01;
        int i3 = c1959Auy.A00;
        if (i > i3 || i2 > i) {
            StringBuilder sbA0y = C60O.A0y("Invalid offset: ", i);
            sbA0y.append(". Valid range is [");
            sbA0y.append(i2);
            sbA0y.append(" , ");
            sbA0y.append(i3);
            throw C60O.A0i(C8j3.A16(sbA0y, ']'));
        }
    }

    private final boolean A01(int i) {
        CharSequence charSequence = this.A02;
        int i2 = i - 1;
        if (C7384Etj.areEqual(Character.UnicodeBlock.of(charSequence.charAt(i2)), Character.UnicodeBlock.HIRAGANA) && C7384Etj.areEqual(Character.UnicodeBlock.of(charSequence.charAt(i)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return C7384Etj.areEqual(Character.UnicodeBlock.of(charSequence.charAt(i)), Character.UnicodeBlock.HIRAGANA) && C7384Etj.areEqual(Character.UnicodeBlock.of(charSequence.charAt(i2)), Character.UnicodeBlock.KATAKANA);
    }

    public static final boolean A03(C1959Auy c1959Auy, int i) {
        int i2 = c1959Auy.A01 + 1;
        if (i > c1959Auy.A00 || i2 > i) {
            return false;
        }
        CharSequence charSequence = c1959Auy.A02;
        if (!Character.isLetterOrDigit(Character.codePointBefore(charSequence, i))) {
            int i3 = i - 1;
            if (!Character.isSurrogate(charSequence.charAt(i3))) {
                if (E9X.A08 == null) {
                    return false;
                }
                E9X e9xA00 = E9X.A00();
                if (e9xA00.A01() != 1 || e9xA00.A02(charSequence, i3) == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final boolean A05(C1959Auy c1959Auy, int i) {
        int i2 = c1959Auy.A01;
        if (i >= c1959Auy.A00 || i2 > i) {
            return false;
        }
        CharSequence charSequence = c1959Auy.A02;
        if (!Character.isLetterOrDigit(Character.codePointAt(charSequence, i)) && !Character.isSurrogate(charSequence.charAt(i))) {
            if (E9X.A08 == null) {
                return false;
            }
            E9X e9xA00 = E9X.A00();
            if (e9xA00.A01() != 1 || e9xA00.A02(charSequence, i) == -1) {
                return false;
            }
        }
        return true;
    }

    public final boolean A08(int i) {
        int i2 = this.A01 + 1;
        if (i > this.A00 || i2 > i) {
            return false;
        }
        return A02(Character.codePointBefore(this.A02, i));
    }

    public static final boolean A02(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final boolean A04(C1959Auy c1959Auy, int i) {
        A00(c1959Auy, i);
        if (!c1959Auy.A03.isBoundary(i)) {
            return false;
        }
        if (A05(c1959Auy, i) && A05(c1959Auy, i - 1) && A05(c1959Auy, i + 1)) {
            return false;
        }
        return i <= 0 || i >= c1959Auy.A02.length() - 1 || !(c1959Auy.A01(i) || c1959Auy.A01(i + 1));
    }

    public final int A06(int i) {
        A00(this, i);
        int iFollowing = this.A03.following(i);
        return (A05(this, iFollowing + (-1)) && A05(this, iFollowing) && !A01(iFollowing)) ? A06(iFollowing) : iFollowing;
    }

    public final int A07(int i) {
        A00(this, i);
        int iPreceding = this.A03.preceding(i);
        return (A05(this, iPreceding) && A03(this, iPreceding) && !A01(iPreceding)) ? A07(iPreceding) : iPreceding;
    }
}
