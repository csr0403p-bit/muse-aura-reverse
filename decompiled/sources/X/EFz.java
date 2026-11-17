package X;

import android.app.Person;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.aura.pairs.PairsAnalyticsKt;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class EFz {
    public Uri A00;
    public Bundle A01 = BV6.A0N();
    public String A02;
    public final long A03;
    public final EFx A04;
    public final CharSequence A05;

    public static List<EFz> A00(Parcelable[] parcelableArr) {
        ArrayList arrayListA11 = C60O.A11(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable instanceof Bundle) {
                Bundle bundle = (Bundle) parcelable;
                EFz eFz = null;
                try {
                    if (bundle.containsKey("text") && bundle.containsKey("time")) {
                        EFz eFz2 = new EFz(bundle.containsKey(PairsAnalyticsKt.CONNECTION_TYPE_PERSON) ? EFx.A00(bundle.getBundle(PairsAnalyticsKt.CONNECTION_TYPE_PERSON)) : bundle.containsKey("sender_person") ? EFw.A01((Person) bundle.getParcelable("sender_person")) : bundle.containsKey("sender") ? new EFx(null, bundle.getCharSequence("sender"), null, null, false, false) : null, bundle.getCharSequence("text"), bundle.getLong("time"));
                        if (bundle.containsKey("type") && bundle.containsKey("uri")) {
                            String string = bundle.getString("type");
                            Uri uri = (Uri) bundle.getParcelable("uri");
                            eFz2.A02 = string;
                            eFz2.A00 = uri;
                        }
                        if (bundle.containsKey("extras")) {
                            eFz2.A01.putAll(bundle.getBundle("extras"));
                        }
                        eFz = eFz2;
                    }
                } catch (ClassCastException unused) {
                }
                if (eFz != null) {
                    arrayListA11.add(eFz);
                }
            }
        }
        return arrayListA11;
    }

    public EFz(EFx eFx, CharSequence charSequence, long j) {
        this.A05 = charSequence;
        this.A03 = j;
        this.A04 = eFx;
    }

    public static Bundle[] A01(List<EFz> list) {
        Bundle[] bundleArr = new Bundle[list.size()];
        int size = list.size();
        for (int i = 0; i < size; i++) {
            EFz eFz = list.get(i);
            Bundle bundleA0N = BV6.A0N();
            CharSequence charSequence = eFz.A05;
            if (charSequence != null) {
                bundleA0N.putCharSequence("text", charSequence);
            }
            bundleA0N.putLong("time", eFz.A03);
            EFx eFx = eFz.A04;
            if (eFx != null) {
                bundleA0N.putCharSequence("sender", eFx.A01);
                bundleA0N.putParcelable("sender_person", EFw.A00(eFx));
            }
            String str = eFz.A02;
            if (str != null) {
                bundleA0N.putString("type", str);
            }
            Uri uri = eFz.A00;
            if (uri != null) {
                bundleA0N.putParcelable("uri", uri);
            }
            bundleA0N.putBundle("extras", eFz.A01);
            bundleArr[i] = bundleA0N;
        }
        return bundleArr;
    }
}
