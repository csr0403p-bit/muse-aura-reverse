package X;

import android.net.Uri;
import com.facebook.common.time.RealtimeSinceBootClock;

/* renamed from: X.Bbr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2464Bbr implements CCV {
    public final String A00;
    public final int A01;
    public final C7198EiA A02;
    public final C7481Exe A03;
    public final C1bk A04;

    public C2464Bbr(C7198EiA c7198EiA, C7481Exe c7481Exe, C1bk c1bk, String str) {
        AnonymousClass005.A11(str, c1bk, c7198EiA, 0);
        this.A00 = str;
        this.A03 = c7481Exe;
        this.A04 = c1bk;
        this.A02 = c7198EiA;
        this.A01 = AnonymousClass005.A0F(this.A02, AnonymousClass005.A0F(c1bk, (AnonymousClass001.A0G(str) + C60R.A01(c7481Exe)) * 31)) * 31;
        RealtimeSinceBootClock.A00.now();
    }

    @Override // X.CCV
    public final boolean A75(Uri uri) {
        C7384Etj.A0Y(uri, 0);
        return C7BY.A0q(this.A00, C60O.A0o(uri), false);
    }

    @Override // X.CCV
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (getClass().equals(BV5.A0N(obj))) {
                C7384Etj.A0Z(obj, "null cannot be cast to non-null type com.facebook.imagepipeline.cache.BitmapMemoryCacheKey");
                C2464Bbr c2464Bbr = (C2464Bbr) obj;
                if (!this.A00.equals(c2464Bbr.A00) || !C7384Etj.areEqual(this.A03, c2464Bbr.A03) || !this.A04.equals(c2464Bbr.A04) || !this.A02.equals(c2464Bbr.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.CCV
    public final String AMJ() {
        return this.A00;
    }

    @Override // X.CCV
    public final int hashCode() {
        return this.A01;
    }

    public final String toString() {
        String str = this.A00;
        C7481Exe c7481Exe = this.A03;
        C1bk c1bk = this.A04;
        C7198EiA c7198EiA = this.A02;
        StringBuilder sbA0x = C3cI.A0x("BitmapMemoryCacheKey(sourceString=", str);
        sbA0x.append(", resizeOptions=");
        sbA0x.append(c7481Exe);
        sbA0x.append(", rotationOptions=");
        sbA0x.append(c1bk);
        sbA0x.append(", imageDecodeOptions=");
        sbA0x.append(c7198EiA);
        sbA0x.append(", postprocessorCacheKey=");
        sbA0x.append((Object) null);
        return C3cJ.A0N(", postprocessorName=", null, sbA0x);
    }
}
