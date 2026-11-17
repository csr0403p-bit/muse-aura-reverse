package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.73R, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C73R {
    public static final void A00(AnonymousClass738 anonymousClass738) {
        List<C73D> list = anonymousClass738.A01;
        for (C73D c73d : list) {
            if (c73d instanceof AnonymousClass738) {
                A00((AnonymousClass738) c73d);
            }
        }
        C062775h c062775h = (C062775h) anonymousClass738.AHq().foldIn(null, new G0V<C062775h, InterfaceC060673f, C062775h>() { // from class: X.73V
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.G0V
            public final /* bridge */ /* synthetic */ C062775h invoke(C062775h c062775h2, InterfaceC060673f interfaceC060673f) {
                return interfaceC060673f instanceof C062775h ? interfaceC060673f : c062775h2;
            }
        });
        if (((c062775h != null ? c062775h.A00 : AnonymousClass735.A00) instanceof AnonymousClass735) && (!(list instanceof Collection) || !list.isEmpty())) {
            Iterator<C73D> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C062775h c062775h2 = (C062775h) it.next().AHq().foldIn(null, new G0V<C062775h, InterfaceC060673f, C062775h>() { // from class: X.73U
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // X.G0V
                    public final /* bridge */ /* synthetic */ C062775h invoke(C062775h c062775h3, InterfaceC060673f interfaceC060673f) {
                        return interfaceC060673f instanceof C062775h ? interfaceC060673f : c062775h3;
                    }
                });
                if ((c062775h2 != null ? c062775h2.A00 : null) instanceof C72U) {
                    anonymousClass738.Ado(anonymousClass738.AHq().Agp(new C062775h(C72U.A00)));
                    break;
                }
            }
        }
        C062875i c062875i = (C062875i) anonymousClass738.AHq().foldIn(null, new G0V<C062875i, InterfaceC060673f, C062875i>() { // from class: X.73T
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.G0V
            public final /* bridge */ /* synthetic */ C062875i invoke(C062875i c062875i2, InterfaceC060673f interfaceC060673f) {
                return interfaceC060673f instanceof C062875i ? interfaceC060673f : c062875i2;
            }
        });
        if ((c062875i != null ? c062875i.A00 : AnonymousClass735.A00) instanceof AnonymousClass735) {
            if ((list instanceof Collection) && list.isEmpty()) {
                return;
            }
            Iterator<C73D> it2 = list.iterator();
            while (it2.hasNext()) {
                C062875i c062875i2 = (C062875i) it2.next().AHq().foldIn(null, new G0V<C062875i, InterfaceC060673f, C062875i>() { // from class: X.73S
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // X.G0V
                    public final /* bridge */ /* synthetic */ C062875i invoke(C062875i c062875i3, InterfaceC060673f interfaceC060673f) {
                        return interfaceC060673f instanceof C062875i ? interfaceC060673f : c062875i3;
                    }
                });
                if ((c062875i2 != null ? c062875i2.A00 : null) instanceof C72U) {
                    anonymousClass738.Ado(C72e.A00(anonymousClass738.AHq()));
                    return;
                }
            }
        }
    }

    public static final void A01(AnonymousClass738 anonymousClass738, G0U<? super C73D, ? extends C73D> g0u) {
        List<C73D> list = anonymousClass738.A01;
        int i = 0;
        for (C73D c73d : list) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC0885AGm.A14();
                throw F60.createAndThrow();
            }
            C73D c73dInvoke = g0u.invoke(c73d);
            list.set(i, c73dInvoke);
            if (c73dInvoke instanceof AnonymousClass738) {
                A01((AnonymousClass738) c73dInvoke, g0u);
            }
            i = i2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.AnonymousClass733 r5) {
        /*
            java.util.List<X.73D> r2 = r5.A01
            boolean r0 = r2.isEmpty()
            r4 = 1
            if (r0 != 0) goto L55
            boolean r0 = r2 instanceof java.util.Collection
            if (r0 == 0) goto L43
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L43
        L13:
            java.util.Iterator r3 = r2.iterator()
        L17:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L6b
            java.lang.Object r1 = r3.next()
            X.73D r1 = (X.C73D) r1
            java.lang.String r0 = "null cannot be cast to non-null type androidx.glance.appwidget.EmittableSizeBox"
            X.C7384Etj.A0Z(r1, r0)
            X.738 r1 = (X.AnonymousClass738) r1
            java.util.List<X.73D> r2 = r1.A01
            int r0 = r2.size()
            if (r0 == r4) goto L17
            X.72y r1 = new X.72y
            r1.<init>()
            java.util.List<X.73D> r0 = r1.A01
            X.AbstractC0882AGj.A0r(r2, r0)
            r2.clear()
            r2.add(r1)
            goto L17
        L43:
            java.util.Iterator r1 = r2.iterator()
        L47:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L13
            java.lang.Object r0 = r1.next()
            boolean r0 = r0 instanceof X.AnonymousClass739
            if (r0 != 0) goto L47
        L55:
            int r0 = r2.size()
            if (r0 == r4) goto L6b
            X.72y r1 = new X.72y
            r1.<init>()
            java.util.List<X.73D> r0 = r1.A01
            X.AbstractC0882AGj.A0r(r2, r0)
            r2.clear()
            r2.add(r1)
        L6b:
            A00(r5)
            r1 = 5
            X.8i1 r0 = new X.8i1
            r0.<init>(r1)
            A01(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73R.A02(X.733):void");
    }
}
