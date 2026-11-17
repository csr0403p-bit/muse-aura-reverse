package X;

import com.facebook.errorreporting.field.ReportFieldBase;

/* loaded from: classes5.dex */
public abstract class BZW extends ReportFieldBase {
    public final int maxLength;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BZW(int i, String str, boolean z, int i2) {
        super(i, str, z);
        C7384Etj.A0Y(str, 1);
        this.maxLength = i2;
    }

    public final int getMaxLength() {
        return this.maxLength;
    }
}
