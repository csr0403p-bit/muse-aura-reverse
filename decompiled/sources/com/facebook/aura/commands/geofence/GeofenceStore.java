package com.facebook.aura.commands.geofence;

import X.A3q;
import X.AbstractC0882AGj;
import X.AbstractC7559F3s;
import X.BGK;
import X.C06H;
import X.C3cG;
import X.C60O;
import X.C60Q;
import X.C7384Etj;
import X.C7pd;
import X.C9iZ;
import X.C9oY;
import X.F60;
import X.G0U;
import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.aura.json.HatchJsonKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public final class GeofenceStore {
    public static final Companion Companion = new Companion();
    public static final String KEY_GEOFENCES = "geofences";
    public static final String KEY_INSIDE_IDS = "inside_geofence_ids";
    public static final String PREFS_NAME = "hatch_geofences";
    public static volatile GeofenceStore instance;
    public final SharedPreferences prefs;

    /* renamed from: com.facebook.aura.commands.geofence.GeofenceStore$save$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<NodeGeofence, Boolean> {
        public final /* synthetic */ NodeGeofence $geofence;

        @Override // X.G0U
        public final Boolean invoke(NodeGeofence nodeGeofence) {
            C7384Etj.A0Y(nodeGeofence, 0);
            return C60O.A0h(nodeGeofence.id, this.$geofence.id);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(NodeGeofence nodeGeofence) {
            super(1);
            this.$geofence = nodeGeofence;
        }
    }

    public final NodeGeofence findById(String str) {
        NodeGeofence next;
        C7384Etj.A0Y(str, 0);
        Iterator<NodeGeofence> it = getAllMutable().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (str.equals(next.id)) {
                break;
            }
        }
        return next;
    }

    public final boolean isInside(String str) {
        C7384Etj.A0Y(str, 0);
        Set<String> stringSet = this.prefs.getStringSet(KEY_INSIDE_IDS, A3q.A00);
        if (stringSet != null) {
            return stringSet.contains(str);
        }
        return false;
    }

    public final void markInside(String str) {
        C7384Etj.A0Y(str, 0);
        SharedPreferences sharedPreferences = this.prefs;
        A3q a3q = A3q.A00;
        Set<String> stringSet = sharedPreferences.getStringSet(KEY_INSIDE_IDS, a3q);
        if (stringSet == null) {
            stringSet = a3q;
        }
        if (stringSet.contains(str)) {
            return;
        }
        this.prefs.edit().putStringSet(KEY_INSIDE_IDS, BGK.A02(str, stringSet)).apply();
    }

    public final void markOutside(String str) {
        C7384Etj.A0Y(str, 0);
        SharedPreferences sharedPreferences = this.prefs;
        A3q a3q = A3q.A00;
        Set<String> stringSet = sharedPreferences.getStringSet(KEY_INSIDE_IDS, a3q);
        if (stringSet == null) {
            stringSet = a3q;
        }
        if (stringSet.contains(str)) {
            this.prefs.edit().putStringSet(KEY_INSIDE_IDS, BGK.A04(str, stringSet)).apply();
        }
    }

    public final boolean remove(String str) {
        C7384Etj.A0Y(str, 0);
        List<NodeGeofence> allMutable = getAllMutable();
        boolean zA0v = AbstractC0882AGj.A0v(allMutable, new GeofenceStore$remove$removed$1(str));
        if (zA0v) {
            persist(allMutable);
        }
        markOutside(str);
        return zA0v;
    }

    public final void save(NodeGeofence nodeGeofence) {
        C7384Etj.A0Y(nodeGeofence, 0);
        List<NodeGeofence> allMutable = getAllMutable();
        AbstractC0882AGj.A0v(allMutable, new AnonymousClass1(nodeGeofence));
        allMutable.add(nodeGeofence);
        persist(allMutable);
    }

    private final List<NodeGeofence> getAllMutable() {
        JsonArray jsonArray;
        NodeGeofence nodeGeofenceFromJson;
        String string = this.prefs.getString(KEY_GEOFENCES, null);
        if (string == null) {
            return C3cG.A0h();
        }
        try {
            JsonElement jsonElementA04 = HatchJsonKt.HatchJson.A04(string);
            C9iZ c9iZ = C9oY.A00;
            C7384Etj.A0Y(jsonElementA04, 0);
            if (!(jsonElementA04 instanceof JsonArray) || (jsonArray = (JsonArray) jsonElementA04) == null) {
                C9oY.A09("JsonArray", jsonElementA04);
                throw F60.createAndThrow();
            }
            ArrayList arrayListA0h = C3cG.A0h();
            Iterator<JsonElement> it = jsonArray.iterator();
            while (it.hasNext()) {
                JsonElement jsonElementA11 = C60Q.A11(it);
                JsonObject jsonObject = jsonElementA11 instanceof JsonObject ? (JsonObject) jsonElementA11 : null;
                if (jsonObject != null) {
                    try {
                        nodeGeofenceFromJson = NodeGeofence.Companion.fromJson(jsonObject);
                    } catch (Exception unused) {
                    }
                } else {
                    nodeGeofenceFromJson = null;
                }
                if (nodeGeofenceFromJson != null) {
                    arrayListA0h.add(nodeGeofenceFromJson);
                }
            }
            return new ArrayList(arrayListA0h);
        } catch (Exception unused2) {
            return C3cG.A0h();
        }
    }

    public final void clear() {
        this.prefs.edit().remove(KEY_GEOFENCES).remove(KEY_INSIDE_IDS).apply();
    }

    public final class Companion {
        public final GeofenceStore getInstance(Context context) {
            C7384Etj.A0Y(context, 0);
            GeofenceStore geofenceStore = GeofenceStore.instance;
            if (geofenceStore == null) {
                synchronized (this) {
                    geofenceStore = GeofenceStore.instance;
                    if (geofenceStore == null) {
                        geofenceStore = new GeofenceStore(context);
                        GeofenceStore.instance = geofenceStore;
                    }
                }
            }
            return geofenceStore;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public GeofenceStore(Context context) {
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(PREFS_NAME, 0);
        C7384Etj.A0U(sharedPreferences);
        this.prefs = sharedPreferences;
    }

    private final void persist(List<NodeGeofence> list) {
        C7pd c7pdA01 = C7pd.A01();
        Iterator<NodeGeofence> it = list.iterator();
        while (it.hasNext()) {
            c7pdA01.A06(it.next().toJson());
        }
        this.prefs.edit().putString(KEY_GEOFENCES, C7pd.A00(c7pdA01).toString()).apply();
    }

    public final List<NodeGeofence> getAll() {
        return getAllMutable();
    }

    public /* synthetic */ GeofenceStore(Context context, C06H c06h) {
        this(context);
    }
}
