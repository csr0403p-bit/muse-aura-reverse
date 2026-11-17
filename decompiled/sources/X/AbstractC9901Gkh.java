package X;

import X.AbstractC9901Gkh;
import java.io.Serializable;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.Gkh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9901Gkh<T extends AbstractC9901Gkh<T>> implements InterfaceC10159GqS, Serializable {
    public static final long serialVersionUID = 2;
    public final C9895GkY _base;
    public final long _mapperFeatures;
    public static final C10007Gnf A01 = C10007Gnf.A00;
    public static final C9894GkV A00 = C9894GkV.A01;

    public final C9894GkV A00(Class<?> cls) {
        AbstractC10074Gov abstractC10074Gov;
        C9894GkV c9894GkV;
        Boolean bool;
        C10045GoP c10045GoP = ((AbstractC9896GkZ) this)._configOverrides;
        Map map = c10045GoP._overrides;
        if (map == null || (abstractC10074Gov = (AbstractC10074Gov) map.get(cls)) == null || (c9894GkV = abstractC10074Gov._format) == null) {
            Boolean bool2 = c10045GoP._defaultLeniency;
            return bool2 == null ? C9894GkV.A01 : new C9894GkV(C10101GpP.A02, null, bool2, "", null, null, null);
        }
        Boolean bool3 = c9894GkV._lenient;
        if (bool3 != null || (bool = c10045GoP._defaultLeniency) == bool3) {
            return c9894GkV;
        }
        return new C9894GkV(c9894GkV._features, c9894GkV._shape, bool, c9894GkV._pattern, c9894GkV._timezoneStr, c9894GkV._locale, c9894GkV.A00);
    }

    public final C10007Gnf A01(Class<?> cls) {
        AbstractC9896GkZ abstractC9896GkZ = (AbstractC9896GkZ) this;
        C10007Gnf c10007Gnf = abstractC9896GkZ.A03(cls)._include;
        C10007Gnf c10007Gnf2 = abstractC9896GkZ._configOverrides._defaultInclusion;
        return c10007Gnf2 != null ? c10007Gnf2.A00(c10007Gnf) : c10007Gnf;
    }

    public final AbstractC9910Gks A02() {
        return (this._mapperFeatures & EnumC9951GmA.A0S._mask) != 0 ? this._base._annotationIntrospector : AbstractC10174Gqj.A00;
    }

    public final AbstractC10074Gov A03(Class<?> cls) {
        AbstractC10074Gov abstractC10074Gov;
        Map map = ((AbstractC9896GkZ) this)._configOverrides._overrides;
        return (map == null || (abstractC10074Gov = (AbstractC10074Gov) map.get(cls)) == null) ? AbstractC9896GkZ.A01 : abstractC10074Gov;
    }

    public final C10145GqC A04() {
        C10145GqC c10145GqC = this instanceof C9963Gma ? ((C9963Gma) this)._ctorDetector : ((C9898Gke) this)._ctorDetector;
        return c10145GqC == null ? C10145GqC.A00 : c10145GqC;
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/Class<*>;LX/Gkr;)LX/Gql<*>; */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC10176Gql A06(X.C9909Gkr r14, java.lang.Class r15) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC9901Gkh.A06(X.Gkr, java.lang.Class):X.Gql");
    }

    public final boolean A07() {
        return AnonymousClass002.A1L(((this._mapperFeatures & EnumC9951GmA.A0F._mask) > 0L ? 1 : ((this._mapperFeatures & EnumC9951GmA.A0F._mask) == 0L ? 0 : -1)));
    }

    public final boolean A08() {
        return AnonymousClass002.A1L(((this._mapperFeatures & EnumC9951GmA.A0S._mask) > 0L ? 1 : ((this._mapperFeatures & EnumC9951GmA.A0S._mask) == 0L ? 0 : -1)));
    }

    public final boolean A09(EnumC9951GmA enumC9951GmA) {
        return AnonymousClass002.A1L(((this._mapperFeatures & enumC9951GmA._mask) > 0L ? 1 : ((this._mapperFeatures & enumC9951GmA._mask) == 0L ? 0 : -1)));
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gkh<TT;>;LX/GkY;)V */
    public AbstractC9901Gkh(C9895GkY c9895GkY, AbstractC9901Gkh abstractC9901Gkh) {
        this._base = c9895GkY;
        this._mapperFeatures = abstractC9901Gkh._mapperFeatures;
    }

    public final C9914Gl4 A05(Class<?> cls) {
        AbstractC9870GjI abstractC9870GjIA0R = AbstractC7608F5v.A0R(this, cls);
        C9914Gl4 c9914Gl4A01 = C9935Gle.A01(abstractC9870GjIA0R, this);
        return c9914Gl4A01 == null ? new C9914Gl4(abstractC9870GjIA0R, this, C9928GlP.A00(abstractC9870GjIA0R, this, this), Collections.EMPTY_LIST) : c9914Gl4A01;
    }

    public AbstractC9901Gkh(AbstractC9901Gkh<T> abstractC9901Gkh, long j) {
        this._base = abstractC9901Gkh._base;
        this._mapperFeatures = j;
    }

    public AbstractC9901Gkh(C9895GkY c9895GkY, long j) {
        this._base = c9895GkY;
        this._mapperFeatures = j;
    }
}
