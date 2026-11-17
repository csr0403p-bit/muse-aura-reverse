package X;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.bloks.components.bkcomponentsfrontierqrscanner.BKBloksComponentsFrontierQRScannerBinderUtil$QRScannerRenderUnit$lifecycleListener$1;
import kotlin.Unit;

/* renamed from: X.FEs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7787FEs extends FHi<View, Object> {
    public C7788FEu A00;
    public final BKBloksComponentsFrontierQRScannerBinderUtil$QRScannerRenderUnit$lifecycleListener$1 A01;
    public final FEZ A02;
    public final G0U<String, Unit> A03;
    public final G0U<String, Unit> A04;

    @Override // X.InterfaceC7830FGl
    public final /* bridge */ /* synthetic */ Object A7d(Context context) {
        C7384Etj.A0Y(context, 0);
        C7788FEu c7788FEu = new C7788FEu(new View(context));
        this.A00 = c7788FEu;
        return c7788FEu.A00;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/FDW;LX/FBB;LX/G0U<-Ljava/lang/String;Lkotlin/Unit;>;LX/G0U<-Ljava/lang/String;Lkotlin/Unit;>;)V */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.bloks.components.bkcomponentsfrontierqrscanner.BKBloksComponentsFrontierQRScannerBinderUtil$QRScannerRenderUnit$lifecycleListener$1] */
    public C7787FEs(FBB fbb, FDW fdw, G0U g0u, G0U g0u2) {
        super(fbb, fdw);
        this.A04 = g0u;
        this.A03 = g0u2;
        this.A02 = FEY.A00;
        this.A01 = new Application.ActivityLifecycleCallbacks() { // from class: com.bloks.components.bkcomponentsfrontierqrscanner.BKBloksComponentsFrontierQRScannerBinderUtil$QRScannerRenderUnit$lifecycleListener$1
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityDestroyed(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPaused(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityResumed(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStarted(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStopped(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityCreated(Activity activity, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }
        };
    }
}
