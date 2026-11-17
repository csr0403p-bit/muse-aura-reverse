package androidx.work;

import X.AbstractC2947Bpi;
import X.C2934BpC;
import X.C7384Etj;
import X.C7499EyE;
import X.ENF;
import X.InterfaceC2940BpU;
import X.InterfaceC6657EMp;
import android.os.Trace;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public abstract class OperationKt {
    public static final InterfaceC6657EMp A00(final ENF enf, final String str, final Executor executor, final Function0<Unit> function0) {
        C7384Etj.A0Y(executor, 2);
        final C2934BpC c2934BpC = new C2934BpC(InterfaceC6657EMp.A00);
        return new C7499EyE(c2934BpC, AbstractC2947Bpi.A00(new InterfaceC2940BpU() { // from class: X.ELP
            @Override // X.InterfaceC2940BpU
            public final Object A4r(final C3010Brs c3010Brs) {
                Executor executor2 = executor;
                final ENF enf2 = enf;
                final String str2 = str;
                final Function0 function02 = function0;
                final C2934BpC c2934BpC2 = c2934BpC;
                C7384Etj.A0Y(c3010Brs, 5);
                executor2.execute(new Runnable() { // from class: X.EL3
                    public static final String __redex_internal_original_name = "OperationKt$$ExternalSyntheticLambda1";

                    @Override // java.lang.Runnable
                    public final void run() {
                        String str3 = str2;
                        Function0 function03 = function02;
                        C2934BpC c2934BpC3 = c2934BpC2;
                        C3010Brs c3010Brs2 = c3010Brs;
                        boolean zIsEnabled = Trace.isEnabled();
                        if (zIsEnabled) {
                            try {
                                C7384Etj.A0Y(str3, 0);
                                AbstractC3136BzG.A00(str3);
                            } finally {
                                if (zIsEnabled) {
                                    Trace.endSection();
                                }
                            }
                        }
                        try {
                            function03.invoke();
                            EN8 en8 = InterfaceC6657EMp.A01;
                            c2934BpC3.A09(en8);
                            c3010Brs2.A03(en8);
                        } catch (Throwable th) {
                            c2934BpC3.A09(new ELT(th));
                            c3010Brs2.A04(th);
                        }
                    }
                });
                return Unit.INSTANCE;
            }
        }));
    }
}
