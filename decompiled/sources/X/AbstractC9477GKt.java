package X;

/* renamed from: X.GKt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9477GKt {
    public static C6966EdO A00(C9483GKz c9483GKz, Integer num) {
        C9479GKv c9479GKv = c9483GKz.A05;
        if (c9479GKv == C9479GKv.A02) {
            return AbstractC9478GKu.A00;
        }
        if (c9479GKv == C9479GKv.A01) {
            return AbstractC7608F5v.A0S(num);
        }
        if (c9479GKv == C9479GKv.A03) {
            return AbstractC7608F5v.A0T(num);
        }
        throw AbstractC7607F5u.A10(c9479GKv, "Unknown AesCtrHmacAeadParameters.Variant: ");
    }
}
