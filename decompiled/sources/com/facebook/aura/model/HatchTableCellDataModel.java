package com.facebook.aura.model;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class HatchTableCellDataModel extends C06G {
    public static final int $stable = 0;
    public final int columnIndex;
    public final boolean isHeader;
    public final String mathExpression;
    public final int rowIndex;
    public final String text;

    public final HatchTableCellDataModel copy(String str, int i, int i2, boolean z, String str2) {
        C7384Etj.A0Y(str, 0);
        return new HatchTableCellDataModel(str, i, i2, z, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchTableCellDataModel) {
                HatchTableCellDataModel hatchTableCellDataModel = (HatchTableCellDataModel) obj;
                if (!C7384Etj.areEqual(this.text, hatchTableCellDataModel.text) || this.rowIndex != hatchTableCellDataModel.rowIndex || this.columnIndex != hatchTableCellDataModel.columnIndex || this.isHeader != hatchTableCellDataModel.isHeader || !C7384Etj.areEqual(this.mathExpression, hatchTableCellDataModel.mathExpression)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ HatchTableCellDataModel(String str, int i, int i2, boolean z, String str2, int i3, C06H c06h) {
        this(str, i, i2, z, (i3 & 16) != 0 ? null : str2);
    }

    public static /* synthetic */ HatchTableCellDataModel copy$default(HatchTableCellDataModel hatchTableCellDataModel, String str, int i, int i2, boolean z, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = hatchTableCellDataModel.text;
        }
        if ((i3 & 2) != 0) {
            i = hatchTableCellDataModel.rowIndex;
        }
        if ((i3 & 4) != 0) {
            i2 = hatchTableCellDataModel.columnIndex;
        }
        if ((i3 & 8) != 0) {
            z = hatchTableCellDataModel.isHeader;
        }
        if ((i3 & 16) != 0) {
            str2 = hatchTableCellDataModel.mathExpression;
        }
        return hatchTableCellDataModel.copy(str, i, i2, z, str2);
    }

    public final String component1() {
        return this.text;
    }

    public final int component2() {
        return this.rowIndex;
    }

    public final int component3() {
        return this.columnIndex;
    }

    public final boolean component4() {
        return this.isHeader;
    }

    public final String component5() {
        return this.mathExpression;
    }

    public final int getColumnIndex() {
        return this.columnIndex;
    }

    public final String getMathExpression() {
        return this.mathExpression;
    }

    public final int getRowIndex() {
        return this.rowIndex;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return C0KA.A01((((AnonymousClass001.A0G(this.text) + this.rowIndex) * 31) + this.columnIndex) * 31, this.isHeader) + AnonymousClass006.A0G(this.mathExpression);
    }

    public final boolean isHeader() {
        return this.isHeader;
    }

    public String toString() {
        return super.toString();
    }

    public HatchTableCellDataModel(String str, int i, int i2, boolean z, String str2) {
        C7384Etj.A0Y(str, 0);
        this.text = str;
        this.rowIndex = i;
        this.columnIndex = i2;
        this.isHeader = z;
        this.mathExpression = str2;
    }
}
