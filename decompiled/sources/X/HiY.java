package X;

import android.graphics.Color;
import android.widget.ImageView;
import com.facebook.aura.widgets.WidgetComponentsKt;
import com.instagram.common.bloks.lexer.ParsingException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;

/* loaded from: classes6.dex */
public abstract class HiY {
    public static final ThreadLocal<DecimalFormat> A04 = new C10577Hup("#%");
    public static final ThreadLocal<DecimalFormat> A02 = new C10577Hup("#px");
    public static final ThreadLocal<DecimalFormat> A00 = new C10577Hup("#dp");
    public static final ThreadLocal<DecimalFormat> A03 = new C10577Hup("#sp");
    public static final ThreadLocal<DecimalFormat> A01 = new C10577Hup("#");

    public static final float A00(String str) {
        C7384Etj.A0Y(str, 0);
        try {
            return A03(str, A04) * 100.0f;
        } catch (ParseException e) {
            throw new ParsingException(FGI.A0M("can't parse pixel value: ", str), e);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final int A05(String str) throws ParsingException {
        switch (str.hashCode()) {
            case -1078030475:
                if (str.equals("medium")) {
                    return 2;
                }
                break;
            case 3154575:
                if (str.equals("full")) {
                    return 0;
                }
                break;
            case 3327612:
                if (str.equals("long")) {
                    return 1;
                }
                break;
            case 109413500:
                if (str.equals("short")) {
                    return 3;
                }
                break;
        }
        throw FGI.A00("Can't parse unknown datetime format: ", str);
    }

    public static final int A07(String str) throws ParsingException {
        int iHashCode = str.hashCode();
        if (iHashCode != 3212) {
            if (iHashCode != 3592) {
                if (iHashCode == 3677 && str.equals("sp")) {
                    return 2;
                }
            } else if (str.equals("px")) {
                return 0;
            }
        } else if (str.equals("dp")) {
            return 1;
        }
        throw FGI.A00("can't parse unknown textUniSize: ", str);
    }

    public static final C10539Hqm A0A(String str) throws NumberFormatException {
        float fA01;
        Integer num;
        if ("auto".equalsIgnoreCase(str)) {
            return C10539Hqm.A02;
        }
        if (AbstractC7607F5u.A1X(str)) {
            fA01 = Float.parseFloat(str.substring(0, str.length() - 1));
            num = C79.A01;
        } else {
            fA01 = A01(str);
            num = C79.A00;
        }
        return new C10539Hqm(num, fA01);
    }

    public static final boolean A0B(String str) {
        return str.equals("short") || str.equals("medium") || str.equals("long") || str.equals("full");
    }

    public static final float A01(String str) {
        ThreadLocal<DecimalFormat> threadLocal;
        int iA09;
        C7384Etj.A0Y(str, 0);
        try {
            if (str.endsWith("dp")) {
                threadLocal = A00;
            } else {
                if (str.endsWith("px")) {
                    return A03(str, A02);
                }
                if (str.endsWith("sp")) {
                    iA09 = AbstractC7607F5u.A09(A03(str, A03), C60Q.A0B(AbstractC7608F5v.A0D()).scaledDensity);
                    return iA09;
                }
                if (AbstractC7607F5u.A1X(str)) {
                    return A00(str);
                }
                threadLocal = A01;
            }
            iA09 = AbstractC7607F5u.A09(A03(str, threadLocal), C60Q.A0B(AbstractC7608F5v.A0D()).densityDpi / 160.0f);
            return iA09;
        } catch (NumberFormatException e) {
            throw new ParsingException(FGI.A0M("can't parse pixel value: ", str), e);
        } catch (ParseException e2) {
            throw new ParsingException(FGI.A0M("can't parse pixel value: ", str), e2);
        }
    }

    public static final float A02(String str) throws ParsingException {
        try {
            return A03(str, A03);
        } catch (ParseException e) {
            throw new ParsingException(FGI.A0M("can't parse scaled pixel value: ", str), e);
        }
    }

    public static final int A08(String str, int i) {
        return (str == null || str.length() == 0) ? i : A04(str);
    }

    public static float A03(String str, ThreadLocal threadLocal) throws ParseException {
        Object obj = threadLocal.get();
        C7384Etj.A0X(obj);
        Number number = ((NumberFormat) obj).parse(str);
        C7384Etj.A0X(number);
        return number.floatValue();
    }

    public static final int A04(String str) throws ParsingException {
        try {
            return Color.parseColor(str);
        } catch (IllegalArgumentException e) {
            throw new ParsingException(FGI.A0M("can't parse color value: ", str), e);
        }
    }

    public static final int A06(String str) throws ParsingException {
        int iHashCode = str.hashCode();
        if (iHashCode != -1364013995) {
            if (iHashCode != 100571) {
                if (iHashCode == 109757538 && str.equals(WidgetComponentsKt.START_PATH)) {
                    return 8388611;
                }
            } else if (str.equals("end")) {
                return 8388613;
            }
        } else if (str.equals("center")) {
            return 1;
        }
        throw FGI.A00("can't parse unknown textAlign: ", str);
    }

    public static final ImageView.ScaleType A09(String str) throws ParsingException {
        int iHashCode = str.hashCode();
        if (iHashCode != -1881872635) {
            if (iHashCode != 94852023) {
                if (iHashCode == 951526612 && str.equals("contain")) {
                    return ImageView.ScaleType.FIT_CENTER;
                }
            } else if (str.equals("cover")) {
                return ImageView.ScaleType.CENTER_CROP;
            }
        } else if (str.equals("stretch")) {
            return ImageView.ScaleType.FIT_XY;
        }
        throw FGI.A00("can't parse unknown scaleType: ", str);
    }
}
