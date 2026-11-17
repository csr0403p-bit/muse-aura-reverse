package X;

import android.util.Pair;
import androidx.media3.common.Timeline;
import java.util.Arrays;

/* renamed from: X.E5f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6427E5f extends Timeline {
    public final int A00;
    public final InterfaceC6437E5p A01;

    public static int A00(AbstractC6427E5f abstractC6427E5f, int i, boolean z) {
        if (!z) {
            int i2 = abstractC6427E5f.A00 - 1;
            int i3 = i + 1;
            if (i >= i2) {
                return -1;
            }
            return i3;
        }
        C6429E5h c6429E5h = (C6429E5h) abstractC6427E5f.A01;
        int i4 = c6429E5h.A01[i] + 1;
        int[] iArr = c6429E5h.A02;
        if (i4 < iArr.length) {
            return iArr[i4];
        }
        return -1;
    }

    @Override // androidx.media3.common.Timeline
    public final E6B A0D(E6B e6b, int i, boolean z) {
        C6428E5g c6428E5g = (C6428E5g) this;
        int[] iArr = c6428E5g.A03;
        int i2 = i + 1;
        int iBinarySearch = Arrays.binarySearch(iArr, i2);
        if (iBinarySearch >= 0) {
            do {
                iBinarySearch--;
                if (iBinarySearch < 0) {
                    break;
                }
            } while (iArr[iBinarySearch] == i2);
        } else {
            iBinarySearch = -(iBinarySearch + 2);
        }
        int i3 = c6428E5g.A04[iBinarySearch];
        c6428E5g.A05[iBinarySearch].A0D(e6b, i - iArr[iBinarySearch], z);
        e6b.A00 += i3;
        if (z) {
            Object obj = c6428E5g.A06[iBinarySearch];
            Object obj2 = e6b.A05;
            obj2.getClass();
            e6b.A05 = Pair.create(obj, obj2);
        }
        return e6b;
    }

    @Override // androidx.media3.common.Timeline
    public final C5998Dth A0E(C5998Dth c5998Dth, int i, long j) {
        C6428E5g c6428E5g = (C6428E5g) this;
        int[] iArr = c6428E5g.A04;
        int i2 = i + 1;
        int iBinarySearch = Arrays.binarySearch(iArr, i2);
        if (iBinarySearch >= 0) {
            do {
                iBinarySearch--;
                if (iBinarySearch < 0) {
                    break;
                }
            } while (iArr[iBinarySearch] == i2);
        } else {
            iBinarySearch = -(iBinarySearch + 2);
        }
        int i3 = iArr[iBinarySearch];
        int i4 = c6428E5g.A03[iBinarySearch];
        c6428E5g.A05[iBinarySearch].A0E(c5998Dth, i - i3, j);
        Object objCreate = c6428E5g.A06[iBinarySearch];
        if (!C5998Dth.A0G.equals(c5998Dth.A0C)) {
            objCreate = Pair.create(objCreate, c5998Dth.A0C);
        }
        c5998Dth.A0C = objCreate;
        c5998Dth.A00 += i4;
        c5998Dth.A01 += i4;
        return c5998Dth;
    }

    public AbstractC6427E5f(InterfaceC6437E5p interfaceC6437E5p) {
        this.A01 = interfaceC6437E5p;
        this.A00 = ((C6429E5h) interfaceC6437E5p).A02.length;
    }
}
