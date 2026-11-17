package com.facebook.aura.navigation;

import X.AKQ;
import X.AT5;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AxM;
import X.B81;
import X.BBI;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C06G;
import X.C10G;
import X.C1515AkP;
import X.C78N;
import X.F60;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.ui.adaptive.AuraPageCardKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class BlockingOverlayScene$content$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ BlockingOverlayScene<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockingOverlayScene$content$1(BlockingOverlayScene<T> blockingOverlayScene) {
        super(2);
        this.this$0 = blockingOverlayScene;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass003.A16(i & 3), bfm, i)) {
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = BlockingOverlayScene$content$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            B81.A00(false, (Function0) objAaT, bfm, 48, 1);
            AT5 at5 = (AT5) AnonymousClass005.A0e(bfm, bfm.AaT(), obj);
            Unit unit = Unit.INSTANCE;
            boolean zA67 = bfm.A67(at5);
            Object objAaT2 = bfm.AaT();
            if (zA67 || objAaT2 == obj) {
                objAaT2 = new BlockingOverlayScene$content$1$2$1(at5, null);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A18(bfm, objAaT2, unit);
            BRg bRgA0N = C06G.A0N(bfm, C10G.A01);
            boolean zA672 = bfm.A67(at5);
            Object objAaT3 = bfm.AaT();
            if (zA672 || objAaT3 == obj) {
                objAaT3 = new BlockingOverlayScene$content$1$3$1(at5);
                bfm.Ai0(objAaT3);
            }
            BRg bRgA0W = AnonymousClass001.A0W(bRgA0N, objAaT3);
            BlockingOverlayScene<T> blockingOverlayScene = this.this$0;
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0W);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
            AnonymousClass003.A0m(bfm, AuraPageCardKt.LocalAuraPageCardSuppressed.A04(true), new BlockingOverlayScene$content$1$4$1(blockingOverlayScene), 495769905);
            BBI.A0R(bbi, true);
            return;
        }
        bfm.Afo();
    }
}
