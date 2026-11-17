package X;

import com.facebook.aura.analytics.waterfall.HatchPriceImpressionEventDataKt;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;

/* loaded from: classes5.dex */
public abstract class DnN {
    public static String A00(C5691DnY c5691DnY, C6154Dwx[] c6154DwxArr) throws NumberFormatException {
        String string;
        String str;
        if (c6154DwxArr.length != 0) {
            if (AbstractC5655Dmj.A02(c6154DwxArr[0])) {
                double d = 0.0d;
                if (c5691DnY != null) {
                    double d2 = c5691DnY.A00;
                    if (d2 > 0.0d) {
                        d = d2;
                    }
                }
                StringBuilder sbA0w = C60O.A0w();
                StringBuilder sbA0w2 = C60O.A0w();
                for (C6154Dwx c6154Dwx : c6154DwxArr) {
                    Object obj = c6154Dwx.A0V;
                    double d3 = 0.0d;
                    if ((obj instanceof Dl5) && (str = ((Dl5) obj).A06) != null) {
                        try {
                            d3 = Double.parseDouble(str);
                        } catch (NumberFormatException unused) {
                        }
                    }
                    int i = c6154Dwx.A05;
                    if (i > 0) {
                        string = Integer.toString(i);
                    } else {
                        string = Dl5.A00(c6154Dwx).A05;
                        if (string == null || string.isEmpty()) {
                            string = c6154Dwx.A0Y;
                        }
                    }
                    if (d3 > 0.0d && string != null) {
                        if (sbA0w.length() > 0) {
                            sbA0w.append(",");
                        }
                        sbA0w.append(string);
                        sbA0w.append(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
                        sbA0w.append(BV6.A0G(d3, 100.0d) / 100.0d);
                        if (d > 0.0d) {
                            if (sbA0w2.length() > 0) {
                                sbA0w2.append(",");
                            }
                            sbA0w2.append(string);
                            sbA0w2.append(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
                            sbA0w2.append(BV6.A0G((d * 0.82d) + (d3 * 0.079d), 100.0d) / 100.0d);
                        }
                    }
                }
                if (sbA0w.length() != 0) {
                    StringBuilder sbA0x = C60O.A0x("elig:");
                    sbA0x.append((c5691DnY == null || !c5691DnY.A0D) ? HatchPriceImpressionEventDataKt.NO_DISCOUNT : "1");
                    if (d > 0.0d) {
                        sbA0x.append(";umos:");
                        sbA0x.append(BV6.A0G(d, 100.0d) / 100.0d);
                    }
                    sbA0x.append(";paq:");
                    sbA0x.append((CharSequence) sbA0w);
                    if (sbA0w2.length() > 0) {
                        sbA0x.append(";oamos:");
                        sbA0x.append((CharSequence) sbA0w2);
                    }
                    return sbA0x.toString();
                }
            }
        }
        return null;
    }
}
