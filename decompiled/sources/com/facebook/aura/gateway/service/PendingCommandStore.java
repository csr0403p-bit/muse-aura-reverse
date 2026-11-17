package com.facebook.aura.gateway.service;

import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BV3;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C7384Etj;
import X.C9sU;
import X.HxE;
import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.aura.json.HatchJsonKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class PendingCommandStore {
    public static final PendingCommandStore INSTANCE = new PendingCommandStore();
    public static final String PREFS_NAME = "aura_pending_commands";

    public final void clearAll(Context context) {
        C7384Etj.A0Y(context, 0);
        prefs(context).edit().clear().apply();
    }

    public final List<HxE<String, String>> getAll(Context context) {
        HxE hxEA0r;
        C7384Etj.A0Y(context, 0);
        Map<String, ?> all = prefs(context).getAll();
        C7384Etj.A0X(all);
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator itA0n = AnonymousClass002.A0n(all);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            String strA0t = C60O.A0t(entryA0l);
            Object value = entryA0l.getValue();
            try {
                C9sU c9sU = HatchJsonKt.HatchJson;
                C7384Etj.A0Z(value, BV3.A00(0));
                hxEA0r = C3cG.A0r(strA0t, ((PendingCommandJson) c9sU.A00((String) value, PendingCommandJson$$serializer.INSTANCE)).command);
            } catch (Exception unused) {
                PendingCommandStore pendingCommandStore = INSTANCE;
                C7384Etj.A0X(strA0t);
                pendingCommandStore.remove(context, strA0t);
                hxEA0r = null;
            }
            if (hxEA0r != null) {
                arrayListA0h.add(hxEA0r);
            }
        }
        return arrayListA0h;
    }

    private final SharedPreferences prefs(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFS_NAME, 0);
        C7384Etj.A0U(sharedPreferences);
        return sharedPreferences;
    }

    public final void remove(Context context, String str) {
        AnonymousClass003.A0u(context, str);
        prefs(context).edit().remove(str).apply();
    }

    public final void save(Context context, String str, String str2) {
        AnonymousClass005.A0x(context, str, str2);
        prefs(context).edit().putString(str, HatchJsonKt.HatchJson.A02(new PendingCommandJson(str2, System.currentTimeMillis()), PendingCommandJson$$serializer.INSTANCE)).apply();
    }
}
