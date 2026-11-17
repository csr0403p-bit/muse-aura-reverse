package com.facebook.aura.settings.importmemory;

import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AxM;
import X.BBI;
import X.BFM;
import X.BOf;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06G;
import X.C1515AkP;
import X.C1AC;
import X.C2VU;
import X.C9m9;
import X.F60;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.settings.importmemory.ComposableSingletons$HatchImportMemoryToHatchScreenKt$lambda$-113438092$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$HatchImportMemoryToHatchScreenKt$lambda$113438092$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public static final ComposableSingletons$HatchImportMemoryToHatchScreenKt$lambda$113438092$1 INSTANCE = new ComposableSingletons$HatchImportMemoryToHatchScreenKt$lambda$113438092$1();

    public ComposableSingletons$HatchImportMemoryToHatchScreenKt$lambda$113438092$1() {
        super(2);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass003.A16(i & 3), bfm, i)) {
            C9m9 c9m9A00 = AcQ.A00(6.0f);
            C1AC c1ac = C2VU.A04;
            BS0 bs0 = BRg.A00;
            InterfaceC1380AiA interfaceC1380AiAA0b = AnonymousClass001.A0b(c9m9A00, bfm, c1ac);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bs0);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0b, akqA04, bRgA01, iA0J);
            AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, R.drawable.copy_wght400_outline_24, 0), AuraIconSize.X_SMALL, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120f07), C06G.A0A(bfm), null, bfm, AnonymousClass001.A03(), 33);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120f06), null, C06G.A0C(bfm), AnonymousClass002.A0f(bfm).subheadlineEmphasized, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            BBI.A0R(bbi, true);
            return;
        }
        bfm.Afo();
    }
}
