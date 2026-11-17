package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.DnL, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5682DnL implements InterfaceC5683DnM {
    public final List<InterfaceC5683DnM> A00;
    public final InterfaceC5683DnM A01;

    @Override // X.InterfaceC5683DnM
    public final void A3I(EnumC5684DnO enumC5684DnO) {
        C7384Etj.A0Y(enumC5684DnO, 0);
        this.A01.A3I(enumC5684DnO);
        Iterator itA02 = A02(this);
        while (itA02.hasNext()) {
            try {
                A01(itA02).A3I(enumC5684DnO);
            } catch (Exception unused) {
            }
        }
    }

    @Override // X.InterfaceC5683DnM
    public final void A3O(String str) {
        C7384Etj.A0Y(str, 0);
        this.A01.A3O(str);
        Iterator itA02 = A02(this);
        while (itA02.hasNext()) {
            try {
                A01(itA02).A3O(str);
            } catch (Exception unused) {
            }
        }
    }

    @Override // X.InterfaceC5683DnM
    public final void A3Q(String str) {
        C7384Etj.A0Y(str, 0);
        this.A01.A3Q(str);
        Iterator itA02 = A02(this);
        while (itA02.hasNext()) {
            try {
                A01(itA02).A3Q(str);
            } catch (Exception unused) {
            }
        }
    }

    @Override // X.InterfaceC5683DnM
    public final void A3Y(String str, int i, long j, long j2, long j3, long j4) {
        C7384Etj.A0Y(str, 5);
        this.A01.A3Y(str, i, j, j2, j3, j4);
        Iterator itA02 = A02(this);
        while (itA02.hasNext()) {
            try {
                A01(itA02).A3Y(str, i, j, j2, j3, j4);
            } catch (Exception unused) {
            }
        }
    }

    @Override // X.InterfaceC5683DnM
    public final void A3m(String str) {
        C7384Etj.A0Y(str, 0);
        this.A01.A3m(str);
        Iterator itA02 = A02(this);
        while (itA02.hasNext()) {
            try {
                A01(itA02).A3m(str);
            } catch (Exception unused) {
            }
        }
    }

    @Override // X.InterfaceC5683DnM
    public final void A3n(String str) {
        C7384Etj.A0Y(str, 0);
        this.A01.A3n(str);
        Iterator itA02 = A02(this);
        while (itA02.hasNext()) {
            try {
                A01(itA02).A3n(str);
            } catch (Exception unused) {
            }
        }
    }

    @Override // X.InterfaceC5683DnM
    public final void AAZ(C6154Dwx c6154Dwx) {
        C7384Etj.A0Y(c6154Dwx, 0);
        this.A01.AAZ(c6154Dwx);
        Iterator itA02 = A02(this);
        while (itA02.hasNext()) {
            try {
                A01(itA02).AAZ(c6154Dwx);
            } catch (Exception unused) {
            }
        }
    }

    @Override // X.InterfaceC5683DnM
    public final void AdW(InbandTelemetryBweEstimate inbandTelemetryBweEstimate) {
        C7384Etj.A0Y(inbandTelemetryBweEstimate, 0);
        this.A01.AdW(inbandTelemetryBweEstimate);
        Iterator itA02 = A02(this);
        while (itA02.hasNext()) {
            try {
                A01(itA02).AdW(inbandTelemetryBweEstimate);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Incorrect types in method signature: (JJJJLX/Dwx;[LX/Dwx;LX/Dwx;LX/Dwx;ILjava/util/List<+LX/Dls;>;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;F)V */
    @Override // X.InterfaceC5683DnM
    public final void Afw(C6154Dwx c6154Dwx, C6154Dwx c6154Dwx2, C6154Dwx c6154Dwx3, String str, String str2, String str3, String str4, String str5, List list, C6154Dwx[] c6154DwxArr, float f, int i, long j, long j2, long j3, long j4, boolean z) {
        C7384Etj.A0Y(c6154DwxArr, 5);
        this.A01.Afw(c6154Dwx, c6154Dwx2, c6154Dwx3, str, str2, str3, str4, str5, list, c6154DwxArr, f, i, j, j2, j3, j4, z);
        Iterator itA02 = A02(this);
        while (itA02.hasNext()) {
            try {
                A01(itA02).Afw(c6154Dwx, c6154Dwx2, c6154Dwx3, str, str2, str3, str4, str5, list, c6154DwxArr, f, i, j, j2, j3, j4, z);
            } catch (Exception unused) {
            }
        }
    }

    public static Iterator A02(C5682DnL c5682DnL) {
        return c5682DnL.A00.iterator();
    }

    @Override // X.InterfaceC5683DnM
    public final void A3Z(String str, int i, long j, long j2, long j3, long j4) {
        this.A01.A3Z(str, i, j, j2, j3, j4);
        Iterator itA02 = A02(this);
        while (itA02.hasNext()) {
            try {
                A01(itA02).A3Z(str, i, j, j2, j3, j4);
            } catch (Exception unused) {
            }
        }
    }

    @Override // X.InterfaceC5683DnM
    public final void A3v(long j, long j2, long j3) {
        this.A01.A3v(j, j2, j3);
        Iterator itA02 = A02(this);
        while (itA02.hasNext()) {
            try {
                A01(itA02).A3v(j, j2, j3);
            } catch (Exception unused) {
            }
        }
    }

    @Override // X.InterfaceC5683DnM
    public final Do4 AC7() {
        return this.A01.AC7();
    }

    @Override // X.InterfaceC5683DnM
    public final Map<String, String> ADp() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.A01.ADp());
        Iterator itA02 = A02(this);
        while (itA02.hasNext()) {
            try {
                Iterator itA0n = AnonymousClass002.A0n(A01(itA02).ADp());
                while (itA0n.hasNext()) {
                    Map.Entry entryA0l = C3cH.A0l(itA0n);
                    String strA0t = C60O.A0t(entryA0l);
                    String str = (String) entryA0l.getValue();
                    if (!linkedHashMap.containsKey(strA0t)) {
                        linkedHashMap.put(strA0t, str);
                    }
                }
            } catch (Exception unused) {
            }
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }

    @Override // X.InterfaceC5683DnM
    public final void Ahq(C5480DjH c5480DjH) {
        this.A01.Ahq(c5480DjH);
        Iterator itA02 = A02(this);
        while (itA02.hasNext()) {
            try {
                A01(itA02).Ahq(c5480DjH);
            } catch (Exception unused) {
            }
        }
    }

    @Override // X.InterfaceC5683DnM
    public final void Aht(C6154Dwx[] c6154DwxArr) {
        this.A01.Aht(c6154DwxArr);
        Iterator itA02 = A02(this);
        while (itA02.hasNext()) {
            try {
                A01(itA02).Aht(c6154DwxArr);
            } catch (Exception unused) {
            }
        }
    }

    @Override // X.InterfaceC5683DnM
    public final void Ahu(boolean z) {
        this.A01.Ahu(z);
        Iterator itA02 = A02(this);
        while (itA02.hasNext()) {
            try {
                A01(itA02).Ahu(z);
            } catch (Exception unused) {
            }
        }
    }

    @Override // X.InterfaceC5683DnM
    public final void Ahv(boolean z) {
        this.A01.Ahv(z);
        Iterator itA02 = A02(this);
        while (itA02.hasNext()) {
            try {
                A01(itA02).Ahv(z);
            } catch (Exception unused) {
            }
        }
    }

    @Override // X.InterfaceC5683DnM
    public final void Ai2(long j) {
        this.A01.Ai2(j);
        Iterator itA02 = A02(this);
        while (itA02.hasNext()) {
            try {
                A01(itA02).Ai2(j);
            } catch (Exception unused) {
            }
        }
    }

    @Override // X.InterfaceC5683DnM
    public final void Ai8(AbstractC6071DvB abstractC6071DvB) {
        this.A01.Ai8(abstractC6071DvB);
        Iterator itA02 = A02(this);
        while (itA02.hasNext()) {
            try {
                A01(itA02).Ai8(abstractC6071DvB);
            } catch (Exception unused) {
            }
        }
    }

    @Override // X.InterfaceC5683DnM
    public final void Ai9(AbstractC6071DvB abstractC6071DvB) {
        this.A01.Ai9(abstractC6071DvB);
        Iterator itA02 = A02(this);
        while (itA02.hasNext()) {
            try {
                A01(itA02).Ai9(abstractC6071DvB);
            } catch (Exception unused) {
            }
        }
    }

    public C5682DnL(InterfaceC5683DnM interfaceC5683DnM, List<? extends InterfaceC5683DnM> list) {
        this.A01 = interfaceC5683DnM;
        this.A00 = AbstractC0878AGe.A0X(list);
    }

    public static final InterfaceC5683DnM A00(InterfaceC5683DnM interfaceC5683DnM, List<? extends InterfaceC5683DnM> list) {
        if (list.isEmpty()) {
            return interfaceC5683DnM == null ? new C5694Dnb() : interfaceC5683DnM;
        }
        if (interfaceC5683DnM == null) {
            interfaceC5683DnM = new C5694Dnb();
        }
        return new C5682DnL(interfaceC5683DnM, list);
    }

    public static InterfaceC5683DnM A01(Iterator it) {
        return (InterfaceC5683DnM) it.next();
    }

    @Override // X.InterfaceC5683DnM
    public final void A3J(DnW dnW, String str) {
        AnonymousClass003.A0u(dnW, str);
        this.A01.A3J(dnW, str);
        Iterator itA02 = A02(this);
        while (itA02.hasNext()) {
            try {
                A01(itA02).A3J(dnW, str);
            } catch (Exception unused) {
            }
        }
    }

    @Override // X.InterfaceC5683DnM
    public final void A3K(DnW dnW, String str) {
        AnonymousClass003.A0u(dnW, str);
        this.A01.A3K(dnW, str);
        Iterator itA02 = A02(this);
        while (itA02.hasNext()) {
            try {
                A01(itA02).A3K(dnW, str);
            } catch (Exception unused) {
            }
        }
    }
}
