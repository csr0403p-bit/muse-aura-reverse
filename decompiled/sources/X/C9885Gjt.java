package X;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.HashCodeDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.HostAndPortDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.InternetDomainNameDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.RangeDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.RangeSetDeserializer;
import com.google.common.collect.BoundType;
import com.google.common.collect.Range;
import java.io.Serializable;

/* renamed from: X.Gjt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9885Gjt extends AbstractC9880Gjo implements Serializable {
    public static final long serialVersionUID = 1;
    public BoundType _defaultBoundType = null;

    public static void A00(C9874GjM c9874GjM, String str) {
        Class<?> cls = c9874GjM._elementType._class;
        if (!Comparable.class.isAssignableFrom(cls)) {
            throw FGI.A01("Can not handle ", str, " with elements that are not Comparable<?> (", cls.getName(), ")");
        }
    }

    @Override // X.InterfaceC9884Gjs
    public final JsonDeserializer ABQ(AbstractC9870GjI abstractC9870GjI) {
        if (AbstractC6503E9m.class.isAssignableFrom(abstractC9870GjI._class)) {
            return new RangeSetDeserializer();
        }
        Class<?> cls = abstractC9870GjI._class;
        if (cls == Range.class) {
            BoundType boundType = this._defaultBoundType;
            return new RangeDeserializer(EnumC10046GoQ.ANY, abstractC9870GjI, null, null, AbstractC9875Gjj.A00, boundType);
        }
        if (cls == HqX.class) {
            return HostAndPortDeserializer.A00;
        }
        if (cls == C6426E5d.class) {
            return InternetDomainNameDeserializer.A00;
        }
        if (cls == DKN.class) {
            return HashCodeDeserializer.A00;
        }
        return null;
    }
}
