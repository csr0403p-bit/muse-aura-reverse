package androidx.compose.ui.viewinterop;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C1634An9;
import X.C3UX;
import X.C8j3;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1", f = "AndroidViewHolder.android.kt", l = {634, 636}, m = "invokeSuspend", v = 1)
/* loaded from: classes4.dex */
public final class AndroidViewHolder$onNestedFling$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ boolean $consumed;
    public final /* synthetic */ long $viewVelocity;
    public int label;
    public final /* synthetic */ C1634An9 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (ZLX/An9;JLX/HtJ<-Landroidx/compose/ui/viewinterop/AndroidViewHolder$onNestedFling$1;>;)V */
    public AndroidViewHolder$onNestedFling$1(C1634An9 c1634An9, HtJ htJ, long j, boolean z) {
        super(2, htJ);
        this.$consumed = z;
        this.this$0 = c1634An9;
        this.$viewVelocity = j;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new AndroidViewHolder$onNestedFling$1(this.this$0, htJ, this.$viewVelocity, this.$consumed);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        long j;
        long j2;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            boolean z = this.$consumed;
            NestedScrollDispatcher nestedScrollDispatcher = this.this$0.A0I;
            if (z) {
                j = this.$viewVelocity;
                j2 = 0;
                this.label = 2;
            } else {
                j = 0;
                j2 = this.$viewVelocity;
                this.label = 1;
            }
            if (nestedScrollDispatcher.A00(j, j2, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1 && i != 2) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((AndroidViewHolder$onNestedFling$1) C8j3.A1E(htJ, c3ux, this)).invokeSuspend(Unit.INSTANCE);
    }
}
