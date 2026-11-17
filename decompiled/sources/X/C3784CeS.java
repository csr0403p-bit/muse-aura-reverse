package X;

import java.util.Arrays;

/* renamed from: X.CeS, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3784CeS implements InterfaceC3786CeU {
    public static final C3784CeS A01 = new C3784CeS(null);
    public final String A00;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3784CeS) {
            return CS7.A01(this.A00, ((C3784CeS) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00});
    }

    public /* synthetic */ C3784CeS(String str) {
        this.A00 = str;
    }
}
