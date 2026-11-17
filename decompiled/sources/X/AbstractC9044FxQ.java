package X;

import com.facebook.aura.bloks.storage.AuraMetaFRLSecureTokenStore;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.FxQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9044FxQ {
    public static final Map<EnumC9054Fxc, Integer> A00;
    public static final Map<Integer, EnumC9054Fxc> A01;
    public static final Map<String, HiP> A02 = AGH.A0D(C3cG.A0r("steps", new HiP(AuraMetaFRLSecureTokenStore.JSON_KEY_COUNT, AuraMetaFRLSecureTokenStore.JSON_KEY_COUNT, C3cG.A0x(C8999Fwc.class), true)), C3cG.A0r("distance", new HiP("m", "m", C3cG.A0x(C9061Fxj.class), true)), C3cG.A0r("active_energy", new HiP("kcal", "kcal", C3cG.A0x(C9064Fxm.class), true)), C3cG.A0r("total_energy", A00(C9057Fxf.class, "kcal", true)), C3cG.A0r("basal_energy", new HiP("kcal/day", "kcal", C3cG.A0x(C9069Fxr.class), true)), C3cG.A0r("elevation_gained", A00(C9066Fxo.class, "m", true)), C3cG.A0r("flights_climbed", new HiP("floors", "floors", C3cG.A0x(C9001Fwe.class), true)), C3cG.A0r("heart_rate", new HiP("bpm", "bpm", C3cG.A0x(C9005Fwi.class), false)), C3cG.A0r("resting_heart_rate", A00(C8880Frt.class, "bpm", false)), C3cG.A0r("heart_rate_variability", new HiP("ms", "ms", C3cG.A0x(C8877Frq.class), false)), C3cG.A0r("vo2_max", new HiP("mL/kg/min", "mL/kg/min", C3cG.A0x(C8878Frr.class), false)), C3cG.A0r("body_mass", new HiP("kg", "kg", C3cG.A0x(C9067Fxp.class), false)), C3cG.A0r(HatchWebPageParserKt.HEIGHT_ATTR, A00(C9063Fxl.class, "m", false)), C3cG.A0r("body_fat_percentage", new HiP("%", "%", C3cG.A0x(C8952FuR.class), false)), C3cG.A0r("body_water_mass", A00(C9073Fxz.class, "kg", false)), C3cG.A0r("bone_mass", A00(C9074Fy0.class, "kg", false)), C3cG.A0r("lean_body_mass", A00(C9071Fxx.class, "kg", false)));

    static {
        C0924AIa c0924AIa = new C0924AIa();
        A02(EnumC9054Fxc.A0L, c0924AIa, 56);
        A02(EnumC9054Fxc.A0Z, c0924AIa, 79);
        A02(EnumC9054Fxc.A07, c0924AIa, 8);
        A02(EnumC9054Fxc.A0U, c0924AIa, 74);
        A02(EnumC9054Fxc.A0F, c0924AIa, 37);
        A02(EnumC9054Fxc.A0b, c0924AIa, 83);
        A02(EnumC9054Fxc.A0J, c0924AIa, 54);
        A02(EnumC9054Fxc.A09, c0924AIa, 25);
        A02(EnumC9054Fxc.A0S, c0924AIa, 68);
        A02(EnumC9054Fxc.A0X, c0924AIa, 81);
        A02(EnumC9054Fxc.A0E, c0924AIa, 36);
        A02(EnumC9054Fxc.A0I, c0924AIa, 48);
        A02(EnumC9054Fxc.A08, c0924AIa, 16);
        A02(EnumC9054Fxc.A04, c0924AIa, 5);
        A02(EnumC9054Fxc.A0Q, c0924AIa, 64);
        A02(EnumC9054Fxc.A0W, c0924AIa, 76);
        A02(EnumC9054Fxc.A03, c0924AIa, 4);
        A02(EnumC9054Fxc.A0B, c0924AIa, 32);
        A02(EnumC9054Fxc.A0G, c0924AIa, 44);
        A02(EnumC9054Fxc.A02, c0924AIa, 2);
        A02(EnumC9054Fxc.A05, c0924AIa, 11);
        A02(EnumC9054Fxc.A06, c0924AIa, 14);
        A02(EnumC9054Fxc.A0A, c0924AIa, 27);
        A02(EnumC9054Fxc.A0D, c0924AIa, 35);
        A02(EnumC9054Fxc.A0K, c0924AIa, 55);
        A02(EnumC9054Fxc.A0M, c0924AIa, 58);
        A02(EnumC9054Fxc.A0N, c0924AIa, 60);
        A02(EnumC9054Fxc.A0P, c0924AIa, 61);
        A02(EnumC9054Fxc.A0O, c0924AIa, 62);
        A02(EnumC9054Fxc.A0R, c0924AIa, 66);
        A02(EnumC9054Fxc.A0V, c0924AIa, 75);
        A02(EnumC9054Fxc.A0Y, c0924AIa, 78);
        A02(EnumC9054Fxc.A0C, c0924AIa, 34);
        A02(EnumC9054Fxc.A0T, c0924AIa, 72);
        A02(EnumC9054Fxc.A0a, c0924AIa, 80);
        A02(EnumC9054Fxc.A0H, c0924AIa, 0);
        C0924AIa c0924AIaA0K = AIW.A0K(c0924AIa);
        A00 = c0924AIaA0K;
        Set setEntrySet = c0924AIaA0K.entrySet();
        LinkedHashMap linkedHashMapA15 = C60O.A15(Hr7.A1C(setEntrySet));
        Iterator it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(it);
            BV6.A1E(entryA0l.getKey(), linkedHashMapA15, AnonymousClass001.A0F(entryA0l.getValue()));
        }
        A01 = linkedHashMapA15;
    }

    public static HiP A00(Class cls, String str, boolean z) {
        return new HiP(str, str, new C0861A6i(cls), z);
    }

    public static final List<C8964Fuh> A01(InterfaceC9011Fwo interfaceC9011Fwo, String str, String str2) {
        String str3;
        double dA00;
        Instant instant;
        Instant instant2;
        ZoneOffset zoneOffset;
        AnonymousClass005.A0x(interfaceC9011Fwo, str, str2);
        String str4 = interfaceC9011Fwo.AHf().A02.A00;
        if (interfaceC9011Fwo instanceof C8999Fwc) {
            C8999Fwc c8999Fwc = (C8999Fwc) interfaceC9011Fwo;
            str3 = c8999Fwc.A01.A05;
            dA00 = c8999Fwc.A00;
            instant = c8999Fwc.A03;
            instant2 = c8999Fwc.A02;
            zoneOffset = c8999Fwc.A05;
        } else if (interfaceC9011Fwo instanceof C9061Fxj) {
            C9061Fxj c9061Fxj = (C9061Fxj) interfaceC9011Fwo;
            str3 = c9061Fxj.A00.A05;
            dA00 = AbstractC7609F5w.A01(c9061Fxj.A01);
            instant = c9061Fxj.A03;
            instant2 = c9061Fxj.A02;
            zoneOffset = c9061Fxj.A05;
        } else if (interfaceC9011Fwo instanceof C9064Fxm) {
            C9064Fxm c9064Fxm = (C9064Fxm) interfaceC9011Fwo;
            str3 = c9064Fxm.A00.A05;
            dA00 = c9064Fxm.A01.A00();
            instant = c9064Fxm.A03;
            instant2 = c9064Fxm.A02;
            zoneOffset = c9064Fxm.A05;
        } else if (interfaceC9011Fwo instanceof C9057Fxf) {
            C9057Fxf c9057Fxf = (C9057Fxf) interfaceC9011Fwo;
            str3 = c9057Fxf.A00.A05;
            dA00 = c9057Fxf.A01.A00();
            instant = c9057Fxf.A03;
            instant2 = c9057Fxf.A02;
            zoneOffset = c9057Fxf.A05;
        } else if (interfaceC9011Fwo instanceof C9066Fxo) {
            C9066Fxo c9066Fxo = (C9066Fxo) interfaceC9011Fwo;
            str3 = c9066Fxo.A00.A05;
            dA00 = AbstractC7609F5w.A01(c9066Fxo.A01);
            instant = c9066Fxo.A03;
            instant2 = c9066Fxo.A02;
            zoneOffset = c9066Fxo.A05;
        } else if (interfaceC9011Fwo instanceof C9001Fwe) {
            C9001Fwe c9001Fwe = (C9001Fwe) interfaceC9011Fwo;
            str3 = c9001Fwe.A01.A05;
            dA00 = c9001Fwe.A00;
            instant = c9001Fwe.A03;
            instant2 = c9001Fwe.A02;
            zoneOffset = c9001Fwe.A05;
        } else {
            if (interfaceC9011Fwo instanceof C9005Fwi) {
                C9005Fwi c9005Fwi = (C9005Fwi) interfaceC9011Fwo;
                List<C8879Frs> list = c9005Fwi.A05;
                ArrayList arrayListA0i = AnonymousClass003.A0i(list);
                for (C8879Frs c8879Frs : list) {
                    String str5 = c9005Fwi.A00.A05;
                    Instant instant3 = c8879Frs.A01;
                    String strA0y = AnonymousClass006.A0y(instant3, "_", C3cG.A0g(str5));
                    double d = c8879Frs.A00;
                    ZoneOffset zoneOffset2 = c9005Fwi.A04;
                    arrayListA0i.add(new C8964Fuh(strA0y, str, str2, str4, zoneOffset2 != null ? zoneOffset2.getId() : null, instant3, instant3, null, d));
                }
                return arrayListA0i;
            }
            if (interfaceC9011Fwo instanceof C8880Frt) {
                C8880Frt c8880Frt = (C8880Frt) interfaceC9011Fwo;
                str3 = c8880Frt.A01.A05;
                dA00 = c8880Frt.A00;
                instant = c8880Frt.A02;
                instant2 = instant;
                zoneOffset = c8880Frt.A03;
            } else if (interfaceC9011Fwo instanceof C8877Frq) {
                C8877Frq c8877Frq = (C8877Frq) interfaceC9011Fwo;
                str3 = c8877Frq.A01.A05;
                dA00 = c8877Frq.A00;
                instant = c8877Frq.A02;
                instant2 = instant;
                zoneOffset = c8877Frq.A03;
            } else if (interfaceC9011Fwo instanceof C8878Frr) {
                C8878Frr c8878Frr = (C8878Frr) interfaceC9011Fwo;
                str3 = c8878Frr.A02.A05;
                dA00 = c8878Frr.A00;
                instant = c8878Frr.A03;
                instant2 = instant;
                zoneOffset = c8878Frr.A04;
            } else if (interfaceC9011Fwo instanceof C9067Fxp) {
                C9067Fxp c9067Fxp = (C9067Fxp) interfaceC9011Fwo;
                str3 = c9067Fxp.A00.A05;
                dA00 = c9067Fxp.A01.A00();
                instant = c9067Fxp.A02;
                instant2 = instant;
                zoneOffset = c9067Fxp.A03;
            } else if (interfaceC9011Fwo instanceof C9063Fxl) {
                C9063Fxl c9063Fxl = (C9063Fxl) interfaceC9011Fwo;
                str3 = c9063Fxl.A00.A05;
                dA00 = AbstractC7609F5w.A01(c9063Fxl.A01);
                instant = c9063Fxl.A02;
                instant2 = instant;
                zoneOffset = c9063Fxl.A03;
            } else if (interfaceC9011Fwo instanceof C8952FuR) {
                C8952FuR c8952FuR = (C8952FuR) interfaceC9011Fwo;
                str3 = c8952FuR.A00.A05;
                dA00 = c8952FuR.A01.A00;
                instant = c8952FuR.A02;
                instant2 = instant;
                zoneOffset = c8952FuR.A03;
            } else if (interfaceC9011Fwo instanceof C9073Fxz) {
                C9073Fxz c9073Fxz = (C9073Fxz) interfaceC9011Fwo;
                str3 = c9073Fxz.A00.A05;
                dA00 = c9073Fxz.A01.A00();
                instant = c9073Fxz.A02;
                instant2 = instant;
                zoneOffset = c9073Fxz.A03;
            } else if (interfaceC9011Fwo instanceof C9074Fy0) {
                C9074Fy0 c9074Fy0 = (C9074Fy0) interfaceC9011Fwo;
                str3 = c9074Fy0.A00.A05;
                dA00 = c9074Fy0.A01.A00();
                instant = c9074Fy0.A02;
                instant2 = instant;
                zoneOffset = c9074Fy0.A03;
            } else if (interfaceC9011Fwo instanceof C9071Fxx) {
                C9071Fxx c9071Fxx = (C9071Fxx) interfaceC9011Fwo;
                str3 = c9071Fxx.A00.A05;
                dA00 = c9071Fxx.A01.A00();
                instant = c9071Fxx.A02;
                instant2 = instant;
                zoneOffset = c9071Fxx.A03;
            } else {
                if (!(interfaceC9011Fwo instanceof C9069Fxr)) {
                    return C0881AGi.A00;
                }
                C9069Fxr c9069Fxr = (C9069Fxr) interfaceC9011Fwo;
                str3 = c9069Fxr.A00.A05;
                C9077Fy4 c9077Fy4 = c9069Fxr.A01;
                EnumC9091FyI enumC9091FyI = EnumC9091FyI.A02;
                EnumC9091FyI enumC9091FyI2 = c9077Fy4.A01;
                dA00 = c9077Fy4.A00;
                if (enumC9091FyI2 != enumC9091FyI) {
                    dA00 = (dA00 * enumC9091FyI2.A00()) / enumC9091FyI.A00();
                }
                instant = c9069Fxr.A02;
                instant2 = instant;
                zoneOffset = c9069Fxr.A03;
            }
        }
        return Collections.singletonList(new C8964Fuh(str3, str, str2, str4, zoneOffset != null ? zoneOffset.getId() : null, instant, instant2, null, dA00));
    }

    public static void A02(Object obj, C0924AIa c0924AIa, int i) {
        c0924AIa.put(obj, Integer.valueOf(i));
    }
}
