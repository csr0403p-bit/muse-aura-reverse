package com.facebook.aura.sharesheet;

import X.AHD;
import X.AKH;
import X.AKQ;
import X.ARL;
import X.AVy;
import X.AbstractC04540eo;
import X.AbstractC0878AGe;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B18;
import X.B1V;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06G;
import X.C0A8;
import X.C0CD;
import X.C0dx;
import X.C0v5;
import X.C0z7;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1822Arm;
import X.C1AC;
import X.C1BO;
import X.C1D3;
import X.C1D8;
import X.C1DG;
import X.C1DI;
import X.C1DM;
import X.C1SA;
import X.C1YD;
import X.C1b8;
import X.C2VU;
import X.C3U4;
import X.C3Ue;
import X.C5Mp;
import X.C7384Etj;
import X.C78N;
import X.C78e;
import X.C7BY;
import X.C90m;
import X.C9m9;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.HDi;
import X.HxS;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.widget.Toast;
import androidx.compose.ui.Alignment;
import com.facebook.aura.R;
import com.facebook.aura.file.utils.HatchFileUIUtils;
import com.facebook.aura.model.HatchDanceShare;
import com.facebook.aura.navigation.key.HatchShareDownloadTarget;
import com.facebook.aura.navigation.key.ShareType;
import com.facebook.aura.vds.compose.accessibility.AuraHaptics;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraAdaptiveColorsKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchShareSheetKt {
    public static final float RecipientAvatarSize = 32.0f;
    public static final float RecipientBadgeSize = 12.0f;
    public static final float RecipientRowMinHeight = 64.0f;
    public static final String SHARE_LINK_CLIP_LABEL = "share_link";

    /* renamed from: com.facebook.aura.sharesheet.HatchShareSheetKt$HatchIdeaSharePreview$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $contentDescription;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $previewUri;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, String str2, BRg bRg, int i, int i2) {
            super(2);
            this.$previewUri = str;
            this.$contentDescription = str2;
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
            HatchShareSheetKt.HatchIdeaSharePreview(this.$previewUri, this.$contentDescription, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.sharesheet.HatchShareSheetKt$HatchRecipientActionText$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ int $textRes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i, boolean z, int i2, int i3) {
            super(2);
            this.$textRes = i;
            this.$enabled = z;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchShareSheetKt.HatchRecipientActionText(this.$textRes, this.$enabled, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.sharesheet.HatchShareSheetKt$HatchShareFailureToasts$2, reason: invalid class name and case insensitive filesystem */
    public final class C136732 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ HatchShareSheetViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C136732(HatchShareSheetViewModel hatchShareSheetViewModel, int i) {
            super(2);
            this.$viewModel = hatchShareSheetViewModel;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchShareSheetKt.HatchShareFailureToasts(this.$viewModel, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.sharesheet.HatchShareSheetKt$HatchShareRecipientAvatar$2, reason: invalid class name and case insensitive filesystem */
    public final class C136742 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HatchShareRecipient $recipient;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C136742(HatchShareRecipient hatchShareRecipient, BRg bRg, int i, int i2) {
            super(2);
            this.$recipient = hatchShareRecipient;
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
            HatchShareSheetKt.HatchShareRecipientAvatar(this.$recipient, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.sharesheet.HatchShareSheetKt$HatchShareRecipientRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C136752 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ HatchShareRecipient $recipient;
        public final /* synthetic */ HatchRecipientSendState $sendState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C136752(HatchShareRecipient hatchShareRecipient, HatchRecipientSendState hatchRecipientSendState, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$recipient = hatchShareRecipient;
            this.$sendState = hatchRecipientSendState;
            this.$onClick = function0;
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
            HatchShareSheetKt.HatchShareRecipientRow(this.$recipient, this.$sendState, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.sharesheet.HatchShareSheetKt$HatchShareSheet$1, reason: invalid class name and case insensitive filesystem */
    public final class C136761 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $contentId;
        public final /* synthetic */ HatchDanceShare $dance;
        public final /* synthetic */ HatchShareDownloadTarget $downloadTarget;
        public final /* synthetic */ String $instagramStoriesStickerUri;
        public final /* synthetic */ String $mediaUri;
        public final /* synthetic */ String $messageId;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $previewTitle;
        public final /* synthetic */ String $previewUri;
        public final /* synthetic */ String $shareText;
        public final /* synthetic */ ShareType $shareType;
        public final /* synthetic */ String $threadId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C136761(ShareType shareType, String str, String str2, String str3, HatchShareDownloadTarget hatchShareDownloadTarget, String str4, String str5, BRg bRg, String str6, String str7, String str8, HatchDanceShare hatchDanceShare, int i, int i2, int i3) {
            super(2);
            this.$shareType = shareType;
            this.$previewUri = str;
            this.$mediaUri = str2;
            this.$shareText = str3;
            this.$downloadTarget = hatchShareDownloadTarget;
            this.$instagramStoriesStickerUri = str4;
            this.$contentId = str5;
            this.$modifier = bRg;
            this.$messageId = str6;
            this.$threadId = str7;
            this.$previewTitle = str8;
            this.$dance = hatchDanceShare;
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
            HatchShareSheetKt.HatchShareSheet(this.$shareType, this.$previewUri, this.$mediaUri, this.$shareText, this.$downloadTarget, this.$instagramStoriesStickerUri, this.$contentId, this.$modifier, this.$messageId, this.$threadId, this.$previewTitle, this.$dance, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.sharesheet.HatchShareSheetKt$HatchShareSheet$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ String $artifactSubtitle;
        public final /* synthetic */ Context $context;
        public final /* synthetic */ HatchDanceShare $dance;
        public final /* synthetic */ String $downloadFileName;
        public final /* synthetic */ String $instagramStoriesStickerUri;
        public final /* synthetic */ boolean $isIdeaUnavailable;
        public final /* synthetic */ boolean $isIneligible;
        public final /* synthetic */ boolean $isLinkShare;
        public final /* synthetic */ String $linkTitle;
        public final /* synthetic */ HatchShareLogContext $logContext;
        public final /* synthetic */ String $previewTitle;
        public final /* synthetic */ String $previewUri;
        public final /* synthetic */ HatchShareDownloadTarget $resolvedDownloadTarget;
        public final /* synthetic */ String $sharePayload;
        public final /* synthetic */ String $shareText;
        public final /* synthetic */ ShareType $shareType;
        public final /* synthetic */ C1BO<HatchShareSheetUiState> $uiState$delegate;
        public final /* synthetic */ HatchShareSheetViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(HatchShareSheetViewModel hatchShareSheetViewModel, boolean z, boolean z2, String str, ShareType shareType, Context context, String str2, HatchShareDownloadTarget hatchShareDownloadTarget, C1BO<HatchShareSheetUiState> c1bo, boolean z3, String str3, String str4, String str5, String str6, HatchDanceShare hatchDanceShare, String str7, HatchShareLogContext hatchShareLogContext, String str8) {
            super(2);
            this.$viewModel = hatchShareSheetViewModel;
            this.$isIdeaUnavailable = z;
            this.$isIneligible = z2;
            this.$sharePayload = str;
            this.$shareType = shareType;
            this.$context = context;
            this.$shareText = str2;
            this.$resolvedDownloadTarget = hatchShareDownloadTarget;
            this.$uiState$delegate = c1bo;
            this.$isLinkShare = z3;
            this.$previewUri = str3;
            this.$linkTitle = str4;
            this.$artifactSubtitle = str5;
            this.$instagramStoriesStickerUri = str6;
            this.$dance = hatchDanceShare;
            this.$previewTitle = str7;
            this.$logContext = hatchShareLogContext;
            this.$downloadFileName = str8;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            Function0 function0;
            BBI bbiA0M;
            Function0 function02;
            Function0 function03;
            Function0 function04;
            Function0 function05;
            Function0 function06;
            Function0 function07;
            Function0 function08;
            Function0 function09;
            Function0 function010;
            Function0 function011;
            Function0 function012;
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                if (this.$uiState$delegate.getValue().isCheckingEligibility) {
                    bfm.AgE(-419561718);
                    Object obj = this.$viewModel;
                    boolean zA67 = bfm.A67(obj);
                    Object objAaT = bfm.AaT();
                    if (zA67 || objAaT == C78N.A00) {
                        objAaT = new HatchShareSheetKt$HatchShareSheet$3$1$1(obj);
                        bfm.Ai0(objAaT);
                    }
                    HatchMessageShareReviewKt.HatchMessageShareReviewWaiting((Function0) ((InterfaceC7353EnQ) objAaT), null, bfm, 0, 2);
                } else if (!this.$isIdeaUnavailable) {
                    AuraColors auraColorsA0c = AnonymousClass003.A0c(bfm, -419289445);
                    C0dx c0dxA0T = AnonymousClass002.A0T(bfm);
                    AHD<HatchShareDestination> ahd = this.$uiState$delegate.getValue().data.destinations;
                    HatchShareDestination hatchShareDestination = this.$uiState$delegate.getValue().loadingDestination;
                    boolean z = !this.$isIneligible;
                    String str = this.$sharePayload;
                    if (str == null) {
                        bbiA0M = AnonymousClass002.A0M(bfm, -419096254);
                        function0 = null;
                    } else {
                        bfm.AgE(-419096253);
                        HatchShareSheetViewModel hatchShareSheetViewModel = this.$viewModel;
                        Context context = this.$context;
                        boolean zA1O = AnonymousClass003.A1O(bfm, context, str, bfm.A67(hatchShareSheetViewModel));
                        Object objAaT2 = bfm.AaT();
                        if (zA1O || objAaT2 == C78N.A00) {
                            objAaT2 = new HatchShareSheetKt$HatchShareSheet$3$2$1$1(hatchShareSheetViewModel, context, str);
                            bfm.Ai0(objAaT2);
                        }
                        function0 = (Function0) objAaT2;
                        bbiA0M = (BBI) bfm;
                        BBI.A0R(bbiA0M, false);
                    }
                    String str2 = this.$sharePayload;
                    if (str2 == null) {
                        bfm.AgE(-418930311);
                        BBI.A0R(bbiA0M, false);
                        function02 = null;
                    } else {
                        bfm.AgE(-418930310);
                        HatchShareSheetViewModel hatchShareSheetViewModel2 = this.$viewModel;
                        Context context2 = this.$context;
                        boolean zA1O2 = AnonymousClass003.A1O(bfm, context2, str2, bfm.A67(hatchShareSheetViewModel2));
                        Object objAaT3 = bfm.AaT();
                        if (zA1O2 || objAaT3 == C78N.A00) {
                            objAaT3 = new HatchShareSheetKt$HatchShareSheet$3$3$1$1(hatchShareSheetViewModel2, context2, str2);
                            bfm.Ai0(objAaT3);
                        }
                        function02 = (Function0) objAaT3;
                        BBI.A0R(bbiA0M, false);
                    }
                    String str3 = this.$sharePayload;
                    if (str3 == null) {
                        bfm.AgE(-418725649);
                        BBI.A0R(bbiA0M, false);
                        function03 = null;
                    } else {
                        bfm.AgE(-418725648);
                        boolean z2 = this.$isLinkShare;
                        HatchShareSheetViewModel hatchShareSheetViewModel3 = this.$viewModel;
                        Context context3 = this.$context;
                        String str4 = this.$previewUri;
                        String str5 = this.$linkTitle;
                        String str6 = this.$artifactSubtitle;
                        String str7 = this.$instagramStoriesStickerUri;
                        HatchDanceShare hatchDanceShare = this.$dance;
                        boolean zA1T = AnonymousClass001.A1T(bfm, hatchDanceShare, AnonymousClass005.A1U(bfm, str6, auraColorsA0c, str7, AnonymousClass005.A1T(bfm, str3, str4, str5, AnonymousClass004.A1T(bfm, hatchShareSheetViewModel3, context3, bfm.A66(z2)))));
                        Object objAaT4 = bfm.AaT();
                        if (zA1T || objAaT4 == C78N.A00) {
                            objAaT4 = new HatchShareSheetKt$HatchShareSheet$3$4$1$1(z2, hatchShareSheetViewModel3, context3, str3, str4, str5, str6, auraColorsA0c, str7, hatchDanceShare);
                            bfm.Ai0(objAaT4);
                        }
                        function03 = (Function0) objAaT4;
                        BBI.A0R(bbiA0M, false);
                    }
                    String str8 = this.$sharePayload;
                    if (str8 == null) {
                        bfm.AgE(-417619693);
                        BBI.A0R(bbiA0M, false);
                        function04 = null;
                    } else {
                        bfm.AgE(-417619692);
                        ShareType shareType = this.$shareType;
                        HatchShareSheetViewModel hatchShareSheetViewModel4 = this.$viewModel;
                        Context context4 = this.$context;
                        String str9 = this.$previewUri;
                        String str10 = this.$previewTitle;
                        String str11 = this.$artifactSubtitle;
                        String str12 = this.$instagramStoriesStickerUri;
                        HatchDanceShare hatchDanceShare2 = this.$dance;
                        boolean zA1T2 = AnonymousClass001.A1T(bfm, hatchDanceShare2, AnonymousClass005.A1U(bfm, str11, auraColorsA0c, str12, AnonymousClass005.A1T(bfm, str8, str9, str10, AnonymousClass004.A1T(bfm, hatchShareSheetViewModel4, context4, AnonymousClass002.A1U(bfm, shareType)))));
                        Object objAaT5 = bfm.AaT();
                        if (zA1T2 || objAaT5 == C78N.A00) {
                            objAaT5 = new HatchShareSheetKt$HatchShareSheet$3$5$1$1(shareType, hatchShareSheetViewModel4, context4, str8, str9, str10, str11, auraColorsA0c, str12, hatchDanceShare2);
                            bfm.Ai0(objAaT5);
                        }
                        function04 = (Function0) objAaT5;
                        BBI.A0R(bbiA0M, false);
                    }
                    String str13 = this.$sharePayload;
                    if (str13 == null) {
                        bfm.AgE(-416523936);
                        BBI.A0R(bbiA0M, false);
                        function05 = null;
                    } else {
                        bfm.AgE(-416523935);
                        HatchShareSheetViewModel hatchShareSheetViewModel5 = this.$viewModel;
                        Context context5 = this.$context;
                        boolean zA1O3 = AnonymousClass003.A1O(bfm, context5, str13, bfm.A67(hatchShareSheetViewModel5));
                        Object objAaT6 = bfm.AaT();
                        if (zA1O3 || objAaT6 == C78N.A00) {
                            objAaT6 = new HatchShareSheetKt$HatchShareSheet$3$6$1$1(hatchShareSheetViewModel5, context5, str13);
                            bfm.Ai0(objAaT6);
                        }
                        function05 = (Function0) objAaT6;
                        BBI.A0R(bbiA0M, false);
                    }
                    String str14 = this.$sharePayload;
                    if (str14 == null) {
                        bfm.AgE(-416362209);
                        BBI.A0R(bbiA0M, false);
                        function06 = null;
                    } else {
                        bfm.AgE(-416362208);
                        HatchShareSheetViewModel hatchShareSheetViewModel6 = this.$viewModel;
                        Context context6 = this.$context;
                        boolean zA1O4 = AnonymousClass003.A1O(bfm, context6, str14, bfm.A67(hatchShareSheetViewModel6));
                        Object objAaT7 = bfm.AaT();
                        if (zA1O4 || objAaT7 == C78N.A00) {
                            objAaT7 = new HatchShareSheetKt$HatchShareSheet$3$7$1$1(hatchShareSheetViewModel6, context6, str14);
                            bfm.Ai0(objAaT7);
                        }
                        function06 = (Function0) objAaT7;
                        BBI.A0R(bbiA0M, false);
                    }
                    String str15 = this.$sharePayload;
                    if (str15 == null) {
                        bfm.AgE(-416190252);
                        BBI.A0R(bbiA0M, false);
                        function07 = null;
                    } else {
                        bfm.AgE(-416190251);
                        HatchShareSheetViewModel hatchShareSheetViewModel7 = this.$viewModel;
                        Context context7 = this.$context;
                        ShareType shareType2 = this.$shareType;
                        boolean zA1H = AnonymousClass003.A1H(bfm, shareType2, AnonymousClass003.A1O(bfm, context7, str15, bfm.A67(hatchShareSheetViewModel7)));
                        Object objAaT8 = bfm.AaT();
                        if (zA1H || objAaT8 == C78N.A00) {
                            objAaT8 = new HatchShareSheetKt$HatchShareSheet$3$8$1$1(hatchShareSheetViewModel7, context7, str15, shareType2);
                            bfm.Ai0(objAaT8);
                        }
                        function07 = (Function0) objAaT8;
                        BBI.A0R(bbiA0M, false);
                    }
                    String str16 = this.$sharePayload;
                    if (str16 == null) {
                        bfm.AgE(-415834527);
                        BBI.A0R(bbiA0M, false);
                        function08 = null;
                    } else {
                        bfm.AgE(-415834526);
                        HatchShareSheetViewModel hatchShareSheetViewModel8 = this.$viewModel;
                        Context context8 = this.$context;
                        boolean zA1O5 = AnonymousClass003.A1O(bfm, context8, str16, bfm.A67(hatchShareSheetViewModel8));
                        Object objAaT9 = bfm.AaT();
                        if (zA1O5 || objAaT9 == C78N.A00) {
                            objAaT9 = new HatchShareSheetKt$HatchShareSheet$3$9$1$1(hatchShareSheetViewModel8, context8, str16);
                            bfm.Ai0(objAaT9);
                        }
                        function08 = (Function0) objAaT9;
                        BBI.A0R(bbiA0M, false);
                    }
                    String str17 = this.$sharePayload;
                    if (str17 == null) {
                        bfm.AgE(-415681945);
                        BBI.A0R(bbiA0M, false);
                        function09 = null;
                    } else {
                        bfm.AgE(-415681944);
                        HatchShareSheetViewModel hatchShareSheetViewModel9 = this.$viewModel;
                        Context context9 = this.$context;
                        boolean zA1O6 = AnonymousClass003.A1O(bfm, context9, str17, bfm.A67(hatchShareSheetViewModel9));
                        Object objAaT10 = bfm.AaT();
                        if (zA1O6 || objAaT10 == C78N.A00) {
                            objAaT10 = new HatchShareSheetKt$HatchShareSheet$3$10$1$1(hatchShareSheetViewModel9, context9, str17);
                            bfm.Ai0(objAaT10);
                        }
                        function09 = (Function0) objAaT10;
                        BBI.A0R(bbiA0M, false);
                    }
                    String str18 = this.$sharePayload;
                    if (str18 == null) {
                        bfm.AgE(-415527968);
                        BBI.A0R(bbiA0M, false);
                        function010 = null;
                    } else {
                        bfm.AgE(-415527967);
                        HatchShareSheetViewModel hatchShareSheetViewModel10 = this.$viewModel;
                        Context context10 = this.$context;
                        boolean zA1O7 = AnonymousClass003.A1O(bfm, context10, str18, bfm.A67(hatchShareSheetViewModel10));
                        Object objAaT11 = bfm.AaT();
                        if (zA1O7 || objAaT11 == C78N.A00) {
                            objAaT11 = new HatchShareSheetKt$HatchShareSheet$3$11$1$1(hatchShareSheetViewModel10, context10, str18);
                            bfm.Ai0(objAaT11);
                        }
                        function010 = (Function0) objAaT11;
                        BBI.A0R(bbiA0M, false);
                    }
                    if (this.$shareType == ShareType.IDEA) {
                        bfm.AgE(-415347702);
                        boolean zA1T3 = AnonymousClass004.A1T(bfm, this.$context, c0dxA0T, bfm.A67(this.$viewModel));
                        HatchShareSheetViewModel hatchShareSheetViewModel11 = this.$viewModel;
                        Context context11 = this.$context;
                        Object objAaT12 = bfm.AaT();
                        if (zA1T3 || objAaT12 == C78N.A00) {
                            objAaT12 = new HatchShareSheetKt$HatchShareSheet$3$12$1(hatchShareSheetViewModel11, context11, c0dxA0T);
                            bfm.Ai0(objAaT12);
                        }
                        function011 = (Function0) objAaT12;
                        BBI.A0R(bbiA0M, false);
                    } else {
                        bfm.AgE(-415016095);
                        String str19 = this.$shareText;
                        if (str19 != null && HatchShareSheetModelsKt.isPublishLinkShare(this.$shareType) && !C7BY.A0j(str19)) {
                            bfm.AgE(-415016095);
                            HatchShareLogContext hatchShareLogContext = this.$logContext;
                            Context context12 = this.$context;
                            boolean zA1X = AnonymousClass005.A1X(bfm, str19, c0dxA0T, bfm.A67(hatchShareLogContext), bfm.A67(context12));
                            Object objAaT13 = bfm.AaT();
                            if (zA1X || objAaT13 == C78N.A00) {
                                objAaT13 = new HatchShareSheetKt$HatchShareSheet$3$14$1$1(hatchShareLogContext, context12, str19, c0dxA0T);
                                bfm.Ai0(objAaT13);
                            }
                            function011 = (Function0) objAaT13;
                            BBI.A0R(bbiA0M, false);
                        } else {
                            bfm.AgE(-415016096);
                            BBI.A0R(bbiA0M, false);
                            function011 = null;
                        }
                        BBI.A0R(bbiA0M, false);
                    }
                    HatchShareDownloadTarget hatchShareDownloadTarget = this.$resolvedDownloadTarget;
                    if (hatchShareDownloadTarget == null) {
                        bfm.AgE(-414572269);
                        BBI.A0R(bbiA0M, false);
                        function012 = null;
                    } else {
                        bfm.AgE(-414572268);
                        HatchShareSheetViewModel hatchShareSheetViewModel12 = this.$viewModel;
                        Context context13 = this.$context;
                        String str20 = this.$downloadFileName;
                        boolean zA1R = AnonymousClass001.A1R(bfm, str20, AnonymousClass005.A1S(bfm, hatchShareSheetViewModel12, context13, hatchShareDownloadTarget));
                        Object objAaT14 = bfm.AaT();
                        if (zA1R || objAaT14 == C78N.A00) {
                            objAaT14 = new HatchShareSheetKt$HatchShareSheet$3$15$1$1(hatchShareSheetViewModel12, context13, hatchShareDownloadTarget, str20);
                            bfm.Ai0(objAaT14);
                        }
                        function012 = (Function0) objAaT14;
                        BBI.A0R(bbiA0M, false);
                    }
                    Function0 function013 = function012;
                    HatchShareDestinationsFooterKt.HatchShareDestinationsFooter(ahd, hatchShareDestination, function0, function02, function03, function05, function06, function08, function09, function010, function011, z, function04, function07, function013, HatchShareSheetKt.licensedMusicSubtitle(this.$uiState$delegate.getValue().getShowsLicensedMusicNotice(), bfm, 0), null, bfm, 0, 0, 65536);
                } else {
                    bfm.AgE(-414363359);
                }
                AnonymousClass001.A1D(bfm);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.sharesheet.HatchShareSheetKt$HatchShareSheet$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $contentId;
        public final /* synthetic */ HatchDanceShare $dance;
        public final /* synthetic */ HatchShareDownloadTarget $downloadTarget;
        public final /* synthetic */ String $instagramStoriesStickerUri;
        public final /* synthetic */ String $mediaUri;
        public final /* synthetic */ String $messageId;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $previewTitle;
        public final /* synthetic */ String $previewUri;
        public final /* synthetic */ String $shareText;
        public final /* synthetic */ ShareType $shareType;
        public final /* synthetic */ String $threadId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(ShareType shareType, String str, String str2, String str3, HatchShareDownloadTarget hatchShareDownloadTarget, String str4, String str5, BRg bRg, String str6, String str7, String str8, HatchDanceShare hatchDanceShare, int i, int i2, int i3) {
            super(2);
            this.$shareType = shareType;
            this.$previewUri = str;
            this.$mediaUri = str2;
            this.$shareText = str3;
            this.$downloadTarget = hatchShareDownloadTarget;
            this.$instagramStoriesStickerUri = str4;
            this.$contentId = str5;
            this.$modifier = bRg;
            this.$messageId = str6;
            this.$threadId = str7;
            this.$previewTitle = str8;
            this.$dance = hatchDanceShare;
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
            HatchShareSheetKt.HatchShareSheet(this.$shareType, this.$previewUri, this.$mediaUri, this.$shareText, this.$downloadTarget, this.$instagramStoriesStickerUri, this.$contentId, this.$modifier, this.$messageId, this.$threadId, this.$previewTitle, this.$dance, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.sharesheet.HatchShareSheetKt$HatchShareSheetFailureEffects$2, reason: invalid class name and case insensitive filesystem */
    public final class C136772 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ HatchShareSheetViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C136772(HatchShareSheetViewModel hatchShareSheetViewModel, int i) {
            super(2);
            this.$viewModel = hatchShareSheetViewModel;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchShareSheetKt.HatchShareSheetFailureEffects(this.$viewModel, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.sharesheet.HatchShareSheetKt$HatchShareSheetLoading$3, reason: invalid class name and case insensitive filesystem */
    public final class C136783 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C136783(BRg bRg, int i, int i2) {
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
            HatchShareSheetKt.HatchShareSheetLoading(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void HatchShareFailureToasts(HatchShareSheetViewModel hatchShareSheetViewModel, BFM bfm, int i) {
        C7384Etj.A0Y(hatchShareSheetViewModel, 0);
        bfm.AgG(591515791);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(hatchShareSheetViewModel, bfm, i) ? 1 : 0) | i : i;
        boolean z = true;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 3, 2), bfm, iA05)) {
            Context contextA0O = AnonymousClass003.A0O(bfm);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1205eb);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1205dd);
            Object[] objArr = {hatchShareSheetViewModel, contextA0O, strA01, strA012};
            if ((iA05 & 14) != 4 && ((iA05 & 8) == 0 || !bfm.A67(hatchShareSheetViewModel))) {
                z = false;
            }
            boolean zA1P = AnonymousClass003.A1P(bfm, strA01, strA012, AnonymousClass001.A1S(bfm, contextA0O, z));
            Object objAaT = bfm.AaT();
            if (zA1P || objAaT == C78N.A00) {
                objAaT = new HatchShareSheetKt$HatchShareFailureToasts$1$1(hatchShareSheetViewModel, contextA0O, strA01, strA012, null);
                bfm.Ai0(objAaT);
            }
            C78e.A08(bfm, (G0V) objAaT, objArr);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C136732(hatchShareSheetViewModel, i);
        }
    }

    public static final void showSendFailureToast(Context context, String str) {
        Toast.makeText(context, str, 0).show();
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[HatchRecipientSendState.values().length];
            try {
                AnonymousClass005.A0v(HatchRecipientSendState.UNDO, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass005.A0v(HatchRecipientSendState.SENDING, iArr, 2);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass005.A0v(HatchRecipientSendState.SENT, iArr, 3);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(HatchRecipientSendState.FAILED, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(HatchRecipientSendState.IDLE, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[HatchShareAppTarget.values().length];
            try {
                AnonymousClass005.A0v(HatchShareAppTarget.FACEBOOK, iArr2, 1);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass005.A0v(HatchShareAppTarget.INSTAGRAM, iArr2, 2);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass005.A0v(HatchShareAppTarget.MESSENGER, iArr2, 3);
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final void HatchIdeaSharePreview(String str, String str2, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1080209561);
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
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1DM c1dmA0R = C06G.A0R(bfm);
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRg2.then(c1062ATq);
            InterfaceC1380AiA interfaceC1380AiAA0T = AnonymousClass006.A0T(bfm, C2VU.A00, -40.0f);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0T, akqA04, bRgA01, iA0J);
            AVy aVyA00 = BOf.A00(bfm, R.drawable.aura_bot_working, 0);
            BRg bRgA07 = C10G.A07(BRg.A00, 216.0f);
            ARL arl = B18.A02;
            C1SA.A00(bfm, null, bRgA07, null, aVyA00, arl, null, 0.0f, AVy.$stable | 25008, 104);
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            AuraColors auraColorsA0f = AnonymousClass001.A0f(bfm, akh);
            int i4 = AuraColors.$stable;
            AuraImageKt.m2573AuraImageXRP3Ue8(str, C11U.A03(AbstractC04540eo.A00(c1062ATq, c1dmA0R, 10.0f, 4, AuraAdaptiveColorsKt.adaptiveAmbientShadow(auraColorsA0f, bfm, i4), AuraAdaptiveColorsKt.adaptiveSpotShadow(AnonymousClass001.A0f(bfm, akh), bfm, i4)), c1dmA0R), arl, str2, null, true, null, 0L, false, false, false, null, null, null, null, bfm, (iA0d & 14) | 196992 | ((iA0d << 6) & 7168), 0, 32720);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, str2, bRg2, i, i2);
        }
    }

    public static final void HatchRecipientActionText(int i, boolean z, BFM bfm, int i2, int i3) {
        boolean z2 = z;
        bfm.AgG(-287871783);
        int iA0D = (i2 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i2 : i2;
        int i4 = i3 & 2;
        if (i4 != 0) {
            iA0D |= 48;
        } else if ((i2 & 48) == 0) {
            iA0D |= AnonymousClass004.A0o(bfm, z2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0D), bfm, iA0D)) {
            if (i4 != 0) {
                z2 = true;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, i);
            C1822Arm c1822ArmA0W = C06G.A0W(bfm);
            long jA0D = C06G.A0D(bfm);
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, null, HxS.A04(HDi.A0O[(int) (jA0D & 63)], B6A.A03(jA0D), B6A.A02(jA0D), B6A.A01(jA0D), z2 ? 1.0f : 0.3f), c1822ArmA0W, null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14834);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(i, z2, i2, i3);
        }
    }

    public static final void HatchShareRecipientAvatar(HatchShareRecipient hatchShareRecipient, BRg bRg, BFM bfm, int i, int i2) {
        String str;
        int i3;
        int i4;
        BRg bRgA4C;
        float f;
        BRg bRg2 = bRg;
        bfm.AgG(1345955544);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(hatchShareRecipient, bfm, i) ? 1 : 0) | i : i;
        int i5 = i2 & 2;
        if (i5 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 19, 18), bfm, iA05)) {
            if (i5 != 0) {
                bRg2 = BRg.A00;
            }
            float f2 = RecipientAvatarSize;
            BRg bRgA07 = C10G.A07(bRg2, f2);
            Alignment alignment = C2VU.A0E;
            InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(alignment, false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA07);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA01, akqA04, bRgA01, iA0J);
            C0z7 c0z7 = C0z7.A00;
            int size = hatchShareRecipient.profilePictureUrls.size();
            if (size != 0) {
                if (size != 1) {
                    bfm.AgE(-560446896);
                    f = 22.0f;
                    String str2 = (String) hatchShareRecipient.profilePictureUrls.get(0);
                    BS0 bs0 = BRg.A00;
                    i3 = 48;
                    i4 = 0;
                    m2000HatchShareRecipientPhotouFdPcIQ(str2, 22.0f, C5Mp.A00(c0z7.A4C(alignment, bs0), 1.0f), bfm, 48, 0);
                    str = (String) hatchShareRecipient.profilePictureUrls.get(1);
                    bRgA4C = c0z7.A4C(C2VU.A07, bs0);
                } else {
                    bfm.AgE(-1957745051);
                    str = (String) AbstractC0878AGe.A0F(hatchShareRecipient.profilePictureUrls);
                    i3 = 48;
                    i4 = 4;
                    bRgA4C = null;
                    f = f2;
                }
                m2000HatchShareRecipientPhotouFdPcIQ(str, f, bRgA4C, bfm, i3, i4);
            } else {
                bfm.AgE(-1957751284);
                C3Ue.A04(C1b8.A03(C10G.A07(BRg.A00, f2), C1D8.A00, AnonymousClass002.A0c(bfm).secondaryButtonBackground), bfm, 0);
            }
            BBI.A0R(bbi, false);
            HatchShareAppTarget hatchShareAppTarget = hatchShareRecipient.appTarget;
            if (hatchShareAppTarget == null) {
                bfm.AgE(-559998823);
            } else {
                bfm.AgE(-559998822);
                AVy aVyA00 = BOf.A00(bfm, badgeDrawable(hatchShareAppTarget), 0);
                String strA01 = AbstractC2271BQs.A01(bfm, badgeDescription(hatchShareAppTarget));
                B6A b6aBadgeTint = badgeTint(hatchShareAppTarget);
                C1SA.A00(bfm, null, C3U4.A09(C1b8.A03(C10G.A07(C5Mp.A00(c0z7.A4C(C2VU.A07, BRg.A00), 2.0f), RecipientBadgeSize), C1D8.A00, AnonymousClass002.A0c(bfm).elevated), badgePadding(hatchShareAppTarget)), b6aBadgeTint != null ? AnonymousClass002.A0S(b6aBadgeTint.A00) : null, aVyA00, null, strA01, 0.0f, AVy.$stable, 56);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C136742(hatchShareRecipient, bRg2, i, i2);
        }
    }

    /* renamed from: HatchShareRecipientPhoto-uFdPcIQ, reason: not valid java name */
    public static final void m2000HatchShareRecipientPhotouFdPcIQ(String str, float f, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1806835702);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A05(bfm, f);
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
            ARL arl = B18.A00;
            BRg bRgA07 = C10G.A07(bRg2, f);
            long j = AnonymousClass002.A0c(bfm).photoBorder;
            C1D3 c1d3 = C1D8.A00;
            AuraImageKt.m2573AuraImageXRP3Ue8(str, C11U.A03(C1DI.A02(bRgA07, c1d3, 1.0f, j), c1d3), arl, null, null, false, new C1DG(f), 0L, false, false, false, null, null, null, null, bfm, AnonymousClass001.A05(iA0d << 15, (iA0d & 14) | 3456), 0, 32688);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchShareSheetKt$HatchShareRecipientPhoto$1(str, f, bRg2, i, i2);
        }
    }

    public static final void HatchShareRecipientRow(HatchShareRecipient hatchShareRecipient, HatchRecipientSendState hatchRecipientSendState, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRgA04;
        BRg bRg2;
        int i3;
        BRg bRgA0Q = bRg;
        bfm.AgG(-1291365537);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(hatchShareRecipient, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass005.A09(bfm, hatchRecipientSendState);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, function0);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, bRgA0Q);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 1171, 1170), bfm, iA05)) {
            if (i4 != 0) {
                bRgA0Q = BRg.A00;
            }
            C1AC c1ac = C2VU.A04;
            float f = AuraDimensKt.SpacingSmall;
            C9m9 c9m9A00 = AcQ.A00(f);
            BRg bRgA0V = AnonymousClass001.A0V(AnonymousClass001.A0R(bRgA0Q), RecipientRowMinHeight);
            if (function0 != null) {
                bRg2 = BRg.A00;
                bRgA04 = C0v5.A04(bRg2, new C1YD(0), null, function0, true);
            } else {
                bRgA04 = BRg.A00;
                bRg2 = bRgA04;
            }
            BRg bRgA06 = C3U4.A06(bRgA0V.then(bRgA04), f);
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(c9m9A00, bfm, c1ac, 48);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i5 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA06);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA00, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i5);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90m c90m = C90m.A00;
            HatchShareRecipientAvatar(hatchShareRecipient, null, bfm, HatchShareRecipient.$stable | (iA05 & 14), 2);
            BRg bRgA0O = AnonymousClass001.A0O(c90m, bRg2, true);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0O);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA0U, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            String str = hatchShareRecipient.name;
            if (C7BY.A0j(str)) {
                str = hatchShareRecipient.label;
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, C06G.A0C(bfm), C06G.A0T(bfm), null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14834);
            if (C7BY.A0j(hatchShareRecipient.label) || C7384Etj.areEqual(hatchShareRecipient.label, hatchShareRecipient.name)) {
                bfm.AgE(-1380538679);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-1380774372);
                AuraTextKt.m2639AuraTextUY9GdpU(hatchShareRecipient.label, null, C06G.A08(bfm), C06G.A0Y(bfm), null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14834);
                BBI.A0R(bbi, false);
            }
            BBI.A0R(bbi, true);
            int iOrdinal = hatchRecipientSendState.ordinal();
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    bfm.AgE(409291536);
                    AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(null, null, 0L, bfm, 0, 7);
                } else if (iOrdinal == 3) {
                    bfm.AgE(409293638);
                    HatchRecipientActionText(R.string._name_removed__res_0x7f1205ec, false, bfm, 48, 0);
                } else if (iOrdinal == 4) {
                    bfm.AgE(409299395);
                    i3 = R.string._name_removed__res_0x7f1205e7;
                } else {
                    if (iOrdinal != 0) {
                        throw AnonymousClass003.A0k(bfm, bbi, 409286664);
                    }
                    bfm.AgE(409303057);
                    if (function0 != null) {
                        bfm.AgE(-196486938);
                        HatchRecipientActionText(R.string._name_removed__res_0x7f1205ea, false, bfm, 0, 2);
                    } else {
                        bfm.AgE(-196401409);
                    }
                    BBI.A0R(bbi, false);
                }
                bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, false, true);
            } else {
                bfm.AgE(409288226);
                i3 = R.string._name_removed__res_0x7f1205ef;
            }
            HatchRecipientActionText(i3, false, bfm, 0, 2);
            bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, false, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C136752(hatchShareRecipient, hatchRecipientSendState, function0, bRgA0Q, i, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d2  */
    /* JADX WARN: Type inference failed for: r31v1, types: [com.facebook.aura.vds.compose.bottomsheet.model.AuraBottomSheetHeaderConfig$AccessoryButton] */
    /* JADX WARN: Type inference failed for: r32v1, types: [com.facebook.aura.vds.compose.bottomsheet.model.AuraBottomSheetHeaderConfig$AccessoryButton] */
    /* JADX WARN: Type inference failed for: r33v1, types: [com.facebook.aura.vds.compose.bottomsheet.model.AuraBottomSheetHeaderConfig$AccessoryButton] */
    /* JADX WARN: Type inference failed for: r35v1, types: [com.facebook.aura.vds.compose.bottomsheet.model.AuraBottomSheetHeaderConfig$LabeledAccessoryButton] */
    /* JADX WARN: Type inference failed for: r46v1, types: [com.facebook.aura.vds.compose.theme.AuraContainer$AuraBottomSheet] */
    /* JADX WARN: Type inference failed for: r48v2, types: [X.BRg] */
    /* JADX WARN: Type inference failed for: r49v0, types: [androidx.compose.foundation.lazy.LazyListState] */
    /* JADX WARN: Type inference failed for: r53v0, types: [X.G0W] */
    /* JADX WARN: Type inference failed for: r54v0, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r57v0, types: [com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode] */
    /* JADX WARN: Type inference failed for: r80v0, types: [X.BFM, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HatchShareSheet(com.facebook.aura.navigation.key.ShareType r68, java.lang.String r69, java.lang.String r70, java.lang.String r71, com.facebook.aura.navigation.key.HatchShareDownloadTarget r72, java.lang.String r73, java.lang.String r74, X.BRg r75, java.lang.String r76, java.lang.String r77, java.lang.String r78, com.facebook.aura.model.HatchDanceShare r79, X.BFM r80, int r81, int r82, int r83) {
        /*
            Method dump skipped, instructions count: 1030
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.sharesheet.HatchShareSheetKt.HatchShareSheet(com.facebook.aura.navigation.key.ShareType, java.lang.String, java.lang.String, java.lang.String, com.facebook.aura.navigation.key.HatchShareDownloadTarget, java.lang.String, java.lang.String, X.BRg, java.lang.String, java.lang.String, java.lang.String, com.facebook.aura.model.HatchDanceShare, X.BFM, int, int, int):void");
    }

    public static final void copyLinkToClipboard(Context context, String str, C0dx c0dx) {
        ClipboardManager clipboardManager;
        Object systemService = context.getSystemService(HatchFileUIUtils.CLIPBOARD_STAGING_DIR);
        if (!(systemService instanceof ClipboardManager) || (clipboardManager = (ClipboardManager) systemService) == null) {
            return;
        }
        clipboardManager.setPrimaryClip(ClipData.newPlainText(SHARE_LINK_CLIP_LABEL, str));
        c0dx.AXr(AuraHaptics.SUCCESS);
    }

    public static final String licensedMusicSubtitle(boolean z, BFM bfm, int i) {
        if (z) {
            bfm.AgE(1705542374);
            return AnonymousClass003.A0e(bfm, R.string._name_removed__res_0x7f1205da);
        }
        AnonymousClass004.A1A(bfm, 1705626725);
        return null;
    }

    public static final void HatchShareRecipientsSection(C0CD c0cd, AHD<HatchShareRecipient> ahd, Map<String, ? extends HatchRecipientSendState> map, G0U<? super HatchShareRecipient, Unit> g0u) {
        boolean zA1Z = AnonymousClass005.A1Z(c0cd, ahd, map);
        for (HatchShareRecipient hatchShareRecipient : ahd) {
            c0cd.APJ(FGI.A0W("recipient:", ":", hatchShareRecipient.recipientId, hatchShareRecipient.recipientType), "recipient", B1V.A01(new HatchShareSheetKt$HatchShareRecipientsSection$1$1(map, hatchShareRecipient, g0u), -526422825, zA1Z));
        }
    }

    public static final void HatchShareSheetFailureEffects(HatchShareSheetViewModel hatchShareSheetViewModel, BFM bfm, int i) {
        bfm.AgG(1543024558);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(hatchShareSheetViewModel, bfm, i) ? 1 : 0) | i : i;
        boolean z = true;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 3, 2), bfm, iA05)) {
            Context contextA0O = AnonymousClass003.A0O(bfm);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1205c2);
            int i2 = iA05 & 14;
            HatchShareFailureToasts(hatchShareSheetViewModel, bfm, HatchShareSheetViewModel.$stable | i2);
            if (i2 != 4 && ((iA05 & 8) == 0 || !bfm.A67(hatchShareSheetViewModel))) {
                z = false;
            }
            boolean zA1W = AnonymousClass002.A1W(bfm, strA01, bfm.A67(contextA0O), z);
            Object objAaT = bfm.AaT();
            if (zA1W || objAaT == C78N.A00) {
                objAaT = new HatchShareSheetKt$HatchShareSheetFailureEffects$1$1(hatchShareSheetViewModel, contextA0O, strA01, null);
                bfm.Ai0(objAaT);
            }
            C78e.A02(bfm, hatchShareSheetViewModel, contextA0O, strA01, (G0V) objAaT);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C136772(hatchShareSheetViewModel, i);
        }
    }

    public static final void HatchShareSheetLoading(BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(961517121);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1205db);
            Alignment alignment = C2VU.A09;
            BRg bRgA04 = C10G.A04(AnonymousClass001.A0R(bRg), 120.0f);
            boolean zA65 = bfm.A65(strA01);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new HatchShareSheetKt$HatchShareSheetLoading$1$1(strA01);
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA04, objAaT, false);
            InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(alignment, false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0Y);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA01, akqA04, bRgA01, iA0J);
            AnonymousClass007.A0s(bfm, bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C136783(bRg, i, i2);
        }
    }

    public static final /* synthetic */ HatchShareSheetUiState access$HatchShareSheet$lambda$4(C1BO c1bo) {
        return (HatchShareSheetUiState) c1bo.getValue();
    }

    public static final int badgeDescription(HatchShareAppTarget hatchShareAppTarget) {
        int iOrdinal = hatchShareAppTarget.ordinal();
        if (iOrdinal == 0) {
            return R.string._name_removed__res_0x7f1205d2;
        }
        if (iOrdinal == 1) {
            return R.string._name_removed__res_0x7f1205d7;
        }
        if (iOrdinal == 2) {
            return R.string._name_removed__res_0x7f1205e6;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int badgeDrawable(HatchShareAppTarget hatchShareAppTarget) {
        int iOrdinal = hatchShareAppTarget.ordinal();
        if (iOrdinal == 0) {
            return R.drawable.facebook_logo_round;
        }
        if (iOrdinal == 1) {
            return R.drawable.instagram_logo_round;
        }
        if (iOrdinal == 2) {
            return HatchShareDestinationsFooterKt.iconResource(HatchShareDestination.MESSENGER);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final float badgePadding(HatchShareAppTarget hatchShareAppTarget) {
        int iOrdinal = hatchShareAppTarget.ordinal();
        if (iOrdinal == 0) {
            return 1.0f;
        }
        if (iOrdinal == 1) {
            return 3.0f;
        }
        if (iOrdinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return 1.0f;
    }

    public static final B6A badgeTint(HatchShareAppTarget hatchShareAppTarget) {
        if (hatchShareAppTarget.ordinal() == 2) {
            return HatchShareDestinationsFooterKt.iconTint(HatchShareDestination.MESSENGER);
        }
        return null;
    }
}
