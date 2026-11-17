package com.facebook.aura.markdown.parser.ast;

import X.AHD;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06H;
import X.C0KA;
import X.C3cG;
import X.C3cI;
import X.C3cJ;
import X.C60O;
import X.C7384Etj;
import X.C8j4;
import X.C8j5;

/* loaded from: classes4.dex */
public interface AuraBlock {

    public final class BlockQuote implements AuraBlock {
        public final AHD<AuraBlock> children;

        /* JADX WARN: Multi-variable type inference failed */
        public BlockQuote(AHD<? extends AuraBlock> ahd) {
            C7384Etj.A0Y(ahd, 0);
            this.children = ahd;
        }

        public final BlockQuote copy(AHD<? extends AuraBlock> ahd) {
            C7384Etj.A0Y(ahd, 0);
            return new BlockQuote(ahd);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof BlockQuote) && C7384Etj.areEqual(this.children, ((BlockQuote) obj).children));
        }

        public static /* synthetic */ BlockQuote copy$default(BlockQuote blockQuote, AHD ahd, int i, Object obj) {
            if ((i & 1) != 0) {
                ahd = blockQuote.children;
            }
            C7384Etj.A0Y(ahd, 0);
            return new BlockQuote(ahd);
        }

        public final AHD<AuraBlock> component1() {
            return this.children;
        }

        public final AHD<AuraBlock> getChildren() {
            return this.children;
        }

        public int hashCode() {
            return this.children.hashCode();
        }

        public String toString() {
            return C3cJ.A0M("BlockQuote(children=", this.children);
        }
    }

    public final class CodeBlock implements AuraBlock {
        public final String code;
        public final String language;
        public final boolean unclosed;

        public CodeBlock(String str, String str2, boolean z) {
            C7384Etj.A0Y(str, 0);
            this.code = str;
            this.language = str2;
            this.unclosed = z;
        }

        public final CodeBlock copy(String str, String str2, boolean z) {
            C7384Etj.A0Y(str, 0);
            return new CodeBlock(str, str2, z);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof CodeBlock) {
                    CodeBlock codeBlock = (CodeBlock) obj;
                    if (!C7384Etj.areEqual(this.code, codeBlock.code) || !C7384Etj.areEqual(this.language, codeBlock.language) || this.unclosed != codeBlock.unclosed) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ CodeBlock copy$default(CodeBlock codeBlock, String str, String str2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = codeBlock.code;
            }
            if ((i & 2) != 0) {
                str2 = codeBlock.language;
            }
            if ((i & 4) != 0) {
                z = codeBlock.unclosed;
            }
            return codeBlock.copy(str, str2, z);
        }

        public final String component1() {
            return this.code;
        }

        public final String component2() {
            return this.language;
        }

        public final boolean component3() {
            return this.unclosed;
        }

        public final String getCode() {
            return this.code;
        }

        public final String getLanguage() {
            return this.language;
        }

        public final boolean getUnclosed() {
            return this.unclosed;
        }

        public int hashCode() {
            return C0KA.A00((AnonymousClass001.A0G(this.code) + AnonymousClass006.A0G(this.language)) * 31, this.unclosed);
        }

        public String toString() {
            String str = this.code;
            String str2 = this.language;
            boolean z = this.unclosed;
            StringBuilder sbA0x = C3cI.A0x("CodeBlock(code=", str);
            sbA0x.append(", language=");
            sbA0x.append(str2);
            return C8j5.A0W(", unclosed=", sbA0x, z);
        }

        public /* synthetic */ CodeBlock(String str, String str2, boolean z, int i, C06H c06h) {
            this(str, str2, AnonymousClass005.A1O(i, z));
        }
    }

    public final class Custom implements AuraBlock {
        public final String name;
        public final Object payload;

        public Custom(String str, Object obj) {
            C7384Etj.A0Y(str, 0);
            this.name = str;
            this.payload = obj;
        }

        public final Custom copy(String str, Object obj) {
            C7384Etj.A0Y(str, 0);
            return new Custom(str, obj);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Custom) {
                    Custom custom = (Custom) obj;
                    if (!C7384Etj.areEqual(this.name, custom.name) || !C7384Etj.areEqual(this.payload, custom.payload)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Custom copy$default(Custom custom, String str, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = custom.name;
            }
            if ((i & 2) != 0) {
                obj = custom.payload;
            }
            C7384Etj.A0Y(str, 0);
            return new Custom(str, obj);
        }

        public final String component1() {
            return this.name;
        }

        public final Object component2() {
            return this.payload;
        }

        public final String getName() {
            return this.name;
        }

        public final Object getPayload() {
            return this.payload;
        }

        public int hashCode() {
            return AnonymousClass001.A0G(this.name) + AnonymousClass006.A0D(this.payload);
        }

        public String toString() {
            return C3cJ.A0L(this.payload, ", payload=", C3cI.A0x("Custom(name=", this.name));
        }
    }

    public final class Heading implements AuraBlock {
        public final AHD<AuraInline> inlines;
        public final int level;

        /* JADX WARN: Multi-variable type inference failed */
        public Heading(int i, AHD<? extends AuraInline> ahd) {
            C7384Etj.A0Y(ahd, 1);
            this.level = i;
            this.inlines = ahd;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Heading) {
                    Heading heading = (Heading) obj;
                    if (this.level != heading.level || !C7384Etj.areEqual(this.inlines, heading.inlines)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Heading copy$default(Heading heading, int i, AHD ahd, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = heading.level;
            }
            if ((i2 & 2) != 0) {
                ahd = heading.inlines;
            }
            return C8j4.A0h(i, ahd);
        }

        public final int component1() {
            return this.level;
        }

        public final AHD<AuraInline> component2() {
            return this.inlines;
        }

        public final AHD<AuraInline> getInlines() {
            return this.inlines;
        }

        public final int getLevel() {
            return this.level;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.inlines, this.level * 31);
        }

        public String toString() {
            return C3cJ.A0L(this.inlines, ", inlines=", C60O.A0y("Heading(level=", this.level));
        }

        public final Heading copy(int i, AHD<? extends AuraInline> ahd) {
            return C8j4.A0h(i, ahd);
        }
    }

    public final class HtmlBlock implements AuraBlock {
        public final String html;

        public HtmlBlock(String str) {
            C7384Etj.A0Y(str, 0);
            this.html = str;
        }

        public final HtmlBlock copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new HtmlBlock(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof HtmlBlock) && C7384Etj.areEqual(this.html, ((HtmlBlock) obj).html));
        }

        public static /* synthetic */ HtmlBlock copy$default(HtmlBlock htmlBlock, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = htmlBlock.html;
            }
            C7384Etj.A0Y(str, 0);
            return new HtmlBlock(str);
        }

        public final String component1() {
            return this.html;
        }

        public final String getHtml() {
            return this.html;
        }

        public int hashCode() {
            return this.html.hashCode();
        }

        public String toString() {
            return C60O.A0r("HtmlBlock(html=", this.html);
        }
    }

    public final class OrderedList implements AuraBlock {
        public final AHD<ListItem> items;
        public final int startNumber;
        public final boolean tight;

        public OrderedList(AHD<ListItem> ahd, int i, boolean z) {
            C7384Etj.A0Y(ahd, 0);
            this.items = ahd;
            this.startNumber = i;
            this.tight = z;
        }

        public final OrderedList copy(AHD<ListItem> ahd, int i, boolean z) {
            C7384Etj.A0Y(ahd, 0);
            return new OrderedList(ahd, i, z);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof OrderedList) {
                    OrderedList orderedList = (OrderedList) obj;
                    if (!C7384Etj.areEqual(this.items, orderedList.items) || this.startNumber != orderedList.startNumber || this.tight != orderedList.tight) {
                    }
                }
                return false;
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ OrderedList copy$default(OrderedList orderedList, AHD ahd, int i, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                ahd = orderedList.items;
            }
            if ((i2 & 2) != 0) {
                i = orderedList.startNumber;
            }
            if ((i2 & 4) != 0) {
                z = orderedList.tight;
            }
            return orderedList.copy(ahd, i, z);
        }

        public final AHD<ListItem> component1() {
            return this.items;
        }

        public final int component2() {
            return this.startNumber;
        }

        public final boolean component3() {
            return this.tight;
        }

        public final AHD<ListItem> getItems() {
            return this.items;
        }

        public final int getStartNumber() {
            return this.startNumber;
        }

        public final boolean getTight() {
            return this.tight;
        }

        public int hashCode() {
            return C0KA.A00((AnonymousClass005.A0E(this.items) + this.startNumber) * 31, this.tight);
        }

        public String toString() {
            AHD<ListItem> ahd = this.items;
            int i = this.startNumber;
            boolean z = this.tight;
            StringBuilder sbA0f = C3cG.A0f(ahd, "OrderedList(items=");
            sbA0f.append(", startNumber=");
            sbA0f.append(i);
            return C8j5.A0W(", tight=", sbA0f, z);
        }
    }

    public final class Paragraph implements AuraBlock {
        public final AHD<AuraInline> inlines;

        /* JADX WARN: Multi-variable type inference failed */
        public Paragraph(AHD<? extends AuraInline> ahd) {
            C7384Etj.A0Y(ahd, 0);
            this.inlines = ahd;
        }

        public final Paragraph copy(AHD<? extends AuraInline> ahd) {
            C7384Etj.A0Y(ahd, 0);
            return new Paragraph(ahd);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Paragraph) && C7384Etj.areEqual(this.inlines, ((Paragraph) obj).inlines));
        }

        public static /* synthetic */ Paragraph copy$default(Paragraph paragraph, AHD ahd, int i, Object obj) {
            if ((i & 1) != 0) {
                ahd = paragraph.inlines;
            }
            C7384Etj.A0Y(ahd, 0);
            return new Paragraph(ahd);
        }

        public final AHD<AuraInline> component1() {
            return this.inlines;
        }

        public final AHD<AuraInline> getInlines() {
            return this.inlines;
        }

        public int hashCode() {
            return this.inlines.hashCode();
        }

        public String toString() {
            return C3cJ.A0M("Paragraph(inlines=", this.inlines);
        }
    }

    public final class Table implements AuraBlock {
        public final AHD<TableAlignment> alignments;
        public final AHD<TableCell> header;
        public final AHD<AHD<TableCell>> rows;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Table) {
                    Table table = (Table) obj;
                    if (!C7384Etj.areEqual(this.header, table.header) || !C7384Etj.areEqual(this.rows, table.rows) || !C7384Etj.areEqual(this.alignments, table.alignments)) {
                    }
                }
                return false;
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Table copy$default(Table table, AHD ahd, AHD ahd2, AHD ahd3, int i, Object obj) {
            if ((i & 1) != 0) {
                ahd = table.header;
            }
            if ((i & 2) != 0) {
                ahd2 = table.rows;
            }
            if ((i & 4) != 0) {
                ahd3 = table.alignments;
            }
            return table.copy(ahd, ahd2, ahd3);
        }

        public final AHD<TableCell> component1() {
            return this.header;
        }

        public final AHD<AHD<TableCell>> component2() {
            return this.rows;
        }

        public final AHD<TableAlignment> component3() {
            return this.alignments;
        }

        public final AHD<TableAlignment> getAlignments() {
            return this.alignments;
        }

        public final AHD<TableCell> getHeader() {
            return this.header;
        }

        public final AHD<AHD<TableCell>> getRows() {
            return this.rows;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.alignments, AnonymousClass005.A0F(this.rows, AnonymousClass005.A0E(this.header)));
        }

        public String toString() {
            AHD<TableCell> ahd = this.header;
            AHD<AHD<TableCell>> ahd2 = this.rows;
            AHD<TableAlignment> ahd3 = this.alignments;
            StringBuilder sbA0f = C3cG.A0f(ahd, "Table(header=");
            sbA0f.append(", rows=");
            sbA0f.append(ahd2);
            return C3cJ.A0L(ahd3, ", alignments=", sbA0f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Table(AHD<TableCell> ahd, AHD<? extends AHD<TableCell>> ahd2, AHD<? extends TableAlignment> ahd3) {
            AnonymousClass005.A0x(ahd, ahd2, ahd3);
            this.header = ahd;
            this.rows = ahd2;
            this.alignments = ahd3;
        }

        public final Table copy(AHD<TableCell> ahd, AHD<? extends AHD<TableCell>> ahd2, AHD<? extends TableAlignment> ahd3) {
            AnonymousClass005.A0x(ahd, ahd2, ahd3);
            return new Table(ahd, ahd2, ahd3);
        }
    }

    public final class ThematicBreak implements AuraBlock {
        public static final ThematicBreak INSTANCE = new ThematicBreak();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ThematicBreak);
        }

        public String toString() {
            return "ThematicBreak";
        }

        public int hashCode() {
            return 1873275942;
        }
    }

    public final class UnorderedList implements AuraBlock {
        public final AHD<ListItem> items;
        public final boolean tight;

        public UnorderedList(AHD<ListItem> ahd, boolean z) {
            C7384Etj.A0Y(ahd, 0);
            this.items = ahd;
            this.tight = z;
        }

        public final UnorderedList copy(AHD<ListItem> ahd, boolean z) {
            C7384Etj.A0Y(ahd, 0);
            return new UnorderedList(ahd, z);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof UnorderedList) {
                    UnorderedList unorderedList = (UnorderedList) obj;
                    if (!C7384Etj.areEqual(this.items, unorderedList.items) || this.tight != unorderedList.tight) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ UnorderedList copy$default(UnorderedList unorderedList, AHD ahd, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                ahd = unorderedList.items;
            }
            if ((i & 2) != 0) {
                z = unorderedList.tight;
            }
            C7384Etj.A0Y(ahd, 0);
            return new UnorderedList(ahd, z);
        }

        public final AHD<ListItem> component1() {
            return this.items;
        }

        public final boolean component2() {
            return this.tight;
        }

        public final AHD<ListItem> getItems() {
            return this.items;
        }

        public final boolean getTight() {
            return this.tight;
        }

        public int hashCode() {
            return C0KA.A00(AnonymousClass005.A0E(this.items), this.tight);
        }

        public String toString() {
            AHD<ListItem> ahd = this.items;
            return C8j5.A0W(", tight=", C3cG.A0f(ahd, "UnorderedList(items="), this.tight);
        }
    }
}
