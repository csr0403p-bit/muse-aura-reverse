package X;

import kotlin.Unit;

/* loaded from: classes4.dex */
public final class BIL extends AbstractC7559F3s implements G0U<AYU, Unit> {
    public final /* synthetic */ int $height;
    public final /* synthetic */ AZE $placeable;
    public final /* synthetic */ int $width;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BIL(AZE aze, int i, int i2) {
        super(1);
        this.$width = i;
        this.$placeable = aze;
        this.$height = i2;
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Unit invoke(AYU ayu) {
        int i = this.$width;
        ayu.A0A(this.$placeable, 0.0f, Ab3.A01((i - r4.A01) / 2.0f), Ab3.A01((this.$height - r4.A00) / 2.0f));
        return Unit.INSTANCE;
    }
}
