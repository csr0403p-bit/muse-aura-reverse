package com.facebook.aura.markdown.render;

import X.AbstractC1996Aw5;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.B0A;
import X.B6A;
import X.BG3;
import X.C06H;
import X.C0KA;
import X.C1736ApY;
import X.C1809ArT;
import X.C1813ArX;
import X.C1822Arm;
import X.C1824Aro;
import X.C1847AsK;
import X.C19U;
import X.C1DG;
import X.C3cG;
import X.C3cH;
import X.C3cJ;
import X.C7384Etj;
import X.C8j4;
import com.facebook.aura.sharesheet.HatchVideoAudioStripperKt;
import java.util.List;

/* loaded from: classes4.dex */
public final class AuraMarkdownTheme {
    public static final int $stable = 0;
    public final float afterHeadingSpacing;
    public final long baseTextColor;
    public final C1822Arm baseTextStyle;
    public final float beforeHeadingSpacing;
    public final float betweenBlocksSpacing;
    public final float betweenParagraphsSpacing;
    public final float blockQuoteIndent;
    public final long blockQuoteRuleColor;
    public final float blockQuoteRuleWidth;
    public final C1824Aro boldStyle;
    public final String bulletGlyph;
    public final long codeBlockBackground;
    public final float codeBlockCornerRadius;
    public final float codeBlockPadding;
    public final C1822Arm codeBlockTextStyle;
    public final List<C1822Arm> headingStyles;
    public final long inlineCodeBackground;
    public final C1824Aro inlineCodeStyle;
    public final C1824Aro italicStyle;
    public final long linkColor;
    public final C1736ApY linkFontWeight;
    public final float listIndent;
    public final float listItemSpacing;
    public final long mutedTextColor;
    public final long paragraphLineHeight;
    public final C1824Aro productEntityStyle;
    public final boolean reflowSoftLineBreaks;
    public final C1824Aro strikethroughStyle;
    public final C1822Arm tableBodyTextStyle;
    public final long tableBorderColor;
    public final float tableCellPadding;
    public final long tableHeaderBackground;
    public final C1822Arm tableHeaderTextStyle;
    public final long thematicBreakColor;
    public final float thematicBreakHeight;
    public final float thematicBreakVerticalSpacing;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuraMarkdownTheme) {
                AuraMarkdownTheme auraMarkdownTheme = (AuraMarkdownTheme) obj;
                if (C7384Etj.areEqual(this.baseTextStyle, auraMarkdownTheme.baseTextStyle)) {
                    long j = this.baseTextColor;
                    long j2 = auraMarkdownTheme.baseTextColor;
                    long j3 = B6A.A01;
                    if (j == j2 && this.linkColor == auraMarkdownTheme.linkColor && this.mutedTextColor == auraMarkdownTheme.mutedTextColor && this.inlineCodeBackground == auraMarkdownTheme.inlineCodeBackground && this.codeBlockBackground == auraMarkdownTheme.codeBlockBackground && this.tableHeaderBackground == auraMarkdownTheme.tableHeaderBackground && this.tableBorderColor == auraMarkdownTheme.tableBorderColor && this.blockQuoteRuleColor == auraMarkdownTheme.blockQuoteRuleColor && this.thematicBreakColor == auraMarkdownTheme.thematicBreakColor && C7384Etj.areEqual(this.linkFontWeight, auraMarkdownTheme.linkFontWeight) && C7384Etj.areEqual(this.boldStyle, auraMarkdownTheme.boldStyle) && C7384Etj.areEqual(this.italicStyle, auraMarkdownTheme.italicStyle) && C7384Etj.areEqual(this.strikethroughStyle, auraMarkdownTheme.strikethroughStyle) && C7384Etj.areEqual(this.inlineCodeStyle, auraMarkdownTheme.inlineCodeStyle) && C7384Etj.areEqual(this.productEntityStyle, auraMarkdownTheme.productEntityStyle) && C7384Etj.areEqual(this.headingStyles, auraMarkdownTheme.headingStyles) && C1DG.A08(this.blockQuoteRuleWidth, auraMarkdownTheme.blockQuoteRuleWidth) && C1DG.A08(this.blockQuoteIndent, auraMarkdownTheme.blockQuoteIndent) && C7384Etj.areEqual(this.codeBlockTextStyle, auraMarkdownTheme.codeBlockTextStyle) && C1DG.A08(this.codeBlockPadding, auraMarkdownTheme.codeBlockPadding) && C1DG.A08(this.codeBlockCornerRadius, auraMarkdownTheme.codeBlockCornerRadius) && C1DG.A08(this.listItemSpacing, auraMarkdownTheme.listItemSpacing) && C1DG.A08(this.listIndent, auraMarkdownTheme.listIndent) && C7384Etj.areEqual(this.bulletGlyph, auraMarkdownTheme.bulletGlyph) && C1DG.A08(this.betweenBlocksSpacing, auraMarkdownTheme.betweenBlocksSpacing) && C1DG.A08(this.beforeHeadingSpacing, auraMarkdownTheme.beforeHeadingSpacing) && C1DG.A08(this.afterHeadingSpacing, auraMarkdownTheme.afterHeadingSpacing) && C1DG.A08(this.betweenParagraphsSpacing, auraMarkdownTheme.betweenParagraphsSpacing)) {
                        long j4 = this.paragraphLineHeight;
                        long j5 = auraMarkdownTheme.paragraphLineHeight;
                        C1813ArX[] c1813ArXArr = C1809ArT.A02;
                        if (j4 != j5 || this.reflowSoftLineBreaks != auraMarkdownTheme.reflowSoftLineBreaks || !C1DG.A08(this.tableCellPadding, auraMarkdownTheme.tableCellPadding) || !C7384Etj.areEqual(this.tableHeaderTextStyle, auraMarkdownTheme.tableHeaderTextStyle) || !C7384Etj.areEqual(this.tableBodyTextStyle, auraMarkdownTheme.tableBodyTextStyle) || !C1DG.A08(this.thematicBreakHeight, auraMarkdownTheme.thematicBreakHeight) || !C1DG.A08(this.thematicBreakVerticalSpacing, auraMarkdownTheme.thematicBreakVerticalSpacing)) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final C1822Arm component1() {
        return this.baseTextStyle;
    }

    /* renamed from: component10-0d7_KjU, reason: not valid java name */
    public final long m1370component100d7_KjU() {
        return this.thematicBreakColor;
    }

    public final C1736ApY component11() {
        return this.linkFontWeight;
    }

    public final C1824Aro component12() {
        return this.boldStyle;
    }

    public final C1824Aro component13() {
        return this.italicStyle;
    }

    public final C1824Aro component14() {
        return this.strikethroughStyle;
    }

    public final C1824Aro component15() {
        return this.inlineCodeStyle;
    }

    public final C1824Aro component16() {
        return this.productEntityStyle;
    }

    public final List<C1822Arm> component17() {
        return this.headingStyles;
    }

    /* renamed from: component18-D9Ej5fM, reason: not valid java name */
    public final float m1371component18D9Ej5fM() {
        return this.blockQuoteRuleWidth;
    }

    /* renamed from: component19-D9Ej5fM, reason: not valid java name */
    public final float m1372component19D9Ej5fM() {
        return this.blockQuoteIndent;
    }

    /* renamed from: component2-0d7_KjU, reason: not valid java name */
    public final long m1373component20d7_KjU() {
        return this.baseTextColor;
    }

    public final C1822Arm component20() {
        return this.codeBlockTextStyle;
    }

    /* renamed from: component21-D9Ej5fM, reason: not valid java name */
    public final float m1374component21D9Ej5fM() {
        return this.codeBlockPadding;
    }

    /* renamed from: component22-D9Ej5fM, reason: not valid java name */
    public final float m1375component22D9Ej5fM() {
        return this.codeBlockCornerRadius;
    }

    /* renamed from: component23-D9Ej5fM, reason: not valid java name */
    public final float m1376component23D9Ej5fM() {
        return this.listItemSpacing;
    }

    /* renamed from: component24-D9Ej5fM, reason: not valid java name */
    public final float m1377component24D9Ej5fM() {
        return this.listIndent;
    }

    public final String component25() {
        return this.bulletGlyph;
    }

    /* renamed from: component26-D9Ej5fM, reason: not valid java name */
    public final float m1378component26D9Ej5fM() {
        return this.betweenBlocksSpacing;
    }

    /* renamed from: component27-D9Ej5fM, reason: not valid java name */
    public final float m1379component27D9Ej5fM() {
        return this.beforeHeadingSpacing;
    }

    /* renamed from: component28-D9Ej5fM, reason: not valid java name */
    public final float m1380component28D9Ej5fM() {
        return this.afterHeadingSpacing;
    }

    /* renamed from: component29-D9Ej5fM, reason: not valid java name */
    public final float m1381component29D9Ej5fM() {
        return this.betweenParagraphsSpacing;
    }

    /* renamed from: component3-0d7_KjU, reason: not valid java name */
    public final long m1382component30d7_KjU() {
        return this.linkColor;
    }

    /* renamed from: component30-XSAIIZE, reason: not valid java name */
    public final long m1383component30XSAIIZE() {
        return this.paragraphLineHeight;
    }

    public final boolean component31() {
        return this.reflowSoftLineBreaks;
    }

    /* renamed from: component32-D9Ej5fM, reason: not valid java name */
    public final float m1384component32D9Ej5fM() {
        return this.tableCellPadding;
    }

    public final C1822Arm component33() {
        return this.tableHeaderTextStyle;
    }

    public final C1822Arm component34() {
        return this.tableBodyTextStyle;
    }

    /* renamed from: component35-D9Ej5fM, reason: not valid java name */
    public final float m1385component35D9Ej5fM() {
        return this.thematicBreakHeight;
    }

    /* renamed from: component36-D9Ej5fM, reason: not valid java name */
    public final float m1386component36D9Ej5fM() {
        return this.thematicBreakVerticalSpacing;
    }

    /* renamed from: component4-0d7_KjU, reason: not valid java name */
    public final long m1387component40d7_KjU() {
        return this.mutedTextColor;
    }

    /* renamed from: component5-0d7_KjU, reason: not valid java name */
    public final long m1388component50d7_KjU() {
        return this.inlineCodeBackground;
    }

    /* renamed from: component6-0d7_KjU, reason: not valid java name */
    public final long m1389component60d7_KjU() {
        return this.codeBlockBackground;
    }

    /* renamed from: component7-0d7_KjU, reason: not valid java name */
    public final long m1390component70d7_KjU() {
        return this.tableHeaderBackground;
    }

    /* renamed from: component8-0d7_KjU, reason: not valid java name */
    public final long m1391component80d7_KjU() {
        return this.tableBorderColor;
    }

    /* renamed from: component9-0d7_KjU, reason: not valid java name */
    public final long m1392component90d7_KjU() {
        return this.blockQuoteRuleColor;
    }

    /* renamed from: getAfterHeadingSpacing-D9Ej5fM, reason: not valid java name */
    public final float m1394getAfterHeadingSpacingD9Ej5fM() {
        return this.afterHeadingSpacing;
    }

    /* renamed from: getBaseTextColor-0d7_KjU, reason: not valid java name */
    public final long m1395getBaseTextColor0d7_KjU() {
        return this.baseTextColor;
    }

    public final C1822Arm getBaseTextStyle() {
        return this.baseTextStyle;
    }

    /* renamed from: getBeforeHeadingSpacing-D9Ej5fM, reason: not valid java name */
    public final float m1396getBeforeHeadingSpacingD9Ej5fM() {
        return this.beforeHeadingSpacing;
    }

    /* renamed from: getBetweenBlocksSpacing-D9Ej5fM, reason: not valid java name */
    public final float m1397getBetweenBlocksSpacingD9Ej5fM() {
        return this.betweenBlocksSpacing;
    }

    /* renamed from: getBetweenParagraphsSpacing-D9Ej5fM, reason: not valid java name */
    public final float m1398getBetweenParagraphsSpacingD9Ej5fM() {
        return this.betweenParagraphsSpacing;
    }

    /* renamed from: getBlockQuoteIndent-D9Ej5fM, reason: not valid java name */
    public final float m1399getBlockQuoteIndentD9Ej5fM() {
        return this.blockQuoteIndent;
    }

    /* renamed from: getBlockQuoteRuleColor-0d7_KjU, reason: not valid java name */
    public final long m1400getBlockQuoteRuleColor0d7_KjU() {
        return this.blockQuoteRuleColor;
    }

    /* renamed from: getBlockQuoteRuleWidth-D9Ej5fM, reason: not valid java name */
    public final float m1401getBlockQuoteRuleWidthD9Ej5fM() {
        return this.blockQuoteRuleWidth;
    }

    public final C1824Aro getBoldStyle() {
        return this.boldStyle;
    }

    public final String getBulletGlyph() {
        return this.bulletGlyph;
    }

    /* renamed from: getCodeBlockBackground-0d7_KjU, reason: not valid java name */
    public final long m1402getCodeBlockBackground0d7_KjU() {
        return this.codeBlockBackground;
    }

    /* renamed from: getCodeBlockCornerRadius-D9Ej5fM, reason: not valid java name */
    public final float m1403getCodeBlockCornerRadiusD9Ej5fM() {
        return this.codeBlockCornerRadius;
    }

    /* renamed from: getCodeBlockPadding-D9Ej5fM, reason: not valid java name */
    public final float m1404getCodeBlockPaddingD9Ej5fM() {
        return this.codeBlockPadding;
    }

    public final C1822Arm getCodeBlockTextStyle() {
        return this.codeBlockTextStyle;
    }

    public final List<C1822Arm> getHeadingStyles() {
        return this.headingStyles;
    }

    /* renamed from: getInlineCodeBackground-0d7_KjU, reason: not valid java name */
    public final long m1405getInlineCodeBackground0d7_KjU() {
        return this.inlineCodeBackground;
    }

    public final C1824Aro getInlineCodeStyle() {
        return this.inlineCodeStyle;
    }

    public final C1824Aro getItalicStyle() {
        return this.italicStyle;
    }

    /* renamed from: getLinkColor-0d7_KjU, reason: not valid java name */
    public final long m1406getLinkColor0d7_KjU() {
        return this.linkColor;
    }

    public final C1736ApY getLinkFontWeight() {
        return this.linkFontWeight;
    }

    /* renamed from: getListIndent-D9Ej5fM, reason: not valid java name */
    public final float m1407getListIndentD9Ej5fM() {
        return this.listIndent;
    }

    /* renamed from: getListItemSpacing-D9Ej5fM, reason: not valid java name */
    public final float m1408getListItemSpacingD9Ej5fM() {
        return this.listItemSpacing;
    }

    /* renamed from: getMutedTextColor-0d7_KjU, reason: not valid java name */
    public final long m1409getMutedTextColor0d7_KjU() {
        return this.mutedTextColor;
    }

    /* renamed from: getParagraphLineHeight-XSAIIZE, reason: not valid java name */
    public final long m1410getParagraphLineHeightXSAIIZE() {
        return this.paragraphLineHeight;
    }

    public final C1824Aro getProductEntityStyle() {
        return this.productEntityStyle;
    }

    public final boolean getReflowSoftLineBreaks() {
        return this.reflowSoftLineBreaks;
    }

    public final C1824Aro getStrikethroughStyle() {
        return this.strikethroughStyle;
    }

    public final C1822Arm getTableBodyTextStyle() {
        return this.tableBodyTextStyle;
    }

    /* renamed from: getTableBorderColor-0d7_KjU, reason: not valid java name */
    public final long m1411getTableBorderColor0d7_KjU() {
        return this.tableBorderColor;
    }

    /* renamed from: getTableCellPadding-D9Ej5fM, reason: not valid java name */
    public final float m1412getTableCellPaddingD9Ej5fM() {
        return this.tableCellPadding;
    }

    /* renamed from: getTableHeaderBackground-0d7_KjU, reason: not valid java name */
    public final long m1413getTableHeaderBackground0d7_KjU() {
        return this.tableHeaderBackground;
    }

    public final C1822Arm getTableHeaderTextStyle() {
        return this.tableHeaderTextStyle;
    }

    /* renamed from: getThematicBreakColor-0d7_KjU, reason: not valid java name */
    public final long m1414getThematicBreakColor0d7_KjU() {
        return this.thematicBreakColor;
    }

    /* renamed from: getThematicBreakHeight-D9Ej5fM, reason: not valid java name */
    public final float m1415getThematicBreakHeightD9Ej5fM() {
        return this.thematicBreakHeight;
    }

    /* renamed from: getThematicBreakVerticalSpacing-D9Ej5fM, reason: not valid java name */
    public final float m1416getThematicBreakVerticalSpacingD9Ej5fM() {
        return this.thematicBreakVerticalSpacing;
    }

    public int hashCode() {
        int iA0E = AnonymousClass005.A0E(this.baseTextStyle);
        long j = this.baseTextColor;
        long j2 = B6A.A01;
        int iA02 = AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A0I(this.bulletGlyph, AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A0F(this.codeBlockTextStyle, AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A0F(this.headingStyles, AnonymousClass005.A0F(this.productEntityStyle, AnonymousClass005.A0F(this.inlineCodeStyle, AnonymousClass005.A0F(this.strikethroughStyle, AnonymousClass005.A0F(this.italicStyle, AnonymousClass005.A0F(this.boldStyle, (AnonymousClass006.A06(this.thematicBreakColor, AnonymousClass006.A06(this.blockQuoteRuleColor, AnonymousClass006.A06(this.tableBorderColor, AnonymousClass006.A06(this.tableHeaderBackground, AnonymousClass006.A06(this.codeBlockBackground, AnonymousClass006.A06(this.inlineCodeBackground, AnonymousClass006.A06(this.mutedTextColor, AnonymousClass006.A06(this.linkColor, AnonymousClass006.A06(j, iA0E))))))))) + AnonymousClass006.A0D(this.linkFontWeight)) * 31)))))), this.blockQuoteRuleWidth), this.blockQuoteIndent)), this.codeBlockPadding), this.codeBlockCornerRadius), this.listItemSpacing), this.listIndent)), this.betweenBlocksSpacing), this.beforeHeadingSpacing), this.afterHeadingSpacing), this.betweenParagraphsSpacing);
        long j3 = this.paragraphLineHeight;
        C1813ArX[] c1813ArXArr = C1809ArT.A02;
        return C8j4.A06(AnonymousClass005.A02(AnonymousClass005.A0F(this.tableBodyTextStyle, AnonymousClass005.A0F(this.tableHeaderTextStyle, AnonymousClass005.A02(C0KA.A01(AnonymousClass006.A06(j3, iA02), this.reflowSoftLineBreaks), this.tableCellPadding))), this.thematicBreakHeight), this.thematicBreakVerticalSpacing);
    }

    public String toString() {
        C1822Arm c1822Arm = this.baseTextStyle;
        String strA07 = B6A.A07(this.baseTextColor);
        String strA072 = B6A.A07(this.linkColor);
        String strA073 = B6A.A07(this.mutedTextColor);
        String strA074 = B6A.A07(this.inlineCodeBackground);
        String strA075 = B6A.A07(this.codeBlockBackground);
        String strA076 = B6A.A07(this.tableHeaderBackground);
        String strA077 = B6A.A07(this.tableBorderColor);
        String strA078 = B6A.A07(this.blockQuoteRuleColor);
        String strA079 = B6A.A07(this.thematicBreakColor);
        C1736ApY c1736ApY = this.linkFontWeight;
        C1824Aro c1824Aro = this.boldStyle;
        C1824Aro c1824Aro2 = this.italicStyle;
        C1824Aro c1824Aro3 = this.strikethroughStyle;
        C1824Aro c1824Aro4 = this.inlineCodeStyle;
        C1824Aro c1824Aro5 = this.productEntityStyle;
        List<C1822Arm> list = this.headingStyles;
        String strA05 = C1DG.A05(this.blockQuoteRuleWidth);
        String strA052 = C1DG.A05(this.blockQuoteIndent);
        C1822Arm c1822Arm2 = this.codeBlockTextStyle;
        String strA053 = C1DG.A05(this.codeBlockPadding);
        String strA054 = C1DG.A05(this.codeBlockCornerRadius);
        String strA055 = C1DG.A05(this.listItemSpacing);
        String strA056 = C1DG.A05(this.listIndent);
        String str = this.bulletGlyph;
        String strA057 = C1DG.A05(this.betweenBlocksSpacing);
        String strA058 = C1DG.A05(this.beforeHeadingSpacing);
        String strA059 = C1DG.A05(this.afterHeadingSpacing);
        String strA0510 = C1DG.A05(this.betweenParagraphsSpacing);
        String strA02 = C1809ArT.A02(this.paragraphLineHeight);
        boolean z = this.reflowSoftLineBreaks;
        String strA0511 = C1DG.A05(this.tableCellPadding);
        C1822Arm c1822Arm3 = this.tableHeaderTextStyle;
        C1822Arm c1822Arm4 = this.tableBodyTextStyle;
        String strA0512 = C1DG.A05(this.thematicBreakHeight);
        String strA0513 = C1DG.A05(this.thematicBreakVerticalSpacing);
        StringBuilder sbA0f = C3cG.A0f(c1822Arm, "AuraMarkdownTheme(baseTextStyle=");
        sbA0f.append(", baseTextColor=");
        sbA0f.append(strA07);
        sbA0f.append(", linkColor=");
        sbA0f.append(strA072);
        sbA0f.append(", mutedTextColor=");
        sbA0f.append(strA073);
        sbA0f.append(", inlineCodeBackground=");
        sbA0f.append(strA074);
        sbA0f.append(", codeBlockBackground=");
        sbA0f.append(strA075);
        sbA0f.append(", tableHeaderBackground=");
        sbA0f.append(strA076);
        sbA0f.append(", tableBorderColor=");
        sbA0f.append(strA077);
        sbA0f.append(", blockQuoteRuleColor=");
        sbA0f.append(strA078);
        sbA0f.append(", thematicBreakColor=");
        sbA0f.append(strA079);
        sbA0f.append(", linkFontWeight=");
        sbA0f.append(c1736ApY);
        sbA0f.append(", boldStyle=");
        sbA0f.append(c1824Aro);
        sbA0f.append(", italicStyle=");
        sbA0f.append(c1824Aro2);
        sbA0f.append(", strikethroughStyle=");
        sbA0f.append(c1824Aro3);
        sbA0f.append(", inlineCodeStyle=");
        sbA0f.append(c1824Aro4);
        sbA0f.append(", productEntityStyle=");
        sbA0f.append(c1824Aro5);
        sbA0f.append(", headingStyles=");
        sbA0f.append(list);
        sbA0f.append(", blockQuoteRuleWidth=");
        sbA0f.append(strA05);
        sbA0f.append(", blockQuoteIndent=");
        sbA0f.append(strA052);
        sbA0f.append(", codeBlockTextStyle=");
        sbA0f.append(c1822Arm2);
        sbA0f.append(", codeBlockPadding=");
        sbA0f.append(strA053);
        sbA0f.append(", codeBlockCornerRadius=");
        sbA0f.append(strA054);
        sbA0f.append(", listItemSpacing=");
        sbA0f.append(strA055);
        sbA0f.append(", listIndent=");
        sbA0f.append(strA056);
        sbA0f.append(", bulletGlyph=");
        sbA0f.append(str);
        sbA0f.append(", betweenBlocksSpacing=");
        sbA0f.append(strA057);
        sbA0f.append(", beforeHeadingSpacing=");
        sbA0f.append(strA058);
        sbA0f.append(", afterHeadingSpacing=");
        sbA0f.append(strA059);
        sbA0f.append(", betweenParagraphsSpacing=");
        sbA0f.append(strA0510);
        sbA0f.append(", paragraphLineHeight=");
        sbA0f.append(strA02);
        sbA0f.append(", reflowSoftLineBreaks=");
        sbA0f.append(z);
        sbA0f.append(", tableCellPadding=");
        sbA0f.append(strA0511);
        sbA0f.append(", tableHeaderTextStyle=");
        sbA0f.append(c1822Arm3);
        sbA0f.append(", tableBodyTextStyle=");
        sbA0f.append(c1822Arm4);
        sbA0f.append(", thematicBreakHeight=");
        sbA0f.append(strA0512);
        return C3cJ.A0N(", thematicBreakVerticalSpacing=", strA0513, sbA0f);
    }

    public /* synthetic */ AuraMarkdownTheme(C1822Arm c1822Arm, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, C1736ApY c1736ApY, C1824Aro c1824Aro, C1824Aro c1824Aro2, C1824Aro c1824Aro3, C1824Aro c1824Aro4, C1824Aro c1824Aro5, List list, float f, float f2, C1822Arm c1822Arm2, float f3, float f4, float f5, float f6, String str, float f7, float f8, float f9, float f10, long j10, boolean z, float f11, C1822Arm c1822Arm3, C1822Arm c1822Arm4, float f12, float f13, int i, int i2, C06H c06h) {
        C1824Aro c1824Aro6 = c1824Aro;
        C1824Aro c1824Aro7 = c1824Aro2;
        C1824Aro c1824Aro8 = c1824Aro3;
        C1824Aro c1824Aro9 = c1824Aro4;
        C1824Aro c1824Aro10 = c1824Aro5;
        float f14 = f;
        float f15 = f2;
        C1822Arm c1822Arm5 = c1822Arm2;
        float f16 = f3;
        float f17 = f4;
        float f18 = f5;
        float f19 = f6;
        String str2 = str;
        float f20 = f7;
        float f21 = f8;
        float f22 = f9;
        float f23 = f10;
        long j11 = j10;
        float f24 = f11;
        C1822Arm c1822Arm6 = c1822Arm4;
        float f25 = f12;
        float f26 = f13;
        List list2 = list;
        C1822Arm c1822Arm7 = c1822Arm3;
        C1736ApY c1736ApY2 = (i & 1024) != 0 ? null : c1736ApY;
        if ((i & 2048) != 0) {
            C1736ApY c1736ApY3 = C1736ApY.A01;
            long j12 = B6A.A07;
            long j13 = C1809ArT.A01;
            c1824Aro6 = new C1824Aro(null, null, null, null, null, c1736ApY3, null, null, null, null, null, j12, j13, j13, j12);
        }
        if ((i & 4096) != 0) {
            B0A b0a = new B0A(1);
            long j14 = B6A.A07;
            long j15 = C1809ArT.A01;
            c1824Aro7 = new C1824Aro(null, null, null, b0a, null, null, null, null, null, null, null, j14, j15, j15, j14);
        }
        if ((i & 8192) != 0) {
            BG3 bg3 = BG3.A01;
            long j16 = B6A.A07;
            long j17 = C1809ArT.A01;
            c1824Aro8 = new C1824Aro(null, null, null, null, null, null, null, null, bg3, null, null, j16, j17, j17, j16);
        }
        if ((i & 16384) != 0) {
            C1847AsK c1847AsK = AbstractC1996Aw5.A01;
            long jA03 = C19U.A03(14);
            long j18 = B6A.A07;
            c1824Aro9 = new C1824Aro(null, null, c1847AsK, null, null, null, null, null, null, null, null, j18, jA03, C1809ArT.A01, j18);
        }
        if ((32768 & i) != 0) {
            C1736ApY c1736ApY4 = C1736ApY.A01;
            long j19 = B6A.A07;
            long j20 = C1809ArT.A01;
            c1824Aro10 = new C1824Aro(null, null, null, null, null, c1736ApY4, null, null, null, null, null, j19, j20, j20, j19);
        }
        this(c1822Arm, j, j2, j3, j4, j5, j6, j7, j8, j9, c1736ApY2, c1824Aro6, c1824Aro7, c1824Aro8, c1824Aro9, c1824Aro10, (65536 & i) != 0 ? AuraMarkdownThemeKt.defaultHeadingStyles(c1822Arm) : list2, (131072 & i) != 0 ? 3.0f : f14, (262144 & i) != 0 ? 12.0f : f15, (524288 & i) != 0 ? C1822Arm.A00(null, c1822Arm, AbstractC1996Aw5.A01, null, null, null, null, null, null, null, 0, 0, 0, 16777181, 0L, C19U.A03(13), 0L, 0L) : c1822Arm5, (1048576 & i) != 0 ? 12.0f : f16, (2097152 & i) != 0 ? 8.0f : f17, (4194304 & i) != 0 ? 12.0f : f18, (8388608 & i) != 0 ? 16.0f : f19, (16777216 & i) != 0 ? BulletMarkerKt.DEFAULT_BULLET_GLYPH : str2, (33554432 & i) != 0 ? 16.0f : f20, (67108864 & i) != 0 ? 20.0f : f21, (134217728 & i) != 0 ? 8.0f : f22, (268435456 & i) != 0 ? 16.0f : f23, (536870912 & i) != 0 ? C19U.A03(22) : j11, C3cH.A1L(1073741824, i, z), (i & Integer.MIN_VALUE) != 0 ? 8.0f : f24, (i2 & 1) != 0 ? C1822Arm.A00(null, c1822Arm, null, null, C1736ApY.A01, null, null, null, null, null, 0, 0, 0, 16777211, 0L, 0L, 0L, 0L) : c1822Arm7, (i2 & 2) != 0 ? c1822Arm : c1822Arm6, (i2 & 4) != 0 ? 1.0f : f25, (i2 & 8) != 0 ? 12.0f : f26);
    }

    /* renamed from: copy-5wRo7Uk, reason: not valid java name */
    public final AuraMarkdownTheme m1393copy5wRo7Uk(C1822Arm c1822Arm, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, C1736ApY c1736ApY, C1824Aro c1824Aro, C1824Aro c1824Aro2, C1824Aro c1824Aro3, C1824Aro c1824Aro4, C1824Aro c1824Aro5, List<C1822Arm> list, float f, float f2, C1822Arm c1822Arm2, float f3, float f4, float f5, float f6, String str, float f7, float f8, float f9, float f10, long j10, boolean z, float f11, C1822Arm c1822Arm3, C1822Arm c1822Arm4, float f12, float f13) {
        AnonymousClass002.A1G(c1822Arm, 0, c1824Aro);
        C7384Etj.A0Y(c1824Aro2, 12);
        AnonymousClass002.A1H(c1824Aro3, 13, c1824Aro4);
        AnonymousClass003.A12(c1824Aro5, list);
        C7384Etj.A0Y(c1822Arm2, 19);
        C7384Etj.A0Y(str, 24);
        C7384Etj.A0Y(c1822Arm3, 32);
        C7384Etj.A0Y(c1822Arm4, 33);
        return new AuraMarkdownTheme(c1822Arm, j, j2, j3, j4, j5, j6, j7, j8, j9, c1736ApY, c1824Aro, c1824Aro2, c1824Aro3, c1824Aro4, c1824Aro5, list, f, f2, c1822Arm2, f3, f4, f5, f6, str, f7, f8, f9, f10, j10, z, f11, c1822Arm3, c1822Arm4, f12, f13);
    }

    /* renamed from: copy-5wRo7Uk$default, reason: not valid java name */
    public static /* synthetic */ AuraMarkdownTheme m1369copy5wRo7Uk$default(AuraMarkdownTheme auraMarkdownTheme, C1822Arm c1822Arm, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, C1736ApY c1736ApY, C1824Aro c1824Aro, C1824Aro c1824Aro2, C1824Aro c1824Aro3, C1824Aro c1824Aro4, C1824Aro c1824Aro5, List list, float f, float f2, C1822Arm c1822Arm2, float f3, float f4, float f5, float f6, String str, float f7, float f8, float f9, float f10, long j10, boolean z, float f11, C1822Arm c1822Arm3, C1822Arm c1822Arm4, float f12, float f13, int i, int i2, Object obj) {
        C1822Arm c1822Arm5 = c1822Arm;
        long j11 = j;
        long j12 = j2;
        long j13 = j3;
        long j14 = j4;
        long j15 = j5;
        long j16 = j6;
        long j17 = j7;
        long j18 = j8;
        long j19 = j9;
        C1736ApY c1736ApY2 = c1736ApY;
        C1824Aro c1824Aro6 = c1824Aro2;
        C1824Aro c1824Aro7 = c1824Aro3;
        C1824Aro c1824Aro8 = c1824Aro4;
        C1824Aro c1824Aro9 = c1824Aro5;
        List list2 = list;
        C1822Arm c1822Arm6 = c1822Arm2;
        String str2 = str;
        float f14 = f8;
        float f15 = f9;
        float f16 = f10;
        long j20 = j10;
        boolean z2 = z;
        float f17 = f11;
        C1822Arm c1822Arm7 = c1822Arm3;
        C1822Arm c1822Arm8 = c1822Arm4;
        float f18 = f12;
        C1824Aro c1824Aro10 = c1824Aro;
        float f19 = f;
        float f20 = f2;
        float f21 = f3;
        float f22 = f4;
        float f23 = f5;
        float f24 = f6;
        float f25 = f7;
        float f26 = f13;
        if ((i & 1) != 0) {
            c1822Arm5 = auraMarkdownTheme.baseTextStyle;
        }
        if ((i & 2) != 0) {
            j11 = auraMarkdownTheme.baseTextColor;
        }
        if ((i & 4) != 0) {
            j12 = auraMarkdownTheme.linkColor;
        }
        if ((i & 8) != 0) {
            j13 = auraMarkdownTheme.mutedTextColor;
        }
        if ((i & 16) != 0) {
            j14 = auraMarkdownTheme.inlineCodeBackground;
        }
        if ((i & 32) != 0) {
            j15 = auraMarkdownTheme.codeBlockBackground;
        }
        if ((i & 64) != 0) {
            j16 = auraMarkdownTheme.tableHeaderBackground;
        }
        if ((i & 128) != 0) {
            j17 = auraMarkdownTheme.tableBorderColor;
        }
        if ((i & 256) != 0) {
            j18 = auraMarkdownTheme.blockQuoteRuleColor;
        }
        if ((i & 512) != 0) {
            j19 = auraMarkdownTheme.thematicBreakColor;
        }
        if ((i & 1024) != 0) {
            c1736ApY2 = auraMarkdownTheme.linkFontWeight;
        }
        if ((i & 2048) != 0) {
            c1824Aro10 = auraMarkdownTheme.boldStyle;
        }
        if ((i & 4096) != 0) {
            c1824Aro6 = auraMarkdownTheme.italicStyle;
        }
        if ((i & 8192) != 0) {
            c1824Aro7 = auraMarkdownTheme.strikethroughStyle;
        }
        if ((i & 16384) != 0) {
            c1824Aro8 = auraMarkdownTheme.inlineCodeStyle;
        }
        if ((i & 32768) != 0) {
            c1824Aro9 = auraMarkdownTheme.productEntityStyle;
        }
        if ((i & 65536) != 0) {
            list2 = auraMarkdownTheme.headingStyles;
        }
        if ((i & 131072) != 0) {
            f19 = auraMarkdownTheme.blockQuoteRuleWidth;
        }
        if ((i & 262144) != 0) {
            f20 = auraMarkdownTheme.blockQuoteIndent;
        }
        if ((i & 524288) != 0) {
            c1822Arm6 = auraMarkdownTheme.codeBlockTextStyle;
        }
        if ((i & 1048576) != 0) {
            f21 = auraMarkdownTheme.codeBlockPadding;
        }
        if ((i & 2097152) != 0) {
            f22 = auraMarkdownTheme.codeBlockCornerRadius;
        }
        if ((i & 4194304) != 0) {
            f23 = auraMarkdownTheme.listItemSpacing;
        }
        if ((i & 8388608) != 0) {
            f24 = auraMarkdownTheme.listIndent;
        }
        if ((i & HatchVideoAudioStripperKt.MAX_SAMPLE_BYTES) != 0) {
            str2 = auraMarkdownTheme.bulletGlyph;
        }
        if ((i & 33554432) != 0) {
            f25 = auraMarkdownTheme.betweenBlocksSpacing;
        }
        if ((i & 67108864) != 0) {
            f14 = auraMarkdownTheme.beforeHeadingSpacing;
        }
        if ((i & 134217728) != 0) {
            f15 = auraMarkdownTheme.afterHeadingSpacing;
        }
        if ((i & 268435456) != 0) {
            f16 = auraMarkdownTheme.betweenParagraphsSpacing;
        }
        if ((i & 536870912) != 0) {
            j20 = auraMarkdownTheme.paragraphLineHeight;
        }
        if ((i & 1073741824) != 0) {
            z2 = auraMarkdownTheme.reflowSoftLineBreaks;
        }
        if ((i & Integer.MIN_VALUE) != 0) {
            f17 = auraMarkdownTheme.tableCellPadding;
        }
        if ((i2 & 1) != 0) {
            c1822Arm7 = auraMarkdownTheme.tableHeaderTextStyle;
        }
        if ((i2 & 2) != 0) {
            c1822Arm8 = auraMarkdownTheme.tableBodyTextStyle;
        }
        if ((i2 & 4) != 0) {
            f18 = auraMarkdownTheme.thematicBreakHeight;
        }
        if ((i2 & 8) != 0) {
            f26 = auraMarkdownTheme.thematicBreakVerticalSpacing;
        }
        return auraMarkdownTheme.m1393copy5wRo7Uk(c1822Arm5, j11, j12, j13, j14, j15, j16, j17, j18, j19, c1736ApY2, c1824Aro10, c1824Aro6, c1824Aro7, c1824Aro8, c1824Aro9, list2, f19, f20, c1822Arm6, f21, f22, f23, f24, str2, f25, f14, f15, f16, j20, z2, f17, c1822Arm7, c1822Arm8, f18, f26);
    }

    public AuraMarkdownTheme(C1822Arm c1822Arm, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, C1736ApY c1736ApY, C1824Aro c1824Aro, C1824Aro c1824Aro2, C1824Aro c1824Aro3, C1824Aro c1824Aro4, C1824Aro c1824Aro5, List<C1822Arm> list, float f, float f2, C1822Arm c1822Arm2, float f3, float f4, float f5, float f6, String str, float f7, float f8, float f9, float f10, long j10, boolean z, float f11, C1822Arm c1822Arm3, C1822Arm c1822Arm4, float f12, float f13) {
        AnonymousClass002.A1G(c1822Arm, 0, c1824Aro);
        C7384Etj.A0Y(c1824Aro2, 12);
        AnonymousClass002.A1H(c1824Aro3, 13, c1824Aro4);
        AnonymousClass003.A12(c1824Aro5, list);
        C7384Etj.A0Y(c1822Arm2, 19);
        C7384Etj.A0Y(str, 24);
        C7384Etj.A0Y(c1822Arm3, 32);
        C7384Etj.A0Y(c1822Arm4, 33);
        this.baseTextStyle = c1822Arm;
        this.baseTextColor = j;
        this.linkColor = j2;
        this.mutedTextColor = j3;
        this.inlineCodeBackground = j4;
        this.codeBlockBackground = j5;
        this.tableHeaderBackground = j6;
        this.tableBorderColor = j7;
        this.blockQuoteRuleColor = j8;
        this.thematicBreakColor = j9;
        this.linkFontWeight = c1736ApY;
        this.boldStyle = c1824Aro;
        this.italicStyle = c1824Aro2;
        this.strikethroughStyle = c1824Aro3;
        this.inlineCodeStyle = c1824Aro4;
        this.productEntityStyle = c1824Aro5;
        this.headingStyles = list;
        this.blockQuoteRuleWidth = f;
        this.blockQuoteIndent = f2;
        this.codeBlockTextStyle = c1822Arm2;
        this.codeBlockPadding = f3;
        this.codeBlockCornerRadius = f4;
        this.listItemSpacing = f5;
        this.listIndent = f6;
        this.bulletGlyph = str;
        this.betweenBlocksSpacing = f7;
        this.beforeHeadingSpacing = f8;
        this.afterHeadingSpacing = f9;
        this.betweenParagraphsSpacing = f10;
        this.paragraphLineHeight = j10;
        this.reflowSoftLineBreaks = z;
        this.tableCellPadding = f11;
        this.tableHeaderTextStyle = c1822Arm3;
        this.tableBodyTextStyle = c1822Arm4;
        this.thematicBreakHeight = f12;
        this.thematicBreakVerticalSpacing = f13;
    }

    public /* synthetic */ AuraMarkdownTheme(C1822Arm c1822Arm, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, C1736ApY c1736ApY, C1824Aro c1824Aro, C1824Aro c1824Aro2, C1824Aro c1824Aro3, C1824Aro c1824Aro4, C1824Aro c1824Aro5, List list, float f, float f2, C1822Arm c1822Arm2, float f3, float f4, float f5, float f6, String str, float f7, float f8, float f9, float f10, long j10, boolean z, float f11, C1822Arm c1822Arm3, C1822Arm c1822Arm4, float f12, float f13, C06H c06h) {
        this(c1822Arm, j, j2, j3, j4, j5, j6, j7, j8, j9, c1736ApY, c1824Aro, c1824Aro2, c1824Aro3, c1824Aro4, c1824Aro5, list, f, f2, c1822Arm2, f3, f4, f5, f6, str, f7, f8, f9, f10, j10, z, f11, c1822Arm3, c1822Arm4, f12, f13);
    }
}
