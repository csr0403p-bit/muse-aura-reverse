package X;

import java.time.LocalDateTime;

/* renamed from: X.Fwu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9017Fwu implements Fx6<LocalDateTime> {
    public final LocalDateTime A00;
    public final LocalDateTime A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9017Fwu) {
                C9017Fwu c9017Fwu = (C9017Fwu) obj;
                if (!this.A01.equals(c9017Fwu.A01) || !this.A00.equals(c9017Fwu.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A00, AnonymousClass005.A0E(this.A01));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("LocalTimeRange(startTime=");
        AbstractC7608F5v.A1P(sbA0x, this.A01);
        return AnonymousClass007.A0Z(this.A00, sbA0x);
    }

    public C9017Fwu(LocalDateTime localDateTime, LocalDateTime localDateTime2) {
        this.A01 = localDateTime;
        this.A00 = localDateTime2;
    }
}
