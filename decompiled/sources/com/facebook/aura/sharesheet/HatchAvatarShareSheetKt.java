package com.facebook.aura.sharesheet;

import X.AGI;
import X.AHD;
import X.AKH;
import X.AKQ;
import X.ARV;
import X.AVy;
import X.AYD;
import X.AbstractC04540eo;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BJe;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06G;
import X.C07C;
import X.C1062ATq;
import X.C10G;
import X.C11T;
import X.C11U;
import X.C1335AhM;
import X.C1515AkP;
import X.C1822Arm;
import X.C19U;
import X.C1BO;
import X.C1D3;
import X.C1D8;
import X.C1DG;
import X.C1DI;
import X.C1DM;
import X.C1EQ;
import X.C1OM;
import X.C1b8;
import X.C2CK;
import X.C2VU;
import X.C3IL;
import X.C3U4;
import X.C3Ue;
import X.C7384Etj;
import X.C78N;
import X.C90l;
import X.Ey9;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.HDi;
import X.HxS;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.common.video.HatchVideoPlayer;
import com.facebook.aura.common.video.HatchVideoPlayerComposableKt;
import com.facebook.aura.common.video.RememberHatchVideoPlayerKt;
import com.facebook.aura.components.pagerindicator.AuraPagerIndicatorKt;
import com.facebook.aura.sharesheet.AvatarSharePage;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.common.AuraDrawableSource;
import com.facebook.aura.vds.compose.icons.AuraIconButtonKt;
import com.facebook.aura.vds.compose.icons.AuraIconButtonSizeV2;
import com.facebook.aura.vds.compose.icons.AuraIconButtonStyleConfig;
import com.facebook.aura.vds.compose.icons.AuraIconButtonStyles;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.segmentedtabs.AuraSegmentedTabsKt;
import com.facebook.aura.vds.compose.segmentedtabs.TextTab;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchAvatarShareSheetKt {
    public static final float AvatarBubbleElevation = 8.0f;
    public static final float CardVerticalPadding = 12.0f;
    public static final float DanceCardAspectRatio = 0.5625f;
    public static final C1D3 AvatarCardShape = C1D8.A00(36.0f);
    public static final C1D3 AvatarMediaShape = C1D8.A00(32.0f);
    public static final C1D3 AvatarBubbleShape = C1D8.A00(22.0f);

    /* renamed from: com.facebook.aura.sharesheet.HatchAvatarShareSheetKt$AvatarCard$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AuraDrawableSource $avatarSource;
        public final /* synthetic */ String $bubbleText;
        public final /* synthetic */ boolean $isSelected;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HatchAvatarStoryPalette $palette;
        public final /* synthetic */ String $previewDescription;
        public final /* synthetic */ Uri $videoUri;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Uri uri, AuraDrawableSource auraDrawableSource, boolean z, HatchAvatarStoryPalette hatchAvatarStoryPalette, String str, String str2, BRg bRg, int i, int i2) {
            super(2);
            this.$videoUri = uri;
            this.$avatarSource = auraDrawableSource;
            this.$isSelected = z;
            this.$palette = hatchAvatarStoryPalette;
            this.$previewDescription = str;
            this.$bubbleText = str2;
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
            HatchAvatarShareSheetKt.AvatarCard(this.$videoUri, this.$avatarSource, this.$isSelected, this.$palette, this.$previewDescription, this.$bubbleText, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.sharesheet.HatchAvatarShareSheetKt$AvatarCarousel$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AuraDrawableSource $avatarSource;
        public final /* synthetic */ String $bubbleText;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Float $pageAspectRatio;
        public final /* synthetic */ PagerState $pagerState;
        public final /* synthetic */ AHD<AvatarSharePage> $pages;
        public final /* synthetic */ String $previewDescription;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(AHD<? extends AvatarSharePage> ahd, Float f, AuraDrawableSource auraDrawableSource, PagerState pagerState, String str, String str2, BRg bRg, int i, int i2) {
            super(2);
            this.$pages = ahd;
            this.$pageAspectRatio = f;
            this.$avatarSource = auraDrawableSource;
            this.$pagerState = pagerState;
            this.$previewDescription = str;
            this.$bubbleText = str2;
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
            HatchAvatarShareSheetKt.AvatarCarousel(this.$pages, this.$pageAspectRatio, this.$avatarSource, this.$pagerState, this.$previewDescription, this.$bubbleText, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.sharesheet.HatchAvatarShareSheetKt$AvatarShareSheetPageLogging$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ PagerState $pagerState;
        public final /* synthetic */ HatchShareSheetViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchShareSheetViewModel hatchShareSheetViewModel, PagerState pagerState, int i) {
            super(2);
            this.$viewModel = hatchShareSheetViewModel;
            this.$pagerState = pagerState;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchAvatarShareSheetKt.AvatarShareSheetPageLogging(this.$viewModel, this.$pagerState, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.sharesheet.HatchAvatarShareSheetKt$AvatarShareTabs$2, reason: invalid class name and case insensitive filesystem */
    public final class C136522 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<AvatarShareTab, Unit> $onTabSelected;
        public final /* synthetic */ AvatarShareTab $selectedTab;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C136522(AvatarShareTab avatarShareTab, G0U<? super AvatarShareTab, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$selectedTab = avatarShareTab;
            this.$onTabSelected = g0u;
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
            HatchAvatarShareSheetKt.AvatarShareTabs(this.$selectedTab, this.$onTabSelected, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.sharesheet.HatchAvatarShareSheetKt$AvatarVideo$1, reason: invalid class name and case insensitive filesystem */
    public final class C136531 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AuraDrawableSource $avatarSource;
        public final /* synthetic */ boolean $enableAudio;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $playWhenReady;
        public final /* synthetic */ Uri $uri;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C136531(Uri uri, AuraDrawableSource auraDrawableSource, boolean z, BRg bRg, boolean z2, int i, int i2) {
            super(2);
            this.$uri = uri;
            this.$avatarSource = auraDrawableSource;
            this.$playWhenReady = z;
            this.$modifier = bRg;
            this.$enableAudio = z2;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchAvatarShareSheetKt.AvatarVideo(this.$uri, this.$avatarSource, this.$playWhenReady, this.$modifier, this.$enableAudio, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.sharesheet.HatchAvatarShareSheetKt$DanceCard$3, reason: invalid class name and case insensitive filesystem */
    public final class C136543 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AuraDrawableSource $fallbackSource;
        public final /* synthetic */ boolean $isMuted;
        public final /* synthetic */ boolean $isSelected;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<Boolean, Unit> $onMutedChange;
        public final /* synthetic */ AvatarSharePage.Dance $page;
        public final /* synthetic */ String $previewDescription;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C136543(AvatarSharePage.Dance dance, AuraDrawableSource auraDrawableSource, boolean z, boolean z2, G0U<? super Boolean, Unit> g0u, String str, BRg bRg, int i, int i2) {
            super(2);
            this.$page = dance;
            this.$fallbackSource = auraDrawableSource;
            this.$isSelected = z;
            this.$isMuted = z2;
            this.$onMutedChange = g0u;
            this.$previewDescription = str;
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
            HatchAvatarShareSheetKt.DanceCard(this.$page, this.$fallbackSource, this.$isSelected, this.$isMuted, this.$onMutedChange, this.$previewDescription, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.sharesheet.HatchAvatarShareSheetKt$DanceMuteButton$2, reason: invalid class name and case insensitive filesystem */
    public final class C136552 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isMuted;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<Boolean, Unit> $onMutedChange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C136552(boolean z, G0U<? super Boolean, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$isMuted = z;
            this.$onMutedChange = g0u;
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
            HatchAvatarShareSheetKt.DanceMuteButton(this.$isMuted, this.$onMutedChange, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.sharesheet.HatchAvatarShareSheetKt$HatchAvatarShareSheet$1, reason: invalid class name and case insensitive filesystem */
    public final class C136561 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ AuraDrawableSource $avatarSource;
        public final /* synthetic */ String $bubbleText;
        public final /* synthetic */ Context $context;
        public final /* synthetic */ String $downloadFileName;
        public final /* synthetic */ String $mediaUri;
        public final /* synthetic */ PagerState $pagerState;
        public final /* synthetic */ String $shareText;
        public final /* synthetic */ AHD<AvatarSharePage> $tabPages;
        public final /* synthetic */ C1BO<HatchShareSheetUiState> $uiState$delegate;
        public final /* synthetic */ HatchShareSheetViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C136561(AHD<? extends AvatarSharePage> ahd, PagerState pagerState, String str, AuraDrawableSource auraDrawableSource, C1BO<HatchShareSheetUiState> c1bo, HatchShareSheetViewModel hatchShareSheetViewModel, Context context, String str2, String str3, String str4) {
            super(2);
            this.$tabPages = ahd;
            this.$pagerState = pagerState;
            this.$mediaUri = str;
            this.$avatarSource = auraDrawableSource;
            this.$uiState$delegate = c1bo;
            this.$viewModel = hatchShareSheetViewModel;
            this.$context = context;
            this.$bubbleText = str2;
            this.$shareText = str3;
            this.$downloadFileName = str4;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:87:0x0346  */
        /* JADX WARN: Type inference failed for: r6v1 */
        /* JADX WARN: Type inference failed for: r6v2, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r6v3 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void invoke(X.BFM r35, int r36) {
            /*
                Method dump skipped, instructions count: 848
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.sharesheet.HatchAvatarShareSheetKt.C136561.invoke(X.BFM, int):void");
        }
    }

    /* renamed from: com.facebook.aura.sharesheet.HatchAvatarShareSheetKt$HatchAvatarShareSheet$2, reason: invalid class name and case insensitive filesystem */
    public final class C136572 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ C1BO<AvatarShareTab> $activeTab$delegate;
        public final /* synthetic */ AuraDrawableSource $avatarSource;
        public final /* synthetic */ String $bubbleText;
        public final /* synthetic */ PagerState $pagerState;
        public final /* synthetic */ AvatarSharePages $pages;
        public final /* synthetic */ String $previewDescription;
        public final /* synthetic */ AHD<AvatarSharePage> $tabPages;
        public final /* synthetic */ HatchShareSheetViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C136572(AvatarSharePages avatarSharePages, AHD<? extends AvatarSharePage> ahd, HatchShareSheetViewModel hatchShareSheetViewModel, AuraDrawableSource auraDrawableSource, PagerState pagerState, String str, String str2, C1BO<? extends AvatarShareTab> c1bo) {
            super(3);
            this.$pages = avatarSharePages;
            this.$tabPages = ahd;
            this.$viewModel = hatchShareSheetViewModel;
            this.$avatarSource = auraDrawableSource;
            this.$pagerState = pagerState;
            this.$previewDescription = str;
            this.$bubbleText = str2;
            this.$activeTab$delegate = c1bo;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            int iA0d = i;
            C7384Etj.A0Y(c07c, 0);
            if ((i & 6) == 0) {
                iA0d = i | AnonymousClass004.A0d(bfm, c07c);
            }
            if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
                Float fValueOf = null;
                if (this.$pages != null && this.$tabPages != null) {
                    bfm.AgE(194274845);
                    if (this.$pages.getShowsTabs()) {
                        bfm.AgE(194290903);
                        AvatarShareTab value = this.$activeTab$delegate.getValue();
                        HatchShareSheetViewModel hatchShareSheetViewModel = this.$viewModel;
                        boolean zA67 = bfm.A67(hatchShareSheetViewModel);
                        Object objAaT = bfm.AaT();
                        if (zA67 || objAaT == C78N.A00) {
                            objAaT = new HatchAvatarShareSheetKt$HatchAvatarShareSheet$2$1$1(hatchShareSheetViewModel);
                            bfm.Ai0(objAaT);
                        }
                        HatchAvatarShareSheetKt.AvatarShareTabs(value, (G0U) ((InterfaceC7353EnQ) objAaT), C3U4.A07(C10G.A02, AuraDimensKt.SpacingMedium), bfm, 0, 0);
                    } else {
                        bfm.AgE(194507128);
                    }
                    AnonymousClass001.A1D(bfm);
                    AHD<AvatarSharePage> ahd = this.$tabPages;
                    if (this.$activeTab$delegate.getValue() == AvatarShareTab.Dances) {
                        fValueOf = Float.valueOf(0.5625f);
                    }
                    HatchAvatarShareSheetKt.AvatarCarousel(ahd, fValueOf, this.$avatarSource, this.$pagerState, this.$previewDescription, this.$bubbleText, c07c.AiP(C10G.A02, 1.0f, true), bfm, 0, 0);
                } else {
                    bfm.AgE(194180977);
                    HatchShareSheetKt.HatchShareSheetLoading(C10G.A01, bfm, 6, 0);
                }
                AnonymousClass001.A1D(bfm);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.sharesheet.HatchAvatarShareSheetKt$HatchAvatarShareSheet$3, reason: invalid class name and case insensitive filesystem */
    public final class C136583 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $mediaUri;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $previewUri;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C136583(String str, String str2, BRg bRg, int i, int i2) {
            super(2);
            this.$previewUri = str;
            this.$mediaUri = str2;
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
            HatchAvatarShareSheetKt.HatchAvatarShareSheet(this.$previewUri, this.$mediaUri, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void AvatarCard(Uri uri, AuraDrawableSource auraDrawableSource, boolean z, HatchAvatarStoryPalette hatchAvatarStoryPalette, String str, String str2, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(270258714);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, uri) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass002.A06(AnonymousClass004.A1Y(auraDrawableSource, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0p(bfm, z);
        }
        if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0g(bfm, hatchAvatarStoryPalette);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0h(bfm, str);
        }
        if ((196608 & i) == 0) {
            iA0T |= AnonymousClass004.A0i(bfm, str2);
        }
        int i3 = i2 & 64;
        int iA0j = 1572864;
        if (i3 != 0) {
            iA0T |= iA0j;
        } else if ((1572864 & i) == 0) {
            iA0j = AnonymousClass004.A0j(bfm, bRg2);
            iA0T |= iA0j;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(599187 & iA0T, 599186), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            boolean zA1E = AnonymousClass003.A1E(iA0T);
            Object objAaT = bfm.AaT();
            if (zA1E || objAaT == C78N.A00) {
                objAaT = AGI.A0E(new B6A(hatchAvatarStoryPalette.startColor << 32), new B6A(hatchAvatarStoryPalette.endColor << 32));
                bfm.Ai0(objAaT);
            }
            C1D3 c1d3 = AvatarCardShape;
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            BRg bRgA03 = C11U.A03(AbstractC04540eo.A00(bRg2, c1d3, 10.0f, 4, C06G.A0F(bfm, akh), C06G.A0F(bfm, akh)), c1d3);
            C1335AhM c1335AhMA01 = C1EQ.A01((List) objAaT, 0.0f, Float.POSITIVE_INFINITY);
            C1DM c1dm = C1OM.A00;
            BRg bRgA0B = C3U4.A0B(C1b8.A02(bRgA03, c1335AhMA01, c1dm), 0.0f, 28.0f);
            boolean zA1L = AnonymousClass005.A1L(iA0T);
            Object objAaT2 = bfm.AaT();
            if (zA1L || objAaT2 == C78N.A00) {
                objAaT2 = new HatchAvatarShareSheetKt$AvatarCard$1$1(str);
                bfm.Ai0(objAaT2);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA0B, objAaT2, false);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i4 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0Y);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA0c, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i4);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            BS0 bs0 = BRg.A00;
            C1062ATq c1062ATq = C10G.A01;
            InterfaceC1380AiA interfaceC1380AiAA0R = AnonymousClass006.A0R(bfm);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, c1062ATq);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0R, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            BRg bRgA00 = BJe.A00(C10G.A03(bs0, 0.86f), 1.0f, false);
            C1D3 c1d32 = AvatarMediaShape;
            long jA0F = C06G.A0F(bfm, akh);
            long jA04 = HxS.A04(HDi.A0O[(int) (jA0F & 63)], B6A.A03(jA0F), B6A.A02(jA0F), B6A.A01(jA0F), 0.2f);
            long jA0F2 = C06G.A0F(bfm, akh);
            BRg bRgA032 = C1b8.A03(C11U.A03(AbstractC04540eo.A00(bRgA00, c1d32, 12.0f, 4, jA04, HxS.A04(HDi.A0O[(int) (jA0F2 & 63)], B6A.A03(jA0F2), B6A.A02(jA0F2), B6A.A01(jA0F2), 0.2f)), c1d32), c1dm, B6A.A08);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA043 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bRgA032);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0a, g0v);
            BPg.A02(bfm, akqA043, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA013, g0vA0u);
            if (uri != null) {
                bfm.AgE(1500757528);
                AvatarVideo(uri, auraDrawableSource, z, c1062ATq, false, bfm, AnonymousClass002.A07(iA0T, (iA0T & 14) | 3072), 16);
            } else {
                bfm.AgE(1500971831);
                AuraImageKt.AuraImage(auraDrawableSource, c1062ATq, null, null, false, false, null, false, null, bfm, ((iA0T >> 3) & 14) | 12583344, 376);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
            m1998AvatarStoryBubble3IgeMak(str2, hatchAvatarStoryPalette.bubbleTextColor << 32, AYD.A01(C10G.A03(bs0, 0.67f), 0.0f, 8.0f), bfm, ((iA0T >> 15) & 14) | 384, 0);
            BBI.A0R(bbi, true);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(uri, auraDrawableSource, z, hatchAvatarStoryPalette, str, str2, bRg2, i, i2);
        }
    }

    public static final void AvatarCarousel(AHD<? extends AvatarSharePage> ahd, Float f, AuraDrawableSource auraDrawableSource, PagerState pagerState, String str, String str2, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRgA0Q = bRg;
        bfm.AgG(-1359414507);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, ahd) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, f);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass003.A05(AnonymousClass004.A1Z(auraDrawableSource, bfm, i) ? 1 : 0);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, pagerState);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, str);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0i(bfm, str2);
        }
        int i3 = i2 & 64;
        int iA0j = 1572864;
        if (i3 != 0) {
            iA0d |= iA0j;
        } else if ((1572864 & i) == 0) {
            iA0j = AnonymousClass004.A0j(bfm, bRgA0Q);
            iA0d |= iA0j;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(599187 & iA0d, 599186), bfm, iA0d)) {
            if (i3 != 0) {
                bRgA0Q = BRg.A00;
            }
            Object[] objArr = new Object[0];
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = HatchAvatarShareSheetKt$AvatarCarousel$isMuted$2$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            MutableState mutableStateA0N = AnonymousClass002.A0N(bfm, objAaT, objArr);
            BRg bRgA0A = C3U4.A0A(bRgA0Q, 4.0f, 12.0f);
            InterfaceC1380AiA interfaceC1380AiAA0T = AnonymousClass006.A0T(bfm, C2VU.A00, 12.0f);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0A);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0T, akqA04, bRgA01, iA0J);
            C3IL.A00(bfm, null, AnonymousClass001.A0N(C90l.A00, C10G.A02, true), B1V.A00(bfm, new HatchAvatarShareSheetKt$AvatarCarousel$1$1(f, pagerState, ahd, auraDrawableSource, mutableStateA0N, str, str2), -1859449887), 3072, 6, false);
            if (ahd.size() > 1) {
                bfm.AgE(-2124255511);
                AuraPagerIndicatorKt.AuraPagerIndicator(ahd.size(), pagerState, null, 0, bfm, (iA0d >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 12);
            } else {
                bfm.AgE(-2124149801);
            }
            bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, false, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(ahd, f, auraDrawableSource, pagerState, str, str2, bRgA0Q, i, i2);
        }
    }

    public static final void AvatarShareTabs(AvatarShareTab avatarShareTab, G0U<? super AvatarShareTab, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1863813560);
        int iA0D = (i & 6) == 0 ? AnonymousClass004.A0D(bfm, AnonymousClass003.A0K(avatarShareTab)) | i : i;
        if ((i & 48) == 0) {
            iA0D |= AnonymousClass004.A0U(bfm, g0u);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0D |= 384;
        } else if ((i & 384) == 0) {
            iA0D |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0D), bfm, iA0D)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                Ey9<AvatarShareTab> entries = AvatarShareTab.getEntries();
                ArrayList arrayListA0i = AnonymousClass003.A0i(entries);
                Iterator<AvatarShareTab> it = entries.iterator();
                while (it.hasNext()) {
                    arrayListA0i.add(new TextTab(it.next().getLabelRes(), null));
                }
                objAaT = AnonymousClass001.A0z(bfm, arrayListA0i);
            }
            AHD ahd = (AHD) objAaT;
            Ey9<AvatarShareTab> entries2 = AvatarShareTab.getEntries();
            C7384Etj.A0Y(entries2, 0);
            int iIndexOf = entries2.indexOf(avatarShareTab);
            if (iIndexOf < 0) {
                iIndexOf = 0;
            }
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            long j = AnonymousClass001.A0f(bfm, akh).elevated;
            BRg bRgA02 = C1DI.A02(bRg2, AnonymousClass002.A0e(bfm).pill, 1.0f, AnonymousClass001.A0f(bfm, akh).elevatedBorder);
            boolean zA1C = AnonymousClass003.A1C(iA0D);
            Object objAaT2 = bfm.AaT();
            if (zA1C || objAaT2 == obj) {
                objAaT2 = new HatchAvatarShareSheetKt$AvatarShareTabs$1$1(g0u);
                bfm.Ai0(objAaT2);
            }
            AuraSegmentedTabsKt.m2609AuraToggleSegmentedTabswDTT_x8((G0V) objAaT2, ahd, iIndexOf, bRgA02, j, 0L, 0.0f, 0.0f, 0.0f, null, null, bfm, TextTab.$stable << 3, 0, 2016);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C136522(avatarShareTab, g0u, bRg2, i, i2);
        }
    }

    /* renamed from: AvatarStoryBubble-3IgeMak, reason: not valid java name */
    public static final void m1998AvatarStoryBubble3IgeMak(String str, long j, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRgA0P = bRg;
        bfm.AgG(-450716416);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0N(bfm, j);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRgA0P);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRgA0P = BRg.A00;
            }
            BRg bRgA00 = C11T.A00(bRgA0P, -3.0f);
            InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(C2VU.A0C, false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA00);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA01, akqA04, bRgA01, iA0J);
            BS0 bs0 = BRg.A00;
            BRg bRgA07 = C10G.A07(AYD.A01(bs0, 24.0f, -14.0f), 14.0f);
            float f = AvatarBubbleElevation;
            C1D3 c1d3 = C1D8.A00;
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            BRg bRgA002 = AbstractC04540eo.A00(bRgA07, c1d3, f, 4, C06G.A0F(bfm, akh), C06G.A0F(bfm, akh));
            long j2 = B6A.A08;
            C3Ue.A04(C1b8.A03(bRgA002, c1d3, j2), bfm, 0);
            C3Ue.A04(C1b8.A03(AbstractC04540eo.A00(C10G.A07(AYD.A01(bs0, 48.0f, -4.0f), 28.0f), c1d3, f, 4, C06G.A0F(bfm, akh), C06G.A0F(bfm, akh)), c1d3, j2), bfm, 0);
            BRg bRgA04 = C3U4.A04(bs0, 16.0f);
            C1D3 c1d32 = AvatarBubbleShape;
            AuraTextKt.m2639AuraTextUY9GdpU(str, C3U4.A0B(C1b8.A03(AbstractC04540eo.A00(bRgA04, c1d32, f, 4, C06G.A0F(bfm, akh), C06G.A0F(bfm, akh)), c1d32, j2), 20.0f, 12.0f), j, C1822Arm.A00(null, C06G.A0W(bfm), null, null, null, null, null, null, null, null, 0, 0, 0, 16646141, 0L, C19U.A03(14), 0L, C19U.A03(18)), null, null, null, false, 0, 0, 0, null, null, null, bfm, (iA0d & 14) | ((iA0d << 3) & 896), 0, 16368);
            bRgA0P = AnonymousClass001.A0P(bbi, bRgA0P);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchAvatarShareSheetKt$AvatarStoryBubble$2(str, j, bRgA0P, i, i2);
        }
    }

    public static final void AvatarVideo(Uri uri, AuraDrawableSource auraDrawableSource, boolean z, BRg bRg, boolean z2, BFM bfm, int i, int i2) {
        boolean z3 = z2;
        BRg bRg2 = bRg;
        bfm.AgG(590089926);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, uri) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass002.A06(AnonymousClass004.A1Y(auraDrawableSource, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0p(bfm, z);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0T |= 3072;
        } else if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0g(bfm, bRg2);
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            iA0T |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0r(bfm, z3);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                z3 = false;
            }
            HatchVideoPlayerComposableKt.HatchVideoPlayerComposable(bRg2, uri, RememberHatchVideoPlayerKt.rememberHatchVideoPlayer(HatchVideoPlayer.RepeatMode.ALL, true, z, bfm, (iA0T & 896) | 54, 0), uri.toString(), auraDrawableSource, null, false, z, z3, false, false, false, HatchVideoPlayer.ResizeMode.ZOOM, 0.0f, "hatch_avatar_share_carousel", null, false, false, false, null, false, null, null, null, null, null, null, bfm, AnonymousClass001.A09(iA0T << 12, AnonymousClass001.A0C(iA0T << 15, ((iA0T >> 9) & 14) | ((iA0T << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | (57344 & (iA0T << 9)))), 1597878, 0, 134128224);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C136531(uri, auraDrawableSource, z, bRg2, z3, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void DanceCard(com.facebook.aura.sharesheet.AvatarSharePage.Dance r22, com.facebook.aura.vds.compose.common.AuraDrawableSource r23, boolean r24, boolean r25, X.G0U<? super java.lang.Boolean, kotlin.Unit> r26, java.lang.String r27, X.BRg r28, X.BFM r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.sharesheet.HatchAvatarShareSheetKt.DanceCard(com.facebook.aura.sharesheet.AvatarSharePage$Dance, com.facebook.aura.vds.compose.common.AuraDrawableSource, boolean, boolean, X.G0U, java.lang.String, X.BRg, X.BFM, int, int):void");
    }

    public static final void DanceMuteButton(boolean z, G0U<? super Boolean, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-2105781959);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0U(bfm, g0u);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0n |= 384;
        } else if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 147, 146), bfm, iA0n)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraIconButtonSizeV2 auraIconButtonSizeV2 = AuraIconButtonSizeV2.MEDIUM;
            int i4 = R.drawable.speakermid_outline_24_wght400;
            if (z) {
                i4 = R.drawable.speakerslash_outline_24_wght400;
            }
            AVy aVyA00 = BOf.A00(bfm, i4, 0);
            AuraIconButtonStyleConfig auraIconButtonStyleConfigFlat = AuraIconButtonStyles.INSTANCE.flat(bfm, 6);
            int i5 = R.string._name_removed__res_0x7f120466;
            if (z) {
                i5 = R.string._name_removed__res_0x7f12046b;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, i5);
            BRg bRgThen = C10G.A02(C2VU.A09, C10G.A07(bRg2, auraIconButtonSizeV2.m2554buttonSizeD9Ej5fM()), true).then(ARV.A00);
            boolean zA1C = AnonymousClass003.A1C(iA0n) | AnonymousClass003.A1B(iA0n);
            Object objAaT = bfm.AaT();
            if (zA1C || objAaT == C78N.A00) {
                objAaT = new HatchAvatarShareSheetKt$DanceMuteButton$1$1(g0u, z);
                bfm.Ai0(objAaT);
            }
            AuraIconButtonKt.m2551AuraIconButtonV2X32rcYo(bRgThen, aVyA00, auraIconButtonSizeV2, auraIconButtonStyleConfigFlat, strA01, (Function0) objAaT, null, false, null, new C1DG(16.0f), null, null, null, bfm, (AVy.$stable << 3) | 805306752, 0, 7616);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C136552(z, g0u, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x026d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HatchAvatarShareSheet(java.lang.String r45, java.lang.String r46, X.BRg r47, X.BFM r48, int r49, int r50) {
        /*
            Method dump skipped, instructions count: 684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.sharesheet.HatchAvatarShareSheetKt.HatchAvatarShareSheet(java.lang.String, java.lang.String, X.BRg, X.BFM, int, int):void");
    }

    public static final void AvatarShareSheetPageLogging(HatchShareSheetViewModel hatchShareSheetViewModel, PagerState pagerState, BFM bfm, int i) {
        bfm.AgG(-666860118);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(hatchShareSheetViewModel, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, pagerState);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA05), bfm, iA05)) {
            C1BO c1boA02 = C2CK.A02(bfm, hatchShareSheetViewModel.logContext);
            HatchShareLogging hatchShareLogging = HatchShareLogging.INSTANCE;
            HatchShareLogContext hatchShareLogContext = (HatchShareLogContext) c1boA02.getValue();
            int i2 = HatchShareLogContext.$stable;
            hatchShareLogging.rememberShareSheetDismissLogging(hatchShareLogContext, bfm, i2 | 48);
            hatchShareLogging.AvatarSwipeLogging(pagerState, (HatchShareLogContext) c1boA02.getValue(), bfm, ((iA05 >> 3) & 14) | 384 | (i2 << 3));
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(hatchShareSheetViewModel, pagerState, i);
        }
    }

    public static final /* synthetic */ HatchShareSheetUiState access$HatchAvatarShareSheet$lambda$0(C1BO c1bo) {
        return (HatchShareSheetUiState) c1bo.getValue();
    }

    public static final /* synthetic */ AvatarShareTab access$HatchAvatarShareSheet$lambda$6(C1BO c1bo) {
        return (AvatarShareTab) c1bo.getValue();
    }
}
