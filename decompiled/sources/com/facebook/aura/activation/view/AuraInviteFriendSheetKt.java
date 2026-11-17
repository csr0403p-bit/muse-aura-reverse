package com.facebook.aura.activation.view;

import X.AEk;
import X.AKH;
import X.AKQ;
import X.AVy;
import X.AXY;
import X.AYU;
import X.AZE;
import X.Ab3;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.ApQ;
import X.AxM;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BJe;
import X.BO6;
import X.BOf;
import X.BRg;
import X.C00x;
import X.C06G;
import X.C0953AJg;
import X.C1062ATq;
import X.C10G;
import X.C14P;
import X.C1515AkP;
import X.C1822Arm;
import X.C1BO;
import X.C1DG;
import X.C1DI;
import X.C1DM;
import X.C1SA;
import X.C1YL;
import X.C2VU;
import X.C31t;
import X.C3TG;
import X.C3UC;
import X.C3Ue;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.CFK;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.HxE;
import X.InterfaceC1134Abi;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.Constraints;
import com.facebook.aura.R;
import com.facebook.aura.activation.data.HatchInviteGiftVideo;
import com.facebook.aura.activation.data.HatchInviteReward;
import com.facebook.aura.activation.model.AuraInviteFriendViewModel;
import com.facebook.aura.common.appname.HatchAppName;
import com.facebook.aura.common.video.HatchVideoPlayer;
import com.facebook.aura.common.video.HatchVideoPlayerComposableKt;
import com.facebook.aura.common.video.RememberHatchVideoPlayerKt;
import com.facebook.aura.conversation.view.HatchUrlClickHandlerKt;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.facebook.aura.file.utils.HatchFileUIUtils;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.sharesheet.HatchShareDestination;
import com.facebook.aura.sharesheet.HatchShareLogContext;
import com.facebook.aura.sharesheet.HatchShareSheetUiState;
import com.facebook.aura.sharesheet.HatchShareSheetViewModel;
import com.facebook.aura.uicontrol.UiControlActionSink;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.card.AuraCardContent;
import com.facebook.aura.vds.compose.card.AuraCardKt;
import com.facebook.aura.vds.compose.card.AuraCardStyle;
import com.facebook.aura.vds.compose.card.AuraCardStyles;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndBodyStyle;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndHeadlineStyle;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class AuraInviteFriendSheetKt {
    public static final String CODE_CLIP_LABEL = "invite_code";
    public static final String INVITE_CLIP_LABEL = "invite_message";
    public static final long INVITE_GIFT_RENDER_TIMEOUT_MS = 5000;
    public static final String INVITE_GIFT_SURFACE_TAG = "invite_gift";
    public static final String INVITE_SHARE_TAG = "HatchInviteShare";
    public static final String SUBTITLE_LINK_TAG = "invite_subtitle_link";

    /* renamed from: com.facebook.aura.activation.view.AuraInviteFriendSheetKt$AuraInviteEarnedUsageCard$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $body;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, String str2, BRg bRg, int i, int i2) {
            super(2);
            this.$title = str;
            this.$body = str2;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraInviteFriendSheetKt.AuraInviteEarnedUsageCard(this.$title, this.$body, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.activation.view.AuraInviteFriendSheetKt$AuraInviteFriendSheet$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ String $feedCaption;
        public final /* synthetic */ String $feedShareText;
        public final /* synthetic */ String $inviteLink;
        public final /* synthetic */ C1BO<AuraInviteFriendViewModel.UiState> $inviteState$delegate;
        public final /* synthetic */ HatchShareLogContext $logContext;
        public final /* synthetic */ Function0<Unit> $onInviteUnavailable;
        public final /* synthetic */ C1BO<HatchShareSheetUiState> $shareState$delegate;
        public final /* synthetic */ String $shareText;
        public final /* synthetic */ HatchShareSheetViewModel $shareViewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(String str, String str2, Function0<Unit> function0, HatchShareSheetViewModel hatchShareSheetViewModel, Context context, String str3, String str4, HatchShareLogContext hatchShareLogContext, C1BO<AuraInviteFriendViewModel.UiState> c1bo, C1BO<HatchShareSheetUiState> c1bo2) {
            super(2);
            this.$inviteLink = str;
            this.$shareText = str2;
            this.$onInviteUnavailable = function0;
            this.$shareViewModel = hatchShareSheetViewModel;
            this.$context = context;
            this.$feedShareText = str3;
            this.$feedCaption = str4;
            this.$logContext = hatchShareLogContext;
            this.$inviteState$delegate = c1bo;
            this.$shareState$delegate = c1bo2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void invoke(X.BFM r30, int r31) {
            /*
                Method dump skipped, instructions count: 620
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.activation.view.AuraInviteFriendSheetKt.AnonymousClass5.invoke(X.BFM, int):void");
        }
    }

    /* renamed from: com.facebook.aura.activation.view.AuraInviteFriendSheetKt$AuraInviteFriendSheet$7, reason: invalid class name */
    public final class AnonymousClass7 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(BRg bRg, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraInviteFriendSheetKt.AuraInviteFriendSheet(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.activation.view.AuraInviteFriendSheetKt$AuraInviteGift$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchInviteGiftVideo $giftVideo;
        public final /* synthetic */ boolean $hasLoadedSinceOpen;
        public final /* synthetic */ boolean $isOverlappedByCode;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(HatchInviteGiftVideo hatchInviteGiftVideo, boolean z, boolean z2, BRg bRg, int i, int i2) {
            super(2);
            this.$giftVideo = hatchInviteGiftVideo;
            this.$hasLoadedSinceOpen = z;
            this.$isOverlappedByCode = z2;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraInviteFriendSheetKt.AuraInviteGift(this.$giftVideo, this.$hasLoadedSinceOpen, this.$isOverlappedByCode, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.activation.view.AuraInviteFriendSheetKt$AuraInviteGiftVideo$2, reason: invalid class name and case insensitive filesystem */
    public final class C107112 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchInviteGiftVideo $giftVideo;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onMediaError;
        public final /* synthetic */ Function0<Unit> $onMediaRendered;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107112(HatchInviteGiftVideo hatchInviteGiftVideo, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, int i, int i2) {
            super(2);
            this.$giftVideo = hatchInviteGiftVideo;
            this.$onMediaError = function0;
            this.$onMediaRendered = function02;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraInviteFriendSheetKt.AuraInviteGiftVideo(this.$giftVideo, this.$onMediaError, this.$onMediaRendered, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.activation.view.AuraInviteFriendSheetKt$AuraInvitePitch$2, reason: invalid class name and case insensitive filesystem */
    public final class C107122 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchInviteGiftVideo $giftVideo;
        public final /* synthetic */ boolean $hasLoadedSinceOpen;
        public final /* synthetic */ String $inviteCode;
        public final /* synthetic */ boolean $isInviteCodeRevealed;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<String, Unit> $onCopyCode;
        public final /* synthetic */ Function0<Unit> $onInviteCodeRevealed;
        public final /* synthetic */ Function0<Unit> $onSubtitleLinkClick;
        public final /* synthetic */ HatchInviteReward $reward;
        public final /* synthetic */ boolean $showsGift;
        public final /* synthetic */ String $subtitle;
        public final /* synthetic */ String $subtitleLinkText;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C107122(String str, String str2, String str3, boolean z, boolean z2, HatchInviteGiftVideo hatchInviteGiftVideo, boolean z3, HatchInviteReward hatchInviteReward, G0U<? super String, Unit> g0u, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, int i, int i2, int i3) {
            super(2);
            this.$subtitle = str;
            this.$subtitleLinkText = str2;
            this.$inviteCode = str3;
            this.$isInviteCodeRevealed = z;
            this.$showsGift = z2;
            this.$giftVideo = hatchInviteGiftVideo;
            this.$hasLoadedSinceOpen = z3;
            this.$reward = hatchInviteReward;
            this.$onCopyCode = g0u;
            this.$onInviteCodeRevealed = function0;
            this.$onSubtitleLinkClick = function02;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$changed1 = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraInviteFriendSheetKt.AuraInvitePitch(this.$subtitle, this.$subtitleLinkText, this.$inviteCode, this.$isInviteCodeRevealed, this.$showsGift, this.$giftVideo, this.$hasLoadedSinceOpen, this.$reward, this.$onCopyCode, this.$onInviteCodeRevealed, this.$onSubtitleLinkClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.activation.view.AuraInviteFriendSheetKt$AuraInviteSubtitle$2, reason: invalid class name and case insensitive filesystem */
    public final class C107132 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $linkText;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onLinkClick;
        public final /* synthetic */ String $subtitle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107132(String str, String str2, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$subtitle = str;
            this.$linkText = str2;
            this.$onLinkClick = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraInviteFriendSheetKt.AuraInviteSubtitle(this.$subtitle, this.$linkText, this.$onLinkClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.activation.view.AuraInviteFriendSheetKt$inviteShareAction$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ HatchShareDestination $destination;
        public final /* synthetic */ Function0<Unit> $onInviteUnavailable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchShareDestination hatchShareDestination, Function0<Unit> function0) {
            super(0);
            this.$destination = hatchShareDestination;
            this.$onInviteUnavailable = function0;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            CFK.A05("HatchInviteShare", AnonymousClass007.A0a("Invite destination unavailable destination=", this.$destination));
            this.$onInviteUnavailable.invoke();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.activation.view.AuraInviteFriendSheetKt$inviteShareAction$2, reason: invalid class name and case insensitive filesystem */
    public final class C107142 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ G0U<String, Unit> $action;
        public final /* synthetic */ HatchShareDestination $destination;
        public final /* synthetic */ String $resolvedPayload;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C107142(HatchShareDestination hatchShareDestination, G0U<? super String, Unit> g0u, String str) {
            super(0);
            this.$destination = hatchShareDestination;
            this.$action = g0u;
            this.$resolvedPayload = str;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            CFK.A05("HatchInviteShare", AnonymousClass007.A0a("Invite destination tapped destination=", this.$destination));
            this.$action.invoke(this.$resolvedPayload);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.activation.view.AuraInviteFriendSheetKt$overlappedBy$1, reason: invalid class name and case insensitive filesystem */
    public final class C107151 extends AbstractC7559F3s implements G0W<AXY, C3TG, Constraints, InterfaceC1134Abi> {
        public final /* synthetic */ float $fraction;

        /* renamed from: com.facebook.aura.activation.view.AuraInviteFriendSheetKt$overlappedBy$1$1, reason: invalid class name and collision with other inner class name */
        public final class C00101 extends AbstractC7559F3s implements G0U<AYU, Unit> {
            public final /* synthetic */ AZE $placeable;

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(AYU ayu) {
                C7384Etj.A0Y(ayu, 0);
                ayu.A0A(this.$placeable, 0.0f, 0, 0);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00101(AZE aze) {
                super(1);
                this.$placeable = aze;
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Unit invoke(AYU ayu) {
                invoke2(ayu);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107151(float f) {
            super(3);
            this.$fraction = f;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ InterfaceC1134Abi invoke(AXY axy, C3TG c3tg, Constraints constraints) {
            return m128invoke3p2s80s(axy, c3tg, constraints.A00);
        }

        /* renamed from: invoke-3p2s80s, reason: not valid java name */
        public final InterfaceC1134Abi m128invoke3p2s80s(AXY axy, C3TG c3tg, long j) {
            AnonymousClass003.A0u(axy, c3tg);
            AZE azeAQW = c3tg.AQW(j);
            return AnonymousClass002.A0X(axy, new C00101(azeAQW), azeAQW.A01, Ab3.A01(azeAQW.A00 * (1.0f - this.$fraction)));
        }
    }

    public static final void AuraInviteEarnedUsageCard(String str, String str2, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-2102137137);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1DM c1dmA0R = C06G.A0R(bfm);
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            BRg bRgA02 = C1DI.A02(bRgA0R, c1dmA0R, 1.0f, AnonymousClass001.A0f(bfm, akh).elevatedBorder);
            AuraCardStyle auraCardStyleM2500listoAWOtXo = AuraCardStyles.INSTANCE.m2500listoAWOtXo(C2VU.A04, AnonymousClass001.A0f(bfm, akh).card, new C1DG(AuraDimensKt.SpacingMedium), bfm, 3078, 0);
            boolean zA1N = AnonymousClass001.A1N(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1N || objAaT == C78N.A00) {
                objAaT = AnonymousClass005.A0X(str2);
                bfm.Ai0(objAaT);
            }
            C0953AJg c0953AJgA00 = C0953AJg.A00();
            long j = B6A.A07;
            AuraCardKt.m2484AuraCardjQVUvHA(bRgA02, auraCardStyleM2500listoAWOtXo, new AuraCardContent(str, (AuraIconAndHeadlineStyle) null, (BO6<String, C14P>) c0953AJgA00, (B6A) null, (ApQ) objAaT, (G0U<? super String, Unit>) null, (AuraIconAndBodyStyle) null, (B6A) null, (String) null, (C1822Arm) null, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, (String) null, true, true, (String) null, (C1822Arm) null, j, j, (C1YL) null), null, ComposableSingletons$AuraInviteFriendSheetKt.lambda$262492019, null, null, null, null, null, false, false, null, c1dmA0R, 0L, false, null, null, bfm, RuntimeInternals.IOPRIO_BACKGROUND, 0, 253928);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, str2, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0390  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AuraInviteFriendSheet(X.BRg r67, X.BFM r68, int r69, int r70) {
        /*
            Method dump skipped, instructions count: 953
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.activation.view.AuraInviteFriendSheetKt.AuraInviteFriendSheet(X.BRg, X.BFM, int, int):void");
    }

    public static final void AuraInviteGift(HatchInviteGiftVideo hatchInviteGiftVideo, boolean z, boolean z2, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-286178973);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, hatchInviteGiftVideo) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0p(bfm, z2);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0T |= 3072;
        } else if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 1171, 1170), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            HxE hxE = hatchInviteGiftVideo != null ? new HxE(Uri.parse(hatchInviteGiftVideo.lightUrl).getPath(), Uri.parse(hatchInviteGiftVideo.darkUrl).getPath()) : null;
            boolean zA65 = bfm.A65(hxE);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = AnonymousClass005.A0S(bfm, false);
            }
            MutableState mutableState = (MutableState) objAaT;
            boolean zA652 = bfm.A65(hxE);
            Object objAaT2 = bfm.AaT();
            if (zA652 || objAaT2 == C78N.A00) {
                objAaT2 = AnonymousClass005.A0S(bfm, false);
            }
            MutableState mutableState2 = (MutableState) objAaT2;
            boolean zA1R = AnonymousClass005.A1R(bfm, hxE, mutableState2, mutableState);
            Object objAaT3 = bfm.AaT();
            if (zA1R || objAaT3 == C78N.A00) {
                objAaT3 = new AuraInviteFriendSheetKt$AuraInviteGift$1$1(hxE, mutableState2, mutableState, null);
                bfm.Ai0(objAaT3);
            }
            AnonymousClass001.A18(bfm, objAaT3, hxE);
            C1BO c1boA01 = C31t.A01(null, bfm, AnonymousClass006.A00(MutableState.A0A(mutableState2) ? 1 : 0), 3072, 22);
            if (hatchInviteGiftVideo != null) {
                if (!MutableState.A0A(mutableState)) {
                    bfm.AgE(-46888982);
                    Alignment alignment = C2VU.A09;
                    BRg bRgM127fadeEdgesInto4WTKRHQ = m127fadeEdgesInto4WTKRHQ(BJe.A00(AnonymousClass001.A0R(overlappedBy(bRg2, z2 ? 0.4f : 0.0f)), hatchInviteGiftVideo.aspectRatio, false), AnonymousClass002.A0c(bfm).modal);
                    InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(alignment, false);
                    BBI bbi = (BBI) bfm;
                    int iA0J = AnonymousClass003.A0J(bbi);
                    AKQ akqA04 = BBI.A04(bbi);
                    BRg bRgA01 = AxM.A01(bfm, bRgM127fadeEdgesInto4WTKRHQ);
                    Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                    if (bbi.A0V == null) {
                        C00x.A00();
                        throw F60.createAndThrow();
                    }
                    AnonymousClass005.A0n(bfm, bbi, function0);
                    AnonymousClass005.A0p(bfm, interfaceC1380AiAA01, akqA04, bRgA01, iA0J);
                    if (MutableState.A0A(mutableState2)) {
                        bfm.AgE(-1260422658);
                    } else {
                        bfm.AgE(-1260452449);
                        AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(null, null, 0L, bfm, 0, 7);
                    }
                    BBI.A0R(bbi, false);
                    boolean zA653 = bfm.A65(mutableState);
                    Object objAaT4 = bfm.AaT();
                    if (zA653 || objAaT4 == C78N.A00) {
                        objAaT4 = new AuraInviteFriendSheetKt$AuraInviteGift$2$1$1(mutableState);
                        bfm.Ai0(objAaT4);
                    }
                    Function0 function02 = (Function0) objAaT4;
                    boolean zA654 = bfm.A65(mutableState2);
                    Object objAaT5 = bfm.AaT();
                    if (zA654 || objAaT5 == C78N.A00) {
                        objAaT5 = new AuraInviteFriendSheetKt$AuraInviteGift$2$2$1(mutableState2);
                        bfm.Ai0(objAaT5);
                    }
                    Function0 function03 = (Function0) objAaT5;
                    C1062ATq c1062ATq = C10G.A01;
                    boolean zA655 = bfm.A65(c1boA01);
                    Object objAaT6 = bfm.AaT();
                    if (zA655 || objAaT6 == C78N.A00) {
                        objAaT6 = new AuraInviteFriendSheetKt$AuraInviteGift$2$3$1(c1boA01);
                        bfm.Ai0(objAaT6);
                    }
                    AuraInviteGiftVideo(hatchInviteGiftVideo, function02, function03, AnonymousClass001.A0W(c1062ATq, objAaT6), bfm, 0, 0);
                    BBI.A0R(bbi, true);
                    AnonymousClass001.A1D(bfm);
                }
                bfm.AgE(-46223567);
                C1SA.A00(bfm, null, C10G.A0C(bRg2, 204.0f, 120.0f), null, BOf.A00(bfm, R.drawable.hatch_invite_gift_illustration, 0), null, null, 0.0f, AVy.$stable | 48, 120);
                AnonymousClass001.A1D(bfm);
            } else {
                if (!z) {
                    bfm.AgE(-46025601);
                    AnonymousClass001.A1D(bfm);
                }
                bfm.AgE(-46223567);
                C1SA.A00(bfm, null, C10G.A0C(bRg2, 204.0f, 120.0f), null, BOf.A00(bfm, R.drawable.hatch_invite_gift_illustration, 0), null, null, 0.0f, AVy.$stable | 48, 120);
                AnonymousClass001.A1D(bfm);
            }
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(hatchInviteGiftVideo, z, z2, bRg2, i, i2);
        }
    }

    public static final void AuraInviteGiftVideo(HatchInviteGiftVideo hatchInviteGiftVideo, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1854757028);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, hatchInviteGiftVideo) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, function02);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0T |= 3072;
        } else if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String str = AnonymousClass002.A0c(bfm).isLight ? hatchInviteGiftVideo.lightUrl : hatchInviteGiftVideo.darkUrl;
            String path = Uri.parse(str).getPath();
            boolean zA65 = bfm.A65(path);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = Uri.parse(str);
                bfm.Ai0(objAaT);
            }
            Uri uri = (Uri) objAaT;
            HatchVideoPlayer hatchVideoPlayerRememberHatchVideoPlayer = RememberHatchVideoPlayerKt.rememberHatchVideoPlayer(HatchVideoPlayer.RepeatMode.ALL, false, false, bfm, 6, 6);
            HatchVideoPlayer.ResizeMode resizeMode = HatchVideoPlayer.ResizeMode.ZOOM;
            float f = hatchInviteGiftVideo.aspectRatio;
            boolean zA1C = AnonymousClass003.A1C(iA0T);
            Object objAaT2 = bfm.AaT();
            if (zA1C || objAaT2 == C78N.A00) {
                objAaT2 = new AuraInviteFriendSheetKt$AuraInviteGiftVideo$1$1(function0);
                bfm.Ai0(objAaT2);
            }
            HatchVideoPlayerComposableKt.HatchVideoPlayerComposable(bRg2, uri, hatchVideoPlayerRememberHatchVideoPlayer, path, null, null, false, false, false, false, false, false, resizeMode, f, INVITE_GIFT_SURFACE_TAG, null, false, false, true, null, false, null, null, (G0U) objAaT2, function02, null, null, bfm, (iA0T >> 9) & 14, 102261174, (iA0T << 6) & 57344, 108692464);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C107112(hatchInviteGiftVideo, function0, function02, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AuraInvitePitch(java.lang.String r41, java.lang.String r42, java.lang.String r43, boolean r44, boolean r45, com.facebook.aura.activation.data.HatchInviteGiftVideo r46, boolean r47, com.facebook.aura.activation.data.HatchInviteReward r48, X.G0U<? super java.lang.String, kotlin.Unit> r49, kotlin.jvm.functions.Function0<kotlin.Unit> r50, kotlin.jvm.functions.Function0<kotlin.Unit> r51, X.BRg r52, X.BFM r53, int r54, int r55, int r56) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.activation.view.AuraInviteFriendSheetKt.AuraInvitePitch(java.lang.String, java.lang.String, java.lang.String, boolean, boolean, com.facebook.aura.activation.data.HatchInviteGiftVideo, boolean, com.facebook.aura.activation.data.HatchInviteReward, X.G0U, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.BRg, X.BFM, int, int, int):void");
    }

    public static final void AuraInviteSubtitle(String str, String str2, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        ApQ apQRememberLinkedSubtitle;
        BRg bRg2 = bRg;
        bfm.AgG(-1540914739);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function0);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (str2 != null) {
                bfm.AgE(-780308156);
                apQRememberLinkedSubtitle = rememberLinkedSubtitle(str, str2, function0, bfm, iA0d & 1022);
            } else {
                bfm.AgE(-780222069);
                boolean zA1M = AnonymousClass001.A1M(iA0d);
                Object objAaT = bfm.AaT();
                if (zA1M || objAaT == C78N.A00) {
                    objAaT = AnonymousClass005.A0X(str);
                    bfm.Ai0(objAaT);
                }
                apQRememberLinkedSubtitle = (ApQ) objAaT;
            }
            boolean zA1V = AnonymousClass001.A1V(bfm);
            AuraTextKt.m2640AuraTextVmYn7U0(apQRememberLinkedSubtitle, bRg2, C06G.A0C(bfm), C06G.A0Z(bfm), null, null, C1YL.A00(), 0L, zA1V, zA1V ? 1 : 0, zA1V ? 1 : 0, zA1V ? 1 : 0, null, null, null, bfm, (iA0d >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, zA1V ? 1 : 0, 32688);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C107132(str, str2, function0, bRg2, i, i2);
        }
    }

    public static final void copyToClipboard(Context context, String str, String str2, int i) {
        ClipboardManager clipboardManager;
        Object systemService = context.getSystemService(HatchFileUIUtils.CLIPBOARD_STAGING_DIR);
        if (!(systemService instanceof ClipboardManager) || (clipboardManager = (ClipboardManager) systemService) == null) {
            return;
        }
        try {
            clipboardManager.setPrimaryClip(ClipData.newPlainText(str, str2));
            if (Build.VERSION.SDK_INT < 33) {
                AnonymousClass006.A14(context, i);
            }
        } catch (SecurityException e) {
            CFK.A0A("HatchInviteShare", "Clipboard refused the copy", e);
        }
    }

    /* renamed from: fadeEdgesInto-4WTKRHQ, reason: not valid java name */
    public static final BRg m127fadeEdgesInto4WTKRHQ(BRg bRg, long j) {
        return AEk.A02(bRg, new AuraInviteFriendSheetKt$fadeEdgesInto$1(j));
    }

    public static final Function0<Unit> inviteShareAction(HatchShareDestination hatchShareDestination, boolean z, String str, Function0<Unit> function0, G0U<? super String, Unit> g0u) {
        Function0<Unit> c107142;
        if (!z) {
            c107142 = new AnonymousClass1(hatchShareDestination, function0);
        } else {
            if (str == null) {
                return null;
            }
            c107142 = new C107142(hatchShareDestination, g0u, str);
        }
        return c107142;
    }

    public static final void openServedLink(AbstractC3358CGz abstractC3358CGz, String str, Context context, AuraNavigator auraNavigator) {
        if (AuraDeeplinkRouteMapper.INSTANCE.hasRouteForUri(Uri.parse(str))) {
            UiControlActionSink.Companion.getInstance(abstractC3358CGz).publishNavigation(str);
        } else {
            HatchUrlClickHandlerKt.handleUrlClick(abstractC3358CGz, str, context, auraNavigator, null, null);
        }
    }

    public static final BRg overlappedBy(BRg bRg, float f) {
        return C3UC.A00(bRg, new C107151(f));
    }

    public static final /* synthetic */ AuraInviteFriendViewModel.UiState access$AuraInviteFriendSheet$lambda$1(C1BO c1bo) {
        return (AuraInviteFriendViewModel.UiState) c1bo.getValue();
    }

    public static final /* synthetic */ HatchShareSheetUiState access$AuraInviteFriendSheet$lambda$2(C1BO c1bo) {
        return (HatchShareSheetUiState) c1bo.getValue();
    }

    public static final String getClipIdentity(String str) {
        return Uri.parse(str).getPath();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.ApQ rememberLinkedSubtitle(java.lang.String r9, java.lang.String r10, kotlin.jvm.functions.Function0<kotlin.Unit> r11, X.BFM r12, int r13) {
        /*
            long r7 = X.C06G.A07(r12)
            java.lang.String r0 = " "
            r6 = r10
            java.lang.String r5 = X.FGI.A0U(r9, r0, r10)
            boolean r4 = r12.A65(r5)
            r0 = r13 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r3 = 0
            r2 = 32
            if (r0 <= r2) goto L1e
            boolean r0 = r12.A65(r10)
            if (r0 != 0) goto L23
        L1e:
            r1 = r13 & 48
            r0 = 0
            if (r1 != r2) goto L24
        L23:
            r0 = 1
        L24:
            boolean r2 = X.AnonymousClass002.A1T(r12, r7, r4, r0)
            r0 = r13 & 896(0x380, float:1.256E-42)
            r0 = r0 ^ 384(0x180, float:5.38E-43)
            r1 = 256(0x100, float:3.59E-43)
            r10 = r11
            if (r0 <= r1) goto L37
            boolean r0 = r12.A65(r11)
            if (r0 != 0) goto L3b
        L37:
            r0 = r13 & 384(0x180, float:5.38E-43)
            if (r0 != r1) goto L3c
        L3b:
            r3 = 1
        L3c:
            r2 = r2 | r3
            java.lang.Object r1 = r12.AaT()
            if (r2 != 0) goto L47
            java.lang.Object r0 = X.C78N.A00
            if (r1 != r0) goto L50
        L47:
            java.lang.String r9 = "invite_subtitle_link"
            X.ApQ r1 = com.facebook.aura.linktext.HatchInlineLinkTextKt.m1187buildInlineLinkTextXOJAsU(r5, r6, r7, r9, r10)
            r12.Ai0(r1)
        L50:
            X.ApQ r1 = (X.ApQ) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.activation.view.AuraInviteFriendSheetKt.rememberLinkedSubtitle(java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, X.BFM, int):X.ApQ");
    }

    public static final String resolveInviteShareText(String str, String str2, BFM bfm, int i) {
        bfm.AgE(1418241746);
        if (str2 == null) {
            AnonymousClass002.A19(bfm);
            return null;
        }
        if (str == null || C7BY.A0j(str)) {
            bfm.AgE(1425691149);
            str = AnonymousClass006.A0w(bfm, HatchAppName.value, str2, R.string._name_removed__res_0x7f120431);
        } else {
            bfm.AgE(1425689506);
        }
        AnonymousClass006.A1M(bfm);
        return str;
    }
}
