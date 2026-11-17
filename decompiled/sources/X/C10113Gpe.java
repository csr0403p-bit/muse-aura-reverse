package X;

import com.fasterxml.jackson.databind.JsonSerializer;

/* renamed from: X.Gpe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10113Gpe extends AbstractC10109Gpa {
    public final JsonSerializer<Object> A00;
    public final JsonSerializer<Object> A01;
    public final Class<?> A02;
    public final Class<?> A03;

    /* JADX WARN: Incorrect types in method signature: (LX/Gpa;Ljava/lang/Class<*>;Lcom/fasterxml/jackson/databind/JsonSerializer<Ljava/lang/Object;>;Ljava/lang/Class<*>;Lcom/fasterxml/jackson/databind/JsonSerializer<Ljava/lang/Object;>;)V */
    public C10113Gpe(JsonSerializer jsonSerializer, JsonSerializer jsonSerializer2, AbstractC10109Gpa abstractC10109Gpa, Class cls, Class cls2) {
        super(abstractC10109Gpa);
        this.A02 = cls;
        this.A00 = jsonSerializer;
        this.A03 = cls2;
        this.A01 = jsonSerializer2;
    }
}
