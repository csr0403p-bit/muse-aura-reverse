package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.G0W;
import android.content.Context;
import com.facebook.aura.conversation.view.richcontent.HatchDocumentChipMenuActions;
import com.facebook.aura.conversation.viewmodel.HatchConversationViewModel;
import com.facebook.aura.navigation.AuraNavigator;

/* loaded from: classes.dex */
public final class HatchConversationScreenKt$HatchConversationScreen$chipMenuActionsBuilder$1$1 extends AbstractC7559F3s implements G0W<String, String, String, HatchDocumentChipMenuActions> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ HatchConversationViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationScreenKt$HatchConversationScreen$chipMenuActionsBuilder$1$1(Context context, HatchConversationViewModel hatchConversationViewModel, AuraNavigator auraNavigator) {
        super(3);
        this.$context = context;
        this.$viewModel = hatchConversationViewModel;
        this.$navigator = auraNavigator;
    }

    @Override // X.G0W
    public final HatchDocumentChipMenuActions invoke(String str, String str2, String str3) {
        AnonymousClass003.A0u(str, str2);
        return HatchConversationScreenKt.buildDocumentMenuActions(this.$context, this.$viewModel, this.$navigator, str, str2, str3);
    }
}
