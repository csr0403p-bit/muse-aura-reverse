package com.facebook.aura.shopping.view;

import X.C7384Etj;
import com.facebook.aura.markdown.parser.ast.AuraInline;
import com.facebook.aura.markdown.parser.ast.AuraMarkdownDocument;
import com.facebook.aura.markdown.parser.custom.extensions.IndexedInlineEntityExtension;

/* loaded from: classes4.dex */
public final class ShoppingProductEntityMarkdown {
    public static final int $stable = 0;
    public static final String INLINE_NAME = "shopping.product";
    public static final ShoppingProductEntityMarkdown INSTANCE = new ShoppingProductEntityMarkdown();
    public static final char SENTINEL_CHAR = '\ufffb';

    public final String pillId(AuraInline.Custom custom) {
        C7384Etj.A0Y(custom, 0);
        return IndexedInlineEntityExtension.INSTANCE.key(custom, INLINE_NAME);
    }

    public final boolean pillsRenderCleanly(AuraMarkdownDocument auraMarkdownDocument, int i) {
        C7384Etj.A0Y(auraMarkdownDocument, 0);
        return IndexedInlineEntityExtension.INSTANCE.entitiesRenderCleanly(auraMarkdownDocument, INLINE_NAME, i);
    }

    public final int sentinelCount(String str) {
        C7384Etj.A0Y(str, 0);
        return IndexedInlineEntityExtension.INSTANCE.sentinelCount(str, INLINE_NAME);
    }

    public final char getSENTINEL_CHAR() {
        return SENTINEL_CHAR;
    }

    public final String sentinelFor(int i) {
        return IndexedInlineEntityExtension.INSTANCE.sentinelFor(INLINE_NAME, i);
    }
}
