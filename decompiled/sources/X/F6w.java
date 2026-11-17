package X;

import java.util.Map;

/* loaded from: classes6.dex */
public final class F6w {
    public final F9C A00;
    public final Map<String, Object> A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof F6w) {
                F6w f6w = (F6w) obj;
                if (!this.A01.equals(f6w.A01) || !C7384Etj.areEqual(this.A00, f6w.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0E(this.A01) + AnonymousClass006.A0D(this.A00);
    }

    public final String toString() {
        return C3cJ.A0L(this.A00, ", payloadMetadataBuilder=", C3cG.A0f(this.A01, "BloksFunctionTable(ft="));
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/Map<Ljava/lang/String;+Ljava/lang/Object;>;LX/F9C;)V */
    public F6w(F9C f9c, Map map) {
        this.A01 = map;
        this.A00 = f9c;
    }
}
