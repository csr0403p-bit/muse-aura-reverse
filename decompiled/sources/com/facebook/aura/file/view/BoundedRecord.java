package com.facebook.aura.file.view;

import X.C7384Etj;

/* loaded from: classes3.dex */
public final class BoundedRecord {
    public final int lines;
    public final boolean truncated;
    public final String value;

    public BoundedRecord(String str, boolean z, int i) {
        C7384Etj.A0Y(str, 0);
        this.value = str;
        this.truncated = z;
        this.lines = i;
    }

    public final int getLines() {
        return this.lines;
    }

    public final boolean getTruncated() {
        return this.truncated;
    }

    public final String getValue() {
        return this.value;
    }
}
