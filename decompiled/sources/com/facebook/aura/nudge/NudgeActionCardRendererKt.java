package com.facebook.aura.nudge;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C1D3;
import X.C78N;
import X.G0U;
import X.G0V;
import com.facebook.aura.conversation.widget.api.ConversationCardControls;
import com.facebook.aura.nudge.ConversationNudge;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class NudgeActionCardRendererKt {

    /* renamed from: com.facebook.aura.nudge.NudgeActionCardRendererKt$NudgeActionCard$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ConversationCardControls $controls;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ ConversationNudge $nudge;
        public final /* synthetic */ NudgeActionCardRequest $request;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ConversationNudge conversationNudge, NudgeActionCardRequest nudgeActionCardRequest, ConversationCardControls conversationCardControls, BRg bRg, int i, int i2) {
            super(2);
            this.$nudge = conversationNudge;
            this.$request = nudgeActionCardRequest;
            this.$controls = conversationCardControls;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            NudgeActionCardRendererKt.NudgeActionCard(this.$nudge, this.$request, this.$controls, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void NudgeActionCard(ConversationNudge conversationNudge, NudgeActionCardRequest nudgeActionCardRequest, ConversationCardControls conversationCardControls, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(150730616);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(conversationNudge, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(nudgeActionCardRequest, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass003.A05(AnonymousClass004.A1Z(conversationCardControls, bfm, i) ? 1 : 0);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, bRg2);
        }
        boolean z = false;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 1171, 1170), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            boolean z2 = (iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32 || ((iA05 & 64) != 0 && bfm.A67(nudgeActionCardRequest));
            Object objAaT = bfm.AaT();
            if (z2 || objAaT == C78N.A00) {
                objAaT = new NudgeActionCardRendererKt$NudgeActionCard$action$1$1(nudgeActionCardRequest);
                bfm.Ai0(objAaT);
            }
            Function0<Unit> function0RememberAction = conversationNudge.rememberAction((G0U) objAaT, bfm, (iA05 << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX);
            boolean z3 = conversationCardControls.isEnabled;
            long j = conversationCardControls.backgroundColor;
            C1D3 c1d3 = conversationCardControls.containerShape;
            if ((iA05 & 896) == 256 || ((iA05 & 512) != 0 && bfm.A67(conversationCardControls))) {
                z = true;
            }
            boolean zA65 = bfm.A65(function0RememberAction) | z;
            Object objAaT2 = bfm.AaT();
            if (zA65 || objAaT2 == C78N.A00) {
                objAaT2 = new NudgeActionCardRendererKt$NudgeActionCard$1$1(conversationCardControls, function0RememberAction);
                bfm.Ai0(objAaT2);
            }
            ConversationNudge.ComposeDefaultImpls.Card$default(new ConversationCardControls(z3, j, c1d3, (Function0) objAaT2, conversationCardControls.onDecline), bRg2, conversationNudge, bfm, AnonymousClass003.A08(iA05 >> 6, ConversationCardControls.$stable, iA05), 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(conversationNudge, nudgeActionCardRequest, conversationCardControls, bRg2, i, i2);
        }
    }
}
