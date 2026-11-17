package X;

import java.io.Serializable;
import java.text.DateFormat;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: X.GkY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9895GkY implements Serializable {
    public static final TimeZone A00 = TimeZone.getTimeZone("UTC");
    public static final long serialVersionUID = 1;
    public final AbstractC10189Gr6 _accessorNaming;
    public final AbstractC9910Gks _annotationIntrospector;
    public final InterfaceC10195GrG _cacheProvider;
    public final AbstractC10142Gq9 _classIntrospector;
    public final DateFormat _dateFormat;
    public final Gn1 _defaultBase64;
    public final AbstractC10208GrU _handlerInstantiator = null;
    public final Locale _locale;
    public final C10103GpR _propertyNamingStrategy;
    public final TimeZone _timeZone;
    public final C9860Gj8 _typeFactory;
    public final InterfaceC10043GoN<?> _typeResolverBuilder;
    public final AbstractC9841Gig _typeValidator;

    public C9895GkY(Gn1 gn1, AbstractC9910Gks abstractC9910Gks, C10103GpR c10103GpR, InterfaceC10195GrG interfaceC10195GrG, AbstractC10189Gr6 abstractC10189Gr6, AbstractC10142Gq9 abstractC10142Gq9, AbstractC9841Gig abstractC9841Gig, InterfaceC10043GoN interfaceC10043GoN, C9860Gj8 c9860Gj8, DateFormat dateFormat, Locale locale, TimeZone timeZone) {
        this._classIntrospector = abstractC10142Gq9;
        this._annotationIntrospector = abstractC9910Gks;
        this._propertyNamingStrategy = c10103GpR;
        this._typeFactory = c9860Gj8;
        this._typeResolverBuilder = interfaceC10043GoN;
        this._dateFormat = dateFormat;
        this._locale = locale;
        this._timeZone = timeZone;
        this._defaultBase64 = gn1;
        this._typeValidator = abstractC9841Gig;
        this._accessorNaming = abstractC10189Gr6;
        this._cacheProvider = interfaceC10195GrG;
    }
}
