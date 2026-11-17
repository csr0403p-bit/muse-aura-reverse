package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import androidx.media3.common.util.Util;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* renamed from: X.E1g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6331E1g implements E0T {
    public final C6330E1f A00;
    public final Map<String, E1j> A01;
    public final Map<String, String> A02;
    public final Map<String, C6334E1k> A03;
    public final long[] A04;

    @Override // X.E0T
    public final List<E0J> AEJ(long j) {
        C6330E1f c6330E1f = this.A00;
        Map<String, E1j> map = this.A01;
        Map<String, C6334E1k> map2 = this.A03;
        Map<String, String> map3 = this.A02;
        ArrayList arrayListA0h = C3cG.A0h();
        String str = c6330E1f.A06;
        C6330E1f.A02(c6330E1f, str, arrayListA0h, j);
        TreeMap treeMap = new TreeMap();
        C6330E1f.A03(c6330E1f, str, treeMap, j, false);
        C6330E1f.A04(c6330E1f, str, map, map2, treeMap, j);
        ArrayList arrayListA0h2 = C3cG.A0h();
        Iterator it = arrayListA0h.iterator();
        while (it.hasNext()) {
            Pair pairA0O = BV6.A0O(it);
            String strA0p = C60O.A0p(pairA0O.second, map3);
            if (strA0p != null) {
                byte[] bArrDecode = Base64.decode(strA0p, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                C6334E1k c6334E1k = (C6334E1k) BV6.A0l(pairA0O.first, map2);
                arrayListA0h2.add(new E0J(bitmapDecodeByteArray, null, null, null, c6334E1k.A01, c6334E1k.A02, -3.4028235E38f, c6334E1k.A04, c6334E1k.A00, 0.0f, 0, c6334E1k.A05, 0, Integer.MIN_VALUE, -16777216, c6334E1k.A08, 0, false));
            }
        }
        Iterator itA0i = C3cG.A0i(treeMap);
        while (itA0i.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0i);
            C6334E1k c6334E1k2 = (C6334E1k) BV6.A0l(entryA0l.getKey(), map2);
            E0L e0l = (E0L) entryA0l.getValue();
            CharSequence charSequence = e0l.A0G;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (C6337E1n c6337E1n : (C6337E1n[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C6337E1n.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(c6337E1n), spannableStringBuilder.getSpanEnd(c6337E1n), (CharSequence) "");
            }
            for (int i = 0; i < spannableStringBuilder.length(); i++) {
                if (spannableStringBuilder.charAt(i) == ' ') {
                    int i2 = i + 1;
                    int i3 = i2;
                    while (i3 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i3) == ' ') {
                        i3++;
                    }
                    int i4 = i3 - i2;
                    if (i4 > 0) {
                        spannableStringBuilder.delete(i, i4 + i);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i5 = 0; i5 < spannableStringBuilder.length() - 1; i5++) {
                if (spannableStringBuilder.charAt(i5) == '\n') {
                    int i6 = i5 + 1;
                    if (spannableStringBuilder.charAt(i6) == ' ') {
                        spannableStringBuilder.delete(i6, i5 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i7 = 0; i7 < spannableStringBuilder.length() - 1; i7++) {
                if (spannableStringBuilder.charAt(i7) == ' ') {
                    int i8 = i7 + 1;
                    if (spannableStringBuilder.charAt(i8) == '\n') {
                        spannableStringBuilder.delete(i7, i8);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f = c6334E1k2.A01;
            int i9 = c6334E1k2.A06;
            e0l.A01 = f;
            e0l.A07 = i9;
            e0l.A06 = c6334E1k2.A05;
            e0l.A02 = c6334E1k2.A02;
            e0l.A04 = c6334E1k2.A04;
            float f2 = c6334E1k2.A03;
            int i10 = c6334E1k2.A07;
            e0l.A05 = f2;
            e0l.A09 = i10;
            e0l.A0A = c6334E1k2.A08;
            arrayListA0h2.add(e0l.A00());
        }
        return arrayListA0h2;
    }

    @Override // X.E0T
    public final long AFN(int i) {
        return this.A04[i];
    }

    @Override // X.E0T
    public final int AFO() {
        return this.A04.length;
    }

    @Override // X.E0T
    public final int AI2(long j) {
        long[] jArr = this.A04;
        int iA07 = Util.A07(jArr, j, false);
        if (iA07 >= jArr.length) {
            return -1;
        }
        return iA07;
    }

    public C6331E1g(C6330E1f c6330E1f, Map<String, E1j> map, Map<String, C6334E1k> map2, Map<String, String> map3) {
        this.A00 = c6330E1f;
        this.A03 = map2;
        this.A02 = map3;
        this.A01 = Collections.unmodifiableMap(map);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        C6330E1f.A05(c6330E1f, treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = BV7.A0Y(it);
            i++;
        }
        this.A04 = jArr;
    }
}
