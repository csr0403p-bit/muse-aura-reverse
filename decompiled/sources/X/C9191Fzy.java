package X;

import java.util.Collections;
import java.util.Map;

/* renamed from: X.Fzy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9191Fzy extends GF3<C9172Fzf, C9191Fzy> implements InterfaceC9133Fyy {
    public C9191Fzy() {
        super(C9172Fzf.DEFAULT_INSTANCE);
    }

    @Override // X.InterfaceC9133Fyy
    public final Map<String, C9187Fzu> AMW() {
        return Collections.unmodifiableMap(Collections.unmodifiableMap(((C9172Fzf) this.A00).values_));
    }
}
