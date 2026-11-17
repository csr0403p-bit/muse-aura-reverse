package androidx.datastore.preferences.protobuf;

import java.util.List;

/* loaded from: classes6.dex */
public class UninitializedMessageException extends RuntimeException {
    public static final long serialVersionUID = -7466929953374883507L;
    public final List<String> missingFields;

    public UninitializedMessageException() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.missingFields = null;
    }
}
