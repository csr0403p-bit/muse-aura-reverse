package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.C4p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3232C4p {
    public static final Set<String> A0C = C60O.A13();
    public final C3239C4w A00;
    public final C3192C2q A01;
    public final C54 A02;
    public final C3237C4u A09;
    public volatile boolean A0A;
    public volatile boolean A0B;
    public final Map<C5l, Object> A07 = new HashMap(C5l.values().length, 1.0f);
    public final Object A03 = C3cG.A0T();
    public final Map<EnumC3223C4g, Map<InterfaceC3235C4s, List<InterfaceC3231C4o>>> A06 = BV4.A0u();
    public final Set<InterfaceC3235C4s> A08 = C60O.A13();
    public final Map<EnumC3223C4g, Map<InterfaceC3235C4s, List<InterfaceC3236C4t>>> A05 = BV4.A0u();
    public final Map<EnumC3223C4g, Map<InterfaceC3235C4s, List<InterfaceC3236C4t>>> A04 = BV4.A0u();

    public final void A05(C3228C4l c3228C4l, EnumC3223C4g enumC3223C4g, InterfaceC3235C4s interfaceC3235C4s) throws Throwable {
        A02(c3228C4l, this, enumC3223C4g, interfaceC3235C4s, interfaceC3235C4s.AH4(), 0);
    }

    public static String A00(EnumC3223C4g enumC3223C4g, C5l c5l, String str, int i) {
        return FGI.A0h(enumC3223C4g.prefix, i == 0 ? "" : FGI.A08(i, "_"), c5l.mSupplementary ? "suppl_" : "", c5l.mName, str);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/C4s;LX/C4g;Ljava/util/Map<LX/C4g;Ljava/util/Map<LX/C4s;Ljava/util/List<LX/C4t;>;>;>;)Ljava/util/List<LX/C4t;>; */
    private List A01(EnumC3223C4g enumC3223C4g, InterfaceC3235C4s interfaceC3235C4s, Map map) {
        List arrayList;
        synchronized (this.A03) {
            Map map2 = (Map) map.get(enumC3223C4g);
            if (map2 == null) {
                map2 = new HashMap();
                map.put(enumC3223C4g, map2);
            }
            arrayList = (List) map2.get(interfaceC3235C4s);
            if (arrayList == null) {
                arrayList = new ArrayList();
                map2.put(interfaceC3235C4s, arrayList);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x0083 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f0 A[Catch: all -> 0x02fd, TRY_ENTER, TryCatch #11 {all -> 0x02fd, blocks: (B:22:0x0077, B:23:0x0082, B:37:0x00b9, B:42:0x00f0, B:43:0x00f4, B:60:0x0197, B:62:0x01ba, B:65:0x01cb, B:112:0x02c1, B:118:0x02cd, B:116:0x02c9, B:117:0x02cc, B:119:0x02e9, B:127:0x02fc, B:66:0x0207, B:67:0x020f, B:87:0x0268, B:100:0x0296, B:104:0x029a, B:107:0x02ad, B:111:0x02b1, B:31:0x00a7, B:32:0x00ab, B:34:0x00b1, B:36:0x00b8, B:35:0x00b5, B:124:0x02f9, B:24:0x0083, B:26:0x008d, B:27:0x0095, B:29:0x009d), top: B:144:0x0077, inners: #2, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0263  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.C3228C4l r25, X.C3232C4p r26, X.EnumC3223C4g r27, X.InterfaceC3235C4s r28, X.C3238C4v r29, int r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 775
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3232C4p.A02(X.C4l, X.C4p, X.C4g, X.C4s, X.C4v, int):void");
    }

    public final void A04(InterfaceC3231C4o interfaceC3231C4o, EnumC3223C4g enumC3223C4g, InterfaceC3235C4s interfaceC3235C4s) {
        synchronized (this.A03) {
            Map<EnumC3223C4g, Map<InterfaceC3235C4s, List<InterfaceC3231C4o>>> map = this.A06;
            Map<InterfaceC3235C4s, List<InterfaceC3231C4o>> map2 = map.get(enumC3223C4g);
            if (map2 == null) {
                map2 = new HashMap<>();
                map.put(enumC3223C4g, map2);
            }
            List<InterfaceC3231C4o> arrayList = map2.get(interfaceC3235C4s);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                map2.put(interfaceC3235C4s, arrayList);
            }
            arrayList.add(interfaceC3231C4o);
        }
    }

    public final void A06(final C3228C4l c3228C4l, final EnumC3223C4g enumC3223C4g, final InterfaceC3235C4s interfaceC3235C4s) {
        C51.A03.execute(new Runnable() { // from class: X.C4q
            public static final String __redex_internal_original_name = "CollectorManager$$ExternalSyntheticLambda1";

            @Override // java.lang.Runnable
            public final void run() {
                C3232C4p c3232C4p = this;
                InterfaceC3235C4s interfaceC3235C4s2 = interfaceC3235C4s;
                EnumC3223C4g enumC3223C4g2 = enumC3223C4g;
                C3228C4l c3228C4l2 = c3228C4l;
                try {
                    c3232C4p.A0A(enumC3223C4g2, interfaceC3235C4s2);
                    C3232C4p.A02(c3228C4l2, c3232C4p, enumC3223C4g2, interfaceC3235C4s2, interfaceC3235C4s2.AH4(), 0);
                    c3232C4p.A09(enumC3223C4g2, interfaceC3235C4s2);
                } catch (Throwable th) {
                    C2Q.A00().AT9("CMNotifyAndApplyInBackground", th, null);
                    CFK.A0D(C9Y.TAG, "Failed to apply collectors: %s", th, interfaceC3235C4s2.AHs());
                }
            }
        });
    }

    public final void A07(InterfaceC3236C4t interfaceC3236C4t, EnumC3223C4g enumC3223C4g, InterfaceC3235C4s interfaceC3235C4s) {
        synchronized (this.A03) {
            A01(enumC3223C4g, interfaceC3235C4s, this.A04).add(interfaceC3236C4t);
        }
    }

    public final void A08(InterfaceC3236C4t interfaceC3236C4t, EnumC3223C4g enumC3223C4g, InterfaceC3235C4s interfaceC3235C4s) {
        synchronized (this.A03) {
            A01(enumC3223C4g, interfaceC3235C4s, this.A05).add(interfaceC3236C4t);
        }
    }

    public C3232C4p(C3239C4w c3239C4w, C3192C2q c3192C2q, C3237C4u c3237C4u, C54 c54) {
        this.A02 = c54;
        this.A01 = c3192C2q;
        this.A00 = c3239C4w;
        this.A09 = c3237C4u;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/C4s;LX/C4g;Ljava/util/List<LX/C4t;>;)V */
    public static void A03(EnumC3223C4g enumC3223C4g, InterfaceC3235C4s interfaceC3235C4s, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC3236C4t) it.next()).AUN(enumC3223C4g, interfaceC3235C4s);
            } catch (Throwable th) {
                C2Q.A00().AT9("CMNotifyListener", th, null);
                CFK.A0A(C9Y.TAG, "onNotify failed...", th);
            }
        }
    }

    public final void A09(EnumC3223C4g enumC3223C4g, InterfaceC3235C4s interfaceC3235C4s) {
        int iAUW = C2Q.A00().AUW("notifyAfterListeners");
        A03(enumC3223C4g, interfaceC3235C4s, A01(enumC3223C4g, interfaceC3235C4s, this.A04));
        C2Q.A00().AUV(iAUW, null);
    }

    public final void A0A(EnumC3223C4g enumC3223C4g, InterfaceC3235C4s interfaceC3235C4s) {
        int iAUW = C2Q.A00().AUW("notifyBeforeListeners");
        A03(enumC3223C4g, interfaceC3235C4s, A01(enumC3223C4g, interfaceC3235C4s, this.A05));
        C2Q.A00().AUV(iAUW, null);
    }
}
