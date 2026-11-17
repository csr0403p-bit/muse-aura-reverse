package com.facebook.aura.activation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass037;
import X.BFM;
import X.C0CD;
import X.C1BO;
import X.C7384Etj;
import X.C78N;
import X.CFK;
import X.G0U;
import X.G0W;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.activation.data.HatchInviteGiftVideo;
import com.facebook.aura.activation.data.HatchInviteReward;
import com.facebook.aura.activation.model.AuraInviteFriendViewModel;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.facebook.aura.sharesheet.HatchShareRecipient;
import com.facebook.aura.sharesheet.HatchShareSheetKt;
import com.facebook.aura.sharesheet.HatchShareSheetLoadingState;
import com.facebook.aura.sharesheet.HatchShareSheetUiState;
import com.facebook.aura.sharesheet.HatchShareSheetViewModel;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraInviteFriendSheetKt$AuraInviteFriendSheet$6$1 extends AbstractC7559F3s implements G0U<C0CD, Unit> {
    public final /* synthetic */ int $completedLoadsAtOpen;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ String $inviteCode;
    public final /* synthetic */ C1BO<AuraInviteFriendViewModel.UiState> $inviteState$delegate;
    public final /* synthetic */ MutableState<Boolean> $isInviteCodeRevealed$delegate;
    public final /* synthetic */ G0U<String, Unit> $onCopyCode;
    public final /* synthetic */ Function0<Unit> $onInviteUnavailable;
    public final /* synthetic */ Function0<Unit> $onSubtitleLinkClick;
    public final /* synthetic */ C1BO<HatchShareSheetUiState> $shareState$delegate;
    public final /* synthetic */ String $shareText;
    public final /* synthetic */ HatchShareSheetViewModel $shareViewModel;

    /* renamed from: com.facebook.aura.activation.view.AuraInviteFriendSheetKt$AuraInviteFriendSheet$6$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ int $completedLoadsAtOpen;
        public final /* synthetic */ String $inviteCode;
        public final /* synthetic */ C1BO<AuraInviteFriendViewModel.UiState> $inviteState$delegate;
        public final /* synthetic */ MutableState<Boolean> $isInviteCodeRevealed$delegate;
        public final /* synthetic */ G0U<String, Unit> $onCopyCode;
        public final /* synthetic */ Function0<Unit> $onSubtitleLinkClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(String str, int i, G0U<? super String, Unit> g0u, MutableState<Boolean> mutableState, Function0<Unit> function0, C1BO<AuraInviteFriendViewModel.UiState> c1bo) {
            super(3);
            this.$inviteCode = str;
            this.$completedLoadsAtOpen = i;
            this.$onCopyCode = g0u;
            this.$isInviteCodeRevealed$delegate = mutableState;
            this.$onSubtitleLinkClick = function0;
            this.$inviteState$delegate = c1bo;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            C7384Etj.A0Y(anonymousClass037, 0);
            boolean z = false;
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                String str = this.$inviteState$delegate.getValue().subtitle;
                String str2 = this.$inviteState$delegate.getValue().subtitleLinkText;
                String str3 = this.$inviteCode;
                boolean zA0A = MutableState.A0A((MutableState) this.$isInviteCodeRevealed$delegate);
                boolean z2 = this.$inviteState$delegate.getValue().showsGift;
                HatchInviteGiftVideo hatchInviteGiftVideo = this.$inviteState$delegate.getValue().giftVideo;
                if (this.$inviteState$delegate.getValue().completedLoads > this.$completedLoadsAtOpen) {
                    z = true;
                }
                HatchInviteReward hatchInviteReward = this.$inviteState$delegate.getValue().reward;
                G0U<String, Unit> g0u = this.$onCopyCode;
                boolean zA65 = bfm.A65(this.$isInviteCodeRevealed$delegate);
                MutableState<Boolean> mutableState = this.$isInviteCodeRevealed$delegate;
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new AuraInviteFriendSheetKt$AuraInviteFriendSheet$6$1$1$1$1(mutableState);
                    bfm.Ai0(objAaT);
                }
                AuraInviteFriendSheetKt.AuraInvitePitch(str, str2, str3, zA0A, z2, hatchInviteGiftVideo, z, hatchInviteReward, g0u, (Function0) objAaT, this.$onSubtitleLinkClick, null, bfm, 0, 0, 2048);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.activation.view.AuraInviteFriendSheetKt$AuraInviteFriendSheet$6$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<HatchShareRecipient, Unit> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ Function0<Unit> $onInviteUnavailable;
        public final /* synthetic */ String $shareText;
        public final /* synthetic */ HatchShareSheetViewModel $shareViewModel;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(HatchShareRecipient hatchShareRecipient) {
            C7384Etj.A0Y(hatchShareRecipient, 0);
            String str = this.$shareText;
            if (str != null) {
                this.$shareViewModel.shareToRecipient(this.$context, str, hatchShareRecipient);
            } else {
                CFK.A05("HatchInviteShare", "Invite recipient unavailable");
                this.$onInviteUnavailable.invoke();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, HatchShareSheetViewModel hatchShareSheetViewModel, Context context, Function0<Unit> function0) {
            super(1);
            this.$shareText = str;
            this.$shareViewModel = hatchShareSheetViewModel;
            this.$context = context;
            this.$onInviteUnavailable = function0;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(HatchShareRecipient hatchShareRecipient) {
            invoke2(hatchShareRecipient);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C0CD c0cd) {
        C7384Etj.A0Y(c0cd, 0);
        c0cd.APJ("invite_pitch", "invite_pitch", AnonymousClass001.A0M(new AnonymousClass1(this.$inviteCode, this.$completedLoadsAtOpen, this.$onCopyCode, this.$isInviteCodeRevealed$delegate, this.$onSubtitleLinkClick, this.$inviteState$delegate), -304841723));
        if (this.$inviteState$delegate.getValue().isLoading || this.$shareState$delegate.getValue().loadingState == HatchShareSheetLoadingState.LOADING) {
            c0cd.APJ(AuraButtonKt.LOADING_TAG, AuraDeeplinkRouteMapper.STATUS_ROUTE, ComposableSingletons$AuraInviteFriendSheetKt.lambda$2019898506);
        } else {
            HatchShareSheetKt.HatchShareRecipientsSection(c0cd, this.$shareState$delegate.getValue().data.recipients, this.$shareState$delegate.getValue().recipientSendStates, new AnonymousClass2(this.$shareText, this.$shareViewModel, this.$context, this.$onInviteUnavailable));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraInviteFriendSheetKt$AuraInviteFriendSheet$6$1(String str, int i, G0U<? super String, Unit> g0u, MutableState<Boolean> mutableState, Function0<Unit> function0, C1BO<AuraInviteFriendViewModel.UiState> c1bo, C1BO<HatchShareSheetUiState> c1bo2, String str2, HatchShareSheetViewModel hatchShareSheetViewModel, Context context, Function0<Unit> function02) {
        super(1);
        this.$inviteCode = str;
        this.$completedLoadsAtOpen = i;
        this.$onCopyCode = g0u;
        this.$isInviteCodeRevealed$delegate = mutableState;
        this.$onSubtitleLinkClick = function0;
        this.$inviteState$delegate = c1bo;
        this.$shareState$delegate = c1bo2;
        this.$shareText = str2;
        this.$shareViewModel = hatchShareSheetViewModel;
        this.$context = context;
        this.$onInviteUnavailable = function02;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C0CD c0cd) {
        invoke2(c0cd);
        return Unit.INSTANCE;
    }
}
