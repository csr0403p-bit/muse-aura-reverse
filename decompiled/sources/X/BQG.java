package X;

import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public final class BQG extends BR0 {
    public static final Character A0f(CharSequence charSequence) {
        C7384Etj.A0Y(charSequence, 0);
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(0));
    }

    public static final Character A14(CharSequence charSequence) {
        C7384Etj.A0Y(charSequence, 0);
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(charSequence.length() - 1));
    }

    public static final Character A15(CharSequence charSequence, int i) {
        C7384Etj.A0Y(charSequence, 0);
        if (i < 0 || i >= charSequence.length()) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(i));
    }

    public static final String A16(String str, int i) {
        C7384Etj.A0Y(str, 0);
        if (i < 0) {
            throw new IllegalArgumentException(FGI.A0I("Requested character count ", i, " is less than zero."));
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(i);
    }

    public static final String A17(String str, int i) {
        C7384Etj.A0Y(str, 0);
        if (i < 0) {
            throw new IllegalArgumentException(FGI.A0I("Requested character count ", i, " is less than zero."));
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(0, i);
    }

    public static final char A0A(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            return charSequence.charAt(charSequence.length() - 1);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public BQG(int i) {
    }

    public BQG() {
    }
}
