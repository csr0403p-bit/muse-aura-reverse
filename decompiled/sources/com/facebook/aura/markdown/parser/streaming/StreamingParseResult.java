package com.facebook.aura.markdown.parser.streaming;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C3cG;
import X.C3cJ;
import X.C7384Etj;
import com.facebook.aura.markdown.parser.ast.AuraMarkdownDocument;

/* loaded from: classes4.dex */
public final class StreamingParseResult {
    public final DocumentDelta delta;
    public final AuraMarkdownDocument document;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StreamingParseResult) {
                StreamingParseResult streamingParseResult = (StreamingParseResult) obj;
                if (!C7384Etj.areEqual(this.document, streamingParseResult.document) || !C7384Etj.areEqual(this.delta, streamingParseResult.delta)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ StreamingParseResult copy$default(StreamingParseResult streamingParseResult, AuraMarkdownDocument auraMarkdownDocument, DocumentDelta documentDelta, int i, Object obj) {
        if ((i & 1) != 0) {
            auraMarkdownDocument = streamingParseResult.document;
        }
        if ((i & 2) != 0) {
            documentDelta = streamingParseResult.delta;
        }
        AnonymousClass003.A0u(auraMarkdownDocument, documentDelta);
        return new StreamingParseResult(auraMarkdownDocument, documentDelta);
    }

    public final AuraMarkdownDocument component1() {
        return this.document;
    }

    public final DocumentDelta component2() {
        return this.delta;
    }

    public final DocumentDelta getDelta() {
        return this.delta;
    }

    public final AuraMarkdownDocument getDocument() {
        return this.document;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.delta, AnonymousClass005.A0E(this.document));
    }

    public String toString() {
        return C3cJ.A0L(this.delta, ", delta=", C3cG.A0f(this.document, "StreamingParseResult(document="));
    }

    public StreamingParseResult(AuraMarkdownDocument auraMarkdownDocument, DocumentDelta documentDelta) {
        AnonymousClass003.A0u(auraMarkdownDocument, documentDelta);
        this.document = auraMarkdownDocument;
        this.delta = documentDelta;
    }

    public final StreamingParseResult copy(AuraMarkdownDocument auraMarkdownDocument, DocumentDelta documentDelta) {
        AnonymousClass003.A0u(auraMarkdownDocument, documentDelta);
        return new StreamingParseResult(auraMarkdownDocument, documentDelta);
    }
}
