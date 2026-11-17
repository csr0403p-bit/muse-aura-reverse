package X;

import android.content.Context;
import android.os.Handler;
import android.os.Trace;
import com.facebook.aura.localbrowser.ManagedBrowserSitePolicy;
import com.facebook.debug.tracer.Tracer;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class DDR {
    public static final char[] A0M = ManagedBrowserSitePolicy.HEX.toCharArray();
    public int A00;
    public C0S A01;
    public DDK A02;
    public DDV A03;
    public C0t A04;
    public C3168C0w A05;
    public C3157C0f A06;
    public C3167C0s A07;
    public Map<String, C1J> A08;
    public boolean A09;
    public final Handler A0A;
    public final HeroPlayerSetting A0B;
    public final Map<?, ?> A0C;
    public final F0C A0D;
    public final Context A0E;
    public final InterfaceC4887DDb A0F;
    public final C12 A0G;
    public final C5092DXa A0H;
    public final C3167C0s A0I;
    public final C5596Dlb A0J;
    public final C5496DjY A0K;
    public final ThreadLocal<byte[]> A0L;

    public final synchronized C3157C0f A02() {
        if (!this.A0B.cache.onlyRunStartupCriticalCacheInit && this.A06 == null) {
            A00();
        }
        return this.A06;
    }

    public DDR(Context context, Handler handler, InterfaceC4887DDb interfaceC4887DDb, DDV ddv, C12 c12, C5092DXa c5092DXa, C3167C0s c3167C0s, C5596Dlb c5596Dlb, C5496DjY c5496DjY, HeroPlayerSetting heroPlayerSetting, Map map) {
        C0S c0y;
        AnonymousClass005.A0x(context, ddv, map);
        AnonymousClass002.A1F(handler, 6, c5496DjY);
        this.A0E = context;
        this.A03 = ddv;
        this.A0C = map;
        this.A0B = heroPlayerSetting;
        this.A0J = c5596Dlb;
        this.A0I = c3167C0s;
        this.A0A = handler;
        this.A0G = c12;
        this.A0K = c5496DjY;
        this.A0F = interfaceC4887DDb;
        this.A0H = c5092DXa;
        this.A0L = new ThreadLocal<>();
        this.A0D = C5322DgG.A01((Function0) new EQf(this, 13));
        Trace.beginSection("CacheManager.init");
        try {
            this.A07 = c3167C0s;
            this.A08 = BV4.A11();
            DDV ddv2 = this.A03;
            int i = ddv2.A01;
            this.A00 = i;
            long j = i;
            DDZ ddz = ddv2.A02;
            C3168C0w c3168C0w = ddz.A02 ? new C3168C0w(ddz.A00, Long.valueOf(ddz.A01)) : null;
            this.A05 = c3168C0w;
            DDV ddv3 = this.A03;
            if (ddv3.A06) {
                DDS dds = heroPlayerSetting.cache;
                c0y = new C3169C0x(c3168C0w, c12, (float) dds.perVideoLRUMaxPercent, (float) dds.protectPrefetchCacheMaxPercent, dds.perVideoLRUMinOffset, dds.protectPrefetchCacheMinOffset, j, dds.trackLruEvictionsFix, dds.deferCacheInitUnlinks, dds.dedupeSpanRemovedNotification);
            } else if (ddv3.A05) {
                DDS dds2 = heroPlayerSetting.cache;
                c0y = new C0Z(dds2.perVideoLRUMaxPercent, dds2.perVideoLRUMinOffset, j);
            } else {
                c0y = new C0Y(j);
            }
            DDV ddv4 = this.A03;
            if (ddv4.A04) {
                String str = ddv4.A00;
                c0y = new C0W(c0y, this.A07, heroPlayerSetting, str == null ? "" : str);
            }
            this.A01 = c0y;
            if (!ddv4.A03) {
                synchronized (this) {
                    if (this.A06 == null) {
                        A00();
                    }
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A00() {
        /*
            Method dump skipped, instructions count: 651
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DDR.A00():void");
    }

    public final void A03() {
        Long l;
        InterfaceC3158C0g interfaceC3158C0gA00;
        Tracer.A01("CacheManager.runTimeToLiveCacheEviction");
        try {
            C3157C0f c3157C0fA02 = A02();
            if (c3157C0fA02 != null) {
                DDY ddy = (DDY) this.A0D.getValue();
                HeroPlayerSetting heroPlayerSetting = this.A0B;
                long j = heroPlayerSetting.cache.timeToLiveMs;
                Set<String> setAGr = c3157C0fA02.AGr();
                if (setAGr != null && !setAGr.isEmpty()) {
                    Iterator<String> it = setAGr.iterator();
                    while (it.hasNext()) {
                        NavigableSet<C0J> navigableSetADD = c3157C0fA02.ADD(AnonymousClass005.A0j(it));
                        if (navigableSetADD != null && !navigableSetADD.isEmpty()) {
                            Iterator<C0J> it2 = navigableSetADD.iterator();
                            C7384Etj.A0U(it2);
                            while (it2.hasNext()) {
                                C0J next = it2.next();
                                C3168C0w c3168C0w = ddy.A01;
                                if (c3168C0w != null) {
                                    C7384Etj.A0X(next);
                                    if (c3168C0w.A02(next)) {
                                    }
                                }
                                C7384Etj.A0X(next);
                                if (System.currentTimeMillis() - next.A02 >= j) {
                                    c3157C0fA02.A04(next, "ttl_eviction");
                                }
                            }
                        }
                    }
                    C3168C0w c3168C0w2 = ddy.A01;
                    if (c3168C0w2 != null && (l = c3168C0w2.A02) != null) {
                        long jLongValue = l.longValue();
                        if (jLongValue > 0 && (interfaceC3158C0gA00 = C3168C0w.A00(c3157C0fA02, c3168C0w2)) != null) {
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            ArrayList arrayListA0h = C3cG.A0h();
                            try {
                                synchronized (interfaceC3158C0gA00) {
                                    synchronized (c3168C0w2.A03) {
                                        LinkedHashSet linkedHashSetA0k = C3cG.A0k();
                                        Iterator itA0N = C7384Etj.A0N(c3168C0w2.A06);
                                        while (itA0N.hasNext()) {
                                            C0J c0j = (C0J) C7384Etj.A0F(itA0N);
                                            if (jCurrentTimeMillis - c0j.A02 < jLongValue) {
                                                break;
                                            }
                                            String strA00 = AbstractC3160C0i.A00(c0j.A06);
                                            if (strA00 != null) {
                                                linkedHashSetA0k.add(strA00);
                                            }
                                        }
                                        Iterator it3 = linkedHashSetA0k.iterator();
                                        while (it3.hasNext()) {
                                            C3171C0z c3171C0zA01 = C3168C0w.A01(interfaceC3158C0gA00, c3168C0w2, AnonymousClass005.A0j(it3), "ttl_eviction");
                                            if (c3171C0zA01 != null) {
                                                arrayListA0h.add(c3171C0zA01);
                                            }
                                        }
                                    }
                                }
                            } finally {
                                Iterator it4 = arrayListA0h.iterator();
                                while (it4.hasNext()) {
                                    BV7.A1M(it4);
                                }
                            }
                        }
                    }
                }
                this.A0A.postDelayed(new DDX(this), heroPlayerSetting.cache.timeToLiveEvictionIntervalForegroundMs);
            }
        } finally {
            Tracer.A00();
        }
    }

    public final boolean A04(C0J c0j) {
        File parentFile;
        C3168C0w c3168C0w = this.A05;
        if (c3168C0w != null) {
            return c3168C0w.A02(c0j);
        }
        File file = c0j.A05;
        return "offline".equals((file == null || (parentFile = file.getParentFile()) == null) ? null : parentFile.getName());
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0282 A[Catch: all -> 0x0339, TryCatch #0 {all -> 0x0339, blocks: (B:3:0x0016, B:7:0x0033, B:9:0x003d, B:11:0x0043, B:13:0x006a, B:15:0x0072, B:29:0x00b8, B:31:0x00bc, B:33:0x00c0, B:35:0x00c8, B:39:0x00d1, B:41:0x00d5, B:44:0x00ef, B:46:0x00f7, B:48:0x00fd, B:50:0x0105, B:52:0x010b, B:54:0x0111, B:55:0x0115, B:57:0x011b, B:58:0x011f, B:62:0x012d, B:64:0x015e, B:67:0x0166, B:69:0x0177, B:71:0x017b, B:73:0x017f, B:74:0x0185, B:83:0x01a3, B:108:0x0270, B:112:0x0287, B:114:0x029d, B:116:0x02a1, B:118:0x02a7, B:121:0x02b2, B:119:0x02ac, B:125:0x02ba, B:127:0x02c2, B:130:0x02d9, B:132:0x02e5, B:133:0x02e9, B:135:0x02f1, B:136:0x02fb, B:140:0x0326, B:142:0x032c, B:129:0x02ca, B:111:0x0282, B:85:0x01a9, B:87:0x01b6, B:88:0x01ba, B:90:0x01be, B:91:0x01c2, B:96:0x01e7, B:97:0x022a, B:99:0x0230, B:100:0x0241, B:102:0x0246, B:107:0x0258, B:75:0x0189, B:77:0x018d, B:78:0x0195, B:80:0x0199, B:18:0x0079, B:20:0x007d, B:22:0x0081, B:24:0x0085, B:26:0x00b0, B:63:0x0145), top: B:150:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02a7 A[Catch: all -> 0x0339, TryCatch #0 {all -> 0x0339, blocks: (B:3:0x0016, B:7:0x0033, B:9:0x003d, B:11:0x0043, B:13:0x006a, B:15:0x0072, B:29:0x00b8, B:31:0x00bc, B:33:0x00c0, B:35:0x00c8, B:39:0x00d1, B:41:0x00d5, B:44:0x00ef, B:46:0x00f7, B:48:0x00fd, B:50:0x0105, B:52:0x010b, B:54:0x0111, B:55:0x0115, B:57:0x011b, B:58:0x011f, B:62:0x012d, B:64:0x015e, B:67:0x0166, B:69:0x0177, B:71:0x017b, B:73:0x017f, B:74:0x0185, B:83:0x01a3, B:108:0x0270, B:112:0x0287, B:114:0x029d, B:116:0x02a1, B:118:0x02a7, B:121:0x02b2, B:119:0x02ac, B:125:0x02ba, B:127:0x02c2, B:130:0x02d9, B:132:0x02e5, B:133:0x02e9, B:135:0x02f1, B:136:0x02fb, B:140:0x0326, B:142:0x032c, B:129:0x02ca, B:111:0x0282, B:85:0x01a9, B:87:0x01b6, B:88:0x01ba, B:90:0x01be, B:91:0x01c2, B:96:0x01e7, B:97:0x022a, B:99:0x0230, B:100:0x0241, B:102:0x0246, B:107:0x0258, B:75:0x0189, B:77:0x018d, B:78:0x0195, B:80:0x0199, B:18:0x0079, B:20:0x007d, B:22:0x0081, B:24:0x0085, B:26:0x00b0, B:63:0x0145), top: B:150:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02ac A[Catch: all -> 0x0339, TryCatch #0 {all -> 0x0339, blocks: (B:3:0x0016, B:7:0x0033, B:9:0x003d, B:11:0x0043, B:13:0x006a, B:15:0x0072, B:29:0x00b8, B:31:0x00bc, B:33:0x00c0, B:35:0x00c8, B:39:0x00d1, B:41:0x00d5, B:44:0x00ef, B:46:0x00f7, B:48:0x00fd, B:50:0x0105, B:52:0x010b, B:54:0x0111, B:55:0x0115, B:57:0x011b, B:58:0x011f, B:62:0x012d, B:64:0x015e, B:67:0x0166, B:69:0x0177, B:71:0x017b, B:73:0x017f, B:74:0x0185, B:83:0x01a3, B:108:0x0270, B:112:0x0287, B:114:0x029d, B:116:0x02a1, B:118:0x02a7, B:121:0x02b2, B:119:0x02ac, B:125:0x02ba, B:127:0x02c2, B:130:0x02d9, B:132:0x02e5, B:133:0x02e9, B:135:0x02f1, B:136:0x02fb, B:140:0x0326, B:142:0x032c, B:129:0x02ca, B:111:0x0282, B:85:0x01a9, B:87:0x01b6, B:88:0x01ba, B:90:0x01be, B:91:0x01c2, B:96:0x01e7, B:97:0x022a, B:99:0x0230, B:100:0x0241, B:102:0x0246, B:107:0x0258, B:75:0x0189, B:77:0x018d, B:78:0x0195, B:80:0x0199, B:18:0x0079, B:20:0x007d, B:22:0x0081, B:24:0x0085, B:26:0x00b0, B:63:0x0145), top: B:150:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02ca A[Catch: all -> 0x0339, TryCatch #0 {all -> 0x0339, blocks: (B:3:0x0016, B:7:0x0033, B:9:0x003d, B:11:0x0043, B:13:0x006a, B:15:0x0072, B:29:0x00b8, B:31:0x00bc, B:33:0x00c0, B:35:0x00c8, B:39:0x00d1, B:41:0x00d5, B:44:0x00ef, B:46:0x00f7, B:48:0x00fd, B:50:0x0105, B:52:0x010b, B:54:0x0111, B:55:0x0115, B:57:0x011b, B:58:0x011f, B:62:0x012d, B:64:0x015e, B:67:0x0166, B:69:0x0177, B:71:0x017b, B:73:0x017f, B:74:0x0185, B:83:0x01a3, B:108:0x0270, B:112:0x0287, B:114:0x029d, B:116:0x02a1, B:118:0x02a7, B:121:0x02b2, B:119:0x02ac, B:125:0x02ba, B:127:0x02c2, B:130:0x02d9, B:132:0x02e5, B:133:0x02e9, B:135:0x02f1, B:136:0x02fb, B:140:0x0326, B:142:0x032c, B:129:0x02ca, B:111:0x0282, B:85:0x01a9, B:87:0x01b6, B:88:0x01ba, B:90:0x01be, B:91:0x01c2, B:96:0x01e7, B:97:0x022a, B:99:0x0230, B:100:0x0241, B:102:0x0246, B:107:0x0258, B:75:0x0189, B:77:0x018d, B:78:0x0195, B:80:0x0199, B:18:0x0079, B:20:0x007d, B:22:0x0081, B:24:0x0085, B:26:0x00b0, B:63:0x0145), top: B:150:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02e5 A[Catch: all -> 0x0339, TryCatch #0 {all -> 0x0339, blocks: (B:3:0x0016, B:7:0x0033, B:9:0x003d, B:11:0x0043, B:13:0x006a, B:15:0x0072, B:29:0x00b8, B:31:0x00bc, B:33:0x00c0, B:35:0x00c8, B:39:0x00d1, B:41:0x00d5, B:44:0x00ef, B:46:0x00f7, B:48:0x00fd, B:50:0x0105, B:52:0x010b, B:54:0x0111, B:55:0x0115, B:57:0x011b, B:58:0x011f, B:62:0x012d, B:64:0x015e, B:67:0x0166, B:69:0x0177, B:71:0x017b, B:73:0x017f, B:74:0x0185, B:83:0x01a3, B:108:0x0270, B:112:0x0287, B:114:0x029d, B:116:0x02a1, B:118:0x02a7, B:121:0x02b2, B:119:0x02ac, B:125:0x02ba, B:127:0x02c2, B:130:0x02d9, B:132:0x02e5, B:133:0x02e9, B:135:0x02f1, B:136:0x02fb, B:140:0x0326, B:142:0x032c, B:129:0x02ca, B:111:0x0282, B:85:0x01a9, B:87:0x01b6, B:88:0x01ba, B:90:0x01be, B:91:0x01c2, B:96:0x01e7, B:97:0x022a, B:99:0x0230, B:100:0x0241, B:102:0x0246, B:107:0x0258, B:75:0x0189, B:77:0x018d, B:78:0x0195, B:80:0x0199, B:18:0x0079, B:20:0x007d, B:22:0x0081, B:24:0x0085, B:26:0x00b0, B:63:0x0145), top: B:150:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02f1 A[Catch: all -> 0x0339, TryCatch #0 {all -> 0x0339, blocks: (B:3:0x0016, B:7:0x0033, B:9:0x003d, B:11:0x0043, B:13:0x006a, B:15:0x0072, B:29:0x00b8, B:31:0x00bc, B:33:0x00c0, B:35:0x00c8, B:39:0x00d1, B:41:0x00d5, B:44:0x00ef, B:46:0x00f7, B:48:0x00fd, B:50:0x0105, B:52:0x010b, B:54:0x0111, B:55:0x0115, B:57:0x011b, B:58:0x011f, B:62:0x012d, B:64:0x015e, B:67:0x0166, B:69:0x0177, B:71:0x017b, B:73:0x017f, B:74:0x0185, B:83:0x01a3, B:108:0x0270, B:112:0x0287, B:114:0x029d, B:116:0x02a1, B:118:0x02a7, B:121:0x02b2, B:119:0x02ac, B:125:0x02ba, B:127:0x02c2, B:130:0x02d9, B:132:0x02e5, B:133:0x02e9, B:135:0x02f1, B:136:0x02fb, B:140:0x0326, B:142:0x032c, B:129:0x02ca, B:111:0x0282, B:85:0x01a9, B:87:0x01b6, B:88:0x01ba, B:90:0x01be, B:91:0x01c2, B:96:0x01e7, B:97:0x022a, B:99:0x0230, B:100:0x0241, B:102:0x0246, B:107:0x0258, B:75:0x0189, B:77:0x018d, B:78:0x0195, B:80:0x0199, B:18:0x0079, B:20:0x007d, B:22:0x0081, B:24:0x0085, B:26:0x00b0, B:63:0x0145), top: B:150:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a9 A[Catch: all -> 0x0339, TryCatch #0 {all -> 0x0339, blocks: (B:3:0x0016, B:7:0x0033, B:9:0x003d, B:11:0x0043, B:13:0x006a, B:15:0x0072, B:29:0x00b8, B:31:0x00bc, B:33:0x00c0, B:35:0x00c8, B:39:0x00d1, B:41:0x00d5, B:44:0x00ef, B:46:0x00f7, B:48:0x00fd, B:50:0x0105, B:52:0x010b, B:54:0x0111, B:55:0x0115, B:57:0x011b, B:58:0x011f, B:62:0x012d, B:64:0x015e, B:67:0x0166, B:69:0x0177, B:71:0x017b, B:73:0x017f, B:74:0x0185, B:83:0x01a3, B:108:0x0270, B:112:0x0287, B:114:0x029d, B:116:0x02a1, B:118:0x02a7, B:121:0x02b2, B:119:0x02ac, B:125:0x02ba, B:127:0x02c2, B:130:0x02d9, B:132:0x02e5, B:133:0x02e9, B:135:0x02f1, B:136:0x02fb, B:140:0x0326, B:142:0x032c, B:129:0x02ca, B:111:0x0282, B:85:0x01a9, B:87:0x01b6, B:88:0x01ba, B:90:0x01be, B:91:0x01c2, B:96:0x01e7, B:97:0x022a, B:99:0x0230, B:100:0x0241, B:102:0x0246, B:107:0x0258, B:75:0x0189, B:77:0x018d, B:78:0x0195, B:80:0x0199, B:18:0x0079, B:20:0x007d, B:22:0x0081, B:24:0x0085, B:26:0x00b0, B:63:0x0145), top: B:150:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b6 A[Catch: all -> 0x0339, TryCatch #0 {all -> 0x0339, blocks: (B:3:0x0016, B:7:0x0033, B:9:0x003d, B:11:0x0043, B:13:0x006a, B:15:0x0072, B:29:0x00b8, B:31:0x00bc, B:33:0x00c0, B:35:0x00c8, B:39:0x00d1, B:41:0x00d5, B:44:0x00ef, B:46:0x00f7, B:48:0x00fd, B:50:0x0105, B:52:0x010b, B:54:0x0111, B:55:0x0115, B:57:0x011b, B:58:0x011f, B:62:0x012d, B:64:0x015e, B:67:0x0166, B:69:0x0177, B:71:0x017b, B:73:0x017f, B:74:0x0185, B:83:0x01a3, B:108:0x0270, B:112:0x0287, B:114:0x029d, B:116:0x02a1, B:118:0x02a7, B:121:0x02b2, B:119:0x02ac, B:125:0x02ba, B:127:0x02c2, B:130:0x02d9, B:132:0x02e5, B:133:0x02e9, B:135:0x02f1, B:136:0x02fb, B:140:0x0326, B:142:0x032c, B:129:0x02ca, B:111:0x0282, B:85:0x01a9, B:87:0x01b6, B:88:0x01ba, B:90:0x01be, B:91:0x01c2, B:96:0x01e7, B:97:0x022a, B:99:0x0230, B:100:0x0241, B:102:0x0246, B:107:0x0258, B:75:0x0189, B:77:0x018d, B:78:0x0195, B:80:0x0199, B:18:0x0079, B:20:0x007d, B:22:0x0081, B:24:0x0085, B:26:0x00b0, B:63:0x0145), top: B:150:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01be A[Catch: all -> 0x0339, TryCatch #0 {all -> 0x0339, blocks: (B:3:0x0016, B:7:0x0033, B:9:0x003d, B:11:0x0043, B:13:0x006a, B:15:0x0072, B:29:0x00b8, B:31:0x00bc, B:33:0x00c0, B:35:0x00c8, B:39:0x00d1, B:41:0x00d5, B:44:0x00ef, B:46:0x00f7, B:48:0x00fd, B:50:0x0105, B:52:0x010b, B:54:0x0111, B:55:0x0115, B:57:0x011b, B:58:0x011f, B:62:0x012d, B:64:0x015e, B:67:0x0166, B:69:0x0177, B:71:0x017b, B:73:0x017f, B:74:0x0185, B:83:0x01a3, B:108:0x0270, B:112:0x0287, B:114:0x029d, B:116:0x02a1, B:118:0x02a7, B:121:0x02b2, B:119:0x02ac, B:125:0x02ba, B:127:0x02c2, B:130:0x02d9, B:132:0x02e5, B:133:0x02e9, B:135:0x02f1, B:136:0x02fb, B:140:0x0326, B:142:0x032c, B:129:0x02ca, B:111:0x0282, B:85:0x01a9, B:87:0x01b6, B:88:0x01ba, B:90:0x01be, B:91:0x01c2, B:96:0x01e7, B:97:0x022a, B:99:0x0230, B:100:0x0241, B:102:0x0246, B:107:0x0258, B:75:0x0189, B:77:0x018d, B:78:0x0195, B:80:0x0199, B:18:0x0079, B:20:0x007d, B:22:0x0081, B:24:0x0085, B:26:0x00b0, B:63:0x0145), top: B:150:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC4896DDp A01(X.InterfaceC4913DEg r58, com.facebook.exoplayer.monitor.VpsEventCallback r59, X.DEF r60, X.C3159C0h r61, X.InterfaceC6113Dvs r62, java.lang.String r63, java.lang.String r64, java.lang.String r65, java.lang.String r66, java.util.Collection r67, java.util.Map r68, java.util.concurrent.atomic.AtomicBoolean r69, java.util.concurrent.atomic.AtomicBoolean r70, java.util.concurrent.atomic.AtomicBoolean r71, int r72, int r73, long r74, boolean r76, boolean r77, boolean r78, boolean r79) {
        /*
            Method dump skipped, instructions count: 830
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DDR.A01(X.DEg, com.facebook.exoplayer.monitor.VpsEventCallback, X.DEF, X.C0h, X.Dvs, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Collection, java.util.Map, java.util.concurrent.atomic.AtomicBoolean, java.util.concurrent.atomic.AtomicBoolean, java.util.concurrent.atomic.AtomicBoolean, int, int, long, boolean, boolean, boolean, boolean):X.DDp");
    }
}
