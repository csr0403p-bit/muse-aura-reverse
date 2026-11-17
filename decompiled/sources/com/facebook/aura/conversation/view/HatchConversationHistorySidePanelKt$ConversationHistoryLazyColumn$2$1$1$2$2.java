package com.facebook.aura.conversation.view;

import X.AHD;
import X.AaC;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.conversation.repo.ThreadsView;
import com.facebook.aura.gateway.HatchSessionItem;
import com.facebook.aura.ui.HatchLazySectionScope;
import com.facebook.aura.vds.compose.card.AuraCardStyle;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchConversationHistorySidePanelKt$ConversationHistoryLazyColumn$2$1$1$2$2 extends AbstractC7559F3s implements G0U<HatchLazySectionScope, Unit> {
    public final /* synthetic */ MutableState<AaC> $actionOverlayBounds$delegate;
    public final /* synthetic */ MutableState<HatchSessionItem> $actionOverlaySession$delegate;
    public final /* synthetic */ AHD<HatchSessionItem> $activeChannelThreads;
    public final /* synthetic */ G0U<HatchSessionItem, Unit> $onThreadClick;
    public final /* synthetic */ List<HatchSessionItem> $sectionSessions;
    public final /* synthetic */ String $selectedSessionId;
    public final /* synthetic */ AuraCardStyle $settingsCardStyle;
    public final /* synthetic */ boolean $showMoreButton;
    public final /* synthetic */ ThreadsView $view;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchLazySectionScope hatchLazySectionScope) {
        C7384Etj.A0Y(hatchLazySectionScope, 0);
        List<HatchSessionItem> list = this.$sectionSessions;
        AHD<HatchSessionItem> ahd = this.$activeChannelThreads;
        AuraCardStyle auraCardStyle = this.$settingsCardStyle;
        String str = this.$selectedSessionId;
        boolean z = this.$showMoreButton;
        ThreadsView threadsView = this.$view;
        G0U<HatchSessionItem, Unit> g0u = this.$onThreadClick;
        MutableState<HatchSessionItem> mutableState = this.$actionOverlaySession$delegate;
        MutableState<AaC> mutableState2 = this.$actionOverlayBounds$delegate;
        for (HatchSessionItem hatchSessionItem : list) {
            hatchLazySectionScope.item(hatchSessionItem.sessionId, null, AnonymousClass001.A0M(new HatchConversationHistorySidePanelKt$ConversationHistoryLazyColumn$2$1$1$2$2$1$1(hatchSessionItem, ahd, auraCardStyle, str, z, threadsView, g0u, mutableState, mutableState2), -1687693838));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConversationHistorySidePanelKt$ConversationHistoryLazyColumn$2$1$1$2$2(List<HatchSessionItem> list, AHD<HatchSessionItem> ahd, AuraCardStyle auraCardStyle, String str, boolean z, ThreadsView threadsView, G0U<? super HatchSessionItem, Unit> g0u, MutableState<HatchSessionItem> mutableState, MutableState<AaC> mutableState2) {
        super(1);
        this.$sectionSessions = list;
        this.$activeChannelThreads = ahd;
        this.$settingsCardStyle = auraCardStyle;
        this.$selectedSessionId = str;
        this.$showMoreButton = z;
        this.$view = threadsView;
        this.$onThreadClick = g0u;
        this.$actionOverlaySession$delegate = mutableState;
        this.$actionOverlayBounds$delegate = mutableState2;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchLazySectionScope hatchLazySectionScope) {
        invoke2(hatchLazySectionScope);
        return Unit.INSTANCE;
    }
}
