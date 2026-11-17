package com.facebook.aura.file.docx;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;

/* loaded from: classes6.dex */
public final class DocxParser$parseParagraphElements$text$1 extends AbstractC7559F3s implements G0U<DocRun, CharSequence> {
    public static final DocxParser$parseParagraphElements$text$1 INSTANCE = new DocxParser$parseParagraphElements$text$1();

    public DocxParser$parseParagraphElements$text$1() {
        super(1);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ CharSequence invoke(DocRun docRun) {
        DocRun docRun2 = docRun;
        C7384Etj.A0Y(docRun2, 0);
        return docRun2.text;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final CharSequence invoke2(DocRun docRun) {
        C7384Etj.A0Y(docRun, 0);
        return docRun.text;
    }
}
