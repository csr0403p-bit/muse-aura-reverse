package X;

import com.facebook.aura.gateway.JarvisProtocolKt;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class EW5 implements Runnable {
    public static final String __redex_internal_original_name = "ModularGeneratePttHelper$generatePtt$2";
    public final /* synthetic */ EW4 A00;
    public final /* synthetic */ EWA A01;
    public final /* synthetic */ EWA A02;
    public final /* synthetic */ EW2 A03;
    public final /* synthetic */ EWe A04;
    public final /* synthetic */ List<String> A05;
    public final /* synthetic */ Set<String> A06;
    public final /* synthetic */ Executor A07;
    public final /* synthetic */ C10543Hqv<EWA> A08;

    public EW5(EW4 ew4, EWA ewa, EWA ewa2, EW2 ew2, EWe eWe, List list, Set set, Executor executor, C10543Hqv c10543Hqv) {
        this.A04 = eWe;
        this.A00 = ew4;
        this.A02 = ewa;
        this.A08 = c10543Hqv;
        this.A01 = ewa2;
        this.A05 = list;
        this.A06 = set;
        this.A07 = executor;
        this.A03 = ew2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap mapA0w;
        EWe eWe = this.A04;
        EW4 ew4 = this.A00;
        EWA ewa = this.A02;
        EWA ewa2 = this.A08.element;
        EWA ewa3 = this.A01;
        HashMap mapA0w2 = BV4.A0w(ew4.A0B);
        if (ewa3 != null) {
            mapA0w2.put("public_key", ewa3.A04);
            mapA0w2.put("auth_ticket_type", "BIO");
        }
        if (ewa != null && "VERIFY_FACTOR".equals(ew4.A06)) {
            mapA0w2.put("public_key", ewa.A04);
            mapA0w2.put("caps", ew4.A09);
        }
        if (ewa2 != null) {
            String str = ew4.A06;
            if ("CREATE_TRUST_BINDING".equals(str) || "CHARGE".equals(str) || "TOKENIZE_CARD".equals(str)) {
                mapA0w2.put("public_key", ewa2.A04);
            }
        }
        mapA0w2.put("device_id", BV4.A0f());
        mapA0w2.put(JarvisProtocolKt.APP_ID_QUERY_PARAM, ew4.A00.getPackageName());
        HashSet hashSetA0x = BV4.A0x(this.A05);
        EWG ewg = new EWG();
        ewg.A00 = mapA0w2;
        ewg.A01 = hashSetA0x;
        String str2 = ew4.A06;
        Set<String> set = this.A06;
        EWI ewi = new EWI(ew4, this.A03);
        Executor executor = this.A07;
        eWe.A01 = str2;
        try {
            EVe eVe = eWe.A04;
            EWB ewb = eWe.A06;
            Map<String, Object> map = ewb.A02;
            if (map == null) {
                mapA0w = null;
            } else {
                mapA0w = BV4.A0w(map);
                mapA0w.put("ptt_operation", str2);
            }
            eVe.APv("client_create_platformtrusttoken_init", mapA0w);
            eWe.A00 = AwakeTimeSinceBootClock.INSTANCE.now();
            C7418EvO<byte[], byte[]> c7418EvOCreatePayloads = AbstractC6704EWi.createPayloads(ewg);
            boolean zA1X = AnonymousClass002.A1X(c7418EvOCreatePayloads.A01);
            eWe.A02 = zA1X;
            if (!zA1X) {
                eWe.A03 = false;
                eWe.A0B.execute(new EWF(c7418EvOCreatePayloads, ewi, eWe, str2, set, executor));
            } else {
                eWe.A03 = true;
                AbstractC5306Dfp<C6693EVo<String>> abstractC5306DfpAKU = eWe.A05.AKU(ewb);
                abstractC5306DfpAKU.A08(new EW8(c7418EvOCreatePayloads, abstractC5306DfpAKU, ewi, eWe, str2, set, executor));
            }
        } catch (IllegalAccessException | IllegalArgumentException e) {
            EWe.A03(ewi, eWe, null, e, executor);
        }
    }
}
