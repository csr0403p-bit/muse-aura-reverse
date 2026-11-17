package X;

import android.util.Base64;
import com.facebook.aura.ageverification.intf.AgeCheckFunnelLogging;
import com.facebook.aura.localbrowser.core.BrowserOperationCatalogKt;
import com.facebook.flipper.core.FlipperObject;
import com.facebook.flipper.core.FlipperPlugin;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.8Ky, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C8Ky implements FlipperPlugin {
    public C8L1<C8L3> A00;

    public static void A00(C8Ky c8Ky, String str, String str2, String str3, List list, byte[] bArr, long j) {
        synchronized (c8Ky) {
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("id", str2);
                try {
                    jSONObject.put("timestamp", Long.valueOf(j));
                    try {
                        jSONObject.put(AgeCheckFunnelLogging.KEY_METHOD, str);
                        try {
                            jSONObject.put("url", str3);
                            JSONArray jSONArray = new JSONArray();
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                C8L0 c8l0 = (C8L0) it.next();
                                JSONObject jSONObject2 = new JSONObject();
                                try {
                                    jSONObject2.put("key", c8l0.A00);
                                    try {
                                        jSONObject2.put(BrowserOperationCatalogKt.VALUE, c8l0.A01);
                                        jSONArray.put(jSONObject2);
                                    } catch (JSONException e) {
                                        throw new RuntimeException(e);
                                    }
                                } catch (JSONException e2) {
                                    throw new RuntimeException(e2);
                                }
                            }
                            try {
                                jSONObject.put("headers", jSONArray);
                                try {
                                    jSONObject.put("data", bArr == null ? null : new String(Base64.encode(bArr, 0)));
                                    c8Ky.A01(new FlipperObject(jSONObject));
                                } catch (JSONException e3) {
                                }
                            } catch (JSONException e4) {
                            }
                        } catch (JSONException e5) {
                        }
                    } catch (JSONException e6) {
                    }
                } catch (JSONException e7) {
                }
            } catch (JSONException e8) {
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void A01(final FlipperObject flipperObject) {
        C8L1<C8L3> c8l1 = this.A00;
        if (c8l1 == null) {
            c8l1 = new C8L1<>();
            this.A00 = c8l1;
        }
        Object obj = new Object(flipperObject) { // from class: X.8L3
            public final FlipperObject A00;

            {
                this.A00 = flipperObject;
            }
        };
        List<C8L3> list = c8l1.A00;
        if (list.size() >= 500) {
            list.remove(0);
        }
        list.add(obj);
    }

    public C8Ky(int i) {
    }

    public C8Ky() {
    }
}
