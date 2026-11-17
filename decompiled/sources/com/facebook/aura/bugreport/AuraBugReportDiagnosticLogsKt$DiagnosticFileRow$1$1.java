package com.facebook.aura.bugreport;

import X.AVy;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.B6A;
import X.BFM;
import X.BOf;
import X.C06G;
import X.C08R;
import X.C78N;
import X.G0W;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.icons.AuraIconButtonBackground;
import com.facebook.aura.vds.compose.icons.AuraIconButtonKt;
import com.facebook.aura.vds.compose.icons.AuraIconButtonSizeV2;
import com.facebook.aura.vds.compose.icons.AuraIconButtonStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraBugReportDiagnosticLogsKt$DiagnosticFileRow$1$1 extends AbstractC7559F3s implements G0W<C08R, BFM, Integer, Unit> {
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ MutableState<Boolean> $showMenu$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraBugReportDiagnosticLogsKt$DiagnosticFileRow$1$1(MutableState<Boolean> mutableState, boolean z) {
        super(3);
        this.$showMenu$delegate = mutableState;
        this.$enabled = z;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C08R c08r, BFM bfm, Integer num) {
        invoke(c08r, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(C08R c08r, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, c08r), bfm, i)) {
            AVy aVyA00 = BOf.A00(bfm, R.drawable.ellipsisvertical_outline_24_wght400, 0);
            String strA0i = AnonymousClass005.A0i(bfm);
            AuraIconButtonSizeV2 auraIconButtonSizeV2 = AuraIconButtonSizeV2.SMALL;
            AuraIconButtonStyle auraIconButtonStyle = AuraIconButtonStyle.SECONDARY;
            AuraIconButtonBackground auraIconButtonBackground = AuraIconButtonBackground.NO_BACKGROUND;
            long jA09 = C06G.A09(bfm);
            boolean zA65 = bfm.A65(this.$showMenu$delegate);
            MutableState<Boolean> mutableState = this.$showMenu$delegate;
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new AuraBugReportDiagnosticLogsKt$DiagnosticFileRow$1$1$1$1(mutableState);
                bfm.Ai0(objAaT);
            }
            AuraIconButtonKt.m2552AuraIconButtonV2imgtlEU(null, aVyA00, auraIconButtonSizeV2, auraIconButtonStyle, auraIconButtonBackground, null, strA0i, (Function0) objAaT, null, this.$enabled, new B6A(jA09), null, null, null, bfm, (AVy.$stable << 3) | 28032, 0, 14625);
            return;
        }
        bfm.Afo();
    }
}
