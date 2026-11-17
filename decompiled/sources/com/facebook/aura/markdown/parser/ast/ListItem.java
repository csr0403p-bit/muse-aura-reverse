package com.facebook.aura.markdown.parser.ast;

import X.AHD;
import X.C3cJ;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class ListItem {
    public final AHD<AuraBlock> children;

    /* JADX WARN: Multi-variable type inference failed */
    public ListItem(AHD<? extends AuraBlock> ahd) {
        C7384Etj.A0Y(ahd, 0);
        this.children = ahd;
    }

    public final ListItem copy(AHD<? extends AuraBlock> ahd) {
        C7384Etj.A0Y(ahd, 0);
        return new ListItem(ahd);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ListItem) && C7384Etj.areEqual(this.children, ((ListItem) obj).children));
    }

    public static /* synthetic */ ListItem copy$default(ListItem listItem, AHD ahd, int i, Object obj) {
        if ((i & 1) != 0) {
            ahd = listItem.children;
        }
        C7384Etj.A0Y(ahd, 0);
        return new ListItem(ahd);
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
        return C3cJ.A0M("ListItem(children=", this.children);
    }
}
