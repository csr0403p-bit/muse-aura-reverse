package X;

import java.util.Map;

/* renamed from: X.CFv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3349CFv extends C3348CFu<Object> {
    public C3349CFv() {
        super(null);
    }

    @Override // X.C3348CFu, X.Eu1
    public final synchronized void APu() {
        if (this.A00) {
            throw BV4.A0c("You are trying to log an event that has already been logged, please acquire a new event with your event's USL Factory.");
        }
        this.A00 = true;
    }

    @Override // X.C3348CFu, X.Eu1
    public final boolean isSampled() {
        return false;
    }

    @Override // X.C3348CFu, X.Eu1
    public final void A3P(String str, Boolean bool) {
    }

    @Override // X.C3348CFu, X.Eu1
    public final void A3f(String str, Long l) {
    }

    @Override // X.C3348CFu, X.Eu1
    public final void A3g(String str, Map<?, ?> map) {
    }

    @Override // X.C3348CFu, X.Eu1
    public final void A3y(String str, String str2) {
    }
}
