package com.facebook.aura.markdown.parser.ast;

import X.AHD;
import X.C3cJ;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class TableCell {
    public final AHD<AuraBlock> children;

    /* JADX WARN: Multi-variable type inference failed */
    public TableCell(AHD<? extends AuraBlock> ahd) {
        C7384Etj.A0Y(ahd, 0);
        this.children = ahd;
    }

    public final TableCell copy(AHD<? extends AuraBlock> ahd) {
        C7384Etj.A0Y(ahd, 0);
        return new TableCell(ahd);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof TableCell) && C7384Etj.areEqual(this.children, ((TableCell) obj).children));
    }

    public static /* synthetic */ TableCell copy$default(TableCell tableCell, AHD ahd, int i, Object obj) {
        if ((i & 1) != 0) {
            ahd = tableCell.children;
        }
        C7384Etj.A0Y(ahd, 0);
        return new TableCell(ahd);
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
        return C3cJ.A0M("TableCell(children=", this.children);
    }
}
