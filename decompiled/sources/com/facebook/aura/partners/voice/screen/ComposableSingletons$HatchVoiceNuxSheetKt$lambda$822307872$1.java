package com.facebook.aura.partners.voice.screen;

import X.AKQ;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AxM;
import X.BBI;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C06I;
import X.C07C;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C1YL;
import X.C2VU;
import X.C3U4;
import X.C78N;
import X.F60;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.partners.voice.screen.ComposableSingletons$HatchVoiceNuxSheetKt$lambda$-822307872$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$HatchVoiceNuxSheetKt$lambda$822307872$1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
    public static final ComposableSingletons$HatchVoiceNuxSheetKt$lambda$822307872$1 INSTANCE = new ComposableSingletons$HatchVoiceNuxSheetKt$lambda$822307872$1();

    public ComposableSingletons$HatchVoiceNuxSheetKt$lambda$822307872$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
        invoke(c07c, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(C07C c07c, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, c07c), bfm, i)) {
            BS0 bs0 = BRg.A00;
            C1062ATq c1062ATq = C10G.A02;
            float f = AuraDimensKt.SpacingLarge;
            BRg bRgA0C = C3U4.A0C(C3U4.A0B(c1062ATq, f, 0.0f), 0.0f, 48.0f, 0.0f, AuraDimensKt.SpacingMedium);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A06, bfm, C2VU.A00, 48);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0C);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            HatchVoiceNuxSheetKt.VoiceNuxHero(C10G.A04(C10G.A08(bs0, 141.0f), 74.0f), bfm, 6, 0);
            C01N.A08(bfm, bs0, AuraDimensKt.SpacingLargePlusMicro);
            String strA0v = AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f120677);
            C1822Arm c1822Arm = AnonymousClass002.A0f(bfm).title1Medium;
            long jA0C = C06G.A0C(bfm);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = ComposableSingletons$HatchVoiceNuxSheetKt$lambda$822307872$1$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(strA0v, AnonymousClass001.A0Y(c1062ATq, objAaT, false), jA0C, c1822Arm, null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
            C01N.A08(bfm, bs0, f);
            HatchVoiceNuxSheetKt.VoiceNuxFeatureList(c1062ATq, bfm, 6, 0);
            BBI.A0R(bbi, true);
            return;
        }
        bfm.Afo();
    }
}
