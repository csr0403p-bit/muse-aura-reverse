package X;

import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", f = "Share.kt", l = {}, m = "invokeSuspend", v = 1)
/* renamed from: X.2Bg, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2Bg extends AbstractC07127nr implements G0V<Integer, HtJ<? super Boolean>, Object> {
    public /* synthetic */ int I$0;
    public int label;

    public C2Bg(HtJ<? super C2Bg> htJ) {
        super(2, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        C2Bg c2Bg = new C2Bg(htJ);
        c2Bg.I$0 = AnonymousClass001.A0F(obj);
        return c2Bg;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        int i = this.I$0;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        return Boolean.valueOf(AnonymousClass002.A1N(i));
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Integer num, HtJ<? super Boolean> htJ) {
        return ((C2Bg) create(Integer.valueOf(AnonymousClass001.A0F(num)), htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
