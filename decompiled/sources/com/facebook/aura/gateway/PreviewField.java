package com.facebook.aura.gateway;

import X.AnonymousClass003;
import X.C06H;
import com.facebook.aura.nodes.core.NodeCommandId;
import java.util.List;

/* loaded from: classes3.dex */
public final class PreviewField {
    public final PreviewFormat format;
    public final List<String> keys;
    public final int labelResId;
    public final NodeCommandId onlyFor;

    public /* synthetic */ PreviewField(int i, List list, PreviewFormat previewFormat, NodeCommandId nodeCommandId, int i2, C06H c06h) {
        this(i, list, (i2 & 4) != 0 ? PreviewFormat.TEXT : previewFormat, (i2 & 8) != 0 ? null : nodeCommandId);
    }

    public final PreviewFormat getFormat() {
        return this.format;
    }

    public final List<String> getKeys() {
        return this.keys;
    }

    public final int getLabelResId() {
        return this.labelResId;
    }

    public final NodeCommandId getOnlyFor() {
        return this.onlyFor;
    }

    public PreviewField(int i, List<String> list, PreviewFormat previewFormat, NodeCommandId nodeCommandId) {
        AnonymousClass003.A0x(list, previewFormat);
        this.labelResId = i;
        this.keys = list;
        this.format = previewFormat;
        this.onlyFor = nodeCommandId;
    }
}
