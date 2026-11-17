package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Ehv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C7185Ehv implements InterfaceC7029Eea {
    public static final Object A0C;
    public static final Set<String> A0D;
    public EnumC7203EiK A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final C7110EgO A04;
    public final InterfaceC7027EeY A05;
    public final EnumC7058Ef5 A06;
    public final C7183Eht A07;
    public final Object A08;
    public final String A09;
    public final List A0A;
    public final Map<String, Object> A0B;

    static {
        HashSet hashSet = new HashSet(2);
        Collections.addAll(hashSet, "id", "uri_source");
        A0D = new C7509EyV(hashSet);
        A0C = C3cG.A0T();
    }

    public final void A03() {
        synchronized (this) {
            if (this.A01) {
                return;
            }
            this.A01 = true;
            Iterator it = BV4.A0t(this.A0A).iterator();
            while (it.hasNext()) {
                ((AbstractC7260Ejk) it.next()).onCancellationRequested();
            }
        }
    }

    @Override // X.InterfaceC7029Eea
    public final void A3R(AbstractC7260Ejk abstractC7260Ejk) {
        boolean z;
        synchronized (this) {
            this.A0A.add(abstractC7260Ejk);
            z = this.A01;
        }
        if (z) {
            abstractC7260Ejk.onCancellationRequested();
        }
    }

    @Override // X.InterfaceC7029Eea
    public final synchronized boolean AOc() {
        return this.A02;
    }

    @Override // X.InterfaceC7029Eea
    public final synchronized boolean AOu() {
        return this.A03;
    }

    public static void A00(List list) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((AbstractC7260Ejk) it.next()).onIsIntermediateResultExpectedChanged();
            }
        }
    }

    public static void A01(List list) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((AbstractC7260Ejk) it.next()).onIsPrefetchChanged();
            }
        }
    }

    public static void A02(List list) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((AbstractC7260Ejk) it.next()).onPriorityChanged();
            }
        }
    }

    @Override // X.InterfaceC7029Eea
    public final C7110EgO AGL() {
        C7110EgO c7110EgO = this.A04;
        if (c7110EgO != null) {
            return c7110EgO;
        }
        throw C8j3.A18("No ImagePipelineConfig for this producer sequence");
    }

    @Override // X.InterfaceC7029Eea
    public final void AYq(String str, String str2) {
        Map<String, Object> map = this.A0B;
        map.put("origin", str);
        map.put("origin_sub", str2);
    }

    @Override // X.InterfaceC7060Ef7
    public final <T> T getExtra(String str) {
        return (T) this.A0B.get(str);
    }

    @Override // X.InterfaceC7060Ef7
    public final Map<String, Object> getExtras() {
        return this.A0B;
    }

    @Override // X.InterfaceC7060Ef7
    public final <E> void putExtra(String str, E e) {
        if (A0D.contains(str)) {
            return;
        }
        this.A0B.put(str, e);
    }

    @Override // X.InterfaceC7060Ef7
    public final void putExtras(Map<String, ?> map) {
        if (map != null) {
            Iterator itA0n = AnonymousClass002.A0n(map);
            while (itA0n.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(itA0n);
                putExtra(C60O.A0t(entryA0l), entryA0l.getValue());
            }
        }
    }

    public C7185Ehv(EnumC7203EiK enumC7203EiK, C7110EgO c7110EgO, InterfaceC7027EeY interfaceC7027EeY, EnumC7058Ef5 enumC7058Ef5, C7183Eht c7183Eht, Object obj, String str, boolean z, boolean z2) {
        this.A07 = c7183Eht;
        this.A09 = str;
        HashMap mapA0u = BV4.A0u();
        this.A0B = mapA0u;
        mapA0u.put("id", str);
        mapA0u.put("uri_source", c7183Eht == null ? "null-request" : c7183Eht.A04);
        this.A05 = interfaceC7027EeY;
        this.A08 = obj == null ? A0C : obj;
        this.A06 = enumC7058Ef5;
        this.A03 = z;
        this.A00 = enumC7203EiK;
        this.A02 = z2;
        this.A01 = false;
        this.A0A = C3cG.A0h();
        this.A04 = c7110EgO;
    }
}
