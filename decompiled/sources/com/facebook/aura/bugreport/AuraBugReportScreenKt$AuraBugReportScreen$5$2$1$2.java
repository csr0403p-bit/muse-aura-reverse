package com.facebook.aura.bugreport;

import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.BFM;
import X.C06G;
import X.C7384Etj;
import X.G0V;
import X.G0W;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraBugReportScreenKt$AuraBugReportScreen$5$2$1$2 extends AbstractC7559F3s implements G0W<G0V<? super BFM, ? super Integer, ? extends Unit>, BFM, Integer, Unit> {
    public final /* synthetic */ MutableState<String> $description$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraBugReportScreenKt$AuraBugReportScreen$5$2$1$2(MutableState<String> mutableState) {
        super(3);
        this.$description$delegate = mutableState;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(G0V<? super BFM, ? super Integer, ? extends Unit> g0v, BFM bfm, Integer num) {
        invoke((G0V<? super BFM, ? super Integer, Unit>) g0v, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i) {
        int iA0T = i;
        C7384Etj.A0Y(g0v, 0);
        if ((i & 6) == 0) {
            iA0T = i | AnonymousClass004.A0T(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0T), bfm, iA0T)) {
            MutableState<String> mutableState = this.$description$delegate;
            float f = AuraBugReportScreenKt.CLOSE_BUTTON_PADDING;
            if (MutableState.A01((MutableState) mutableState) == 0) {
                bfm.AgE(-1366260082);
                AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1201ff), null, AnonymousClass002.A0c(bfm).textInput.placeholderColor, C06G.A0T(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            } else {
                bfm.AgE(-1366006843);
            }
            AnonymousClass001.A1D(bfm);
            AnonymousClass003.A13(bfm, g0v, iA0T);
            return;
        }
        bfm.Afo();
    }
}
