package com.facebook.aura.library.view;

import X.AHD;
import X.AHH;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0U;
import X.G0V;
import com.facebook.aura.library.repo.ArtifactSortMode;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class LibraryOverflowMenuKt {
    public static final float MENU_BELOW_HEADER_GAP = 8.0f;
    public static final int MENU_ID_DIVIDER = -1;
    public static final int MENU_ID_SHOW_AS_GRID = 1;
    public static final int MENU_ID_SHOW_AS_LIST = 2;
    public static final int MENU_ID_SORT_DATE = 4;
    public static final int MENU_ID_SORT_LAST_MODIFIED = 7;
    public static final int MENU_ID_SORT_NAME = 5;
    public static final int MENU_ID_SYSTEM_FILES = 6;

    /* renamed from: com.facebook.aura.library.view.LibraryOverflowMenuKt$LibraryOverflowMenu$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, AHD<? extends AuraContextMenuItem>> {
        public final /* synthetic */ AHH<AuraContextMenuItem> $menuItems;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AHH<AuraContextMenuItem> ahh) {
            super(2);
            this.$menuItems = ahh;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ AHD<? extends AuraContextMenuItem> invoke(BFM bfm, Integer num) {
            return invoke(bfm, AnonymousClass001.A0F(num));
        }

        public final AHD<AuraContextMenuItem> invoke(BFM bfm, int i) {
            bfm.AgE(-1839777789);
            AHH<AuraContextMenuItem> ahh = this.$menuItems;
            AnonymousClass002.A19(bfm);
            return ahh;
        }
    }

    /* renamed from: com.facebook.aura.library.view.LibraryOverflowMenuKt$LibraryOverflowMenu$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $expanded;
        public final /* synthetic */ boolean $isArtifactsTab;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ Function0<Unit> $onDismissRequest;
        public final /* synthetic */ G0U<ArtifactSortMode, Unit> $onSelectSort;
        public final /* synthetic */ G0U<LibraryViewMode, Unit> $onSetViewMode;
        public final /* synthetic */ Function0<Unit> $onSystemFiles;
        public final /* synthetic */ boolean $sortEnabled;
        public final /* synthetic */ ArtifactSortMode $sortMode;
        public final /* synthetic */ LibraryViewMode $viewMode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(boolean z, boolean z2, boolean z3, LibraryViewMode libraryViewMode, ArtifactSortMode artifactSortMode, Function0<Unit> function0, Function0<Unit> function02, G0U<? super LibraryViewMode, Unit> g0u, G0U<? super ArtifactSortMode, Unit> g0u2, Function0<Unit> function03, BRg bRg, int i, int i2, int i3) {
            super(2);
            this.$expanded = z;
            this.$isArtifactsTab = z2;
            this.$sortEnabled = z3;
            this.$viewMode = libraryViewMode;
            this.$sortMode = artifactSortMode;
            this.$onDismiss = function0;
            this.$onDismissRequest = function02;
            this.$onSetViewMode = g0u;
            this.$onSelectSort = g0u2;
            this.$onSystemFiles = function03;
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
            LibraryOverflowMenuKt.LibraryOverflowMenu(this.$expanded, this.$isArtifactsTab, this.$sortEnabled, this.$viewMode, this.$sortMode, this.$onDismiss, this.$onDismissRequest, this.$onSetViewMode, this.$onSelectSort, this.$onSystemFiles, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LibraryOverflowMenu(boolean r99, boolean r100, boolean r101, com.facebook.aura.library.view.LibraryViewMode r102, com.facebook.aura.library.repo.ArtifactSortMode r103, kotlin.jvm.functions.Function0<kotlin.Unit> r104, kotlin.jvm.functions.Function0<kotlin.Unit> r105, X.G0U<? super com.facebook.aura.library.view.LibraryViewMode, kotlin.Unit> r106, X.G0U<? super com.facebook.aura.library.repo.ArtifactSortMode, kotlin.Unit> r107, kotlin.jvm.functions.Function0<kotlin.Unit> r108, X.BRg r109, X.BFM r110, int r111, int r112, int r113) {
        /*
            Method dump skipped, instructions count: 837
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.view.LibraryOverflowMenuKt.LibraryOverflowMenu(boolean, boolean, boolean, com.facebook.aura.library.view.LibraryViewMode, com.facebook.aura.library.repo.ArtifactSortMode, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.G0U, X.G0U, kotlin.jvm.functions.Function0, X.BRg, X.BFM, int, int, int):void");
    }
}
