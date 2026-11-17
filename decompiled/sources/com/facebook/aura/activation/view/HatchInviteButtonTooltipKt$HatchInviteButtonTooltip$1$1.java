package com.facebook.aura.activation.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.facebook.aura.activation.model.InviteTooltipViewModel;

/* loaded from: classes.dex */
public final class HatchInviteButtonTooltipKt$HatchInviteButtonTooltip$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ InviteTooltipViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchInviteButtonTooltipKt$HatchInviteButtonTooltip$1$1(InviteTooltipViewModel inviteTooltipViewModel, boolean z) {
        super(1);
        this.$viewModel = inviteTooltipViewModel;
        this.$enabled = z;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        this.$viewModel.onShown(this.$enabled);
        final InviteTooltipViewModel inviteTooltipViewModel = this.$viewModel;
        return new C78g() { // from class: com.facebook.aura.activation.view.HatchInviteButtonTooltipKt$HatchInviteButtonTooltip$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                inviteTooltipViewModel.onHidden();
            }
        };
    }
}
