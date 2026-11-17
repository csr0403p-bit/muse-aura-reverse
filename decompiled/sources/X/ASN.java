package X;

/* loaded from: classes4.dex */
public final class ASN extends AbstractC1439Aj8 implements C1DO, InterfaceC1059ATh, InterfaceC1451AjK {
    public ASO A00;
    public G0U<? super AST, ASR> A01;
    public boolean A02;
    public final AST A03;

    @Override // X.C1DO
    public final long AKb() {
        return AQY.A01(((AZE) AbstractC1414Aij.A06(this, 4)).A03);
    }

    @Override // X.InterfaceC1059ATh
    public final void ANu() {
        ASO aso = this.A00;
        if (aso != null) {
            aso.A00();
        }
        this.A02 = false;
        this.A03.A01 = null;
        AaD.A00(this);
    }

    @Override // X.InterfaceC1332AhJ
    public final void draw(C16Z c16z) {
        if (!this.A02) {
            AST ast = this.A03;
            ast.A01 = null;
            ast.A02 = c16z;
            AbstractC1441AjA.A00(this, new C2335BUj(2, ast, this));
            if (ast.A01 == null) {
                throw C3cG.A0Q("DrawResult not defined, did you forget to call onDraw?");
            }
            this.A02 = true;
        }
        ASR asr = this.A03.A01;
        C7384Etj.A0X(asr);
        asr.A00.invoke(c16z);
    }

    @Override // X.AbstractC1439Aj8
    public final void onDetach() {
        ASO aso = this.A00;
        if (aso != null) {
            aso.A00();
        }
    }

    public ASN(AST ast, G0U<? super AST, ASR> g0u) {
        this.A03 = ast;
        this.A01 = g0u;
        ast.A00 = this;
        ast.A03 = C2328BUc.A00(this, 8);
    }

    @Override // X.InterfaceC1451AjK
    public final void AUO() {
        ANu();
    }

    @Override // X.C1DO
    public final AXN getDensity() {
        return AbstractC1414Aij.A08(this);
    }

    @Override // X.C1DO
    public final EnumC1820Arj getLayoutDirection() {
        return AbstractC1414Aij.A04(this).A0G;
    }

    @Override // X.AbstractC1439Aj8
    /* renamed from: onDensityChange */
    public final void onViewConfigurationChange() {
        ANu();
    }

    @Override // X.AbstractC1439Aj8
    public final void onLayoutDirectionChange() {
        ANu();
    }

    @Override // X.InterfaceC1332AhJ
    public final void onMeasureResultChanged() {
        ANu();
    }

    @Override // X.AbstractC1439Aj8
    public final void onReset() {
        ANu();
    }
}
