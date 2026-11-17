package X;

import android.util.Pair;
import com.instagram.common.bloks.payload.RawComponentPayload;
import java.util.List;

/* loaded from: classes6.dex */
public final class F90 {
    public List<C7616F6s> A00;

    public static Pair<RawComponentPayload, F90> A00(F94 f94) {
        Integer numAXl = f94.AXl();
        if (numAXl != C79.A0T) {
            C7384Etj.A0Y(FGI.A0M("Expected string while parsing string-encoded component payload, got ", HqV.A00(numAXl)), 0);
            FFI.A01(null, "BloksComponentQueryPayload", null);
            return null;
        }
        RawComponentPayload rawComponentPayloadA00 = RawComponentPayload.A00(f94);
        F94 f942 = rawComponentPayloadA00.tokenizer();
        f942.ARK();
        return new Pair<>(rawComponentPayloadA00, AbstractC7657F8z.A00(f942));
    }
}
