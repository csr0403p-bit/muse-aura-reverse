package X;

/* renamed from: X.Bbm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2459Bbm extends BYP {
    public static final long serialVersionUID = 4846092804157434237L;
    public final int invalidResponseCode;
    public final boolean isSucceeded;
    public final String loapStreamId;
    public final int loapStreamType;
    public final String videoId;

    public C2459Bbm(String str, int i, int i2, boolean z, String str2) {
        super(DER.A0E);
        this.videoId = str;
        this.isSucceeded = z;
        this.invalidResponseCode = i;
        this.loapStreamId = z ? str2 : null;
        this.loapStreamType = z ? i2 : -1;
    }

    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(FGI.A0M("videoId=", this.videoId));
        sbA0w.append(FGI.A0r(", isSucceeded=", this.isSucceeded));
        sbA0w.append(FGI.A0H(", invalidResponseCode=", this.invalidResponseCode));
        String str = this.loapStreamId;
        if (str != null) {
            sbA0w.append(FGI.A0M(", loapStreamId=", str));
            sbA0w.append(FGI.A0H(", loapStreamType=", this.loapStreamType));
        }
        return sbA0w.toString();
    }
}
