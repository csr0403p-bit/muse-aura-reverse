package X;

import android.os.SystemClock;
import com.facebook.quicklog.EventBuilder;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public final class C9P implements InterfaceC3234C4r {
    public static final Random A04 = new Random();
    public long A00;
    public String A01;
    public final LightweightQuickPerformanceLogger A02;
    public final AtomicInteger A03 = BV5.A17();

    @Override // X.InterfaceC3234C4r
    public final void AUV(int i, Map<String, String> map) {
        if (i != -1) {
            String str = this.A01;
            if (str != null) {
                this.A02.markerAnnotate(21373447, i, "ASLSessionId", str);
            }
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    this.A02.markerAnnotate(21373447, i, entry.getKey(), entry.getValue());
                }
            }
            this.A02.markerEnd(21373447, i, (short) 2);
        }
    }

    @Override // X.InterfaceC3234C4r
    public final void AUY(int i, String str, Map<String, String> map) {
        if (i != -1) {
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    this.A02.markerAnnotate(21373447, i, entry.getKey(), entry.getValue());
                }
            }
            this.A02.markerPoint(21373447, i, str);
        }
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;Lcom/facebook/quicklog/EventBuilder;)V */
    private void A00(EventBuilder eventBuilder, Map map) {
        String str = this.A01;
        if (str != null) {
            eventBuilder.annotate("ASLSessionId", str);
        }
        if (map != null) {
            Iterator itA0n = AnonymousClass002.A0n(map);
            while (itA0n.hasNext()) {
                Map.Entry entry = (Map.Entry) itA0n.next();
                eventBuilder.annotate((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }

    @Override // X.InterfaceC3234C4r
    public final void ASC(String str, Map<String, String> map) {
        EventBuilder eventBuilderMarkEventBuilder = this.A02.markEventBuilder(21375264, this.A03.incrementAndGet(), str);
        if (eventBuilderMarkEventBuilder.isSampled()) {
            A00(eventBuilderMarkEventBuilder, map);
            eventBuilderMarkEventBuilder.setActionId((short) 2);
            eventBuilderMarkEventBuilder.report();
        }
    }

    @Override // X.InterfaceC3234C4r
    public final void AT9(String str, Throwable th, Map<String, String> map) {
        EventBuilder eventBuilderMarkEventBuilder = this.A02.markEventBuilder(21379005, this.A03.incrementAndGet(), str);
        if (eventBuilderMarkEventBuilder.isSampled()) {
            if (th != null) {
                eventBuilderMarkEventBuilder.annotate("Exception", FGI.A0U("<cls>", C60Q.A0e(th), "</cls>"));
                eventBuilderMarkEventBuilder.annotate("StackTrace", C6Q.A00(C6Q.A01(th), 2000));
            }
            A00(eventBuilderMarkEventBuilder, map);
            eventBuilderMarkEventBuilder.setActionId((short) 3);
            eventBuilderMarkEventBuilder.report();
        }
    }

    @Override // X.InterfaceC3234C4r
    public final int AUX(String str, int i) {
        if (A04.nextInt(i) != 0) {
            return -1;
        }
        int iIncrementAndGet = this.A03.incrementAndGet();
        this.A02.markerStart(21373447, iIncrementAndGet, "Category", str);
        return iIncrementAndGet;
    }

    @Override // X.InterfaceC3234C4r
    public final void AWY(String str, Map<String, String> map, String str2) {
        EventBuilder eventBuilderMarkEventBuilder = this.A02.markEventBuilder(21375264, this.A03.incrementAndGet(), str);
        if (eventBuilderMarkEventBuilder.isSampled()) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            A00(eventBuilderMarkEventBuilder, map);
            eventBuilderMarkEventBuilder.annotate(str2, jUptimeMillis - this.A00);
            eventBuilderMarkEventBuilder.setActionId((short) 2);
            eventBuilderMarkEventBuilder.report();
        }
    }

    public C9P(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
        this.A02 = lightweightQuickPerformanceLogger;
    }

    @Override // X.InterfaceC3234C4r
    public final /* synthetic */ int AUW(String str) {
        return AUX(str, 100000);
    }

    @Override // X.InterfaceC3234C4r
    public final void Acd(String str) {
        this.A01 = str;
    }

    @Override // X.InterfaceC3234C4r
    public final void AeG(long j) {
        this.A00 = j;
    }
}
