package X;

import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
public final class G7A {
    public final ADq A00;
    public final G72 A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof G7A) {
                G7A g7a = (G7A) obj;
                if (!this.A00.equals(g7a.A00) || !this.A01.equals(g7a.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public static List A00(ADq aDq, G72 g72) {
        return Collections.singletonList(new G7A(aDq, g72));
    }

    public static void A01(ADq aDq, G72 g72, C9236G7r c9236G7r) {
        c9236G7r.A01.addAll(Collections.singletonList(new G7A(aDq, g72)));
    }

    public static void A02(ADq aDq, G72 g72, G8K g8k) {
        g8k.A00.add(new G7A(aDq, g72));
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A01, AnonymousClass005.A0E(this.A00));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("Node(range=");
        sbA0x.append(this.A00);
        sbA0x.append(", type=");
        return AnonymousClass007.A0Z(this.A01, sbA0x);
    }

    public G7A(ADq aDq, G72 g72) {
        this.A00 = aDq;
        this.A01 = g72;
    }
}
