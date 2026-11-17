package X;

import androidx.datastore.core.SingleProcessDataStore;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesSerializer;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* renamed from: X.6PF, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6PF {
    /* JADX WARN: Type inference failed for: r0v2, types: [X.6JN] */
    public static final C6JN A00(List list, Function0 function0, C3UX c3ux) {
        return new C6JO<Preferences>(new SingleProcessDataStore(new C6PG(), PreferencesSerializer.A00, Collections.singletonList(new C07228ib((HtJ) null, (G0V<? super Preferences, ? super HtJ<? super Preferences>, ? extends Object>) list, (HtJ<? super C07228ib>) 4)), new C07358io(function0, 0), c3ux)) { // from class: X.6JN
            public final C6JO<Preferences> A00;

            @Override // X.C6JO
            public final C20Q<Preferences> AEa() {
                return this.A00.AEa();
            }

            @Override // X.C6JO
            public final Object Ahr(G0V<? super Preferences, ? super HtJ<? super Preferences>, ? extends Object> g0v, HtJ<? super Preferences> htJ) {
                return this.A00.Ahr(new C07228ib((HtJ) null, g0v, (HtJ<? super C07228ib>) 5), htJ);
            }

            {
                this.A00 = c6jo;
            }
        };
    }
}
