package com.facebook.aura.markdown.render.spacing;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class BlockSpacingCategory {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ BlockSpacingCategory[] $VALUES;
    public static final BlockSpacingCategory ATTACHMENT;
    public static final BlockSpacingCategory ATTRIBUTION;
    public static final BlockSpacingCategory BLOCK_QUOTE;
    public static final BlockSpacingCategory BUBBLE;
    public static final BlockSpacingCategory CODE;
    public static final BlockSpacingCategory CUSTOM;
    public static final BlockSpacingCategory HEADING;
    public static final BlockSpacingCategory HTML;
    public static final BlockSpacingCategory LIST;
    public static final BlockSpacingCategory MATH;
    public static final BlockSpacingCategory MERMAID;
    public static final BlockSpacingCategory PARAGRAPH;
    public static final BlockSpacingCategory PRESENTATION;
    public static final BlockSpacingCategory SOURCES;
    public static final BlockSpacingCategory TABLE;
    public static final BlockSpacingCategory THEMATIC_BREAK;
    public static final BlockSpacingCategory WIDGET;

    static {
        BlockSpacingCategory blockSpacingCategory = new BlockSpacingCategory("PARAGRAPH", 0);
        PARAGRAPH = blockSpacingCategory;
        BlockSpacingCategory blockSpacingCategory2 = new BlockSpacingCategory("HEADING", 1);
        HEADING = blockSpacingCategory2;
        BlockSpacingCategory blockSpacingCategory3 = new BlockSpacingCategory("LIST", 2);
        LIST = blockSpacingCategory3;
        BlockSpacingCategory blockSpacingCategory4 = new BlockSpacingCategory("BLOCK_QUOTE", 3);
        BLOCK_QUOTE = blockSpacingCategory4;
        BlockSpacingCategory blockSpacingCategory5 = new BlockSpacingCategory("CODE", 4);
        CODE = blockSpacingCategory5;
        BlockSpacingCategory blockSpacingCategory6 = new BlockSpacingCategory("TABLE", 5);
        TABLE = blockSpacingCategory6;
        BlockSpacingCategory blockSpacingCategory7 = new BlockSpacingCategory("HTML", 6);
        HTML = blockSpacingCategory7;
        BlockSpacingCategory blockSpacingCategory8 = new BlockSpacingCategory("THEMATIC_BREAK", 7);
        THEMATIC_BREAK = blockSpacingCategory8;
        BlockSpacingCategory blockSpacingCategory9 = new BlockSpacingCategory("MERMAID", 8);
        MERMAID = blockSpacingCategory9;
        BlockSpacingCategory blockSpacingCategory10 = new BlockSpacingCategory("MATH", 9);
        MATH = blockSpacingCategory10;
        BlockSpacingCategory blockSpacingCategory11 = new BlockSpacingCategory("SOURCES", 10);
        SOURCES = blockSpacingCategory11;
        BlockSpacingCategory blockSpacingCategory12 = new BlockSpacingCategory("ATTACHMENT", 11);
        ATTACHMENT = blockSpacingCategory12;
        BlockSpacingCategory blockSpacingCategory13 = new BlockSpacingCategory("CUSTOM", 12);
        CUSTOM = blockSpacingCategory13;
        BlockSpacingCategory blockSpacingCategory14 = new BlockSpacingCategory("WIDGET", 13);
        WIDGET = blockSpacingCategory14;
        BlockSpacingCategory blockSpacingCategory15 = new BlockSpacingCategory("PRESENTATION", 14);
        PRESENTATION = blockSpacingCategory15;
        BlockSpacingCategory blockSpacingCategory16 = new BlockSpacingCategory("ATTRIBUTION", 15);
        ATTRIBUTION = blockSpacingCategory16;
        BlockSpacingCategory blockSpacingCategory17 = new BlockSpacingCategory("BUBBLE", 16);
        BUBBLE = blockSpacingCategory17;
        BlockSpacingCategory[] blockSpacingCategoryArr = {blockSpacingCategory, blockSpacingCategory2, blockSpacingCategory3, blockSpacingCategory4, blockSpacingCategory5, blockSpacingCategory6, blockSpacingCategory7, blockSpacingCategory8, blockSpacingCategory9, blockSpacingCategory10, blockSpacingCategory11, blockSpacingCategory12, blockSpacingCategory13, blockSpacingCategory14, blockSpacingCategory15, blockSpacingCategory16, blockSpacingCategory17};
        $VALUES = blockSpacingCategoryArr;
        $ENTRIES = new F3w(blockSpacingCategoryArr);
    }

    public static Ey9<BlockSpacingCategory> getEntries() {
        return $ENTRIES;
    }

    public static BlockSpacingCategory valueOf(String str) {
        return (BlockSpacingCategory) Enum.valueOf(BlockSpacingCategory.class, str);
    }

    public static BlockSpacingCategory[] values() {
        return (BlockSpacingCategory[]) $VALUES.clone();
    }

    public BlockSpacingCategory(String str, int i) {
    }
}
