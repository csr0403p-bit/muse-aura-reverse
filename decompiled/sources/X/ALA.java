package X;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.meta.maps.core.GeoCoordinates;
import com.meta.maps.display.SDKAlignment;
import com.meta.maps.display.SDKInsets;
import com.meta.maps.display.camera.CameraPose;
import com.meta.maps.display.logging.SurfaceType;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class ALA extends FrameLayout {
    public AFR A00;
    public C9n4 A01;
    public ALK A02;
    public boolean A03;

    public static final void A00(ALK alk, ALA ala) {
        CameraPose cameraPose;
        ViewGroup viewGroup;
        AFR afr = alk.A01;
        if (!afr.A00) {
            AL9 al9 = afr.A02;
            if (ala.A00 != afr || al9.getParent() == ala) {
                if (ala.A00 != afr) {
                    if (ala.A03 && al9.getParent() != null) {
                        return;
                    }
                    ala.A03 = false;
                    A01(ala);
                    ViewParent parent = al9.getParent();
                    if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                        viewGroup.removeView(al9);
                    }
                    ala.A00 = afr;
                    ala.A01 = null;
                    ala.addView(al9, new FrameLayout.LayoutParams(-1, -1));
                }
                al9.A0H = new C2334BUi(26, alk, ala);
                al9.A0G = alk.A03;
                ALE ale = alk.A00;
                if (!al9.A0b && al9.A05 == null) {
                    CameraPose cameraPose2 = ale.A05;
                    if (cameraPose2 != null) {
                        cameraPose = new CameraPose();
                        GeoCoordinates geoCoordinates = cameraPose2.center;
                        cameraPose.center = geoCoordinates != null ? new GeoCoordinates(geoCoordinates.latitude, geoCoordinates.longitude, geoCoordinates.altitude) : null;
                        SDKAlignment sDKAlignment = cameraPose2.anchor;
                        cameraPose.anchor = sDKAlignment != null ? new SDKAlignment(sDKAlignment.nX, sDKAlignment.nY) : null;
                        cameraPose.zoomLevel = cameraPose2.zoomLevel;
                        cameraPose.pitch = cameraPose2.pitch;
                        cameraPose.heading = cameraPose2.heading;
                        SDKInsets sDKInsets = cameraPose2.padding;
                        cameraPose.padding = new SDKInsets(sDKInsets.left, sDKInsets.top, sDKInsets.right, sDKInsets.bottom);
                        cameraPose.framing = cameraPose2.framing;
                    } else {
                        cameraPose = null;
                    }
                    C9V6 c9v6 = ale.A02;
                    C9V4 c9v4 = ale.A03;
                    ALL all = ale.A01;
                    boolean z = ale.A09;
                    ALJ alj = ale.A04;
                    int i = ale.A00;
                    String str = ale.A07;
                    String str2 = ale.A08;
                    SurfaceType surfaceType = ale.A06;
                    AnonymousClass005.A11(c9v6, c9v4, all, 0);
                    AnonymousClass002.A1F(alj, 5, surfaceType);
                    al9.A05 = new ALE(all, c9v6, c9v4, alj, cameraPose, surfaceType, str, str2, i, z);
                    al9.A06 = all;
                    al9.A0A = alj;
                    al9.A0Z.Af8(C0978ALa.A00);
                    al9.setBackgroundColor(i);
                    AL9.A0G(al9);
                }
                al9.A0M(ale.A02, ale.A09);
                al9.setGestures(ale.A01);
                al9.setAttribution(ale.A04);
                C9n4 session = al9.getSession();
                if (session == null || session == ala.A01) {
                    return;
                }
                ala.A01 = session;
                G0U<C9n4, Unit> g0u = alk.A02;
                if (g0u != null) {
                    g0u.invoke(session);
                    return;
                }
                return;
            }
            ala.A03 = true;
        }
        A01(ala);
    }

    public static final void A01(ALA ala) {
        AFR afr = ala.A00;
        if (afr != null) {
            ala.A00 = null;
            ala.A01 = null;
            AL9 al9 = afr.A02;
            if (al9.getParent() == ala) {
                al9.A0H = null;
                ala.removeView(al9);
                List<WeakReference<ALA>> list = ALG.A00.get(afr);
                if (list != null) {
                    Iterator<E> it = new C0894AGw(list).iterator();
                    while (it.hasNext()) {
                        ALA ala2 = (ALA) ((Reference) it.next()).get();
                        if (ala2 != null && ala2 != ala && ala2.isAttachedToWindow()) {
                            ALK alk = ala2.A02;
                            if (alk == null || alk.A01 != afr) {
                                return;
                            }
                            ala2.A03 = false;
                            if (ala2.A00 == afr && al9.getParent() != ala2) {
                                ala2.A00 = null;
                                ala2.A01 = null;
                            }
                            A00(alk, ala2);
                            return;
                        }
                    }
                }
            }
        }
    }
}
