package X;

import android.text.TextUtils;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.facebook.aura.model.ReplyAttributionSerializer;
import com.facebook.aura.perf.HatchNavTTRCSpec;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.meta.mftpaymentssecurity.ptt.PttException;
import java.math.BigInteger;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class EWe {
    public long A00;
    public String A01 = "";
    public boolean A02;
    public boolean A03;
    public final EVe A04;
    public final EVn A05;
    public final EWB A06;
    public final C6713EWt A07;
    public final EWL A08;
    public final EWL A09;
    public final EWL A0A;
    public final Executor A0B;
    public final EWM A0C;

    public static void A03(EWI ewi, EWe eWe, Object obj, Throwable th, Executor executor) {
        HashMap mapA0w;
        boolean z = eWe.A03;
        boolean z2 = eWe.A02;
        long jNow = AwakeTimeSinceBootClock.INSTANCE.now() - eWe.A00;
        Object obj2 = obj;
        if (obj == null) {
            obj2 = null;
        }
        EVe eVe = eWe.A04;
        Map<String, Object> map = eWe.A06.A02;
        String str = eWe.A01;
        String str2 = obj2 != null ? "client_create_platformtrusttoken_success" : "client_create_platformtrusttoken_fail";
        if (map == null) {
            mapA0w = null;
        } else {
            mapA0w = BV4.A0w(map);
            mapA0w.put("ptt_operation", str);
            if (th != null) {
                mapA0w.put(HatchNavTTRCSpec.AnnotationKeys.ERROR_MESSAGE, CU7.A00(th));
            }
            String strValueOf = String.valueOf(z);
            mapA0w.put("is_encryption_required", strValueOf);
            mapA0w.put("has_encryption_section", strValueOf);
            mapA0w.put("has_secret", String.valueOf(z2));
            mapA0w.put("time_spent_ms", String.valueOf(jNow));
        }
        eVe.APv(str2, mapA0w);
        executor.execute(new EW9(ewi, eWe, obj, th));
    }

    public static final String A00(String str) {
        JsonObject jsonObject = new JsonObject();
        C7384Etj.A0Y(str, 0);
        boolean zA1b = AnonymousClass006.A1b("RSA::", str);
        jsonObject.addProperty("ver", "1.0");
        BigInteger bigInteger = EWP.A01;
        if (zA1b) {
            str = str.substring(5);
        }
        if (AnonymousClass006.A1b("RSA::", str)) {
            str = str.substring(5);
        }
        jsonObject.addProperty("kid", FGI.A0M("fp:", str));
        jsonObject.addProperty("alg", zA1b ? "RS256" : "ES256");
        String strA03 = new EYC().A03(jsonObject);
        C7384Etj.A0U(strA03);
        return AbstractC7494Ey4.A00(C3cG.A1S(strA03));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A01(C7418EvO c7418EvO, EWI ewi, EWe eWe, String str, String str2, Set set, Executor executor) throws JSONException {
        byte[] bArrA1a;
        if (str != null) {
            try {
                bArrA1a = BV7.A1a(str);
            } catch (IllegalArgumentException e) {
                A03(ewi, eWe, null, e, executor);
                return;
            }
        } else {
            bArrA1a = null;
        }
        C6703EWg c6703EWg = new C6703EWg(str2, set, bArrA1a, (byte[]) c7418EvO.A00, (byte[]) c7418EvO.A01);
        C6710EWp c6710EWp = c6703EWg.A01;
        String string = c6710EWp.A00;
        if (!TextUtils.isEmpty(string)) {
            int i = 0;
            try {
                if (!TextUtils.isEmpty(string)) {
                    JSONObject jSONObjectA19 = BV4.A19(string);
                    i = jSONObjectA19.getInt(AuraDeeplinkRouteMapper.CODE_PARAM);
                    string = jSONObjectA19.getString(ReplyAttributionSerializer.TYPE_MESSAGE);
                }
            } catch (JSONException unused) {
            }
            A03(ewi, eWe, null, new PttException(string, i), executor);
            return;
        }
        if (set.isEmpty()) {
            A02(ewi, eWe, c6703EWg, Collections.EMPTY_MAP, executor);
            return;
        }
        C6713EWt c6713EWt = eWe.A07;
        String str3 = c6710EWp.A01;
        if (str3 == null) {
            if (string == null) {
                string = "No response found";
            }
            throw C60O.A0i(string);
        }
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        Iterator<String> it = c6703EWg.A03.iterator();
        while (it.hasNext()) {
            String strA13 = C8j3.A13(it.next());
            String strA00 = A00(strA13);
            BigInteger bigInteger = EWP.A01;
            linkedHashMapA0j.put(strA13, C3cG.A1S(FGI.A0U(strA00, ".", str3)));
        }
        Map mapA0A = AGH.A0A(linkedHashMapA0j);
        C6709EWo c6709EWo = new C6709EWo(ewi, eWe, c6703EWg, executor);
        Map map = c6713EWt.A01;
        AbstractC6705EWj.A01(new C6711EWr(c6713EWt, c6713EWt.A00, map), c6709EWo, BV5.A11(map), mapA0A, BV4.A0u());
    }

    public static void A02(EWI ewi, EWe eWe, C6703EWg c6703EWg, Map map, Executor executor) {
        try {
            String string = new JSONObject(map).toString();
            C7384Etj.A0Y(string, 0);
            C6710EWp c6710EWp = c6703EWg.A01;
            String str = c6710EWp.A01;
            if (str == null) {
                String str2 = c6710EWp.A00;
                if (str2 == null) {
                    str2 = "No response found";
                }
                throw C60O.A0i(str2);
            }
            EYC eyc = new EYC();
            LinkedHashMap linkedHashMapA0j = C3cG.A0j();
            Object objA02 = eyc.A02(string, JsonObject.class);
            if (objA02 == null) {
                throw BV4.A0U();
            }
            ERD<String, JsonElement> erd = ((JsonObject) objA02).members;
            C7384Etj.A0U(erd);
            Iterator itA0i = C3cG.A0i(erd);
            while (itA0i.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(itA0i);
                linkedHashMapA0j.put(entryA0l.getKey(), ((JsonElement) entryA0l.getValue()).getAsJsonPrimitive().getAsString());
            }
            Set<String> set = c6703EWg.A03;
            C7384Etj.A0Y(set, 2);
            if (set.size() != linkedHashMapA0j.size()) {
                throw BV4.A0c(FGI.A0T("APU and auth ticket signature fingerprint does not match! apu fp size: ", " Signature fb size: ", set.size(), linkedHashMapA0j.size()));
            }
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("payload", str);
            JsonArray jsonArray = new JsonArray();
            Iterator itA0i2 = C3cG.A0i(linkedHashMapA0j);
            while (itA0i2.hasNext()) {
                Map.Entry entryA0l2 = C3cH.A0l(itA0i2);
                if (!set.contains(entryA0l2.getKey())) {
                    throw BV4.A0c(AnonymousClass007.A0a("APU does not have signature fingerprint:", entryA0l2.getValue()));
                }
                JsonObject jsonObject2 = new JsonObject();
                jsonObject2.addProperty("protected", A00(C60O.A0t(entryA0l2)));
                jsonObject2.addProperty("signature", (String) entryA0l2.getValue());
                jsonArray.add(jsonObject2);
            }
            jsonObject.add("signatures", jsonArray);
            String strA03 = new EYC().A03(jsonObject);
            C7384Etj.A0U(strA03);
            String strA00 = AbstractC7494Ey4.A00(C3cG.A1S(strA03));
            C6708EWn c6708EWn = new C6708EWn(ewi, eWe, c6703EWg, executor);
            c6708EWn.A01.A0B.execute(new RunnableC6702EWf(c6708EWn.A00, c6708EWn, c6708EWn.A02, strA00, c6708EWn.A03));
        } catch (IllegalArgumentException e) {
            A03(ewi, eWe, null, e, executor);
        }
    }

    public EWe(EVe eVe, EWM ewm, EVn eVn, EWB ewb, C6713EWt c6713EWt, EWL ewl, EWL ewl2, EWL ewl3, Executor executor) {
        this.A07 = c6713EWt;
        this.A0C = ewm;
        this.A0B = executor;
        this.A05 = eVn;
        this.A06 = ewb;
        this.A04 = eVe;
        this.A09 = ewl;
        this.A0A = ewl2;
        this.A08 = ewl3;
    }
}
