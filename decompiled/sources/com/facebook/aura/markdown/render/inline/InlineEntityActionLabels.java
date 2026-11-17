package com.facebook.aura.markdown.render.inline;

import X.AnonymousClass005;
import X.C7BY;

/* loaded from: classes.dex */
public final class InlineEntityActionLabels {
    public final String key;
    public final String more;
    public final String open;
    public final String tag;

    public final String getInlineName() {
        return C7BY.A0K(InlineRendererKt.INLINE_ENTITY_ACTION_TAG_PREFIX, this.tag);
    }

    public final String getKey() {
        return this.key;
    }

    public final String getMore() {
        return this.more;
    }

    public final String getOpen() {
        return this.open;
    }

    public final String getTag() {
        return this.tag;
    }

    public InlineEntityActionLabels(String str, String str2, String str3, String str4) {
        AnonymousClass005.A14(str, str2, str3, str4);
        this.tag = str;
        this.key = str2;
        this.open = str3;
        this.more = str4;
    }
}
