package com.facebook.aura.markdown.parser.ast;

import X.AHD;
import X.AHI;
import X.C06H;
import X.C3cJ;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class AuraMarkdownDocument {
    public static final Companion Companion = new Companion();
    public static final AuraMarkdownDocument EMPTY = new AuraMarkdownDocument(AHI.A01);
    public final AHD<AuraBlock> blocks;

    public final class Companion {
        public final AuraMarkdownDocument getEMPTY() {
            return AuraMarkdownDocument.EMPTY;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AuraMarkdownDocument(AHD<? extends AuraBlock> ahd) {
        C7384Etj.A0Y(ahd, 0);
        this.blocks = ahd;
    }

    public final AuraMarkdownDocument copy(AHD<? extends AuraBlock> ahd) {
        C7384Etj.A0Y(ahd, 0);
        return new AuraMarkdownDocument(ahd);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AuraMarkdownDocument) && C7384Etj.areEqual(this.blocks, ((AuraMarkdownDocument) obj).blocks));
    }

    public static /* synthetic */ AuraMarkdownDocument copy$default(AuraMarkdownDocument auraMarkdownDocument, AHD ahd, int i, Object obj) {
        if ((i & 1) != 0) {
            ahd = auraMarkdownDocument.blocks;
        }
        C7384Etj.A0Y(ahd, 0);
        return new AuraMarkdownDocument(ahd);
    }

    public final AHD<AuraBlock> component1() {
        return this.blocks;
    }

    public final AHD<AuraBlock> getBlocks() {
        return this.blocks;
    }

    public int hashCode() {
        return this.blocks.hashCode();
    }

    public String toString() {
        return C3cJ.A0M("AuraMarkdownDocument(blocks=", this.blocks);
    }
}
