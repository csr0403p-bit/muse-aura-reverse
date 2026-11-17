package com.facebook.aura.markdown.parser.custom.extensions;

import X.C7384Etj;
import com.facebook.aura.markdown.parser.ast.AuraMarkdownDocument;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class ExtensionPipeline implements AuraMarkdownExtension {
    public final List<AuraMarkdownExtension> extensions;

    /* JADX WARN: Multi-variable type inference failed */
    public ExtensionPipeline(List<? extends AuraMarkdownExtension> list) {
        C7384Etj.A0Y(list, 0);
        this.extensions = list;
    }

    @Override // com.facebook.aura.markdown.parser.custom.extensions.AuraMarkdownExtension
    public AuraMarkdownDocument transform(AuraMarkdownDocument auraMarkdownDocument) {
        C7384Etj.A0Y(auraMarkdownDocument, 0);
        Iterator<AuraMarkdownExtension> it = this.extensions.iterator();
        while (it.hasNext()) {
            auraMarkdownDocument = it.next().transform(auraMarkdownDocument);
        }
        return auraMarkdownDocument;
    }
}
