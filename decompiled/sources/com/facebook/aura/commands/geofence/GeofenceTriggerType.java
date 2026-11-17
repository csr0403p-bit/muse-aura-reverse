package com.facebook.aura.commands.geofence;

import X.AnonymousClass001;
import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.Ey9;
import com.facebook.aura.nodes.cards.HatchGeofenceCardKt;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class GeofenceTriggerType {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ GeofenceTriggerType[] $VALUES;
    public static final Companion Companion;
    public static final GeofenceTriggerType ENTER;
    public static final GeofenceTriggerType ENTER_OR_EXIT;
    public static final GeofenceTriggerType EXIT;
    public final String wireValue;

    static {
        GeofenceTriggerType geofenceTriggerType = new GeofenceTriggerType("ENTER", 0, HatchGeofenceCardKt.TRIGGER_ENTER);
        ENTER = geofenceTriggerType;
        GeofenceTriggerType geofenceTriggerType2 = new GeofenceTriggerType("EXIT", 1, HatchGeofenceCardKt.TRIGGER_EXIT);
        EXIT = geofenceTriggerType2;
        GeofenceTriggerType geofenceTriggerType3 = new GeofenceTriggerType("ENTER_OR_EXIT", 2, "enter_or_exit");
        ENTER_OR_EXIT = geofenceTriggerType3;
        GeofenceTriggerType[] geofenceTriggerTypeArr = {geofenceTriggerType, geofenceTriggerType2, geofenceTriggerType3};
        $VALUES = geofenceTriggerTypeArr;
        $ENTRIES = C3cG.A0w(geofenceTriggerTypeArr);
        Companion = new Companion();
    }

    public static Ey9<GeofenceTriggerType> getEntries() {
        return $ENTRIES;
    }

    public static GeofenceTriggerType valueOf(String str) {
        return (GeofenceTriggerType) Enum.valueOf(GeofenceTriggerType.class, str);
    }

    public static GeofenceTriggerType[] values() {
        return (GeofenceTriggerType[]) $VALUES.clone();
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public final class Companion {
        public final GeofenceTriggerType fromWire(String str) {
            GeofenceTriggerType next;
            C7384Etj.A0Y(str, 0);
            Iterator<GeofenceTriggerType> it = GeofenceTriggerType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (AnonymousClass001.A0u(str).equals(next.getWireValue())) {
                    break;
                }
            }
            return next;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public GeofenceTriggerType(String str, int i, String str2) {
        this.wireValue = str2;
    }
}
