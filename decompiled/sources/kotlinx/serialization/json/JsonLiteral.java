package kotlinx.serialization.json;

import X.AbstractC3195C2t;
import X.AnonymousClass001;
import X.C0KA;
import X.C7384Etj;
import X.C9iZ;

/* loaded from: classes4.dex */
public final class JsonLiteral extends JsonPrimitive {
    public final String A00;
    public final C9iZ A01;
    public final boolean A02;

    public JsonLiteral(Object obj, C9iZ c9iZ, boolean z) {
        C7384Etj.A0Y(obj, 0);
        this.A02 = z;
        this.A01 = c9iZ;
        this.A00 = obj.toString();
        if (c9iZ != null && !c9iZ.isInline()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                JsonLiteral jsonLiteral = (JsonLiteral) obj;
                if (this.A02 != jsonLiteral.A02 || !C7384Etj.areEqual(this.A00, jsonLiteral.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public final String A00() {
        return this.A00;
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public final boolean A01() {
        return this.A02;
    }

    public final int hashCode() {
        return AnonymousClass001.A0H(this.A00, C0KA.A02(this.A02));
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public final String toString() {
        if (!this.A02) {
            return this.A00;
        }
        StringBuilder sb = new StringBuilder();
        AbstractC3195C2t.A00(sb, this.A00);
        return sb.toString();
    }
}
