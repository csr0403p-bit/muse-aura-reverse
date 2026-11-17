package X;

import java.util.LinkedHashMap;

/* loaded from: classes6.dex */
public final class GIX extends GIG {
    public GIX() {
        super(GIW.DEFAULT_INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r1v4, types: [X.Hs7] */
    public final void A05(C9415GIe c9415GIe, String str) {
        Hs7 hs7;
        GIW giw = (GIW) GIG.A02(this);
        int i = GIW.c;
        Hs7 hs72 = giw.fields_;
        if (!hs72.a) {
            if (hs72.isEmpty()) {
                hs7 = new Hs7();
            } else {
                LinkedHashMap linkedHashMap = new LinkedHashMap(hs72);
                hs7.a = true;
                hs7 = linkedHashMap;
            }
            giw.fields_ = hs7;
            hs72 = hs7;
        }
        hs72.put(str, c9415GIe);
    }
}
