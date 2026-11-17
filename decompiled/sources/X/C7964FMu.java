package X;

/* renamed from: X.FMu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7964FMu {
    public final C7963FMt A00;
    public final C7941FLn A01;
    public final C7999FOs A02;
    public final C7940FLm A03;
    public final C10464Hju A04;
    public final C7994FOn A05;
    public final C7942FLo A06;

    public C7964FMu() {
        this(null, null, null, null, null, null, null);
    }

    public final C7964FMu A00(FOP fop) {
        if (fop == null) {
            return this;
        }
        C7994FOn c7994FOn = this.A05;
        C7942FLo c7942FLo = this.A06;
        C7999FOs c7999FOs = this.A02;
        C7963FMt c7963FMt = this.A00;
        return new C7964FMu(new C7963FMt(fop, c7963FMt != null ? c7963FMt.A01 : null), this.A01, c7999FOs, this.A03, this.A04, c7994FOn, c7942FLo);
    }

    public C7964FMu(C7963FMt c7963FMt, C7941FLn c7941FLn, C7999FOs c7999FOs, C7940FLm c7940FLm, C10464Hju c10464Hju, C7994FOn c7994FOn, C7942FLo c7942FLo) {
        this.A05 = c7994FOn;
        this.A06 = c7942FLo;
        this.A02 = c7999FOs;
        this.A00 = c7963FMt;
        this.A04 = c10464Hju;
        this.A01 = c7941FLn;
        this.A03 = c7940FLm;
    }
}
