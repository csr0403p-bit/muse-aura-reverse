package X;

import java.util.Collections;
import java.util.Map;

/* renamed from: X.Fzf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9172Fzf extends GF2<C9172Fzf, C9191Fzy> implements InterfaceC9133Fyy {
    public static final C9172Fzf DEFAULT_INSTANCE;
    public static final int INSTANT_TIME_MILLIS_FIELD_NUMBER = 2;
    public static volatile G0P<C9172Fzf> PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    public int bitField0_;
    public long instantTimeMillis_;
    public HxZ<String, C9187Fzu> values_ = HxZ.A00;

    static {
        C9172Fzf c9172Fzf = new C9172Fzf();
        DEFAULT_INSTANCE = c9172Fzf;
        GF2.A02(c9172Fzf, C9172Fzf.class);
    }

    @Override // X.InterfaceC9133Fyy
    public final Map<String, C9187Fzu> AMW() {
        return Collections.unmodifiableMap(this.values_);
    }
}
