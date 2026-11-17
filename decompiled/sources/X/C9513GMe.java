package X;

import com.google.re2j.Matcher;
import org.jsoup.helper.ValidationException;

/* renamed from: X.GMe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9513GMe implements InterfaceC10311GuN {
    public final Matcher A00;

    @Override // X.InterfaceC10311GuN
    public final boolean ABP() {
        try {
            return this.A00.find();
        } catch (OutOfMemoryError | StackOverflowError unused) {
            throw new ValidationException("Pattern complexity error");
        }
    }

    public C9513GMe(Matcher matcher) {
        this.A00 = matcher;
    }
}
