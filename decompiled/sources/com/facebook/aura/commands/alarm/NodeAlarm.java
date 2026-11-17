package com.facebook.aura.commands.alarm;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C2nw;
import X.C60O;
import X.C60Q;
import X.C60R;
import X.C7384Etj;
import X.C7qW;
import X.C9oY;
import com.facebook.aura.commands.alarm.AlarmType;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes3.dex */
public final class NodeAlarm extends C06G {
    public static final Companion Companion = new Companion();
    public final String days;
    public final int hour;
    public final String id;
    public final String label;
    public final int minute;
    public final long triggerTimeMs;
    public final AlarmType type;
    public final boolean vibrate;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NodeAlarm) {
                NodeAlarm nodeAlarm = (NodeAlarm) obj;
                if (!C7384Etj.areEqual(this.id, nodeAlarm.id) || !C7384Etj.areEqual(this.label, nodeAlarm.label) || this.hour != nodeAlarm.hour || this.minute != nodeAlarm.minute || this.triggerTimeMs != nodeAlarm.triggerTimeMs || !C7384Etj.areEqual(this.days, nodeAlarm.days) || this.vibrate != nodeAlarm.vibrate || this.type != nodeAlarm.type) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ NodeAlarm copy$default(NodeAlarm nodeAlarm, String str, String str2, int i, int i2, long j, String str3, boolean z, AlarmType alarmType, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = nodeAlarm.id;
        }
        if ((i3 & 2) != 0) {
            str2 = nodeAlarm.label;
        }
        if ((i3 & 4) != 0) {
            i = nodeAlarm.hour;
        }
        if ((i3 & 8) != 0) {
            i2 = nodeAlarm.minute;
        }
        if ((i3 & 16) != 0) {
            j = nodeAlarm.triggerTimeMs;
        }
        if ((i3 & 32) != 0) {
            str3 = nodeAlarm.days;
        }
        if ((i3 & 64) != 0) {
            z = nodeAlarm.vibrate;
        }
        if ((i3 & 128) != 0) {
            alarmType = nodeAlarm.type;
        }
        return nodeAlarm.copy(str, str2, i, i2, j, str3, z, alarmType);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.label;
    }

    public final int component3() {
        return this.hour;
    }

    public final int component4() {
        return this.minute;
    }

    public final long component5() {
        return this.triggerTimeMs;
    }

    public final String component6() {
        return this.days;
    }

    public final boolean component7() {
        return this.vibrate;
    }

    public final AlarmType component8() {
        return this.type;
    }

    public final String getDays() {
        return this.days;
    }

    public final int getHour() {
        return this.hour;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLabel() {
        return this.label;
    }

    public final int getMinute() {
        return this.minute;
    }

    public final long getTriggerTimeMs() {
        return this.triggerTimeMs;
    }

    public final AlarmType getType() {
        return this.type;
    }

    public final boolean getVibrate() {
        return this.vibrate;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.type, C0KA.A01(AnonymousClass005.A0I(this.days, C60R.A00(this.triggerTimeMs, (((AnonymousClass005.A0I(this.label, AnonymousClass001.A0G(this.id)) + this.hour) * 31) + this.minute) * 31)), this.vibrate));
    }

    public final boolean isRecurring() {
        return AnonymousClass002.A1N(this.days.length());
    }

    public final class Companion {
        public final NodeAlarm fromJson(JsonObject jsonObject) {
            String strA04;
            JsonPrimitive jsonPrimitive;
            JsonPrimitive jsonPrimitive2;
            Boolean boolA01;
            JsonPrimitive jsonPrimitive3;
            Long lA03;
            JsonPrimitive jsonPrimitive4;
            Integer numA02;
            Integer numA022;
            JsonPrimitive jsonPrimitive5;
            JsonPrimitive jsonPrimitive6;
            C7384Etj.A0Y(jsonObject, 0);
            Object obj = jsonObject.get("id");
            String strA042 = null;
            String strA043 = (!(obj instanceof JsonPrimitive) || (jsonPrimitive6 = (JsonPrimitive) obj) == null) ? null : C9oY.A04(jsonPrimitive6);
            if (strA043 == null) {
                strA043 = "";
            }
            Object obj2 = jsonObject.get("label");
            if (!(obj2 instanceof JsonPrimitive) || (jsonPrimitive5 = (JsonPrimitive) obj2) == null || (strA04 = C9oY.A04(jsonPrimitive5)) == null) {
                strA04 = "";
            }
            Object obj3 = jsonObject.get("hour");
            JsonPrimitive jsonPrimitive7 = obj3 instanceof JsonPrimitive ? (JsonPrimitive) obj3 : null;
            int iIntValue = 0;
            int iIntValue2 = (jsonPrimitive7 == null || (numA022 = C9oY.A02(jsonPrimitive7)) == null) ? 0 : numA022.intValue();
            Object obj4 = jsonObject.get("minute");
            if ((obj4 instanceof JsonPrimitive) && (jsonPrimitive4 = (JsonPrimitive) obj4) != null && (numA02 = C9oY.A02(jsonPrimitive4)) != null) {
                iIntValue = numA02.intValue();
            }
            Object obj5 = jsonObject.get("trigger_time_ms");
            long jLongValue = (!(obj5 instanceof JsonPrimitive) || (jsonPrimitive3 = (JsonPrimitive) obj5) == null || (lA03 = C9oY.A03(jsonPrimitive3)) == null) ? 0L : lA03.longValue();
            String strA0g = C60R.A0g("days", jsonObject);
            Object obj6 = jsonObject.get("vibrate");
            boolean zBooleanValue = (!(obj6 instanceof JsonPrimitive) || (jsonPrimitive2 = (JsonPrimitive) obj6) == null || (boolA01 = C9oY.A01(jsonPrimitive2)) == null) ? true : boolA01.booleanValue();
            AlarmType.Companion companion = AlarmType.Companion;
            Object obj7 = jsonObject.get("type");
            if ((obj7 instanceof JsonPrimitive) && (jsonPrimitive = (JsonPrimitive) obj7) != null) {
                strA042 = C9oY.A04(jsonPrimitive);
            }
            return new NodeAlarm(strA043, strA04, iIntValue2, iIntValue, jLongValue, strA0g, zBooleanValue, companion.fromWire(strA042));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public NodeAlarm(String str, String str2, int i, int i2, long j, String str3, boolean z, AlarmType alarmType) {
        AnonymousClass003.A0u(str, str2);
        C60O.A1M(str3, 5, alarmType);
        this.id = str;
        this.label = str2;
        this.hour = i;
        this.minute = i2;
        this.triggerTimeMs = j;
        this.days = str3;
        this.vibrate = z;
        this.type = alarmType;
    }

    public final NodeAlarm copy(String str, String str2, int i, int i2, long j, String str3, boolean z, AlarmType alarmType) {
        AnonymousClass003.A0u(str, str2);
        C60O.A1M(str3, 5, alarmType);
        return new NodeAlarm(str, str2, i, i2, j, str3, z, alarmType);
    }

    public final JsonObject toJson() {
        C2nw c2nwA1K = C60O.A1K();
        C7qW.A06("id", this.id, c2nwA1K);
        C7qW.A06("label", this.label, c2nwA1K);
        C7qW.A05(Integer.valueOf(this.hour), "hour", c2nwA1K);
        C7qW.A05(Integer.valueOf(this.minute), "minute", c2nwA1K);
        C7qW.A05(Long.valueOf(this.triggerTimeMs), "trigger_time_ms", c2nwA1K);
        C7qW.A06("days", this.days, c2nwA1K);
        C7qW.A04(Boolean.valueOf(this.vibrate), "vibrate", c2nwA1K);
        return C7qW.A01("type", this.type.name(), c2nwA1K);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ NodeAlarm(String str, String str2, int i, int i2, long j, String str3, boolean z, AlarmType alarmType, int i3, C06H c06h) {
        this(str, str2, i, i2, j, (i3 & 32) != 0 ? "" : str3, C60Q.A1Q(i3 & 64, z), (i3 & 128) != 0 ? AlarmType.ALARM : alarmType);
    }
}
