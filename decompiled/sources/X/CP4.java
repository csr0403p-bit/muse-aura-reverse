package X;

import com.facebook.aura.commands.photos.DeviceMediaStoreReaderKt;
import com.facebook.aura.pairs.PairsDiscretionDocument;
import com.facebook.aura.qpl.AuraQplNameProvider;
import com.facebook.quicklog.QuickEventImpl;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class CP4 {
    public static final CP4 A00 = new CP4();

    public static final String A00(COt cOt, F18 f18, boolean z) {
        StringBuilder sb = new StringBuilder("QPLSent - ");
        sb.append("{\"id\":");
        sb.append(cOt.getMarkerId());
        sb.append(",\"event\":\"");
        sb.append(((AuraQplNameProvider) f18.AMN()).getMarkerName(cOt.getMarkerId()));
        sb.append("\",\"action\":\"");
        f18.AMN();
        QuickEventImpl quickEventImpl = (QuickEventImpl) cOt;
        sb.append(AbstractC10411Hbi.A00(quickEventImpl.A0J));
        sb.append("\",");
        if (z) {
            sb.append("\"unique_marker_debug_id\":");
            sb.append(FGI.A0U("\"", null, "\""));
            sb.append(",");
        }
        sb.append("\"timestamp\":");
        sb.append(quickEventImpl.mTimestampMs);
        sb.append(",\"duration\":");
        long j = quickEventImpl.A05;
        sb.append((int) (j / 1000000));
        sb.append(",\"duration_nano\":");
        sb.append(j);
        sb.append(",");
        CP4 cp4 = A00;
        cp4.A02("tags", sb, quickEventImpl.A0T);
        sb.append(",");
        cp4.A02("extra", sb, quickEventImpl.A0R.A0P());
        if (!cOt.AHg().A00.isEmpty()) {
            sb.append(",");
            cp4.A03("metadata", sb, cOt.AHg().A02());
        }
        DHo dHo = quickEventImpl.A0A;
        if (dHo != null) {
            sb.append(",");
            sb.append("\"points\":[");
            boolean z2 = true;
            int i = dHo.A01;
            for (int i2 = 0; i2 < i; i2++) {
                long j2 = dHo.A03[i2] / 1000000;
                String str = dHo.A06[i2];
                if (str == null) {
                    str = "";
                }
                CPI cpi = dHo.A04[i2];
                if (z2) {
                    z2 = false;
                } else {
                    sb.append(',');
                }
                sb.append("{\"name\":\"");
                sb.append(A01(str));
                sb.append('\"');
                sb.append(",\"value\":");
                sb.append(j2);
                if (cpi != null) {
                    sb.append(",\"data\":{");
                    boolean z3 = true;
                    int i3 = 0;
                    int i4 = 0;
                    while (i3 < cpi.A00) {
                        String[] strArr = cpi.A02;
                        String str2 = strArr[i4];
                        String str3 = strArr[i4 + 1];
                        C7384Etj.A0Y(str2, 0);
                        if (z3) {
                            z3 = false;
                        } else {
                            sb.append(',');
                        }
                        sb.append('\"');
                        sb.append(A01(str2));
                        sb.append("\":\"");
                        sb.append(A01(str3));
                        sb.append('\"');
                        i3++;
                        i4 += 2;
                    }
                    sb.append("}");
                }
                sb.append("}");
            }
            sb.append("]");
        }
        sb.append("}");
        return sb.toString();
    }

    public static final String A01(Object obj) {
        if (obj == null) {
            return null;
        }
        return AbstractC2159Azp.A0z(AbstractC2159Azp.A0z(AbstractC2159Azp.A0z(AbstractC2159Azp.A0z(AbstractC2159Azp.A0z(AbstractC2159Azp.A0z(AbstractC2159Azp.A0z(obj.toString(), DeviceMediaStoreReaderKt.LIKE_ESCAPE_CHAR, "\\\\"), "\"", "\\\""), "\b", "\\b"), "\f", "\\f"), PairsDiscretionDocument.TERMINATOR, "\\n"), "\r", "\\r"), "\t", "\\t");
    }

    /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List<*>;)Ljava/lang/StringBuilder; */
    private final void A02(String str, StringBuilder sb, List list) {
        sb.append('\"');
        sb.append(str);
        sb.append("\":[");
        boolean z = true;
        for (Object obj : list) {
            if (!z) {
                sb.append(',');
            }
            sb.append('\"');
            sb.append(A01(obj));
            sb.append('\"');
            z = false;
        }
        sb.append("]");
    }

    private final void A03(String str, StringBuilder sb, Map<?, ?> map) {
        sb.append('\"');
        sb.append(str);
        sb.append("\":{");
        Iterator itA0n = AnonymousClass002.A0n(map);
        boolean z = true;
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            Object key = entryA0l.getKey();
            Object value = entryA0l.getValue();
            if (!z) {
                sb.append(",");
            }
            if (value instanceof Map) {
                A03(String.valueOf(key), sb, (Map) value);
            } else {
                sb.append('\"');
                sb.append(key);
                sb.append("\":\"");
                sb.append(A01(value));
                sb.append('\"');
            }
            z = false;
        }
        sb.append("}");
    }
}
