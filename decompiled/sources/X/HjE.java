package X;

import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;

/* loaded from: classes6.dex */
public final class HjE {
    public C10466Hjw A00;
    public HBB A01;
    public Integer A02;

    public final String toString() {
        String strValueOf = String.valueOf(this.A00);
        Integer num = this.A02;
        return FGI.A0d(strValueOf, " {...} (src=", num != null ? 1 - num.intValue() != 0 ? "Document" : "RenderOptions" : HatchCcvLoggingKt.NO_POSTAL_FIELD, ")");
    }
}
