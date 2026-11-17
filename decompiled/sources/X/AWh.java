package X;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import androidx.compose.material3.ModalBottomSheetDialogLayout$Api34Impl$createBackCallback$1$onBackProgressed$1;
import androidx.compose.material3.ModalBottomSheetDialogLayout$Api34Impl$createBackCallback$1$onBackStarted$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AWh implements OnBackAnimationCallback {
    public final /* synthetic */ AT5<Float, AOW> A00;
    public final /* synthetic */ Function0<Unit> A01;
    public final /* synthetic */ C3UX A02;

    /* JADX WARN: Incorrect types in method signature: (LX/3UX;LX/AT5<Ljava/lang/Float;LX/AOW;>;Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;)V */
    public AWh(AT5 at5, Function0 function0, C3UX c3ux) {
        this.A02 = c3ux;
        this.A00 = at5;
        this.A01 = function0;
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackCancelled() {
        AnonymousClass001.A1J(new C05363bi(this.A00, null, 4), this.A02);
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        this.A01.invoke();
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackProgressed(BackEvent backEvent) {
        AnonymousClass001.A1J(new ModalBottomSheetDialogLayout$Api34Impl$createBackCallback$1$onBackProgressed$1(backEvent, this.A00, null), this.A02);
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackStarted(BackEvent backEvent) {
        AnonymousClass001.A1J(new ModalBottomSheetDialogLayout$Api34Impl$createBackCallback$1$onBackStarted$1(backEvent, this.A00, null), this.A02);
    }
}
