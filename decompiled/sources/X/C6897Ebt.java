package X;

/* renamed from: X.Ebt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6897Ebt {
    public final int A00;
    public final C6788EZx A01;
    public final C6788EZx A02;
    public static final C6788EZx A03 = C6788EZx.A02(":");
    public static final C6788EZx A04 = C6788EZx.A02(":status");
    public static final C6788EZx A06 = C6788EZx.A02(":method");
    public static final C6788EZx A07 = C6788EZx.A02(":path");
    public static final C6788EZx A08 = C6788EZx.A02(":scheme");
    public static final C6788EZx A05 = C6788EZx.A02(":authority");

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6897Ebt) {
                C6897Ebt c6897Ebt = (C6897Ebt) obj;
                if (!this.A01.equals(c6897Ebt.A01) || !this.A02.equals(c6897Ebt.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A02, AnonymousClass005.A0E(this.A01));
    }

    public final String toString() {
        return FGI.A0U(this.A01.A07(), ": ", this.A02.A07());
    }

    public C6897Ebt(C6788EZx c6788EZx, C6788EZx c6788EZx2) {
        AnonymousClass003.A0u(c6788EZx, c6788EZx2);
        this.A01 = c6788EZx;
        this.A02 = c6788EZx2;
        this.A00 = c6788EZx.A0C() + 32 + c6788EZx2.A0C();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6897Ebt(String str, C6788EZx c6788EZx) {
        this(c6788EZx, C6788EZx.A02(str));
        C7384Etj.A0Y(str, 1);
    }
}
