package com.facebook.aura.activation.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import android.content.Context;
import com.facebook.aura.activation.model.AuraInviteFriendViewModel;

/* loaded from: classes.dex */
public final class AuraInviteFriendSheetKt$AuraInviteFriendSheet$3$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ AuraInviteFriendViewModel $inviteViewModel;
    public final /* synthetic */ String $storyAccessCodeText;
    public final /* synthetic */ String $storyCardMessage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraInviteFriendSheetKt$AuraInviteFriendSheet$3$1(String str, AuraInviteFriendViewModel auraInviteFriendViewModel, Context context, String str2) {
        super(1);
        this.$storyCardMessage = str;
        this.$inviteViewModel = auraInviteFriendViewModel;
        this.$context = context;
        this.$storyAccessCodeText = str2;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        String str = this.$storyCardMessage;
        if (str != null) {
            this.$inviteViewModel.renderStoryCard(this.$context, str, this.$storyAccessCodeText);
        }
        return new C78g() { // from class: com.facebook.aura.activation.view.AuraInviteFriendSheetKt$AuraInviteFriendSheet$3$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
