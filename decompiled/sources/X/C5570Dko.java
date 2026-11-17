package X;

import androidx.media3.common.DrmInitData;
import java.util.ArrayList;
import java.util.UUID;

/* renamed from: X.Dko, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5570Dko implements InterfaceC5563Dkg {
    public C6154Dwx A00;
    public InterfaceC5563Dkg A01;
    public long A02;
    public final int A03;
    public final int A04;
    public final C6154Dwx A05;
    public final C5551DkU A06 = new C5551DkU();

    public final void A00(InterfaceC5529Dk6 interfaceC5529Dk6, long j) {
        if (interfaceC5529Dk6 == null) {
            this.A01 = this.A06;
            return;
        }
        this.A02 = j;
        InterfaceC5563Dkg interfaceC5563DkgAhC = interfaceC5529Dk6.AhC(this.A03, this.A04);
        this.A01 = interfaceC5563DkgAhC;
        C6154Dwx c6154Dwx = this.A00;
        if (c6154Dwx != null) {
            interfaceC5563DkgAhC.ABq(c6154Dwx);
        }
    }

    @Override // X.InterfaceC5563Dkg
    public final void ABq(C6154Dwx c6154Dwx) {
        String str;
        int i;
        C6154Dwx c6154DwxA0U = c6154Dwx;
        C6154Dwx c6154Dwx2 = this.A05;
        if (c6154Dwx2 != null) {
            C6154Dwx c6154DwxA0U2 = c6154DwxA0U;
            if (c6154DwxA0U != c6154Dwx2) {
                AbstractC6161Dx4.A01(c6154DwxA0U.A0b);
                String str2 = c6154Dwx2.A0Y;
                String str3 = c6154Dwx2.A0Z;
                String str4 = str3;
                if (str3 == null) {
                    str4 = c6154DwxA0U.A0Z;
                }
                String str5 = c6154DwxA0U.A0a;
                String str6 = str5;
                if (str5 == null) {
                    str6 = c6154Dwx2.A0a;
                }
                int i2 = c6154DwxA0U.A04;
                int i3 = i2;
                if (i2 == -1) {
                    i3 = c6154Dwx2.A04;
                }
                int i4 = c6154DwxA0U.A0I;
                if (i4 == -1) {
                    i4 = c6154Dwx2.A0I;
                }
                String str7 = c6154DwxA0U.A0W;
                if (str7 == null) {
                    str7 = c6154Dwx2.A0W;
                }
                C5402Dhv c5402DhvA01 = c6154DwxA0U.A0U;
                if (c5402DhvA01 == null) {
                    c5402DhvA01 = c6154Dwx2.A0U;
                } else {
                    C5402Dhv c5402Dhv = c6154Dwx2.A0U;
                    if (c5402Dhv != null) {
                        c5402DhvA01 = c5402DhvA01.A01(c5402Dhv.A01);
                    }
                }
                float f = c6154DwxA0U.A01;
                if (f == -1.0f) {
                    f = c6154Dwx2.A01;
                }
                int i5 = c6154DwxA0U.A0M | c6154Dwx2.A0M;
                int i6 = c6154DwxA0U.A0J | c6154Dwx2.A0J;
                DrmInitData drmInitData = c6154Dwx2.A0T;
                DrmInitData drmInitData2 = c6154DwxA0U.A0T;
                ArrayList arrayListA0h = C3cG.A0h();
                if (drmInitData != null) {
                    str = drmInitData.A02;
                    for (DrmInitData.SchemeData schemeData : drmInitData.A03) {
                        if (schemeData.A04 != null) {
                            arrayListA0h.add(schemeData);
                        }
                    }
                } else {
                    str = null;
                }
                if (drmInitData2 != null) {
                    if (str == null) {
                        str = drmInitData2.A02;
                    }
                    int size = arrayListA0h.size();
                    for (DrmInitData.SchemeData schemeData2 : drmInitData2.A03) {
                        if (schemeData2.A04 != null) {
                            UUID uuid = schemeData2.A03;
                            while (true) {
                                if (i >= size) {
                                    arrayListA0h.add(schemeData2);
                                    break;
                                }
                                i = ((DrmInitData.SchemeData) arrayListA0h.get(i)).A03.equals(uuid) ? 0 : i + 1;
                            }
                        }
                    }
                }
                DrmInitData drmInitData3 = arrayListA0h.isEmpty() ? null : new DrmInitData(str, (DrmInitData.SchemeData[]) arrayListA0h.toArray(new DrmInitData.SchemeData[0]), false);
                C6162Dx5 c6162Dx5A01 = C6162Dx5.A01(c6154DwxA0U);
                c6162Dx5A01.A0W = str2;
                c6162Dx5A01.A0X = str4;
                c6162Dx5A01.A0Y = str6;
                c6162Dx5A01.A0K = i5;
                c6162Dx5A01.A0H = i6;
                c6162Dx5A01.A03 = i3;
                c6162Dx5A01.A0G = i4;
                c6162Dx5A01.A0U = str7;
                c6162Dx5A01.A0S = c5402DhvA01;
                c6162Dx5A01.A04(drmInitData3);
                c6162Dx5A01.A00 = f;
                c6154DwxA0U2 = BV6.A0U(c6162Dx5A01);
            }
            Dl5 dl5A00 = Dl5.A00(c6154DwxA0U);
            Dl5 dl5A002 = Dl5.A00(c6154Dwx2);
            C6162Dx5 c6162Dx5A012 = C6162Dx5.A01(c6154DwxA0U2);
            C5583Dl6 c5583Dl6 = new C5583Dl6(dl5A00);
            c5583Dl6.A04 = dl5A002.A05;
            String str8 = dl5A00.A08;
            if (str8 == null) {
                str8 = dl5A002.A08;
            }
            c5583Dl6.A07 = str8;
            String str9 = dl5A00.A07;
            if (str9 == null) {
                str9 = dl5A002.A07;
            }
            c5583Dl6.A06 = str9;
            String str10 = dl5A00.A0B;
            if (str10 == null) {
                str10 = dl5A002.A0B;
            }
            c5583Dl6.A0A = str10;
            String str11 = dl5A00.A0A;
            if (str11 == null) {
                str11 = dl5A002.A0A;
            }
            c5583Dl6.A09 = str11;
            int i7 = dl5A00.A01;
            if (i7 == -1) {
                i7 = dl5A002.A01;
            }
            c5583Dl6.A00 = i7;
            c6162Dx5A012.A0T = new Dl5(c5583Dl6);
            c6154DwxA0U = BV6.A0U(c6162Dx5A012);
        }
        this.A00 = c6154DwxA0U;
        this.A01.ABq(c6154DwxA0U);
    }

    @Override // X.InterfaceC5563Dkg
    public final /* synthetic */ int Abu(C1L c1l, int i, boolean z) {
        return this.A01.Abu(c1l, i, z);
    }

    @Override // X.InterfaceC5563Dkg
    public final /* synthetic */ void Abv(E1P e1p, int i) {
        this.A01.Abv(e1p, i);
    }

    @Override // X.InterfaceC5563Dkg
    public final void Abw(E1P e1p, int i, int i2) {
        this.A01.Abv(e1p, i);
    }

    @Override // X.InterfaceC5563Dkg
    public final int Aby(C1L c1l, int i, int i2, boolean z) {
        return this.A01.Abu(c1l, i, z);
    }

    @Override // X.InterfaceC5563Dkg
    public final void Abz(DjB djB, int i, int i2, int i3, long j) {
        long j2 = this.A02;
        if (j2 != -9223372036854775807L && j >= j2) {
            this.A01 = this.A06;
        }
        this.A01.Abz(djB, i, i2, i3, j);
    }

    public C5570Dko(C6154Dwx c6154Dwx, int i, int i2) {
        this.A03 = i;
        this.A04 = i2;
        this.A05 = c6154Dwx;
    }

    @Override // X.InterfaceC5563Dkg
    public final /* synthetic */ void A9m(long j) {
    }
}
