package X;

import com.facebook.aura.widgets.WidgetComponentsKt;
import kotlin.Unit;

/* renamed from: X.BSl, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2285BSl implements Ht9, G0U {
    public final int $t;
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;

    public C2285BSl(float f, float f2, float f3, float f4, int i) {
        this.$t = i;
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
        this.A03 = f4;
    }

    @Override // X.G0U
    public final Object invoke(Object obj) {
        int i = this.$t;
        float f = this.A00;
        float f2 = this.A01;
        float f3 = this.A02;
        float f4 = this.A03;
        ASF asf = (ASF) obj;
        if (i != 0) {
            asf.A01 = "absolutePadding";
            BHD bhd = asf.A02;
            BHD.A00(bhd, "left", f);
            BHD.A00(bhd, "top", f2);
            BHD.A00(bhd, "right", f3);
            BHD.A00(bhd, "bottom", f4);
            return Unit.INSTANCE;
        }
        asf.A01 = "padding";
        BHD bhd2 = asf.A02;
        BHD.A00(bhd2, WidgetComponentsKt.START_PATH, f);
        BHD.A00(bhd2, "top", f2);
        BHD.A00(bhd2, "end", f3);
        BHD.A00(bhd2, "bottom", f4);
        return Unit.INSTANCE;
    }
}
