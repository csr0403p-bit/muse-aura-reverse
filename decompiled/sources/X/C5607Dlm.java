package X;

import android.net.Uri;
import androidx.media3.common.util.Util;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Dlm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5607Dlm implements InterfaceC5910Drt {
    public InterfaceC5334DgV A00;
    public InterfaceC5885DrL A01;
    public boolean A02;
    public CXN A03;
    public final C5703Dnk A04;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [X.DgV] */
    @Override // X.InterfaceC5791Dpa
    public final InterfaceC6009Dts A7u(C5704Dnm c5704Dnm) {
        int i;
        InterfaceC6009Dts c5566Dkk;
        C5568Dkm c5568Dkm = c5704Dnm.A03;
        c5568Dkm.getClass();
        Uri uri = c5568Dkm.A01;
        String scheme = uri.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            Object obj = null;
            obj.getClass();
            throw F60.createAndThrow();
        }
        String str = c5568Dkm.A06;
        if (C6xC.A00(str, "application/x-image-uri")) {
            Object obj2 = null;
            obj2.getClass();
            throw F60.createAndThrow();
        }
        int iA03 = Util.A03(uri, str);
        try {
            C5703Dnk c5703Dnk = this.A04;
            Map<Integer, InterfaceC5791Dpa> map = c5703Dnk.A07;
            Integer numValueOf = Integer.valueOf(iA03);
            InterfaceC5791Dpa interfaceC5791Dpa = map.get(numValueOf);
            if (interfaceC5791Dpa == null) {
                Map<Integer, Supplier<InterfaceC5791Dpa>> map2 = c5703Dnk.A08;
                Supplier<InterfaceC5791Dpa> c2615Bfg = map2.get(numValueOf);
                if (c2615Bfg == null) {
                    CXN cxn = c5703Dnk.A01;
                    cxn.getClass();
                    c2615Bfg = iA03 != 0 ? iA03 != 1 ? iA03 != 2 ? iA03 != 3 ? new C2615Bfg(3, cxn, c5703Dnk) : new CL8(Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(InterfaceC5791Dpa.class), 10) : new C2615Bfg(2, cxn, Class.forName("androidx.media3.exoplayer.hls.HlsMediaSource$Factory").asSubclass(InterfaceC5791Dpa.class)) : new C2615Bfg(1, cxn, Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(InterfaceC5791Dpa.class)) : new C2615Bfg(0, cxn, Class.forName("androidx.media3.exoplayer.dash.DashMediaSource$Factory").asSubclass(InterfaceC5791Dpa.class));
                    map2.put(numValueOf, c2615Bfg);
                }
                interfaceC5791Dpa = c2615Bfg.get();
                Dw9 dw9 = c5703Dnk.A02;
                if (dw9 != null) {
                    interfaceC5791Dpa.AdL(dw9);
                }
                InterfaceC5334DgV interfaceC5334DgV = c5703Dnk.A03;
                if (interfaceC5334DgV != null) {
                    interfaceC5791Dpa.Adg(interfaceC5334DgV);
                }
                interfaceC5791Dpa.Aer(c5703Dnk.A04);
                interfaceC5791Dpa.ABD(c5703Dnk.A05);
                interfaceC5791Dpa.ABF(c5703Dnk.A00);
                map.put(numValueOf, interfaceC5791Dpa);
            }
            C5777DpJ c5777DpJ = c5704Dnm.A02;
            long j = c5777DpJ.A04;
            long j2 = c5777DpJ.A03;
            long j3 = c5777DpJ.A02;
            float f = c5777DpJ.A01;
            float f2 = c5777DpJ.A00;
            if (j == -9223372036854775807L) {
                j = -9223372036854775807L;
            }
            if (f == -3.4028235E38f) {
                f = -3.4028235E38f;
            }
            if (f2 == -3.4028235E38f) {
                f2 = -3.4028235E38f;
            }
            if (j2 == -9223372036854775807L) {
                j2 = -9223372036854775807L;
            }
            if (j3 == -9223372036854775807L) {
                j3 = -9223372036854775807L;
            }
            C5777DpJ c5777DpJ2 = new C5777DpJ(f2, f, j3, j2, j);
            if (!c5777DpJ2.equals(c5777DpJ)) {
                C5608Dln c5608Dln = new C5608Dln(c5704Dnm);
                c5608Dln.A01 = new C5798Dpi(c5777DpJ2);
                c5704Dnm = c5608Dln.A00();
            }
            InterfaceC6009Dts interfaceC6009DtsA7u = interfaceC5791Dpa.A7u(c5704Dnm);
            ImmutableList<C5567Dkl> immutableList = c5704Dnm.A03.A03;
            if (!immutableList.isEmpty()) {
                InterfaceC6009Dts[] interfaceC6009DtsArr = new InterfaceC6009Dts[immutableList.size() + 1];
                interfaceC6009DtsArr[0] = interfaceC6009DtsA7u;
                for (int i2 = 0; i2 < immutableList.size(); i2++) {
                    if (this.A02) {
                        C6162Dx5 c6162Dx5A00 = C6162Dx5.A00();
                        c6162Dx5A00.A06(immutableList.get(i2).A06);
                        c6162Dx5A00.A0Y = immutableList.get(i2).A05;
                        c6162Dx5A00.A0K = immutableList.get(i2).A01;
                        c6162Dx5A00.A0H = immutableList.get(i2).A00;
                        c6162Dx5A00.A0X = immutableList.get(i2).A04;
                        c6162Dx5A00.A0W = immutableList.get(i2).A03;
                        C6154Dwx c6154DwxA0U = BV6.A0U(c6162Dx5A00);
                        C5606Dll c5606Dll = new C5606Dll(this.A03, new C7581F4u(0, c6154DwxA0U, this));
                        if (this.A01.Agg(c6154DwxA0U)) {
                            C6162Dx5 c6162Dx5A01 = C6162Dx5.A01(c6154DwxA0U);
                            c6162Dx5A01.A06("application/x-media3-cues");
                            c6162Dx5A01.A0U = c6154DwxA0U.A0b;
                            c6162Dx5A01.A06 = this.A01.AEI(c6154DwxA0U);
                            c6154DwxA0U = BV6.A0U(c6162Dx5A01);
                        }
                        c5606Dll.A01 = c6154DwxA0U;
                        InterfaceC5334DgV interfaceC5334DgV2 = this.A00;
                        if (interfaceC5334DgV2 != null) {
                            c5606Dll.A04 = interfaceC5334DgV2;
                        }
                        i = i2 + 1;
                        String string = immutableList.get(i2).A02.toString();
                        C5608Dln c5608Dln2 = new C5608Dln();
                        c5608Dln2.A00 = string == null ? null : Uri.parse(string);
                        c5566Dkk = c5606Dll.A7u(c5608Dln2.A00());
                    } else {
                        CXN cxn2 = this.A03;
                        C5330DgR c5330DgR = new C5330DgR(-1);
                        ?? r0 = this.A00;
                        if (r0 != 0) {
                            c5330DgR = r0;
                        }
                        i = i2 + 1;
                        c5566Dkk = new C5566Dkk(immutableList.get(i2), cxn2, c5330DgR, null, -9223372036854775807L);
                    }
                    interfaceC6009DtsArr[i] = c5566Dkk;
                }
                C5704Dnm c5704Dnm2 = C5598Dld.A09;
                interfaceC6009DtsA7u = new C5598Dld(new C5457Dis(), interfaceC6009DtsArr);
            }
            AbstractC5802Dpm abstractC5802Dpm = c5704Dnm.A00;
            long j4 = abstractC5802Dpm.A01;
            if (j4 == 0 && abstractC5802Dpm.A00 == Long.MIN_VALUE && !abstractC5802Dpm.A03) {
                return interfaceC6009DtsA7u;
            }
            interfaceC6009DtsA7u.getClass();
            C1G.A07(C8j3.A1Q((j4 > 0L ? 1 : (j4 == 0L ? 0 : -1))));
            return new C6000Dtj(interfaceC6009DtsA7u, abstractC5802Dpm.A00, j4, abstractC5802Dpm.A04, abstractC5802Dpm.A02, !abstractC5802Dpm.A05, abstractC5802Dpm.A03);
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // X.InterfaceC5791Dpa
    @Deprecated
    public final /* bridge */ /* synthetic */ void ABD(boolean z) {
        this.A02 = z;
        C5703Dnk c5703Dnk = this.A04;
        c5703Dnk.A05 = z;
        c5703Dnk.A06.ABG(z);
        Iterator itA10 = BV5.A10(c5703Dnk.A07);
        while (itA10.hasNext()) {
            ((InterfaceC5791Dpa) itA10.next()).ABD(z);
        }
    }

    @Override // X.InterfaceC5791Dpa
    public final /* bridge */ /* synthetic */ void ABF(int i) {
        C5703Dnk c5703Dnk = this.A04;
        c5703Dnk.A00 = i;
        c5703Dnk.A06.ABE(i);
    }

    @Override // X.InterfaceC5791Dpa
    public final /* bridge */ /* synthetic */ void AdL(Dw9 dw9) {
        C5703Dnk c5703Dnk = this.A04;
        if (dw9 == null) {
            throw BV5.A0Y("MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        }
        c5703Dnk.A02 = dw9;
        Iterator itA10 = BV5.A10(c5703Dnk.A07);
        while (itA10.hasNext()) {
            ((InterfaceC5791Dpa) itA10.next()).AdL(dw9);
        }
    }

    @Override // X.InterfaceC5791Dpa
    public final /* bridge */ /* synthetic */ void Adg(InterfaceC5334DgV interfaceC5334DgV) {
        if (interfaceC5334DgV == null) {
            throw BV5.A0Y("MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        }
        this.A00 = interfaceC5334DgV;
        C5703Dnk c5703Dnk = this.A04;
        c5703Dnk.A03 = interfaceC5334DgV;
        Iterator itA10 = BV5.A10(c5703Dnk.A07);
        while (itA10.hasNext()) {
            ((InterfaceC5791Dpa) itA10.next()).Adg(interfaceC5334DgV);
        }
    }

    public C5607Dlm(CXN cxn, InterfaceC5819Dq4 interfaceC5819Dq4) {
        this.A03 = cxn;
        E0Y e0y = new E0Y();
        this.A01 = e0y;
        C5703Dnk c5703Dnk = new C5703Dnk(interfaceC5819Dq4, e0y);
        this.A04 = c5703Dnk;
        if (cxn != c5703Dnk.A01) {
            c5703Dnk.A01 = cxn;
            c5703Dnk.A08.clear();
            c5703Dnk.A07.clear();
        }
        this.A02 = true;
    }

    @Override // X.InterfaceC5791Dpa
    public final /* bridge */ /* synthetic */ void Aer(InterfaceC5885DrL interfaceC5885DrL) {
        interfaceC5885DrL.getClass();
        this.A01 = interfaceC5885DrL;
        C5703Dnk c5703Dnk = this.A04;
        c5703Dnk.A04 = interfaceC5885DrL;
        c5703Dnk.A06.Aeq(interfaceC5885DrL);
        Iterator itA10 = BV5.A10(c5703Dnk.A07);
        while (itA10.hasNext()) {
            ((InterfaceC5791Dpa) itA10.next()).Aer(interfaceC5885DrL);
        }
    }
}
