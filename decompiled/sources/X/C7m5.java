package X;

import android.content.ClipData;
import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.webkit.URLUtil;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.7m5, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7m5 implements C7Jh {
    public static C7m6 A00(Intent intent, C7m5 c7m5, boolean z) throws JSONException {
        Uri uri;
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayListA0h = C3cG.A0h();
        jSONObject.put("action", intent.getAction());
        jSONObject.put("package", intent.getPackage());
        jSONObject.put("type", intent.getType());
        Uri data = intent.getData();
        if (data != null) {
            arrayListA0h.add(data);
            jSONObject.put("data", c7m5.A01(data, null).A01());
        }
        ClipData clipData = intent.getClipData();
        if (clipData != null) {
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < clipData.getItemCount(); i++) {
                ClipData.Item itemAt = clipData.getItemAt(i);
                if (itemAt != null && (uri = itemAt.getUri()) != null) {
                    arrayListA0h.add(uri);
                    jSONArray.put(c7m5.A01(uri, null).A01());
                }
            }
            jSONObject.put("clip_data", jSONArray);
        }
        Set<String> categories = intent.getCategories();
        if (categories != null && !categories.isEmpty()) {
            JSONArray jSONArray2 = new JSONArray();
            Iterator<String> it = categories.iterator();
            while (it.hasNext()) {
                jSONArray2.put(it.next());
            }
            jSONObject.put("categories", jSONArray2);
        }
        ComponentName component = intent.getComponent();
        if (component != null) {
            jSONObject.put("component_name", component.toString());
        }
        Rect sourceBounds = intent.getSourceBounds();
        if (sourceBounds != null) {
            jSONObject.put("source_bounds", sourceBounds.toString());
        }
        try {
            Bundle extras = intent.getExtras();
            if (extras != null && extras.size() > 0) {
                JSONArray jSONArray3 = new JSONArray();
                Iterator<String> it2 = extras.keySet().iterator();
                while (it2.hasNext()) {
                    String strA0j = AnonymousClass005.A0j(it2);
                    JSONObject jSONObject2 = new JSONObject();
                    Object obj = null;
                    if (strA0j != null) {
                        try {
                            obj = extras.get(strA0j);
                        } catch (BadParcelableException unused) {
                        }
                    }
                    String strA0f = obj != null ? C60Q.A0f(obj) : "";
                    jSONObject2.put("name", strA0j);
                    jSONObject2.put("value_type", strA0f);
                    if (obj != null) {
                        URLUtil.isValidUrl(obj.toString());
                    }
                    if ((obj instanceof Intent) && z) {
                        jSONObject2.put("nested_intent", A00((Intent) obj, c7m5, false).A01);
                    }
                    jSONArray3.put(jSONObject2);
                }
                jSONObject.put("extra_names", jSONArray3);
            }
        } catch (BadParcelableException | IllegalArgumentException unused2) {
        }
        Intent selector = intent.getSelector();
        if (selector != null) {
            jSONObject.put("selector", A00(selector, c7m5, false).A01);
        }
        if (intent.getFlags() > 0) {
            jSONObject.put("flags", intent.getFlags());
        }
        return new C7m6(arrayListA0h, jSONObject);
    }

    @Override // X.C7Jh
    public final String Ac0(String str) {
        C06867ly c06867ly = C7m4.A04;
        try {
            new URI(str);
            return C7m4.A00(A01(Uri.parse(str), c06867ly));
        } catch (NullPointerException | URISyntaxException unused) {
            return C7m4.A00(A01(Uri.parse(str), c06867ly));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01d0 A[PHI: r14
  0x01d0: PHI (r14v3 boolean) = (r14v1 boolean), (r14v4 boolean) binds: [B:102:0x014c, B:100:0x0149] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e9 A[PHI: r2
  0x00e9: PHI (r2v4 java.lang.String) = (r2v3 java.lang.String), (r2v5 java.lang.String) binds: [B:73:0x00e1, B:75:0x00e7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C7m4 A01(android.net.Uri r15, X.C06867ly r16) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7m5.A01(android.net.Uri, X.7ly):X.7m4");
    }
}
