package androidx.core.graphics.drawable;

import X.AnonymousClass007;
import X.BV4;
import X.BV5;
import X.BV7;
import X.C3cG;
import X.C60O;
import X.FGI;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public class IconCompat extends CustomVersionedParcelable {
    public static final PorterDuff.Mode A0A = PorterDuff.Mode.SRC_IN;
    public int A00;
    public int A01;
    public int A02;
    public ColorStateList A03;
    public PorterDuff.Mode A04;
    public Parcelable A05;
    public Object A06;
    public String A07;
    public String A08;
    public byte[] A09;

    public final int A02() {
        int i = this.A02;
        if (i == -1) {
            return ((Icon) this.A06).getResId();
        }
        if (i == 2) {
            return this.A00;
        }
        throw C3cG.A0Q(AnonymousClass007.A0a("called getResId() on ", this));
    }

    public final Uri A03() {
        int i = this.A02;
        if (i == -1) {
            return ((Icon) this.A06).getUri();
        }
        if (i == 4 || i == 6) {
            return Uri.parse((String) this.A06);
        }
        throw C3cG.A0Q(AnonymousClass007.A0a("called getUri() on ", this));
    }

    public final String toString() {
        String str;
        int height;
        int i = this.A02;
        if (i == -1) {
            return String.valueOf(this.A06);
        }
        StringBuilder sbA0x = C60O.A0x("Icon(typ=");
        switch (i) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sbA0x.append(str);
        switch (i) {
            case 1:
            case 5:
                sbA0x.append(" size=");
                sbA0x.append(((Bitmap) this.A06).getWidth());
                sbA0x.append("x");
                height = ((Bitmap) this.A06).getHeight();
                sbA0x.append(height);
                break;
            case 2:
                sbA0x.append(" pkg=");
                sbA0x.append(this.A07);
                sbA0x.append(" id=");
                sbA0x.append(String.format("0x%08x", BV5.A1Y(A02())));
                break;
            case 3:
                sbA0x.append(" len=");
                sbA0x.append(this.A00);
                height = this.A01;
                if (height != 0) {
                    sbA0x.append(" off=");
                    sbA0x.append(height);
                    break;
                }
                break;
            case 4:
            case 6:
                sbA0x.append(" uri=");
                sbA0x.append(this.A06);
                break;
        }
        ColorStateList colorStateList = this.A03;
        if (colorStateList != null) {
            sbA0x.append(" tint=");
            sbA0x.append(colorStateList);
        }
        PorterDuff.Mode mode = this.A04;
        if (mode != A0A) {
            sbA0x.append(" mode=");
            sbA0x.append(mode);
        }
        return BV7.A10(sbA0x);
    }

    public IconCompat(int i) {
        this.A09 = null;
        this.A05 = null;
        this.A00 = 0;
        this.A01 = 0;
        this.A03 = null;
        this.A04 = A0A;
        this.A08 = null;
        this.A02 = i;
    }

    public static IconCompat A00(Resources resources, String str, int i) {
        str.getClass();
        if (i == 0) {
            throw C60O.A0i("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.A00 = i;
        if (resources != null) {
            try {
                iconCompat.A06 = resources.getResourceName(i);
            } catch (Resources.NotFoundException unused) {
                throw C60O.A0i("Icon resource cannot be found");
            }
        } else {
            iconCompat.A06 = str;
        }
        iconCompat.A07 = str;
        return iconCompat;
    }

    public static IconCompat A01(Bundle bundle) {
        Object byteArray;
        int i = bundle.getInt("type");
        IconCompat iconCompat = new IconCompat(i);
        iconCompat.A00 = bundle.getInt("int1");
        iconCompat.A01 = bundle.getInt("int2");
        iconCompat.A07 = bundle.getString("string1");
        if (bundle.containsKey("tint_list")) {
            iconCompat.A03 = (ColorStateList) bundle.getParcelable("tint_list");
        }
        if (bundle.containsKey("tint_mode")) {
            iconCompat.A04 = PorterDuff.Mode.valueOf(bundle.getString("tint_mode"));
        }
        switch (i) {
            case -1:
            case 1:
            case 5:
                byteArray = bundle.getParcelable("obj");
                break;
            case 0:
            default:
                Log.w("IconCompat", FGI.A0H("Unknown type ", i));
                return null;
            case 2:
            case 4:
            case 6:
                byteArray = bundle.getString("obj");
                break;
            case 3:
                byteArray = bundle.getByteArray("obj");
                break;
        }
        iconCompat.A06 = byteArray;
        return iconCompat;
    }

    public final InputStream A04(Context context) {
        String str;
        Uri uriA03 = A03();
        String scheme = uriA03.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(uriA03);
            } catch (Exception e) {
                e = e;
                str = "Unable to load image from URI: ";
            }
        } else {
            try {
                return BV4.A0H(BV4.A0G((String) this.A06));
            } catch (FileNotFoundException e2) {
                e = e2;
                str = "Unable to load image from path: ";
            }
        }
        Log.w("IconCompat", AnonymousClass007.A0a(str, uriA03), e);
        return null;
    }

    public IconCompat() {
        this.A02 = -1;
        this.A09 = null;
        this.A05 = null;
        this.A00 = 0;
        this.A01 = 0;
        this.A03 = null;
        this.A04 = A0A;
        this.A08 = null;
    }
}
