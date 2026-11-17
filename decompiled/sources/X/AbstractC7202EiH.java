package X;

import com.facebook.imagepipeline.request.ImageRequestBuilder$BuilderException;

/* renamed from: X.EiH, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7202EiH {
    public final EnumC7203EiK A00;
    public final BYN A01;
    public final String A02;

    public int hashCode() {
        int iA01 = ((C60R.A01(this.A00) * 31) + C60R.A01(this.A01)) * 31;
        String str = this.A02;
        return iA01 + (str != null ? str.hashCode() : 0);
    }

    public AbstractC7202EiH(C7249EjT<?> c7249EjT) {
        this.A00 = c7249EjT.A00;
        BYN byn = c7249EjT.A01;
        this.A01 = byn;
        String str = c7249EjT.A02;
        this.A02 = str;
        if (byn == BYN.DYNAMIC) {
            if (str == null) {
                throw new ImageRequestBuilder$BuilderException("Disk cache id must be set for dynamic cache choice");
            }
        } else if (str != null && str.length() != 0) {
            throw new ImageRequestBuilder$BuilderException("Ensure that if you want to use a disk cache id, you set the CacheChoice to DYNAMIC");
        }
    }
}
