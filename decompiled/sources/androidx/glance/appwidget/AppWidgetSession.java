package androidx.glance.appwidget;

import X.AGF;
import X.AGG;
import X.AGH;
import X.AbstractC0885AGm;
import X.AnonymousClass738;
import X.BLG;
import X.C27a;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C60R;
import X.C6PR;
import X.C6vW;
import X.C70B;
import X.C73D;
import X.C73K;
import X.C75V;
import X.C76B;
import X.C9250GBd;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.HxE;
import X.InterfaceC060673f;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.compose.runtime.MutableState;
import androidx.glance.session.Session;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class AppWidgetSession extends Session {
    public Map A00;
    public final MutableState A01;
    public final MutableState A02;
    public final C6vW A03;
    public final GlanceAppWidget A04;
    public final C70B A05;
    public final C6PR A06;
    public final C27a A07;
    public final BLG<RemoteViews> A08;

    /* JADX WARN: Illegal instructions before constructor call */
    public AppWidgetSession(Bundle bundle, C6vW c6vW, GlanceAppWidget glanceAppWidget, C70B c70b, C6PR c6pr) {
        int i = c6vW.A00;
        super(FGI.A0H("appWidget-", i));
        this.A04 = glanceAppWidget;
        this.A03 = c6vW;
        this.A06 = c6pr;
        this.A05 = c70b;
        if (i < -1) {
            throw C60O.A0i("If the AppWidgetSession is not created for a bound widget, you must provide a lambda action receiver");
        }
        AGG aggA00 = AGF.A00();
        this.A01 = C3cG.A08(aggA00, null);
        this.A02 = C3cG.A08(aggA00, bundle);
        this.A00 = AGH.A0E();
        this.A07 = new C9250GBd(null);
        this.A08 = C3cG.A13();
    }

    /* JADX WARN: Incorrect types in method signature: (Landroidx/glance/appwidget/AppWidgetSession;Landroid/content/Context;Ljava/lang/Object;LX/HtJ<-Lkotlin/Unit;>;)Ljava/lang/Object; */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.8iP, X.HtJ, androidx.compose.runtime.snapshots.Snapshot] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object A01(android.content.Context r7, androidx.glance.appwidget.AppWidgetSession r8, java.lang.Object r9, X.HtJ r10) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.appwidget.AppWidgetSession.A01(android.content.Context, androidx.glance.appwidget.AppWidgetSession, java.lang.Object, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ad A[RETURN] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004d -> B:13:0x0033). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object A02(androidx.glance.appwidget.AppWidgetSession r13, java.util.List<? extends java.lang.Object> r14, X.HtJ<? super androidx.glance.appwidget.AppWidgetSession> r15) {
        /*
            r3 = 0
            boolean r0 = r15 instanceof X.C8iW
            if (r0 == 0) goto La6
            r5 = r15
            X.8iW r5 = (X.C8iW) r5
            int r0 = r5.$t
            if (r0 != r3) goto La6
            int r2 = r5.A02
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La6
            int r2 = r2 - r1
            r5.A02 = r2
        L17:
            java.lang.Object r1 = r5.A06
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r5.A02
            r4 = 1
            if (r0 == 0) goto L50
            if (r0 != r4) goto Lae
            int r8 = r5.A01
            int r7 = r5.A00
            java.lang.Object r3 = r5.A05
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r9 = r5.A04
            androidx.glance.session.Session r9 = (androidx.glance.session.Session) r9
            java.lang.Object r2 = r5.A03
            X.Hwg.A00(r1)
        L33:
            int r7 = r7 + 1
        L35:
            if (r7 >= r8) goto Lad
            java.lang.Object r1 = r3.get(r7)
            r5.A03 = r2
            r5.A04 = r9
            r5.A05 = r3
            r5.A00 = r7
            r5.A01 = r8
            r5.A02 = r4
            X.HzR<java.lang.Object> r0 = r9.A03
            java.lang.Object r0 = r0.AcU(r1, r5)
            if (r0 != r6) goto L33
            return r6
        L50:
            java.util.ArrayList r3 = X.C60O.A12(r1)
            java.util.Iterator r2 = r14.iterator()
        L58:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L6a
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.AnonymousClass770
            if (r0 == 0) goto L58
            r3.add(r1)
            goto L58
        L6a:
            java.util.ArrayList r7 = X.C3cG.A0h()
            java.util.Iterator r2 = r14.iterator()
        L72:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L84
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.AnonymousClass773
            if (r0 == 0) goto L72
            r7.add(r1)
            goto L72
        L84:
            java.lang.Object r0 = X.AbstractC0878AGe.A0I(r7)
            X.773 r0 = (X.AnonymousClass773) r0
            if (r0 == 0) goto La4
            android.os.Bundle r10 = r0.A00
        L8e:
            androidx.glance.appwidget.GlanceAppWidget r12 = r13.A04
            X.6vW r11 = r13.A03
            androidx.glance.state.GlanceState r14 = androidx.glance.state.GlanceState.A00
            X.70B r13 = r12.getSizeMode()
            androidx.glance.appwidget.AppWidgetSession r9 = new androidx.glance.appwidget.AppWidgetSession
            r9.<init>(r10, r11, r12, r13, r14)
            int r8 = r3.size()
            r2 = r9
            r7 = 0
            goto L35
        La4:
            r10 = 0
            goto L8e
        La6:
            X.8iW r5 = new X.8iW
            r5.<init>(r13, r15, r3)
            goto L17
        Lad:
            return r2
        Lae:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.appwidget.AppWidgetSession.A02(androidx.glance.appwidget.AppWidgetSession, java.util.List, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A06(X.HtJ<? super X.HoC> r8) {
        /*
            r7 = this;
            r3 = 2
            boolean r0 = r8 instanceof X.C8iP
            if (r0 == 0) goto L49
            r6 = r8
            X.8iP r6 = (X.C8iP) r6
            int r0 = r6.$t
            if (r0 != r3) goto L49
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L49
            int r2 = r2 - r1
            r6.A00 = r2
        L17:
            java.lang.Object r5 = r6.A02
            X.Hji r4 = X.EnumC10460Hji.A02
            r3 = r4
            int r0 = r6.A00
            r2 = 1
            if (r0 == 0) goto L2d
            if (r0 != r2) goto L4f
            java.lang.Object r1 = r6.A01
            X.772 r1 = (X.AnonymousClass772) r1
            X.Hwg.A00(r5)
        L2a:
            X.27a r3 = r1.A00
            return r3
        L2d:
            X.Hwg.A00(r5)
            X.27a r1 = r7.A07
            X.GBd r0 = new X.GBd
            r0.<init>(r1)
            X.772 r1 = new X.772
            r1.<init>(r0)
            r6.A01 = r1
            r6.A00 = r2
            X.HzR<java.lang.Object> r0 = r7.A03
            java.lang.Object r0 = r0.AcU(r1, r6)
            if (r0 != r4) goto L2a
            return r3
        L49:
            X.8iP r6 = new X.8iP
            r6.<init>(r7, r8, r3)
            goto L17
        L4f:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.appwidget.AppWidgetSession.A06(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(2:4|(1:6))(0)|(2:8|(1:10)(1:45))(0)|11|(1:(1:(5:54|55|(1:57)|58|59)(1:(2:18|19)(3:40|41|(2:43|44)(1:63))))(1:27))(2:20|(2:22|23)(2:24|(1:26)))|28|62|29|(8:31|46|48|(1:50)|55|(0)|58|59)(2:32|33)) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d2, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d3, code lost:
    
        android.util.Log.e("GlanceAppWidget", "Error in Glance App Widget", r11);
        r5 = r3.A04;
        r2 = r3.A03;
        r5.onCompositionError(r10, r2, r2.A00, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e4, code lost:
    
        r2 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e5, code lost:
    
        r8.A01 = r2;
        r8.A02 = null;
        r8.A03 = null;
        r8.A00 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f1, code lost:
    
        if (r7.A05(r8) == r6) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f3, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0119, code lost:
    
        r8.A01 = null;
        r8.A02 = null;
        r8.A03 = null;
        r8.A00 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0128, code lost:
    
        r8.A01 = null;
        r8.A02 = null;
        r8.A03 = null;
        r8.A00 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0134, code lost:
    
        if (r7.A05(r8) == r6) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0136, code lost:
    
        return r6;
     */
    /* JADX WARN: Incorrect types in method signature: (Landroidx/glance/appwidget/AppWidgetSession;Landroid/content/Context;LX/738;LX/HtJ<-Ljava/lang/Boolean;>;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object A00(android.content.Context r20, X.AnonymousClass738 r21, androidx.glance.appwidget.AppWidgetSession r22, X.HtJ r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.appwidget.AppWidgetSession.A00(android.content.Context, X.738, androidx.glance.appwidget.AppWidgetSession, X.HtJ):java.lang.Object");
    }

    public static final LinkedHashMap A03(AnonymousClass738 anonymousClass738) {
        List<C73D> list = anonymousClass738.A01;
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        int i = 0;
        for (C73D c73d : list) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC0885AGm.A14();
                throw F60.createAndThrow();
            }
            C73D c73d2 = c73d;
            C76B c76bAHq = c73d2.AHq();
            if (c76bAHq.A4L(new G0U<InterfaceC060673f, Boolean>() { // from class: X.761
                @Override // X.G0U
                public final /* bridge */ /* synthetic */ Boolean invoke(InterfaceC060673f interfaceC060673f) {
                    return Boolean.valueOf(interfaceC060673f instanceof C75V);
                }
            })) {
                c76bAHq.foldIn(C3cG.A0r(null, C76B.A00), new G0V<HxE<? extends C75V, ? extends C76B>, InterfaceC060673f, HxE<? extends C75V, ? extends C76B>>() { // from class: X.73Z
                    @Override // X.G0V
                    public final /* bridge */ /* synthetic */ HxE<? extends C75V, ? extends C76B> invoke(HxE<? extends C75V, ? extends C76B> hxE, InterfaceC060673f interfaceC060673f) {
                        InterfaceC060673f interfaceC060673f2 = interfaceC060673f;
                        return C60R.A0n(interfaceC060673f2, hxE, interfaceC060673f2 instanceof C75V ? 1 : 0);
                    }
                });
            }
            if (c73d2 instanceof AnonymousClass738) {
                Iterator itA0i = C3cG.A0i(A03((AnonymousClass738) c73d2));
                while (itA0i.hasNext()) {
                    Map.Entry entryA0l = C3cH.A0l(itA0i);
                    Object key = entryA0l.getKey();
                    ((List) C60R.A0Z(key, linkedHashMapA0j)).addAll((Collection) entryA0l.getValue());
                }
            }
            i = i2;
        }
        return linkedHashMapA0j;
    }

    public static final boolean A04(C73D c73d) {
        if (c73d instanceof C73K) {
            return true;
        }
        if (c73d instanceof AnonymousClass738) {
            List<C73D> list = ((AnonymousClass738) c73d).A01;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<C73D> it = list.iterator();
                while (it.hasNext()) {
                    if (A04(it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
