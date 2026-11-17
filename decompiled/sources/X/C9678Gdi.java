package X;

import android.content.Context;
import com.facebook.aura.iap.HatchIapCacheProvider;
import com.facebook.payments.dcp.xapp.controller.IapSessionContextController;
import com.facebook.payments.dcp.xapp.controller.init.IapSyncController;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Gdi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9678Gdi {
    public final Context A00;
    public final HatchIapCacheProvider A01;
    public final C9699Ge6 A02;
    public final C9680Gdk A03;
    public final InterfaceC9729Gei A04;
    public final IapSessionContextController A05;
    public final C9679Gdj A06;
    public final IapSyncController A07;
    public final C78U A08;

    public C9678Gdi(Context context, HatchIapCacheProvider hatchIapCacheProvider, C9699Ge6 c9699Ge6, C9680Gdk c9680Gdk, InterfaceC9729Gei interfaceC9729Gei, IapSessionContextController iapSessionContextController, C9679Gdj c9679Gdj, IapSyncController iapSyncController, C78U c78u) {
        C60O.A1N(c78u, 7, context);
        this.A04 = interfaceC9729Gei;
        this.A02 = c9699Ge6;
        this.A05 = iapSessionContextController;
        this.A07 = iapSyncController;
        this.A06 = c9679Gdj;
        this.A01 = hatchIapCacheProvider;
        this.A03 = c9680Gdk;
        this.A08 = c78u;
        this.A00 = context;
    }

    public static final void A00(C9678Gdi c9678Gdi, C9677Gdh c9677Gdh, HsT hsT, AtomicBoolean atomicBoolean, F0C f0c, boolean z) {
        if (atomicBoolean.compareAndSet(false, true)) {
            boolean z2 = c9677Gdh.A01.isError;
            boolean z3 = !z2;
            try {
                if (z) {
                    ((HatchIapCacheProvider.AnonymousClass1) f0c.getValue()).setPurchaseSyncRequired(z2);
                }
            } catch (Throwable th) {
                CFK.A08(AbstractC9675Gdf.A00, "Failed persisting the IAP startup synchronization state", th);
            } finally {
            }
            C9680Gdk c9680Gdk = c9678Gdi.A03;
            if (!z3) {
                c9680Gdk.A00.set(false);
            }
        }
    }
}
