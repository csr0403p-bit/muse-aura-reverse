package com.facebook.aura.activation.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.facebook.aura.activation.model.AuraInviteFriendViewModel;

/* loaded from: classes.dex */
public final class AuraInviteFriendSheetKt$AuraInviteFriendSheet$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ AuraInviteFriendViewModel $inviteViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraInviteFriendSheetKt$AuraInviteFriendSheet$1$1(AuraInviteFriendViewModel auraInviteFriendViewModel) {
        super(1);
        this.$inviteViewModel = auraInviteFriendViewModel;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        this.$inviteViewModel.refresh();
        return new C78g() { // from class: com.facebook.aura.activation.view.AuraInviteFriendSheetKt$AuraInviteFriendSheet$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
