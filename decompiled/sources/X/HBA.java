package X;

import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.RectF;
import com.facebook.aura.pairs.PairsDiscretionDocument;
import java.util.Map;
import java.util.Stack;

/* loaded from: classes6.dex */
public final class HBA {
    public C10343HBh A01 = null;
    public HiF A00 = new HiF();
    public Map<String, HB4> A02 = BV4.A0u();

    /* JADX WARN: Multi-variable type inference failed */
    private HB4 A01(HB7 hb7, String str) {
        HB4 hb4A01 = (HB4) hb7;
        if (!str.equals(hb4A01.A03)) {
            for (Object obj : hb7.ADb()) {
                if (obj instanceof HB4) {
                    hb4A01 = (HB4) obj;
                    if (str.equals(hb4A01.A03) || ((obj instanceof HB7) && (hb4A01 = A01((HB7) obj, str)) != null)) {
                    }
                }
            }
            return null;
        }
        return hb4A01;
    }

    public final Picture A02(int i, int i2) {
        Picture picture = new Picture();
        Canvas canvasBeginRecording = picture.beginRecording(i, i2);
        HBQ hbq = new HBQ(0.0f, 0.0f, i, i2);
        HB9 hb9 = new HB9();
        hb9.A01 = canvasBeginRecording;
        hb9.A00 = 96.0f;
        hb9.A02 = this;
        C10343HBh c10343HBh = this.A01;
        if (c10343HBh == null) {
            BV6.A1L("Nothing to render. Document is empty.", "SVGAndroidRenderer", new Object[0]);
        } else {
            HBQ hbq2 = ((AbstractC10359HBy) c10343HBh).A00;
            HBJ hbj = ((AbstractC10358HBx) c10343HBh).A00;
            hb9.A03 = new HBE(hb9);
            hb9.A06 = new Stack<>();
            HB9.A0U(HBB.A00(), hb9.A03, hb9);
            HBE hbe = hb9.A03;
            hbe.A03 = null;
            hbe.A07 = false;
            hb9.A06.push(new HBE(hbe, hb9));
            hb9.A04 = new Stack<>();
            hb9.A05 = new Stack<>();
            Boolean bool = ((HB4) c10343HBh).A02;
            if (bool != null) {
                hb9.A03.A07 = bool.booleanValue();
            }
            HB9.A0i(hb9);
            HBQ hbq3 = new HBQ(hbq);
            HBD hbd = c10343HBh.A01;
            if (hbd != null) {
                hbq3.A03 = hbd.A04(hb9, hbq3.A03);
            }
            HBD hbd2 = c10343HBh.A00;
            if (hbd2 != null) {
                hbq3.A00 = hbd2.A04(hb9, hbq3.A00);
            }
            HB9.A0J(hbj, hbq3, hbq2, c10343HBh, hb9);
            HB9.A0h(hb9);
        }
        picture.endRecording();
        return picture;
    }

    public final HB4 A04(String str) {
        String strSubstring;
        String str2;
        String strReplace;
        if (str == null) {
            return null;
        }
        String str3 = "\"";
        if (!str.startsWith("\"") || !str.endsWith("\"")) {
            str3 = "'";
            if (str.startsWith("'") && str.endsWith("'")) {
                strSubstring = str.substring(1, str.length() - 1);
                str2 = "\\'";
            }
            strReplace = str.replace("\\\n", "").replace("\\A", PairsDiscretionDocument.TERMINATOR);
            if (strReplace.length() <= 1 && strReplace.startsWith("#")) {
                String strSubstring2 = strReplace.substring(1);
                if (strSubstring2.length() == 0) {
                    return null;
                }
                C10343HBh c10343HBh = this.A01;
                if (strSubstring2.equals(((HB4) c10343HBh).A03)) {
                    return c10343HBh;
                }
                Map<String, HB4> map = this.A02;
                if (map.containsKey(strSubstring2)) {
                    return map.get(strSubstring2);
                }
                HB4 hb4A01 = A01(this.A01, strSubstring2);
                map.put(strSubstring2, hb4A01);
                return hb4A01;
            }
        }
        strSubstring = str.substring(1, str.length() - 1);
        str2 = "\\\"";
        str = strSubstring.replace(str2, str3);
        strReplace = str.replace("\\\n", "").replace("\\A", PairsDiscretionDocument.TERMINATOR);
        return strReplace.length() <= 1 ? null : null;
    }

    public static HBQ A00(HBA hba) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        float fA00;
        Integer num5;
        C10343HBh c10343HBh = hba.A01;
        HBD hbd = c10343HBh.A01;
        HBD hbd2 = c10343HBh.A00;
        if (hbd != null && !AnonymousClass002.A1M((hbd.A00 > 0.0f ? 1 : (hbd.A00 == 0.0f ? 0 : -1))) && (num = hbd.A01) != (num2 = C79.A0Z) && num != (num3 = C79.A01) && num != (num4 = C79.A0C)) {
            float fA002 = hbd.A00(96.0f);
            if (hbd2 == null) {
                HBQ hbq = ((AbstractC10359HBy) c10343HBh).A00;
                fA00 = hbq != null ? (hbq.A00 * fA002) / hbq.A03 : fA002;
            } else if (!AnonymousClass002.A1M((hbd2.A00 > 0.0f ? 1 : (hbd2.A00 == 0.0f ? 0 : -1))) && (num5 = hbd2.A01) != num2 && num5 != num3 && num5 != num4) {
                fA00 = hbd2.A00(96.0f);
            }
            return new HBQ(0.0f, 0.0f, fA002, fA00);
        }
        return new HBQ(-1.0f, -1.0f, -1.0f, -1.0f);
    }

    public final RectF A03() {
        C10343HBh c10343HBh = this.A01;
        if (c10343HBh == null) {
            throw C60O.A0i("SVG document is empty");
        }
        HBQ hbq = ((AbstractC10359HBy) c10343HBh).A00;
        if (hbq == null) {
            return null;
        }
        float f = hbq.A01;
        float f2 = hbq.A02;
        return new RectF(f, f2, f + hbq.A03, f2 + hbq.A00);
    }
}
