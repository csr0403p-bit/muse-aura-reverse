package com.facebook.aura.model;

import X.AHD;
import X.AHI;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06H;
import X.C0KA;
import X.C3cH;
import X.C7384Etj;
import com.facebook.aura.vds.compose.text.richtext.AuraInlineEntities;

/* loaded from: classes.dex */
public abstract class HatchContentViewModelData {
    public static final int $stable = 0;

    public final class Code extends HatchContentViewModelData {
        public static final int $stable = 0;
        public final HatchCodeParams codeParams;
        public final String rawMarkdown;

        public Code(HatchCodeParams hatchCodeParams, String str) {
            C7384Etj.A0Y(hatchCodeParams, 0);
            this.codeParams = hatchCodeParams;
            this.rawMarkdown = str;
        }

        public final Code copy(HatchCodeParams hatchCodeParams, String str) {
            C7384Etj.A0Y(hatchCodeParams, 0);
            return new Code(hatchCodeParams, str);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Code) {
                    Code code = (Code) obj;
                    if (!C7384Etj.areEqual(this.codeParams, code.codeParams) || !C7384Etj.areEqual(this.rawMarkdown, code.rawMarkdown)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Code copy$default(Code code, HatchCodeParams hatchCodeParams, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                hatchCodeParams = code.codeParams;
            }
            if ((i & 2) != 0) {
                str = code.rawMarkdown;
            }
            C7384Etj.A0Y(hatchCodeParams, 0);
            return new Code(hatchCodeParams, str);
        }

        public final HatchCodeParams component1() {
            return this.codeParams;
        }

        public final String component2() {
            return this.rawMarkdown;
        }

        public final HatchCodeParams getCodeParams() {
            return this.codeParams;
        }

        public final String getRawMarkdown() {
            return this.rawMarkdown;
        }

        public int hashCode() {
            return AnonymousClass005.A0E(this.codeParams) + AnonymousClass006.A0G(this.rawMarkdown);
        }

        public String toString() {
            return super.toString();
        }
    }

    /* loaded from: classes2.dex */
    public final class Divider extends HatchContentViewModelData {
        public static final int $stable = 0;
        public static final Divider INSTANCE = new Divider();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Divider);
        }

        public String toString() {
            return "Divider";
        }

        public int hashCode() {
            return -383142389;
        }
    }

    /* loaded from: classes2.dex */
    public final class EmbeddedFileHTMLContent extends HatchContentViewModelData {
        public static final int $stable = 0;
        public final String filepath;
        public final String htmlContent;
        public final boolean isFileLoading;

        public EmbeddedFileHTMLContent(String str, String str2, boolean z) {
            C7384Etj.A0Y(str, 0);
            this.filepath = str;
            this.htmlContent = str2;
            this.isFileLoading = z;
        }

        public final EmbeddedFileHTMLContent copy(String str, String str2, boolean z) {
            C7384Etj.A0Y(str, 0);
            return new EmbeddedFileHTMLContent(str, str2, z);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof EmbeddedFileHTMLContent) {
                    EmbeddedFileHTMLContent embeddedFileHTMLContent = (EmbeddedFileHTMLContent) obj;
                    if (!C7384Etj.areEqual(this.filepath, embeddedFileHTMLContent.filepath) || !C7384Etj.areEqual(this.htmlContent, embeddedFileHTMLContent.htmlContent) || this.isFileLoading != embeddedFileHTMLContent.isFileLoading) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ EmbeddedFileHTMLContent copy$default(EmbeddedFileHTMLContent embeddedFileHTMLContent, String str, String str2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = embeddedFileHTMLContent.filepath;
            }
            if ((i & 2) != 0) {
                str2 = embeddedFileHTMLContent.htmlContent;
            }
            if ((i & 4) != 0) {
                z = embeddedFileHTMLContent.isFileLoading;
            }
            return embeddedFileHTMLContent.copy(str, str2, z);
        }

        public final String component1() {
            return this.filepath;
        }

        public final String component2() {
            return this.htmlContent;
        }

        public final boolean component3() {
            return this.isFileLoading;
        }

        public final String getFilepath() {
            return this.filepath;
        }

        public final String getHtmlContent() {
            return this.htmlContent;
        }

        public int hashCode() {
            return C0KA.A00((AnonymousClass001.A0G(this.filepath) + AnonymousClass006.A0G(this.htmlContent)) * 31, this.isFileLoading);
        }

        public final boolean isFileLoading() {
            return this.isFileLoading;
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ EmbeddedFileHTMLContent(String str, String str2, boolean z, int i, C06H c06h) {
            this(str, AnonymousClass006.A0s(i, str2), (i & 4) != 0 ? true : z);
        }
    }

    /* loaded from: classes2.dex */
    public final class InlineFile extends HatchContentViewModelData {
        public static final int $stable = 0;
        public final boolean deleted;
        public final String fileName;
        public final boolean loading;
        public final String mimeType;
        public final AHD<String> thumbnailUrls;
        public final String url;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof InlineFile) {
                    InlineFile inlineFile = (InlineFile) obj;
                    if (!C7384Etj.areEqual(this.fileName, inlineFile.fileName) || !C7384Etj.areEqual(this.url, inlineFile.url) || !C7384Etj.areEqual(this.mimeType, inlineFile.mimeType) || this.deleted != inlineFile.deleted || this.loading != inlineFile.loading || !C7384Etj.areEqual(this.thumbnailUrls, inlineFile.thumbnailUrls)) {
                    }
                }
                return false;
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ InlineFile copy$default(InlineFile inlineFile, String str, String str2, String str3, boolean z, boolean z2, AHD ahd, int i, Object obj) {
            if ((i & 1) != 0) {
                str = inlineFile.fileName;
            }
            if ((i & 2) != 0) {
                str2 = inlineFile.url;
            }
            if ((i & 4) != 0) {
                str3 = inlineFile.mimeType;
            }
            if ((i & 8) != 0) {
                z = inlineFile.deleted;
            }
            if ((i & 16) != 0) {
                z2 = inlineFile.loading;
            }
            if ((i & 32) != 0) {
                ahd = inlineFile.thumbnailUrls;
            }
            return inlineFile.copy(str, str2, str3, z, z2, ahd);
        }

        public final String component1() {
            return this.fileName;
        }

        public final String component2() {
            return this.url;
        }

        public final String component3() {
            return this.mimeType;
        }

        public final boolean component4() {
            return this.deleted;
        }

        public final boolean component5() {
            return this.loading;
        }

        public final AHD<String> component6() {
            return this.thumbnailUrls;
        }

        public final boolean getDeleted() {
            return this.deleted;
        }

        public final String getFileName() {
            return this.fileName;
        }

        public final boolean getLoading() {
            return this.loading;
        }

        public final String getMimeType() {
            return this.mimeType;
        }

        public final AHD<String> getThumbnailUrls() {
            return this.thumbnailUrls;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.thumbnailUrls, C0KA.A01(C0KA.A01((AnonymousClass005.A0I(this.url, AnonymousClass001.A0G(this.fileName)) + AnonymousClass006.A0G(this.mimeType)) * 31, this.deleted), this.loading));
        }

        public /* synthetic */ InlineFile(String str, String str2, String str3, boolean z, boolean z2, AHD ahd, int i, C06H c06h) {
            this(str, str2, str3, AnonymousClass005.A1P(i, z), AnonymousClass005.A1Q(i, z2), (i & 32) != 0 ? AHI.A01 : ahd);
        }

        public final InlineFile copy(String str, String str2, String str3, boolean z, boolean z2, AHD<String> ahd) {
            AnonymousClass003.A0u(str, str2);
            C7384Etj.A0Y(ahd, 5);
            return new InlineFile(str, str2, str3, z, z2, ahd);
        }

        public String toString() {
            return super.toString();
        }

        public InlineFile(String str, String str2, String str3, boolean z, boolean z2, AHD<String> ahd) {
            AnonymousClass003.A0u(str, str2);
            C7384Etj.A0Y(ahd, 5);
            this.fileName = str;
            this.url = str2;
            this.mimeType = str3;
            this.deleted = z;
            this.loading = z2;
            this.thumbnailUrls = ahd;
        }
    }

    /* loaded from: classes2.dex */
    public final class InlineHtml extends HatchContentViewModelData {
        public static final int $stable = 0;
        public final boolean deleted;
        public final String fileName;
        public final boolean loading;
        public final String url;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof InlineHtml) {
                    InlineHtml inlineHtml = (InlineHtml) obj;
                    if (!C7384Etj.areEqual(this.fileName, inlineHtml.fileName) || !C7384Etj.areEqual(this.url, inlineHtml.url) || this.deleted != inlineHtml.deleted || this.loading != inlineHtml.loading) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ InlineHtml copy$default(InlineHtml inlineHtml, String str, String str2, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = inlineHtml.fileName;
            }
            if ((i & 2) != 0) {
                str2 = inlineHtml.url;
            }
            if ((i & 4) != 0) {
                z = inlineHtml.deleted;
            }
            if ((i & 8) != 0) {
                z2 = inlineHtml.loading;
            }
            AnonymousClass003.A0u(str, str2);
            return new InlineHtml(str, str2, z, z2);
        }

        public final String component1() {
            return this.fileName;
        }

        public final String component2() {
            return this.url;
        }

        public final boolean component3() {
            return this.deleted;
        }

        public final boolean component4() {
            return this.loading;
        }

        public final boolean getDeleted() {
            return this.deleted;
        }

        public final String getFileName() {
            return this.fileName;
        }

        public final boolean getLoading() {
            return this.loading;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return C0KA.A00(C0KA.A01(AnonymousClass005.A0I(this.url, AnonymousClass001.A0G(this.fileName)), this.deleted), this.loading);
        }

        public InlineHtml(String str, String str2, boolean z, boolean z2) {
            AnonymousClass003.A0u(str, str2);
            this.fileName = str;
            this.url = str2;
            this.deleted = z;
            this.loading = z2;
        }

        public final InlineHtml copy(String str, String str2, boolean z, boolean z2) {
            AnonymousClass003.A0u(str, str2);
            return new InlineHtml(str, str2, z, z2);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ InlineHtml(String str, String str2, boolean z, boolean z2, int i, C06H c06h) {
            this(str, str2, AnonymousClass005.A1O(i, z), AnonymousClass005.A1P(i, z2));
        }
    }

    public final class InlineImage extends HatchContentViewModelData {
        public static final int $stable = 0;
        public final String alt;
        public final boolean deleted;
        public final String url;
        public final String workspacePath;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof InlineImage) {
                    InlineImage inlineImage = (InlineImage) obj;
                    if (!C7384Etj.areEqual(this.alt, inlineImage.alt) || !C7384Etj.areEqual(this.url, inlineImage.url) || this.deleted != inlineImage.deleted || !C7384Etj.areEqual(this.workspacePath, inlineImage.workspacePath)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ InlineImage copy$default(InlineImage inlineImage, String str, String str2, boolean z, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = inlineImage.alt;
            }
            if ((i & 2) != 0) {
                str2 = inlineImage.url;
            }
            if ((i & 4) != 0) {
                z = inlineImage.deleted;
            }
            if ((i & 8) != 0) {
                str3 = inlineImage.workspacePath;
            }
            AnonymousClass003.A0u(str, str2);
            return new InlineImage(str, str2, z, str3);
        }

        public final String component1() {
            return this.alt;
        }

        public final String component2() {
            return this.url;
        }

        public final boolean component3() {
            return this.deleted;
        }

        public final String component4() {
            return this.workspacePath;
        }

        public final String getAlt() {
            return this.alt;
        }

        public final boolean getDeleted() {
            return this.deleted;
        }

        public final String getUrl() {
            return this.url;
        }

        public final String getWorkspacePath() {
            return this.workspacePath;
        }

        public int hashCode() {
            return C0KA.A01(AnonymousClass005.A0I(this.url, AnonymousClass001.A0G(this.alt)), this.deleted) + AnonymousClass006.A0G(this.workspacePath);
        }

        public InlineImage(String str, String str2, boolean z, String str3) {
            AnonymousClass003.A0u(str, str2);
            this.alt = str;
            this.url = str2;
            this.deleted = z;
            this.workspacePath = str3;
        }

        public final InlineImage copy(String str, String str2, boolean z, String str3) {
            AnonymousClass003.A0u(str, str2);
            return new InlineImage(str, str2, z, str3);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ InlineImage(String str, String str2, boolean z, String str3, int i, C06H c06h) {
            this(str, str2, AnonymousClass005.A1O(i, z), AnonymousClass006.A0u(i, str3));
        }
    }

    public final class InlineImageGroup extends HatchContentViewModelData {
        public static final int $stable = 0;
        public final AHD<InlineImage> images;

        public InlineImageGroup(AHD<InlineImage> ahd) {
            C7384Etj.A0Y(ahd, 0);
            this.images = ahd;
        }

        public final InlineImageGroup copy(AHD<InlineImage> ahd) {
            C7384Etj.A0Y(ahd, 0);
            return new InlineImageGroup(ahd);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof InlineImageGroup) && C7384Etj.areEqual(this.images, ((InlineImageGroup) obj).images));
        }

        public static /* synthetic */ InlineImageGroup copy$default(InlineImageGroup inlineImageGroup, AHD ahd, int i, Object obj) {
            if ((i & 1) != 0) {
                ahd = inlineImageGroup.images;
            }
            C7384Etj.A0Y(ahd, 0);
            return new InlineImageGroup(ahd);
        }

        public final AHD<InlineImage> component1() {
            return this.images;
        }

        public final AHD<InlineImage> getImages() {
            return this.images;
        }

        public int hashCode() {
            return this.images.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    /* loaded from: classes2.dex */
    public final class InlineSlides extends HatchContentViewModelData {
        public static final int $stable = 0;
        public final boolean deleted;
        public final String fileName;
        public final boolean loading;
        public final String url;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof InlineSlides) {
                    InlineSlides inlineSlides = (InlineSlides) obj;
                    if (!C7384Etj.areEqual(this.fileName, inlineSlides.fileName) || !C7384Etj.areEqual(this.url, inlineSlides.url) || this.deleted != inlineSlides.deleted || this.loading != inlineSlides.loading) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ InlineSlides copy$default(InlineSlides inlineSlides, String str, String str2, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = inlineSlides.fileName;
            }
            if ((i & 2) != 0) {
                str2 = inlineSlides.url;
            }
            if ((i & 4) != 0) {
                z = inlineSlides.deleted;
            }
            if ((i & 8) != 0) {
                z2 = inlineSlides.loading;
            }
            AnonymousClass003.A0u(str, str2);
            return new InlineSlides(str, str2, z, z2);
        }

        public final String component1() {
            return this.fileName;
        }

        public final String component2() {
            return this.url;
        }

        public final boolean component3() {
            return this.deleted;
        }

        public final boolean component4() {
            return this.loading;
        }

        public final boolean getDeleted() {
            return this.deleted;
        }

        public final String getFileName() {
            return this.fileName;
        }

        public final boolean getLoading() {
            return this.loading;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return C0KA.A00(C0KA.A01(AnonymousClass005.A0I(this.url, AnonymousClass001.A0G(this.fileName)), this.deleted), this.loading);
        }

        public InlineSlides(String str, String str2, boolean z, boolean z2) {
            AnonymousClass003.A0u(str, str2);
            this.fileName = str;
            this.url = str2;
            this.deleted = z;
            this.loading = z2;
        }

        public final InlineSlides copy(String str, String str2, boolean z, boolean z2) {
            AnonymousClass003.A0u(str, str2);
            return new InlineSlides(str, str2, z, z2);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ InlineSlides(String str, String str2, boolean z, boolean z2, int i, C06H c06h) {
            this(str, str2, AnonymousClass005.A1O(i, z), AnonymousClass005.A1P(i, z2));
        }
    }

    /* loaded from: classes2.dex */
    public final class Markdown extends HatchContentViewModelData {
        public static final int $stable = 0;
        public final AuraInlineEntities inlineEntities;
        public final String markdown;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Markdown) {
                    Markdown markdown = (Markdown) obj;
                    if (!C7384Etj.areEqual(this.markdown, markdown.markdown) || !C7384Etj.areEqual(this.inlineEntities, markdown.inlineEntities)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Markdown copy$default(Markdown markdown, String str, AuraInlineEntities auraInlineEntities, int i, Object obj) {
            if ((i & 1) != 0) {
                str = markdown.markdown;
            }
            if ((i & 2) != 0) {
                auraInlineEntities = markdown.inlineEntities;
            }
            return new Markdown(str, auraInlineEntities);
        }

        public final String component1() {
            return this.markdown;
        }

        public final AuraInlineEntities component2() {
            return this.inlineEntities;
        }

        public final Markdown copy(String str, AuraInlineEntities auraInlineEntities) {
            return new Markdown(str, auraInlineEntities);
        }

        public final AuraInlineEntities getInlineEntities() {
            return this.inlineEntities;
        }

        public final String getMarkdown() {
            return this.markdown;
        }

        public int hashCode() {
            return (AnonymousClass006.A0G(this.markdown) * 31) + C3cH.A02(this.inlineEntities);
        }

        public Markdown(String str, AuraInlineEntities auraInlineEntities) {
            this.markdown = str;
            this.inlineEntities = auraInlineEntities;
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ Markdown(String str, AuraInlineEntities auraInlineEntities, int i, C06H c06h) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : auraInlineEntities);
        }

        public Markdown() {
            this(null, null);
        }
    }

    public final class Math extends HatchContentViewModelData {
        public static final int $stable = 0;
        public final boolean displayMode;
        public final String expression;

        public Math(String str, boolean z) {
            C7384Etj.A0Y(str, 0);
            this.expression = str;
            this.displayMode = z;
        }

        public final Math copy(String str, boolean z) {
            C7384Etj.A0Y(str, 0);
            return new Math(str, z);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Math) {
                    Math math = (Math) obj;
                    if (!C7384Etj.areEqual(this.expression, math.expression) || this.displayMode != math.displayMode) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Math copy$default(Math math, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = math.expression;
            }
            if ((i & 2) != 0) {
                z = math.displayMode;
            }
            C7384Etj.A0Y(str, 0);
            return new Math(str, z);
        }

        public final String component1() {
            return this.expression;
        }

        public final boolean component2() {
            return this.displayMode;
        }

        public final boolean getDisplayMode() {
            return this.displayMode;
        }

        public final String getExpression() {
            return this.expression;
        }

        public int hashCode() {
            return C0KA.A00(AnonymousClass001.A0G(this.expression), this.displayMode);
        }

        public String toString() {
            return super.toString();
        }
    }

    /* loaded from: classes2.dex */
    public final class MermaidDiagram extends HatchContentViewModelData {
        public static final int $stable = 0;
        public final boolean isStreaming;
        public final String mermaidSource;
        public final String rawMarkdown;

        public MermaidDiagram(String str, String str2, boolean z) {
            C7384Etj.A0Y(str, 0);
            this.mermaidSource = str;
            this.rawMarkdown = str2;
            this.isStreaming = z;
        }

        public final MermaidDiagram copy(String str, String str2, boolean z) {
            C7384Etj.A0Y(str, 0);
            return new MermaidDiagram(str, str2, z);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof MermaidDiagram) {
                    MermaidDiagram mermaidDiagram = (MermaidDiagram) obj;
                    if (!C7384Etj.areEqual(this.mermaidSource, mermaidDiagram.mermaidSource) || !C7384Etj.areEqual(this.rawMarkdown, mermaidDiagram.rawMarkdown) || this.isStreaming != mermaidDiagram.isStreaming) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ MermaidDiagram copy$default(MermaidDiagram mermaidDiagram, String str, String str2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = mermaidDiagram.mermaidSource;
            }
            if ((i & 2) != 0) {
                str2 = mermaidDiagram.rawMarkdown;
            }
            if ((i & 4) != 0) {
                z = mermaidDiagram.isStreaming;
            }
            return mermaidDiagram.copy(str, str2, z);
        }

        public final String component1() {
            return this.mermaidSource;
        }

        public final String component2() {
            return this.rawMarkdown;
        }

        public final boolean component3() {
            return this.isStreaming;
        }

        public final String getMermaidSource() {
            return this.mermaidSource;
        }

        public final String getRawMarkdown() {
            return this.rawMarkdown;
        }

        public int hashCode() {
            return C0KA.A00((AnonymousClass001.A0G(this.mermaidSource) + AnonymousClass006.A0G(this.rawMarkdown)) * 31, this.isStreaming);
        }

        public final boolean isStreaming() {
            return this.isStreaming;
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ MermaidDiagram(String str, String str2, boolean z, int i, C06H c06h) {
            this(str, str2, AnonymousClass005.A1O(i, z));
        }
    }

    /* loaded from: classes2.dex */
    public final class Table extends HatchContentViewModelData {
        public static final int $stable = 0;
        public final boolean isStreaming;
        public final String rawMarkdown;
        public final HatchTableParamsModel tableParams;

        public Table(HatchTableParamsModel hatchTableParamsModel, String str, boolean z) {
            C7384Etj.A0Y(hatchTableParamsModel, 0);
            this.tableParams = hatchTableParamsModel;
            this.rawMarkdown = str;
            this.isStreaming = z;
        }

        public final Table copy(HatchTableParamsModel hatchTableParamsModel, String str, boolean z) {
            C7384Etj.A0Y(hatchTableParamsModel, 0);
            return new Table(hatchTableParamsModel, str, z);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Table) {
                    Table table = (Table) obj;
                    if (!C7384Etj.areEqual(this.tableParams, table.tableParams) || !C7384Etj.areEqual(this.rawMarkdown, table.rawMarkdown) || this.isStreaming != table.isStreaming) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Table copy$default(Table table, HatchTableParamsModel hatchTableParamsModel, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                hatchTableParamsModel = table.tableParams;
            }
            if ((i & 2) != 0) {
                str = table.rawMarkdown;
            }
            if ((i & 4) != 0) {
                z = table.isStreaming;
            }
            return table.copy(hatchTableParamsModel, str, z);
        }

        public final HatchTableParamsModel component1() {
            return this.tableParams;
        }

        public final String component2() {
            return this.rawMarkdown;
        }

        public final boolean component3() {
            return this.isStreaming;
        }

        public final String getRawMarkdown() {
            return this.rawMarkdown;
        }

        public final HatchTableParamsModel getTableParams() {
            return this.tableParams;
        }

        public int hashCode() {
            return C0KA.A00((AnonymousClass005.A0E(this.tableParams) + AnonymousClass006.A0G(this.rawMarkdown)) * 31, this.isStreaming);
        }

        public final boolean isStreaming() {
            return this.isStreaming;
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ Table(HatchTableParamsModel hatchTableParamsModel, String str, boolean z, int i, C06H c06h) {
            this(hatchTableParamsModel, str, AnonymousClass005.A1O(i, z));
        }
    }

    public /* synthetic */ HatchContentViewModelData(C06H c06h) {
    }

    public HatchContentViewModelData() {
    }
}
