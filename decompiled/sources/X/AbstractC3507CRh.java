package X;

import com.google.mlkit.common.MlKitException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.CRh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3507CRh {
    public final AtomicInteger A02 = BV4.A13(0);
    public final AtomicBoolean A01 = BV4.A12(false);
    public final CRv A00 = new CRv();

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable<TT;>;LX/CRn;)LX/CSA<TT;>; */
    public final CSC A01(final C3513CRn c3513CRn, final Callable callable, final Executor executor) {
        if (this.A02.get() <= 0) {
            throw BV4.A0T();
        }
        if (c3513CRn.A00.A0B()) {
            CSC csc = new CSC();
            csc.A0D();
            return csc;
        }
        final C3511CRl c3511CRl = new C3511CRl();
        final CSE cse = new CSE(c3511CRl.A00);
        this.A00.A02(new Executor() { // from class: X.CRj
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                try {
                    executor.execute(runnable);
                } catch (RuntimeException e) {
                    if (c3513CRn.A00.A0B()) {
                        c3511CRl.A00();
                        throw e;
                    }
                    cse.A00.A0F(e);
                    throw e;
                }
            }
        }, new Runnable() { // from class: X.CRi
            public static final String __redex_internal_original_name = "zzn";

            @Override // java.lang.Runnable
            public final void run() throws Exception {
                AbstractC3507CRh abstractC3507CRh = this;
                C3513CRn c3513CRn2 = c3513CRn;
                C3511CRl c3511CRl2 = c3511CRl;
                Callable callable2 = callable;
                CSE cse2 = cse;
                CSC csc2 = c3513CRn2.A00;
                try {
                    if (!csc2.A0B()) {
                        try {
                            AtomicBoolean atomicBoolean = abstractC3507CRh.A01;
                            if (!atomicBoolean.get()) {
                                if (abstractC3507CRh instanceof C3658CcB) {
                                    C3658CcB c3658CcB = (C3658CcB) abstractC3507CRh;
                                    synchronized (abstractC3507CRh) {
                                        try {
                                            c3658CcB.A03.AjR();
                                            C3695Cct c3695Cct = c3658CcB.A02;
                                            C3713CdC c3713CdC = new C3713CdC();
                                            c3713CdC.A01 = EnumC3721CdK.TYPE_THIN;
                                            CcE ccE = c3658CcB.A01;
                                            EnumC10410Hbh enumC10410Hbh = EnumC10410Hbh.A02;
                                            F0I f0i = AbstractC3820Cf8.A00;
                                            Object[] objArr = {enumC10410Hbh};
                                            if (objArr[0] == null) {
                                                throw BV8.A0n(0);
                                            }
                                            c3713CdC.A04 = new C3661CcH(new C3796Cef(1, objArr), ccE);
                                            RunnableC3697Ccv.A00(EnumC10421Hbu.A2m, new C3716CdF(c3713CdC, 0), c3695Cct);
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                    atomicBoolean.set(true);
                                } else {
                                    Cc0 cc0 = (Cc0) abstractC3507CRh;
                                    synchronized (abstractC3507CRh) {
                                        try {
                                            cc0.A00 = cc0.A04.Ajc();
                                        } catch (Throwable th2) {
                                            throw th2;
                                        }
                                    }
                                }
                                atomicBoolean.set(true);
                            }
                            if (csc2.A0B()) {
                                c3511CRl2.A00();
                                return;
                            }
                            Object objCall = callable2.call();
                            if (csc2.A0B()) {
                                c3511CRl2.A00();
                                return;
                            } else {
                                cse2.A02(objCall);
                                return;
                            }
                        } catch (RuntimeException e) {
                            throw new MlKitException("Internal error has occurred when executing ML Kit tasks", 13, e);
                        }
                    }
                } catch (Exception e2) {
                    if (!csc2.A0B()) {
                        cse2.A00.A0F(e2);
                        return;
                    }
                }
                c3511CRl2.A00();
            }
        });
        return cse.A00;
    }
}
