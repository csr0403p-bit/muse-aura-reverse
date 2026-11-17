package com.facebook.aura.library.view;

import X.AGI;
import X.AHD;
import X.AKQ;
import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.AcQ;
import X.Ad7;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BJe;
import X.BL4;
import X.BRg;
import X.C00x;
import X.C06G;
import X.C0v5;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1BO;
import X.C1D3;
import X.C1D8;
import X.C1DD;
import X.C1DG;
import X.C1DP;
import X.C1YZ;
import X.C1b8;
import X.C7197Ei9;
import X.C78N;
import X.C9m9;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G2j;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import com.facebook.aura.file.view.api.ContentItem;
import com.facebook.aura.file.view.api.ContentType;
import com.facebook.aura.library.model.HatchLibraryViewModel;
import com.facebook.aura.library.model.MediaEntryUiModel;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.ui.sharedelement.HatchSharedElementKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.loading.AutoLoadMoreKt;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class MediaGalleryScreenKt {
    public static final int MEDIA_GRID_COLUMNS = 3;
    public static final float MEDIA_GRID_FRAME_CORNER_RADIUS = 30.0f;
    public static final float MEDIA_GRID_MIN_CELL_WIDTH = 140.0f;
    public static final float MEDIA_GRID_SPACING;
    public static final C1D3 SHAPE_DEFAULT;
    public static final C1D3 SHAPE_TOP_END;
    public static final C1D3 SHAPE_TOP_START;

    /* renamed from: com.facebook.aura.library.view.MediaGalleryScreenKt$MediaGalleryScreen$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ int $cellSizePx;
        public final /* synthetic */ C1BO<AHD<ContentItem>> $contentItems;
        public final /* synthetic */ C1BO<AuraNavigator> $currentNavigator;
        public final /* synthetic */ AHD<MediaEntryUiModel> $entries;
        public final /* synthetic */ int $gridColumns;
        public final /* synthetic */ C1BO<HatchLibraryViewModel.UiState> $uiState$delegate;
        public final /* synthetic */ HatchLibraryViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(int i, int i2, AHD<MediaEntryUiModel> ahd, C1BO<? extends AuraNavigator> c1bo, C1BO<? extends AHD<ContentItem>> c1bo2, C1BO<HatchLibraryViewModel.UiState> c1bo3, HatchLibraryViewModel hatchLibraryViewModel) {
            super(4);
            this.$cellSizePx = i;
            this.$gridColumns = i2;
            this.$entries = ahd;
            this.$currentNavigator = c1bo;
            this.$contentItems = c1bo2;
            this.$uiState$delegate = c1bo3;
            this.$viewModel = hatchLibraryViewModel;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m1184invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m1184invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            int iA04 = (i & 6) == 0 ? i | AnonymousClass004.A04(bfm, f) : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 147, 146), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            LazyGridState lazyGridStateA00 = Ad7.A00(bfm, 0, 3);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = AnonymousClass003.A0R(bfm, new MediaGalleryScreenKt$MediaGalleryScreen$1$isIdle$2$1(lazyGridStateA00));
            }
            C1BO c1bo = (C1BO) objAaT;
            boolean zA63 = bfm.A63(this.$cellSizePx);
            int i2 = this.$cellSizePx;
            Object objAaT2 = bfm.AaT();
            if (zA63 || objAaT2 == obj) {
                objAaT2 = MediaSectionKt.thumbnailImageOptions(i2);
                bfm.Ai0(objAaT2);
            }
            C7197Ei9 c7197Ei9 = (C7197Ei9) objAaT2;
            C1DD c1dd = new C1DD(this.$gridColumns);
            C1062ATq c1062ATq = C10G.A01;
            long jA0B = C06G.A0B(bfm);
            float f3 = MediaGalleryScreenKt.MEDIA_GRID_FRAME_CORNER_RADIUS;
            BRg bRgA03 = C1b8.A03(c1062ATq, C1D8.A01(f3, f3, 0.0f, 0.0f), jA0B);
            C1DP c1dp = new C1DP(0.0f, f, 0.0f, f2);
            float f4 = MediaGalleryScreenKt.MEDIA_GRID_SPACING;
            C9m9 c9m9A00 = AcQ.A00(f4);
            C9m9 c9m9A002 = AcQ.A00(f4);
            boolean zA1R = AnonymousClass001.A1R(bfm, this.$uiState$delegate, AnonymousClass004.A1S(bfm, this.$contentItems, c7197Ei9, AnonymousClass001.A1R(bfm, this.$currentNavigator, AnonymousClass001.A1a(bfm.A65(this.$entries), bfm, this.$gridColumns))));
            AHD<MediaEntryUiModel> ahd = this.$entries;
            int i3 = this.$gridColumns;
            C1BO<AuraNavigator> c1bo2 = this.$currentNavigator;
            C1BO<AHD<ContentItem>> c1bo3 = this.$contentItems;
            C1BO<HatchLibraryViewModel.UiState> c1bo4 = this.$uiState$delegate;
            Object objAaT3 = bfm.AaT();
            if (zA1R || objAaT3 == obj) {
                objAaT3 = new MediaGalleryScreenKt$MediaGalleryScreen$1$1$1(ahd, i3, c7197Ei9, c1bo2, c1bo3, c1bo, c1bo4);
                bfm.Ai0(objAaT3);
            }
            C1YZ.A00(null, null, c9m9A00, c9m9A002, c1dp, c1dd, lazyGridStateA00, bfm, bRgA03, (G0U) objAaT3, 1769472, 0, 912, false, false);
            boolean zA67 = bfm.A67(this.$viewModel);
            HatchLibraryViewModel hatchLibraryViewModel = this.$viewModel;
            Object objAaT4 = bfm.AaT();
            if (zA67 || objAaT4 == obj) {
                objAaT4 = new MediaGalleryScreenKt$MediaGalleryScreen$1$2$1(hatchLibraryViewModel);
                bfm.Ai0(objAaT4);
            }
            AutoLoadMoreKt.AutoLoadMore(lazyGridStateA00, 0, (Function0<Unit>) objAaT4, bfm, 0, 1);
        }
    }

    /* renamed from: com.facebook.aura.library.view.MediaGalleryScreenKt$MediaGalleryScreen$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ HatchLibraryViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchLibraryViewModel hatchLibraryViewModel, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$viewModel = hatchLibraryViewModel;
            this.$onBack = function0;
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
            MediaGalleryScreenKt.MediaGalleryScreen(this.$viewModel, this.$onBack, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.library.view.MediaGalleryScreenKt$MediaGalleryThumbnail$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ MediaEntryUiModel $entry;
        public final /* synthetic */ Function0<Boolean> $isSharedElementEnabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ C1D3 $shape;
        public final /* synthetic */ String $sharedKey;
        public final /* synthetic */ C7197Ei9 $thumbnailOptions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(MediaEntryUiModel mediaEntryUiModel, Function0<Unit> function0, BRg bRg, C1D3 c1d3, String str, Function0<Boolean> function02, C7197Ei9 c7197Ei9, int i, int i2) {
            super(2);
            this.$entry = mediaEntryUiModel;
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$shape = c1d3;
            this.$sharedKey = str;
            this.$isSharedElementEnabled = function02;
            this.$thumbnailOptions = c7197Ei9;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            MediaGalleryScreenKt.MediaGalleryThumbnail(this.$entry, this.$onClick, this.$modifier, this.$shape, this.$sharedKey, this.$isSharedElementEnabled, this.$thumbnailOptions, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    static {
        float f = AuraDimensKt.SpacingNano;
        MEDIA_GRID_SPACING = f;
        SHAPE_TOP_START = C1D8.A01(30.0f, f, f, f);
        SHAPE_TOP_END = C1D8.A01(f, 30.0f, f, f);
        SHAPE_DEFAULT = C1D8.A00(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void MediaGalleryScreen(com.facebook.aura.library.model.HatchLibraryViewModel r44, kotlin.jvm.functions.Function0<kotlin.Unit> r45, X.BRg r46, X.BFM r47, int r48, int r49) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.view.MediaGalleryScreenKt.MediaGalleryScreen(com.facebook.aura.library.model.HatchLibraryViewModel, kotlin.jvm.functions.Function0, X.BRg, X.BFM, int, int):void");
    }

    public static final void MediaGalleryThumbnail(MediaEntryUiModel mediaEntryUiModel, Function0<Unit> function0, BRg bRg, C1D3 c1d3, String str, Function0<Boolean> function02, C7197Ei9 c7197Ei9, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C1D3 c1d32 = c1d3;
        String str2 = str;
        Function0<Boolean> function03 = function02;
        bfm.AgG(1257301927);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, mediaEntryUiModel) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, c1d32);
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, str2);
        }
        int i6 = i2 & 32;
        int iA0Y = 196608;
        if (i6 != 0) {
            iA0d |= iA0Y;
        } else if ((196608 & i) == 0) {
            iA0Y = AnonymousClass004.A0Y(bfm, function03);
            iA0d |= iA0Y;
        }
        if ((i & 1572864) == 0) {
            iA0d |= AnonymousClass004.A0Z(bfm, c7197Ei9);
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1H(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                c1d32 = SHAPE_DEFAULT;
            }
            if (i5 != 0) {
                str2 = null;
            }
            if (i6 != 0) {
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = MediaGalleryScreenKt$MediaGalleryThumbnail$1$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                function03 = (Function0) objAaT;
            }
            BRg bRgA04 = C0v5.A04(C11U.A03(BJe.A00(bRg2, 1.0f, false), c1d32), null, null, function0, true);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA04);
            Function0<InterfaceC1516AkQ> function04 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function04);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA01, iA0J);
            if (str2 != null) {
                bfm.AgE(-806656356);
                int i7 = iA0d >> 6;
                HatchSharedElementKt.HatchSharedElement(str2, c1d32, null, function03, null, null, B1V.A00(bfm, new MediaGalleryScreenKt$MediaGalleryThumbnail$2$1(mediaEntryUiModel, c7197Ei9, str2), -1638965540), bfm, ((iA0d >> 12) & 14) | 1572864 | (i7 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | (i7 & 7168), 52);
            } else {
                bfm.AgE(-806302584);
                MediaSectionKt.MediaThumbnailContent(mediaEntryUiModel, mediaEntryUiModel.galleryImageUri, null, c7197Ei9, null, bfm, (iA0d & 14) | ((iA0d >> 9) & 7168), 20);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(mediaEntryUiModel, function0, bRg2, c1d32, str2, function03, c7197Ei9, i, i2);
        }
    }

    public static final /* synthetic */ HatchLibraryViewModel.UiState access$MediaGalleryScreen$lambda$0(C1BO c1bo) {
        return (HatchLibraryViewModel.UiState) c1bo.getValue();
    }

    public static final AHD<ContentItem> buildContentItems(List<MediaEntryUiModel> list, int i) {
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        for (MediaEntryUiModel mediaEntryUiModel : list) {
            String str = mediaEntryUiModel.name;
            boolean z = mediaEntryUiModel.isVideo;
            ContentType contentType = z ? ContentType.Video.INSTANCE : ContentType.Image.INSTANCE;
            String str2 = mediaEntryUiModel.relativePath;
            long j = i;
            arrayListA0i.add(new ContentItem(str, contentType, str2, mediaEntryUiModel.imageUri, null, FGI.A0M("lobster_gallery_", str2), null, z ? (String) AbstractC0878AGe.A0G(mediaEntryUiModel.previewUris) : mediaEntryUiModel.galleryImageUri, new BL4(AnonymousClass002.A0G(j, j << 32)), false, null, null, null, null, null));
        }
        return AGI.A07(arrayListA0i);
    }
}
