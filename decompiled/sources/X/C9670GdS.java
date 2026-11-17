package X;

import com.fasterxml.jackson.databind.JsonSerializer;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.GdS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9670GdS {
    public final AtomicReference<C9672GdU> A01 = new AtomicReference<>();
    public final InterfaceC9510GMb<C9669GdR, JsonSerializer<Object>> A00 = new GQ5(Math.min(64, 1000), 4000);

    public final JsonSerializer<Object> A00(AbstractC9870GjI abstractC9870GjI) {
        JsonSerializer<Object> jsonSerializer;
        synchronized (this) {
            InterfaceC9510GMb<C9669GdR, JsonSerializer<Object>> interfaceC9510GMb = this.A00;
            jsonSerializer = (JsonSerializer) ((GQ5) interfaceC9510GMb).A00.get(new C9669GdR(abstractC9870GjI, false));
        }
        return jsonSerializer;
    }

    public final JsonSerializer<Object> A01(Class<?> cls) {
        JsonSerializer<Object> jsonSerializer;
        synchronized (this) {
            InterfaceC9510GMb<C9669GdR, JsonSerializer<Object>> interfaceC9510GMb = this.A00;
            jsonSerializer = (JsonSerializer) ((GQ5) interfaceC9510GMb).A00.get(new C9669GdR(cls, false));
        }
        return jsonSerializer;
    }
}
