package com.facebook.aura.markdown.render.block;

import X.AHD;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C0KA;
import X.C3cJ;
import X.C60O;
import X.C7384Etj;
import com.facebook.aura.markdown.parser.ast.AuraInline;

/* loaded from: classes4.dex */
public final class FlatCell {
    public final int columnIndex;
    public final AHD<AuraInline> inlines;
    public final boolean isHeader;
    public final String mathExpression;
    public final String plainText;
    public final int rowIndex;

    /* JADX WARN: Multi-variable type inference failed */
    public FlatCell(int i, int i2, boolean z, String str, AHD<? extends AuraInline> ahd, String str2) {
        AnonymousClass002.A1C(str, 3, ahd);
        this.rowIndex = i;
        this.columnIndex = i2;
        this.isHeader = z;
        this.plainText = str;
        this.inlines = ahd;
        this.mathExpression = str2;
    }

    public final FlatCell copy(int i, int i2, boolean z, String str, AHD<? extends AuraInline> ahd, String str2) {
        AnonymousClass002.A1C(str, 3, ahd);
        return new FlatCell(i, i2, z, str, ahd, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FlatCell) {
                FlatCell flatCell = (FlatCell) obj;
                if (this.rowIndex != flatCell.rowIndex || this.columnIndex != flatCell.columnIndex || this.isHeader != flatCell.isHeader || !C7384Etj.areEqual(this.plainText, flatCell.plainText) || !C7384Etj.areEqual(this.inlines, flatCell.inlines) || !C7384Etj.areEqual(this.mathExpression, flatCell.mathExpression)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FlatCell copy$default(FlatCell flatCell, int i, int i2, boolean z, String str, AHD ahd, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = flatCell.rowIndex;
        }
        if ((i3 & 2) != 0) {
            i2 = flatCell.columnIndex;
        }
        if ((i3 & 4) != 0) {
            z = flatCell.isHeader;
        }
        if ((i3 & 8) != 0) {
            str = flatCell.plainText;
        }
        if ((i3 & 16) != 0) {
            ahd = flatCell.inlines;
        }
        if ((i3 & 32) != 0) {
            str2 = flatCell.mathExpression;
        }
        return flatCell.copy(i, i2, z, str, ahd, str2);
    }

    public final int component1() {
        return this.rowIndex;
    }

    public final int component2() {
        return this.columnIndex;
    }

    public final boolean component3() {
        return this.isHeader;
    }

    public final String component4() {
        return this.plainText;
    }

    public final AHD<AuraInline> component5() {
        return this.inlines;
    }

    public final String component6() {
        return this.mathExpression;
    }

    public final int getColumnIndex() {
        return this.columnIndex;
    }

    public final AHD<AuraInline> getInlines() {
        return this.inlines;
    }

    public final String getMathExpression() {
        return this.mathExpression;
    }

    public final String getPlainText() {
        return this.plainText;
    }

    public final int getRowIndex() {
        return this.rowIndex;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.inlines, AnonymousClass005.A0I(this.plainText, C0KA.A01(((this.rowIndex * 31) + this.columnIndex) * 31, this.isHeader))) + AnonymousClass006.A0G(this.mathExpression);
    }

    public final boolean isHeader() {
        return this.isHeader;
    }

    public String toString() {
        int i = this.rowIndex;
        int i2 = this.columnIndex;
        boolean z = this.isHeader;
        String str = this.plainText;
        AHD<AuraInline> ahd = this.inlines;
        String str2 = this.mathExpression;
        StringBuilder sbA0y = C60O.A0y("FlatCell(rowIndex=", i);
        sbA0y.append(", columnIndex=");
        sbA0y.append(i2);
        sbA0y.append(", isHeader=");
        sbA0y.append(z);
        sbA0y.append(", plainText=");
        sbA0y.append(str);
        sbA0y.append(", inlines=");
        sbA0y.append(ahd);
        return C3cJ.A0N(", mathExpression=", str2, sbA0y);
    }
}
