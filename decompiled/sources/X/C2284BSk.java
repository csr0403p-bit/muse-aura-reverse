package X;

import com.facebook.aura.commands.photos.PhotosSearchHandlerKt;
import kotlin.Unit;

/* renamed from: X.BSk, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2284BSk implements Ht9, G0U {
    public final int $t;
    public final float A00;
    public final float A01;

    public C2284BSk(float f, float f2, int i) {
        this.$t = i;
        this.A00 = f;
        this.A01 = f2;
    }

    @Override // X.G0U
    public final Object invoke(Object obj) {
        int i = this.$t;
        float f = this.A00;
        float f2 = this.A01;
        ASF asf = (ASF) obj;
        if (i != 0) {
            asf.A01 = PhotosSearchHandlerKt.PARAM_OFFSET;
            BHD bhd = asf.A02;
            BHD.A00(bhd, "x", f);
            BHD.A00(bhd, "y", f2);
            return Unit.INSTANCE;
        }
        asf.A01 = "absoluteOffset";
        BHD bhd2 = asf.A02;
        BHD.A00(bhd2, "x", f);
        BHD.A00(bhd2, "y", f2);
        return Unit.INSTANCE;
    }
}
