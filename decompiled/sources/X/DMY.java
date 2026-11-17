package X;

import android.util.SparseArray;
import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;

/* loaded from: classes5.dex */
public final class DMY {
    public static final ImmutableMap<Integer, Integer> A03;
    public final int A00;
    public final SparseArray<DMZ> A01 = BV4.A0B();
    public static final DMY A02 = new DMY(ImmutableList.of(DMZ.A02));
    public static final ImmutableList<Integer> A04 = ImmutableList.of((int) BV4.A0X(), 5, 6);

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DMY) {
                DMY dmy = (DMY) obj;
                if (!Util.A0Q(this.A01, dmy.A01) || this.A00 != dmy.A00) {
                }
            }
            return false;
        }
        return true;
    }

    static {
        ImmutableMap.Builder builder = new ImmutableMap.Builder(4);
        builder.put(5, 6);
        BV6.A15(builder, 6, 17);
        BV6.A15(builder, 6, 7);
        builder.put(30, 10);
        BV6.A15(builder, 6, 18);
        builder.put(6, 8);
        builder.put(8, 8);
        BV6.A15(builder, 8, 14);
        A03 = builder.buildOrThrow();
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Dwx;LX/DrN;)Landroid/util/Pair<Ljava/lang/Integer;Ljava/lang/Integer;>; */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00be A[PHI: r1
  0x00be: PHI (r1v2 int) = (r1v1 int), (r1v3 int) binds: [B:54:0x00b8, B:56:0x00bc] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair A00(X.DrN r9, X.C6154Dwx r10) {
        /*
            r8 = this;
            java.lang.String r4 = r10.A0b
            r4.getClass()
            java.lang.String r0 = r10.A0W
            int r2 = X.AbstractC6161Dx4.A02(r4, r0)
            com.google.common.collect.ImmutableMap<java.lang.Integer, java.lang.Integer> r1 = X.DMY.A03
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            boolean r0 = r1.containsKey(r0)
            r7 = 0
            if (r0 == 0) goto L4f
            r6 = 18
            if (r2 != r6) goto Lb6
            android.util.SparseArray<X.DMZ> r0 = r8.A01
            int r0 = r0.indexOfKey(r6)
            if (r0 >= 0) goto L25
            r2 = 6
        L25:
            android.util.SparseArray<X.DMZ> r1 = r8.A01
            int r0 = r1.indexOfKey(r2)
            if (r0 < 0) goto L4f
            java.lang.Object r5 = r1.get(r2)
            r5.getClass()
            X.DMZ r5 = (X.DMZ) r5
            int r3 = r10.A06
            r1 = -1
            if (r3 == r1) goto L6a
            if (r2 == r6) goto L6a
            java.lang.String r0 = "audio/vnd.dts.uhd;profile=p2"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L50
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r1 >= r0) goto L50
            r0 = 10
            if (r3 <= r0) goto L78
        L4f:
            return r7
        L50:
            com.google.common.collect.ImmutableSet<java.lang.Integer> r1 = r5.A01
            if (r1 != 0) goto L59
            int r0 = r5.A00
            if (r3 > r0) goto L4f
            goto L78
        L59:
            int r0 = androidx.media3.common.util.Util.A00(r3)
            if (r0 == 0) goto L4f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L78
            return r7
        L6a:
            int r0 = r10.A0L
            r4 = 48000(0xbb80, float:6.7262E-41)
            if (r0 == r1) goto L72
            r4 = r0
        L72:
            com.google.common.collect.ImmutableSet<java.lang.Integer> r0 = r5.A01
            if (r0 == 0) goto L8b
            int r3 = r5.A00
        L78:
            int r0 = androidx.media3.common.util.Util.A00(r3)
            if (r0 == 0) goto L4f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.util.Pair r0 = android.util.Pair.create(r1, r0)
            return r0
        L8b:
            r3 = 10
        L8d:
            int r1 = androidx.media3.common.util.Util.A00(r3)
            if (r1 == 0) goto Lb0
            android.media.AudioFormat$Builder r0 = new android.media.AudioFormat$Builder
            r0.<init>()
            android.media.AudioFormat r1 = X.BV8.A0S(r0, r4, r1)
            X.DrO r0 = r9.A00
            if (r0 != 0) goto La7
            X.DrO r0 = new X.DrO
            r0.<init>(r9)
            r9.A00 = r0
        La7:
            android.media.AudioAttributes r0 = r0.A00
            boolean r0 = android.media.AudioTrack.isDirectPlaybackSupported(r1, r0)
            if (r0 == 0) goto Lb0
            goto L78
        Lb0:
            int r3 = r3 + (-1)
            if (r3 > 0) goto L8d
            r3 = 0
            goto L78
        Lb6:
            r1 = 8
            if (r2 == r1) goto Lbe
            r1 = 30
            if (r2 != r1) goto L25
        Lbe:
            android.util.SparseArray<X.DMZ> r0 = r8.A01
            int r0 = r0.indexOfKey(r1)
            if (r0 >= 0) goto L25
            r2 = 7
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DMY.A00(X.DrN, X.Dwx):android.util.Pair");
    }

    public final int hashCode() {
        return this.A00 + (Util.A04(this.A01) * 31);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("AudioCapabilities[maxChannelCount=");
        sbA0x.append(this.A00);
        sbA0x.append(", audioProfiles=");
        return BV8.A0u(this.A01, sbA0x);
    }

    public DMY(List<DMZ> list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.A01.put(2, list.get(i2));
        }
        int iMax = 0;
        while (true) {
            SparseArray<DMZ> sparseArray = this.A01;
            if (i >= sparseArray.size()) {
                this.A00 = iMax;
                return;
            } else {
                iMax = Math.max(iMax, sparseArray.valueAt(i).A00);
                i++;
            }
        }
    }
}
