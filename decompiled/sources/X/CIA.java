package X;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public final class CIA {
    public static final AtomicInteger A03 = BV4.A13(-1);
    public Boolean A00;
    public final C4931DFd A01;
    public final String A02;

    public CIA(C4931DFd c4931DFd, String str) {
        C7384Etj.A0Y(str, 1);
        this.A02 = str;
        this.A01 = c4931DFd;
    }

    public final boolean A00() {
        Boolean bool = this.A00;
        return bool != null ? bool.booleanValue() : C7BY.A0q(this.A02, "bg", false);
    }

    public CIA(C4931DFd c4931DFd, String str, boolean z) {
        C7384Etj.A0Y(str, 1);
        this.A02 = str;
        this.A01 = c4931DFd;
        this.A00 = true;
    }
}
