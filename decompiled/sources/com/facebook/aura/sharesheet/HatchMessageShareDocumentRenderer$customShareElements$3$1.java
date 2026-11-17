package com.facebook.aura.sharesheet;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.markdown.parser.custom.extensions.SourceReference;

/* loaded from: classes4.dex */
public final class HatchMessageShareDocumentRenderer$customShareElements$3$1 extends AbstractC7559F3s implements G0U<SourceReference, CharSequence> {
    public static final HatchMessageShareDocumentRenderer$customShareElements$3$1 INSTANCE = new HatchMessageShareDocumentRenderer$customShareElements$3$1();

    public HatchMessageShareDocumentRenderer$customShareElements$3$1() {
        super(1);
    }

    @Override // X.G0U
    public final CharSequence invoke(SourceReference sourceReference) {
        C7384Etj.A0Y(sourceReference, 0);
        String str = sourceReference.title;
        if (str != null) {
            return str;
        }
        String str2 = sourceReference.url;
        return str2 == null ? String.valueOf(sourceReference.index) : str2;
    }
}
