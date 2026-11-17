package X;

import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.Serializable;

/* renamed from: X.GnI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9991GnI extends AbstractC9877Gjl implements Serializable {
    public static final long serialVersionUID = 1;
    public final JsonDeserializer<?> _delegate;
    public final Class<?> _keyClass;

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/Class<*>;Lcom/fasterxml/jackson/databind/JsonDeserializer<*>;)V */
    public C9991GnI(JsonDeserializer jsonDeserializer, Class cls) {
        this._keyClass = cls;
        this._delegate = jsonDeserializer;
    }
}
