package X;

import X.BV5;
import X.C60O;
import com.google.common.base.Ascii;
import com.google.common.base.CharMatcher;
import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;

/* renamed from: X.E5d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6426E5d {
    public static final CharMatcher A02;
    public static final CharMatcher A03;
    public static final CharMatcher A05;
    public static final CharMatcher A06;
    public final ImmutableList<String> A00;
    public final String A01;
    public static final CharMatcher A04 = CharMatcher.anyOf(".\u3002\uff0e\uff61");
    public static final Splitter A07 = Splitter.on('.');

    static {
        CharMatcher charMatcherAnyOf = CharMatcher.anyOf("-_");
        A02 = charMatcherAnyOf;
        CharMatcher.InRange inRange = new CharMatcher.InRange('0', '9');
        A03 = inRange;
        CharMatcher charMatcherOr = new CharMatcher.InRange('a', 'z').or(new CharMatcher.InRange('A', 'Z'));
        A05 = charMatcherOr;
        A06 = inRange.or(charMatcherOr).or(charMatcherAnyOf);
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof C6426E5d) {
            return this.A01.equals(((C6426E5d) object).A01);
        }
        return false;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public final String toString() {
        return this.A01;
    }

    public C6426E5d(String name) {
        boolean z;
        final String lowerCase = Ascii.toLowerCase(A04.replaceFrom(name, '.'));
        lowerCase = lowerCase.endsWith(".") ? lowerCase.substring(0, lowerCase.length() - 1) : lowerCase;
        Preconditions.checkArgument(BV7.A1S(lowerCase.length(), 253), "Domain name too long: '%s':", lowerCase);
        this.A01 = lowerCase;
        final Splitter splitter = A07;
        ImmutableList<String> immutableListCopyOf = ImmutableList.copyOf(new Iterable<String>() { // from class: com.google.common.base.Splitter.5
            public final /* synthetic */ Splitter this$0;
            public final /* synthetic */ CharSequence val$sequence;

            public AnonymousClass5(final Splitter splitter2, final CharSequence lowerCase2) {
                val$sequence = lowerCase2;
                this$0 = splitter2;
            }

            @Override // java.lang.Iterable
            public Iterator<String> iterator() {
                Splitter splitter2 = this$0;
                return splitter2.strategy.new C04511(splitter2, val$sequence);
            }

            public String toString() {
                Joiner joiner = new Joiner(", ");
                StringBuilder sbA0w = C60O.A0w();
                sbA0w.append('[');
                joiner.appendTo(sbA0w, iterator());
                return BV5.A0o(sbA0w);
            }
        });
        this.A00 = immutableListCopyOf;
        Preconditions.checkArgument(immutableListCopyOf.size() <= 127, "Domain has too many parts: '%s'", lowerCase2);
        int size = immutableListCopyOf.size() - 1;
        if (!A00(C60Q.A0n(immutableListCopyOf, size), true)) {
            z = false;
            break;
        }
        for (int i = 0; i < size; i++) {
            if (!A00(C60Q.A0n(immutableListCopyOf, i), false)) {
                z = false;
                break;
            }
        }
        z = true;
        Preconditions.checkArgument(z, "Not a valid domain name: '%s'", lowerCase2);
    }

    public static boolean A00(String part, boolean isFinalPart) {
        int length = part.length();
        if (length >= 1 && length <= 63) {
            if (A06.matchesAllOf(CharMatcher.Ascii.INSTANCE.negate().removeFrom(part))) {
                CharMatcher charMatcher = A02;
                if (!charMatcher.matches(part.charAt(0)) && !charMatcher.matches(part.charAt(length - 1)) && (!isFinalPart || !A03.matches(part.charAt(0)))) {
                    return true;
                }
            }
        }
        return false;
    }
}
