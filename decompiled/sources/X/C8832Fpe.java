package X;

import com.meta.maps.fancypins.FancyPin;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Fpe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8832Fpe {
    public int A00;
    public String A01;
    public String A02;
    public String A03;
    public List<String> A04;
    public List<String> A05;
    public FancyPin A07;
    public final C8833Fpf A09;
    public volatile HrT A0A;
    public Map<String, FancyPin> A06 = C9jH.A00;
    public final LinkedHashMap<String, String> A08 = C3cG.A0j();

    public final boolean A04(String str) {
        C8834Fpg c8834Fpg;
        List<String> list;
        HrT hrTA00 = A00(this);
        FancyPin fancyPin = this.A06.get(str);
        if (fancyPin != null) {
            FancyPin fancyPinA0P = AbstractC7611F5y.A0P(fancyPin);
            List<String> listClusterMemberPinIds = null;
            if (C7384Etj.areEqual(this.A01, str)) {
                list = this.A04;
            } else if (C7384Etj.areEqual(this.A03, str)) {
                list = this.A05;
            } else {
                listClusterMemberPinIds = ((C8830Fpc) hrTA00).A00.clusterMemberPinIds(str);
                c8834Fpg = new C8834Fpg(fancyPinA0P, listClusterMemberPinIds, true);
            }
            if (list != null) {
                listClusterMemberPinIds = AbstractC0878AGe.A0X(list);
            }
            c8834Fpg = new C8834Fpg(fancyPinA0P, listClusterMemberPinIds, true);
        } else {
            FancyPin fancyPinPin = ((C8830Fpc) hrTA00).A00.pin(str);
            if (fancyPinPin == null) {
                return false;
            }
            c8834Fpg = new C8834Fpg(fancyPinPin, null, false);
        }
        if (!c8834Fpg.A02) {
            A01(hrTA00, c8834Fpg);
            return true;
        }
        FancyPin fancyPin2 = this.A07;
        String str2 = this.A01;
        List<String> list2 = this.A04;
        FancyPin fancyPin3 = c8834Fpg.A00;
        this.A07 = fancyPin3;
        this.A01 = fancyPin3.id;
        List<String> list3 = c8834Fpg.A01;
        this.A04 = list3 != null ? AbstractC0878AGe.A0X(list3) : null;
        try {
            A01(hrTA00, c8834Fpg);
            return true;
        } finally {
            this.A07 = fancyPin2;
            this.A01 = str2;
            this.A04 = list2;
        }
    }

    private final void A01(HrT hrT, C8834Fpg c8834Fpg) {
        String str = c8834Fpg.A00.id;
        if (C7384Etj.areEqual(this.A02, str)) {
            return;
        }
        A02(this, null);
        if (this.A0A == hrT && this.A02 == null) {
            C8830Fpc c8830Fpc = (C8830Fpc) hrT;
            C7384Etj.A0Y(str, 0);
            FancyPin fancyPinPin = c8830Fpc.A00.pin(str);
            if (fancyPinPin == null) {
                FancyPin fancyPin = this.A06.get(str);
                if (fancyPin == null) {
                    return;
                } else {
                    fancyPinPin = AbstractC7611F5y.A0P(fancyPin);
                }
            }
            if (fancyPinPin != null) {
                this.A02 = str;
                String str2 = null;
                if (c8834Fpg.A02) {
                    str2 = str;
                }
                this.A03 = str2;
                List<String> list = c8834Fpg.A01;
                this.A05 = list != null ? AbstractC0878AGe.A0X(list) : null;
                c8830Fpc.A01.setPinAccessibilityDelegate(this.A09);
            }
        }
    }

    public static final void A02(C8832Fpe c8832Fpe, FancyPin fancyPin) {
        FancyPin fancyPin2;
        String str = c8832Fpe.A02;
        if (str != null) {
            String str2 = c8832Fpe.A03;
            List<String> list = c8832Fpe.A05;
            if (fancyPin == null || !str.equals(fancyPin.id)) {
                fancyPin = (str2 == null || !str2.equals(str) || (fancyPin2 = c8832Fpe.A06.get(str2)) == null) ? null : AbstractC7611F5y.A0P(fancyPin2);
            }
            c8832Fpe.A02 = null;
            c8832Fpe.A03 = null;
            c8832Fpe.A05 = null;
            HrT hrT = c8832Fpe.A0A;
            if (hrT != null) {
                ((C8830Fpc) hrT).A01.setPinAccessibilityDelegate(c8832Fpe.A09);
            }
            FancyPin fancyPin3 = c8832Fpe.A07;
            String str3 = c8832Fpe.A01;
            List<String> list2 = c8832Fpe.A04;
            c8832Fpe.A07 = fancyPin;
            if (str2 == null || !str2.equals(str)) {
                str2 = null;
            }
            c8832Fpe.A01 = str2;
            c8832Fpe.A04 = list != null ? AbstractC0878AGe.A0X(list) : null;
            c8832Fpe.A07 = fancyPin3;
            c8832Fpe.A01 = str3;
            c8832Fpe.A04 = list2;
        }
    }

    public final void A03() throws Throwable {
        HrT hrT = this.A0A;
        this.A0A = null;
        this.A02 = null;
        this.A03 = null;
        this.A05 = null;
        this.A07 = null;
        this.A01 = null;
        this.A04 = null;
        this.A06 = C9jH.A00;
        this.A08.clear();
        this.A00++;
        if (hrT != null) {
            try {
                ((C8830Fpc) hrT).A00.setRuntimeClusterPinsChangedListener(null);
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                ((C8830Fpc) hrT).A01.setPinAccessibilityDelegate(null);
                if (th == null) {
                    return;
                }
            } catch (Throwable th2) {
                if (th == null) {
                    throw th2;
                }
                if (th != th2) {
                    CU7.A01(th, th2);
                    throw th;
                }
            }
            throw th;
        }
    }

    public C8832Fpe(HrT hrT) {
        this.A0A = hrT;
        C8833Fpf c8833Fpf = new C8833Fpf(this);
        this.A09 = c8833Fpf;
        C8830Fpc c8830Fpc = (C8830Fpc) hrT;
        c8830Fpc.A01.setPinAccessibilityDelegate(c8833Fpf);
        c8830Fpc.A00.setRuntimeClusterPinsChangedListener(new FZG(6, hrT, this));
    }

    public static final HrT A00(C8832Fpe c8832Fpe) {
        if (!C3cH.A1K()) {
            throw C3cG.A0Q("FancyPinsController must be used on the Android main thread");
        }
        HrT hrT = c8832Fpe.A0A;
        if (hrT != null) {
            return hrT;
        }
        throw C3cG.A0Q("FancyPinsController is no longer valid");
    }
}
