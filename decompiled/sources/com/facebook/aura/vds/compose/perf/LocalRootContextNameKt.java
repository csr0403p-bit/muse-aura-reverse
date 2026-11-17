package com.facebook.aura.vds.compose.perf;

import X.AGE;
import X.AGN;
import X.AKH;
import X.AKT;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.G0V;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.Unit;

/* loaded from: classes4.dex */
public abstract class LocalRootContextNameKt {
    public static final AKH<String> LocalRootContextName = new AGN(AGE.A00, LocalRootContextNameKt$LocalRootContextName$1.INSTANCE);

    /* renamed from: com.facebook.aura.vds.compose.perf.LocalRootContextNameKt$WithRootContextName$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
        public final /* synthetic */ String $name;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(String str, G0V<? super BFM, ? super Integer, Unit> g0v, int i) {
            super(2);
            this.$name = str;
            this.$content = g0v;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            LocalRootContextNameKt.WithRootContextName(this.$name, this.$content, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final AKH<String> getLocalRootContextName() {
        return LocalRootContextName;
    }

    public static final void WithRootContextName(String str, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i) {
        AnonymousClass003.A0u(str, g0v);
        bfm.AgG(1093637779);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            AKT.A01(bfm, LocalRootContextName.A04(str), g0v, (iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 8);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(str, g0v, i);
        }
    }
}
