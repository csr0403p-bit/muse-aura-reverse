package X;

import com.fasterxml.jackson.databind.node.JsonNodeCreator;
import java.io.Serializable;

/* renamed from: X.GhY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9808GhY implements JsonNodeCreator, Serializable {
    public static final C9808GhY A00 = new C9808GhY(false);
    public static final long serialVersionUID = 1;

    @Deprecated
    public final boolean _cfgBigDecimalExact;

    public C9808GhY() {
        this(false);
    }

    public C9808GhY(boolean z) {
        this._cfgBigDecimalExact = false;
    }
}
