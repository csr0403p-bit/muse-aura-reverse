package X;

/* loaded from: classes5.dex */
public final class DEU extends BYP {
    public static final long serialVersionUID = 203393765362690L;
    public final String cancelReason;
    public final boolean foundAndRemoved;
    public final String isFollowUpPrefetch;
    public final int qplInstanceKey;
    public final String videoId;

    public DEU(String str, String str2, boolean z) {
        super(DER.A0I);
        this.videoId = str;
        this.isFollowUpPrefetch = "false";
        this.foundAndRemoved = z;
        this.cancelReason = str2;
        this.qplInstanceKey = 0;
    }
}
