package X;

import android.net.Uri;
import android.util.Log;
import androidx.media3.extractor.mkv.MatroskaExtractor;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.Dlf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5600Dlf implements InterfaceC5819Dq4 {
    public int A00;
    public DmR A01;
    public InterfaceC5564Dkh A02 = InterfaceC5564Dkh.A00;
    public String A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;

    public static final InterfaceC5458Dit A00() {
        try {
            return (InterfaceC5458Dit) BV8.A0q("androidx.media3.extractor.ogg.OggExtractor");
        } catch (Exception e) {
            Log.e("HeroExtractorsFactory", "Error while creating ogg Extractor", e);
            throw BV4.A0e(e);
        }
    }

    @Override // X.InterfaceC5819Dq4
    public final /* synthetic */ InterfaceC5458Dit[] A7k(Uri uri, Map map) {
        E2S e2s;
        InterfaceC5458Dit c6368E2v;
        DmR dmR;
        C4904DDx c4904DDx;
        ArrayList arrayListA0h = C3cG.A0h();
        int i = this.A00;
        if (i == 0) {
            e2s = new E2S();
        } else {
            int i2 = (i & 1) != 0 ? 32 : 0;
            if ((i & 2) != 0) {
                i2 |= 128;
            }
            e2s = new E2S(InterfaceC5885DrL.A00, i2 | 16);
        }
        arrayListA0h.add(new C5454Dip(this.A04 ? new C5501Djd(e2s, this.A02) : e2s, null, this.A02, this.A03));
        if (this.A05 || ((dmR = this.A01) != null && (c4904DDx = dmR.A03) != null && c4904DDx.A0d)) {
            if (this.A06) {
                int i3 = this.A00;
                int i4 = (i3 & 1) != 0 ? 64 : 0;
                if ((i3 & 2) != 0) {
                    i4 |= 128;
                }
                C6154Dwx c6154Dwx = C6367E2u.A0c;
                c6368E2v = new C6367E2u(null, InterfaceC5885DrL.A00, ImmutableList.of(), i4 | 32);
            } else {
                c6368E2v = new C6368E2v(null, Collections.EMPTY_LIST, 0);
            }
            arrayListA0h.add(this.A04 ? new C5501Djd(c6368E2v, this.A02) : c6368E2v);
        }
        if (this.A07) {
            arrayListA0h.add(new MatroskaExtractor());
        }
        if (this.A08) {
            try {
                arrayListA0h.add(A00());
            } catch (Exception e) {
                Log.e("HeroExtractorsFactory", "Error while creating ogg Extractor", e);
            }
        }
        if (this.A09) {
            arrayListA0h.add(new C6387E3p());
        }
        return (InterfaceC5458Dit[]) arrayListA0h.toArray(new InterfaceC5458Dit[0]);
    }

    @Override // X.InterfaceC5819Dq4
    public final /* bridge */ /* synthetic */ void ABE(int i) {
        this.A00 = i;
    }

    @Override // X.InterfaceC5819Dq4
    public final /* synthetic */ void ABG(boolean z) {
    }

    @Override // X.InterfaceC5819Dq4
    public final /* synthetic */ void Aeq(InterfaceC5885DrL interfaceC5885DrL) {
    }
}
