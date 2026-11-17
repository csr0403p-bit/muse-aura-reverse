package X;

import kotlin.Unit;

/* loaded from: classes4.dex */
public final class ARm extends AbstractC7559F3s implements G0U<AYU, Unit> {
    public final /* synthetic */ AZE $star;
    public final /* synthetic */ int $starY;
    public final /* synthetic */ AZE $text;
    public final /* synthetic */ int $textX;
    public final /* synthetic */ int $top;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ARm(AZE aze, AZE aze2, int i, int i2, int i3) {
        super(1);
        this.$star = aze;
        this.$starY = i;
        this.$top = i2;
        this.$text = aze2;
        this.$textX = i3;
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Unit invoke(AYU ayu) {
        AYU ayu2 = ayu;
        C7384Etj.A0Y(ayu2, 0);
        AZE aze = this.$star;
        if (aze != null) {
            AYU.A04(ayu2, aze, 0, this.$starY - this.$top);
        }
        AYU.A04(ayu2, this.$text, this.$textX, -this.$top);
        return Unit.INSTANCE;
    }
}
