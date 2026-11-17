package com.facebook.aura.conversation.view.richcontent;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes2.dex */
public final class MermaidThemeColors extends C06G {
    public static final int $stable = 8;
    public final String bgColor;
    public final List<String> chartColors;
    public final String lineColor;
    public final String nodeBgColor;
    public final String nodeBorderColor;
    public final String textColor;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MermaidThemeColors) {
                MermaidThemeColors mermaidThemeColors = (MermaidThemeColors) obj;
                if (!C7384Etj.areEqual(this.bgColor, mermaidThemeColors.bgColor) || !C7384Etj.areEqual(this.nodeBgColor, mermaidThemeColors.nodeBgColor) || !C7384Etj.areEqual(this.textColor, mermaidThemeColors.textColor) || !C7384Etj.areEqual(this.lineColor, mermaidThemeColors.lineColor) || !C7384Etj.areEqual(this.nodeBorderColor, mermaidThemeColors.nodeBorderColor) || !C7384Etj.areEqual(this.chartColors, mermaidThemeColors.chartColors)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MermaidThemeColors copy$default(MermaidThemeColors mermaidThemeColors, String str, String str2, String str3, String str4, String str5, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mermaidThemeColors.bgColor;
        }
        if ((i & 2) != 0) {
            str2 = mermaidThemeColors.nodeBgColor;
        }
        if ((i & 4) != 0) {
            str3 = mermaidThemeColors.textColor;
        }
        if ((i & 8) != 0) {
            str4 = mermaidThemeColors.lineColor;
        }
        if ((i & 16) != 0) {
            str5 = mermaidThemeColors.nodeBorderColor;
        }
        if ((i & 32) != 0) {
            list = mermaidThemeColors.chartColors;
        }
        return mermaidThemeColors.copy(str, str2, str3, str4, str5, list);
    }

    public final String component1() {
        return this.bgColor;
    }

    public final String component2() {
        return this.nodeBgColor;
    }

    public final String component3() {
        return this.textColor;
    }

    public final String component4() {
        return this.lineColor;
    }

    public final String component5() {
        return this.nodeBorderColor;
    }

    public final List<String> component6() {
        return this.chartColors;
    }

    public final String getBgColor() {
        return this.bgColor;
    }

    public final List<String> getChartColors() {
        return this.chartColors;
    }

    public final String getLineColor() {
        return this.lineColor;
    }

    public final String getNodeBgColor() {
        return this.nodeBgColor;
    }

    public final String getNodeBorderColor() {
        return this.nodeBorderColor;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.chartColors, AnonymousClass005.A0I(this.nodeBorderColor, AnonymousClass005.A0I(this.lineColor, AnonymousClass005.A0I(this.textColor, AnonymousClass005.A0I(this.nodeBgColor, AnonymousClass001.A0G(this.bgColor))))));
    }

    public MermaidThemeColors(String str, String str2, String str3, String str4, String str5, List<String> list) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        C7384Etj.A0Y(list, 5);
        this.bgColor = str;
        this.nodeBgColor = str2;
        this.textColor = str3;
        this.lineColor = str4;
        this.nodeBorderColor = str5;
        this.chartColors = list;
    }

    public final MermaidThemeColors copy(String str, String str2, String str3, String str4, String str5, List<String> list) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        C7384Etj.A0Y(list, 5);
        return new MermaidThemeColors(str, str2, str3, str4, str5, list);
    }

    public String toString() {
        return super.toString();
    }
}
