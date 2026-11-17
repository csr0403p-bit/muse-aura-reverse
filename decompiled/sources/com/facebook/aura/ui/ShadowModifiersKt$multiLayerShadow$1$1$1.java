package com.facebook.aura.ui;

import X.AT3;
import X.AW9;
import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.B6A;
import X.C1776AqX;
import X.C7384Etj;
import X.G0U;
import X.HDi;
import X.HxS;
import X.InterfaceC1327AhE;
import X.InterfaceC1330AhH;
import android.graphics.Paint;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class ShadowModifiersKt$multiLayerShadow$1$1$1 extends AbstractC7559F3s implements G0U<AT3, Unit> {
    public final /* synthetic */ float $alpha;
    public final /* synthetic */ float $borderRadius;
    public final /* synthetic */ long $color;
    public final /* synthetic */ int $layers;
    public final /* synthetic */ InterfaceC1330AhH[] $paints;
    public final /* synthetic */ float $shadowRadius;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AT3 at3) {
        C7384Etj.A0Y(at3, 0);
        long j = this.$color;
        int iA01 = HxS.A01(HxS.A04(HDi.A0O[(int) (j & 63)], B6A.A03(j), B6A.A02(j), B6A.A01(j), 0.0f));
        int i = this.$layers;
        float f = this.$alpha;
        float f2 = this.$shadowRadius;
        InterfaceC1330AhH[] interfaceC1330AhHArr = this.$paints;
        long j2 = this.$color;
        float f3 = this.$borderRadius;
        for (int i2 = 0; i2 < i; i2++) {
            float f4 = i2;
            float fAh4 = at3.Ah4(f2) * ((f4 * 0.3f) + 1.0f);
            InterfaceC1327AhE interfaceC1327AhEA01 = AW9.A01(at3);
            InterfaceC1330AhH interfaceC1330AhH = interfaceC1330AhHArr[i2];
            Paint paint = ((C1776AqX) interfaceC1330AhH).A01;
            paint.setColor(iA01);
            paint.setShadowLayer(fAh4, 0.0f, 0.0f, HxS.A01(HxS.A04(HDi.A0O[(int) (j2 & 63)], B6A.A03(j2), B6A.A02(j2), B6A.A01(j2), (1.0f - (0.2f * f4)) * f)));
            long jAKb = at3.AKb();
            interfaceC1327AhEA01.A9h(interfaceC1330AhH, 0.0f, 0.0f, AnonymousClass003.A03(jAKb), AnonymousClass004.A00(jAKb), at3.Ah4(f3), at3.Ah4(f3));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShadowModifiersKt$multiLayerShadow$1$1$1(long j, int i, float f, float f2, InterfaceC1330AhH[] interfaceC1330AhHArr, float f3) {
        super(1);
        this.$color = j;
        this.$layers = i;
        this.$alpha = f;
        this.$shadowRadius = f2;
        this.$paints = interfaceC1330AhHArr;
        this.$borderRadius = f3;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AT3 at3) {
        invoke2(at3);
        return Unit.INSTANCE;
    }
}
