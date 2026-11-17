package X;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* renamed from: X.Dja, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5498Dja implements InterfaceC6006Dtp, InterfaceC5503Djf {
    public InterfaceC5503Djf A00;
    public InterfaceC5487DjP A01;
    public C5414DiA A02;
    public InterfaceC6006Dtp[] A03;
    public final InterfaceC6006Dtp[] A04;
    public final InterfaceC5512Djo A05;
    public final ArrayList<InterfaceC6006Dtp> A06 = C3cG.A0h();
    public final HashMap<C5382DhZ, C5382DhZ> A07 = BV4.A0u();
    public final IdentityHashMap<InterfaceC6022DuF, Integer> A08;

    @Override // X.InterfaceC6006Dtp, X.InterfaceC5487DjP
    public final boolean A7A(Du1 du1) {
        ArrayList<InterfaceC6006Dtp> arrayList = this.A06;
        if (arrayList.isEmpty()) {
            return this.A01.A7A(du1);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).A7A(du1);
        }
        return false;
    }

    @Override // X.InterfaceC6006Dtp
    public final void A94(long j, boolean z) {
        for (InterfaceC6006Dtp interfaceC6006Dtp : this.A03) {
            interfaceC6006Dtp.A94(j, z);
        }
    }

    @Override // X.InterfaceC6006Dtp
    public final long ACF(DpX dpX, long j) {
        InterfaceC6006Dtp[] interfaceC6006DtpArr = this.A03;
        if (interfaceC6006DtpArr.length <= 0) {
            interfaceC6006DtpArr = this.A04;
        }
        return interfaceC6006DtpArr[0].ACF(dpX, j);
    }

    @Override // X.InterfaceC5487DjP
    public final long AD6(long j) {
        return this.A01.AD6(j);
    }

    @Override // X.InterfaceC6006Dtp, X.InterfaceC5487DjP
    public final long AD8() {
        return this.A01.AD8();
    }

    @Override // X.InterfaceC6006Dtp, X.InterfaceC5487DjP
    public final long AI5() {
        return this.A01.AI5();
    }

    @Override // X.InterfaceC6006Dtp
    public final C5414DiA ALu() {
        C5414DiA c5414DiA = this.A02;
        c5414DiA.getClass();
        return c5414DiA;
    }

    @Override // X.InterfaceC6006Dtp, X.InterfaceC5487DjP
    public final boolean AOd() {
        return this.A01.AOd();
    }

    @Override // X.InterfaceC6006Dtp
    public final void AQR() {
        for (InterfaceC6006Dtp interfaceC6006Dtp : this.A04) {
            interfaceC6006Dtp.AQR();
        }
    }

    @Override // X.InterfaceC5495DjX
    public final /* bridge */ /* synthetic */ void ASS(InterfaceC5487DjP interfaceC5487DjP) {
        InterfaceC5503Djf interfaceC5503Djf = this.A00;
        interfaceC5503Djf.getClass();
        interfaceC5503Djf.ASS(this);
    }

    @Override // X.InterfaceC5503Djf
    public final void AUv(InterfaceC6006Dtp interfaceC6006Dtp) {
        ArrayList<InterfaceC6006Dtp> arrayList = this.A06;
        arrayList.remove(interfaceC6006Dtp);
        if (arrayList.isEmpty()) {
            InterfaceC6006Dtp[] interfaceC6006DtpArr = this.A04;
            int length = interfaceC6006DtpArr.length;
            int i = 0;
            for (InterfaceC6006Dtp interfaceC6006Dtp2 : interfaceC6006DtpArr) {
                i += interfaceC6006Dtp2.ALu().A01;
            }
            C5382DhZ[] c5382DhZArr = new C5382DhZ[i];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                C5414DiA c5414DiAALu = interfaceC6006DtpArr[i3].ALu();
                int i4 = c5414DiAALu.A01;
                int i5 = 0;
                while (i5 < i4) {
                    C5382DhZ c5382DhZA0e = BV7.A0e(c5414DiAALu, i5);
                    String str = c5382DhZA0e.A03;
                    StringBuilder sbA0w = C60O.A0w();
                    sbA0w.append(i3);
                    C5382DhZ c5382DhZ = new C5382DhZ(C60P.A1M(":", str, sbA0w), c5382DhZA0e.A04);
                    this.A07.put(c5382DhZ, c5382DhZA0e);
                    c5382DhZArr[i2] = c5382DhZ;
                    i5++;
                    i2++;
                }
            }
            this.A02 = new C5414DiA(c5382DhZArr);
            InterfaceC5503Djf interfaceC5503Djf = this.A00;
            interfaceC5503Djf.getClass();
            interfaceC5503Djf.AUv(this);
        }
    }

    @Override // X.InterfaceC6006Dtp
    public final void AYP(InterfaceC5503Djf interfaceC5503Djf, long j) {
        this.A00 = interfaceC5503Djf;
        ArrayList<InterfaceC6006Dtp> arrayList = this.A06;
        InterfaceC6006Dtp[] interfaceC6006DtpArr = this.A04;
        Collections.addAll(arrayList, interfaceC6006DtpArr);
        for (InterfaceC6006Dtp interfaceC6006Dtp : interfaceC6006DtpArr) {
            interfaceC6006Dtp.AYP(this, j);
        }
    }

    @Override // X.InterfaceC6006Dtp
    public final long AZF() {
        long j = -9223372036854775807L;
        for (InterfaceC6006Dtp interfaceC6006Dtp : this.A03) {
            long jAZF = interfaceC6006Dtp.AZF();
            if (jAZF == -9223372036854775807L) {
                if (j != -9223372036854775807L && interfaceC6006Dtp.AcP(j) != j) {
                    throw C3cG.A0Q("Unexpected child seekToUs result.");
                }
            } else if (j == -9223372036854775807L) {
                for (InterfaceC6006Dtp interfaceC6006Dtp2 : this.A03) {
                    if (interfaceC6006Dtp2 == interfaceC6006Dtp) {
                        break;
                    }
                    if (interfaceC6006Dtp2.AcP(jAZF) != jAZF) {
                        throw C3cG.A0Q("Unexpected child seekToUs result.");
                    }
                }
                j = jAZF;
            } else if (jAZF != j) {
                throw C3cG.A0Q("Conflicting discontinuities.");
            }
        }
        return j;
    }

    @Override // X.InterfaceC6006Dtp, X.InterfaceC5487DjP
    public final void AZv(long j) {
        this.A01.AZv(j);
    }

    @Override // X.InterfaceC6006Dtp
    public final long AcP(long j) {
        long jAcP = this.A03[0].AcP(j);
        int i = 1;
        while (true) {
            InterfaceC6006Dtp[] interfaceC6006DtpArr = this.A03;
            if (i >= interfaceC6006DtpArr.length) {
                return jAcP;
            }
            if (interfaceC6006DtpArr[i].AcP(jAcP) != jAcP) {
                throw C3cG.A0Q("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    @Override // X.InterfaceC6006Dtp
    public final long AcS(InterfaceC6022DuF[] interfaceC6022DuFArr, InterfaceC5441Dic[] interfaceC5441DicArr, boolean[] zArr, boolean[] zArr2, long j) {
        C5497DjZ c5497DjZ;
        long j2 = j;
        int length = interfaceC5441DicArr.length;
        int[] iArr = new int[length];
        int[] iArr2 = new int[length];
        for (int i = 0; i < length; i++) {
            InterfaceC6022DuF interfaceC6022DuF = interfaceC6022DuFArr[i];
            Integer num = interfaceC6022DuF == null ? null : this.A08.get(interfaceC6022DuF);
            int iA0J = -1;
            iArr[i] = num == null ? -1 : num.intValue();
            InterfaceC5441Dic interfaceC5441Dic = interfaceC5441DicArr[i];
            if (interfaceC5441Dic != null) {
                String str = interfaceC5441Dic.ALt().A03;
                iA0J = BV7.A0J(str, 0, str.indexOf(":"));
            }
            iArr2[i] = iA0J;
        }
        IdentityHashMap<InterfaceC6022DuF, Integer> identityHashMap = this.A08;
        identityHashMap.clear();
        InterfaceC6022DuF[] interfaceC6022DuFArr2 = new InterfaceC6022DuF[length];
        InterfaceC6022DuF[] interfaceC6022DuFArr3 = new InterfaceC6022DuF[length];
        InterfaceC5441Dic[] interfaceC5441DicArr2 = new InterfaceC5441Dic[length];
        InterfaceC6006Dtp[] interfaceC6006DtpArr = this.A04;
        int length2 = interfaceC6006DtpArr.length;
        ArrayList arrayListA11 = C60O.A11(length2);
        int i2 = 0;
        while (i2 < length2) {
            for (int i3 = 0; i3 < length; i3++) {
                interfaceC6022DuFArr3[i3] = iArr[i3] == i2 ? interfaceC6022DuFArr[i3] : null;
                if (iArr2[i3] == i2) {
                    InterfaceC5441Dic interfaceC5441Dic2 = interfaceC5441DicArr[i3];
                    interfaceC5441Dic2.getClass();
                    C5382DhZ c5382DhZ = this.A07.get(interfaceC5441Dic2.ALt());
                    c5382DhZ.getClass();
                    c5497DjZ = new C5497DjZ(c5382DhZ, interfaceC5441Dic2);
                } else {
                    c5497DjZ = null;
                }
                interfaceC5441DicArr2[i3] = c5497DjZ;
            }
            long jAcS = interfaceC6006DtpArr[i2].AcS(interfaceC6022DuFArr3, interfaceC5441DicArr2, zArr, zArr2, j2);
            if (i2 == 0) {
                j2 = jAcS;
            } else if (jAcS != j2) {
                throw C3cG.A0Q("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i4 = 0; i4 < length; i4++) {
                if (iArr2[i4] == i2) {
                    InterfaceC6022DuF interfaceC6022DuF2 = interfaceC6022DuFArr3[i4];
                    interfaceC6022DuF2.getClass();
                    interfaceC6022DuFArr2[i4] = interfaceC6022DuFArr3[i4];
                    C8j4.A1O(interfaceC6022DuF2, identityHashMap, i2);
                    z = true;
                } else if (iArr[i4] == i2) {
                    C1G.A08(AnonymousClass002.A1Y(interfaceC6022DuFArr3[i4]));
                }
            }
            if (z) {
                arrayListA11.add(interfaceC6006DtpArr[i2]);
            }
            i2++;
        }
        System.arraycopy(interfaceC6022DuFArr2, 0, interfaceC6022DuFArr, 0, length);
        this.A03 = (InterfaceC6006Dtp[]) arrayListA11.toArray(new InterfaceC6006Dtp[0]);
        this.A01 = AbstractC5653Dmh.A03(EnumC5618Dlz.A0c) ? new C5500Djc(arrayListA11, DPK.A00(new F5K(4), arrayListA11)) : this.A05.A7b(this.A03);
        return j2;
    }

    public C5498Dja(InterfaceC5512Djo interfaceC5512Djo, long[] jArr, InterfaceC6006Dtp... interfaceC6006DtpArr) {
        this.A05 = interfaceC5512Djo;
        this.A04 = interfaceC6006DtpArr;
        this.A01 = AbstractC5653Dmh.A03(EnumC5618Dlz.A0c) ? new C5500Djc(ImmutableList.of(), ImmutableList.of()) : interfaceC5512Djo.A7b(new InterfaceC5487DjP[0]);
        this.A08 = new IdentityHashMap<>();
        this.A03 = new InterfaceC6006Dtp[0];
        for (int i = 0; i < interfaceC6006DtpArr.length; i++) {
            if (jArr[i] != 0) {
                this.A04[i] = new C6002Dtl(interfaceC6006DtpArr[i], jArr[i]);
            }
        }
    }
}
