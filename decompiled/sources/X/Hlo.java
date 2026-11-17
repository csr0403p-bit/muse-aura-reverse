package X;

/* loaded from: classes6.dex */
public final class Hlo {
    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof Hlo) && Double.compare(2.0d, 2.0d) == 0);
    }

    public final int hashCode() {
        return C8j4.A0B(30L, (HsK.A01(2.0d, AnonymousClass006.A06(1000L, AnonymousClass005.A07(3600000L))) + 5) * 31);
    }

    public final String toString() {
        StringBuilder sbA0z = C60O.A0z("MetaHealthObserverConfig(foregroundThrottleMs=", 3600000L);
        sbA0z.append(", backoffInitialDelayMs=");
        sbA0z.append(1000L);
        sbA0z.append(", backoffMultiplier=");
        sbA0z.append(2.0d);
        sbA0z.append(", maxRetries=");
        sbA0z.append(5);
        sbA0z.append(", tokenExpirationFallbackDays=");
        sbA0z.append(30L);
        return BV7.A10(sbA0z);
    }
}
