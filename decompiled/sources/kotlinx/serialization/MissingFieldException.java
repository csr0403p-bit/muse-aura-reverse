package kotlinx.serialization;

import X.C7384Etj;
import java.util.List;

/* loaded from: classes4.dex */
public final class MissingFieldException extends SerializationException {
    public final List<String> missingFields;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Ljava/util/List<Ljava/lang/String;>;Ljava/lang/String;Ljava/lang/Throwable;)V */
    public MissingFieldException(String str, Throwable th, List list) {
        super(str, th);
        C7384Etj.A0Y(list, 0);
        this.missingFields = list;
    }
}
