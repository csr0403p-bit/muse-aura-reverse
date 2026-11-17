package X;

import java.io.Serializable;

/* renamed from: X.Gke, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9898Gke extends AbstractC9896GkZ<EnumC9965Gmd, C9898Gke> implements Serializable {
    public static final int A00;
    public static final long serialVersionUID = 2;
    public final C10064Gol _coercionConfigs;
    public final C10145GqC _ctorDetector;
    public final int _deserFeatures;
    public final int _formatReadFeatures;
    public final int _formatReadFeaturesToChange;
    public final C9808GhY _nodeFactory;
    public final int _parserFeatures;
    public final int _parserFeaturesToChange;
    public final C9829GiP _problemHandlers;

    static {
        int iAHO = 0;
        for (Object obj : (Enum[]) EnumC9965Gmd.class.getEnumConstants()) {
            InterfaceC10179Gqp interfaceC10179Gqp = (InterfaceC10179Gqp) obj;
            if (interfaceC10179Gqp.AA2()) {
                iAHO |= interfaceC10179Gqp.AHO();
            }
        }
        A00 = iAHO;
    }

    public C9898Gke(C9898Gke c9898Gke, C9895GkY c9895GkY) {
        super(c9895GkY, c9898Gke);
        this._deserFeatures = c9898Gke._deserFeatures;
        this._problemHandlers = c9898Gke._problemHandlers;
        this._nodeFactory = c9898Gke._nodeFactory;
        this._coercionConfigs = c9898Gke._coercionConfigs;
        this._ctorDetector = c9898Gke._ctorDetector;
        this._parserFeatures = c9898Gke._parserFeatures;
        this._parserFeaturesToChange = c9898Gke._parserFeaturesToChange;
        this._formatReadFeatures = c9898Gke._formatReadFeatures;
        this._formatReadFeaturesToChange = c9898Gke._formatReadFeaturesToChange;
    }

    public final C9914Gl4 A0D(AbstractC9870GjI abstractC9870GjI) {
        C9914Gl4 c9914Gl4A01 = C9935Gle.A01(abstractC9870GjI, this);
        if (c9914Gl4A01 != null) {
            return c9914Gl4A01;
        }
        C9914Gl4 c9914Gl4A00 = C9935Gle.A00(abstractC9870GjI, this);
        return c9914Gl4A00 == null ? new C9914Gl4(C9935Gle.A02(abstractC9870GjI, this, this, false)) : c9914Gl4A00;
    }

    public C9898Gke(C9895GkY c9895GkY, C10064Gol c10064Gol, C10045GoP c10045GoP, C9823GiH c9823GiH, C10053GoX c10053GoX, AbstractC10058Gof abstractC10058Gof, C9881Gjp c9881Gjp) {
        super(c9895GkY, c10045GoP, c9823GiH, c10053GoX, abstractC10058Gof, c9881Gjp);
        this._deserFeatures = A00;
        this._problemHandlers = null;
        this._nodeFactory = C9808GhY.A00;
        this._ctorDetector = null;
        this._coercionConfigs = c10064Gol;
        this._parserFeatures = 0;
        this._parserFeaturesToChange = 0;
        this._formatReadFeatures = 0;
        this._formatReadFeaturesToChange = 0;
    }

    public C9898Gke(C9898Gke c9898Gke, int i, int i2, int i3, int i4, int i5, long j) {
        super(c9898Gke, j);
        this._deserFeatures = i;
        this._problemHandlers = c9898Gke._problemHandlers;
        this._nodeFactory = c9898Gke._nodeFactory;
        this._coercionConfigs = c9898Gke._coercionConfigs;
        this._ctorDetector = c9898Gke._ctorDetector;
        this._parserFeatures = i2;
        this._parserFeaturesToChange = i3;
        this._formatReadFeatures = i4;
        this._formatReadFeaturesToChange = i5;
    }
}
