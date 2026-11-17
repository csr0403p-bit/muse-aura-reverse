package X;

import com.facebook.aura.qpl.AuraQplNameProvider;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.flipper.core.FlipperObject;
import com.facebook.quicklog.QuickEventImpl;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class CP6 extends CP8 implements DI6 {
    public final AwakeTimeSinceBootClock A00;
    public final CFF<CP7> A01;
    public final ConcurrentHashMap<String, Integer> A02;
    public final ConcurrentHashMap<Integer, String> A03;
    public final AtomicInteger A04;
    public final F18 A05;
    public volatile boolean A06;
    public volatile QuickPerformanceLogger A07;

    @Override // X.CP8, X.DI6
    public final void onMarkEvent(COt cOt) {
        cOt.getMarkerId();
        CP7 cp7A00 = A00();
        List<String> listA0P = ((QuickEventImpl) cOt).A0R.A0P();
        if (listA0P != null) {
            cp7A00.A01 = BV4.A0t(listA0P);
        }
        cOt.getMarkerId();
        cp7A00.A02.add(new CPD());
        this.A01.A00(cp7A00);
    }

    @Override // X.CP8, X.DI6
    public final void onMarkerDrop(COt cOt) {
        cOt.getMarkerId();
        CP7 cp7A00 = A00();
        this.A00.nowNanos();
        List<String> listA0P = ((QuickEventImpl) cOt).A0R.A0P();
        if (listA0P != null) {
            cp7A00.A01 = BV4.A0t(listA0P);
        }
        this.A01.A00(cp7A00);
    }

    @Override // X.CP8, X.DI6
    public final void onMarkerStop(COt cOt) {
        QuickEventImpl quickEventImpl = (QuickEventImpl) cOt;
        cOt.getMarkerId();
        CP7 cp7A00 = A00();
        cp7A00.A03 = BV4.A0t(quickEventImpl.A0T);
        List<String> listA0P = quickEventImpl.A0R.A0P();
        if (listA0P != null) {
            cp7A00.A01 = BV4.A0t(listA0P);
        }
        this.A01.A00(cp7A00);
    }

    @Override // X.CP8, X.DI6
    public final void onMetadataCollected(COt cOt) throws JSONException {
        CPB cpb;
        JSONObject jSONObjectA18 = null;
        QuickEventImpl quickEventImpl = (QuickEventImpl) cOt;
        DHo dHo = quickEventImpl.A0A;
        this.A05.AMN();
        cOt.getMarkerId();
        if (dHo != null) {
            int i = dHo.A01;
            for (int i2 = 0; i2 < i; i2++) {
                CPI cpi = dHo.A04[i2];
                CP7 cp7A00 = A00();
                if (cpi != null) {
                    cpi.toString();
                }
                this.A01.A00(cp7A00);
            }
        }
        CP7 cp7A002 = A00();
        if (quickEventImpl.A06 != 0) {
            EtT etTAHg = cOt.AHg();
            ArrayList<Object> arrayList = etTAHg.A00;
            if (arrayList.isEmpty()) {
                return;
            }
            String str = null;
            boolean z = false;
            JSONObject jSONObjectA182 = BV4.A18();
            EtT.A00(etTAHg);
            ArrayList<String> arrayList2 = etTAHg.A01;
            int size = arrayList2.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                String str2 = arrayList2.get(i4);
                if (str2 != null) {
                    if (z) {
                        try {
                            jSONObjectA182.put(str, jSONObjectA18);
                        } catch (JSONException e) {
                            throw BV4.A0e(e);
                        }
                    }
                    str = str2;
                    jSONObjectA18 = BV4.A18();
                    z = true;
                } else {
                    int i5 = i3 + 1;
                    String str3 = (String) arrayList.get(i3);
                    i3 += 2;
                    Object obj = arrayList.get(i5);
                    if (obj instanceof String) {
                        try {
                            jSONObjectA18.put(str3, obj);
                        } catch (JSONException e2) {
                            throw BV4.A0e(e2);
                        }
                    } else if (obj instanceof Integer) {
                        try {
                            jSONObjectA18.put(str3, obj);
                        } catch (JSONException e3) {
                            throw BV4.A0e(e3);
                        }
                    } else if (obj instanceof Long) {
                        try {
                            jSONObjectA18.put(str3, obj);
                        } catch (JSONException e4) {
                            throw BV4.A0e(e4);
                        }
                    } else if (obj instanceof Double) {
                        Number number = (Number) obj;
                        try {
                            if (Double.isNaN(number.doubleValue())) {
                                number = null;
                            }
                            jSONObjectA18.put(str3, number);
                        } catch (JSONException e5) {
                            throw BV4.A0e(e5);
                        }
                    } else if (obj instanceof Boolean) {
                        try {
                            jSONObjectA18.put(str3, obj);
                        } catch (JSONException e6) {
                            throw BV4.A0e(e6);
                        }
                    } else {
                        if (obj instanceof String[]) {
                            cpb = new CPB();
                            for (String str4 : (String[]) obj) {
                                cpb.A00.put(str4);
                            }
                        } else if (obj instanceof int[]) {
                            cpb = new CPB();
                            for (int i6 : (int[]) obj) {
                                cpb.A00.put(Integer.valueOf(i6));
                            }
                        } else if (obj instanceof long[]) {
                            cpb = new CPB();
                            for (long j : (long[]) obj) {
                                cpb.A00.put(Long.valueOf(j));
                            }
                        } else {
                            continue;
                        }
                        try {
                            jSONObjectA18.put(str3, cpb.A00);
                        } catch (JSONException e7) {
                            throw BV4.A0e(e7);
                        }
                    }
                }
            }
            if (z) {
                try {
                    jSONObjectA182.put(str, jSONObjectA18);
                } catch (JSONException e8) {
                    throw BV4.A0e(e8);
                }
            }
            cp7A002.A00 = new FlipperObject(jSONObjectA182);
            this.A01.A00(cp7A002);
        }
    }

    public CP6(AuraQplNameProvider auraQplNameProvider, AwakeTimeSinceBootClock awakeTimeSinceBootClock) {
        C7603F5q c7603F5q = new C7603F5q(auraQplNameProvider, 14);
        this.A04 = BV4.A13(-1);
        this.A02 = C60O.A1C();
        this.A03 = C60O.A1C();
        this.A06 = true;
        this.A01 = new CFF<>();
        this.A00 = awakeTimeSinceBootClock;
        this.A05 = c7603F5q;
    }

    public static CP7 A00() {
        CP7 cp7 = new CP7();
        cp7.A02 = new ArrayList();
        return cp7;
    }

    @Override // X.CP8, X.DI6
    public final CP9 getListenerFlags() {
        return null;
    }

    @Override // X.DI6
    public final CP0 getListenerMarkers() {
        if (!this.A06) {
            return CP0.A04;
        }
        int[] iArr = {-1};
        return new CP0(iArr, iArr);
    }

    @Override // X.DI6
    public final String getName() {
        return "flipper";
    }

    @Override // X.CP8, X.DI6
    public final void onMarkerPoint(COt cOt, int i, long j, boolean z) {
        cOt.getMarkerId();
        CP7 cp7A00 = A00();
        QuickEventImpl quickEventImpl = (QuickEventImpl) cOt;
        DHo dHo = quickEventImpl.A0A;
        if (dHo == null) {
            dHo = new DHo();
            quickEventImpl.A0A = dHo;
        }
        if (dHo == null) {
            dHo = new DHo();
            quickEventImpl.A0A = dHo;
        }
        CPI cpi = dHo.A04[i];
        if (cpi != null) {
            cpi.toString();
        }
        this.A01.A00(cp7A00);
    }

    @Override // X.CP8, X.DI6
    public final void onMarkerRestart(COt cOt) {
        onMarkerStart(cOt);
    }

    @Override // X.CP8, X.DI6
    public final void onMarkerStart(COt cOt) {
        cOt.getMarkerId();
        CP7 cp7A00 = A00();
        cOt.getMarkerId();
        cp7A00.A02.add(new CPD());
        this.A01.A00(cp7A00);
    }

    @Override // X.CP8, X.DI6
    public final void setQuickPerformanceLogger(QuickPerformanceLogger quickPerformanceLogger) {
        this.A07 = quickPerformanceLogger;
    }
}
