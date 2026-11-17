package X;

import com.facebook.aura.pairs.PairsDiscretionDocument;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes5.dex */
public final class CA2 {
    public final Map<Integer, Map<Integer, String>> A00 = BV4.A0u();

    public static void A00(CA2 ca2, JSONArray jSONArray) throws JSONException {
        for (int i = 0; i < jSONArray.length(); i++) {
            String string = jSONArray.getString(i);
            if (string != null) {
                String[] strArrA1a = BV4.A1a(string, ":");
                int iA0F = BV6.A0F(strArrA1a, 0);
                String str = strArrA1a[1];
                HashMap mapA0u = BV4.A0u();
                BV6.A1E(str, mapA0u, -2);
                for (int i2 = 2; i2 < strArrA1a.length; i2 += 2) {
                    BV6.A1E(strArrA1a[i2 + 1], mapA0u, BV6.A0F(strArrA1a, i2));
                }
                ca2.A00.put(Integer.valueOf(iA0F), mapA0u);
            }
        }
    }

    public final C3143BzU A01(C3143BzU c3143BzU) {
        List<CA3> list = c3143BzU.A03;
        ArrayList arrayListA0t = C60Q.A0t(list);
        for (CA3 ca3 : list) {
            String strA0p = ca3.A03;
            if (!CA4.A00(strA0p) || !CA4.A01(ca3.A05)) {
                Map<Integer, Map<Integer, String>> map = this.A00;
                int i = ca3.A07;
                Map map2 = (Map) BV5.A0f(map, i);
                if (map2 != null) {
                    String strA0i = "";
                    if (!CA4.A00(strA0p)) {
                        strA0p = map2.containsKey(-2) ? C60O.A0p(-2, map2) : "";
                    }
                    String str = ca3.A05;
                    if (CA4.A01(str)) {
                        strA0i = str;
                    } else {
                        Integer numValueOf = Integer.valueOf(ca3.A08);
                        if (map2.containsKey(numValueOf)) {
                            strA0i = BV4.A0i(numValueOf, map2);
                        }
                    }
                    if (strA0p == null || strA0i == null) {
                        CFK.A04("MobileConfigIdNameMappingLoader", "failed to parse and get namedParamsMapList, name is null");
                    }
                    arrayListA0t.add(new CA3(strA0p, strA0i, ca3.A08, ca3.A06, ca3.A09, ca3.A0B, ca3.A0A, ca3.A0C, i, ca3.A0E, ca3.A0F, ca3.A0D));
                }
            }
            arrayListA0t.add(ca3);
        }
        return new C3143BzU(arrayListA0t);
    }

    public final void A02(String str) {
        File fileA0G = BV4.A0G(str);
        if (fileA0G.isDirectory()) {
            fileA0G = new File(str, "id_name_mapping.json");
            if (!fileA0G.exists()) {
                fileA0G = C3cG.A0O(new File(str, "mobileconfig"), "id_name_mapping.json");
            }
        }
        if (!fileA0G.exists()) {
            return;
        }
        try {
            String string = fileA0G.toString();
            StringBuilder sbA0w = C60O.A0w();
            BufferedReader bufferedReader = new BufferedReader(new FileReader(string));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        bufferedReader.close();
                        A00(this, new JSONArray(sbA0w.toString()));
                        return;
                    } else {
                        sbA0w.append(line);
                        sbA0w.append(PairsDiscretionDocument.TERMINATOR);
                    }
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    }
                    throw th;
                }
            }
        } catch (IOException | NumberFormatException | JSONException e) {
            CFK.A0J("MobileConfigIdNameMappingLoader", e, "loadIdNameMappingFile failed");
        }
    }
}
