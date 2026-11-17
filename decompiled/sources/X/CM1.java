package X;

import android.content.ContentResolver;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes5.dex */
public class CM1 extends CMC {
    public static final FontFamily A01(ContentResolver contentResolver, CM1 cm1, CLt[] cLtArr) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        Font fontBuild;
        FontFamily.Builder builder = null;
        for (CLt cLt : cLtArr) {
            Uri uri = cLt.A03;
            if (C6xC.A00(uri.getScheme(), "systemfont")) {
                fontBuild = cm1.A02(cLt);
            } else {
                try {
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor == null) {
                        fontBuild = null;
                    } else {
                        try {
                            Font.Builder ttcIndex = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(cLt.A02).setSlant(cLt.A05 ? 1 : 0).setTtcIndex(cLt.A01);
                            String str = cLt.A04;
                            if (!TextUtils.isEmpty(str)) {
                                ttcIndex.setFontVariationSettings(str);
                            }
                            fontBuild = ttcIndex.build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th2) {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                            }
                            throw th;
                        }
                    }
                } catch (IOException e) {
                    Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
                    fontBuild = null;
                }
            }
            if (fontBuild != null) {
                if (builder == null) {
                    builder = new FontFamily.Builder(fontBuild);
                } else {
                    builder.addFont(fontBuild);
                }
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public static Font A00(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, AnonymousClass002.A1L(i & 2) ? 1 : 0);
        Font font = fontFamily.getFont(0);
        FontStyle style = font.getStyle();
        int iAbs = (Math.abs(fontStyle.getWeight() - style.getWeight()) / 100) + (fontStyle.getSlant() == style.getSlant() ? 0 : 2);
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            FontStyle style2 = font2.getStyle();
            int iAbs2 = (Math.abs(fontStyle.getWeight() - style2.getWeight()) / 100) + (fontStyle.getSlant() == style2.getSlant() ? 0 : 2);
            if (iAbs2 < iAbs) {
                font = font2;
                iAbs = iAbs2;
            }
        }
        return font;
    }

    public Font A02(CLt cLt) {
        throw C8j3.A18("Getting font from Typeface is not supported before API31");
    }
}
