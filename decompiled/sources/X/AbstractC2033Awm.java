package X;

import android.text.Layout;

/* renamed from: X.Awm, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2033Awm {
    public static final Layout.Alignment A00;
    public static final Layout.Alignment A01;

    static {
        Layout.Alignment[] alignmentArrValues = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : alignmentArrValues) {
            if (alignment3.name().equals("ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (alignment3.name().equals("ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        A00 = alignment;
        A01 = alignment2;
    }
}
