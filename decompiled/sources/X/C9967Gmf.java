package X;

import com.fasterxml.jackson.databind.ser.std.DateSerializer;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

/* renamed from: X.Gmf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9967Gmf implements Serializable {
    public static final C10201GrM A00;
    public static final C9967Gmf A01;
    public static final long serialVersionUID = 1;
    public final Map<String, String> _sqlDeserializers;
    public final Map<String, Object> _sqlSerializers;
    public static final Class<?> A03 = Node.class;
    public static final Class<?> A02 = Document.class;

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    static {
        C10201GrM c10201GrM = null;
        try {
            c10201GrM = C10201GrM.A00;
        } catch (Throwable th) {
            HwR.A00(th);
        }
        A00 = c10201GrM;
        A01 = new C9967Gmf();
    }

    public static Object A00(AbstractC9870GjI abstractC9870GjI, String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                return AbstractC9855Gj3.A03(cls, false);
            } catch (Throwable th) {
                HwR.A00(th);
                throw C3cG.A0Q(FGI.A0l("Failed to create instance of `", cls.getName(), "` for handling values of type ", AbstractC9855Gj3.A04(abstractC9870GjI), ", problem: (", C60Q.A0e(th), ") ", th.getMessage()));
            }
        } catch (Throwable th2) {
            HwR.A00(th2);
            throw C3cG.A0Q(FGI.A0l("Failed to find class `", str, "` for handling values of type ", AbstractC9855Gj3.A04(abstractC9870GjI), ", problem: (", C60Q.A0e(th2), ") ", th2.getMessage()));
        }
    }

    public C9967Gmf() {
        HashMap mapA0u = BV4.A0u();
        this._sqlDeserializers = mapA0u;
        mapA0u.put("java.sql.Date", "com.fasterxml.jackson.databind.deser.std.DateDeserializers$SqlDateDeserializer");
        mapA0u.put("java.sql.Timestamp", "com.fasterxml.jackson.databind.deser.std.DateDeserializers$TimestampDeserializer");
        HashMap mapA0u2 = BV4.A0u();
        this._sqlSerializers = mapA0u2;
        mapA0u2.put("java.sql.Timestamp", DateSerializer.A00);
        mapA0u2.put("java.sql.Date", "com.fasterxml.jackson.databind.ser.std.SqlDateSerializer");
        mapA0u2.put("java.sql.Time", "com.fasterxml.jackson.databind.ser.std.SqlTimeSerializer");
        mapA0u2.put("java.sql.Blob", "com.fasterxml.jackson.databind.ext.SqlBlobSerializer");
        mapA0u2.put("javax.sql.rowset.serial.SerialBlob", "com.fasterxml.jackson.databind.ext.SqlBlobSerializer");
    }
}
