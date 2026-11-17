package X;

import kotlin.Unit;

/* renamed from: X.9WO, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9WO extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ BRg $rowsModifier;
    public final /* synthetic */ C9WF $shown;
    public final /* synthetic */ C9WN $style;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9WO(BRg bRg, BRg bRg2, C9WF c9wf, C9WN c9wn, int i) {
        super(2);
        this.$shown = c9wf;
        this.$modifier = bRg;
        this.$style = c9wn;
        this.$rowsModifier = bRg2;
        this.$$changed = i;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        BFM bfmA0P = AnonymousClass005.A0P(bfm, num);
        C9WF c9wf = this.$shown;
        C9WM.A01(bfmA0P, this.$modifier, this.$rowsModifier, c9wf, this.$style, AnonymousClass011.A00(this.$$changed));
        return Unit.INSTANCE;
    }
}
