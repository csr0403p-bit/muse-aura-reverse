package com.facebook.aura.file.view;

import X.C7384Etj;
import java.util.List;

/* loaded from: classes3.dex */
public final class CsvRow {
    public final List<String> cells;
    public final boolean truncated;

    public CsvRow(List<String> list, boolean z) {
        C7384Etj.A0Y(list, 0);
        this.cells = list;
        this.truncated = z;
    }

    public final List<String> getCells() {
        return this.cells;
    }

    public final boolean getTruncated() {
        return this.truncated;
    }
}
