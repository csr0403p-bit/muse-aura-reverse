package com.facebook.aura.file.view;

import X.AbstractC1103AYp;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.BRg;
import X.C06G;
import X.C10G;
import X.C1110AYw;
import X.C1DP;
import X.C1YY;
import X.C3U4;
import X.C78N;
import X.C9m9;
import X.G0U;
import X.G0W;
import com.facebook.aura.file.spreadsheet.SpreadsheetSheet;
import com.facebook.aura.settings.MC;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class SpreadsheetContentViewKt$SpreadsheetContent$4$2 extends AbstractC7559F3s implements G0W<Boolean, BFM, Integer, Unit> {
    public final /* synthetic */ float $contentBottomPadding;
    public final /* synthetic */ SpreadsheetSheet $currentSheet;
    public final /* synthetic */ C1110AYw $horizontalScrollState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpreadsheetContentViewKt$SpreadsheetContent$4$2(C1110AYw c1110AYw, float f, SpreadsheetSheet spreadsheetSheet) {
        super(3);
        this.$horizontalScrollState = c1110AYw;
        this.$contentBottomPadding = f;
        this.$currentSheet = spreadsheetSheet;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, BFM bfm, Integer num) {
        invoke(AnonymousClass001.A1X(bool), bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z, BFM bfm, int i) {
        int iA0n = i;
        if ((i & 6) == 0) {
            iA0n = i | AnonymousClass004.A0n(bfm, z);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0n), bfm, iA0n)) {
            boolean z2 = !z;
            BRg bRgA0B = C3U4.A0B(AbstractC1103AYp.A01(this.$horizontalScrollState, C10G.A01, z2), AuraDimensKt.SpacingMedium, 0.0f);
            C9m9 c9m9A00 = AcQ.A00(0.0f);
            C1DP c1dp = new C1DP(0.0f, C06G.A00(bfm), 0.0f, this.$contentBottomPadding);
            boolean zA67 = bfm.A67(this.$currentSheet);
            SpreadsheetSheet spreadsheetSheet = this.$currentSheet;
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new SpreadsheetContentViewKt$SpreadsheetContent$4$2$1$1(spreadsheetSheet);
                bfm.Ai0(objAaT);
            }
            C1YY.A01(null, null, c9m9A00, c1dp, null, bfm, null, bRgA0B, (G0U) objAaT, RuntimeInternals.IOPRIO_BACKGROUND, MC.mwa_help_and_support.__CONFIG__, false, z2);
            return;
        }
        bfm.Afo();
    }
}
