package X;

import android.util.JsonReader;
import android.util.JsonToken;
import com.facebook.acra.constants.ReportField;
import com.facebook.aura.localbrowser.core.BrowserOperationCatalogKt;
import com.facebook.authlite.api.store.UserSessionCookie;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Set;

/* loaded from: classes5.dex */
public final class CGw {
    public AbstractC3358CGz A00;
    public final C4oT A01;
    public final C3626Ca9 A02;

    public CGw(C4oT c4oT) {
        C7384Etj.A0Y(c4oT, 0);
        this.A01 = c4oT;
        EuI.A01 = true;
        this.A02 = new C3626Ca9(new F0f(65540));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0120 A[Catch: all -> 0x0187, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x0028, B:7:0x0031, B:9:0x0054, B:10:0x005d, B:12:0x0067, B:13:0x0077, B:15:0x0081, B:16:0x008a, B:44:0x015a, B:17:0x0091, B:18:0x0095, B:19:0x0099, B:20:0x009d, B:22:0x00a5, B:23:0x00ad, B:25:0x00b3, B:26:0x00bd, B:28:0x00e6, B:29:0x00ec, B:33:0x0105, B:34:0x0108, B:35:0x0116, B:32:0x00fd, B:40:0x0125, B:41:0x0129, B:36:0x011a, B:38:0x0120, B:42:0x012a), top: B:58:0x0001, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A01(X.AbstractC3358CGz r11) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CGw.A01(X.CGz):boolean");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    public final AbstractC3358CGz A00() {
        CH0 ch0A00;
        boolean z;
        T t;
        C10543Hqv c10543Hqv = new C10543Hqv();
        synchronized (this) {
            AbstractC3358CGz abstractC3358CGz = this.A00;
            if (abstractC3358CGz == null) {
                C4oT c4oT = this.A01;
                Boolean boolValueOf = c4oT.contains("C") ? Boolean.valueOf(c4oT.getBoolean("C", false)) : null;
                String string = c4oT.getString(ReportField.UID, null);
                String string2 = c4oT.getString("AT", null);
                String string3 = c4oT.getString("S", null);
                String string4 = c4oT.getString("SK", null);
                String string5 = c4oT.getString("A2C", null);
                Set<String> stringSet = c4oT.getStringSet("SCS", null);
                String string6 = c4oT.getString("UUN", null);
                if (string != null) {
                    if (stringSet == null) {
                        ch0A00 = null;
                    } else {
                        if (string4 != null) {
                            ArrayList arrayList = new ArrayList();
                            for (String str : stringSet) {
                                C7384Etj.A0Y(str, 0);
                                JsonReader jsonReader = new JsonReader(new StringReader(str));
                                JsonToken jsonTokenPeek = jsonReader.peek();
                                JsonToken jsonToken = JsonToken.NULL;
                                if (jsonTokenPeek != jsonToken) {
                                    jsonReader.beginObject();
                                    String strA00 = null;
                                    String strA002 = null;
                                    String strA003 = null;
                                    Long lValueOf = null;
                                    String strA004 = null;
                                    Boolean boolValueOf2 = null;
                                    String strA005 = null;
                                    while (jsonReader.hasNext() && jsonReader.peek() != JsonToken.END_OBJECT) {
                                        String strNextName = jsonReader.nextName();
                                        if (strNextName != null) {
                                            switch (strNextName.hashCode()) {
                                                case -1326197564:
                                                    if (strNextName.equals("domain")) {
                                                        strA004 = CDJ.A00(jsonReader);
                                                        break;
                                                    } else {
                                                        break;
                                                    }
                                                case -1309235404:
                                                    if (strNextName.equals("expires")) {
                                                        strA003 = CDJ.A00(jsonReader);
                                                        break;
                                                    } else {
                                                        break;
                                                    }
                                                case -906273929:
                                                    if (strNextName.equals("secure")) {
                                                        if (jsonReader.peek() == jsonToken) {
                                                            jsonReader.nextNull();
                                                            boolValueOf2 = null;
                                                            break;
                                                        } else {
                                                            boolValueOf2 = Boolean.valueOf(jsonReader.nextBoolean());
                                                            break;
                                                        }
                                                    } else {
                                                        break;
                                                    }
                                                case 3373707:
                                                    if (strNextName.equals("name")) {
                                                        strA00 = CDJ.A00(jsonReader);
                                                        break;
                                                    } else {
                                                        break;
                                                    }
                                                case 3433509:
                                                    if (strNextName.equals("path")) {
                                                        strA005 = CDJ.A00(jsonReader);
                                                        break;
                                                    } else {
                                                        break;
                                                    }
                                                case 111972721:
                                                    if (strNextName.equals(BrowserOperationCatalogKt.VALUE)) {
                                                        strA002 = CDJ.A00(jsonReader);
                                                        break;
                                                    } else {
                                                        break;
                                                    }
                                                case 1343248843:
                                                    if (strNextName.equals("expires_timestamp")) {
                                                        if (jsonReader.peek() == jsonToken) {
                                                            jsonReader.nextNull();
                                                            lValueOf = null;
                                                            break;
                                                        } else {
                                                            lValueOf = Long.valueOf(jsonReader.nextLong());
                                                            break;
                                                        }
                                                    } else {
                                                        break;
                                                    }
                                            }
                                        }
                                        jsonReader.skipValue();
                                    }
                                    jsonReader.endObject();
                                    if (strA00 == null || strA00.length() == 0 || strA002 == null || strA002.length() == 0 || strA003 == null || strA003.length() == 0 || strA004 == null || strA004.length() == 0 || strA005 == null || strA005.length() == 0) {
                                        CFK.A05("SessionCookie", "UserSessionCookie doesn't have the necessary info. Ignoring cookie...");
                                    } else {
                                        arrayList.add(new UserSessionCookie(boolValueOf2, lValueOf, strA00, strA002, strA003, strA004, strA005));
                                    }
                                }
                            }
                            ch0A00 = AbstractC3358CGz.A00(boolValueOf, string, string2, string3, string4, string5, string6, arrayList, stringSet);
                        }
                        stringSet.size();
                        ch0A00 = null;
                    }
                    this.A00 = ch0A00;
                    z = true;
                    t = ch0A00;
                } else {
                    if (stringSet != null) {
                        stringSet.size();
                    }
                    ch0A00 = null;
                    this.A00 = ch0A00;
                    z = true;
                    t = ch0A00;
                }
            }
            z = false;
            t = abstractC3358CGz;
            c10543Hqv.element = t;
        }
        if (c10543Hqv.element != 0 && z) {
            ((CH2) this.A02.A00.AMN()).A02(((CH0) ((AbstractC3358CGz) c10543Hqv.element)).A01, new EWq(c10543Hqv, 4));
        }
        return (AbstractC3358CGz) c10543Hqv.element;
    }
}
