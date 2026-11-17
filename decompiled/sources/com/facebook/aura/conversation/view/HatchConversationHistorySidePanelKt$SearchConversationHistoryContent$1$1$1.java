package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import X.G2k;
import com.facebook.aura.conversation.data.HatchSearchHit;
import com.facebook.aura.conversation.viewmodel.HatchConversationViewModel;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ConversationScreenKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationHistorySidePanelKt$SearchConversationHistoryContent$1$1$1 extends AbstractC7559F3s implements G0W<HatchSearchHit, String, String, Unit> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ Function0<Unit> $onDismissRequest;
    public final /* synthetic */ G2k<String, String, Boolean, String, Long, Unit> $onThreadSelected;
    public final /* synthetic */ HatchConversationViewModel $primaryConversationViewModel;

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationHistorySidePanelKt$SearchConversationHistoryContent$1$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AuraNavKey, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // X.G0U
        public final Boolean invoke(AuraNavKey auraNavKey) {
            C7384Etj.A0Y(auraNavKey, 0);
            return Boolean.valueOf(auraNavKey instanceof ConversationScreenKey);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConversationHistorySidePanelKt$SearchConversationHistoryContent$1$1$1(Function0<Unit> function0, G2k<? super String, ? super String, ? super Boolean, ? super String, ? super Long, Unit> g2k, AuraNavigator auraNavigator, HatchConversationViewModel hatchConversationViewModel) {
        super(3);
        this.$onDismissRequest = function0;
        this.$onThreadSelected = g2k;
        this.$navigator = auraNavigator;
        this.$primaryConversationViewModel = hatchConversationViewModel;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(HatchSearchHit hatchSearchHit, String str, String str2) {
        invoke2(hatchSearchHit, str, str2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSearchHit hatchSearchHit, String str, String str2) {
        C7384Etj.A0Y(hatchSearchHit, 0);
        HatchConversationHistorySidePanelKt.logSearchResultClick();
        this.$onDismissRequest.invoke();
        if (hatchSearchHit.isThread && str != null) {
            this.$onThreadSelected.invoke(str, str2, false, hatchSearchHit.messageId, hatchSearchHit.seq);
            return;
        }
        this.$navigator.popAll(AnonymousClass1.INSTANCE);
        this.$primaryConversationViewModel.jumpToMessage(hatchSearchHit.messageId, hatchSearchHit.seq);
        this.$primaryConversationViewModel.setHighlightedMessageId(hatchSearchHit.messageId);
    }
}
