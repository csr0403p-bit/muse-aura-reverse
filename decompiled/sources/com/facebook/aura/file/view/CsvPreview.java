package com.facebook.aura.file.view;

import X.C7384Etj;
import java.util.List;

/* loaded from: classes3.dex */
public final class CsvPreview {
    public final List<List<String>> rows;
    public final boolean truncated;

    /* JADX WARN: Multi-variable type inference failed */
    public CsvPreview(List<? extends List<String>> list, boolean z) {
        C7384Etj.A0Y(list, 0);
        this.rows = list;
        this.truncated = z;
    }

    public final List<List<String>> getRows() {
        return this.rows;
    }

    public final boolean getTruncated() {
        return this.truncated;
    }
}
