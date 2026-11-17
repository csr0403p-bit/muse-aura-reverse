package X;

import X.InterfaceC3786CeU;

/* renamed from: X.CrJ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4247CrJ<O extends InterfaceC3786CeU> {
    public final C4240CrC A00;
    public final int A01;
    public final InterfaceC3786CeU A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (obj != null) {
            if (obj != this) {
                if (obj instanceof C4247CrJ) {
                    C4247CrJ c4247CrJ = (C4247CrJ) obj;
                    if (!CS7.A01(this.A00, c4247CrJ.A00) || !CS7.A01(this.A02, c4247CrJ.A02) || !CS7.A01(this.A03, c4247CrJ.A03)) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.A01;
    }

    public C4247CrJ(InterfaceC3786CeU interfaceC3786CeU, C4240CrC c4240CrC, String str) {
        this.A00 = c4240CrC;
        this.A02 = interfaceC3786CeU;
        this.A03 = str;
        this.A01 = BV7.A0E(c4240CrC, interfaceC3786CeU, str);
    }
}
