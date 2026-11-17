package X;

import android.graphics.PointF;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;

/* loaded from: classes6.dex */
public final class Hu3 implements InterfaceC10514HoR<PointF> {
    public static final Hu3 A00 = new Hu3();

    @Override // X.InterfaceC10514HoR
    public final /* bridge */ /* synthetic */ PointF AXc(AbstractC6806EaH abstractC6806EaH, float f) {
        Integer numA0C = abstractC6806EaH.A0C();
        if (numA0C == C79.A00 || numA0C == C79.A0C) {
            return HwH.A02(abstractC6806EaH, f);
        }
        if (numA0C != C79.A0W) {
            throw C60Q.A0U("Cannot convert json to point. Next token is ", numA0C != null ? EY4.A00(numA0C) : HatchCcvLoggingKt.NO_POSTAL_FIELD);
        }
        PointF pointF = new PointF(((float) abstractC6806EaH.A09()) * f, ((float) abstractC6806EaH.A09()) * f);
        while (abstractC6806EaH.A0L()) {
            abstractC6806EaH.A0K();
        }
        return pointF;
    }
}
