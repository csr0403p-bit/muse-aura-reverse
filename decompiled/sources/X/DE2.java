package X;

import android.net.Uri;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public final class DE2 implements CXK {
    public static final String A09 = DE2.class.getName();
    public long A00;
    public DDj A01;
    public final HeroPlayerSetting A02;
    public final CXK A03;
    public final C4886DDa A04;
    public final DEF A05;
    public final C3159C0h A06;
    public final AtomicBoolean A07;
    public final AtomicBoolean A08;

    @Override // X.C1J
    public final void addTransferListener(CXB cxb) {
        C7384Etj.A0Y(cxb, 0);
        this.A01 = cxb instanceof DDj ? (DDj) cxb : new C4892DDl(cxb);
    }

    @Override // X.InterfaceC4896DDp
    public final void cancel() {
    }

    @Override // X.InterfaceC4891DDk, X.C1J
    public final synchronized void close() {
        this.A03.close();
    }

    @Override // X.InterfaceC4891DDk, X.C1L
    public final synchronized int read(byte[] bArr, int i, int i2) {
        C7384Etj.A0Y(bArr, 0);
        long j = this.A00;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            i2 = (int) Math.min(i2, j);
        }
        int i3 = this.A03.read(bArr, i, i2);
        if (i3 != -1) {
            this.A00 -= i3;
        }
        return i3;
    }

    @Override // X.InterfaceC4891DDk, X.C1J
    public final Map<String, List<String>> getResponseHeaders() {
        Map<String, List<String>> responseHeaders = this.A03.getResponseHeaders();
        C7384Etj.A0U(responseHeaders);
        return responseHeaders;
    }

    @Override // X.C1J
    public final Uri getUri() {
        return this.A03.getUri();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00b1  */
    @Override // X.InterfaceC4891DDk, X.C1J
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized long open(X.C1O r33) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 908
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DE2.open(X.C1O):long");
    }

    public DE2(CXK cxk, DDj dDj, C4886DDa c4886DDa, C3159C0h c3159C0h, HeroPlayerSetting heroPlayerSetting, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, int i) {
        DEF def;
        this.A06 = c3159C0h;
        this.A03 = cxk;
        this.A01 = dDj;
        this.A07 = atomicBoolean;
        this.A08 = atomicBoolean2;
        this.A02 = heroPlayerSetting;
        this.A04 = c4886DDa;
        DEF[] defArrValues = DEF.values();
        int length = defArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                def = DEF.UNKNOWN;
                break;
            }
            def = defArrValues[i2];
            if (def.value == i) {
                break;
            } else {
                i2++;
            }
        }
        this.A05 = def;
    }
}
