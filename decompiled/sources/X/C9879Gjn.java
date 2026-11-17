package X;

import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ext.CoreXMLSerializers;
import com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.fasterxml.jackson.datatype.guava.ser.RangeSerializer;
import com.fasterxml.jackson.datatype.guava.ser.RangeSetSerializer;
import com.fasterxml.jackson.datatype.guava.ser.TableSerializer;
import com.google.common.collect.Range;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

/* renamed from: X.Gjn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C9879Gjn implements InterfaceC9886GkG {
    @Override // X.InterfaceC9886GkG
    public final JsonSerializer ABZ(AbstractC9870GjI abstractC9870GjI) {
        if (!(this instanceof C9878Gjm)) {
            if (!(this instanceof CoreXMLSerializers)) {
                return null;
            }
            Class<?> cls = abstractC9870GjI._class;
            if (Duration.class.isAssignableFrom(cls) || QName.class.isAssignableFrom(cls)) {
                return ToStringSerializer.A00;
            }
            if (XMLGregorianCalendar.class.isAssignableFrom(cls)) {
                return CoreXMLSerializers.XMLGregorianCalendarSerializer.A00;
            }
            return null;
        }
        Class<?> cls2 = abstractC9870GjI._class;
        if (AbstractC6503E9m.class.isAssignableFrom(cls2)) {
            return new RangeSetSerializer();
        }
        if (Range.class.isAssignableFrom(cls2)) {
            return new RangeSerializer(EnumC10046GoQ.ANY, C9878Gjm.A00(abstractC9870GjI, Range.class), null, AbstractC9875Gjj.A00);
        }
        if (Hrj.class.isAssignableFrom(cls2)) {
            return new TableSerializer(C9878Gjm.A00(abstractC9870GjI, Hrj.class));
        }
        if (HqX.class.isAssignableFrom(cls2) || C6426E5d.class.isAssignableFrom(cls2) || E8P.class.isAssignableFrom(cls2) || E8Q.class.isAssignableFrom(cls2) || DKN.class.isAssignableFrom(cls2)) {
            return ToStringSerializer.A00;
        }
        if (CQB.class.isAssignableFrom(cls2)) {
            return new StdDelegatingSerializer(C9878Gjm.A00(abstractC9870GjI, Iterable.class), null, C9835GiZ.A00);
        }
        return null;
    }
}
