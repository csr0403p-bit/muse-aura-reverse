package com.facebook.aura.file.view;

import X.A6B;
import X.AKQ;
import X.AXQ;
import X.AXY;
import X.AYL;
import X.AYU;
import X.AZE;
import X.Ab3;
import X.AbstractC0878AGe;
import X.AbstractC1996Aw5;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.AxM;
import X.B15;
import X.B18;
import X.B1T;
import X.B1V;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BQG;
import X.BRg;
import X.C00x;
import X.C06G;
import X.C11U;
import X.C1515AkP;
import X.C15k;
import X.C1809ArT;
import X.C1822Arm;
import X.C19U;
import X.C1SA;
import X.C1er;
import X.C2VU;
import X.C2av;
import X.C2eL;
import X.C3TF;
import X.C3TG;
import X.C3Tr;
import X.C3U4;
import X.C3Ue;
import X.C7196Ei8;
import X.C7197Ei9;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.C8iN;
import X.Ejq;
import X.F13;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1134Abi;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.Constraints;
import com.facebook.aura.file.utils.HatchFileUIUtils;
import com.facebook.aura.file.utils.HatchFileUIUtilsKt;
import com.facebook.aura.gateway.HatchThumbnailDisplaySize;
import com.facebook.aura.gateway.WorkspaceUriResolver;
import com.facebook.aura.markdown.render.AuraMarkdownTextKt;
import com.facebook.aura.network.fresco.AuraImageNetworkFetcher;
import com.facebook.aura.pairs.PairsDiscretionDocument;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class FileThumbnailPreviewKt {
    public static final float MARKDOWN_PREVIEW_VIRTUAL_WIDTH = 360.0f;
    public static final String TAG = "FileThumbnailPreview";
    public static final int TEXT_PREVIEW_MAX_CHARS = 2000;
    public static final int TEXT_PREVIEW_MAX_LINES = 12;
    public static final C7197Ei9 THUMBNAIL_IMAGE_OPTIONS;

    /* renamed from: com.facebook.aura.file.view.FileThumbnailPreviewKt$FileTextContentPreview$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<BRg, BFM, Integer, Unit> {
        public final /* synthetic */ String $fileExtension;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str) {
            super(3);
            this.$fileExtension = str;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(BRg bRg, BFM bfm, Integer num) {
            invoke(bRg, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BRg bRg, BFM bfm, int i) {
            C7384Etj.A0Y(bRg, 0);
            if ((i & 6) == 0) {
                i |= AnonymousClass004.A0d(bfm, bRg);
            }
            if (AnonymousClass001.A1b(AnonymousClass004.A1H(i), bfm, i)) {
                HatchFileUIUtilsKt.ThumbnailFallbackIcon(this.$fileExtension, bRg, bfm, (i << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 0);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.file.view.FileThumbnailPreviewKt$FileTextContentPreview$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0W<BRg, BFM, Integer, Unit> $fallbackContent;
        public final /* synthetic */ String $fileExtension;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $relativePath;
        public final /* synthetic */ AbstractC3358CGz $userSession;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(String str, String str2, AbstractC3358CGz abstractC3358CGz, BRg bRg, G0W<? super BRg, ? super BFM, ? super Integer, Unit> g0w, int i, int i2) {
            super(2);
            this.$relativePath = str;
            this.$fileExtension = str2;
            this.$userSession = abstractC3358CGz;
            this.$modifier = bRg;
            this.$fallbackContent = g0w;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            FileThumbnailPreviewKt.FileTextContentPreview(this.$relativePath, this.$fileExtension, this.$userSession, this.$modifier, this.$fallbackContent, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.file.view.FileThumbnailPreviewKt$FileThumbnailPreview$1, reason: invalid class name and case insensitive filesystem */
    public final class C119391 extends AbstractC7559F3s implements G0W<BRg, BFM, Integer, Unit> {
        public final /* synthetic */ String $fileExtension;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C119391(String str) {
            super(3);
            this.$fileExtension = str;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(BRg bRg, BFM bfm, Integer num) {
            invoke(bRg, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BRg bRg, BFM bfm, int i) {
            C7384Etj.A0Y(bRg, 0);
            if ((i & 6) == 0) {
                i |= AnonymousClass004.A0d(bfm, bRg);
            }
            if (AnonymousClass001.A1b(AnonymousClass004.A1H(i), bfm, i)) {
                HatchFileUIUtilsKt.ThumbnailFallbackIcon(this.$fileExtension, bRg, bfm, (i << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 0);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.file.view.FileThumbnailPreviewKt$FileThumbnailPreview$3, reason: invalid class name and case insensitive filesystem */
    public final class C119403 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0W<BRg, BFM, Integer, Unit> $fallbackContent;
        public final /* synthetic */ String $fileExtension;
        public final /* synthetic */ String $imageUri;
        public final /* synthetic */ String $mimeType;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<String, Unit> $onFileTitleFetched;
        public final /* synthetic */ String $relativePath;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C119403(String str, String str2, String str3, BRg bRg, String str4, G0U<? super String, Unit> g0u, G0W<? super BRg, ? super BFM, ? super Integer, Unit> g0w, int i, int i2) {
            super(2);
            this.$relativePath = str;
            this.$fileExtension = str2;
            this.$imageUri = str3;
            this.$modifier = bRg;
            this.$mimeType = str4;
            this.$onFileTitleFetched = g0u;
            this.$fallbackContent = g0w;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            FileThumbnailPreviewKt.FileThumbnailPreview(this.$relativePath, this.$fileExtension, this.$imageUri, this.$modifier, this.$mimeType, this.$onFileTitleFetched, this.$fallbackContent, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.file.view.FileThumbnailPreviewKt$FileThumbnailPreview$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0W<BRg, BFM, Integer, Unit> $fallbackContent;
        public final /* synthetic */ String $fileExtension;
        public final /* synthetic */ String $imageUri;
        public final /* synthetic */ String $mimeType;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<String, Unit> $onFileTitleFetched;
        public final /* synthetic */ String $relativePath;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass5(String str, String str2, String str3, BRg bRg, String str4, G0U<? super String, Unit> g0u, G0W<? super BRg, ? super BFM, ? super Integer, Unit> g0w, int i, int i2) {
            super(2);
            this.$relativePath = str;
            this.$fileExtension = str2;
            this.$imageUri = str3;
            this.$modifier = bRg;
            this.$mimeType = str4;
            this.$onFileTitleFetched = g0u;
            this.$fallbackContent = g0w;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            FileThumbnailPreviewKt.FileThumbnailPreview(this.$relativePath, this.$fileExtension, this.$imageUri, this.$modifier, this.$mimeType, this.$onFileTitleFetched, this.$fallbackContent, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.file.view.FileThumbnailPreviewKt$FileThumbnailPreview$7, reason: invalid class name */
    public final class AnonymousClass7 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0W<BRg, BFM, Integer, Unit> $fallbackContent;
        public final /* synthetic */ String $fileExtension;
        public final /* synthetic */ String $imageUri;
        public final /* synthetic */ String $mimeType;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<String, Unit> $onFileTitleFetched;
        public final /* synthetic */ String $relativePath;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass7(String str, String str2, String str3, BRg bRg, String str4, G0U<? super String, Unit> g0u, G0W<? super BRg, ? super BFM, ? super Integer, Unit> g0w, int i, int i2) {
            super(2);
            this.$relativePath = str;
            this.$fileExtension = str2;
            this.$imageUri = str3;
            this.$modifier = bRg;
            this.$mimeType = str4;
            this.$onFileTitleFetched = g0u;
            this.$fallbackContent = g0w;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            FileThumbnailPreviewKt.FileThumbnailPreview(this.$relativePath, this.$fileExtension, this.$imageUri, this.$modifier, this.$mimeType, this.$onFileTitleFetched, this.$fallbackContent, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.file.view.FileThumbnailPreviewKt$FileThumbnailPreview$8, reason: invalid class name */
    public final class AnonymousClass8 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ G0W<BRg, BFM, Integer, Unit> $fallbackContent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass8(G0W<? super BRg, ? super BFM, ? super Integer, Unit> g0w) {
            super(2);
            this.$fallbackContent = g0w;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                AnonymousClass001.A1G(BRg.A00, bfm, this.$fallbackContent, 6);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.file.view.FileThumbnailPreviewKt$FileThumbnailPreview$9, reason: invalid class name */
    public final class AnonymousClass9 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0W<BRg, BFM, Integer, Unit> $fallbackContent;
        public final /* synthetic */ String $fileExtension;
        public final /* synthetic */ String $imageUri;
        public final /* synthetic */ String $mimeType;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<String, Unit> $onFileTitleFetched;
        public final /* synthetic */ String $relativePath;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass9(String str, String str2, String str3, BRg bRg, String str4, G0U<? super String, Unit> g0u, G0W<? super BRg, ? super BFM, ? super Integer, Unit> g0w, int i, int i2) {
            super(2);
            this.$relativePath = str;
            this.$fileExtension = str2;
            this.$imageUri = str3;
            this.$modifier = bRg;
            this.$mimeType = str4;
            this.$onFileTitleFetched = g0u;
            this.$fallbackContent = g0w;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            FileThumbnailPreviewKt.FileThumbnailPreview(this.$relativePath, this.$fileExtension, this.$imageUri, this.$modifier, this.$mimeType, this.$onFileTitleFetched, this.$fallbackContent, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.file.view.FileThumbnailPreviewKt$HtmlPreviewContent$1, reason: invalid class name and case insensitive filesystem */
    public final class C119411 extends AbstractC7559F3s implements G0W<BRg, BFM, Integer, Unit> {
        public final /* synthetic */ String $fileExtension;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C119411(String str) {
            super(3);
            this.$fileExtension = str;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(BRg bRg, BFM bfm, Integer num) {
            invoke(bRg, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BRg bRg, BFM bfm, int i) {
            C7384Etj.A0Y(bRg, 0);
            if ((i & 6) == 0) {
                i |= AnonymousClass004.A0d(bfm, bRg);
            }
            if (AnonymousClass001.A1b(AnonymousClass004.A1H(i), bfm, i)) {
                HatchFileUIUtilsKt.ThumbnailFallbackIcon(this.$fileExtension, bRg, bfm, (i << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 0);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.file.view.FileThumbnailPreviewKt$HtmlPreviewContent$3, reason: invalid class name and case insensitive filesystem */
    public final class C119423 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0W<BRg, BFM, Integer, Unit> $fallbackContent;
        public final /* synthetic */ String $fileExtension;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $relativePath;
        public final /* synthetic */ AbstractC3358CGz $userSession;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C119423(String str, AbstractC3358CGz abstractC3358CGz, String str2, BRg bRg, G0W<? super BRg, ? super BFM, ? super Integer, Unit> g0w, int i, int i2) {
            super(2);
            this.$relativePath = str;
            this.$userSession = abstractC3358CGz;
            this.$fileExtension = str2;
            this.$modifier = bRg;
            this.$fallbackContent = g0w;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            FileThumbnailPreviewKt.HtmlPreviewContent(this.$relativePath, this.$userSession, this.$fileExtension, this.$modifier, this.$fallbackContent, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.file.view.FileThumbnailPreviewKt$MarkdownSnippetPreview$3, reason: invalid class name and case insensitive filesystem */
    public final class C119433 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $cacheKey;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $snippet;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C119433(String str, String str2, BRg bRg, int i, int i2) {
            super(2);
            this.$snippet = str;
            this.$cacheKey = str2;
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
            FileThumbnailPreviewKt.MarkdownSnippetPreview(this.$snippet, this.$cacheKey, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.file.view.FileThumbnailPreviewKt$ResolveFileTitle$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ G0U<String, Unit> $onFileTitleFetched;
        public final /* synthetic */ String $relativePath;
        public final /* synthetic */ AbstractC3358CGz $userSession;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(String str, AbstractC3358CGz abstractC3358CGz, G0U<? super String, Unit> g0u, int i) {
            super(2);
            this.$relativePath = str;
            this.$userSession = abstractC3358CGz;
            this.$onFileTitleFetched = g0u;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            FileThumbnailPreviewKt.ResolveFileTitle(this.$relativePath, this.$userSession, this.$onFileTitleFetched, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    static {
        C7196Ei8 c7196Ei8 = new C7196Ei8(C7197Ei9.A0P);
        c7196Ei8.A0I = true;
        c7196Ei8.A0O = true;
        THUMBNAIL_IMAGE_OPTIONS = new C7197Ei9(c7196Ei8);
    }

    public static final void FileTextContentPreview(String str, String str2, AbstractC3358CGz abstractC3358CGz, BRg bRg, G0W<? super BRg, ? super BFM, ? super Integer, Unit> g0w, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        G0W<? super BRg, ? super BFM, ? super Integer, Unit> g0wA00 = g0w;
        bfm.AgG(-220125965);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, abstractC3358CGz);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, g0wA00);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 9363, 9362), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                g0wA00 = B1V.A00(bfm, new AnonymousClass1(str2), -1057945657);
            }
            int i5 = iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            boolean zA1Q = AnonymousClass002.A1Q(i5, 32);
            Object objAaT = bfm.AaT();
            if (zA1Q || objAaT == C78N.A00) {
                objAaT = AnonymousClass001.A0j(bfm, AbstractC0878AGe.A0k(HatchFileUIUtils.FileExtensions.CODE, str2 != null ? AnonymousClass001.A0u(str2) : null));
            }
            boolean zA1X = AnonymousClass001.A1X(objAaT);
            int i6 = iA0d & 14;
            boolean zA1Q2 = AnonymousClass002.A1Q(i6, 4);
            Object objAaT2 = bfm.AaT();
            if (zA1Q2 || objAaT2 == C78N.A00) {
                objAaT2 = AnonymousClass004.A11(bfm, ThumbnailTextCache.INSTANCE.snippet(str));
            }
            MutableState mutableState = (MutableState) objAaT2;
            boolean zA1O = AnonymousClass003.A1O(bfm, abstractC3358CGz, mutableState, AnonymousClass002.A1Q(i6, 4));
            Object objAaT3 = bfm.AaT();
            if (zA1O || objAaT3 == C78N.A00) {
                objAaT3 = new FileThumbnailPreviewKt$FileTextContentPreview$2$1(str, abstractC3358CGz, mutableState, null);
                bfm.Ai0(objAaT3);
            }
            AnonymousClass001.A18(bfm, objAaT3, str);
            boolean zA17 = AnonymousClass003.A17(i6) | (i5 == 32);
            Object objAaT4 = bfm.AaT();
            if (zA17 || objAaT4 == C78N.A00) {
                objAaT4 = AnonymousClass001.A0j(bfm, isMarkdown(str2, str));
            }
            boolean zA1X2 = AnonymousClass001.A1X(objAaT4);
            String strA05 = MutableState.A05(mutableState);
            if (strA05 == null) {
                bfm.AgE(-1087614464);
                C3Ue.A04(bRg2, bfm, (iA0d >> 9) & 14);
            } else if (strA05.equals("")) {
                bfm.AgE(-1087613684);
                AnonymousClass001.A1G(bRg2, bfm, g0wA00, (iA0d >> 9) & 126);
            } else {
                bfm.AgE(-1087611560);
                if (zA1X2) {
                    bfm.AgE(643783234);
                    MarkdownSnippetPreview(strA05, str, bRg2, bfm, ((iA0d << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | ((iA0d >> 3) & 896), 0);
                } else {
                    bfm.AgE(643910706);
                    BRg bRgA09 = C3U4.A09(C11U.A00(bRg2), AuraDimensKt.SpacingSmall);
                    long jA0C = C06G.A0C(bfm);
                    long jA03 = C19U.A03(11);
                    long jA032 = C19U.A03(15);
                    AbstractC1996Aw5 abstractC1996Aw5 = zA1X ? AbstractC1996Aw5.A01 : AbstractC1996Aw5.A04;
                    C1822Arm c1822Arm = C1822Arm.A03;
                    long j = B6A.A07;
                    AuraTextKt.m2639AuraTextUY9GdpU(strA05, bRgA09, jA0C, new C1822Arm(null, abstractC1996Aw5, null, 0, 0, j, jA03, C1809ArT.A01, j, jA032), null, null, null, false, 0, 12, 2, null, null, null, bfm, 805306368, 6, 14832);
                }
                AnonymousClass006.A1N(bfm);
            }
            AnonymousClass002.A19(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(str, str2, abstractC3358CGz, bRg2, g0wA00, i, i2);
        }
    }

    public static final void FileThumbnailPreview(final String str, String str2, String str3, BRg bRg, String str4, G0U<? super String, Unit> g0u, G0W<? super BRg, ? super BFM, ? super Integer, Unit> g0w, BFM bfm, int i, int i2) {
        G0U<? super String, Unit> g0u2;
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass9;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass7;
        BRg bRg2 = bRg;
        G0W<? super BRg, ? super BFM, ? super Integer, Unit> g0wA00 = g0w;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(589931091);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, str3);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, str4);
        }
        int i5 = i2 & 32;
        int iA0Y = 196608;
        if (i5 != 0) {
            iA0d |= iA0Y;
        } else if ((i & 196608) == 0) {
            iA0Y = AnonymousClass004.A0Y(bfm, g0u);
            iA0d |= iA0Y;
        }
        int i6 = i2 & 64;
        int iA0Z = 1572864;
        if (i6 != 0) {
            iA0d |= iA0Z;
        } else if ((i & 1572864) == 0) {
            iA0Z = AnonymousClass004.A0Z(bfm, g0wA00);
            iA0d |= iA0Z;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 599187, 599186), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                str4 = null;
            }
            g0u2 = i5 == 0 ? g0u : null;
            if (i6 != 0) {
                g0wA00 = B1V.A00(bfm, new C119391(str2), 497749031);
            }
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            if (g0u2 != null) {
                bfm.AgE(-368640218);
                ResolveFileTitle(str, abstractC3358CGzA0h, g0u2, bfm, (iA0d & 14) | ((iA0d >> 9) & 896));
            } else {
                bfm.AgE(-368570065);
            }
            BBI bbi = (BBI) bfm;
            BBI.A0R(bbi, false);
            int i7 = iA0d & 14;
            boolean zA17 = AnonymousClass003.A17(i7);
            int i8 = iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            boolean zA18 = AnonymousClass003.A18(i8) | zA17;
            Object objAaT = bfm.AaT();
            if (zA18 || objAaT == C78N.A00) {
                objAaT = AnonymousClass001.A0j(bfm, isSpreadsheet(str2, str));
            }
            if (AnonymousClass001.A1X(objAaT)) {
                bfm.AgE(-368475391);
                AnonymousClass001.A1G(bRg2, bfm, g0wA00, ((iA0d >> 9) & 14) | ((iA0d >> 15) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX));
                bBbAAc = AnonymousClass001.A0L(bfm, bbi);
                if (bBbAAc == null) {
                    return;
                } else {
                    anonymousClass7 = new C119403(str, str2, str3, bRg2, str4, g0u2, g0wA00, i, i2);
                }
            } else {
                bfm.AgE(-368431185);
                BBI.A0R(bbi, false);
                boolean zA1Q = AnonymousClass002.A1Q(i7, 4) | AnonymousClass002.A1Q(i8, 32);
                Object objAaT2 = bfm.AaT();
                if (zA1Q || objAaT2 == C78N.A00) {
                    objAaT2 = AnonymousClass001.A0j(bfm, isTextContentPreviewable(str2, str));
                }
                if (AnonymousClass001.A1X(objAaT2)) {
                    bfm.AgE(-368009089);
                    FileTextContentPreview(str, str2, abstractC3358CGzA0h, bRg2, g0wA00, bfm, (iA0d & 7294) | ((iA0d >> 6) & 57344), 0);
                    bBbAAc = AnonymousClass001.A0L(bfm, bbi);
                    if (bBbAAc == null) {
                        return;
                    } else {
                        anonymousClass7 = new AnonymousClass5(str, str2, str3, bRg2, str4, g0u2, g0wA00, i, i2);
                    }
                } else {
                    bfm.AgE(-367901457);
                    BBI.A0R(bbi, false);
                    int i9 = iA0d & 57344;
                    boolean zA1Q2 = AnonymousClass002.A1Q(i7, 4) | AnonymousClass002.A1Q(i8, 32) | AnonymousClass002.A1Q(i9, 16384);
                    Object objAaT3 = bfm.AaT();
                    if (zA1Q2 || objAaT3 == C78N.A00) {
                        objAaT3 = AnonymousClass001.A0j(bfm, isHtmlPreviewable(str4, str2, str));
                    }
                    if (AnonymousClass001.A1X(objAaT3)) {
                        bfm.AgE(-367757245);
                        HtmlPreviewContent(str, abstractC3358CGzA0h, str2, bRg2, g0wA00, bfm, ((iA0d << 3) & 896) | i7 | (iA0d & 7168) | ((iA0d >> 6) & 57344), 0);
                        bBbAAc = AnonymousClass001.A0L(bfm, bbi);
                        if (bBbAAc == null) {
                            return;
                        } else {
                            anonymousClass7 = new AnonymousClass7(str, str2, str3, bRg2, str4, g0u2, g0wA00, i, i2);
                        }
                    } else {
                        bfm.AgE(-367653457);
                        BBI.A0R(bbi, false);
                        int i10 = iA0d & 896;
                        boolean zA172 = AnonymousClass003.A17(i7) | AnonymousClass003.A19(i10) | AnonymousClass002.A1Q(i9, 16384);
                        Object objAaT4 = bfm.AaT();
                        if (zA172 || objAaT4 == C78N.A00) {
                            objAaT4 = AnonymousClass001.A0j(bfm, HatchFileUIUtils.FileExtensions.INSTANCE.isSvg(str4, str, str3));
                        }
                        boolean zA1X = AnonymousClass001.A1X(objAaT4);
                        boolean zA1U = AnonymousClass001.A1U(bfm, zA1X, AnonymousClass002.A1Q(i7, 4) | AnonymousClass003.A19(i10));
                        Object objAaT5 = bfm.AaT();
                        if (zA1U || objAaT5 == C78N.A00) {
                            objAaT5 = zA1X ? str3 == null ? WorkspaceUriResolver.INSTANCE.resolveRawAssetUrl(str, abstractC3358CGzA0h) : str3 : WorkspaceUriResolver.INSTANCE.resolveThumbnailUrl(str, abstractC3358CGzA0h, HatchThumbnailDisplaySize.MEDIUM);
                            bfm.Ai0(objAaT5);
                        }
                        String str5 = (String) objAaT5;
                        boolean zA1Q3 = AnonymousClass002.A1Q(i7, 4);
                        Object objAaT6 = bfm.AaT();
                        if (zA1Q3 || objAaT6 == C78N.A00) {
                            objAaT6 = AnonymousClass001.A0j(bfm, ThumbnailFailureCache.INSTANCE.shouldSkip(str));
                        }
                        boolean zA1X2 = AnonymousClass001.A1X(objAaT6);
                        boolean zA182 = AnonymousClass003.A18(i8) | AnonymousClass002.A1Q(i7, 4);
                        Object objAaT7 = bfm.AaT();
                        if (zA182 || objAaT7 == C78N.A00) {
                            objAaT7 = thumbnailAlignment(str, str2);
                            bfm.Ai0(objAaT7);
                        }
                        Alignment alignment = (Alignment) objAaT7;
                        if (str5 == null || zA1X2) {
                            bfm.AgE(-11834356);
                            AnonymousClass001.A1G(bRg2, bfm, g0wA00, ((iA0d >> 9) & 14) | ((iA0d >> 15) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX));
                        } else {
                            boolean zA1Y = AnonymousClass001.A1Y(str5, bfm, -366785178);
                            Object objAaT8 = bfm.AaT();
                            if (zA1Y || objAaT8 == C78N.A00) {
                                objAaT8 = B15.A00(Uri.parse(str5));
                                bfm.Ai0(objAaT8);
                            }
                            Ejq ejq = (Ejq) objAaT8;
                            boolean z = i7 == 4;
                            Object objAaT9 = bfm.AaT();
                            if (z || objAaT9 == C78N.A00) {
                                objAaT9 = new F13() { // from class: com.facebook.aura.file.view.FileThumbnailPreviewKt$FileThumbnailPreview$listener$1$1
                                    @Override // X.F13, X.Ej6
                                    public void onFailure(long j, Drawable drawable, Throwable th) {
                                        AuraImageNetworkFetcher.ImageNetworkFetcherException imageNetworkFetcherException;
                                        Throwable cause = th != null ? th.getCause() : null;
                                        if ((cause instanceof AuraImageNetworkFetcher.ImageNetworkFetcherException) && (imageNetworkFetcherException = (AuraImageNetworkFetcher.ImageNetworkFetcherException) cause) != null && imageNetworkFetcherException.responseCode == 404) {
                                            ThumbnailFailureCache.INSTANCE.recordTerminal(str);
                                        }
                                    }

                                    @Override // X.F13, X.Ej6
                                    public void onFinalImageSet(long j, int i11, C2eL c2eL, Drawable drawable) {
                                        ThumbnailFailureCache.INSTANCE.clear(str);
                                    }
                                };
                                bfm.Ai0(objAaT9);
                            }
                            AuraImageKt.AuraImage(bRg2, ejq, null, THUMBNAIL_IMAGE_OPTIONS, false, null, (F13) objAaT9, false, false, false, zA1X ? B18.A02 : B18.A00, null, alignment, B1V.A00(bfm, new AnonymousClass8(g0wA00), 1527089607), true, null, bfm, ((iA0d >> 9) & 14) | 384, 27648, 35760);
                        }
                        BBI.A0R(bbi, false);
                    }
                }
            }
            anonymousClass9 = anonymousClass7;
            bBbAAc.A06 = anonymousClass9;
        }
        bfm.Afo();
        g0u2 = g0u;
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass9 = new AnonymousClass9(str, str2, str3, bRg2, str4, g0u2, g0wA00, i, i2);
            bBbAAc.A06 = anonymousClass9;
        }
    }

    public static final void HtmlPreviewContent(String str, AbstractC3358CGz abstractC3358CGz, String str2, BRg bRg, G0W<? super BRg, ? super BFM, ? super Integer, Unit> g0w, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        G0W<? super BRg, ? super BFM, ? super Integer, Unit> g0wA00 = g0w;
        bfm.AgG(-1592451411);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, abstractC3358CGz);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, str2);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, g0wA00);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                g0wA00 = B1V.A00(bfm, new C119411(str2), -1097888895);
            }
            Context contextA0H = AnonymousClass002.A0H(bfm);
            int i5 = iA0d & 14;
            boolean zA1R = AnonymousClass001.A1R(bfm, abstractC3358CGz, AnonymousClass002.A1Q(i5, 4));
            Object objAaT = bfm.AaT();
            if (zA1R || objAaT == C78N.A00) {
                objAaT = AnonymousClass004.A11(bfm, HtmlPreviewRenderer.INSTANCE.peek(str, abstractC3358CGz));
            }
            MutableState mutableState = (MutableState) objAaT;
            boolean zA1R2 = AnonymousClass001.A1R(bfm, abstractC3358CGz, AnonymousClass002.A1Q(i5, 4));
            Object objAaT2 = bfm.AaT();
            if (zA1R2 || objAaT2 == C78N.A00) {
                objAaT2 = AnonymousClass005.A0S(bfm, HtmlPreviewRenderer.INSTANCE.hasFailed(str, abstractC3358CGz));
            }
            MutableState mutableState2 = (MutableState) objAaT2;
            boolean zA1V = AnonymousClass002.A1V(bfm, abstractC3358CGz, AnonymousClass004.A1S(bfm, mutableState2, contextA0H, bfm.A65(mutableState)), AnonymousClass003.A17(i5));
            Object objAaT3 = bfm.AaT();
            if (zA1V || objAaT3 == C78N.A00) {
                objAaT3 = new FileThumbnailPreviewKt$HtmlPreviewContent$2$1(contextA0H, str, abstractC3358CGz, mutableState, mutableState2, null);
                bfm.Ai0(objAaT3);
            }
            AnonymousClass001.A1A(bfm, objAaT3, str, abstractC3358CGz);
            Bitmap bitmap = (Bitmap) mutableState.getValue();
            if (bitmap == null) {
                bfm.AgE(-1337419227);
                if (MutableState.A0A(mutableState2)) {
                    bfm.AgE(-1337418874);
                    AnonymousClass001.A1G(bRg2, bfm, g0wA00, (iA0d >> 9) & 126);
                } else {
                    bfm.AgE(-1337417894);
                    C3Ue.A04(bRg2, bfm, (iA0d >> 9) & 14);
                }
                AnonymousClass006.A1M(bfm);
            } else {
                bfm.AgE(-1337416594);
                C1SA.A01(bfm, C2VU.A0C, bRg2, new B1T(bitmap), B18.A00, null, ((iA0d >> 3) & 896) | 27696, 224);
                AnonymousClass001.A1D(bfm);
            }
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C119423(str, abstractC3358CGz, str2, bRg2, g0wA00, i, i2);
        }
    }

    public static final void MarkdownSnippetPreview(String str, String str2, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1055751792);
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
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA09 = C3U4.A09(C11U.A00(bRg2), AuraDimensKt.SpacingSmall);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = new InterfaceC1380AiA() { // from class: com.facebook.aura.file.view.FileThumbnailPreviewKt$MarkdownSnippetPreview$2$1

                    /* renamed from: com.facebook.aura.file.view.FileThumbnailPreviewKt$MarkdownSnippetPreview$2$1$1, reason: invalid class name */
                    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AYU, Unit> {
                        public final /* synthetic */ AZE $placeable;
                        public final /* synthetic */ float $scale;

                        /* renamed from: com.facebook.aura.file.view.FileThumbnailPreviewKt$MarkdownSnippetPreview$2$1$1$1, reason: invalid class name and collision with other inner class name */
                        public final class C01581 extends AbstractC7559F3s implements G0U<C2av, Unit> {
                            public final /* synthetic */ float $scale;

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(C2av c2av) {
                                C7384Etj.A0Y(c2av, 0);
                                float f = this.$scale;
                                c2av.AeX(f);
                                c2av.AeY(f);
                                long jA0J = AnonymousClass005.A0J(0.0f, 0.0f);
                                long j = C15k.A01;
                                c2av.Af4(jA0J);
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public C01581(float f) {
                                super(1);
                                this.$scale = f;
                            }

                            @Override // X.G0U
                            public /* bridge */ /* synthetic */ Unit invoke(C2av c2av) {
                                invoke2(c2av);
                                return Unit.INSTANCE;
                            }
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(AYU ayu) {
                            C7384Etj.A0Y(ayu, 0);
                            AZE aze = this.$placeable;
                            if (aze != null) {
                                ayu.A0C(aze, new C01581(this.$scale), 0, 0);
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(AZE aze, float f) {
                            super(1);
                            this.$placeable = aze;
                            this.$scale = f;
                        }

                        @Override // X.G0U
                        public /* bridge */ /* synthetic */ Unit invoke(AYU ayu) {
                            invoke2(ayu);
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // X.InterfaceC1380AiA
                    public /* bridge */ int maxIntrinsicHeight(C3TF c3tf, List<? extends C3Tr> list, int i4) {
                        return AXQ.A00(c3tf, this, list, i4);
                    }

                    @Override // X.InterfaceC1380AiA
                    public /* bridge */ int maxIntrinsicWidth(C3TF c3tf, List<? extends C3Tr> list, int i4) {
                        return AXQ.A01(c3tf, this, list, i4);
                    }

                    @Override // X.InterfaceC1380AiA
                    /* renamed from: measure-3p2s80s */
                    public final InterfaceC1134Abi mo7measure3p2s80s(AXY axy, List<? extends C3TG> list, long j) {
                        boolean zA1b = AnonymousClass004.A1b(axy, list);
                        int iAbr = axy.Abr(FileThumbnailPreviewKt.MARKDOWN_PREVIEW_VIRTUAL_WIDTH);
                        int iA01 = Constraints.A0A(j) ? Constraints.A01(j) : iAbr;
                        float f = iA01 / iAbr;
                        if (f > 1.0f) {
                            f = 1.0f;
                        }
                        C3TG c3tg = (C3TG) AbstractC0878AGe.A0G(list);
                        AZE azeAQW = c3tg != null ? c3tg.AQW(AYL.A05(iAbr, iAbr, zA1b ? 1 : 0, Integer.MAX_VALUE)) : null;
                        return AnonymousClass002.A0X(axy, new AnonymousClass1(azeAQW, f), iA01, Constraints.A09(j) ? Constraints.A00(j) : azeAQW == null ? 0 : Ab3.A01(azeAQW.A00 * f));
                    }

                    @Override // X.InterfaceC1380AiA
                    public /* bridge */ int minIntrinsicHeight(C3TF c3tf, List<? extends C3Tr> list, int i4) {
                        return AXQ.A02(c3tf, this, list, i4);
                    }

                    @Override // X.InterfaceC1380AiA
                    public /* bridge */ int minIntrinsicWidth(C3TF c3tf, List<? extends C3Tr> list, int i4) {
                        return AXQ.A03(c3tf, this, list, i4);
                    }
                };
                bfm.Ai0(objAaT);
            }
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA09);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, objAaT, akqA04, bRgA01, iA0J);
            AuraMarkdownTextKt.m1368AuraMarkdownTextrAaX7yc(str, null, null, false, null, str2, null, null, null, false, false, null, bfm, AnonymousClass001.A08(iA0d << 12, iA0d & 14), 0, 4062);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C119433(str, str2, bRg2, i, i2);
        }
    }

    public static final boolean isHtmlPreviewable(String str, String str2, String str3) {
        if (HatchFileUIUtils.FileExtensions.INSTANCE.isHtml(str, str3, null)) {
            return true;
        }
        if (str2 == null) {
            str2 = HatchFileUIUtils.INSTANCE.fileExtensionForPath(str3);
        }
        return HatchFileUIUtils.FileExtensions.HTML.contains(AnonymousClass001.A0u(str2));
    }

    public static final boolean isMarkdown(String str, String str2) {
        if (str == null) {
            str = HatchFileUIUtils.INSTANCE.fileExtensionForPath(str2);
        }
        return HatchFileUIUtils.FileExtensions.MARKDOWN.contains(AnonymousClass001.A0u(str));
    }

    public static final boolean isSpreadsheet(String str, String str2) {
        if (str == null) {
            str = HatchFileUIUtils.INSTANCE.fileExtensionForPath(str2);
        }
        return HatchFileUIUtils.FileExtensions.SPREADSHEET.contains(AnonymousClass001.A0u(str));
    }

    public static final boolean isTextContentPreviewable(String str, String str2) {
        if (str == null) {
            str = HatchFileUIUtils.INSTANCE.fileExtensionForPath(str2);
        }
        String strA0u = AnonymousClass001.A0u(str);
        if (strA0u.length() == 0 || HatchFileUIUtils.FileExtensions.HTML.contains(strA0u)) {
            return false;
        }
        return HatchFileUIUtils.FileExtensions.TEXT.contains(strA0u) || HatchFileUIUtils.FileExtensions.CODE.contains(strA0u) || HatchFileUIUtils.FileExtensions.MARKDOWN.contains(strA0u);
    }

    public static final Alignment thumbnailAlignment(String str, String str2) {
        if (str2 == null) {
            str2 = HatchFileUIUtils.INSTANCE.fileExtensionForPath(str);
        }
        return HatchFileUIUtils.FileExtensions.IS_MEDIA_FILE.contains(AnonymousClass001.A0u(str2)) ? C2VU.A09 : C2VU.A0C;
    }

    public static final void ResolveFileTitle(String str, AbstractC3358CGz abstractC3358CGz, G0U<? super String, Unit> g0u, BFM bfm, int i) {
        bfm.AgG(2122448128);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, abstractC3358CGz);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, g0u);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            MutableState mutableStateA00 = C1er.A00(bfm, g0u);
            boolean zA1V = AnonymousClass002.A1V(bfm, abstractC3358CGz, bfm.A65(mutableStateA00), AnonymousClass001.A1M(iA0d));
            Object objAaT = bfm.AaT();
            if (zA1V || objAaT == C78N.A00) {
                objAaT = new FileThumbnailPreviewKt$ResolveFileTitle$1$1(str, abstractC3358CGz, mutableStateA00, null);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A1A(bfm, objAaT, str, abstractC3358CGz);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, abstractC3358CGz, g0u, i);
        }
    }

    public static final /* synthetic */ Bitmap access$HtmlPreviewContent$lambda$1(MutableState mutableState) {
        return (Bitmap) mutableState.getValue();
    }

    public static final String extractSnippet(String str) {
        String string = C7BY.A0H(str).toString();
        if (string.length() > 2000) {
            string = BQG.A17(string, 2000);
        }
        C7384Etj.A0Y(string, 0);
        return C7BY.A0G(A6B.A01(PairsDiscretionDocument.TERMINATOR, A6B.A07(new C8iN(string, 1), 12))).toString();
    }

    public static final Ejq thumbnailImageSource(String str) {
        return B15.A00(Uri.parse(str));
    }
}
