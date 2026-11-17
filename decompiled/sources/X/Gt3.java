package X;

import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.facebook.aura.commands.invite.InviteUpsellHandlerKt;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/* loaded from: classes6.dex */
public class Gt3 extends Gt4 implements Iterable<Gt3> {
    public static final String A03;
    public static final C10294Gty A04;
    public static final List<Gt3> A05 = Collections.EMPTY_LIST;
    public Gt7 A00;
    public C10294Gty A01;
    public C10322Guc A02;

    static {
        C10294Gty c10294Gty = new C10294Gty(0);
        c10294Gty.validChildren = true;
        A04 = c10294Gty;
        A03 = FGI.A0M(CustomConnectorRegisterRepositoryKt.ROOT_PATH, "baseUri");
    }

    public static List A00(final Class cls, Gt3 gt3) {
        return (List) gt3.A01.stream().filter(new Predicate() { // from class: X.Gt1
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return cls.isInstance(obj);
            }
        }).map(new Function() { // from class: X.Gt0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return cls.cast(obj);
            }
        }).collect(Collectors.collectingAndThen(Collectors.toList(), new C10651I0v(4)));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004b A[Catch: all -> 0x0073, TryCatch #0 {, blocks: (B:8:0x000e, B:10:0x0013, B:12:0x001c, B:14:0x002a, B:16:0x0032, B:18:0x003c, B:22:0x004b, B:23:0x0071), top: B:28:0x000e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List A01(X.Gt3 r5) {
        /*
            X.Gty r0 = r5.A01
            int r0 = r0.size()
            if (r0 != 0) goto Lb
            java.util.List<X.Gt3> r4 = X.Gt3.A05
            return r4
        Lb:
            X.Gty r3 = r5.A01
            monitor-enter(r3)
            X.Gt7 r4 = r5.A00     // Catch: java.lang.Throwable -> L73
            r2 = 0
            if (r4 == 0) goto L48
            java.lang.String r0 = "/jsoup.userdata"
            int r1 = r4.A06(r0)     // Catch: java.lang.Throwable -> L73
            r0 = -1
            if (r1 == r0) goto L48
            java.util.Map r1 = r4.A0A()     // Catch: java.lang.Throwable -> L73
            java.lang.String r0 = "jsoup.childEls"
            java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.Throwable -> L73
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L48
            java.lang.Object r4 = r0.get()     // Catch: java.lang.Throwable -> L73
            java.util.List r4 = (java.util.List) r4     // Catch: java.lang.Throwable -> L73
            if (r4 == 0) goto L48
            java.lang.String r0 = "jsoup.childElsMod"
            java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.Throwable -> L73
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L48
            int r1 = r0.intValue()     // Catch: java.lang.Throwable -> L73
            X.Gty r0 = r5.A01     // Catch: java.lang.Throwable -> L73
            int r0 = r0.A00()     // Catch: java.lang.Throwable -> L73
            if (r1 == r0) goto L49
        L48:
            r4 = r2
        L49:
            if (r4 != 0) goto L71
            java.lang.Class<X.Gt3> r0 = X.Gt3.class
            java.util.List r4 = A00(r0, r5)     // Catch: java.lang.Throwable -> L73
            X.Gt7 r0 = r5.A0D()     // Catch: java.lang.Throwable -> L73
            java.util.Map r2 = r0.A0A()     // Catch: java.lang.Throwable -> L73
            java.lang.ref.WeakReference r1 = X.BV4.A0q(r4)     // Catch: java.lang.Throwable -> L73
            java.lang.String r0 = "jsoup.childEls"
            r2.put(r0, r1)     // Catch: java.lang.Throwable -> L73
            X.Gty r0 = r5.A01     // Catch: java.lang.Throwable -> L73
            int r0 = r0.A00()     // Catch: java.lang.Throwable -> L73
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L73
            java.lang.String r0 = "jsoup.childElsMod"
            r2.put(r0, r1)     // Catch: java.lang.Throwable -> L73
        L71:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L73
            return r4
        L73:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L73
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Gt3.A01(X.Gt3):java.util.List");
    }

    public final int A0T() {
        Gt3 gt3 = super.A01;
        if (gt3 != null) {
            List listA01 = A01(gt3);
            int size = listA01.size();
            for (int i = 0; i < size; i++) {
                if (listA01.get(i) == this) {
                    return i;
                }
            }
        }
        return 0;
    }

    public final String A0X() {
        return (String) this.A01.stream().map(new C10651I0v(5)).collect(Gt5.A02(""));
    }

    public final String A0Y() {
        return (String) Gt2.A00(Gt4.class, this).map(new C10651I0v(5)).collect(Gt5.A02(""));
    }

    public final Gt3 A0a() {
        C10294Gty c10294Gty = this.A01;
        int size = c10294Gty.size();
        for (int i = 0; i < size; i++) {
            Gt4 gt4 = c10294Gty.get(i);
            if (gt4 instanceof Gt3) {
                return (Gt3) gt4;
            }
        }
        return null;
    }

    public final Gt3 A0b(String str) {
        GtC gtC;
        String str2 = this.A02.A02;
        Gt3 gt3 = this;
        while (true) {
            if (!(gt3 instanceof Gt8)) {
                gt3 = ((Gt4) gt3).A01;
                if (gt3 == null) {
                    break;
                }
            } else {
                Gt8 gt8 = (Gt8) gt3;
                if (gt8 != null) {
                    gtC = gt8.A02;
                }
            }
        }
        gtC = new GtC(new C10316GuW(0));
        Gt3 gt32 = new Gt3(A06(), null, GtC.A00(gtC).A04(str, null, str2, gtC.A02.A01));
        A0f(gt32);
        return gt32;
    }

    public final void A0c(String str) {
        super.A0M(InviteUpsellHandlerKt.SRC_PARAM, str);
    }

    public final void A0d(Hy9 hy9) {
        if ((this instanceof C10303GuE) || this.A01.isEmpty()) {
            return;
        }
        hy9.A02("</");
        hy9.A02(this.A02.A04);
        hy9.A01('>');
    }

    public final boolean A0g(String str) {
        Gt7 gt7 = this.A00;
        if (gt7 != null) {
            String strA09 = gt7.A09("class");
            int length = strA09.length();
            int length2 = str.length();
            if (length != 0 && length >= length2) {
                if (length == length2) {
                    return str.equalsIgnoreCase(strA09);
                }
                int i = 0;
                while (i < length) {
                    while (i < length && Gt5.A07(strA09.charAt(i))) {
                        i++;
                    }
                    int i2 = i;
                    if (i == length) {
                        return false;
                    }
                    while (i < length && !Gt5.A07(strA09.charAt(i))) {
                        i++;
                    }
                    if (i - i2 == length2 && strA09.regionMatches(true, i2, str, 0, length2)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final void forEach(Consumer<? super Gt3> consumer) {
        Gt2.A00(Gt3.class, this).forEach(consumer);
    }

    @Override // java.lang.Iterable
    public final Iterator<Gt3> iterator() {
        return new C10259Gsy(Gt3.class, this);
    }

    public Gt3(String str, Gt7 gt7, C10322Guc c10322Guc) {
        C10293Gtx.A00(c10322Guc);
        this.A01 = A04;
        this.A00 = gt7;
        this.A02 = c10322Guc;
        if (Gt5.A08(str)) {
            return;
        }
        C10293Gtx.A00(str);
        A0D().A0E(A03, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A02(java.lang.StringBuilder r4, X.C10262GtH r5) {
        /*
            java.lang.String r3 = r5.A0T()
            X.Gt3 r2 = r5.A01
            if (r2 == 0) goto L1a
            r1 = 0
        L9:
            X.Guc r0 = r2.A02
            int r0 = r0.A00
            r0 = r0 & 64
            if (r0 != 0) goto L26
            X.Gt3 r2 = r2.A01
            int r1 = r1 + 1
            r0 = 6
            if (r1 >= r0) goto L1a
            if (r2 != 0) goto L9
        L1a:
            boolean r0 = r5 instanceof X.C10285Gtp
            if (r0 != 0) goto L26
            boolean r0 = X.C10262GtH.A01(r4)
            X.Gt5.A03(r3, r4, r0)
            return
        L26:
            r4.append(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Gt3.A02(java.lang.StringBuilder, X.GtH):void");
    }

    @Override // X.Gt4
    public final /* bridge */ /* synthetic */ Gt4 A0J(Gt4 gt4) {
        Gt3 gt3 = (Gt3) super.A0J(gt4);
        C10294Gty c10294Gty = new C10294Gty(this.A01.size());
        c10294Gty.validChildren = true;
        gt3.A01 = c10294Gty;
        c10294Gty.addAll(this.A01);
        Gt7 gt7 = this.A00;
        if (gt7 != null) {
            Gt7 gt7Clone = gt7.clone();
            gt3.A00 = gt7Clone;
            if (gt7Clone.A06("/jsoup.userdata") != -1) {
                gt7Clone.A0A().remove("jsoup.childEls");
            }
        }
        return gt3;
    }

    public final String A0U() {
        StringBuilder sbA0t = AbstractC7609F5w.A0t();
        A0e(Hy9.A00(sbA0t));
        String strA01 = Gt5.A01(sbA0t);
        return Gt2.A01(this).A02 ? strA01.trim() : strA01;
    }

    public final String A0V() {
        StringBuilder sbA0t = AbstractC7609F5w.A0t();
        for (int i = 0; i < this.A01.size(); i++) {
            Gt4 gt4 = this.A01.get(i);
            if (gt4 instanceof C10262GtH) {
                A02(sbA0t, (C10262GtH) gt4);
            } else if (AbstractC7608F5v.A1X("br", gt4) && !C10262GtH.A01(sbA0t)) {
                sbA0t.append(InviteCodeScratcherKt.CODE_SEPARATOR);
            }
        }
        return Gt5.A01(sbA0t).trim();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0146  */
    /* JADX WARN: Type inference failed for: r13v0, types: [X.Gt3, X.Gt4] */
    /* JADX WARN: Type inference failed for: r13v1, types: [X.Gt4] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [X.Gt4] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [X.Gt3] */
    /* JADX WARN: Type inference failed for: r13v7, types: [X.Gt4] */
    /* JADX WARN: Type inference failed for: r13v8, types: [X.Gt4] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String A0W() {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Gt3.A0W():java.lang.String");
    }

    @Override // X.Gt4
    /* renamed from: A0Z, reason: merged with bridge method [inline-methods] */
    public Gt3 clone() {
        return (Gt3) super.clone();
    }

    public final void A0e(Hy9 hy9) {
        Gt4 gt4A0G = A0G();
        if (gt4A0G != null) {
            C10532Hqa c10532HqaA01 = Gt2.A01(gt4A0G);
            Gt9 gtB = c10532HqaA01.A02 ? new GtB(hy9, c10532HqaA01, gt4A0G) : new Gt9(hy9, c10532HqaA01, gt4A0G);
            do {
                gtB.A02(gt4A0G);
                gt4A0G = gt4A0G.A0H();
            } while (gt4A0G != null);
        }
    }

    public final void A0f(Gt4 gt4) {
        C10293Gtx.A00(gt4);
        Gt4.A03(this, gt4);
        Gt3 gt3 = gt4.A01;
        if (gt3 != null) {
            gt3.A0O(gt4);
        }
        gt4.A01 = this;
        A0C();
        C10294Gty c10294Gty = this.A01;
        c10294Gty.add(gt4);
        gt4.A00 = C8j3.A0K(c10294Gty);
    }
}
