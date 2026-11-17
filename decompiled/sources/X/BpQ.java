package X;

import com.facebook.aura.gateway.parser.HatchWidgetTokenParser;

/* loaded from: classes5.dex */
public final class BpQ<V> extends AbstractC2937BpO<V> {
    public static final AbstractC2937BpO<Object> A01 = new BpQ(null);
    public final V A00;

    public BpQ(V v) {
        this.A00 = v;
    }

    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(super.toString());
        sbA0w.append("[status=SUCCESS, result=[");
        sbA0w.append(this.A00);
        return AnonymousClass001.A0v(HatchWidgetTokenParser.HATCH_WIDGET_TOKEN_SUFFIX, sbA0w);
    }
}
