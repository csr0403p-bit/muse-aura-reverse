package X;

import java.time.Instant;

/* renamed from: X.FuX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8955FuX {
    public final String A00;
    public final String A01;
    public final Instant A02;
    public final Instant A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8955FuX) {
                C8955FuX c8955FuX = (C8955FuX) obj;
                if (!this.A03.equals(c8955FuX.A03) || !C7384Etj.areEqual(this.A02, c8955FuX.A02) || !this.A01.equals(c8955FuX.A01) || !this.A00.equals(c8955FuX.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0I(this.A00, AnonymousClass005.A0I(this.A01, (AnonymousClass005.A0E(this.A03) + AnonymousClass006.A0D(this.A02)) * 31)) + 1000;
    }

    public final String toString() {
        Instant instant = this.A03;
        Instant instant2 = this.A02;
        String str = this.A01;
        String str2 = this.A00;
        StringBuilder sbA0f = C3cG.A0f(instant, "MetaHealthSleepSessionQueryParams(startDate=");
        sbA0f.append(", endDate=");
        sbA0f.append(instant2);
        AbstractC7610F5x.A1N(str, str2, sbA0f);
        return AbstractC7610F5x.A0x(", limit=", sbA0f, 1000);
    }

    public C8955FuX(String str, String str2, Instant instant, Instant instant2) {
        AnonymousClass003.A0v(instant, str);
        this.A03 = instant;
        this.A02 = instant2;
        this.A01 = str;
        this.A00 = str2;
    }
}
