package X;

import androidx.savedstate.SavedStateRegistry;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class A6R extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ SavedStateRegistry $androidxRegistry;
    public final /* synthetic */ String $key;
    public final /* synthetic */ boolean $registered;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A6R(SavedStateRegistry savedStateRegistry, String str, boolean z) {
        super(0);
        this.$registered = z;
        this.$androidxRegistry = savedStateRegistry;
        this.$key = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Unit invoke() {
        if (this.$registered) {
            SavedStateRegistry savedStateRegistry = this.$androidxRegistry;
            String str = this.$key;
            C7384Etj.A0Y(str, 0);
            A6Q a6q = savedStateRegistry.A01;
            synchronized (a6q.A05) {
                a6q.A06.remove(str);
            }
        }
        return Unit.INSTANCE;
    }
}
