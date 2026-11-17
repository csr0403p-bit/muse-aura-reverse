package X;

import com.fasterxml.jackson.databind.JsonSerializer;

/* renamed from: X.Gpc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10111Gpc extends AbstractC10109Gpa {
    public final JsonSerializer<Object> A00;
    public final Class<?> A01;

    /* JADX WARN: Incorrect types in method signature: (LX/Gpa;Ljava/lang/Class<*>;Lcom/fasterxml/jackson/databind/JsonSerializer<Ljava/lang/Object;>;)V */
    public C10111Gpc(JsonSerializer jsonSerializer, AbstractC10109Gpa abstractC10109Gpa, Class cls) {
        super(abstractC10109Gpa);
        this.A01 = cls;
        this.A00 = jsonSerializer;
    }
}
