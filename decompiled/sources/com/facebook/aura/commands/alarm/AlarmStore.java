package com.facebook.aura.commands.alarm;

import X.AbstractC0882AGj;
import X.AbstractC7559F3s;
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
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public final class AlarmStore {
    public static final Companion Companion = new Companion();
    public static final String KEY_ALARMS = "alarms";
    public static final String PREFS_NAME = "hatch_alarms";
    public static volatile AlarmStore instance;
    public final SharedPreferences prefs;

    /* renamed from: com.facebook.aura.commands.alarm.AlarmStore$save$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<NodeAlarm, Boolean> {
        public final /* synthetic */ NodeAlarm $alarm;

        @Override // X.G0U
        public final Boolean invoke(NodeAlarm nodeAlarm) {
            C7384Etj.A0Y(nodeAlarm, 0);
            return C60O.A0h(nodeAlarm.id, this.$alarm.id);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(NodeAlarm nodeAlarm) {
            super(1);
            this.$alarm = nodeAlarm;
        }
    }

    public final NodeAlarm findById(String str) {
        NodeAlarm next;
        C7384Etj.A0Y(str, 0);
        Iterator<NodeAlarm> it = getAllMutable().iterator();
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

    public final NodeAlarm findByLabel(String str) {
        NodeAlarm next;
        C7384Etj.A0Y(str, 0);
        Iterator<NodeAlarm> it = getAllMutable().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            String str2 = next.label;
            if (str2 != null && str2.equalsIgnoreCase(str)) {
                break;
            }
        }
        return next;
    }

    public final boolean remove(String str) {
        C7384Etj.A0Y(str, 0);
        List<NodeAlarm> allMutable = getAllMutable();
        boolean zA0v = AbstractC0882AGj.A0v(allMutable, new AlarmStore$remove$removed$1(str));
        if (zA0v) {
            persist(allMutable);
        }
        return zA0v;
    }

    public final void save(NodeAlarm nodeAlarm) {
        C7384Etj.A0Y(nodeAlarm, 0);
        List<NodeAlarm> allMutable = getAllMutable();
        AbstractC0882AGj.A0v(allMutable, new AnonymousClass1(nodeAlarm));
        allMutable.add(nodeAlarm);
        persist(allMutable);
    }

    private final List<NodeAlarm> getAllMutable() {
        JsonArray jsonArray;
        NodeAlarm nodeAlarmFromJson;
        String string = this.prefs.getString("alarms", null);
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
                        nodeAlarmFromJson = NodeAlarm.Companion.fromJson(jsonObject);
                    } catch (Exception unused) {
                    }
                } else {
                    nodeAlarmFromJson = null;
                }
                if (nodeAlarmFromJson != null) {
                    arrayListA0h.add(nodeAlarmFromJson);
                }
            }
            return new ArrayList(arrayListA0h);
        } catch (Exception unused2) {
            return C3cG.A0h();
        }
    }

    public final void clear() {
        this.prefs.edit().remove("alarms").apply();
    }

    public final class Companion {
        public final AlarmStore getInstance(Context context) {
            C7384Etj.A0Y(context, 0);
            AlarmStore alarmStore = AlarmStore.instance;
            if (alarmStore == null) {
                synchronized (this) {
                    alarmStore = AlarmStore.instance;
                    if (alarmStore == null) {
                        alarmStore = new AlarmStore(context);
                        AlarmStore.instance = alarmStore;
                    }
                }
            }
            return alarmStore;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public AlarmStore(Context context) {
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(PREFS_NAME, 0);
        C7384Etj.A0U(sharedPreferences);
        this.prefs = sharedPreferences;
    }

    private final void persist(List<NodeAlarm> list) {
        C7pd c7pdA01 = C7pd.A01();
        Iterator<NodeAlarm> it = list.iterator();
        while (it.hasNext()) {
            c7pdA01.A06(it.next().toJson());
        }
        this.prefs.edit().putString("alarms", C7pd.A00(c7pdA01).toString()).apply();
    }

    public final List<NodeAlarm> getAll() {
        return getAllMutable();
    }

    public /* synthetic */ AlarmStore(Context context, C06H c06h) {
        this(context);
    }
}
