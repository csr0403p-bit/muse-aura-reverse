package com.facebook.aura.library.view;

import X.AHD;
import X.AKQ;
import X.AVy;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BJe;
import X.BOf;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C07C;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C1D3;
import X.C1D8;
import X.C1DG;
import X.C1DM;
import X.C2VU;
import X.C3U4;
import X.C7BY;
import X.F60;
import X.FGI;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.agentpermission.ConnectorOrderCheckoutRowsKt;
import com.facebook.aura.file.utils.HatchFileUIUtils;
import com.facebook.aura.library.model.RecentFile;
import com.facebook.aura.library.repo.WorkspaceEntry;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.common.AuraClickableCardKt;
import com.facebook.aura.vds.compose.divider.AuraDividerKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchDocumentCardKt {
    public static final float ARTIFACT_ICON_GLYPH_SIZE = 24.0f;
    public static final float ARTIFACT_ICON_SLOT_SIZE = 32.0f;
    public static final C1D3 ROW_THUMBNAIL_SHAPE = C1D8.A00(12.0f);
    public static final float ROW_THUMBNAIL_SIZE = 40.0f;
    public static final float ROW_TRAILING_ICON_SIZE = 20.0f;
    public static final float ROW_TRAILING_TOUCH_TARGET = 48.0f;

    /* renamed from: com.facebook.aura.library.view.HatchDocumentCardKt$DocumentArtifactIcon$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $fileFormat;
        public final /* synthetic */ String $iconUrl;
        public final /* synthetic */ boolean $isSpace;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $xmdsIcon;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, String str, String str2, String str3, BRg bRg, int i, int i2) {
            super(2);
            this.$isSpace = z;
            this.$iconUrl = str;
            this.$xmdsIcon = str2;
            this.$fileFormat = str3;
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
            HatchDocumentCardKt.DocumentArtifactIcon(this.$isSpace, this.$iconUrl, this.$xmdsIcon, this.$fileFormat, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.library.view.HatchDocumentCardKt$DocumentThumbnail$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ C1DM $clipShape;
        public final /* synthetic */ RecentFile $file;
        public final /* synthetic */ String $fileFormat;
        public final /* synthetic */ String $iconUrl;
        public final /* synthetic */ String $imageUri;
        public final /* synthetic */ boolean $isSpace;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $preferPreview;
        public final /* synthetic */ AHD<String> $previewUris;
        public final /* synthetic */ String $sharedElementKey;
        public final /* synthetic */ boolean $useArtifactIcon;
        public final /* synthetic */ String $xmdsIcon;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(RecentFile recentFile, String str, boolean z, String str2, String str3, AHD<String> ahd, String str4, C1DM c1dm, BRg bRg, boolean z2, String str5, boolean z3, int i, int i2, int i3) {
            super(2);
            this.$file = recentFile;
            this.$imageUri = str;
            this.$isSpace = z;
            this.$iconUrl = str2;
            this.$xmdsIcon = str3;
            this.$previewUris = ahd;
            this.$sharedElementKey = str4;
            this.$clipShape = c1dm;
            this.$modifier = bRg;
            this.$useArtifactIcon = z2;
            this.$fileFormat = str5;
            this.$preferPreview = z3;
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
            HatchDocumentCardKt.DocumentThumbnail(this.$file, this.$imageUri, this.$isSpace, this.$iconUrl, this.$xmdsIcon, this.$previewUris, this.$sharedElementKey, this.$clipShape, this.$modifier, this.$useArtifactIcon, this.$fileFormat, this.$preferPreview, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.library.view.HatchDocumentCardKt$LobsterDocumentCard$1, reason: invalid class name and case insensitive filesystem */
    public final class C123661 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ RecentFile $file;
        public final /* synthetic */ String $fileFormat;
        public final /* synthetic */ String $iconUrl;
        public final /* synthetic */ String $imageUri;
        public final /* synthetic */ boolean $isSpace;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ Function0<Unit> $onLongClick;
        public final /* synthetic */ AHD<String> $previewUris;
        public final /* synthetic */ String $sharedElementKey;
        public final /* synthetic */ String $subtitle;
        public final /* synthetic */ C1D3 $thumbnailShape;
        public final /* synthetic */ boolean $useArtifactIcon;
        public final /* synthetic */ String $xmdsIcon;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C123661(Function0<Unit> function0, Function0<Unit> function02, RecentFile recentFile, String str, boolean z, String str2, String str3, AHD<String> ahd, String str4, C1D3 c1d3, boolean z2, String str5, String str6) {
            super(3);
            this.$onLongClick = function0;
            this.$onClick = function02;
            this.$file = recentFile;
            this.$imageUri = str;
            this.$isSpace = z;
            this.$iconUrl = str2;
            this.$xmdsIcon = str3;
            this.$previewUris = ahd;
            this.$sharedElementKey = str4;
            this.$thumbnailShape = c1d3;
            this.$useArtifactIcon = z2;
            this.$fileFormat = str5;
            this.$subtitle = str6;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, c07c), bfm, i)) {
                Function0<Unit> function0 = this.$onLongClick;
                BS0 bs0 = BRg.A00;
                BRg bRgM2509auraClickableCardYQRRFTQ = C10G.A01;
                if (function0 != null) {
                    bRgM2509auraClickableCardYQRRFTQ = AuraClickableCardKt.m2509auraClickableCardYQRRFTQ(bRgM2509auraClickableCardYQRRFTQ, this.$onClick, function0, 0, null);
                }
                RecentFile recentFile = this.$file;
                String str = this.$imageUri;
                boolean z = this.$isSpace;
                String str2 = this.$iconUrl;
                String str3 = this.$xmdsIcon;
                AHD<String> ahd = this.$previewUris;
                String str4 = this.$sharedElementKey;
                C1D3 c1d3 = this.$thumbnailShape;
                boolean z2 = this.$useArtifactIcon;
                String str5 = this.$fileFormat;
                String strDocumentSubtitle = this.$subtitle;
                InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgM2509auraClickableCardYQRRFTQ);
                Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function02);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
                BRg bRgA0N = C06G.A0N(bfm, BJe.A00(C10G.A02, 1.3027523f, false));
                int i2 = RecentFile.$stable;
                HatchDocumentCardKt.DocumentThumbnail(recentFile, str, z, str2, str3, ahd, str4, c1d3, bRgA0N, z2, str5, true, bfm, i2, 48, 0);
                AuraDividerKt.AuraDivider(null, null, false, bfm, 0, 7);
                C01N.A05(bfm, bs0);
                String str6 = recentFile.name;
                C1822Arm c1822ArmA0V = C06G.A0V(bfm);
                AuraTextKt.m2639AuraTextUY9GdpU(str6, C3U4.A0B(bs0, 12.0f, 0.0f), C06G.A0C(bfm), c1822ArmA0V, null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306416, 6, 14832);
                C01N.A08(bfm, bs0, 2.0f);
                if (strDocumentSubtitle == null) {
                    bfm.AgE(1831440623);
                    strDocumentSubtitle = HatchDocumentCardKt.documentSubtitle(z, recentFile, bfm, i2 << 3);
                    BBI.A0R(bbi, false);
                } else {
                    bfm.AgE(1831440251);
                    BBI.A0R(bbi, false);
                }
                C1822Arm c1822ArmA0Y = C06G.A0Y(bfm);
                String str7 = strDocumentSubtitle;
                AuraTextKt.m2639AuraTextUY9GdpU(str7, C3U4.A0B(bs0, 12.0f, 0.0f), C06G.A09(bfm), c1822ArmA0Y, null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306416, 6, 14832);
                C01N.A04(bfm, bbi, bs0, AuraDimensKt.SpacingSmall, true);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.library.view.HatchDocumentCardKt$LobsterDocumentCard$2, reason: invalid class name and case insensitive filesystem */
    public final class C123672 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ RecentFile $file;
        public final /* synthetic */ String $fileFormat;
        public final /* synthetic */ String $iconUrl;
        public final /* synthetic */ String $imageUri;
        public final /* synthetic */ boolean $isSpace;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ Function0<Unit> $onLongClick;
        public final /* synthetic */ AHD<String> $previewUris;
        public final /* synthetic */ String $sharedElementKey;
        public final /* synthetic */ String $subtitle;
        public final /* synthetic */ boolean $useArtifactIcon;
        public final /* synthetic */ String $xmdsIcon;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C123672(RecentFile recentFile, String str, AHD<String> ahd, Function0<Unit> function0, BRg bRg, Function0<Unit> function02, String str2, boolean z, String str3, String str4, boolean z2, String str5, String str6, int i, int i2, int i3) {
            super(2);
            this.$file = recentFile;
            this.$imageUri = str;
            this.$previewUris = ahd;
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$onLongClick = function02;
            this.$sharedElementKey = str2;
            this.$isSpace = z;
            this.$iconUrl = str3;
            this.$xmdsIcon = str4;
            this.$useArtifactIcon = z2;
            this.$fileFormat = str5;
            this.$subtitle = str6;
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
            HatchDocumentCardKt.LobsterDocumentCard(this.$file, this.$imageUri, this.$previewUris, this.$onClick, this.$modifier, this.$onLongClick, this.$sharedElementKey, this.$isSpace, this.$iconUrl, this.$xmdsIcon, this.$useArtifactIcon, this.$fileFormat, this.$subtitle, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.library.view.HatchDocumentCardKt$LobsterDocumentRow$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ RecentFile $file;
        public final /* synthetic */ String $fileFormat;
        public final /* synthetic */ String $iconUrl;
        public final /* synthetic */ String $imageUri;
        public final /* synthetic */ boolean $isPinned;
        public final /* synthetic */ boolean $isSpace;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ Function0<Unit> $onLongClick;
        public final /* synthetic */ Function0<Unit> $onMoreClick;
        public final /* synthetic */ AHD<String> $previewUris;
        public final /* synthetic */ String $subtitle;
        public final /* synthetic */ boolean $useArtifactIcon;
        public final /* synthetic */ String $xmdsIcon;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(RecentFile recentFile, String str, Function0<Unit> function0, BRg bRg, Function0<Unit> function02, Function0<Unit> function03, boolean z, AHD<String> ahd, boolean z2, String str2, String str3, boolean z3, String str4, String str5, int i, int i2, int i3) {
            super(2);
            this.$file = recentFile;
            this.$imageUri = str;
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$onLongClick = function02;
            this.$onMoreClick = function03;
            this.$isPinned = z;
            this.$previewUris = ahd;
            this.$isSpace = z2;
            this.$iconUrl = str2;
            this.$xmdsIcon = str3;
            this.$useArtifactIcon = z3;
            this.$fileFormat = str4;
            this.$subtitle = str5;
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
            HatchDocumentCardKt.LobsterDocumentRow(this.$file, this.$imageUri, this.$onClick, this.$modifier, this.$onLongClick, this.$onMoreClick, this.$isPinned, this.$previewUris, this.$isSpace, this.$iconUrl, this.$xmdsIcon, this.$useArtifactIcon, this.$fileFormat, this.$subtitle, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }
    }

    /* renamed from: ArtifactFallbackIcon-3J-VO9M, reason: not valid java name */
    public static final void m1158ArtifactFallbackIcon3JVO9M(long j, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1813959590);
        int iA0M = (i & 6) == 0 ? i | AnonymousClass004.A0M(bfm, j) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0M |= 48;
        } else if ((i & 48) == 0) {
            iA0M |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0M & 19, 18), bfm, iA0M)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraIconKt.m2567AuraIconFHprtrg(bRg2, BOf.A00(bfm, R.drawable.aura_files, 0), AuraIconSize.X_SMALL, null, j, null, bfm, AnonymousClass001.A0B(iA0M << 12, ((iA0M >> 3) & 14) | 384 | (AVy.$stable << 3)), 40);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchDocumentCardKt$ArtifactFallbackIcon$1(j, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* renamed from: ArtifactIconThumbnail-RLL6an4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1159ArtifactIconThumbnailRLL6an4(java.lang.String r33, java.lang.String r34, long r35, float r37, float r38, X.BRg r39, X.BFM r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.view.HatchDocumentCardKt.m1159ArtifactIconThumbnailRLL6an4(java.lang.String, java.lang.String, long, float, float, X.BRg, X.BFM, int, int):void");
    }

    /* renamed from: ArtifactXmdsOrFallbackIcon-BazWgJc, reason: not valid java name */
    public static final void m1160ArtifactXmdsOrFallbackIconBazWgJc(String str, long j, float f, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1197397106);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0N(bfm, j);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A06(bfm, f);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (str != null) {
                bfm.AgE(1953966718);
                AuraImageKt.m2573AuraImageXRP3Ue8(str, C10G.A07(bRg2, f), null, null, null, false, new C1DG(f), j, false, false, false, B1V.A00(bfm, new HatchDocumentCardKt$ArtifactXmdsOrFallbackIcon$1(j, f), -976775422), null, null, null, bfm, AnonymousClass001.A0C(iA0d << 18, AnonymousClass001.A05(iA0d << 12, (iA0d & 14) | 805309440)), 48, 30004);
            } else {
                bfm.AgE(1954335494);
                m1158ArtifactFallbackIcon3JVO9M(j, C10G.A07(bRg2, f), bfm, (iA0d >> 3) & 14, 0);
            }
            AnonymousClass002.A19(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchDocumentCardKt$ArtifactXmdsOrFallbackIcon$2(str, j, f, bRg2, i, i2);
        }
    }

    public static final void DocumentArtifactIcon(boolean z, String str, String str2, String str3, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-955193101);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0f(bfm, str2);
        }
        if ((i & 3072) == 0) {
            iA0n |= AnonymousClass004.A0g(bfm, str3);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0n |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0n |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 9363, 9362), bfm, iA0n)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (z || str3 == null || !(str == null || C7BY.A0j(str))) {
                int i4 = iA0n >> 3;
                m1159ArtifactIconThumbnailRLL6an4(str, str2, AnonymousClass003.A0c(bfm, -1998679805).primaryIcon.enabled, ARTIFACT_ICON_SLOT_SIZE, ARTIFACT_ICON_GLYPH_SIZE, C10G.A02(C2VU.A09, bRg2, false), bfm, (i4 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | (i4 & 14) | 27648, 0);
            } else {
                bfm.AgE(-1999096879);
                AuraIconKt.m2568AuraIconFyETyZw(C10G.A02(C2VU.A09, bRg2, false), BOf.A00(bfm, HatchFileUIUtils.INSTANCE.getWorkspaceEntryIconRes(WorkspaceEntry.EntryType.FILE, str3, bfm, ((iA0n >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 390), 0), ARTIFACT_ICON_SLOT_SIZE, null, B6A.A07, null, bfm, (AVy.$stable << 3) | 28032, 32);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(z, str, str2, str3, bRg2, i, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01e3  */
    /* JADX WARN: Type inference failed for: r25v4, types: [X.Ei9] */
    /* JADX WARN: Type inference failed for: r27v4, types: [com.facebook.common.callercontext.ContextChain] */
    /* JADX WARN: Type inference failed for: r28v4, types: [X.Ej6] */
    /* JADX WARN: Type inference failed for: r33v1, types: [X.Ais] */
    /* JADX WARN: Type inference failed for: r37v2, types: [X.G0U] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void DocumentThumbnail(com.facebook.aura.library.model.RecentFile r35, java.lang.String r36, boolean r37, java.lang.String r38, java.lang.String r39, X.AHD<java.lang.String> r40, java.lang.String r41, X.C1DM r42, X.BRg r43, boolean r44, java.lang.String r45, boolean r46, X.BFM r47, int r48, int r49, int r50) {
        /*
            Method dump skipped, instructions count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.view.HatchDocumentCardKt.DocumentThumbnail(com.facebook.aura.library.model.RecentFile, java.lang.String, boolean, java.lang.String, java.lang.String, X.AHD, java.lang.String, X.1DM, X.BRg, boolean, java.lang.String, boolean, X.BFM, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LobsterDocumentCard(com.facebook.aura.library.model.RecentFile r42, java.lang.String r43, X.AHD<java.lang.String> r44, kotlin.jvm.functions.Function0<kotlin.Unit> r45, X.BRg r46, kotlin.jvm.functions.Function0<kotlin.Unit> r47, java.lang.String r48, boolean r49, java.lang.String r50, java.lang.String r51, boolean r52, java.lang.String r53, java.lang.String r54, X.BFM r55, int r56, int r57, int r58) {
        /*
            Method dump skipped, instructions count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.view.HatchDocumentCardKt.LobsterDocumentCard(com.facebook.aura.library.model.RecentFile, java.lang.String, X.AHD, kotlin.jvm.functions.Function0, X.BRg, kotlin.jvm.functions.Function0, java.lang.String, boolean, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, X.BFM, int, int, int):void");
    }

    public static final String documentSubtitle(boolean z, RecentFile recentFile, BFM bfm, int i) {
        if (z) {
            bfm.AgE(-1255378749);
            return AnonymousClass003.A0e(bfm, R.string._name_removed__res_0x7f120c78);
        }
        Long l = recentFile.sizeBytes;
        if (l == null || l.longValue() <= 0) {
            AnonymousClass004.A1A(bfm, -1255374186);
            return recentFile.fileType;
        }
        AnonymousClass004.A1A(bfm, -1255375857);
        return FGI.A0U(recentFile.fileType, ConnectorOrderCheckoutRowsKt.DETAIL_SEPARATOR, recentFile.size);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LobsterDocumentRow(com.facebook.aura.library.model.RecentFile r62, java.lang.String r63, kotlin.jvm.functions.Function0<kotlin.Unit> r64, X.BRg r65, kotlin.jvm.functions.Function0<kotlin.Unit> r66, kotlin.jvm.functions.Function0<kotlin.Unit> r67, boolean r68, X.AHD<java.lang.String> r69, boolean r70, java.lang.String r71, java.lang.String r72, boolean r73, java.lang.String r74, java.lang.String r75, X.BFM r76, int r77, int r78, int r79) {
        /*
            Method dump skipped, instructions count: 1166
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.view.HatchDocumentCardKt.LobsterDocumentRow(com.facebook.aura.library.model.RecentFile, java.lang.String, kotlin.jvm.functions.Function0, X.BRg, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, X.AHD, boolean, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, X.BFM, int, int, int):void");
    }
}
