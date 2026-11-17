package X;

import android.content.Intent;
import androidx.wear.remote.interactions.RemoteActivityHelper$RemoteIntentResultReceiver;
import com.google.android.gms.common.Feature;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class E91 implements InterfaceC2940BpU {
    public final int $t;
    public final Object A00;
    public final Object A01;
    public final String A02;

    public E91(Object obj, Object obj2, String str, int i) {
        this.$t = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = str;
    }

    @Override // X.InterfaceC2940BpU
    public final Object A4r(final C3010Brs c3010Brs) {
        Executor executor;
        CSC cscA06;
        F5G f5g;
        int i = this.$t;
        Object obj = this.A00;
        if (i != 0) {
            String str = this.A02;
            final Function0 function0 = (Function0) this.A01;
            C7384Etj.A0Y(c3010Brs, 3);
            final AtomicBoolean atomicBooleanA1E = C60O.A1E();
            C3010Brs.A00(c3010Brs, new Runnable() { // from class: X.Bpw
                public static final String __redex_internal_original_name = "ListenableFutureKt$$ExternalSyntheticLambda2";

                @Override // java.lang.Runnable
                public final void run() {
                    atomicBooleanA1E.set(true);
                }
            }, EnumC7478ExU.A02);
            ((Executor) obj).execute(new Runnable() { // from class: X.Bpu
                public static final String __redex_internal_original_name = "ListenableFutureKt$$ExternalSyntheticLambda3";

                @Override // java.lang.Runnable
                public final void run() {
                    AtomicBoolean atomicBoolean = atomicBooleanA1E;
                    C3010Brs c3010Brs2 = c3010Brs;
                    Function0 function02 = function0;
                    if (atomicBoolean.get()) {
                        return;
                    }
                    try {
                        c3010Brs2.A03(function02.invoke());
                    } catch (Throwable th) {
                        c3010Brs2.A04(th);
                    }
                }
            });
            return str;
        }
        Intent intent = (Intent) obj;
        C4443CwA c4443CwA = (C4443CwA) this.A01;
        String str2 = this.A02;
        C7384Etj.A0Y(c3010Brs, 3);
        if (!BV5.A1Q(intent, "android.intent.action.VIEW")) {
            throw C60O.A0i("Only android.intent.action.VIEW action is currently supported for starting a remote activity");
        }
        if (intent.getData() == null) {
            throw C60O.A0i("Data Uri is required when starting a remote activity");
        }
        Set<String> categories = intent.getCategories();
        if (categories == null || !categories.contains(AnonymousClass000.A00(13))) {
            throw C60O.A0i("The category android.intent.category.BROWSABLE must be present on the intent");
        }
        AbstractC4099CmT abstractC4099CmT = c4443CwA.A00;
        C4445CwC c4445CwC = new C4445CwC(c3010Brs, c4443CwA);
        if (c4443CwA.A02.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            c4445CwC.A01.A02.sendBroadcast(C4443CwA.A00(intent, new RemoteActivityHelper$RemoteIntentResultReceiver(c3010Brs, 1), str2, "com.google.android.wearable.app"));
        } else {
            if (str2 != null) {
                C4179Cop c4179Cop = (C4179Cop) abstractC4099CmT;
                C4231Cqf c4231CqfA00 = C4232Cqg.A00();
                c4231CqfA00.A01 = new C4124CnQ(c4179Cop, str2);
                c4231CqfA00.A03 = new Feature[]{AbstractC4136Cnd.A02};
                CSC cscA01 = AbstractC4178Com.A01(c4179Cop, c4231CqfA00, 24023, 0);
                executor = c4443CwA.A03;
                cscA06 = cscA01.A06(new C4954DHn(new C4444CwB(intent, c3010Brs, c4445CwC, c4443CwA, str2), 5), executor);
                f5g = new F5G(c4445CwC, 0);
            } else {
                CSA<List<InterfaceC3641Caw>> csaA05 = abstractC4099CmT.A05();
                executor = c4443CwA.A03;
                cscA06 = csaA05.A06(new C4954DHn(new EDJ(intent, c3010Brs, c4445CwC, c4443CwA, abstractC4099CmT, 1), 6), executor);
                f5g = new F5G(c4445CwC, 1);
            }
            cscA06.A0A(f5g, executor);
        }
        return Unit.INSTANCE;
    }
}
