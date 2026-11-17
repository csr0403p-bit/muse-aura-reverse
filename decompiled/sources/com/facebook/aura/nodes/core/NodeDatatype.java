package com.facebook.aura.nodes.core;

import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.Ey9;
import com.facebook.aura.nodes.cards.HatchNodeCardJsonKt;
import com.facebook.aura.shopping.repo.MarketplaceDetailsNormalizationKt;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class NodeDatatype {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ NodeDatatype[] $VALUES;
    public static final NodeDatatype BATTERY;
    public static final NodeDatatype CALENDAR;
    public static final NodeDatatype CALL_LOG;
    public static final NodeDatatype CONTACTS;
    public static final Companion Companion;
    public static final NodeDatatype HEALTH;
    public static final NodeDatatype LOCATION;
    public static final NodeDatatype NETWORK;
    public static final NodeDatatype NOTIFICATIONS;
    public static final NodeDatatype PHOTOS;
    public static final NodeDatatype SMS;
    public final String wireValue;

    static {
        NodeDatatype nodeDatatype = new NodeDatatype("CONTACTS", 0, HatchNodeCardJsonKt.TYPE_CONTACTS);
        CONTACTS = nodeDatatype;
        NodeDatatype nodeDatatype2 = new NodeDatatype("CALENDAR", 1, "calendar");
        CALENDAR = nodeDatatype2;
        NodeDatatype nodeDatatype3 = new NodeDatatype("LOCATION", 2, MarketplaceDetailsNormalizationKt.LOCATION_VARIANT_LABEL);
        LOCATION = nodeDatatype3;
        NodeDatatype nodeDatatype4 = new NodeDatatype("NOTIFICATIONS", 3, "notifications");
        NOTIFICATIONS = nodeDatatype4;
        NodeDatatype nodeDatatype5 = new NodeDatatype("PHOTOS", 4, "photos");
        PHOTOS = nodeDatatype5;
        NodeDatatype nodeDatatype6 = new NodeDatatype("NETWORK", 5, "network");
        NETWORK = nodeDatatype6;
        NodeDatatype nodeDatatype7 = new NodeDatatype("SMS", 6, "sms");
        SMS = nodeDatatype7;
        NodeDatatype nodeDatatype8 = new NodeDatatype("CALL_LOG", 7, "call_log");
        CALL_LOG = nodeDatatype8;
        NodeDatatype nodeDatatype9 = new NodeDatatype("BATTERY", 8, "battery");
        BATTERY = nodeDatatype9;
        NodeDatatype nodeDatatype10 = new NodeDatatype("HEALTH", 9, "health");
        HEALTH = nodeDatatype10;
        NodeDatatype[] nodeDatatypeArr = {nodeDatatype, nodeDatatype2, nodeDatatype3, nodeDatatype4, nodeDatatype5, nodeDatatype6, nodeDatatype7, nodeDatatype8, nodeDatatype9, nodeDatatype10};
        $VALUES = nodeDatatypeArr;
        $ENTRIES = C3cG.A0w(nodeDatatypeArr);
        Companion = new Companion();
    }

    public static Ey9<NodeDatatype> getEntries() {
        return $ENTRIES;
    }

    public static NodeDatatype valueOf(String str) {
        return (NodeDatatype) Enum.valueOf(NodeDatatype.class, str);
    }

    public static NodeDatatype[] values() {
        return (NodeDatatype[]) $VALUES.clone();
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public final class Companion {
        public final NodeDatatype fromWire(String str) {
            NodeDatatype next;
            C7384Etj.A0Y(str, 0);
            Iterator<NodeDatatype> it = NodeDatatype.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (str.equals(next.getWireValue())) {
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

    public NodeDatatype(String str, int i, String str2) {
        this.wireValue = str2;
    }
}
