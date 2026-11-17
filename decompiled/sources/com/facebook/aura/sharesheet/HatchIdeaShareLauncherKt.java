package com.facebook.aura.sharesheet;

import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.BFM;
import X.C1BO;
import X.C3UX;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.common.coroutines.OnDuplicateCall;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.common.coroutines.SingleFlightKt;
import com.facebook.aura.explore.repo.IdeaCard;
import com.facebook.aura.explore.repo.IdeaCardsDataSource;
import com.facebook.aura.model.IdeaSharing;
import com.facebook.aura.navigation.AuraNavigator;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class HatchIdeaShareLauncherKt {
    public static final HatchIdeaShareAction rememberHatchIdeaShareAction(IdeaCard ideaCard, BFM bfm, int i) {
        C7384Etj.A0Y(ideaCard, 0);
        Context contextA0H = AnonymousClass002.A0H(bfm);
        AuraNavigator auraNavigatorA0b = AnonymousClass003.A0b(bfm);
        AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
        boolean zA65 = bfm.A65(abstractC3358CGzA0h);
        Object objAaT = bfm.AaT();
        if (zA65 || objAaT == C78N.A00) {
            objAaT = IdeaCardsDataSource.Companion.getInstance(abstractC3358CGzA0h);
            bfm.Ai0(objAaT);
        }
        IdeaCardsDataSource ideaCardsDataSource = (IdeaCardsDataSource) objAaT;
        IdeaSharing ideaSharing = (IdeaSharing) ((Map) C1BO.A07(bfm, ideaCardsDataSource.sharingOverrides)).get(ideaCard.ideaCardId);
        if (ideaSharing == null) {
            ideaSharing = ideaCard.sharing;
        }
        Object objAaT2 = bfm.AaT();
        Object obj = C78N.A00;
        C3UX c3ux = (C3UX) AnonymousClass004.A15(bfm, objAaT2, obj);
        boolean zA652 = bfm.A65(abstractC3358CGzA0h);
        Object objAaT3 = bfm.AaT();
        if (zA652 || objAaT3 == obj) {
            objAaT3 = SingleFlightKt.SingleFlight(abstractC3358CGzA0h, OnDuplicateCall.Join.INSTANCE, false);
            bfm.Ai0(objAaT3);
        }
        SingleFlight singleFlight = (SingleFlight) objAaT3;
        boolean zA1K = AnonymousClass003.A1K(bfm, ideaCard, abstractC3358CGzA0h);
        Object objAaT4 = bfm.AaT();
        if (zA1K || objAaT4 == obj) {
            objAaT4 = AnonymousClass005.A0S(bfm, false);
        }
        MutableState mutableState = (MutableState) objAaT4;
        boolean zA1T = AnonymousClass005.A1T(bfm, c3ux, singleFlight, mutableState, bfm.A65(abstractC3358CGzA0h) | AnonymousClass001.A1R(bfm, auraNavigatorA0b, AnonymousClass005.A1T(bfm, ideaSharing, ideaCardsDataSource, contextA0H, bfm.A65(ideaCard))));
        Object objAaT5 = bfm.AaT();
        if (zA1T || objAaT5 == obj) {
            objAaT5 = new HatchIdeaShareLauncherKt$rememberHatchIdeaShareAction$onClick$1$1(c3ux, singleFlight, ideaCard, mutableState, ideaCardsDataSource, auraNavigatorA0b, contextA0H);
            bfm.Ai0(objAaT5);
        }
        G0U g0u = (G0U) objAaT5;
        if (ideaSharing.getCanShare()) {
            return new HatchIdeaShareAction(g0u, MutableState.A0A(mutableState));
        }
        return null;
    }
}
