package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.BRg;
import X.C06G;
import X.C1822Arm;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.G0W;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchSpokenSummaryRowKt$HatchSpokenSummaryRow$1$1$summaryText$1 extends AbstractC7559F3s implements G0W<BRg, BFM, Integer, Unit> {
    public final /* synthetic */ String $expandedContentDescription;
    public final /* synthetic */ String $text;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSpokenSummaryRowKt$HatchSpokenSummaryRow$1$1$summaryText$1(String str, String str2) {
        super(3);
        this.$expandedContentDescription = str;
        this.$text = str2;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(BRg bRg, BFM bfm, Integer num) {
        invoke(bRg, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BRg bRg, BFM bfm, int i) {
        int iA0d = i;
        C7384Etj.A0Y(bRg, 0);
        if ((i & 6) == 0) {
            iA0d = i | AnonymousClass004.A0d(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            C1822Arm c1822ArmA0W = C06G.A0W(bfm);
            long jA0C = C06G.A0C(bfm);
            BRg bRgA03 = C3U4.A03(bRg, 8.0f);
            boolean zA65 = bfm.A65(this.$expandedContentDescription);
            String str = this.$expandedContentDescription;
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new HatchSpokenSummaryRowKt$HatchSpokenSummaryRow$1$1$summaryText$1$1$1(str);
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(this.$text, AnonymousClass001.A0Y(bRgA03, objAaT, false), jA0C, c1822ArmA0W, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            return;
        }
        bfm.Afo();
    }
}
