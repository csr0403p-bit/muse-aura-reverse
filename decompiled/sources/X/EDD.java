package X;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class EDD implements InterfaceC6536EDr {
    public static final String SUB_KEY_RETENTION_DAYS = "retention_d";
    public final ED8 store;

    /* JADX INFO: Incorrect field signature: TT; */
    public final EDT supplier;

    /* JADX WARN: Incorrect types in method signature: (TT;)V */
    public EDD(EDT edt) {
        C7384Etj.A0Y(edt, 0);
        this.supplier = edt;
        this.store = ((EE6) edt).getStore("tempfiles");
    }

    public final int performRemoval(String str, JSONObject jSONObject, int i) {
        int length;
        int i2 = 0;
        C7384Etj.A0Y(str, 0);
        long jCurrentTimeMillis = System.currentTimeMillis() - (i * 86400000);
        File fileA0G = BV4.A0G(str);
        File[] fileArrListFiles = fileA0G.listFiles();
        int i3 = 0;
        if (fileArrListFiles == null || (length = fileArrListFiles.length) == 0) {
            ((C9v) this.supplier).deletePath(fileA0G);
            this.store.A00(str);
        } else {
            do {
                File file = fileArrListFiles[i3];
                if (i == 0 || file.lastModified() < jCurrentTimeMillis) {
                    C9v c9v = (C9v) this.supplier;
                    C7384Etj.A0X(file);
                    c9v.deletePath(file);
                    i2++;
                }
                i3++;
            } while (i3 < length);
        }
        return i2;
    }

    public long requestCleanup() {
        int iOptInt;
        JSONObject jSONObjectA18;
        String str;
        String str2;
        ED7 ed7 = (ED7) this.store;
        HashMap mapA0u = BV4.A0u();
        Map<String, ?> all = ed7.A00.getAll();
        C7384Etj.A0X(all);
        Iterator itA0n = AnonymousClass002.A0n(all);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            String strA0t = C60O.A0t(entryA0l);
            Object value = entryA0l.getValue();
            if (strA0t != null) {
                String str3 = ed7.A01;
                C7384Etj.A0Y(str3, 1);
                if (!strA0t.startsWith(str3)) {
                    continue;
                } else {
                    if (value == null) {
                        throw BV4.A0U();
                    }
                    try {
                        jSONObjectA18 = BV4.A19((String) value);
                    } catch (JSONException unused) {
                        jSONObjectA18 = BV4.A18();
                    }
                    if (jSONObjectA18.length() <= 0) {
                        str = ((ED8) ed7).A00;
                        str2 = "Found an invalid JSON for plugin=";
                    } else {
                        String strOptString = jSONObjectA18.optString("path", "");
                        if (C7384Etj.A06(strOptString) == 0) {
                            str = ((ED8) ed7).A00;
                            str2 = "Found an JSON without path param for plugin=";
                        } else {
                            mapA0u.put(strOptString, jSONObjectA18);
                        }
                    }
                    AbstractC3422CMk.A03("SharedPrefCaskMetadataStore", FGI.A0M(str2, str));
                }
            }
        }
        Iterator itA0i = C3cG.A0i(mapA0u);
        int iPerformRemoval = 0;
        while (itA0i.hasNext()) {
            Map.Entry entryA0l2 = C3cH.A0l(itA0i);
            String strA0t2 = C60O.A0t(entryA0l2);
            JSONObject jSONObject = (JSONObject) entryA0l2.getValue();
            if (strA0t2.length() != 0 && (iOptInt = jSONObject.optInt(SUB_KEY_RETENTION_DAYS, -1)) >= 0) {
                iPerformRemoval += performRemoval(strA0t2, jSONObject, iOptInt);
            }
        }
        return iPerformRemoval;
    }

    @Override // X.InterfaceC6536EDr
    public void onPathRequested(EDW edw, EDQ edq, File file) {
        AnonymousClass005.A0x(edw, edq, file);
        this.supplier.getExecutor(BYM.A02).execute(new EDE(edw, this, edq, file));
    }

    public final void storeData(EDW edw, EDQ edq, File file) {
        String absolutePath;
        AnonymousClass005.A0x(edw, edq, file);
        try {
            try {
                absolutePath = file.getCanonicalPath();
                C7384Etj.A0X(absolutePath);
            } catch (IOException unused) {
                absolutePath = file.getAbsolutePath();
                C7384Etj.A0X(absolutePath);
            }
            JSONObject jSONObjectA18 = BV4.A18();
            jSONObjectA18.put("feature_name", edw.A01);
            jSONObjectA18.put(SUB_KEY_RETENTION_DAYS, edq.A00);
            this.store.A01(absolutePath, jSONObjectA18);
        } catch (JSONException unused2) {
            AbstractC3422CMk.A04("TempFileProvider", FGI.A0M("Failed to store data for config ", edw.A01));
        }
    }
}
