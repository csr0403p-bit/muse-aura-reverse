package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.C1BO;
import X.C3O5;
import X.C78N;
import X.C78e;
import X.G0U;
import X.G0V;
import android.view.View;
import com.facebook.aura.file.view.ContentViewerViewModel;
import com.facebook.aura.file.view.api.ContentItem;
import com.facebook.aura.file.view.api.ContentType;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.key.ContentViewerBottomActions;
import com.facebook.aura.webview.diagnostics.HatchHtmlDiagnostics;
import com.facebook.aura.webview.diagnostics.HatchHtmlErrorCode;
import com.facebook.aura.webview.diagnostics.HatchHtmlSurface;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class ContentViewerScreenKt {
    public static final String CONTENT_VIEWER_DELETE_SOURCE = "content_viewer";
    public static final String UNKNOWN_DELETE_PATH = "unknown";

    /* renamed from: com.facebook.aura.file.view.ContentViewerScreenKt$ContentViewerContent$12, reason: invalid class name */
    public final class AnonymousClass12 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ ContentViewerBottomActions $bottomActions;
        public final /* synthetic */ boolean $forceDarkMode;
        public final /* synthetic */ boolean $fullscreenSingleVideo;
        public final /* synthetic */ boolean $interactiveDismissEnabled;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ Function0<Unit> $onSendToConversation;
        public final /* synthetic */ AuraNavKey $screenKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass12(AuraNavKey auraNavKey, Function0<Unit> function0, Function0<Unit> function02, boolean z, boolean z2, boolean z3, ContentViewerBottomActions contentViewerBottomActions, int i) {
            super(2);
            this.$screenKey = auraNavKey;
            this.$onBack = function0;
            this.$onSendToConversation = function02;
            this.$forceDarkMode = z;
            this.$interactiveDismissEnabled = z2;
            this.$fullscreenSingleVideo = z3;
            this.$bottomActions = contentViewerBottomActions;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ContentViewerScreenKt.ContentViewerContent(this.$screenKey, this.$onBack, this.$onSendToConversation, this.$forceDarkMode, this.$interactiveDismissEnabled, this.$fullscreenSingleVideo, this.$bottomActions, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.file.view.ContentViewerScreenKt$ContentViewerContent$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ ContentViewerBottomActions $bottomActions;
        public final /* synthetic */ boolean $forceDarkMode;
        public final /* synthetic */ boolean $fullscreenSingleVideo;
        public final /* synthetic */ boolean $interactiveDismissEnabled;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ Function0<Unit> $onSendToConversation;
        public final /* synthetic */ AuraNavKey $screenKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(AuraNavKey auraNavKey, Function0<Unit> function0, Function0<Unit> function02, boolean z, boolean z2, boolean z3, ContentViewerBottomActions contentViewerBottomActions, int i) {
            super(2);
            this.$screenKey = auraNavKey;
            this.$onBack = function0;
            this.$onSendToConversation = function02;
            this.$forceDarkMode = z;
            this.$interactiveDismissEnabled = z2;
            this.$fullscreenSingleVideo = z3;
            this.$bottomActions = contentViewerBottomActions;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ContentViewerScreenKt.ContentViewerContent(this.$screenKey, this.$onBack, this.$onSendToConversation, this.$forceDarkMode, this.$interactiveDismissEnabled, this.$fullscreenSingleVideo, this.$bottomActions, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.file.view.ContentViewerScreenKt$ContentViewerContent$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ ContentItem $firstItem;
        public final /* synthetic */ String $relativePath;
        public final /* synthetic */ Function0<Unit> $requestBack;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(String str, Function0<Unit> function0, ContentItem contentItem) {
            super(2);
            this.$relativePath = str;
            this.$requestBack = function0;
            this.$firstItem = contentItem;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                String str = this.$relativePath;
                Function0<Unit> function0 = this.$requestBack;
                ContentItem contentItem = this.$firstItem;
                String str2 = contentItem.name;
                boolean z = !contentItem.isBriefing;
                FileViewerScreenKt.FileViewerScreen(str, function0, null, str2, z, z, false, bfm, 0, 68);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.file.view.ContentViewerScreenKt$ContentViewerContent$8, reason: invalid class name */
    public final class AnonymousClass8 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ ContentViewerBottomActions $bottomActions;
        public final /* synthetic */ boolean $forceDarkMode;
        public final /* synthetic */ boolean $fullscreenSingleVideo;
        public final /* synthetic */ boolean $interactiveDismissEnabled;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ Function0<Unit> $onSendToConversation;
        public final /* synthetic */ AuraNavKey $screenKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(AuraNavKey auraNavKey, Function0<Unit> function0, Function0<Unit> function02, boolean z, boolean z2, boolean z3, ContentViewerBottomActions contentViewerBottomActions, int i) {
            super(2);
            this.$screenKey = auraNavKey;
            this.$onBack = function0;
            this.$onSendToConversation = function02;
            this.$forceDarkMode = z;
            this.$interactiveDismissEnabled = z2;
            this.$fullscreenSingleVideo = z3;
            this.$bottomActions = contentViewerBottomActions;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ContentViewerScreenKt.ContentViewerContent(this.$screenKey, this.$onBack, this.$onSendToConversation, this.$forceDarkMode, this.$interactiveDismissEnabled, this.$fullscreenSingleVideo, this.$bottomActions, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.file.view.ContentViewerScreenKt$ContentViewerScreen$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ContentViewerBottomActions $bottomActions;
        public final /* synthetic */ boolean $forceDarkMode;
        public final /* synthetic */ boolean $fullscreenSingleVideo;
        public final /* synthetic */ boolean $interactiveDismissEnabled;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ Function0<Unit> $onSendToConversation;
        public final /* synthetic */ AuraNavKey $screenKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AuraNavKey auraNavKey, Function0<Unit> function0, Function0<Unit> function02, boolean z, boolean z2, boolean z3, ContentViewerBottomActions contentViewerBottomActions, int i, int i2) {
            super(2);
            this.$screenKey = auraNavKey;
            this.$onBack = function0;
            this.$onSendToConversation = function02;
            this.$forceDarkMode = z;
            this.$interactiveDismissEnabled = z2;
            this.$fullscreenSingleVideo = z3;
            this.$bottomActions = contentViewerBottomActions;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ContentViewerScreenKt.ContentViewerScreen(this.$screenKey, this.$onBack, this.$onSendToConversation, this.$forceDarkMode, this.$interactiveDismissEnabled, this.$fullscreenSingleVideo, this.$bottomActions, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.file.view.ContentViewerScreenKt$ContentViewerScreen$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ ContentViewerBottomActions $bottomActions;
        public final /* synthetic */ boolean $fullscreenSingleVideo;
        public final /* synthetic */ boolean $interactiveDismissEnabled;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ Function0<Unit> $onSendToConversation;
        public final /* synthetic */ AuraNavKey $screenKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AuraNavKey auraNavKey, Function0<Unit> function0, Function0<Unit> function02, boolean z, boolean z2, ContentViewerBottomActions contentViewerBottomActions) {
            super(2);
            this.$screenKey = auraNavKey;
            this.$onBack = function0;
            this.$onSendToConversation = function02;
            this.$interactiveDismissEnabled = z;
            this.$fullscreenSingleVideo = z2;
            this.$bottomActions = contentViewerBottomActions;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                ContentViewerScreenKt.ContentViewerContent(this.$screenKey, this.$onBack, this.$onSendToConversation, true, this.$interactiveDismissEnabled, this.$fullscreenSingleVideo, this.$bottomActions, bfm, 3072);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.file.view.ContentViewerScreenKt$ContentViewerScreen$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ContentViewerBottomActions $bottomActions;
        public final /* synthetic */ boolean $forceDarkMode;
        public final /* synthetic */ boolean $fullscreenSingleVideo;
        public final /* synthetic */ boolean $interactiveDismissEnabled;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ Function0<Unit> $onSendToConversation;
        public final /* synthetic */ AuraNavKey $screenKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(AuraNavKey auraNavKey, Function0<Unit> function0, Function0<Unit> function02, boolean z, boolean z2, boolean z3, ContentViewerBottomActions contentViewerBottomActions, int i, int i2) {
            super(2);
            this.$screenKey = auraNavKey;
            this.$onBack = function0;
            this.$onSendToConversation = function02;
            this.$forceDarkMode = z;
            this.$interactiveDismissEnabled = z2;
            this.$fullscreenSingleVideo = z3;
            this.$bottomActions = contentViewerBottomActions;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ContentViewerScreenKt.ContentViewerScreen(this.$screenKey, this.$onBack, this.$onSendToConversation, this.$forceDarkMode, this.$interactiveDismissEnabled, this.$fullscreenSingleVideo, this.$bottomActions, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.file.view.ContentViewerScreenKt$DarkSystemBarsEffect$2, reason: invalid class name and case insensitive filesystem */
    public final class C119342 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $enabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C119342(boolean z, int i, int i2) {
            super(2);
            this.$enabled = z;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ContentViewerScreenKt.DarkSystemBarsEffect(this.$enabled, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ContentViewerScreen(com.facebook.aura.navigation.AuraNavKey r13, kotlin.jvm.functions.Function0<kotlin.Unit> r14, kotlin.jvm.functions.Function0<kotlin.Unit> r15, boolean r16, boolean r17, boolean r18, com.facebook.aura.navigation.key.ContentViewerBottomActions r19, X.BFM r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.view.ContentViewerScreenKt.ContentViewerScreen(com.facebook.aura.navigation.AuraNavKey, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, boolean, boolean, com.facebook.aura.navigation.key.ContentViewerBottomActions, X.BFM, int, int):void");
    }

    public static final String mediaTypeString(ContentItem contentItem) {
        ContentType contentType = contentItem != null ? contentItem.type : null;
        return contentType instanceof ContentType.Video ? "video" : contentType instanceof ContentType.Audio ? "audio" : contentType instanceof ContentType.Image ? "image" : "file";
    }

    public static final void reportViewerNoData(String str) {
        HatchHtmlDiagnostics.INSTANCE.logError(HatchHtmlSurface.WORKSPACE_HTML, HatchHtmlErrorCode.VIEWER_NO_DATA, str, null, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ContentViewerContent(com.facebook.aura.navigation.AuraNavKey r57, kotlin.jvm.functions.Function0<kotlin.Unit> r58, kotlin.jvm.functions.Function0<kotlin.Unit> r59, boolean r60, boolean r61, boolean r62, com.facebook.aura.navigation.key.ContentViewerBottomActions r63, X.BFM r64, int r65) {
        /*
            Method dump skipped, instructions count: 1344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.view.ContentViewerScreenKt.ContentViewerContent(com.facebook.aura.navigation.AuraNavKey, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, boolean, boolean, com.facebook.aura.navigation.key.ContentViewerBottomActions, X.BFM, int):void");
    }

    public static final void DarkSystemBarsEffect(boolean z, BFM bfm, int i, int i2) {
        bfm.AgG(-2097581214);
        int i3 = i2 & 1;
        int iA0n = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 3, 2), bfm, iA0n)) {
            if (i3 != 0) {
                z = true;
            }
            View viewA0J = AnonymousClass001.A0J(bfm);
            boolean zA00 = C3O5.A00(bfm);
            Boolean boolValueOf = Boolean.valueOf(zA00);
            Boolean boolValueOf2 = Boolean.valueOf(z);
            boolean zA1U = AnonymousClass001.A1U(bfm, zA00, bfm.A67(viewA0J) | AnonymousClass001.A1M(iA0n));
            Object objAaT = bfm.AaT();
            if (zA1U || objAaT == C78N.A00) {
                objAaT = new ContentViewerScreenKt$DarkSystemBarsEffect$1$1(viewA0J, z, zA00);
                bfm.Ai0(objAaT);
            }
            C78e.A01(bfm, viewA0J, boolValueOf, boolValueOf2, (G0U) objAaT);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C119342(z, i, i2);
        }
    }

    public static final /* synthetic */ ContentViewerViewModel.UiState access$ContentViewerContent$lambda$5(C1BO c1bo) {
        return (ContentViewerViewModel.UiState) c1bo.getValue();
    }
}
