package com.facebook.aura.sharesheet;

import X.AHD;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass037;
import X.B1V;
import X.BFM;
import X.BRg;
import X.C06G;
import X.C0CD;
import X.C10G;
import X.C1822Arm;
import X.C1BO;
import X.C1YL;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0W;
import android.content.Context;
import com.facebook.aura.R;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.facebook.aura.navigation.key.ShareType;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchShareSheetKt$HatchShareSheet$4$1 extends AbstractC7559F3s implements G0U<C0CD, Unit> {
    public final /* synthetic */ String $artifactSubtitle;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ boolean $includeRecipients;
    public final /* synthetic */ boolean $isIdeaUnavailable;
    public final /* synthetic */ boolean $isIneligible;
    public final /* synthetic */ boolean $isLinkShare;
    public final /* synthetic */ String $linkTitle;
    public final /* synthetic */ String $previewDescription;
    public final /* synthetic */ String $previewUri;
    public final /* synthetic */ String $resolvedPreviewUri;
    public final /* synthetic */ String $sharePayload;
    public final /* synthetic */ ShareType $shareType;
    public final /* synthetic */ C1BO<HatchShareSheetUiState> $uiState$delegate;
    public final /* synthetic */ HatchShareSheetViewModel $viewModel;

    /* renamed from: com.facebook.aura.sharesheet.HatchShareSheetKt$HatchShareSheet$4$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ boolean $isIdeaUnavailable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z) {
            super(3);
            this.$isIdeaUnavailable = z;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, anonymousClass037), bfm, i)) {
                boolean z = this.$isIdeaUnavailable;
                int i2 = R.string._name_removed__res_0x7f1205c4;
                if (z) {
                    i2 = R.string._name_removed__res_0x7f1205d5;
                }
                String strA01 = AbstractC2271BQs.A01(bfm, i2);
                C1822Arm c1822ArmA0Z = C06G.A0Z(bfm);
                long jA0C = C06G.A0C(bfm);
                BRg bRgA0C = C3U4.A0C(C10G.A02, 24.0f, 0.0f, 24.0f, 16.0f);
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = HatchShareSheetKt$HatchShareSheet$4$1$1$1$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                AuraTextKt.m2639AuraTextUY9GdpU(strA01, AnonymousClass001.A0Y(bRgA0C, objAaT, false), jA0C, c1822ArmA0Z, null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.sharesheet.HatchShareSheetKt$HatchShareSheet$4$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ String $artifactSubtitle;
        public final /* synthetic */ boolean $isIneligible;
        public final /* synthetic */ boolean $isLinkShare;
        public final /* synthetic */ String $linkTitle;
        public final /* synthetic */ String $previewDescription;
        public final /* synthetic */ String $previewUri;
        public final /* synthetic */ String $resolvedPreviewUri;
        public final /* synthetic */ ShareType $shareType;
        public final /* synthetic */ C1BO<HatchShareSheetUiState> $uiState$delegate;
        public final /* synthetic */ HatchShareSheetViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ShareType shareType, boolean z, String str, boolean z2, String str2, String str3, String str4, String str5, C1BO<HatchShareSheetUiState> c1bo, HatchShareSheetViewModel hatchShareSheetViewModel) {
            super(3);
            this.$shareType = shareType;
            this.$isIneligible = z;
            this.$resolvedPreviewUri = str;
            this.$isLinkShare = z2;
            this.$previewUri = str2;
            this.$linkTitle = str3;
            this.$artifactSubtitle = str4;
            this.$previewDescription = str5;
            this.$uiState$delegate = c1bo;
            this.$viewModel = hatchShareSheetViewModel;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:52:0x01b6  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void invoke(X.AnonymousClass037 r42, X.BFM r43, int r44) {
            /*
                Method dump skipped, instructions count: 637
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.sharesheet.HatchShareSheetKt$HatchShareSheet$4$1.AnonymousClass2.invoke(X.037, X.BFM, int):void");
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C0CD c0cd) {
        C7384Etj.A0Y(c0cd, 0);
        if (this.$isIneligible) {
            c0cd.APJ("ineligible_explanation", AuraDeeplinkRouteMapper.STATUS_ROUTE, B1V.A01(new AnonymousClass1(this.$isIdeaUnavailable), 1732797796, true));
        }
        c0cd.APJ("media_preview", "media_preview", B1V.A01(new AnonymousClass2(this.$shareType, this.$isIneligible, this.$resolvedPreviewUri, this.$isLinkShare, this.$previewUri, this.$linkTitle, this.$artifactSubtitle, this.$previewDescription, this.$uiState$delegate, this.$viewModel), -363552481, true));
        if (this.$uiState$delegate.getValue().showsReviewBeforeSharing) {
            c0cd.APJ("review_warning", AuraDeeplinkRouteMapper.STATUS_ROUTE, ComposableSingletons$HatchShareSheetKt.f268lambda$160432371);
        }
        if (!this.$includeRecipients || this.$isIneligible || this.$uiState$delegate.getValue().isCheckingEligibility) {
            return;
        }
        int iOrdinal = this.$uiState$delegate.getValue().loadingState.ordinal();
        if (iOrdinal == 0) {
            c0cd.APJ(AuraButtonKt.LOADING_TAG, AuraDeeplinkRouteMapper.STATUS_ROUTE, ComposableSingletons$HatchShareSheetKt.f267lambda$1134818572);
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            AHD<HatchShareRecipient> ahd = this.$uiState$delegate.getValue().data.recipients;
            Map<String, HatchRecipientSendState> map = this.$uiState$delegate.getValue().recipientSendStates;
            String str = this.$sharePayload;
            HatchShareSheetKt.HatchShareRecipientsSection(c0cd, ahd, map, str != null ? new HatchShareSheetKt$HatchShareSheet$4$1$3$1(this.$viewModel, this.$context, str) : null);
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HatchShareSheetLoadingState.values().length];
            try {
                AnonymousClass002.A13(HatchShareSheetLoadingState.LOADING, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(HatchShareSheetLoadingState.LOADED, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchShareSheetKt$HatchShareSheet$4$1(boolean z, boolean z2, String str, boolean z3, ShareType shareType, String str2, boolean z4, String str3, String str4, String str5, String str6, C1BO<HatchShareSheetUiState> c1bo, HatchShareSheetViewModel hatchShareSheetViewModel, Context context) {
        super(1);
        this.$isIneligible = z;
        this.$includeRecipients = z2;
        this.$sharePayload = str;
        this.$isIdeaUnavailable = z3;
        this.$shareType = shareType;
        this.$resolvedPreviewUri = str2;
        this.$isLinkShare = z4;
        this.$previewUri = str3;
        this.$linkTitle = str4;
        this.$artifactSubtitle = str5;
        this.$previewDescription = str6;
        this.$uiState$delegate = c1bo;
        this.$viewModel = hatchShareSheetViewModel;
        this.$context = context;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C0CD c0cd) {
        invoke2(c0cd);
        return Unit.INSTANCE;
    }
}
