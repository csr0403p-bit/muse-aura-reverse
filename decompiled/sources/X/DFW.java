package X;

import com.facebook.aura.analytics.timespent.navigation.NavigationLoggerImpl;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.aura.lifecycle.AuraAppLifecycleManager;
import com.facebook.logginginfra.falco.PrivacyContext;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public class DFW {
    public long A00;
    public long A02;
    public DFX A04;
    public C3341CFl A05;
    public C3341CFl A06;
    public C4934DFk A07;
    public Boolean A08;
    public Integer A09;
    public Integer A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public boolean A0E;
    public boolean A0F;
    public volatile boolean A0G;
    public long A01 = -1;
    public long A03 = 0;

    private void A03(C3341CFl c3341CFl, String str, String str2) {
        String strA0M = str;
        DGD dgd = A00().A03;
        if (dgd.isHealthCounterEnabled()) {
            if (str.equals("event.captured") && dgd.isOneFabricEnabled()) {
                strA0M = FGI.A0M(str, ".on_platform_layer");
            }
            DGS dgs = dgd.get();
            String str3 = this.A0D;
            if (str3 == null) {
                throw new NullPointerException("EventBuilder was not acquired: Trace ID null");
            }
            dgs.APx(strA0M, str2, str3, new C7589F5c(c3341CFl, 23), 1L);
        }
    }

    public boolean A0A() {
        this.A0E = true;
        return true;
    }

    private DFX A00() {
        DFX dfx = this.A04;
        if (dfx != null) {
            return dfx;
        }
        throw new NullPointerException("EventBuilder was not acquired: Analytics2Logger null.");
    }

    private String A01() {
        String str = this.A0B;
        if (str != null) {
            return str;
        }
        throw new NullPointerException("EventBuilder was not acquired: Event name null");
    }

    private void A02() {
        if (this.A0E) {
            if (!this.A0G) {
                throw new IllegalStateException("Expected mutability");
            }
        } else {
            String str = this.A0B;
            if (str == null) {
                str = "unknown";
            }
            throw new IllegalStateException(FGI.A0U("isSampled was not invoked for ", str, "."));
        }
    }

    public void A05() {
        Object objA0C;
        PrivacyContext privacyContextProvide;
        DFX dfx;
        A02();
        if (this.A08 == null && (dfx = this.A04) != null && dfx.A08 != null) {
            this.A08 = Boolean.valueOf(!AuraAppLifecycleManager.INSTANCE.isAppInForeground());
        }
        if (this.A01 == -1) {
            this.A01 = System.currentTimeMillis();
        }
        DFV dfv = A00().A00;
        A00();
        long eventLatencyOverride = dfv.getEventLatencyOverride(A01());
        if (eventLatencyOverride == -1) {
            String strA01 = A01();
            Map<String, Long> map = InterfaceC2389BYr.A00;
            eventLatencyOverride = (map.isEmpty() || !map.containsKey(strA01)) ? -1L : map.get(strA01).longValue();
        }
        if (eventLatencyOverride > 0) {
            eventLatencyOverride = TimeUnit.SECONDS.toMillis(eventLatencyOverride);
        }
        boolean z = this.A0F;
        String strA012 = A01();
        long highPriEventLatencyOverride = z ? dfv.getHighPriEventLatencyOverride(strA012) : dfv.getNormalPriEventLatencyOverride(strA012);
        if (highPriEventLatencyOverride > 0) {
            highPriEventLatencyOverride = TimeUnit.SECONDS.toMillis(highPriEventLatencyOverride);
        }
        if (highPriEventLatencyOverride == -1) {
            highPriEventLatencyOverride = eventLatencyOverride;
        }
        if (highPriEventLatencyOverride == -1) {
            A00();
            A01();
            highPriEventLatencyOverride = this.A0F ? -2L : -1L;
        }
        this.A02 = highPriEventLatencyOverride;
        C3341CFl c3341CFlA04 = A04();
        long j = this.A02;
        C3341CFl.A00(c3341CFlA04, Double.valueOf(j >= 0 ? AbstractC2383BXp.A00(j) : j), "pigeon_reserved_keyword_requested_latency");
        if (this.A09 != null) {
            C3341CFl.A00(A04(), 1 - this.A09.intValue() != 0 ? "client_event" : "experiment", "pigeon_reserved_keyword_log_type");
        }
        if (this.A08 != null) {
            C3341CFl.A00(A04(), this.A08.booleanValue() ? "true" : "false", "pigeon_reserved_keyword_bg");
        }
        String str = this.A0C;
        if (str == null || str.isEmpty()) {
            C3341CFl c3341CFlA042 = A04();
            int i = 0;
            while (true) {
                if (i >= c3341CFlA042.A00) {
                    objA0C = null;
                    break;
                } else {
                    if (c3341CFlA042.A0D(i).equals(NavigationLoggerImpl.PIGEON_MODULE_KEYWORD)) {
                        objA0C = c3341CFlA042.A0C(i);
                        break;
                    }
                    i++;
                }
            }
            this.A0C = (String) objA0C;
        } else {
            C3341CFl.A00(A04(), this.A0C, NavigationLoggerImpl.PIGEON_MODULE_KEYWORD);
        }
        C3341CFl c3341CFl = this.A05;
        if (c3341CFl == null) {
            throw new NullPointerException("EventBuilder was not acquired: BaseParameters null.");
        }
        Integer num = this.A09;
        if (num != null) {
            C3341CFl.A00(c3341CFl, 1 - num.intValue() != 0 ? "client_event" : "experiment", "log_type");
        }
        Boolean bool = this.A08;
        if (bool != null) {
            C3341CFl.A00(c3341CFl, bool.booleanValue() ? "true" : "false", "bg");
        }
        C3341CFl.A00(c3341CFl, Double.valueOf(AbstractC2383BXp.A00(this.A01)), "time");
        String str2 = this.A0C;
        if (str2 != null) {
            C3341CFl.A00(c3341CFl, str2, "module");
        }
        C3341CFl.A00(c3341CFl, A01(), "name");
        Integer num2 = this.A0A;
        if (num2 != null) {
            C3341CFl.A00(c3341CFl, num2, "sampling_rate");
        }
        long j2 = 8388608 | this.A03;
        this.A03 = j2;
        A00();
        C3341CFl.A00(c3341CFl, Long.valueOf(j2 & DG9.A00), "tags");
        if (A00().A0A != null && (privacyContextProvide = A00().A0A.provide(null, this.A0C, A01())) != null) {
            C3341CFl c3341CFlA03 = A00().A0B.A03();
            C3341CFl.A00(c3341CFlA03, privacyContextProvide.A00(0), "experimental_privacy_context");
            C3341CFl.A00(c3341CFlA03, privacyContextProvide.A00(1), "ipf_product");
            C3341CFl.A00(c3341CFlA03, privacyContextProvide.A00(6), "mcp_product_id");
            c3341CFl.A0E(c3341CFlA03, "privacy_context");
        }
        A00();
        A00();
        C3341CFl c3341CFl2 = this.A05;
        if (c3341CFl2 == null) {
            throw new NullPointerException("EventBuilder was not acquired: BaseParameters null.");
        }
        c3341CFl2.A03 = false;
        C3341CFl c3341CFl3 = this.A06;
        if (c3341CFl3 != null) {
            c3341CFl3.A03 = false;
        }
        this.A0G = false;
        C4930DFb c4930DFb = A00().A06;
        synchronized (c4930DFb) {
            if (!c4930DFb.A03) {
                c4930DFb.A03 = true;
                AbstractC4937DFs abstractC4937DFs = c4930DFb.A05;
                c4930DFb.A01 = abstractC4937DFs.getOrBootstrapPigeonIdentity();
                C4930DFb.A02(c4930DFb);
                abstractC4937DFs.registerCallback(c4930DFb);
            }
        }
        C3341CFl c3341CFl4 = this.A05;
        C3341CFl c3341CFl5 = c3341CFl4;
        if (c3341CFl4 == null) {
            c3341CFl4 = null;
        } else {
            c3341CFl4.A03 = false;
            this.A05 = null;
            c3341CFl5 = null;
        }
        C3341CFl c3341CFl6 = this.A06;
        if (c3341CFl6 != null) {
            c3341CFl6.A03 = false;
            this.A06 = null;
        }
        if (c3341CFl4 != null) {
            long j3 = this.A04 != null ? LinkEncryptedPairingKt.LINK_COUNTER_MAX : 0L;
            long j4 = this.A00;
            String strA013 = A01();
            if (j4 < j3) {
                A03(c3341CFl4, "event.captured", strA013);
                String strA014 = A01();
                long j5 = this.A02;
                String str3 = this.A0D;
                if (str3 == null) {
                    throw new NullPointerException("EventBuilder was not acquired: Trace ID null");
                }
                C4934DFk c4934DFk = this.A07;
                if (c4934DFk == null) {
                    throw new NullPointerException("Expected non null sampling result!");
                }
                A00().A05.AYZ(new C4932DFh(c3341CFl4, c4934DFk, strA014, str3, j5, this.A03, this.A01, this.A0F));
            } else {
                A03(c3341CFl5, "event.filters.exceeded_size", strA013);
            }
        }
        if (this.A0G) {
            throw new IllegalStateException("Expected immutability");
        }
        if (this.A05 != null || this.A06 != null) {
            throw new IllegalStateException("Must call ejectBaseParameters and ejectExtraParameters before release");
        }
        DFX dfx2 = this.A04;
        HsC<DFW> hsC = dfx2 == null ? null : dfx2.A01;
        this.A0C = null;
        this.A0B = null;
        this.A09 = null;
        this.A0F = false;
        this.A08 = null;
        this.A01 = -1L;
        this.A04 = null;
        this.A0E = false;
        this.A00 = 0L;
        this.A03 = 0L;
        this.A0D = null;
        this.A07 = null;
        if (hsC != null) {
            hsC.AaC(this);
        }
    }

    public C3341CFl A04() {
        Integer num;
        A02();
        if (this.A06 == null) {
            C3341CFl c3341CFlA03 = A00().A0B.A03();
            this.A06 = c3341CFlA03;
            C3341CFl c3341CFl = this.A05;
            if (c3341CFl != null && (num = this.A09) != null) {
                c3341CFl.A0E(c3341CFlA03, 1 - num.intValue() != 0 ? "extra" : "result");
            }
        }
        return this.A06;
    }

    public void A06(long j) {
        A02();
        this.A01 = j;
    }

    public void A07(Boolean bool, String str) {
        A02();
        C3341CFl.A00(A04(), bool, str);
        synchronized (this) {
            if (bool != null) {
                this.A00 += 4;
            }
        }
    }

    public void A08(String str, Number number) {
        A02();
        C3341CFl.A00(A04(), number, str);
        synchronized (this) {
            if (number != null) {
                this.A00 += 4;
            }
        }
    }

    public void A09(String str, String str2) {
        A02();
        C3341CFl.A00(A04(), str2, str);
        synchronized (this) {
            if (str2 != null) {
                this.A00 += str2.length();
            }
        }
    }
}
