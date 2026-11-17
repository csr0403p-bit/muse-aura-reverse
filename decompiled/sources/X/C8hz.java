package X;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* renamed from: X.8hz, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C8hz implements C20Z {
    public final int $t;
    public final Object A00;

    /* JADX WARN: Multi-variable type inference failed */
    public C8hz(InterfaceC05161qu interfaceC05161qu, InterfaceC05161qu<R> interfaceC05161qu2) {
        this.$t = interfaceC05161qu2;
        this.A00 = interfaceC05161qu;
    }

    @Override // X.C20Z
    public final Object emit(T t, HtJ<? super Unit> htJ) {
        ((MutableState) this.A00).Af8(t);
        return Unit.INSTANCE;
    }
}
