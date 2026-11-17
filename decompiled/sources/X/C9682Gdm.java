package X;

import android.app.Activity;
import com.facebook.payments.dcp.xapp.controller.IapController;
import java.util.List;
import java.util.Map;

/* renamed from: X.Gdm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9682Gdm implements InterfaceC10609Hyj {
    public final IapController A00;
    public final Hon A01;

    @Override // X.InterfaceC10609Hyj
    public final void fetchProductDetails(List<String> list, List<String> list2, EnumC10621Hzf enumC10621Hzf, boolean z, Map<String, String> map, String str, Hvy hvy) {
        C7384Etj.A0Y(enumC10621Hzf, 2);
        AnonymousClass003.A0z(str, hvy);
        this.A00.fetchProductDetails(list, list2, enumC10621Hzf, z, map, str, hvy);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00() {
        /*
            r21 = this;
            X.G4n r0 = X.G4n.$redex_init_class
            r10 = 0
            java.lang.String r2 = "ALL_PRODUCTS"
            X.Gdl r3 = X.C9681Gdl.A00
            r6 = 1
            r0 = r21
            com.facebook.payments.dcp.xapp.controller.IapController r1 = r0.A00
            X.Gdi r14 = r1.A05
            X.HpW r0 = r1.A04
            X.Hnl r15 = new X.Hnl
            r15.<init>(r0, r3)
            r0 = 20
            X.FZO r12 = X.FZO.A02(r1, r0)
            r5 = 0
            r0 = 21
            X.FZO r0 = X.FZO.A02(r14, r0)
            X.DgG r1 = X.AbstractC7607F5u.A1A(r10, r0)
            r0 = 22
            X.FZO r0 = X.FZO.A02(r14, r0)
            X.DgG r9 = X.AbstractC7607F5u.A1A(r10, r0)
            r3 = 15
            X.FYo r0 = new X.FYo
            r0.<init>(r1, r9, r3)
            X.DgG r11 = X.AbstractC7607F5u.A1A(r10, r0)
            r3 = 17
            X.FYo r0 = new X.FYo
            r0.<init>(r1, r11, r3)
            X.DgG r13 = X.AbstractC7607F5u.A1A(r10, r0)
            java.lang.Object r0 = r13.getValue()
            boolean r0 = X.AnonymousClass001.A1X(r0)
            if (r0 == 0) goto Lec
            X.Gdk r0 = r14.A03
            java.util.concurrent.atomic.AtomicBoolean r4 = r0.A00
            boolean r0 = r4.compareAndSet(r5, r6)
            if (r0 == 0) goto Lec
            java.util.concurrent.atomic.AtomicBoolean r3 = X.BV4.A12(r5)
            java.util.concurrent.atomic.AtomicBoolean r7 = X.BV4.A12(r5)
            r0 = 16
            X.FYo r8 = new X.FYo
            r8.<init>(r0, r7, r12)
            java.lang.Object r0 = r11.getValue()     // Catch: java.lang.Throwable -> Lc5
            boolean r0 = X.AnonymousClass001.A1X(r0)     // Catch: java.lang.Throwable -> Lc5
            if (r0 == 0) goto L76
            r8.invoke()     // Catch: java.lang.Throwable -> Lc5
        L76:
            X.Ge6 r0 = r14.A02     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r7 = X.C9699Ge6.A03()     // Catch: java.lang.Throwable -> Lc5
            r0.A0B = r7     // Catch: java.lang.Throwable -> Lc5
            com.facebook.payments.dcp.xapp.controller.IapSessionContextController r0 = r14.A05     // Catch: java.lang.Throwable -> Lc5
            com.facebook.payments.dcp.xapp.controller.IapSessionContextController.A03(r0, r2)     // Catch: java.lang.Throwable -> Lc5
            java.lang.Object r0 = r13.getValue()     // Catch: java.lang.Throwable -> Lc5
            boolean r0 = X.AnonymousClass001.A1X(r0)     // Catch: java.lang.Throwable -> Lc5
            if (r0 == 0) goto Lba
            java.lang.Object r0 = r1.getValue()     // Catch: java.lang.Throwable -> Lc5
            boolean r0 = X.AnonymousClass001.A1X(r0)     // Catch: java.lang.Throwable -> Lc5
            r21 = r0 ^ 1
            X.78U r2 = r14.A08     // Catch: java.lang.Throwable -> Lc5
            X.Gdg r1 = new X.Gdg     // Catch: java.lang.Throwable -> Lc5
            r13 = r1
            r16 = r7
            r17 = r3
            r18 = r9
            r19 = r21
            r13.<init>(r14, r15, r16, r17, r18, r19)     // Catch: java.lang.Throwable -> Lc5
            com.facebook.payments.dcp.xapp.controller.init.IapStartupController$startup$3 r13 = new com.facebook.payments.dcp.xapp.controller.init.IapStartupController$startup$3     // Catch: java.lang.Throwable -> Lc5
            r20 = r8
            r19 = r10
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)     // Catch: java.lang.Throwable -> Lc5
            r0 = 23
            X.FZO r0 = X.FZO.A02(r1, r0)     // Catch: java.lang.Throwable -> Lc5
            r2.A04(r1, r13, r0)     // Catch: java.lang.Throwable -> Lc5
            return
        Lba:
            r3.set(r6)     // Catch: java.lang.Throwable -> Lc5
            X.GeI r1 = X.EnumC9704GeI.A0O     // Catch: java.lang.Throwable -> Lc5
            X.HoG r0 = X.C9732Gel.A03     // Catch: java.lang.Throwable -> Lc5
            r15.AVq(r0, r1)     // Catch: java.lang.Throwable -> Lc5
            return
        Lc5:
            r2 = move-exception
            java.lang.String r1 = X.AbstractC9675Gdf.A00
            java.lang.String r0 = "Unexpected IAP startup failure"
            X.CFK.A08(r1, r0, r2)
            boolean r0 = r3.compareAndSet(r5, r6)
            if (r0 == 0) goto Lf3
            r4.set(r5)     // Catch: java.lang.Throwable -> Ldf
            X.GeI r2 = X.EnumC9704GeI.A0C
            r0 = 5
            X.I0P r1 = new X.I0P
            r1.<init>(r0)
            goto Lf0
        Ldf:
            r3 = move-exception
            X.GeI r2 = X.EnumC9704GeI.A0C
            r1 = 5
            X.I0P r0 = new X.I0P
            r0.<init>(r1)
            r15.AVq(r0, r2)
            throw r3
        Lec:
            X.GeI r2 = X.EnumC9704GeI.A0E
            X.HoG r1 = X.C9732Gel.A03
        Lf0:
            r15.AVq(r1, r2)
        Lf3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9682Gdm.A00():void");
    }

    public C9682Gdm(Hon hon, IapController iapController) {
        this.A01 = hon;
        this.A00 = iapController;
    }

    @Override // X.InterfaceC10609Hyj
    public final void launchPurchaseFlow(Activity activity, C9698Ge3 c9698Ge3, Hx5 hx5, Hx2 hx2, InterfaceC10552Hsd interfaceC10552Hsd) {
        AnonymousClass005.A0x(activity, c9698Ge3, hx5);
        this.A00.launchPurchaseFlow(activity, c9698Ge3, hx5, hx2, interfaceC10552Hsd);
    }

    @Override // X.InterfaceC10609Hyj
    public final void preFetchData(Hs8 hs8, String str, C9698Ge3 c9698Ge3) {
        AnonymousClass003.A0u(hs8, str);
        this.A00.preFetchData(hs8, str, c9698Ge3);
    }
}
