package X;

import X.AbstractC9896GkZ;
import X.InterfaceC10179Gqp;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* renamed from: X.GkZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9896GkZ<CFG extends InterfaceC10179Gqp, T extends AbstractC9896GkZ<CFG, T>> extends AbstractC9901Gkh<T> implements Serializable {
    public static final long A00;
    public static final AbstractC10074Gov A01 = Gr1.A00;
    public static final long A02;
    public final AbstractC9845Gin _attributes;
    public final C10045GoP _configOverrides;
    public final C9823GiH _datatypeFeatures;
    public final C10053GoX _mixIns;
    public final C10009Gnh _rootName;
    public final C9881Gjp _rootNames;
    public final AbstractC10058Gof _subtypeResolver;
    public final Class<?> _view;

    static {
        long j = 0;
        for (EnumC9951GmA enumC9951GmA : EnumC9951GmA.values()) {
            if (enumC9951GmA._defaultState) {
                j |= enumC9951GmA._mask;
            }
        }
        A02 = j;
        A00 = EnumC9951GmA.A0A._mask | EnumC9951GmA.A0B._mask | EnumC9951GmA.A0C._mask | EnumC9951GmA.A0D._mask | EnumC9951GmA.A09._mask;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final T A0B(C9860Gj8 c9860Gj8) {
        C9898Gke c9898Gke;
        C9895GkY c9895GkY = this._base;
        if (c9895GkY._typeFactory != c9860Gj8) {
            AbstractC10142Gq9 abstractC10142Gq9 = c9895GkY._classIntrospector;
            AbstractC9910Gks abstractC9910Gks = c9895GkY._annotationIntrospector;
            C10103GpR c10103GpR = c9895GkY._propertyNamingStrategy;
            InterfaceC10043GoN<?> interfaceC10043GoN = c9895GkY._typeResolverBuilder;
            DateFormat dateFormat = c9895GkY._dateFormat;
            Locale locale = c9895GkY._locale;
            TimeZone timeZone = c9895GkY._timeZone;
            Gn1 gn1 = c9895GkY._defaultBase64;
            AbstractC9841Gig abstractC9841Gig = c9895GkY._typeValidator;
            c9895GkY = new C9895GkY(gn1, abstractC9910Gks, c10103GpR, c9895GkY._cacheProvider, c9895GkY._accessorNaming, abstractC10142Gq9, abstractC9841Gig, interfaceC10043GoN, c9860Gj8, dateFormat, locale, timeZone);
        }
        if (this instanceof C9963Gma) {
            C9963Gma c9963Gma = (C9963Gma) this;
            C9895GkY c9895GkY2 = c9963Gma._base;
            c9898Gke = c9963Gma;
            if (c9895GkY2 != c9895GkY) {
                return new C9963Gma(c9963Gma, c9895GkY);
            }
        } else {
            C9898Gke c9898Gke2 = (C9898Gke) this;
            C9895GkY c9895GkY3 = c9898Gke2._base;
            c9898Gke = c9898Gke2;
            if (c9895GkY3 != c9895GkY) {
                return new C9898Gke(c9898Gke2, c9895GkY);
            }
        }
        return c9898Gke;
    }

    public final Boolean A0C(Class<?> cls) {
        AbstractC10074Gov abstractC10074Gov;
        Boolean bool;
        Map map = this._configOverrides._overrides;
        return (map == null || (abstractC10074Gov = (AbstractC10074Gov) map.get(cls)) == null || (bool = abstractC10074Gov._mergeable) == null) ? this._configOverrides._defaultMergeable : bool;
    }

    @Override // X.InterfaceC10159GqS
    public final Class<?> ABU(Class<?> cls) {
        return this._mixIns.ABU(cls);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/GkZ<TCFG;TT;>;LX/GkY;)V */
    public AbstractC9896GkZ(C9895GkY c9895GkY, AbstractC9896GkZ abstractC9896GkZ) {
        super(c9895GkY, abstractC9896GkZ);
        this._mixIns = abstractC9896GkZ._mixIns;
        this._subtypeResolver = abstractC9896GkZ._subtypeResolver;
        this._rootNames = abstractC9896GkZ._rootNames;
        this._rootName = abstractC9896GkZ._rootName;
        this._view = abstractC9896GkZ._view;
        this._attributes = abstractC9896GkZ._attributes;
        this._configOverrides = abstractC9896GkZ._configOverrides;
        this._datatypeFeatures = abstractC9896GkZ._datatypeFeatures;
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/Class<*>;LX/Gkr;)LX/Go4; */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C10029Go4 A0A(X.C9909Gkr r7, java.lang.Class r8) {
        /*
            r6 = this;
            X.Gks r0 = r6.A02()
            if (r0 != 0) goto L78
            r5 = 0
        L7:
            X.GoP r0 = r6._configOverrides
            java.util.Map r0 = r0._overrides
            if (r0 == 0) goto L76
            java.lang.Object r0 = r0.get(r8)
            X.Gov r0 = (X.AbstractC10074Gov) r0
            if (r0 == 0) goto L76
            X.Go4 r7 = r0._ignorals
            if (r7 == 0) goto L76
        L19:
            if (r5 == 0) goto L5f
            if (r7 == 0) goto L7d
            X.Go4 r0 = X.C10029Go4.A00
            if (r7 == r0) goto L7d
            boolean r0 = r7._merge
            if (r0 == 0) goto L5f
            boolean r0 = X.C10029Go4.A01(r5, r7)
            if (r0 != 0) goto L7d
            java.util.Set<java.lang.String> r2 = r5._ignored
            java.util.Set<java.lang.String> r6 = r7._ignored
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L3c
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L60
            r6 = r2
        L3c:
            boolean r0 = r5._ignoreUnknown
            r4 = 0
            r3 = 1
            if (r0 != 0) goto L47
            boolean r0 = r7._ignoreUnknown
            r2 = 0
            if (r0 == 0) goto L48
        L47:
            r2 = 1
        L48:
            boolean r0 = r5._allowGetters
            if (r0 != 0) goto L51
            boolean r0 = r7._allowGetters
            r1 = 0
            if (r0 == 0) goto L52
        L51:
            r1 = 1
        L52:
            boolean r0 = r5._allowSetters
            if (r0 != 0) goto L5a
            boolean r0 = r7._allowSetters
            if (r0 == 0) goto L5b
        L5a:
            r4 = 1
        L5b:
            X.Go4 r7 = X.C10029Go4.A00(r6, r2, r1, r4, r3)
        L5f:
            return r7
        L60:
            int r1 = r2.size()
            int r0 = r6.size()
            int r1 = r1 + r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r1)
            r0.addAll(r2)
            r0.addAll(r6)
            r6 = r0
            goto L3c
        L76:
            r7 = 0
            goto L19
        L78:
            X.Go4 r5 = r0.A09(r7)
            goto L7
        L7d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC9896GkZ.A0A(X.Gkr, java.lang.Class):X.Go4");
    }

    public AbstractC9896GkZ(AbstractC9896GkZ<CFG, T> abstractC9896GkZ, long j) {
        super(abstractC9896GkZ, j);
        this._mixIns = abstractC9896GkZ._mixIns;
        this._subtypeResolver = abstractC9896GkZ._subtypeResolver;
        this._rootNames = abstractC9896GkZ._rootNames;
        this._rootName = abstractC9896GkZ._rootName;
        this._view = abstractC9896GkZ._view;
        this._attributes = abstractC9896GkZ._attributes;
        this._configOverrides = abstractC9896GkZ._configOverrides;
        this._datatypeFeatures = abstractC9896GkZ._datatypeFeatures;
    }

    public AbstractC9896GkZ(C9895GkY c9895GkY, C10045GoP c10045GoP, C9823GiH c9823GiH, C10053GoX c10053GoX, AbstractC10058Gof abstractC10058Gof, C9881Gjp c9881Gjp) {
        super(c9895GkY, A02);
        this._mixIns = c10053GoX;
        this._subtypeResolver = abstractC10058Gof;
        this._rootNames = c9881Gjp;
        this._rootName = null;
        this._view = null;
        this._attributes = C10082Gp3.A01;
        this._configOverrides = c10045GoP;
        this._datatypeFeatures = c9823GiH;
    }
}
