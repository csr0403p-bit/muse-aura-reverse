package X;

import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AET extends AbstractC7559F3s implements G0U<AT3, Unit> {
    public final /* synthetic */ long $color;
    public final /* synthetic */ float $cornerRadius;
    public final /* synthetic */ float $strokeWidth;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AET(float f, float f2, long j) {
        super(1);
        this.$color = j;
        this.$cornerRadius = f;
        this.$strokeWidth = f2;
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Unit invoke(AT3 at3) {
        AT3 at32 = at3;
        C7384Etj.A0Y(at32, 0);
        at32.A9j(null, AaJ.A00(null, at32.Ah4(this.$strokeWidth), 0), 1.0f, 3, this.$color, 0L, ART.A00(at32.AKb(), 0L), AnonymousClass003.A0N(C8j3.A0P(at32.Ah4(this.$cornerRadius))));
        return Unit.INSTANCE;
    }
}
