package X;

import com.facebook.aura.gateway.parser.HatchWidgetTokenParser;

/* renamed from: X.BpP, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C2938BpP<V> extends AbstractC2937BpO<V> {
    public final Throwable A00;

    public C2938BpP(Throwable th) {
        this.A00 = th;
    }

    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(super.toString());
        sbA0w.append("[status=FAILURE, cause=[");
        sbA0w.append(this.A00);
        return AnonymousClass001.A0v(HatchWidgetTokenParser.HATCH_WIDGET_TOKEN_SUFFIX, sbA0w);
    }
}
