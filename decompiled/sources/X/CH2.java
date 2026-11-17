package X;

import X.InterfaceC7542F0w;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public class CH2<SessionType extends InterfaceC7542F0w> {
    public SessionType A00;
    public final SessionType A01;
    public final C2953Bpq<SessionType> A02;
    public final CH3<SessionType> A03;
    public final Object A04 = C3cG.A0T();

    private final SessionType A00() {
        SessionType sessiontype;
        synchronized (this.A04) {
            sessiontype = this.A00;
        }
        return sessiontype;
    }

    private final void A01(SessionType sessiontype) {
        synchronized (this.A04) {
            String str = ((CH0) this.A00).A01;
            String str2 = ((CH0) sessiontype).A01;
            if (str.equals(str2)) {
                throw C60O.A0i("Trying to set a new Foreground Session instance with the same UID of the current one.");
            }
            CH3<SessionType> ch3 = this.A03;
            ConcurrentHashMap<String, SessionType> concurrentHashMap = ch3.A01;
            SessionType sessiontype2 = concurrentHashMap.get(str2);
            if (sessiontype2 == null) {
                synchronized (ch3.A00) {
                    try {
                        concurrentHashMap.put(str2, sessiontype);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else if (sessiontype2 != sessiontype) {
                throw C60O.A0i("Trying to set a new Foreground Session instance with the same UID one in our session list.");
            }
            this.A00 = sessiontype;
            this.A02.A09(sessiontype);
        }
    }

    /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/String;Lkotlin/jvm/functions/Function0<+TSessionType;>;)TSessionType; */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.F0w] */
    public final void A02(String str, Function0 function0) {
        InterfaceC7542F0w interfaceC7542F0wA00;
        Object obj = this.A04;
        synchronized (obj) {
            if (!str.equals(((CH0) A00()).A01)) {
                ConcurrentHashMap<String, SessionType> concurrentHashMap = this.A03.A01;
                SessionType sessiontype = concurrentHashMap.get(str);
                if (sessiontype != null) {
                    interfaceC7542F0wA00 = A00();
                    A01(sessiontype);
                } else {
                    sessiontype = null;
                    interfaceC7542F0wA00 = null;
                }
                if (sessiontype == null) {
                    ?? r2 = (InterfaceC7542F0w) function0.invoke();
                    synchronized (obj) {
                        if (!str.equals(((CH0) A00()).A01)) {
                            interfaceC7542F0wA00 = A00();
                            sessiontype = concurrentHashMap.get(str);
                            if (sessiontype == null) {
                                sessiontype = r2;
                            }
                            A01(sessiontype);
                        }
                    }
                }
                C7384Etj.A0X(interfaceC7542F0wA00);
                C7384Etj.A0X(sessiontype);
                return;
            }
            A00();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CH2(InterfaceC7542F0w interfaceC7542F0w) {
        this.A01 = interfaceC7542F0w;
        CH3<SessionType> ch3 = new CH3<>();
        this.A03 = ch3;
        this.A02 = new C2953Bpq<>();
        this.A00 = interfaceC7542F0w;
        String str = ((CH0) interfaceC7542F0w).A01;
        synchronized (ch3.A00) {
            ch3.A01.put(str, interfaceC7542F0w);
        }
    }
}
