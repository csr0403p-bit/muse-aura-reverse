package X;

import com.facebook.aura.activation.view.InviteCodeScratcherKt;

/* loaded from: classes6.dex */
public final class G68 extends AbstractC7559F3s implements G0U<G65, CharSequence> {
    public final /* synthetic */ boolean $isInsideTable;
    public final /* synthetic */ String $text;
    public final /* synthetic */ G67 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G68(String str, G67 g67, boolean z) {
        super(1);
        this.this$0 = g67;
        this.$text = str;
        this.$isInsideTable = z;
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ CharSequence invoke(G65 g65) {
        G65 g652 = g65;
        C7384Etj.A0Y(g652, 0);
        String str = this.$text;
        boolean z = this.$isInsideTable;
        C7384Etj.A0Y(str, 1);
        String strA01 = !z ? G6H.A01(str, g652, false) : C7l2.A00(AbstractC2159Azp.A0z(G66.A00(str, g652).toString(), "\\|", "|"), false, false);
        C7384Etj.A0Y(strA01, 0);
        return C06827l3.A02("\\r\\n?|\\n").A03(strA01, InviteCodeScratcherKt.CODE_SEPARATOR);
    }
}
