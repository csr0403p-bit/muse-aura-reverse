package X;

/* loaded from: classes4.dex */
public final class AEc extends AbstractC7559F3s implements G0U<AST, ASR> {
    public final /* synthetic */ C1DM $shape;
    public final /* synthetic */ boolean $shouldUseCustomOutline = false;
    public final /* synthetic */ BO4 $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AEc(C1DM c1dm, BO4 bo4) {
        super(1);
        this.$state = bo4;
        this.$shape = c1dm;
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ ASR invoke(AST ast) {
        AST ast2 = ast;
        C7384Etj.A0Y(ast2, 0);
        BO4 bo4 = this.$state;
        float fA04 = AnonymousClass003.A04(bo4.A03) * (250.0f + 750.0f) * ast2.AEm();
        return ast2.A00(new C2339BUn(this.$shouldUseCustomOutline ? this.$shape.mo2createOutlinePq9zytI(ast2.A00.AKb(), ast2.A00.getLayoutDirection(), ast2) : null, new C1335AhM(bo4.A02, null, 0, (C8j3.A0P(fA04 - (250.0f * ast2.AEm())) << 32) | (AnonymousClass002.A0F() & 4294967295L), C8j3.A0Q(fA04, bo4.A00 * ast2.AEm())), this.$state, 14));
    }
}
