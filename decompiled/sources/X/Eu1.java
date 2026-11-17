package X;

import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public interface Eu1<T> {
    void A3P(String str, Boolean bool);

    void A3U(Double d, String str);

    void A3V(InterfaceC2571Be0 interfaceC2571Be0, String str);

    void A3b(String str, Integer num);

    void A3f(String str, Long l);

    void A3g(String str, Map map);

    void A3y(String str, String str2);

    void A3z(AbstractC8150FWo abstractC8150FWo, String str);

    void A42(String str, List list);

    void APu();

    boolean isSampled();

    static void A00(Eu1 eu1) {
        eu1.A3V(EnumC7397Eua.ANDROID, "platform");
        eu1.A3f("actual_event_time", Long.valueOf(System.currentTimeMillis()));
    }

    static void A01(Eu1 eu1, AbstractC8150FWo abstractC8150FWo) {
        eu1.A3z(abstractC8150FWo, "event_payload");
    }
}
