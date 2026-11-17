package X;

import com.facebook.acra.util.JavaProcFileReader;

/* renamed from: X.Atq, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1929Atq {
    public static final InterfaceC2128Ayu A00 = new C2041Ax9(C2136Az4.A00, 0, 0);

    public static final void A01(int i, int i2, int i3) {
        if (i < 0 || i > i2) {
            StringBuilder sbA0y = C60O.A0y("OffsetMapping.originalToTransformed returned invalid mapping: ", i3);
            sbA0y.append(JavaProcFileReader.LS_SYMLINK_ARROW);
            sbA0y.append(i);
            sbA0y.append(" is not in range of transformed text [0, ");
            sbA0y.append(i2);
            throw C3cG.A0Q(C8j3.A16(sbA0y, ']'));
        }
    }

    public static final void A02(int i, int i2, int i3) {
        if (i < 0 || i > i2) {
            StringBuilder sbA0y = C60O.A0y("OffsetMapping.transformedToOriginal returned invalid mapping: ", i3);
            sbA0y.append(JavaProcFileReader.LS_SYMLINK_ARROW);
            sbA0y.append(i);
            sbA0y.append(" is not in range of original text [0, ");
            sbA0y.append(i2);
            throw C3cG.A0Q(C8j3.A16(sbA0y, ']'));
        }
    }

    public static final C1YX A00(ApQ apQ, C19h c19h) {
        C1YX c1yxFilter = c19h.filter(apQ);
        int length = apQ.length();
        ApQ apQ2 = c1yxFilter.A00;
        int length2 = apQ2.length();
        int iMin = Math.min(length, 100);
        for (int i = 0; i < iMin; i++) {
            A01(c1yxFilter.A01.originalToTransformed(i), length2, i);
        }
        InterfaceC2128Ayu interfaceC2128Ayu = c1yxFilter.A01;
        A01(interfaceC2128Ayu.originalToTransformed(length), length2, length);
        int iMin2 = Math.min(length2, 100);
        for (int i2 = 0; i2 < iMin2; i2++) {
            A02(interfaceC2128Ayu.transformedToOriginal(i2), length, i2);
        }
        A02(interfaceC2128Ayu.transformedToOriginal(length2), length, length2);
        return new C1YX(apQ2, new C2041Ax9(interfaceC2128Ayu, length, length2));
    }
}
