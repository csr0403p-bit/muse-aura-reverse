package com.facebook.aura.nudge;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C1D3;
import X.C7384Etj;
import X.FGI;
import com.facebook.aura.conversation.widget.api.ConversationTimelineContent;

/* loaded from: classes2.dex */
public final class ConversationNudgeTimelineContent implements ConversationTimelineContent {
    public final boolean isVisible;
    public final String key;
    public final ConversationNudge nudge;

    public ConversationNudgeTimelineContent(ConversationNudge conversationNudge, boolean z) {
        C7384Etj.A0Y(conversationNudge, 0);
        this.nudge = conversationNudge;
        this.isVisible = z;
        this.key = FGI.A0M("nudge:", conversationNudge.getId());
    }

    @Override // com.facebook.aura.conversation.widget.api.ConversationTimelineContent
    /* renamed from: Render-iJQMabo */
    public void mo719RenderiJQMabo(BRg bRg, long j, C1D3 c1d3, BFM bfm, int i) {
        AnonymousClass002.A1A(bRg, 0, c1d3);
        bfm.AgG(2126483478);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0N(bfm, j);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, c1d3);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass002.A00(AnonymousClass004.A1a(this, bfm, i) ? 1 : 0);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0d), bfm, iA0d)) {
            ConversationCardTimelineKt.m1610ConversationNudgeItemT042LqI(this.nudge, this.isVisible, j, c1d3, bRg, bfm, AnonymousClass001.A0B(iA0d << 12, (iA0d << 3) & 8064), 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new ConversationNudgeTimelineContent$Render$1(this, bRg, j, c1d3, i);
        }
    }

    @Override // com.facebook.aura.conversation.widget.api.ConversationTimelineContent
    public String getKey() {
        return this.key;
    }
}
