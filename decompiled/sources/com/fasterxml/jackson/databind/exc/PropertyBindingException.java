package com.fasterxml.jackson.databind.exc;

import X.AbstractC9916Gl7;
import X.C9516GMj;
import java.util.Collection;

/* loaded from: classes6.dex */
public abstract class PropertyBindingException extends MismatchedInputException {
    public transient String A00;
    public final Collection<Object> _propertyIds;
    public final String _propertyName;
    public final Class<?> _referringClass;

    /* JADX WARN: Incorrect types in method signature: (LX/Gl7;Ljava/lang/String;LX/GMj;Ljava/lang/Class<*>;Ljava/lang/String;Ljava/util/Collection<Ljava/lang/Object;>;)V */
    public PropertyBindingException(C9516GMj c9516GMj, AbstractC9916Gl7 abstractC9916Gl7, Class cls, String str, String str2, Collection collection) {
        super(str, null);
        this._location = c9516GMj;
        super.A00 = abstractC9916Gl7;
        this._referringClass = cls;
        this._propertyName = str2;
        this._propertyIds = collection;
    }
}
