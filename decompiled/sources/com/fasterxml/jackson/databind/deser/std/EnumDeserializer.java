package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC7609F5w;
import X.AbstractC9904Gkk;
import X.C10127Gps;
import X.C6xC;
import X.C9933GlW;
import X.EnumC10062Goj;
import X.EnumC9965Gmd;
import X.InterfaceC10017Gnp;
import X.InterfaceC9830GiT;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import java.util.Optional;

@JacksonStdImpl
/* loaded from: classes6.dex */
public class EnumDeserializer extends StdScalarDeserializer<Object> implements InterfaceC9830GiT {
    public static final long serialVersionUID = 1;
    public final Boolean _caseInsensitive;
    public final Enum<?> _enumDefaultValue;
    public Object[] _enumsByIndex;
    public final boolean _isFromIntValue;
    public final C10127Gps _lookupByEnumNaming;
    public final C10127Gps _lookupByName;
    public volatile C10127Gps _lookupByToString;
    public Boolean _useDefaultValueForUnknownEnum;
    public Boolean _useNullForUnknownEnum;

    private final boolean A00(AbstractC9904Gkk abstractC9904Gkk) {
        if (this._enumDefaultValue == null) {
            return false;
        }
        Boolean bool = this._useDefaultValueForUnknownEnum;
        if (bool != null) {
            return bool.booleanValue();
        }
        EnumC9965Gmd enumC9965Gmd = EnumC9965Gmd.A0K;
        return AbstractC7609F5w.A1U(enumC9965Gmd._mask, abstractC9904Gkk._featureFlags);
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0147, code lost:
    
        if (r1 != 1) goto L76;
     */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0i(X.AbstractC9916Gl7 r11, X.AbstractC9904Gkk r12) throws com.fasterxml.jackson.databind.exc.InvalidFormatException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 543
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.EnumDeserializer.A0i(X.Gl7, X.Gkk):java.lang.Object");
    }

    public EnumDeserializer(EnumDeserializer enumDeserializer, Boolean bool, Boolean bool2, Boolean bool3) {
        super(enumDeserializer);
        this._lookupByName = enumDeserializer._lookupByName;
        this._enumsByIndex = enumDeserializer._enumsByIndex;
        this._enumDefaultValue = enumDeserializer._enumDefaultValue;
        this._caseInsensitive = Boolean.valueOf(Boolean.TRUE.equals(bool));
        this._isFromIntValue = enumDeserializer._isFromIntValue;
        this._useDefaultValueForUnknownEnum = bool2;
        this._useNullForUnknownEnum = bool3;
        this._lookupByEnumNaming = enumDeserializer._lookupByEnumNaming;
        this._lookupByToString = enumDeserializer._lookupByToString;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gkk;LX/Gnp;)Lcom/fasterxml/jackson/databind/JsonDeserializer<*>; */
    @Override // X.InterfaceC9830GiT
    public final JsonDeserializer A7e(InterfaceC10017Gnp interfaceC10017Gnp, AbstractC9904Gkk abstractC9904Gkk) {
        Boolean bool = (Boolean) Optional.ofNullable(A10(EnumC10062Goj.A00, interfaceC10017Gnp, abstractC9904Gkk, A0h())).orElse(this._caseInsensitive);
        Boolean bool2 = (Boolean) Optional.ofNullable(A10(EnumC10062Goj.A03, interfaceC10017Gnp, abstractC9904Gkk, A0h())).orElse(this._useDefaultValueForUnknownEnum);
        Boolean bool3 = (Boolean) Optional.ofNullable(A10(EnumC10062Goj.A02, interfaceC10017Gnp, abstractC9904Gkk, A0h())).orElse(this._useNullForUnknownEnum);
        return (C6xC.A00(this._caseInsensitive, bool) && C6xC.A00(this._useDefaultValueForUnknownEnum, bool2) && C6xC.A00(this._useNullForUnknownEnum, bool3)) ? this : new EnumDeserializer(this, bool, bool2, bool3);
    }

    public EnumDeserializer(C9933GlW c9933GlW, C9933GlW c9933GlW2, boolean z) {
        super(c9933GlW._enumClass);
        this._lookupByName = c9933GlW.A03();
        this._enumsByIndex = c9933GlW._enums;
        this._enumDefaultValue = c9933GlW._defaultValue;
        this._caseInsensitive = Boolean.valueOf(z);
        this._isFromIntValue = c9933GlW._isFromIntValue;
        this._lookupByEnumNaming = null;
        this._lookupByToString = c9933GlW2.A03();
    }
}
