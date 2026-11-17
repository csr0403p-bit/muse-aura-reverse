package X;

import kotlin.Unit;

/* renamed from: X.AQn, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1029AQn extends AbstractC7559F3s implements G0U<AYU, Unit> {
    public final /* synthetic */ int $maxHeight;
    public final /* synthetic */ int $maxWidth;
    public final /* synthetic */ AZE[] $placeables;
    public final /* synthetic */ C1028AQm this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1029AQn(C1028AQm c1028AQm, AZE[] azeArr, int i, int i2) {
        super(1);
        this.$placeables = azeArr;
        this.this$0 = c1028AQm;
        this.$maxWidth = i;
        this.$maxHeight = i2;
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Unit invoke(AYU ayu) {
        AYU ayu2 = ayu;
        AZE[] azeArr = this.$placeables;
        C1028AQm c1028AQm = this.this$0;
        int i = this.$maxWidth;
        int i2 = this.$maxHeight;
        for (AZE aze : azeArr) {
            if (aze != null) {
                long jA4F = c1028AQm.A00.A01.A4F(EnumC1820Arj.A02, (aze.A01 << 32) | (aze.A00 & 4294967295L), (i2 & 4294967295L) | (i << 32));
                ayu2.A0A(aze, 0.0f, (int) (jA4F >> 32), AnonymousClass002.A09(jA4F));
            }
        }
        return Unit.INSTANCE;
    }
}
