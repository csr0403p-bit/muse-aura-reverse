package X;

/* renamed from: X.GKs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9476GKs {
    public static C6966EdO A00(GL0 gl0, Integer num) {
        C9480GKw c9480GKw = gl0.A03;
        if (c9480GKw == C9480GKw.A02) {
            return AbstractC9478GKu.A00;
        }
        if (c9480GKw == C9480GKw.A01) {
            return AbstractC7608F5v.A0S(num);
        }
        if (c9480GKw == C9480GKw.A03) {
            return AbstractC7608F5v.A0T(num);
        }
        throw AbstractC7607F5u.A10(c9480GKw, "Unknown AesEaxParameters.Variant: ");
    }
}
