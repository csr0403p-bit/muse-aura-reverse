package X;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.7l3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C06827l3 implements Serializable {
    public Set<? extends EnumC06837l4> _options;
    public final Pattern nativePattern;

    /* JADX WARN: Illegal instructions before constructor call */
    public C06827l3(String str) {
        C7384Etj.A0Y(str, 0);
        Pattern patternCompile = Pattern.compile(str);
        C7384Etj.A0U(patternCompile);
        this(patternCompile);
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/CharSequence;I)LX/3b6<LX/1Lu;>; */
    public static final C79x A00(CharSequence charSequence, C06827l3 c06827l3) {
        C7384Etj.A0Y(charSequence, 0);
        if (0 <= charSequence.length()) {
            return new C79x(new C8i9(3, c06827l3, charSequence), C7l5.A00);
        }
        throw new IndexOutOfBoundsException(FGI.A0T("Start index out of bounds: ", ", input length: ", 0, charSequence.length()));
    }

    public static final C06847l8 A01(CharSequence charSequence, C06827l3 c06827l3) {
        C7384Etj.A0Y(charSequence, 0);
        Matcher matcher = c06827l3.nativePattern.matcher(charSequence);
        C7384Etj.A0U(matcher);
        if (matcher.find(0)) {
            return new C06847l8(charSequence, matcher);
        }
        return null;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException(C8j2.A00(1));
    }

    public final String A03(CharSequence charSequence, String str) {
        C7384Etj.A0Y(charSequence, 0);
        String strReplaceAll = this.nativePattern.matcher(charSequence).replaceAll(str);
        C7384Etj.A0U(strReplaceAll);
        return strReplaceAll;
    }

    public final List A05(CharSequence charSequence) {
        C7384Etj.A0Y(charSequence, 0);
        Matcher matcher = this.nativePattern.matcher(charSequence);
        if (!matcher.find()) {
            return Collections.singletonList(charSequence.toString());
        }
        ArrayList arrayListA11 = C60O.A11(10);
        int iEnd = 0;
        do {
            arrayListA11.add(charSequence.subSequence(iEnd, matcher.start()).toString());
            iEnd = matcher.end();
        } while (matcher.find());
        arrayListA11.add(charSequence.subSequence(iEnd, charSequence.length()).toString());
        return arrayListA11;
    }

    public final C06847l8 A06(CharSequence charSequence) {
        C7384Etj.A0Y(charSequence, 0);
        Matcher matcher = this.nativePattern.matcher(charSequence);
        C7384Etj.A0U(matcher);
        if (matcher.matches()) {
            return new C06847l8(charSequence, matcher);
        }
        return null;
    }

    public final boolean A07(CharSequence charSequence) {
        C7384Etj.A0Y(charSequence, 0);
        return this.nativePattern.matcher(charSequence).find();
    }

    public final boolean A08(CharSequence charSequence) {
        C7384Etj.A0Y(charSequence, 0);
        return this.nativePattern.matcher(charSequence).matches();
    }

    public static C06827l3 A02(String str) {
        return new C06827l3(str);
    }

    private final Object writeReplace() {
        final String strPattern = this.nativePattern.pattern();
        C7384Etj.A0U(strPattern);
        final int iFlags = this.nativePattern.flags();
        return new Serializable(strPattern, iFlags) { // from class: X.7l6
            public static final long serialVersionUID = 0;
            public final int flags;
            public final String pattern;

            private final Object readResolve() {
                Pattern patternCompile = Pattern.compile(this.pattern, this.flags);
                C7384Etj.A0U(patternCompile);
                return new C06827l3(patternCompile);
            }

            {
                this.pattern = strPattern;
                this.flags = iFlags;
            }
        };
    }

    public final String toString() {
        return C60O.A0o(this.nativePattern);
    }

    public final String A04(CharSequence charSequence, G0U<? super C1Lu, ? extends CharSequence> g0u) {
        AnonymousClass003.A0u(charSequence, g0u);
        int i = 0;
        C06847l8 c06847l8A01 = A01(charSequence, this);
        if (c06847l8A01 == null) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        do {
            sb.append(charSequence, i, c06847l8A01.AJM().A00);
            sb.append(g0u.invoke(c06847l8A01));
            i = c06847l8A01.AJM().A01 + 1;
            c06847l8A01 = c06847l8A01.ARG();
            if (i >= length) {
                break;
            }
        } while (c06847l8A01 != null);
        if (i < length) {
            sb.append(charSequence, i, length);
        }
        return sb.toString();
    }

    public C06827l3(Pattern pattern) {
        this.nativePattern = pattern;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C06827l3(String str, EnumC06837l4 enumC06837l4) {
        C7384Etj.A0Y(str, 0);
        int i = enumC06837l4.value;
        Pattern patternCompile = Pattern.compile(str, (i & 2) != 0 ? i | 64 : i);
        C7384Etj.A0U(patternCompile);
        this(patternCompile);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C06827l3(String str, Set<? extends EnumC06837l4> set) {
        C7384Etj.A0Y(set, 1);
        Iterator<? extends EnumC06837l4> it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= it.next().value;
        }
        Pattern patternCompile = Pattern.compile(str, (i & 2) != 0 ? i | 64 : i);
        C7384Etj.A0U(patternCompile);
        this(patternCompile);
    }
}
