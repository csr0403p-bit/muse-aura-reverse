package X;

import kotlin.Unit;

/* renamed from: X.2aw, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2aw extends AbstractC7559F3s implements G0U<C2av, Unit> {
    public final /* synthetic */ float $radiusX = 6.0f;
    public final /* synthetic */ float $radiusY = 6.0f;
    public final /* synthetic */ int $tileMode = 3;
    public final /* synthetic */ C1DM $edgeTreatment = null;
    public final /* synthetic */ boolean $clip = false;

    public C2aw() {
        super(1);
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Unit invoke(C2av c2av) {
        C2av c2av2 = c2av;
        float fAh4 = c2av2.Ah4(this.$radiusX);
        float fAh42 = c2av2.Ah4(this.$radiusY);
        c2av2.AeM((fAh4 <= 0.0f || fAh42 <= 0.0f) ? null : new C2b1(fAh4, fAh42, this.$tileMode));
        C1DM c1dm = this.$edgeTreatment;
        if (c1dm == null) {
            c1dm = C1OM.A00;
        }
        c2av2.Aeg(c1dm);
        c2av2.Ad2(this.$clip);
        return Unit.INSTANCE;
    }
}
