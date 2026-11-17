package X;

import android.util.Pair;
import androidx.media3.common.Timeline;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.DqC, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5823DqC {
    public InterfaceC6069Dv7 A00;
    public InterfaceC5047DQt A01;

    public void A0B() {
        this.A00 = null;
        this.A01 = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final E6W A09(Timeline timeline, Dy6 dy6, C5414DiA c5414DiA, InterfaceC5921Ds8[] interfaceC5921Ds8Arr) {
        boolean z;
        int[] iArr;
        AbstractC5736DoV abstractC5736DoV = (AbstractC5736DoV) this;
        int length = interfaceC5921Ds8Arr.length;
        int i = length + 1;
        int[] iArr2 = new int[i];
        C5382DhZ[][] c5382DhZArr = new C5382DhZ[i][];
        int[][][] iArr3 = new int[i][][];
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = c5414DiA.A01;
            c5382DhZArr[i2] = new C5382DhZ[i3];
            iArr3[i2] = new int[i3][];
        }
        int[] iArr4 = new int[length];
        for (int i4 = 0; i4 < length; i4++) {
            InterfaceC5921Ds8 interfaceC5921Ds8 = interfaceC5921Ds8Arr[i4];
            iArr4[i4] = ((interfaceC5921Ds8 instanceof AbstractC6147Dwp) || (interfaceC5921Ds8 instanceof AbstractC6148Dwq)) ? 8 : 0;
        }
        for (int i5 = 0; i5 < c5414DiA.A01; i5++) {
            C5382DhZ c5382DhZA0e = BV7.A0e(c5414DiA, i5);
            boolean zA1Q = AnonymousClass002.A1Q(c5382DhZA0e.A02, 5);
            int i6 = length;
            int i7 = 0;
            boolean z2 = true;
            for (int i8 = 0; i8 < length; i8++) {
                InterfaceC5921Ds8 interfaceC5921Ds82 = interfaceC5921Ds8Arr[i8];
                int iMax = 0;
                for (int i9 = 0; i9 < c5382DhZA0e.A01; i9++) {
                    iMax = Math.max(iMax, interfaceC5921Ds82.Agf(c5382DhZA0e.A04[i9]) & 7);
                }
                boolean zA1M = AnonymousClass002.A1M(iArr2[i8]);
                if (iMax > i7 || (iMax == i7 && zA1Q && !z2 && zA1M)) {
                    i6 = i8;
                    z2 = zA1M;
                    i7 = iMax;
                }
            }
            if (i6 == length) {
                iArr = new int[c5382DhZA0e.A01];
            } else {
                InterfaceC5921Ds8 interfaceC5921Ds83 = interfaceC5921Ds8Arr[i6];
                int i10 = c5382DhZA0e.A01;
                iArr = new int[i10];
                for (int i11 = 0; i11 < i10; i11++) {
                    iArr[i11] = interfaceC5921Ds83.Agf(c5382DhZA0e.A04[i11]);
                }
            }
            int i12 = iArr2[i6];
            c5382DhZArr[i6][i12] = c5382DhZA0e;
            iArr3[i6][i12] = iArr;
            iArr2[i6] = i12 + 1;
        }
        C5414DiA[] c5414DiAArr = new C5414DiA[length];
        String[] strArr = new String[length];
        int[] iArr5 = new int[length];
        for (int i13 = 0; i13 < length; i13++) {
            int i14 = iArr2[i13];
            C5382DhZ[] c5382DhZArr2 = c5382DhZArr[i13];
            C1G.A07(BV7.A1S(i14, c5382DhZArr2.length));
            c5414DiAArr[i13] = new C5414DiA((C5382DhZ[]) Arrays.copyOf(c5382DhZArr2, i14));
            Object[] objArr = iArr3[i13];
            C1G.A07(BV7.A1S(i14, objArr.length));
            iArr3[i13] = Arrays.copyOf(objArr, i14);
            strArr[i13] = interfaceC5921Ds8Arr[i13].getName();
            iArr5[i13] = ((AbstractC6146Dwo) interfaceC5921Ds8Arr[i13]).A0F;
        }
        int i15 = iArr2[length];
        C5382DhZ[] c5382DhZArr3 = c5382DhZArr[length];
        C1G.A07(BV7.A1S(i15, c5382DhZArr3.length));
        C5742Dod c5742Dod = new C5742Dod(new C5414DiA((C5382DhZ[]) Arrays.copyOf(c5382DhZArr3, i15)), iArr5, iArr4, c5414DiAArr, strArr, iArr3);
        Pair pairA0C = abstractC5736DoV.A0C(timeline, dy6, c5742Dod, iArr4, iArr3);
        InterfaceC5481DjJ[] interfaceC5481DjJArr = (InterfaceC5481DjJ[]) pairA0C.second;
        int length2 = interfaceC5481DjJArr.length;
        List[] listArr = new List[length2];
        for (int i16 = 0; i16 < length2; i16++) {
            InterfaceC5481DjJ interfaceC5481DjJ = interfaceC5481DjJArr[i16];
            listArr[i16] = interfaceC5481DjJ != null ? ImmutableList.of(interfaceC5481DjJ) : C0881AGi.A00;
        }
        ImmutableList.Builder builder = new ImmutableList.Builder();
        for (int i17 = 0; i17 < c5742Dod.A00; i17++) {
            C5414DiA[] c5414DiAArr2 = c5742Dod.A04;
            C5414DiA c5414DiA2 = c5414DiAArr2[i17];
            List list = listArr[i17];
            for (int i18 = 0; i18 < c5414DiA2.A01; i18++) {
                C5382DhZ c5382DhZA0e2 = BV7.A0e(c5414DiA2, i18);
                int i19 = BV7.A0e(c5414DiAArr2[i17], i18).A01;
                int[] iArr6 = new int[i19];
                int i20 = 0;
                for (int i21 = 0; i21 < i19; i21++) {
                    if ((c5742Dod.A06[i17][i18][i21] & 7) == 4) {
                        iArr6[i20] = i21;
                        i20++;
                    }
                }
                int[] iArrCopyOf = Arrays.copyOf(iArr6, i20);
                int i22 = 0;
                String str = null;
                boolean z3 = false;
                int i23 = 0;
                int iMin = 16;
                while (i22 < iArrCopyOf.length) {
                    String str2 = BV7.A0e(c5414DiAArr2[i17], i18).A04[iArrCopyOf[i22]].A0b;
                    int i24 = i23 + 1;
                    if (i23 == 0) {
                        str = str2;
                    } else {
                        z3 |= !C6xC.A00(str, str2);
                    }
                    iMin = Math.min(iMin, c5742Dod.A06[i17][i18][i22] & 24);
                    i22++;
                    i23 = i24;
                }
                if (z3) {
                    iMin = Math.min(iMin, c5742Dod.A02[i17]);
                }
                boolean zA1L = AnonymousClass002.A1L(iMin);
                int i25 = c5382DhZA0e2.A01;
                int[] iArr7 = new int[i25];
                boolean[] zArr = new boolean[i25];
                for (int i26 = 0; i26 < i25; i26++) {
                    iArr7[i26] = c5742Dod.A06[i17][i18][i26] & 7;
                    int i27 = 0;
                    while (true) {
                        if (i27 >= list.size()) {
                            z = false;
                            break;
                        }
                        InterfaceC5481DjJ interfaceC5481DjJ2 = (InterfaceC5481DjJ) list.get(i27);
                        if (interfaceC5481DjJ2.ALt().equals(c5382DhZA0e2) && interfaceC5481DjJ2.ANV(i26) != -1) {
                            z = true;
                            break;
                        }
                        i27++;
                    }
                    zArr[i26] = z;
                }
                builder.add((ImmutableList.Builder) new C5734DoT(c5382DhZA0e2, iArr7, zArr, zA1L));
            }
        }
        C5414DiA c5414DiA3 = c5742Dod.A01;
        for (int i28 = 0; i28 < c5414DiA3.A01; i28++) {
            C5382DhZ c5382DhZA0e3 = BV7.A0e(c5414DiA3, i28);
            int i29 = c5382DhZA0e3.A01;
            int[] iArr8 = new int[i29];
            Arrays.fill(iArr8, 0);
            builder.add((ImmutableList.Builder) new C5734DoT(c5382DhZA0e3, iArr8, new boolean[i29], false));
        }
        C5735DoU c5735DoU = C5735DoU.A01;
        return new E6W(new C5735DoU(builder.build()), c5742Dod, (C5951Dsl[]) pairA0C.first, (InterfaceC5441Dic[]) pairA0C.second);
    }

    public final void A0A(DrN drN) {
        boolean zEquals;
        DoW doW = (DoW) this;
        if (!doW.A07) {
            synchronized (doW.A06) {
                zEquals = doW.A00.equals(drN);
                doW.A00 = drN;
            }
            if (zEquals) {
                return;
            }
        } else if (doW.A00.equals(drN)) {
            return;
        } else {
            doW.A00 = drN;
        }
        DoW.A07(doW);
    }
}
