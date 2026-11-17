package com.facebook.aura.markdown.render;

import X.AnonymousClass003;
import com.facebook.aura.markdown.parser.ast.AuraMarkdownDocument;

/* loaded from: classes4.dex */
public final class ParsedSource {
    public final AuraMarkdownDocument document;
    public final String source;

    public final AuraMarkdownDocument getDocument() {
        return this.document;
    }

    public final String getSource() {
        return this.source;
    }

    public ParsedSource(String str, AuraMarkdownDocument auraMarkdownDocument) {
        AnonymousClass003.A0u(str, auraMarkdownDocument);
        this.source = str;
        this.document = auraMarkdownDocument;
    }
}
