package X;

import android.graphics.PointF;
import com.facebook.aura.ageverification.intf.AgeCheckFunnelLogging;

/* renamed from: X.CrR, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4254CrR {
    public final int A00;
    public final PointF A01;

    public final String toString() {
        C4388Cuo c4388Cuo = new C4388Cuo();
        C4442Cw9 c4442Cw9A00 = C4442Cw9.A00(c4388Cuo, String.valueOf(this.A00), "type");
        PointF pointF = this.A01;
        C4388Cuo c4388Cuo2 = new C4388Cuo();
        c4442Cw9A00.A00 = c4388Cuo2;
        c4388Cuo2.A01 = pointF;
        c4388Cuo2.A02 = AgeCheckFunnelLogging.KEY_POSITION;
        return AbstractC4210CqI.A00(c4388Cuo, "FaceLandmark");
    }

    public C4254CrR(PointF pointF, int i) {
        this.A00 = i;
        this.A01 = pointF;
    }
}
