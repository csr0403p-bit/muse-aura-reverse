package X;

import android.util.SparseArray;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.Map;

/* loaded from: classes5.dex */
public final class DIR implements DIA {
    public final SparseArray<Boolean> A00 = BV4.A0B();
    public final DIY A01;
    public final IntBuffer A02;
    public final DIX A03;

    @Override // X.DIA
    public final synchronized void AaK(int i, int i2, String str, int i3) {
        AbstractC4959DId abstractC4959DId;
        if (A00(str, Integer.valueOf(i3))) {
            DIX dix = this.A03;
            if (str == null) {
                str = "";
            }
            Map<String, AbstractC4959DId> map = dix.A03.A04;
            if (map != null && (abstractC4959DId = map.get(str)) != null) {
                ByteBuffer byteBuffer = dix.A05;
                byteBuffer.putInt(0, i3);
                byte[] bArrArray = byteBuffer.array();
                C7384Etj.A0U(bArrArray);
                DIX.A00(dix, abstractC4959DId, bArrArray, i2);
            }
        }
    }

    @Override // X.DIA
    public final synchronized void AaL(int i, int i2, String str, String str2) {
        AbstractC4959DId abstractC4959DId;
        if (A00(str, str2)) {
            DIX dix = this.A03;
            if (str == null) {
                str = "";
            }
            Map<String, AbstractC4959DId> map = dix.A03.A04;
            if (map != null && (abstractC4959DId = map.get(str)) != null && (abstractC4959DId instanceof DJ1)) {
                DJ1 dj1 = (DJ1) abstractC4959DId;
                if (str2 == null) {
                    str2 = HatchCcvLoggingKt.NO_POSTAL_FIELD;
                }
                int i3 = dj1.A00;
                if (str2.length() > i3) {
                    ADq aDqA0C = ATD.A0C(0, i3);
                    str2 = str2.substring(aDqA0C.A00, aDqA0C.A01 + 1);
                }
                DIX.A00(dix, abstractC4959DId, C3cG.A1S(C7BY.A0O(str2, i3)), i2);
            }
        }
    }

    @Override // X.DIA
    public final synchronized void AaM(int i, int i2) {
        AaN(i, i2);
    }

    @Override // X.DIA
    public final synchronized void AaN(int i, int i2) {
        this.A03.A01(i2);
        SparseArray<Boolean> sparseArray = this.A00;
        boolean zA1X = AnonymousClass002.A1X(sparseArray.get(i2));
        sparseArray.remove(i2);
        if (zA1X) {
            IntBuffer intBuffer = this.A02;
            intBuffer.put(0, intBuffer.get(0) - 1);
        }
    }

    @Override // X.DIA
    public final synchronized void AaO(int i, int i2, String str, long j) {
        AbstractC4959DId abstractC4959DId;
        C7384Etj.A0Y(str, 2);
        Map<String, AbstractC4959DId> map = this.A01.A04;
        if (map != null && map.containsKey(str)) {
            AbstractC4959DId abstractC4959DId2 = map.get(str);
            if (Long.class.equals(abstractC4959DId2 != null ? abstractC4959DId2.A02 : null)) {
                DIX dix = this.A03;
                Map<String, AbstractC4959DId> map2 = dix.A03.A04;
                if (map2 != null && (abstractC4959DId = map2.get(str)) != null) {
                    ByteBuffer byteBuffer = dix.A06;
                    byteBuffer.putLong(0, j);
                    byte[] bArrArray = byteBuffer.array();
                    C7384Etj.A0U(bArrArray);
                    DIX.A00(dix, abstractC4959DId, bArrArray, i2);
                }
            }
        }
    }

    @Override // X.DIA
    public final synchronized void AaP(int i, int i2, boolean z) {
        SparseArray<Boolean> sparseArray = this.A00;
        if (sparseArray.get(i2) == null) {
            DIX dix = this.A03;
            int i3 = dix.A01;
            while (true) {
                ByteBuffer byteBuffer = dix.A04;
                if (byteBuffer.limit() <= i3) {
                    int iLimit = byteBuffer.limit();
                    dix.A01 = iLimit;
                    byteBuffer.position(iLimit);
                    break;
                } else if (byteBuffer.get(i3) == 1) {
                    i3 += dix.A02;
                    byteBuffer.position(i3);
                } else {
                    dix.A01 = i3;
                    byteBuffer.position(i3);
                    int iPosition = byteBuffer.position();
                    byteBuffer.putInt(iPosition + 1, i2);
                    byteBuffer.put(iPosition, (byte) 1);
                    if (dix.A00 < iPosition) {
                        dix.A00 = iPosition;
                    }
                }
            }
            sparseArray.put(i2, Boolean.valueOf(z));
            int size = sparseArray.size();
            IntBuffer intBuffer = this.A02;
            intBuffer.put(0, size);
            if (intBuffer.get(1) < size) {
                intBuffer.put(1, size);
            }
        }
    }

    @Override // X.DIA
    public final synchronized void AaQ() {
        SparseArray sparseArrayA0B = BV4.A0B();
        SparseArray<Boolean> sparseArray = this.A00;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            if (AnonymousClass001.A1X(sparseArray.valueAt(i))) {
                sparseArrayA0B.put(sparseArray.keyAt(i), sparseArray.valueAt(i));
            }
        }
        int size2 = sparseArrayA0B.size();
        if (size2 == this.A01.A02) {
            DIX dix = this.A03;
            dix.A04.clear();
            dix.A00 = -1;
            dix.A01 = 0;
            sparseArray.clear();
        } else {
            int size3 = sparseArrayA0B.size();
            for (int i2 = 0; i2 < size3; i2++) {
                int iKeyAt = sparseArrayA0B.keyAt(i2);
                this.A03.A01(iKeyAt);
                sparseArray.remove(iKeyAt);
            }
        }
        IntBuffer intBuffer = this.A02;
        intBuffer.put(0, intBuffer.get(0) - size2);
    }

    @Override // X.DIA
    public final synchronized void AaR(int i, int i2, boolean z) {
        SparseArray<Boolean> sparseArray = this.A00;
        if (sparseArray.get(i2) != null) {
            sparseArray.put(i2, Boolean.valueOf(z));
        }
    }

    private final boolean A00(String str, Object obj) {
        Map<String, AbstractC4959DId> map;
        AbstractC4959DId abstractC4959DId;
        if (str != null && (map = this.A01.A04) != null && map.containsKey(str) && (abstractC4959DId = map.get(str)) != null) {
            Class<?> cls = abstractC4959DId.A02;
            if (obj == null ? cls.equals(String.class) : obj.getClass().equals(cls)) {
                return true;
            }
        }
        return false;
    }

    public DIR(DIX dix, DIY diy, IntBuffer intBuffer) {
        this.A01 = diy;
        this.A02 = intBuffer;
        this.A03 = dix;
    }

    @Override // X.DIA
    public final void AeJ(DHu dHu) {
    }
}
