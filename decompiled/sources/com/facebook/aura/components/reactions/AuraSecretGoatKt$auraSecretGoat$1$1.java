package com.facebook.aura.components.reactions;

import X.AHD;
import X.AT2;
import X.AT5;
import X.ATD;
import X.AWx;
import X.AXN;
import X.AbstractC0885AGm;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.B6A;
import X.C16Z;
import X.C1710Aot;
import X.C8j3;
import X.C8j4;
import X.F60;
import X.G0U;
import X.InterfaceC1068ATy;
import android.graphics.Path;
import androidx.compose.runtime.MutableState;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AuraSecretGoatKt$auraSecretGoat$1$1 extends AbstractC7559F3s implements G0U<C16Z, Unit> {
    public final /* synthetic */ AHD<B6A> $palette;
    public final /* synthetic */ InterfaceC1068ATy $path;
    public final /* synthetic */ AT5<Float, ?> $progress;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSecretGoatKt$auraSecretGoat$1$1(AT5<Float, ?> at5, AHD<B6A> ahd, InterfaceC1068ATy interfaceC1068ATy) {
        super(1);
        this.$progress = at5;
        this.$palette = ahd;
        this.$path = interfaceC1068ATy;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C16Z c16z) {
        boolean zA1X = C8j4.A1X(c16z);
        float fA00 = MutableState.A00(this.$progress);
        if (fA00 <= 0.0f || fA00 >= 1.0f || this.$palette.isEmpty()) {
            return;
        }
        float f = fA00 * 900.0f;
        float f2 = (f - 160.0f) / 80.0f;
        if (f2 > 0.0f) {
            float f3 = (f - 680.0f) / 220.0f;
            if (f2 > 1.0f) {
                f2 = 1.0f;
            }
            float fA03 = f2 - ATD.A03(f3, 0.0f, 1.0f);
            if (fA03 > 0.0f) {
                float fA002 = AXN.A00(c16z);
                float fA02 = ATD.A02(f - 220.0f, 220.0f);
                float fA01 = AnonymousClass001.A01(c16z.ADU(), 4294967295L) + (C8j3.A02(-13.0f, -24.0f, fA02 * fA02 * fA02) * fA002);
                ((C1710Aot) this.$path).A03.reset();
                List<AWx> list = AuraSecretGoatKt.CrownPoints;
                InterfaceC1068ATy interfaceC1068ATy = this.$path;
                int i = 0;
                for (AWx aWx : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        AbstractC0885AGm.A14();
                        throw F60.createAndThrow();
                    }
                    long j = aWx.A00;
                    float fA003 = C8j4.A00(j, fA002);
                    float fA012 = AnonymousClass001.A01(j, 4294967295L) * fA002;
                    Path path = ((C1710Aot) interfaceC1068ATy).A03;
                    if (i == 0) {
                        path.moveTo(fA003, fA012);
                    } else {
                        path.lineTo(fA003, fA012);
                    }
                    i = i2;
                }
                ((C1710Aot) this.$path).A03.close();
                float fA004 = AnonymousClass001.A00(c16z.ADU());
                long j2 = AuraSecretGoatKt.CrownBox;
                float fA005 = fA004 - ((AnonymousClass001.A00(j2) / 2.0f) * fA002);
                float fA013 = fA01 - ((AnonymousClass001.A01(4294967295L, j2) / 2.0f) * fA002);
                InterfaceC1068ATy interfaceC1068ATy2 = this.$path;
                AHD<B6A> ahd = this.$palette;
                AT2 at2A00 = AT2.A00(c16z, fA005, fA013);
                try {
                    C8j4.A1K(c16z, interfaceC1068ATy2, fA03, C8j4.A0P(ahd, zA1X ? 1 : 0));
                } finally {
                    AT2.A01(at2A00, fA005, fA013);
                }
            }
        }
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C16Z c16z) {
        invoke2(c16z);
        return Unit.INSTANCE;
    }
}
