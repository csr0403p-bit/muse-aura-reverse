package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C1BO;
import X.C1DG;
import X.C3Em;
import X.G0U;
import X.G2j;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.conversation.viewmodel.HatchConversationUiState;
import com.facebook.aura.conversation.viewmodel.HatchConversationViewModel;
import com.facebook.aura.deeplink.PendingDeeplinkMessage;
import com.facebook.aura.gateway.HatchSessionItem;
import com.facebook.aura.perf.HatchNavTTRCCoordinator;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchConversationScreenKt$HatchConversationScreen$18$1$11 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
    public final /* synthetic */ HatchSessionItem $channelSideChat;
    public final /* synthetic */ String $displayThreadTitle;
    public final /* synthetic */ String $highlightMessageId;
    public final /* synthetic */ C1BO<String> $highlightedMessageId$delegate;
    public final /* synthetic */ boolean $isArchivedContext;
    public final /* synthetic */ boolean $isMainTab;
    public final /* synthetic */ boolean $isReadOnly;
    public final /* synthetic */ HatchNavTTRCCoordinator $navTtrcCoordinator;
    public final /* synthetic */ G0U<String, Unit> $onRichFormatOpenCTAClick;
    public final /* synthetic */ C1BO<PendingDeeplinkMessage> $pendingDeeplinkMessage$delegate;
    public final /* synthetic */ MutableState<Boolean> $showMicDeniedDialog$delegate;
    public final /* synthetic */ C3Em<Unit> $tabReselectedFlow;
    public final /* synthetic */ String $threadId;
    public final /* synthetic */ C1BO<HatchConversationUiState> $uiState$delegate;
    public final /* synthetic */ HatchConversationViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConversationScreenKt$HatchConversationScreen$18$1$11(HatchSessionItem hatchSessionItem, HatchConversationViewModel hatchConversationViewModel, String str, G0U<? super String, Unit> g0u, HatchNavTTRCCoordinator hatchNavTTRCCoordinator, boolean z, boolean z2, boolean z3, C3Em<Unit> c3Em, C1BO<PendingDeeplinkMessage> c1bo, String str2, String str3, C1BO<String> c1bo2, C1BO<HatchConversationUiState> c1bo3, MutableState<Boolean> mutableState) {
        super(4);
        this.$channelSideChat = hatchSessionItem;
        this.$viewModel = hatchConversationViewModel;
        this.$displayThreadTitle = str;
        this.$onRichFormatOpenCTAClick = g0u;
        this.$navTtrcCoordinator = hatchNavTTRCCoordinator;
        this.$isMainTab = z;
        this.$isArchivedContext = z2;
        this.$isReadOnly = z3;
        this.$tabReselectedFlow = c3Em;
        this.$pendingDeeplinkMessage$delegate = c1bo;
        this.$highlightMessageId = str2;
        this.$threadId = str3;
        this.$highlightedMessageId$delegate = c1bo2;
        this.$uiState$delegate = c1bo3;
        this.$showMicDeniedDialog$delegate = mutableState;
    }

    @Override // X.G2j
    public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
        m572invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0272  */
    /* renamed from: invoke-i1RSzL4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m572invokei1RSzL4(float r43, float r44, X.BFM r45, int r46) {
        /*
            Method dump skipped, instructions count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchConversationScreenKt$HatchConversationScreen$18$1$11.m572invokei1RSzL4(float, float, X.BFM, int):void");
    }
}
