package X;

import java.util.List;

/* renamed from: X.Cqw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4235Cqw {
    public final int A00;
    public final List A01;

    public final String toString() {
        C4388Cuo c4388Cuo = new C4388Cuo();
        C4442Cw9 c4442Cw9A00 = C4442Cw9.A00(c4388Cuo, String.valueOf(this.A00), "type");
        Object[] array = this.A01.toArray();
        C4388Cuo c4388Cuo2 = new C4388Cuo();
        c4442Cw9A00.A00 = c4388Cuo2;
        c4388Cuo2.A01 = array;
        c4388Cuo2.A02 = "points";
        return AbstractC4210CqI.A00(c4388Cuo, "FaceContour");
    }

    public C4235Cqw(int i, List list) {
        this.A00 = i;
        this.A01 = list;
    }
}
