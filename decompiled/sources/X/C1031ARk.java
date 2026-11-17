package X;

import kotlin.Unit;

/* renamed from: X.ARk, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1031ARk extends AbstractC7559F3s implements G0U<AYU, Unit> {
    public final /* synthetic */ int $height;
    public final /* synthetic */ long $measuredSize;
    public final /* synthetic */ AZE $placeable;
    public final /* synthetic */ AXY $this_measure;
    public final /* synthetic */ int $width;
    public final /* synthetic */ C1030ARg this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1031ARk(C1030ARg c1030ARg, AXY axy, AZE aze, int i, int i2, long j) {
        super(1);
        this.this$0 = c1030ARg;
        this.$measuredSize = j;
        this.$width = i;
        this.$height = i2;
        this.$this_measure = axy;
        this.$placeable = aze;
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Unit invoke(AYU ayu) {
        ayu.A0B(this.$placeable, 0.0f, this.this$0.A02.A4F(this.$this_measure.getLayoutDirection(), this.$measuredSize, AnonymousClass007.A0C(this.$width, this.$height)));
        return Unit.INSTANCE;
    }
}
