package X;

/* loaded from: classes5.dex */
public final class DET extends BYP {
    public static final long serialVersionUID = 2903217126891397735L;
    public final EnumC5744Dof currentLatencyLevel;
    public final String decisionReasons;
    public final int targetBuffer;
    public final EnumC5744Dof targetLatencyLevel;
    public final long timeMs;
    public final String videoId;

    public DET(EnumC5744Dof enumC5744Dof, EnumC5744Dof enumC5744Dof2, String str, String str2, int i, long j) {
        super(DER.A0D);
        this.timeMs = j;
        this.videoId = str;
        this.currentLatencyLevel = enumC5744Dof2;
        this.targetLatencyLevel = enumC5744Dof;
        this.decisionReasons = str2;
        this.targetBuffer = i;
    }
}
