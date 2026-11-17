package com.facebook.aura.gateway;

import X.C0881AGi;
import X.C3cG;
import X.C7384Etj;
import X.F60;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;

/* loaded from: classes6.dex */
public abstract class CheckoutLodgingJsonKt {
    public static final /* synthetic */ <T> T decodeOrNull(JsonElement jsonElement) {
        if (jsonElement != null) {
            try {
                C7384Etj.A0Q();
                throw F60.createAndThrow();
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static final /* synthetic */ <T> List<T> lenientList(JsonElement jsonElement) {
        List list = jsonElement instanceof JsonArray ? (JsonArray) jsonElement : null;
        if (list == null) {
            list = C0881AGi.A00;
        }
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                try {
                    C7384Etj.A0Q();
                    throw F60.createAndThrow();
                } catch (Throwable unused) {
                    continue;
                }
            }
        }
        return arrayListA0h;
    }
}
