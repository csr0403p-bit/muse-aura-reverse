package X;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.aura.app.noopbindings.foa.NoOpVideoPlayer;
import com.facebook.aura.app.noopbindings.foa.NoOpVideoPlayerCreator;
import com.facebook.primitive.video.ViewOwnerTracker;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final class FKF implements View.OnAttachStateChangeListener, InterfaceC7888FJg {
    public FKE A00;
    public NoOpVideoPlayer A01;
    public ViewOwnerTracker A02;
    public String A04;
    public G0U<? super String, Unit> A05;
    public G0U<? super Integer, Unit> A06;
    public boolean A07;
    public int A0A;
    public Uri A0B;
    public HiK A0C;
    public FJ1 A0D;
    public Integer A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public final Context A0M;
    public final NoOpVideoPlayerCreator A0N;
    public final C7913FKl A0L = new C7913FKl(FZO.A02(this, 27));
    public Integer A03 = C79.A00;
    public int A09 = -1;
    public int A08 = -1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(android.net.Uri r4, X.HiK r5, X.FJ1 r6, java.lang.Integer r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, int r12, int r13, int r14, boolean r15, boolean r16, boolean r17) {
        /*
            r3 = this;
            r1 = 1
            X.AnonymousClass002.A1D(r8, r1, r5)
            r3.A0D = r6
            r3.A04 = r8
            r3.A0G = r9
            r3.A0H = r10
            r3.A0F = r11
            r3.A0C = r5
            r3.A0I = r15
            r3.A0B = r4
            r0 = r16
            r3.A0K = r0
            r3.A0A = r12
            r3.A09 = r13
            r3.A08 = r14
            r0 = r17
            r3.A0J = r0
            r3.A0E = r7
            if (r6 == 0) goto L5e
            android.net.Uri r2 = r6.A00
        L28:
            if (r2 == 0) goto L34
            java.lang.String r0 = r2.getScheme()
            if (r0 == 0) goto L42
            java.lang.String r11 = r2.getPath()
        L34:
            if (r11 == 0) goto L42
            java.lang.String r1 = "NoOpVideoPlayerCreatorProvider"
            java.lang.String r0 = "Video playback is unsupported in Aura; rendering an empty video surface"
            X.CFK.A06(r1, r0)
            com.facebook.aura.app.noopbindings.foa.NoOpVideoPlayer r0 = com.facebook.aura.app.noopbindings.foa.NoOpVideoPlayer.INSTANCE
            r3.A01 = r0
        L41:
            return
        L42:
            java.lang.Integer r0 = X.C79.A0Y
            r3.A03 = r0
            X.FKE r6 = r3.A00
            if (r6 == 0) goto L41
            r5 = 0
            X.FDW r4 = r6.A01
            X.HsM r3 = r6.A02
            X.Fyg r2 = X.C9115Fyg.A00()
            java.lang.String r0 = "error"
            r2.A06(r0, r5)
            X.FBB r0 = r6.A00
            X.F9J.A03(r0, r4, r2, r3, r1)
            return
        L5e:
            r2 = 0
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FKF.A01(android.net.Uri, X.HiK, X.FJ1, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, int, boolean, boolean, boolean):void");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        C7384Etj.A0Y(view, 0);
        if (view instanceof ViewGroup) {
            if (this.A01 == null) {
                FJ1 fj1 = this.A0D;
                String str = this.A04;
                if (str == null) {
                    throw C3cG.A0Q("Required value was null.");
                }
                String str2 = this.A0G;
                String str3 = this.A0H;
                String str4 = this.A0F;
                HiK hiK = this.A0C;
                if (hiK == null) {
                    throw C3cG.A0Q("Required value was null.");
                }
                boolean z = this.A0I;
                Uri uri = this.A0B;
                boolean z2 = this.A0K;
                A01(uri, hiK, fj1, this.A0E, str, str2, str3, str4, this.A0A, this.A09, this.A08, z, z2, this.A0J);
            }
            if (!this.A07) {
                this.A07 = true;
            }
            this.A02 = ViewOwnerTracker.A00(view, this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        C7384Etj.A0Y(view, 0);
        if (view instanceof ViewGroup) {
            ViewOwnerTracker viewOwnerTracker = this.A02;
            if (viewOwnerTracker != null) {
                viewOwnerTracker.A02();
            }
            this.A02 = null;
            if (this.A07) {
                this.A07 = false;
            }
            A00();
        }
    }

    public final void A00() {
        if (this.A01 != null) {
            this.A01 = null;
            this.A03 = C79.A00;
            FKE fke = this.A00;
            if (fke != null) {
                FDW fdw = fke.A01;
                HsM hsM = fke.A02;
                C9115Fyg c9115FygA00 = C9115Fyg.A00();
                c9115FygA00.A06("unprepared", 0);
                F9J.A03(fke.A00, fdw, c9115FygA00, hsM, 1);
            }
            this.A0K = false;
        }
    }

    public FKF(Context context, NoOpVideoPlayerCreator noOpVideoPlayerCreator) {
        this.A0M = context;
        this.A0N = noOpVideoPlayerCreator;
    }
}
