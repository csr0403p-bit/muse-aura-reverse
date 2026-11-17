package com.facebook.aura.confidentialvm.view;

import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AxM;
import X.BBI;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C06G;
import X.C07C;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C3U4;
import X.C7384Etj;
import X.F60;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.confidentialvm.view.ComposableSingletons$ConfidentialVmPinHelpBottomSheetKt$lambda$-1365585723$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$ConfidentialVmPinHelpBottomSheetKt$lambda$1365585723$1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
    public static final ComposableSingletons$ConfidentialVmPinHelpBottomSheetKt$lambda$1365585723$1 INSTANCE = new ComposableSingletons$ConfidentialVmPinHelpBottomSheetKt$lambda$1365585723$1();

    public ComposableSingletons$ConfidentialVmPinHelpBottomSheetKt$lambda$1365585723$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
        invoke(c07c, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(C07C c07c, BFM bfm, int i) {
        C7384Etj.A0Y(c07c, 0);
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            C1062ATq c1062ATq = C10G.A02;
            float f = AuraDimensKt.SpacingLarge;
            BRg bRgA0C = C3U4.A0C(c1062ATq, f, AuraDimensKt.SpacingSmall, f, AuraDimensKt.SpacingXlarge);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, AuraDimensKt.SpacingMedium, 0);
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
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0X, akqA04, bRgA01, iA0J);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120785), c1062ATq, C06G.A0C(bfm), C06G.A0T(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 48, 0, 16368);
            ConfidentialVmPinHelpBottomSheetKt.ChangePinStepsCard(null, bfm, 0, 1);
            BBI.A0R(bbi, true);
            return;
        }
        bfm.Afo();
    }
}
