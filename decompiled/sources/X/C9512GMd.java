package X;

import java.util.regex.Pattern;
import org.jsoup.helper.ValidationException;

/* renamed from: X.GMd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9512GMd extends C9511GMc {
    public static final Pattern A01 = Pattern.compile("");
    public final com.google.re2j.Pattern A00;

    public C9512GMd(com.google.re2j.Pattern pattern) {
        super(A01);
        this.A00 = pattern;
    }

    @Override // X.C9511GMc
    public final InterfaceC10311GuN A02(CharSequence charSequence) {
        return new C9513GMe(this.A00.matcher(charSequence));
    }

    @Override // X.C9511GMc
    public final String toString() {
        return this.A00.toString();
    }

    public static C9512GMd A01(String str) {
        try {
            return new C9512GMd(com.google.re2j.Pattern.compile(str));
        } catch (OutOfMemoryError | StackOverflowError unused) {
            throw new ValidationException("Pattern complexity error");
        } catch (RuntimeException e) {
            throw new ValidationException(BV5.A0n("Pattern syntax error: ", e));
        }
    }
}
