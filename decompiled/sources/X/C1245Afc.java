package X;

import android.view.MotionEvent;
import java.util.List;

/* renamed from: X.Afc, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1245Afc {
    public C1247Afe A00;
    public InterfaceC1497Ak4 A01;
    public Integer A02;
    public final /* synthetic */ C1244Afb A03;

    public C1245Afc(C1244Afb c1244Afb) {
        this.A03 = c1244Afb;
        this.A02 = C79.A00;
    }

    public static final void A00(C1247Afe c1247Afe, C1245Afc c1245Afc) {
        if (c1245Afc.A02 == C79.A01) {
            InterfaceC1497Ak4 interfaceC1497Ak4 = c1245Afc.A01;
            if (interfaceC1497Ak4 == null) {
                throw C3cG.A0Q("layoutCoordinates not set");
            }
            A02(c1247Afe, BUX.A00(c1245Afc.A03, 28), InterfaceC1497Ak4.A00(interfaceC1497Ak4), true);
        }
        c1245Afc.A02 = C79.A0C;
    }

    public static final void A01(C1247Afe c1247Afe, C1245Afc c1245Afc, boolean z) {
        List<C1299Agk> list = c1247Afe.A05;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (C1299Agk.A01(list, i)) {
                A00(c1247Afe, c1245Afc);
                return;
            }
        }
        InterfaceC1497Ak4 interfaceC1497Ak4 = c1245Afc.A01;
        if (interfaceC1497Ak4 == null) {
            throw C3cG.A0Q("layoutCoordinates not set");
        }
        A02(c1247Afe, new C2334BUi(14, c1245Afc, c1245Afc.A03), InterfaceC1497Ak4.A00(interfaceC1497Ak4), false);
        if (c1245Afc.A02 == C79.A01) {
            if (z) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    C1299Agk.A00(list, i2);
                }
            }
            C1319Ah5 c1319Ah5 = c1247Afe.A04;
            if (c1319Ah5 != null) {
                c1319Ah5.A00 = !r4.A02;
            }
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Afe;JLX/G0U<-Landroid/view/MotionEvent;Lkotlin/Unit;>;Z)V */
    public static final void A02(C1247Afe c1247Afe, G0U g0u, long j, boolean z) {
        MotionEvent motionEvent;
        C1319Ah5 c1319Ah5 = c1247Afe.A04;
        if (c1319Ah5 == null || (motionEvent = c1319Ah5.A02.A00) == null) {
            throw C60O.A0i("The PointerEvent receiver cannot have a null MotionEvent.");
        }
        int action = motionEvent.getAction();
        if (z) {
            motionEvent.setAction(3);
        }
        float fA03 = AnonymousClass003.A03(j);
        float fA00 = AnonymousClass004.A00(j);
        motionEvent.offsetLocation(-fA03, -fA00);
        g0u.invoke(motionEvent);
        motionEvent.offsetLocation(fA03, fA00);
        motionEvent.setAction(action);
    }

    public C1245Afc() {
    }
}
