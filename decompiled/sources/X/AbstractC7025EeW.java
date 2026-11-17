package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.EeW, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7025EeW<T> extends AbstractRunnableC7002Ee4<T> {
    public static final String __redex_internal_original_name = "StatefulProducerRunnable";
    public final InterfaceC7028EeZ<T> A00;
    public final InterfaceC7029Eea A01;
    public final InterfaceC7027EeY A02;
    public final String A03;

    @Override // X.AbstractRunnableC7002Ee4
    public void A02(Exception exc) {
        C7384Etj.A0Y(exc, 0);
        InterfaceC7027EeY interfaceC7027EeY = this.A02;
        InterfaceC7029Eea interfaceC7029Eea = this.A01;
        String str = this.A03;
        interfaceC7027EeY.AbE(interfaceC7029Eea, str);
        interfaceC7027EeY.AV2(interfaceC7029Eea, str, exc, null);
        this.A00.onFailure(exc);
    }

    @Override // X.AbstractRunnableC7002Ee4
    public void A01() {
        InterfaceC7027EeY interfaceC7027EeY = this.A02;
        InterfaceC7029Eea interfaceC7029Eea = this.A01;
        String str = this.A03;
        interfaceC7027EeY.AbE(interfaceC7029Eea, str);
        interfaceC7027EeY.AV0(interfaceC7029Eea, str, null);
        this.A00.AS7();
    }

    @Override // X.AbstractRunnableC7002Ee4
    public void A04(T t) {
        Map<String, String> mapUnmodifiableMap;
        String string;
        InterfaceC7027EeY interfaceC7027EeY = this.A02;
        InterfaceC7029Eea interfaceC7029Eea = this.A01;
        String str = this.A03;
        if (interfaceC7027EeY.AbE(interfaceC7029Eea, str)) {
            if ((this instanceof C7030Eeb) || (this instanceof Eec)) {
                string = String.valueOf(AnonymousClass002.A1X(t));
            } else {
                if (this instanceof C6983Edj) {
                    string = Boolean.toString(AnonymousClass002.A1X(t));
                }
                mapUnmodifiableMap = null;
            }
            HashMap mapA0v = BV4.A0v(1);
            mapA0v.put("createdThumbnail", string);
            mapUnmodifiableMap = Collections.unmodifiableMap(mapA0v);
        } else {
            mapUnmodifiableMap = null;
        }
        interfaceC7027EeY.AV4(interfaceC7029Eea, str, mapUnmodifiableMap);
        this.A00.AUL(t, 1);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/EeZ<TT;>;LX/EeY;LX/Eea;Ljava/lang/String;)V */
    public AbstractC7025EeW(InterfaceC7028EeZ interfaceC7028EeZ, InterfaceC7029Eea interfaceC7029Eea, InterfaceC7027EeY interfaceC7027EeY, String str) {
        AnonymousClass005.A0y(interfaceC7028EeZ, interfaceC7027EeY, str);
        this.A00 = interfaceC7028EeZ;
        this.A02 = interfaceC7027EeY;
        this.A01 = interfaceC7029Eea;
        this.A03 = str;
        interfaceC7027EeY.AV6(interfaceC7029Eea, str);
    }
}
