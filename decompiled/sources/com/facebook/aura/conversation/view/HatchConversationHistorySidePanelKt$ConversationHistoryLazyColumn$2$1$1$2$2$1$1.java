package com.facebook.aura.conversation.view;

import X.AHD;
import X.AaC;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.C1062ATq;
import X.C10G;
import X.C1DG;
import X.C3TQ;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0V;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.conversation.repo.ThreadsView;
import com.facebook.aura.gateway.HatchSessionItem;
import com.facebook.aura.vds.compose.card.AuraCardStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationHistorySidePanelKt$ConversationHistoryLazyColumn$2$1$1$2$2$1$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ MutableState<AaC> $actionOverlayBounds$delegate;
    public final /* synthetic */ MutableState<HatchSessionItem> $actionOverlaySession$delegate;
    public final /* synthetic */ AHD<HatchSessionItem> $activeChannelThreads;
    public final /* synthetic */ G0U<HatchSessionItem, Unit> $onThreadClick;
    public final /* synthetic */ String $selectedSessionId;
    public final /* synthetic */ HatchSessionItem $session;
    public final /* synthetic */ AuraCardStyle $settingsCardStyle;
    public final /* synthetic */ boolean $showMoreButton;
    public final /* synthetic */ ThreadsView $view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConversationHistorySidePanelKt$ConversationHistoryLazyColumn$2$1$1$2$2$1$1(HatchSessionItem hatchSessionItem, AHD<HatchSessionItem> ahd, AuraCardStyle auraCardStyle, String str, boolean z, ThreadsView threadsView, G0U<? super HatchSessionItem, Unit> g0u, MutableState<HatchSessionItem> mutableState, MutableState<AaC> mutableState2) {
        super(2);
        this.$session = hatchSessionItem;
        this.$activeChannelThreads = ahd;
        this.$settingsCardStyle = auraCardStyle;
        this.$selectedSessionId = str;
        this.$showMoreButton = z;
        this.$view = threadsView;
        this.$onThreadClick = g0u;
        this.$actionOverlaySession$delegate = mutableState;
        this.$actionOverlayBounds$delegate = mutableState2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        float f;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            G0U g0u = null;
            C1062ATq c1062ATq = C10G.A02;
            String strDisplayAccountUsername = HatchChannelDisplayNameKt.displayAccountUsername(this.$session, this.$activeChannelThreads);
            C3TQ c3tqContentPaddingValues = this.$settingsCardStyle.contentPaddingValues(false);
            C1DG c1dgMo2489minHeightlTKBWiU = this.$settingsCardStyle.mo2489minHeightlTKBWiU();
            if (c1dgMo2489minHeightlTKBWiU != null) {
                f = c1dgMo2489minHeightlTKBWiU.A00;
            } else {
                f = 0.0f;
            }
            boolean zAreEqual = C7384Etj.areEqual(this.$session.sessionId, this.$selectedSessionId);
            if (this.$showMoreButton) {
                bfm.AgE(-1199109279);
                boolean zA67 = bfm.A67(this.$session);
                HatchSessionItem hatchSessionItem = this.$session;
                MutableState<HatchSessionItem> mutableState = this.$actionOverlaySession$delegate;
                MutableState<AaC> mutableState2 = this.$actionOverlayBounds$delegate;
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new HatchConversationHistorySidePanelKt$ConversationHistoryLazyColumn$2$1$1$2$2$1$1$1$1(hatchSessionItem, mutableState, mutableState2);
                    bfm.Ai0(objAaT);
                }
                g0u = (G0U) objAaT;
            } else {
                bfm.AgE(-1198195182);
            }
            AnonymousClass001.A1D(bfm);
            ThreadsView threadsView = this.$view;
            HatchSessionItem hatchSessionItem2 = this.$session;
            boolean zA1T = AnonymousClass001.A1T(bfm, this.$session, bfm.A65(this.$onThreadClick));
            G0U<HatchSessionItem, Unit> g0u2 = this.$onThreadClick;
            HatchSessionItem hatchSessionItem3 = this.$session;
            Object objAaT2 = bfm.AaT();
            if (zA1T || objAaT2 == C78N.A00) {
                objAaT2 = new HatchConversationHistorySidePanelKt$ConversationHistoryLazyColumn$2$1$1$2$2$1$1$2$1(g0u2, hatchSessionItem3);
                bfm.Ai0(objAaT2);
            }
            Function0 function0 = (Function0) objAaT2;
            boolean zA672 = bfm.A67(this.$session);
            HatchSessionItem hatchSessionItem4 = this.$session;
            MutableState<HatchSessionItem> mutableState3 = this.$actionOverlaySession$delegate;
            MutableState<AaC> mutableState4 = this.$actionOverlayBounds$delegate;
            Object objAaT3 = bfm.AaT();
            if (zA672 || objAaT3 == C78N.A00) {
                objAaT3 = new HatchConversationHistorySidePanelKt$ConversationHistoryLazyColumn$2$1$1$2$2$1$1$3$1(hatchSessionItem4, mutableState3, mutableState4);
                bfm.Ai0(objAaT3);
            }
            HatchConversationHistorySidePanelKt.m550ConversationHistoryRowyKJFJhA(threadsView, hatchSessionItem2, strDisplayAccountUsername, c3tqContentPaddingValues, function0, (G0U) objAaT3, g0u, zAreEqual, c1062ATq, false, f, bfm, (HatchSessionItem.$stable << 3) | 100663296, 0, 512);
            return;
        }
        bfm.Afo();
    }
}
