package com.facebook.aura.ui;

import X.AKQ;
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
import X.C11U;
import X.C1515AkP;
import X.C1DH;
import X.C1DI;
import X.C1DM;
import X.C1b8;
import X.C78N;
import X.F60;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchSurfaceKt$HatchSurface$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ C1DH $border;
    public final /* synthetic */ long $color;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ C1DM $shape;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchSurfaceKt$HatchSurface$1(BRg bRg, C1DH c1dh, C1DM c1dm, long j, G0V<? super BFM, ? super Integer, Unit> g0v) {
        super(2);
        this.$modifier = bRg;
        this.$border = c1dh;
        this.$shape = c1dm;
        this.$color = j;
        this.$content = g0v;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            BRg bRg = this.$modifier;
            C1DH c1dh = this.$border;
            BRg bRgA01 = BRg.A00;
            if (c1dh != null) {
                bRgA01 = C1DI.A01(c1dh, bRgA01, this.$shape);
            }
            BRg bRgA03 = C1b8.A03(bRg.then(bRgA01), this.$shape, this.$color);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = HatchSurfaceKt$HatchSurface$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            BRg bRgA032 = C11U.A03(AnonymousClass001.A0Y(bRgA03, objAaT, false), this.$shape);
            G0V<BFM, Integer, Unit> g0v = this.$content;
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(true);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA032);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA012, iA0J);
            AnonymousClass001.A1H(bfm, g0v, 0);
            BBI.A0R(bbi, true);
            return;
        }
        bfm.Afo();
    }
}
