package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import X.G0V;
import com.facebook.aura.conversation.viewmodel.HatchConversationViewModel;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ConversationScreenKey;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchConversationContentKt$HatchConversationContent$jumpToAudioSource$1$1 extends AbstractC7559F3s implements G0V<String, String, Unit> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ HatchConversationViewModel $primaryConversationViewModel;
    public final /* synthetic */ HatchConversationViewModel $viewModel;

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationContentKt$HatchConversationContent$jumpToAudioSource$1$1$1, reason: invalid class name */
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
    public HatchConversationContentKt$HatchConversationContent$jumpToAudioSource$1$1(HatchConversationViewModel hatchConversationViewModel, AuraNavigator auraNavigator, HatchConversationViewModel hatchConversationViewModel2) {
        super(2);
        this.$viewModel = hatchConversationViewModel;
        this.$navigator = auraNavigator;
        this.$primaryConversationViewModel = hatchConversationViewModel2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(String str, String str2) {
        invoke2(str, str2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str, String str2) {
        HatchConversationViewModel hatchConversationViewModel;
        C7384Etj.A0Y(str, 0);
        if (str2 != null && !str2.equals(this.$viewModel.sessionId)) {
            this.$navigator.popAll(AnonymousClass1.INSTANCE);
            if (str2.equals("primary_session_id")) {
                this.$primaryConversationViewModel.jumpToMessage(str, null);
                hatchConversationViewModel = this.$primaryConversationViewModel;
            } else {
                this.$navigator.navigate((AuraNavKey) new ConversationScreenKey(str2, null, false, str, null, false), false);
                return;
            }
        } else {
            this.$viewModel.jumpToMessage(str, null);
            hatchConversationViewModel = this.$viewModel;
        }
        hatchConversationViewModel.setHighlightedMessageId(str);
    }
}
