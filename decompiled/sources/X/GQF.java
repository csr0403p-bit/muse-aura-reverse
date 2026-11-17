package X;

/* loaded from: classes6.dex */
public final class GQF implements Runnable {
    public static final String __redex_internal_original_name = "AndroidAudioStateManager$playStartEarcon$1";
    public final /* synthetic */ GSV A00;
    public final /* synthetic */ String A01;

    public GQF(GSV gsv, String str) {
        this.A00 = gsv;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        GSV gsv = this.A00;
        if (C7384Etj.areEqual(gsv.A0A, this.A01)) {
            AbstractC7608F5v.A1L("playStartEarcon");
            gsv.A03.playStartEarcon();
        }
    }
}
