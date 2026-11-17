package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.C0Yr;
import X.C1BO;
import X.C7384Etj;
import X.C78g;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchComposerEntryPoint;
import com.facebook.aura.conversation.viewmodel.HatchConversationViewModel;
import com.facebook.aura.deeplink.HatchDeeplinkIdResolutionViewModel;

/* loaded from: classes.dex */
public final class HatchDeeplinkIdResolutionEffectKt$HatchDeeplinkIdResolutionEffect$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ HatchConversationViewModel $conversationViewModel;
    public final /* synthetic */ HatchDeeplinkIdResolutionViewModel $idResolutionViewModel;
    public final /* synthetic */ C1BO<HatchDeeplinkIdResolutionViewModel.ResolvedPrompt> $resolvedPrompt$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchDeeplinkIdResolutionEffectKt$HatchDeeplinkIdResolutionEffect$1$1(C1BO<HatchDeeplinkIdResolutionViewModel.ResolvedPrompt> c1bo, HatchConversationViewModel hatchConversationViewModel, HatchDeeplinkIdResolutionViewModel hatchDeeplinkIdResolutionViewModel) {
        super(1);
        this.$resolvedPrompt$delegate = c1bo;
        this.$conversationViewModel = hatchConversationViewModel;
        this.$idResolutionViewModel = hatchDeeplinkIdResolutionViewModel;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        HatchDeeplinkIdResolutionViewModel.ResolvedPrompt value = this.$resolvedPrompt$delegate.getValue();
        if (value != null) {
            HatchConversationViewModel hatchConversationViewModel = this.$conversationViewModel;
            HatchDeeplinkIdResolutionViewModel hatchDeeplinkIdResolutionViewModel = this.$idResolutionViewModel;
            if (C7384Etj.areEqual(AnonymousClass003.A0h(hatchConversationViewModel), value.expectedComposerText)) {
                hatchConversationViewModel.setComposerText(value.text);
                hatchConversationViewModel.requestComposerFocus();
                HatchComposerEntryPoint hatchComposerEntryPoint = value.entryPoint;
                if (hatchComposerEntryPoint != null) {
                    hatchConversationViewModel.setPendingEntryPoint(hatchComposerEntryPoint, null);
                }
            }
            hatchDeeplinkIdResolutionViewModel.onResolvedPromptConsumed(value);
        }
        return new C78g() { // from class: com.facebook.aura.conversation.view.HatchDeeplinkIdResolutionEffectKt$HatchDeeplinkIdResolutionEffect$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
