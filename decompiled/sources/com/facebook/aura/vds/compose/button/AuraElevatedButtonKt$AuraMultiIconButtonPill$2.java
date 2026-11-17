package com.facebook.aura.vds.compose.button;

import X.AKQ;
import X.AVy;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AxM;
import X.B6A;
import X.BBI;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C0v5;
import X.C10G;
import X.C1515AkP;
import X.C1YD;
import X.C78N;
import X.F60;
import X.G0V;
import X.InterfaceC1072AWd;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.vds.compose.accessibility.AuraHaptics;
import com.facebook.aura.vds.compose.accessibility.AuraHapticsKt;
import com.facebook.aura.vds.compose.bouncy.AuraBouncyIndication;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.theme.AuraColors;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraElevatedButtonKt$AuraMultiIconButtonPill$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ AuraColors $auraColors;
    public final /* synthetic */ float $buttonSize;
    public final /* synthetic */ List<AuraMultiIconButtonPillEntry> $entries;
    public final /* synthetic */ AuraIconSize $iconSize;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraElevatedButtonKt$AuraMultiIconButtonPill$2(List<AuraMultiIconButtonPillEntry> list, float f, AuraColors auraColors, AuraIconSize auraIconSize) {
        super(2);
        this.$entries = list;
        this.$buttonSize = f;
        this.$auraColors = auraColors;
        this.$iconSize = auraIconSize;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        long j;
        if (AnonymousClass001.A1b(AnonymousClass003.A16(i & 3), bfm, i)) {
            List<AuraMultiIconButtonPillEntry> list = this.$entries;
            float f = this.$buttonSize;
            AuraColors auraColors = this.$auraColors;
            AuraIconSize auraIconSize = this.$iconSize;
            for (AuraMultiIconButtonPillEntry auraMultiIconButtonPillEntry : list) {
                Object objAaT = bfm.AaT();
                Object obj = C78N.A00;
                InterfaceC1072AWd interfaceC1072AWd = (InterfaceC1072AWd) AnonymousClass004.A16(bfm, objAaT, obj);
                BS0 bs0 = BRg.A00;
                boolean zA65 = bfm.A65(auraMultiIconButtonPillEntry);
                Object objAaT2 = bfm.AaT();
                if (zA65 || objAaT2 == obj) {
                    objAaT2 = new AuraElevatedButtonKt$AuraMultiIconButtonPill$2$1$1$1(auraMultiIconButtonPillEntry);
                    bfm.Ai0(objAaT2);
                }
                BRg bRgA07 = C10G.A07(AnonymousClass001.A0Y(bs0, objAaT2, true), f);
                if (auraMultiIconButtonPillEntry.enabled) {
                    bRgA07 = bRgA07.then(AuraHapticsKt.m2392auraHapticZShFqVg(bs0, AuraHaptics.BUTTON_TAP, true));
                }
                boolean z = auraMultiIconButtonPillEntry.enabled;
                float f2 = 0.0f;
                BRg bRg = bRgA07;
                BRg bRgA01 = C0v5.A01(new AuraBouncyIndication(f2, f2, f2, f2, f2, 31, null), interfaceC1072AWd, bRg, new C1YD(0), null, auraMultiIconButtonPillEntry.onClick, z);
                InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA012 = AxM.A01(bfm, bRgA01);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA012, iA0J);
                AVy aVy = auraMultiIconButtonPillEntry.iconPainter;
                if (!auraMultiIconButtonPillEntry.enabled) {
                    j = auraColors.primaryIcon.disabled;
                } else {
                    B6A b6a = auraMultiIconButtonPillEntry.iconTint;
                    if (b6a != null) {
                        j = b6a.A00;
                    } else {
                        j = auraColors.primaryIcon.enabled;
                    }
                }
                AuraIconKt.m2567AuraIconFHprtrg(null, aVy, auraIconSize, null, j, null, bfm, (AVy.$stable << 3) | 3072, 33);
                BBI.A0R(bbi, true);
            }
            return;
        }
        bfm.Afo();
    }
}
