package X;

import java.util.List;

/* renamed from: X.BbS, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2439BbS {
    public final C2441BbU A00;
    public final List<C2421Bax> A01;

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("QualitySelector{preferredQualities=");
        sbA0x.append(this.A01);
        sbA0x.append(", fallbackStrategy=");
        return BV8.A0v(this.A00, sbA0x);
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/List<LX/Bax;>;LX/BbU;)V */
    public C2439BbS(C2441BbU c2441BbU, List list) {
        if (list.isEmpty()) {
            C2441BbU c2441BbU2 = C2441BbU.A00;
        }
        this.A01 = BV5.A13(list);
        this.A00 = c2441BbU;
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/List<LX/Bax;>;LX/BbU;)LX/BbS; */
    public static C2439BbS A00(C2441BbU c2441BbU, List list) {
        BeS.A06(BV6.A1b(list), "qualities cannot be empty");
        for (Object obj : list) {
            BeS.A06(C2421Bax.A08.contains(obj), AnonymousClass007.A0a("qualities contain invalid quality: ", obj));
        }
        return new C2439BbS(c2441BbU, list);
    }
}
