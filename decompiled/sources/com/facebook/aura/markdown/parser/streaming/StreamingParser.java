package com.facebook.aura.markdown.parser.streaming;

import X.AH8;
import X.AHD;
import X.AbstractC0885AGm;
import X.AnonymousClass003;
import X.C0881AGi;
import X.C7384Etj;
import X.F60;
import com.facebook.aura.markdown.parser.ast.AuraBlock;
import com.facebook.aura.markdown.parser.ast.AuraMarkdownDocument;
import com.facebook.aura.markdown.parser.custom.AuraMarkdown;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class StreamingParser {
    public String lastSource = "";
    public AuraMarkdownDocument lastDocument = AuraMarkdownDocument.EMPTY;

    public final StreamingParseResult update(String str) {
        AuraMarkdownDocument auraMarkdownDocument;
        DocumentDelta documentDeltaComputeDelta;
        C7384Etj.A0Y(str, 0);
        String strTrim = PartialBlockTrimmer.INSTANCE.trim(str);
        if (C7384Etj.areEqual(strTrim, this.lastSource)) {
            auraMarkdownDocument = this.lastDocument;
            documentDeltaComputeDelta = new DocumentDelta(auraMarkdownDocument.blocks.size(), C0881AGi.A00);
        } else {
            auraMarkdownDocument = AuraMarkdown.INSTANCE.parse(strTrim, true);
            documentDeltaComputeDelta = computeDelta(this.lastDocument, auraMarkdownDocument);
            this.lastSource = strTrim;
            this.lastDocument = auraMarkdownDocument;
        }
        return new StreamingParseResult(auraMarkdownDocument, documentDeltaComputeDelta);
    }

    private final DocumentDelta computeDelta(AuraMarkdownDocument auraMarkdownDocument, AuraMarkdownDocument auraMarkdownDocument2) {
        AHD<AuraBlock> ahd = auraMarkdownDocument.blocks;
        AHD<AuraBlock> ahd2 = auraMarkdownDocument2.blocks;
        int iMin = Math.min(ahd.size(), ahd2.size());
        int i = 0;
        int i2 = 0;
        while (i2 < iMin && C7384Etj.areEqual(ahd.get(i2), ahd2.get(i2))) {
            i2++;
        }
        AH8 ah8AgX = ahd2.AgX(i2, ahd2.size());
        ArrayList arrayListA0i = AnonymousClass003.A0i(ah8AgX);
        Iterator<E> it = ah8AgX.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            int i3 = i + 1;
            if (i < 0) {
                AbstractC0885AGm.A14();
                throw F60.createAndThrow();
            }
            arrayListA0i.add(new ChangedBlock(i + i2, (AuraBlock) next));
            i = i3;
        }
        return new DocumentDelta(i2, arrayListA0i);
    }

    public final AuraMarkdownDocument getCurrent() {
        return this.lastDocument;
    }

    public final void reset() {
        this.lastSource = "";
        this.lastDocument = AuraMarkdownDocument.EMPTY;
    }
}
