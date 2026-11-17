package com.facebook.aura.model;

import X.AHD;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;
import com.facebook.aura.markdown.parser.ast.AuraBlock;

/* loaded from: classes4.dex */
public final class HatchTableParamsModel extends C06G {
    public static final int $stable = 0;
    public final int columnSize;
    public final AHD<HatchTableCellDataModel> data;
    public final AuraBlock.Table parsedTable;
    public final int rowSize;

    public HatchTableParamsModel(AHD<HatchTableCellDataModel> ahd, int i, int i2, AuraBlock.Table table) {
        C7384Etj.A0Y(ahd, 0);
        this.data = ahd;
        this.rowSize = i;
        this.columnSize = i2;
        this.parsedTable = table;
    }

    public final HatchTableParamsModel copy(AHD<HatchTableCellDataModel> ahd, int i, int i2, AuraBlock.Table table) {
        C7384Etj.A0Y(ahd, 0);
        return new HatchTableParamsModel(ahd, i, i2, table);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchTableParamsModel) {
                HatchTableParamsModel hatchTableParamsModel = (HatchTableParamsModel) obj;
                if (!C7384Etj.areEqual(this.data, hatchTableParamsModel.data) || this.rowSize != hatchTableParamsModel.rowSize || this.columnSize != hatchTableParamsModel.columnSize || !C7384Etj.areEqual(this.parsedTable, hatchTableParamsModel.parsedTable)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchTableParamsModel copy$default(HatchTableParamsModel hatchTableParamsModel, AHD ahd, int i, int i2, AuraBlock.Table table, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            ahd = hatchTableParamsModel.data;
        }
        if ((i3 & 2) != 0) {
            i = hatchTableParamsModel.rowSize;
        }
        if ((i3 & 4) != 0) {
            i2 = hatchTableParamsModel.columnSize;
        }
        if ((i3 & 8) != 0) {
            table = hatchTableParamsModel.parsedTable;
        }
        C7384Etj.A0Y(ahd, 0);
        return new HatchTableParamsModel(ahd, i, i2, table);
    }

    public final AHD<HatchTableCellDataModel> component1() {
        return this.data;
    }

    public final int component2() {
        return this.rowSize;
    }

    public final int component3() {
        return this.columnSize;
    }

    public final AuraBlock.Table component4() {
        return this.parsedTable;
    }

    public final int getColumnSize() {
        return this.columnSize;
    }

    public final AHD<HatchTableCellDataModel> getData() {
        return this.data;
    }

    public final AuraBlock.Table getParsedTable() {
        return this.parsedTable;
    }

    public final int getRowSize() {
        return this.rowSize;
    }

    public int hashCode() {
        return ((((AnonymousClass005.A0E(this.data) + this.rowSize) * 31) + this.columnSize) * 31) + AnonymousClass006.A0D(this.parsedTable);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchTableParamsModel(AHD ahd, int i, int i2, AuraBlock.Table table, int i3, C06H c06h) {
        this(ahd, i, i2, (i3 & 8) != 0 ? null : table);
    }
}
