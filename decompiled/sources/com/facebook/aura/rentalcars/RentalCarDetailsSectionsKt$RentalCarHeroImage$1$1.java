package com.facebook.aura.rentalcars;

import X.ART;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C16Z;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class RentalCarDetailsSectionsKt$RentalCarHeroImage$1$1 extends AbstractC7559F3s implements G0U<C16Z, Unit> {
    public final /* synthetic */ long $borderColor;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C16Z c16z) {
        C16Z.A00(c16z);
        float fAh4 = c16z.Ah4(1.0f);
        long j = this.$borderColor;
        long jAKb = c16z.AKb();
        float fA01 = AnonymousClass001.A01(jAKb, 4294967295L) - fAh4;
        ART.A03(null, c16z, 0.0f, 120, j, (Float.floatToRawIntBits(fA01) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32), (4294967295L & Float.floatToRawIntBits(fAh4)) | (Float.floatToRawIntBits(AnonymousClass001.A00(jAKb)) << 32));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RentalCarDetailsSectionsKt$RentalCarHeroImage$1$1(long j) {
        super(1);
        this.$borderColor = j;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C16Z c16z) {
        invoke2(c16z);
        return Unit.INSTANCE;
    }
}
