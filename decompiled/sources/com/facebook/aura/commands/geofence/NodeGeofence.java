package com.facebook.aura.commands.geofence;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C2nw;
import X.C3cH;
import X.C60O;
import X.C60R;
import X.C6tn;
import X.C7384Etj;
import X.C7qW;
import X.C9oY;
import X.HsK;
import com.facebook.aura.commands.geofence.GeofenceTriggerType;
import com.facebook.aura.gateway.service.GeofenceEventWorker;
import com.facebook.aura.nodes.cards.HatchGeofenceCardKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes3.dex */
public final class NodeGeofence extends C06G {
    public static final Companion Companion = new Companion();
    public final String id;
    public final String label;
    public final double latitude;
    public final double longitude;
    public final String notificationLabel;
    public final boolean persistent;
    public final float radiusMeters;
    public final GeofenceTriggerType trigger;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NodeGeofence) {
                NodeGeofence nodeGeofence = (NodeGeofence) obj;
                if (!C7384Etj.areEqual(this.id, nodeGeofence.id) || !C7384Etj.areEqual(this.label, nodeGeofence.label) || Double.compare(this.latitude, nodeGeofence.latitude) != 0 || Double.compare(this.longitude, nodeGeofence.longitude) != 0 || Float.compare(this.radiusMeters, nodeGeofence.radiusMeters) != 0 || this.trigger != nodeGeofence.trigger || this.persistent != nodeGeofence.persistent || !C7384Etj.areEqual(this.notificationLabel, nodeGeofence.notificationLabel)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ NodeGeofence copy$default(NodeGeofence nodeGeofence, String str, String str2, double d, double d2, float f, GeofenceTriggerType geofenceTriggerType, boolean z, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nodeGeofence.id;
        }
        if ((i & 2) != 0) {
            str2 = nodeGeofence.label;
        }
        if ((i & 4) != 0) {
            d = nodeGeofence.latitude;
        }
        if ((i & 8) != 0) {
            d2 = nodeGeofence.longitude;
        }
        if ((i & 16) != 0) {
            f = nodeGeofence.radiusMeters;
        }
        if ((i & 32) != 0) {
            geofenceTriggerType = nodeGeofence.trigger;
        }
        if ((i & 64) != 0) {
            z = nodeGeofence.persistent;
        }
        if ((i & 128) != 0) {
            str3 = nodeGeofence.notificationLabel;
        }
        return nodeGeofence.copy(str, str2, d, d2, f, geofenceTriggerType, z, str3);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.label;
    }

    public final double component3() {
        return this.latitude;
    }

    public final double component4() {
        return this.longitude;
    }

    public final float component5() {
        return this.radiusMeters;
    }

    public final GeofenceTriggerType component6() {
        return this.trigger;
    }

    public final boolean component7() {
        return this.persistent;
    }

    public final String component8() {
        return this.notificationLabel;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLabel() {
        return this.label;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final String getNotificationLabel() {
        return this.notificationLabel;
    }

    public final boolean getPersistent() {
        return this.persistent;
    }

    public final float getRadiusMeters() {
        return this.radiusMeters;
    }

    public final GeofenceTriggerType getTrigger() {
        return this.trigger;
    }

    public int hashCode() {
        return C0KA.A01(AnonymousClass005.A0F(this.trigger, AnonymousClass005.A02((((AnonymousClass005.A0I(this.label, AnonymousClass001.A0G(this.id)) + HsK.A00(this.latitude)) * 31) + HsK.A00(this.longitude)) * 31, this.radiusMeters)), this.persistent) + AnonymousClass006.A0G(this.notificationLabel);
    }

    public final class Companion {
        public final NodeGeofence fromJson(JsonObject jsonObject) {
            String strA04;
            JsonPrimitive jsonPrimitive;
            JsonPrimitive jsonPrimitive2;
            Boolean boolA01;
            JsonPrimitive jsonPrimitive3;
            JsonPrimitive jsonPrimitive4;
            Double dA00;
            JsonPrimitive jsonPrimitive5;
            Double dA002;
            Double dA003;
            JsonPrimitive jsonPrimitive6;
            C7384Etj.A0Y(jsonObject, 0);
            Object obj = jsonObject.get("id");
            String strA042 = null;
            String strA043 = (!(obj instanceof JsonPrimitive) || (jsonPrimitive6 = (JsonPrimitive) obj) == null) ? null : C9oY.A04(jsonPrimitive6);
            if (strA043 == null) {
                strA043 = "";
            }
            String strA0g = C60R.A0g("label", jsonObject);
            Object obj2 = jsonObject.get(GeofenceEventWorker.KEY_LATITUDE);
            JsonPrimitive jsonPrimitive7 = obj2 instanceof JsonPrimitive ? (JsonPrimitive) obj2 : null;
            double dDoubleValue = 0.0d;
            double dDoubleValue2 = (jsonPrimitive7 == null || (dA003 = C6tn.A00(jsonPrimitive7)) == null) ? 0.0d : dA003.doubleValue();
            Object obj3 = jsonObject.get(GeofenceEventWorker.KEY_LONGITUDE);
            double dDoubleValue3 = (!(obj3 instanceof JsonPrimitive) || (jsonPrimitive5 = (JsonPrimitive) obj3) == null || (dA002 = C6tn.A00(jsonPrimitive5)) == null) ? 0.0d : dA002.doubleValue();
            Object obj4 = jsonObject.get("radius_meters");
            if ((obj4 instanceof JsonPrimitive) && (jsonPrimitive4 = (JsonPrimitive) obj4) != null && (dA00 = C6tn.A00(jsonPrimitive4)) != null) {
                dDoubleValue = dA00.doubleValue();
            }
            float f = (float) dDoubleValue;
            GeofenceTriggerType.Companion companion = GeofenceTriggerType.Companion;
            Object obj5 = jsonObject.get("trigger");
            if (!(obj5 instanceof JsonPrimitive) || (jsonPrimitive3 = (JsonPrimitive) obj5) == null || (strA04 = C9oY.A04(jsonPrimitive3)) == null) {
                strA04 = HatchGeofenceCardKt.TRIGGER_ENTER;
            }
            GeofenceTriggerType geofenceTriggerTypeFromWire = companion.fromWire(strA04);
            if (geofenceTriggerTypeFromWire == null) {
                geofenceTriggerTypeFromWire = GeofenceTriggerType.ENTER;
            }
            Object obj6 = jsonObject.get("persistent");
            boolean zBooleanValue = (!(obj6 instanceof JsonPrimitive) || (jsonPrimitive2 = (JsonPrimitive) obj6) == null || (boolA01 = C9oY.A01(jsonPrimitive2)) == null) ? false : boolA01.booleanValue();
            Object obj7 = jsonObject.get("notification_label");
            if ((obj7 instanceof JsonPrimitive) && (jsonPrimitive = (JsonPrimitive) obj7) != null) {
                strA042 = C9oY.A04(jsonPrimitive);
            }
            return new NodeGeofence(strA043, strA0g, dDoubleValue2, dDoubleValue3, f, geofenceTriggerTypeFromWire, zBooleanValue, strA042);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public NodeGeofence(String str, String str2, double d, double d2, float f, GeofenceTriggerType geofenceTriggerType, boolean z, String str3) {
        AnonymousClass003.A0u(str, str2);
        C7384Etj.A0Y(geofenceTriggerType, 5);
        this.id = str;
        this.label = str2;
        this.latitude = d;
        this.longitude = d2;
        this.radiusMeters = f;
        this.trigger = geofenceTriggerType;
        this.persistent = z;
        this.notificationLabel = str3;
    }

    public final NodeGeofence copy(String str, String str2, double d, double d2, float f, GeofenceTriggerType geofenceTriggerType, boolean z, String str3) {
        AnonymousClass003.A0u(str, str2);
        C7384Etj.A0Y(geofenceTriggerType, 5);
        return new NodeGeofence(str, str2, d, d2, f, geofenceTriggerType, z, str3);
    }

    public final JsonObject toJson() {
        C2nw c2nwA1K = C60O.A1K();
        C7qW.A06("id", this.id, c2nwA1K);
        C7qW.A06("label", this.label, c2nwA1K);
        C7qW.A05(Double.valueOf(this.latitude), GeofenceEventWorker.KEY_LATITUDE, c2nwA1K);
        C7qW.A05(Double.valueOf(this.longitude), GeofenceEventWorker.KEY_LONGITUDE, c2nwA1K);
        C7qW.A05(Double.valueOf(this.radiusMeters), "radius_meters", c2nwA1K);
        C7qW.A06("trigger", this.trigger.getWireValue(), c2nwA1K);
        C7qW.A04(Boolean.valueOf(this.persistent), "persistent", c2nwA1K);
        String str = this.notificationLabel;
        if (str != null) {
            C7qW.A06("notification_label", str, c2nwA1K);
        }
        return c2nwA1K.A00();
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ NodeGeofence(String str, String str2, double d, double d2, float f, GeofenceTriggerType geofenceTriggerType, boolean z, String str3, int i, C06H c06h) {
        this(str, str2, d, d2, f, geofenceTriggerType, C3cH.A1M(i, z), (i & 128) != 0 ? null : str3);
    }
}
