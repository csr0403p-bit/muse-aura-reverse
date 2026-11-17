package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.io.InputStream;

/* loaded from: classes5.dex */
public abstract class EFo {
    public static Icon A00(Context context, IconCompat iconCompat) {
        Icon iconCreateWithBitmap;
        switch (iconCompat.A02) {
            case -1:
                return (Icon) iconCompat.A06;
            case 0:
            default:
                throw C60O.A0i("Unknown type");
            case 1:
                iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.A06);
                break;
            case 2:
                String str = iconCompat.A07;
                iconCreateWithBitmap = Icon.createWithResource((str == null || TextUtils.isEmpty(str)) ? ((String) iconCompat.A06).split(":", -1)[0] : iconCompat.A07, iconCompat.A00);
                break;
            case 3:
                iconCreateWithBitmap = Icon.createWithData((byte[]) iconCompat.A06, iconCompat.A00, iconCompat.A01);
                break;
            case 4:
                iconCreateWithBitmap = Icon.createWithContentUri((String) iconCompat.A06);
                break;
            case 5:
                iconCreateWithBitmap = Icon.createWithAdaptiveBitmap((Bitmap) iconCompat.A06);
                break;
            case 6:
                if (Build.VERSION.SDK_INT >= 30) {
                    iconCreateWithBitmap = AbstractC6564EFp.A00(iconCompat.A03());
                    break;
                } else {
                    if (context == null) {
                        throw C60O.A0i(C8j3.A14(iconCompat.A03(), C60O.A0x("Context is required to resolve the file uri of the icon: ")));
                    }
                    InputStream inputStreamA04 = iconCompat.A04(context);
                    if (inputStreamA04 == null) {
                        throw C3cG.A0Q(C8j3.A14(iconCompat.A03(), C60O.A0x("Cannot load adaptive icon from uri: ")));
                    }
                    iconCreateWithBitmap = Icon.createWithAdaptiveBitmap(BitmapFactory.decodeStream(inputStreamA04));
                    break;
                }
        }
        ColorStateList colorStateList = iconCompat.A03;
        if (colorStateList != null) {
            iconCreateWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = iconCompat.A04;
        if (mode == IconCompat.A0A) {
            return iconCreateWithBitmap;
        }
        iconCreateWithBitmap.setTintMode(mode);
        return iconCreateWithBitmap;
    }

    public static IconCompat A01(Object obj) {
        obj.getClass();
        Icon icon = (Icon) obj;
        int type = icon.getType();
        if (type == 2) {
            return IconCompat.A00(null, icon.getResPackage(), icon.getResId());
        }
        int i = 4;
        if (type != 4) {
            i = 6;
            if (type != 6) {
                IconCompat iconCompat = new IconCompat(-1);
                iconCompat.A06 = obj;
                return iconCompat;
            }
        }
        Uri uri = icon.getUri();
        uri.getClass();
        String string = uri.toString();
        string.getClass();
        IconCompat iconCompat2 = new IconCompat(i);
        iconCompat2.A06 = string;
        return iconCompat2;
    }
}
