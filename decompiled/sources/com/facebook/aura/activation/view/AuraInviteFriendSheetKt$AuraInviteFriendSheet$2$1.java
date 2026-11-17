package com.facebook.aura.activation.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C1BO;
import X.C78g;
import X.G0U;
import com.facebook.aura.activation.model.AuraInviteFriendViewModel;

/* loaded from: classes.dex */
public final class AuraInviteFriendSheetKt$AuraInviteFriendSheet$2$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ String $inviteLink;
    public final /* synthetic */ C1BO<AuraInviteFriendViewModel.UiState> $inviteState$delegate;
    public final /* synthetic */ String $shareText;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraInviteFriendSheetKt$AuraInviteFriendSheet$2$1(String str, String str2, C1BO<AuraInviteFriendViewModel.UiState> c1bo) {
        super(1);
        this.$inviteLink = str;
        this.$shareText = str2;
        this.$inviteState$delegate = c1bo;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0024  */
    @Override // X.G0U
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C78g invoke(X.C0Yr r8) {
        /*
            r7 = this;
            X.1BO<com.facebook.aura.activation.model.AuraInviteFriendViewModel$UiState> r0 = r7.$inviteState$delegate
            java.lang.Object r0 = r0.getValue()
            com.facebook.aura.activation.model.AuraInviteFriendViewModel$UiState r0 = (com.facebook.aura.activation.model.AuraInviteFriendViewModel.UiState) r0
            boolean r6 = r0.isLoading
            java.lang.String r0 = r7.$inviteLink
            r4 = 0
            boolean r5 = X.AnonymousClass002.A1X(r0)
            X.1BO<com.facebook.aura.activation.model.AuraInviteFriendViewModel$UiState> r0 = r7.$inviteState$delegate
            java.lang.Object r0 = r0.getValue()
            com.facebook.aura.activation.model.AuraInviteFriendViewModel$UiState r0 = (com.facebook.aura.activation.model.AuraInviteFriendViewModel.UiState) r0
            java.lang.String r0 = r0.shareText
            if (r0 == 0) goto L24
            boolean r1 = X.C7BY.A0j(r0)
            r0 = 0
            if (r1 == 0) goto L25
        L24:
            r0 = 1
        L25:
            r3 = r0 ^ 1
            java.lang.String r0 = r7.$shareText
            boolean r2 = X.AnonymousClass002.A1X(r0)
            X.1BO<com.facebook.aura.activation.model.AuraInviteFriendViewModel$UiState> r0 = r7.$inviteState$delegate
            java.lang.Object r0 = r0.getValue()
            com.facebook.aura.activation.model.AuraInviteFriendViewModel$UiState r0 = (com.facebook.aura.activation.model.AuraInviteFriendViewModel.UiState) r0
            java.lang.String r0 = r0.storyCardUri
            if (r0 == 0) goto L3a
            r4 = 1
        L3a:
            java.lang.String r0 = "Invite sheet state loading="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r6)
            java.lang.String r0 = " inviteLinkAvailable="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " serverShareTextAvailable="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " resolvedShareTextAvailable="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " storyCardAvailable="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "HatchInviteShare"
            X.CFK.A05(r0, r1)
            com.facebook.aura.activation.view.AuraInviteFriendSheetKt$AuraInviteFriendSheet$2$1$invoke$$inlined$onDispose$1 r0 = new com.facebook.aura.activation.view.AuraInviteFriendSheetKt$AuraInviteFriendSheet$2$1$invoke$$inlined$onDispose$1
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.activation.view.AuraInviteFriendSheetKt$AuraInviteFriendSheet$2$1.invoke(X.0Yr):X.78g");
    }
}
