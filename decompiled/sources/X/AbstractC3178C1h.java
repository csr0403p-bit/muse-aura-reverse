package X;

/* renamed from: X.C1h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3178C1h extends Enum<AbstractC3178C1h> {
    public final String stringValue;

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "unplugged_battery_state";
            case 2:
                return "charging_battery_state";
            case 3:
                return "full_battery_state";
            case 4:
                return "not_charging_battery_state";
            default:
                return "unknown_battery_state";
        }
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "UNPLUGGED";
            case 2:
                return "CHARGING";
            case 3:
                return "FULL";
            case 4:
                return "NOT_CHARGING";
            default:
                return "UNKNOWN";
        }
    }
}
