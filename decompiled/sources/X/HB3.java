package X;

import com.facebook.aura.pairs.PairsAnalyticsKt;

/* loaded from: classes6.dex */
public class HB3 {
    public HB7 A00;
    public HBA A01;

    public final String A00() {
        if (this instanceof C10336HBa) {
            return "radialGradient";
        }
        if (this instanceof C10344HBi) {
            return "linearGradient";
        }
        if (this instanceof HB6) {
            return "stop";
        }
        if (this instanceof HB5) {
            return "solidColor";
        }
        if (this instanceof HBZ) {
            return "textPath";
        }
        if (this instanceof C10352HBq) {
            return "text";
        }
        if (this instanceof C10351HBp) {
            return "tspan";
        }
        if (this instanceof C10346HBk) {
            return "tref";
        }
        if (this instanceof HBW) {
            return "mask";
        }
        if (this instanceof HC0) {
            return "view";
        }
        if (this instanceof C10360HBz) {
            return "symbol";
        }
        if (this instanceof C10343HBh) {
            return "svg";
        }
        if (this instanceof HBR) {
            return "pattern";
        }
        if (this instanceof HBV) {
            return "marker";
        }
        if (this instanceof HBX) {
            return "image";
        }
        if (!(this instanceof C10349HBn)) {
            return this instanceof C10338HBc ? "rect" : this instanceof HBt ? ((HBt) this) instanceof HC4 ? "polygon" : "polyline" : this instanceof C10354HBs ? "path" : this instanceof C10342HBg ? "line" : this instanceof C10341HBf ? "ellipse" : this instanceof C10347HBl ? "circle" : "";
        }
        C10349HBn c10349HBn = (C10349HBn) this;
        return c10349HBn instanceof C10337HBb ? "use" : c10349HBn instanceof HC5 ? "switch" : c10349HBn instanceof C10357HBw ? "defs" : c10349HBn instanceof C10350HBo ? "clipPath" : PairsAnalyticsKt.CONNECTION_TYPE_GROUP;
    }
}
