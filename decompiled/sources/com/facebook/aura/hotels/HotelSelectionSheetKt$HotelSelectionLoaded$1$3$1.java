package com.facebook.aura.hotels;

import X.AT3;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.B6A;
import X.C16a;
import X.C1EQ;
import X.C7384Etj;
import X.G0U;
import X.HDi;
import X.HxS;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HotelSelectionSheetKt$HotelSelectionLoaded$1$3$1 extends AbstractC7559F3s implements G0U<AT3, Unit> {
    public final /* synthetic */ long $background;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AT3 at3) {
        C7384Etj.A0Y(at3, 0);
        float fAh4 = at3.Ah4(AuraDimensKt.SpacingLargePlusMicro);
        long j = this.$background;
        at3.A9f(C1EQ.A01(AnonymousClass004.A17(new B6A(HxS.A04(HDi.A0O[(int) (j & 63)], B6A.A03(j), B6A.A02(j), B6A.A01(j), 0.0f)), j), -fAh4, 0.0f), null, C16a.A00, 1.0f, 3, (Float.floatToRawIntBits(r2) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32), (Float.floatToRawIntBits(AnonymousClass001.A00(at3.AKb())) << 32) | (4294967295L & Float.floatToRawIntBits(fAh4)));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelSelectionSheetKt$HotelSelectionLoaded$1$3$1(long j) {
        super(1);
        this.$background = j;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AT3 at3) {
        invoke2(at3);
        return Unit.INSTANCE;
    }
}
