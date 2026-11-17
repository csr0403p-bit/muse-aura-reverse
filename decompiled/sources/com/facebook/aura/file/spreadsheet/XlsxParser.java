package com.facebook.aura.file.spreadsheet;

import X.AbstractC5321DgF;
import X.AbstractC7559F3s;
import X.AbstractC7610F5x;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.C9tI;
import X.CRD;
import X.F0C;
import X.F1E;
import X.F1F;
import X.FGI;
import X.G0U;
import X.HxE;
import com.facebook.aura.file.docx.OoxmlArchiveGuard;
import com.facebook.aura.file.docx.XmlHelpers;
import com.facebook.aura.spaces.repo.HatchSpacesDataSourceKt;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
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
public final class XlsxParser {
    public static final int MAX_CELL_CHARS = 16384;
    public static final int MAX_COLUMNS = 256;
    public static final int MAX_RENDERED_CELL_SLOTS = 100000;
    public static final int MAX_ROWS_PER_SHEET = 500;
    public static final int MAX_SHARED_STRINGS = 50000;
    public static final int MAX_SHEETS = 32;
    public static final int MAX_TOTAL_CELLS = 50000;
    public static final long MAX_XML_ENTRY_BYTES = 4194304;
    public static final String SHARED_STRINGS_XML = "xl/sharedStrings.xml";
    public static final String WORKBOOK_XML = "xl/workbook.xml";
    public static final String WORKSHEET_PREFIX = "xl/worksheets/";
    public static final XlsxParser INSTANCE = new XlsxParser();
    public static final F0C builderFactory$delegate = AbstractC5321DgF.A03(XlsxParser$builderFactory$2.INSTANCE);

    public final class ArchiveContents {
        public byte[] sharedStringsBytes;
        public boolean truncated;
        public byte[] workbookBytes;
        public final Map<String, byte[]> worksheetFiles = C3cG.A0j();

        public final byte[] getSharedStringsBytes() {
            return this.sharedStringsBytes;
        }

        public final boolean getTruncated() {
            return this.truncated;
        }

        public final byte[] getWorkbookBytes() {
            return this.workbookBytes;
        }

        public final Map<String, byte[]> getWorksheetFiles() {
            return this.worksheetFiles;
        }

        public final void setSharedStringsBytes(byte[] bArr) {
            this.sharedStringsBytes = bArr;
        }

        public final void setTruncated(boolean z) {
            this.truncated = z;
        }

        public final void setWorkbookBytes(byte[] bArr) {
            this.workbookBytes = bArr;
        }
    }

    public final class ParseBudget {
        public int cells;
        public int renderedCellSlots;

        public final int getCells() {
            return this.cells;
        }

        public final int getRenderedCellSlots() {
            return this.renderedCellSlots;
        }

        public final void setCells(int i) {
            this.cells = i;
        }

        public final void setRenderedCellSlots(int i) {
            this.renderedCellSlots = i;
        }
    }

    /* loaded from: classes3.dex */
    public final class PreviewResult {
        public final List<SpreadsheetSheet> sheets;
        public final boolean truncated;

        public PreviewResult(List<SpreadsheetSheet> list, boolean z) {
            C7384Etj.A0Y(list, 0);
            this.sheets = list;
            this.truncated = z;
        }

        public final List<SpreadsheetSheet> getSheets() {
            return this.sheets;
        }

        public final boolean getTruncated() {
            return this.truncated;
        }
    }

    public final class SharedStringsResult {
        public final List<String> strings;
        public final boolean truncated;

        public SharedStringsResult(List<String> list, boolean z) {
            C7384Etj.A0Y(list, 0);
            this.strings = list;
            this.truncated = z;
        }

        public final List<String> getStrings() {
            return this.strings;
        }

        public final boolean getTruncated() {
            return this.truncated;
        }
    }

    public final class WorksheetResult {
        public final List<List<String>> rows;
        public final boolean truncated;

        /* JADX WARN: Multi-variable type inference failed */
        public WorksheetResult(List<? extends List<String>> list, boolean z) {
            C7384Etj.A0Y(list, 0);
            this.rows = list;
            this.truncated = z;
        }

        public final List<List<String>> getRows() {
            return this.rows;
        }

        public final boolean getTruncated() {
            return this.truncated;
        }
    }

    /* renamed from: com.facebook.aura.file.spreadsheet.XlsxParser$extractStringItem$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<Node, Unit> {
        public final /* synthetic */ StringBuilder $sb;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Node node) throws DOMException {
            C7384Etj.A0Y(node, 0);
            Node nodeFindChild = XmlHelpers.INSTANCE.findChild(node, "t");
            if (nodeFindChild != null) {
                StringBuilder sb = this.$sb;
                String textContent = nodeFindChild.getTextContent();
                if (textContent == null) {
                    textContent = "";
                }
                sb.append(textContent);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(StringBuilder sb) {
            super(1);
            this.$sb = sb;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(Node node) throws DOMException {
            invoke2(node);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.file.spreadsheet.XlsxParser$parseWorksheet$1, reason: invalid class name and case insensitive filesystem */
    public final class C119071 extends AbstractC7559F3s implements G0U<Node, Boolean> {
        public final /* synthetic */ ParseBudget $budget;
        public final /* synthetic */ List<HxE<Integer, String>> $cells;
        public final /* synthetic */ F1E $maxColumnIndex;
        public final /* synthetic */ List<String> $sharedStrings;
        public final /* synthetic */ F1F $truncated;

        /* JADX WARN: Removed duplicated region for block: B:28:0x008f  */
        @Override // X.G0U
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Boolean invoke(org.w3c.dom.Node r10) {
            /*
                r9 = this;
                r8 = 0
                X.C7384Etj.A0Y(r10, r8)
                com.facebook.aura.file.spreadsheet.XlsxParser$ParseBudget r0 = r9.$budget
                int r1 = r0.cells
                r0 = 50000(0xc350, float:7.0065E-41)
                r5 = 0
                r6 = 1
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r6)
                if (r1 < r0) goto L1c
                X.F1F r0 = r9.$truncated
                r0.element = r6
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
                return r0
            L1c:
                com.facebook.aura.file.docx.XmlHelpers r1 = com.facebook.aura.file.docx.XmlHelpers.INSTANCE
                java.lang.String r0 = "r"
                java.lang.String r4 = r1.attr(r10, r0)
                r3 = 256(0x100, float:3.59E-43)
                if (r4 == 0) goto L8f
                int r2 = r4.length()
                r1 = 0
            L2d:
                if (r1 >= r2) goto L3d
                char r0 = r4.charAt(r1)
                boolean r0 = java.lang.Character.isLetter(r0)
                if (r0 != 0) goto L8c
                java.lang.String r4 = r4.substring(r8, r1)
            L3d:
                int r0 = r4.length()
                if (r0 == 0) goto L8f
                com.facebook.aura.file.spreadsheet.XlsxParser r0 = com.facebook.aura.file.spreadsheet.XlsxParser.INSTANCE
                int r0 = com.facebook.aura.file.spreadsheet.XlsxParser.access$columnLetterToIndex(r0, r4, r3)
                int r4 = X.BV6.A02(r0)
            L4d:
                if (r4 < 0) goto L96
                if (r4 >= r3) goto L96
                com.facebook.aura.file.spreadsheet.XlsxParser r1 = com.facebook.aura.file.spreadsheet.XlsxParser.INSTANCE
                java.util.List<java.lang.String> r0 = r9.$sharedStrings
                java.lang.String r1 = com.facebook.aura.file.spreadsheet.XlsxParser.access$parseCellValue(r1, r10, r0)
                r0 = 16384(0x4000, float:2.2959E-41)
                java.lang.String r3 = X.BQG.A17(r1, r0)
                X.F1F r2 = r9.$truncated
                boolean r0 = r2.element
                if (r0 != 0) goto L6f
                int r1 = r1.length()
                int r0 = r3.length()
                if (r1 <= r0) goto L70
            L6f:
                r5 = 1
            L70:
                r2.element = r5
                java.util.List<X.HxE<java.lang.Integer, java.lang.String>> r1 = r9.$cells
                X.HxE r0 = X.C60Q.A0y(r3, r4)
                r1.add(r0)
                com.facebook.aura.file.spreadsheet.XlsxParser$ParseBudget r1 = r9.$budget
                int r0 = r1.cells
                int r0 = r0 + 1
                r1.cells = r0
                X.F1E r1 = r9.$maxColumnIndex
                int r0 = r1.element
                if (r4 <= r0) goto L8b
                r1.element = r4
            L8b:
                return r7
            L8c:
                int r1 = r1 + 1
                goto L2d
            L8f:
                java.util.List<X.HxE<java.lang.Integer, java.lang.String>> r0 = r9.$cells
                int r4 = r0.size()
                goto L4d
            L96:
                X.F1F r0 = r9.$truncated
                r0.element = r6
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.spreadsheet.XlsxParser.C119071.invoke(org.w3c.dom.Node):java.lang.Boolean");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C119071(ParseBudget parseBudget, F1F f1f, List<HxE<Integer, String>> list, List<String> list2, F1E f1e) {
            super(1);
            this.$budget = parseBudget;
            this.$truncated = f1f;
            this.$cells = list;
            this.$sharedStrings = list2;
            this.$maxColumnIndex = f1e;
        }
    }

    private final synchronized DocumentBuilder newNamespaceAwareBuilder() {
        return ((DocumentBuilderFactory) builderFactory$delegate.getValue()).newDocumentBuilder();
    }

    public final List<SpreadsheetSheet> parse(byte[] bArr) {
        C7384Etj.A0Y(bArr, 0);
        return parsePreviewFromStream(new ByteArrayInputStream(bArr)).sheets;
    }

    public final PreviewResult parsePreview(File file) {
        C7384Etj.A0Y(file, 0);
        OoxmlArchiveGuard.Inspection inspectionInspect = OoxmlArchiveGuard.INSTANCE.inspect(file, OoxmlArchiveGuard.xlsxLimits);
        if (inspectionInspect instanceof OoxmlArchiveGuard.Inspection.Rejected) {
            throw new OoxmlArchiveGuard.LimitExceededException(((OoxmlArchiveGuard.Inspection.Rejected) inspectionInspect).reason);
        }
        return parsePreviewFromStream(new FileInputStream(file));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int columnLetterToIndex(String str, int i) {
        int length = str.toUpperCase(Locale.ROOT).length();
        int iCharAt = 0;
        for (int i2 = 0; i2 < length; i2++) {
            iCharAt = (iCharAt * 26) + (r4.charAt(i2) - '@');
            if (iCharAt > i) {
                return i;
            }
        }
        return iCharAt - 1;
    }

    private final ArchiveContents extractArchive(InputStream inputStream) throws IOException {
        ArchiveContents archiveContents = new ArchiveContents();
        OoxmlArchiveGuard.Limits limits = OoxmlArchiveGuard.xlsxLimits;
        C7384Etj.A0Y(limits, 0);
        OoxmlArchiveGuard.ReadBudget readBudget = new OoxmlArchiveGuard.ReadBudget(limits);
        ZipInputStream zipInputStream = new ZipInputStream(inputStream);
        try {
            for (ZipEntry nextEntry = zipInputStream.getNextEntry(); nextEntry != null; nextEntry = zipInputStream.getNextEntry()) {
                readBudget.registerEntry(nextEntry);
                if (SHARED_STRINGS_XML.equals(nextEntry.getName())) {
                    archiveContents.sharedStringsBytes = AbstractC7610F5x.A1Z(readBudget, zipInputStream, nextEntry, 4194304L);
                } else if (WORKBOOK_XML.equals(nextEntry.getName())) {
                    archiveContents.workbookBytes = AbstractC7610F5x.A1Z(readBudget, zipInputStream, nextEntry, 4194304L);
                } else {
                    String name = nextEntry.getName();
                    C7384Etj.A0U(name);
                    if (name.startsWith(WORKSHEET_PREFIX)) {
                        String name2 = nextEntry.getName();
                        C7384Etj.A0U(name2);
                        if (name2.endsWith(".xml") && !nextEntry.isDirectory()) {
                            if (archiveContents.worksheetFiles.size() < 32) {
                                archiveContents.worksheetFiles.put(nextEntry.getName(), AbstractC7610F5x.A1Z(readBudget, zipInputStream, nextEntry, 4194304L));
                            } else {
                                archiveContents.truncated = true;
                            }
                        }
                    }
                }
                zipInputStream.closeEntry();
            }
            zipInputStream.close();
            return archiveContents;
        } finally {
        }
    }

    private final String extractStringItem(Node node) throws DOMException {
        XmlHelpers xmlHelpers = XmlHelpers.INSTANCE;
        Node nodeFindChild = xmlHelpers.findChild(node, "t");
        if (nodeFindChild != null) {
            String textContent = nodeFindChild.getTextContent();
            return textContent == null ? "" : textContent;
        }
        StringBuilder sbA0w = C60O.A0w();
        xmlHelpers.forEachChild(node, "r", new AnonymousClass1(sbA0w));
        return sbA0w.toString();
    }

    private final DocumentBuilderFactory getBuilderFactory() {
        return (DocumentBuilderFactory) builderFactory$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String parseCellValue(Node node, List<String> list) {
        Node nodeFindChild;
        String textContent;
        XmlHelpers xmlHelpers = XmlHelpers.INSTANCE;
        String strAttr = xmlHelpers.attr(node, "t");
        Node nodeFindChild2 = xmlHelpers.findChild(node, HatchSpacesDataSourceKt.VERSION_QUERY_PARAM);
        String textContent2 = nodeFindChild2 != null ? nodeFindChild2.getTextContent() : null;
        String str = "";
        if (textContent2 == null) {
            textContent2 = "";
        }
        if (strAttr != null) {
            int iHashCode = strAttr.hashCode();
            if (iHashCode != 98) {
                if (iHashCode != 115) {
                    if (iHashCode == 2103308504 && strAttr.equals("inlineStr")) {
                        Node nodeFindChild3 = xmlHelpers.findChild(node, "is");
                        return (nodeFindChild3 == null || (nodeFindChild = xmlHelpers.findChild(nodeFindChild3, "t")) == null || (textContent = nodeFindChild.getTextContent()) == null) ? "" : textContent;
                    }
                } else if (strAttr.equals("s")) {
                    Integer numA0r = C9tI.A0r(textContent2);
                    if (numA0r != null) {
                        int iIntValue = numA0r.intValue();
                        if (iIntValue >= 0 && iIntValue < list.size()) {
                            str = list.get(iIntValue);
                        }
                        return str;
                    }
                }
            } else if (strAttr.equals(CRD.__redex_internal_original_name)) {
                return textContent2.equals("1") ? "TRUE" : "FALSE";
            }
        }
        return textContent2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.aura.file.spreadsheet.XlsxParser.PreviewResult parsePreviewFromStream(java.io.InputStream r12) throws org.xml.sax.SAXException, java.io.IOException {
        /*
            r11 = this;
            com.facebook.aura.file.spreadsheet.XlsxParser$ArchiveContents r3 = r11.extractArchive(r12)
            byte[] r2 = r3.sharedStringsBytes
            r1 = 0
            if (r2 == 0) goto L84
            com.facebook.aura.file.spreadsheet.XlsxParser r0 = com.facebook.aura.file.spreadsheet.XlsxParser.INSTANCE
            com.facebook.aura.file.spreadsheet.XlsxParser$SharedStringsResult r2 = r0.parseSharedStrings(r2)
        Lf:
            java.util.List<java.lang.String> r9 = r2.strings
            byte[] r1 = r3.workbookBytes
            if (r1 == 0) goto L81
            com.facebook.aura.file.spreadsheet.XlsxParser r0 = com.facebook.aura.file.spreadsheet.XlsxParser.INSTANCE
            java.util.List r0 = r0.parseWorkbookSheetNames(r1)
        L1b:
            java.util.ArrayList r8 = X.C3cG.A0h()
            com.facebook.aura.file.spreadsheet.XlsxParser$ParseBudget r7 = new com.facebook.aura.file.spreadsheet.XlsxParser$ParseBudget
            r7.<init>()
            boolean r1 = r3.truncated
            if (r1 != 0) goto L2d
            boolean r1 = r2.truncated
            r6 = 0
            if (r1 == 0) goto L2e
        L2d:
            r6 = 1
        L2e:
            java.util.Map<java.lang.String, byte[]> r1 = r3.worksheetFiles
            java.util.Set r2 = r1.entrySet()
            com.facebook.aura.file.spreadsheet.XlsxParser$parsePreviewFromStream$$inlined$sortedBy$1 r1 = new com.facebook.aura.file.spreadsheet.XlsxParser$parsePreviewFromStream$$inlined$sortedBy$1
            r1.<init>()
            java.util.List r1 = X.AbstractC0878AGe.A0c(r2, r1)
            java.util.Iterator r10 = r1.iterator()
            r3 = 0
        L42:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L8c
            int r5 = r3 + 1
            java.util.Map$Entry r2 = X.C3cH.A0l(r10)
            if (r3 < 0) goto L7a
            int r1 = r0.size()
            if (r3 >= r1) goto L7a
            java.lang.Object r4 = r0.get(r3)
        L5a:
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r1 = r2.getValue()
            byte[] r1 = (byte[]) r1
            com.facebook.aura.file.spreadsheet.XlsxParser$WorksheetResult r3 = r11.parseWorksheet(r1, r9, r7)
            java.util.List<java.util.List<java.lang.String>> r2 = r3.rows
            com.facebook.aura.file.spreadsheet.SpreadsheetSheet r1 = new com.facebook.aura.file.spreadsheet.SpreadsheetSheet
            r1.<init>(r4, r2)
            r8.add(r1)
            if (r6 != 0) goto L77
            boolean r1 = r3.truncated
            r6 = 0
            if (r1 == 0) goto L78
        L77:
            r6 = 1
        L78:
            r3 = r5
            goto L42
        L7a:
            java.lang.String r1 = "Sheet"
            java.lang.String r4 = X.FGI.A0H(r1, r5)
            goto L5a
        L81:
            X.AGi r0 = X.C0881AGi.A00
            goto L1b
        L84:
            X.AGi r0 = X.C0881AGi.A00
            com.facebook.aura.file.spreadsheet.XlsxParser$SharedStringsResult r2 = new com.facebook.aura.file.spreadsheet.XlsxParser$SharedStringsResult
            r2.<init>(r0, r1)
            goto Lf
        L8c:
            com.facebook.aura.file.spreadsheet.XlsxParser$PreviewResult r0 = new com.facebook.aura.file.spreadsheet.XlsxParser$PreviewResult
            r0.<init>(r8, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.spreadsheet.XlsxParser.parsePreviewFromStream(java.io.InputStream):com.facebook.aura.file.spreadsheet.XlsxParser$PreviewResult");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.aura.file.spreadsheet.XlsxParser.SharedStringsResult parseSharedStrings(byte[] r10) throws org.xml.sax.SAXException, org.w3c.dom.DOMException, java.io.IOException {
        /*
            r9 = this;
            javax.xml.parsers.DocumentBuilder r1 = r9.newNamespaceAwareBuilder()
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r0.<init>(r10)
            org.w3c.dom.Document r1 = r1.parse(r0)
            java.util.ArrayList r8 = X.C3cG.A0h()
            java.lang.String r0 = "si"
            org.w3c.dom.NodeList r7 = r1.getElementsByTagName(r0)
            int r1 = r7.getLength()
            r0 = 50000(0xc350, float:7.0065E-41)
            int r6 = java.lang.Math.min(r1, r0)
            int r0 = r7.getLength()
            boolean r5 = X.C8j4.A1V(r0, r6)
            r4 = 0
        L2b:
            if (r4 >= r6) goto L52
            org.w3c.dom.Node r0 = r7.item(r4)
            X.C7384Etj.A0U(r0)
            java.lang.String r3 = r9.extractStringItem(r0)
            r0 = 16384(0x4000, float:2.2959E-41)
            java.lang.String r2 = X.BQG.A17(r3, r0)
            if (r5 != 0) goto L4b
            int r1 = r2.length()
            int r0 = r3.length()
            r5 = 0
            if (r1 >= r0) goto L4c
        L4b:
            r5 = 1
        L4c:
            r8.add(r2)
            int r4 = r4 + 1
            goto L2b
        L52:
            com.facebook.aura.file.spreadsheet.XlsxParser$SharedStringsResult r0 = new com.facebook.aura.file.spreadsheet.XlsxParser$SharedStringsResult
            r0.<init>(r8, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.spreadsheet.XlsxParser.parseSharedStrings(byte[]):com.facebook.aura.file.spreadsheet.XlsxParser$SharedStringsResult");
    }

    private final List<String> parseWorkbookSheetNames(byte[] bArr) throws SAXException, IOException {
        Document document = newNamespaceAwareBuilder().parse(new ByteArrayInputStream(bArr));
        ArrayList arrayListA0h = C3cG.A0h();
        NodeList elementsByTagName = document.getElementsByTagName("sheet");
        int iMin = Math.min(elementsByTagName.getLength(), 32);
        for (int i = 0; i < iMin; i++) {
            XmlHelpers xmlHelpers = XmlHelpers.INSTANCE;
            Node nodeItem = elementsByTagName.item(i);
            C7384Etj.A0U(nodeItem);
            String strAttr = xmlHelpers.attr(nodeItem, "name");
            if (strAttr == null) {
                strAttr = FGI.A0H("Sheet", i + 1);
            }
            arrayListA0h.add(strAttr);
        }
        return arrayListA0h;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.aura.file.spreadsheet.XlsxParser.WorksheetResult parseWorksheet(byte[] r13, java.util.List<java.lang.String> r14, com.facebook.aura.file.spreadsheet.XlsxParser.ParseBudget r15) throws org.xml.sax.SAXException, java.io.IOException {
        /*
            r12 = this;
            javax.xml.parsers.DocumentBuilder r1 = r12.newNamespaceAwareBuilder()
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r0.<init>(r13)
            org.w3c.dom.Document r1 = r1.parse(r0)
            java.util.ArrayList r3 = X.C3cG.A0h()
            X.F1E r13 = new X.F1E
            r13.<init>()
            X.F1F r10 = new X.F1F
            r10.<init>()
            java.lang.String r0 = "row"
            org.w3c.dom.NodeList r4 = r1.getElementsByTagName(r0)
            int r1 = r4.getLength()
            r0 = 500(0x1f4, float:7.0E-43)
            int r5 = java.lang.Math.min(r1, r0)
            r7 = 0
        L2c:
            r6 = 1
            r9 = r15
            if (r7 >= r5) goto L39
            int r1 = r15.cells
            r0 = 50000(0xc350, float:7.0065E-41)
            if (r1 < r0) goto Lb7
            r10.element = r6
        L39:
            boolean r0 = r10.element
            if (r0 != 0) goto L44
            int r0 = r4.getLength()
            r4 = 0
            if (r0 <= r5) goto L45
        L44:
            r4 = 1
        L45:
            r10.element = r4
            int r0 = r13.element
            int r5 = r0 + 1
            r2 = 100000(0x186a0, float:1.4013E-40)
            int r0 = r15.renderedCellSlots
            int r2 = r2 - r0
            r0 = 0
            if (r2 < r0) goto Lb5
            if (r2 <= 0) goto Lb5
            int r1 = r3.size()
            int r2 = r2 / r5
            int r0 = java.lang.Math.max(r6, r2)
            int r1 = java.lang.Math.min(r1, r0)
        L63:
            if (r4 != 0) goto L6c
            int r0 = r3.size()
            if (r1 < r0) goto L6c
            r6 = 0
        L6c:
            r10.element = r6
            java.util.List r0 = X.AbstractC0878AGe.A0a(r3, r1)
            java.util.ArrayList r4 = X.AnonymousClass003.A0i(r0)
            java.util.Iterator r7 = r0.iterator()
        L7a:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Ldc
            java.lang.Object r2 = r7.next()
            java.util.List r2 = (java.util.List) r2
            java.util.ArrayList r6 = X.C60O.A11(r5)
            r1 = 0
        L8b:
            if (r1 >= r5) goto L95
            java.lang.String r0 = ""
            r6.add(r0)
            int r1 = r1 + 1
            goto L8b
        L95:
            java.util.Iterator r3 = r2.iterator()
        L99:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto Lb1
            X.HxE r2 = X.C60Q.A10(r3)
            A r0 = r2.first
            int r1 = X.AnonymousClass001.A0F(r0)
            B r0 = r2.second
            if (r1 >= r5) goto L99
            r6.set(r1, r0)
            goto L99
        Lb1:
            r4.add(r6)
            goto L7a
        Lb5:
            r1 = 0
            goto L63
        Lb7:
            org.w3c.dom.Node r2 = r4.item(r7)
            java.util.ArrayList r11 = X.C3cG.A0h()
            com.facebook.aura.file.docx.XmlHelpers r1 = com.facebook.aura.file.docx.XmlHelpers.INSTANCE
            X.C7384Etj.A0X(r2)
            com.facebook.aura.file.spreadsheet.XlsxParser$parseWorksheet$1 r8 = new com.facebook.aura.file.spreadsheet.XlsxParser$parseWorksheet$1
            r12 = r14
            r8.<init>(r9, r10, r11, r12, r13)
            java.lang.String r0 = "c"
            r1.forEachChildWhile(r2, r0, r8)
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto Ld8
            r3.add(r11)
        Ld8:
            int r7 = r7 + 1
            goto L2c
        Ldc:
            int r1 = r15.renderedCellSlots
            int r0 = r4.size()
            int r0 = r0 * r5
            int r1 = r1 + r0
            r15.renderedCellSlots = r1
            boolean r1 = r10.element
            com.facebook.aura.file.spreadsheet.XlsxParser$WorksheetResult r0 = new com.facebook.aura.file.spreadsheet.XlsxParser$WorksheetResult
            r0.<init>(r4, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.spreadsheet.XlsxParser.parseWorksheet(byte[], java.util.List, com.facebook.aura.file.spreadsheet.XlsxParser$ParseBudget):com.facebook.aura.file.spreadsheet.XlsxParser$WorksheetResult");
    }

    private final void trySetFeature(DocumentBuilderFactory documentBuilderFactory, String str, boolean z) throws ParserConfigurationException {
        try {
            documentBuilderFactory.setFeature(str, z);
        } catch (Exception unused) {
        }
    }

    public final List<SpreadsheetSheet> parse(File file) {
        C7384Etj.A0Y(file, 0);
        return parsePreview(file).sheets;
    }
}
