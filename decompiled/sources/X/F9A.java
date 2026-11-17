package X;

import com.instagram.common.bloks.payload.RawComponentPayload;
import java.util.List;

/* loaded from: classes6.dex */
public final class F9A {
    public final List<F6K> A00;
    public final HxE<RawComponentPayload, C7722FBy> A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof F9A) {
                F9A f9a = (F9A) obj;
                if (!this.A01.equals(f9a.A01) || !this.A00.equals(f9a.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        HxE<RawComponentPayload, C7722FBy> hxE = this.A01;
        List<F6K> list = this.A00;
        StringBuilder sbA0f = C3cG.A0f(null, "BloksParsedExtension(queryMetadata=");
        sbA0f.append(", components=");
        sbA0f.append(hxE);
        return C3cJ.A0L(list, ", externalDataManifestEntries=", sbA0f);
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A00, AnonymousClass005.A0E(this.A01));
    }

    public F9A(List list, HxE hxE) {
        this.A01 = hxE;
        this.A00 = list;
    }
}
