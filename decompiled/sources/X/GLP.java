package X;

/* loaded from: classes6.dex */
public abstract class GLP {
    public static C6966EdO A00(GLO glo, Integer num) {
        C9484GLa c9484GLa = glo.A03;
        if (c9484GLa == C9484GLa.A03) {
            return AbstractC9478GKu.A00;
        }
        if (c9484GLa == C9484GLa.A02 || c9484GLa == C9484GLa.A01) {
            return AbstractC7608F5v.A0S(num);
        }
        if (c9484GLa == C9484GLa.A04) {
            return AbstractC7608F5v.A0T(num);
        }
        throw AbstractC7607F5u.A10(c9484GLa, "Unknown HmacParameters.Variant: ");
    }
}
