package com.facebook.aura.markdown.parser.streaming;

import X.AnonymousClass005;
import X.C3cJ;
import X.C60O;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes4.dex */
public final class DocumentDelta {
    public final List<ChangedBlock> changed;
    public final int unchangedPrefixCount;

    public DocumentDelta(int i, List<ChangedBlock> list) {
        C7384Etj.A0Y(list, 1);
        this.unchangedPrefixCount = i;
        this.changed = list;
    }

    public final DocumentDelta copy(int i, List<ChangedBlock> list) {
        C7384Etj.A0Y(list, 1);
        return new DocumentDelta(i, list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DocumentDelta) {
                DocumentDelta documentDelta = (DocumentDelta) obj;
                if (this.unchangedPrefixCount != documentDelta.unchangedPrefixCount || !C7384Etj.areEqual(this.changed, documentDelta.changed)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ DocumentDelta copy$default(DocumentDelta documentDelta, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = documentDelta.unchangedPrefixCount;
        }
        if ((i2 & 2) != 0) {
            list = documentDelta.changed;
        }
        C7384Etj.A0Y(list, 1);
        return new DocumentDelta(i, list);
    }

    public final int component1() {
        return this.unchangedPrefixCount;
    }

    public final List<ChangedBlock> component2() {
        return this.changed;
    }

    public final List<ChangedBlock> getChanged() {
        return this.changed;
    }

    public final int getUnchangedPrefixCount() {
        return this.unchangedPrefixCount;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.changed, this.unchangedPrefixCount * 31);
    }

    public String toString() {
        return C3cJ.A0L(this.changed, ", changed=", C60O.A0y("DocumentDelta(unchangedPrefixCount=", this.unchangedPrefixCount));
    }
}
