package X;

import android.media.AudioManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.GSx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9625GSx extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AudioManager.OnModeChangedListener $listener;
    public final /* synthetic */ C9621GSq this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9625GSx(AudioManager.OnModeChangedListener onModeChangedListener, C9621GSq c9621GSq) {
        super(0);
        this.this$0 = c9621GSq;
        this.$listener = onModeChangedListener;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Unit invoke() {
        this.this$0.A07.removeOnModeChangedListener(this.$listener);
        return Unit.INSTANCE;
    }
}
