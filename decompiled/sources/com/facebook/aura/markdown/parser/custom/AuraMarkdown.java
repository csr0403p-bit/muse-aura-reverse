package com.facebook.aura.markdown.parser.custom;

import X.C10558Hst;
import X.C7384Etj;
import X.C8j3;
import X.C9196G6b;
import X.C9211G6r;
import X.CFK;
import X.G65;
import X.G7D;
import com.facebook.aura.markdown.parser.ast.AuraMarkdownDocument;
import com.facebook.aura.markdown.parser.custom.adapter.JetBrainsAstAdapter;
import com.facebook.aura.markdown.parser.custom.extensions.AuraMarkdownExtensionKt;
import com.facebook.aura.markdown.parser.custom.extensions.ExtensionPipeline;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.intellij.markdown.MarkdownParsingException;

/* loaded from: classes4.dex */
public final class AuraMarkdown {
    public static final String TAG = "AuraMarkdown";
    public static final AuraMarkdown INSTANCE = new AuraMarkdown();
    public static final HatchFlavourDescriptor flavour = new HatchFlavourDescriptor();
    public static final AtomicBoolean parseFailureLogged = new AtomicBoolean();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v5, types: [X.G65] */
    public final AuraMarkdownDocument parse(String str, boolean z) {
        G65 g65A00;
        boolean zA00 = 0;
        if (C8j3.A0J(str, 0) == 0) {
            return AuraMarkdownDocument.EMPTY;
        }
        MathExtraction mathExtractionExtract = MathPreprocessor.INSTANCE.extract(BacktickStripper.INSTANCE.strip(str));
        String strNormalize = TableHeaderNormalizer.INSTANCE.normalize(mathExtractionExtract.text);
        try {
            HatchFlavourDescriptor hatchFlavourDescriptor = flavour;
            C7384Etj.A0Y(hatchFlavourDescriptor, 0);
            zA00 = new G7D(hatchFlavourDescriptor, C10558Hst.A00, true).A00(strNormalize);
            g65A00 = zA00;
        } catch (MarkdownParsingException e) {
            if (!z) {
                throw e;
            }
            if (parseFailureLogged.compareAndSet(zA00, true)) {
                CFK.A06(TAG, "Markdown parse failed, rendering as plain text");
            }
            g65A00 = new G7D(flavour, C10558Hst.A00, zA00).A00(strNormalize);
        }
        C7384Etj.A0Y(strNormalize, 1);
        HashMap map = new HashMap();
        new C9196G6b(strNormalize, map).A00(g65A00);
        return new ExtensionPipeline(AuraMarkdownExtensionKt.defaultExtensions(mathExtractionExtract.table)).transform(new JetBrainsAstAdapter(strNormalize, new C9211G6r(map)).convert(g65A00));
    }
}
