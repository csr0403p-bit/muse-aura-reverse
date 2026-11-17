package X;

import java.util.Arrays;

/* renamed from: X.CqH, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4209CqH {
    public final float A00 = 0.15f;

    public final boolean equals(Object obj) {
        return obj == this || (obj instanceof C4209CqH);
    }

    public final String toString() {
        C4388Cuo c4388Cuo = new C4388Cuo();
        String strValueOf = String.valueOf(1);
        C4442Cw9 c4442Cw9A00 = C4442Cw9.A00(C4442Cw9.A00(C4442Cw9.A00(C4442Cw9.A00(C4442Cw9.A00(c4388Cuo, strValueOf, "landmarkMode"), strValueOf, "contourMode"), strValueOf, "classificationMode"), strValueOf, "performanceMode"), String.valueOf(false), "trackingEnabled");
        String strValueOf2 = String.valueOf(0.15f);
        C4442Cw9 c4442Cw9 = new C4442Cw9();
        c4442Cw9A00.A00 = c4442Cw9;
        c4442Cw9.A01 = strValueOf2;
        c4442Cw9.A02 = "minFaceSize";
        return AbstractC4210CqI.A00(c4388Cuo, "FaceDetectorOptions");
    }

    public final int hashCode() {
        Integer numValueOf = Integer.valueOf(Float.floatToIntBits(0.15f));
        Integer numA0W = BV4.A0W();
        return Arrays.hashCode(new Object[]{numValueOf, numA0W, numA0W, numA0W, AnonymousClass001.A0h(), numA0W, null});
    }
}
