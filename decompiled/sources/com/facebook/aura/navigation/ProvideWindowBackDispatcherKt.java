package com.facebook.aura.navigation;

import X.AKT;
import X.AbstractC1724ApD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.C1EP;
import X.C28u;
import X.C7384Etj;
import X.G0V;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class ProvideWindowBackDispatcherKt {

    /* renamed from: com.facebook.aura.navigation.ProvideWindowBackDispatcherKt$ProvideWindowBackDispatcher$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(G0V<? super BFM, ? super Integer, Unit> g0v, int i) {
            super(2);
            this.$content = g0v;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            ProvideWindowBackDispatcherKt.ProvideWindowBackDispatcher(this.$content, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void ProvideWindowBackDispatcher(G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass1;
        C7384Etj.A0Y(g0v, 0);
        bfm.AgG(-741503019);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, g0v) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0T), bfm, iA0T)) {
            C28u c28uA00 = AbstractC1724ApD.A00(AnonymousClass001.A0J(bfm));
            if (c28uA00 == null) {
                bfm.AgE(-1099477475);
                AnonymousClass003.A13(bfm, g0v, iA0T);
                bBbAAc = AnonymousClass002.A0Q(bfm, bfm);
                if (bBbAAc != null) {
                    anonymousClass1 = new ProvideWindowBackDispatcherKt$ProvideWindowBackDispatcher$windowOwner$1(g0v, i);
                    bBbAAc.A06 = anonymousClass1;
                }
                return;
            }
            AnonymousClass003.A0l(bfm, 380172935);
            AKT.A01(bfm, C1EP.A00.A04(c28uA00), g0v, (iA0T << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass1 = new AnonymousClass1(g0v, i);
            bBbAAc.A06 = anonymousClass1;
        }
    }
}
