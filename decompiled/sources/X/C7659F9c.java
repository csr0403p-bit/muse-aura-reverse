package X;

import com.instagram.common.bloks.BloksParseResult;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.F9c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7659F9c implements FAR {
    public Map<String, FAA> A00;
    public final FBN A01;
    public final Map<String, Object> A02;
    public final C7665F9i A03;
    public final C7711FBj A04;
    public final String A05;
    public final String A06;
    public final Map<String, Object> A07;
    public final Map<String, Object> A08;

    /* JADX WARN: Incorrect types in method signature: (LX/F9i;Ljava/lang/String;Ljava/lang/String;LX/FBj;Ljava/util/Map<Ljava/lang/String;+Ljava/lang/Object;>;Ljava/util/Map<Ljava/lang/String;+Ljava/lang/Object;>;LX/FBN;)V */
    public C7659F9c(FBN fbn, C7665F9i c7665F9i, C7711FBj c7711FBj, String str, String str2, Map map, Map map2) {
        C7384Etj.A0Y(str, 1);
        this.A03 = c7665F9i;
        this.A06 = str;
        this.A05 = str2;
        this.A04 = c7711FBj;
        this.A08 = map;
        this.A07 = map2;
        this.A01 = fbn;
        this.A02 = c7665F9i != null ? A00(c7665F9i.A00, this, C79.A00) : null;
    }

    public static final Map A00(HoL hoL, C7659F9c c7659F9c, Integer num) {
        char c;
        HxE[] hxEArr;
        HxE hxEA0r;
        Integer num2 = num;
        if (!(hoL instanceof FAY)) {
            if (!(hoL instanceof Hnp)) {
                throw C3cG.A0q();
            }
            FFI.A01(null, FGI.A0U("Network request failed for component query with app id ", c7659F9c.A05, ". To find the server-side error trace, open Opes and filter to buenopaths containing that app id."), ((Hnp) hoL).A01);
            num2 = C79.A0C;
        }
        Map mapA00 = Htg.A00(hoL, num2);
        if (hoL instanceof FAZ) {
            if (c7659F9c.A00 == null) {
                Map<String, BloksParseResult> map = ((FAZ) hoL).A00.A00;
                LinkedHashMap linkedHashMapA0I = AIW.A0I(map);
                Iterator itA0n = AnonymousClass002.A0n(map);
                while (itA0n.hasNext()) {
                    Map.Entry entryA0l = C3cH.A0l(itA0n);
                    Object key = entryA0l.getKey();
                    BloksParseResult bloksParseResult = (BloksParseResult) entryA0l.getValue();
                    Map<String, Object> map2 = c7659F9c.A07;
                    linkedHashMapA0I.put(key, new FAA(bloksParseResult, C7648F8p.A02, c7659F9c.A06, map2));
                }
                c = 1;
                c7659F9c.A00 = linkedHashMapA0I;
            } else {
                c = 1;
                FFI.A01(null, "Attempting to re-initialize component templates for bind-based AsyncComponents. Component templates should only be initialized once from the ParseResult response.", null);
            }
            hxEArr = new HxE[2];
            Map<String, FAA> map3 = c7659F9c.A00;
            if (map3 == null) {
                C7384Etj.A0b("componentTemplates");
                throw F60.createAndThrow();
            }
            hxEA0r = C3cG.A0r("components", map3);
        } else {
            c = 1;
            hxEArr = new HxE[2];
            hxEA0r = C3cG.A0r("components", null);
        }
        hxEArr[0] = hxEA0r;
        hxEArr[c] = C3cG.A0r("info", mapA00);
        return AGH.A0D(hxEArr);
    }

    @Override // X.FAR
    public final /* bridge */ /* synthetic */ Object AGT() {
        return this.A02;
    }

    @Override // X.FAR
    public final Runnable A6c(FB4 fb4, String str) throws NoSuchAlgorithmException {
        C7708FBg c7708FBg;
        AnonymousClass003.A0x(str, fb4);
        if (this.A03 != null) {
            return null;
        }
        FBN fbn = this.A01;
        AbstractC7689FAi abstractC7689FAiA02 = fbn.A02(new FBX(HlX.A02, this.A04, this.A05, this.A08), new FYI(fb4, this, str, 1), false);
        if (!(abstractC7689FAiA02 instanceof C7665F9i)) {
            if (abstractC7689FAiA02 instanceof C7664F9h) {
                return ((C7664F9h) abstractC7689FAiA02).A00;
            }
            throw C3cG.A0q();
        }
        synchronized (fbn.A07) {
            c7708FBg = fbn.A00;
        }
        C7687FAg c7687FAg = new C7687FAg(c7708FBg);
        HoL hoL = ((C7665F9i) abstractC7689FAiA02).A00;
        fb4.AAj(c7687FAg, A00(hoL, this, hoL.A00() ? C79.A01 : C79.A0K), "acq", str);
        return null;
    }
}
