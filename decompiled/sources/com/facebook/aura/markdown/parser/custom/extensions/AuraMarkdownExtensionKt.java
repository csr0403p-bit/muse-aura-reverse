package com.facebook.aura.markdown.parser.custom.extensions;

import X.C7384Etj;
import com.facebook.aura.markdown.parser.custom.MathToken;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class AuraMarkdownExtensionKt {
    public static final List<AuraMarkdownExtension> defaultExtensions(Map<Integer, MathToken> map) {
        C7384Etj.A0Y(map, 0);
        return Arrays.asList(HatchNodeCardExtension.INSTANCE, MermaidExtension.INSTANCE, new MathPlaceholderExtension(map), SourcesExtension.INSTANCE, CitationExtension.INSTANCE, FileLinkExtension.INSTANCE, ImageGroupExtension.INSTANCE, IndexedInlineEntityExtension.INSTANCE);
    }
}
