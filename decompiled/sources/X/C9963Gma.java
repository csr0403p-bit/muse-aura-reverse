package X;

import java.io.Serializable;

/* renamed from: X.Gma, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9963Gma extends AbstractC9896GkZ<EnumC9975Gmp, C9963Gma> implements Serializable {
    public static final int A00;
    public static final InterfaceC10049GoT A01 = new C10027Go1();
    public static final long serialVersionUID = 1;
    public final C10145GqC _ctorDetector;
    public final InterfaceC10049GoT _defaultPrettyPrinter;
    public final AbstractC10209GrV _filterProvider;
    public final int _formatWriteFeatures;
    public final int _formatWriteFeaturesToChange;
    public final int _generatorFeatures;
    public final int _generatorFeaturesToChange;
    public final int _serFeatures;

    static {
        int iAHO = 0;
        for (Object obj : (Enum[]) EnumC9975Gmp.class.getEnumConstants()) {
            InterfaceC10179Gqp interfaceC10179Gqp = (InterfaceC10179Gqp) obj;
            if (interfaceC10179Gqp.AA2()) {
                iAHO |= interfaceC10179Gqp.AHO();
            }
        }
        A00 = iAHO;
    }

    public final void A0D(AbstractC9919GlE abstractC9919GlE) {
        EnumC9975Gmp enumC9975Gmp = EnumC9975Gmp.INDENT_OUTPUT;
        int i = this._serFeatures;
        if ((enumC9975Gmp._mask & i) != 0 && abstractC9919GlE.A00 == null) {
            InterfaceC10049GoT interfaceC10049GoTA7r = this._defaultPrettyPrinter;
            if (interfaceC10049GoTA7r instanceof InterfaceC10158GqR) {
                interfaceC10049GoTA7r = ((InterfaceC10158GqR) interfaceC10049GoTA7r).A7r();
            }
            if (interfaceC10049GoTA7r != null) {
                abstractC9919GlE.A00 = interfaceC10049GoTA7r;
            }
        }
        boolean zA1L = AnonymousClass002.A1L(i & EnumC9975Gmp.WRITE_BIGDECIMAL_AS_PLAIN._mask);
        int i2 = this._generatorFeaturesToChange;
        if (i2 != 0 || zA1L) {
            int i3 = this._generatorFeatures;
            if (zA1L) {
                int i4 = EnumC9998GnS.WRITE_BIGDECIMAL_AS_PLAIN._mask;
                i3 |= i4;
                i2 |= i4;
            }
            AbstractC9932GlT abstractC9932GlT = (AbstractC9932GlT) abstractC9919GlE;
            int i5 = abstractC9932GlT.A00;
            int i6 = (i3 & i2) | ((i2 ^ (-1)) & i5);
            int i7 = i5 ^ i6;
            if (i7 != 0) {
                abstractC9932GlT.A00 = i6;
                abstractC9932GlT.A11(i6, i7);
            }
        }
    }

    public final boolean A0E(EnumC9975Gmp enumC9975Gmp) {
        return AbstractC7609F5w.A1U(enumC9975Gmp._mask, this._serFeatures);
    }

    public C9963Gma(C9963Gma c9963Gma, C9895GkY c9895GkY) {
        super(c9895GkY, c9963Gma);
        this._serFeatures = c9963Gma._serFeatures;
        this._filterProvider = null;
        this._defaultPrettyPrinter = c9963Gma._defaultPrettyPrinter;
        this._ctorDetector = c9963Gma._ctorDetector;
        this._generatorFeatures = c9963Gma._generatorFeatures;
        this._generatorFeaturesToChange = c9963Gma._generatorFeaturesToChange;
        this._formatWriteFeatures = c9963Gma._formatWriteFeatures;
        this._formatWriteFeaturesToChange = c9963Gma._formatWriteFeaturesToChange;
    }

    public C9963Gma(C9963Gma c9963Gma, int i, int i2, int i3, int i4, int i5, long j) {
        super(c9963Gma, j);
        this._serFeatures = i;
        this._filterProvider = null;
        this._defaultPrettyPrinter = c9963Gma._defaultPrettyPrinter;
        this._ctorDetector = c9963Gma._ctorDetector;
        this._generatorFeatures = i2;
        this._generatorFeaturesToChange = i3;
        this._formatWriteFeatures = i4;
        this._formatWriteFeaturesToChange = i5;
    }

    public C9963Gma(C9895GkY c9895GkY, C10045GoP c10045GoP, C9823GiH c9823GiH, C10053GoX c10053GoX, AbstractC10058Gof abstractC10058Gof, C9881Gjp c9881Gjp) {
        super(c9895GkY, c10045GoP, c9823GiH, c10053GoX, abstractC10058Gof, c9881Gjp);
        this._serFeatures = A00;
        this._filterProvider = null;
        this._defaultPrettyPrinter = A01;
        this._ctorDetector = null;
        this._generatorFeatures = 0;
        this._generatorFeaturesToChange = 0;
        this._formatWriteFeatures = 0;
        this._formatWriteFeaturesToChange = 0;
    }
}
