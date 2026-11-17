package com.facebook.aura.file.docx;

import X.AbstractC5321DgF;
import X.AbstractC7559F3s;
import X.AbstractC7610F5x;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.BV4;
import X.C06G;
import X.C0881AGi;
import X.C1051ASv;
import X.C10543Hqv;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C7384Etj;
import X.C7BY;
import X.C8j4;
import X.C9jH;
import X.C9tI;
import X.C9tJ;
import X.F0C;
import X.F1E;
import X.F1F;
import X.G0U;
import X.HwV;
import com.facebook.aura.analytics.waterfall.HatchPriceImpressionEventDataKt;
import com.facebook.aura.file.docx.DocElement;
import com.facebook.aura.file.docx.OoxmlArchiveGuard;
import com.facebook.aura.network.api.HatchUrlSegments;
import com.facebook.aura.pairs.PairsDiscretionDocument;
import com.facebook.aura.wearablebroadcast.MetaAiAppBroadcastSender;
import com.facebook.aura.widgets.WidgetComponentsKt;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import kotlin.Unit;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/* loaded from: classes6.dex */
public final class DocxParser {
    public static final String A_NS = "http://schemas.openxmlformats.org/drawingml/2006/main";
    public static final int DEFAULT_DPI = 96;
    public static final float DEFAULT_SPACING_AFTER_PT = 8.0f;
    public static final String DOCUMENT_XML = "word/document.xml";
    public static final long EMU_PER_INCH = 914400;
    public static final String HEADING_STYLE_PREFIX = "heading";
    public static final int MAX_DOCUMENT_ELEMENTS = 10000;
    public static final long MAX_DOCUMENT_XML_BYTES = 4194304;
    public static final long MAX_METADATA_XML_BYTES = 2097152;
    public static final int MAX_TABLE_COLUMNS = 100;
    public static final int MAX_TABLE_ROWS = 1000;
    public static final String MEDIA_PREFIX = "word/media/";
    public static final String NUMBERING_XML = "word/numbering.xml";
    public static final String PIC_NS = "http://schemas.openxmlformats.org/drawingml/2006/picture";
    public static final String RELS_NS = "http://schemas.openxmlformats.org/package/2006/relationships";
    public static final String RELS_XML = "word/_rels/document.xml.rels";
    public static final String R_NS = "http://schemas.openxmlformats.org/officeDocument/2006/relationships";
    public static final String STYLES_XML = "word/styles.xml";
    public static final String WP_NS = "http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing";
    public static final String W_NS = "http://schemas.openxmlformats.org/wordprocessingml/2006/main";
    public static final DocxParser INSTANCE = new DocxParser();
    public static final F0C builderFactory$delegate = AbstractC5321DgF.A03(DocxParser$builderFactory$2.INSTANCE);

    public final class ArchiveContents {
        public byte[] documentXmlBytes;
        public final Map<String, byte[]> mediaFiles = C3cG.A0j();
        public byte[] numberingXmlBytes;
        public byte[] relsXmlBytes;
        public byte[] stylesXmlBytes;

        public final byte[] getDocumentXmlBytes() {
            return this.documentXmlBytes;
        }

        public final Map<String, byte[]> getMediaFiles() {
            return this.mediaFiles;
        }

        public final byte[] getNumberingXmlBytes() {
            return this.numberingXmlBytes;
        }

        public final byte[] getRelsXmlBytes() {
            return this.relsXmlBytes;
        }

        public final byte[] getStylesXmlBytes() {
            return this.stylesXmlBytes;
        }

        public final void setDocumentXmlBytes(byte[] bArr) {
            this.documentXmlBytes = bArr;
        }

        public final void setNumberingXmlBytes(byte[] bArr) {
            this.numberingXmlBytes = bArr;
        }

        public final void setRelsXmlBytes(byte[] bArr) {
            this.relsXmlBytes = bArr;
        }

        public final void setStylesXmlBytes(byte[] bArr) {
            this.stylesXmlBytes = bArr;
        }
    }

    public final class DocStyles {
        public final Map<String, String> basedOn;
        public final Float defaultSizePt;
        public final Map<String, Integer> headingLevels;
        public final Map<String, Float> styleSizesPt;

        public final Map<String, Integer> getHeadingLevels() {
            return this.headingLevels;
        }

        public DocStyles(Map<String, Integer> map, Map<String, Float> map2, Map<String, String> map3, Float f) {
            AnonymousClass005.A0x(map, map2, map3);
            this.headingLevels = map;
            this.styleSizesPt = map2;
            this.basedOn = map3;
            this.defaultSizePt = f;
        }

        public final Float resolveDefaultSizePt(String str) {
            HashSet hashSetA13 = C60O.A13();
            while (str != null && hashSetA13.add(str)) {
                Float f = this.styleSizesPt.get(str);
                if (f != null) {
                    return f;
                }
                str = this.basedOn.get(str);
            }
            return this.defaultSizePt;
        }
    }

    public final class ParagraphParseResult extends C06G {
        public final List<DocElement> elements;
        public final String numId;

        /* JADX WARN: Multi-variable type inference failed */
        public ParagraphParseResult(List<? extends DocElement> list, String str) {
            C7384Etj.A0Y(list, 0);
            this.elements = list;
            this.numId = str;
        }

        public final ParagraphParseResult copy(List<? extends DocElement> list, String str) {
            C7384Etj.A0Y(list, 0);
            return new ParagraphParseResult(list, str);
        }

        public static /* synthetic */ ParagraphParseResult copy$default(ParagraphParseResult paragraphParseResult, List list, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                list = paragraphParseResult.elements;
            }
            if ((i & 2) != 0) {
                str = paragraphParseResult.numId;
            }
            C7384Etj.A0Y(list, 0);
            return new ParagraphParseResult(list, str);
        }

        public final List<DocElement> component1() {
            return this.elements;
        }

        public final String component2() {
            return this.numId;
        }

        public final List<DocElement> getElements() {
            return this.elements;
        }

        public final String getNumId() {
            return this.numId;
        }

        public boolean equals(Object obj) {
            return super.equals(obj);
        }

        public int hashCode() {
            return super.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class ParagraphSpacing extends C06G {
        public final float afterPt;
        public final float beforePt;
        public final Float lineMultiplier;
        public final Float linePt;

        public static /* synthetic */ ParagraphSpacing copy$default(ParagraphSpacing paragraphSpacing, float f, float f2, Float f3, Float f4, int i, Object obj) {
            if ((i & 1) != 0) {
                f = paragraphSpacing.beforePt;
            }
            if ((i & 2) != 0) {
                f2 = paragraphSpacing.afterPt;
            }
            if ((i & 4) != 0) {
                f3 = paragraphSpacing.lineMultiplier;
            }
            if ((i & 8) != 0) {
                f4 = paragraphSpacing.linePt;
            }
            return new ParagraphSpacing(f, f2, f3, f4);
        }

        public final float component1() {
            return this.beforePt;
        }

        public final float component2() {
            return this.afterPt;
        }

        public final Float component3() {
            return this.lineMultiplier;
        }

        public final Float component4() {
            return this.linePt;
        }

        public final ParagraphSpacing copy(float f, float f2, Float f3, Float f4) {
            return new ParagraphSpacing(f, f2, f3, f4);
        }

        public final float getAfterPt() {
            return this.afterPt;
        }

        public final float getBeforePt() {
            return this.beforePt;
        }

        public final Float getLineMultiplier() {
            return this.lineMultiplier;
        }

        public final Float getLinePt() {
            return this.linePt;
        }

        public ParagraphSpacing(float f, float f2, Float f3, Float f4) {
            this.beforePt = f;
            this.afterPt = f2;
            this.lineMultiplier = f3;
            this.linePt = f4;
        }

        public boolean equals(Object obj) {
            return super.equals(obj);
        }

        public int hashCode() {
            return super.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    /* loaded from: classes3.dex */
    public final class PreviewResult {
        public final List<DocElement> elements;
        public final boolean truncated;

        /* JADX WARN: Multi-variable type inference failed */
        public PreviewResult(List<? extends DocElement> list, boolean z) {
            C7384Etj.A0Y(list, 0);
            this.elements = list;
            this.truncated = z;
        }

        public final List<DocElement> getElements() {
            return this.elements;
        }

        public final boolean getTruncated() {
            return this.truncated;
        }
    }

    public final class RenderBudget {
        public boolean truncated;

        public final boolean getTruncated() {
            return this.truncated;
        }

        public final void setTruncated(boolean z) {
            this.truncated = z;
        }
    }

    /* renamed from: com.facebook.aura.file.docx.DocxParser$extractCellText$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<Node, Unit> {
        public final /* synthetic */ List<String> $parts;

        /* renamed from: com.facebook.aura.file.docx.DocxParser$extractCellText$1$1, reason: invalid class name and collision with other inner class name */
        public final class C01531 extends AbstractC7559F3s implements G0U<Node, Unit> {
            public final /* synthetic */ StringBuilder $paraText;

            /* renamed from: com.facebook.aura.file.docx.DocxParser$extractCellText$1$1$1, reason: invalid class name and collision with other inner class name */
            public final class C01541 extends AbstractC7559F3s implements G0U<Node, Unit> {
                public final /* synthetic */ StringBuilder $paraText;

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Node node) throws DOMException {
                    C7384Etj.A0Y(node, 0);
                    StringBuilder sb = this.$paraText;
                    String textContent = node.getTextContent();
                    if (textContent == null) {
                        textContent = "";
                    }
                    sb.append(textContent);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C01541(StringBuilder sb) {
                    super(1);
                    this.$paraText = sb;
                }

                @Override // X.G0U
                public /* bridge */ /* synthetic */ Unit invoke(Node node) throws DOMException {
                    invoke2(node);
                    return Unit.INSTANCE;
                }
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Node node) {
                C7384Etj.A0Y(node, 0);
                XmlHelpers.INSTANCE.forEachChild(node, "t", new C01541(this.$paraText));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01531(StringBuilder sb) {
                super(1);
                this.$paraText = sb;
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Unit invoke(Node node) {
                invoke2(node);
                return Unit.INSTANCE;
            }
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Node node) {
            C7384Etj.A0Y(node, 0);
            StringBuilder sbA0w = C60O.A0w();
            XmlHelpers.INSTANCE.forEachChild(node, "r", new C01531(sbA0w));
            this.$parts.add(sbA0w.toString());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List<String> list) {
            super(1);
            this.$parts = list;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(Node node) {
            invoke2(node);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.file.docx.DocxParser$parse$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0U<Node, Boolean> {
        public final /* synthetic */ ArchiveContents $archive;
        public final /* synthetic */ RenderBudget $budget;
        public final /* synthetic */ List<DocElement> $elements;
        public final /* synthetic */ C10543Hqv<String> $lastNumId;
        public final /* synthetic */ Map<String, Integer> $listCounters;
        public final /* synthetic */ Map<String, ListStyle> $numberingMap;
        public final /* synthetic */ Map<String, String> $relsMap;
        public final /* synthetic */ DocStyles $styles;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
        @Override // X.G0U
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Boolean invoke(org.w3c.dom.Node r13) {
            /*
                r12 = this;
                r2 = 0
                r5 = r13
                X.C7384Etj.A0Y(r13, r2)
                java.util.List<com.facebook.aura.file.docx.DocElement> r0 = r12.$elements
                int r1 = r0.size()
                r0 = 10000(0x2710, float:1.4013E-41)
                r3 = 1
                if (r1 < r0) goto L19
                com.facebook.aura.file.docx.DocxParser$RenderBudget r0 = r12.$budget
                r0.truncated = r3
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
                return r0
            L19:
                java.lang.String r2 = r13.getLocalName()
                if (r2 == 0) goto L4c
                int r1 = r2.hashCode()
                r0 = 112(0x70, float:1.57E-43)
                if (r1 == r0) goto L62
                r0 = 114622(0x1bfbe, float:1.6062E-40)
                if (r1 == r0) goto L51
                r0 = 1590178495(0x5ec832bf, float:7.2129013E18)
                if (r1 != r0) goto L4c
                java.lang.String r0 = "AlternateContent"
                boolean r0 = r2.equals(r0)
                if (r0 == 0) goto L4c
                com.facebook.aura.file.docx.DocxParser r2 = com.facebook.aura.file.docx.DocxParser.INSTANCE
                java.util.Map<java.lang.String, java.lang.String> r1 = r12.$relsMap
                com.facebook.aura.file.docx.DocxParser$ArchiveContents r0 = r12.$archive
                java.util.Map<java.lang.String, byte[]> r0 = r0.mediaFiles
                com.facebook.aura.file.docx.DocElement r1 = com.facebook.aura.file.docx.DocxParser.access$parseAlternateContent(r2, r13, r1, r0)
            L45:
                if (r1 == 0) goto L4c
                java.util.List<com.facebook.aura.file.docx.DocElement> r0 = r12.$elements
                r0.add(r1)
            L4c:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
                return r0
            L51:
                java.lang.String r0 = "tbl"
                boolean r0 = r2.equals(r0)
                if (r0 == 0) goto L4c
                com.facebook.aura.file.docx.DocxParser r1 = com.facebook.aura.file.docx.DocxParser.INSTANCE
                com.facebook.aura.file.docx.DocxParser$RenderBudget r0 = r12.$budget
                com.facebook.aura.file.docx.DocElement$Table r1 = com.facebook.aura.file.docx.DocxParser.access$parseTable(r1, r13, r0)
                goto L45
            L62:
                java.lang.String r0 = "p"
                boolean r0 = r2.equals(r0)
                if (r0 == 0) goto L4c
                com.facebook.aura.file.docx.DocxParser r4 = com.facebook.aura.file.docx.DocxParser.INSTANCE
                com.facebook.aura.file.docx.DocxParser$DocStyles r6 = r12.$styles
                java.util.Map<java.lang.String, com.facebook.aura.file.docx.ListStyle> r7 = r12.$numberingMap
                java.util.Map<java.lang.String, java.lang.String> r8 = r12.$relsMap
                com.facebook.aura.file.docx.DocxParser$ArchiveContents r0 = r12.$archive
                java.util.Map<java.lang.String, byte[]> r9 = r0.mediaFiles
                java.util.Map<java.lang.String, java.lang.Integer> r10 = r12.$listCounters
                X.Hqv<java.lang.String> r0 = r12.$lastNumId
                T r11 = r0.element
                java.lang.String r11 = (java.lang.String) r11
                com.facebook.aura.file.docx.DocxParser$ParagraphParseResult r2 = com.facebook.aura.file.docx.DocxParser.access$parseParagraphElements(r4, r5, r6, r7, r8, r9, r10, r11)
                java.util.List<com.facebook.aura.file.docx.DocElement> r1 = r12.$elements
                java.util.List<com.facebook.aura.file.docx.DocElement> r0 = r2.elements
                r1.addAll(r0)
                X.Hqv<java.lang.String> r1 = r12.$lastNumId
                java.lang.String r0 = r2.numId
                if (r0 != 0) goto L91
                T r0 = r1.element
            L91:
                r1.element = r0
                goto L4c
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.docx.DocxParser.AnonymousClass3.invoke(org.w3c.dom.Node):java.lang.Boolean");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(List<DocElement> list, RenderBudget renderBudget, DocStyles docStyles, Map<String, ListStyle> map, Map<String, String> map2, ArchiveContents archiveContents, Map<String, Integer> map3, C10543Hqv<String> c10543Hqv) {
            super(1);
            this.$elements = list;
            this.$budget = renderBudget;
            this.$styles = docStyles;
            this.$numberingMap = map;
            this.$relsMap = map2;
            this.$archive = archiveContents;
            this.$listCounters = map3;
            this.$lastNumId = c10543Hqv;
        }
    }

    /* renamed from: com.facebook.aura.file.docx.DocxParser$parseParagraphElements$1, reason: invalid class name and case insensitive filesystem */
    public final class C119041 extends AbstractC7559F3s implements G0U<Node, Unit> {
        public final /* synthetic */ C10543Hqv<Alignment> $alignment;
        public final /* synthetic */ C10543Hqv<Float> $defaultFontSizePt;
        public final /* synthetic */ F1E $headingLevel;
        public final /* synthetic */ List<DocElement> $images;
        public final /* synthetic */ C1051ASv $indentLeftPt;
        public final /* synthetic */ C10543Hqv<Float> $lineSpacingMultiplier;
        public final /* synthetic */ C10543Hqv<Float> $lineSpacingPt;
        public final /* synthetic */ F1E $listLevel;
        public final /* synthetic */ C10543Hqv<ListStyle> $listStyle;
        public final /* synthetic */ Map<String, byte[]> $mediaFiles;
        public final /* synthetic */ C10543Hqv<String> $numId;
        public final /* synthetic */ Map<String, ListStyle> $numberingMap;
        public final /* synthetic */ Map<String, String> $relsMap;
        public final /* synthetic */ List<DocRun> $runs;
        public final /* synthetic */ C1051ASv $spacingAfterPt;
        public final /* synthetic */ C1051ASv $spacingBeforePt;
        public final /* synthetic */ DocStyles $styles;

        /* renamed from: com.facebook.aura.file.docx.DocxParser$parseParagraphElements$1$1, reason: invalid class name and collision with other inner class name */
        public final class C01551 extends AbstractC7559F3s implements G0U<Node, Unit> {
            public final /* synthetic */ List<DocElement> $images;
            public final /* synthetic */ Map<String, byte[]> $mediaFiles;
            public final /* synthetic */ Map<String, String> $relsMap;
            public final /* synthetic */ List<DocRun> $runs;

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Node node) {
                C7384Etj.A0Y(node, 0);
                DocxParser.INSTANCE.parseRunElements(node, this.$relsMap, this.$mediaFiles, this.$runs, this.$images);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01551(Map<String, String> map, Map<String, byte[]> map2, List<DocRun> list, List<DocElement> list2) {
                super(1);
                this.$relsMap = map;
                this.$mediaFiles = map2;
                this.$runs = list;
                this.$images = list2;
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Unit invoke(Node node) {
                invoke2(node);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: Type inference failed for: r0v12, types: [T, java.lang.Float] */
        /* JADX WARN: Type inference failed for: r0v15, types: [T, java.lang.Float] */
        /* JADX WARN: Type inference failed for: r0v16, types: [T, java.lang.Float] */
        /* JADX WARN: Type inference failed for: r0v19, types: [A, T] */
        /* JADX WARN: Type inference failed for: r0v22, types: [C, T] */
        /* JADX WARN: Type inference failed for: r0v6, types: [T, com.facebook.aura.file.docx.Alignment] */
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Node node) {
            C7384Etj.A0Y(node, 0);
            String localName = node.getLocalName();
            if (localName != null) {
                int iHashCode = localName.hashCode();
                if (iHashCode == 114) {
                    if (localName.equals("r")) {
                        DocxParser.INSTANCE.parseRunElements(node, this.$relsMap, this.$mediaFiles, this.$runs, this.$images);
                        return;
                    }
                    return;
                }
                if (iHashCode != 110226) {
                    if (iHashCode == 751294566) {
                        if (localName.equals("hyperlink")) {
                            XmlHelpers.INSTANCE.forEachChild(node, "r", new C01551(this.$relsMap, this.$mediaFiles, this.$runs, this.$images));
                            return;
                        }
                        return;
                    } else {
                        if (iHashCode == 1590178495 && localName.equals("AlternateContent")) {
                            this.$images.add(DocxParser.INSTANCE.parseAlternateContent(node, this.$relsMap, this.$mediaFiles));
                            return;
                        }
                        return;
                    }
                }
                if (localName.equals("pPr")) {
                    C10543Hqv<Alignment> c10543Hqv = this.$alignment;
                    DocxParser docxParser = DocxParser.INSTANCE;
                    c10543Hqv.element = docxParser.parseParagraphAlignment(node);
                    this.$headingLevel.element = docxParser.parseParagraphHeading(node, this.$styles.headingLevels);
                    XmlHelpers xmlHelpers = XmlHelpers.INSTANCE;
                    Node nodeFindChild = xmlHelpers.findChild(node, "pStyle");
                    this.$defaultFontSizePt.element = this.$styles.resolveDefaultSizePt(nodeFindChild != null ? xmlHelpers.attrNS(nodeFindChild, DocxParser.W_NS, "val") : null);
                    ParagraphSpacing spacing = docxParser.parseSpacing(node);
                    this.$spacingBeforePt.element = spacing.beforePt;
                    this.$spacingAfterPt.element = spacing.afterPt;
                    this.$lineSpacingMultiplier.element = spacing.lineMultiplier;
                    this.$lineSpacingPt.element = spacing.linePt;
                    this.$indentLeftPt.element = docxParser.parseIndent(node);
                    HwV listProperties = docxParser.parseListProperties(node, this.$numberingMap);
                    this.$listStyle.element = listProperties.first;
                    this.$listLevel.element = AnonymousClass001.A0F(listProperties.second);
                    this.$numId.element = listProperties.third;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C119041(C10543Hqv<Alignment> c10543Hqv, F1E f1e, DocStyles docStyles, C10543Hqv<Float> c10543Hqv2, C1051ASv c1051ASv, C1051ASv c1051ASv2, C10543Hqv<Float> c10543Hqv3, C10543Hqv<Float> c10543Hqv4, C1051ASv c1051ASv3, Map<String, ? extends ListStyle> map, C10543Hqv<ListStyle> c10543Hqv5, F1E f1e2, C10543Hqv<String> c10543Hqv6, Map<String, String> map2, Map<String, byte[]> map3, List<DocRun> list, List<DocElement> list2) {
            super(1);
            this.$alignment = c10543Hqv;
            this.$headingLevel = f1e;
            this.$styles = docStyles;
            this.$defaultFontSizePt = c10543Hqv2;
            this.$spacingBeforePt = c1051ASv;
            this.$spacingAfterPt = c1051ASv2;
            this.$lineSpacingMultiplier = c10543Hqv3;
            this.$lineSpacingPt = c10543Hqv4;
            this.$indentLeftPt = c1051ASv3;
            this.$numberingMap = map;
            this.$listStyle = c10543Hqv5;
            this.$listLevel = f1e2;
            this.$numId = c10543Hqv6;
            this.$relsMap = map2;
            this.$mediaFiles = map3;
            this.$runs = list;
            this.$images = list2;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(Node node) {
            invoke2(node);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.file.docx.DocxParser$parseRunElements$1, reason: invalid class name and case insensitive filesystem */
    public final class C119051 extends AbstractC7559F3s implements G0U<Node, Unit> {
        public final /* synthetic */ C10543Hqv<Float> $fontSizePt;
        public final /* synthetic */ F1F $isBold;
        public final /* synthetic */ F1F $isItalic;
        public final /* synthetic */ F1F $isStrikethrough;
        public final /* synthetic */ F1F $isUnderline;
        public final /* synthetic */ Map<String, byte[]> $mediaFiles;
        public final /* synthetic */ List<DocElement> $outImages;
        public final /* synthetic */ Map<String, String> $relsMap;
        public final /* synthetic */ StringBuilder $textBuilder;

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void invoke2(org.w3c.dom.Node r7) throws org.w3c.dom.DOMException {
            /*
                r6 = this;
                r0 = 0
                X.C7384Etj.A0Y(r7, r0)
                java.lang.String r1 = r7.getLocalName()
                if (r1 == 0) goto L12
                int r0 = r1.hashCode()
                r3 = 0
                switch(r0) {
                    case 116: goto Lc0;
                    case 3152: goto Lb3;
                    case 112148: goto L67;
                    case 114581: goto L5a;
                    case 3440682: goto L3b;
                    case 1590178495: goto L26;
                    case 1913009182: goto L13;
                    default: goto L12;
                }
            L12:
                return
            L13:
                java.lang.String r0 = "drawing"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L12
                com.facebook.aura.file.docx.DocxParser r2 = com.facebook.aura.file.docx.DocxParser.INSTANCE
                java.util.Map<java.lang.String, java.lang.String> r1 = r6.$relsMap
                java.util.Map<java.lang.String, byte[]> r0 = r6.$mediaFiles
                com.facebook.aura.file.docx.DocElement$Image r1 = com.facebook.aura.file.docx.DocxParser.access$parseDrawing(r2, r7, r1, r0)
                goto L4d
            L26:
                java.lang.String r0 = "AlternateContent"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L12
                com.facebook.aura.file.docx.DocxParser r2 = com.facebook.aura.file.docx.DocxParser.INSTANCE
                java.util.Map<java.lang.String, java.lang.String> r1 = r6.$relsMap
                java.util.Map<java.lang.String, byte[]> r0 = r6.$mediaFiles
                com.facebook.aura.file.docx.DocElement r1 = com.facebook.aura.file.docx.DocxParser.access$parseAlternateContent(r2, r7, r1, r0)
                java.util.List<com.facebook.aura.file.docx.DocElement> r0 = r6.$outImages
                goto L56
            L3b:
                java.lang.String r0 = "pict"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L12
                com.facebook.aura.file.docx.DocxParser r2 = com.facebook.aura.file.docx.DocxParser.INSTANCE
                java.util.Map<java.lang.String, java.lang.String> r1 = r6.$relsMap
                java.util.Map<java.lang.String, byte[]> r0 = r6.$mediaFiles
                com.facebook.aura.file.docx.DocElement$Image r1 = com.facebook.aura.file.docx.DocxParser.access$parsePictVml(r2, r7, r1, r0)
            L4d:
                java.util.List<com.facebook.aura.file.docx.DocElement> r0 = r6.$outImages
                if (r1 != 0) goto L56
                com.facebook.aura.file.docx.DocElement$Drawing r1 = new com.facebook.aura.file.docx.DocElement$Drawing
                r1.<init>(r3)
            L56:
                r0.add(r1)
                return
            L5a:
                java.lang.String r0 = "tab"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L12
                java.lang.StringBuilder r1 = r6.$textBuilder
                java.lang.String r0 = "\t"
                goto Ld2
            L67:
                java.lang.String r0 = "rPr"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L12
                X.F1F r1 = r6.$isBold
                com.facebook.aura.file.docx.XmlHelpers r5 = com.facebook.aura.file.docx.XmlHelpers.INSTANCE
                java.lang.String r0 = "b"
                java.lang.String r4 = "http://schemas.openxmlformats.org/wordprocessingml/2006/main"
                boolean r0 = r5.hasBoolChild(r7, r4, r0)
                r1.element = r0
                X.F1F r1 = r6.$isItalic
                java.lang.String r0 = "i"
                boolean r0 = r5.hasBoolChild(r7, r4, r0)
                r1.element = r0
                X.F1F r1 = r6.$isUnderline
                java.lang.String r0 = "u"
                boolean r0 = r5.hasNonNoneChild(r7, r4, r0)
                r1.element = r0
                X.F1F r1 = r6.$isStrikethrough
                java.lang.String r0 = "strike"
                boolean r0 = r5.hasBoolChild(r7, r4, r0)
                r1.element = r0
                X.Hqv<java.lang.Float> r2 = r6.$fontSizePt
                java.lang.String r0 = "sz"
                java.lang.Float r0 = r5.childValFloat(r7, r4, r0)
                if (r0 == 0) goto Lb0
                float r1 = r0.floatValue()
                r0 = 1073741824(0x40000000, float:2.0)
                float r1 = r1 / r0
                java.lang.Float r3 = java.lang.Float.valueOf(r1)
            Lb0:
                r2.element = r3
                return
            Lb3:
                java.lang.String r0 = "br"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L12
                java.lang.StringBuilder r1 = r6.$textBuilder
                java.lang.String r0 = "\n"
                goto Ld2
            Lc0:
                java.lang.String r0 = "t"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L12
                java.lang.StringBuilder r1 = r6.$textBuilder
                java.lang.String r0 = r7.getTextContent()
                if (r0 != 0) goto Ld2
                java.lang.String r0 = ""
            Ld2:
                r1.append(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.docx.DocxParser.C119051.invoke2(org.w3c.dom.Node):void");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C119051(F1F f1f, F1F f1f2, F1F f1f3, F1F f1f4, C10543Hqv<Float> c10543Hqv, StringBuilder sb, Map<String, String> map, Map<String, byte[]> map2, List<DocElement> list) {
            super(1);
            this.$isBold = f1f;
            this.$isItalic = f1f2;
            this.$isUnderline = f1f3;
            this.$isStrikethrough = f1f4;
            this.$fontSizePt = c10543Hqv;
            this.$textBuilder = sb;
            this.$relsMap = map;
            this.$mediaFiles = map2;
            this.$outImages = list;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(Node node) throws DOMException {
            invoke2(node);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.file.docx.DocxParser$parseTable$1, reason: invalid class name and case insensitive filesystem */
    public final class C119061 extends AbstractC7559F3s implements G0U<Node, Boolean> {
        public final /* synthetic */ RenderBudget $budget;
        public final /* synthetic */ List<List<String>> $rows;

        /* renamed from: com.facebook.aura.file.docx.DocxParser$parseTable$1$1, reason: invalid class name and collision with other inner class name */
        public final class C01561 extends AbstractC7559F3s implements G0U<Node, Boolean> {
            public final /* synthetic */ RenderBudget $budget;
            public final /* synthetic */ List<String> $cells;

            @Override // X.G0U
            public final Boolean invoke(Node node) {
                C7384Etj.A0Y(node, 0);
                if (this.$cells.size() >= 100) {
                    this.$budget.truncated = true;
                    return false;
                }
                this.$cells.add(DocxParser.INSTANCE.extractCellText(node));
                return true;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01561(List<String> list, RenderBudget renderBudget) {
                super(1);
                this.$cells = list;
                this.$budget = renderBudget;
            }
        }

        @Override // X.G0U
        public final Boolean invoke(Node node) {
            C7384Etj.A0Y(node, 0);
            if (this.$rows.size() >= 1000) {
                this.$budget.truncated = true;
                return false;
            }
            ArrayList arrayListA0h = C3cG.A0h();
            XmlHelpers.INSTANCE.forEachChildWhile(node, "tc", new C01561(arrayListA0h, this.$budget));
            if (!arrayListA0h.isEmpty()) {
                this.$rows.add(arrayListA0h);
            }
            return true;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C119061(List<List<String>> list, RenderBudget renderBudget) {
            super(1);
            this.$rows = list;
            this.$budget = renderBudget;
        }
    }

    private final synchronized DocumentBuilder newNamespaceAwareBuilder() {
        return ((DocumentBuilderFactory) builderFactory$delegate.getValue()).newDocumentBuilder();
    }

    private final int parseHeadingLevel(String str) {
        Integer numA0r;
        if (str != null) {
            String strA0u = AnonymousClass001.A0u(str);
            if (strA0u.startsWith(HEADING_STYLE_PREFIX) && (numA0r = C9tI.A0r(AnonymousClass002.A0l(C7BY.A0K(HEADING_STYLE_PREFIX, strA0u)))) != null) {
                int iIntValue = numA0r.intValue();
                if (iIntValue < 1) {
                    return 1;
                }
                if (iIntValue > 6) {
                    return 6;
                }
                return iIntValue;
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DocElement.Image parsePictVml(Node node, Map<String, String> map, Map<String, byte[]> map2) {
        String strAttrNS;
        String strA0p;
        byte[] bArr;
        try {
            XmlHelpers xmlHelpers = XmlHelpers.INSTANCE;
            Node nodeFindDescendant = xmlHelpers.findDescendant(node, "imagedata");
            if (nodeFindDescendant == null || (((strAttrNS = xmlHelpers.attrNS(nodeFindDescendant, R_NS, "id")) == null && (strAttrNS = xmlHelpers.attr(nodeFindDescendant, "r:id")) == null) || (strA0p = C60O.A0p(strAttrNS, map)) == null || (bArr = map2.get(strA0p)) == null)) {
                return null;
            }
            return new DocElement.Image(bArr, 0, 0, "");
        } catch (Exception unused) {
            return null;
        }
    }

    private final String detectDrawingLabel(Node node) {
        XmlHelpers xmlHelpers = XmlHelpers.INSTANCE;
        Node nodeFindChild = xmlHelpers.findChild(node, "Choice");
        if (nodeFindChild != null) {
            String strAttr = xmlHelpers.attr(nodeFindChild, "Requires");
            if (strAttr == null) {
                strAttr = "";
            }
            String strA0u = AnonymousClass001.A0u(strAttr);
            if (!C7BY.A0q(strA0u, "chart", false) && !C7BY.A0q(strA0u, "cx", false)) {
                if (!C7BY.A0q(strA0u, "dgm", false)) {
                    if (!xmlHelpers.containsDescendant(nodeFindChild, "chart") && !xmlHelpers.containsDescendant(nodeFindChild, "relSizeAnchor")) {
                        if (xmlHelpers.containsDescendant(nodeFindChild, "dgm")) {
                        }
                    }
                }
                return "Diagram";
            }
            return "Chart";
        }
        return "Drawing";
    }

    private final int emuToPixels(long j) {
        if (j <= 0) {
            return 0;
        }
        return (int) ((j * 96) / EMU_PER_INCH);
    }

    private final ArchiveContents extractArchive(InputStream inputStream) throws IOException {
        ArchiveContents archiveContents = new ArchiveContents();
        OoxmlArchiveGuard.Limits limits = OoxmlArchiveGuard.docxLimits;
        C7384Etj.A0Y(limits, 0);
        OoxmlArchiveGuard.ReadBudget readBudget = new OoxmlArchiveGuard.ReadBudget(limits);
        ZipInputStream zipInputStream = new ZipInputStream(inputStream);
        try {
            for (ZipEntry nextEntry = zipInputStream.getNextEntry(); nextEntry != null; nextEntry = zipInputStream.getNextEntry()) {
                readBudget.registerEntry(nextEntry);
                if (DOCUMENT_XML.equals(nextEntry.getName())) {
                    String name = nextEntry.getName();
                    C7384Etj.A0U(name);
                    archiveContents.documentXmlBytes = readBudget.readEntry(zipInputStream, name, 4194304L);
                } else if (STYLES_XML.equals(nextEntry.getName())) {
                    archiveContents.stylesXmlBytes = AbstractC7610F5x.A1Z(readBudget, zipInputStream, nextEntry, 2097152L);
                } else if (NUMBERING_XML.equals(nextEntry.getName())) {
                    archiveContents.numberingXmlBytes = AbstractC7610F5x.A1Z(readBudget, zipInputStream, nextEntry, 2097152L);
                } else if (RELS_XML.equals(nextEntry.getName())) {
                    archiveContents.relsXmlBytes = AbstractC7610F5x.A1Z(readBudget, zipInputStream, nextEntry, 2097152L);
                } else {
                    String name2 = nextEntry.getName();
                    C7384Etj.A0U(name2);
                    if (name2.startsWith(MEDIA_PREFIX) && !nextEntry.isDirectory()) {
                        Map<String, byte[]> map = archiveContents.mediaFiles;
                        String name3 = nextEntry.getName();
                        C7384Etj.A0U(name3);
                        String strA0K = C7BY.A0K("word/", name3);
                        String name4 = nextEntry.getName();
                        C7384Etj.A0U(name4);
                        map.put(strA0K, readBudget.readEntry(zipInputStream, name4, readBudget.limits.maxEntryUncompressedBytes));
                    }
                }
                zipInputStream.closeEntry();
            }
            zipInputStream.close();
            return archiveContents;
        } finally {
        }
    }

    private final Node findBlipInContainer(Node node) {
        Node nodeFindChildNS;
        Node nodeFindChildNS2;
        Node nodeFindChildNS3;
        XmlHelpers xmlHelpers = XmlHelpers.INSTANCE;
        Node nodeFindChildNS4 = xmlHelpers.findChildNS(node, A_NS, "graphic");
        Node nodeFindChildNS5 = null;
        return (nodeFindChildNS4 == null || (nodeFindChildNS = xmlHelpers.findChildNS(nodeFindChildNS4, A_NS, "graphicData")) == null || !((nodeFindChildNS2 = xmlHelpers.findChildNS(nodeFindChildNS, PIC_NS, "pic")) == null || (nodeFindChildNS3 = xmlHelpers.findChildNS(nodeFindChildNS2, PIC_NS, "blipFill")) == null || (nodeFindChildNS5 = xmlHelpers.findChildNS(nodeFindChildNS3, A_NS, "blip")) == null)) ? nodeFindChildNS5 : findBlipRecursive(nodeFindChildNS);
    }

    private final DocumentBuilderFactory getBuilderFactory() {
        return (DocumentBuilderFactory) builderFactory$delegate.getValue();
    }

    private final ListStyle mapNumFmt(String str) {
        return "bullet".equals(str) ? ListStyle.BULLET : "none".equals(str) ? ListStyle.NONE : ListStyle.NUMBERED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DocElement parseAlternateContent(Node node, Map<String, String> map, Map<String, byte[]> map2) {
        XmlHelpers xmlHelpers;
        Node nodeFindChild;
        DocElement.Image imageExtractImageFromContainer;
        try {
            xmlHelpers = XmlHelpers.INSTANCE;
            nodeFindChild = xmlHelpers.findChild(node, "Fallback");
        } catch (Exception unused) {
        }
        if (nodeFindChild != null && (imageExtractImageFromContainer = extractImageFromContainer(nodeFindChild, map, map2)) != null) {
            return imageExtractImageFromContainer;
        }
        Node nodeFindChild2 = xmlHelpers.findChild(node, "Choice");
        if (nodeFindChild2 != null) {
            DocElement.Image imageExtractImageFromContainer2 = extractImageFromContainer(nodeFindChild2, map, map2);
            if (imageExtractImageFromContainer2 != null) {
                return imageExtractImageFromContainer2;
            }
        }
        return new DocElement.Drawing(detectDrawingLabel(node));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DocElement.Image parseDrawing(Node node, Map<String, String> map, Map<String, byte[]> map2) {
        Node nodeFindChildNS;
        String strAttr;
        String strAttrNS;
        String str;
        byte[] bArr;
        Long lA0s;
        Long lA0s2;
        XmlHelpers xmlHelpers = XmlHelpers.INSTANCE;
        Node nodeFindChildNS2 = xmlHelpers.findChildNS(node, WP_NS, "inline");
        if ((nodeFindChildNS2 != null || (nodeFindChildNS2 = xmlHelpers.findChildNS(node, WP_NS, "anchor")) != null) && (nodeFindChildNS = xmlHelpers.findChildNS(nodeFindChildNS2, WP_NS, "extent")) != null) {
            String strAttr2 = xmlHelpers.attr(nodeFindChildNS, "cx");
            long jLongValue = 0;
            long jLongValue2 = (strAttr2 == null || (lA0s2 = C9tI.A0s(strAttr2)) == null) ? 0L : lA0s2.longValue();
            String strAttr3 = xmlHelpers.attr(nodeFindChildNS, "cy");
            if (strAttr3 != null && (lA0s = C9tI.A0s(strAttr3)) != null) {
                jLongValue = lA0s.longValue();
            }
            Node nodeFindChildNS3 = xmlHelpers.findChildNS(nodeFindChildNS2, WP_NS, "docPr");
            if (nodeFindChildNS3 == null || (strAttr = xmlHelpers.attr(nodeFindChildNS3, "descr")) == null) {
                strAttr = "";
            }
            Node nodeFindBlipInContainer = findBlipInContainer(nodeFindChildNS2);
            if (nodeFindBlipInContainer != null && (strAttrNS = xmlHelpers.attrNS(nodeFindBlipInContainer, R_NS, "embed")) != null && (str = map.get(strAttrNS)) != null && (bArr = map2.get(str)) != null) {
                int iEmuToPixels = emuToPixels(jLongValue2);
                if (iEmuToPixels < 1) {
                    iEmuToPixels = 1;
                }
                int iEmuToPixels2 = emuToPixels(jLongValue);
                if (iEmuToPixels2 < 1) {
                    iEmuToPixels2 = 1;
                }
                return new DocElement.Image(bArr, iEmuToPixels, iEmuToPixels2, strAttr);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float parseIndent(Node node) {
        Float fA0w;
        XmlHelpers xmlHelpers = XmlHelpers.INSTANCE;
        Node nodeFindChild = xmlHelpers.findChild(node, "ind");
        if (nodeFindChild == null) {
            return 0.0f;
        }
        String strAttrNS = xmlHelpers.attrNS(nodeFindChild, W_NS, "left");
        if ((strAttrNS == null && (strAttrNS = xmlHelpers.attrNS(nodeFindChild, W_NS, WidgetComponentsKt.START_PATH)) == null) || (fA0w = C9tJ.A0w(strAttrNS)) == null) {
            return 0.0f;
        }
        float fFloatValue = fA0w.floatValue();
        if (fFloatValue > 0.0f) {
            return fFloatValue / 20.0f;
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HwV<ListStyle, Integer, String> parseListProperties(Node node, Map<String, ? extends ListStyle> map) {
        String strAttrNS;
        String strAttrNS2;
        Integer numA0r;
        XmlHelpers xmlHelpers = XmlHelpers.INSTANCE;
        Node nodeFindChild = xmlHelpers.findChild(node, "numPr");
        int iIntValue = 0;
        if (nodeFindChild != null) {
            XmlHelpers xmlHelpers2 = XmlHelpers.INSTANCE;
            Node nodeFindChild2 = xmlHelpers.findChild(nodeFindChild, "ilvl");
            if (nodeFindChild2 != null && (strAttrNS2 = xmlHelpers2.attrNS(nodeFindChild2, W_NS, "val")) != null && (numA0r = C9tI.A0r(strAttrNS2)) != null) {
                iIntValue = numA0r.intValue();
            }
            Node nodeFindChild3 = xmlHelpers2.findChild(nodeFindChild, "numId");
            if (nodeFindChild3 != null && (strAttrNS = xmlHelpers2.attrNS(nodeFindChild3, W_NS, "val")) != null && !strAttrNS.equals(HatchPriceImpressionEventDataKt.NO_DISCOUNT)) {
                ListStyle listStyle = map.get(strAttrNS);
                if (listStyle == null) {
                    listStyle = ListStyle.BULLET;
                }
                return new HwV<>(listStyle, Integer.valueOf(iIntValue), strAttrNS);
            }
        }
        return new HwV<>(ListStyle.NONE, 0, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.file.docx.Alignment parseParagraphAlignment(org.w3c.dom.Node r4) {
        /*
            r3 = this;
            com.facebook.aura.file.docx.XmlHelpers r3 = com.facebook.aura.file.docx.XmlHelpers.INSTANCE
            java.lang.String r0 = "jc"
            org.w3c.dom.Node r2 = r3.findChild(r4, r0)
            if (r2 == 0) goto L1b
            java.lang.String r1 = "http://schemas.openxmlformats.org/wordprocessingml/2006/main"
            java.lang.String r0 = "val"
            java.lang.String r1 = r3.attrNS(r2, r1, r0)
            if (r1 == 0) goto L1b
            int r0 = r1.hashCode()
            switch(r0) {
                case -1480972831: goto L1e;
                case -1364013995: goto L21;
                case 100571: goto L2c;
                case 3029889: goto L2f;
                case 108511772: goto L3a;
                default: goto L1b;
            }
        L1b:
            com.facebook.aura.file.docx.Alignment r0 = com.facebook.aura.file.docx.Alignment.LEFT
            return r0
        L1e:
            java.lang.String r0 = "distribute"
            goto L31
        L21:
            java.lang.String r0 = "center"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1b
            com.facebook.aura.file.docx.Alignment r0 = com.facebook.aura.file.docx.Alignment.CENTER
            return r0
        L2c:
            java.lang.String r0 = "end"
            goto L3c
        L2f:
            java.lang.String r0 = "both"
        L31:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1b
            com.facebook.aura.file.docx.Alignment r0 = com.facebook.aura.file.docx.Alignment.JUSTIFY
            return r0
        L3a:
            java.lang.String r0 = "right"
        L3c:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1b
            com.facebook.aura.file.docx.Alignment r0 = com.facebook.aura.file.docx.Alignment.RIGHT
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.docx.DocxParser.parseParagraphAlignment(org.w3c.dom.Node):com.facebook.aura.file.docx.Alignment");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int parseParagraphHeading(Node node, Map<String, Integer> map) {
        String strAttrNS;
        XmlHelpers xmlHelpers = XmlHelpers.INSTANCE;
        Node nodeFindChild = xmlHelpers.findChild(node, "pStyle");
        if (nodeFindChild == null || (strAttrNS = xmlHelpers.attrNS(nodeFindChild, W_NS, "val")) == null) {
            return 0;
        }
        Number numberA0b = BV4.A0b(strAttrNS, map);
        return numberA0b != null ? numberA0b.intValue() : parseHeadingLevel(strAttrNS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void parseRunElements(Node node, Map<String, String> map, Map<String, byte[]> map2, List<DocRun> list, List<DocElement> list2) {
        F1F f1f = new F1F();
        F1F f1f2 = new F1F();
        F1F f1f3 = new F1F();
        F1F f1f4 = new F1F();
        C10543Hqv c10543HqvA0z = C3cG.A0z();
        StringBuilder sbA0w = C60O.A0w();
        XmlHelpers.INSTANCE.forEachChild(node, new C119051(f1f, f1f2, f1f3, f1f4, c10543HqvA0z, sbA0w, map, map2, list2));
        String string = sbA0w.toString();
        if (string.length() > 0) {
            list.add(new DocRun(string, f1f.element, f1f2.element, f1f3.element, f1f4.element, (Float) c10543HqvA0z.element));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.file.docx.DocxParser.ParagraphSpacing parseSpacing(org.w3c.dom.Node r10) {
        /*
            r9 = this;
            com.facebook.aura.file.docx.XmlHelpers r7 = com.facebook.aura.file.docx.XmlHelpers.INSTANCE
            java.lang.String r0 = "spacing"
            org.w3c.dom.Node r8 = r7.findChild(r10, r0)
            r5 = 1090519040(0x41000000, float:8.0)
            r9 = 0
            r4 = 0
            if (r8 != 0) goto L14
            com.facebook.aura.file.docx.DocxParser$ParagraphSpacing r1 = new com.facebook.aura.file.docx.DocxParser$ParagraphSpacing
            r1.<init>(r9, r5, r4, r4)
            return r1
        L14:
            java.lang.String r0 = "before"
            java.lang.String r6 = "http://schemas.openxmlformats.org/wordprocessingml/2006/main"
            java.lang.String r0 = r7.attrNS(r8, r6, r0)
            if (r0 == 0) goto L8c
            java.lang.Float r0 = X.C9tJ.A0w(r0)
        L22:
            r10 = 1101004800(0x41a00000, float:20.0)
            if (r0 == 0) goto L8a
            float r3 = r0.floatValue()
            int r0 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r0 <= 0) goto L8a
            float r3 = r3 / r10
        L2f:
            java.lang.String r0 = "after"
            java.lang.String r0 = r7.attrNS(r8, r6, r0)
            if (r0 == 0) goto L47
            java.lang.Float r0 = X.C9tJ.A0w(r0)
            if (r0 == 0) goto L47
            float r1 = r0.floatValue()
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 <= 0) goto L47
            float r5 = r1 / r10
        L47:
            java.lang.String r0 = "line"
            java.lang.String r0 = r7.attrNS(r8, r6, r0)
            if (r0 == 0) goto L88
            java.lang.Float r0 = X.C9tJ.A0w(r0)
            if (r0 == 0) goto L88
            float r2 = r0.floatValue()
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 <= 0) goto L88
            java.lang.String r0 = "lineRule"
            java.lang.String r1 = r7.attrNS(r8, r6, r0)
            java.lang.String r0 = "exact"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L82
            java.lang.String r0 = "atLeast"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L82
            r0 = 1131413504(0x43700000, float:240.0)
            float r2 = r2 / r0
            java.lang.Float r1 = java.lang.Float.valueOf(r2)
            r0 = r4
            r4 = r1
        L7c:
            com.facebook.aura.file.docx.DocxParser$ParagraphSpacing r1 = new com.facebook.aura.file.docx.DocxParser$ParagraphSpacing
            r1.<init>(r3, r5, r4, r0)
            return r1
        L82:
            float r2 = r2 / r10
            java.lang.Float r0 = java.lang.Float.valueOf(r2)
            goto L7c
        L88:
            r0 = r4
            goto L7c
        L8a:
            r3 = 0
            goto L2f
        L8c:
            r0 = r4
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.docx.DocxParser.parseSpacing(org.w3c.dom.Node):com.facebook.aura.file.docx.DocxParser$ParagraphSpacing");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String extractCellText(Node node) {
        ArrayList arrayListA0h = C3cG.A0h();
        XmlHelpers.INSTANCE.forEachChild(node, HatchUrlSegments.THUMBNAIL_SIZE_PARAM, new AnonymousClass1(arrayListA0h));
        return AnonymousClass002.A0l(C3cH.A0e(PairsDiscretionDocument.TERMINATOR, arrayListA0h));
    }

    private final DocElement.Image extractImageFromContainer(Node node, Map<String, String> map, Map<String, byte[]> map2) {
        NodeList childNodes = node.getChildNodes();
        int length = childNodes.getLength();
        for (int i = 0; i < length; i++) {
            Node nodeItem = childNodes.item(i);
            String localName = nodeItem.getLocalName();
            DocElement.Image drawing = "drawing".equals(localName) ? parseDrawing(nodeItem, map, map2) : "pict".equals(localName) ? parsePictVml(nodeItem, map, map2) : extractImageFromContainer(nodeItem, map, map2);
            if (drawing != null) {
                return drawing;
            }
        }
        return null;
    }

    private final Node findBlipRecursive(Node node) {
        NodeList childNodes = node.getChildNodes();
        int length = childNodes.getLength();
        for (int i = 0; i < length; i++) {
            Node nodeItem = childNodes.item(i);
            if ((A_NS.equals(nodeItem.getNamespaceURI()) && "blip".equals(nodeItem.getLocalName())) || (nodeItem = findBlipRecursive(nodeItem)) != null) {
                return nodeItem;
            }
        }
        return null;
    }

    private final Node findLevelNode(Node node, int i) {
        String strAttrNS;
        Integer numA0r;
        NodeList childNodes = node.getChildNodes();
        int length = childNodes.getLength();
        for (int i2 = 0; i2 < length; i2++) {
            Node nodeItem = childNodes.item(i2);
            if ("lvl".equals(nodeItem.getLocalName()) && (strAttrNS = XmlHelpers.INSTANCE.attrNS(nodeItem, W_NS, "ilvl")) != null && (numA0r = C9tI.A0r(strAttrNS)) != null && numA0r.intValue() == i) {
                return nodeItem;
            }
        }
        return null;
    }

    private final PreviewResult parse(InputStream inputStream) throws SAXException, IOException {
        DocStyles docStyles;
        ArchiveContents archiveContentsExtractArchive = extractArchive(inputStream);
        byte[] bArr = archiveContentsExtractArchive.stylesXmlBytes;
        if (bArr != null) {
            docStyles = INSTANCE.parseStyles(bArr);
        } else {
            C9jH c9jH = C9jH.A00;
            docStyles = new DocStyles(c9jH, c9jH, c9jH, null);
        }
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        byte[] bArr2 = archiveContentsExtractArchive.numberingXmlBytes;
        if (bArr2 != null) {
            INSTANCE.parseNumbering(bArr2, linkedHashMapA0j);
        }
        LinkedHashMap linkedHashMapA0j2 = C3cG.A0j();
        byte[] bArr3 = archiveContentsExtractArchive.relsXmlBytes;
        if (bArr3 != null) {
            INSTANCE.parseRels(bArr3, linkedHashMapA0j2);
        }
        byte[] bArr4 = archiveContentsExtractArchive.documentXmlBytes;
        if (bArr4 == null) {
            throw C3cG.A0Q("No document.xml found in .docx");
        }
        NodeList elementsByTagNameNS = newNamespaceAwareBuilder().parse(new ByteArrayInputStream(bArr4)).getElementsByTagNameNS(W_NS, MetaAiAppBroadcastSender.EXTRA_BODY);
        if (elementsByTagNameNS.getLength() == 0) {
            return new PreviewResult(C0881AGi.A00, false);
        }
        ArrayList arrayListA0h = C3cG.A0h();
        LinkedHashMap linkedHashMapA0j3 = C3cG.A0j();
        RenderBudget renderBudget = new RenderBudget();
        C10543Hqv c10543HqvA0z = C3cG.A0z();
        XmlHelpers xmlHelpers = XmlHelpers.INSTANCE;
        Node nodeItem = elementsByTagNameNS.item(0);
        C7384Etj.A0U(nodeItem);
        xmlHelpers.forEachChildWhile(nodeItem, new AnonymousClass3(arrayListA0h, renderBudget, docStyles, linkedHashMapA0j, linkedHashMapA0j2, archiveContentsExtractArchive, linkedHashMapA0j3, c10543HqvA0z));
        return new PreviewResult(arrayListA0h, renderBudget.truncated);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void parseNumbering(byte[] bArr, Map<String, ListStyle> map) throws SAXException, IOException {
        Node nodeFindChild;
        String strAttrNS;
        Object obj;
        Node nodeFindLevelNode;
        Document document = newNamespaceAwareBuilder().parse(new ByteArrayInputStream(bArr));
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        NodeList elementsByTagNameNS = document.getElementsByTagNameNS(W_NS, "abstractNum");
        int length = elementsByTagNameNS.getLength();
        for (int i = 0; i < length; i++) {
            Node nodeItem = elementsByTagNameNS.item(i);
            XmlHelpers xmlHelpers = XmlHelpers.INSTANCE;
            C7384Etj.A0X(nodeItem);
            String strAttrNS2 = xmlHelpers.attrNS(nodeItem, W_NS, "abstractNumId");
            if (strAttrNS2 != null && (nodeFindLevelNode = findLevelNode(nodeItem, 0)) != null) {
                Node nodeFindChild2 = xmlHelpers.findChild(nodeFindLevelNode, "numFmt");
                linkedHashMapA0j.put(strAttrNS2, mapNumFmt(nodeFindChild2 != null ? xmlHelpers.attrNS(nodeFindChild2, W_NS, "val") : null));
            }
        }
        NodeList elementsByTagNameNS2 = document.getElementsByTagNameNS(W_NS, "num");
        int length2 = elementsByTagNameNS2.getLength();
        for (int i2 = 0; i2 < length2; i2++) {
            Node nodeItem2 = elementsByTagNameNS2.item(i2);
            XmlHelpers xmlHelpers2 = XmlHelpers.INSTANCE;
            C7384Etj.A0X(nodeItem2);
            String strAttrNS3 = xmlHelpers2.attrNS(nodeItem2, W_NS, "numId");
            if (strAttrNS3 != null && (nodeFindChild = xmlHelpers2.findChild(nodeItem2, "abstractNumId")) != null && (strAttrNS = xmlHelpers2.attrNS(nodeFindChild, W_NS, "val")) != null && (obj = linkedHashMapA0j.get(strAttrNS)) != null) {
                map.put(strAttrNS3, obj);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0119  */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, com.facebook.aura.file.docx.Alignment] */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Float] */
    /* JADX WARN: Type inference failed for: r5v0, types: [T, com.facebook.aura.file.docx.ListStyle] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.file.docx.DocxParser.ParagraphParseResult parseParagraphElements(org.w3c.dom.Node r37, com.facebook.aura.file.docx.DocxParser.DocStyles r38, java.util.Map<java.lang.String, ? extends com.facebook.aura.file.docx.ListStyle> r39, java.util.Map<java.lang.String, java.lang.String> r40, java.util.Map<java.lang.String, byte[]> r41, java.util.Map<java.lang.String, java.lang.Integer> r42, java.lang.String r43) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.docx.DocxParser.parseParagraphElements(org.w3c.dom.Node, com.facebook.aura.file.docx.DocxParser$DocStyles, java.util.Map, java.util.Map, java.util.Map, java.util.Map, java.lang.String):com.facebook.aura.file.docx.DocxParser$ParagraphParseResult");
    }

    private final void parseRels(byte[] bArr, Map<String, String> map) {
        String strAttr;
        NodeList elementsByTagNameNS = newNamespaceAwareBuilder().parse(new ByteArrayInputStream(bArr)).getElementsByTagNameNS(RELS_NS, "Relationship");
        int length = elementsByTagNameNS.getLength();
        for (int i = 0; i < length; i++) {
            Node nodeItem = elementsByTagNameNS.item(i);
            XmlHelpers xmlHelpers = XmlHelpers.INSTANCE;
            C7384Etj.A0X(nodeItem);
            String strAttr2 = xmlHelpers.attr(nodeItem, "Id");
            if (strAttr2 != null && (strAttr = xmlHelpers.attr(nodeItem, "Target")) != null) {
                map.put(strAttr2, strAttr);
            }
        }
    }

    private final DocStyles parseStyles(byte[] bArr) throws SAXException, IOException {
        Float fChildValFloat;
        String strAttrNS;
        String strAttrNS2;
        int headingLevel;
        XmlHelpers xmlHelpers;
        Node nodeFindChild;
        Node nodeFindChild2;
        Float fChildValFloat2;
        Document document = newNamespaceAwareBuilder().parse(new ByteArrayInputStream(bArr));
        Node nodeItem = document.getElementsByTagNameNS(W_NS, "docDefaults").item(0);
        Float fValueOf = null;
        if (nodeItem != null && (nodeFindChild = (xmlHelpers = XmlHelpers.INSTANCE).findChild(nodeItem, "rPrDefault")) != null && (nodeFindChild2 = xmlHelpers.findChild(nodeFindChild, "rPr")) != null && (fChildValFloat2 = xmlHelpers.childValFloat(nodeFindChild2, W_NS, "sz")) != null) {
            fValueOf = Float.valueOf(fChildValFloat2.floatValue() / 2.0f);
        }
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        LinkedHashMap linkedHashMapA0j2 = C3cG.A0j();
        LinkedHashMap linkedHashMapA0j3 = C3cG.A0j();
        NodeList elementsByTagNameNS = document.getElementsByTagNameNS(W_NS, "style");
        int length = elementsByTagNameNS.getLength();
        for (int i = 0; i < length; i++) {
            Node nodeItem2 = elementsByTagNameNS.item(i);
            XmlHelpers xmlHelpers2 = XmlHelpers.INSTANCE;
            C7384Etj.A0X(nodeItem2);
            String strAttrNS3 = xmlHelpers2.attrNS(nodeItem2, W_NS, "styleId");
            if (strAttrNS3 != null) {
                Node nodeFindChild3 = xmlHelpers2.findChild(nodeItem2, "name");
                if (nodeFindChild3 != null && (strAttrNS2 = xmlHelpers2.attrNS(nodeFindChild3, W_NS, "val")) != null && (headingLevel = INSTANCE.parseHeadingLevel(strAttrNS2)) > 0) {
                    C8j4.A1O(strAttrNS3, linkedHashMapA0j, headingLevel);
                }
                Node nodeFindChild4 = xmlHelpers2.findChild(nodeItem2, "basedOn");
                if (nodeFindChild4 != null && (strAttrNS = xmlHelpers2.attrNS(nodeFindChild4, W_NS, "val")) != null) {
                    linkedHashMapA0j3.put(strAttrNS3, strAttrNS);
                }
                Node nodeFindChild5 = xmlHelpers2.findChild(nodeItem2, "rPr");
                if (nodeFindChild5 != null && (fChildValFloat = xmlHelpers2.childValFloat(nodeFindChild5, W_NS, "sz")) != null) {
                    linkedHashMapA0j2.put(strAttrNS3, Float.valueOf(fChildValFloat.floatValue() / 2.0f));
                }
            }
        }
        return new DocStyles(linkedHashMapA0j, linkedHashMapA0j2, linkedHashMapA0j3, fValueOf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DocElement.Table parseTable(Node node, RenderBudget renderBudget) {
        ArrayList arrayListA0h = C3cG.A0h();
        XmlHelpers.INSTANCE.forEachChildWhile(node, "tr", new C119061(arrayListA0h, renderBudget));
        if (arrayListA0h.isEmpty()) {
            return null;
        }
        return new DocElement.Table(arrayListA0h);
    }

    private final void trySetFeature(DocumentBuilderFactory documentBuilderFactory, String str, boolean z) throws ParserConfigurationException {
        try {
            documentBuilderFactory.setFeature(str, z);
        } catch (Exception unused) {
        }
    }

    public final PreviewResult parse(byte[] bArr) {
        C7384Etj.A0Y(bArr, 0);
        return parse(new ByteArrayInputStream(bArr));
    }

    public final PreviewResult parse(File file) throws IOException {
        C7384Etj.A0Y(file, 0);
        OoxmlArchiveGuard.Inspection inspectionInspect = OoxmlArchiveGuard.INSTANCE.inspect(file, OoxmlArchiveGuard.docxLimits);
        if (!(inspectionInspect instanceof OoxmlArchiveGuard.Inspection.Rejected)) {
            return parse(new FileInputStream(file));
        }
        throw new OoxmlArchiveGuard.LimitExceededException(((OoxmlArchiveGuard.Inspection.Rejected) inspectionInspect).reason);
    }
}
