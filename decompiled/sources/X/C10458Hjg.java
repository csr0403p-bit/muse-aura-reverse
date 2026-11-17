package X;

import java.util.Collections;
import java.util.Map;

/* renamed from: X.Hjg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10458Hjg {
    public static final C10458Hjg A01 = new C10458Hjg(Collections.unmodifiableMap(BV4.A0u()));
    public final Map<String, String> A00;

    public final boolean equals(Object obj) {
        if (obj instanceof C10458Hjg) {
            return this.A00.equals(((C10458Hjg) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return this.A00.toString();
    }

    public C10458Hjg(Map<String, String> entries) {
        this.A00 = entries;
    }
}
