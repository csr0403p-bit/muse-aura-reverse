package com.facebook.aura.markdown.render.spacing;

import X.AbstractC0878AGe;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C1DG;
import X.C3cG;
import X.C7384Etj;
import X.C8j3;
import com.facebook.aura.markdown.parser.ast.AuraBlock;
import com.facebook.aura.markdown.parser.ast.AuraInline;
import com.facebook.aura.markdown.parser.custom.extensions.AuraCustomBlockNames;
import com.facebook.aura.markdown.parser.custom.extensions.AuraCustomInlineNames;
import com.facebook.aura.markdown.render.AuraMarkdownTheme;

/* loaded from: classes4.dex */
public abstract class BlockSpacingKt {
    public static final float RichComponentSpacing = 16.0f;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final BlockSpacingCategory customSpacingCategory(String str) {
        String str2;
        C7384Etj.A0Y(str, 0);
        switch (str.hashCode()) {
            case -792196866:
                if (str.equals(AuraCustomBlockNames.MERMAID)) {
                    return BlockSpacingCategory.MERMAID;
                }
                return BlockSpacingCategory.CUSTOM;
            case 90739218:
                str2 = AuraCustomInlineNames.FILE_LINK;
                break;
            case 527070765:
                if (str.equals(AuraCustomBlockNames.SOURCES)) {
                    return BlockSpacingCategory.SOURCES;
                }
                return BlockSpacingCategory.CUSTOM;
            case 1025206162:
                if (str.equals(AuraCustomBlockNames.MATH)) {
                    return BlockSpacingCategory.MATH;
                }
                return BlockSpacingCategory.CUSTOM;
            case 1968040592:
                str2 = AuraCustomBlockNames.IMAGE_GROUP;
                break;
            default:
                return BlockSpacingCategory.CUSTOM;
        }
        if (str.equals(str2)) {
            return BlockSpacingCategory.ATTACHMENT;
        }
        return BlockSpacingCategory.CUSTOM;
    }

    public static final BlockSpacingSpec messageSpacingFor(BlockSpacingCategory blockSpacingCategory) {
        C7384Etj.A0Y(blockSpacingCategory, 0);
        int iOrdinal = blockSpacingCategory.ordinal();
        float f = (iOrdinal == 13 || iOrdinal == 14 || !(iOrdinal == 15 || iOrdinal == 16)) ? RichComponentSpacing : 0.0f;
        return new BlockSpacingSpec(f, f);
    }

    public static final BlockSpacingCategory spacingCategory(AuraBlock auraBlock) {
        C7384Etj.A0Y(auraBlock, 0);
        if (auraBlock instanceof AuraBlock.Paragraph) {
            return paragraphSpacingCategory((AuraBlock.Paragraph) auraBlock);
        }
        if (auraBlock instanceof AuraBlock.Heading) {
            return BlockSpacingCategory.HEADING;
        }
        if (auraBlock instanceof AuraBlock.BlockQuote) {
            return BlockSpacingCategory.BLOCK_QUOTE;
        }
        if ((auraBlock instanceof AuraBlock.UnorderedList) || (auraBlock instanceof AuraBlock.OrderedList)) {
            return BlockSpacingCategory.LIST;
        }
        if (auraBlock instanceof AuraBlock.CodeBlock) {
            return BlockSpacingCategory.CODE;
        }
        if (auraBlock instanceof AuraBlock.Table) {
            return BlockSpacingCategory.TABLE;
        }
        if (auraBlock instanceof AuraBlock.HtmlBlock) {
            return BlockSpacingCategory.HTML;
        }
        if (auraBlock.equals(AuraBlock.ThematicBreak.INSTANCE)) {
            return BlockSpacingCategory.THEMATIC_BREAK;
        }
        if (auraBlock instanceof AuraBlock.Custom) {
            return customSpacingCategory(((AuraBlock.Custom) auraBlock).name);
        }
        throw C3cG.A0q();
    }

    /* loaded from: classes.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BlockSpacingCategory.values().length];
            try {
                AnonymousClass002.A13(BlockSpacingCategory.WIDGET, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(BlockSpacingCategory.PRESENTATION, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(BlockSpacingCategory.ATTRIBUTION, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(BlockSpacingCategory.BUBBLE, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(BlockSpacingCategory.PARAGRAPH, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(BlockSpacingCategory.HEADING, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass006.A1G(BlockSpacingCategory.THEMATIC_BREAK, iArr);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass006.A1H(BlockSpacingCategory.LIST, iArr);
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AnonymousClass006.A1I(BlockSpacingCategory.BLOCK_QUOTE, iArr);
            } catch (NoSuchFieldError unused9) {
            }
            try {
                AnonymousClass006.A1J(BlockSpacingCategory.MERMAID, iArr);
            } catch (NoSuchFieldError unused10) {
            }
            try {
                AnonymousClass006.A1K(BlockSpacingCategory.MATH, iArr);
            } catch (NoSuchFieldError unused11) {
            }
            try {
                AnonymousClass006.A1L(BlockSpacingCategory.SOURCES, iArr);
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[BlockSpacingCategory.CODE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[BlockSpacingCategory.TABLE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[BlockSpacingCategory.HTML.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[BlockSpacingCategory.ATTACHMENT.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[BlockSpacingCategory.CUSTOM.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final float getRichComponentSpacing() {
        return RichComponentSpacing;
    }

    public static final BlockSpacingCategory paragraphSpacingCategory(AuraBlock.Paragraph paragraph) {
        AuraInline auraInline = (AuraInline) AbstractC0878AGe.A0K(paragraph.inlines);
        return ((auraInline instanceof AuraInline.Image) || ((auraInline instanceof AuraInline.Custom) && AuraCustomInlineNames.FILE_LINK.equals(((AuraInline.Custom) auraInline).name))) ? BlockSpacingCategory.ATTACHMENT : BlockSpacingCategory.PARAGRAPH;
    }

    public static final float collapsedGap(BlockSpacingSpec blockSpacingSpec, BlockSpacingSpec blockSpacingSpec2) {
        AnonymousClass003.A0u(blockSpacingSpec, blockSpacingSpec2);
        C1DG c1dgA0k = C8j3.A0k(blockSpacingSpec.marginAfter);
        C1DG c1dgA0k2 = C8j3.A0k(blockSpacingSpec2.marginBefore);
        if (c1dgA0k.compareTo(c1dgA0k2) >= 0) {
            c1dgA0k2 = c1dgA0k;
        }
        return c1dgA0k2.A00;
    }

    public static final BlockSpacingSpec defaultBlockSpacing(BlockSpacingCategory blockSpacingCategory, AuraMarkdownTheme auraMarkdownTheme) {
        float f;
        float f2;
        AnonymousClass003.A0u(blockSpacingCategory, auraMarkdownTheme);
        switch (blockSpacingCategory.ordinal()) {
            case 0:
            case 2:
            case 3:
                f = 0.0f;
                f2 = auraMarkdownTheme.betweenBlocksSpacing;
                break;
            case 1:
                f = auraMarkdownTheme.beforeHeadingSpacing;
                f2 = auraMarkdownTheme.afterHeadingSpacing;
                break;
            case 4:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                float f3 = RichComponentSpacing;
                return new BlockSpacingSpec(f3, f3);
            case 7:
                f2 = auraMarkdownTheme.thematicBreakVerticalSpacing;
                f = f2;
                break;
            case 13:
            case 14:
            case 15:
            case 16:
                return messageSpacingFor(blockSpacingCategory);
            default:
                throw C3cG.A0q();
        }
        return new BlockSpacingSpec(f, f2);
    }

    public static final float gapBetween(AuraMarkdownTheme auraMarkdownTheme, BlockSpacingCategory blockSpacingCategory, BlockSpacingCategory blockSpacingCategory2) {
        AnonymousClass005.A0x(auraMarkdownTheme, blockSpacingCategory, blockSpacingCategory2);
        BlockSpacingCategory blockSpacingCategory3 = BlockSpacingCategory.PARAGRAPH;
        return (blockSpacingCategory == blockSpacingCategory3 && blockSpacingCategory2 == blockSpacingCategory3) ? auraMarkdownTheme.betweenParagraphsSpacing : collapsedGap(defaultBlockSpacing(blockSpacingCategory, auraMarkdownTheme), defaultBlockSpacing(blockSpacingCategory2, auraMarkdownTheme));
    }

    public static final BlockSpacingSpec spacingFor(AuraMarkdownTheme auraMarkdownTheme, BlockSpacingCategory blockSpacingCategory) {
        AnonymousClass003.A0u(auraMarkdownTheme, blockSpacingCategory);
        return defaultBlockSpacing(blockSpacingCategory, auraMarkdownTheme);
    }
}
