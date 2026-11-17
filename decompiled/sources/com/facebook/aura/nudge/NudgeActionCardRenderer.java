package com.facebook.aura.nudge;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C7384Etj;
import X.C78N;
import X.G0V;
import com.facebook.aura.conversation.api.ConversationCardRequest;
import com.facebook.aura.conversation.widget.api.ConversationCardControls;
import com.facebook.aura.conversation.widget.api.ConversationCardRenderer;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class NudgeActionCardRenderer implements ConversationCardRenderer {
    public static final NudgeActionCardRenderer INSTANCE = new NudgeActionCardRenderer();

    /* renamed from: com.facebook.aura.nudge.NudgeActionCardRenderer$Render$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ ConversationCardControls $controls;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ ConversationCardRequest $request;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ConversationCardRequest conversationCardRequest, ConversationCardControls conversationCardControls, BRg bRg, int i) {
            super(2);
            this.$request = conversationCardRequest;
            this.$controls = conversationCardControls;
            this.$modifier = bRg;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            NudgeActionCardRenderer.this.Render(this.$request, this.$controls, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    @Override // com.facebook.aura.conversation.widget.api.ConversationCardRenderer
    public void Render(ConversationCardRequest conversationCardRequest, ConversationCardControls conversationCardControls, BRg bRg, BFM bfm, int i) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass1;
        G0V<? super BFM, ? super Integer, Unit> nudgeActionCardRenderer$Render$actionRequest$1;
        NudgeActionCardRequest nudgeActionCardRequest;
        AnonymousClass005.A10(conversationCardRequest, conversationCardControls, bRg);
        bfm.AgG(-1031344553);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(conversationCardRequest, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(conversationCardControls, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRg);
        }
        if (!AnonymousClass001.A1b(AnonymousClass004.A1J(iA05), bfm, iA05)) {
            bfm.Afo();
        } else {
            if (!(conversationCardRequest instanceof NudgeActionCardRequest) || (nudgeActionCardRequest = (NudgeActionCardRequest) conversationCardRequest) == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    nudgeActionCardRenderer$Render$actionRequest$1 = new NudgeActionCardRenderer$Render$actionRequest$1(this, conversationCardRequest, conversationCardControls, bRg, i);
                    bBbAAc.A06 = nudgeActionCardRenderer$Render$actionRequest$1;
                }
                return;
            }
            boolean zA65 = bfm.A65(nudgeActionCardRequest.nudgeId);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = ConversationNudgesKt.findNudge(nudgeActionCardRequest.nudgeId);
                bfm.Ai0(objAaT);
            }
            ConversationNudge conversationNudge = (ConversationNudge) objAaT;
            if (conversationNudge == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass1 = new NudgeActionCardRenderer$Render$nudge$2(this, conversationCardRequest, conversationCardControls, bRg, i);
                    nudgeActionCardRenderer$Render$actionRequest$1 = anonymousClass1;
                    bBbAAc.A06 = nudgeActionCardRenderer$Render$actionRequest$1;
                }
                return;
            }
            NudgeActionCardRendererKt.NudgeActionCard(conversationNudge, nudgeActionCardRequest, conversationCardControls, bRg, bfm, AnonymousClass002.A08(iA05 << 3, (NudgeActionCardRequest.$stable << 3) | (ConversationCardControls.$stable << 6)), 0);
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass1 = new AnonymousClass1(conversationCardRequest, conversationCardControls, bRg, i);
            nudgeActionCardRenderer$Render$actionRequest$1 = anonymousClass1;
            bBbAAc.A06 = nudgeActionCardRenderer$Render$actionRequest$1;
        }
    }

    @Override // com.facebook.aura.conversation.widget.api.ConversationCardRenderer
    public boolean canRender(ConversationCardRequest conversationCardRequest) {
        C7384Etj.A0Y(conversationCardRequest, 0);
        return conversationCardRequest instanceof NudgeActionCardRequest;
    }
}
