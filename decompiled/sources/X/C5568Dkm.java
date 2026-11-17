package X;

import android.net.Uri;
import androidx.media3.common.StreamKey;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* renamed from: X.Dkm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5568Dkm {
    public final long A00;
    public final Uri A01;
    public final C5609Dlo A02;
    public final ImmutableList<C5567Dkl> A03;
    public final Object A04;
    public final String A05;
    public final String A06;
    public final List<StreamKey> A07;

    @Deprecated
    public final List<C5569Dkn> A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5568Dkm) {
                C5568Dkm c5568Dkm = (C5568Dkm) obj;
                if (!this.A01.equals(c5568Dkm.A01) || !C6xC.A00(this.A06, c5568Dkm.A06) || !C6xC.A00(this.A02, c5568Dkm.A02) || !this.A07.equals(c5568Dkm.A07) || !C6xC.A00(this.A05, c5568Dkm.A05) || !this.A03.equals(c5568Dkm.A03) || !C6xC.A00(this.A04, c5568Dkm.A04) || this.A00 != c5568Dkm.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (int) (((AnonymousClass005.A0F(this.A03, (((((((AnonymousClass005.A0E(this.A01) + AnonymousClass006.A0G(this.A06)) * 31) + AnonymousClass006.A0D(this.A02)) * 31 * 31) + this.A07.hashCode()) * 31) + AnonymousClass006.A0G(this.A05)) * 31) + C3cH.A02(this.A04)) * 31) + this.A00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C5568Dkm(Uri uri, C5609Dlo c5609Dlo, ImmutableList immutableList, Object obj, String str, String str2, List list, long j) {
        this.A01 = uri;
        this.A06 = AbstractC6161Dx4.A06(str);
        this.A02 = c5609Dlo;
        this.A07 = list;
        this.A05 = str2;
        this.A03 = immutableList;
        ImmutableList.Builder builder = ImmutableList.builder();
        for (int i = 0; i < immutableList.size(); i++) {
            C5567Dkl c5567Dkl = (C5567Dkl) immutableList.get(i);
            Uri uri2 = c5567Dkl.A02;
            String str3 = c5567Dkl.A06;
            String str4 = c5567Dkl.A05;
            int i2 = c5567Dkl.A01;
            int i3 = c5567Dkl.A00;
            builder.add((ImmutableList.Builder) new C5569Dkn(uri2, c5567Dkl.A03, c5567Dkl.A04, str4, str3, i3, i2));
        }
        this.A08 = builder.build();
        this.A04 = obj;
        this.A00 = j;
    }
}
