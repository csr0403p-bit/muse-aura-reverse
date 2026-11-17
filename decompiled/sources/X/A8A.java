package X;

import android.util.Base64;
import com.facebook.aura.network.acs.HatchAnonCredProvider;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class A8A {
    public String A00;
    public String A01;

    public final synchronized void A05(A8E a8e) {
        HashMap mapA01;
        Map map;
        try {
            mapA01 = A01(this);
            map = (Map) mapA01.get(a8e.A03);
        } catch (IllegalArgumentException | JSONException unused) {
            A04();
        }
        if (map != null) {
            map.remove(Base64.encodeToString(a8e.A04, 2));
            A03(mapA01);
        }
    }

    public final synchronized void A06(List<? extends A8E> list) {
        try {
            HashMap mapA01 = A01(this);
            for (A8E a8e : list) {
                String str = a8e.A03;
                Map map = (Map) mapA01.get(str);
                if (map == null) {
                    map = new HashMap();
                    mapA01.put(str, map);
                }
                map.put(Base64.encodeToString(a8e.A04, 2), a8e);
            }
            A03(mapA01);
        } catch (IllegalArgumentException | JSONException unused) {
            A04();
        }
    }

    public A8A() {
        StringBuilder sbA0x;
        if ("".length() == 0) {
            this.A00 = FGI.A0M("acs_storage_manager_cached_token:", HatchAnonCredProvider.PROJECT_NAME);
            sbA0x = C3cI.A0x("acs_storage_manager_server_config:", HatchAnonCredProvider.PROJECT_NAME);
        } else {
            this.A00 = FGI.A0d("acs_storage_manager_cached_token:", HatchAnonCredProvider.PROJECT_NAME, ":", "");
            sbA0x = C3cI.A0x("acs_storage_manager_server_config:", HatchAnonCredProvider.PROJECT_NAME);
            sbA0x.append(":");
            sbA0x.append("");
        }
        this.A01 = sbA0x.toString();
    }

    public static final HashMap A00(A8A a8a) throws JSONException {
        HashMap map = new HashMap();
        String str = a8a.A01;
        String string = a8a instanceof A81 ? ((A81) a8a).A00.getString(str, "") : C60O.A0p(str, ((A83) a8a).A00);
        if (string != null && string.length() != 0) {
            JSONObject jSONObject = new JSONObject(string);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(AnonymousClass005.A0j(itKeys));
                String string2 = jSONObject2.getString("server_config_id");
                int i = jSONObject2.getInt("cipher_suite");
                byte[] bArrDecode = Base64.decode(jSONObject2.getString("public_key"), 2);
                int i2 = jSONObject2.getInt("max_evals");
                int i3 = jSONObject2.getInt("max_redemptions");
                long j = jSONObject2.getLong("config_expires_on");
                long j2 = jSONObject2.getLong("token_ttl");
                A7u a7u = new A7u();
                a7u.A05 = string2;
                a7u.A00 = i;
                a7u.A06 = bArrDecode;
                a7u.A01 = i2;
                a7u.A02 = i3;
                a7u.A03 = j;
                a7u.A04 = j2;
                map.put(string2, a7u);
            }
        }
        return map;
    }

    public static final HashMap A01(A8A a8a) throws JSONException {
        HashMap map = new HashMap();
        String str = a8a.A00;
        String string = a8a instanceof A81 ? ((A81) a8a).A00.getString(str, "") : C60O.A0p(str, ((A83) a8a).A00);
        if (string != null && string.length() != 0) {
            JSONObject jSONObject = new JSONObject(string);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String strA0j = AnonymousClass005.A0j(itKeys);
                JSONObject jSONObject2 = jSONObject.getJSONObject(strA0j);
                HashMap map2 = new HashMap();
                Iterator<String> itKeys2 = jSONObject2.keys();
                while (itKeys2.hasNext()) {
                    String strA0j2 = AnonymousClass005.A0j(itKeys2);
                    Object obj = jSONObject2.get(strA0j2);
                    C7384Etj.A0Z(obj, "null cannot be cast to non-null type org.json.JSONObject");
                    JSONObject jSONObject3 = (JSONObject) obj;
                    String string2 = jSONObject3.getString("server_config_id");
                    byte[] bArrDecode = Base64.decode(jSONObject3.getString("nonce"), 2);
                    byte[] bArrDecode2 = Base64.decode(jSONObject3.getString("shared_secret"), 2);
                    long j = jSONObject3.getLong("token_expires_on");
                    int i = jSONObject3.getInt("max_redemptions");
                    int i2 = jSONObject3.getInt("number_redemptions");
                    A8E a8e = new A8E();
                    a8e.A03 = string2;
                    a8e.A04 = bArrDecode;
                    a8e.A05 = bArrDecode2;
                    a8e.A02 = j;
                    a8e.A00 = i;
                    a8e.A01 = i2;
                    map2.put(strA0j2, a8e);
                }
                map.put(strA0j, map2);
            }
        }
        return map;
    }

    public static final void A02(A8A a8a, Map map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Iterator itA0n = AnonymousClass002.A0n(map);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            String strA0t = C60O.A0t(entryA0l);
            A7u a7u = (A7u) entryA0l.getValue();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("server_config_id", a7u.A05);
            jSONObject2.put("cipher_suite", a7u.A00);
            jSONObject2.put("public_key", Base64.encodeToString(a7u.A06, 2));
            jSONObject2.put("max_evals", a7u.A01);
            jSONObject2.put("max_redemptions", a7u.A02);
            jSONObject2.put("config_expires_on", a7u.A03);
            jSONObject2.put("token_ttl", a7u.A04);
            jSONObject.put(strA0t, jSONObject2);
        }
        String str = a8a.A01;
        String strA0o = C60O.A0o(jSONObject);
        if (!(a8a instanceof A81)) {
            ((A83) a8a).A00.put(str, strA0o);
            return;
        }
        BzK bzKA9q = ((A81) a8a).A00.A9q();
        bzKA9q.AYr(str, strA0o);
        bzKA9q.A0B(1);
    }

    private final void A03(Map<String, ? extends Map<String, A8E>> map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Iterator itA0n = AnonymousClass002.A0n(map);
        int i = 0;
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            String strA0t = C60O.A0t(entryA0l);
            Map map2 = (Map) entryA0l.getValue();
            JSONObject jSONObject2 = new JSONObject();
            for (A8E a8e : map2.values()) {
                if (a8e.A00(1)) {
                    if (i >= 50) {
                        break;
                    }
                    i++;
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("server_config_id", a8e.A03);
                    byte[] bArr = a8e.A04;
                    jSONObject3.put("nonce", Base64.encodeToString(bArr, 2));
                    jSONObject3.put("shared_secret", Base64.encodeToString(a8e.A05, 2));
                    jSONObject3.put("token_expires_on", a8e.A02);
                    jSONObject3.put("max_redemptions", a8e.A00);
                    jSONObject3.put("number_redemptions", a8e.A01);
                    jSONObject2.put(Base64.encodeToString(bArr, 2), jSONObject3);
                }
            }
            if (jSONObject2.length() > 0) {
                jSONObject.put(strA0t, jSONObject2);
            }
        }
        String str = this.A00;
        String strA0o = C60O.A0o(jSONObject);
        if (!(this instanceof A81)) {
            ((A83) this).A00.put(str, strA0o);
            return;
        }
        BzK bzKA9q = ((A81) this).A00.A9q();
        bzKA9q.AYr(str, strA0o);
        bzKA9q.A0B(1);
    }

    public final void A04() {
        if (!(this instanceof A81)) {
            ((A83) this).A00 = new HashMap();
            return;
        }
        A81 a81 = (A81) this;
        BzK bzKA9q = a81.A00.A9q();
        bzKA9q.Aae(((A8A) a81).A00);
        bzKA9q.Aae(a81.A01);
        bzKA9q.A0B(1);
    }
}
