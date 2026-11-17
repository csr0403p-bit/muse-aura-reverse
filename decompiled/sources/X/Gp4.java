package X;

import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.std.MapSerializer;

/* loaded from: classes6.dex */
public final class Gp4 {
    public JsonSerializer<Object> A00;
    public MapSerializer A01;
    public final InterfaceC10017Gnp A02;
    public final AbstractC9970Gmj A03;

    /* JADX WARN: Incorrect types in method signature: (LX/Gnp;LX/Gmj;Lcom/fasterxml/jackson/databind/JsonSerializer<*>;)V */
    public Gp4(InterfaceC10017Gnp interfaceC10017Gnp, JsonSerializer jsonSerializer, AbstractC9970Gmj abstractC9970Gmj) {
        this.A03 = abstractC9970Gmj;
        this.A02 = interfaceC10017Gnp;
        this.A00 = jsonSerializer;
        if (jsonSerializer instanceof MapSerializer) {
            this.A01 = (MapSerializer) jsonSerializer;
        }
    }
}
