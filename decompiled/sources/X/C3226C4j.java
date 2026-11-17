package X;

import com.facebook.errorreporting.field.ReportFieldBase;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.C4j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3226C4j implements InterfaceC3231C4o {
    public static C3226C4j A03;
    public static final Map<String, ReportFieldBase> A04 = BV5.A14();
    public final Object A00 = C3cG.A0T();
    public final Map<String, String> A02 = BV4.A0u();
    public final Map A01 = BV4.A0u();

    public static void A00(ReportFieldBase reportFieldBase) {
        A04.put(reportFieldBase.name, reportFieldBase);
    }

    public final void A01(String str, String str2) {
        synchronized (this.A00) {
            if (A04.containsKey(str)) {
                this.A02.put(str, str2);
            }
        }
    }

    @Override // X.InterfaceC3231C4o
    public final Integer AHt() {
        return C79.A07;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC3231C4o
    public final void AY4(C3228C4l c3228C4l, EnumC3223C4g enumC3223C4g) {
        HashMap mapA0w;
        HashMap mapA0w2;
        Throwable th = c3228C4l.A00;
        if (th != null) {
            Object obj = this.A00;
            synchronized (obj) {
                mapA0w2 = BV4.A0w(this.A01);
            }
            Iterator itA0i = C3cG.A0i(mapA0w2);
            while (itA0i.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(itA0i);
                String strA0t = C60O.A0t(entryA0l);
                try {
                    String str = (String) C51.A01().submit(new CallableC7568F4h(entryA0l, th, strA0t, 2)).get(750L, TimeUnit.MILLISECONDS);
                    if (str == null) {
                        synchronized (obj) {
                            this.A02.remove(strA0t);
                        }
                    } else {
                        A01(strA0t, str);
                    }
                } catch (Exception e) {
                    C2Q.A00().AT9("CustomPropLazySupplier", e, null);
                    A01(FGI.A0M(strA0t, "_error"), "timeout");
                }
            }
        }
        synchronized (this.A00) {
            mapA0w = BV4.A0w(this.A02);
        }
        Iterator itA0i2 = C3cG.A0i(mapA0w);
        while (itA0i2.hasNext()) {
            Map.Entry entryA0l2 = C3cH.A0l(itA0i2);
            Object key = entryA0l2.getKey();
            Object value = entryA0l2.getValue();
            Map<String, String> map = c3228C4l.A03;
            if (value == null) {
                value = "unknown";
            }
            map.put(key, value);
        }
    }
}
