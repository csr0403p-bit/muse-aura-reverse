package com.facebook.aura.library.view;

import X.AHD;
import X.AbstractC0878AGe;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass037;
import X.B1V;
import X.BFM;
import X.C0CD;
import X.C0t8;
import X.C7197Ei9;
import X.C7384Etj;
import X.FGI;
import X.G0U;
import X.G0W;
import X.G2j;
import com.facebook.aura.R;
import com.facebook.aura.file.view.api.ContentItem;
import com.facebook.aura.library.model.ArtifactFile;
import com.facebook.aura.library.model.HatchLibraryViewModel;
import com.facebook.aura.library.model.MediaEntryUiModel;
import com.facebook.aura.library.repo.LoadingState;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchLibraryTabScreenKt$LibraryTabContent$2$1 extends AbstractC7559F3s implements G0U<C0CD, Unit> {
    public final /* synthetic */ AHD<ContentItem> $contentItems;
    public final /* synthetic */ int $gridColumns;
    public final /* synthetic */ float $gutterWidth;
    public final /* synthetic */ HatchLibraryViewModel.UiState $libraryUiState;
    public final /* synthetic */ int $mediaColumns;
    public final /* synthetic */ G0U<ArtifactFile, Unit> $onArtifactClick;
    public final /* synthetic */ Function0<Unit> $onArtifactDeleted;
    public final /* synthetic */ Function0<Unit> $onRetry;
    public final /* synthetic */ G0U<ArtifactFile, Unit> $onTogglePin;
    public final /* synthetic */ int $selectedTab;
    public final /* synthetic */ C7197Ei9 $thumbnailOptions;
    public final /* synthetic */ LibraryViewMode $viewMode;

    /* renamed from: com.facebook.aura.library.view.HatchLibraryTabScreenKt$LibraryTabContent$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ float $gutterWidth;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(float f) {
            super(3);
            this.$gutterWidth = f;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                HatchLibraryTabScreenKt.m1172ArtifactSectionHeaderuFdPcIQ(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120c76), this.$gutterWidth, null, bfm, 0, 4);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.library.view.HatchLibraryTabScreenKt$LibraryTabContent$2$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ float $gutterWidth;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(float f) {
            super(3);
            this.$gutterWidth = f;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                HatchLibraryTabScreenKt.m1172ArtifactSectionHeaderuFdPcIQ(AbstractC2271BQs.A01(bfm, R.string.library_section_recent), this.$gutterWidth, null, bfm, 0, 4);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.library.view.HatchLibraryTabScreenKt$LibraryTabContent$2$1$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G2j<AnonymousClass037, Integer, BFM, Integer, Unit> {
        public final /* synthetic */ AHD<ContentItem> $contentItems;
        public final /* synthetic */ int $mediaColumns;
        public final /* synthetic */ AHD<MediaEntryUiModel> $mediaEntries;
        public final /* synthetic */ List<List<MediaEntryUiModel>> $rows;
        public final /* synthetic */ C7197Ei9 $thumbnailOptions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(List<? extends List<MediaEntryUiModel>> list, int i, AHD<MediaEntryUiModel> ahd, AHD<ContentItem> ahd2, C7197Ei9 c7197Ei9) {
            super(4);
            this.$rows = list;
            this.$mediaColumns = i;
            this.$mediaEntries = ahd;
            this.$contentItems = ahd2;
            this.$thumbnailOptions = c7197Ei9;
        }

        /* JADX WARN: Removed duplicated region for block: B:52:0x01f4  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x01f7  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x01ff A[PHI: r14
  0x01ff: PHI (r14v2 float) = (r14v1 float), (r14v4 float) binds: [B:55:0x01fb, B:26:0x00f7] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void invoke(X.AnonymousClass037 r38, int r39, X.BFM r40, int r41) {
            /*
                Method dump skipped, instructions count: 572
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.view.HatchLibraryTabScreenKt$LibraryTabContent$2$1.AnonymousClass4.invoke(X.037, int, X.BFM, int):void");
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, Integer num, BFM bfm, Integer num2) {
            invoke(anonymousClass037, AnonymousClass001.A0F(num), bfm, AnonymousClass001.A0F(num2));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C0CD c0cd) {
        LoadingState loadingState;
        int i;
        int i2;
        float f;
        String str;
        String str2;
        int i3;
        Function0<Unit> function0;
        float f2;
        String str3;
        String str4;
        C7384Etj.A0Y(c0cd, 0);
        int i4 = this.$selectedTab;
        if (i4 != 0) {
            if (i4 == 1) {
                HatchLibraryViewModel.UiState uiState = this.$libraryUiState;
                AHD<MediaEntryUiModel> ahd = uiState.mediaEntries;
                loadingState = uiState.loadingState;
                if (ahd.isEmpty() && this.$libraryUiState.mediaLoadFailed) {
                    i3 = R.string._name_removed__res_0x7f120c68;
                    function0 = this.$onRetry;
                    f2 = this.$gutterWidth;
                    str3 = "hatch-library-media-error-state";
                    str4 = "media_error";
                    HatchLibraryTabScreenKt.m1181libraryErrorStateItemZ4HSEVQ(c0cd, str4, i3, function0, f2, str3);
                    return;
                }
                if (ahd.isEmpty()) {
                    i = R.string._name_removed__res_0x7f120c67;
                    i2 = R.string._name_removed__res_0x7f120c66;
                    f = this.$gutterWidth;
                    str = "hatch-library-media-empty-state";
                    str2 = "media_empty";
                    HatchLibraryTabScreenKt.m1180libraryEmptyStateItem6AXeQGM(c0cd, str2, loadingState, i, i2, f, str);
                    return;
                }
                ArrayList arrayListA0N = AbstractC0878AGe.A0N(ahd, this.$mediaColumns);
                int size = arrayListA0N.size();
                c0cd.APL(AnonymousClass3.INSTANCE, C0t8.A00, B1V.A01(new AnonymousClass4(arrayListA0N, this.$mediaColumns, ahd, this.$contentItems, this.$thumbnailOptions), 1159119087, true), size);
                if (this.$libraryUiState.isLoadingMoreMedia) {
                    c0cd.APJ("media_loading_more", null, ComposableSingletons$HatchLibraryTabScreenKt.lambda$708872193);
                    return;
                }
                return;
            }
            return;
        }
        HatchLibraryViewModel.UiState uiState2 = this.$libraryUiState;
        AHD<ArtifactFile> ahd2 = uiState2.artifacts;
        loadingState = uiState2.loadingState;
        if (ahd2.isEmpty() && this.$libraryUiState.artifactsLoadFailed) {
            i3 = R.string._name_removed__res_0x7f120c5d;
            function0 = this.$onRetry;
            f2 = this.$gutterWidth;
            str3 = "hatch-library-files-error-state";
            str4 = "things_error";
            HatchLibraryTabScreenKt.m1181libraryErrorStateItemZ4HSEVQ(c0cd, str4, i3, function0, f2, str3);
            return;
        }
        if (ahd2.isEmpty()) {
            i = R.string._name_removed__res_0x7f120a84;
            i2 = R.string._name_removed__res_0x7f120a83;
            f = this.$gutterWidth;
            str = "hatch-library-files-empty-state";
            str2 = "things_empty";
            HatchLibraryTabScreenKt.m1180libraryEmptyStateItem6AXeQGM(c0cd, str2, loadingState, i, i2, f, str);
            return;
        }
        boolean z = this.$libraryUiState.showPinnedSections;
        if (!z) {
            HatchLibraryTabScreenKt.m1179artifactItemsPfoAEA0(c0cd, ahd2, this.$viewMode, this.$gridColumns, "things", this.$gutterWidth, z, this.$onArtifactClick, this.$onArtifactDeleted, this.$onTogglePin);
            if (this.$libraryUiState.isLoadingMoreArtifacts) {
                c0cd.APJ("things_loading_more", null, ComposableSingletons$HatchLibraryTabScreenKt.lambda$964154520);
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : ahd2) {
            if (((ArtifactFile) obj).isPinned) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : ahd2) {
            if (!((ArtifactFile) obj2).isPinned) {
                arrayList2.add(obj2);
            }
        }
        if (!arrayList.isEmpty()) {
            if (this.$viewMode == LibraryViewMode.GRID) {
                c0cd.APJ("pinned_header", null, B1V.A01(new AnonymousClass1(this.$gutterWidth), -1611760270, true));
            }
            HatchLibraryTabScreenKt.m1179artifactItemsPfoAEA0(c0cd, arrayList, this.$viewMode, this.$gridColumns, "pinned", this.$gutterWidth, true, this.$onArtifactClick, this.$onArtifactDeleted, this.$onTogglePin);
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        if (this.$viewMode == LibraryViewMode.GRID) {
            c0cd.APJ("recent_header", null, B1V.A01(new AnonymousClass2(this.$gutterWidth), -116081047, true));
        }
        HatchLibraryTabScreenKt.m1179artifactItemsPfoAEA0(c0cd, arrayList2, this.$viewMode, this.$gridColumns, "recent", this.$gutterWidth, true, this.$onArtifactClick, this.$onArtifactDeleted, this.$onTogglePin);
    }

    /* renamed from: com.facebook.aura.library.view.HatchLibraryTabScreenKt$LibraryTabContent$2$1$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0U<Integer, Object> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return FGI.A0H("media_row_", AnonymousClass001.A0F(num));
        }

        public final Object invoke(int i) {
            return FGI.A0H("media_row_", i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchLibraryTabScreenKt$LibraryTabContent$2$1(int i, HatchLibraryViewModel.UiState uiState, Function0<Unit> function0, float f, LibraryViewMode libraryViewMode, int i2, G0U<? super ArtifactFile, Unit> g0u, Function0<Unit> function02, G0U<? super ArtifactFile, Unit> g0u2, int i3, AHD<ContentItem> ahd, C7197Ei9 c7197Ei9) {
        super(1);
        this.$selectedTab = i;
        this.$libraryUiState = uiState;
        this.$onRetry = function0;
        this.$gutterWidth = f;
        this.$viewMode = libraryViewMode;
        this.$gridColumns = i2;
        this.$onArtifactClick = g0u;
        this.$onArtifactDeleted = function02;
        this.$onTogglePin = g0u2;
        this.$mediaColumns = i3;
        this.$contentItems = ahd;
        this.$thumbnailOptions = c7197Ei9;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C0CD c0cd) {
        invoke2(c0cd);
        return Unit.INSTANCE;
    }
}
