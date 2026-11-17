package X;

import android.content.ContentProviderClient;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import com.facebook.acra.constants.ErrorReportingConstants;
import com.facebook.aura.login.nativeflow.NativeLoginCheckpointContinuationKt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import libraries.access.src.main.base.contentprovider.transformers.TransformerException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class EPE {
    public static final Map<EPL, EPM> A01 = Collections.unmodifiableMap(new C7144EhA(5));
    public static final Map<EPL, String> A00 = Collections.unmodifiableMap(new C7144EhA(4));

    public final ArrayList A02(ContentProviderClient contentProviderClient, String str, String str2, EPs ePs, EPi ePi, AbstractC6670EOh abstractC6670EOh) throws NumberFormatException, RemoteException {
        EPL epl = ePs.A04;
        if (epl == EPL.A0D) {
            return A01(contentProviderClient, str, str2, ePs, ePi, abstractC6670EOh);
        }
        Cursor cursorA00 = A00(contentProviderClient, ePi, str, str2, ePs, abstractC6670EOh);
        ArrayList arrayListA0h = C3cG.A0h();
        if (cursorA00 == null || !cursorA00.moveToNext()) {
            return arrayListA0h;
        }
        abstractC6670EOh.logCursorSerializationQplStart(Integer.parseInt(str2));
        try {
            try {
                String string = cursorA00.getString(1);
                ArrayList arrayListA0h2 = C3cG.A0h();
                if (string != null) {
                    JSONArray jSONArray = new JSONArray(string);
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        arrayListA0h2.add(jSONArray.get(i).toString());
                    }
                }
                Iterator it = arrayListA0h2.iterator();
                while (it.hasNext()) {
                    JSONObject jSONObjectA19 = BV4.A19(AnonymousClass005.A0j(it));
                    String strA0L = C7384Etj.A0L(jSONObjectA19.getJSONObject("profile"), ErrorReportingConstants.USER_ID_KEY);
                    String strA0L2 = C7384Etj.A0L(jSONObjectA19, NativeLoginCheckpointContinuationKt.ACCESS_TOKEN_PARAM);
                    String strA0p = C60O.A0p(epl, A00);
                    if (strA0p == null) {
                        strA0p = "";
                    }
                    EPM epm = A01.get(epl);
                    if (epm == null) {
                        throw BV4.A0U();
                    }
                    EPY epy = new EPY(strA0L, strA0L2, strA0p, null, epm, ePi);
                    HashMap<String, String> mapA0u = BV4.A0u();
                    mapA0u.put("WATERFALL_ID", str);
                    mapA0u.put("STORAGE_TYPE", "SHARED_PREFERENCES");
                    epy.A00 = mapA0u;
                    arrayListA0h.add(epy);
                }
                return arrayListA0h;
            } catch (Exception e) {
                throw new JSONException(e.getMessage());
            }
        } finally {
            BV7.A18(cursorA00, str2, abstractC6670EOh);
        }
    }

    public final ArrayList A01(ContentProviderClient contentProviderClient, String str, String str2, EPs ePs, EPi ePi, AbstractC6670EOh abstractC6670EOh) throws NumberFormatException, RemoteException {
        Cursor cursorA00 = A00(contentProviderClient, ePi, str, str2, ePs, abstractC6670EOh);
        if (cursorA00 == null) {
            return C3cG.A0h();
        }
        abstractC6670EOh.logCursorSerializationQplStart(Integer.parseInt(str2));
        ArrayList arrayListA0h = C3cG.A0h();
        EPL epl = ePs.A04;
        EQ5 eq5 = EQ7.A00.get(epl);
        try {
            try {
                if (eq5 == null) {
                    throw new TransformerException(AnonymousClass007.A0a("Can't find corresponding transformer for SsoSource =", epl));
                }
                while (cursorA00.moveToNext()) {
                    EPY epyAhG = eq5.AhG(cursorA00, ePi);
                    if (epyAhG != null) {
                        HashMap<String, String> mapA0u = BV4.A0u();
                        mapA0u.put("WATERFALL_ID", str);
                        mapA0u.put("STORAGE_TYPE", "SHARED_PREFERENCES");
                        epyAhG.A00 = mapA0u;
                        arrayListA0h.add(epyAhG);
                    }
                }
                return arrayListA0h;
            } catch (Exception e) {
                throw new TransformerException(e.getMessage());
            }
        } finally {
            BV7.A18(cursorA00, str2, abstractC6670EOh);
        }
    }

    public static final Cursor A00(ContentProviderClient contentProviderClient, Enum r10, String str, String str2, EPs ePs, AbstractC6670EOh abstractC6670EOh) throws NumberFormatException, RemoteException {
        int i = Integer.parseInt(str2);
        C5225Ddi c5225Ddi = ePs.A03;
        abstractC6670EOh.logCpQueryCount(i, 1);
        Uri uri = ePs.A00;
        abstractC6670EOh.logContentProviderUri(i, uri.toString());
        try {
            try {
                abstractC6670EOh.logCpQueryQplStart(i);
                Cursor cursorQuery = contentProviderClient.query(uri, c5225Ddi.A01, c5225Ddi.A00, new String[]{str, str2}, null);
                if (cursorQuery != null) {
                    abstractC6670EOh.logCpQueryCursorCount(i, cursorQuery.getCount());
                }
                return cursorQuery;
            } finally {
                abstractC6670EOh.logCpQueryQplEnd(i);
            }
        } catch (Exception e) {
            if (!(r10 instanceof EPi)) {
                return null;
            }
            String message = e.getMessage();
            throw new RemoteException((message == null || message.length() == 0) ? FGI.A0M("Failed to fetch credentials from provider.Exception type: ", C60Q.A0e(e)) : e.getMessage());
        }
    }
}
