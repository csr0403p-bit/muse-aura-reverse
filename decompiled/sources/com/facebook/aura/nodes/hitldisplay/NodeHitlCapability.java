package com.facebook.aura.nodes.hitldisplay;

import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.C06H;
import X.C3cG;
import X.C60Q;
import X.Ey9;
import com.facebook.aura.R;
import com.facebook.aura.nodes.core.NodeHitlGroup;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class NodeHitlCapability {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ NodeHitlCapability[] $VALUES;
    public static final NodeHitlCapability CALENDAR;
    public static final NodeHitlCapability CALL_HISTORY;
    public static final NodeHitlCapability CONTACTS;
    public static final Companion Companion;
    public static final NodeHitlCapability HEALTH;
    public static final NodeHitlCapability MESSAGES;
    public static final NodeHitlCapability NOTIFICATIONS;
    public static final NodeHitlCapability PHONE;
    public static final NodeHitlCapability PHOTOS;
    public final int displayTitleRes;
    public final int iconRes;

    public final class Companion {

        public abstract /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[NodeHitlGroup.values().length];
                try {
                    AnonymousClass002.A13(NodeHitlGroup.CALENDAR, iArr);
                } catch (NoSuchFieldError unused) {
                }
                try {
                    AnonymousClass002.A14(NodeHitlGroup.REMINDERS, iArr);
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    AnonymousClass002.A15(NodeHitlGroup.CONTACTS, iArr);
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    AnonymousClass002.A16(NodeHitlGroup.SMS, iArr);
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    AnonymousClass002.A17(NodeHitlGroup.SMS_SEND, iArr);
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    AnonymousClass002.A18(NodeHitlGroup.PHONE_CALL, iArr);
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    AnonymousClass006.A1G(NodeHitlGroup.NOTIFICATIONS, iArr);
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    AnonymousClass006.A1H(NodeHitlGroup.CALL_LOG, iArr);
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    AnonymousClass006.A1I(NodeHitlGroup.HEALTH, iArr);
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    AnonymousClass006.A1J(NodeHitlGroup.PHOTOS, iArr);
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    AnonymousClass006.A1K(NodeHitlGroup.ALARMS, iArr);
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    AnonymousClass006.A1L(NodeHitlGroup.APPS, iArr);
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    C60Q.A1C(NodeHitlGroup.BATTERY, iArr);
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    C60Q.A1D(NodeHitlGroup.BROWSER, iArr);
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    C60Q.A1E(NodeHitlGroup.BUG_REPORT, iArr);
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[NodeHitlGroup.DISPLAY.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[NodeHitlGroup.DO_NOT_DISTURB.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[NodeHitlGroup.LOCATION.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[NodeHitlGroup.NAVIGATION.ordinal()] = 19;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr[NodeHitlGroup.NETWORK.ordinal()] = 20;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr[NodeHitlGroup.SUBSCRIPTIONS.ordinal()] = 21;
                } catch (NoSuchFieldError unused21) {
                }
                try {
                    iArr[NodeHitlGroup.OTHER.ordinal()] = 22;
                } catch (NoSuchFieldError unused22) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public final NodeHitlCapability forGroup(NodeHitlGroup nodeHitlGroup) {
            switch (AnonymousClass003.A0L(nodeHitlGroup)) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 8:
                case 9:
                case 11:
                case 12:
                case 13:
                case 20:
                case 21:
                    return null;
                case 5:
                case 17:
                    return NodeHitlCapability.CALENDAR;
                case 6:
                    return NodeHitlCapability.CALL_HISTORY;
                case 7:
                    return NodeHitlCapability.CONTACTS;
                case 10:
                    return NodeHitlCapability.HEALTH;
                case 14:
                    return NodeHitlCapability.NOTIFICATIONS;
                case 15:
                    return NodeHitlCapability.PHONE;
                case 16:
                    return NodeHitlCapability.PHOTOS;
                case 18:
                case 19:
                    return NodeHitlCapability.MESSAGES;
                default:
                    throw C3cG.A0q();
            }
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static Ey9<NodeHitlCapability> getEntries() {
        return $ENTRIES;
    }

    public static NodeHitlCapability valueOf(String str) {
        return (NodeHitlCapability) Enum.valueOf(NodeHitlCapability.class, str);
    }

    public static NodeHitlCapability[] values() {
        return (NodeHitlCapability[]) $VALUES.clone();
    }

    public final int getDisplayTitleRes() {
        return this.displayTitleRes;
    }

    public final int getIconRes() {
        return this.iconRes;
    }

    static {
        NodeHitlCapability nodeHitlCapability = new NodeHitlCapability("CALENDAR", 0, R.drawable.hatch_connector_logos_connectorgenericcal, R.string._name_removed__res_0x7f120b6e);
        CALENDAR = nodeHitlCapability;
        NodeHitlCapability nodeHitlCapability2 = new NodeHitlCapability("CONTACTS", 1, R.drawable.hatch_connector_logos_connectorgeneric, R.string._name_removed__res_0x7f120b70);
        CONTACTS = nodeHitlCapability2;
        NodeHitlCapability nodeHitlCapability3 = new NodeHitlCapability("MESSAGES", 2, R.drawable.hatch_connector_logos_connectorgenericchat, R.string._name_removed__res_0x7f120b72);
        MESSAGES = nodeHitlCapability3;
        NodeHitlCapability nodeHitlCapability4 = new NodeHitlCapability("PHONE", 3, R.drawable.hatch_connector_logos_connectorgenericphone, R.string._name_removed__res_0x7f120b74);
        PHONE = nodeHitlCapability4;
        NodeHitlCapability nodeHitlCapability5 = new NodeHitlCapability("NOTIFICATIONS", 4, R.drawable.hatch_connector_logos_connectorgenericnotifs, R.string._name_removed__res_0x7f120b73);
        NOTIFICATIONS = nodeHitlCapability5;
        NodeHitlCapability nodeHitlCapability6 = new NodeHitlCapability("CALL_HISTORY", 5, R.drawable.hatch_connector_logos_connectorgenericphone, R.string._name_removed__res_0x7f120b6f);
        CALL_HISTORY = nodeHitlCapability6;
        NodeHitlCapability nodeHitlCapability7 = new NodeHitlCapability("HEALTH", 6, R.drawable.health_connect_icon, R.string._name_removed__res_0x7f120b71);
        HEALTH = nodeHitlCapability7;
        NodeHitlCapability nodeHitlCapability8 = new NodeHitlCapability("PHOTOS", 7, R.drawable.hatch_connector_logos_connectorgeneric, R.string._name_removed__res_0x7f120b75);
        PHOTOS = nodeHitlCapability8;
        NodeHitlCapability[] nodeHitlCapabilityArr = {nodeHitlCapability, nodeHitlCapability2, nodeHitlCapability3, nodeHitlCapability4, nodeHitlCapability5, nodeHitlCapability6, nodeHitlCapability7, nodeHitlCapability8};
        $VALUES = nodeHitlCapabilityArr;
        $ENTRIES = C3cG.A0w(nodeHitlCapabilityArr);
        Companion = new Companion();
    }

    public NodeHitlCapability(String str, int i, int i2, int i3) {
        this.iconRes = i2;
        this.displayTitleRes = i3;
    }
}
