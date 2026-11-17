package com.facebook.aura.confidentialvm.view;

import X.AKQ;
import X.AVy;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AxM;
import X.BBI;
import X.BFM;
import X.BJe;
import X.BOf;
import X.BRg;
import X.C00x;
import X.C06G;
import X.C07C;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C1SA;
import X.C1YL;
import X.C3U4;
import X.C7384Etj;
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

/* renamed from: com.facebook.aura.confidentialvm.view.ComposableSingletons$ConfidentialVmOffWaitlistSheetKt$lambda$-1544501174$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$ConfidentialVmOffWaitlistSheetKt$lambda$1544501174$1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
    public static final ComposableSingletons$ConfidentialVmOffWaitlistSheetKt$lambda$1544501174$1 INSTANCE = new ComposableSingletons$ConfidentialVmOffWaitlistSheetKt$lambda$1544501174$1();

    public ComposableSingletons$ConfidentialVmOffWaitlistSheetKt$lambda$1544501174$1() {
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
            BRg bRgA0C = C3U4.A0C(c1062ATq, f, 0.0f, f, f);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
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
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            C1SA.A00(bfm, null, BJe.A00(c1062ATq, 1.7020202f, false), null, BOf.A00(bfm, R.drawable.confidential_vm_off_waitlist_illustration, 0), null, null, 0.0f, AVy.$stable | 432, 120);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12074f);
            C1822Arm c1822Arm = AnonymousClass002.A0f(bfm).title1Medium;
            long jA0C = C06G.A0C(bfm);
            BRg bRgA0C2 = C3U4.A0C(c1062ATq, 0.0f, AuraDimensKt.SpacingMedium, 0.0f, 0.0f);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = ComposableSingletons$ConfidentialVmOffWaitlistSheetKt$lambda$1544501174$1$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, AnonymousClass001.A0Y(bRgA0C2, objAaT, false), jA0C, c1822Arm, null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
            String strA0v = AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f12074d);
            C1822Arm c1822ArmA0Z = C06G.A0Z(bfm);
            AuraTextKt.m2639AuraTextUY9GdpU(strA0v, C3U4.A0C(c1062ATq, 0.0f, AuraDimensKt.SpacingXsmall, 0.0f, 0.0f), C06G.A0C(bfm), c1822ArmA0Z, null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
            BBI.A0R(bbi, true);
            return;
        }
        bfm.Afo();
    }
}
