package com.google.common.base;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BV5;
import X.BV7;
import X.C60O;
import X.C8j3;
import X.FGI;
import com.facebook.aura.handoff.impl.HandoffLinkVerifier;
import java.util.Arrays;

/* loaded from: classes5.dex */
public abstract class CharMatcher implements Predicate<Character> {

    public final class Any extends NamedFastMatcher {
        public static final CharMatcher INSTANCE = new Any();

        public Any() {
            super("CharMatcher.any()");
        }

        @Override // com.google.common.base.CharMatcher.FastMatcher, com.google.common.base.CharMatcher
        public CharMatcher negate() {
            return None.INSTANCE;
        }

        @Override // com.google.common.base.CharMatcher
        public int indexIn(CharSequence sequence) {
            return sequence.length() == 0 ? -1 : 0;
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            return true;
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matchesAllOf(CharSequence sequence) {
            sequence.getClass();
            return true;
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matchesNoneOf(CharSequence sequence) {
            return AnonymousClass002.A1M(sequence.length());
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher or(CharMatcher other) {
            other.getClass();
            return this;
        }

        @Override // com.google.common.base.CharMatcher
        public String removeFrom(CharSequence sequence) {
            sequence.getClass();
            return "";
        }

        @Override // com.google.common.base.CharMatcher
        public String replaceFrom(CharSequence sequence, char replacement) {
            char[] cArr = new char[sequence.length()];
            Arrays.fill(cArr, replacement);
            return new String(cArr);
        }

        @Override // com.google.common.base.CharMatcher
        public int indexIn(CharSequence sequence, int start) {
            int length = sequence.length();
            Preconditions.checkPositionIndex(start, length);
            if (start == length) {
                return -1;
            }
            return start;
        }
    }

    public final class AnyOf extends CharMatcher {
        public final char[] chars;

        @Override // com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character character) {
            return matches(character.charValue());
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            return C8j3.A1Q(Arrays.binarySearch(this.chars, c));
        }

        public String toString() {
            StringBuilder sbA0x = C60O.A0x("CharMatcher.anyOf(\"");
            for (char c : this.chars) {
                sbA0x.append(CharMatcher.showCharacter(c));
            }
            return AnonymousClass001.A0v("\")", sbA0x);
        }

        public AnyOf(CharSequence chars) {
            char[] charArray = chars.toString().toCharArray();
            this.chars = charArray;
            Arrays.sort(charArray);
        }
    }

    public final class Ascii extends NamedFastMatcher {
        public static final CharMatcher INSTANCE = new Ascii();

        public Ascii() {
            super("CharMatcher.ascii()");
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            return BV7.A1S(c, 127);
        }
    }

    public abstract class FastMatcher extends CharMatcher {
        @Override // com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character character) {
            return matches(character.charValue());
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher negate() {
            return new NegatedFastMatcher(this);
        }
    }

    public final class InRange extends FastMatcher {
        public final char endInclusive;
        public final char startInclusive;

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            return this.startInclusive <= c && c <= this.endInclusive;
        }

        public String toString() {
            return FGI.A0h("CharMatcher.inRange('", CharMatcher.showCharacter(this.startInclusive), "', '", CharMatcher.showCharacter(this.endInclusive), "')");
        }

        public InRange(char startInclusive, char endInclusive) {
            Preconditions.checkArgument(BV5.A1P(endInclusive, startInclusive));
            this.startInclusive = startInclusive;
            this.endInclusive = endInclusive;
        }
    }

    public final class Is extends FastMatcher {
        public final char match;

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            return AnonymousClass002.A1Q(c, this.match);
        }

        @Override // com.google.common.base.CharMatcher.FastMatcher, com.google.common.base.CharMatcher
        public CharMatcher negate() {
            return new IsNot(this.match);
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher or(CharMatcher other) {
            return !other.matches(this.match) ? new Or(this, other) : other;
        }

        public String toString() {
            return FGI.A0U("CharMatcher.is('", CharMatcher.showCharacter(this.match), "')");
        }

        public Is(char match) {
            this.match = match;
        }

        @Override // com.google.common.base.CharMatcher
        public String replaceFrom(CharSequence sequence, char replacement) {
            return sequence.toString().replace(this.match, replacement);
        }
    }

    public final class IsEither extends FastMatcher {
        public final char match1;
        public final char match2;

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            return c == this.match1 || c == this.match2;
        }

        public String toString() {
            return FGI.A0d("CharMatcher.anyOf(\"", CharMatcher.showCharacter(this.match1), CharMatcher.showCharacter(this.match2), "\")");
        }

        public IsEither(char match1, char match2) {
            this.match1 = match1;
            this.match2 = match2;
        }
    }

    public final class IsNot extends FastMatcher {
        public final char match;

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            return AnonymousClass002.A1P(c, this.match);
        }

        @Override // com.google.common.base.CharMatcher.FastMatcher, com.google.common.base.CharMatcher
        public CharMatcher negate() {
            return new Is(this.match);
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher or(CharMatcher other) {
            return other.matches(this.match) ? Any.INSTANCE : this;
        }

        public String toString() {
            return FGI.A0U("CharMatcher.isNot('", CharMatcher.showCharacter(this.match), "')");
        }

        public IsNot(char match) {
            this.match = match;
        }
    }

    public abstract class NamedFastMatcher extends FastMatcher {
        public final String description;

        public final String toString() {
            return this.description;
        }

        public NamedFastMatcher(String description) {
            this.description = description;
        }
    }

    public class Negated extends CharMatcher {
        public final CharMatcher original;

        @Override // com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character character) {
            return matches(character.charValue());
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            return !this.original.matches(c);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matchesAllOf(CharSequence sequence) {
            return this.original.matchesNoneOf(sequence);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matchesNoneOf(CharSequence sequence) {
            return this.original.matchesAllOf(sequence);
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher negate() {
            return this.original;
        }

        public Negated(CharMatcher original) {
            this.original = original;
        }

        public String toString() {
            StringBuilder sbA0w = C60O.A0w();
            sbA0w.append(this.original);
            return AnonymousClass001.A0v(".negate()", sbA0w);
        }
    }

    public class NegatedFastMatcher extends Negated {
    }

    public final class None extends NamedFastMatcher {
        public static final CharMatcher INSTANCE = new None();

        public None() {
            super("CharMatcher.none()");
        }

        @Override // com.google.common.base.CharMatcher.FastMatcher, com.google.common.base.CharMatcher
        public CharMatcher negate() {
            return Any.INSTANCE;
        }

        @Override // com.google.common.base.CharMatcher
        public int indexIn(CharSequence sequence) {
            sequence.getClass();
            return -1;
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            return false;
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matchesAllOf(CharSequence sequence) {
            return AnonymousClass002.A1M(sequence.length());
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matchesNoneOf(CharSequence sequence) {
            sequence.getClass();
            return true;
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher or(CharMatcher other) {
            other.getClass();
            return other;
        }

        @Override // com.google.common.base.CharMatcher
        public String removeFrom(CharSequence sequence) {
            return sequence.toString();
        }

        @Override // com.google.common.base.CharMatcher
        public String replaceFrom(CharSequence sequence, char replacement) {
            return sequence.toString();
        }

        @Override // com.google.common.base.CharMatcher
        public int indexIn(CharSequence sequence, int start) {
            Preconditions.checkPositionIndex(start, sequence.length());
            return -1;
        }
    }

    public final class Or extends CharMatcher {
        public final CharMatcher first;
        public final CharMatcher second;

        @Override // com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character character) {
            return matches(character.charValue());
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            return this.first.matches(c) || this.second.matches(c);
        }

        public String toString() {
            StringBuilder sbA0x = C60O.A0x("CharMatcher.or(");
            sbA0x.append(this.first);
            C8j3.A1K(sbA0x);
            sbA0x.append(this.second);
            return BV7.A10(sbA0x);
        }

        public Or(CharMatcher a, CharMatcher b) {
            this.first = a;
            b.getClass();
            this.second = b;
        }
    }

    public final class Whitespace extends NamedFastMatcher {
        public static final int SHIFT = Integer.numberOfLeadingZeros(31);
        public static final CharMatcher INSTANCE = new Whitespace();

        public Whitespace() {
            super("CharMatcher.whitespace()");
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            return AnonymousClass002.A1Q("\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001\u202f\u00a0\f\u2009\u3000\u2004\u3000\u3000\u2028\n\u2007\u3000".charAt(('\ubf0a' * c) >>> SHIFT), c);
        }
    }

    public static String showCharacter(char c) {
        char[] cArr = new char[6];
        int i = 0;
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        do {
            cArr[5 - i] = HandoffLinkVerifier.HEX_DIGITS.charAt(c & 15);
            c = (char) (c >> 4);
            i++;
        } while (i < 4);
        return String.copyValueOf(cArr);
    }

    public int indexIn(CharSequence sequence) {
        return indexIn(sequence, 0);
    }

    public abstract boolean matches(char c);

    public CharMatcher negate() {
        return new Negated(this);
    }

    public CharMatcher or(CharMatcher other) {
        return new Or(this, other);
    }

    public static CharMatcher anyOf(final CharSequence sequence) {
        int length = sequence.length();
        return length != 0 ? length != 1 ? length != 2 ? new AnyOf(sequence) : new IsEither(sequence.charAt(0), sequence.charAt(1)) : new Is(sequence.charAt(0)) : None.INSTANCE;
    }

    public boolean matchesAllOf(CharSequence sequence) {
        for (int length = sequence.length() - 1; length >= 0; length--) {
            if (!matches(sequence.charAt(length))) {
                return false;
            }
        }
        return true;
    }

    public boolean matchesNoneOf(CharSequence sequence) {
        return AnonymousClass002.A1Q(indexIn(sequence), -1);
    }

    public String removeFrom(CharSequence sequence) {
        String string = sequence.toString();
        int iIndexIn = indexIn(string);
        if (iIndexIn == -1) {
            return string;
        }
        char[] charArray = string.toCharArray();
        int i = 1;
        while (true) {
            iIndexIn++;
            if (iIndexIn == charArray.length) {
                return new String(charArray, 0, iIndexIn - i);
            }
            if (matches(charArray[iIndexIn])) {
                i++;
            } else {
                charArray[iIndexIn - i] = charArray[iIndexIn];
            }
        }
    }

    public String replaceFrom(CharSequence sequence, char replacement) {
        String string = sequence.toString();
        int iIndexIn = indexIn(string);
        if (iIndexIn == -1) {
            return string;
        }
        char[] charArray = string.toCharArray();
        while (true) {
            charArray[iIndexIn] = replacement;
            do {
                iIndexIn++;
                if (iIndexIn >= charArray.length) {
                    return new String(charArray);
                }
            } while (!matches(charArray[iIndexIn]));
        }
    }

    public int indexIn(CharSequence sequence, int start) {
        int length = sequence.length();
        Preconditions.checkPositionIndex(start, length);
        while (start < length) {
            if (!matches(sequence.charAt(start))) {
                start++;
            } else {
                return start;
            }
        }
        return -1;
    }
}
