package com.facebook.aura.library.view;

import X.AKQ;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AxM;
import X.BBI;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C03X;
import X.C10G;
import X.C1515AkP;
import X.C3U4;
import X.F60;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ComposableSingletons$HatchGridDetailScreenKt$lambda$1003754659$1 extends AbstractC7559F3s implements G0W<C03X, BFM, Integer, Unit> {
    public static final ComposableSingletons$HatchGridDetailScreenKt$lambda$1003754659$1 INSTANCE = new ComposableSingletons$HatchGridDetailScreenKt$lambda$1003754659$1();

    public ComposableSingletons$HatchGridDetailScreenKt$lambda$1003754659$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C03X c03x, BFM bfm, Integer num) {
        invoke(c03x, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(C03X c03x, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            BRg bRgA06 = C3U4.A06(C10G.A02, AuraDimensKt.SpacingXlarge);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA06);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA01, iA0J);
            AnonymousClass007.A0s(bfm, bbi);
            return;
        }
        bfm.Afo();
    }
}
