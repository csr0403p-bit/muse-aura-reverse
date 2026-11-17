package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.B1V;
import X.B6A;
import X.BFM;
import X.BRg;
import X.C0fG;
import X.C1DG;
import X.C3U4;
import X.C78N;
import X.G0U;
import X.G0V;
import X.G2j;
import X.InterfaceC0962AJp;
import android.view.View;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchFileTypeKt;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.library.repo.UnifiedArtifact;
import com.facebook.aura.library.repo.WorkspaceEntry;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.button.AuraElevatedButtonKt;
import com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class FileViewerScreenKt {

    /* renamed from: com.facebook.aura.file.view.FileViewerScreenKt$FileViewerScreen$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ boolean $canDelete;
        public final /* synthetic */ C0fG $clipboardManager;
        public final /* synthetic */ String $copiedMessage;
        public final /* synthetic */ MutableState<String> $currentContent$delegate;
        public final /* synthetic */ WorkspaceEntry $entry;
        public final /* synthetic */ String $fileName;
        public final /* synthetic */ boolean $hasChanges;
        public final /* synthetic */ String $imageUri;
        public final /* synthetic */ boolean $isContentUri;
        public final /* synthetic */ MutableState<Boolean> $isEditing$delegate;
        public final /* synthetic */ boolean $isSlides;
        public final /* synthetic */ boolean $isTextCopyable;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ Function0<Unit> $onTogglePin;
        public final /* synthetic */ MutableState<String> $originalContent$delegate;
        public final /* synthetic */ PagerState $pagerState;
        public final /* synthetic */ MutableState<UnifiedArtifact> $pinnableArtifact$delegate;
        public final /* synthetic */ String $relativePath;
        public final /* synthetic */ MutableState<Boolean> $showContextMenu$delegate;
        public final /* synthetic */ MutableState<Boolean> $showReviewSheet$delegate;
        public final /* synthetic */ MutableState<SlideState> $slideState$delegate;
        public final /* synthetic */ boolean $supportsEditing;
        public final /* synthetic */ View $view;

        /* renamed from: com.facebook.aura.file.view.FileViewerScreenKt$FileViewerScreen$4$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
            public final /* synthetic */ boolean $canDelete;
            public final /* synthetic */ C0fG $clipboardManager;
            public final /* synthetic */ String $copiedMessage;
            public final /* synthetic */ MutableState<String> $currentContent$delegate;
            public final /* synthetic */ WorkspaceEntry $entry;
            public final /* synthetic */ String $fileName;
            public final /* synthetic */ boolean $hasChanges;
            public final /* synthetic */ String $imageUri;
            public final /* synthetic */ boolean $isContentUri;
            public final /* synthetic */ MutableState<Boolean> $isEditing$delegate;
            public final /* synthetic */ boolean $isSlides;
            public final /* synthetic */ boolean $isTextCopyable;
            public final /* synthetic */ Function0<Unit> $onBack;
            public final /* synthetic */ Function0<Unit> $onTogglePin;
            public final /* synthetic */ MutableState<String> $originalContent$delegate;
            public final /* synthetic */ PagerState $pagerState;
            public final /* synthetic */ MutableState<UnifiedArtifact> $pinnableArtifact$delegate;
            public final /* synthetic */ String $relativePath;
            public final /* synthetic */ MutableState<Boolean> $showContextMenu$delegate;
            public final /* synthetic */ MutableState<Boolean> $showReviewSheet$delegate;
            public final /* synthetic */ MutableState<SlideState> $slideState$delegate;
            public final /* synthetic */ boolean $supportsEditing;
            public final /* synthetic */ View $view;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(boolean z, WorkspaceEntry workspaceEntry, boolean z2, boolean z3, PagerState pagerState, boolean z4, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, MutableState<SlideState> mutableState3, MutableState<String> mutableState4, MutableState<String> mutableState5, boolean z5, C0fG c0fG, View view, String str, String str2, String str3, String str4, Function0<Unit> function0, Function0<Unit> function02, boolean z6, MutableState<Boolean> mutableState6, MutableState<UnifiedArtifact> mutableState7) {
                super(2);
                this.$supportsEditing = z;
                this.$entry = workspaceEntry;
                this.$hasChanges = z2;
                this.$isSlides = z3;
                this.$pagerState = pagerState;
                this.$isContentUri = z4;
                this.$isEditing$delegate = mutableState;
                this.$showReviewSheet$delegate = mutableState2;
                this.$slideState$delegate = mutableState3;
                this.$originalContent$delegate = mutableState4;
                this.$currentContent$delegate = mutableState5;
                this.$isTextCopyable = z5;
                this.$clipboardManager = c0fG;
                this.$view = view;
                this.$copiedMessage = str;
                this.$relativePath = str2;
                this.$fileName = str3;
                this.$imageUri = str4;
                this.$onBack = function0;
                this.$onTogglePin = function02;
                this.$canDelete = z6;
                this.$showContextMenu$delegate = mutableState6;
                this.$pinnableArtifact$delegate = mutableState7;
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                invoke(bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }

            /* JADX WARN: Removed duplicated region for block: B:56:0x0202  */
            /* JADX WARN: Removed duplicated region for block: B:64:0x023b  */
            /* JADX WARN: Removed duplicated region for block: B:66:0x0264  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void invoke(X.BFM r42, int r43) {
                /*
                    Method dump skipped, instructions count: 640
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.view.FileViewerScreenKt.AnonymousClass4.AnonymousClass1.invoke(X.BFM, int):void");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(boolean z, boolean z2, WorkspaceEntry workspaceEntry, boolean z3, boolean z4, PagerState pagerState, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, MutableState<SlideState> mutableState3, MutableState<String> mutableState4, MutableState<String> mutableState5, boolean z5, C0fG c0fG, View view, String str, String str2, String str3, String str4, Function0<Unit> function0, Function0<Unit> function02, boolean z6, MutableState<Boolean> mutableState6, MutableState<UnifiedArtifact> mutableState7) {
            super(2);
            this.$supportsEditing = z;
            this.$isContentUri = z2;
            this.$entry = workspaceEntry;
            this.$hasChanges = z3;
            this.$isSlides = z4;
            this.$pagerState = pagerState;
            this.$isEditing$delegate = mutableState;
            this.$showReviewSheet$delegate = mutableState2;
            this.$slideState$delegate = mutableState3;
            this.$originalContent$delegate = mutableState4;
            this.$currentContent$delegate = mutableState5;
            this.$isTextCopyable = z5;
            this.$clipboardManager = c0fG;
            this.$view = view;
            this.$copiedMessage = str;
            this.$relativePath = str2;
            this.$fileName = str3;
            this.$imageUri = str4;
            this.$onBack = function0;
            this.$onTogglePin = function02;
            this.$canDelete = z6;
            this.$showContextMenu$delegate = mutableState6;
            this.$pinnableArtifact$delegate = mutableState7;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                if (!this.$supportsEditing && this.$isContentUri) {
                    bfm.AgE(718877773);
                } else {
                    bfm.AgE(713691907);
                    boolean z = this.$supportsEditing;
                    float f = 2.0f;
                    if (z) {
                        f = 8.0f;
                    }
                    AuraElevatedButtonKt.m2420AuraPillButtonq88KkHs(null, null, false, 2.0f, f, 0.0f, false, B1V.A00(bfm, new AnonymousClass1(z, this.$entry, this.$hasChanges, this.$isSlides, this.$pagerState, this.$isContentUri, this.$isEditing$delegate, this.$showReviewSheet$delegate, this.$slideState$delegate, this.$originalContent$delegate, this.$currentContent$delegate, this.$isTextCopyable, this.$clipboardManager, this.$view, this.$copiedMessage, this.$relativePath, this.$fileName, this.$imageUri, this.$onBack, this.$onTogglePin, this.$canDelete, this.$showContextMenu$delegate, this.$pinnableArtifact$delegate), 945649042), bfm, 12586374, 98);
                }
                AnonymousClass002.A19(bfm);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.file.view.FileViewerScreenKt$FileViewerScreen$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ MutableState<String> $currentContent$delegate;
        public final /* synthetic */ WorkspaceEntry $entry;
        public final /* synthetic */ MutableState<B6A> $htmlTopColor$delegate;
        public final /* synthetic */ String $imageUri;
        public final /* synthetic */ MutableState<Boolean> $isEditing$delegate;
        public final /* synthetic */ MutableState<FileLoadingState> $loadingState$delegate;
        public final /* synthetic */ PagerState $pagerState;
        public final /* synthetic */ MutableState<SlideState> $slideState$delegate;
        public final /* synthetic */ boolean $supportsMarkdownPreview;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(WorkspaceEntry workspaceEntry, boolean z, String str, PagerState pagerState, MutableState<B6A> mutableState, MutableState<FileLoadingState> mutableState2, MutableState<String> mutableState3, MutableState<Boolean> mutableState4, MutableState<SlideState> mutableState5) {
            super(4);
            this.$entry = workspaceEntry;
            this.$supportsMarkdownPreview = z;
            this.$imageUri = str;
            this.$pagerState = pagerState;
            this.$htmlTopColor$delegate = mutableState;
            this.$loadingState$delegate = mutableState2;
            this.$currentContent$delegate = mutableState3;
            this.$isEditing$delegate = mutableState4;
            this.$slideState$delegate = mutableState5;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m898invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m898invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            int iA04 = (i & 6) == 0 ? i | AnonymousClass004.A04(bfm, f) : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            if (!AnonymousClass001.A1b(AnonymousClass004.A1J(iA04), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            WorkspaceEntry workspaceEntry = this.$entry;
            FileLoadingState value = this.$loadingState$delegate.getValue();
            String strA05 = MutableState.A05(this.$currentContent$delegate);
            boolean zA0A = MutableState.A0A((MutableState) this.$isEditing$delegate);
            boolean z = this.$supportsMarkdownPreview;
            MutableState<String> mutableState = this.$currentContent$delegate;
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = new FileViewerScreenKt$FileViewerScreen$5$1$1(mutableState);
                bfm.Ai0(objAaT);
            }
            G0U g0u = (G0U) objAaT;
            String str = this.$imageUri;
            InterfaceC0962AJp<Integer, String> interfaceC0962AJp = this.$slideState$delegate.getValue().htmlCache;
            PagerState pagerState = this.$pagerState;
            boolean z2 = this.$slideState$delegate.getValue().isLoading;
            boolean zA65 = bfm.A65(this.$htmlTopColor$delegate);
            MutableState<B6A> mutableState2 = this.$htmlTopColor$delegate;
            Object objAaT2 = bfm.AaT();
            if (zA65 || objAaT2 == obj) {
                objAaT2 = new FileViewerScreenKt$FileViewerScreen$5$2$1(mutableState2);
                bfm.Ai0(objAaT2);
            }
            FileViewerContentKt.m892FileViewerContentKp3ePZc(workspaceEntry, value, strA05, zA0A, z, g0u, str, interfaceC0962AJp, pagerState, z2, (G0U) objAaT2, f2, AnonymousClass001.A0T(C3U4.A04(BRg.A00, f)), bfm, (FileLoadingState.$stable << 3) | 196608, iA04 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 0);
        }
    }

    /* renamed from: com.facebook.aura.file.view.FileViewerScreenKt$FileViewerScreen$8, reason: invalid class name */
    public final class AnonymousClass8 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $canDelete;
        public final /* synthetic */ boolean $canEdit;
        public final /* synthetic */ boolean $canPin;
        public final /* synthetic */ String $filename;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ String $relativePath;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(String str, Function0<Unit> function0, BRg bRg, String str2, boolean z, boolean z2, boolean z3, int i, int i2) {
            super(2);
            this.$relativePath = str;
            this.$onBack = function0;
            this.$modifier = bRg;
            this.$filename = str2;
            this.$canDelete = z;
            this.$canEdit = z2;
            this.$canPin = z3;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            FileViewerScreenKt.FileViewerScreen(this.$relativePath, this.$onBack, this.$modifier, this.$filename, this.$canDelete, this.$canEdit, this.$canPin, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AuraThemeMode.values().length];
            try {
                AnonymousClass002.A13(AuraThemeMode.DARK, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(AuraThemeMode.LIGHT, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0611  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0615  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0626  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0629  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0636  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x019c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void FileViewerScreen(java.lang.String r103, kotlin.jvm.functions.Function0<kotlin.Unit> r104, X.BRg r105, java.lang.String r106, boolean r107, boolean r108, boolean r109, X.BFM r110, int r111, int r112) {
        /*
            Method dump skipped, instructions count: 1669
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.view.FileViewerScreenKt.FileViewerScreen(java.lang.String, kotlin.jvm.functions.Function0, X.BRg, java.lang.String, boolean, boolean, boolean, X.BFM, int, int):void");
    }

    public static final void logFileEditorClick(HatchComponent hatchComponent, String str, HatchSubsurface hatchSubsurface) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.LIBRARY, hatchSubsurface, HatchScreen.FILE_EDITOR, hatchComponent, null, HatchFileTypeKt.hatchFileTypeMetadata(str), null);
    }

    public static /* synthetic */ void logFileEditorClick$default(HatchComponent hatchComponent, String str, HatchSubsurface hatchSubsurface, int i, Object obj) {
        if ((i & 4) != 0) {
            hatchSubsurface = null;
        }
        logFileEditorClick(hatchComponent, str, hatchSubsurface);
    }

    public static final /* synthetic */ FileLoadingState access$FileViewerScreen$lambda$2(MutableState mutableState) {
        return (FileLoadingState) mutableState.getValue();
    }

    public static final /* synthetic */ UnifiedArtifact access$FileViewerScreen$lambda$25(MutableState mutableState) {
        return (UnifiedArtifact) mutableState.getValue();
    }

    public static final /* synthetic */ SlideState access$FileViewerScreen$lambda$30(MutableState mutableState) {
        return (SlideState) mutableState.getValue();
    }
}
