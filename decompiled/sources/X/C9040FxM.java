package X;

import java.time.Instant;
import java.util.List;

/* renamed from: X.FxM, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9040FxM {
    public final List<C9034FxG> A00;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9040FxM) {
            return this.A00.equals(((C9040FxM) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return AnonymousClass007.A0Z(this.A00, C60O.A0x("ExerciseRoute(route="));
    }

    public C9040FxM(List<C9034FxG> list) {
        this.A00 = list;
        List listA1I = Hr7.A1I(list, 10);
        int iA0E = AnonymousClass002.A0E(listA1I);
        int i = 0;
        while (i < iA0E) {
            Instant instant = ((C9034FxG) listA1I.get(i)).A05;
            i++;
            if (!instant.isBefore(((C9034FxG) listA1I.get(i)).A05)) {
                throw C60O.A0i("Failed requirement.");
            }
        }
    }
}
