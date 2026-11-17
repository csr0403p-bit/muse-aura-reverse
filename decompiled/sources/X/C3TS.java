package X;

import kotlin.Unit;

/* renamed from: X.3TS, reason: invalid class name */
/* loaded from: classes.dex */
public final class C3TS extends AbstractC7559F3s implements G0U<AYU, Unit> {
    public final /* synthetic */ AZE $containerPlaceable;
    public final /* synthetic */ AZE $labelPlaceable;
    public final /* synthetic */ AZE $leadingPlaceable;
    public final /* synthetic */ AZE $placeholderPlaceable;
    public final /* synthetic */ AZE $prefixPlaceable;
    public final /* synthetic */ AZE $suffixPlaceable;
    public final /* synthetic */ AZE $supportingPlaceable;
    public final /* synthetic */ AZE $textFieldPlaceable;
    public final /* synthetic */ AXY $this_measure;
    public final /* synthetic */ int $totalHeight;
    public final /* synthetic */ AZE $trailingPlaceable;
    public final /* synthetic */ int $width;
    public final /* synthetic */ C3TT this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3TS(C3TT c3tt, AXY axy, AZE aze, AZE aze2, AZE aze3, AZE aze4, AZE aze5, AZE aze6, AZE aze7, AZE aze8, AZE aze9, int i, int i2) {
        super(1);
        this.$totalHeight = i;
        this.$width = i2;
        this.$leadingPlaceable = aze;
        this.$trailingPlaceable = aze2;
        this.$prefixPlaceable = aze3;
        this.$suffixPlaceable = aze4;
        this.$textFieldPlaceable = aze5;
        this.$labelPlaceable = aze6;
        this.$placeholderPlaceable = aze7;
        this.$containerPlaceable = aze8;
        this.$supportingPlaceable = aze9;
        this.this$0 = c3tt;
        this.$this_measure = axy;
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Unit invoke(AYU ayu) {
        AYU ayu2 = ayu;
        int i = this.$totalHeight;
        int i2 = this.$width;
        AZE aze = this.$leadingPlaceable;
        AZE aze2 = this.$trailingPlaceable;
        AZE aze3 = this.$prefixPlaceable;
        AZE aze4 = this.$suffixPlaceable;
        AZE aze5 = this.$textFieldPlaceable;
        AZE aze6 = this.$labelPlaceable;
        AZE aze7 = this.$placeholderPlaceable;
        AZE aze8 = this.$containerPlaceable;
        AZE aze9 = this.$supportingPlaceable;
        C3TT c3tt = this.this$0;
        float f = c3tt.A00;
        boolean z = c3tt.A02;
        float fAEm = this.$this_measure.AEm();
        EnumC1820Arj layoutDirection = this.$this_measure.getLayoutDirection();
        C3TQ c3tq = this.this$0.A01;
        long j = C1A3.A00;
        ayu2.A0B(aze8, 0.0f, 0L);
        BRg bRg = AbstractC046219w.A01;
        int iA09 = i - AnonymousClass006.A09(aze9);
        int iA01 = Ab3.A01(((C1DP) c3tq).A03 * fAEm);
        int iA012 = Ab3.A01(C3U4.A01(c3tq, layoutDirection) * fAEm);
        float f2 = 12.0f * fAEm;
        AnonymousClass007.A15(ayu2, aze, iA09);
        if (aze6 != null) {
            AYU.A04(ayu2, aze6, Ab3.A01(aze == null ? 0.0f : (aze.A01 - f2) * (1.0f - f)) + iA012, C3WD.A01(f, z ? C1AC.A00(aze6, iA09) : iA01, -(aze6.A00 / 2)));
        }
        if (aze3 != null) {
            int iA0C = AnonymousClass006.A0C(aze);
            int iA00 = iA01;
            if (z) {
                iA00 = C1AC.A00(aze3, iA09);
            }
            AYU.A04(ayu2, aze3, iA0C, Math.max(iA00, AnonymousClass006.A09(aze6) / 2));
        }
        int iA0B = AnonymousClass006.A0B(aze) + AnonymousClass006.A0C(aze3);
        int iA002 = iA01;
        if (z) {
            iA002 = C1AC.A00(aze5, iA09);
        }
        AYU.A04(ayu2, aze5, iA0B, Math.max(iA002, AnonymousClass006.A09(aze6) / 2));
        if (aze7 != null) {
            int iA003 = iA01;
            if (z) {
                iA003 = C1AC.A00(aze7, iA09);
            }
            AYU.A04(ayu2, aze7, iA0B, Math.max(iA003, AnonymousClass006.A09(aze6) / 2));
        }
        if (aze4 != null) {
            int iA0C2 = (i2 - AnonymousClass006.A0C(aze2)) - aze4.A01;
            if (z) {
                iA01 = C1AC.A00(aze4, iA09);
            }
            AYU.A04(ayu2, aze4, iA0C2, Math.max(iA01, AnonymousClass006.A09(aze6) / 2));
        }
        AnonymousClass007.A16(ayu2, aze2, i2, iA09);
        if (aze9 != null) {
            AYU.A04(ayu2, aze9, 0, iA09);
        }
        return Unit.INSTANCE;
    }
}
