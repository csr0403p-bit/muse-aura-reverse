package X;

import java.time.Instant;
import java.util.Map;

/* renamed from: X.Fuc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8960Fuc {
    public final FvF A00;
    public final Instant A01;
    public final Map<String, String> A02;

    public C8960Fuc(FvF fvF, Instant instant, Map map) {
        C7384Etj.A0Y(fvF, 0);
        this.A00 = fvF;
        this.A01 = instant;
        this.A02 = map;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8960Fuc) {
                C8960Fuc c8960Fuc = (C8960Fuc) obj;
                if (this.A00 != c8960Fuc.A00 || !this.A01.equals(c8960Fuc.A01) || !this.A02.equals(c8960Fuc.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0F(this.A02, AnonymousClass005.A0F(this.A01, AnonymousClass005.A0E(this.A00))) + BV6.A03(0L);
    }

    public final String toString() {
        FvF fvF = this.A00;
        Instant instant = this.A01;
        Map<String, String> map = this.A02;
        StringBuilder sbA0f = C3cG.A0f(fvF, "MetaHealthEventObserverParams(eventType=");
        sbA0f.append(", startDate=");
        sbA0f.append(instant);
        sbA0f.append(", initialAnchors=");
        sbA0f.append(map);
        sbA0f.append(", bufferInterval=");
        sbA0f.append(0L);
        return BV7.A10(sbA0f);
    }
}
