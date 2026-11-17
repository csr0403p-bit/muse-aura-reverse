package com.facebook.aura.sharesheet;

import X.AnonymousClass003;
import java.util.List;

/* loaded from: classes4.dex */
public final class TableElement implements ShareElement {
    public final List<CharSequence> header;
    public final List<List<CharSequence>> rows;

    public final List<CharSequence> getHeader() {
        return this.header;
    }

    public final List<List<CharSequence>> getRows() {
        return this.rows;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TableElement(List<? extends CharSequence> list, List<? extends List<? extends CharSequence>> list2) {
        AnonymousClass003.A0u(list, list2);
        this.header = list;
        this.rows = list2;
    }
}
