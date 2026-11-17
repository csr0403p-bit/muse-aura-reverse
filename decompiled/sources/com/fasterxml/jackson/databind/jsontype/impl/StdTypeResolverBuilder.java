package com.fasterxml.jackson.databind.jsontype.impl;

import X.AbstractC10028Go2;
import X.AbstractC7607F5u;
import X.AbstractC7608F5v;
import X.AbstractC9841Gig;
import X.AbstractC9870GjI;
import X.AbstractC9901Gkh;
import X.BV4;
import X.C10036GoF;
import X.C10097GpL;
import X.C10098GpM;
import X.C10108GpZ;
import X.C10117Gpi;
import X.C10118Gpj;
import X.C10151GqI;
import X.C3cG;
import X.C60O;
import X.C9838Gid;
import X.C9839Gie;
import X.C9882Gjq;
import X.C9883Gjr;
import X.C9963Gma;
import X.EnumC10066Gon;
import X.EnumC10075Gow;
import X.EnumC9951GmA;
import X.GnQ;
import X.HjD;
import X.Hqi;
import X.InterfaceC10043GoN;
import X.InterfaceC9853Gix;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public class StdTypeResolverBuilder implements InterfaceC10043GoN<StdTypeResolverBuilder> {
    public InterfaceC9853Gix _customIdResolver;
    public Class<?> _defaultImpl;
    public EnumC10066Gon _idType;
    public EnumC10075Gow _includeAs;
    public Boolean _requireTypeIdForSubtypes;
    public boolean _typeIdVisible = false;
    public String _typeProperty;

    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bc  */
    @Override // X.InterfaceC10043GoN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC9986Gn8 A5X(X.C9898Gke r14, X.AbstractC9870GjI r15, java.util.Collection<X.HjD> r16) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.A5X(X.Gke, X.GjI, java.util.Collection):X.Giw");
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gma;LX/GjI;Ljava/util/Collection<LX/HjD;>;)LX/GnP; */
    @Override // X.InterfaceC10043GoN
    public final AbstractC10028Go2 A5Y(AbstractC9870GjI abstractC9870GjI, C9963Gma c9963Gma, Collection collection) {
        if (this._idType == EnumC10066Gon.NONE || abstractC9870GjI._class.isPrimitive()) {
            return null;
        }
        if (this._idType == EnumC10066Gon.DEDUCTION) {
            return C10036GoF.A00;
        }
        AbstractC9841Gig hqi = c9963Gma._base._typeValidator;
        if (hqi == C10151GqI.A00) {
            if ((c9963Gma._mapperFeatures & EnumC9951GmA.A0E._mask) != 0) {
                hqi = new Hqi();
            }
        }
        InterfaceC9853Gix interfaceC9853GixA00 = A00(abstractC9870GjI, c9963Gma, hqi, collection, true, false);
        EnumC10075Gow enumC10075Gow = this._includeAs;
        int iOrdinal = enumC10075Gow.ordinal();
        if (iOrdinal == 2) {
            return new C10118Gpj(null, interfaceC9853GixA00);
        }
        if (iOrdinal == 0) {
            return new C10098GpM(null, interfaceC9853GixA00, this._typeProperty);
        }
        if (iOrdinal == 1) {
            return new C10117Gpi(null, interfaceC9853GixA00);
        }
        if (iOrdinal == 3) {
            return new C10108GpZ(null, interfaceC9853GixA00, this._typeProperty);
        }
        if (iOrdinal == 4) {
            return new C10097GpL(null, interfaceC9853GixA00, this._typeProperty);
        }
        throw AbstractC7607F5u.A10(enumC10075Gow, "Do not know how to construct standard type serializer for inclusion type: ");
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gkh<*>;LX/GjI;LX/Gig;Ljava/util/Collection<LX/HjD;>;ZZ)LX/Gix; */
    private final InterfaceC9853Gix A00(AbstractC9870GjI abstractC9870GjI, AbstractC9901Gkh abstractC9901Gkh, AbstractC9841Gig abstractC9841Gig, Collection collection, boolean z, boolean z2) {
        HashMap mapA0u;
        ConcurrentHashMap concurrentHashMap;
        int iLastIndexOf;
        HashMap mapA0u2;
        ConcurrentHashMap concurrentHashMap2;
        InterfaceC9853Gix interfaceC9853Gix = this._customIdResolver;
        if (interfaceC9853Gix != null) {
            return interfaceC9853Gix;
        }
        EnumC10066Gon enumC10066Gon = this._idType;
        if (enumC10066Gon == null) {
            throw C3cG.A0Q("Cannot build, 'init()' not yet called");
        }
        switch (enumC10066Gon) {
            case NONE:
                return null;
            case CLASS:
            case DEDUCTION:
                return new C9838Gid(abstractC9870GjI, abstractC9841Gig, abstractC9901Gkh._base._typeFactory);
            case MINIMAL_CLASS:
                return new C9839Gie(abstractC9870GjI, abstractC9841Gig, abstractC9901Gkh._base._typeFactory);
            case NAME:
                if (z == z2) {
                    throw BV4.A0P();
                }
                if (z) {
                    concurrentHashMap = C60O.A1C();
                    mapA0u = null;
                } else {
                    mapA0u = BV4.A0u();
                    concurrentHashMap = new ConcurrentHashMap(4);
                }
                boolean zA09 = abstractC9901Gkh.A09(EnumC9951GmA.A03);
                if (collection != null) {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        HjD hjD = (HjD) it.next();
                        Class<?> cls = hjD._class;
                        String lowerCase = hjD._name;
                        if (lowerCase == null && (iLastIndexOf = (lowerCase = cls.getName()).lastIndexOf(46)) >= 0) {
                            lowerCase = BV4.A0g(iLastIndexOf, lowerCase);
                        }
                        if (z) {
                            AbstractC7608F5v.A1I(cls, lowerCase, concurrentHashMap);
                        }
                        if (z2) {
                            if (zA09) {
                                lowerCase = lowerCase.toLowerCase();
                            }
                            AbstractC9870GjI abstractC9870GjI2 = (AbstractC9870GjI) mapA0u.get(lowerCase);
                            if (abstractC9870GjI2 == null || !cls.isAssignableFrom(abstractC9870GjI2._class)) {
                                mapA0u.put(lowerCase, AbstractC7608F5v.A0R(abstractC9901Gkh, cls));
                            }
                        }
                    }
                }
                return new C9883Gjr(abstractC9870GjI, abstractC9901Gkh, mapA0u, concurrentHashMap);
            case SIMPLE_NAME:
                if (z == z2) {
                    throw BV4.A0P();
                }
                if (z) {
                    concurrentHashMap2 = C60O.A1C();
                    mapA0u2 = null;
                } else {
                    mapA0u2 = BV4.A0u();
                    concurrentHashMap2 = new ConcurrentHashMap(4);
                }
                boolean zA092 = abstractC9901Gkh.A09(EnumC9951GmA.A03);
                if (collection != null) {
                    Iterator it2 = collection.iterator();
                    while (it2.hasNext()) {
                        HjD hjD2 = (HjD) it2.next();
                        Class<?> cls2 = hjD2._class;
                        String lowerCase2 = hjD2._name;
                        if (lowerCase2 == null) {
                            lowerCase2 = cls2.getName();
                            int iMax = Math.max(lowerCase2.lastIndexOf(46), lowerCase2.lastIndexOf(36));
                            if (iMax >= 0) {
                                lowerCase2 = BV4.A0g(iMax, lowerCase2);
                            }
                        }
                        if (z) {
                            AbstractC7608F5v.A1I(cls2, lowerCase2, concurrentHashMap2);
                        }
                        if (z2) {
                            if (zA092) {
                                lowerCase2 = lowerCase2.toLowerCase();
                            }
                            AbstractC9870GjI abstractC9870GjI3 = (AbstractC9870GjI) mapA0u2.get(lowerCase2);
                            if (abstractC9870GjI3 == null || !cls2.isAssignableFrom(abstractC9870GjI3._class)) {
                                mapA0u2.put(lowerCase2, AbstractC7608F5v.A0R(abstractC9901Gkh, cls2));
                            }
                        }
                    }
                }
                return new C9882Gjq(abstractC9870GjI, abstractC9901Gkh, mapA0u2, concurrentHashMap2);
            default:
                throw AbstractC7607F5u.A10(enumC10066Gon, "Do not know how to construct standard type id resolver for idType: ");
        }
    }

    public static final void A01(GnQ gnQ, StdTypeResolverBuilder stdTypeResolverBuilder) {
        EnumC10066Gon enumC10066Gon = gnQ._idType;
        enumC10066Gon.getClass();
        stdTypeResolverBuilder._idType = enumC10066Gon;
        stdTypeResolverBuilder._includeAs = gnQ._inclusionType;
        String str = gnQ._propertyName;
        if (str == null || str.isEmpty()) {
            str = enumC10066Gon._defaultPropertyName;
        }
        stdTypeResolverBuilder._typeProperty = str;
        stdTypeResolverBuilder._defaultImpl = gnQ._defaultImpl;
        stdTypeResolverBuilder._typeIdVisible = gnQ._idVisible;
        stdTypeResolverBuilder._requireTypeIdForSubtypes = gnQ._requireTypeIdForSubtypes;
    }
}
