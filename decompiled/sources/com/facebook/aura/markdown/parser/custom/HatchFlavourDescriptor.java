package com.facebook.aura.markdown.parser.custom;

import X.AbstractC9198G6d;
import X.AbstractC9205G6l;
import X.AbstractC9213G6t;
import X.G7Z;
import X.G89;
import X.G8A;
import X.G8C;
import X.G8D;
import X.G8E;
import X.InterfaceC9243G7y;
import java.util.Arrays;
import java.util.List;
import org.intellij.markdown.parser.sequentialparsers.EmphasisLikeParser;
import org.intellij.markdown.parser.sequentialparsers.impl.EmphStrongDelimiterParser;

/* loaded from: classes6.dex */
public final class HatchFlavourDescriptor extends AbstractC9198G6d {
    public final G7Z sequentialParserManager;

    public HatchFlavourDescriptor() {
        super(true, false, false);
        this.sequentialParserManager = new G7Z() { // from class: com.facebook.aura.markdown.parser.custom.HatchFlavourDescriptor$sequentialParserManager$1
            @Override // X.G7Z
            public List<InterfaceC9243G7y> getParserSequence() {
                return Arrays.asList(new G8D(Arrays.asList(AbstractC9205G6l.A02, AbstractC9205G6l.A0C, AbstractC9213G6t.A04)), new G8E(), new G8C(), new G89(), new G8A(), new EmphasisLikeParser(new EmphStrongDelimiterParser(), new DoubleTildeStrikeThroughDelimiterParser()));
            }
        };
    }

    @Override // X.AbstractC9198G6d, X.C9202G6h
    public G7Z getSequentialParserManager() {
        return this.sequentialParserManager;
    }
}
