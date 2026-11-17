package X;

import com.fasterxml.jackson.databind.JsonSerializer;

/* renamed from: X.GdT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9671GdT {
    public final AbstractC9870GjI A00;
    public final JsonSerializer<Object> A01;
    public final C9671GdT A02;
    public final Class<?> A03;
    public final boolean A04;

    /* JADX WARN: Incorrect types in method signature: (LX/GdT;LX/GdR;Lcom/fasterxml/jackson/databind/JsonSerializer<Ljava/lang/Object;>;)V */
    public C9671GdT(JsonSerializer jsonSerializer, C9671GdT c9671GdT, C9669GdR c9669GdR) {
        this.A02 = c9671GdT;
        this.A01 = jsonSerializer;
        this.A04 = c9669GdR.A02;
        this.A03 = c9669GdR.A01;
        this.A00 = c9669GdR.A00;
    }
}
