package X;

import java.util.regex.Matcher;

/* renamed from: X.GMf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9514GMf implements InterfaceC10311GuN {
    public final Matcher A00;

    @Override // X.InterfaceC10311GuN
    public final boolean ABP() {
        return this.A00.find();
    }

    public C9514GMf(Matcher matcher) {
        this.A00 = matcher;
    }
}
