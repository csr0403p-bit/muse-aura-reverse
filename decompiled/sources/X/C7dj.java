package X;

import android.view.textclassifier.TextClassification;

/* renamed from: X.7dj, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7dj extends C7dn {
    public final int A00;
    public final TextClassification A01;

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("TextContextMenuRemoteActionItem(key=");
        sbA0x.append(super.A00);
        sbA0x.append(", textClassification=");
        sbA0x.append(this.A01);
        sbA0x.append(", index=");
        sbA0x.append(this.A00);
        return AnonymousClass006.A0z(sbA0x);
    }

    public C7dj(TextClassification textClassification, Object obj, int i) {
        super(obj);
        this.A01 = textClassification;
        this.A00 = i;
    }
}
