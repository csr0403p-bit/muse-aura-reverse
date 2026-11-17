package X;

import android.app.Activity;
import android.content.Context;
import com.facebook.aura.iap.HatchIapConfig;
import com.facebook.aura.iap.HatchIapUserSession;
import com.facebook.payments.dcp.xapp.controller.IapController;
import com.google.common.base.Optional;
import java.util.List;
import java.util.Map;

/* renamed from: X.Gdn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9683Gdn implements Hon {
    public final F0C<C9682Gdm> iapManagerLazy;
    public final Object iapManagerLock;
    public final F0C iapUserSessionCache$delegate;
    public final F0C iapUserSessionId$delegate;
    public final F0C optionalIacBillingClientProvider$delegate;
    public final InterfaceC9568GPa productCache;
    public final C9686Gdq sessionEndReporter;

    @Override // X.InterfaceC10609Hyj
    public void fetchProductDetails(List<String> list, List<String> list2, EnumC10621Hzf enumC10621Hzf, boolean z, Map<String, String> map, String str, Hvy hvy) {
        C7384Etj.A0Y(enumC10621Hzf, 2);
        AnonymousClass003.A0z(str, hvy);
        getIapManager().fetchProductDetails(list, list2, enumC10621Hzf, z, map, str, hvy);
    }

    @Override // X.Hon
    public abstract /* synthetic */ String getActorID();

    public abstract boolean getIacKilled();

    @Override // X.Hon
    public abstract /* synthetic */ BWT getPaymentTenantOverrideUrl();

    public void onDestroy(Ho8 ho8) {
        C7384Etj.A0Y(ho8, 0);
        getIapManager().A00.A03(ho8);
    }

    public void onSessionEnd(Ho8 ho8) {
        C7384Etj.A0Y(ho8, 0);
        C9682Gdm c9682GdmBuiltIapManager = builtIapManager();
        if (c9682GdmBuiltIapManager != null) {
            c9682GdmBuiltIapManager.A00.A03(ho8);
        }
    }

    public void preWarm(Context context, Hnw hnw, Hyl hyl) {
        boolean zA1a = AnonymousClass002.A1a(context, hnw);
        IapController iapController = getIapManager().A00;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C9699Ge6 c9699Ge6 = iapController.A01;
        String str = hnw.A00;
        Boolean boolValueOf = Boolean.valueOf(zA1a);
        C7384Etj.A0Y(str, 0);
        C9700GeE c9700GeEA0J = c9699Ge6.A0J(null);
        Map<String, String> map = c9700GeEA0J.A01;
        map.put("has_play_store_enabled", String.valueOf(zA1a));
        c9700GeEA0J.A02(c9699Ge6.A01);
        c9700GeEA0J.A06(boolValueOf);
        C7NC.A00(AbstractC7607F5u.A0s(c9699Ge6.A02.acquireEvent("client_load_dcpiap_init"), 36), new FYG(C9699Ge6.A01(c9699Ge6, null, null, null, str.length() != 0 ? str : null), c9699Ge6, str, map, zA1a ? 1 : 0));
        C9687Gdr c9687Gdr = new C9687Gdr(iapController, hnw, hyl, jCurrentTimeMillis);
        C78U c78u = iapController.A07;
        FZG fzg = new FZG(14, c9687Gdr, iapController);
        c78u.A04(fzg, new C8894FtB(context, iapController, hnw, c9687Gdr, null, 2), FZO.A02(fzg, 23));
    }

    public final void reportSessionEnd(Ho8 ho8) {
        C9699Ge6 c9699Ge6;
        C7384Etj.A0Y(ho8, 0);
        C9686Gdq c9686Gdq = this.sessionEndReporter;
        if (new HatchIapConfig().enableSessionLifecycleClose()) {
            if ((ho8 == Ho8.LOGOUT || ho8 == Ho8.ACCOUNT_SWITCH) && Bs8.A00(null, ho8, c9686Gdq.A01) && (c9699Ge6 = c9686Gdq.A00.get()) != null) {
                c9699Ge6.A0K(ho8);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void startup(X.AbstractC9689Gdt r9, X.HsT r10, android.app.Activity r11) {
        /*
            r8 = this;
            r5 = 0
            boolean r7 = X.AnonymousClass002.A1a(r9, r10)
            X.Gdm r0 = r8.getIapManager()
            com.facebook.payments.dcp.xapp.controller.IapController r1 = r0.A00
            X.Gdi r3 = r1.A05
            X.HpW r0 = r1.A04
            X.Hnl r4 = new X.Hnl
            r4.<init>(r0, r10)
            r0 = 20
            X.FZO r9 = X.FZO.A02(r1, r0)
            r0 = 21
            X.FZO r0 = X.FZO.A02(r3, r0)
            r10 = 0
            X.DgG r6 = X.AbstractC7607F5u.A1A(r10, r0)
            r0 = 22
            X.FZO r0 = X.FZO.A02(r3, r0)
            X.DgG r2 = X.AbstractC7607F5u.A1A(r10, r0)
            r1 = 15
            X.FYo r0 = new X.FYo
            r0.<init>(r6, r2, r1)
            X.DgG r8 = X.AbstractC7607F5u.A1A(r10, r0)
            r1 = 17
            X.FYo r0 = new X.FYo
            r0.<init>(r6, r8, r1)
            X.DgG r0 = X.AbstractC7607F5u.A1A(r10, r0)
            java.lang.Object r0 = r0.getValue()
            boolean r0 = X.AnonymousClass001.A1X(r0)
            if (r0 == 0) goto La3
            X.Gdk r0 = r3.A03
            java.util.concurrent.atomic.AtomicBoolean r6 = r0.A00
            boolean r0 = r6.compareAndSet(r5, r7)
            if (r0 == 0) goto La3
            java.util.concurrent.atomic.AtomicBoolean r3 = X.BV4.A12(r5)
            java.util.concurrent.atomic.AtomicBoolean r2 = X.BV4.A12(r5)
            r0 = 16
            X.FYo r1 = new X.FYo
            r1.<init>(r0, r2, r9)
            java.lang.Object r0 = r8.getValue()     // Catch: java.lang.Throwable -> L7c
            boolean r0 = X.AnonymousClass001.A1X(r0)     // Catch: java.lang.Throwable -> L7c
            if (r0 == 0) goto L75
            r1.invoke()     // Catch: java.lang.Throwable -> L7c
        L75:
            java.lang.String r0 = "getSessionId"
            java.lang.NullPointerException r0 = X.BV4.A0a(r0)     // Catch: java.lang.Throwable -> L7c
            throw r0     // Catch: java.lang.Throwable -> L7c
        L7c:
            r2 = move-exception
            java.lang.String r1 = X.AbstractC9675Gdf.A00
            java.lang.String r0 = "Unexpected IAP startup failure"
            X.CFK.A08(r1, r0, r2)
            boolean r0 = r3.compareAndSet(r5, r7)
            if (r0 == 0) goto Laa
            r6.set(r5)     // Catch: java.lang.Throwable -> L96
            X.GeI r2 = X.EnumC9704GeI.A0C
            r0 = 5
            X.I0P r1 = new X.I0P
            r1.<init>(r0)
            goto La7
        L96:
            r3 = move-exception
            X.GeI r2 = X.EnumC9704GeI.A0C
            r1 = 5
            X.I0P r0 = new X.I0P
            r0.<init>(r1)
            r4.AVq(r0, r2)
            throw r3
        La3:
            X.GeI r2 = X.EnumC9704GeI.A0E
            X.HoG r1 = X.C9732Gel.A03
        La7:
            r4.AVq(r1, r2)
        Laa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC9683Gdn.startup(X.Gdt, X.HsT, android.app.Activity):void");
    }

    public AbstractC9683Gdn() {
        this(C8631Fhi.A00(12));
    }

    private final C9682Gdm builtIapManager() {
        C9682Gdm value;
        synchronized (this.iapManagerLock) {
            value = this.iapManagerLazy.AOX() ? this.iapManagerLazy.getValue() : null;
        }
        return value;
    }

    private final Optional getOptionalIacBillingClientProvider() {
        return (Optional) this.optionalIacBillingClientProvider$delegate.getValue();
    }

    public /* synthetic */ InterfaceC9690Gdu getIapJSONObjectSerializer() {
        return null;
    }

    public final C9682Gdm getIapManager() {
        return this.iapManagerLazy.getValue();
    }

    public C9685Gdp getIapUserSessionCache() {
        return (C9685Gdp) this.iapUserSessionCache$delegate.getValue();
    }

    public String getIapUserSessionId() {
        return (String) C7384Etj.A0G(this.iapUserSessionId$delegate);
    }

    public InterfaceC9568GPa getProductCache() {
        return this.productCache;
    }

    public final C9686Gdq getSessionEndReporter() {
        return this.sessionEndReporter;
    }

    public InterfaceC10505Hno getBillingClientProvider() {
        InterfaceC10505Hno iacBillingClientProvider = getIacBillingClientProvider();
        return iacBillingClientProvider == null ? (InterfaceC10505Hno) AbstractC5245DeA.A01(81920) : iacBillingClientProvider;
    }

    public InterfaceC10505Hno getIacBillingClientProvider() {
        EXX exx = (EXX) getOptionalIacBillingClientProvider().orNull();
        if (exx == null || (!((HatchIapUserSession) this).getUseIacOverIap())) {
            return null;
        }
        return exx;
    }

    @Override // X.InterfaceC10609Hyj
    public void launchPurchaseFlow(Activity activity, C9698Ge3 c9698Ge3, Hx5 hx5, Hx2 hx2, InterfaceC10552Hsd interfaceC10552Hsd) {
        AnonymousClass005.A0x(activity, c9698Ge3, hx5);
        getIapManager().launchPurchaseFlow(activity, c9698Ge3, hx5, hx2, interfaceC10552Hsd);
    }

    public void onSessionStart() {
        getIapManager().A00();
    }

    public void onUserLogin() {
        getIapManager().A00();
    }

    public void onUserLogout() {
        C9682Gdm c9682GdmBuiltIapManager = builtIapManager();
        if (c9682GdmBuiltIapManager != null) {
            G4n g4n = G4n.$redex_init_class;
            c9682GdmBuiltIapManager.A00.A03(Ho8.LOGOUT);
        }
    }

    @Override // X.InterfaceC10609Hyj
    public void preFetchData(Hs8 hs8, String str, C9698Ge3 c9698Ge3) {
        AnonymousClass003.A0u(hs8, str);
        getIapManager().preFetchData(hs8, str, c9698Ge3);
    }

    public AbstractC9683Gdn(G0U<? super AbstractC9683Gdn, C9682Gdm> g0u) {
        C7384Etj.A0Y(g0u, 0);
        this.sessionEndReporter = new C9686Gdq();
        Object objA0T = C3cG.A0T();
        this.iapManagerLock = objA0T;
        this.iapManagerLazy = AbstractC7607F5u.A1A(objA0T, new C8197FYo(12, this, g0u));
        this.productCache = new C10439Hhm();
        this.iapUserSessionCache$delegate = AbstractC7607F5u.A1A(null, FZO.A02(this, 17));
        this.iapUserSessionId$delegate = AbstractC7607F5u.A1A(null, C8472Feb.A00(10));
        this.optionalIacBillingClientProvider$delegate = AbstractC7607F5u.A1A(null, new C6724EXi(15));
    }

    public final void onSessionStart(Activity activity) {
        getIapManager().A00();
    }

    public final void onUserLogin(Activity activity) {
        getIapManager().A00();
    }
}
