package com.facebook.aura.markdown.parser.custom.extensions;

import X.C3cJ;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes4.dex */
public final class SourcesPayload {
    public final List<SourceReference> items;

    public SourcesPayload(List<SourceReference> list) {
        C7384Etj.A0Y(list, 0);
        this.items = list;
    }

    public final SourcesPayload copy(List<SourceReference> list) {
        C7384Etj.A0Y(list, 0);
        return new SourcesPayload(list);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof SourcesPayload) && C7384Etj.areEqual(this.items, ((SourcesPayload) obj).items));
    }

    public static /* synthetic */ SourcesPayload copy$default(SourcesPayload sourcesPayload, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = sourcesPayload.items;
        }
        C7384Etj.A0Y(list, 0);
        return new SourcesPayload(list);
    }

    public final List<SourceReference> component1() {
        return this.items;
    }

    public final List<SourceReference> getItems() {
        return this.items;
    }

    public int hashCode() {
        return this.items.hashCode();
    }

    public String toString() {
        return C3cJ.A0M("SourcesPayload(items=", this.items);
    }
}
