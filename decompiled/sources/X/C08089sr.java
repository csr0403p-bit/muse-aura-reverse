package X;

import kotlinx.serialization.json.JsonElement;

/* renamed from: X.9sr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C08089sr extends C9sO {
    public final JsonElement A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C08089sr(String str, C9sU c9sU, JsonElement jsonElement) {
        super(str, c9sU, jsonElement);
        C7384Etj.A0Y(c9sU, 0);
        C7384Etj.A0Y(jsonElement, 1);
        this.A00 = jsonElement;
        ((C9sK) this).A01.add("primitive");
    }

    @Override // X.C9sO
    public final JsonElement A0I(String str) {
        C7384Etj.A0Y(str, 0);
        if (str == "primitive") {
            return this.A00;
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag");
    }

    @Override // X.C9j4
    public final int A8N(C9iZ c9iZ) {
        return 0;
    }
}
