package X;

import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.common.DrmInitData;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager$MissingSchemeDataException;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import com.google.common.collect.ImmutableSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* renamed from: X.Dx2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6159Dx2 implements InterfaceC5460Div {
    public int A00;
    public Handler A01;
    public Looper A02;
    public C6160Dx3 A03;
    public InterfaceC6174DxH A04;
    public E6Y A05;
    public final long A06;
    public final C6182DxQ A07;
    public final List<C6160Dx3> A08;
    public final Set<C6160Dx3> A09;
    public final Set<C6194Dxe> A0A;
    public final UUID A0B;
    public final int[] A0C;
    public final C6231DyX A0D;
    public final InterfaceC2393BYv A0E;
    public final BVO A0F;
    public final InterfaceC5334DgV A0G;
    public final HashMap<String, String> A0H;
    public volatile HandlerC6186DxU A0I;

    @Override // X.InterfaceC5460Div
    public final InterfaceC5547DkP A32(C6154Dwx c6154Dwx, C6014Dtx c6014Dtx) {
        A04(false);
        C1G.A08(this.A00 > 0);
        Looper looper = this.A02;
        C1G.A05(looper);
        return A01(looper, c6154Dwx, this, c6014Dtx, true);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.AbstractCollection, java.util.ArrayList] */
    @Override // X.InterfaceC5460Div
    public final int AEH(C6154Dwx c6154Dwx) {
        A04(false);
        InterfaceC6174DxH interfaceC6174DxH = this.A04;
        interfaceC6174DxH.getClass();
        int iAEG = interfaceC6174DxH.AEG();
        DrmInitData drmInitData = c6154Dwx.A0T;
        if (drmInitData == null) {
            AbstractC6161Dx4.A01(c6154Dwx.A0b);
            return 0;
        }
        UUID uuid = this.A0B;
        if (A02(drmInitData, uuid, true).isEmpty()) {
            if (drmInitData.A01 != 1 || !drmInitData.A03[0].A00(AbstractC5400Dhr.A01)) {
                return 1;
            }
            CNC.A04("DefaultDrmSessionMgr", AnonymousClass007.A0a("DrmInitData only contains common PSSH SchemeData. Assuming support for: ", uuid));
        }
        String str = drmInitData.A02;
        if (str == null || "cenc".equals(str) || "cbcs".equals(str) || !("cbc1".equals(str) || "cens".equals(str))) {
            return iAEG;
        }
        return 1;
    }

    @Override // X.InterfaceC5460Div
    public final void Ae4(Looper looper, E6Y e6y) {
        synchronized (this) {
            Looper looper2 = this.A02;
            if (looper2 == null) {
                this.A02 = looper;
                this.A01 = BV4.A09(looper);
            } else {
                C1G.A08(AnonymousClass002.A1Z(looper2, looper));
                this.A01.getClass();
            }
        }
        this.A05 = e6y;
    }

    @Override // X.InterfaceC5460Div
    public final void prepare() {
        A04(true);
        int i = this.A00;
        this.A00 = i + 1;
        if (i != 0) {
            return;
        }
        if (this.A04 == null) {
            InterfaceC6174DxH interfaceC6174DxHA2z = this.A0E.A2z(this.A0B);
            this.A04 = interfaceC6174DxHA2z;
            interfaceC6174DxHA2z.Adt(new C5398Dhp(this));
        } else {
            int i2 = 0;
            while (true) {
                List<C6160Dx3> list = this.A08;
                if (i2 >= list.size()) {
                    return;
                }
                list.get(i2).A2v(null);
                i2++;
            }
        }
    }

    @Override // X.InterfaceC5460Div
    public final void release() {
        A04(true);
        int i = this.A00 - 1;
        this.A00 = i;
        if (i == 0) {
            ArrayList arrayListA0t = BV4.A0t(this.A08);
            for (int i2 = 0; i2 < arrayListA0t.size(); i2++) {
                ((C6160Dx3) arrayListA0t.get(i2)).Aa8(null);
            }
            Iterator it = ImmutableSet.A01(this.A0A).iterator();
            while (it.hasNext()) {
                ((C6194Dxe) it.next()).release();
            }
            A03(this);
        }
    }

    private C6160Dx3 A00(C6014Dtx c6014Dtx, List list) {
        this.A04.getClass();
        UUID uuid = this.A0B;
        InterfaceC6174DxH interfaceC6174DxH = this.A04;
        C6182DxQ c6182DxQ = this.A07;
        C6231DyX c6231DyX = this.A0D;
        HashMap<String, String> map = this.A0H;
        BVO bvo = this.A0F;
        Looper looper = this.A02;
        looper.getClass();
        InterfaceC5334DgV interfaceC5334DgV = this.A0G;
        E6Y e6y = this.A05;
        e6y.getClass();
        C6160Dx3 c6160Dx3 = new C6160Dx3(looper, e6y, c6182DxQ, c6231DyX, interfaceC6174DxH, bvo, interfaceC5334DgV, map, list, uuid);
        c6160Dx3.A2v(c6014Dtx);
        c6160Dx3.A2v(null);
        return c6160Dx3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.AbstractCollection, java.util.ArrayList, java.util.List] */
    public static InterfaceC5547DkP A01(Looper looper, C6154Dwx c6154Dwx, C6159Dx2 c6159Dx2, C6014Dtx c6014Dtx, boolean z) {
        if (c6159Dx2.A0I == null) {
            c6159Dx2.A0I = new HandlerC6186DxU(looper, c6159Dx2);
        }
        DrmInitData drmInitData = c6154Dwx.A0T;
        if (drmInitData == null) {
            AbstractC6161Dx4.A01(c6154Dwx.A0b);
            c6159Dx2.A04.getClass();
            return null;
        }
        UUID uuid = c6159Dx2.A0B;
        ?? A02 = A02(drmInitData, uuid, false);
        if (A02.isEmpty()) {
            DefaultDrmSessionManager$MissingSchemeDataException defaultDrmSessionManager$MissingSchemeDataException = new DefaultDrmSessionManager$MissingSchemeDataException(AnonymousClass007.A0a("Media does not support uuid: ", uuid));
            CNC.A05("DefaultDrmSessionMgr", "DRM error", defaultDrmSessionManager$MissingSchemeDataException);
            if (c6014Dtx != null) {
                c6014Dtx.A04(defaultDrmSessionManager$MissingSchemeDataException);
            }
            return new C5482DjK(new DrmSession$DrmSessionException(defaultDrmSessionManager$MissingSchemeDataException, 6003));
        }
        C6160Dx3 c6160Dx3 = c6159Dx2.A03;
        if (c6160Dx3 != null) {
            c6160Dx3.A2v(c6014Dtx);
            return c6160Dx3;
        }
        C6160Dx3 c6160Dx3A00 = c6159Dx2.A00(c6014Dtx, A02);
        C6160Dx3.A00(c6160Dx3A00);
        if (c6160Dx3A00.A00 == 1) {
            DrmSession$DrmSessionException drmSession$DrmSessionExceptionAFI = c6160Dx3A00.AFI();
            drmSession$DrmSessionExceptionAFI.getClass();
            Throwable cause = drmSession$DrmSessionExceptionAFI.getCause();
            if ((cause instanceof ResourceBusyException) || AbstractC6225DyI.A00(cause)) {
                Set<C6160Dx3> set = c6159Dx2.A09;
                if (!set.isEmpty()) {
                    Iterator it = ImmutableSet.A01(set).iterator();
                    while (it.hasNext()) {
                        ((InterfaceC5547DkP) it.next()).Aa8(null);
                    }
                    c6160Dx3A00.Aa8(c6014Dtx);
                    c6160Dx3A00.Aa8(null);
                    c6160Dx3A00 = c6159Dx2.A00(c6014Dtx, A02);
                }
            }
        }
        C6160Dx3.A00(c6160Dx3A00);
        if (c6160Dx3A00.A00 == 1) {
            DrmSession$DrmSessionException drmSession$DrmSessionExceptionAFI2 = c6160Dx3A00.AFI();
            drmSession$DrmSessionExceptionAFI2.getClass();
            Throwable cause2 = drmSession$DrmSessionExceptionAFI2.getCause();
            if (((cause2 instanceof ResourceBusyException) || AbstractC6225DyI.A00(cause2)) && z) {
                Set<C6194Dxe> set2 = c6159Dx2.A0A;
                if (!set2.isEmpty()) {
                    Iterator it2 = ImmutableSet.A01(set2).iterator();
                    while (it2.hasNext()) {
                        ((C6194Dxe) it2.next()).release();
                    }
                    Set<C6160Dx3> set3 = c6159Dx2.A09;
                    if (!set3.isEmpty()) {
                        Iterator it3 = ImmutableSet.A01(set3).iterator();
                        while (it3.hasNext()) {
                            ((InterfaceC5547DkP) it3.next()).Aa8(null);
                        }
                    }
                    c6160Dx3A00.Aa8(c6014Dtx);
                    c6160Dx3A00.Aa8(null);
                    c6160Dx3A00 = c6159Dx2.A00(c6014Dtx, A02);
                }
            }
        }
        c6159Dx2.A03 = c6160Dx3A00;
        c6159Dx2.A08.add(c6160Dx3A00);
        return c6160Dx3A00;
    }

    public static List<DrmInitData.SchemeData> A02(DrmInitData drmInitData, UUID uuid, boolean z) {
        int i = drmInitData.A01;
        ArrayList arrayListA11 = C60O.A11(i);
        for (int i2 = 0; i2 < i; i2++) {
            DrmInitData.SchemeData schemeData = drmInitData.A03[i2];
            if ((schemeData.A00(uuid) || (AbstractC5400Dhr.A00.equals(uuid) && schemeData.A00(AbstractC5400Dhr.A01))) && (schemeData.A04 != null || z)) {
                arrayListA11.add(schemeData);
            }
        }
        return arrayListA11;
    }

    public static void A03(C6159Dx2 c6159Dx2) {
        if (c6159Dx2.A04 != null && c6159Dx2.A00 == 0 && c6159Dx2.A08.isEmpty() && c6159Dx2.A0A.isEmpty()) {
            InterfaceC6174DxH interfaceC6174DxH = c6159Dx2.A04;
            interfaceC6174DxH.getClass();
            interfaceC6174DxH.release();
            c6159Dx2.A04 = null;
        }
    }

    private void A04(boolean z) {
        if (z && this.A02 == null) {
            CNC.A06("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", BV4.A0T());
            return;
        }
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.A02;
        looper.getClass();
        if (threadCurrentThread != looper.getThread()) {
            CNC.A06("DefaultDrmSessionMgr", FGI.A0d("DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: ", threadCurrentThread.getName(), "\nExpected thread: ", this.A02.getThread().getName()), BV4.A0T());
        }
    }

    @Override // X.InterfaceC5460Div
    public final InterfaceC5532Dk9 AYJ(final C6154Dwx c6154Dwx, C6014Dtx c6014Dtx) {
        C1G.A08(AnonymousClass002.A1N(this.A00));
        C1G.A05(this.A02);
        final C6194Dxe c6194Dxe = new C6194Dxe(this, c6014Dtx);
        Handler handler = c6194Dxe.A03.A01;
        handler.getClass();
        handler.post(new Runnable() { // from class: X.Dxd
            public static final String __redex_internal_original_name = "DefaultDrmSessionManager$PreacquiredSessionReference$$ExternalSyntheticLambda0";

            @Override // java.lang.Runnable
            public final void run() {
                C6194Dxe c6194Dxe2 = c6194Dxe;
                C6154Dwx c6154Dwx2 = c6154Dwx;
                C6159Dx2 c6159Dx2 = c6194Dxe2.A03;
                if (c6159Dx2.A00 == 0 || c6194Dxe2.A01) {
                    return;
                }
                Looper looper = c6159Dx2.A02;
                looper.getClass();
                c6194Dxe2.A00 = C6159Dx2.A01(looper, c6154Dwx2, c6159Dx2, c6194Dxe2.A02, false);
                c6159Dx2.A0A.add(c6194Dxe2);
            }
        });
        return c6194Dxe;
    }

    public C6159Dx2(InterfaceC2393BYv interfaceC2393BYv, BVO bvo, InterfaceC5334DgV interfaceC5334DgV, HashMap map, UUID uuid, int[] iArr) {
        C1G.A09(!AbstractC5400Dhr.A01.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.A0B = uuid;
        this.A0E = interfaceC2393BYv;
        this.A0F = bvo;
        this.A0H = map;
        this.A0C = iArr;
        this.A0G = interfaceC5334DgV;
        this.A07 = new C6182DxQ(this);
        this.A0D = new C6231DyX(this);
        this.A08 = C3cG.A0h();
        this.A0A = Collections.newSetFromMap(new IdentityHashMap());
        this.A09 = Collections.newSetFromMap(new IdentityHashMap());
        this.A06 = 300000L;
    }
}
