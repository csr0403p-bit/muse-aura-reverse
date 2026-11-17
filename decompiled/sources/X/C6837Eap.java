package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Eap, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6837Eap {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public Rect A05;
    public C1685AoO<C8675Fib> A06;
    public Ao1<HpK> A07;
    public List<C8675Fib> A08;
    public List<C6842Eau> A09;
    public Map<String, HgT> A0A;
    public Map<String, C6840Eas> A0B;
    public Map<String, List<C8675Fib>> A0C;
    public final C6712EWs A0D = new C6712EWs();
    public final HashSet<String> A0E = C60O.A13();
    public int A04 = 0;

    public final float A00() {
        return (long) (((this.A00 - this.A03) / this.A01) * 1000.0f);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("LottieComposition:\n");
        Iterator<C8675Fib> it = this.A08.iterator();
        while (it.hasNext()) {
            sbA0x.append(it.next().A00("\t"));
        }
        return sbA0x.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Map<String, C6840Eas> A01() {
        float fA00 = AbstractC8712FjD.A00();
        if (fA00 != this.A02) {
            Iterator itA0n = AnonymousClass002.A0n(this.A0B);
            while (itA0n.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(itA0n);
                Map<String, C6840Eas> map = this.A0B;
                Object key = entryA0l.getKey();
                C6840Eas c6840Eas = (C6840Eas) entryA0l.getValue();
                float f = this.A02 / fA00;
                C6840Eas c6840Eas2 = new C6840Eas((int) (c6840Eas.A02 * f), (int) (c6840Eas.A01 * f), c6840Eas.A05, c6840Eas.A04, c6840Eas.A03);
                Bitmap bitmap = c6840Eas.A00;
                if (bitmap != null) {
                    c6840Eas2.A00 = Bitmap.createScaledBitmap(bitmap, c6840Eas2.A02, c6840Eas2.A01, true);
                }
                map.put(key, c6840Eas2);
            }
        }
        this.A02 = fA00;
        return this.A0B;
    }

    public final void A02(String str) {
        BXP.A00(str);
        this.A0E.add(str);
    }
}
