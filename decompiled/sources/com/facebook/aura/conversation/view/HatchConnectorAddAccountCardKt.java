package com.facebook.aura.conversation.view;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.B1V;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C1D3;
import X.C7384Etj;
import com.facebook.aura.analytics.hatch.HatchSkillOAuthOrigin;
import com.facebook.aura.model.InternalLinkActionCardPresentation;
import com.facebook.aura.skills.connect.ConnectorAccountLinkRequesterKt;

/* loaded from: classes.dex */
public abstract class HatchConnectorAddAccountCardKt {
    /* renamed from: HatchConnectorAddAccountCard-sW7UJKQ, reason: not valid java name */
    public static final void m543HatchConnectorAddAccountCardsW7UJKQ(InternalLinkActionCardPresentation internalLinkActionCardPresentation, long j, C1D3 c1d3, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(internalLinkActionCardPresentation, 0);
        bfm.AgG(1593871270);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(internalLinkActionCardPresentation, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0N(bfm, j);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, c1d3);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String str = internalLinkActionCardPresentation.connectorId;
            int i4 = iA05 >> 3;
            HatchInternalLinkActionCardKt.m629InternalLinkCardContainereuL9pac(j, c1d3, bRg2, B1V.A00(bfm, new HatchConnectorAddAccountCardKt$HatchConnectorAddAccountCard$1(internalLinkActionCardPresentation, str, ConnectorAccountLinkRequesterKt.rememberConnectorAccountLinkRequester(str == null ? "" : str, HatchSkillOAuthOrigin.CHAT, bfm, 48)), -1978239550), bfm, AnonymousClass002.A07(i4, (i4 & 14) | 3072), 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchConnectorAddAccountCardKt$HatchConnectorAddAccountCard$2(internalLinkActionCardPresentation, j, c1d3, bRg2, i, i2);
        }
    }
}
