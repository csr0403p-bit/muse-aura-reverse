package X;

import java.io.File;

/* renamed from: X.Bkn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2771Bkn {
    public final C2576Be8 A00;
    public final File A01;

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("OutputFileOptions{mFile=");
        sbA0x.append(this.A01);
        sbA0x.append(", mContentResolver=");
        sbA0x.append((Object) null);
        sbA0x.append(", mSaveCollection=");
        sbA0x.append((Object) null);
        sbA0x.append(", mContentValues=");
        sbA0x.append((Object) null);
        sbA0x.append(", mOutputStream=");
        sbA0x.append((Object) null);
        sbA0x.append(", mMetadata=");
        return BV8.A0v(this.A00, sbA0x);
    }

    public C2771Bkn(C2576Be8 c2576Be8, File file) {
        this.A01 = file;
        this.A00 = c2576Be8;
    }
}
