package com.facebook.aura.sharesheet;

import X.C06H;
import android.graphics.Color;

/* loaded from: classes4.dex */
public final class HatchMessageShareImageColors {
    public static final int $stable = 0;
    public final int attribution;
    public final int background;
    public final int card;
    public final int chipBackground;
    public final int codeBackground;
    public final int divider;
    public final int inlineCodeBackground;
    public final int link;
    public final int mediaPlaceholder;
    public final int primaryText;
    public final int secondaryText;
    public final int tableBorder;
    public final int tableHeader;
    public static final Companion Companion = new Companion();
    public static final HatchMessageShareImageColors Light = new HatchMessageShareImageColors(-1, -1, Color.rgb(17, 17, 18), Color.rgb(96, 96, 96), Color.rgb(158, 158, 158), Color.rgb(224, 224, 224), Color.rgb(245, 245, 245), Color.rgb(245, 245, 245), Color.rgb(218, 218, 218), Color.rgb(242, 242, 242), Color.rgb(245, 245, 245), Color.rgb(238, 238, 238), Color.rgb(0, 100, 224));
    public static final HatchMessageShareImageColors Dark = new HatchMessageShareImageColors(Color.rgb(5, 5, 5), Color.rgb(31, 31, 31), Color.rgb(245, 245, 245), Color.rgb(164, 168, 173), Color.rgb(161, 161, 161), Color.rgb(63, 63, 64), Color.rgb(52, 54, 56), Color.rgb(52, 54, 56), Color.rgb(79, 81, 83), Color.rgb(40, 41, 43), Color.rgb(52, 54, 56), Color.rgb(52, 54, 56), Color.rgb(23, 147, 255));

    public final class Companion {
        public final HatchMessageShareImageColors forTheme(boolean z) {
            return z ? HatchMessageShareImageColors.Dark : HatchMessageShareImageColors.Light;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final int getAttribution() {
        return this.attribution;
    }

    public final int getBackground() {
        return this.background;
    }

    public final int getCard() {
        return this.card;
    }

    public final int getChipBackground() {
        return this.chipBackground;
    }

    public final int getCodeBackground() {
        return this.codeBackground;
    }

    public final int getDivider() {
        return this.divider;
    }

    public final int getInlineCodeBackground() {
        return this.inlineCodeBackground;
    }

    public final int getLink() {
        return this.link;
    }

    public final int getMediaPlaceholder() {
        return this.mediaPlaceholder;
    }

    public final int getPrimaryText() {
        return this.primaryText;
    }

    public final int getSecondaryText() {
        return this.secondaryText;
    }

    public final int getTableBorder() {
        return this.tableBorder;
    }

    public final int getTableHeader() {
        return this.tableHeader;
    }

    public HatchMessageShareImageColors(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        this.background = i;
        this.card = i2;
        this.primaryText = i3;
        this.secondaryText = i4;
        this.attribution = i5;
        this.divider = i6;
        this.codeBackground = i7;
        this.tableHeader = i8;
        this.tableBorder = i9;
        this.mediaPlaceholder = i10;
        this.chipBackground = i11;
        this.inlineCodeBackground = i12;
        this.link = i13;
    }
}
