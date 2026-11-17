package com.facebook.aura.file.view;

import X.AKQ;
import X.AbstractC1103AYp;
import X.AbstractC1727ApL;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AxM;
import X.BBI;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C1062ATq;
import X.C10G;
import X.C1110AYw;
import X.C1515AkP;
import X.C1822Arm;
import X.F60;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class FileViewerContentKt$ScrollingFileTextContent$1$1$3$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ List<String> $chunkLines;
    public final /* synthetic */ C1110AYw $horizontalScrollState;
    public final /* synthetic */ boolean $isCode;
    public final /* synthetic */ C1822Arm $textStyle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileViewerContentKt$ScrollingFileTextContent$1$1$3$1(List<String> list, boolean z, C1110AYw c1110AYw, C1822Arm c1822Arm) {
        super(2);
        this.$chunkLines = list;
        this.$isCode = z;
        this.$horizontalScrollState = c1110AYw;
        this.$textStyle = c1822Arm;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        BRg bRgA01;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            BS0 bs0 = BRg.A00;
            C1062ATq c1062ATq = C10G.A02;
            List<String> list = this.$chunkLines;
            boolean z = this.$isCode;
            C1110AYw c1110AYw = this.$horizontalScrollState;
            C1822Arm c1822Arm = this.$textStyle;
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, c1062ATq);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA012, iA0J);
            Iterator itA0w = AnonymousClass001.A0w(bfm, list, 924599708);
            while (itA0w.hasNext()) {
                String strA0j = AnonymousClass005.A0j(itA0w);
                boolean z2 = !z;
                if (z) {
                    bRgA01 = AbstractC1103AYp.A01(c1110AYw, bs0, true);
                } else {
                    bRgA01 = c1062ATq;
                }
                AbstractC1727ApL.A02(null, bfm, bRgA01, null, c1822Arm, strA0j, null, 0, 0, 0, 0, 984, z2);
            }
            AnonymousClass003.A0q(bbi);
            return;
        }
        bfm.Afo();
    }
}
