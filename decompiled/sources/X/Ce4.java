package X;

/* loaded from: classes5.dex */
public final class Ce4<T> extends AbstractC3732CdV<T> {
    public final Ce5 A00;
    public final T A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AbstractC3732CdV) {
                Ce4 ce4 = (Ce4) ((AbstractC3732CdV) obj);
                if (!this.A01.equals(ce4.A01) || !this.A00.equals(ce4.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("Event{code=");
        sbA0x.append((Object) null);
        sbA0x.append(", payload=");
        sbA0x.append(this.A01);
        sbA0x.append(", priority=");
        return BV8.A0v(this.A00, sbA0x);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Ce4(Ce5 ce5, Object obj) {
        if (obj == 0) {
            throw BV4.A0a("Null payload");
        }
        this.A01 = obj;
        this.A00 = ce5;
    }

    public final int hashCode() {
        return BV6.A09(this.A00, BV6.A08(this.A01, -721379959));
    }
}
