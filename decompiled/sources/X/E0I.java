package X;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Spanned;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class E0I {
    public static final byte[] A00(List<E0J> list, long j) {
        ArrayList<? extends Parcelable> arrayListA0t = C60Q.A0t(list);
        for (E0J e0j : list) {
            Bundle bundleA0N = BV6.A0N();
            CharSequence charSequence = e0j.A0G;
            if (charSequence != null) {
                bundleA0N.putCharSequence(E0J.A0V, charSequence);
                if (charSequence instanceof Spanned) {
                    Spanned spanned = (Spanned) charSequence;
                    String str = E0P.A00;
                    ArrayList<? extends Parcelable> arrayListA0h = C3cG.A0h();
                    for (E0U e0u : (E0U[]) spanned.getSpans(0, spanned.length(), E0U.class)) {
                        Bundle bundleA0N2 = BV6.A0N();
                        bundleA0N2.putString(E0U.A03, e0u.A01);
                        bundleA0N2.putInt(E0U.A02, e0u.A00);
                        arrayListA0h.add(E0P.A00(bundleA0N2, spanned, e0u, 1));
                    }
                    for (E0S e0s : (E0S[]) spanned.getSpans(0, spanned.length(), E0S.class)) {
                        Bundle bundleA0N3 = BV6.A0N();
                        bundleA0N3.putInt(E0S.A04, e0s.A01);
                        bundleA0N3.putInt(E0S.A03, e0s.A00);
                        bundleA0N3.putInt(E0S.A05, e0s.A02);
                        arrayListA0h.add(E0P.A00(bundleA0N3, spanned, e0s, 2));
                    }
                    for (C6317E0p c6317E0p : (C6317E0p[]) spanned.getSpans(0, spanned.length(), C6317E0p.class)) {
                        arrayListA0h.add(E0P.A00(null, spanned, c6317E0p, 3));
                    }
                    for (C6309E0h c6309E0h : (C6309E0h[]) spanned.getSpans(0, spanned.length(), C6309E0h.class)) {
                        Bundle bundleA0N4 = BV6.A0N();
                        bundleA0N4.putString(C6309E0h.A01, c6309E0h.A00);
                        arrayListA0h.add(E0P.A00(bundleA0N4, spanned, c6309E0h, 4));
                    }
                    if (!arrayListA0h.isEmpty()) {
                        bundleA0N.putParcelableArrayList(E0J.A0M, arrayListA0h);
                    }
                }
            }
            bundleA0N.putSerializable(E0J.A0W, e0j.A0F);
            bundleA0N.putSerializable(E0J.A0Q, e0j.A0E);
            bundleA0N.putFloat(E0J.A0N, e0j.A01);
            bundleA0N.putInt(E0J.A0P, e0j.A07);
            bundleA0N.putInt(E0J.A0O, e0j.A06);
            bundleA0N.putFloat(E0J.A0R, e0j.A02);
            bundleA0N.putInt(E0J.A0S, e0j.A08);
            bundleA0N.putInt(E0J.A0Y, e0j.A09);
            bundleA0N.putFloat(E0J.A0X, e0j.A05);
            bundleA0N.putFloat(E0J.A0U, e0j.A04);
            bundleA0N.putFloat(E0J.A0K, e0j.A00);
            bundleA0N.putBoolean(E0J.A0b, e0j.A0H);
            bundleA0N.putInt(E0J.A0a, e0j.A0B);
            bundleA0N.putInt(E0J.A0Z, e0j.A0A);
            bundleA0N.putFloat(E0J.A0T, e0j.A03);
            bundleA0N.putInt(E0J.A0c, e0j.A0C);
            Bitmap bitmap = e0j.A0D;
            if (bitmap != null) {
                ByteArrayOutputStream byteArrayOutputStreamA0F = BV4.A0F();
                C1G.A08(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStreamA0F));
                bundleA0N.putByteArray(E0J.A0J, byteArrayOutputStreamA0F.toByteArray());
            }
            arrayListA0t.add(bundleA0N);
        }
        Bundle bundleA0N5 = BV6.A0N();
        bundleA0N5.putParcelableArrayList("c", arrayListA0t);
        bundleA0N5.putLong("d", j);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundleA0N5);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }
}
