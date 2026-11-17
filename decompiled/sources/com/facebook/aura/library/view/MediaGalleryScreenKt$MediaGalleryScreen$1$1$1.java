package com.facebook.aura.library.view;

import X.AHD;
import X.AbstractC1061ATk;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.BFM;
import X.C03X;
import X.C1BO;
import X.C1Cj;
import X.C1D3;
import X.C1V6;
import X.C1VA;
import X.C1VW;
import X.C7197Ei9;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.FGI;
import X.G0U;
import X.G2j;
import com.facebook.aura.file.view.api.ContentItem;
import com.facebook.aura.library.model.HatchLibraryViewModel;
import com.facebook.aura.library.model.MediaEntryUiModel;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.partners.voice.background.VoiceCallForegroundService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class MediaGalleryScreenKt$MediaGalleryScreen$1$1$1 extends AbstractC7559F3s implements G0U<C1Cj, Unit> {
    public final /* synthetic */ C1BO<AHD<ContentItem>> $contentItems;
    public final /* synthetic */ C1BO<AuraNavigator> $currentNavigator;
    public final /* synthetic */ AHD<MediaEntryUiModel> $entries;
    public final /* synthetic */ int $gridColumns;
    public final /* synthetic */ C1BO<Boolean> $isIdle$delegate;
    public final /* synthetic */ C7197Ei9 $thumbnailOptions;
    public final /* synthetic */ C1BO<HatchLibraryViewModel.UiState> $uiState$delegate;

    /* renamed from: com.facebook.aura.library.view.MediaGalleryScreenKt$MediaGalleryScreen$1$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<Integer, Object> {
        public final /* synthetic */ AHD<MediaEntryUiModel> $entries;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AHD<MediaEntryUiModel> ahd) {
            super(1);
            this.$entries = ahd;
        }

        public final Object invoke(int i) {
            return ((MediaEntryUiModel) this.$entries.get(i)).relativePath;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(AnonymousClass001.A0F(num));
        }
    }

    /* renamed from: com.facebook.aura.library.view.MediaGalleryScreenKt$MediaGalleryScreen$1$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<Integer, Object> {
        public final /* synthetic */ AHD<MediaEntryUiModel> $entries;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AHD<MediaEntryUiModel> ahd) {
            super(1);
            this.$entries = ahd;
        }

        public final Object invoke(int i) {
            return ((MediaEntryUiModel) this.$entries.get(i)).isVideo ? "video" : "image";
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(AnonymousClass001.A0F(num));
        }
    }

    /* renamed from: com.facebook.aura.library.view.MediaGalleryScreenKt$MediaGalleryScreen$1$1$1$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G2j<C03X, Integer, BFM, Integer, Unit> {
        public final /* synthetic */ C1BO<AHD<ContentItem>> $contentItems;
        public final /* synthetic */ C1BO<AuraNavigator> $currentNavigator;
        public final /* synthetic */ AHD<MediaEntryUiModel> $entries;
        public final /* synthetic */ int $gridColumns;
        public final /* synthetic */ C1BO<Boolean> $isIdle$delegate;
        public final /* synthetic */ C7197Ei9 $thumbnailOptions;

        public final void invoke(C03X c03x, int i, BFM bfm, int i2) {
            int iA0E = i2;
            if ((i2 & 48) == 0) {
                iA0E = i2 | AnonymousClass004.A0E(bfm, i);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA0E & 145, VoiceCallForegroundService.AVATAR_TARGET_PX), bfm, iA0E)) {
                bfm.Afo();
                return;
            }
            MediaEntryUiModel mediaEntryUiModel = (MediaEntryUiModel) this.$entries.get(i);
            C1D3 c1d3 = i == 0 ? MediaGalleryScreenKt.SHAPE_TOP_START : i == this.$gridColumns - 1 ? MediaGalleryScreenKt.SHAPE_TOP_END : MediaGalleryScreenKt.SHAPE_DEFAULT;
            boolean zA65 = bfm.A65(mediaEntryUiModel.relativePath);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = FGI.A0M("lobster_gallery_", mediaEntryUiModel.relativePath);
                bfm.Ai0(objAaT);
            }
            String str = (String) objAaT;
            boolean z = mediaEntryUiModel.isVideo;
            boolean zA66 = bfm.A66(z) | AnonymousClass001.A1O(iA0E);
            C1BO<AuraNavigator> c1bo = this.$currentNavigator;
            C1BO<AHD<ContentItem>> c1bo2 = this.$contentItems;
            Object objAaT2 = bfm.AaT();
            if (zA66 || objAaT2 == C78N.A00) {
                objAaT2 = new MediaGalleryScreenKt$MediaGalleryScreen$1$1$1$3$1$1(z, c1bo, c1bo2, i);
                bfm.Ai0(objAaT2);
            }
            Function0 function0 = (Function0) objAaT2;
            C1BO<Boolean> c1bo3 = this.$isIdle$delegate;
            Object objAaT3 = bfm.AaT();
            if (objAaT3 == C78N.A00) {
                objAaT3 = new MediaGalleryScreenKt$MediaGalleryScreen$1$1$1$3$2$1(c1bo3);
                bfm.Ai0(objAaT3);
            }
            MediaGalleryScreenKt.MediaGalleryThumbnail(mediaEntryUiModel, function0, null, c1d3, str, (Function0) objAaT3, this.$thumbnailOptions, bfm, 196608, 4);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(AHD<MediaEntryUiModel> ahd, int i, C7197Ei9 c7197Ei9, C1BO<? extends AuraNavigator> c1bo, C1BO<? extends AHD<ContentItem>> c1bo2, C1BO<Boolean> c1bo3) {
            super(4);
            this.$entries = ahd;
            this.$gridColumns = i;
            this.$thumbnailOptions = c7197Ei9;
            this.$currentNavigator = c1bo;
            this.$contentItems = c1bo2;
            this.$isIdle$delegate = c1bo3;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C03X c03x, Integer num, BFM bfm, Integer num2) {
            invoke(c03x, AnonymousClass001.A0F(num), bfm, AnonymousClass001.A0F(num2));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.library.view.MediaGalleryScreenKt$MediaGalleryScreen$1$1$1$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0U<C1V6, C1VW> {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        public AnonymousClass4() {
            super(1);
        }

        /* renamed from: invoke-BHJ-flc, reason: not valid java name */
        public final long m1185invokeBHJflc(C1V6 c1v6) {
            C7384Etj.A0Y(c1v6, 0);
            int i = C1VA.A00;
            if (i > 0) {
                return i;
            }
            AbstractC1061ATk.A00("The span value should be higher than 0");
            throw F60.createAndThrow();
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ C1VW invoke(C1V6 c1v6) {
            return new C1VW(m1185invokeBHJflc(c1v6));
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C1Cj c1Cj) {
        C7384Etj.A0Y(c1Cj, 0);
        int size = this.$entries.size();
        AHD<MediaEntryUiModel> ahd = this.$entries;
        c1Cj.APM(new AnonymousClass1(ahd), new AnonymousClass2(ahd), null, AnonymousClass001.A0M(new AnonymousClass3(ahd, this.$gridColumns, this.$thumbnailOptions, this.$currentNavigator, this.$contentItems, this.$isIdle$delegate), 276569580), size);
        if (this.$uiState$delegate.getValue().isLoadingMoreMedia) {
            c1Cj.APK("loading_more", null, AnonymousClass4.INSTANCE, ComposableSingletons$MediaGalleryScreenKt.f72lambda$2016733256);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MediaGalleryScreenKt$MediaGalleryScreen$1$1$1(AHD<MediaEntryUiModel> ahd, int i, C7197Ei9 c7197Ei9, C1BO<? extends AuraNavigator> c1bo, C1BO<? extends AHD<ContentItem>> c1bo2, C1BO<Boolean> c1bo3, C1BO<HatchLibraryViewModel.UiState> c1bo4) {
        super(1);
        this.$entries = ahd;
        this.$gridColumns = i;
        this.$thumbnailOptions = c7197Ei9;
        this.$currentNavigator = c1bo;
        this.$contentItems = c1bo2;
        this.$isIdle$delegate = c1bo3;
        this.$uiState$delegate = c1bo4;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C1Cj c1Cj) {
        invoke2(c1Cj);
        return Unit.INSTANCE;
    }
}
