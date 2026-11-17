package com.facebook.aura.file.docx;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06H;
import X.C3cH;
import X.C7384Etj;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class DocElement {

    /* loaded from: classes6.dex */
    public final class Drawing extends DocElement {
        public final String label;

        public Drawing() {
            this(null);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Drawing) && C7384Etj.areEqual(this.label, ((Drawing) obj).label));
        }

        public static /* synthetic */ Drawing copy$default(Drawing drawing, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = drawing.label;
            }
            return new Drawing(str);
        }

        public final String component1() {
            return this.label;
        }

        public final Drawing copy(String str) {
            return new Drawing(str);
        }

        public final String getLabel() {
            return this.label;
        }

        public int hashCode() {
            return AnonymousClass006.A0G(this.label);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ Drawing(String str, int i, C06H c06h) {
            this((i & 1) != 0 ? null : str);
        }

        public Drawing(String str) {
            this.label = str;
        }
    }

    public final class Image extends DocElement {
        public final String altText;
        public final int heightPx;
        public final byte[] imageBytes;
        public final int widthPx;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Image) {
                    Image image = (Image) obj;
                    if (!Arrays.equals(this.imageBytes, image.imageBytes) || this.widthPx != image.widthPx || this.heightPx != image.heightPx || !C7384Etj.areEqual(this.altText, image.altText)) {
                    }
                }
                return false;
            }
            return true;
        }

        public /* synthetic */ Image(byte[] bArr, int i, int i2, String str, int i3, C06H c06h) {
            this(bArr, i, i2, (i3 & 8) != 0 ? "" : str);
        }

        public static /* synthetic */ Image copy$default(Image image, byte[] bArr, int i, int i2, String str, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                bArr = image.imageBytes;
            }
            if ((i3 & 2) != 0) {
                i = image.widthPx;
            }
            if ((i3 & 4) != 0) {
                i2 = image.heightPx;
            }
            if ((i3 & 8) != 0) {
                str = image.altText;
            }
            AnonymousClass003.A0w(bArr, str);
            return new Image(bArr, i, i2, str);
        }

        public final byte[] component1() {
            return this.imageBytes;
        }

        public final int component2() {
            return this.widthPx;
        }

        public final int component3() {
            return this.heightPx;
        }

        public final String component4() {
            return this.altText;
        }

        public final String getAltText() {
            return this.altText;
        }

        public final int getHeightPx() {
            return this.heightPx;
        }

        public final byte[] getImageBytes() {
            return this.imageBytes;
        }

        public final int getWidthPx() {
            return this.widthPx;
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.altText, ((((Arrays.hashCode(this.imageBytes) * 31) + this.widthPx) * 31) + this.heightPx) * 31);
        }

        public final Image copy(byte[] bArr, int i, int i2, String str) {
            AnonymousClass003.A0w(bArr, str);
            return new Image(bArr, i, i2, str);
        }

        public String toString() {
            return super.toString();
        }

        public Image(byte[] bArr, int i, int i2, String str) {
            AnonymousClass003.A0w(bArr, str);
            this.imageBytes = bArr;
            this.widthPx = i;
            this.heightPx = i2;
            this.altText = str;
        }
    }

    public final class Para extends DocElement {
        public final Alignment alignment;
        public final Float defaultFontSizePt;
        public final int headingLevel;
        public final float indentLeftPt;
        public final Float lineSpacingMultiplier;
        public final Float lineSpacingPt;
        public final int listIndex;
        public final int listLevel;
        public final ListStyle listStyle;
        public final List<DocRun> runs;
        public final float spacingAfterPt;
        public final float spacingBeforePt;
        public final String text;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Para) {
                    Para para = (Para) obj;
                    if (!C7384Etj.areEqual(this.text, para.text) || !C7384Etj.areEqual(this.runs, para.runs) || this.alignment != para.alignment || this.headingLevel != para.headingLevel || Float.compare(this.spacingAfterPt, para.spacingAfterPt) != 0 || Float.compare(this.spacingBeforePt, para.spacingBeforePt) != 0 || !C7384Etj.areEqual(this.lineSpacingMultiplier, para.lineSpacingMultiplier) || !C7384Etj.areEqual(this.lineSpacingPt, para.lineSpacingPt) || Float.compare(this.indentLeftPt, para.indentLeftPt) != 0 || !C7384Etj.areEqual(this.defaultFontSizePt, para.defaultFontSizePt) || this.listStyle != para.listStyle || this.listLevel != para.listLevel || this.listIndex != para.listIndex) {
                    }
                }
                return false;
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Para copy$default(Para para, String str, List list, Alignment alignment, int i, float f, float f2, Float f3, Float f4, float f5, Float f6, ListStyle listStyle, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = para.text;
            }
            if ((i4 & 2) != 0) {
                list = para.runs;
            }
            if ((i4 & 4) != 0) {
                alignment = para.alignment;
            }
            if ((i4 & 8) != 0) {
                i = para.headingLevel;
            }
            if ((i4 & 16) != 0) {
                f = para.spacingAfterPt;
            }
            if ((i4 & 32) != 0) {
                f2 = para.spacingBeforePt;
            }
            if ((i4 & 64) != 0) {
                f3 = para.lineSpacingMultiplier;
            }
            if ((i4 & 128) != 0) {
                f4 = para.lineSpacingPt;
            }
            if ((i4 & 256) != 0) {
                f5 = para.indentLeftPt;
            }
            if ((i4 & 512) != 0) {
                f6 = para.defaultFontSizePt;
            }
            if ((i4 & 1024) != 0) {
                listStyle = para.listStyle;
            }
            if ((i4 & 2048) != 0) {
                i2 = para.listLevel;
            }
            if ((i4 & 4096) != 0) {
                i3 = para.listIndex;
            }
            return para.copy(str, list, alignment, i, f, f2, f3, f4, f5, f6, listStyle, i2, i3);
        }

        public final String component1() {
            return this.text;
        }

        public final Float component10() {
            return this.defaultFontSizePt;
        }

        public final ListStyle component11() {
            return this.listStyle;
        }

        public final int component12() {
            return this.listLevel;
        }

        public final int component13() {
            return this.listIndex;
        }

        public final List<DocRun> component2() {
            return this.runs;
        }

        public final Alignment component3() {
            return this.alignment;
        }

        public final int component4() {
            return this.headingLevel;
        }

        public final float component5() {
            return this.spacingAfterPt;
        }

        public final float component6() {
            return this.spacingBeforePt;
        }

        public final Float component7() {
            return this.lineSpacingMultiplier;
        }

        public final Float component8() {
            return this.lineSpacingPt;
        }

        public final float component9() {
            return this.indentLeftPt;
        }

        public final Alignment getAlignment() {
            return this.alignment;
        }

        public final Float getDefaultFontSizePt() {
            return this.defaultFontSizePt;
        }

        public final int getHeadingLevel() {
            return this.headingLevel;
        }

        public final float getIndentLeftPt() {
            return this.indentLeftPt;
        }

        public final Float getLineSpacingMultiplier() {
            return this.lineSpacingMultiplier;
        }

        public final Float getLineSpacingPt() {
            return this.lineSpacingPt;
        }

        public final int getListIndex() {
            return this.listIndex;
        }

        public final int getListLevel() {
            return this.listLevel;
        }

        public final ListStyle getListStyle() {
            return this.listStyle;
        }

        public final List<DocRun> getRuns() {
            return this.runs;
        }

        public final float getSpacingAfterPt() {
            return this.spacingAfterPt;
        }

        public final float getSpacingBeforePt() {
            return this.spacingBeforePt;
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return ((AnonymousClass005.A0F(this.listStyle, (AnonymousClass005.A02((((AnonymousClass005.A02(AnonymousClass005.A02((AnonymousClass005.A0F(this.alignment, AnonymousClass005.A0F(this.runs, AnonymousClass001.A0G(this.text))) + this.headingLevel) * 31, this.spacingAfterPt), this.spacingBeforePt) + AnonymousClass006.A0D(this.lineSpacingMultiplier)) * 31) + AnonymousClass006.A0D(this.lineSpacingPt)) * 31, this.indentLeftPt) + C3cH.A02(this.defaultFontSizePt)) * 31) + this.listLevel) * 31) + this.listIndex;
        }

        public Para(String str, List<DocRun> list, Alignment alignment, int i, float f, float f2, Float f3, Float f4, float f5, Float f6, ListStyle listStyle, int i2, int i3) {
            AnonymousClass005.A0x(str, list, alignment);
            C7384Etj.A0Y(listStyle, 10);
            this.text = str;
            this.runs = list;
            this.alignment = alignment;
            this.headingLevel = i;
            this.spacingAfterPt = f;
            this.spacingBeforePt = f2;
            this.lineSpacingMultiplier = f3;
            this.lineSpacingPt = f4;
            this.indentLeftPt = f5;
            this.defaultFontSizePt = f6;
            this.listStyle = listStyle;
            this.listLevel = i2;
            this.listIndex = i3;
        }

        public final Para copy(String str, List<DocRun> list, Alignment alignment, int i, float f, float f2, Float f3, Float f4, float f5, Float f6, ListStyle listStyle, int i2, int i3) {
            AnonymousClass005.A0x(str, list, alignment);
            C7384Etj.A0Y(listStyle, 10);
            return new Para(str, list, alignment, i, f, f2, f3, f4, f5, f6, listStyle, i2, i3);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ Para(String str, List list, Alignment alignment, int i, float f, float f2, Float f3, Float f4, float f5, Float f6, ListStyle listStyle, int i2, int i3, int i4, C06H c06h) {
            this(str, list, alignment, i, f, (i4 & 32) != 0 ? 0.0f : f2, (i4 & 64) != 0 ? null : f3, (i4 & 128) != 0 ? null : f4, (i4 & 256) != 0 ? 0.0f : f5, (i4 & 512) != 0 ? null : f6, (i4 & 1024) != 0 ? ListStyle.NONE : listStyle, (i4 & 2048) != 0 ? 0 : i2, (i4 & 4096) != 0 ? 0 : i3);
        }
    }

    public final class Table extends DocElement {
        public final List<List<String>> rows;

        /* JADX WARN: Multi-variable type inference failed */
        public Table(List<? extends List<String>> list) {
            C7384Etj.A0Y(list, 0);
            this.rows = list;
        }

        public final Table copy(List<? extends List<String>> list) {
            C7384Etj.A0Y(list, 0);
            return new Table(list);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Table) && C7384Etj.areEqual(this.rows, ((Table) obj).rows));
        }

        public static /* synthetic */ Table copy$default(Table table, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = table.rows;
            }
            C7384Etj.A0Y(list, 0);
            return new Table(list);
        }

        public final List<List<String>> component1() {
            return this.rows;
        }

        public final List<List<String>> getRows() {
            return this.rows;
        }

        public int hashCode() {
            return this.rows.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public /* synthetic */ DocElement(C06H c06h) {
    }

    public DocElement() {
    }
}
