package com.fasterxml.jackson.core;

import X.AnonymousClass001;
import X.BV3;
import X.BV4;
import X.C60Q;
import X.C8j3;
import X.C9516GMj;
import X.FGI;
import com.fasterxml.jackson.databind.exc.PropertyBindingException;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes6.dex */
public abstract class JsonProcessingException extends JacksonException {
    public static final long serialVersionUID = 123;
    public C9516GMj _location;

    @Override // com.fasterxml.jackson.core.JacksonException
    public final String A05() {
        return super.getMessage();
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String strA0v;
        Collection<Object> collection;
        String message = super.getMessage();
        if (message == null) {
            message = "N/A";
        }
        C9516GMj c9516GMj = this._location;
        if (this instanceof PropertyBindingException) {
            PropertyBindingException propertyBindingException = (PropertyBindingException) this;
            strA0v = propertyBindingException.A00;
            if (strA0v == null && (collection = propertyBindingException._propertyIds) != null) {
                StringBuilder sbA0p = BV4.A0p(100);
                int size = collection.size();
                if (size != 1) {
                    sbA0p.append(" (");
                    sbA0p.append(size);
                    sbA0p.append(" known properties: ");
                    Iterator<Object> it = propertyBindingException._propertyIds.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        sbA0p.append('\"');
                        sbA0p.append(String.valueOf(it.next()));
                        sbA0p.append('\"');
                        if (sbA0p.length() > 1000) {
                            sbA0p.append(BV3.A00(13));
                            break;
                        }
                        if (it.hasNext()) {
                            C8j3.A1K(sbA0p);
                        }
                    }
                } else {
                    sbA0p.append(" (one known property: \"");
                    sbA0p.append(String.valueOf(propertyBindingException._propertyIds.iterator().next()));
                    sbA0p.append('\"');
                }
                strA0v = AnonymousClass001.A0v("])", sbA0p);
                propertyBindingException.A00 = strA0v;
            }
        } else {
            strA0v = null;
        }
        if (c9516GMj == null && strA0v == null) {
            return message;
        }
        StringBuilder sbA0p2 = BV4.A0p(100);
        sbA0p2.append(message);
        if (strA0v != null) {
            sbA0p2.append(strA0v);
        }
        if (c9516GMj != null) {
            sbA0p2.append("\n at ");
            BV4.A1O(sbA0p2, c9516GMj);
        }
        return sbA0p2.toString();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return FGI.A0U(C60Q.A0e(this), ": ", getMessage());
    }
}
