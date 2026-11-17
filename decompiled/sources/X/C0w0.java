package X;

import kotlin.Unit;

/* renamed from: X.0w0, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0w0 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ String $labelText;
    public final /* synthetic */ String $pattern;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0w0(String str, String str2) {
        super(2);
        this.$labelText = str;
        this.$pattern = str2;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        BFM bfm2 = bfm;
        if (AnonymousClass005.A0D(num) == 2 && bfm2.AKh()) {
            bfm2.Afo();
        } else {
            String str = this.$labelText;
            BS0 bs0 = BRg.A00;
            boolean zA1R = AnonymousClass001.A1R(bfm2, this.$pattern, bfm2.A65(str));
            String str2 = this.$labelText;
            String str3 = this.$pattern;
            Object objAaT = bfm2.AaT();
            if (zA1R || objAaT == C78N.A00) {
                objAaT = new C0w1(str2, str3);
                bfm2.Ai0(objAaT);
            }
            C0yq.A00(bfm2, ARD.A01(bs0, (G0U) objAaT, false), null, null, null, null, null, null, str, null, 0, 0, 0, 0, 0, 131068, 0L, 0L, 0L, 0L, false);
        }
        return Unit.INSTANCE;
    }
}
