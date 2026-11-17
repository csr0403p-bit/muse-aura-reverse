package X;

import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;

/* renamed from: X.9sq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C08079sq extends C9sO {
    public int A00;
    public final JsonArray A01;
    public final int A02;

    @Override // X.C9sO
    public final JsonElement A0I(String str) throws NumberFormatException {
        C7384Etj.A0Y(str, 0);
        JsonArray jsonArray = this.A01;
        return jsonArray.A00.get(Integer.parseInt(str));
    }

    @Override // X.C9j4
    public final int A8N(C9iZ c9iZ) {
        int i = this.A00;
        if (i >= this.A02 - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.A00 = i2;
        return i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C08079sq(C9sU c9sU, JsonArray jsonArray) {
        super(null, c9sU, jsonArray);
        AnonymousClass003.A0u(c9sU, jsonArray);
        this.A01 = jsonArray;
        this.A02 = jsonArray.size();
        this.A00 = -1;
    }

    @Override // X.AbstractC07999si
    public final String A0F(C9iZ c9iZ, int i) {
        return String.valueOf(i);
    }
}
