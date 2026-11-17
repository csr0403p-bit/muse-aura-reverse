package X;

import java.time.Duration;

/* renamed from: X.FwR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C8989FwR implements InterfaceC2349BUy, InterfaceC8991FwU {
    public static final C8989FwR A00 = new C8989FwR();

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC8991FwU) && (obj instanceof InterfaceC2349BUy)) {
            return C3cI.A1V(obj, getFunctionDelegate());
        }
        return false;
    }

    @Override // X.InterfaceC2349BUy
    public final Ht9<?> getFunctionDelegate() {
        return new C7438Evz(1, Duration.class, "ofMillis", "ofMillis(J)Ljava/time/Duration;", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Duration.ofMillis(C3cG.A05(obj));
    }
}
