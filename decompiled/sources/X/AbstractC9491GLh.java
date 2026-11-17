package X;

/* renamed from: X.GLh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9491GLh {
    public static C6966EdO A00(C9490GLg c9490GLg, Integer num) {
        C9486GLc c9486GLc = c9490GLg.A01;
        if (c9486GLc == C9486GLc.A02) {
            return AbstractC9478GKu.A00;
        }
        if (c9486GLc == C9486GLc.A01) {
            return AbstractC7608F5v.A0S(num);
        }
        if (c9486GLc == C9486GLc.A03) {
            return AbstractC7608F5v.A0T(num);
        }
        throw AbstractC7607F5u.A10(c9486GLc, "Unknown AesSivParameters.Variant: ");
    }
}
