package com.facebook.aura.file.view;

import X.AHD;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06H;
import X.C0KA;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import com.facebook.aura.file.spreadsheet.SpreadsheetSheet;
import java.io.File;
import java.util.List;

/* loaded from: classes.dex */
public abstract class FileContentType {
    public static final int $stable = 8;

    /* loaded from: classes3.dex */
    public final class Audio extends FileContentType {
        public static final int $stable = 0;
        public final boolean isEditable;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Audio) && this.isEditable == ((Audio) obj).isEditable);
        }

        public static /* synthetic */ Audio copy$default(Audio audio, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = audio.isEditable;
            }
            return new Audio(z);
        }

        public final boolean component1() {
            return this.isEditable;
        }

        public final Audio copy(boolean z) {
            return new Audio(z);
        }

        public int hashCode() {
            return this.isEditable ? 1231 : 1237;
        }

        @Override // com.facebook.aura.file.view.FileContentType
        public boolean isEditable() {
            return this.isEditable;
        }

        public /* synthetic */ Audio(boolean z, int i, C06H c06h) {
            this(AnonymousClass001.A1P(i, z));
        }

        public String toString() {
            return super.toString();
        }

        public Audio(boolean z) {
            this.isEditable = z;
        }

        public Audio() {
            this(false);
        }
    }

    public final class Code extends FileContentType {
        public static final int $stable = 0;
        public final String content;
        public final ExternalFileSource externalSource;
        public final boolean isEditable;
        public final boolean previewTruncated;

        public Code(String str, boolean z, boolean z2, ExternalFileSource externalFileSource) {
            C7384Etj.A0Y(str, 0);
            this.content = str;
            this.isEditable = z;
            this.previewTruncated = z2;
            this.externalSource = externalFileSource;
        }

        public final Code copy(String str, boolean z, boolean z2, ExternalFileSource externalFileSource) {
            C7384Etj.A0Y(str, 0);
            return new Code(str, z, z2, externalFileSource);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Code) {
                    Code code = (Code) obj;
                    if (!C7384Etj.areEqual(this.content, code.content) || this.isEditable != code.isEditable || this.previewTruncated != code.previewTruncated || !C7384Etj.areEqual(this.externalSource, code.externalSource)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Code copy$default(Code code, String str, boolean z, boolean z2, ExternalFileSource externalFileSource, int i, Object obj) {
            if ((i & 1) != 0) {
                str = code.content;
            }
            if ((i & 2) != 0) {
                z = code.isEditable;
            }
            if ((i & 4) != 0) {
                z2 = code.previewTruncated;
            }
            if ((i & 8) != 0) {
                externalFileSource = code.externalSource;
            }
            C7384Etj.A0Y(str, 0);
            return new Code(str, z, z2, externalFileSource);
        }

        public final String component1() {
            return this.content;
        }

        public final boolean component2() {
            return this.isEditable;
        }

        public final boolean component3() {
            return this.previewTruncated;
        }

        public final ExternalFileSource component4() {
            return this.externalSource;
        }

        public final String getContent() {
            return this.content;
        }

        public final ExternalFileSource getExternalSource() {
            return this.externalSource;
        }

        public final boolean getPreviewTruncated() {
            return this.previewTruncated;
        }

        public int hashCode() {
            return C0KA.A01(C0KA.A01(AnonymousClass001.A0G(this.content), this.isEditable), this.previewTruncated) + AnonymousClass006.A0D(this.externalSource);
        }

        @Override // com.facebook.aura.file.view.FileContentType
        public boolean isEditable() {
            return this.isEditable;
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ Code(String str, boolean z, boolean z2, ExternalFileSource externalFileSource, int i, C06H c06h) {
            this(str, (i & 2) != 0 ? true : z, AnonymousClass005.A1O(i, z2), (i & 8) != 0 ? null : externalFileSource);
        }
    }

    /* loaded from: classes3.dex */
    public final class Document extends FileContentType {
        public static final int $stable = 8;
        public final File file;
        public final boolean isEditable;

        public Document(File file, boolean z) {
            C7384Etj.A0Y(file, 0);
            this.file = file;
            this.isEditable = z;
        }

        public final Document copy(File file, boolean z) {
            C7384Etj.A0Y(file, 0);
            return new Document(file, z);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Document) {
                    Document document = (Document) obj;
                    if (!C7384Etj.areEqual(this.file, document.file) || this.isEditable != document.isEditable) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Document copy$default(Document document, File file, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                file = document.file;
            }
            if ((i & 2) != 0) {
                z = document.isEditable;
            }
            C7384Etj.A0Y(file, 0);
            return new Document(file, z);
        }

        public final File component1() {
            return this.file;
        }

        public final boolean component2() {
            return this.isEditable;
        }

        public final File getFile() {
            return this.file;
        }

        public int hashCode() {
            return C0KA.A00(AnonymousClass005.A0E(this.file), this.isEditable);
        }

        @Override // com.facebook.aura.file.view.FileContentType
        public boolean isEditable() {
            return this.isEditable;
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ Document(File file, boolean z, int i, C06H c06h) {
            this(file, AnonymousClass001.A1Q(i, z));
        }
    }

    public final class ExternalPreview extends FileContentType {
        public static final int $stable = 0;
        public final boolean isEditable;
        public final boolean isTooLarge;
        public final String mimeType;
        public final ExternalFileSource source;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ExternalPreview) {
                    ExternalPreview externalPreview = (ExternalPreview) obj;
                    if (!C7384Etj.areEqual(this.source, externalPreview.source) || !C7384Etj.areEqual(this.mimeType, externalPreview.mimeType) || this.isTooLarge != externalPreview.isTooLarge || this.isEditable != externalPreview.isEditable) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ ExternalPreview copy$default(ExternalPreview externalPreview, ExternalFileSource externalFileSource, String str, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                externalFileSource = externalPreview.source;
            }
            if ((i & 2) != 0) {
                str = externalPreview.mimeType;
            }
            if ((i & 4) != 0) {
                z = externalPreview.isTooLarge;
            }
            if ((i & 8) != 0) {
                z2 = externalPreview.isEditable;
            }
            AnonymousClass003.A0u(externalFileSource, str);
            return new ExternalPreview(externalFileSource, str, z, z2);
        }

        public final ExternalFileSource component1() {
            return this.source;
        }

        public final String component2() {
            return this.mimeType;
        }

        public final boolean component3() {
            return this.isTooLarge;
        }

        public final boolean component4() {
            return this.isEditable;
        }

        public final String getMimeType() {
            return this.mimeType;
        }

        public final ExternalFileSource getSource() {
            return this.source;
        }

        public int hashCode() {
            return C0KA.A00(C0KA.A01(AnonymousClass005.A0I(this.mimeType, AnonymousClass005.A0E(this.source)), this.isTooLarge), this.isEditable);
        }

        @Override // com.facebook.aura.file.view.FileContentType
        public boolean isEditable() {
            return this.isEditable;
        }

        public final boolean isTooLarge() {
            return this.isTooLarge;
        }

        public ExternalPreview(ExternalFileSource externalFileSource, String str, boolean z, boolean z2) {
            AnonymousClass003.A0u(externalFileSource, str);
            this.source = externalFileSource;
            this.mimeType = str;
            this.isTooLarge = z;
            this.isEditable = z2;
        }

        public final ExternalPreview copy(ExternalFileSource externalFileSource, String str, boolean z, boolean z2) {
            AnonymousClass003.A0u(externalFileSource, str);
            return new ExternalPreview(externalFileSource, str, z, z2);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ ExternalPreview(ExternalFileSource externalFileSource, String str, boolean z, boolean z2, int i, C06H c06h) {
            this(externalFileSource, str, z, AnonymousClass005.A1P(i, z2));
        }
    }

    public final class Html extends FileContentType {
        public static final int $stable = 0;
        public final String content;
        public final boolean isEditable;

        public Html(String str, boolean z) {
            C7384Etj.A0Y(str, 0);
            this.content = str;
            this.isEditable = z;
        }

        public final Html copy(String str, boolean z) {
            C7384Etj.A0Y(str, 0);
            return new Html(str, z);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Html) {
                    Html html = (Html) obj;
                    if (!C7384Etj.areEqual(this.content, html.content) || this.isEditable != html.isEditable) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Html copy$default(Html html, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = html.content;
            }
            if ((i & 2) != 0) {
                z = html.isEditable;
            }
            C7384Etj.A0Y(str, 0);
            return new Html(str, z);
        }

        public final String component1() {
            return this.content;
        }

        public final boolean component2() {
            return this.isEditable;
        }

        public final String getContent() {
            return this.content;
        }

        public int hashCode() {
            return C0KA.A00(AnonymousClass001.A0G(this.content), this.isEditable);
        }

        @Override // com.facebook.aura.file.view.FileContentType
        public boolean isEditable() {
            return this.isEditable;
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ Html(String str, boolean z, int i, C06H c06h) {
            this(str, (i & 2) != 0 ? true : z);
        }
    }

    /* loaded from: classes3.dex */
    public final class Image extends FileContentType {
        public static final int $stable = 0;
        public final boolean isEditable;
        public final String url;

        public Image(String str, boolean z) {
            C7384Etj.A0Y(str, 0);
            this.url = str;
            this.isEditable = z;
        }

        public final Image copy(String str, boolean z) {
            C7384Etj.A0Y(str, 0);
            return new Image(str, z);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Image) {
                    Image image = (Image) obj;
                    if (!C7384Etj.areEqual(this.url, image.url) || this.isEditable != image.isEditable) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Image copy$default(Image image, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = image.url;
            }
            if ((i & 2) != 0) {
                z = image.isEditable;
            }
            C7384Etj.A0Y(str, 0);
            return new Image(str, z);
        }

        public final String component1() {
            return this.url;
        }

        public final boolean component2() {
            return this.isEditable;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return C0KA.A00(AnonymousClass001.A0G(this.url), this.isEditable);
        }

        @Override // com.facebook.aura.file.view.FileContentType
        public boolean isEditable() {
            return this.isEditable;
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ Image(String str, boolean z, int i, C06H c06h) {
            this(str, AnonymousClass001.A1Q(i, z));
        }
    }

    /* loaded from: classes3.dex */
    public final class Pdf extends FileContentType {
        public static final int $stable = 8;
        public final File file;
        public final boolean isEditable;

        public Pdf(File file, boolean z) {
            C7384Etj.A0Y(file, 0);
            this.file = file;
            this.isEditable = z;
        }

        public final Pdf copy(File file, boolean z) {
            C7384Etj.A0Y(file, 0);
            return new Pdf(file, z);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Pdf) {
                    Pdf pdf = (Pdf) obj;
                    if (!C7384Etj.areEqual(this.file, pdf.file) || this.isEditable != pdf.isEditable) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Pdf copy$default(Pdf pdf, File file, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                file = pdf.file;
            }
            if ((i & 2) != 0) {
                z = pdf.isEditable;
            }
            C7384Etj.A0Y(file, 0);
            return new Pdf(file, z);
        }

        public final File component1() {
            return this.file;
        }

        public final boolean component2() {
            return this.isEditable;
        }

        public final File getFile() {
            return this.file;
        }

        public int hashCode() {
            return C0KA.A00(AnonymousClass005.A0E(this.file), this.isEditable);
        }

        @Override // com.facebook.aura.file.view.FileContentType
        public boolean isEditable() {
            return this.isEditable;
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ Pdf(File file, boolean z, int i, C06H c06h) {
            this(file, AnonymousClass001.A1Q(i, z));
        }
    }

    /* loaded from: classes3.dex */
    public final class Presentation extends FileContentType {
        public static final int $stable = 8;
        public final File file;
        public final boolean isEditable;

        public Presentation(File file, boolean z) {
            C7384Etj.A0Y(file, 0);
            this.file = file;
            this.isEditable = z;
        }

        public final Presentation copy(File file, boolean z) {
            C7384Etj.A0Y(file, 0);
            return new Presentation(file, z);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Presentation) {
                    Presentation presentation = (Presentation) obj;
                    if (!C7384Etj.areEqual(this.file, presentation.file) || this.isEditable != presentation.isEditable) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Presentation copy$default(Presentation presentation, File file, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                file = presentation.file;
            }
            if ((i & 2) != 0) {
                z = presentation.isEditable;
            }
            C7384Etj.A0Y(file, 0);
            return new Presentation(file, z);
        }

        public final File component1() {
            return this.file;
        }

        public final boolean component2() {
            return this.isEditable;
        }

        public final File getFile() {
            return this.file;
        }

        public int hashCode() {
            return C0KA.A00(AnonymousClass005.A0E(this.file), this.isEditable);
        }

        @Override // com.facebook.aura.file.view.FileContentType
        public boolean isEditable() {
            return this.isEditable;
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ Presentation(File file, boolean z, int i, C06H c06h) {
            this(file, AnonymousClass001.A1Q(i, z));
        }
    }

    public final class Slides extends FileContentType {
        public static final int $stable = 8;
        public final boolean isEditable;
        public final List<SlideInfo> slides;
        public final String title;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Slides) {
                    Slides slides = (Slides) obj;
                    if (!C7384Etj.areEqual(this.title, slides.title) || !C7384Etj.areEqual(this.slides, slides.slides) || this.isEditable != slides.isEditable) {
                    }
                }
                return false;
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Slides copy$default(Slides slides, String str, List list, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = slides.title;
            }
            if ((i & 2) != 0) {
                list = slides.slides;
            }
            if ((i & 4) != 0) {
                z = slides.isEditable;
            }
            return slides.copy(str, list, z);
        }

        public final String component1() {
            return this.title;
        }

        public final List<SlideInfo> component2() {
            return this.slides;
        }

        public final boolean component3() {
            return this.isEditable;
        }

        public final List<SlideInfo> getSlides() {
            return this.slides;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return C0KA.A00(AnonymousClass005.A0F(this.slides, AnonymousClass001.A0G(this.title)), this.isEditable);
        }

        @Override // com.facebook.aura.file.view.FileContentType
        public boolean isEditable() {
            return this.isEditable;
        }

        public Slides(String str, List<SlideInfo> list, boolean z) {
            AnonymousClass003.A0u(str, list);
            this.title = str;
            this.slides = list;
            this.isEditable = z;
        }

        public final Slides copy(String str, List<SlideInfo> list, boolean z) {
            AnonymousClass003.A0u(str, list);
            return new Slides(str, list, z);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ Slides(String str, List list, boolean z, int i, C06H c06h) {
            this(str, list, (i & 4) != 0 ? true : z);
        }
    }

    /* loaded from: classes3.dex */
    public final class Spreadsheet extends FileContentType {
        public static final int $stable = 8;
        public final ExternalFileSource externalSource;
        public final File file;
        public final boolean isEditable;
        public final boolean previewTruncated;
        public final AHD<SpreadsheetSheet> sheets;

        public Spreadsheet(AHD<SpreadsheetSheet> ahd, boolean z, ExternalFileSource externalFileSource, File file, boolean z2) {
            C7384Etj.A0Y(ahd, 0);
            this.sheets = ahd;
            this.previewTruncated = z;
            this.externalSource = externalFileSource;
            this.file = file;
            this.isEditable = z2;
        }

        public final Spreadsheet copy(AHD<SpreadsheetSheet> ahd, boolean z, ExternalFileSource externalFileSource, File file, boolean z2) {
            C7384Etj.A0Y(ahd, 0);
            return new Spreadsheet(ahd, z, externalFileSource, file, z2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Spreadsheet) {
                    Spreadsheet spreadsheet = (Spreadsheet) obj;
                    if (!C7384Etj.areEqual(this.sheets, spreadsheet.sheets) || this.previewTruncated != spreadsheet.previewTruncated || !C7384Etj.areEqual(this.externalSource, spreadsheet.externalSource) || !C7384Etj.areEqual(this.file, spreadsheet.file) || this.isEditable != spreadsheet.isEditable) {
                    }
                }
                return false;
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Spreadsheet copy$default(Spreadsheet spreadsheet, AHD ahd, boolean z, ExternalFileSource externalFileSource, File file, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                ahd = spreadsheet.sheets;
            }
            if ((i & 2) != 0) {
                z = spreadsheet.previewTruncated;
            }
            if ((i & 4) != 0) {
                externalFileSource = spreadsheet.externalSource;
            }
            if ((i & 8) != 0) {
                file = spreadsheet.file;
            }
            if ((i & 16) != 0) {
                z2 = spreadsheet.isEditable;
            }
            return spreadsheet.copy(ahd, z, externalFileSource, file, z2);
        }

        public final AHD<SpreadsheetSheet> component1() {
            return this.sheets;
        }

        public final boolean component2() {
            return this.previewTruncated;
        }

        public final ExternalFileSource component3() {
            return this.externalSource;
        }

        public final File component4() {
            return this.file;
        }

        public final boolean component5() {
            return this.isEditable;
        }

        public final ExternalFileSource getExternalSource() {
            return this.externalSource;
        }

        public final File getFile() {
            return this.file;
        }

        public final boolean getPreviewTruncated() {
            return this.previewTruncated;
        }

        public final AHD<SpreadsheetSheet> getSheets() {
            return this.sheets;
        }

        public int hashCode() {
            return C0KA.A00((((C0KA.A01(AnonymousClass005.A0E(this.sheets), this.previewTruncated) + AnonymousClass006.A0D(this.externalSource)) * 31) + C3cH.A02(this.file)) * 31, this.isEditable);
        }

        @Override // com.facebook.aura.file.view.FileContentType
        public boolean isEditable() {
            return this.isEditable;
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ Spreadsheet(AHD ahd, boolean z, ExternalFileSource externalFileSource, File file, boolean z2, int i, C06H c06h) {
            this(ahd, AnonymousClass001.A1Q(i, z), (i & 4) != 0 ? null : externalFileSource, (i & 8) != 0 ? null : file, C3cI.A1S(i, z2));
        }
    }

    public final class Text extends FileContentType {
        public static final int $stable = 0;
        public final String content;
        public final ExternalFileSource externalSource;
        public final boolean isEditable;
        public final boolean previewTruncated;

        public Text(String str, boolean z, boolean z2, ExternalFileSource externalFileSource) {
            C7384Etj.A0Y(str, 0);
            this.content = str;
            this.isEditable = z;
            this.previewTruncated = z2;
            this.externalSource = externalFileSource;
        }

        public final Text copy(String str, boolean z, boolean z2, ExternalFileSource externalFileSource) {
            C7384Etj.A0Y(str, 0);
            return new Text(str, z, z2, externalFileSource);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Text) {
                    Text text = (Text) obj;
                    if (!C7384Etj.areEqual(this.content, text.content) || this.isEditable != text.isEditable || this.previewTruncated != text.previewTruncated || !C7384Etj.areEqual(this.externalSource, text.externalSource)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Text copy$default(Text text, String str, boolean z, boolean z2, ExternalFileSource externalFileSource, int i, Object obj) {
            if ((i & 1) != 0) {
                str = text.content;
            }
            if ((i & 2) != 0) {
                z = text.isEditable;
            }
            if ((i & 4) != 0) {
                z2 = text.previewTruncated;
            }
            if ((i & 8) != 0) {
                externalFileSource = text.externalSource;
            }
            C7384Etj.A0Y(str, 0);
            return new Text(str, z, z2, externalFileSource);
        }

        public final String component1() {
            return this.content;
        }

        public final boolean component2() {
            return this.isEditable;
        }

        public final boolean component3() {
            return this.previewTruncated;
        }

        public final ExternalFileSource component4() {
            return this.externalSource;
        }

        public final String getContent() {
            return this.content;
        }

        public final ExternalFileSource getExternalSource() {
            return this.externalSource;
        }

        public final boolean getPreviewTruncated() {
            return this.previewTruncated;
        }

        public int hashCode() {
            return C0KA.A01(C0KA.A01(AnonymousClass001.A0G(this.content), this.isEditable), this.previewTruncated) + AnonymousClass006.A0D(this.externalSource);
        }

        @Override // com.facebook.aura.file.view.FileContentType
        public boolean isEditable() {
            return this.isEditable;
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ Text(String str, boolean z, boolean z2, ExternalFileSource externalFileSource, int i, C06H c06h) {
            this(str, (i & 2) != 0 ? true : z, AnonymousClass005.A1O(i, z2), (i & 8) != 0 ? null : externalFileSource);
        }
    }

    /* loaded from: classes3.dex */
    public final class Unknown extends FileContentType {
        public static final int $stable = 0;
        public final boolean isEditable;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Unknown) && this.isEditable == ((Unknown) obj).isEditable);
        }

        public static /* synthetic */ Unknown copy$default(Unknown unknown, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = unknown.isEditable;
            }
            return new Unknown(z);
        }

        public final boolean component1() {
            return this.isEditable;
        }

        public final Unknown copy(boolean z) {
            return new Unknown(z);
        }

        public int hashCode() {
            return this.isEditable ? 1231 : 1237;
        }

        @Override // com.facebook.aura.file.view.FileContentType
        public boolean isEditable() {
            return this.isEditable;
        }

        public /* synthetic */ Unknown(boolean z, int i, C06H c06h) {
            this(AnonymousClass001.A1P(i, z));
        }

        public String toString() {
            return super.toString();
        }

        public Unknown(boolean z) {
            this.isEditable = z;
        }

        public Unknown() {
            this(false);
        }
    }

    /* loaded from: classes3.dex */
    public final class Video extends FileContentType {
        public static final int $stable = 0;
        public final boolean isEditable;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Video) && this.isEditable == ((Video) obj).isEditable);
        }

        public static /* synthetic */ Video copy$default(Video video, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = video.isEditable;
            }
            return new Video(z);
        }

        public final boolean component1() {
            return this.isEditable;
        }

        public final Video copy(boolean z) {
            return new Video(z);
        }

        public int hashCode() {
            return this.isEditable ? 1231 : 1237;
        }

        @Override // com.facebook.aura.file.view.FileContentType
        public boolean isEditable() {
            return this.isEditable;
        }

        public /* synthetic */ Video(boolean z, int i, C06H c06h) {
            this(AnonymousClass001.A1P(i, z));
        }

        public String toString() {
            return super.toString();
        }

        public Video(boolean z) {
            this.isEditable = z;
        }

        public Video() {
            this(false);
        }
    }

    public abstract boolean isEditable();

    public /* synthetic */ FileContentType(C06H c06h) {
    }

    public FileContentType() {
    }
}
