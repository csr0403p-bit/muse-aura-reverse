package X;

import android.net.Uri;
import com.facebook.imagepipeline.request.ImageRequestBuilder$BuilderException;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Ehu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7184Ehu {
    public static final Set<String> A0M = C60O.A13();
    public int A01;
    public InterfaceC7250EjU A09;
    public Uri A02 = null;
    public EnumC7058Ef5 A0B = EnumC7058Ef5.FULL_FETCH;
    public int A00 = 0;
    public C7481Exe A06 = null;
    public C1bk A07 = null;
    public C7198EiA A04 = C7198EiA.A04;
    public BYN A0A = BYN.DEFAULT;
    public boolean A0K = false;
    public boolean A0L = false;
    public boolean A0J = false;
    public boolean A0I = false;
    public EnumC7203EiK A05 = EnumC7203EiK.A02;
    public Boolean A0C = null;
    public EUs A03 = null;
    public Boolean A0E = null;
    public BXh A08 = null;
    public String A0G = null;
    public String A0F = null;
    public Boolean A0D = false;
    public Map A0H = null;

    public static C7184Ehu A00(C7183Eht c7183Eht) {
        Uri uri = c7183Eht.A04;
        C7184Ehu c7184Ehu = new C7184Ehu();
        uri.getClass();
        c7184Ehu.A02 = uri;
        c7184Ehu.A04 = c7183Eht.A06;
        c7184Ehu.A03 = c7183Eht.A05;
        BYN byn = c7183Eht.A0C;
        c7184Ehu.A0A = byn;
        c7184Ehu.A0J = c7183Eht.A0L;
        c7184Ehu.A0I = AnonymousClass002.A1L(c7183Eht.A0K ? 1 : 0);
        c7184Ehu.A0B = c7183Eht.A0D;
        c7184Ehu.A00 = c7183Eht.A00;
        if (byn != BYN.DYNAMIC) {
            c7184Ehu.A0G = null;
        }
        c7184Ehu.A0K = c7183Eht.A0M;
        c7184Ehu.A05 = c7183Eht.A07;
        c7184Ehu.A06 = c7183Eht.A08;
        c7184Ehu.A09 = c7183Eht.A0B;
        c7184Ehu.A07 = c7183Eht.A09;
        c7184Ehu.A0C = c7183Eht.A0E;
        c7184Ehu.A01 = c7183Eht.A02;
        c7184Ehu.A0G = c7183Eht.A0I;
        c7184Ehu.A0F = c7183Eht.A0H;
        c7184Ehu.A08 = c7183Eht.A0A;
        c7184Ehu.A0E = c7183Eht.A0G;
        c7184Ehu.A0D = c7183Eht.A0F;
        c7184Ehu.A0L = c7183Eht.A0N;
        Map map = c7183Eht.A0J;
        c7184Ehu.A0H = map == null ? null : BV4.A0w(Collections.unmodifiableMap(map));
        return c7184Ehu;
    }

    public final C7183Eht A01() throws NumberFormatException {
        Uri uri = this.A02;
        if (uri == null) {
            throw new ImageRequestBuilder$BuilderException("Source must be set!");
        }
        Uri uri2 = AbstractC7465Eww.A00;
        if ("res".equals(uri.getScheme())) {
            if (!this.A02.isAbsolute()) {
                throw new ImageRequestBuilder$BuilderException("Resource URI path must be absolute.");
            }
            if (this.A02.getPath().isEmpty()) {
                throw new ImageRequestBuilder$BuilderException("Resource URI must not be empty");
            }
            try {
                Integer.parseInt(this.A02.getPath().substring(1));
            } catch (NumberFormatException unused) {
                throw new ImageRequestBuilder$BuilderException("Resource URI path must be a resource id.");
            }
        }
        Uri uri3 = this.A02;
        if (!"asset".equals(uri3 != null ? uri3.getScheme() : null) || this.A02.isAbsolute()) {
            return new C7183Eht(this);
        }
        throw new ImageRequestBuilder$BuilderException("Asset URI path must be absolute.");
    }
}
