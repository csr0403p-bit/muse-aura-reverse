package com.facebook.aura.conversation.view.richcontent;

import X.C1D3;
import X.C1D8;
import X.C1D9;
import X.C1DE;
import X.C1DM;

/* loaded from: classes.dex */
public abstract class AttachmentPreviewShapeKt {
    /* renamed from: attachmentPreviewShape-VpY3zN4, reason: not valid java name */
    public static final C1D3 m671attachmentPreviewShapeVpY3zN4(C1DM c1dm, float f, float f2) {
        C1DE c1de;
        return (!(c1dm instanceof C1D3) || (c1de = (C1DE) c1dm) == null) ? C1D8.A00(f2) : new C1D3(new InsetCornerSize(c1de.A03, f), new InsetCornerSize(c1de.A02, f), new C1D9(f2), new C1D9(f2));
    }
}
