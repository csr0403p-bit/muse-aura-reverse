package X;

import android.content.res.AssetManager;
import com.facebook.pando.PandoBuildConfigFlatbufferAssetReaderJNI;
import java.nio.ByteBuffer;

/* renamed from: X.DZw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5120DZw implements CGM {
    public final AssetManager A00;
    public final BWN A02;
    public final String A04;
    public final F0C<PandoBuildConfigFlatbufferAssetReaderJNI> A05 = new C5322DgG(null, new EWq(this, 44));
    public final F0C<ByteBuffer> A06 = C5322DgG.A00(this, 45);
    public final F0C<Da2> A07 = C5322DgG.A00(this, 46);
    public final DZz<DZu> A03 = new DZz<>();
    public final DZi A01 = new DZi(new EZ8(this, 3));
    public final F0C A08 = AbstractC5321DgF.A02(C79.A01, new EWq(this, 47));

    public static final DZy A01(Da2 da2, int i) {
        if (DZx.A00(da2, 4) != 0) {
            int iA00 = DZx.A00(da2, 4) - 1;
            DZy dZy = new DZy();
            int i2 = 0;
            while (i2 <= iA00) {
                int i3 = ((iA00 - i2) >>> 1) + i2;
                int iA07 = da2.A07(4);
                if (iA07 != 0) {
                    DZx.A04(da2, dZy, iA07, i3);
                }
                int iA02 = DZx.A02(dZy, 4);
                if (iA02 < i) {
                    i2 = i3 + 1;
                } else {
                    if (iA02 <= i) {
                        return dZy;
                    }
                    iA00 = i3 - 1;
                }
            }
        }
        return null;
    }

    @Override // X.CGM
    public final String clientDocIdForQuery(String str) {
        C7384Etj.A0Y(str, 0);
        return A00(this).clientDocIdForQuery(str);
    }

    @Override // X.CGM
    public final String schemaForQuery(String str) {
        C7384Etj.A0Y(str, 0);
        return A00(this).schemaForQuery(str);
    }

    public static PandoBuildConfigFlatbufferAssetReaderJNI A00(C5120DZw c5120DZw) {
        return c5120DZw.A05.getValue();
    }

    @Override // X.CGM
    public final String buildConfigName() {
        return this.A04;
    }

    public C5120DZw(AssetManager assetManager, BWN bwn, String str) {
        this.A04 = str;
        this.A00 = assetManager;
        this.A02 = bwn;
    }

    @Override // X.CGM
    public final String persistIdForQuery(String str) {
        return null;
    }
}
