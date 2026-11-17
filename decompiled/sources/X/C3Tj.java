package X;

import kotlin.Unit;

/* renamed from: X.3Tj, reason: invalid class name */
/* loaded from: classes.dex */
public final class C3Tj extends AbstractC7559F3s implements G0U<AYU, Unit> {
    public final /* synthetic */ AZE $containerPlaceable;
    public final /* synthetic */ AZE $labelPlaceable;
    public final /* synthetic */ AZE $leadingPlaceable;
    public final /* synthetic */ AZE $placeholderPlaceable;
    public final /* synthetic */ AZE $prefixPlaceable;
    public final /* synthetic */ AZE $suffixPlaceable;
    public final /* synthetic */ AZE $supportingPlaceable;
    public final /* synthetic */ AZE $textFieldPlaceable;
    public final /* synthetic */ AXY $this_measure;
    public final /* synthetic */ int $topPaddingValue;
    public final /* synthetic */ int $totalHeight;
    public final /* synthetic */ AZE $trailingPlaceable;
    public final /* synthetic */ int $width;
    public final /* synthetic */ C3TV this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3Tj(C3TV c3tv, AXY axy, AZE aze, AZE aze2, AZE aze3, AZE aze4, AZE aze5, AZE aze6, AZE aze7, AZE aze8, AZE aze9, int i, int i2, int i3) {
        super(1);
        this.$labelPlaceable = aze;
        this.$width = i;
        this.$totalHeight = i2;
        this.$textFieldPlaceable = aze2;
        this.$placeholderPlaceable = aze3;
        this.$leadingPlaceable = aze4;
        this.$trailingPlaceable = aze5;
        this.$prefixPlaceable = aze6;
        this.$suffixPlaceable = aze7;
        this.$containerPlaceable = aze8;
        this.$supportingPlaceable = aze9;
        this.this$0 = c3tv;
        this.$topPaddingValue = i3;
        this.$this_measure = axy;
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Unit invoke(AYU ayu) {
        AZE aze;
        AZE aze2;
        int iA09;
        AYU ayu2 = ayu;
        AZE aze3 = this.$labelPlaceable;
        int i = this.$width;
        int i2 = this.$totalHeight;
        if (aze3 != null) {
            AZE aze4 = this.$textFieldPlaceable;
            AZE aze5 = this.$placeholderPlaceable;
            AZE aze6 = this.$leadingPlaceable;
            aze = this.$trailingPlaceable;
            AZE aze7 = this.$prefixPlaceable;
            AZE aze8 = this.$suffixPlaceable;
            AZE aze9 = this.$containerPlaceable;
            aze2 = this.$supportingPlaceable;
            C3TV c3tv = this.this$0;
            boolean z = c3tv.A02;
            int i3 = this.$topPaddingValue + aze3.A00;
            float f = c3tv.A00;
            float fAEm = this.$this_measure.AEm();
            ayu2.A0B(aze9, 0.0f, 0L);
            BRg bRg = AbstractC046219w.A01;
            iA09 = i2 - AnonymousClass006.A09(aze2);
            AnonymousClass007.A15(ayu2, aze6, iA09);
            AYU.A04(ayu2, aze3, AnonymousClass006.A0C(aze6), (z ? C1AC.A00(aze3, iA09) : Ab3.A01(16.0f * fAEm)) - Ab3.A01((r1 - r14) * f));
            if (aze7 != null) {
                AYU.A04(ayu2, aze7, AnonymousClass006.A0C(aze6), i3);
            }
            int iA0B = AnonymousClass006.A0B(aze6) + AnonymousClass006.A0C(aze7);
            AYU.A04(ayu2, aze4, iA0B, i3);
            if (aze5 != null) {
                AYU.A04(ayu2, aze5, iA0B, i3);
            }
            if (aze8 != null) {
                AYU.A04(ayu2, aze8, (i - AnonymousClass006.A0C(aze)) - aze8.A01, i3);
            }
        } else {
            AZE aze10 = this.$textFieldPlaceable;
            AZE aze11 = this.$placeholderPlaceable;
            AZE aze12 = this.$leadingPlaceable;
            aze = this.$trailingPlaceable;
            AZE aze13 = this.$prefixPlaceable;
            AZE aze14 = this.$suffixPlaceable;
            AZE aze15 = this.$containerPlaceable;
            aze2 = this.$supportingPlaceable;
            boolean z2 = this.this$0.A02;
            float fAEm2 = this.$this_measure.AEm();
            C3TQ c3tq = this.this$0.A01;
            ayu2.A0B(aze15, 0.0f, 0L);
            BRg bRg2 = AbstractC046219w.A01;
            iA09 = i2 - AnonymousClass006.A09(aze2);
            int iA01 = Ab3.A01(((C1DP) c3tq).A03 * fAEm2);
            AnonymousClass007.A15(ayu2, aze12, iA09);
            if (aze13 != null) {
                AYU.A04(ayu2, aze13, AnonymousClass006.A0B(aze12), z2 ? C1AC.A00(aze13, iA09) : iA01);
            }
            int iA0C = AnonymousClass006.A0C(aze13) + AnonymousClass006.A0B(aze12);
            AYU.A04(ayu2, aze10, iA0C, z2 ? C1AC.A00(aze10, iA09) : iA01);
            if (aze11 != null) {
                AYU.A04(ayu2, aze11, iA0C, z2 ? C1AC.A00(aze11, iA09) : iA01);
            }
            if (aze14 != null) {
                int iA0C2 = (i - AnonymousClass006.A0C(aze)) - aze14.A01;
                if (z2) {
                    iA01 = C1AC.A00(aze14, iA09);
                }
                AYU.A04(ayu2, aze14, iA0C2, iA01);
            }
        }
        AnonymousClass007.A16(ayu2, aze, i, iA09);
        if (aze2 != null) {
            AYU.A04(ayu2, aze2, 0, iA09);
        }
        return Unit.INSTANCE;
    }
}
