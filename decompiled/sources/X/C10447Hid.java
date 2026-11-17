package X;

import android.graphics.PointF;
import java.util.List;

/* renamed from: X.Hid, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10447Hid {
    public PointF A00;
    public boolean A01;
    public final List<HjF> A02;

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("ShapeData{numCurves=");
        sbA0x.append(this.A02.size());
        sbA0x.append("closed=");
        sbA0x.append(this.A01);
        return C8j3.A15(sbA0x);
    }

    public C10447Hid() {
        this.A02 = C3cG.A0h();
    }

    /* JADX WARN: Incorrect types in method signature: (Landroid/graphics/PointF;ZLjava/util/List<LX/HjF;>;)V */
    public C10447Hid(PointF pointF, List list, boolean z) {
        this.A00 = pointF;
        this.A01 = z;
        this.A02 = BV4.A0t(list);
    }
}
