package X;

import java.time.Instant;
import java.util.List;
import java.util.Map;

/* renamed from: X.Fub, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8959Fub {
    public final Instant A00;
    public final List<Fw6> A01;
    public final Map<String, String> A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8959Fub) {
                C8959Fub c8959Fub = (C8959Fub) obj;
                if (!this.A01.equals(c8959Fub.A01) || !this.A00.equals(c8959Fub.A00) || !this.A02.equals(c8959Fub.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0F(this.A02, AnonymousClass005.A0F(this.A00, AnonymousClass005.A0E(this.A01))) + BV6.A03(0L);
    }

    public final String toString() {
        List<Fw6> list = this.A01;
        Instant instant = this.A00;
        Map<String, String> map = this.A02;
        StringBuilder sbA0f = C3cG.A0f(list, "MetaHealthObserverParams(metricTypes=");
        sbA0f.append(", startDate=");
        sbA0f.append(instant);
        sbA0f.append(", initialAnchors=");
        sbA0f.append(map);
        sbA0f.append(", bufferInterval=");
        sbA0f.append(0L);
        return BV7.A10(sbA0f);
    }

    public C8959Fub(Instant instant, List list, Map map) {
        this.A01 = list;
        this.A00 = instant;
        this.A02 = map;
    }
}
