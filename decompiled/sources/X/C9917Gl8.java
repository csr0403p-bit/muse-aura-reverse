package X;

import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;
import java.io.Serializable;

@JacksonStdImpl
/* renamed from: X.Gl8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C9917Gl8 extends AbstractC9877Gjl implements Serializable {
    public static final long serialVersionUID = 1;
    public final FromStringDeserializer<?> _deser;
    public final Class<?> _keyClass;
    public final int _kind;

    /* JADX WARN: Incorrect types in method signature: (ILjava/lang/Class<*>;Lcom/fasterxml/jackson/databind/deser/std/FromStringDeserializer<*>;)V */
    public C9917Gl8(FromStringDeserializer fromStringDeserializer, Class cls, int i) {
        this._kind = i;
        this._keyClass = cls;
        this._deser = fromStringDeserializer;
    }
}
