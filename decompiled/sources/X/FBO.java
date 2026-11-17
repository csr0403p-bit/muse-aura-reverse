package X;

import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.instagram.common.bloks.componentquery.cache.DiskCacheMetadata;
import com.instagram.common.bloks.payload.BloksComponentQueryResources;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

/* loaded from: classes6.dex */
public final class FBO implements Runnable {
    public static final String __redex_internal_original_name = "BloksComponentQueryStore$fetch$1";
    public final /* synthetic */ long A00;
    public final /* synthetic */ HlX A01;
    public final /* synthetic */ FBN A02;
    public final /* synthetic */ Long A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Map<String, Object> A05;
    public final /* synthetic */ Set<String> A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    public FBO(HlX hlX, FBN fbn, Long l, String str, Map map, Set set, long j, boolean z, boolean z2) {
        this.A02 = fbn;
        this.A04 = str;
        this.A05 = map;
        this.A06 = set;
        this.A00 = j;
        this.A01 = hlX;
        this.A07 = z;
        this.A03 = l;
        this.A08 = z2;
    }

    @Override // java.lang.Runnable
    public final void run() throws NoSuchAlgorithmException {
        EEO eeo;
        DiskCacheMetadata diskCacheMetadataA02;
        FBN fbn = this.A02;
        String str = this.A04;
        Map<String, Object> map = this.A05;
        Set<String> setKeySet = this.A06;
        long j = this.A00;
        HlX hlX = this.A01;
        if (setKeySet == null) {
            setKeySet = map.keySet();
        }
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        Iterator itA0n = AnonymousClass002.A0n(map);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            if (setKeySet.contains(entryA0l.getKey())) {
                AnonymousClass006.A1R(linkedHashMapA0j, entryA0l);
            }
        }
        FBU fbu = new FBU(hlX, new C7711FBj(j), str, map, setKeySet);
        boolean z = this.A08;
        Long l = this.A03;
        FBP fbp = new FBP(fbn, fbu, l, str, map, z);
        FBQ fbq = fbn.A03;
        boolean z2 = this.A07;
        Executor executor = fbn.A0A;
        FZG fzg = new FZG(fbp);
        FZS fzsA02 = FZS.A02(fbn, 44);
        FZS fzsA022 = FZS.A02(fbp, 45);
        String str2 = ((AbstractC7712FBk) fbu).A02;
        FBX fbx = new FBX(fbu.A00, fbu.A01, fbu.A02, fbu.A04);
        Map<String, Object> map2 = fbx.A04;
        C7403Euh c7403Euh = new C7403Euh(str2, map2);
        String strA01 = new C7403Euh(((AbstractC7712FBk) fbx).A02, map2).A01();
        C7711FBj c7711FBj = ((AbstractC7712FBk) fbu).A01;
        long j2 = c7711FBj.A00;
        StringBuilder sbA0g = C3cG.A0g(strA01);
        sbA0g.append(":");
        if (l != null) {
            sbA0g.append(j2);
            sbA0g.append(":refetch_if_older_than:");
            sbA0g.append(l);
        } else {
            sbA0g.append(j2);
        }
        String string = sbA0g.toString();
        Set<String> set = fbq.A03;
        if (set.contains(string)) {
            return;
        }
        set.add(string);
        FBL fbl = fbq.A01.A01;
        HlX hlX2 = ((AbstractC7712FBk) fbu).A00;
        FBR fbr = new FBR(fbq, fbu, fbl, l, string, str2, strA01, executor, fzsA02, fzg, fzsA022, z2);
        long jNow = fbl.A02.now();
        Hkm hkm = new Hkm("write_through_cache");
        hkm.A02("query_src", "cache");
        String strA012 = c7403Euh.A01();
        FBm fBmAgj = fbl.A01.Agj(c7403Euh);
        if (fBmAgj != null && (fBmAgj instanceof FBV)) {
            long j3 = fBmAgj.A01;
            if (c7711FBj.A01(fBmAgj.A02, j3, jNow)) {
                long j4 = jNow - fBmAgj.A00;
                hkm.A02("cache_src", AuraDeeplinkRouteMapper.MEMORY_ROUTE);
                hkm.A02("cache_age", String.valueOf(j4));
                hkm.A02("response_age", String.valueOf(jNow - j3));
                hkm.A02("response_timestamp", String.valueOf(j3));
                fbr.invoke(new C7706FBe(C3cG.A0r(fBmAgj, AbstractC10503Hng.A00(hkm, "origin", fBmAgj.A03.intValue() != 0 ? "unknown" : "network"))));
                return;
            }
        } else if (z2 && (eeo = fbl.A00) != null && (diskCacheMetadataA02 = eeo.A02(strA012)) != null && c7711FBj.A00(diskCacheMetadataA02.responseCreatedTimestampMs, jNow)) {
            BloksComponentQueryResources bloksComponentQueryResources = diskCacheMetadataA02.resources;
            long j5 = diskCacheMetadataA02.responseCreatedTimestampMs;
            fbr.invoke(new C7706FBe(C3cG.A0r(new FBZ(hlX2, bloksComponentQueryResources, C79.A0T, j5, j5), AbstractC10503Hng.A00(hkm, "cache_src", AuraDeeplinkRouteMapper.MEMORY_ROUTE))));
            eeo.A05.execute(new FutureTask(new HxJ(eeo, c7403Euh, new Hx1("disk_cache"), c7403Euh.A01(), executor, new C7702FBa(c7403Euh, hlX2, hkm, fbl, c7711FBj, fbr, jNow))));
            return;
        }
        fbr.invoke(null);
    }
}
