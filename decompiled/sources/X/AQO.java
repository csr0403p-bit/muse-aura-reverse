package X;

import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AQO extends AbstractC7559F3s implements G0U<AYU, Unit> {
    public final /* synthetic */ long $constrainedSize;
    public final /* synthetic */ AZE $p;
    public final /* synthetic */ AXY $this_measure;
    public final /* synthetic */ AQP this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AQO(AQP aqp, AXY axy, AZE aze, long j) {
        super(1);
        this.this$0 = aqp;
        this.$p = aze;
        this.$constrainedSize = j;
        this.$this_measure = axy;
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Unit invoke(AYU ayu) {
        AYU ayu2 = ayu;
        APN apn = (APN) this.this$0.A03.getValue();
        if (apn == null) {
            AYU.A02(ayu2, this.$p);
        } else {
            ARL arl = apn.A01;
            long j = this.this$0.A00;
            int i = (int) (j >> 32);
            long jA0J = (i == 0 || ((int) (j & 4294967295L)) == 0) ? C8j4.A0J(1.0f) : arl.A6j(AQY.A01(j), AQY.A01(this.$constrainedSize));
            long jA4F = apn.A00.A4F(this.$this_measure.getLayoutDirection(), C8j3.A0S(Ab3.A02(i, AnonymousClass001.A00(jA0J)), Ab3.A02((int) (j & 4294967295L), AnonymousClass001.A01(jA0J, 4294967295L))), this.$constrainedSize);
            ayu2.A0C(this.$p, new C1b7(jA0J), (int) (jA4F >> 32), AnonymousClass002.A09(jA4F));
        }
        return Unit.INSTANCE;
    }
}
