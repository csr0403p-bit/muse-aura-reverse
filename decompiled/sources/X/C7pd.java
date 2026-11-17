package X;

import com.facebook.aura.commands.contacts.CanonicalContact;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;

/* renamed from: X.7pd, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7pd {
    public final List<JsonElement> A00 = C3cG.A0h();

    public final void A06(JsonElement jsonElement) {
        C7384Etj.A0Y(jsonElement, 0);
        this.A00.add(jsonElement);
    }

    public static JsonArray A00(C7pd c7pd) {
        return new JsonArray(c7pd.A00);
    }

    public static C7pd A01() {
        return new C7pd();
    }

    public static C7pd A02(Number number, String str, C2nw c2nw) {
        C7qW.A05(number, str, c2nw);
        return new C7pd();
    }

    public static void A03(Iterator it, C7pd c7pd) {
        c7pd.A06(C9oY.A07((String) it.next()));
    }

    public static void A04(Iterator it, C7pd c7pd) {
        c7pd.A06(((CanonicalContact) it.next()).toJson());
    }

    public final JsonArray A05() {
        return A00(this);
    }
}
